import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qd {
   public static final alh<etl> a = qo.a("bastion/starts");

   public static void a(qh<etl> $$0) {
      jg<ewb> $$1 = $$0.a(mh.bc);
      jf<ewb> $$2 = $$1.b(qp.w);
      jg<etl> $$3 = $$0.a(mh.bf);
      jf<etl> $$4 = $$3.b(qo.a);
      $$0.a(
         a,
         new etl(
            $$4,
            ImmutableList.of(
               Pair.of(etj.b("bastion/units/air_base", $$2), 1),
               Pair.of(etj.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(etj.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(etj.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            etl.a.b
         )
      );
      qc.a($$0);
      qb.a($$0);
      qf.a($$0);
      qa.a($$0);
      qe.a($$0);
   }
}
