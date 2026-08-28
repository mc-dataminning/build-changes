import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qa {
   public static void a(qh<esd> $$0) {
      jf<eut> $$1 = $$0.a(mg.bb);
      je<eut> $$2 = $$1.b(qp.y);
      je<eut> $$3 = $$1.b(qp.w);
      je<eut> $$4 = $$1.b(qp.z);
      je<eut> $$5 = $$1.b(qp.x);
      jf<esd> $$6 = $$0.a(mg.be);
      je<esd> $$7 = $$6.b(qo.a);
      qo.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new esd(
            $$7,
            ImmutableList.of(
               Pair.of(esb.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(esb.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            esd.a.b
         )
      );
      qo.a($$0, "bastion/bridge/bridge_pieces", new esd($$7, ImmutableList.of(Pair.of(esb.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), esd.a.b));
      qo.a(
         $$0,
         "bastion/bridge/legs",
         new esd($$7, ImmutableList.of(Pair.of(esb.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(esb.b("bastion/bridge/legs/leg_1", $$3), 1)), esd.a.b)
      );
      qo.a(
         $$0,
         "bastion/bridge/walls",
         new esd(
            $$7,
            ImmutableList.of(Pair.of(esb.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(esb.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            esd.a.b
         )
      );
      qo.a(
         $$0,
         "bastion/bridge/ramparts",
         new esd(
            $$7,
            ImmutableList.of(Pair.of(esb.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(esb.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            esd.a.b
         )
      );
      qo.a($$0, "bastion/bridge/rampart_plates", new esd($$7, ImmutableList.of(Pair.of(esb.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), esd.a.b));
      qo.a(
         $$0,
         "bastion/bridge/connectors",
         new esd(
            $$7,
            ImmutableList.of(
               Pair.of(esb.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(esb.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            esd.a.b
         )
      );
   }
}
