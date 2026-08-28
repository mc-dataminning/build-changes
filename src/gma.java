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

public class gma extends glv {
   final Supplier<hks> g;

   gma(UUID $$0, Instant $$1, UUID $$2, Supplier<hks> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hks> a() {
      return this.g;
   }

   public gma c() {
      gma $$0 = new gma(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fys a(fys $$0, glz $$1) {
      return new gdh($$0, $$1, this);
   }

   public static class a extends glv.a<gma> {
      public a(gma $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hks> $$1, AbuseReportLimits $$2) {
         super(new gma(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public glv.b c() {
         if (this.a.e == null) {
            return glv.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? glv.b.d : super.c();
         }
      }

      @Override
      public Either<glv.c, glv.b> a(glz $$0) {
         glv.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hks $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new glv.c(this.a.a, gly.b, $$6));
         }
      }
   }
}
