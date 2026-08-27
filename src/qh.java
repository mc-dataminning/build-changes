import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qh {
   public static final akg<ehy> a = qs.a("bastion/starts");

   public static void a(ql<ehy> $$0) {
      ix<ekn> $$1 = $$0.a(le.aK);
      iw<ekn> $$2 = $$1.b(qt.w);
      ix<ehy> $$3 = $$0.a(le.aM);
      iw<ehy> $$4 = $$3.b(qs.a);
      $$0.a(
         a,
         new ehy(
            $$4,
            ImmutableList.of(
               Pair.of(ehw.b("bastion/units/air_base", $$2), 1),
               Pair.of(ehw.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ehw.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ehw.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ehy.a.b
         )
      );
      qg.a($$0);
      qf.a($$0);
      qj.a($$0);
      qe.a($$0);
      qi.a($$0);
   }
}
