import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hig {
   private static final ays.b<ale, MapCodec<? extends hie>> c = new ays.b<>();
   public static final Codec<hie> a = c.a(ale.a).dispatch(hie::a, $$0 -> $$0);
   public static final Codec<List<hie>> b = a.listOf().fieldOf("sources").codec();

   public static void a() {
      c.a(ale.b("single"), hil.b);
      c.a(ale.b("directory"), hii.b);
      c.a(ale.b("filter"), him.b);
      c.a(ale.b("unstitch"), hin.b);
      c.a(ale.b("paletted_permutations"), hik.c);
   }
}
