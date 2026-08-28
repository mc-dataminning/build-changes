import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hgb {
   private static final ayu.b<alg, MapCodec<? extends hfz.b>> b = new ayu.b<>();
   public static final Codec<hfz.b> a = b.a(alg.a).dispatch(hfz.b::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("empty"), hfy.a.a);
      b.a(alg.b("model"), hft.a.a);
      b.a(alg.b("range_dispatch"), hgf.b.a);
      b.a(alg.b("special"), hgh.a.a);
      b.a(alg.b("composite"), hfw.a.a);
      b.a(alg.b("bundle/selected_item"), hfu.a.a);
      b.a(alg.b("select"), hgg.c.a);
      b.a(alg.b("condition"), hfx.a.a);
   }
}
