import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ot {
   public static final ahc<eai> a = pj.a("ancient_city/city_center");

   public static void a(pc<eai> $$0) {
      ii<ecx> $$1 = $$0.a(ke.aE);
      ih<ecx> $$2 = $$1.b(pk.G);
      ii<eai> $$3 = $$0.a(ke.aG);
      ih<eai> $$4 = $$3.b(pj.a);
      $$0.a(
         a,
         new eai(
            $$4,
            ImmutableList.of(
               Pair.of(eag.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(eag.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(eag.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            eai.a.b
         )
      );
      ou.a($$0);
   }
}
