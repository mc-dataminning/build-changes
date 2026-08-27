import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ph {
   public static final ahc<eai> a = pj.a("pillager_outpost/base_plates");

   public static void a(pc<eai> $$0) {
      ii<ecx> $$1 = $$0.a(ke.aE);
      ih<ecx> $$2 = $$1.b(pk.q);
      ii<eai> $$3 = $$0.a(ke.aG);
      ih<eai> $$4 = $$3.b(pj.a);
      $$0.a(a, new eai($$4, ImmutableList.of(Pair.of(eag.a("pillager_outpost/base_plate"), 1)), eai.a.b));
      pj.a(
         $$0,
         "pillager_outpost/towers",
         new eai(
            $$4,
            ImmutableList.of(Pair.of(eag.b(ImmutableList.of(eag.a("pillager_outpost/watchtower"), eag.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eai.a.b
         )
      );
      pj.a($$0, "pillager_outpost/feature_plates", new eai($$4, ImmutableList.of(Pair.of(eag.a("pillager_outpost/feature_plate"), 1)), eai.a.a));
      pj.a(
         $$0,
         "pillager_outpost/features",
         new eai(
            $$4,
            ImmutableList.of(
               Pair.of(eag.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eag.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eag.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eag.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eag.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eag.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eag.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eag.g(), 6)
            ),
            eai.a.b
         )
      );
   }
}
