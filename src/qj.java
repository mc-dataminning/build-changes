import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static void a(qq<elc> $$0) {
      jb<enr> $$1 = $$0.a(li.aK);
      ja<enr> $$2 = $$1.b(rc.E);
      ja<enr> $$3 = $$1.b(rc.C);
      ja<enr> $$4 = $$1.b(rc.F);
      ja<enr> $$5 = $$1.b(rc.D);
      jb<elc> $$6 = $$0.a(li.aM);
      ja<elc> $$7 = $$6.b(ra.a);
      ra.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new elc(
            $$7,
            ImmutableList.of(
               Pair.of(ela.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ela.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            elc.a.b
         )
      );
      ra.a($$0, "bastion/bridge/bridge_pieces", new elc($$7, ImmutableList.of(Pair.of(ela.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), elc.a.b));
      ra.a(
         $$0,
         "bastion/bridge/legs",
         new elc($$7, ImmutableList.of(Pair.of(ela.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ela.b("bastion/bridge/legs/leg_1", $$3), 1)), elc.a.b)
      );
      ra.a(
         $$0,
         "bastion/bridge/walls",
         new elc(
            $$7,
            ImmutableList.of(Pair.of(ela.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ela.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            elc.a.b
         )
      );
      ra.a(
         $$0,
         "bastion/bridge/ramparts",
         new elc(
            $$7,
            ImmutableList.of(Pair.of(ela.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ela.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            elc.a.b
         )
      );
      ra.a($$0, "bastion/bridge/rampart_plates", new elc($$7, ImmutableList.of(Pair.of(ela.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), elc.a.b));
      ra.a(
         $$0,
         "bastion/bridge/connectors",
         new elc(
            $$7,
            ImmutableList.of(
               Pair.of(ela.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ela.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            elc.a.b
         )
      );
   }
}
