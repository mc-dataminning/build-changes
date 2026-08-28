import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hhh {
   private static final azg.b<alr, MapCodec<? extends hhf.b>> b = new azg.b<>();
   public static final Codec<hhf.b> a = b.a(alr.a).dispatch(hhf.b::a, $$0 -> $$0);

   public static void a() {
      b.a(alr.b("empty"), hhe.a.a);
      b.a(alr.b("model"), hgz.a.a);
      b.a(alr.b("range_dispatch"), hhl.b.a);
      b.a(alr.b("special"), hhn.a.a);
      b.a(alr.b("composite"), hhc.a.a);
      b.a(alr.b("bundle/selected_item"), hha.a.a);
      b.a(alr.b("select"), hhm.c.a);
      b.a(alr.b("condition"), hhd.a.a);
   }
}
