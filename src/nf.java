import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nf {
   public static void a(nm<dwi> $$0) {
      hf<dyq> $$1 = $$0.a(jc.aA);
      he<dyq> $$2 = $$1.b(nu.y);
      he<dyq> $$3 = $$1.b(nu.w);
      he<dyq> $$4 = $$1.b(nu.z);
      he<dyq> $$5 = $$1.b(nu.x);
      hf<dwi> $$6 = $$0.a(jc.aC);
      he<dwi> $$7 = $$6.b(nt.a);
      nt.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dwi(
            $$7,
            ImmutableList.of(
               Pair.of(dwg.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dwg.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dwi.a.b
         )
      );
      nt.a($$0, "bastion/bridge/bridge_pieces", new dwi($$7, ImmutableList.of(Pair.of(dwg.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dwi.a.b));
      nt.a(
         $$0,
         "bastion/bridge/legs",
         new dwi($$7, ImmutableList.of(Pair.of(dwg.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dwg.b("bastion/bridge/legs/leg_1", $$3), 1)), dwi.a.b)
      );
      nt.a(
         $$0,
         "bastion/bridge/walls",
         new dwi(
            $$7,
            ImmutableList.of(Pair.of(dwg.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dwg.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dwi.a.b
         )
      );
      nt.a(
         $$0,
         "bastion/bridge/ramparts",
         new dwi(
            $$7,
            ImmutableList.of(Pair.of(dwg.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dwg.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dwi.a.b
         )
      );
      nt.a($$0, "bastion/bridge/rampart_plates", new dwi($$7, ImmutableList.of(Pair.of(dwg.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dwi.a.b));
      nt.a(
         $$0,
         "bastion/bridge/connectors",
         new dwi(
            $$7,
            ImmutableList.of(
               Pair.of(dwg.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dwg.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dwi.a.b
         )
      );
   }
}
