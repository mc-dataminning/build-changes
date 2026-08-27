import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class oz {
   public static void a(pc<eai> $$0) {
      ii<eai> $$1 = $$0.a(ke.aG);
      ih<eai> $$2 = $$1.b(pj.a);
      pj.a(
         $$0,
         "bastion/mobs/piglin",
         new eai(
            $$2,
            ImmutableList.of(
               Pair.of(eag.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eag.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eag.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eag.b("bastion/mobs/empty"), 1)
            ),
            eai.a.b
         )
      );
      pj.a(
         $$0, "bastion/mobs/hoglin", new eai($$2, ImmutableList.of(Pair.of(eag.b("bastion/mobs/hoglin"), 2), Pair.of(eag.b("bastion/mobs/empty"), 1)), eai.a.b)
      );
      pj.a(
         $$0, "bastion/blocks/gold", new eai($$2, ImmutableList.of(Pair.of(eag.b("bastion/blocks/air"), 3), Pair.of(eag.b("bastion/blocks/gold"), 1)), eai.a.b)
      );
      pj.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eai(
            $$2,
            ImmutableList.of(
               Pair.of(eag.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eag.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eag.b("bastion/mobs/sword_piglin"), 1)
            ),
            eai.a.b
         )
      );
   }
}
