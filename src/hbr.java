import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hbr {
   private static final BiMap<alz, hbq> i = HashBiMap.create();
   public static final hbq a = a("single", hbw.b);
   public static final hbq b = a("directory", hbt.b);
   public static final hbq c = a("filter", hbx.b);
   public static final hbq d = a("unstitch", hby.b);
   public static final hbq e = a("paletted_permutations", hbv.b);
   public static Codec<hbq> f = alz.a.flatXmap($$0 -> {
      hbq $$1 = (hbq)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alz $$1 = (alz)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hbo> g = f.dispatch(hbo::a, hbq::a);
   public static Codec<List<hbo>> h = g.listOf().fieldOf("sources").codec();

   private static hbq a(String $$0, MapCodec<? extends hbo> $$1) {
      hbq $$2 = new hbq($$1);
      alz $$3 = alz.b($$0);
      hbq $$4 = (hbq)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
