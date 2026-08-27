import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pb {
   public static final ahg<eax> a = pm.a("bastion/starts");

   public static void a(pf<eax> $$0) {
      ii<edm> $$1 = $$0.a(ke.aE);
      ih<edm> $$2 = $$1.b(pn.w);
      ii<eax> $$3 = $$0.a(ke.aG);
      ih<eax> $$4 = $$3.b(pm.a);
      $$0.a(
         a,
         new eax(
            $$4,
            ImmutableList.of(
               Pair.of(eav.b("bastion/units/air_base", $$2), 1),
               Pair.of(eav.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(eav.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(eav.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            eax.a.b
         )
      );
      pa.a($$0);
      oz.a($$0);
      pd.a($$0);
      oy.a($$0);
      pc.a($$0);
   }
}
