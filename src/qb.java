import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qb {
   public static void a(qi<etx> $$0) {
      jh<ewn> $$1 = $$0.a(mi.bc);
      jg<ewn> $$2 = $$1.b(qq.y);
      jg<ewn> $$3 = $$1.b(qq.w);
      jg<ewn> $$4 = $$1.b(qq.z);
      jg<ewn> $$5 = $$1.b(qq.x);
      jh<etx> $$6 = $$0.a(mi.bf);
      jg<etx> $$7 = $$6.b(qp.a);
      qp.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new etx(
            $$7,
            ImmutableList.of(
               Pair.of(etv.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(etv.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            etx.a.b
         )
      );
      qp.a($$0, "bastion/bridge/bridge_pieces", new etx($$7, ImmutableList.of(Pair.of(etv.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), etx.a.b));
      qp.a(
         $$0,
         "bastion/bridge/legs",
         new etx($$7, ImmutableList.of(Pair.of(etv.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(etv.b("bastion/bridge/legs/leg_1", $$3), 1)), etx.a.b)
      );
      qp.a(
         $$0,
         "bastion/bridge/walls",
         new etx(
            $$7,
            ImmutableList.of(Pair.of(etv.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(etv.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            etx.a.b
         )
      );
      qp.a(
         $$0,
         "bastion/bridge/ramparts",
         new etx(
            $$7,
            ImmutableList.of(Pair.of(etv.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(etv.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            etx.a.b
         )
      );
      qp.a($$0, "bastion/bridge/rampart_plates", new etx($$7, ImmutableList.of(Pair.of(etv.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), etx.a.b));
      qp.a(
         $$0,
         "bastion/bridge/connectors",
         new etx(
            $$7,
            ImmutableList.of(
               Pair.of(etv.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(etv.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            etx.a.b
         )
      );
   }
}
