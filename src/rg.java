import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rg {
   public static final aly<epm> a = rr.a("bastion/starts");

   public static void a(rk<epm> $$0) {
      jr<esc> $$1 = $$0.a(mb.aU);
      jq<esc> $$2 = $$1.b(rs.w);
      jr<epm> $$3 = $$0.a(mb.aW);
      jq<epm> $$4 = $$3.b(rr.a);
      $$0.a(
         a,
         new epm(
            $$4,
            ImmutableList.of(
               Pair.of(epk.b("bastion/units/air_base", $$2), 1),
               Pair.of(epk.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(epk.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(epk.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            epm.a.b
         )
      );
      rf.a($$0);
      re.a($$0);
      ri.a($$0);
      rd.a($$0);
      rh.a($$0);
   }
}
