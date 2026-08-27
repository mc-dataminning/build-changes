import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gha {
   private static final BiMap<aiy, ggz> i = HashBiMap.create();
   public static final ggz a = a("single", ghf.b);
   public static final ggz b = a("directory", ghc.b);
   public static final ggz c = a("filter", ghg.b);
   public static final ggz d = a("unstitch", ghh.b);
   public static final ggz e = a("paletted_permutations", ghe.b);
   public static Codec<ggz> f = aiy.a.flatXmap($$0 -> {
      ggz $$1 = (ggz)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aiy $$1 = (aiy)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<ggx> g = f.dispatch(ggx::a, ggz::a);
   public static Codec<List<ggx>> h = g.listOf().fieldOf("sources").codec();

   private static ggz a(String $$0, Codec<? extends ggx> $$1) {
      ggz $$2 = new ggz($$1);
      aiy $$3 = new aiy($$0);
      ggz $$4 = (ggz)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
