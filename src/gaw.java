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

public class gaw extends gar {
   final Supplier<gry> f;

   gaw(UUID $$0, Instant $$1, UUID $$2, Supplier<gry> $$3) {
      super($$0, $$1, $$2);
      this.f = $$3;
   }

   public Supplier<gry> a() {
      return this.f;
   }

   public gaw c() {
      gaw $$0 = new gaw(this.a, this.b, this.c, this.f);
      $$0.d = this.d;
      $$0.e = this.e;
      return $$0;
   }

   @Override
   public fon a(fon $$0, gav $$1) {
      return new fsw($$0, $$1, this);
   }

   public static class a extends gar.a<gaw> {
      public a(gaw $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gry> $$1, AbuseReportLimits $$2) {
         super(new gaw(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.h() != null;
      }

      @Nullable
      @Override
      public gar.b c() {
         if (this.a.e == null) {
            return gar.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gar.b.d : null;
         }
      }

      @Override
      public Either<gar.c, gar.b> a(gav $$0) {
         gar.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gry $$4 = this.a.f.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gar.c(this.a.a, gau.b, $$6));
         }
      }
   }
}
