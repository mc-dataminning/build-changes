import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nk {
   public static void a(nr<dwr> $$0) {
      hf<dyz> $$1 = $$0.a(jc.aA);
      he<dyz> $$2 = $$1.b(nz.y);
      he<dyz> $$3 = $$1.b(nz.w);
      he<dyz> $$4 = $$1.b(nz.z);
      he<dyz> $$5 = $$1.b(nz.x);
      hf<dwr> $$6 = $$0.a(jc.aC);
      he<dwr> $$7 = $$6.b(ny.a);
      ny.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dwr(
            $$7,
            ImmutableList.of(
               Pair.of(dwp.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dwp.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dwr.a.b
         )
      );
      ny.a($$0, "bastion/bridge/bridge_pieces", new dwr($$7, ImmutableList.of(Pair.of(dwp.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dwr.a.b));
      ny.a(
         $$0,
         "bastion/bridge/legs",
         new dwr($$7, ImmutableList.of(Pair.of(dwp.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dwp.b("bastion/bridge/legs/leg_1", $$3), 1)), dwr.a.b)
      );
      ny.a(
         $$0,
         "bastion/bridge/walls",
         new dwr(
            $$7,
            ImmutableList.of(Pair.of(dwp.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dwp.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dwr.a.b
         )
      );
      ny.a(
         $$0,
         "bastion/bridge/ramparts",
         new dwr(
            $$7,
            ImmutableList.of(Pair.of(dwp.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dwp.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dwr.a.b
         )
      );
      ny.a($$0, "bastion/bridge/rampart_plates", new dwr($$7, ImmutableList.of(Pair.of(dwp.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dwr.a.b));
      ny.a(
         $$0,
         "bastion/bridge/connectors",
         new dwr(
            $$7,
            ImmutableList.of(
               Pair.of(dwp.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dwp.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dwr.a.b
         )
      );
   }
}
