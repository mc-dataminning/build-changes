import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class oh {
   public static void a(oo<dxj> $$0) {
      ic<dzr> $$1 = $$0.a(jz.aB);
      ib<dzr> $$2 = $$1.b(ow.y);
      ib<dzr> $$3 = $$1.b(ow.w);
      ib<dzr> $$4 = $$1.b(ow.z);
      ib<dzr> $$5 = $$1.b(ow.x);
      ic<dxj> $$6 = $$0.a(jz.aD);
      ib<dxj> $$7 = $$6.b(ov.a);
      ov.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dxj(
            $$7,
            ImmutableList.of(
               Pair.of(dxh.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dxh.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dxj.a.b
         )
      );
      ov.a($$0, "bastion/bridge/bridge_pieces", new dxj($$7, ImmutableList.of(Pair.of(dxh.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dxj.a.b));
      ov.a(
         $$0,
         "bastion/bridge/legs",
         new dxj($$7, ImmutableList.of(Pair.of(dxh.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dxh.b("bastion/bridge/legs/leg_1", $$3), 1)), dxj.a.b)
      );
      ov.a(
         $$0,
         "bastion/bridge/walls",
         new dxj(
            $$7,
            ImmutableList.of(Pair.of(dxh.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dxh.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dxj.a.b
         )
      );
      ov.a(
         $$0,
         "bastion/bridge/ramparts",
         new dxj(
            $$7,
            ImmutableList.of(Pair.of(dxh.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dxh.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dxj.a.b
         )
      );
      ov.a($$0, "bastion/bridge/rampart_plates", new dxj($$7, ImmutableList.of(Pair.of(dxh.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dxj.a.b));
      ov.a(
         $$0,
         "bastion/bridge/connectors",
         new dxj(
            $$7,
            ImmutableList.of(
               Pair.of(dxh.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dxh.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dxj.a.b
         )
      );
   }
}
