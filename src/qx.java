import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qx {
   public static final alk<enl> a = ri.a("bastion/starts");

   public static void a(rb<enl> $$0) {
      jr<eqb> $$1 = $$0.a(ma.aT);
      jq<eqb> $$2 = $$1.b(rj.w);
      jr<enl> $$3 = $$0.a(ma.aV);
      jq<enl> $$4 = $$3.b(ri.a);
      $$0.a(
         a,
         new enl(
            $$4,
            ImmutableList.of(
               Pair.of(enj.b("bastion/units/air_base", $$2), 1),
               Pair.of(enj.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(enj.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(enj.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            enl.a.b
         )
      );
      qw.a($$0);
      qv.a($$0);
      qz.a($$0);
      qu.a($$0);
      qy.a($$0);
   }
}
