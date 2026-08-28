import com.mojang.serialization.MapCodec;

public class hbx {
   private static final ayi.b<akv, MapCodec<? extends hby>> b = new ayi.b<>();
   public static final MapCodec<hby> a = b.a(akv.a).dispatchMap("property", hby::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("custom_model_data"), hbz.a);
      b.a(akv.b("using_item"), hch.a);
      b.a(akv.b("broken"), hbv.a);
      b.a(akv.b("damaged"), hca.a);
      b.a(akv.b("fishing_rod/cast"), hcc.a);
      b.a(akv.b("has_component"), hcd.a);
      b.a(akv.b("bundle/has_selected_item"), hbw.a);
      b.a(akv.b("selected"), hcg.a);
      b.a(akv.b("carried"), hce.a);
      b.a(akv.b("extended_view"), hcb.a);
      b.a(akv.b("keybind_down"), hcf.a);
      b.a(akv.b("view_entity"), hci.a);
   }
}
