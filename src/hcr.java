import com.mojang.serialization.MapCodec;

public class hcr {
   private static final ayi.b<akv, MapCodec<? extends hcs>> b = new ayi.b<>();
   public static final MapCodec<hcs> a = b.a(akv.a).dispatchMap("property", hcs::a, $$0 -> $$0);

   public static void a() {
      b.a(akv.b("custom_model_data"), hco.a);
      b.a(akv.b("bundle/fullness"), hci.a);
      b.a(akv.b("damage"), hcp.a);
      b.a(akv.b("cooldown"), hcl.a);
      b.a(akv.b("time"), hct.a);
      b.a(akv.b("compass"), hcj.a);
      b.a(akv.b("crossbow/pull"), hcn.a);
      b.a(akv.b("use_cycle"), hcu.a);
      b.a(akv.b("use_duration"), hcv.a);
      b.a(akv.b("count"), hcm.a);
   }
}
