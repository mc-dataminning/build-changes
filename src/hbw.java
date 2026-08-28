import com.mojang.serialization.MapCodec;

public class hbw {
   private static final ayi.b<akv, MapCodec<? extends hbx>> b = new ayi.b<>();
   public static final MapCodec<hbx> a = b.a(akv.a).dispatchMap("property", hbx::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("custom_model_data"), hby.a);
      b.a(akv.b("using_item"), hcg.a);
      b.a(akv.b("broken"), hbu.a);
      b.a(akv.b("damaged"), hbz.a);
      b.a(akv.b("fishing_rod/cast"), hcb.a);
      b.a(akv.b("has_component"), hcc.a);
      b.a(akv.b("bundle/has_selected_item"), hbv.a);
      b.a(akv.b("selected"), hcf.a);
      b.a(akv.b("carried"), hcd.a);
      b.a(akv.b("extended_view"), hca.a);
      b.a(akv.b("keybind_down"), hce.a);
      b.a(akv.b("view_entity"), hch.a);
   }
}
