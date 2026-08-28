import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qm {
   public static final akq<elb> a = qx.a("bastion/starts");

   public static void a(qq<elb> $$0) {
      jn<enr> $$1 = $$0.a(lu.aS);
      jm<enr> $$2 = $$1.b(qy.w);
      jn<elb> $$3 = $$0.a(lu.aU);
      jm<elb> $$4 = $$3.b(qx.a);
      $$0.a(
         a,
         new elb(
            $$4,
            ImmutableList.of(
               Pair.of(ekz.b("bastion/units/air_base", $$2), 1),
               Pair.of(ekz.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ekz.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ekz.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            elb.a.b
         )
      );
      ql.a($$0);
      qk.a($$0);
      qo.a($$0);
      qj.a($$0);
      qn.a($$0);
   }
}
