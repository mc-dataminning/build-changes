import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hiw {
   private static final ayu.b<alg, MapCodec<? extends hiu>> c = new ayu.b<>();
   public static final Codec<hiu> a = c.a(alg.a).dispatch(hiu::a, $$0 -> $$0);
   public static final Codec<List<hiu>> b = a.listOf().fieldOf("sources").codec();

   public static void a() {
      c.a(alg.b("single"), hjb.b);
      c.a(alg.b("directory"), hiy.b);
      c.a(alg.b("filter"), hjc.b);
      c.a(alg.b("unstitch"), hjd.b);
      c.a(alg.b("paletted_permutations"), hja.c);
   }
}
