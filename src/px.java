import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class px {
   public static void a(qe<eou> $$0) {
      js<erk> $$1 = $$0.a(mc.aV);
      jr<erk> $$2 = $$1.b(qm.y);
      jr<erk> $$3 = $$1.b(qm.w);
      jr<erk> $$4 = $$1.b(qm.z);
      jr<erk> $$5 = $$1.b(qm.x);
      js<eou> $$6 = $$0.a(mc.aX);
      jr<eou> $$7 = $$6.b(ql.a);
      ql.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eou(
            $$7,
            ImmutableList.of(
               Pair.of(eos.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eos.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eou.a.b
         )
      );
      ql.a($$0, "bastion/bridge/bridge_pieces", new eou($$7, ImmutableList.of(Pair.of(eos.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eou.a.b));
      ql.a(
         $$0,
         "bastion/bridge/legs",
         new eou($$7, ImmutableList.of(Pair.of(eos.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eos.b("bastion/bridge/legs/leg_1", $$3), 1)), eou.a.b)
      );
      ql.a(
         $$0,
         "bastion/bridge/walls",
         new eou(
            $$7,
            ImmutableList.of(Pair.of(eos.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eos.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eou.a.b
         )
      );
      ql.a(
         $$0,
         "bastion/bridge/ramparts",
         new eou(
            $$7,
            ImmutableList.of(Pair.of(eos.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eos.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eou.a.b
         )
      );
      ql.a($$0, "bastion/bridge/rampart_plates", new eou($$7, ImmutableList.of(Pair.of(eos.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eou.a.b));
      ql.a(
         $$0,
         "bastion/bridge/connectors",
         new eou(
            $$7,
            ImmutableList.of(
               Pair.of(eos.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eos.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eou.a.b
         )
      );
   }
}
