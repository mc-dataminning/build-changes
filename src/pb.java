import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pb {
   public static void a(pe<eao> $$0) {
      ii<eao> $$1 = $$0.a(ke.aG);
      ih<eao> $$2 = $$1.b(pl.a);
      pl.a(
         $$0,
         "bastion/mobs/piglin",
         new eao(
            $$2,
            ImmutableList.of(
               Pair.of(eam.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eam.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eam.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eam.b("bastion/mobs/empty"), 1)
            ),
            eao.a.b
         )
      );
      pl.a(
         $$0, "bastion/mobs/hoglin", new eao($$2, ImmutableList.of(Pair.of(eam.b("bastion/mobs/hoglin"), 2), Pair.of(eam.b("bastion/mobs/empty"), 1)), eao.a.b)
      );
      pl.a(
         $$0, "bastion/blocks/gold", new eao($$2, ImmutableList.of(Pair.of(eam.b("bastion/blocks/air"), 3), Pair.of(eam.b("bastion/blocks/gold"), 1)), eao.a.b)
      );
      pl.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eao(
            $$2,
            ImmutableList.of(
               Pair.of(eam.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eam.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eam.b("bastion/mobs/sword_piglin"), 1)
            ),
            eao.a.b
         )
      );
   }
}
