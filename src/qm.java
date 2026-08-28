import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qm {
   public static void a(qt<emm> $$0) {
      jo<epc> $$1 = $$0.a(lv.aT);
      jn<epc> $$2 = $$1.b(rb.y);
      jn<epc> $$3 = $$1.b(rb.w);
      jn<epc> $$4 = $$1.b(rb.z);
      jn<epc> $$5 = $$1.b(rb.x);
      jo<emm> $$6 = $$0.a(lv.aV);
      jn<emm> $$7 = $$6.b(ra.a);
      ra.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new emm(
            $$7,
            ImmutableList.of(
               Pair.of(emk.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(emk.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            emm.a.b
         )
      );
      ra.a($$0, "bastion/bridge/bridge_pieces", new emm($$7, ImmutableList.of(Pair.of(emk.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), emm.a.b));
      ra.a(
         $$0,
         "bastion/bridge/legs",
         new emm($$7, ImmutableList.of(Pair.of(emk.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(emk.b("bastion/bridge/legs/leg_1", $$3), 1)), emm.a.b)
      );
      ra.a(
         $$0,
         "bastion/bridge/walls",
         new emm(
            $$7,
            ImmutableList.of(Pair.of(emk.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(emk.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            emm.a.b
         )
      );
      ra.a(
         $$0,
         "bastion/bridge/ramparts",
         new emm(
            $$7,
            ImmutableList.of(Pair.of(emk.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(emk.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            emm.a.b
         )
      );
      ra.a($$0, "bastion/bridge/rampart_plates", new emm($$7, ImmutableList.of(Pair.of(emk.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), emm.a.b));
      ra.a(
         $$0,
         "bastion/bridge/connectors",
         new emm(
            $$7,
            ImmutableList.of(
               Pair.of(emk.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(emk.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            emm.a.b
         )
      );
   }
}
