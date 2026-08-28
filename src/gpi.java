import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gpi {
   private static final BiMap<alf, gph> i = HashBiMap.create();
   public static final gph a = a("single", gpn.b);
   public static final gph b = a("directory", gpk.b);
   public static final gph c = a("filter", gpo.b);
   public static final gph d = a("unstitch", gpp.b);
   public static final gph e = a("paletted_permutations", gpm.b);
   public static Codec<gph> f = alf.a.flatXmap($$0 -> {
      gph $$1 = (gph)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alf $$1 = (alf)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gpf> g = f.dispatch(gpf::a, gph::a);
   public static Codec<List<gpf>> h = g.listOf().fieldOf("sources").codec();

   private static gph a(String $$0, MapCodec<? extends gpf> $$1) {
      gph $$2 = new gph($$1);
      alf $$3 = new alf($$0);
      gph $$4 = (gph)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
