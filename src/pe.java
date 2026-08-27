import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pe {
   public static void a(pl<eel> $$0) {
      im<eha> $$1 = $$0.a(kj.aF);
      il<eha> $$2 = $$1.b(pt.y);
      il<eha> $$3 = $$1.b(pt.w);
      il<eha> $$4 = $$1.b(pt.z);
      il<eha> $$5 = $$1.b(pt.x);
      im<eel> $$6 = $$0.a(kj.aH);
      il<eel> $$7 = $$6.b(ps.a);
      ps.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eel(
            $$7,
            ImmutableList.of(
               Pair.of(eej.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eej.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eel.a.b
         )
      );
      ps.a($$0, "bastion/bridge/bridge_pieces", new eel($$7, ImmutableList.of(Pair.of(eej.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eel.a.b));
      ps.a(
         $$0,
         "bastion/bridge/legs",
         new eel($$7, ImmutableList.of(Pair.of(eej.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eej.b("bastion/bridge/legs/leg_1", $$3), 1)), eel.a.b)
      );
      ps.a(
         $$0,
         "bastion/bridge/walls",
         new eel(
            $$7,
            ImmutableList.of(Pair.of(eej.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eej.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eel.a.b
         )
      );
      ps.a(
         $$0,
         "bastion/bridge/ramparts",
         new eel(
            $$7,
            ImmutableList.of(Pair.of(eej.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eej.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eel.a.b
         )
      );
      ps.a($$0, "bastion/bridge/rampart_plates", new eel($$7, ImmutableList.of(Pair.of(eej.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eel.a.b));
      ps.a(
         $$0,
         "bastion/bridge/connectors",
         new eel(
            $$7,
            ImmutableList.of(
               Pair.of(eej.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eej.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eel.a.b
         )
      );
   }
}
