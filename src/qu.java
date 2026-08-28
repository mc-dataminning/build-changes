import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qu {
   public static void a(qx<enb> $$0) {
      jq<enb> $$1 = $$0.a(ly.aV);
      jp<enb> $$2 = $$1.b(re.a);
      re.a(
         $$0,
         "bastion/mobs/piglin",
         new enb(
            $$2,
            ImmutableList.of(
               Pair.of(emz.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(emz.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(emz.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(emz.b("bastion/mobs/empty"), 1)
            ),
            enb.a.b
         )
      );
      re.a(
         $$0, "bastion/mobs/hoglin", new enb($$2, ImmutableList.of(Pair.of(emz.b("bastion/mobs/hoglin"), 2), Pair.of(emz.b("bastion/mobs/empty"), 1)), enb.a.b)
      );
      re.a(
         $$0, "bastion/blocks/gold", new enb($$2, ImmutableList.of(Pair.of(emz.b("bastion/blocks/air"), 3), Pair.of(emz.b("bastion/blocks/gold"), 1)), enb.a.b)
      );
      re.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new enb(
            $$2,
            ImmutableList.of(
               Pair.of(emz.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(emz.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(emz.b("bastion/mobs/sword_piglin"), 1)
            ),
            enb.a.b
         )
      );
   }
}
