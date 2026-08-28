import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qs {
   public static void a(qz<ens> $$0) {
      jr<eqi> $$1 = $$0.a(ma.aT);
      jq<eqi> $$2 = $$1.b(rh.y);
      jq<eqi> $$3 = $$1.b(rh.w);
      jq<eqi> $$4 = $$1.b(rh.z);
      jq<eqi> $$5 = $$1.b(rh.x);
      jr<ens> $$6 = $$0.a(ma.aV);
      jq<ens> $$7 = $$6.b(rg.a);
      rg.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ens(
            $$7,
            ImmutableList.of(
               Pair.of(enq.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(enq.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ens.a.b
         )
      );
      rg.a($$0, "bastion/bridge/bridge_pieces", new ens($$7, ImmutableList.of(Pair.of(enq.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ens.a.b));
      rg.a(
         $$0,
         "bastion/bridge/legs",
         new ens($$7, ImmutableList.of(Pair.of(enq.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(enq.b("bastion/bridge/legs/leg_1", $$3), 1)), ens.a.b)
      );
      rg.a(
         $$0,
         "bastion/bridge/walls",
         new ens(
            $$7,
            ImmutableList.of(Pair.of(enq.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(enq.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ens.a.b
         )
      );
      rg.a(
         $$0,
         "bastion/bridge/ramparts",
         new ens(
            $$7,
            ImmutableList.of(Pair.of(enq.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(enq.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ens.a.b
         )
      );
      rg.a($$0, "bastion/bridge/rampart_plates", new ens($$7, ImmutableList.of(Pair.of(enq.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ens.a.b));
      rg.a(
         $$0,
         "bastion/bridge/connectors",
         new ens(
            $$7,
            ImmutableList.of(
               Pair.of(enq.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(enq.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ens.a.b
         )
      );
   }
}
