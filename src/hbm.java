import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hbm {
   private static final ayi.b<akv, MapCodec<? extends hbk.b>> b = new ayi.b<>();
   public static final Codec<hbk.b> a = b.a(akv.a).dispatch(hbk.b::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("empty"), hbj.a.a);
      b.a(akv.b("model"), hbe.a.a);
      b.a(akv.b("range_dispatch"), hbp.b.a);
      b.a(akv.b("special"), hbr.a.a);
      b.a(akv.b("composite"), hbh.a.a);
      b.a(akv.b("bundle/selected_item"), hbf.a.a);
      b.a(akv.b("select"), hbq.b.a);
      b.a(akv.b("condition"), hbi.a.a);
   }
}
