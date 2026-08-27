import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pf {
   public static final ajb<edp> a = pq.a("bastion/starts");

   public static void a(pj<edp> $$0) {
      im<ege> $$1 = $$0.a(ki.aF);
      il<ege> $$2 = $$1.b(pr.w);
      im<edp> $$3 = $$0.a(ki.aH);
      il<edp> $$4 = $$3.b(pq.a);
      $$0.a(
         a,
         new edp(
            $$4,
            ImmutableList.of(
               Pair.of(edn.b("bastion/units/air_base", $$2), 1),
               Pair.of(edn.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(edn.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(edn.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            edp.a.b
         )
      );
      pe.a($$0);
      pd.a($$0);
      ph.a($$0);
      pc.a($$0);
      pg.a($$0);
   }
}
