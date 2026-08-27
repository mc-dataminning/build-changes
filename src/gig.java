import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gig {
   private static final BiMap<ajc, gif> i = HashBiMap.create();
   public static final gif a = a("single", gil.b);
   public static final gif b = a("directory", gii.b);
   public static final gif c = a("filter", gim.b);
   public static final gif d = a("unstitch", gin.b);
   public static final gif e = a("paletted_permutations", gik.b);
   public static Codec<gif> f = ajc.a.flatXmap($$0 -> {
      gif $$1 = (gif)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ajc $$1 = (ajc)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gid> g = f.dispatch(gid::a, gif::a);
   public static Codec<List<gid>> h = g.listOf().fieldOf("sources").codec();

   private static gif a(String $$0, Codec<? extends gid> $$1) {
      gif $$2 = new gif($$1);
      ajc $$3 = new ajc($$0);
      gif $$4 = (gif)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
