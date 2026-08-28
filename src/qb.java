import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qb {
   public static void a(qi<etn> $$0) {
      jh<ewd> $$1 = $$0.a(mi.bc);
      jg<ewd> $$2 = $$1.b(qq.y);
      jg<ewd> $$3 = $$1.b(qq.w);
      jg<ewd> $$4 = $$1.b(qq.z);
      jg<ewd> $$5 = $$1.b(qq.x);
      jh<etn> $$6 = $$0.a(mi.bf);
      jg<etn> $$7 = $$6.b(qp.a);
      qp.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new etn(
            $$7,
            ImmutableList.of(
               Pair.of(etl.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(etl.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            etn.a.b
         )
      );
      qp.a($$0, "bastion/bridge/bridge_pieces", new etn($$7, ImmutableList.of(Pair.of(etl.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), etn.a.b));
      qp.a(
         $$0,
         "bastion/bridge/legs",
         new etn($$7, ImmutableList.of(Pair.of(etl.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(etl.b("bastion/bridge/legs/leg_1", $$3), 1)), etn.a.b)
      );
      qp.a(
         $$0,
         "bastion/bridge/walls",
         new etn(
            $$7,
            ImmutableList.of(Pair.of(etl.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(etl.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            etn.a.b
         )
      );
      qp.a(
         $$0,
         "bastion/bridge/ramparts",
         new etn(
            $$7,
            ImmutableList.of(Pair.of(etl.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(etl.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            etn.a.b
         )
      );
      qp.a($$0, "bastion/bridge/rampart_plates", new etn($$7, ImmutableList.of(Pair.of(etl.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), etn.a.b));
      qp.a(
         $$0,
         "bastion/bridge/connectors",
         new etn(
            $$7,
            ImmutableList.of(
               Pair.of(etl.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(etl.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            etn.a.b
         )
      );
   }
}
