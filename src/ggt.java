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

public class ggt extends ggo {
   final Supplier<hcl> g;

   ggt(UUID $$0, Instant $$1, UUID $$2, Supplier<hcl> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hcl> a() {
      return this.g;
   }

   public ggt c() {
      ggt $$0 = new ggt(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public ftx a(ftx $$0, ggs $$1) {
      return new fyk($$0, $$1, this);
   }

   public static class a extends ggo.a<ggt> {
      public a(ggt $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hcl> $$1, AbuseReportLimits $$2) {
         super(new ggt(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public ggo.b c() {
         if (this.a.e == null) {
            return ggo.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? ggo.b.d : super.c();
         }
      }

      @Override
      public Either<ggo.c, ggo.b> a(ggs $$0) {
         ggo.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hcl $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new ggo.c(this.a.a, ggr.b, $$6));
         }
      }
   }
}
