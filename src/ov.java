import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ov {
   public static final agl<dyv> a = pg.a("bastion/starts");

   public static void a(oz<dyv> $$0) {
      ih<ebk> $$1 = $$0.a(kd.aC);
      ig<ebk> $$2 = $$1.b(ph.w);
      ih<dyv> $$3 = $$0.a(kd.aE);
      ig<dyv> $$4 = $$3.b(pg.a);
      $$0.a(
         a,
         new dyv(
            $$4,
            ImmutableList.of(
               Pair.of(dyt.b("bastion/units/air_base", $$2), 1),
               Pair.of(dyt.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(dyt.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(dyt.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            dyv.a.b
         )
      );
      ou.a($$0);
      ot.a($$0);
      ox.a($$0);
      os.a($$0);
      ow.a($$0);
   }
}
