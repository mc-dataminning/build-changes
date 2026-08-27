import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gjj {
   private static final BiMap<ajh, gji> i = HashBiMap.create();
   public static final gji a = a("single", gjo.b);
   public static final gji b = a("directory", gjl.b);
   public static final gji c = a("filter", gjp.b);
   public static final gji d = a("unstitch", gjq.b);
   public static final gji e = a("paletted_permutations", gjn.b);
   public static Codec<gji> f = ajh.a.flatXmap($$0 -> {
      gji $$1 = (gji)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ajh $$1 = (ajh)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gjg> g = f.dispatch(gjg::a, gji::a);
   public static Codec<List<gjg>> h = g.listOf().fieldOf("sources").codec();

   private static gji a(String $$0, Codec<? extends gjg> $$1) {
      gji $$2 = new gji($$1);
      ajh $$3 = new ajh($$0);
      gji $$4 = (gji)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
