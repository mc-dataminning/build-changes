import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qs {
   public static final alk<enl> a = ri.a("ancient_city/city_center");

   public static void a(rb<enl> $$0) {
      jr<eqb> $$1 = $$0.a(ma.aT);
      jq<eqb> $$2 = $$1.b(rj.G);
      jr<enl> $$3 = $$0.a(ma.aV);
      jq<enl> $$4 = $$3.b(ri.a);
      $$0.a(
         a,
         new enl(
            $$4,
            ImmutableList.of(
               Pair.of(enj.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(enj.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(enj.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            enl.a.b
         )
      );
      qt.a($$0);
   }
}
