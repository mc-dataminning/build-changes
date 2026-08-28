import com.mojang.serialization.MapCodec;

public class hdv {
   private static final ays.b<ald, MapCodec<? extends hdw>> b = new ays.b<>();
   public static final MapCodec<hdw> a = b.a(ald.a).dispatchMap("property", hdw::a, $$0 -> $$0);

   public static void a() {
      b.a(ald.b("custom_model_data"), hdx.a);
      b.a(ald.b("using_item"), hef.a);
      b.a(ald.b("broken"), hdt.a);
      b.a(ald.b("damaged"), hdy.a);
      b.a(ald.b("fishing_rod/cast"), hea.a);
      b.a(ald.b("has_component"), heb.a);
      b.a(ald.b("bundle/has_selected_item"), hdu.a);
      b.a(ald.b("selected"), hee.a);
      b.a(ald.b("carried"), hec.a);
      b.a(ald.b("extended_view"), hdz.a);
      b.a(ald.b("keybind_down"), hed.a);
      b.a(ald.b("view_entity"), heg.a);
   }
}
