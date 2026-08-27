import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qi {
   public static void a(ql<ehy> $$0) {
      ix<ehy> $$1 = $$0.a(le.aM);
      iw<ehy> $$2 = $$1.b(qs.a);
      qs.a(
         $$0,
         "bastion/mobs/piglin",
         new ehy(
            $$2,
            ImmutableList.of(
               Pair.of(ehw.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ehw.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ehw.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ehw.b("bastion/mobs/empty"), 1)
            ),
            ehy.a.b
         )
      );
      qs.a(
         $$0, "bastion/mobs/hoglin", new ehy($$2, ImmutableList.of(Pair.of(ehw.b("bastion/mobs/hoglin"), 2), Pair.of(ehw.b("bastion/mobs/empty"), 1)), ehy.a.b)
      );
      qs.a(
         $$0, "bastion/blocks/gold", new ehy($$2, ImmutableList.of(Pair.of(ehw.b("bastion/blocks/air"), 3), Pair.of(ehw.b("bastion/blocks/gold"), 1)), ehy.a.b)
      );
      qs.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ehy(
            $$2,
            ImmutableList.of(
               Pair.of(ehw.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ehw.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ehw.b("bastion/mobs/sword_piglin"), 1)
            ),
            ehy.a.b
         )
      );
   }
}
