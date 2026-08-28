import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qt {
   public static void a(ra<epn> $$0) {
      jr<esd> $$1 = $$0.a(mb.aV);
      jq<esd> $$2 = $$1.b(ri.y);
      jq<esd> $$3 = $$1.b(ri.w);
      jq<esd> $$4 = $$1.b(ri.z);
      jq<esd> $$5 = $$1.b(ri.x);
      jr<epn> $$6 = $$0.a(mb.aX);
      jq<epn> $$7 = $$6.b(rh.a);
      rh.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new epn(
            $$7,
            ImmutableList.of(
               Pair.of(epl.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(epl.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            epn.a.b
         )
      );
      rh.a($$0, "bastion/bridge/bridge_pieces", new epn($$7, ImmutableList.of(Pair.of(epl.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), epn.a.b));
      rh.a(
         $$0,
         "bastion/bridge/legs",
         new epn($$7, ImmutableList.of(Pair.of(epl.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(epl.b("bastion/bridge/legs/leg_1", $$3), 1)), epn.a.b)
      );
      rh.a(
         $$0,
         "bastion/bridge/walls",
         new epn(
            $$7,
            ImmutableList.of(Pair.of(epl.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(epl.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            epn.a.b
         )
      );
      rh.a(
         $$0,
         "bastion/bridge/ramparts",
         new epn(
            $$7,
            ImmutableList.of(Pair.of(epl.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(epl.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            epn.a.b
         )
      );
      rh.a($$0, "bastion/bridge/rampart_plates", new epn($$7, ImmutableList.of(Pair.of(epl.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), epn.a.b));
      rh.a(
         $$0,
         "bastion/bridge/connectors",
         new epn(
            $$7,
            ImmutableList.of(
               Pair.of(epl.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(epl.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            epn.a.b
         )
      );
   }
}
