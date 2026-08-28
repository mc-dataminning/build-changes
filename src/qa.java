import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qa {
   public static void a(qh<etl> $$0) {
      jg<ewb> $$1 = $$0.a(mh.bc);
      jf<ewb> $$2 = $$1.b(qp.y);
      jf<ewb> $$3 = $$1.b(qp.w);
      jf<ewb> $$4 = $$1.b(qp.z);
      jf<ewb> $$5 = $$1.b(qp.x);
      jg<etl> $$6 = $$0.a(mh.bf);
      jf<etl> $$7 = $$6.b(qo.a);
      qo.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new etl(
            $$7,
            ImmutableList.of(
               Pair.of(etj.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(etj.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            etl.a.b
         )
      );
      qo.a($$0, "bastion/bridge/bridge_pieces", new etl($$7, ImmutableList.of(Pair.of(etj.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), etl.a.b));
      qo.a(
         $$0,
         "bastion/bridge/legs",
         new etl($$7, ImmutableList.of(Pair.of(etj.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(etj.b("bastion/bridge/legs/leg_1", $$3), 1)), etl.a.b)
      );
      qo.a(
         $$0,
         "bastion/bridge/walls",
         new etl(
            $$7,
            ImmutableList.of(Pair.of(etj.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(etj.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            etl.a.b
         )
      );
      qo.a(
         $$0,
         "bastion/bridge/ramparts",
         new etl(
            $$7,
            ImmutableList.of(Pair.of(etj.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(etj.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            etl.a.b
         )
      );
      qo.a($$0, "bastion/bridge/rampart_plates", new etl($$7, ImmutableList.of(Pair.of(etj.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), etl.a.b));
      qo.a(
         $$0,
         "bastion/bridge/connectors",
         new etl(
            $$7,
            ImmutableList.of(
               Pair.of(etj.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(etj.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            etl.a.b
         )
      );
   }
}
