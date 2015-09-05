/**
 * <h2>Trading API</h2>
 *
 * <p>
 * It contains trading operations for Trading Strategies to use and for Exchange Adapters to implement.
 * </p>
 *
 * <p>
 * It uses a common data model that all exchange data must adapt to. The model is based off the Cryptsy data model;
 * it will most likely be normalised in the near future.
 * </p>
 *
 * <p>
 * Every Exchange Adapter must implement the {@link com.gazbert.bxbot.core.api.trading.TradingApi} interface.
 * </p>
 *
 * <p>
 * This current version of the Trading API only supports <a href="http://www.investopedia.com/terms/l/limitorder.asp">limit orders</a>
 * traded at the <a href="http://www.investopedia.com/terms/s/spotprice.asp">spot price</a>.
 * It does not support futures trading or margin trading... yet.
 * </p>
 *
 * <p>
 * The Trading Engine and Trading Strategies have a compile-time dependency on this API.
 * </p>
 *
 * TODO Consider moving this into a separate project - BX-bot, Trading Strategies and Exchange Adapters projects would depend on it.
 *
 * @author gazbert
 */
package com.gazbert.bxbot.core.api.trading;