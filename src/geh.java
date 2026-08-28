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

public class geh extends gec {
   final Supplier<gzu> g;

   geh(UUID $$0, Instant $$1, UUID $$2, Supplier<gzu> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<gzu> a() {
      return this.g;
   }

   public geh c() {
      geh $$0 = new geh(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public frp a(frp $$0, geg $$1) {
      return new fwb($$0, $$1, this);
   }

   public static class a extends gec.a<geh> {
      public a(geh $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gzu> $$1, AbuseReportLimits $$2) {
         super(new geh(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gec.b c() {
         if (this.a.e == null) {
            return gec.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gec.b.d : super.c();
         }
      }

      @Override
      public Either<gec.c, gec.b> a(geg $$0) {
         gec.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gzu $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gec.c(this.a.a, gef.b, $$6));
         }
      }
   }
}
