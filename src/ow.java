import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ow {
   public static void a(oz<dyv> $$0) {
      ih<dyv> $$1 = $$0.a(kd.aE);
      ig<dyv> $$2 = $$1.b(pg.a);
      pg.a(
         $$0,
         "bastion/mobs/piglin",
         new dyv(
            $$2,
            ImmutableList.of(
               Pair.of(dyt.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dyt.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dyt.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dyt.b("bastion/mobs/empty"), 1)
            ),
            dyv.a.b
         )
      );
      pg.a(
         $$0, "bastion/mobs/hoglin", new dyv($$2, ImmutableList.of(Pair.of(dyt.b("bastion/mobs/hoglin"), 2), Pair.of(dyt.b("bastion/mobs/empty"), 1)), dyv.a.b)
      );
      pg.a(
         $$0, "bastion/blocks/gold", new dyv($$2, ImmutableList.of(Pair.of(dyt.b("bastion/blocks/air"), 3), Pair.of(dyt.b("bastion/blocks/gold"), 1)), dyv.a.b)
      );
      pg.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dyv(
            $$2,
            ImmutableList.of(
               Pair.of(dyt.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dyt.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dyt.b("bastion/mobs/sword_piglin"), 1)
            ),
            dyv.a.b
         )
      );
   }
}
