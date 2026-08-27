import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gcg {
   private static final BiMap<agm, gcf> i = HashBiMap.create();
   public static final gcf a = a("single", gcl.b);
   public static final gcf b = a("directory", gci.b);
   public static final gcf c = a("filter", gcm.b);
   public static final gcf d = a("unstitch", gcn.b);
   public static final gcf e = a("paletted_permutations", gck.b);
   public static Codec<gcf> f = agm.a.flatXmap($$0 -> {
      gcf $$1 = (gcf)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      agm $$1 = (agm)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gcd> g = f.dispatch(gcd::a, gcf::a);
   public static Codec<List<gcd>> h = g.listOf().fieldOf("sources").codec();

   private static gcf a(String $$0, Codec<? extends gcd> $$1) {
      gcf $$2 = new gcf($$1);
      agm $$3 = new agm($$0);
      gcf $$4 = (gcf)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
