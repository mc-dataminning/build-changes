import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pa {
   public static void a(ph<ecn> $$0) {
      ik<efc> $$1 = $$0.a(kg.aE);
      ij<efc> $$2 = $$1.b(pp.y);
      ij<efc> $$3 = $$1.b(pp.w);
      ij<efc> $$4 = $$1.b(pp.z);
      ij<efc> $$5 = $$1.b(pp.x);
      ik<ecn> $$6 = $$0.a(kg.aG);
      ij<ecn> $$7 = $$6.b(po.a);
      po.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ecn(
            $$7,
            ImmutableList.of(
               Pair.of(ecl.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ecl.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ecn.a.b
         )
      );
      po.a($$0, "bastion/bridge/bridge_pieces", new ecn($$7, ImmutableList.of(Pair.of(ecl.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ecn.a.b));
      po.a(
         $$0,
         "bastion/bridge/legs",
         new ecn($$7, ImmutableList.of(Pair.of(ecl.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ecl.b("bastion/bridge/legs/leg_1", $$3), 1)), ecn.a.b)
      );
      po.a(
         $$0,
         "bastion/bridge/walls",
         new ecn(
            $$7,
            ImmutableList.of(Pair.of(ecl.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ecl.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ecn.a.b
         )
      );
      po.a(
         $$0,
         "bastion/bridge/ramparts",
         new ecn(
            $$7,
            ImmutableList.of(Pair.of(ecl.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ecl.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ecn.a.b
         )
      );
      po.a($$0, "bastion/bridge/rampart_plates", new ecn($$7, ImmutableList.of(Pair.of(ecl.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ecn.a.b));
      po.a(
         $$0,
         "bastion/bridge/connectors",
         new ecn(
            $$7,
            ImmutableList.of(
               Pair.of(ecl.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ecl.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ecn.a.b
         )
      );
   }
}
