import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hlj {
   private static final ayy.b<alk, MapCodec<? extends hlh>> c = new ayy.b<>();
   public static final Codec<hlh> a = c.a(alk.a).dispatch(hlh::a, $$0 -> $$0);
   public static final Codec<List<hlh>> b = a.listOf().fieldOf("sources").codec();

   public static void a() {
      c.a(alk.b("single"), hlo.b);
      c.a(alk.b("directory"), hll.b);
      c.a(alk.b("filter"), hlp.b);
      c.a(alk.b("unstitch"), hlq.b);
      c.a(alk.b("paletted_permutations"), hln.c);
   }
}
