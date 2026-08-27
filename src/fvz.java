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

public class fvz extends fvu {
   final Supplier<gmr> f;

   fvz(UUID $$0, Instant $$1, UUID $$2, Supplier<gmr> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gmr> a() {
      return this.f;
   }

   public fvz c() {
      fvz $$0 = new fvz(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fjx a(fjx $$0, fvy $$1) {
      return new fob($$0, $$1, this);
   }

   public static class a extends fvu.a<fvz> {
      public a(fvz $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gmr> $$1, AbuseReportLimits $$2) {
         super(new fvz(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public fvu.b c() {
         if (this.a.e == null) {
            return fvu.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? fvu.b.d : null;
         }
      }

      @Override
      public Either<fvu.c, fvu.b> a(fvy $$0) {
         fvu.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gmr $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new fvu.c(this.a.a, fvx.b, $$6));
         }
      }
   }
}
