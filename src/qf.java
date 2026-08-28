import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qf {
   public static void a(qm<ejz> $$0) {
      jk<emo> $$1 = $$0.a(lr.aR);
      jj<emo> $$2 = $$1.b(qu.y);
      jj<emo> $$3 = $$1.b(qu.w);
      jj<emo> $$4 = $$1.b(qu.z);
      jj<emo> $$5 = $$1.b(qu.x);
      jk<ejz> $$6 = $$0.a(lr.aT);
      jj<ejz> $$7 = $$6.b(qt.a);
      qt.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ejz(
            $$7,
            ImmutableList.of(
               Pair.of(ejx.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ejx.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ejz.a.b
         )
      );
      qt.a($$0, "bastion/bridge/bridge_pieces", new ejz($$7, ImmutableList.of(Pair.of(ejx.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ejz.a.b));
      qt.a(
         $$0,
         "bastion/bridge/legs",
         new ejz($$7, ImmutableList.of(Pair.of(ejx.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ejx.b("bastion/bridge/legs/leg_1", $$3), 1)), ejz.a.b)
      );
      qt.a(
         $$0,
         "bastion/bridge/walls",
         new ejz(
            $$7,
            ImmutableList.of(Pair.of(ejx.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ejx.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ejz.a.b
         )
      );
      qt.a(
         $$0,
         "bastion/bridge/ramparts",
         new ejz(
            $$7,
            ImmutableList.of(Pair.of(ejx.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ejx.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ejz.a.b
         )
      );
      qt.a($$0, "bastion/bridge/rampart_plates", new ejz($$7, ImmutableList.of(Pair.of(ejx.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ejz.a.b));
      qt.a(
         $$0,
         "bastion/bridge/connectors",
         new ejz(
            $$7,
            ImmutableList.of(
               Pair.of(ejx.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ejx.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ejz.a.b
         )
      );
   }
}
