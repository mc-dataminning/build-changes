import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hbs {
   private static final BiMap<alz, hbr> i = HashBiMap.create();
   public static final hbr a = a("single", hbx.b);
   public static final hbr b = a("directory", hbu.b);
   public static final hbr c = a("filter", hby.b);
   public static final hbr d = a("unstitch", hbz.b);
   public static final hbr e = a("paletted_permutations", hbw.b);
   public static Codec<hbr> f = alz.a.flatXmap($$0 -> {
      hbr $$1 = (hbr)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alz $$1 = (alz)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hbp> g = f.dispatch(hbp::a, hbr::a);
   public static Codec<List<hbp>> h = g.listOf().fieldOf("sources").codec();

   private static hbr a(String $$0, MapCodec<? extends hbp> $$1) {
      hbr $$2 = new hbr($$1);
      alz $$3 = alz.b($$0);
      hbr $$4 = (hbr)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
