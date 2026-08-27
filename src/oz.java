import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class oz {
   public static final agf<dye> a = pb.a("pillager_outpost/base_plates");

   public static void a(ou<dye> $$0) {
      ic<eat> $$1 = $$0.a(jz.aC);
      ib<eat> $$2 = $$1.b(pc.q);
      ic<dye> $$3 = $$0.a(jz.aE);
      ib<dye> $$4 = $$3.b(pb.a);
      $$0.a(a, new dye($$4, ImmutableList.of(Pair.of(dyc.a("pillager_outpost/base_plate"), 1)), dye.a.b));
      pb.a(
         $$0,
         "pillager_outpost/towers",
         new dye(
            $$4,
            ImmutableList.of(Pair.of(dyc.a(ImmutableList.of(dyc.a("pillager_outpost/watchtower"), dyc.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dye.a.b
         )
      );
      pb.a($$0, "pillager_outpost/feature_plates", new dye($$4, ImmutableList.of(Pair.of(dyc.a("pillager_outpost/feature_plate"), 1)), dye.a.a));
      pb.a(
         $$0,
         "pillager_outpost/features",
         new dye(
            $$4,
            ImmutableList.of(
               Pair.of(dyc.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dyc.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dyc.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dyc.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dyc.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dyc.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dyc.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dyc.g(), 6)
            ),
            dye.a.b
         )
      );
   }
}
