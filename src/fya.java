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

public class fya extends fxv {
   final Supplier<gov> f;

   fya(UUID $$0, Instant $$1, UUID $$2, Supplier<gov> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gov> a() {
      return this.f;
   }

   public fya c() {
      fya $$0 = new fya(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fly a(fly $$0, fxz $$1) {
      return new fqd($$0, $$1, this);
   }

   public static class a extends fxv.a<fya> {
      public a(fya $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gov> $$1, AbuseReportLimits $$2) {
         super(new fya(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fxv.b c() {
         if (this.a.e == null) {
            return fxv.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fxv.b.d : null;
         }
      }

      @Override
      public Either<fxv.c, fxv.b> a(fxz $$0) {
         fxv.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gov $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fxv.c(this.a.a, fxy.b, $$6));
         }
      }
   }
}
