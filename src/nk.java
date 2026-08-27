import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nk {
   public static void a(nn<dwg> $$0) {
      hg<dwg> $$1 = $$0.a(jd.aC);
      hf<dwg> $$2 = $$1.b(nu.a);
      nu.a(
         $$0,
         "bastion/mobs/piglin",
         new dwg(
            $$2,
            ImmutableList.of(
               Pair.of(dwe.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dwe.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dwe.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dwe.b("bastion/mobs/empty"), 1)
            ),
            dwg.a.b
         )
      );
      nu.a(
         $$0, "bastion/mobs/hoglin", new dwg($$2, ImmutableList.of(Pair.of(dwe.b("bastion/mobs/hoglin"), 2), Pair.of(dwe.b("bastion/mobs/empty"), 1)), dwg.a.b)
      );
      nu.a(
         $$0, "bastion/blocks/gold", new dwg($$2, ImmutableList.of(Pair.of(dwe.b("bastion/blocks/air"), 3), Pair.of(dwe.b("bastion/blocks/gold"), 1)), dwg.a.b)
      );
      nu.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dwg(
            $$2,
            ImmutableList.of(
               Pair.of(dwe.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dwe.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dwe.b("bastion/mobs/sword_piglin"), 1)
            ),
            dwg.a.b
         )
      );
   }
}
