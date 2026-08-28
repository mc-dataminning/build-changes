import com.mojang.serialization.MapCodec;

public class hhj {
   private static final ayu.b<alg, MapCodec<? extends hhk>> b = new ayu.b<>();
   public static final MapCodec<hhk> a = b.a(alg.a).dispatchMap("property", hhk::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("custom_model_data"), hhg.a);
      b.a(alg.b("bundle/fullness"), hha.a);
      b.a(alg.b("damage"), hhh.a);
      b.a(alg.b("cooldown"), hhd.a);
      b.a(alg.b("time"), hhl.a);
      b.a(alg.b("compass"), hhb.a);
      b.a(alg.b("crossbow/pull"), hhf.a);
      b.a(alg.b("use_cycle"), hhm.a);
      b.a(alg.b("use_duration"), hhn.a);
      b.a(alg.b("count"), hhe.a);
   }
}
