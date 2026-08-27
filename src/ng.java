import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ng {
   public static void a(nn<dwg> $$0) {
      hg<dyo> $$1 = $$0.a(jd.aA);
      hf<dyo> $$2 = $$1.b(nv.y);
      hf<dyo> $$3 = $$1.b(nv.w);
      hf<dyo> $$4 = $$1.b(nv.z);
      hf<dyo> $$5 = $$1.b(nv.x);
      hg<dwg> $$6 = $$0.a(jd.aC);
      hf<dwg> $$7 = $$6.b(nu.a);
      nu.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dwg(
            $$7,
            ImmutableList.of(
               Pair.of(dwe.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dwe.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dwg.a.b
         )
      );
      nu.a($$0, "bastion/bridge/bridge_pieces", new dwg($$7, ImmutableList.of(Pair.of(dwe.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dwg.a.b));
      nu.a(
         $$0,
         "bastion/bridge/legs",
         new dwg($$7, ImmutableList.of(Pair.of(dwe.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dwe.b("bastion/bridge/legs/leg_1", $$3), 1)), dwg.a.b)
      );
      nu.a(
         $$0,
         "bastion/bridge/walls",
         new dwg(
            $$7,
            ImmutableList.of(Pair.of(dwe.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dwe.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dwg.a.b
         )
      );
      nu.a(
         $$0,
         "bastion/bridge/ramparts",
         new dwg(
            $$7,
            ImmutableList.of(Pair.of(dwe.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dwe.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dwg.a.b
         )
      );
      nu.a($$0, "bastion/bridge/rampart_plates", new dwg($$7, ImmutableList.of(Pair.of(dwe.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dwg.a.b));
      nu.a(
         $$0,
         "bastion/bridge/connectors",
         new dwg(
            $$7,
            ImmutableList.of(
               Pair.of(dwe.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dwe.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dwg.a.b
         )
      );
   }
}
