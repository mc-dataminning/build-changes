import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qm {
   public static void a(qt<ely> $$0) {
      jo<eoo> $$1 = $$0.a(lv.aS);
      jn<eoo> $$2 = $$1.b(rb.y);
      jn<eoo> $$3 = $$1.b(rb.w);
      jn<eoo> $$4 = $$1.b(rb.z);
      jn<eoo> $$5 = $$1.b(rb.x);
      jo<ely> $$6 = $$0.a(lv.aU);
      jn<ely> $$7 = $$6.b(ra.a);
      ra.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ely(
            $$7,
            ImmutableList.of(
               Pair.of(elw.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(elw.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ely.a.b
         )
      );
      ra.a($$0, "bastion/bridge/bridge_pieces", new ely($$7, ImmutableList.of(Pair.of(elw.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ely.a.b));
      ra.a(
         $$0,
         "bastion/bridge/legs",
         new ely($$7, ImmutableList.of(Pair.of(elw.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(elw.b("bastion/bridge/legs/leg_1", $$3), 1)), ely.a.b)
      );
      ra.a(
         $$0,
         "bastion/bridge/walls",
         new ely(
            $$7,
            ImmutableList.of(Pair.of(elw.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(elw.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ely.a.b
         )
      );
      ra.a(
         $$0,
         "bastion/bridge/ramparts",
         new ely(
            $$7,
            ImmutableList.of(Pair.of(elw.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(elw.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ely.a.b
         )
      );
      ra.a($$0, "bastion/bridge/rampart_plates", new ely($$7, ImmutableList.of(Pair.of(elw.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ely.a.b));
      ra.a(
         $$0,
         "bastion/bridge/connectors",
         new ely(
            $$7,
            ImmutableList.of(
               Pair.of(elw.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(elw.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ely.a.b
         )
      );
   }
}
