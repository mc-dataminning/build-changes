import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qf {
   public static void a(qm<ekf> $$0) {
      jk<emu> $$1 = $$0.a(lr.aR);
      jj<emu> $$2 = $$1.b(qu.y);
      jj<emu> $$3 = $$1.b(qu.w);
      jj<emu> $$4 = $$1.b(qu.z);
      jj<emu> $$5 = $$1.b(qu.x);
      jk<ekf> $$6 = $$0.a(lr.aT);
      jj<ekf> $$7 = $$6.b(qt.a);
      qt.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ekf(
            $$7,
            ImmutableList.of(
               Pair.of(ekd.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ekd.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ekf.a.b
         )
      );
      qt.a($$0, "bastion/bridge/bridge_pieces", new ekf($$7, ImmutableList.of(Pair.of(ekd.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ekf.a.b));
      qt.a(
         $$0,
         "bastion/bridge/legs",
         new ekf($$7, ImmutableList.of(Pair.of(ekd.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ekd.b("bastion/bridge/legs/leg_1", $$3), 1)), ekf.a.b)
      );
      qt.a(
         $$0,
         "bastion/bridge/walls",
         new ekf(
            $$7,
            ImmutableList.of(Pair.of(ekd.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ekd.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ekf.a.b
         )
      );
      qt.a(
         $$0,
         "bastion/bridge/ramparts",
         new ekf(
            $$7,
            ImmutableList.of(Pair.of(ekd.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ekd.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ekf.a.b
         )
      );
      qt.a($$0, "bastion/bridge/rampart_plates", new ekf($$7, ImmutableList.of(Pair.of(ekd.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ekf.a.b));
      qt.a(
         $$0,
         "bastion/bridge/connectors",
         new ekf(
            $$7,
            ImmutableList.of(
               Pair.of(ekd.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ekd.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ekf.a.b
         )
      );
   }
}
