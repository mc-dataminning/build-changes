import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qu {
   public static void a(rb<enl> $$0) {
      jr<eqb> $$1 = $$0.a(ma.aT);
      jq<eqb> $$2 = $$1.b(rj.y);
      jq<eqb> $$3 = $$1.b(rj.w);
      jq<eqb> $$4 = $$1.b(rj.z);
      jq<eqb> $$5 = $$1.b(rj.x);
      jr<enl> $$6 = $$0.a(ma.aV);
      jq<enl> $$7 = $$6.b(ri.a);
      ri.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new enl(
            $$7,
            ImmutableList.of(
               Pair.of(enj.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(enj.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            enl.a.b
         )
      );
      ri.a($$0, "bastion/bridge/bridge_pieces", new enl($$7, ImmutableList.of(Pair.of(enj.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), enl.a.b));
      ri.a(
         $$0,
         "bastion/bridge/legs",
         new enl($$7, ImmutableList.of(Pair.of(enj.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(enj.b("bastion/bridge/legs/leg_1", $$3), 1)), enl.a.b)
      );
      ri.a(
         $$0,
         "bastion/bridge/walls",
         new enl(
            $$7,
            ImmutableList.of(Pair.of(enj.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(enj.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            enl.a.b
         )
      );
      ri.a(
         $$0,
         "bastion/bridge/ramparts",
         new enl(
            $$7,
            ImmutableList.of(Pair.of(enj.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(enj.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            enl.a.b
         )
      );
      ri.a($$0, "bastion/bridge/rampart_plates", new enl($$7, ImmutableList.of(Pair.of(enj.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), enl.a.b));
      ri.a(
         $$0,
         "bastion/bridge/connectors",
         new enl(
            $$7,
            ImmutableList.of(
               Pair.of(enj.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(enj.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            enl.a.b
         )
      );
   }
}
