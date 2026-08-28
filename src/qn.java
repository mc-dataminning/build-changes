import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qn {
   public static void a(qu<emq> $$0) {
      jp<epg> $$1 = $$0.a(lw.aU);
      jo<epg> $$2 = $$1.b(rc.y);
      jo<epg> $$3 = $$1.b(rc.w);
      jo<epg> $$4 = $$1.b(rc.z);
      jo<epg> $$5 = $$1.b(rc.x);
      jp<emq> $$6 = $$0.a(lw.aW);
      jo<emq> $$7 = $$6.b(rb.a);
      rb.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new emq(
            $$7,
            ImmutableList.of(
               Pair.of(emo.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(emo.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            emq.a.b
         )
      );
      rb.a($$0, "bastion/bridge/bridge_pieces", new emq($$7, ImmutableList.of(Pair.of(emo.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), emq.a.b));
      rb.a(
         $$0,
         "bastion/bridge/legs",
         new emq($$7, ImmutableList.of(Pair.of(emo.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(emo.b("bastion/bridge/legs/leg_1", $$3), 1)), emq.a.b)
      );
      rb.a(
         $$0,
         "bastion/bridge/walls",
         new emq(
            $$7,
            ImmutableList.of(Pair.of(emo.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(emo.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            emq.a.b
         )
      );
      rb.a(
         $$0,
         "bastion/bridge/ramparts",
         new emq(
            $$7,
            ImmutableList.of(Pair.of(emo.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(emo.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            emq.a.b
         )
      );
      rb.a($$0, "bastion/bridge/rampart_plates", new emq($$7, ImmutableList.of(Pair.of(emo.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), emq.a.b));
      rb.a(
         $$0,
         "bastion/bridge/connectors",
         new emq(
            $$7,
            ImmutableList.of(
               Pair.of(emo.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(emo.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            emq.a.b
         )
      );
   }
}
