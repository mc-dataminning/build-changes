import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gni {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gnk e;
   protected boolean f;

   public gni(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gni b();

   public abstract gaf a(gaf var1, gnm var2);

   public abstract static class a<R extends gni> {
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
      public gnk i() {
         return this.a.e;
      }

      public void a(gnk $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gni.b c() {
         return !this.e().f ? gni.b.e : null;
      }

      public abstract Either<gni.c, gni.b> a(gnm var1);
   }

   public static record b(xc f) {
      public static final gni.b a = new gni.b(xc.c("gui.abuseReport.send.no_reason"));
      public static final gni.b b = new gni.b(xc.c("gui.chatReport.send.no_reported_messages"));
      public static final gni.b c = new gni.b(xc.c("gui.chatReport.send.too_many_messages"));
      public static final gni.b d = new gni.b(xc.c("gui.abuseReport.send.comment_too_long"));
      public static final gni.b e = new gni.b(xc.c("gui.abuseReport.send.not_attested"));

      public fvy a() {
         return fvy.a(this.f);
      }

      public xc b() {
         return this.f;
      }
   }

   public static record c(UUID a, gnl b, AbuseReport c) {
   }
}
