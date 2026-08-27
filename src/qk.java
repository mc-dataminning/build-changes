import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qk {
   public static final akm<eiu> a = qv.a("bastion/starts");

   public static void a(qo<eiu> $$0) {
      iy<elj> $$1 = $$0.a(lf.aK);
      ix<elj> $$2 = $$1.b(qw.w);
      iy<eiu> $$3 = $$0.a(lf.aM);
      ix<eiu> $$4 = $$3.b(qv.a);
      $$0.a(
         a,
         new eiu(
            $$4,
            ImmutableList.of(
               Pair.of(eis.b("bastion/units/air_base", $$2), 1),
               Pair.of(eis.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(eis.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(eis.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            eiu.a.b
         )
      );
      qj.a($$0);
      qi.a($$0);
      qm.a($$0);
      qh.a($$0);
      ql.a($$0);
   }
}
