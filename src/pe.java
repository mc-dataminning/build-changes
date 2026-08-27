import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pe {
   public static void a(pl<een> $$0) {
      im<ehc> $$1 = $$0.a(kj.aF);
      il<ehc> $$2 = $$1.b(pt.y);
      il<ehc> $$3 = $$1.b(pt.w);
      il<ehc> $$4 = $$1.b(pt.z);
      il<ehc> $$5 = $$1.b(pt.x);
      im<een> $$6 = $$0.a(kj.aH);
      il<een> $$7 = $$6.b(ps.a);
      ps.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new een(
            $$7,
            ImmutableList.of(
               Pair.of(eel.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eel.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            een.a.b
         )
      );
      ps.a($$0, "bastion/bridge/bridge_pieces", new een($$7, ImmutableList.of(Pair.of(eel.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), een.a.b));
      ps.a(
         $$0,
         "bastion/bridge/legs",
         new een($$7, ImmutableList.of(Pair.of(eel.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eel.b("bastion/bridge/legs/leg_1", $$3), 1)), een.a.b)
      );
      ps.a(
         $$0,
         "bastion/bridge/walls",
         new een(
            $$7,
            ImmutableList.of(Pair.of(eel.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eel.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            een.a.b
         )
      );
      ps.a(
         $$0,
         "bastion/bridge/ramparts",
         new een(
            $$7,
            ImmutableList.of(Pair.of(eel.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eel.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            een.a.b
         )
      );
      ps.a($$0, "bastion/bridge/rampart_plates", new een($$7, ImmutableList.of(Pair.of(eel.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), een.a.b));
      ps.a(
         $$0,
         "bastion/bridge/connectors",
         new een(
            $$7,
            ImmutableList.of(
               Pair.of(eel.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eel.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            een.a.b
         )
      );
   }
}
