import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ox {
   public static void a(pe<eao> $$0) {
      ii<edd> $$1 = $$0.a(ke.aE);
      ih<edd> $$2 = $$1.b(pm.y);
      ih<edd> $$3 = $$1.b(pm.w);
      ih<edd> $$4 = $$1.b(pm.z);
      ih<edd> $$5 = $$1.b(pm.x);
      ii<eao> $$6 = $$0.a(ke.aG);
      ih<eao> $$7 = $$6.b(pl.a);
      pl.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eao(
            $$7,
            ImmutableList.of(
               Pair.of(eam.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eam.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eao.a.b
         )
      );
      pl.a($$0, "bastion/bridge/bridge_pieces", new eao($$7, ImmutableList.of(Pair.of(eam.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eao.a.b));
      pl.a(
         $$0,
         "bastion/bridge/legs",
         new eao($$7, ImmutableList.of(Pair.of(eam.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eam.b("bastion/bridge/legs/leg_1", $$3), 1)), eao.a.b)
      );
      pl.a(
         $$0,
         "bastion/bridge/walls",
         new eao(
            $$7,
            ImmutableList.of(Pair.of(eam.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eam.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eao.a.b
         )
      );
      pl.a(
         $$0,
         "bastion/bridge/ramparts",
         new eao(
            $$7,
            ImmutableList.of(Pair.of(eam.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eam.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eao.a.b
         )
      );
      pl.a($$0, "bastion/bridge/rampart_plates", new eao($$7, ImmutableList.of(Pair.of(eam.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eao.a.b));
      pl.a(
         $$0,
         "bastion/bridge/connectors",
         new eao(
            $$7,
            ImmutableList.of(
               Pair.of(eam.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eam.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eao.a.b
         )
      );
   }
}
