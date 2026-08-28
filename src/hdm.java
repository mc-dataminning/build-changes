import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class hdm {
   private static final ays.b<ald, MapCodec<? extends hdk.b>> b = new ays.b<>();
   public static final Codec<hdk.b> a = b.a(ald.a).dispatch(hdk.b::a, $$0 -> $$0);

   public static void a() {
      b.a(ald.b("empty"), hdj.a.a);
      b.a(ald.b("model"), hde.a.a);
      b.a(ald.b("range_dispatch"), hdp.b.a);
      b.a(ald.b("special"), hdr.a.a);
      b.a(ald.b("composite"), hdh.a.a);
      b.a(ald.b("bundle/selected_item"), hdf.a.a);
      b.a(ald.b("select"), hdq.b.a);
      b.a(ald.b("condition"), hdi.a.a);
   }
}
