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

public class fyz extends fyu {
   final Supplier<gpu> f;

   fyz(UUID $$0, Instant $$1, UUID $$2, Supplier<gpu> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gpu> a() {
      return this.f;
   }

   public fyz c() {
      fyz $$0 = new fyz(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fmy a(fmy $$0, fyy $$1) {
      return new frc($$0, $$1, this);
   }

   public static class a extends fyu.a<fyz> {
      public a(fyz $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gpu> $$1, AbuseReportLimits $$2) {
         super(new fyz(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fyu.b c() {
         if (this.a.e == null) {
            return fyu.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fyu.b.d : null;
         }
      }

      @Override
      public Either<fyu.c, fyu.b> a(fyy $$0) {
         fyu.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gpu $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fyu.c(this.a.a, fyx.b, $$6));
         }
      }
   }
}
