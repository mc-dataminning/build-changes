import com.mojang.serialization.MapCodec;

public class hfb {
   private static final ays.b<ale, MapCodec<? extends hfc>> b = new ays.b<>();
   public static final MapCodec<hfc> a = b.a(ale.a).dispatchMap("property", hfc::a, $$0 -> $$0);

   public static void a() {
      b.a(ale.b("custom_model_data"), hfd.a);
      b.a(ale.b("using_item"), hfl.a);
      b.a(ale.b("broken"), hey.a);
      b.a(ale.b("damaged"), hfe.a);
      b.a(ale.b("fishing_rod/cast"), hfg.a);
      b.a(ale.b("has_component"), hfh.a);
      b.a(ale.b("bundle/has_selected_item"), hez.a);
      b.a(ale.b("selected"), hfk.a);
      b.a(ale.b("carried"), hfi.a);
      b.a(ale.b("extended_view"), hff.a);
      b.a(ale.b("keybind_down"), hfj.a);
      b.a(ale.b("view_entity"), hfm.a);
      b.a(ale.b("component"), hfa.a);
   }
}
