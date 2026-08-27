import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ot {
   public static void a(pa<dzx> $$0) {
      ig<ecm> $$1 = $$0.a(kc.aD);
      ie<ecm> $$2 = $$1.b(pi.y);
      ie<ecm> $$3 = $$1.b(pi.w);
      ie<ecm> $$4 = $$1.b(pi.z);
      ie<ecm> $$5 = $$1.b(pi.x);
      ig<dzx> $$6 = $$0.a(kc.aF);
      ie<dzx> $$7 = $$6.b(ph.a);
      ph.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dzx(
            $$7,
            ImmutableList.of(
               Pair.of(dzv.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dzv.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dzx.a.b
         )
      );
      ph.a($$0, "bastion/bridge/bridge_pieces", new dzx($$7, ImmutableList.of(Pair.of(dzv.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dzx.a.b));
      ph.a(
         $$0,
         "bastion/bridge/legs",
         new dzx($$7, ImmutableList.of(Pair.of(dzv.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dzv.b("bastion/bridge/legs/leg_1", $$3), 1)), dzx.a.b)
      );
      ph.a(
         $$0,
         "bastion/bridge/walls",
         new dzx(
            $$7,
            ImmutableList.of(Pair.of(dzv.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dzv.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dzx.a.b
         )
      );
      ph.a(
         $$0,
         "bastion/bridge/ramparts",
         new dzx(
            $$7,
            ImmutableList.of(Pair.of(dzv.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dzv.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dzx.a.b
         )
      );
      ph.a($$0, "bastion/bridge/rampart_plates", new dzx($$7, ImmutableList.of(Pair.of(dzv.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dzx.a.b));
      ph.a(
         $$0,
         "bastion/bridge/connectors",
         new dzx(
            $$7,
            ImmutableList.of(
               Pair.of(dzv.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dzv.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dzx.a.b
         )
      );
   }
}
