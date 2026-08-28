import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gwr {
   private static final BiMap<alb, gwq> i = HashBiMap.create();
   public static final gwq a = a("single", gww.b);
   public static final gwq b = a("directory", gwt.b);
   public static final gwq c = a("filter", gwx.b);
   public static final gwq d = a("unstitch", gwy.b);
   public static final gwq e = a("paletted_permutations", gwv.b);
   public static Codec<gwq> f = alb.a.flatXmap($$0 -> {
      gwq $$1 = (gwq)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alb $$1 = (alb)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gwo> g = f.dispatch(gwo::a, gwq::a);
   public static Codec<List<gwo>> h = g.listOf().fieldOf("sources").codec();

   private static gwq a(String $$0, MapCodec<? extends gwo> $$1) {
      gwq $$2 = new gwq($$1);
      alb $$3 = alb.b($$0);
      gwq $$4 = (gwq)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
