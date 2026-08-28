import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdn implements hdq<kr> {
   private final gdp a;

   public hdn(gdp $$0) {
      this.a = $$0;
   }

   @Nullable
   public kr a(cwn $$0) {
      return $$0.e();
   }

   public void a(@Nullable kr $$0, cwl $$1, ffs $$2, glv $$3, int $$4, int $$5, boolean $$6) {
      dto $$7 = $$0 != null ? $$0.a(kv.ai, dto.a) : dto.a;
      cvk $$8 = $$0 != null ? $$0.a(kv.aj) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hgt $$10 = $$9 ? hgw.g : hgw.h;
      ffw $$11 = $$10.c().a(gsz.a($$3, this.a.a($$10.a()), $$1 == cwl.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         goc.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, cvk.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hdq.a {
      public static final hdn.a a = new hdn.a();
      public static final MapCodec<hdn.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hdn.a> a() {
         return b;
      }

      @Override
      public hdq<?> a(gew $$0) {
         return new hdn(new gdp($$0.a(gez.cD)));
      }
   }
}
