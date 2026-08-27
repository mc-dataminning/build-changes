import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class or {
   public static void a(ou<dye> $$0) {
      ic<dye> $$1 = $$0.a(jz.aE);
      ib<dye> $$2 = $$1.b(pb.a);
      pb.a(
         $$0,
         "bastion/mobs/piglin",
         new dye(
            $$2,
            ImmutableList.of(
               Pair.of(dyc.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dyc.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dyc.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dyc.b("bastion/mobs/empty"), 1)
            ),
            dye.a.b
         )
      );
      pb.a(
         $$0, "bastion/mobs/hoglin", new dye($$2, ImmutableList.of(Pair.of(dyc.b("bastion/mobs/hoglin"), 2), Pair.of(dyc.b("bastion/mobs/empty"), 1)), dye.a.b)
      );
      pb.a(
         $$0, "bastion/blocks/gold", new dye($$2, ImmutableList.of(Pair.of(dyc.b("bastion/blocks/air"), 3), Pair.of(dyc.b("bastion/blocks/gold"), 1)), dye.a.b)
      );
      pb.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dye(
            $$2,
            ImmutableList.of(
               Pair.of(dyc.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dyc.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dyc.b("bastion/mobs/sword_piglin"), 1)
            ),
            dye.a.b
         )
      );
   }
}
