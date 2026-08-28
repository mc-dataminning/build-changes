import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hey() implements hfi<cwq.a> {
   public static final hfi.a<hey, cwq.a> a = hfi.a.a(MapCodec.unit(new hey()), cwq.a.d);

   public cwq.a a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      daa $$5 = $$0.a(kx.P);
      if ($$5 == null || $$5.b()) {
         return cwq.a.a;
      } else {
         return $$5.a(cyc.vx) ? cwq.a.c : cwq.a.b;
      }
   }

   @Override
   public hfi.a<hey, cwq.a> a() {
      return a;
   }
}
