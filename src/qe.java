import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qe {
   public static void a(ql<ehy> $$0) {
      ix<ekn> $$1 = $$0.a(le.aK);
      iw<ekn> $$2 = $$1.b(qt.y);
      iw<ekn> $$3 = $$1.b(qt.w);
      iw<ekn> $$4 = $$1.b(qt.z);
      iw<ekn> $$5 = $$1.b(qt.x);
      ix<ehy> $$6 = $$0.a(le.aM);
      iw<ehy> $$7 = $$6.b(qs.a);
      qs.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ehy(
            $$7,
            ImmutableList.of(
               Pair.of(ehw.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ehw.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ehy.a.b
         )
      );
      qs.a($$0, "bastion/bridge/bridge_pieces", new ehy($$7, ImmutableList.of(Pair.of(ehw.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ehy.a.b));
      qs.a(
         $$0,
         "bastion/bridge/legs",
         new ehy($$7, ImmutableList.of(Pair.of(ehw.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ehw.b("bastion/bridge/legs/leg_1", $$3), 1)), ehy.a.b)
      );
      qs.a(
         $$0,
         "bastion/bridge/walls",
         new ehy(
            $$7,
            ImmutableList.of(Pair.of(ehw.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ehw.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ehy.a.b
         )
      );
      qs.a(
         $$0,
         "bastion/bridge/ramparts",
         new ehy(
            $$7,
            ImmutableList.of(Pair.of(ehw.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ehw.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ehy.a.b
         )
      );
      qs.a($$0, "bastion/bridge/rampart_plates", new ehy($$7, ImmutableList.of(Pair.of(ehw.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ehy.a.b));
      qs.a(
         $$0,
         "bastion/bridge/connectors",
         new ehy(
            $$7,
            ImmutableList.of(
               Pair.of(ehw.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ehw.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ehy.a.b
         )
      );
   }
}
