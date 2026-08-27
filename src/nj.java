import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nj {
   public static void a(nm<dtj> $$0) {
      hf<dtj> $$1 = $$0.a(jc.aC);
      he<dtj> $$2 = $$1.b(nt.a);
      nt.a(
         $$0,
         "bastion/mobs/piglin",
         new dtj(
            $$2,
            ImmutableList.of(
               Pair.of(dth.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dth.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dth.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dth.b("bastion/mobs/empty"), 1)
            ),
            dtj.a.b
         )
      );
      nt.a(
         $$0, "bastion/mobs/hoglin", new dtj($$2, ImmutableList.of(Pair.of(dth.b("bastion/mobs/hoglin"), 2), Pair.of(dth.b("bastion/mobs/empty"), 1)), dtj.a.b)
      );
      nt.a(
         $$0, "bastion/blocks/gold", new dtj($$2, ImmutableList.of(Pair.of(dth.b("bastion/blocks/air"), 3), Pair.of(dth.b("bastion/blocks/gold"), 1)), dtj.a.b)
      );
      nt.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dtj(
            $$2,
            ImmutableList.of(
               Pair.of(dth.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dth.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dth.b("bastion/mobs/sword_piglin"), 1)
            ),
            dtj.a.b
         )
      );
   }
}
