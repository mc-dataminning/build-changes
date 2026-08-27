import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pv {
   public static final aju<egz> a = qg.a("bastion/starts");

   public static void a(pz<egz> $$0) {
      io<ejo> $$1 = $$0.a(ku.aH);
      in<ejo> $$2 = $$1.b(qh.w);
      io<egz> $$3 = $$0.a(ku.aJ);
      in<egz> $$4 = $$3.b(qg.a);
      $$0.a(
         a,
         new egz(
            $$4,
            ImmutableList.of(
               Pair.of(egx.b("bastion/units/air_base", $$2), 1),
               Pair.of(egx.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(egx.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(egx.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            egz.a.b
         )
      );
      pu.a($$0);
      pt.a($$0);
      px.a($$0);
      ps.a($$0);
      pw.a($$0);
   }
}
