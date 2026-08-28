import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qq {
   public static void a(qt<emm> $$0) {
      jo<emm> $$1 = $$0.a(lv.aV);
      jn<emm> $$2 = $$1.b(ra.a);
      ra.a(
         $$0,
         "bastion/mobs/piglin",
         new emm(
            $$2,
            ImmutableList.of(
               Pair.of(emk.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(emk.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(emk.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(emk.b("bastion/mobs/empty"), 1)
            ),
            emm.a.b
         )
      );
      ra.a(
         $$0, "bastion/mobs/hoglin", new emm($$2, ImmutableList.of(Pair.of(emk.b("bastion/mobs/hoglin"), 2), Pair.of(emk.b("bastion/mobs/empty"), 1)), emm.a.b)
      );
      ra.a(
         $$0, "bastion/blocks/gold", new emm($$2, ImmutableList.of(Pair.of(emk.b("bastion/blocks/air"), 3), Pair.of(emk.b("bastion/blocks/gold"), 1)), emm.a.b)
      );
      ra.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new emm(
            $$2,
            ImmutableList.of(
               Pair.of(emk.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(emk.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(emk.b("bastion/mobs/sword_piglin"), 1)
            ),
            emm.a.b
         )
      );
   }
}
