import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hez {
   private static final BiMap<akv, hey> i = HashBiMap.create();
   public static final hey a = a("single", hfe.b);
   public static final hey b = a("directory", hfb.b);
   public static final hey c = a("filter", hff.b);
   public static final hey d = a("unstitch", hfg.b);
   public static final hey e = a("paletted_permutations", hfd.b);
   public static Codec<hey> f = akv.a.flatXmap($$0 -> {
      hey $$1 = (hey)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akv $$1 = (akv)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hew> g = f.dispatch(hew::a, hey::a);
   public static Codec<List<hew>> h = g.listOf().fieldOf("sources").codec();

   private static hey a(String $$0, MapCodec<? extends hew> $$1) {
      hey $$2 = new hey($$1);
      akv $$3 = akv.b($$0);
      hey $$4 = (hey)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
