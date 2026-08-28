import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcv() implements hdb<cvg.a> {
   public static final hdb.a<hcv, cvg.a> a = hdb.a.a(MapCodec.unit(new hcv()), cvg.a.d);

   public cvg.a a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwn $$4) {
      cyu $$5 = $$0.a(kv.O);
      if ($$5 == null || $$5.b()) {
         return cvg.a.a;
      } else {
         return $$5.a(cwt.vt) ? cvg.a.c : cvg.a.b;
      }
   }

   @Override
   public hdb.a<hcv, cvg.a> a() {
      return a;
   }
}
