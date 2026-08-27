import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class fzb {
   private static final BiMap<aer, fza> i = HashBiMap.create();
   public static final fza a = a("single", fzg.b);
   public static final fza b = a("directory", fzd.b);
   public static final fza c = a("filter", fzh.b);
   public static final fza d = a("unstitch", fzi.b);
   public static final fza e = a("paletted_permutations", fzf.b);
   public static Codec<fza> f = aer.a.flatXmap($$0 -> {
      fza $$1 = (fza)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aer $$1 = (aer)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<fyy> g = f.dispatch(fyy::a, fza::a);
   public static Codec<List<fyy>> h = g.listOf().fieldOf("sources").codec();

   private static fza a(String $$0, Codec<? extends fyy> $$1) {
      fza $$2 = new fza($$1);
      aer $$3 = new aer($$0);
      fza $$4 = (fza)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
