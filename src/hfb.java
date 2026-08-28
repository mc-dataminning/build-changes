import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hfb {
   private static final BiMap<akv, hfa> i = HashBiMap.create();
   public static final hfa a = a("single", hfg.b);
   public static final hfa b = a("directory", hfd.b);
   public static final hfa c = a("filter", hfh.b);
   public static final hfa d = a("unstitch", hfi.b);
   public static final hfa e = a("paletted_permutations", hff.b);
   public static Codec<hfa> f = akv.a.flatXmap($$0 -> {
      hfa $$1 = (hfa)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akv $$1 = (akv)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hey> g = f.dispatch(hey::a, hfa::a);
   public static Codec<List<hey>> h = g.listOf().fieldOf("sources").codec();

   private static hfa a(String $$0, MapCodec<? extends hey> $$1) {
      hfa $$2 = new hfa($$1);
      akv $$3 = akv.b($$0);
      hfa $$4 = (hfa)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
