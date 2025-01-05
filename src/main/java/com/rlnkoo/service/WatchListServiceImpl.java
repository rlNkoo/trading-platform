package com.rlnkoo.service;

import com.rlnkoo.model.Coin;
import com.rlnkoo.model.User;
import com.rlnkoo.model.Watchlist;
import com.rlnkoo.repository.WatchlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WatchListServiceImpl implements WatchlistService{

    @Autowired
    private WatchlistRepository watchlistRepository;

    @Override
    public Watchlist findUserWatchlist(Long userId) throws Exception {

        Watchlist watchlist = watchlistRepository.findByUserId(userId);
        if (watchlist == null) {
            throw new Exception("watchlist not found");
        }
        return watchlist;
    }

    @Override
    public Watchlist createWatchList(User user) {

        Watchlist watchlist = new Watchlist();
        watchlist.setUser(user);

        return watchlistRepository.save(watchlist);
    }

    @Override
    public Watchlist findById(Long id) throws Exception {

        Optional<Watchlist> watchlistOptional = watchlistRepository.findById(id);
        if (watchlistOptional.isEmpty()) {
            throw new Exception("watchlist not found");
        }
        return watchlistOptional.get();
    }

    @Override
    public Coin addItemToWatchList(Coin coin, User user) throws Exception {

        Watchlist watchlist = findUserWatchlist(user.getId());
        if (watchlist.getCoins().contains(coin)) {
            watchlist.getCoins().remove(coin);
        } else watchlist.getCoins().add(coin);

        watchlistRepository.save(watchlist);
        return coin;
    }
}
