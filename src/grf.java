import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class grf {
   private static final BiMap<akt, gre> i = HashBiMap.create();
   public static final gre a = a("single", grk.b);
   public static final gre b = a("directory", grh.b);
   public static final gre c = a("filter", grl.b);
   public static final gre d = a("unstitch", grm.b);
   public static final gre e = a("paletted_permutations", grj.b);
   public static Codec<gre> f = akt.a.flatXmap($$0 -> {
      gre $$1 = (gre)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akt $$1 = (akt)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<grc> g = f.dispatch(grc::a, gre::a);
   public static Codec<List<grc>> h = g.listOf().fieldOf("sources").codec();

   private static gre a(String $$0, Codec<? extends grc> $$1) {
      gre $$2 = new gre($$1);
      akt $$3 = new akt($$0);
      gre $$4 = (gre)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
