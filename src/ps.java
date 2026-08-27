import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ps {
   public static void a(pz<egz> $$0) {
      io<ejo> $$1 = $$0.a(ku.aH);
      in<ejo> $$2 = $$1.b(qh.y);
      in<ejo> $$3 = $$1.b(qh.w);
      in<ejo> $$4 = $$1.b(qh.z);
      in<ejo> $$5 = $$1.b(qh.x);
      io<egz> $$6 = $$0.a(ku.aJ);
      in<egz> $$7 = $$6.b(qg.a);
      qg.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new egz(
            $$7,
            ImmutableList.of(
               Pair.of(egx.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(egx.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            egz.a.b
         )
      );
      qg.a($$0, "bastion/bridge/bridge_pieces", new egz($$7, ImmutableList.of(Pair.of(egx.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), egz.a.b));
      qg.a(
         $$0,
         "bastion/bridge/legs",
         new egz($$7, ImmutableList.of(Pair.of(egx.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(egx.b("bastion/bridge/legs/leg_1", $$3), 1)), egz.a.b)
      );
      qg.a(
         $$0,
         "bastion/bridge/walls",
         new egz(
            $$7,
            ImmutableList.of(Pair.of(egx.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(egx.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            egz.a.b
         )
      );
      qg.a(
         $$0,
         "bastion/bridge/ramparts",
         new egz(
            $$7,
            ImmutableList.of(Pair.of(egx.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(egx.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            egz.a.b
         )
      );
      qg.a($$0, "bastion/bridge/rampart_plates", new egz($$7, ImmutableList.of(Pair.of(egx.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), egz.a.b));
      qg.a(
         $$0,
         "bastion/bridge/connectors",
         new egz(
            $$7,
            ImmutableList.of(
               Pair.of(egx.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(egx.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            egz.a.b
         )
      );
   }
}
