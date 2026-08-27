import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gah {
   private static final BiMap<afw, gag> i = HashBiMap.create();
   public static final gag a = a("single", gam.b);
   public static final gag b = a("directory", gaj.b);
   public static final gag c = a("filter", gan.b);
   public static final gag d = a("unstitch", gao.b);
   public static final gag e = a("paletted_permutations", gal.b);
   public static Codec<gag> f = afw.a.flatXmap($$0 -> {
      gag $$1 = (gag)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      afw $$1 = (afw)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gae> g = f.dispatch(gae::a, gag::a);
   public static Codec<List<gae>> h = g.listOf().fieldOf("sources").codec();

   private static gag a(String $$0, Codec<? extends gae> $$1) {
      gag $$2 = new gag($$1);
      afw $$3 = new afw($$0);
      gag $$4 = (gag)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
