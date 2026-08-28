import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hht {
   private static final ayy.b<alk, MapCodec<? extends hhr.b>> b = new ayy.b<>();
   public static final Codec<hhr.b> a = b.a(alk.a).dispatch(hhr.b::a, $$0 -> $$0);

   public static void a() {
      b.a(alk.b("empty"), hhq.a.a);
      b.a(alk.b("model"), hhl.a.a);
      b.a(alk.b("range_dispatch"), hhx.b.a);
      b.a(alk.b("special"), hhz.a.a);
      b.a(alk.b("composite"), hho.a.a);
      b.a(alk.b("bundle/selected_item"), hhm.a.a);
      b.a(alk.b("select"), hhy.c.a);
      b.a(alk.b("condition"), hhp.a.a);
   }
}
