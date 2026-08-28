import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gpv {
   private static final BiMap<akk, gpu> i = HashBiMap.create();
   public static final gpu a = a("single", gqa.b);
   public static final gpu b = a("directory", gpx.b);
   public static final gpu c = a("filter", gqb.b);
   public static final gpu d = a("unstitch", gqc.b);
   public static final gpu e = a("paletted_permutations", gpz.b);
   public static Codec<gpu> f = akk.a.flatXmap($$0 -> {
      gpu $$1 = (gpu)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akk $$1 = (akk)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gps> g = f.dispatch(gps::a, gpu::a);
   public static Codec<List<gps>> h = g.listOf().fieldOf("sources").codec();

   private static gpu a(String $$0, MapCodec<? extends gps> $$1) {
      gpu $$2 = new gpu($$1);
      akk $$3 = new akk($$0);
      gpu $$4 = (gpu)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
