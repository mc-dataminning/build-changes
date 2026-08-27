import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ni {
   public static final aeq<dwh> a = nt.a("bastion/starts");

   public static void a(nm<dwh> $$0) {
      hf<dyp> $$1 = $$0.a(jc.aA);
      he<dyp> $$2 = $$1.b(nu.w);
      hf<dwh> $$3 = $$0.a(jc.aC);
      he<dwh> $$4 = $$3.b(nt.a);
      $$0.a(
         a,
         new dwh(
            $$4,
            ImmutableList.of(
               Pair.of(dwf.b("bastion/units/air_base", $$2), 1),
               Pair.of(dwf.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(dwf.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(dwf.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            dwh.a.b
         )
      );
      nh.a($$0);
      ng.a($$0);
      nk.a($$0);
      nf.a($$0);
      nj.a($$0);
   }
}
