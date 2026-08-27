import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class on {
   public static void a(ou<dye> $$0) {
      ic<eat> $$1 = $$0.a(jz.aC);
      ib<eat> $$2 = $$1.b(pc.y);
      ib<eat> $$3 = $$1.b(pc.w);
      ib<eat> $$4 = $$1.b(pc.z);
      ib<eat> $$5 = $$1.b(pc.x);
      ic<dye> $$6 = $$0.a(jz.aE);
      ib<dye> $$7 = $$6.b(pb.a);
      pb.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dye(
            $$7,
            ImmutableList.of(
               Pair.of(dyc.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dyc.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dye.a.b
         )
      );
      pb.a($$0, "bastion/bridge/bridge_pieces", new dye($$7, ImmutableList.of(Pair.of(dyc.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dye.a.b));
      pb.a(
         $$0,
         "bastion/bridge/legs",
         new dye($$7, ImmutableList.of(Pair.of(dyc.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dyc.b("bastion/bridge/legs/leg_1", $$3), 1)), dye.a.b)
      );
      pb.a(
         $$0,
         "bastion/bridge/walls",
         new dye(
            $$7,
            ImmutableList.of(Pair.of(dyc.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dyc.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dye.a.b
         )
      );
      pb.a(
         $$0,
         "bastion/bridge/ramparts",
         new dye(
            $$7,
            ImmutableList.of(Pair.of(dyc.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dyc.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dye.a.b
         )
      );
      pb.a($$0, "bastion/bridge/rampart_plates", new dye($$7, ImmutableList.of(Pair.of(dyc.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dye.a.b));
      pb.a(
         $$0,
         "bastion/bridge/connectors",
         new dye(
            $$7,
            ImmutableList.of(
               Pair.of(dyc.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dyc.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dye.a.b
         )
      );
   }
}
