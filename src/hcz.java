import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcz() implements hdi<cvg.a> {
   public static final hdi.a<hcz, cvg.a> a = hdi.a.a(MapCodec.unit(new hcz()), cvg.a.d);

   public cvg.a a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      cyu $$5 = $$0.a(kv.O);
      if ($$5 == null || $$5.b()) {
         return cvg.a.a;
      } else {
         return $$5.a(cwt.vt) ? cvg.a.c : cvg.a.b;
      }
   }

   @Override
   public hdi.a<hcz, cvg.a> a() {
      return a;
   }
}
