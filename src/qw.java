import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qw {
   public static final alo<epn> a = rh.a("bastion/starts");

   public static void a(ra<epn> $$0) {
      jr<esd> $$1 = $$0.a(mb.aV);
      jq<esd> $$2 = $$1.b(ri.w);
      jr<epn> $$3 = $$0.a(mb.aX);
      jq<epn> $$4 = $$3.b(rh.a);
      $$0.a(
         a,
         new epn(
            $$4,
            ImmutableList.of(
               Pair.of(epl.b("bastion/units/air_base", $$2), 1),
               Pair.of(epl.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(epl.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(epl.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            epn.a.b
         )
      );
      qv.a($$0);
      qu.a($$0);
      qy.a($$0);
      qt.a($$0);
      qx.a($$0);
   }
}
