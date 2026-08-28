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

public class fzv extends fzq {
   final Supplier<gqq> f;

   fzv(UUID $$0, Instant $$1, UUID $$2, Supplier<gqq> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gqq> a() {
      return this.f;
   }

   public fzv c() {
      fzv $$0 = new fzv(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fnl a(fnl $$0, fzu $$1) {
      return new frx($$0, $$1, this);
   }

   public static class a extends fzq.a<fzv> {
      public a(fzv $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gqq> $$1, AbuseReportLimits $$2) {
         super(new fzv(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fzq.b c() {
         if (this.a.e == null) {
            return fzq.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fzq.b.d : null;
         }
      }

      @Override
      public Either<fzq.c, fzq.b> a(fzu $$0) {
         fzq.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gqq $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fzq.c(this.a.a, fzt.b, $$6));
         }
      }
   }
}
