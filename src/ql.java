import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ql {
   public static void a(qo<eis> $$0) {
      iy<eis> $$1 = $$0.a(lf.aM);
      ix<eis> $$2 = $$1.b(qv.a);
      qv.a(
         $$0,
         "bastion/mobs/piglin",
         new eis(
            $$2,
            ImmutableList.of(
               Pair.of(eiq.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eiq.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eiq.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eiq.b("bastion/mobs/empty"), 1)
            ),
            eis.a.b
         )
      );
      qv.a(
         $$0, "bastion/mobs/hoglin", new eis($$2, ImmutableList.of(Pair.of(eiq.b("bastion/mobs/hoglin"), 2), Pair.of(eiq.b("bastion/mobs/empty"), 1)), eis.a.b)
      );
      qv.a(
         $$0, "bastion/blocks/gold", new eis($$2, ImmutableList.of(Pair.of(eiq.b("bastion/blocks/air"), 3), Pair.of(eiq.b("bastion/blocks/gold"), 1)), eis.a.b)
      );
      qv.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eis(
            $$2,
            ImmutableList.of(
               Pair.of(eiq.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eiq.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eiq.b("bastion/mobs/sword_piglin"), 1)
            ),
            eis.a.b
         )
      );
   }
}
