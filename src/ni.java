import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ni {
   public static final aeq<dwi> a = nt.a("bastion/starts");

   public static void a(nm<dwi> $$0) {
      hf<dyq> $$1 = $$0.a(jc.aA);
      he<dyq> $$2 = $$1.b(nu.w);
      hf<dwi> $$3 = $$0.a(jc.aC);
      he<dwi> $$4 = $$3.b(nt.a);
      $$0.a(
         a,
         new dwi(
            $$4,
            ImmutableList.of(
               Pair.of(dwg.b("bastion/units/air_base", $$2), 1),
               Pair.of(dwg.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(dwg.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(dwg.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            dwi.a.b
         )
      );
      nh.a($$0);
      ng.a($$0);
      nk.a($$0);
      nf.a($$0);
      nj.a($$0);
   }
}
