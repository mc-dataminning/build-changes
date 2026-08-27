import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pw {
   public static void a(pz<egz> $$0) {
      io<egz> $$1 = $$0.a(ku.aJ);
      in<egz> $$2 = $$1.b(qg.a);
      qg.a(
         $$0,
         "bastion/mobs/piglin",
         new egz(
            $$2,
            ImmutableList.of(
               Pair.of(egx.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(egx.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(egx.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(egx.b("bastion/mobs/empty"), 1)
            ),
            egz.a.b
         )
      );
      qg.a(
         $$0, "bastion/mobs/hoglin", new egz($$2, ImmutableList.of(Pair.of(egx.b("bastion/mobs/hoglin"), 2), Pair.of(egx.b("bastion/mobs/empty"), 1)), egz.a.b)
      );
      qg.a(
         $$0, "bastion/blocks/gold", new egz($$2, ImmutableList.of(Pair.of(egx.b("bastion/blocks/air"), 3), Pair.of(egx.b("bastion/blocks/gold"), 1)), egz.a.b)
      );
      qg.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new egz(
            $$2,
            ImmutableList.of(
               Pair.of(egx.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(egx.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(egx.b("bastion/mobs/sword_piglin"), 1)
            ),
            egz.a.b
         )
      );
   }
}
