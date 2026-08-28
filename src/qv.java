import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static void a(rc<ejr> $$0) {
      jj<emg> $$1 = $$0.a(lq.aK);
      ji<emg> $$2 = $$1.b(rk.y);
      ji<emg> $$3 = $$1.b(rk.w);
      ji<emg> $$4 = $$1.b(rk.z);
      ji<emg> $$5 = $$1.b(rk.x);
      jj<ejr> $$6 = $$0.a(lq.aM);
      ji<ejr> $$7 = $$6.b(rj.a);
      rj.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ejr(
            $$7,
            ImmutableList.of(
               Pair.of(ejp.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ejp.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ejr.a.b
         )
      );
      rj.a($$0, "bastion/bridge/bridge_pieces", new ejr($$7, ImmutableList.of(Pair.of(ejp.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ejr.a.b));
      rj.a(
         $$0,
         "bastion/bridge/legs",
         new ejr($$7, ImmutableList.of(Pair.of(ejp.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ejp.b("bastion/bridge/legs/leg_1", $$3), 1)), ejr.a.b)
      );
      rj.a(
         $$0,
         "bastion/bridge/walls",
         new ejr(
            $$7,
            ImmutableList.of(Pair.of(ejp.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ejp.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ejr.a.b
         )
      );
      rj.a(
         $$0,
         "bastion/bridge/ramparts",
         new ejr(
            $$7,
            ImmutableList.of(Pair.of(ejp.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ejp.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ejr.a.b
         )
      );
      rj.a($$0, "bastion/bridge/rampart_plates", new ejr($$7, ImmutableList.of(Pair.of(ejp.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ejr.a.b));
      rj.a(
         $$0,
         "bastion/bridge/connectors",
         new ejr(
            $$7,
            ImmutableList.of(
               Pair.of(ejp.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ejp.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ejr.a.b
         )
      );
   }
}
