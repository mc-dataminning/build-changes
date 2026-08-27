import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class np {
   public static final aew<dwr> a = oa.a("bastion/starts");

   public static void a(nt<dwr> $$0) {
      hh<dyz> $$1 = $$0.a(je.aA);
      hg<dyz> $$2 = $$1.b(ob.w);
      hh<dwr> $$3 = $$0.a(je.aC);
      hg<dwr> $$4 = $$3.b(oa.a);
      $$0.a(
         a,
         new dwr(
            $$4,
            ImmutableList.of(
               Pair.of(dwp.b("bastion/units/air_base", $$2), 1),
               Pair.of(dwp.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(dwp.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(dwp.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            dwr.a.b
         )
      );
      no.a($$0);
      nn.a($$0);
      nr.a($$0);
      nm.a($$0);
      nq.a($$0);
   }
}
