import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qp {
   public static final alb<emm> a = ra.a("bastion/starts");

   public static void a(qt<emm> $$0) {
      jo<epc> $$1 = $$0.a(lv.aT);
      jn<epc> $$2 = $$1.b(rb.w);
      jo<emm> $$3 = $$0.a(lv.aV);
      jn<emm> $$4 = $$3.b(ra.a);
      $$0.a(
         a,
         new emm(
            $$4,
            ImmutableList.of(
               Pair.of(emk.b("bastion/units/air_base", $$2), 1),
               Pair.of(emk.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(emk.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(emk.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            emm.a.b
         )
      );
      qo.a($$0);
      qn.a($$0);
      qr.a($$0);
      qm.a($$0);
      qq.a($$0);
   }
}
