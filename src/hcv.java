import com.mojang.serialization.MapCodec;

public class hcv {
   private static final ayi.b<aku, MapCodec<? extends hcw>> b = new ayi.b<>();
   public static final MapCodec<hcw> a = b.a(aku.a).dispatchMap("property", hcw::a, $$0 -> $$0);

   public static void a() {
      b.a(aku.b("custom_model_data"), hcx.a);
      b.a(aku.b("using_item"), hdf.a);
      b.a(aku.b("broken"), hct.a);
      b.a(aku.b("damaged"), hcy.a);
      b.a(aku.b("fishing_rod/cast"), hda.a);
      b.a(aku.b("has_component"), hdb.a);
      b.a(aku.b("bundle/has_selected_item"), hcu.a);
      b.a(aku.b("selected"), hde.a);
      b.a(aku.b("carried"), hdc.a);
      b.a(aku.b("extended_view"), hcz.a);
      b.a(aku.b("keybind_down"), hdd.a);
      b.a(aku.b("view_entity"), hdg.a);
   }
}
