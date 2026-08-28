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

public class gmy extends gmt {
   final Supplier<hls> g;

   gmy(UUID $$0, Instant $$1, UUID $$2, Supplier<hls> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hls> a() {
      return this.g;
   }

   public gmy c() {
      gmy $$0 = new gmy(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fzq a(fzq $$0, gmx $$1) {
      return new gef($$0, $$1, this);
   }

   public static class a extends gmt.a<gmy> {
      public a(gmy $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hls> $$1, AbuseReportLimits $$2) {
         super(new gmy(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gmt.b c() {
         if (this.a.e == null) {
            return gmt.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gmt.b.d : super.c();
         }
      }

      @Override
      public Either<gmt.c, gmt.b> a(gmx $$0) {
         gmt.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hls $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gmt.c(this.a.a, gmw.b, $$6));
         }
      }
   }
}
