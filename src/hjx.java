import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hjx {
   private static final ayu.b<alg, MapCodec<? extends hjv>> c = new ayu.b<>();
   public static final Codec<hjv> a = c.a(alg.a).dispatch(hjv::a, $$0 -> $$0);
   public static final Codec<List<hjv>> b = a.listOf().fieldOf("sources").codec();

   public static void a() {
      c.a(alg.b("single"), hkc.b);
      c.a(alg.b("directory"), hjz.b);
      c.a(alg.b("filter"), hkd.b);
      c.a(alg.b("unstitch"), hke.b);
      c.a(alg.b("paletted_permutations"), hkb.c);
   }
}
