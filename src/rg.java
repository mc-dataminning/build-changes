import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rg {
   public static final aly<ept> a = rr.a("bastion/starts");

   public static void a(rk<ept> $$0) {
      jr<esj> $$1 = $$0.a(mb.aV);
      jq<esj> $$2 = $$1.b(rs.w);
      jr<ept> $$3 = $$0.a(mb.aX);
      jq<ept> $$4 = $$3.b(rr.a);
      $$0.a(
         a,
         new ept(
            $$4,
            ImmutableList.of(
               Pair.of(epr.b("bastion/units/air_base", $$2), 1),
               Pair.of(epr.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(epr.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(epr.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ept.a.b
         )
      );
      rf.a($$0);
      re.a($$0);
      ri.a($$0);
      rd.a($$0);
      rh.a($$0);
   }
}
