import com.mojang.serialization.MapCodec;

public class hdr {
   private static final ayi.b<aku, MapCodec<? extends hds>> b = new ayi.b<>();
   public static final MapCodec<hds> a = b.a(aku.a).dispatchMap("property", hds::a, $$0 -> $$0);

   public static void a() {
      b.a(aku.b("custom_model_data"), hdo.a);
      b.a(aku.b("bundle/fullness"), hdi.a);
      b.a(aku.b("damage"), hdp.a);
      b.a(aku.b("cooldown"), hdl.a);
      b.a(aku.b("time"), hdt.a);
      b.a(aku.b("compass"), hdj.a);
      b.a(aku.b("crossbow/pull"), hdn.a);
      b.a(aku.b("use_cycle"), hdu.a);
      b.a(aku.b("use_duration"), hdv.a);
      b.a(aku.b("count"), hdm.a);
   }
}
