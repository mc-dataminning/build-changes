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

public class gaj extends gae {
   final Supplier<grf> f;

   gaj(UUID $$0, Instant $$1, UUID $$2, Supplier<grf> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<grf> a() {
      return this.f;
   }

   public gaj c() {
      gaj $$0 = new gaj(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fnx a(fnx $$0, gai $$1) {
      return new fsl($$0, $$1, this);
   }

   public static class a extends gae.a<gaj> {
      public a(gaj $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<grf> $$1, AbuseReportLimits $$2) {
         super(new gaj(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public gae.b c() {
         if (this.a.e == null) {
            return gae.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gae.b.d : null;
         }
      }

      @Override
      public Either<gae.c, gae.b> a(gai $$0) {
         gae.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            grf $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gae.c(this.a.a, gah.b, $$6));
         }
      }
   }
}
