import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qc {
   public static final alc<eqq> a = qn.a("bastion/starts");

   public static void a(qg<eqq> $$0) {
      jt<etg> $$1 = $$0.a(me.ba);
      js<etg> $$2 = $$1.b(qo.w);
      jt<eqq> $$3 = $$0.a(me.bc);
      js<eqq> $$4 = $$3.b(qn.a);
      $$0.a(
         a,
         new eqq(
            $$4,
            ImmutableList.of(
               Pair.of(eqo.b("bastion/units/air_base", $$2), 1),
               Pair.of(eqo.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(eqo.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(eqo.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            eqq.a.b
         )
      );
      qb.a($$0);
      qa.a($$0);
      qe.a($$0);
      pz.a($$0);
      qd.a($$0);
   }
}
