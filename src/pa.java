import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pa {
   public static void a(ph<ecu> $$0) {
      ik<efj> $$1 = $$0.a(kg.aE);
      ij<efj> $$2 = $$1.b(pp.y);
      ij<efj> $$3 = $$1.b(pp.w);
      ij<efj> $$4 = $$1.b(pp.z);
      ij<efj> $$5 = $$1.b(pp.x);
      ik<ecu> $$6 = $$0.a(kg.aG);
      ij<ecu> $$7 = $$6.b(po.a);
      po.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ecu(
            $$7,
            ImmutableList.of(
               Pair.of(ecs.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ecs.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ecu.a.b
         )
      );
      po.a($$0, "bastion/bridge/bridge_pieces", new ecu($$7, ImmutableList.of(Pair.of(ecs.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ecu.a.b));
      po.a(
         $$0,
         "bastion/bridge/legs",
         new ecu($$7, ImmutableList.of(Pair.of(ecs.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ecs.b("bastion/bridge/legs/leg_1", $$3), 1)), ecu.a.b)
      );
      po.a(
         $$0,
         "bastion/bridge/walls",
         new ecu(
            $$7,
            ImmutableList.of(Pair.of(ecs.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ecs.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ecu.a.b
         )
      );
      po.a(
         $$0,
         "bastion/bridge/ramparts",
         new ecu(
            $$7,
            ImmutableList.of(Pair.of(ecs.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ecs.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ecu.a.b
         )
      );
      po.a($$0, "bastion/bridge/rampart_plates", new ecu($$7, ImmutableList.of(Pair.of(ecs.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ecu.a.b));
      po.a(
         $$0,
         "bastion/bridge/connectors",
         new ecu(
            $$7,
            ImmutableList.of(
               Pair.of(ecs.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ecs.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ecu.a.b
         )
      );
   }
}
