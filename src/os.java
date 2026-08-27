import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class os {
   public static void a(oz<dyv> $$0) {
      ih<ebk> $$1 = $$0.a(kd.aC);
      ig<ebk> $$2 = $$1.b(ph.y);
      ig<ebk> $$3 = $$1.b(ph.w);
      ig<ebk> $$4 = $$1.b(ph.z);
      ig<ebk> $$5 = $$1.b(ph.x);
      ih<dyv> $$6 = $$0.a(kd.aE);
      ig<dyv> $$7 = $$6.b(pg.a);
      pg.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dyv(
            $$7,
            ImmutableList.of(
               Pair.of(dyt.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dyt.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dyv.a.b
         )
      );
      pg.a($$0, "bastion/bridge/bridge_pieces", new dyv($$7, ImmutableList.of(Pair.of(dyt.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dyv.a.b));
      pg.a(
         $$0,
         "bastion/bridge/legs",
         new dyv($$7, ImmutableList.of(Pair.of(dyt.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dyt.b("bastion/bridge/legs/leg_1", $$3), 1)), dyv.a.b)
      );
      pg.a(
         $$0,
         "bastion/bridge/walls",
         new dyv(
            $$7,
            ImmutableList.of(Pair.of(dyt.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dyt.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dyv.a.b
         )
      );
      pg.a(
         $$0,
         "bastion/bridge/ramparts",
         new dyv(
            $$7,
            ImmutableList.of(Pair.of(dyt.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dyt.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dyv.a.b
         )
      );
      pg.a($$0, "bastion/bridge/rampart_plates", new dyv($$7, ImmutableList.of(Pair.of(dyt.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dyv.a.b));
      pg.a(
         $$0,
         "bastion/bridge/connectors",
         new dyv(
            $$7,
            ImmutableList.of(
               Pair.of(dyt.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dyt.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dyv.a.b
         )
      );
   }
}
