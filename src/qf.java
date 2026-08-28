import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qf {
   public static void a(qi<etn> $$0) {
      jh<etn> $$1 = $$0.a(mi.bf);
      jg<etn> $$2 = $$1.b(qp.a);
      qp.a(
         $$0,
         "bastion/mobs/piglin",
         new etn(
            $$2,
            ImmutableList.of(
               Pair.of(etl.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(etl.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(etl.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(etl.b("bastion/mobs/empty"), 1)
            ),
            etn.a.b
         )
      );
      qp.a(
         $$0, "bastion/mobs/hoglin", new etn($$2, ImmutableList.of(Pair.of(etl.b("bastion/mobs/hoglin"), 2), Pair.of(etl.b("bastion/mobs/empty"), 1)), etn.a.b)
      );
      qp.a(
         $$0, "bastion/blocks/gold", new etn($$2, ImmutableList.of(Pair.of(etl.b("bastion/blocks/air"), 3), Pair.of(etl.b("bastion/blocks/gold"), 1)), etn.a.b)
      );
      qp.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new etn(
            $$2,
            ImmutableList.of(
               Pair.of(etl.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(etl.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(etl.b("bastion/mobs/sword_piglin"), 1)
            ),
            etn.a.b
         )
      );
   }
}
