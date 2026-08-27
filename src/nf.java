import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nf {
   public static void a(nm<dtj> $$0) {
      hf<dvr> $$1 = $$0.a(jc.aA);
      he<dvr> $$2 = $$1.b(nu.y);
      he<dvr> $$3 = $$1.b(nu.w);
      he<dvr> $$4 = $$1.b(nu.z);
      he<dvr> $$5 = $$1.b(nu.x);
      hf<dtj> $$6 = $$0.a(jc.aC);
      he<dtj> $$7 = $$6.b(nt.a);
      nt.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dtj(
            $$7,
            ImmutableList.of(
               Pair.of(dth.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dth.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dtj.a.b
         )
      );
      nt.a($$0, "bastion/bridge/bridge_pieces", new dtj($$7, ImmutableList.of(Pair.of(dth.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dtj.a.b));
      nt.a(
         $$0,
         "bastion/bridge/legs",
         new dtj($$7, ImmutableList.of(Pair.of(dth.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dth.b("bastion/bridge/legs/leg_1", $$3), 1)), dtj.a.b)
      );
      nt.a(
         $$0,
         "bastion/bridge/walls",
         new dtj(
            $$7,
            ImmutableList.of(Pair.of(dth.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dth.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dtj.a.b
         )
      );
      nt.a(
         $$0,
         "bastion/bridge/ramparts",
         new dtj(
            $$7,
            ImmutableList.of(Pair.of(dth.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dth.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dtj.a.b
         )
      );
      nt.a($$0, "bastion/bridge/rampart_plates", new dtj($$7, ImmutableList.of(Pair.of(dth.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dtj.a.b));
      nt.a(
         $$0,
         "bastion/bridge/connectors",
         new dtj(
            $$7,
            ImmutableList.of(
               Pair.of(dth.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dth.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dtj.a.b
         )
      );
   }
}
