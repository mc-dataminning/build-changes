import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static void a(qq<elb> $$0) {
      jn<enr> $$1 = $$0.a(lu.aS);
      jm<enr> $$2 = $$1.b(qy.y);
      jm<enr> $$3 = $$1.b(qy.w);
      jm<enr> $$4 = $$1.b(qy.z);
      jm<enr> $$5 = $$1.b(qy.x);
      jn<elb> $$6 = $$0.a(lu.aU);
      jm<elb> $$7 = $$6.b(qx.a);
      qx.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new elb(
            $$7,
            ImmutableList.of(
               Pair.of(ekz.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ekz.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            elb.a.b
         )
      );
      qx.a($$0, "bastion/bridge/bridge_pieces", new elb($$7, ImmutableList.of(Pair.of(ekz.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), elb.a.b));
      qx.a(
         $$0,
         "bastion/bridge/legs",
         new elb($$7, ImmutableList.of(Pair.of(ekz.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ekz.b("bastion/bridge/legs/leg_1", $$3), 1)), elb.a.b)
      );
      qx.a(
         $$0,
         "bastion/bridge/walls",
         new elb(
            $$7,
            ImmutableList.of(Pair.of(ekz.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ekz.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            elb.a.b
         )
      );
      qx.a(
         $$0,
         "bastion/bridge/ramparts",
         new elb(
            $$7,
            ImmutableList.of(Pair.of(ekz.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ekz.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            elb.a.b
         )
      );
      qx.a($$0, "bastion/bridge/rampart_plates", new elb($$7, ImmutableList.of(Pair.of(ekz.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), elb.a.b));
      qx.a(
         $$0,
         "bastion/bridge/connectors",
         new elb(
            $$7,
            ImmutableList.of(
               Pair.of(ekz.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ekz.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            elb.a.b
         )
      );
   }
}
