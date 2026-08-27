import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qf {
   public static final ake<ehp> a = qq.a("bastion/starts");

   public static void a(qj<ehp> $$0) {
      iw<eke> $$1 = $$0.a(ld.aJ);
      iv<eke> $$2 = $$1.b(qr.w);
      iw<ehp> $$3 = $$0.a(ld.aL);
      iv<ehp> $$4 = $$3.b(qq.a);
      $$0.a(
         a,
         new ehp(
            $$4,
            ImmutableList.of(
               Pair.of(ehn.b("bastion/units/air_base", $$2), 1),
               Pair.of(ehn.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ehn.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ehn.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            ehp.a.b
         )
      );
      qe.a($$0);
      qd.a($$0);
      qh.a($$0);
      qc.a($$0);
      qg.a($$0);
   }
}
