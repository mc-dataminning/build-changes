import com.mojang.serialization.MapCodec;

public class hbt {
   private static final ayi.b<aku, MapCodec<? extends hbu>> b = new ayi.b<>();
   public static final MapCodec<hbu> a = b.a(aku.a).dispatchMap("property", hbu::a, $$0 -> $$0);

   public static void a() {
      b.a(aku.b("custom_model_data"), hbv.a);
      b.a(aku.b("using_item"), hcc.a);
      b.a(aku.b("broken"), hbr.a);
      b.a(aku.b("damaged"), hbw.a);
      b.a(aku.b("fishing_rod/cast"), hbx.a);
      b.a(aku.b("has_component"), hby.a);
      b.a(aku.b("bundle/has_selected_item"), hbs.a);
      b.a(aku.b("xmas"), hcd.a);
      b.a(aku.b("selected"), hca.a);
      b.a(aku.b("carried"), hbz.a);
      b.a(aku.b("shift_down"), hcb.a);
   }
}
