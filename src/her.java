import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class her {
   private static final ays.b<ale, MapCodec<? extends hep.b>> b = new ays.b<>();
   public static final Codec<hep.b> a = b.a(ale.a).dispatch(hep.b::a, $$0 -> $$0);

   public static void a() {
      b.a(ale.b("empty"), heo.a.a);
      b.a(ale.b("model"), hej.a.a);
      b.a(ale.b("range_dispatch"), heu.b.a);
      b.a(ale.b("special"), hew.a.a);
      b.a(ale.b("composite"), hem.a.a);
      b.a(ale.b("bundle/selected_item"), hek.a.a);
      b.a(ale.b("select"), hev.c.a);
      b.a(ale.b("condition"), hen.a.a);
   }
}
