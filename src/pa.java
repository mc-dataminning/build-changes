import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pa {
   public static final ahf<eap> a = pl.a("bastion/starts");

   public static void a(pe<eap> $$0) {
      ii<ede> $$1 = $$0.a(ke.aE);
      ih<ede> $$2 = $$1.b(pm.w);
      ii<eap> $$3 = $$0.a(ke.aG);
      ih<eap> $$4 = $$3.b(pl.a);
      $$0.a(
         a,
         new eap(
            $$4,
            ImmutableList.of(
               Pair.of(ean.b("bastion/units/air_base", $$2), 1),
               Pair.of(ean.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(ean.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(ean.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            eap.a.b
         )
      );
      oz.a($$0);
      oy.a($$0);
      pc.a($$0);
      ox.a($$0);
      pb.a($$0);
   }
}
