import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static void a(rc<ejs> $$0) {
      jj<emh> $$1 = $$0.a(lq.aK);
      ji<emh> $$2 = $$1.b(rk.y);
      ji<emh> $$3 = $$1.b(rk.w);
      ji<emh> $$4 = $$1.b(rk.z);
      ji<emh> $$5 = $$1.b(rk.x);
      jj<ejs> $$6 = $$0.a(lq.aM);
      ji<ejs> $$7 = $$6.b(rj.a);
      rj.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ejs(
            $$7,
            ImmutableList.of(
               Pair.of(ejq.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ejq.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ejs.a.b
         )
      );
      rj.a($$0, "bastion/bridge/bridge_pieces", new ejs($$7, ImmutableList.of(Pair.of(ejq.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ejs.a.b));
      rj.a(
         $$0,
         "bastion/bridge/legs",
         new ejs($$7, ImmutableList.of(Pair.of(ejq.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ejq.b("bastion/bridge/legs/leg_1", $$3), 1)), ejs.a.b)
      );
      rj.a(
         $$0,
         "bastion/bridge/walls",
         new ejs(
            $$7,
            ImmutableList.of(Pair.of(ejq.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ejq.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ejs.a.b
         )
      );
      rj.a(
         $$0,
         "bastion/bridge/ramparts",
         new ejs(
            $$7,
            ImmutableList.of(Pair.of(ejq.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ejq.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ejs.a.b
         )
      );
      rj.a($$0, "bastion/bridge/rampart_plates", new ejs($$7, ImmutableList.of(Pair.of(ejq.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ejs.a.b));
      rj.a(
         $$0,
         "bastion/bridge/connectors",
         new ejs(
            $$7,
            ImmutableList.of(
               Pair.of(ejq.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ejq.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ejs.a.b
         )
      );
   }
}
