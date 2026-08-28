import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hkx {
   private static final azg.b<alr, MapCodec<? extends hkv>> c = new azg.b<>();
   public static final Codec<hkv> a = c.a(alr.a).dispatch(hkv::a, $$0 -> $$0);
   public static final Codec<List<hkv>> b = a.listOf().fieldOf("sources").codec();

   public static void a() {
      c.a(alr.b("single"), hlc.b);
      c.a(alr.b("directory"), hkz.b);
      c.a(alr.b("filter"), hld.b);
      c.a(alr.b("unstitch"), hle.b);
      c.a(alr.b("paletted_permutations"), hlb.c);
   }
}
