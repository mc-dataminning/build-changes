import com.mojang.serialization.MapCodec;

public class hiz {
   private static final ayw.b<ali, MapCodec<? extends hja>> b = new ayw.b<>();
   public static final MapCodec<hja> a = b.a(ali.a).dispatchMap("property", hja::a, $$0 -> $$0);

   public static void a() {
      b.a(ali.b("custom_model_data"), hiw.a);
      b.a(ali.b("bundle/fullness"), hiq.a);
      b.a(ali.b("damage"), hix.a);
      b.a(ali.b("cooldown"), hit.a);
      b.a(ali.b("time"), hjb.a);
      b.a(ali.b("compass"), hir.a);
      b.a(ali.b("crossbow/pull"), hiv.a);
      b.a(ali.b("use_cycle"), hjc.a);
      b.a(ali.b("use_duration"), hjd.a);
      b.a(ali.b("count"), hiu.a);
   }
}
