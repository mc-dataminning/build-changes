import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pc {
   public static void a(pf<eax> $$0) {
      ii<eax> $$1 = $$0.a(ke.aG);
      ih<eax> $$2 = $$1.b(pm.a);
      pm.a(
         $$0,
         "bastion/mobs/piglin",
         new eax(
            $$2,
            ImmutableList.of(
               Pair.of(eav.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eav.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eav.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eav.b("bastion/mobs/empty"), 1)
            ),
            eax.a.b
         )
      );
      pm.a(
         $$0, "bastion/mobs/hoglin", new eax($$2, ImmutableList.of(Pair.of(eav.b("bastion/mobs/hoglin"), 2), Pair.of(eav.b("bastion/mobs/empty"), 1)), eax.a.b)
      );
      pm.a(
         $$0, "bastion/blocks/gold", new eax($$2, ImmutableList.of(Pair.of(eav.b("bastion/blocks/air"), 3), Pair.of(eav.b("bastion/blocks/gold"), 1)), eax.a.b)
      );
      pm.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eax(
            $$2,
            ImmutableList.of(
               Pair.of(eav.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eav.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eav.b("bastion/mobs/sword_piglin"), 1)
            ),
            eax.a.b
         )
      );
   }
}
