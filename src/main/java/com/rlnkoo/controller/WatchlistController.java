package com.rlnkoo.controller;

import com.rlnkoo.model.Coin;
import com.rlnkoo.model.User;
import com.rlnkoo.model.Watchlist;
import com.rlnkoo.service.CoinService;
import com.rlnkoo.service.UserService;
import com.rlnkoo.service.WatchlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/watchlist")
public class WatchlistController {

    @Autowired
    private WatchlistService watchlistService;

    @Autowired
    private UserService userService;

    @Autowired
    private CoinService coinService;

    @GetMapping("/user")
    public ResponseEntity<Watchlist> getUserWatchlist(@RequestHeader("Authorization") String  jwt) throws Exception {

        User user = userService.findUserProfileByJwt(jwt);
        Watchlist watchlist = watchlistService.findUserWatchlist(user.getId());

        return ResponseEntity.ok(watchlist);
    }

    @GetMapping("/{watchlistId}")
    public ResponseEntity<Watchlist> getWatchListById(@PathVariable Long watchlistId) throws Exception {

        Watchlist watchlist = watchlistService.findById(watchlistId);
        return ResponseEntity.ok(watchlist);
    }

    @PatchMapping("/add/coin/{coinId}")
    public ResponseEntity<Coin> addItemToWatchlist(
            @RequestHeader("Authorization") String jwt,
            @PathVariable String coinId) throws Exception {

        User user = userService.findUserProfileByJwt(jwt);
        Coin coin = coinService.findById(coinId);
        Coin addedCoin = watchlistService.addItemToWatchList(coin, user);

        return ResponseEntity.ok(addedCoin);
    }
}
