import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qy {
   public static void a(rb<enl> $$0) {
      jr<enl> $$1 = $$0.a(ma.aV);
      jq<enl> $$2 = $$1.b(ri.a);
      ri.a(
         $$0,
         "bastion/mobs/piglin",
         new enl(
            $$2,
            ImmutableList.of(
               Pair.of(enj.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(enj.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(enj.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(enj.b("bastion/mobs/empty"), 1)
            ),
            enl.a.b
         )
      );
      ri.a(
         $$0, "bastion/mobs/hoglin", new enl($$2, ImmutableList.of(Pair.of(enj.b("bastion/mobs/hoglin"), 2), Pair.of(enj.b("bastion/mobs/empty"), 1)), enl.a.b)
      );
      ri.a(
         $$0, "bastion/blocks/gold", new enl($$2, ImmutableList.of(Pair.of(enj.b("bastion/blocks/air"), 3), Pair.of(enj.b("bastion/blocks/gold"), 1)), enl.a.b)
      );
      ri.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new enl(
            $$2,
            ImmutableList.of(
               Pair.of(enj.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(enj.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(enj.b("bastion/mobs/sword_piglin"), 1)
            ),
            enl.a.b
         )
      );
   }
}
