import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qq {
   public static void a(qt<ely> $$0) {
      jo<ely> $$1 = $$0.a(lv.aU);
      jn<ely> $$2 = $$1.b(ra.a);
      ra.a(
         $$0,
         "bastion/mobs/piglin",
         new ely(
            $$2,
            ImmutableList.of(
               Pair.of(elw.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(elw.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(elw.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(elw.b("bastion/mobs/empty"), 1)
            ),
            ely.a.b
         )
      );
      ra.a(
         $$0, "bastion/mobs/hoglin", new ely($$2, ImmutableList.of(Pair.of(elw.b("bastion/mobs/hoglin"), 2), Pair.of(elw.b("bastion/mobs/empty"), 1)), ely.a.b)
      );
      ra.a(
         $$0, "bastion/blocks/gold", new ely($$2, ImmutableList.of(Pair.of(elw.b("bastion/blocks/air"), 3), Pair.of(elw.b("bastion/blocks/gold"), 1)), ely.a.b)
      );
      ra.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ely(
            $$2,
            ImmutableList.of(
               Pair.of(elw.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(elw.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(elw.b("bastion/mobs/sword_piglin"), 1)
            ),
            ely.a.b
         )
      );
   }
}
