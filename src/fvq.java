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

public class fvq extends fvl {
   final Supplier<gmi> f;

   fvq(UUID $$0, Instant $$1, UUID $$2, Supplier<gmi> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gmi> a() {
      return this.f;
   }

   public fvq c() {
      fvq $$0 = new fvq(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fjo a(fjo $$0, fvp $$1) {
      return new fns($$0, $$1, this);
   }

   public static class a extends fvl.a<fvq> {
      public a(fvq $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gmi> $$1, AbuseReportLimits $$2) {
         super(new fvq(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fvl.b c() {
         if (this.a.e == null) {
            return fvl.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fvl.b.d : null;
         }
      }

      @Override
      public Either<fvl.c, fvl.b> a(fvp $$0) {
         fvl.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gmi $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fvl.c(this.a.a, fvo.b, $$6));
         }
      }
   }
}
