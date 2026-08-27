import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class fys {
   private static final BiMap<aer, fyr> i = HashBiMap.create();
   public static final fyr a = a("single", fyx.b);
   public static final fyr b = a("directory", fyu.b);
   public static final fyr c = a("filter", fyy.b);
   public static final fyr d = a("unstitch", fyz.b);
   public static final fyr e = a("paletted_permutations", fyw.b);
   public static Codec<fyr> f = aer.a.flatXmap($$0 -> {
      fyr $$1 = (fyr)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aer $$1 = (aer)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<fyp> g = f.dispatch(fyp::a, fyr::a);
   public static Codec<List<fyp>> h = g.listOf().fieldOf("sources").codec();

   private static fyr a(String $$0, Codec<? extends fyp> $$1) {
      fyr $$2 = new fyr($$1);
      aer $$3 = new aer($$0);
      fyr $$4 = (fyr)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
