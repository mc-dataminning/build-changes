import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class heu {
   private static final BiMap<aku, het> i = HashBiMap.create();
   public static final het a = a("single", hez.b);
   public static final het b = a("directory", hew.b);
   public static final het c = a("filter", hfa.b);
   public static final het d = a("unstitch", hfb.b);
   public static final het e = a("paletted_permutations", hey.b);
   public static Codec<het> f = aku.a.flatXmap($$0 -> {
      het $$1 = (het)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aku $$1 = (aku)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<her> g = f.dispatch(her::a, het::a);
   public static Codec<List<her>> h = g.listOf().fieldOf("sources").codec();

   private static het a(String $$0, MapCodec<? extends her> $$1) {
      het $$2 = new het($$1);
      aku $$3 = aku.b($$0);
      het $$4 = (het)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
