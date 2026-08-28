import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hjr {
   private static final ayu.b<alg, MapCodec<? extends hjp>> c = new ayu.b<>();
   public static final Codec<hjp> a = c.a(alg.a).dispatch(hjp::a, $$0 -> $$0);
   public static final Codec<List<hjp>> b = a.listOf().fieldOf("sources").codec();

   public static void a() {
      c.a(alg.b("single"), hjw.b);
      c.a(alg.b("directory"), hjt.b);
      c.a(alg.b("filter"), hjx.b);
      c.a(alg.b("unstitch"), hjy.b);
      c.a(alg.b("paletted_permutations"), hjv.c);
   }
}
