import com.mojang.serialization.MapCodec;

public class hgo {
   private static final ayu.b<alg, MapCodec<? extends hgp>> b = new ayu.b<>();
   public static final MapCodec<hgp> a = b.a(alg.a).dispatchMap("property", hgp::a, $$0 -> $$0);

   public static void a() {
      b.a(alg.b("custom_model_data"), hgl.a);
      b.a(alg.b("bundle/fullness"), hgf.a);
      b.a(alg.b("damage"), hgm.a);
      b.a(alg.b("cooldown"), hgi.a);
      b.a(alg.b("time"), hgq.a);
      b.a(alg.b("compass"), hgg.a);
      b.a(alg.b("crossbow/pull"), hgk.a);
      b.a(alg.b("use_cycle"), hgr.a);
      b.a(alg.b("use_duration"), hgs.a);
      b.a(alg.b("count"), hgj.a);
   }
}
