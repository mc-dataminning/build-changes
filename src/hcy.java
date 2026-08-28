import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcy() implements hdh<cvf.a> {
   public static final hdh.a<hcy, cvf.a> a = hdh.a.a(MapCodec.unit(new hcy()), cvf.a.d);

   public cvf.a a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      cyt $$5 = $$0.a(kv.O);
      if ($$5 == null || $$5.b()) {
         return cvf.a.a;
      } else {
         return $$5.a(cws.vt) ? cvf.a.c : cvf.a.b;
      }
   }

   @Override
   public hdh.a<hcy, cvf.a> a() {
      return a;
   }
}
