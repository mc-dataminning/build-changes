import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gem {
   private static final BiMap<ahd, gel> i = HashBiMap.create();
   public static final gel a = a("single", ger.b);
   public static final gel b = a("directory", geo.b);
   public static final gel c = a("filter", ges.b);
   public static final gel d = a("unstitch", get.b);
   public static final gel e = a("paletted_permutations", geq.b);
   public static Codec<gel> f = ahd.a.flatXmap($$0 -> {
      gel $$1 = (gel)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ahd $$1 = (ahd)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gej> g = f.dispatch(gej::a, gel::a);
   public static Codec<List<gej>> h = g.listOf().fieldOf("sources").codec();

   private static gel a(String $$0, Codec<? extends gej> $$1) {
      gel $$2 = new gel($$1);
      ahd $$3 = new ahd($$0);
      gel $$4 = (gel)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
