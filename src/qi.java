import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qi {
   public static final akj<ejz> a = qt.a("bastion/starts");

   public static void a(qm<ejz> $$0) {
      jk<emo> $$1 = $$0.a(lr.aR);
      jj<emo> $$2 = $$1.b(qu.w);
      jk<ejz> $$3 = $$0.a(lr.aT);
      jj<ejz> $$4 = $$3.b(qt.a);
      $$0.a(
         a,
         new ejz(
            $$4,
            ImmutableList.of(
               Pair.of(ejx.b("bastion/units/air_base", $$2), 1),
               Pair.of(ejx.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ejx.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ejx.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ejz.a.b
         )
      );
      qh.a($$0);
      qg.a($$0);
      qk.a($$0);
      qf.a($$0);
      qj.a($$0);
   }
}
