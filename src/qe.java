import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qe {
   public static final alq<etx> a = qp.a("bastion/starts");

   public static void a(qi<etx> $$0) {
      jh<ewn> $$1 = $$0.a(mi.bc);
      jg<ewn> $$2 = $$1.b(qq.w);
      jh<etx> $$3 = $$0.a(mi.bf);
      jg<etx> $$4 = $$3.b(qp.a);
      $$0.a(
         a,
         new etx(
            $$4,
            ImmutableList.of(
               Pair.of(etv.b("bastion/units/air_base", $$2), 1),
               Pair.of(etv.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(etv.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(etv.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            etx.a.b
         )
      );
      qd.a($$0);
      qc.a($$0);
      qg.a($$0);
      qb.a($$0);
      qf.a($$0);
   }
}
