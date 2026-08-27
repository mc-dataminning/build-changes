import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qh {
   public static void a(qo<eiu> $$0) {
      iy<elj> $$1 = $$0.a(lf.aK);
      ix<elj> $$2 = $$1.b(qw.y);
      ix<elj> $$3 = $$1.b(qw.w);
      ix<elj> $$4 = $$1.b(qw.z);
      ix<elj> $$5 = $$1.b(qw.x);
      iy<eiu> $$6 = $$0.a(lf.aM);
      ix<eiu> $$7 = $$6.b(qv.a);
      qv.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new eiu(
            $$7,
            ImmutableList.of(
               Pair.of(eis.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(eis.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            eiu.a.b
         )
      );
      qv.a($$0, "bastion/bridge/bridge_pieces", new eiu($$7, ImmutableList.of(Pair.of(eis.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), eiu.a.b));
      qv.a(
         $$0,
         "bastion/bridge/legs",
         new eiu($$7, ImmutableList.of(Pair.of(eis.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(eis.b("bastion/bridge/legs/leg_1", $$3), 1)), eiu.a.b)
      );
      qv.a(
         $$0,
         "bastion/bridge/walls",
         new eiu(
            $$7,
            ImmutableList.of(Pair.of(eis.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(eis.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            eiu.a.b
         )
      );
      qv.a(
         $$0,
         "bastion/bridge/ramparts",
         new eiu(
            $$7,
            ImmutableList.of(Pair.of(eis.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(eis.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            eiu.a.b
         )
      );
      qv.a($$0, "bastion/bridge/rampart_plates", new eiu($$7, ImmutableList.of(Pair.of(eis.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), eiu.a.b));
      qv.a(
         $$0,
         "bastion/bridge/connectors",
         new eiu(
            $$7,
            ImmutableList.of(
               Pair.of(eis.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(eis.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            eiu.a.b
         )
      );
   }
}
