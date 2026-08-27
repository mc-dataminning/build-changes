import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class fzn {
   private static final BiMap<aey, fzm> i = HashBiMap.create();
   public static final fzm a = a("single", fzs.b);
   public static final fzm b = a("directory", fzp.b);
   public static final fzm c = a("filter", fzt.b);
   public static final fzm d = a("unstitch", fzu.b);
   public static final fzm e = a("paletted_permutations", fzr.b);
   public static Codec<fzm> f = aey.a.flatXmap($$0 -> {
      fzm $$1 = (fzm)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aey $$1 = (aey)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<fzk> g = f.dispatch(fzk::a, fzm::a);
   public static Codec<List<fzk>> h = g.listOf().fieldOf("sources").codec();

   private static fzm a(String $$0, Codec<? extends fzk> $$1) {
      fzm $$2 = new fzm($$1);
      aey $$3 = new aey($$0);
      fzm $$4 = (fzm)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
