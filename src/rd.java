import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rd {
   public static void a(rk<ept> $$0) {
      jr<esj> $$1 = $$0.a(mb.aV);
      jq<esj> $$2 = $$1.b(rs.y);
      jq<esj> $$3 = $$1.b(rs.w);
      jq<esj> $$4 = $$1.b(rs.z);
      jq<esj> $$5 = $$1.b(rs.x);
      jr<ept> $$6 = $$0.a(mb.aX);
      jq<ept> $$7 = $$6.b(rr.a);
      rr.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ept(
            $$7,
            ImmutableList.of(
               Pair.of(epr.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(epr.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ept.a.b
         )
      );
      rr.a($$0, "bastion/bridge/bridge_pieces", new ept($$7, ImmutableList.of(Pair.of(epr.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ept.a.b));
      rr.a(
         $$0,
         "bastion/bridge/legs",
         new ept($$7, ImmutableList.of(Pair.of(epr.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(epr.b("bastion/bridge/legs/leg_1", $$3), 1)), ept.a.b)
      );
      rr.a(
         $$0,
         "bastion/bridge/walls",
         new ept(
            $$7,
            ImmutableList.of(Pair.of(epr.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(epr.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ept.a.b
         )
      );
      rr.a(
         $$0,
         "bastion/bridge/ramparts",
         new ept(
            $$7,
            ImmutableList.of(Pair.of(epr.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(epr.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ept.a.b
         )
      );
      rr.a($$0, "bastion/bridge/rampart_plates", new ept($$7, ImmutableList.of(Pair.of(epr.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ept.a.b));
      rr.a(
         $$0,
         "bastion/bridge/connectors",
         new ept(
            $$7,
            ImmutableList.of(
               Pair.of(epr.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(epr.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ept.a.b
         )
      );
   }
}
