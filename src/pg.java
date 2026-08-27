import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pg {
   public static void a(pj<edp> $$0) {
      im<edp> $$1 = $$0.a(ki.aH);
      il<edp> $$2 = $$1.b(pq.a);
      pq.a(
         $$0,
         "bastion/mobs/piglin",
         new edp(
            $$2,
            ImmutableList.of(
               Pair.of(edn.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(edn.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(edn.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(edn.b("bastion/mobs/empty"), 1)
            ),
            edp.a.b
         )
      );
      pq.a(
         $$0, "bastion/mobs/hoglin", new edp($$2, ImmutableList.of(Pair.of(edn.b("bastion/mobs/hoglin"), 2), Pair.of(edn.b("bastion/mobs/empty"), 1)), edp.a.b)
      );
      pq.a(
         $$0, "bastion/blocks/gold", new edp($$2, ImmutableList.of(Pair.of(edn.b("bastion/blocks/air"), 3), Pair.of(edn.b("bastion/blocks/gold"), 1)), edp.a.b)
      );
      pq.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new edp(
            $$2,
            ImmutableList.of(
               Pair.of(edn.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(edn.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(edn.b("bastion/mobs/sword_piglin"), 1)
            ),
            edp.a.b
         )
      );
   }
}
