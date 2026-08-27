import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gdv {
   private static final BiMap<agt, gdu> i = HashBiMap.create();
   public static final gdu a = a("single", gea.b);
   public static final gdu b = a("directory", gdx.b);
   public static final gdu c = a("filter", geb.b);
   public static final gdu d = a("unstitch", gec.b);
   public static final gdu e = a("paletted_permutations", gdz.b);
   public static Codec<gdu> f = agt.a.flatXmap($$0 -> {
      gdu $$1 = (gdu)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      agt $$1 = (agt)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gds> g = f.dispatch(gds::a, gdu::a);
   public static Codec<List<gds>> h = g.listOf().fieldOf("sources").codec();

   private static gdu a(String $$0, Codec<? extends gds> $$1) {
      gdu $$2 = new gdu($$1);
      agt $$3 = new agt($$0);
      gdu $$4 = (gdu)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
