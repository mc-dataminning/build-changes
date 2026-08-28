import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static final ali<ens> a = rg.a("bastion/starts");

   public static void a(qz<ens> $$0) {
      jr<eqi> $$1 = $$0.a(ma.aT);
      jq<eqi> $$2 = $$1.b(rh.w);
      jr<ens> $$3 = $$0.a(ma.aV);
      jq<ens> $$4 = $$3.b(rg.a);
      $$0.a(
         a,
         new ens(
            $$4,
            ImmutableList.of(
               Pair.of(enq.b("bastion/units/air_base", $$2), 1),
               Pair.of(enq.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(enq.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(enq.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ens.a.b
         )
      );
      qu.a($$0);
      qt.a($$0);
      qx.a($$0);
      qs.a($$0);
      qw.a($$0);
   }
}
