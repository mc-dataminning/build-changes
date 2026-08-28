import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static void a(qq<ekz> $$0) {
      jn<enp> $$1 = $$0.a(lu.aS);
      jm<enp> $$2 = $$1.b(qy.y);
      jm<enp> $$3 = $$1.b(qy.w);
      jm<enp> $$4 = $$1.b(qy.z);
      jm<enp> $$5 = $$1.b(qy.x);
      jn<ekz> $$6 = $$0.a(lu.aU);
      jm<ekz> $$7 = $$6.b(qx.a);
      qx.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ekz(
            $$7,
            ImmutableList.of(
               Pair.of(ekx.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ekx.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ekz.a.b
         )
      );
      qx.a($$0, "bastion/bridge/bridge_pieces", new ekz($$7, ImmutableList.of(Pair.of(ekx.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ekz.a.b));
      qx.a(
         $$0,
         "bastion/bridge/legs",
         new ekz($$7, ImmutableList.of(Pair.of(ekx.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ekx.b("bastion/bridge/legs/leg_1", $$3), 1)), ekz.a.b)
      );
      qx.a(
         $$0,
         "bastion/bridge/walls",
         new ekz(
            $$7,
            ImmutableList.of(Pair.of(ekx.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ekx.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ekz.a.b
         )
      );
      qx.a(
         $$0,
         "bastion/bridge/ramparts",
         new ekz(
            $$7,
            ImmutableList.of(Pair.of(ekx.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ekx.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ekz.a.b
         )
      );
      qx.a($$0, "bastion/bridge/rampart_plates", new ekz($$7, ImmutableList.of(Pair.of(ekx.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ekz.a.b));
      qx.a(
         $$0,
         "bastion/bridge/connectors",
         new ekz(
            $$7,
            ImmutableList.of(
               Pair.of(ekx.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ekx.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ekz.a.b
         )
      );
   }
}
