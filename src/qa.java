import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qa {
   public static void a(qh<esx> $$0) {
      jg<evn> $$1 = $$0.a(mh.bc);
      jf<evn> $$2 = $$1.b(qp.y);
      jf<evn> $$3 = $$1.b(qp.w);
      jf<evn> $$4 = $$1.b(qp.z);
      jf<evn> $$5 = $$1.b(qp.x);
      jg<esx> $$6 = $$0.a(mh.bf);
      jf<esx> $$7 = $$6.b(qo.a);
      qo.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new esx(
            $$7,
            ImmutableList.of(
               Pair.of(esv.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(esv.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            esx.a.b
         )
      );
      qo.a($$0, "bastion/bridge/bridge_pieces", new esx($$7, ImmutableList.of(Pair.of(esv.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), esx.a.b));
      qo.a(
         $$0,
         "bastion/bridge/legs",
         new esx($$7, ImmutableList.of(Pair.of(esv.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(esv.b("bastion/bridge/legs/leg_1", $$3), 1)), esx.a.b)
      );
      qo.a(
         $$0,
         "bastion/bridge/walls",
         new esx(
            $$7,
            ImmutableList.of(Pair.of(esv.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(esv.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            esx.a.b
         )
      );
      qo.a(
         $$0,
         "bastion/bridge/ramparts",
         new esx(
            $$7,
            ImmutableList.of(Pair.of(esv.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(esv.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            esx.a.b
         )
      );
      qo.a($$0, "bastion/bridge/rampart_plates", new esx($$7, ImmutableList.of(Pair.of(esv.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), esx.a.b));
      qo.a(
         $$0,
         "bastion/bridge/connectors",
         new esx(
            $$7,
            ImmutableList.of(
               Pair.of(esv.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(esv.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            esx.a.b
         )
      );
   }
}
