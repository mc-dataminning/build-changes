import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nk {
   public static void a(nr<dwl> $$0) {
      hf<dyt> $$1 = $$0.a(jc.aB);
      he<dyt> $$2 = $$1.b(nz.y);
      he<dyt> $$3 = $$1.b(nz.w);
      he<dyt> $$4 = $$1.b(nz.z);
      he<dyt> $$5 = $$1.b(nz.x);
      hf<dwl> $$6 = $$0.a(jc.aD);
      he<dwl> $$7 = $$6.b(ny.a);
      ny.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dwl(
            $$7,
            ImmutableList.of(
               Pair.of(dwj.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dwj.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dwl.a.b
         )
      );
      ny.a($$0, "bastion/bridge/bridge_pieces", new dwl($$7, ImmutableList.of(Pair.of(dwj.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dwl.a.b));
      ny.a(
         $$0,
         "bastion/bridge/legs",
         new dwl($$7, ImmutableList.of(Pair.of(dwj.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dwj.b("bastion/bridge/legs/leg_1", $$3), 1)), dwl.a.b)
      );
      ny.a(
         $$0,
         "bastion/bridge/walls",
         new dwl(
            $$7,
            ImmutableList.of(Pair.of(dwj.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dwj.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dwl.a.b
         )
      );
      ny.a(
         $$0,
         "bastion/bridge/ramparts",
         new dwl(
            $$7,
            ImmutableList.of(Pair.of(dwj.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dwj.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dwl.a.b
         )
      );
      ny.a($$0, "bastion/bridge/rampart_plates", new dwl($$7, ImmutableList.of(Pair.of(dwj.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dwl.a.b));
      ny.a(
         $$0,
         "bastion/bridge/connectors",
         new dwl(
            $$7,
            ImmutableList.of(
               Pair.of(dwj.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dwj.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dwl.a.b
         )
      );
   }
}
