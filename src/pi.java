import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pi {
   public static void a(pl<eel> $$0) {
      im<eel> $$1 = $$0.a(kj.aH);
      il<eel> $$2 = $$1.b(ps.a);
      ps.a(
         $$0,
         "bastion/mobs/piglin",
         new eel(
            $$2,
            ImmutableList.of(
               Pair.of(eej.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eej.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eej.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eej.b("bastion/mobs/empty"), 1)
            ),
            eel.a.b
         )
      );
      ps.a(
         $$0, "bastion/mobs/hoglin", new eel($$2, ImmutableList.of(Pair.of(eej.b("bastion/mobs/hoglin"), 2), Pair.of(eej.b("bastion/mobs/empty"), 1)), eel.a.b)
      );
      ps.a(
         $$0, "bastion/blocks/gold", new eel($$2, ImmutableList.of(Pair.of(eej.b("bastion/blocks/air"), 3), Pair.of(eej.b("bastion/blocks/gold"), 1)), eel.a.b)
      );
      ps.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eel(
            $$2,
            ImmutableList.of(
               Pair.of(eej.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eej.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eej.b("bastion/mobs/sword_piglin"), 1)
            ),
            eel.a.b
         )
      );
   }
}
