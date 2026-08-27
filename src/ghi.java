import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;

public class ghi {
   private static final BiMap<aiy, ghh> i = HashBiMap.create();
   public static final ghh a = a("single", ghn.b);
   public static final ghh b = a("directory", ghk.b);
   public static final ghh c = a("filter", gho.b);
   public static final ghh d = a("unstitch", ghp.b);
   public static final ghh e = a("paletted_permutations", ghm.b);
   public static Codec<ghh> f = aiy.a.flatXmap($$0 -> {
      ghh $$1 = (ghh)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      aiy $$1 = (aiy)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<ghf> g = f.dispatch(ghf::a, ghh::a);
   public static Codec<List<ghf>> h = g.listOf().fieldOf("sources").codec();

   private static ghh a(String $$0, Codec<? extends ghf> $$1) {
      ghh $$2 = new ghh($$1);
      aiy $$3 = new aiy($$0);
      ghh $$4 = (ghh)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
