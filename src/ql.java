import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ql {
   public static final alc<eqq> a = qn.a("pillager_outpost/base_plates");

   public static void a(qg<eqq> $$0) {
      jt<etg> $$1 = $$0.a(me.ba);
      js<etg> $$2 = $$1.b(qo.q);
      jt<eqq> $$3 = $$0.a(me.bc);
      js<eqq> $$4 = $$3.b(qn.a);
      $$0.a(a, new eqq($$4, ImmutableList.of(Pair.of(eqo.a("pillager_outpost/base_plate"), 1)), eqq.a.b));
      qn.a(
         $$0,
         "pillager_outpost/towers",
         new eqq(
            $$4,
            ImmutableList.of(Pair.of(eqo.b(ImmutableList.of(eqo.a("pillager_outpost/watchtower"), eqo.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            eqq.a.b
         )
      );
      qn.a($$0, "pillager_outpost/feature_plates", new eqq($$4, ImmutableList.of(Pair.of(eqo.a("pillager_outpost/feature_plate"), 1)), eqq.a.a));
      qn.a(
         $$0,
         "pillager_outpost/features",
         new eqq(
            $$4,
            ImmutableList.of(
               Pair.of(eqo.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eqo.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eqo.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eqo.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eqo.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eqo.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eqo.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eqo.h(), 6)
            ),
            eqq.a.b
         )
      );
   }
}
