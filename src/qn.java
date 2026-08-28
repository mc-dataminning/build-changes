import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qn {
   public static void a(qq<ekz> $$0) {
      jn<ekz> $$1 = $$0.a(lu.aU);
      jm<ekz> $$2 = $$1.b(qx.a);
      qx.a(
         $$0,
         "bastion/mobs/piglin",
         new ekz(
            $$2,
            ImmutableList.of(
               Pair.of(ekx.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ekx.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ekx.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ekx.b("bastion/mobs/empty"), 1)
            ),
            ekz.a.b
         )
      );
      qx.a(
         $$0, "bastion/mobs/hoglin", new ekz($$2, ImmutableList.of(Pair.of(ekx.b("bastion/mobs/hoglin"), 2), Pair.of(ekx.b("bastion/mobs/empty"), 1)), ekz.a.b)
      );
      qx.a(
         $$0, "bastion/blocks/gold", new ekz($$2, ImmutableList.of(Pair.of(ekx.b("bastion/blocks/air"), 3), Pair.of(ekx.b("bastion/blocks/gold"), 1)), ekz.a.b)
      );
      qx.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ekz(
            $$2,
            ImmutableList.of(
               Pair.of(ekx.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ekx.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ekx.b("bastion/mobs/sword_piglin"), 1)
            ),
            ekz.a.b
         )
      );
   }
}
