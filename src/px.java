import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class px {
   public static void a(qe<eov> $$0) {
      js<erl> $$1 = $$0.a(mc.aV);
      jr<erl> $$2 = $$1.b(qm.y);
      jr<erl> $$3 = $$1.b(qm.w);
      jr<erl> $$4 = $$1.b(qm.z);
      jr<erl> $$5 = $$1.b(qm.x);
      js<eov> $$6 = $$0.a(mc.aX);
      jr<eov> $$7 = $$6.b(ql.a);
      ql.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eov(
            $$7,
            ImmutableList.of(
               Pair.of(eot.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eot.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eov.a.b
         )
      );
      ql.a($$0, "bastion/bridge/bridge_pieces", new eov($$7, ImmutableList.of(Pair.of(eot.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eov.a.b));
      ql.a(
         $$0,
         "bastion/bridge/legs",
         new eov($$7, ImmutableList.of(Pair.of(eot.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eot.b("bastion/bridge/legs/leg_1", $$3), 1)), eov.a.b)
      );
      ql.a(
         $$0,
         "bastion/bridge/walls",
         new eov(
            $$7,
            ImmutableList.of(Pair.of(eot.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eot.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eov.a.b
         )
      );
      ql.a(
         $$0,
         "bastion/bridge/ramparts",
         new eov(
            $$7,
            ImmutableList.of(Pair.of(eot.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eot.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eov.a.b
         )
      );
      ql.a($$0, "bastion/bridge/rampart_plates", new eov($$7, ImmutableList.of(Pair.of(eot.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eov.a.b));
      ql.a(
         $$0,
         "bastion/bridge/connectors",
         new eov(
            $$7,
            ImmutableList.of(
               Pair.of(eot.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eot.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eov.a.b
         )
      );
   }
}
