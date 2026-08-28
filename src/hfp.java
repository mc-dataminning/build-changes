import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hfp {
   private static final ayu.b<alg, MapCodec<? extends hfn.b>> b = new ayu.b<>();
   public static final Codec<hfn.b> a = b.a(alg.a).dispatch(hfn.b::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("empty"), hfm.a.a);
      b.a(alg.b("model"), hfh.a.a);
      b.a(alg.b("range_dispatch"), hfs.b.a);
      b.a(alg.b("special"), hfu.a.a);
      b.a(alg.b("composite"), hfk.a.a);
      b.a(alg.b("bundle/selected_item"), hfi.a.a);
      b.a(alg.b("select"), hft.c.a);
      b.a(alg.b("condition"), hfl.a.a);
   }
}
