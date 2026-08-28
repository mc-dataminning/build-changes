import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gpx {
   private static final BiMap<akk, gpw> i = HashBiMap.create();
   public static final gpw a = a("single", gqc.b);
   public static final gpw b = a("directory", gpz.b);
   public static final gpw c = a("filter", gqd.b);
   public static final gpw d = a("unstitch", gqe.b);
   public static final gpw e = a("paletted_permutations", gqb.b);
   public static Codec<gpw> f = akk.a.flatXmap($$0 -> {
      gpw $$1 = (gpw)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akk $$1 = (akk)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gpu> g = f.dispatch(gpu::a, gpw::a);
   public static Codec<List<gpu>> h = g.listOf().fieldOf("sources").codec();

   private static gpw a(String $$0, MapCodec<? extends gpu> $$1) {
      gpw $$2 = new gpw($$1);
      akk $$3 = new akk($$0);
      gpw $$4 = (gpw)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
