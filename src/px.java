import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class px {
   public static void a(qe<eox> $$0) {
      js<ern> $$1 = $$0.a(mc.aV);
      jr<ern> $$2 = $$1.b(qm.y);
      jr<ern> $$3 = $$1.b(qm.w);
      jr<ern> $$4 = $$1.b(qm.z);
      jr<ern> $$5 = $$1.b(qm.x);
      js<eox> $$6 = $$0.a(mc.aX);
      jr<eox> $$7 = $$6.b(ql.a);
      ql.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eox(
            $$7,
            ImmutableList.of(
               Pair.of(eov.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eov.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eox.a.b
         )
      );
      ql.a($$0, "bastion/bridge/bridge_pieces", new eox($$7, ImmutableList.of(Pair.of(eov.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eox.a.b));
      ql.a(
         $$0,
         "bastion/bridge/legs",
         new eox($$7, ImmutableList.of(Pair.of(eov.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eov.b("bastion/bridge/legs/leg_1", $$3), 1)), eox.a.b)
      );
      ql.a(
         $$0,
         "bastion/bridge/walls",
         new eox(
            $$7,
            ImmutableList.of(Pair.of(eov.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eov.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eox.a.b
         )
      );
      ql.a(
         $$0,
         "bastion/bridge/ramparts",
         new eox(
            $$7,
            ImmutableList.of(Pair.of(eov.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eov.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eox.a.b
         )
      );
      ql.a($$0, "bastion/bridge/rampart_plates", new eox($$7, ImmutableList.of(Pair.of(eov.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eox.a.b));
      ql.a(
         $$0,
         "bastion/bridge/connectors",
         new eox(
            $$7,
            ImmutableList.of(
               Pair.of(eov.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eov.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eox.a.b
         )
      );
   }
}
