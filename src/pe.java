import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pe {
   public static void a(ph<ecu> $$0) {
      ik<ecu> $$1 = $$0.a(kg.aG);
      ij<ecu> $$2 = $$1.b(po.a);
      po.a(
         $$0,
         "bastion/mobs/piglin",
         new ecu(
            $$2,
            ImmutableList.of(
               Pair.of(ecs.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ecs.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ecs.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ecs.b("bastion/mobs/empty"), 1)
            ),
            ecu.a.b
         )
      );
      po.a(
         $$0, "bastion/mobs/hoglin", new ecu($$2, ImmutableList.of(Pair.of(ecs.b("bastion/mobs/hoglin"), 2), Pair.of(ecs.b("bastion/mobs/empty"), 1)), ecu.a.b)
      );
      po.a(
         $$0, "bastion/blocks/gold", new ecu($$2, ImmutableList.of(Pair.of(ecs.b("bastion/blocks/air"), 3), Pair.of(ecs.b("bastion/blocks/gold"), 1)), ecu.a.b)
      );
      po.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ecu(
            $$2,
            ImmutableList.of(
               Pair.of(ecs.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ecs.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ecs.b("bastion/mobs/sword_piglin"), 1)
            ),
            ecu.a.b
         )
      );
   }
}
