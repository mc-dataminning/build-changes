import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rg {
   public static final aly<epu> a = rr.a("bastion/starts");

   public static void a(rk<epu> $$0) {
      jr<esk> $$1 = $$0.a(mb.aV);
      jq<esk> $$2 = $$1.b(rs.w);
      jr<epu> $$3 = $$0.a(mb.aX);
      jq<epu> $$4 = $$3.b(rr.a);
      $$0.a(
         a,
         new epu(
            $$4,
            ImmutableList.of(
               Pair.of(eps.b("bastion/units/air_base", $$2), 1),
               Pair.of(eps.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(eps.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(eps.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            epu.a.b
         )
      );
      rf.a($$0);
      re.a($$0);
      ri.a($$0);
      rd.a($$0);
      rh.a($$0);
   }
}
