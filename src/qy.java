import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qy {
   public static final ale<eju> a = rj.a("bastion/starts");

   public static void a(rc<eju> $$0) {
      jj<emj> $$1 = $$0.a(lq.aK);
      ji<emj> $$2 = $$1.b(rk.w);
      jj<eju> $$3 = $$0.a(lq.aM);
      ji<eju> $$4 = $$3.b(rj.a);
      $$0.a(
         a,
         new eju(
            $$4,
            ImmutableList.of(
               Pair.of(ejs.b("bastion/units/air_base", $$2), 1),
               Pair.of(ejs.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ejs.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ejs.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            eju.a.b
         )
      );
      qx.a($$0);
      qw.a($$0);
      ra.a($$0);
      qv.a($$0);
      qz.a($$0);
   }
}
