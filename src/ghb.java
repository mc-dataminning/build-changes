import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class ghb {
   private static final BiMap<aiy, gha> i = HashBiMap.create();
   public static final gha a = a("single", ghg.b);
   public static final gha b = a("directory", ghd.b);
   public static final gha c = a("filter", ghh.b);
   public static final gha d = a("unstitch", ghi.b);
   public static final gha e = a("paletted_permutations", ghf.b);
   public static Codec<gha> f = aiy.a.flatXmap($$0 -> {
      gha $$1 = (gha)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aiy $$1 = (aiy)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<ggy> g = f.dispatch(ggy::a, gha::a);
   public static Codec<List<ggy>> h = g.listOf().fieldOf("sources").codec();

   private static gha a(String $$0, Codec<? extends ggy> $$1) {
      gha $$2 = new gha($$1);
      aiy $$3 = new aiy($$0);
      gha $$4 = (gha)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
