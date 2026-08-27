import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gjg {
   private static final BiMap<ajh, gjf> i = HashBiMap.create();
   public static final gjf a = a("single", gjl.b);
   public static final gjf b = a("directory", gji.b);
   public static final gjf c = a("filter", gjm.b);
   public static final gjf d = a("unstitch", gjn.b);
   public static final gjf e = a("paletted_permutations", gjk.b);
   public static Codec<gjf> f = ajh.a.flatXmap($$0 -> {
      gjf $$1 = (gjf)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ajh $$1 = (ajh)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gjd> g = f.dispatch(gjd::a, gjf::a);
   public static Codec<List<gjd>> h = g.listOf().fieldOf("sources").codec();

   private static gjf a(String $$0, Codec<? extends gjd> $$1) {
      gjf $$2 = new gjf($$1);
      ajh $$3 = new ajh($$0);
      gjf $$4 = (gjf)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
