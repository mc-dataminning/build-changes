import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qq {
   public static final akg<ehy> a = qs.a("pillager_outpost/base_plates");

   public static void a(ql<ehy> $$0) {
      ix<ekn> $$1 = $$0.a(le.aK);
      iw<ekn> $$2 = $$1.b(qt.q);
      ix<ehy> $$3 = $$0.a(le.aM);
      iw<ehy> $$4 = $$3.b(qs.a);
      $$0.a(a, new ehy($$4, ImmutableList.of(Pair.of(ehw.a("pillager_outpost/base_plate"), 1)), ehy.a.b));
      qs.a(
         $$0,
         "pillager_outpost/towers",
         new ehy(
            $$4,
            ImmutableList.of(Pair.of(ehw.b(ImmutableList.of(ehw.a("pillager_outpost/watchtower"), ehw.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ehy.a.b
         )
      );
      qs.a($$0, "pillager_outpost/feature_plates", new ehy($$4, ImmutableList.of(Pair.of(ehw.a("pillager_outpost/feature_plate"), 1)), ehy.a.a));
      qs.a(
         $$0,
         "pillager_outpost/features",
         new ehy(
            $$4,
            ImmutableList.of(
               Pair.of(ehw.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ehw.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ehw.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ehw.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ehw.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ehw.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ehw.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ehw.g(), 6)
            ),
            ehy.a.b
         )
      );
   }
}
