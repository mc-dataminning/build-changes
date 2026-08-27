import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pb {
   public static void a(pe<eap> $$0) {
      ii<eap> $$1 = $$0.a(ke.aG);
      ih<eap> $$2 = $$1.b(pl.a);
      pl.a(
         $$0,
         "bastion/mobs/piglin",
         new eap(
            $$2,
            ImmutableList.of(
               Pair.of(ean.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ean.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ean.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ean.b("bastion/mobs/empty"), 1)
            ),
            eap.a.b
         )
      );
      pl.a(
         $$0, "bastion/mobs/hoglin", new eap($$2, ImmutableList.of(Pair.of(ean.b("bastion/mobs/hoglin"), 2), Pair.of(ean.b("bastion/mobs/empty"), 1)), eap.a.b)
      );
      pl.a(
         $$0, "bastion/blocks/gold", new eap($$2, ImmutableList.of(Pair.of(ean.b("bastion/blocks/air"), 3), Pair.of(ean.b("bastion/blocks/gold"), 1)), eap.a.b)
      );
      pl.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eap(
            $$2,
            ImmutableList.of(
               Pair.of(ean.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ean.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ean.b("bastion/mobs/sword_piglin"), 1)
            ),
            eap.a.b
         )
      );
   }
}
