import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gqq {
   private static final BiMap<akr, gqp> i = HashBiMap.create();
   public static final gqp a = a("single", gqv.b);
   public static final gqp b = a("directory", gqs.b);
   public static final gqp c = a("filter", gqw.b);
   public static final gqp d = a("unstitch", gqx.b);
   public static final gqp e = a("paletted_permutations", gqu.b);
   public static Codec<gqp> f = akr.a.flatXmap($$0 -> {
      gqp $$1 = (gqp)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akr $$1 = (akr)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gqn> g = f.dispatch(gqn::a, gqp::a);
   public static Codec<List<gqn>> h = g.listOf().fieldOf("sources").codec();

   private static gqp a(String $$0, MapCodec<? extends gqn> $$1) {
      gqp $$2 = new gqp($$1);
      akr $$3 = akr.b($$0);
      gqp $$4 = (gqp)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
