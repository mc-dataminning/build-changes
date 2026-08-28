import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qz {
   public static final ald<emq> a = rb.a("pillager_outpost/base_plates");

   public static void a(qu<emq> $$0) {
      jp<epg> $$1 = $$0.a(lw.aU);
      jo<epg> $$2 = $$1.b(rc.q);
      jp<emq> $$3 = $$0.a(lw.aW);
      jo<emq> $$4 = $$3.b(rb.a);
      $$0.a(a, new emq($$4, ImmutableList.of(Pair.of(emo.a("pillager_outpost/base_plate"), 1)), emq.a.b));
      rb.a(
         $$0,
         "pillager_outpost/towers",
         new emq(
            $$4,
            ImmutableList.of(Pair.of(emo.b(ImmutableList.of(emo.a("pillager_outpost/watchtower"), emo.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            emq.a.b
         )
      );
      rb.a($$0, "pillager_outpost/feature_plates", new emq($$4, ImmutableList.of(Pair.of(emo.a("pillager_outpost/feature_plate"), 1)), emq.a.a));
      rb.a(
         $$0,
         "pillager_outpost/features",
         new emq(
            $$4,
            ImmutableList.of(
               Pair.of(emo.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(emo.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(emo.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(emo.a("pillager_outpost/feature_logs"), 1),
               Pair.of(emo.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(emo.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(emo.a("pillager_outpost/feature_targets"), 1),
               Pair.of(emo.h(), 6)
            ),
            emq.a.b
         )
      );
   }
}
