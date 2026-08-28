import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgf() implements hgp<cxl.a> {
   public static final Codec<cxl.a> a = cxl.a.d;
   public static final hgp.a<hgf, cxl.a> b = hgp.a.a(MapCodec.unit(new hgf()), a);

   public cxl.a a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      daw $$5 = $$0.a(kj.P);
      if ($$5 == null || $$5.b()) {
         return cxl.a.a;
      } else {
         return $$5.a(cyw.vx) ? cxl.a.c : cxl.a.b;
      }
   }

   @Override
   public hgp.a<hgf, cxl.a> a() {
      return b;
   }

   @Override
   public Codec<cxl.a> b() {
      return a;
   }
}
