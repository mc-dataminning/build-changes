import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class fzl {
   private static final BiMap<aew, fzk> i = HashBiMap.create();
   public static final fzk a = a("single", fzq.b);
   public static final fzk b = a("directory", fzn.b);
   public static final fzk c = a("filter", fzr.b);
   public static final fzk d = a("unstitch", fzs.b);
   public static final fzk e = a("paletted_permutations", fzp.b);
   public static Codec<fzk> f = aew.a.flatXmap($$0 -> {
      fzk $$1 = (fzk)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aew $$1 = (aew)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<fzi> g = f.dispatch(fzi::a, fzk::a);
   public static Codec<List<fzi>> h = g.listOf().fieldOf("sources").codec();

   private static fzk a(String $$0, Codec<? extends fzi> $$1) {
      fzk $$2 = new fzk($$1);
      aew $$3 = new aew($$0);
      fzk $$4 = (fzk)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
