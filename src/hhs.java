import com.mojang.serialization.MapCodec;

public class hhs {
   private static final azg.b<alr, MapCodec<? extends hht>> b = new azg.b<>();
   public static final MapCodec<hht> a = b.a(alr.a).dispatchMap("property", hht::a, $$0 -> $$0);

   public static void a() {
      b.a(alr.b("custom_model_data"), hhu.a);
      b.a(alr.b("using_item"), hic.a);
      b.a(alr.b("broken"), hhp.a);
      b.a(alr.b("damaged"), hhv.a);
      b.a(alr.b("fishing_rod/cast"), hhx.a);
      b.a(alr.b("has_component"), hhy.a);
      b.a(alr.b("bundle/has_selected_item"), hhq.a);
      b.a(alr.b("selected"), hib.a);
      b.a(alr.b("carried"), hhz.a);
      b.a(alr.b("extended_view"), hhw.a);
      b.a(alr.b("keybind_down"), hia.a);
      b.a(alr.b("view_entity"), hid.a);
      b.a(alr.b("component"), hhr.a);
   }
}
