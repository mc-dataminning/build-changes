import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ow {
   public static final ags<dzx> a = ph.a("bastion/starts");

   public static void a(pa<dzx> $$0) {
      ig<ecm> $$1 = $$0.a(kc.aD);
      ie<ecm> $$2 = $$1.b(pi.w);
      ig<dzx> $$3 = $$0.a(kc.aF);
      ie<dzx> $$4 = $$3.b(ph.a);
      $$0.a(
         a,
         new dzx(
            $$4,
            ImmutableList.of(
               Pair.of(dzv.b("bastion/units/air_base", $$2), 1),
               Pair.of(dzv.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(dzv.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(dzv.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            dzx.a.b
         )
      );
      ov.a($$0);
      ou.a($$0);
      oy.a($$0);
      ot.a($$0);
      ox.a($$0);
   }
}
