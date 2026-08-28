import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qz {
   public static void a(rc<ejs> $$0) {
      jj<ejs> $$1 = $$0.a(lq.aM);
      ji<ejs> $$2 = $$1.b(rj.a);
      rj.a(
         $$0,
         "bastion/mobs/piglin",
         new ejs(
            $$2,
            ImmutableList.of(
               Pair.of(ejq.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ejq.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ejq.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ejq.b("bastion/mobs/empty"), 1)
            ),
            ejs.a.b
         )
      );
      rj.a(
         $$0, "bastion/mobs/hoglin", new ejs($$2, ImmutableList.of(Pair.of(ejq.b("bastion/mobs/hoglin"), 2), Pair.of(ejq.b("bastion/mobs/empty"), 1)), ejs.a.b)
      );
      rj.a(
         $$0, "bastion/blocks/gold", new ejs($$2, ImmutableList.of(Pair.of(ejq.b("bastion/blocks/air"), 3), Pair.of(ejq.b("bastion/blocks/gold"), 1)), ejs.a.b)
      );
      rj.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ejs(
            $$2,
            ImmutableList.of(
               Pair.of(ejq.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ejq.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ejq.b("bastion/mobs/sword_piglin"), 1)
            ),
            ejs.a.b
         )
      );
   }
}
