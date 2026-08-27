import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class fzg {
   private static final BiMap<aeu, fzf> i = HashBiMap.create();
   public static final fzf a = a("single", fzl.b);
   public static final fzf b = a("directory", fzi.b);
   public static final fzf c = a("filter", fzm.b);
   public static final fzf d = a("unstitch", fzn.b);
   public static final fzf e = a("paletted_permutations", fzk.b);
   public static Codec<fzf> f = aeu.a.flatXmap($$0 -> {
      fzf $$1 = (fzf)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aeu $$1 = (aeu)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<fzd> g = f.dispatch(fzd::a, fzf::a);
   public static Codec<List<fzd>> h = g.listOf().fieldOf("sources").codec();

   private static fzf a(String $$0, Codec<? extends fzd> $$1) {
      fzf $$2 = new fzf($$1);
      aeu $$3 = new aeu($$0);
      fzf $$4 = (fzf)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
