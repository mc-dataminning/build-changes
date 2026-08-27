import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ne {
   public static final aeo<dwg> a = nu.a("ancient_city/city_center");

   public static void a(nn<dwg> $$0) {
      hg<dyo> $$1 = $$0.a(jd.aA);
      hf<dyo> $$2 = $$1.b(nv.G);
      hg<dwg> $$3 = $$0.a(jd.aC);
      hf<dwg> $$4 = $$3.b(nu.a);
      $$0.a(
         a,
         new dwg(
            $$4,
            ImmutableList.of(
               Pair.of(dwe.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(dwe.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(dwe.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            dwg.a.b
         )
      );
      nf.a($$0);
   }
}
