import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gfi {
   private static final BiMap<ahh, gfh> i = HashBiMap.create();
   public static final gfh a = a("single", gfn.b);
   public static final gfh b = a("directory", gfk.b);
   public static final gfh c = a("filter", gfo.b);
   public static final gfh d = a("unstitch", gfp.b);
   public static final gfh e = a("paletted_permutations", gfm.b);
   public static Codec<gfh> f = ahh.a.flatXmap($$0 -> {
      gfh $$1 = (gfh)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ahh $$1 = (ahh)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gff> g = f.dispatch(gff::a, gfh::a);
   public static Codec<List<gff>> h = g.listOf().fieldOf("sources").codec();

   private static gfh a(String $$0, Codec<? extends gff> $$1) {
      gfh $$2 = new gfh($$1);
      ahh $$3 = new ahh($$0);
      gfh $$4 = (gfh)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
