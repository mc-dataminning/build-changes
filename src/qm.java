import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qm {
   public static final alf<esx> a = qo.a("pillager_outpost/base_plates");

   public static void a(qh<esx> $$0) {
      jg<evn> $$1 = $$0.a(mh.bc);
      jf<evn> $$2 = $$1.b(qp.q);
      jg<esx> $$3 = $$0.a(mh.bf);
      jf<esx> $$4 = $$3.b(qo.a);
      $$0.a(a, new esx($$4, ImmutableList.of(Pair.of(esv.a("pillager_outpost/base_plate"), 1)), esx.a.b));
      qo.a(
         $$0,
         "pillager_outpost/towers",
         new esx(
            $$4,
            ImmutableList.of(Pair.of(esv.b(ImmutableList.of(esv.a("pillager_outpost/watchtower"), esv.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            esx.a.b
         )
      );
      qo.a($$0, "pillager_outpost/feature_plates", new esx($$4, ImmutableList.of(Pair.of(esv.a("pillager_outpost/feature_plate"), 1)), esx.a.a));
      qo.a(
         $$0,
         "pillager_outpost/features",
         new esx(
            $$4,
            ImmutableList.of(
               Pair.of(esv.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(esv.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(esv.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(esv.a("pillager_outpost/feature_logs"), 1),
               Pair.of(esv.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(esv.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(esv.a("pillager_outpost/feature_targets"), 1),
               Pair.of(esv.i(), 6)
            ),
            esx.a.b
         )
      );
   }
}
