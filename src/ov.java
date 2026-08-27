import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ov {
   public static void a(pc<eai> $$0) {
      ii<ecx> $$1 = $$0.a(ke.aE);
      ih<ecx> $$2 = $$1.b(pk.y);
      ih<ecx> $$3 = $$1.b(pk.w);
      ih<ecx> $$4 = $$1.b(pk.z);
      ih<ecx> $$5 = $$1.b(pk.x);
      ii<eai> $$6 = $$0.a(ke.aG);
      ih<eai> $$7 = $$6.b(pj.a);
      pj.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eai(
            $$7,
            ImmutableList.of(
               Pair.of(eag.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eag.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eai.a.b
         )
      );
      pj.a($$0, "bastion/bridge/bridge_pieces", new eai($$7, ImmutableList.of(Pair.of(eag.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eai.a.b));
      pj.a(
         $$0,
         "bastion/bridge/legs",
         new eai($$7, ImmutableList.of(Pair.of(eag.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eag.b("bastion/bridge/legs/leg_1", $$3), 1)), eai.a.b)
      );
      pj.a(
         $$0,
         "bastion/bridge/walls",
         new eai(
            $$7,
            ImmutableList.of(Pair.of(eag.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eag.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eai.a.b
         )
      );
      pj.a(
         $$0,
         "bastion/bridge/ramparts",
         new eai(
            $$7,
            ImmutableList.of(Pair.of(eag.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eag.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eai.a.b
         )
      );
      pj.a($$0, "bastion/bridge/rampart_plates", new eai($$7, ImmutableList.of(Pair.of(eag.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eai.a.b));
      pj.a(
         $$0,
         "bastion/bridge/connectors",
         new eai(
            $$7,
            ImmutableList.of(
               Pair.of(eag.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eag.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eai.a.b
         )
      );
   }
}
