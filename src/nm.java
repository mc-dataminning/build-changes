import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nm {
   public static void a(nt<dwt> $$0) {
      hh<dzb> $$1 = $$0.a(je.aA);
      hg<dzb> $$2 = $$1.b(ob.y);
      hg<dzb> $$3 = $$1.b(ob.w);
      hg<dzb> $$4 = $$1.b(ob.z);
      hg<dzb> $$5 = $$1.b(ob.x);
      hh<dwt> $$6 = $$0.a(je.aC);
      hg<dwt> $$7 = $$6.b(oa.a);
      oa.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dwt(
            $$7,
            ImmutableList.of(
               Pair.of(dwr.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dwr.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dwt.a.b
         )
      );
      oa.a($$0, "bastion/bridge/bridge_pieces", new dwt($$7, ImmutableList.of(Pair.of(dwr.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dwt.a.b));
      oa.a(
         $$0,
         "bastion/bridge/legs",
         new dwt($$7, ImmutableList.of(Pair.of(dwr.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dwr.b("bastion/bridge/legs/leg_1", $$3), 1)), dwt.a.b)
      );
      oa.a(
         $$0,
         "bastion/bridge/walls",
         new dwt(
            $$7,
            ImmutableList.of(Pair.of(dwr.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dwr.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dwt.a.b
         )
      );
      oa.a(
         $$0,
         "bastion/bridge/ramparts",
         new dwt(
            $$7,
            ImmutableList.of(Pair.of(dwr.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dwr.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dwt.a.b
         )
      );
      oa.a($$0, "bastion/bridge/rampart_plates", new dwt($$7, ImmutableList.of(Pair.of(dwr.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dwt.a.b));
      oa.a(
         $$0,
         "bastion/bridge/connectors",
         new dwt(
            $$7,
            ImmutableList.of(
               Pair.of(dwr.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dwr.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dwt.a.b
         )
      );
   }
}
