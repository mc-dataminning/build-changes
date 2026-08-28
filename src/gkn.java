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

public class gkn extends gki {
   final Supplier<hja> g;

   gkn(UUID $$0, Instant $$1, UUID $$2, Supplier<hja> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hja> a() {
      return this.g;
   }

   public gkn c() {
      gkn $$0 = new gkn(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fxi a(fxi $$0, gkm $$1) {
      return new gbx($$0, $$1, this);
   }

   public static class a extends gki.a<gkn> {
      public a(gkn $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hja> $$1, AbuseReportLimits $$2) {
         super(new gkn(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gki.b c() {
         if (this.a.e == null) {
            return gki.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gki.b.d : super.c();
         }
      }

      @Override
      public Either<gki.c, gki.b> a(gkm $$0) {
         gki.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hja $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gki.c(this.a.a, gkl.b, $$6));
         }
      }
   }
}
