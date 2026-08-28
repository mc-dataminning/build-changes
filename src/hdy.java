import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdy() implements heh<cvz.a> {
   public static final heh.a<hdy, cvz.a> a = heh.a.a(MapCodec.unit(new hdy()), cvz.a.d);

   public cvz.a a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      czk $$5 = $$0.a(kv.P);
      if ($$5 == null || $$5.b()) {
         return cvz.a.a;
      } else {
         return $$5.a(cxl.vv) ? cvz.a.c : cvz.a.b;
      }
   }

   @Override
   public heh.a<hdy, cvz.a> a() {
      return a;
   }
}
