import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gyk {
   private static final BiMap<ali, gyj> i = HashBiMap.create();
   public static final gyj a = a("single", gyp.b);
   public static final gyj b = a("directory", gym.b);
   public static final gyj c = a("filter", gyq.b);
   public static final gyj d = a("unstitch", gyr.b);
   public static final gyj e = a("paletted_permutations", gyo.b);
   public static Codec<gyj> f = ali.a.flatXmap($$0 -> {
      gyj $$1 = (gyj)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      ali $$1 = (ali)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gyh> g = f.dispatch(gyh::a, gyj::a);
   public static Codec<List<gyh>> h = g.listOf().fieldOf("sources").codec();

   private static gyj a(String $$0, MapCodec<? extends gyh> $$1) {
      gyj $$2 = new gyj($$1);
      ali $$3 = ali.b($$0);
      gyj $$4 = (gyj)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
