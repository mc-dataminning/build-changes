import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static void a(rc<ejo> $$0) {
      jj<emd> $$1 = $$0.a(lq.aK);
      ji<emd> $$2 = $$1.b(rk.y);
      ji<emd> $$3 = $$1.b(rk.w);
      ji<emd> $$4 = $$1.b(rk.z);
      ji<emd> $$5 = $$1.b(rk.x);
      jj<ejo> $$6 = $$0.a(lq.aM);
      ji<ejo> $$7 = $$6.b(rj.a);
      rj.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ejo(
            $$7,
            ImmutableList.of(
               Pair.of(ejm.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ejm.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ejo.a.b
         )
      );
      rj.a($$0, "bastion/bridge/bridge_pieces", new ejo($$7, ImmutableList.of(Pair.of(ejm.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ejo.a.b));
      rj.a(
         $$0,
         "bastion/bridge/legs",
         new ejo($$7, ImmutableList.of(Pair.of(ejm.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ejm.b("bastion/bridge/legs/leg_1", $$3), 1)), ejo.a.b)
      );
      rj.a(
         $$0,
         "bastion/bridge/walls",
         new ejo(
            $$7,
            ImmutableList.of(Pair.of(ejm.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ejm.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ejo.a.b
         )
      );
      rj.a(
         $$0,
         "bastion/bridge/ramparts",
         new ejo(
            $$7,
            ImmutableList.of(Pair.of(ejm.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ejm.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ejo.a.b
         )
      );
      rj.a($$0, "bastion/bridge/rampart_plates", new ejo($$7, ImmutableList.of(Pair.of(ejm.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ejo.a.b));
      rj.a(
         $$0,
         "bastion/bridge/connectors",
         new ejo(
            $$7,
            ImmutableList.of(
               Pair.of(ejm.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ejm.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ejo.a.b
         )
      );
   }
}
