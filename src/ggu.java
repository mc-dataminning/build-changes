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

public class ggu extends ggp {
   final Supplier<hcm> g;

   ggu(UUID $$0, Instant $$1, UUID $$2, Supplier<hcm> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hcm> a() {
      return this.g;
   }

   public ggu c() {
      ggu $$0 = new ggu(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fty a(fty $$0, ggt $$1) {
      return new fyl($$0, $$1, this);
   }

   public static class a extends ggp.a<ggu> {
      public a(ggu $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hcm> $$1, AbuseReportLimits $$2) {
         super(new ggu(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public ggp.b c() {
         if (this.a.e == null) {
            return ggp.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ggp.b.d : super.c();
         }
      }

      @Override
      public Either<ggp.c, ggp.b> a(ggt $$0) {
         ggp.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hcm $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new ggp.c(this.a.a, ggs.b, $$6));
         }
      }
   }
}
