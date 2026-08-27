import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ot {
   public static final afv<dxj> a = ov.a("pillager_outpost/base_plates");

   public static void a(oo<dxj> $$0) {
      ic<dzr> $$1 = $$0.a(jz.aB);
      ib<dzr> $$2 = $$1.b(ow.q);
      ic<dxj> $$3 = $$0.a(jz.aD);
      ib<dxj> $$4 = $$3.b(ov.a);
      $$0.a(a, new dxj($$4, ImmutableList.of(Pair.of(dxh.a("pillager_outpost/base_plate"), 1)), dxj.a.b));
      ov.a(
         $$0,
         "pillager_outpost/towers",
         new dxj(
            $$4,
            ImmutableList.of(Pair.of(dxh.a(ImmutableList.of(dxh.a("pillager_outpost/watchtower"), dxh.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dxj.a.b
         )
      );
      ov.a($$0, "pillager_outpost/feature_plates", new dxj($$4, ImmutableList.of(Pair.of(dxh.a("pillager_outpost/feature_plate"), 1)), dxj.a.a));
      ov.a(
         $$0,
         "pillager_outpost/features",
         new dxj(
            $$4,
            ImmutableList.of(
               Pair.of(dxh.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dxh.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dxh.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dxh.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dxh.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dxh.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dxh.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dxh.g(), 6)
            ),
            dxj.a.b
         )
      );
   }
}
