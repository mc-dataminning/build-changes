import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class get {
   private static final BiMap<ahg, ges> i = HashBiMap.create();
   public static final ges a = a("single", gey.b);
   public static final ges b = a("directory", gev.b);
   public static final ges c = a("filter", gez.b);
   public static final ges d = a("unstitch", gfa.b);
   public static final ges e = a("paletted_permutations", gex.b);
   public static Codec<ges> f = ahg.a.flatXmap($$0 -> {
      ges $$1 = (ges)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ahg $$1 = (ahg)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<geq> g = f.dispatch(geq::a, ges::a);
   public static Codec<List<geq>> h = g.listOf().fieldOf("sources").codec();

   private static ges a(String $$0, Codec<? extends geq> $$1) {
      ges $$2 = new ges($$1);
      ahg $$3 = new ahg($$0);
      ges $$4 = (ges)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
