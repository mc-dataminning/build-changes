import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qi {
   public static final akj<ekh> a = qt.a("bastion/starts");

   public static void a(qm<ekh> $$0) {
      jk<emw> $$1 = $$0.a(lr.aR);
      jj<emw> $$2 = $$1.b(qu.w);
      jk<ekh> $$3 = $$0.a(lr.aT);
      jj<ekh> $$4 = $$3.b(qt.a);
      $$0.a(
         a,
         new ekh(
            $$4,
            ImmutableList.of(
               Pair.of(ekf.b("bastion/units/air_base", $$2), 1),
               Pair.of(ekf.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ekf.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ekf.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ekh.a.b
         )
      );
      qh.a($$0);
      qg.a($$0);
      qk.a($$0);
      qf.a($$0);
      qj.a($$0);
   }
}
