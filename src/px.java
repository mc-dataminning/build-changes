import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class px {
   public static void a(qe<eow> $$0) {
      js<erm> $$1 = $$0.a(mc.aV);
      jr<erm> $$2 = $$1.b(qm.y);
      jr<erm> $$3 = $$1.b(qm.w);
      jr<erm> $$4 = $$1.b(qm.z);
      jr<erm> $$5 = $$1.b(qm.x);
      js<eow> $$6 = $$0.a(mc.aX);
      jr<eow> $$7 = $$6.b(ql.a);
      ql.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eow(
            $$7,
            ImmutableList.of(
               Pair.of(eou.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eou.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eow.a.b
         )
      );
      ql.a($$0, "bastion/bridge/bridge_pieces", new eow($$7, ImmutableList.of(Pair.of(eou.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eow.a.b));
      ql.a(
         $$0,
         "bastion/bridge/legs",
         new eow($$7, ImmutableList.of(Pair.of(eou.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eou.b("bastion/bridge/legs/leg_1", $$3), 1)), eow.a.b)
      );
      ql.a(
         $$0,
         "bastion/bridge/walls",
         new eow(
            $$7,
            ImmutableList.of(Pair.of(eou.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eou.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eow.a.b
         )
      );
      ql.a(
         $$0,
         "bastion/bridge/ramparts",
         new eow(
            $$7,
            ImmutableList.of(Pair.of(eou.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eou.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eow.a.b
         )
      );
      ql.a($$0, "bastion/bridge/rampart_plates", new eow($$7, ImmutableList.of(Pair.of(eou.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eow.a.b));
      ql.a(
         $$0,
         "bastion/bridge/connectors",
         new eow(
            $$7,
            ImmutableList.of(
               Pair.of(eou.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eou.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eow.a.b
         )
      );
   }
}
