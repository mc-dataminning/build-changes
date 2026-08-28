import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qr {
   public static void a(qy<enh> $$0) {
      jr<epx> $$1 = $$0.a(lz.aT);
      jq<epx> $$2 = $$1.b(rg.y);
      jq<epx> $$3 = $$1.b(rg.w);
      jq<epx> $$4 = $$1.b(rg.z);
      jq<epx> $$5 = $$1.b(rg.x);
      jr<enh> $$6 = $$0.a(lz.aV);
      jq<enh> $$7 = $$6.b(rf.a);
      rf.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new enh(
            $$7,
            ImmutableList.of(
               Pair.of(enf.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(enf.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            enh.a.b
         )
      );
      rf.a($$0, "bastion/bridge/bridge_pieces", new enh($$7, ImmutableList.of(Pair.of(enf.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), enh.a.b));
      rf.a(
         $$0,
         "bastion/bridge/legs",
         new enh($$7, ImmutableList.of(Pair.of(enf.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(enf.b("bastion/bridge/legs/leg_1", $$3), 1)), enh.a.b)
      );
      rf.a(
         $$0,
         "bastion/bridge/walls",
         new enh(
            $$7,
            ImmutableList.of(Pair.of(enf.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(enf.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            enh.a.b
         )
      );
      rf.a(
         $$0,
         "bastion/bridge/ramparts",
         new enh(
            $$7,
            ImmutableList.of(Pair.of(enf.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(enf.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            enh.a.b
         )
      );
      rf.a($$0, "bastion/bridge/rampart_plates", new enh($$7, ImmutableList.of(Pair.of(enf.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), enh.a.b));
      rf.a(
         $$0,
         "bastion/bridge/connectors",
         new enh(
            $$7,
            ImmutableList.of(
               Pair.of(enf.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(enf.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            enh.a.b
         )
      );
   }
}
