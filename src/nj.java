import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nj {
   public static void a(nm<dwh> $$0) {
      hf<dwh> $$1 = $$0.a(jc.aC);
      he<dwh> $$2 = $$1.b(nt.a);
      nt.a(
         $$0,
         "bastion/mobs/piglin",
         new dwh(
            $$2,
            ImmutableList.of(
               Pair.of(dwf.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dwf.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dwf.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dwf.b("bastion/mobs/empty"), 1)
            ),
            dwh.a.b
         )
      );
      nt.a(
         $$0, "bastion/mobs/hoglin", new dwh($$2, ImmutableList.of(Pair.of(dwf.b("bastion/mobs/hoglin"), 2), Pair.of(dwf.b("bastion/mobs/empty"), 1)), dwh.a.b)
      );
      nt.a(
         $$0, "bastion/blocks/gold", new dwh($$2, ImmutableList.of(Pair.of(dwf.b("bastion/blocks/air"), 3), Pair.of(dwf.b("bastion/blocks/gold"), 1)), dwh.a.b)
      );
      nt.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dwh(
            $$2,
            ImmutableList.of(
               Pair.of(dwf.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dwf.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dwf.b("bastion/mobs/sword_piglin"), 1)
            ),
            dwh.a.b
         )
      );
   }
}
