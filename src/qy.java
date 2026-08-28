import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qy {
   public static final ala<ejo> a = rj.a("bastion/starts");

   public static void a(rc<ejo> $$0) {
      jj<emd> $$1 = $$0.a(lq.aK);
      ji<emd> $$2 = $$1.b(rk.w);
      jj<ejo> $$3 = $$0.a(lq.aM);
      ji<ejo> $$4 = $$3.b(rj.a);
      $$0.a(
         a,
         new ejo(
            $$4,
            ImmutableList.of(
               Pair.of(ejm.b("bastion/units/air_base", $$2), 1),
               Pair.of(ejm.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ejm.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ejm.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ejo.a.b
         )
      );
      qx.a($$0);
      qw.a($$0);
      ra.a($$0);
      qv.a($$0);
      qz.a($$0);
   }
}
