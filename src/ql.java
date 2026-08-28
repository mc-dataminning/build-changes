import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ql {
   public static final akp<ekw> a = qw.a("bastion/starts");

   public static void a(qp<ekw> $$0) {
      jn<enl> $$1 = $$0.a(lu.aS);
      jm<enl> $$2 = $$1.b(qx.w);
      jn<ekw> $$3 = $$0.a(lu.aU);
      jm<ekw> $$4 = $$3.b(qw.a);
      $$0.a(
         a,
         new ekw(
            $$4,
            ImmutableList.of(
               Pair.of(eku.b("bastion/units/air_base", $$2), 1),
               Pair.of(eku.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(eku.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(eku.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ekw.a.b
         )
      );
      qk.a($$0);
      qj.a($$0);
      qn.a($$0);
      qi.a($$0);
      qm.a($$0);
   }
}
