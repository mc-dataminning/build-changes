import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class os {
   public static void a(ov<dyq> $$0) {
      ic<dyq> $$1 = $$0.a(jz.aE);
      ib<dyq> $$2 = $$1.b(pc.a);
      pc.a(
         $$0,
         "bastion/mobs/piglin",
         new dyq(
            $$2,
            ImmutableList.of(
               Pair.of(dyo.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dyo.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dyo.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dyo.b("bastion/mobs/empty"), 1)
            ),
            dyq.a.b
         )
      );
      pc.a(
         $$0, "bastion/mobs/hoglin", new dyq($$2, ImmutableList.of(Pair.of(dyo.b("bastion/mobs/hoglin"), 2), Pair.of(dyo.b("bastion/mobs/empty"), 1)), dyq.a.b)
      );
      pc.a(
         $$0, "bastion/blocks/gold", new dyq($$2, ImmutableList.of(Pair.of(dyo.b("bastion/blocks/air"), 3), Pair.of(dyo.b("bastion/blocks/gold"), 1)), dyq.a.b)
      );
      pc.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dyq(
            $$2,
            ImmutableList.of(
               Pair.of(dyo.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dyo.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dyo.b("bastion/mobs/sword_piglin"), 1)
            ),
            dyq.a.b
         )
      );
   }
}
