import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ox {
   public static void a(pe<eap> $$0) {
      ii<ede> $$1 = $$0.a(ke.aE);
      ih<ede> $$2 = $$1.b(pm.y);
      ih<ede> $$3 = $$1.b(pm.w);
      ih<ede> $$4 = $$1.b(pm.z);
      ih<ede> $$5 = $$1.b(pm.x);
      ii<eap> $$6 = $$0.a(ke.aG);
      ih<eap> $$7 = $$6.b(pl.a);
      pl.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eap(
            $$7,
            ImmutableList.of(
               Pair.of(ean.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ean.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eap.a.b
         )
      );
      pl.a($$0, "bastion/bridge/bridge_pieces", new eap($$7, ImmutableList.of(Pair.of(ean.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eap.a.b));
      pl.a(
         $$0,
         "bastion/bridge/legs",
         new eap($$7, ImmutableList.of(Pair.of(ean.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ean.b("bastion/bridge/legs/leg_1", $$3), 1)), eap.a.b)
      );
      pl.a(
         $$0,
         "bastion/bridge/walls",
         new eap(
            $$7,
            ImmutableList.of(Pair.of(ean.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ean.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eap.a.b
         )
      );
      pl.a(
         $$0,
         "bastion/bridge/ramparts",
         new eap(
            $$7,
            ImmutableList.of(Pair.of(ean.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ean.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eap.a.b
         )
      );
      pl.a($$0, "bastion/bridge/rampart_plates", new eap($$7, ImmutableList.of(Pair.of(ean.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eap.a.b));
      pl.a(
         $$0,
         "bastion/bridge/connectors",
         new eap(
            $$7,
            ImmutableList.of(
               Pair.of(ean.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ean.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eap.a.b
         )
      );
   }
}
