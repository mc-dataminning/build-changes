import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class fyn {
   private static final BiMap<aep, fym> i = HashBiMap.create();
   public static final fym a = a("single", fys.b);
   public static final fym b = a("directory", fyp.b);
   public static final fym c = a("filter", fyt.b);
   public static final fym d = a("unstitch", fyu.b);
   public static final fym e = a("paletted_permutations", fyr.b);
   public static Codec<fym> f = aep.a.flatXmap($$0 -> {
      fym $$1 = (fym)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aep $$1 = (aep)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<fyk> g = f.dispatch(fyk::a, fym::a);
   public static Codec<List<fyk>> h = g.listOf().fieldOf("sources").codec();

   private static fym a(String $$0, Codec<? extends fyk> $$1) {
      fym $$2 = new fym($$1);
      aep $$3 = new aep($$0);
      fym $$4 = (fym)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
