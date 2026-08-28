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

public class gap extends gak {
   final Supplier<grl> g;

   gap(UUID $$0, Instant $$1, UUID $$2, Supplier<grl> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<grl> a() {
      return this.g;
   }

   public gap c() {
      gap $$0 = new gap(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fod a(fod $$0, gao $$1) {
      return new fsr($$0, $$1, this);
   }

   public static class a extends gak.a<gap> {
      public a(gap $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<grl> $$1, AbuseReportLimits $$2) {
         super(new gap(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gak.b c() {
         if (this.a.e == null) {
            return gak.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gak.b.d : super.c();
         }
      }

      @Override
      public Either<gak.c, gak.b> a(gao $$0) {
         gak.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            grl $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gak.c(this.a.a, gan.b, $$6));
         }
      }
   }
}
