import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hhr {
   private static final ayw.b<ali, MapCodec<? extends hhp.b>> b = new ayw.b<>();
   public static final Codec<hhp.b> a = b.a(ali.a).dispatch(hhp.b::a, $$0 -> $$0);

   public static void a() {
      b.a(ali.b("empty"), hho.a.a);
      b.a(ali.b("model"), hhj.a.a);
      b.a(ali.b("range_dispatch"), hhv.b.a);
      b.a(ali.b("special"), hhx.a.a);
      b.a(ali.b("composite"), hhm.a.a);
      b.a(ali.b("bundle/selected_item"), hhk.a.a);
      b.a(ali.b("select"), hhw.c.a);
      b.a(ali.b("condition"), hhn.a.a);
   }
}
