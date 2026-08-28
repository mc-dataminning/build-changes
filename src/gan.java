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

public class gan extends gai {
   final Supplier<grj> f;

   gan(UUID $$0, Instant $$1, UUID $$2, Supplier<grj> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<grj> a() {
      return this.f;
   }

   public gan c() {
      gan $$0 = new gan(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fob a(fob $$0, gam $$1) {
      return new fsp($$0, $$1, this);
   }

   public static class a extends gai.a<gan> {
      public a(gan $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<grj> $$1, AbuseReportLimits $$2) {
         super(new gan(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public gai.b c() {
         if (this.a.e == null) {
            return gai.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gai.b.d : null;
         }
      }

      @Override
      public Either<gai.c, gai.b> a(gam $$0) {
         gai.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            grj $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gai.c(this.a.a, gal.b, $$6));
         }
      }
   }
}
