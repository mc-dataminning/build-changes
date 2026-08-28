import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hfz {
   private static final BiMap<aku, hfy> i = HashBiMap.create();
   public static final hfy a = a("single", hge.b);
   public static final hfy b = a("directory", hgb.b);
   public static final hfy c = a("filter", hgf.b);
   public static final hfy d = a("unstitch", hgg.b);
   public static final hfy e = a("paletted_permutations", hgd.b);
   public static Codec<hfy> f = aku.a.flatXmap($$0 -> {
      hfy $$1 = (hfy)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aku $$1 = (aku)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hfw> g = f.dispatch(hfw::a, hfy::a);
   public static Codec<List<hfw>> h = g.listOf().fieldOf("sources").codec();

   private static hfy a(String $$0, MapCodec<? extends hfw> $$1) {
      hfy $$2 = new hfy($$1);
      aku $$3 = aku.b($$0);
      hfy $$4 = (hfy)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
