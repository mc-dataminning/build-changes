import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hje {
   private static final ayu.b<alg, MapCodec<? extends hjc>> c = new ayu.b<>();
   public static final Codec<hjc> a = c.a(alg.a).dispatch(hjc::a, $$0 -> $$0);
   public static final Codec<List<hjc>> b = a.listOf().fieldOf("sources").codec();

   public static void a() {
      c.a(alg.b("single"), hjj.b);
      c.a(alg.b("directory"), hjg.b);
      c.a(alg.b("filter"), hjk.b);
      c.a(alg.b("unstitch"), hjl.b);
      c.a(alg.b("paletted_permutations"), hji.c);
   }
}
