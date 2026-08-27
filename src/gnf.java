import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gnf {
   private static final BiMap<akh, gne> i = HashBiMap.create();
   public static final gne a = a("single", gnk.b);
   public static final gne b = a("directory", gnh.b);
   public static final gne c = a("filter", gnl.b);
   public static final gne d = a("unstitch", gnm.b);
   public static final gne e = a("paletted_permutations", gnj.b);
   public static Codec<gne> f = akh.a.flatXmap($$0 -> {
      gne $$1 = (gne)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akh $$1 = (akh)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gnc> g = f.dispatch(gnc::a, gne::a);
   public static Codec<List<gnc>> h = g.listOf().fieldOf("sources").codec();

   private static gne a(String $$0, Codec<? extends gnc> $$1) {
      gne $$2 = new gne($$1);
      akh $$3 = new akh($$0);
      gne $$4 = (gne)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
