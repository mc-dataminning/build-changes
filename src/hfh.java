import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hfh {
   private static final ayu.b<alg, MapCodec<? extends hff.b>> b = new ayu.b<>();
   public static final Codec<hff.b> a = b.a(alg.a).dispatch(hff.b::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("empty"), hfe.a.a);
      b.a(alg.b("model"), hez.a.a);
      b.a(alg.b("range_dispatch"), hfk.b.a);
      b.a(alg.b("special"), hfm.a.a);
      b.a(alg.b("composite"), hfc.a.a);
      b.a(alg.b("bundle/selected_item"), hfa.a.a);
      b.a(alg.b("select"), hfl.c.a);
      b.a(alg.b("condition"), hfd.a.a);
   }
}
