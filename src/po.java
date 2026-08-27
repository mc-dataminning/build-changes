import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class po {
   public static final ajs<egq> a = qe.a("ancient_city/city_center");

   public static void a(px<egq> $$0) {
      im<ejf> $$1 = $$0.a(ks.aG);
      il<ejf> $$2 = $$1.b(qf.G);
      im<egq> $$3 = $$0.a(ks.aI);
      il<egq> $$4 = $$3.b(qe.a);
      $$0.a(
         a,
         new egq(
            $$4,
            ImmutableList.of(
               Pair.of(ego.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(ego.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(ego.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            egq.a.b
         )
      );
      pp.a($$0);
   }
}
