import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nj {
   public static final aeo<dwg> a = nu.a("bastion/starts");

   public static void a(nn<dwg> $$0) {
      hg<dyo> $$1 = $$0.a(jd.aA);
      hf<dyo> $$2 = $$1.b(nv.w);
      hg<dwg> $$3 = $$0.a(jd.aC);
      hf<dwg> $$4 = $$3.b(nu.a);
      $$0.a(
         a,
         new dwg(
            $$4,
            ImmutableList.of(
               Pair.of(dwe.b("bastion/units/air_base", $$2), 1),
               Pair.of(dwe.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(dwe.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(dwe.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            dwg.a.b
         )
      );
      ni.a($$0);
      nh.a($$0);
      nl.a($$0);
      ng.a($$0);
      nk.a($$0);
   }
}
