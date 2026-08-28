import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qd {
   public static final alf<esx> a = qo.a("bastion/starts");

   public static void a(qh<esx> $$0) {
      jg<evn> $$1 = $$0.a(mh.bc);
      jf<evn> $$2 = $$1.b(qp.w);
      jg<esx> $$3 = $$0.a(mh.bf);
      jf<esx> $$4 = $$3.b(qo.a);
      $$0.a(
         a,
         new esx(
            $$4,
            ImmutableList.of(
               Pair.of(esv.b("bastion/units/air_base", $$2), 1),
               Pair.of(esv.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(esv.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(esv.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            esx.a.b
         )
      );
      qc.a($$0);
      qb.a($$0);
      qf.a($$0);
      qa.a($$0);
      qe.a($$0);
   }
}
