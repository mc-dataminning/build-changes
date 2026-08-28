import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rd {
   public static final alh<enh> a = rf.a("pillager_outpost/base_plates");

   public static void a(qy<enh> $$0) {
      jr<epx> $$1 = $$0.a(lz.aT);
      jq<epx> $$2 = $$1.b(rg.q);
      jr<enh> $$3 = $$0.a(lz.aV);
      jq<enh> $$4 = $$3.b(rf.a);
      $$0.a(a, new enh($$4, ImmutableList.of(Pair.of(enf.a("pillager_outpost/base_plate"), 1)), enh.a.b));
      rf.a(
         $$0,
         "pillager_outpost/towers",
         new enh(
            $$4,
            ImmutableList.of(Pair.of(enf.b(ImmutableList.of(enf.a("pillager_outpost/watchtower"), enf.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            enh.a.b
         )
      );
      rf.a($$0, "pillager_outpost/feature_plates", new enh($$4, ImmutableList.of(Pair.of(enf.a("pillager_outpost/feature_plate"), 1)), enh.a.a));
      rf.a(
         $$0,
         "pillager_outpost/features",
         new enh(
            $$4,
            ImmutableList.of(
               Pair.of(enf.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(enf.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(enf.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(enf.a("pillager_outpost/feature_logs"), 1),
               Pair.of(enf.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(enf.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(enf.a("pillager_outpost/feature_targets"), 1),
               Pair.of(enf.h(), 6)
            ),
            enh.a.b
         )
      );
   }
}
