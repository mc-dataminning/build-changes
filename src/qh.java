import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qh {
   public static void a(qo<eis> $$0) {
      iy<elh> $$1 = $$0.a(lf.aK);
      ix<elh> $$2 = $$1.b(qw.y);
      ix<elh> $$3 = $$1.b(qw.w);
      ix<elh> $$4 = $$1.b(qw.z);
      ix<elh> $$5 = $$1.b(qw.x);
      iy<eis> $$6 = $$0.a(lf.aM);
      ix<eis> $$7 = $$6.b(qv.a);
      qv.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eis(
            $$7,
            ImmutableList.of(
               Pair.of(eiq.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eiq.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eis.a.b
         )
      );
      qv.a($$0, "bastion/bridge/bridge_pieces", new eis($$7, ImmutableList.of(Pair.of(eiq.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eis.a.b));
      qv.a(
         $$0,
         "bastion/bridge/legs",
         new eis($$7, ImmutableList.of(Pair.of(eiq.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eiq.b("bastion/bridge/legs/leg_1", $$3), 1)), eis.a.b)
      );
      qv.a(
         $$0,
         "bastion/bridge/walls",
         new eis(
            $$7,
            ImmutableList.of(Pair.of(eiq.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eiq.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eis.a.b
         )
      );
      qv.a(
         $$0,
         "bastion/bridge/ramparts",
         new eis(
            $$7,
            ImmutableList.of(Pair.of(eiq.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eiq.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eis.a.b
         )
      );
      qv.a($$0, "bastion/bridge/rampart_plates", new eis($$7, ImmutableList.of(Pair.of(eiq.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eis.a.b));
      qv.a(
         $$0,
         "bastion/bridge/connectors",
         new eis(
            $$7,
            ImmutableList.of(
               Pair.of(eiq.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eiq.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eis.a.b
         )
      );
   }
}
