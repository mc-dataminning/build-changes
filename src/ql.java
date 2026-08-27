import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ql {
   public static void a(qo<eiu> $$0) {
      iy<eiu> $$1 = $$0.a(lf.aM);
      ix<eiu> $$2 = $$1.b(qv.a);
      qv.a(
         $$0,
         "bastion/mobs/piglin",
         new eiu(
            $$2,
            ImmutableList.of(
               Pair.of(eis.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eis.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eis.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eis.b("bastion/mobs/empty"), 1)
            ),
            eiu.a.b
         )
      );
      qv.a(
         $$0, "bastion/mobs/hoglin", new eiu($$2, ImmutableList.of(Pair.of(eis.b("bastion/mobs/hoglin"), 2), Pair.of(eis.b("bastion/mobs/empty"), 1)), eiu.a.b)
      );
      qv.a(
         $$0, "bastion/blocks/gold", new eiu($$2, ImmutableList.of(Pair.of(eis.b("bastion/blocks/air"), 3), Pair.of(eis.b("bastion/blocks/gold"), 1)), eiu.a.b)
      );
      qv.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eiu(
            $$2,
            ImmutableList.of(
               Pair.of(eis.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eis.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eis.b("bastion/mobs/sword_piglin"), 1)
            ),
            eiu.a.b
         )
      );
   }
}
