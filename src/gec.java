import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gec {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gee e;
   protected boolean f;

   public gec(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gec b();

   public abstract frp a(frp var1, geg var2);

   public abstract static class a<R extends gec> {
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
      public gee i() {
         return this.a.e;
      }

      public void a(gee $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gec.b c() {
         return !this.e().f ? gec.b.e : null;
      }

      public abstract Either<gec.c, gec.b> a(geg var1);
   }

   public static record b(xl f) {
      public static final gec.b a = new gec.b(xl.c("gui.abuseReport.send.no_reason"));
      public static final gec.b b = new gec.b(xl.c("gui.chatReport.send.no_reported_messages"));
      public static final gec.b c = new gec.b(xl.c("gui.chatReport.send.too_many_messages"));
      public static final gec.b d = new gec.b(xl.c("gui.abuseReport.send.comment_too_long"));
      public static final gec.b e = new gec.b(xl.c("gui.abuseReport.send.not_attested"));

      public fnh a() {
         return fnh.a(this.f);
      }

      public xl b() {
         return this.f;
      }
   }

   public static record c(UUID a, gef b, AbuseReport c) {
   }
}
