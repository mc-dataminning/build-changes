import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qt {
   public static final alg<enb> a = re.a("bastion/starts");

   public static void a(qx<enb> $$0) {
      jq<epr> $$1 = $$0.a(ly.aT);
      jp<epr> $$2 = $$1.b(rf.w);
      jq<enb> $$3 = $$0.a(ly.aV);
      jp<enb> $$4 = $$3.b(re.a);
      $$0.a(
         a,
         new enb(
            $$4,
            ImmutableList.of(
               Pair.of(emz.b("bastion/units/air_base", $$2), 1),
               Pair.of(emz.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(emz.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(emz.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            enb.a.b
         )
      );
      qs.a($$0);
      qr.a($$0);
      qv.a($$0);
      qq.a($$0);
      qu.a($$0);
   }
}
