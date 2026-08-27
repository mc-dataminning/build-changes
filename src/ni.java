import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ni {
   public static final aev<dwr> a = ny.a("ancient_city/city_center");

   public static void a(nr<dwr> $$0) {
      hf<dyz> $$1 = $$0.a(jc.aA);
      he<dyz> $$2 = $$1.b(nz.G);
      hf<dwr> $$3 = $$0.a(jc.aC);
      he<dwr> $$4 = $$3.b(ny.a);
      $$0.a(
         a,
         new dwr(
            $$4,
            ImmutableList.of(
               Pair.of(dwp.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(dwp.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(dwp.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            dwr.a.b
         )
      );
      nj.a($$0);
   }
}
