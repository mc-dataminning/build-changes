import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qi {
   public static void a(qp<ekw> $$0) {
      jn<enl> $$1 = $$0.a(lu.aS);
      jm<enl> $$2 = $$1.b(qx.y);
      jm<enl> $$3 = $$1.b(qx.w);
      jm<enl> $$4 = $$1.b(qx.z);
      jm<enl> $$5 = $$1.b(qx.x);
      jn<ekw> $$6 = $$0.a(lu.aU);
      jm<ekw> $$7 = $$6.b(qw.a);
      qw.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ekw(
            $$7,
            ImmutableList.of(
               Pair.of(eku.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eku.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ekw.a.b
         )
      );
      qw.a($$0, "bastion/bridge/bridge_pieces", new ekw($$7, ImmutableList.of(Pair.of(eku.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ekw.a.b));
      qw.a(
         $$0,
         "bastion/bridge/legs",
         new ekw($$7, ImmutableList.of(Pair.of(eku.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eku.b("bastion/bridge/legs/leg_1", $$3), 1)), ekw.a.b)
      );
      qw.a(
         $$0,
         "bastion/bridge/walls",
         new ekw(
            $$7,
            ImmutableList.of(Pair.of(eku.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eku.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ekw.a.b
         )
      );
      qw.a(
         $$0,
         "bastion/bridge/ramparts",
         new ekw(
            $$7,
            ImmutableList.of(Pair.of(eku.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eku.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ekw.a.b
         )
      );
      qw.a($$0, "bastion/bridge/rampart_plates", new ekw($$7, ImmutableList.of(Pair.of(eku.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ekw.a.b));
      qw.a(
         $$0,
         "bastion/bridge/connectors",
         new ekw(
            $$7,
            ImmutableList.of(
               Pair.of(eku.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eku.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ekw.a.b
         )
      );
   }
}
