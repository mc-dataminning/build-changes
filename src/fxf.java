import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fxf extends fxa {
   final Supplier<gny> f;

   fxf(UUID $$0, Instant $$1, UUID $$2, Supplier<gny> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gny> a() {
      return this.f;
   }

   public fxf c() {
      fxf $$0 = new fxf(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fld a(fld $$0, fxe $$1) {
      return new fpi($$0, $$1, this);
   }

   public static class a extends fxa.a<fxf> {
      public a(fxf $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gny> $$1, AbuseReportLimits $$2) {
         super(new fxf(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fxa.b c() {
         if (this.a.e == null) {
            return fxa.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fxa.b.d : null;
         }
      }

      @Override
      public Either<fxa.c, fxa.b> a(fxe $$0) {
         fxa.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gny $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fxa.c(this.a.a, fxd.b, $$6));
         }
      }
   }
}
