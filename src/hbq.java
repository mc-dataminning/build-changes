import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hbq {
   private static final BiMap<alz, hbp> i = HashBiMap.create();
   public static final hbp a = a("single", hbv.b);
   public static final hbp b = a("directory", hbs.b);
   public static final hbp c = a("filter", hbw.b);
   public static final hbp d = a("unstitch", hbx.b);
   public static final hbp e = a("paletted_permutations", hbu.b);
   public static Codec<hbp> f = alz.a.flatXmap($$0 -> {
      hbp $$1 = (hbp)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alz $$1 = (alz)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hbn> g = f.dispatch(hbn::a, hbp::a);
   public static Codec<List<hbn>> h = g.listOf().fieldOf("sources").codec();

   private static hbp a(String $$0, MapCodec<? extends hbn> $$1) {
      hbp $$2 = new hbp($$1);
      alz $$3 = alz.b($$0);
      hbp $$4 = (hbp)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
