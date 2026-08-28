import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gxi {
   private static final BiMap<alc, gxh> i = HashBiMap.create();
   public static final gxh a = a("single", gxn.b);
   public static final gxh b = a("directory", gxk.b);
   public static final gxh c = a("filter", gxo.b);
   public static final gxh d = a("unstitch", gxp.b);
   public static final gxh e = a("paletted_permutations", gxm.b);
   public static Codec<gxh> f = alc.a.flatXmap($$0 -> {
      gxh $$1 = (gxh)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alc $$1 = (alc)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gxf> g = f.dispatch(gxf::a, gxh::a);
   public static Codec<List<gxf>> h = g.listOf().fieldOf("sources").codec();

   private static gxh a(String $$0, MapCodec<? extends gxf> $$1) {
      gxh $$2 = new gxh($$1);
      alc $$3 = alc.b($$0);
      gxh $$4 = (gxh)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
