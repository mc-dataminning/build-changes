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

public class fzf extends fza {
   final Supplier<gqa> f;

   fzf(UUID $$0, Instant $$1, UUID $$2, Supplier<gqa> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gqa> a() {
      return this.f;
   }

   public fzf c() {
      fzf $$0 = new fzf(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fne a(fne $$0, fze $$1) {
      return new fri($$0, $$1, this);
   }

   public static class a extends fza.a<fzf> {
      public a(fzf $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gqa> $$1, AbuseReportLimits $$2) {
         super(new fzf(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fza.b c() {
         if (this.a.e == null) {
            return fza.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fza.b.d : null;
         }
      }

      @Override
      public Either<fza.c, fza.b> a(fze $$0) {
         fza.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gqa $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fza.c(this.a.a, fzd.b, $$6));
         }
      }
   }
}
