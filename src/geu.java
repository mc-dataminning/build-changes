import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class geu {
   private static final BiMap<ahg, get> i = HashBiMap.create();
   public static final get a = a("single", gez.b);
   public static final get b = a("directory", gew.b);
   public static final get c = a("filter", gfa.b);
   public static final get d = a("unstitch", gfb.b);
   public static final get e = a("paletted_permutations", gey.b);
   public static Codec<get> f = ahg.a.flatXmap($$0 -> {
      get $$1 = (get)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ahg $$1 = (ahg)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<ger> g = f.dispatch(ger::a, get::a);
   public static Codec<List<ger>> h = g.listOf().fieldOf("sources").codec();

   private static get a(String $$0, Codec<? extends ger> $$1) {
      get $$2 = new get($$1);
      ahg $$3 = new ahg($$0);
      get $$4 = (get)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
