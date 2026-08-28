import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gpp {
   private static final BiMap<akk, gpo> i = HashBiMap.create();
   public static final gpo a = a("single", gpu.b);
   public static final gpo b = a("directory", gpr.b);
   public static final gpo c = a("filter", gpv.b);
   public static final gpo d = a("unstitch", gpw.b);
   public static final gpo e = a("paletted_permutations", gpt.b);
   public static Codec<gpo> f = akk.a.flatXmap($$0 -> {
      gpo $$1 = (gpo)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akk $$1 = (akk)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gpm> g = f.dispatch(gpm::a, gpo::a);
   public static Codec<List<gpm>> h = g.listOf().fieldOf("sources").codec();

   private static gpo a(String $$0, MapCodec<? extends gpm> $$1) {
      gpo $$2 = new gpo($$1);
      akk $$3 = new akk($$0);
      gpo $$4 = (gpo)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
