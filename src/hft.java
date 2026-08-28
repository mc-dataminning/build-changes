import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hft implements hfw<kt> {
   private final gfs a;

   public hft(gfs $$0) {
      this.a = $$0;
   }

   @Nullable
   public kt a(cxy $$0) {
      return $$0.e();
   }

   public void a(@Nullable kt $$0, cxw $$1, fho $$2, gny $$3, int $$4, int $$5, boolean $$6) {
      dvb $$7 = $$0 != null ? $$0.a(kx.ak, dvb.a) : dvb.a;
      cwv $$8 = $$0 != null ? $$0.a(kx.al) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hiz $$10 = $$9 ? hjc.g : hjc.h;
      fhs $$11 = $$10.c().a(gvd.a($$3, this.a.a($$10.a()), $$1 == cxw.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         gqf.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cwv.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hfw.a {
      public static final hft.a a = new hft.a();
      public static final MapCodec<hft.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hft.a> a() {
         return b;
      }

      @Override
      public hfw<?> a(ggz $$0) {
         return new hft(new gfs($$0.a(ghc.cN)));
      }
   }
}
