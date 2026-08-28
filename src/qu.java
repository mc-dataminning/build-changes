import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qu {
   public static final alh<enh> a = rf.a("bastion/starts");

   public static void a(qy<enh> $$0) {
      jr<epx> $$1 = $$0.a(lz.aT);
      jq<epx> $$2 = $$1.b(rg.w);
      jr<enh> $$3 = $$0.a(lz.aV);
      jq<enh> $$4 = $$3.b(rf.a);
      $$0.a(
         a,
         new enh(
            $$4,
            ImmutableList.of(
               Pair.of(enf.b("bastion/units/air_base", $$2), 1),
               Pair.of(enf.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(enf.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(enf.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            enh.a.b
         )
      );
      qt.a($$0);
      qs.a($$0);
      qw.a($$0);
      qr.a($$0);
      qv.a($$0);
   }
}
