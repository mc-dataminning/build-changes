import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hbn {
   private static final BiMap<alp, hbm> i = HashBiMap.create();
   public static final hbm a = a("single", hbs.b);
   public static final hbm b = a("directory", hbp.b);
   public static final hbm c = a("filter", hbt.b);
   public static final hbm d = a("unstitch", hbu.b);
   public static final hbm e = a("paletted_permutations", hbr.b);
   public static Codec<hbm> f = alp.a.flatXmap($$0 -> {
      hbm $$1 = (hbm)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alp $$1 = (alp)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hbk> g = f.dispatch(hbk::a, hbm::a);
   public static Codec<List<hbk>> h = g.listOf().fieldOf("sources").codec();

   private static hbm a(String $$0, MapCodec<? extends hbk> $$1) {
      hbm $$2 = new hbm($$1);
      alp $$3 = alp.b($$0);
      hbm $$4 = (hbm)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
