import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qx {
   public static void a(ra<epn> $$0) {
      jr<epn> $$1 = $$0.a(mb.aX);
      jq<epn> $$2 = $$1.b(rh.a);
      rh.a(
         $$0,
         "bastion/mobs/piglin",
         new epn(
            $$2,
            ImmutableList.of(
               Pair.of(epl.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(epl.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(epl.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(epl.b("bastion/mobs/empty"), 1)
            ),
            epn.a.b
         )
      );
      rh.a(
         $$0, "bastion/mobs/hoglin", new epn($$2, ImmutableList.of(Pair.of(epl.b("bastion/mobs/hoglin"), 2), Pair.of(epl.b("bastion/mobs/empty"), 1)), epn.a.b)
      );
      rh.a(
         $$0, "bastion/blocks/gold", new epn($$2, ImmutableList.of(Pair.of(epl.b("bastion/blocks/air"), 3), Pair.of(epl.b("bastion/blocks/gold"), 1)), epn.a.b)
      );
      rh.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new epn(
            $$2,
            ImmutableList.of(
               Pair.of(epl.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(epl.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(epl.b("bastion/mobs/sword_piglin"), 1)
            ),
            epn.a.b
         )
      );
   }
}
