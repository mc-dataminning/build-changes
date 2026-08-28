import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rh {
   public static void a(rk<epm> $$0) {
      jr<epm> $$1 = $$0.a(mb.aW);
      jq<epm> $$2 = $$1.b(rr.a);
      rr.a(
         $$0,
         "bastion/mobs/piglin",
         new epm(
            $$2,
            ImmutableList.of(
               Pair.of(epk.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(epk.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(epk.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(epk.b("bastion/mobs/empty"), 1)
            ),
            epm.a.b
         )
      );
      rr.a(
         $$0, "bastion/mobs/hoglin", new epm($$2, ImmutableList.of(Pair.of(epk.b("bastion/mobs/hoglin"), 2), Pair.of(epk.b("bastion/mobs/empty"), 1)), epm.a.b)
      );
      rr.a(
         $$0, "bastion/blocks/gold", new epm($$2, ImmutableList.of(Pair.of(epk.b("bastion/blocks/air"), 3), Pair.of(epk.b("bastion/blocks/gold"), 1)), epm.a.b)
      );
      rr.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new epm(
            $$2,
            ImmutableList.of(
               Pair.of(epk.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(epk.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(epk.b("bastion/mobs/sword_piglin"), 1)
            ),
            epm.a.b
         )
      );
   }
}
