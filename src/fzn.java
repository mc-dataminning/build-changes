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

public class fzn extends fzi {
   final Supplier<gqi> f;

   fzn(UUID $$0, Instant $$1, UUID $$2, Supplier<gqi> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gqi> a() {
      return this.f;
   }

   public fzn c() {
      fzn $$0 = new fzn(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fnd a(fnd $$0, fzm $$1) {
      return new frp($$0, $$1, this);
   }

   public static class a extends fzi.a<fzn> {
      public a(fzn $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gqi> $$1, AbuseReportLimits $$2) {
         super(new fzn(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fzi.b c() {
         if (this.a.e == null) {
            return fzi.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fzi.b.d : null;
         }
      }

      @Override
      public Either<fzi.c, fzi.b> a(fzm $$0) {
         fzi.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gqi $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fzi.c(this.a.a, fzl.b, $$6));
         }
      }
   }
}
