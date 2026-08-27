import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nw {
   public static final aey<dwl> a = ny.a("pillager_outpost/base_plates");

   public static void a(nr<dwl> $$0) {
      hf<dyt> $$1 = $$0.a(jc.aB);
      he<dyt> $$2 = $$1.b(nz.q);
      hf<dwl> $$3 = $$0.a(jc.aD);
      he<dwl> $$4 = $$3.b(ny.a);
      $$0.a(a, new dwl($$4, ImmutableList.of(Pair.of(dwj.a("pillager_outpost/base_plate"), 1)), dwl.a.b));
      ny.a(
         $$0,
         "pillager_outpost/towers",
         new dwl(
            $$4,
            ImmutableList.of(Pair.of(dwj.a(ImmutableList.of(dwj.a("pillager_outpost/watchtower"), dwj.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dwl.a.b
         )
      );
      ny.a($$0, "pillager_outpost/feature_plates", new dwl($$4, ImmutableList.of(Pair.of(dwj.a("pillager_outpost/feature_plate"), 1)), dwl.a.a));
      ny.a(
         $$0,
         "pillager_outpost/features",
         new dwl(
            $$4,
            ImmutableList.of(
               Pair.of(dwj.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dwj.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dwj.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dwj.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dwj.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dwj.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dwj.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dwj.g(), 6)
            ),
            dwl.a.b
         )
      );
   }
}
