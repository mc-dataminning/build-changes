import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hbo {
   private static final ayi.b<akv, MapCodec<? extends hbm.b>> b = new ayi.b<>();
   public static final Codec<hbm.b> a = b.a(akv.a).dispatch(hbm.b::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("empty"), hbl.a.a);
      b.a(akv.b("model"), hbg.a.a);
      b.a(akv.b("range_dispatch"), hbr.b.a);
      b.a(akv.b("special"), hbt.a.a);
      b.a(akv.b("composite"), hbj.a.a);
      b.a(akv.b("bundle/selected_item"), hbh.a.a);
      b.a(akv.b("select"), hbs.b.a);
      b.a(akv.b("condition"), hbk.a.a);
   }
}
