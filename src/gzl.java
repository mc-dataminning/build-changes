import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gzl {
   private static final BiMap<alj, gzk> i = HashBiMap.create();
   public static final gzk a = a("single", gzq.b);
   public static final gzk b = a("directory", gzn.b);
   public static final gzk c = a("filter", gzr.b);
   public static final gzk d = a("unstitch", gzs.b);
   public static final gzk e = a("paletted_permutations", gzp.b);
   public static Codec<gzk> f = alj.a.flatXmap($$0 -> {
      gzk $$1 = (gzk)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alj $$1 = (alj)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gzi> g = f.dispatch(gzi::a, gzk::a);
   public static Codec<List<gzi>> h = g.listOf().fieldOf("sources").codec();

   private static gzk a(String $$0, MapCodec<? extends gzi> $$1) {
      gzk $$2 = new gzk($$1);
      alj $$3 = alj.b($$0);
      gzk $$4 = (gzk)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
