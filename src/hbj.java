import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hbj {
   private static final ayh.b<aku, MapCodec<? extends hbh.b>> b = new ayh.b<>();
   public static final Codec<hbh.b> a = b.a(aku.a).dispatch(hbh.b::a, $$0 -> $$0);

   public static void a() {
      b.a(aku.b("model"), hbc.a.a);
      b.a(aku.b("range_dispatch"), hbm.b.a);
      b.a(aku.b("special"), hbo.a.a);
      b.a(aku.b("composite"), hbf.a.a);
      b.a(aku.b("bundle/selected_item"), hbd.a.a);
      b.a(aku.b("select"), hbn.b.a);
      b.a(aku.b("condition"), hbg.a.a);
   }
}
