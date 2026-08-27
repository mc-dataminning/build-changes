import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class gmv {
   private static final BiMap<akf, gmu> i = HashBiMap.create();
   public static final gmu a = a("single", gna.b);
   public static final gmu b = a("directory", gmx.b);
   public static final gmu c = a("filter", gnb.b);
   public static final gmu d = a("unstitch", gnc.b);
   public static final gmu e = a("paletted_permutations", gmz.b);
   public static Codec<gmu> f = akf.a.flatXmap($$0 -> {
      gmu $$1 = (gmu)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akf $$1 = (akf)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gms> g = f.dispatch(gms::a, gmu::a);
   public static Codec<List<gms>> h = g.listOf().fieldOf("sources").codec();

   private static gmu a(String $$0, Codec<? extends gms> $$1) {
      gmu $$2 = new gmu($$1);
      akf $$3 = new akf($$0);
      gmu $$4 = (gmu)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
