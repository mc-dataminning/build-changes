import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hfa {
   private static final BiMap<akv, hez> i = HashBiMap.create();
   public static final hez a = a("single", hff.b);
   public static final hez b = a("directory", hfc.b);
   public static final hez c = a("filter", hfg.b);
   public static final hez d = a("unstitch", hfh.b);
   public static final hez e = a("paletted_permutations", hfe.b);
   public static Codec<hez> f = akv.a.flatXmap($$0 -> {
      hez $$1 = (hez)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akv $$1 = (akv)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hex> g = f.dispatch(hex::a, hez::a);
   public static Codec<List<hex>> h = g.listOf().fieldOf("sources").codec();

   private static hez a(String $$0, MapCodec<? extends hex> $$1) {
      hez $$2 = new hez($$1);
      akv $$3 = akv.b($$0);
      hez $$4 = (hez)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
