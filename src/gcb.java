import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gcb {
   private static final BiMap<agi, gca> i = HashBiMap.create();
   public static final gca a = a("single", gcg.b);
   public static final gca b = a("directory", gcd.b);
   public static final gca c = a("filter", gch.b);
   public static final gca d = a("unstitch", gci.b);
   public static final gca e = a("paletted_permutations", gcf.b);
   public static Codec<gca> f = agi.a.flatXmap($$0 -> {
      gca $$1 = (gca)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      agi $$1 = (agi)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gby> g = f.dispatch(gby::a, gca::a);
   public static Codec<List<gby>> h = g.listOf().fieldOf("sources").codec();

   private static gca a(String $$0, Codec<? extends gby> $$1) {
      gca $$2 = new gca($$1);
      agi $$3 = new agi($$0);
      gca $$4 = (gca)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
