import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hcm {
   private static final ayi.b<aku, MapCodec<? extends hck.b>> b = new ayi.b<>();
   public static final Codec<hck.b> a = b.a(aku.a).dispatch(hck.b::a, $$0 -> $$0);

   public static void a() {
      b.a(aku.b("empty"), hcj.a.a);
      b.a(aku.b("model"), hce.a.a);
      b.a(aku.b("range_dispatch"), hcp.b.a);
      b.a(aku.b("special"), hcr.a.a);
      b.a(aku.b("composite"), hch.a.a);
      b.a(aku.b("bundle/selected_item"), hcf.a.a);
      b.a(aku.b("select"), hcq.b.a);
      b.a(aku.b("condition"), hci.a.a);
   }
}
