import com.mojang.serialization.MapCodec;

public class hhp {
   private static final ayu.b<alg, MapCodec<? extends hhq>> b = new ayu.b<>();
   public static final MapCodec<hhq> a = b.a(alg.a).dispatchMap("property", hhq::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("custom_model_data"), hhm.a);
      b.a(alg.b("bundle/fullness"), hhg.a);
      b.a(alg.b("damage"), hhn.a);
      b.a(alg.b("cooldown"), hhj.a);
      b.a(alg.b("time"), hhr.a);
      b.a(alg.b("compass"), hhh.a);
      b.a(alg.b("crossbow/pull"), hhl.a);
      b.a(alg.b("use_cycle"), hhs.a);
      b.a(alg.b("use_duration"), hht.a);
      b.a(alg.b("count"), hhk.a);
   }
}
