import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static void a(rc<eju> $$0) {
      jj<emj> $$1 = $$0.a(lq.aK);
      ji<emj> $$2 = $$1.b(rk.y);
      ji<emj> $$3 = $$1.b(rk.w);
      ji<emj> $$4 = $$1.b(rk.z);
      ji<emj> $$5 = $$1.b(rk.x);
      jj<eju> $$6 = $$0.a(lq.aM);
      ji<eju> $$7 = $$6.b(rj.a);
      rj.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eju(
            $$7,
            ImmutableList.of(
               Pair.of(ejs.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ejs.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eju.a.b
         )
      );
      rj.a($$0, "bastion/bridge/bridge_pieces", new eju($$7, ImmutableList.of(Pair.of(ejs.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eju.a.b));
      rj.a(
         $$0,
         "bastion/bridge/legs",
         new eju($$7, ImmutableList.of(Pair.of(ejs.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ejs.b("bastion/bridge/legs/leg_1", $$3), 1)), eju.a.b)
      );
      rj.a(
         $$0,
         "bastion/bridge/walls",
         new eju(
            $$7,
            ImmutableList.of(Pair.of(ejs.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ejs.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eju.a.b
         )
      );
      rj.a(
         $$0,
         "bastion/bridge/ramparts",
         new eju(
            $$7,
            ImmutableList.of(Pair.of(ejs.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ejs.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eju.a.b
         )
      );
      rj.a($$0, "bastion/bridge/rampart_plates", new eju($$7, ImmutableList.of(Pair.of(ejs.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eju.a.b));
      rj.a(
         $$0,
         "bastion/bridge/connectors",
         new eju(
            $$7,
            ImmutableList.of(
               Pair.of(ejs.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ejs.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eju.a.b
         )
      );
   }
}
