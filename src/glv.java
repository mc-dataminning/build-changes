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

public class glv extends glq {
   final Supplier<hkl> g;

   glv(UUID $$0, Instant $$1, UUID $$2, Supplier<hkl> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hkl> a() {
      return this.g;
   }

   public glv c() {
      glv $$0 = new glv(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fyn a(fyn $$0, glu $$1) {
      return new gdc($$0, $$1, this);
   }

   public static class a extends glq.a<glv> {
      public a(glv $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hkl> $$1, AbuseReportLimits $$2) {
         super(new glv(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public glq.b c() {
         if (this.a.e == null) {
            return glq.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? glq.b.d : super.c();
         }
      }

      @Override
      public Either<glq.c, glq.b> a(glu $$0) {
         glq.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hkl $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new glq.c(this.a.a, glt.b, $$6));
         }
      }
   }
}
