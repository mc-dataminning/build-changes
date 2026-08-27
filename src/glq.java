import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class glq {
   private static final BiMap<ajt, glp> i = HashBiMap.create();
   public static final glp a = a("single", glv.b);
   public static final glp b = a("directory", gls.b);
   public static final glp c = a("filter", glw.b);
   public static final glp d = a("unstitch", glx.b);
   public static final glp e = a("paletted_permutations", glu.b);
   public static Codec<glp> f = ajt.a.flatXmap($$0 -> {
      glp $$1 = (glp)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ajt $$1 = (ajt)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gln> g = f.dispatch(gln::a, glp::a);
   public static Codec<List<gln>> h = g.listOf().fieldOf("sources").codec();

   private static glp a(String $$0, Codec<? extends gln> $$1) {
      glp $$2 = new glp($$1);
      ajt $$3 = new ajt($$0);
      glp $$4 = (glp)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
