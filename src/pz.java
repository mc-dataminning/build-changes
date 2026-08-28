import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pz {
   public static void a(qg<eqq> $$0) {
      jt<etg> $$1 = $$0.a(me.ba);
      js<etg> $$2 = $$1.b(qo.y);
      js<etg> $$3 = $$1.b(qo.w);
      js<etg> $$4 = $$1.b(qo.z);
      js<etg> $$5 = $$1.b(qo.x);
      jt<eqq> $$6 = $$0.a(me.bc);
      js<eqq> $$7 = $$6.b(qn.a);
      qn.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eqq(
            $$7,
            ImmutableList.of(
               Pair.of(eqo.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eqo.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eqq.a.b
         )
      );
      qn.a($$0, "bastion/bridge/bridge_pieces", new eqq($$7, ImmutableList.of(Pair.of(eqo.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eqq.a.b));
      qn.a(
         $$0,
         "bastion/bridge/legs",
         new eqq($$7, ImmutableList.of(Pair.of(eqo.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eqo.b("bastion/bridge/legs/leg_1", $$3), 1)), eqq.a.b)
      );
      qn.a(
         $$0,
         "bastion/bridge/walls",
         new eqq(
            $$7,
            ImmutableList.of(Pair.of(eqo.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eqo.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eqq.a.b
         )
      );
      qn.a(
         $$0,
         "bastion/bridge/ramparts",
         new eqq(
            $$7,
            ImmutableList.of(Pair.of(eqo.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eqo.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eqq.a.b
         )
      );
      qn.a($$0, "bastion/bridge/rampart_plates", new eqq($$7, ImmutableList.of(Pair.of(eqo.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eqq.a.b));
      qn.a(
         $$0,
         "bastion/bridge/connectors",
         new eqq(
            $$7,
            ImmutableList.of(
               Pair.of(eqo.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eqo.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eqq.a.b
         )
      );
   }
}
