import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pm {
   public static final aix<ecu> a = po.a("pillager_outpost/base_plates");

   public static void a(ph<ecu> $$0) {
      ik<efj> $$1 = $$0.a(kg.aE);
      ij<efj> $$2 = $$1.b(pp.q);
      ik<ecu> $$3 = $$0.a(kg.aG);
      ij<ecu> $$4 = $$3.b(po.a);
      $$0.a(a, new ecu($$4, ImmutableList.of(Pair.of(ecs.a("pillager_outpost/base_plate"), 1)), ecu.a.b));
      po.a(
         $$0,
         "pillager_outpost/towers",
         new ecu(
            $$4,
            ImmutableList.of(Pair.of(ecs.b(ImmutableList.of(ecs.a("pillager_outpost/watchtower"), ecs.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ecu.a.b
         )
      );
      po.a($$0, "pillager_outpost/feature_plates", new ecu($$4, ImmutableList.of(Pair.of(ecs.a("pillager_outpost/feature_plate"), 1)), ecu.a.a));
      po.a(
         $$0,
         "pillager_outpost/features",
         new ecu(
            $$4,
            ImmutableList.of(
               Pair.of(ecs.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ecs.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ecs.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ecs.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ecs.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ecs.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ecs.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ecs.g(), 6)
            ),
            ecu.a.b
         )
      );
   }
}
