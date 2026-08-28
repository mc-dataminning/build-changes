import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gpg {
   private static final BiMap<alf, gpf> i = HashBiMap.create();
   public static final gpf a = a("single", gpl.b);
   public static final gpf b = a("directory", gpi.b);
   public static final gpf c = a("filter", gpm.b);
   public static final gpf d = a("unstitch", gpn.b);
   public static final gpf e = a("paletted_permutations", gpk.b);
   public static Codec<gpf> f = alf.a.flatXmap($$0 -> {
      gpf $$1 = (gpf)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alf $$1 = (alf)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gpd> g = f.dispatch(gpd::a, gpf::a);
   public static Codec<List<gpd>> h = g.listOf().fieldOf("sources").codec();

   private static gpf a(String $$0, MapCodec<? extends gpd> $$1) {
      gpf $$2 = new gpf($$1);
      alf $$3 = new alf($$0);
      gpf $$4 = (gpf)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
