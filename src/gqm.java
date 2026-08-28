import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class gqm {
   private static final BiMap<akq, gql> i = HashBiMap.create();
   public static final gql a = a("single", gqr.b);
   public static final gql b = a("directory", gqo.b);
   public static final gql c = a("filter", gqs.b);
   public static final gql d = a("unstitch", gqt.b);
   public static final gql e = a("paletted_permutations", gqq.b);
   public static Codec<gql> f = akq.a.flatXmap($$0 -> {
      gql $$1 = (gql)i.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$0);
   }, $$0 -> {
      akq $$1 = (akq)i.inverse().get($$0);
      return $$0 != null ? DataResult.success($$1) : DataResult.error(() -> "Unknown type " + $$1);
   });
   public static Codec<gqj> g = f.dispatch(gqj::a, gql::a);
   public static Codec<List<gqj>> h = g.listOf().fieldOf("sources").codec();

   private static gql a(String $$0, MapCodec<? extends gqj> $$1) {
      gql $$2 = new gql($$1);
      akq $$3 = akq.b($$0);
      gql $$4 = (gql)i.putIfAbsent($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration " + $$3);
      } else {
         return $$2;
      }
   }
}
