/**
 * Created by pcarfrey on 6/24/16.
 */
public class ElasticSearch {

    /*
        Maven Repository

        <dependency>
            <groupId>org.elasticsearch</groupId>
            <artifactId>elasticsearch</artifactId>
            <version>${es.version}</version>
        </dependency>

    Settings settings = Settings.settingsBuilder()
            .put("cluster.name", "clusterNameHere").build();

    Client client = TransportClient.builder()
            .settings(settings)
            .build()
            .addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress("127.0.0.1", 9300)));

    SearchResponse response = client.prepareSearch("documentNameHere")
            .setTypes("typeHere")
            .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
            .setQuery(QueryBuilders.termQuery("key", "value")) // Query
            .setPostFilter(QueryBuilders.rangeQuery("age").from(12).to(18))   // Filter
            .setFrom(0).setSize(60).setExplain(true)
            .execute()
            .actionGet();
    */
}
