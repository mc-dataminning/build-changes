import com.mojang.serialization.MapCodec;

public class hip {
   private static final azg.b<alr, MapCodec<? extends hiq>> b = new azg.b<>();
   public static final MapCodec<hiq> a = b.a(alr.a).dispatchMap("property", hiq::a, $$0 -> $$0);

   public static void a() {
      b.a(alr.b("custom_model_data"), him.a);
      b.a(alr.b("bundle/fullness"), hig.a);
      b.a(alr.b("damage"), hin.a);
      b.a(alr.b("cooldown"), hij.a);
      b.a(alr.b("time"), hir.a);
      b.a(alr.b("compass"), hih.a);
      b.a(alr.b("crossbow/pull"), hil.a);
      b.a(alr.b("use_cycle"), his.a);
      b.a(alr.b("use_duration"), hit.a);
      b.a(alr.b("count"), hik.a);
   }
}
