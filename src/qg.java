import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qg {
   public static void a(qj<ehp> $$0) {
      iw<ehp> $$1 = $$0.a(ld.aL);
      iv<ehp> $$2 = $$1.b(qq.a);
      qq.a(
         $$0,
         "bastion/mobs/piglin",
         new ehp(
            $$2,
            ImmutableList.of(
               Pair.of(ehn.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ehn.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ehn.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ehn.b("bastion/mobs/empty"), 1)
            ),
            ehp.a.b
         )
      );
      qq.a(
         $$0, "bastion/mobs/hoglin", new ehp($$2, ImmutableList.of(Pair.of(ehn.b("bastion/mobs/hoglin"), 2), Pair.of(ehn.b("bastion/mobs/empty"), 1)), ehp.a.b)
      );
      qq.a(
         $$0, "bastion/blocks/gold", new ehp($$2, ImmutableList.of(Pair.of(ehn.b("bastion/blocks/air"), 3), Pair.of(ehn.b("bastion/blocks/gold"), 1)), ehp.a.b)
      );
      qq.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ehp(
            $$2,
            ImmutableList.of(
               Pair.of(ehn.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ehn.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ehn.b("bastion/mobs/sword_piglin"), 1)
            ),
            ehp.a.b
         )
      );
   }
}
