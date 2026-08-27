import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class goc {
   private static final BiMap<akn, gob> i = HashBiMap.create();
   public static final gob a = a("single", goh.b);
   public static final gob b = a("directory", goe.b);
   public static final gob c = a("filter", goi.b);
   public static final gob d = a("unstitch", goj.b);
   public static final gob e = a("paletted_permutations", gog.b);
   public static Codec<gob> f = akn.a.flatXmap($$0 -> {
      gob $$1 = (gob)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akn $$1 = (akn)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gnz> g = f.dispatch(gnz::a, gob::a);
   public static Codec<List<gnz>> h = g.listOf().fieldOf("sources").codec();

   private static gob a(String $$0, MapCodec<? extends gnz> $$1) {
      gob $$2 = new gob($$1);
      akn $$3 = new akn($$0);
      gob $$4 = (gob)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
