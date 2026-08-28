import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gza {
   private static final BiMap<all, gyz> i = HashBiMap.create();
   public static final gyz a = a("single", gzf.b);
   public static final gyz b = a("directory", gzc.b);
   public static final gyz c = a("filter", gzg.b);
   public static final gyz d = a("unstitch", gzh.b);
   public static final gyz e = a("paletted_permutations", gze.b);
   public static Codec<gyz> f = all.a.flatXmap($$0 -> {
      gyz $$1 = (gyz)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      all $$1 = (all)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gyx> g = f.dispatch(gyx::a, gyz::a);
   public static Codec<List<gyx>> h = g.listOf().fieldOf("sources").codec();

   private static gyz a(String $$0, MapCodec<? extends gyx> $$1) {
      gyz $$2 = new gyz($$1);
      all $$3 = all.b($$0);
      gyz $$4 = (gyz)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
