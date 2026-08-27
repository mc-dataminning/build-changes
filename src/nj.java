import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nj {
   public static void a(nm<dwi> $$0) {
      hf<dwi> $$1 = $$0.a(jc.aC);
      he<dwi> $$2 = $$1.b(nt.a);
      nt.a(
         $$0,
         "bastion/mobs/piglin",
         new dwi(
            $$2,
            ImmutableList.of(
               Pair.of(dwg.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dwg.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dwg.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dwg.b("bastion/mobs/empty"), 1)
            ),
            dwi.a.b
         )
      );
      nt.a(
         $$0, "bastion/mobs/hoglin", new dwi($$2, ImmutableList.of(Pair.of(dwg.b("bastion/mobs/hoglin"), 2), Pair.of(dwg.b("bastion/mobs/empty"), 1)), dwi.a.b)
      );
      nt.a(
         $$0, "bastion/blocks/gold", new dwi($$2, ImmutableList.of(Pair.of(dwg.b("bastion/blocks/air"), 3), Pair.of(dwg.b("bastion/blocks/gold"), 1)), dwi.a.b)
      );
      nt.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dwi(
            $$2,
            ImmutableList.of(
               Pair.of(dwg.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dwg.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dwg.b("bastion/mobs/sword_piglin"), 1)
            ),
            dwi.a.b
         )
      );
   }
}
