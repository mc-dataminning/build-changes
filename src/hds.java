import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hds implements hdv<kr> {
   private final gdr a;

   public hds(gdr $$0) {
      this.a = $$0;
   }

   @Nullable
   public kr a(cwo $$0) {
      return $$0.e();
   }

   public void a(@Nullable kr $$0, cwm $$1, fft $$2, glx $$3, int $$4, int $$5, boolean $$6) {
      dtp $$7 = $$0 != null ? $$0.a(kv.ai, dtp.a) : dtp.a;
      cvl $$8 = $$0 != null ? $$0.a(kv.aj) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hgy $$10 = $$9 ? hhb.g : hhb.h;
      ffx $$11 = $$10.c().a(gtb.a($$3, this.a.a($$10.a()), $$1 == cwm.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         goe.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cvl.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hdv.a {
      public static final hds.a a = new hds.a();
      public static final MapCodec<hds.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hds.a> a() {
         return b;
      }

      @Override
      public hdv<?> a(gey $$0) {
         return new hds(new gdr($$0.a(gfb.cD)));
      }
   }
}
