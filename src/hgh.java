import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hgh {
   private static final ayu.b<alg, MapCodec<? extends hgf.b>> b = new ayu.b<>();
   public static final Codec<hgf.b> a = b.a(alg.a).dispatch(hgf.b::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("empty"), hge.a.a);
      b.a(alg.b("model"), hfz.a.a);
      b.a(alg.b("range_dispatch"), hgl.b.a);
      b.a(alg.b("special"), hgn.a.a);
      b.a(alg.b("composite"), hgc.a.a);
      b.a(alg.b("bundle/selected_item"), hga.a.a);
      b.a(alg.b("select"), hgm.c.a);
      b.a(alg.b("condition"), hgd.a.a);
   }
}
