import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ghe {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected ghg e;
   protected boolean f;

   public ghe(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract ghe b();

   public abstract ful a(ful var1, ghi var2);

   public abstract static class a<R extends ghe> {
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
      public ghg i() {
         return this.a.e;
      }

      public void a(ghg $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public ghe.b c() {
         return !this.e().f ? ghe.b.e : null;
      }

      public abstract Either<ghe.c, ghe.b> a(ghi var1);
   }

   public static record b(wp f) {
      public static final ghe.b a = new ghe.b(wp.c("gui.abuseReport.send.no_reason"));
      public static final ghe.b b = new ghe.b(wp.c("gui.chatReport.send.no_reported_messages"));
      public static final ghe.b c = new ghe.b(wp.c("gui.chatReport.send.too_many_messages"));
      public static final ghe.b d = new ghe.b(wp.c("gui.abuseReport.send.comment_too_long"));
      public static final ghe.b e = new ghe.b(wp.c("gui.abuseReport.send.not_attested"));

      public fqe a() {
         return fqe.a(this.f);
      }

      public wp b() {
         return this.f;
      }
   }

   public static record c(UUID a, ghh b, AbuseReport c) {
   }
}
