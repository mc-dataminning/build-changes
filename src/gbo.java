import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gbo {
   private static final BiMap<agg, gbn> i = HashBiMap.create();
   public static final gbn a = a("single", gbt.b);
   public static final gbn b = a("directory", gbq.b);
   public static final gbn c = a("filter", gbu.b);
   public static final gbn d = a("unstitch", gbv.b);
   public static final gbn e = a("paletted_permutations", gbs.b);
   public static Codec<gbn> f = agg.a.flatXmap($$0 -> {
      gbn $$1 = (gbn)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      agg $$1 = (agg)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gbl> g = f.dispatch(gbl::a, gbn::a);
   public static Codec<List<gbl>> h = g.listOf().fieldOf("sources").codec();

   private static gbn a(String $$0, Codec<? extends gbl> $$1) {
      gbn $$2 = new gbn($$1);
      agg $$3 = new agg($$0);
      gbn $$4 = (gbn)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
