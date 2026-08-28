import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hha {
   private static final BiMap<ald, hgz> i = HashBiMap.create();
   public static final hgz a = a("single", hhf.b);
   public static final hgz b = a("directory", hhc.b);
   public static final hgz c = a("filter", hhg.b);
   public static final hgz d = a("unstitch", hhh.b);
   public static final hgz e = a("paletted_permutations", hhe.b);
   public static Codec<hgz> f = ald.a.flatXmap($$0 -> {
      hgz $$1 = (hgz)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ald $$1 = (ald)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hgx> g = f.dispatch(hgx::a, hgz::a);
   public static Codec<List<hgx>> h = g.listOf().fieldOf("sources").codec();

   private static hgz a(String $$0, MapCodec<? extends hgx> $$1) {
      hgz $$2 = new hgz($$1);
      ald $$3 = ald.b($$0);
      hgz $$4 = (hgz)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
