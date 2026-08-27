import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class oo {
   public static void a(ov<dyq> $$0) {
      ic<ebf> $$1 = $$0.a(jz.aC);
      ib<ebf> $$2 = $$1.b(pd.y);
      ib<ebf> $$3 = $$1.b(pd.w);
      ib<ebf> $$4 = $$1.b(pd.z);
      ib<ebf> $$5 = $$1.b(pd.x);
      ic<dyq> $$6 = $$0.a(jz.aE);
      ib<dyq> $$7 = $$6.b(pc.a);
      pc.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dyq(
            $$7,
            ImmutableList.of(
               Pair.of(dyo.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dyo.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dyq.a.b
         )
      );
      pc.a($$0, "bastion/bridge/bridge_pieces", new dyq($$7, ImmutableList.of(Pair.of(dyo.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dyq.a.b));
      pc.a(
         $$0,
         "bastion/bridge/legs",
         new dyq($$7, ImmutableList.of(Pair.of(dyo.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dyo.b("bastion/bridge/legs/leg_1", $$3), 1)), dyq.a.b)
      );
      pc.a(
         $$0,
         "bastion/bridge/walls",
         new dyq(
            $$7,
            ImmutableList.of(Pair.of(dyo.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dyo.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dyq.a.b
         )
      );
      pc.a(
         $$0,
         "bastion/bridge/ramparts",
         new dyq(
            $$7,
            ImmutableList.of(Pair.of(dyo.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dyo.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dyq.a.b
         )
      );
      pc.a($$0, "bastion/bridge/rampart_plates", new dyq($$7, ImmutableList.of(Pair.of(dyo.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dyq.a.b));
      pc.a(
         $$0,
         "bastion/bridge/connectors",
         new dyq(
            $$7,
            ImmutableList.of(
               Pair.of(dyo.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dyo.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dyq.a.b
         )
      );
   }
}
