import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qf {
   public static void a(qm<ekh> $$0) {
      jk<emw> $$1 = $$0.a(lr.aR);
      jj<emw> $$2 = $$1.b(qu.y);
      jj<emw> $$3 = $$1.b(qu.w);
      jj<emw> $$4 = $$1.b(qu.z);
      jj<emw> $$5 = $$1.b(qu.x);
      jk<ekh> $$6 = $$0.a(lr.aT);
      jj<ekh> $$7 = $$6.b(qt.a);
      qt.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ekh(
            $$7,
            ImmutableList.of(
               Pair.of(ekf.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ekf.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ekh.a.b
         )
      );
      qt.a($$0, "bastion/bridge/bridge_pieces", new ekh($$7, ImmutableList.of(Pair.of(ekf.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ekh.a.b));
      qt.a(
         $$0,
         "bastion/bridge/legs",
         new ekh($$7, ImmutableList.of(Pair.of(ekf.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ekf.b("bastion/bridge/legs/leg_1", $$3), 1)), ekh.a.b)
      );
      qt.a(
         $$0,
         "bastion/bridge/walls",
         new ekh(
            $$7,
            ImmutableList.of(Pair.of(ekf.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ekf.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ekh.a.b
         )
      );
      qt.a(
         $$0,
         "bastion/bridge/ramparts",
         new ekh(
            $$7,
            ImmutableList.of(Pair.of(ekf.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ekf.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ekh.a.b
         )
      );
      qt.a($$0, "bastion/bridge/rampart_plates", new ekh($$7, ImmutableList.of(Pair.of(ekf.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ekh.a.b));
      qt.a(
         $$0,
         "bastion/bridge/connectors",
         new ekh(
            $$7,
            ImmutableList.of(
               Pair.of(ekf.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ekf.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ekh.a.b
         )
      );
   }
}
