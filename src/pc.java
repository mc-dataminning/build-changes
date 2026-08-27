import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pc {
   public static void a(pj<edp> $$0) {
      im<ege> $$1 = $$0.a(ki.aF);
      il<ege> $$2 = $$1.b(pr.y);
      il<ege> $$3 = $$1.b(pr.w);
      il<ege> $$4 = $$1.b(pr.z);
      il<ege> $$5 = $$1.b(pr.x);
      im<edp> $$6 = $$0.a(ki.aH);
      il<edp> $$7 = $$6.b(pq.a);
      pq.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new edp(
            $$7,
            ImmutableList.of(
               Pair.of(edn.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(edn.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            edp.a.b
         )
      );
      pq.a($$0, "bastion/bridge/bridge_pieces", new edp($$7, ImmutableList.of(Pair.of(edn.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), edp.a.b));
      pq.a(
         $$0,
         "bastion/bridge/legs",
         new edp($$7, ImmutableList.of(Pair.of(edn.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(edn.b("bastion/bridge/legs/leg_1", $$3), 1)), edp.a.b)
      );
      pq.a(
         $$0,
         "bastion/bridge/walls",
         new edp(
            $$7,
            ImmutableList.of(Pair.of(edn.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(edn.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            edp.a.b
         )
      );
      pq.a(
         $$0,
         "bastion/bridge/ramparts",
         new edp(
            $$7,
            ImmutableList.of(Pair.of(edn.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(edn.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            edp.a.b
         )
      );
      pq.a($$0, "bastion/bridge/rampart_plates", new edp($$7, ImmutableList.of(Pair.of(edn.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), edp.a.b));
      pq.a(
         $$0,
         "bastion/bridge/connectors",
         new edp(
            $$7,
            ImmutableList.of(
               Pair.of(edn.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(edn.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            edp.a.b
         )
      );
   }
}
