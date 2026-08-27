import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pa {
   public static final agh<dyq> a = pc.a("pillager_outpost/base_plates");

   public static void a(ov<dyq> $$0) {
      ic<ebf> $$1 = $$0.a(jz.aC);
      ib<ebf> $$2 = $$1.b(pd.q);
      ic<dyq> $$3 = $$0.a(jz.aE);
      ib<dyq> $$4 = $$3.b(pc.a);
      $$0.a(a, new dyq($$4, ImmutableList.of(Pair.of(dyo.a("pillager_outpost/base_plate"), 1)), dyq.a.b));
      pc.a(
         $$0,
         "pillager_outpost/towers",
         new dyq(
            $$4,
            ImmutableList.of(Pair.of(dyo.b(ImmutableList.of(dyo.a("pillager_outpost/watchtower"), dyo.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dyq.a.b
         )
      );
      pc.a($$0, "pillager_outpost/feature_plates", new dyq($$4, ImmutableList.of(Pair.of(dyo.a("pillager_outpost/feature_plate"), 1)), dyq.a.a));
      pc.a(
         $$0,
         "pillager_outpost/features",
         new dyq(
            $$4,
            ImmutableList.of(
               Pair.of(dyo.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dyo.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dyo.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dyo.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dyo.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dyo.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dyo.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dyo.g(), 6)
            ),
            dyq.a.b
         )
      );
   }
}
