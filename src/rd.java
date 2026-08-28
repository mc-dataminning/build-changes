import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rd {
   public static void a(rk<epu> $$0) {
      jr<esk> $$1 = $$0.a(mb.aV);
      jq<esk> $$2 = $$1.b(rs.y);
      jq<esk> $$3 = $$1.b(rs.w);
      jq<esk> $$4 = $$1.b(rs.z);
      jq<esk> $$5 = $$1.b(rs.x);
      jr<epu> $$6 = $$0.a(mb.aX);
      jq<epu> $$7 = $$6.b(rr.a);
      rr.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new epu(
            $$7,
            ImmutableList.of(
               Pair.of(eps.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eps.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            epu.a.b
         )
      );
      rr.a($$0, "bastion/bridge/bridge_pieces", new epu($$7, ImmutableList.of(Pair.of(eps.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), epu.a.b));
      rr.a(
         $$0,
         "bastion/bridge/legs",
         new epu($$7, ImmutableList.of(Pair.of(eps.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eps.b("bastion/bridge/legs/leg_1", $$3), 1)), epu.a.b)
      );
      rr.a(
         $$0,
         "bastion/bridge/walls",
         new epu(
            $$7,
            ImmutableList.of(Pair.of(eps.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eps.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            epu.a.b
         )
      );
      rr.a(
         $$0,
         "bastion/bridge/ramparts",
         new epu(
            $$7,
            ImmutableList.of(Pair.of(eps.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eps.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            epu.a.b
         )
      );
      rr.a($$0, "bastion/bridge/rampart_plates", new epu($$7, ImmutableList.of(Pair.of(eps.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), epu.a.b));
      rr.a(
         $$0,
         "bastion/bridge/connectors",
         new epu(
            $$7,
            ImmutableList.of(
               Pair.of(eps.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eps.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            epu.a.b
         )
      );
   }
}
