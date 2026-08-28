import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qe {
   public static final alj<etn> a = qp.a("bastion/starts");

   public static void a(qi<etn> $$0) {
      jh<ewd> $$1 = $$0.a(mi.bc);
      jg<ewd> $$2 = $$1.b(qq.w);
      jh<etn> $$3 = $$0.a(mi.bf);
      jg<etn> $$4 = $$3.b(qp.a);
      $$0.a(
         a,
         new etn(
            $$4,
            ImmutableList.of(
               Pair.of(etl.b("bastion/units/air_base", $$2), 1),
               Pair.of(etl.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(etl.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(etl.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            etn.a.b
         )
      );
      qd.a($$0);
      qc.a($$0);
      qg.a($$0);
      qb.a($$0);
      qf.a($$0);
   }
}
