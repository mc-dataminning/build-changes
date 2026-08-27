import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pt {
   public static final ajs<egq> a = qe.a("bastion/starts");

   public static void a(px<egq> $$0) {
      im<ejf> $$1 = $$0.a(ks.aG);
      il<ejf> $$2 = $$1.b(qf.w);
      im<egq> $$3 = $$0.a(ks.aI);
      il<egq> $$4 = $$3.b(qe.a);
      $$0.a(
         a,
         new egq(
            $$4,
            ImmutableList.of(
               Pair.of(ego.b("bastion/units/air_base", $$2), 1),
               Pair.of(ego.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ego.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ego.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            egq.a.b
         )
      );
      ps.a($$0);
      pr.a($$0);
      pv.a($$0);
      pq.a($$0);
      pu.a($$0);
   }
}
