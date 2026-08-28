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

public class gdr extends gdm {
   final Supplier<gze> g;

   gdr(UUID $$0, Instant $$1, UUID $$2, Supplier<gze> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<gze> a() {
      return this.g;
   }

   public gdr c() {
      gdr $$0 = new gdr(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fra a(fra $$0, gdq $$1) {
      return new fvm($$0, $$1, this);
   }

   public static class a extends gdm.a<gdr> {
      public a(gdr $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gze> $$1, AbuseReportLimits $$2) {
         super(new gdr(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gdm.b c() {
         if (this.a.e == null) {
            return gdm.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gdm.b.d : super.c();
         }
      }

      @Override
      public Either<gdm.c, gdm.b> a(gdq $$0) {
         gdm.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gze $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gdm.c(this.a.a, gdp.b, $$6));
         }
      }
   }
}
