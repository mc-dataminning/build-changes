import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qm {
   public static final aks<elc> a = ra.a("bastion/starts");

   public static void a(qq<elc> $$0) {
      jb<enr> $$1 = $$0.a(li.aK);
      ja<enr> $$2 = $$1.b(rc.C);
      jb<elc> $$3 = $$0.a(li.aM);
      ja<elc> $$4 = $$3.b(ra.a);
      $$0.a(
         a,
         new elc(
            $$4,
            ImmutableList.of(
               Pair.of(ela.b("bastion/units/air_base", $$2), 1),
               Pair.of(ela.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ela.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ela.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            elc.a.b
         )
      );
      ql.a($$0);
      qk.a($$0);
      qo.a($$0);
      qj.a($$0);
      qn.a($$0);
   }
}
