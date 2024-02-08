package io.horizontalsystems.ethereumkit.models

import java.net.URI

sealed class RpcSource {
    data class Http(val uris: List<URI>, val auth: String?) : RpcSource()
    data class WebSocket(val uri: URI, val auth: String?) : RpcSource()

    companion object {
        fun bscRpcHttp(): Http {
            return Http(listOf(URI("https://bscrpc.com")), null)
        }

        fun binanceSmartChainHttp(): Http {
            return Http(
                    listOf(
                        URI("https://data-seed-prebsc-1-s1.binance.org:8545/")
                    ),
                    null
            )
        }

        fun polygonRpcHttp(): Http {
            return Http(listOf(URI("https://polygon-rpc.com")), null)
        }

        fun optimismRpcHttp(): Http {
            return Http(listOf(URI("https://mainnet.optimism.io")), null)
        }

        fun arbitrumOneRpcHttp(): Http {
            return Http(listOf(URI("https://arb1.arbitrum.io/rpc")), null)
        }

        fun avaxNetworkHttp(): Http {
            return Http(listOf(URI("https://api.avax.network/ext/bc/C/rpc")), null)
        }

        fun gnosisRpcHttp(): Http {
            return Http(listOf(URI("https://rpc.gnosischain.com")), null)
        }

        fun fantomRpcHttp(): Http {
            return Http(listOf(URI("https://rpc.fantom.network")), null)
        }

    }
}
