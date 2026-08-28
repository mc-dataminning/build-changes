import com.mojang.serialization.MapCodec;

public class hgm {
   private static final ayu.b<alg, MapCodec<? extends hgn>> b = new ayu.b<>();
   public static final MapCodec<hgn> a = b.a(alg.a).dispatchMap("property", hgn::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("custom_model_data"), hgo.a);
      b.a(alg.b("using_item"), hgw.a);
      b.a(alg.b("broken"), hgj.a);
      b.a(alg.b("damaged"), hgp.a);
      b.a(alg.b("fishing_rod/cast"), hgr.a);
      b.a(alg.b("has_component"), hgs.a);
      b.a(alg.b("bundle/has_selected_item"), hgk.a);
      b.a(alg.b("selected"), hgv.a);
      b.a(alg.b("carried"), hgt.a);
      b.a(alg.b("extended_view"), hgq.a);
      b.a(alg.b("keybind_down"), hgu.a);
      b.a(alg.b("view_entity"), hgx.a);
      b.a(alg.b("component"), hgl.a);
   }
}
