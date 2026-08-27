import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class np {
   public static final aex<dwt> a = oa.a("bastion/starts");

   public static void a(nt<dwt> $$0) {
      hh<dzb> $$1 = $$0.a(je.aA);
      hg<dzb> $$2 = $$1.b(ob.w);
      hh<dwt> $$3 = $$0.a(je.aC);
      hg<dwt> $$4 = $$3.b(oa.a);
      $$0.a(
         a,
         new dwt(
            $$4,
            ImmutableList.of(
               Pair.of(dwr.b("bastion/units/air_base", $$2), 1),
               Pair.of(dwr.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(dwr.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(dwr.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            dwt.a.b
         )
      );
      no.a($$0);
      nn.a($$0);
      nr.a($$0);
      nm.a($$0);
      nq.a($$0);
   }
}
