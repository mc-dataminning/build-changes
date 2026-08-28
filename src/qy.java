import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qy {
   public static final ald<ejs> a = rj.a("bastion/starts");

   public static void a(rc<ejs> $$0) {
      jj<emh> $$1 = $$0.a(lq.aK);
      ji<emh> $$2 = $$1.b(rk.w);
      jj<ejs> $$3 = $$0.a(lq.aM);
      ji<ejs> $$4 = $$3.b(rj.a);
      $$0.a(
         a,
         new ejs(
            $$4,
            ImmutableList.of(
               Pair.of(ejq.b("bastion/units/air_base", $$2), 1),
               Pair.of(ejq.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ejq.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ejq.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ejs.a.b
         )
      );
      qx.a($$0);
      qw.a($$0);
      ra.a($$0);
      qv.a($$0);
      qz.a($$0);
   }
}
