import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rd {
   public static void a(rk<epm> $$0) {
      jr<esc> $$1 = $$0.a(mb.aU);
      jq<esc> $$2 = $$1.b(rs.y);
      jq<esc> $$3 = $$1.b(rs.w);
      jq<esc> $$4 = $$1.b(rs.z);
      jq<esc> $$5 = $$1.b(rs.x);
      jr<epm> $$6 = $$0.a(mb.aW);
      jq<epm> $$7 = $$6.b(rr.a);
      rr.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new epm(
            $$7,
            ImmutableList.of(
               Pair.of(epk.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(epk.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            epm.a.b
         )
      );
      rr.a($$0, "bastion/bridge/bridge_pieces", new epm($$7, ImmutableList.of(Pair.of(epk.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), epm.a.b));
      rr.a(
         $$0,
         "bastion/bridge/legs",
         new epm($$7, ImmutableList.of(Pair.of(epk.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(epk.b("bastion/bridge/legs/leg_1", $$3), 1)), epm.a.b)
      );
      rr.a(
         $$0,
         "bastion/bridge/walls",
         new epm(
            $$7,
            ImmutableList.of(Pair.of(epk.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(epk.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            epm.a.b
         )
      );
      rr.a(
         $$0,
         "bastion/bridge/ramparts",
         new epm(
            $$7,
            ImmutableList.of(Pair.of(epk.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(epk.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            epm.a.b
         )
      );
      rr.a($$0, "bastion/bridge/rampart_plates", new epm($$7, ImmutableList.of(Pair.of(epk.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), epm.a.b));
      rr.a(
         $$0,
         "bastion/bridge/connectors",
         new epm(
            $$7,
            ImmutableList.of(
               Pair.of(epk.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(epk.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            epm.a.b
         )
      );
   }
}
