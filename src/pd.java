import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pd {
   public static final aix<ecn> a = po.a("bastion/starts");

   public static void a(ph<ecn> $$0) {
      ik<efc> $$1 = $$0.a(kg.aE);
      ij<efc> $$2 = $$1.b(pp.w);
      ik<ecn> $$3 = $$0.a(kg.aG);
      ij<ecn> $$4 = $$3.b(po.a);
      $$0.a(
         a,
         new ecn(
            $$4,
            ImmutableList.of(
               Pair.of(ecl.b("bastion/units/air_base", $$2), 1),
               Pair.of(ecl.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ecl.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ecl.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ecn.a.b
         )
      );
      pc.a($$0);
      pb.a($$0);
      pf.a($$0);
      pa.a($$0);
      pe.a($$0);
   }
}
