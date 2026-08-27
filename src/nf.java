import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nf {
   public static void a(nm<dwh> $$0) {
      hf<dyp> $$1 = $$0.a(jc.aA);
      he<dyp> $$2 = $$1.b(nu.y);
      he<dyp> $$3 = $$1.b(nu.w);
      he<dyp> $$4 = $$1.b(nu.z);
      he<dyp> $$5 = $$1.b(nu.x);
      hf<dwh> $$6 = $$0.a(jc.aC);
      he<dwh> $$7 = $$6.b(nt.a);
      nt.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dwh(
            $$7,
            ImmutableList.of(
               Pair.of(dwf.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dwf.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dwh.a.b
         )
      );
      nt.a($$0, "bastion/bridge/bridge_pieces", new dwh($$7, ImmutableList.of(Pair.of(dwf.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dwh.a.b));
      nt.a(
         $$0,
         "bastion/bridge/legs",
         new dwh($$7, ImmutableList.of(Pair.of(dwf.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dwf.b("bastion/bridge/legs/leg_1", $$3), 1)), dwh.a.b)
      );
      nt.a(
         $$0,
         "bastion/bridge/walls",
         new dwh(
            $$7,
            ImmutableList.of(Pair.of(dwf.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dwf.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dwh.a.b
         )
      );
      nt.a(
         $$0,
         "bastion/bridge/ramparts",
         new dwh(
            $$7,
            ImmutableList.of(Pair.of(dwf.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dwf.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dwh.a.b
         )
      );
      nt.a($$0, "bastion/bridge/rampart_plates", new dwh($$7, ImmutableList.of(Pair.of(dwf.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dwh.a.b));
      nt.a(
         $$0,
         "bastion/bridge/connectors",
         new dwh(
            $$7,
            ImmutableList.of(
               Pair.of(dwf.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dwf.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dwh.a.b
         )
      );
   }
}
