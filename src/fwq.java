import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fwq {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fws e;

   public fwq(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fwq b();

   public abstract fkt a(fkt var1, fwu var2);

   public abstract static class a<R extends fwq> {
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
      public fws h() {
         return this.a.e;
      }

      public void a(fws $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fwq.b c();

      public abstract Either<fwq.c, fwq.b> a(fwu var1);
   }

   public static record b(ws e) {
      public static final fwq.b a = new fwq.b(ws.c("gui.abuseReport.send.no_reason"));
      public static final fwq.b b = new fwq.b(ws.c("gui.chatReport.send.no_reported_messages"));
      public static final fwq.b c = new fwq.b(ws.c("gui.chatReport.send.too_many_messages"));
      public static final fwq.b d = new fwq.b(ws.c("gui.abuseReport.send.comment_too_long"));

      public fgf a() {
         return fgf.a(this.e);
      }

      public ws b() {
         return this.e;
      }
   }

   public static record c(UUID a, fwt b, AbuseReport c) {
   }
}
