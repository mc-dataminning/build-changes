import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qn {
   public static void a(qq<elb> $$0) {
      jn<elb> $$1 = $$0.a(lu.aU);
      jm<elb> $$2 = $$1.b(qx.a);
      qx.a(
         $$0,
         "bastion/mobs/piglin",
         new elb(
            $$2,
            ImmutableList.of(
               Pair.of(ekz.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ekz.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ekz.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ekz.b("bastion/mobs/empty"), 1)
            ),
            elb.a.b
         )
      );
      qx.a(
         $$0, "bastion/mobs/hoglin", new elb($$2, ImmutableList.of(Pair.of(ekz.b("bastion/mobs/hoglin"), 2), Pair.of(ekz.b("bastion/mobs/empty"), 1)), elb.a.b)
      );
      qx.a(
         $$0, "bastion/blocks/gold", new elb($$2, ImmutableList.of(Pair.of(ekz.b("bastion/blocks/air"), 3), Pair.of(ekz.b("bastion/blocks/gold"), 1)), elb.a.b)
      );
      qx.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new elb(
            $$2,
            ImmutableList.of(
               Pair.of(ekz.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ekz.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ekz.b("bastion/mobs/sword_piglin"), 1)
            ),
            elb.a.b
         )
      );
   }
}
