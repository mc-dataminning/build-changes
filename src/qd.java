import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qd {
   public static final alf<ess> a = qo.a("bastion/starts");

   public static void a(qh<ess> $$0) {
      jg<evi> $$1 = $$0.a(mh.bc);
      jf<evi> $$2 = $$1.b(qp.w);
      jg<ess> $$3 = $$0.a(mh.bf);
      jf<ess> $$4 = $$3.b(qo.a);
      $$0.a(
         a,
         new ess(
            $$4,
            ImmutableList.of(
               Pair.of(esq.b("bastion/units/air_base", $$2), 1),
               Pair.of(esq.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(esq.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(esq.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ess.a.b
         )
      );
      qc.a($$0);
      qb.a($$0);
      qf.a($$0);
      qa.a($$0);
      qe.a($$0);
   }
}
