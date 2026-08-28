import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hlh {
   private static final ayw.b<ali, MapCodec<? extends hlf>> c = new ayw.b<>();
   public static final Codec<hlf> a = c.a(ali.a).dispatch(hlf::a, $$0 -> $$0);
   public static final Codec<List<hlf>> b = a.listOf().fieldOf("sources").codec();

   public static void a() {
      c.a(ali.b("single"), hlm.b);
      c.a(ali.b("directory"), hlj.b);
      c.a(ali.b("filter"), hln.b);
      c.a(ali.b("unstitch"), hlo.b);
      c.a(ali.b("paletted_permutations"), hll.c);
   }
}
