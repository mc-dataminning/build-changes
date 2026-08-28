import com.mojang.serialization.MapCodec;

public class hfy {
   private static final ays.b<ale, MapCodec<? extends hfz>> b = new ays.b<>();
   public static final MapCodec<hfz> a = b.a(ale.a).dispatchMap("property", hfz::a, $$0 -> $$0);

   public static void a() {
      b.a(ale.b("custom_model_data"), hfv.a);
      b.a(ale.b("bundle/fullness"), hfp.a);
      b.a(ale.b("damage"), hfw.a);
      b.a(ale.b("cooldown"), hfs.a);
      b.a(ale.b("time"), hga.a);
      b.a(ale.b("compass"), hfq.a);
      b.a(ale.b("crossbow/pull"), hfu.a);
      b.a(ale.b("use_cycle"), hgb.a);
      b.a(ale.b("use_duration"), hgc.a);
      b.a(ale.b("count"), hft.a);
   }
}
