import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gqs {
   private static final BiMap<akr, gqr> i = HashBiMap.create();
   public static final gqr a = a("single", gqx.b);
   public static final gqr b = a("directory", gqu.b);
   public static final gqr c = a("filter", gqy.b);
   public static final gqr d = a("unstitch", gqz.b);
   public static final gqr e = a("paletted_permutations", gqw.b);
   public static Codec<gqr> f = akr.a.flatXmap($$0 -> {
      gqr $$1 = (gqr)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akr $$1 = (akr)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gqp> g = f.dispatch(gqp::a, gqr::a);
   public static Codec<List<gqp>> h = g.listOf().fieldOf("sources").codec();

   private static gqr a(String $$0, MapCodec<? extends gqp> $$1) {
      gqr $$2 = new gqr($$1);
      akr $$3 = akr.b($$0);
      gqr $$4 = (gqr)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
