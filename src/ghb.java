import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ghb {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected ghd e;
   protected boolean f;

   public ghb(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract ghb b();

   public abstract fui a(fui var1, ghf var2);

   public abstract static class a<R extends ghb> {
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
      public ghd i() {
         return this.a.e;
      }

      public void a(ghd $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public ghb.b c() {
         return !this.e().f ? ghb.b.e : null;
      }

      public abstract Either<ghb.c, ghb.b> a(ghf var1);
   }

   public static record b(wo f) {
      public static final ghb.b a = new ghb.b(wo.c("gui.abuseReport.send.no_reason"));
      public static final ghb.b b = new ghb.b(wo.c("gui.chatReport.send.no_reported_messages"));
      public static final ghb.b c = new ghb.b(wo.c("gui.chatReport.send.too_many_messages"));
      public static final ghb.b d = new ghb.b(wo.c("gui.abuseReport.send.comment_too_long"));
      public static final ghb.b e = new ghb.b(wo.c("gui.abuseReport.send.not_attested"));

      public fqb a() {
         return fqb.a(this.f);
      }

      public wo b() {
         return this.f;
      }
   }

   public static record c(UUID a, ghe b, AbuseReport c) {
   }
}
