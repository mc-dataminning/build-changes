import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class ges {
   private static final BiMap<ahg, ger> i = HashBiMap.create();
   public static final ger a = a("single", gex.b);
   public static final ger b = a("directory", geu.b);
   public static final ger c = a("filter", gey.b);
   public static final ger d = a("unstitch", gez.b);
   public static final ger e = a("paletted_permutations", gew.b);
   public static Codec<ger> f = ahg.a.flatXmap($$0 -> {
      ger $$1 = (ger)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ahg $$1 = (ahg)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gep> g = f.dispatch(gep::a, ger::a);
   public static Codec<List<gep>> h = g.listOf().fieldOf("sources").codec();

   private static ger a(String $$0, Codec<? extends gep> $$1) {
      ger $$2 = new ger($$1);
      ahg $$3 = new ahg($$0);
      ger $$4 = (ger)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
