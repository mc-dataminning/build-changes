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

public class gcv extends gcq {
   final Supplier<gyh> g;

   gcv(UUID $$0, Instant $$1, UUID $$2, Supplier<gyh> $$3) {
      super($$0, $$1, $$2);
      this.g = $$3;
   }

   public Supplier<gyh> a() {
      return this.g;
   }

   public gcv c() {
      gcv $$0 = new gcv(this.a, this.b, this.c, this.g);
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      return $$0;
   }

   @Override
   public fqh a(fqh $$0, gcu $$1) {
      return new fut($$0, $$1, this);
   }

   public static class a extends gcq.a<gcv> {
      public a(gcv $$0, AbuseReportLimits $$1) {
         super($$0, $$1);
      }

      public a(UUID $$0, Supplier<gyh> $$1, AbuseReportLimits $$2) {
         super(new gcv(UUID.randomUUID(), Instant.now(), $$0, $$1), $$2);
      }

      @Override
      public boolean b() {
         return StringUtils.isNotEmpty(this.g()) || this.i() != null;
      }

      @Nullable
      @Override
      public gcq.b c() {
         if (this.a.e == null) {
            return gcq.b.a;
         } else {
            return this.a.d.length() > this.b.maxOpinionCommentsLength() ? gcq.b.d : super.c();
         }
      }

      @Override
      public Either<gcq.c, gcq.b> a(gcu $$0) {
         gcq.b $$1 = this.c();
         if ($$1 != null) {
            return Either.right($$1);
         } else {
            String $$2 = Objects.requireNonNull(this.a.e).a();
            ReportedEntity $$3 = new ReportedEntity(this.a.c);
            gyh $$4 = this.a.g.get();
            String $$5 = $$4.b();
            AbuseReport $$6 = AbuseReport.skin(this.a.d, $$2, $$5, $$3, this.a.b);
            return Either.left(new gcq.c(this.a.a, gct.b, $$6));
         }
      }
   }
}
