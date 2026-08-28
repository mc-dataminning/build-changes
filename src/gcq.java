import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gcq {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gcs e;
   protected boolean f;

   public gcq(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gcq b();

   public abstract fqh a(fqh var1, gcu var2);

   public abstract static class a<R extends gcq> {
      protected final R a;
      protected final AbuseReportLimits b;

      protected a(R $$0, AbuseReportLimits $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public R e() {
         return this.a;
      }

      public UUID f() {
         return this.a.c;
      }

      public String g() {
         return this.a.d;
      }

      public boolean h() {
         return this.e().f;
      }

      public void a(String $$0) {
         this.a.d = $$0;
      }

      @Nullable
      public gcs i() {
         return this.a.e;
      }

      public void a(gcs $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gcq.b c() {
         return !this.e().f ? gcq.b.e : null;
      }

      public abstract Either<gcq.c, gcq.b> a(gcu var1);
   }

   public static record b(xe f) {
      public static final gcq.b a = new gcq.b(xe.c("gui.abuseReport.send.no_reason"));
      public static final gcq.b b = new gcq.b(xe.c("gui.chatReport.send.no_reported_messages"));
      public static final gcq.b c = new gcq.b(xe.c("gui.chatReport.send.too_many_messages"));
      public static final gcq.b d = new gcq.b(xe.c("gui.abuseReport.send.comment_too_long"));
      public static final gcq.b e = new gcq.b(xe.c("gui.abuseReport.send.not_attested"));

      public flz a() {
         return flz.a(this.f);
      }

      public xe b() {
         return this.f;
      }
   }

   public static record c(UUID a, gct b, AbuseReport c) {
   }
}
