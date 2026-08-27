import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nn {
   public static final aev<dwr> a = ny.a("bastion/starts");

   public static void a(nr<dwr> $$0) {
      hf<dyz> $$1 = $$0.a(jc.aA);
      he<dyz> $$2 = $$1.b(nz.w);
      hf<dwr> $$3 = $$0.a(jc.aC);
      he<dwr> $$4 = $$3.b(ny.a);
      $$0.a(
         a,
         new dwr(
            $$4,
            ImmutableList.of(
               Pair.of(dwp.b("bastion/units/air_base", $$2), 1),
               Pair.of(dwp.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(dwp.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(dwp.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            dwr.a.b
         )
      );
      nm.a($$0);
      nl.a($$0);
      np.a($$0);
      nk.a($$0);
      no.a($$0);
   }
}
