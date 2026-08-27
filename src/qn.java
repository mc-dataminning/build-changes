import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qn {
   public static void a(qq<elc> $$0) {
      jb<elc> $$1 = $$0.a(li.aM);
      ja<elc> $$2 = $$1.b(ra.a);
      ra.a(
         $$0,
         "bastion/mobs/piglin",
         new elc(
            $$2,
            ImmutableList.of(
               Pair.of(ela.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ela.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ela.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ela.b("bastion/mobs/empty"), 1)
            ),
            elc.a.b
         )
      );
      ra.a(
         $$0, "bastion/mobs/hoglin", new elc($$2, ImmutableList.of(Pair.of(ela.b("bastion/mobs/hoglin"), 2), Pair.of(ela.b("bastion/mobs/empty"), 1)), elc.a.b)
      );
      ra.a(
         $$0, "bastion/blocks/gold", new elc($$2, ImmutableList.of(Pair.of(ela.b("bastion/blocks/air"), 3), Pair.of(ela.b("bastion/blocks/gold"), 1)), elc.a.b)
      );
      ra.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new elc(
            $$2,
            ImmutableList.of(
               Pair.of(ela.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ela.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ela.b("bastion/mobs/sword_piglin"), 1)
            ),
            elc.a.b
         )
      );
   }
}
