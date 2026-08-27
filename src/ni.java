import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ni {
   public static void a(np<dwm> $$0) {
      hh<dyu> $$1 = $$0.a(je.aA);
      hg<dyu> $$2 = $$1.b(nx.y);
      hg<dyu> $$3 = $$1.b(nx.w);
      hg<dyu> $$4 = $$1.b(nx.z);
      hg<dyu> $$5 = $$1.b(nx.x);
      hh<dwm> $$6 = $$0.a(je.aC);
      hg<dwm> $$7 = $$6.b(nw.a);
      nw.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new dwm(
            $$7,
            ImmutableList.of(
               Pair.of(dwk.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(dwk.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            dwm.a.b
         )
      );
      nw.a($$0, "bastion/bridge/bridge_pieces", new dwm($$7, ImmutableList.of(Pair.of(dwk.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), dwm.a.b));
      nw.a(
         $$0,
         "bastion/bridge/legs",
         new dwm($$7, ImmutableList.of(Pair.of(dwk.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(dwk.b("bastion/bridge/legs/leg_1", $$3), 1)), dwm.a.b)
      );
      nw.a(
         $$0,
         "bastion/bridge/walls",
         new dwm(
            $$7,
            ImmutableList.of(Pair.of(dwk.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(dwk.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            dwm.a.b
         )
      );
      nw.a(
         $$0,
         "bastion/bridge/ramparts",
         new dwm(
            $$7,
            ImmutableList.of(Pair.of(dwk.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(dwk.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            dwm.a.b
         )
      );
      nw.a($$0, "bastion/bridge/rampart_plates", new dwm($$7, ImmutableList.of(Pair.of(dwk.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), dwm.a.b));
      nw.a(
         $$0,
         "bastion/bridge/connectors",
         new dwm(
            $$7,
            ImmutableList.of(
               Pair.of(dwk.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(dwk.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            dwm.a.b
         )
      );
   }
}
