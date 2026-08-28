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

public class gcg extends gcb {
   final Supplier<gxl> g;

   gcg(UUID $$0, Instant $$1, UUID $$2, Supplier<gxl> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<gxl> a() {
      return this.g;
   }

   public gcg c() {
      gcg $$0 = new gcg(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fpt a(fpt $$0, gcf $$1) {
      return new fuf($$0, $$1, this);
   }

   public static class a extends gcb.a<gcg> {
      public a(gcg $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gxl> $$1, AbuseReportLimits $$2) {
         super(new gcg(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gcb.b c() {
         if (this.a.e == null) {
            return gcb.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gcb.b.d : super.c();
         }
      }

      @Override
      public Either<gcb.c, gcb.b> a(gcf $$0) {
         gcb.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gxl $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gcb.c(this.a.a, gce.b, $$6));
         }
      }
   }
}
