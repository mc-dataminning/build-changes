import com.mojang.serialization.MapCodec;

public class hcs {
   private static final ayi.b<akv, MapCodec<? extends hct>> b = new ayi.b<>();
   public static final MapCodec<hct> a = b.a(akv.a).dispatchMap("property", hct::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("custom_model_data"), hcp.a);
      b.a(akv.b("bundle/fullness"), hcj.a);
      b.a(akv.b("damage"), hcq.a);
      b.a(akv.b("cooldown"), hcm.a);
      b.a(akv.b("time"), hcu.a);
      b.a(akv.b("compass"), hck.a);
      b.a(akv.b("crossbow/pull"), hco.a);
      b.a(akv.b("use_cycle"), hcv.a);
      b.a(akv.b("use_duration"), hcw.a);
      b.a(akv.b("count"), hcn.a);
   }
}
