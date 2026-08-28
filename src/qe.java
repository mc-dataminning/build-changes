import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qe {
   public static void a(qh<etl> $$0) {
      jg<etl> $$1 = $$0.a(mh.bf);
      jf<etl> $$2 = $$1.b(qo.a);
      qo.a(
         $$0,
         "bastion/mobs/piglin",
         new etl(
            $$2,
            ImmutableList.of(
               Pair.of(etj.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(etj.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(etj.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(etj.b("bastion/mobs/empty"), 1)
            ),
            etl.a.b
         )
      );
      qo.a(
         $$0, "bastion/mobs/hoglin", new etl($$2, ImmutableList.of(Pair.of(etj.b("bastion/mobs/hoglin"), 2), Pair.of(etj.b("bastion/mobs/empty"), 1)), etl.a.b)
      );
      qo.a(
         $$0, "bastion/blocks/gold", new etl($$2, ImmutableList.of(Pair.of(etj.b("bastion/blocks/air"), 3), Pair.of(etj.b("bastion/blocks/gold"), 1)), etl.a.b)
      );
      qo.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new etl(
            $$2,
            ImmutableList.of(
               Pair.of(etj.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(etj.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(etj.b("bastion/mobs/sword_piglin"), 1)
            ),
            etl.a.b
         )
      );
   }
}
