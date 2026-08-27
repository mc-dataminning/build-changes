import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qo {
   public static final ake<ehp> a = qq.a("pillager_outpost/base_plates");

   public static void a(qj<ehp> $$0) {
      iw<eke> $$1 = $$0.a(ld.aJ);
      iv<eke> $$2 = $$1.b(qr.q);
      iw<ehp> $$3 = $$0.a(ld.aL);
      iv<ehp> $$4 = $$3.b(qq.a);
      $$0.a(a, new ehp($$4, ImmutableList.of(Pair.of(ehn.a("pillager_outpost/base_plate"), 1)), ehp.a.b));
      qq.a(
         $$0,
         "pillager_outpost/towers",
         new ehp(
            $$4,
            ImmutableList.of(Pair.of(ehn.b(ImmutableList.of(ehn.a("pillager_outpost/watchtower"), ehn.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ehp.a.b
         )
      );
      qq.a($$0, "pillager_outpost/feature_plates", new ehp($$4, ImmutableList.of(Pair.of(ehn.a("pillager_outpost/feature_plate"), 1)), ehp.a.a));
      qq.a(
         $$0,
         "pillager_outpost/features",
         new ehp(
            $$4,
            ImmutableList.of(
               Pair.of(ehn.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ehn.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ehn.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ehn.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ehn.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ehn.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ehn.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ehn.g(), 6)
            ),
            ehp.a.b
         )
      );
   }
}
