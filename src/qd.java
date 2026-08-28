import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qd {
   public static final ald<ers> a = qo.a("bastion/starts");

   public static void a(qh<ers> $$0) {
      jf<eui> $$1 = $$0.a(mg.ba);
      je<eui> $$2 = $$1.b(qp.w);
      jf<ers> $$3 = $$0.a(mg.bd);
      je<ers> $$4 = $$3.b(qo.a);
      $$0.a(
         a,
         new ers(
            $$4,
            ImmutableList.of(
               Pair.of(erq.b("bastion/units/air_base", $$2), 1),
               Pair.of(erq.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(erq.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(erq.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ers.a.b
         )
      );
      qc.a($$0);
      qb.a($$0);
      qf.a($$0);
      qa.a($$0);
      qe.a($$0);
   }
}
