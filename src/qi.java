import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qi {
   public static final akj<ekf> a = qt.a("bastion/starts");

   public static void a(qm<ekf> $$0) {
      jk<emu> $$1 = $$0.a(lr.aR);
      jj<emu> $$2 = $$1.b(qu.w);
      jk<ekf> $$3 = $$0.a(lr.aT);
      jj<ekf> $$4 = $$3.b(qt.a);
      $$0.a(
         a,
         new ekf(
            $$4,
            ImmutableList.of(
               Pair.of(ekd.b("bastion/units/air_base", $$2), 1),
               Pair.of(ekd.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ekd.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ekd.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ekf.a.b
         )
      );
      qh.a($$0);
      qg.a($$0);
      qk.a($$0);
      qf.a($$0);
      qj.a($$0);
   }
}
