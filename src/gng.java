import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gng {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gni e;
   protected boolean f;

   public gng(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gng b();

   public abstract gad a(gad var1, gnk var2);

   public abstract static class a<R extends gng> {
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
      public gni i() {
         return this.a.e;
      }

      public void a(gni $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gng.b c() {
         return !this.e().f ? gng.b.e : null;
      }

      public abstract Either<gng.c, gng.b> a(gnk var1);
   }

   public static record b(xa f) {
      public static final gng.b a = new gng.b(xa.c("gui.abuseReport.send.no_reason"));
      public static final gng.b b = new gng.b(xa.c("gui.chatReport.send.no_reported_messages"));
      public static final gng.b c = new gng.b(xa.c("gui.chatReport.send.too_many_messages"));
      public static final gng.b d = new gng.b(xa.c("gui.abuseReport.send.comment_too_long"));
      public static final gng.b e = new gng.b(xa.c("gui.abuseReport.send.not_attested"));

      public fvw a() {
         return fvw.a(this.f);
      }

      public xa b() {
         return this.f;
      }
   }

   public static record c(UUID a, gnj b, AbuseReport c) {
   }
}
