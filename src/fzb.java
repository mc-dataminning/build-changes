import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class fzb {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected fzd e;

   public fzb(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract fzb b();

   public abstract fnf a(fnf var1, fzf var2);

   public abstract static class a<R extends fzb> {
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
      public fzd h() {
         return this.a.e;
      }

      public void a(fzd $$0) {
         this.a.e = $$0;
      }

      public abstract boolean b();

      @Nullable
      public abstract fzb.b c();

      public abstract Either<fzb.c, fzb.b> a(fzf var1);
   }

   public static record b(xp e) {
      public static final fzb.b a = new fzb.b(xp.c("gui.abuseReport.send.no_reason"));
      public static final fzb.b b = new fzb.b(xp.c("gui.chatReport.send.no_reported_messages"));
      public static final fzb.b c = new fzb.b(xp.c("gui.chatReport.send.too_many_messages"));
      public static final fzb.b d = new fzb.b(xp.c("gui.abuseReport.send.comment_too_long"));

      public fir a() {
         return fir.a(this.e);
      }

      public xp b() {
         return this.e;
      }
   }

   public static record c(UUID a, fze b, AbuseReport c) {
   }
}
