import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qa {
   public static void a(qh<ers> $$0) {
      jf<eui> $$1 = $$0.a(mg.ba);
      je<eui> $$2 = $$1.b(qp.y);
      je<eui> $$3 = $$1.b(qp.w);
      je<eui> $$4 = $$1.b(qp.z);
      je<eui> $$5 = $$1.b(qp.x);
      jf<ers> $$6 = $$0.a(mg.bd);
      je<ers> $$7 = $$6.b(qo.a);
      qo.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ers(
            $$7,
            ImmutableList.of(
               Pair.of(erq.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(erq.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ers.a.b
         )
      );
      qo.a($$0, "bastion/bridge/bridge_pieces", new ers($$7, ImmutableList.of(Pair.of(erq.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ers.a.b));
      qo.a(
         $$0,
         "bastion/bridge/legs",
         new ers($$7, ImmutableList.of(Pair.of(erq.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(erq.b("bastion/bridge/legs/leg_1", $$3), 1)), ers.a.b)
      );
      qo.a(
         $$0,
         "bastion/bridge/walls",
         new ers(
            $$7,
            ImmutableList.of(Pair.of(erq.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(erq.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ers.a.b
         )
      );
      qo.a(
         $$0,
         "bastion/bridge/ramparts",
         new ers(
            $$7,
            ImmutableList.of(Pair.of(erq.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(erq.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ers.a.b
         )
      );
      qo.a($$0, "bastion/bridge/rampart_plates", new ers($$7, ImmutableList.of(Pair.of(erq.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ers.a.b));
      qo.a(
         $$0,
         "bastion/bridge/connectors",
         new ers(
            $$7,
            ImmutableList.of(
               Pair.of(erq.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(erq.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ers.a.b
         )
      );
   }
}
