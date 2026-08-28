import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gpf {
   private static final BiMap<ale, gpe> i = HashBiMap.create();
   public static final gpe a = a("single", gpk.b);
   public static final gpe b = a("directory", gph.b);
   public static final gpe c = a("filter", gpl.b);
   public static final gpe d = a("unstitch", gpm.b);
   public static final gpe e = a("paletted_permutations", gpj.b);
   public static Codec<gpe> f = ale.a.flatXmap($$0 -> {
      gpe $$1 = (gpe)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ale $$1 = (ale)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gpc> g = f.dispatch(gpc::a, gpe::a);
   public static Codec<List<gpc>> h = g.listOf().fieldOf("sources").codec();

   private static gpe a(String $$0, MapCodec<? extends gpc> $$1) {
      gpe $$2 = new gpe($$1);
      ale $$3 = new ale($$0);
      gpe $$4 = (gpe)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
