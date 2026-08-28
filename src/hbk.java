import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hbk {
   private static final ayi.b<aku, MapCodec<? extends hbi.b>> b = new ayi.b<>();
   public static final Codec<hbi.b> a = b.a(aku.a).dispatch(hbi.b::a, $$0 -> $$0);

   public static void a() {
      b.a(aku.b("model"), hbd.a.a);
      b.a(aku.b("range_dispatch"), hbn.b.a);
      b.a(aku.b("special"), hbp.a.a);
      b.a(aku.b("composite"), hbg.a.a);
      b.a(aku.b("bundle/selected_item"), hbe.a.a);
      b.a(aku.b("select"), hbo.b.a);
      b.a(aku.b("condition"), hbh.a.a);
   }
}
