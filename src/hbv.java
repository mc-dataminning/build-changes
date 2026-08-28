import com.mojang.serialization.MapCodec;

public class hbv {
   private static final ayi.b<akv, MapCodec<? extends hbw>> b = new ayi.b<>();
   public static final MapCodec<hbw> a = b.a(akv.a).dispatchMap("property", hbw::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("custom_model_data"), hbx.a);
      b.a(akv.b("using_item"), hcf.a);
      b.a(akv.b("broken"), hbt.a);
      b.a(akv.b("damaged"), hby.a);
      b.a(akv.b("fishing_rod/cast"), hca.a);
      b.a(akv.b("has_component"), hcb.a);
      b.a(akv.b("bundle/has_selected_item"), hbu.a);
      b.a(akv.b("selected"), hce.a);
      b.a(akv.b("carried"), hcc.a);
      b.a(akv.b("extended_view"), hbz.a);
      b.a(akv.b("keybind_down"), hcd.a);
      b.a(akv.b("view_entity"), hcg.a);
   }
}
