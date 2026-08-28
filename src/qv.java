import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static void a(rc<ejt> $$0) {
      jj<emi> $$1 = $$0.a(lq.aK);
      ji<emi> $$2 = $$1.b(rk.y);
      ji<emi> $$3 = $$1.b(rk.w);
      ji<emi> $$4 = $$1.b(rk.z);
      ji<emi> $$5 = $$1.b(rk.x);
      jj<ejt> $$6 = $$0.a(lq.aM);
      ji<ejt> $$7 = $$6.b(rj.a);
      rj.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ejt(
            $$7,
            ImmutableList.of(
               Pair.of(ejr.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ejr.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ejt.a.b
         )
      );
      rj.a($$0, "bastion/bridge/bridge_pieces", new ejt($$7, ImmutableList.of(Pair.of(ejr.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ejt.a.b));
      rj.a(
         $$0,
         "bastion/bridge/legs",
         new ejt($$7, ImmutableList.of(Pair.of(ejr.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ejr.b("bastion/bridge/legs/leg_1", $$3), 1)), ejt.a.b)
      );
      rj.a(
         $$0,
         "bastion/bridge/walls",
         new ejt(
            $$7,
            ImmutableList.of(Pair.of(ejr.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ejr.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ejt.a.b
         )
      );
      rj.a(
         $$0,
         "bastion/bridge/ramparts",
         new ejt(
            $$7,
            ImmutableList.of(Pair.of(ejr.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ejr.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ejt.a.b
         )
      );
      rj.a($$0, "bastion/bridge/rampart_plates", new ejt($$7, ImmutableList.of(Pair.of(ejr.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ejt.a.b));
      rj.a(
         $$0,
         "bastion/bridge/connectors",
         new ejt(
            $$7,
            ImmutableList.of(
               Pair.of(ejr.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ejr.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ejt.a.b
         )
      );
   }
}
