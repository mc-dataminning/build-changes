import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hbl {
   private static final BiMap<alz, hbk> i = HashBiMap.create();
   public static final hbk a = a("single", hbq.b);
   public static final hbk b = a("directory", hbn.b);
   public static final hbk c = a("filter", hbr.b);
   public static final hbk d = a("unstitch", hbs.b);
   public static final hbk e = a("paletted_permutations", hbp.b);
   public static Codec<hbk> f = alz.a.flatXmap($$0 -> {
      hbk $$1 = (hbk)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alz $$1 = (alz)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<hbi> g = f.dispatch(hbi::a, hbk::a);
   public static Codec<List<hbi>> h = g.listOf().fieldOf("sources").codec();

   private static hbk a(String $$0, MapCodec<? extends hbi> $$1) {
      hbk $$2 = new hbk($$1);
      alz $$3 = alz.b($$0);
      hbk $$4 = (hbk)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
