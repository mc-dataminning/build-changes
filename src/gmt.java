import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gmt {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gmv e;
   protected boolean f;

   public gmt(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gmt b();

   public abstract fzq a(fzq var1, gmx var2);

   public abstract static class a<R extends gmt> {
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
      public gmv i() {
         return this.a.e;
      }

      public void a(gmv $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gmt.b c() {
         return !this.e().f ? gmt.b.e : null;
      }

      public abstract Either<gmt.c, gmt.b> a(gmx var1);
   }

   public static record b(xg f) {
      public static final gmt.b a = new gmt.b(xg.c("gui.abuseReport.send.no_reason"));
      public static final gmt.b b = new gmt.b(xg.c("gui.chatReport.send.no_reported_messages"));
      public static final gmt.b c = new gmt.b(xg.c("gui.chatReport.send.too_many_messages"));
      public static final gmt.b d = new gmt.b(xg.c("gui.abuseReport.send.comment_too_long"));
      public static final gmt.b e = new gmt.b(xg.c("gui.abuseReport.send.not_attested"));

      public fvj a() {
         return fvj.a(this.f);
      }

      public xg b() {
         return this.f;
      }
   }

   public static record c(UUID a, gmw b, AbuseReport c) {
   }
}
