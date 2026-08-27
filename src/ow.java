import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ow {
   public static final ahg<eax> a = pm.a("ancient_city/city_center");

   public static void a(pf<eax> $$0) {
      ii<edm> $$1 = $$0.a(ke.aE);
      ih<edm> $$2 = $$1.b(pn.G);
      ii<eax> $$3 = $$0.a(ke.aG);
      ih<eax> $$4 = $$3.b(pm.a);
      $$0.a(
         a,
         new eax(
            $$4,
            ImmutableList.of(
               Pair.of(eav.b("ancient_city/city_center/city_center_1", $$2), 1),
               Pair.of(eav.b("ancient_city/city_center/city_center_2", $$2), 1),
               Pair.of(eav.b("ancient_city/city_center/city_center_3", $$2), 1)
            ),
            eax.a.b
         )
      );
      ox.a($$0);
   }
}
