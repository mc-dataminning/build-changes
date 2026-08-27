import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fxv {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fxx e;

   public fxv(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fxv b();

   public abstract fly a(fly var1, fxz var2);

   public abstract static class a<R extends fxv> {
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

      public void a(String $$0) {
         this.a.d = $$0;
      }

      @Nullable
      public fxx h() {
         return this.a.e;
      }

      public void a(fxx $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fxv.b c();

      public abstract Either<fxv.c, fxv.b> a(fxz var1);
   }

   public static record b(wx e) {
      public static final fxv.b a = new fxv.b(wx.c("gui.abuseReport.send.no_reason"));
      public static final fxv.b b = new fxv.b(wx.c("gui.chatReport.send.no_reported_messages"));
      public static final fxv.b c = new fxv.b(wx.c("gui.chatReport.send.too_many_messages"));
      public static final fxv.b d = new fxv.b(wx.c("gui.abuseReport.send.comment_too_long"));

      public fhk a() {
         return fhk.a(this.e);
      }

      public wx b() {
         return this.e;
      }
   }

   public static record c(UUID a, fxy b, AbuseReport c) {
   }
}
