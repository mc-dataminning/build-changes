import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fza {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fzc e;

   public fza(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fza b();

   public abstract fne a(fne var1, fze var2);

   public abstract static class a<R extends fza> {
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
      public fzc h() {
         return this.a.e;
      }

      public void a(fzc $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fza.b c();

      public abstract Either<fza.c, fza.b> a(fze var1);
   }

   public static record b(xp e) {
      public static final fza.b a = new fza.b(xp.c("gui.abuseReport.send.no_reason"));
      public static final fza.b b = new fza.b(xp.c("gui.chatReport.send.no_reported_messages"));
      public static final fza.b c = new fza.b(xp.c("gui.chatReport.send.too_many_messages"));
      public static final fza.b d = new fza.b(xp.c("gui.abuseReport.send.comment_too_long"));

      public fiq a() {
         return fiq.a(this.e);
      }

      public xp b() {
         return this.e;
      }
   }

   public static record c(UUID a, fzd b, AbuseReport c) {
   }
}
