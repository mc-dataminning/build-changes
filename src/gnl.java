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

public class gnl extends gng {
   final Supplier<hmc> g;

   gnl(UUID $$0, Instant $$1, UUID $$2, Supplier<hmc> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hmc> a() {
      return this.g;
   }

   public gnl c() {
      gnl $$0 = new gnl(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public gad a(gad $$0, gnk $$1) {
      return new ges($$0, $$1, this);
   }

   public static class a extends gng.a<gnl> {
      public a(gnl $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hmc> $$1, AbuseReportLimits $$2) {
         super(new gnl(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gng.b c() {
         if (this.a.e == null) {
            return gng.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gng.b.d : super.c();
         }
      }

      @Override
      public Either<gng.c, gng.b> a(gnk $$0) {
         gng.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hmc $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gng.c(this.a.a, gnj.b, $$6));
         }
      }
   }
}
