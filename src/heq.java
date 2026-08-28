import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class heq {
   private static final BiMap<aku, hep> i = HashBiMap.create();
   public static final hep a = a("single", hev.b);
   public static final hep b = a("directory", hes.b);
   public static final hep c = a("filter", hew.b);
   public static final hep d = a("unstitch", hex.b);
   public static final hep e = a("paletted_permutations", heu.b);
   public static Codec<hep> f = aku.a.flatXmap($$0 -> {
      hep $$1 = (hep)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aku $$1 = (aku)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hen> g = f.dispatch(hen::a, hep::a);
   public static Codec<List<hen>> h = g.listOf().fieldOf("sources").codec();

   private static hep a(String $$0, MapCodec<? extends hen> $$1) {
      hep $$2 = new hep($$1);
      aku $$3 = aku.b($$0);
      hep $$4 = (hep)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
