import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gph {
   private static final BiMap<alf, gpg> i = HashBiMap.create();
   public static final gpg a = a("single", gpm.b);
   public static final gpg b = a("directory", gpj.b);
   public static final gpg c = a("filter", gpn.b);
   public static final gpg d = a("unstitch", gpo.b);
   public static final gpg e = a("paletted_permutations", gpl.b);
   public static Codec<gpg> f = alf.a.flatXmap($$0 -> {
      gpg $$1 = (gpg)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      alf $$1 = (alf)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gpe> g = f.dispatch(gpe::a, gpg::a);
   public static Codec<List<gpe>> h = g.listOf().fieldOf("sources").codec();

   private static gpg a(String $$0, MapCodec<? extends gpe> $$1) {
      gpg $$2 = new gpg($$1);
      alf $$3 = new alf($$0);
      gpg $$4 = (gpg)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
