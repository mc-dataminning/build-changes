import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qq {
   public static void a(qx<enb> $$0) {
      jq<epr> $$1 = $$0.a(ly.aT);
      jp<epr> $$2 = $$1.b(rf.y);
      jp<epr> $$3 = $$1.b(rf.w);
      jp<epr> $$4 = $$1.b(rf.z);
      jp<epr> $$5 = $$1.b(rf.x);
      jq<enb> $$6 = $$0.a(ly.aV);
      jp<enb> $$7 = $$6.b(re.a);
      re.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new enb(
            $$7,
            ImmutableList.of(
               Pair.of(emz.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(emz.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            enb.a.b
         )
      );
      re.a($$0, "bastion/bridge/bridge_pieces", new enb($$7, ImmutableList.of(Pair.of(emz.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), enb.a.b));
      re.a(
         $$0,
         "bastion/bridge/legs",
         new enb($$7, ImmutableList.of(Pair.of(emz.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(emz.b("bastion/bridge/legs/leg_1", $$3), 1)), enb.a.b)
      );
      re.a(
         $$0,
         "bastion/bridge/walls",
         new enb(
            $$7,
            ImmutableList.of(Pair.of(emz.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(emz.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            enb.a.b
         )
      );
      re.a(
         $$0,
         "bastion/bridge/ramparts",
         new enb(
            $$7,
            ImmutableList.of(Pair.of(emz.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(emz.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            enb.a.b
         )
      );
      re.a($$0, "bastion/bridge/rampart_plates", new enb($$7, ImmutableList.of(Pair.of(emz.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), enb.a.b));
      re.a(
         $$0,
         "bastion/bridge/connectors",
         new enb(
            $$7,
            ImmutableList.of(
               Pair.of(emz.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(emz.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            enb.a.b
         )
      );
   }
}
