import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ol {
   public static void a(oo<dxj> $$0) {
      ic<dxj> $$1 = $$0.a(jz.aD);
      ib<dxj> $$2 = $$1.b(ov.a);
      ov.a(
         $$0,
         "bastion/mobs/piglin",
         new dxj(
            $$2,
            ImmutableList.of(
               Pair.of(dxh.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dxh.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dxh.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dxh.b("bastion/mobs/empty"), 1)
            ),
            dxj.a.b
         )
      );
      ov.a(
         $$0, "bastion/mobs/hoglin", new dxj($$2, ImmutableList.of(Pair.of(dxh.b("bastion/mobs/hoglin"), 2), Pair.of(dxh.b("bastion/mobs/empty"), 1)), dxj.a.b)
      );
      ov.a(
         $$0, "bastion/blocks/gold", new dxj($$2, ImmutableList.of(Pair.of(dxh.b("bastion/blocks/air"), 3), Pair.of(dxh.b("bastion/blocks/gold"), 1)), dxj.a.b)
      );
      ov.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dxj(
            $$2,
            ImmutableList.of(
               Pair.of(dxh.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dxh.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dxh.b("bastion/mobs/sword_piglin"), 1)
            ),
            dxj.a.b
         )
      );
   }
}
