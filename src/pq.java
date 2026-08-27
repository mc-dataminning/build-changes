import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pq {
   public static void a(px<egq> $$0) {
      im<ejf> $$1 = $$0.a(ks.aG);
      il<ejf> $$2 = $$1.b(qf.y);
      il<ejf> $$3 = $$1.b(qf.w);
      il<ejf> $$4 = $$1.b(qf.z);
      il<ejf> $$5 = $$1.b(qf.x);
      im<egq> $$6 = $$0.a(ks.aI);
      il<egq> $$7 = $$6.b(qe.a);
      qe.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new egq(
            $$7,
            ImmutableList.of(
               Pair.of(ego.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ego.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            egq.a.b
         )
      );
      qe.a($$0, "bastion/bridge/bridge_pieces", new egq($$7, ImmutableList.of(Pair.of(ego.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), egq.a.b));
      qe.a(
         $$0,
         "bastion/bridge/legs",
         new egq($$7, ImmutableList.of(Pair.of(ego.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ego.b("bastion/bridge/legs/leg_1", $$3), 1)), egq.a.b)
      );
      qe.a(
         $$0,
         "bastion/bridge/walls",
         new egq(
            $$7,
            ImmutableList.of(Pair.of(ego.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ego.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            egq.a.b
         )
      );
      qe.a(
         $$0,
         "bastion/bridge/ramparts",
         new egq(
            $$7,
            ImmutableList.of(Pair.of(ego.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ego.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            egq.a.b
         )
      );
      qe.a($$0, "bastion/bridge/rampart_plates", new egq($$7, ImmutableList.of(Pair.of(ego.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), egq.a.b));
      qe.a(
         $$0,
         "bastion/bridge/connectors",
         new egq(
            $$7,
            ImmutableList.of(
               Pair.of(ego.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ego.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            egq.a.b
         )
      );
   }
}
