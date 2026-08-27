import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class glz {
   private static final BiMap<ajv, gly> i = HashBiMap.create();
   public static final gly a = a("single", gme.b);
   public static final gly b = a("directory", gmb.b);
   public static final gly c = a("filter", gmf.b);
   public static final gly d = a("unstitch", gmg.b);
   public static final gly e = a("paletted_permutations", gmd.b);
   public static Codec<gly> f = ajv.a.flatXmap($$0 -> {
      gly $$1 = (gly)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ajv $$1 = (ajv)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<glw> g = f.dispatch(glw::a, gly::a);
   public static Codec<List<glw>> h = g.listOf().fieldOf("sources").codec();

   private static gly a(String $$0, Codec<? extends glw> $$1) {
      gly $$2 = new gly($$1);
      ajv $$3 = new ajv($$0);
      gly $$4 = (gly)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
