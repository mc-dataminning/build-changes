import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qy {
   public static final ale<ejv> a = rj.a("bastion/starts");

   public static void a(rc<ejv> $$0) {
      jj<emk> $$1 = $$0.a(lq.aK);
      ji<emk> $$2 = $$1.b(rk.w);
      jj<ejv> $$3 = $$0.a(lq.aM);
      ji<ejv> $$4 = $$3.b(rj.a);
      $$0.a(
         a,
         new ejv(
            $$4,
            ImmutableList.of(
               Pair.of(ejt.b("bastion/units/air_base", $$2), 1),
               Pair.of(ejt.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ejt.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ejt.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ejv.a.b
         )
      );
      qx.a($$0);
      qw.a($$0);
      ra.a($$0);
      qv.a($$0);
      qz.a($$0);
   }
}
