import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qy {
   public static final ale<ejt> a = rj.a("bastion/starts");

   public static void a(rc<ejt> $$0) {
      jj<emi> $$1 = $$0.a(lq.aK);
      ji<emi> $$2 = $$1.b(rk.w);
      jj<ejt> $$3 = $$0.a(lq.aM);
      ji<ejt> $$4 = $$3.b(rj.a);
      $$0.a(
         a,
         new ejt(
            $$4,
            ImmutableList.of(
               Pair.of(ejr.b("bastion/units/air_base", $$2), 1),
               Pair.of(ejr.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ejr.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ejr.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ejt.a.b
         )
      );
      qx.a($$0);
      qw.a($$0);
      ra.a($$0);
      qv.a($$0);
      qz.a($$0);
   }
}
