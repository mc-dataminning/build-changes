import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qa {
   public static void a(qh<esl> $$0) {
      jf<evb> $$1 = $$0.a(mg.bc);
      je<evb> $$2 = $$1.b(qp.y);
      je<evb> $$3 = $$1.b(qp.w);
      je<evb> $$4 = $$1.b(qp.z);
      je<evb> $$5 = $$1.b(qp.x);
      jf<esl> $$6 = $$0.a(mg.bf);
      je<esl> $$7 = $$6.b(qo.a);
      qo.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new esl(
            $$7,
            ImmutableList.of(
               Pair.of(esj.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(esj.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            esl.a.b
         )
      );
      qo.a($$0, "bastion/bridge/bridge_pieces", new esl($$7, ImmutableList.of(Pair.of(esj.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), esl.a.b));
      qo.a(
         $$0,
         "bastion/bridge/legs",
         new esl($$7, ImmutableList.of(Pair.of(esj.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(esj.b("bastion/bridge/legs/leg_1", $$3), 1)), esl.a.b)
      );
      qo.a(
         $$0,
         "bastion/bridge/walls",
         new esl(
            $$7,
            ImmutableList.of(Pair.of(esj.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(esj.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            esl.a.b
         )
      );
      qo.a(
         $$0,
         "bastion/bridge/ramparts",
         new esl(
            $$7,
            ImmutableList.of(Pair.of(esj.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(esj.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            esl.a.b
         )
      );
      qo.a($$0, "bastion/bridge/rampart_plates", new esl($$7, ImmutableList.of(Pair.of(esj.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), esl.a.b));
      qo.a(
         $$0,
         "bastion/bridge/connectors",
         new esl(
            $$7,
            ImmutableList.of(
               Pair.of(esj.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(esj.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            esl.a.b
         )
      );
   }
}
