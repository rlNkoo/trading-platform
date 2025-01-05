package com.rlnkoo.service;

import com.rlnkoo.model.Coin;
import com.rlnkoo.model.User;
import com.rlnkoo.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchList(Coin coin, User user) throws Exception;
}
