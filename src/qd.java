import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qd {
   public static void a(qg<eqq> $$0) {
      jt<eqq> $$1 = $$0.a(me.bc);
      js<eqq> $$2 = $$1.b(qn.a);
      qn.a(
         $$0,
         "bastion/mobs/piglin",
         new eqq(
            $$2,
            ImmutableList.of(
               Pair.of(eqo.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eqo.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eqo.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eqo.b("bastion/mobs/empty"), 1)
            ),
            eqq.a.b
         )
      );
      qn.a(
         $$0, "bastion/mobs/hoglin", new eqq($$2, ImmutableList.of(Pair.of(eqo.b("bastion/mobs/hoglin"), 2), Pair.of(eqo.b("bastion/mobs/empty"), 1)), eqq.a.b)
      );
      qn.a(
         $$0, "bastion/blocks/gold", new eqq($$2, ImmutableList.of(Pair.of(eqo.b("bastion/blocks/air"), 3), Pair.of(eqo.b("bastion/blocks/gold"), 1)), eqq.a.b)
      );
      qn.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eqq(
            $$2,
            ImmutableList.of(
               Pair.of(eqo.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eqo.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eqo.b("bastion/mobs/sword_piglin"), 1)
            ),
            eqq.a.b
         )
      );
   }
}
