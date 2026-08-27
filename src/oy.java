import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class oy {
   public static final ahc<eai> a = pj.a("bastion/starts");

   public static void a(pc<eai> $$0) {
      ii<ecx> $$1 = $$0.a(ke.aE);
      ih<ecx> $$2 = $$1.b(pk.w);
      ii<eai> $$3 = $$0.a(ke.aG);
      ih<eai> $$4 = $$3.b(pj.a);
      $$0.a(
         a,
         new eai(
            $$4,
            ImmutableList.of(
               Pair.of(eag.b("bastion/units/air_base", $$2), 1),
               Pair.of(eag.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(eag.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(eag.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            eai.a.b
         )
      );
      ox.a($$0);
      ow.a($$0);
      pa.a($$0);
      ov.a($$0);
      oz.a($$0);
   }
}
