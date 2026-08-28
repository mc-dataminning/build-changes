import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qd {
   public static final alf<esd> a = qo.a("bastion/starts");

   public static void a(qh<esd> $$0) {
      jf<eut> $$1 = $$0.a(mg.bb);
      je<eut> $$2 = $$1.b(qp.w);
      jf<esd> $$3 = $$0.a(mg.be);
      je<esd> $$4 = $$3.b(qo.a);
      $$0.a(
         a,
         new esd(
            $$4,
            ImmutableList.of(
               Pair.of(esb.b("bastion/units/air_base", $$2), 1),
               Pair.of(esb.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(esb.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(esb.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            esd.a.b
         )
      );
      qc.a($$0);
      qb.a($$0);
      qf.a($$0);
      qa.a($$0);
      qe.a($$0);
   }
}
