import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class fvb {
   private static final BiMap<acq, fva> i = HashBiMap.create();
   public static final fva a = a("single", fvg.b);
   public static final fva b = a("directory", fvd.b);
   public static final fva c = a("filter", fvh.b);
   public static final fva d = a("unstitch", fvi.b);
   public static final fva e = a("paletted_permutations", fvf.b);
   public static Codec<fva> f = acq.a.flatXmap($$0 -> {
      fva $$1 = (fva)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      acq $$1 = (acq)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<fuz> g = f.dispatch(fuz::a, fva::a);
   public static Codec<List<fuz>> h = g.listOf().fieldOf("sources").codec();

   private static fva a(String $$0, Codec<? extends fuz> $$1) {
      fva $$2 = new fva($$1);
      acq $$3 = new acq($$0);
      fva $$4 = (fva)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
