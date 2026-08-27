import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qc {
   public static void a(qj<ehp> $$0) {
      iw<eke> $$1 = $$0.a(ld.aJ);
      iv<eke> $$2 = $$1.b(qr.y);
      iv<eke> $$3 = $$1.b(qr.w);
      iv<eke> $$4 = $$1.b(qr.z);
      iv<eke> $$5 = $$1.b(qr.x);
      iw<ehp> $$6 = $$0.a(ld.aL);
      iv<ehp> $$7 = $$6.b(qq.a);
      qq.a(
         $$0,
         "bastion/bridge/starting_pieces",
         new ehp(
            $$7,
            ImmutableList.of(
               Pair.of(ehn.b("bastion/bridge/starting_pieces/entrance", $$2), 1), Pair.of(ehn.b("bastion/bridge/starting_pieces/entrance_face", $$3), 1)
            ),
            ehp.a.b
         )
      );
      qq.a($$0, "bastion/bridge/bridge_pieces", new ehp($$7, ImmutableList.of(Pair.of(ehn.b("bastion/bridge/bridge_pieces/bridge", $$4), 1)), ehp.a.b));
      qq.a(
         $$0,
         "bastion/bridge/legs",
         new ehp($$7, ImmutableList.of(Pair.of(ehn.b("bastion/bridge/legs/leg_0", $$3), 1), Pair.of(ehn.b("bastion/bridge/legs/leg_1", $$3), 1)), ehp.a.b)
      );
      qq.a(
         $$0,
         "bastion/bridge/walls",
         new ehp(
            $$7,
            ImmutableList.of(Pair.of(ehn.b("bastion/bridge/walls/wall_base_0", $$5), 1), Pair.of(ehn.b("bastion/bridge/walls/wall_base_1", $$5), 1)),
            ehp.a.b
         )
      );
      qq.a(
         $$0,
         "bastion/bridge/ramparts",
         new ehp(
            $$7,
            ImmutableList.of(Pair.of(ehn.b("bastion/bridge/ramparts/rampart_0", $$5), 1), Pair.of(ehn.b("bastion/bridge/ramparts/rampart_1", $$5), 1)),
            ehp.a.b
         )
      );
      qq.a($$0, "bastion/bridge/rampart_plates", new ehp($$7, ImmutableList.of(Pair.of(ehn.b("bastion/bridge/rampart_plates/plate_0", $$5), 1)), ehp.a.b));
      qq.a(
         $$0,
         "bastion/bridge/connectors",
         new ehp(
            $$7,
            ImmutableList.of(
               Pair.of(ehn.b("bastion/bridge/connectors/back_bridge_top", $$3), 1), Pair.of(ehn.b("bastion/bridge/connectors/back_bridge_bottom", $$3), 1)
            ),
            ehp.a.b
         )
      );
   }
}
