import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qe {
   public static void a(qh<esx> $$0) {
      jg<esx> $$1 = $$0.a(mh.bf);
      jf<esx> $$2 = $$1.b(qo.a);
      qo.a(
         $$0,
         "bastion/mobs/piglin",
         new esx(
            $$2,
            ImmutableList.of(
               Pair.of(esv.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(esv.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(esv.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(esv.b("bastion/mobs/empty"), 1)
            ),
            esx.a.b
         )
      );
      qo.a(
         $$0, "bastion/mobs/hoglin", new esx($$2, ImmutableList.of(Pair.of(esv.b("bastion/mobs/hoglin"), 2), Pair.of(esv.b("bastion/mobs/empty"), 1)), esx.a.b)
      );
      qo.a(
         $$0, "bastion/blocks/gold", new esx($$2, ImmutableList.of(Pair.of(esv.b("bastion/blocks/air"), 3), Pair.of(esv.b("bastion/blocks/gold"), 1)), esx.a.b)
      );
      qo.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new esx(
            $$2,
            ImmutableList.of(
               Pair.of(esv.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(esv.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(esv.b("bastion/mobs/sword_piglin"), 1)
            ),
            esx.a.b
         )
      );
   }
}
