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

public class glb extends gkw {
   final Supplier<hjq> g;

   glb(UUID $$0, Instant $$1, UUID $$2, Supplier<hjq> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hjq> a() {
      return this.g;
   }

   public glb c() {
      glb $$0 = new glb(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fxu a(fxu $$0, gla $$1) {
      return new gcj($$0, $$1, this);
   }

   public static class a extends gkw.a<glb> {
      public a(glb $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hjq> $$1, AbuseReportLimits $$2) {
         super(new glb(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gkw.b c() {
         if (this.a.e == null) {
            return gkw.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gkw.b.d : super.c();
         }
      }

      @Override
      public Either<gkw.c, gkw.b> a(gla $$0) {
         gkw.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hjq $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gkw.c(this.a.a, gkz.b, $$6));
         }
      }
   }
}
