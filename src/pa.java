import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pa {
   public static final ahf<eao> a = pl.a("bastion/starts");

   public static void a(pe<eao> $$0) {
      ii<edd> $$1 = $$0.a(ke.aE);
      ih<edd> $$2 = $$1.b(pm.w);
      ii<eao> $$3 = $$0.a(ke.aG);
      ih<eao> $$4 = $$3.b(pl.a);
      $$0.a(
         a,
         new eao(
            $$4,
            ImmutableList.of(
               Pair.of(eam.b("bastion/units/air_base", $$2), 1),
               Pair.of(eam.b("bastion/hoglin_stable/air_base", $$2), 1),
               Pair.of(eam.b("bastion/treasure/big_air_full", $$2), 1),
               Pair.of(eam.b("bastion/bridge/starting_pieces/entrance_base", $$2), 1)
            ),
            eao.a.b
         )
      );
      oz.a($$0);
      oy.a($$0);
      pc.a($$0);
      ox.a($$0);
      pb.a($$0);
   }
}
