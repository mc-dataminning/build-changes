import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gpe {
   private static final BiMap<ale, gpd> i = HashBiMap.create();
   public static final gpd a = a("single", gpj.b);
   public static final gpd b = a("directory", gpg.b);
   public static final gpd c = a("filter", gpk.b);
   public static final gpd d = a("unstitch", gpl.b);
   public static final gpd e = a("paletted_permutations", gpi.b);
   public static Codec<gpd> f = ale.a.flatXmap($$0 -> {
      gpd $$1 = (gpd)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ale $$1 = (ale)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gpb> g = f.dispatch(gpb::a, gpd::a);
   public static Codec<List<gpb>> h = g.listOf().fieldOf("sources").codec();

   private static gpd a(String $$0, MapCodec<? extends gpb> $$1) {
      gpd $$2 = new gpd($$1);
      ale $$3 = new ale($$0);
      gpd $$4 = (gpd)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
