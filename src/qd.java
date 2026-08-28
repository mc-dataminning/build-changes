import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qd {
   public static final alf<esl> a = qo.a("bastion/starts");

   public static void a(qh<esl> $$0) {
      jf<evb> $$1 = $$0.a(mg.bc);
      je<evb> $$2 = $$1.b(qp.w);
      jf<esl> $$3 = $$0.a(mg.bf);
      je<esl> $$4 = $$3.b(qo.a);
      $$0.a(
         a,
         new esl(
            $$4,
            ImmutableList.of(
               Pair.of(esj.b("bastion/units/air_base", $$2), 1),
               Pair.of(esj.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(esj.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(esj.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            esl.a.b
         )
      );
      qc.a($$0);
      qb.a($$0);
      qf.a($$0);
      qa.a($$0);
      qe.a($$0);
   }
}
