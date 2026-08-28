import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gxn {
   private static final BiMap<ale, gxm> i = HashBiMap.create();
   public static final gxm a = a("single", gxs.b);
   public static final gxm b = a("directory", gxp.b);
   public static final gxm c = a("filter", gxt.b);
   public static final gxm d = a("unstitch", gxu.b);
   public static final gxm e = a("paletted_permutations", gxr.b);
   public static Codec<gxm> f = ale.a.flatXmap($$0 -> {
      gxm $$1 = (gxm)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ale $$1 = (ale)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gxk> g = f.dispatch(gxk::a, gxm::a);
   public static Codec<List<gxk>> h = g.listOf().fieldOf("sources").codec();

   private static gxm a(String $$0, MapCodec<? extends gxk> $$1) {
      gxm $$2 = new gxm($$1);
      ale $$3 = ale.b($$0);
      gxm $$4 = (gxm)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
