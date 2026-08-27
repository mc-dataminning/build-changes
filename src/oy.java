import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class oy {
   public static void a(pf<eax> $$0) {
      ii<edm> $$1 = $$0.a(ke.aE);
      ih<edm> $$2 = $$1.b(pn.y);
      ih<edm> $$3 = $$1.b(pn.w);
      ih<edm> $$4 = $$1.b(pn.z);
      ih<edm> $$5 = $$1.b(pn.x);
      ii<eax> $$6 = $$0.a(ke.aG);
      ih<eax> $$7 = $$6.b(pm.a);
      pm.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eax(
            $$7,
            ImmutableList.of(
               Pair.of(eav.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eav.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eax.a.b
         )
      );
      pm.a($$0, "bastion/bridge/bridge_pieces", new eax($$7, ImmutableList.of(Pair.of(eav.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eax.a.b));
      pm.a(
         $$0,
         "bastion/bridge/legs",
         new eax($$7, ImmutableList.of(Pair.of(eav.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eav.b("bastion/bridge/legs/leg_1", $$3), 1)), eax.a.b)
      );
      pm.a(
         $$0,
         "bastion/bridge/walls",
         new eax(
            $$7,
            ImmutableList.of(Pair.of(eav.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eav.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eax.a.b
         )
      );
      pm.a(
         $$0,
         "bastion/bridge/ramparts",
         new eax(
            $$7,
            ImmutableList.of(Pair.of(eav.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eav.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eax.a.b
         )
      );
      pm.a($$0, "bastion/bridge/rampart_plates", new eax($$7, ImmutableList.of(Pair.of(eav.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eax.a.b));
      pm.a(
         $$0,
         "bastion/bridge/connectors",
         new eax(
            $$7,
            ImmutableList.of(
               Pair.of(eav.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eav.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eax.a.b
         )
      );
   }
}
