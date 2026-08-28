import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hbn {
   private static final ayi.b<akv, MapCodec<? extends hbl.b>> b = new ayi.b<>();
   public static final Codec<hbl.b> a = b.a(akv.a).dispatch(hbl.b::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("empty"), hbk.a.a);
      b.a(akv.b("model"), hbf.a.a);
      b.a(akv.b("range_dispatch"), hbq.b.a);
      b.a(akv.b("special"), hbs.a.a);
      b.a(akv.b("composite"), hbi.a.a);
      b.a(akv.b("bundle/selected_item"), hbg.a.a);
      b.a(akv.b("select"), hbr.b.a);
      b.a(akv.b("condition"), hbj.a.a);
   }
}
