import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static void a(rc<ejv> $$0) {
      jj<emk> $$1 = $$0.a(lq.aK);
      ji<emk> $$2 = $$1.b(rk.y);
      ji<emk> $$3 = $$1.b(rk.w);
      ji<emk> $$4 = $$1.b(rk.z);
      ji<emk> $$5 = $$1.b(rk.x);
      jj<ejv> $$6 = $$0.a(lq.aM);
      ji<ejv> $$7 = $$6.b(rj.a);
      rj.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ejv(
            $$7,
            ImmutableList.of(
               Pair.of(ejt.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ejt.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ejv.a.b
         )
      );
      rj.a($$0, "bastion/bridge/bridge_pieces", new ejv($$7, ImmutableList.of(Pair.of(ejt.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ejv.a.b));
      rj.a(
         $$0,
         "bastion/bridge/legs",
         new ejv($$7, ImmutableList.of(Pair.of(ejt.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ejt.b("bastion/bridge/legs/leg_1", $$3), 1)), ejv.a.b)
      );
      rj.a(
         $$0,
         "bastion/bridge/walls",
         new ejv(
            $$7,
            ImmutableList.of(Pair.of(ejt.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ejt.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ejv.a.b
         )
      );
      rj.a(
         $$0,
         "bastion/bridge/ramparts",
         new ejv(
            $$7,
            ImmutableList.of(Pair.of(ejt.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ejt.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ejv.a.b
         )
      );
      rj.a($$0, "bastion/bridge/rampart_plates", new ejv($$7, ImmutableList.of(Pair.of(ejt.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ejv.a.b));
      rj.a(
         $$0,
         "bastion/bridge/connectors",
         new ejv(
            $$7,
            ImmutableList.of(
               Pair.of(ejt.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ejt.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ejv.a.b
         )
      );
   }
}
