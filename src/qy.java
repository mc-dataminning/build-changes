import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qy {
   public static final ald<ejr> a = rj.a("bastion/starts");

   public static void a(rc<ejr> $$0) {
      jj<emg> $$1 = $$0.a(lq.aK);
      ji<emg> $$2 = $$1.b(rk.w);
      jj<ejr> $$3 = $$0.a(lq.aM);
      ji<ejr> $$4 = $$3.b(rj.a);
      $$0.a(
         a,
         new ejr(
            $$4,
            ImmutableList.of(
               Pair.of(ejp.b("bastion/units/air_base", $$2), 1),
               Pair.of(ejp.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ejp.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ejp.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ejr.a.b
         )
      );
      qx.a($$0);
      qw.a($$0);
      ra.a($$0);
      qv.a($$0);
      qz.a($$0);
   }
}
