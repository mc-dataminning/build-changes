import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ox {
   public static void a(pa<dzx> $$0) {
      ig<dzx> $$1 = $$0.a(kc.aF);
      ie<dzx> $$2 = $$1.b(ph.a);
      ph.a(
         $$0,
         "bastion/mobs/piglin",
         new dzx(
            $$2,
            ImmutableList.of(
               Pair.of(dzv.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dzv.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dzv.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dzv.b("bastion/mobs/empty"), 1)
            ),
            dzx.a.b
         )
      );
      ph.a(
         $$0, "bastion/mobs/hoglin", new dzx($$2, ImmutableList.of(Pair.of(dzv.b("bastion/mobs/hoglin"), 2), Pair.of(dzv.b("bastion/mobs/empty"), 1)), dzx.a.b)
      );
      ph.a(
         $$0, "bastion/blocks/gold", new dzx($$2, ImmutableList.of(Pair.of(dzv.b("bastion/blocks/air"), 3), Pair.of(dzv.b("bastion/blocks/gold"), 1)), dzx.a.b)
      );
      ph.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dzx(
            $$2,
            ImmutableList.of(
               Pair.of(dzv.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dzv.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dzv.b("bastion/mobs/sword_piglin"), 1)
            ),
            dzx.a.b
         )
      );
   }
}
