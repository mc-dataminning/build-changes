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

public class ggn extends ggi {
   final Supplier<hcf> g;

   ggn(UUID $$0, Instant $$1, UUID $$2, Supplier<hcf> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hcf> a() {
      return this.g;
   }

   public ggn c() {
      ggn $$0 = new ggn(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public ftr a(ftr $$0, ggm $$1) {
      return new fye($$0, $$1, this);
   }

   public static class a extends ggi.a<ggn> {
      public a(ggn $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hcf> $$1, AbuseReportLimits $$2) {
         super(new ggn(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public ggi.b c() {
         if (this.a.e == null) {
            return ggi.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ggi.b.d : super.c();
         }
      }

      @Override
      public Either<ggi.c, ggi.b> a(ggm $$0) {
         ggi.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hcf $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new ggi.c(this.a.a, ggl.b, $$6));
         }
      }
   }
}
