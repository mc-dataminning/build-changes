import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qz {
   public static void a(rc<eju> $$0) {
      jj<eju> $$1 = $$0.a(lq.aM);
      ji<eju> $$2 = $$1.b(rj.a);
      rj.a(
         $$0,
         "bastion/mobs/piglin",
         new eju(
            $$2,
            ImmutableList.of(
               Pair.of(ejs.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ejs.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ejs.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ejs.b("bastion/mobs/empty"), 1)
            ),
            eju.a.b
         )
      );
      rj.a(
         $$0, "bastion/mobs/hoglin", new eju($$2, ImmutableList.of(Pair.of(ejs.b("bastion/mobs/hoglin"), 2), Pair.of(ejs.b("bastion/mobs/empty"), 1)), eju.a.b)
      );
      rj.a(
         $$0, "bastion/blocks/gold", new eju($$2, ImmutableList.of(Pair.of(ejs.b("bastion/blocks/air"), 3), Pair.of(ejs.b("bastion/blocks/gold"), 1)), eju.a.b)
      );
      rj.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eju(
            $$2,
            ImmutableList.of(
               Pair.of(ejs.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ejs.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ejs.b("bastion/mobs/sword_piglin"), 1)
            ),
            eju.a.b
         )
      );
   }
}
