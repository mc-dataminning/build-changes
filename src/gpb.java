import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gpb {
   private static final BiMap<alb, gpa> i = HashBiMap.create();
   public static final gpa a = a("single", gpg.b);
   public static final gpa b = a("directory", gpd.b);
   public static final gpa c = a("filter", gph.b);
   public static final gpa d = a("unstitch", gpi.b);
   public static final gpa e = a("paletted_permutations", gpf.b);
   public static Codec<gpa> f = alb.a.flatXmap($$0 -> {
      gpa $$1 = (gpa)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alb $$1 = (alb)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<goy> g = f.dispatch(goy::a, gpa::a);
   public static Codec<List<goy>> h = g.listOf().fieldOf("sources").codec();

   private static gpa a(String $$0, MapCodec<? extends goy> $$1) {
      gpa $$2 = new gpa($$1);
      alb $$3 = new alb($$0);
      gpa $$4 = (gpa)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
