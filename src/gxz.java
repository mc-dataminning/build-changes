import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gxz {
   private static final BiMap<alh, gxy> i = HashBiMap.create();
   public static final gxy a = a("single", gye.b);
   public static final gxy b = a("directory", gyb.b);
   public static final gxy c = a("filter", gyf.b);
   public static final gxy d = a("unstitch", gyg.b);
   public static final gxy e = a("paletted_permutations", gyd.b);
   public static Codec<gxy> f = alh.a.flatXmap($$0 -> {
      gxy $$1 = (gxy)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alh $$1 = (alh)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gxw> g = f.dispatch(gxw::a, gxy::a);
   public static Codec<List<gxw>> h = g.listOf().fieldOf("sources").codec();

   private static gxy a(String $$0, MapCodec<? extends gxw> $$1) {
      gxy $$2 = new gxy($$1);
      alh $$3 = alh.b($$0);
      gxy $$4 = (gxy)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
