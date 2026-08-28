import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qa {
   public static void a(qh<ess> $$0) {
      jg<evi> $$1 = $$0.a(mh.bc);
      jf<evi> $$2 = $$1.b(qp.y);
      jf<evi> $$3 = $$1.b(qp.w);
      jf<evi> $$4 = $$1.b(qp.z);
      jf<evi> $$5 = $$1.b(qp.x);
      jg<ess> $$6 = $$0.a(mh.bf);
      jf<ess> $$7 = $$6.b(qo.a);
      qo.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ess(
            $$7,
            ImmutableList.of(
               Pair.of(esq.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(esq.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ess.a.b
         )
      );
      qo.a($$0, "bastion/bridge/bridge_pieces", new ess($$7, ImmutableList.of(Pair.of(esq.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ess.a.b));
      qo.a(
         $$0,
         "bastion/bridge/legs",
         new ess($$7, ImmutableList.of(Pair.of(esq.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(esq.b("bastion/bridge/legs/leg_1", $$3), 1)), ess.a.b)
      );
      qo.a(
         $$0,
         "bastion/bridge/walls",
         new ess(
            $$7,
            ImmutableList.of(Pair.of(esq.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(esq.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ess.a.b
         )
      );
      qo.a(
         $$0,
         "bastion/bridge/ramparts",
         new ess(
            $$7,
            ImmutableList.of(Pair.of(esq.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(esq.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ess.a.b
         )
      );
      qo.a($$0, "bastion/bridge/rampart_plates", new ess($$7, ImmutableList.of(Pair.of(esq.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ess.a.b));
      qo.a(
         $$0,
         "bastion/bridge/connectors",
         new ess(
            $$7,
            ImmutableList.of(
               Pair.of(esq.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(esq.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ess.a.b
         )
      );
   }
}
