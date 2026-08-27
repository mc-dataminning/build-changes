import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class fzh {
   private static final BiMap<aez, fzg> i = HashBiMap.create();
   public static final fzg a = a("single", fzm.b);
   public static final fzg b = a("directory", fzj.b);
   public static final fzg c = a("filter", fzn.b);
   public static final fzg d = a("unstitch", fzo.b);
   public static final fzg e = a("paletted_permutations", fzl.b);
   public static Codec<fzg> f = aez.a.flatXmap($$0 -> {
      fzg $$1 = (fzg)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aez $$1 = (aez)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<fze> g = f.dispatch(fze::a, fzg::a);
   public static Codec<List<fze>> h = g.listOf().fieldOf("sources").codec();

   private static fzg a(String $$0, Codec<? extends fze> $$1) {
      fzg $$2 = new fzg($$1);
      aez $$3 = new aez($$0);
      fzg $$4 = (fzg)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
