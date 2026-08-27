import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nu {
   public static final aet<dwm> a = nw.a("pillager_outpost/base_plates");

   public static void a(np<dwm> $$0) {
      hh<dyu> $$1 = $$0.a(je.aA);
      hg<dyu> $$2 = $$1.b(nx.q);
      hh<dwm> $$3 = $$0.a(je.aC);
      hg<dwm> $$4 = $$3.b(nw.a);
      $$0.a(a, new dwm($$4, ImmutableList.of(Pair.of(dwk.a("pillager_outpost/base_plate"), 1)), dwm.a.b));
      nw.a(
         $$0,
         "pillager_outpost/towers",
         new dwm(
            $$4,
            ImmutableList.of(Pair.of(dwk.a(ImmutableList.of(dwk.a("pillager_outpost/watchtower"), dwk.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dwm.a.b
         )
      );
      nw.a($$0, "pillager_outpost/feature_plates", new dwm($$4, ImmutableList.of(Pair.of(dwk.a("pillager_outpost/feature_plate"), 1)), dwm.a.a));
      nw.a(
         $$0,
         "pillager_outpost/features",
         new dwm(
            $$4,
            ImmutableList.of(
               Pair.of(dwk.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dwk.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dwk.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dwk.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dwk.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dwk.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dwk.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dwk.g(), 6)
            ),
            dwm.a.b
         )
      );
   }
}
