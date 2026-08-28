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

public class gjj extends gje {
   final Supplier<hhu> g;

   gjj(UUID $$0, Instant $$1, UUID $$2, Supplier<hhu> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<hhu> a() {
      return this.g;
   }

   public gjj c() {
      gjj $$0 = new gjj(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fwf a(fwf $$0, gji $$1) {
      return new gau($$0, $$1, this);
   }

   public static class a extends gje.a<gjj> {
      public a(gjj $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<hhu> $$1, AbuseReportLimits $$2) {
         super(new gjj(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gje.b c() {
         if (this.a.e == null) {
            return gje.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gje.b.d : super.c();
         }
      }

      @Override
      public Either<gje.c, gje.b> a(gji $$0) {
         gje.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            hhu $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gje.c(this.a.a, gjh.b, $$6));
         }
      }
   }
}
