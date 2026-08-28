import com.mojang.serialization.MapCodec;

public class hct {
   private static final ayi.b<akv, MapCodec<? extends hcu>> b = new ayi.b<>();
   public static final MapCodec<hcu> a = b.a(akv.a).dispatchMap("property", hcu::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("custom_model_data"), hcq.a);
      b.a(akv.b("bundle/fullness"), hck.a);
      b.a(akv.b("damage"), hcr.a);
      b.a(akv.b("cooldown"), hcn.a);
      b.a(akv.b("time"), hcv.a);
      b.a(akv.b("compass"), hcl.a);
      b.a(akv.b("crossbow/pull"), hcp.a);
      b.a(akv.b("use_cycle"), hcw.a);
      b.a(akv.b("use_duration"), hcx.a);
      b.a(akv.b("count"), hco.a);
   }
}
