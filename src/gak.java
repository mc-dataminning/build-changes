import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gak {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gam e;
   protected boolean f;

   public gak(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gak b();

   public abstract fod a(fod var1, gao var2);

   public abstract static class a<R extends gak> {
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
      public gam i() {
         return this.a.e;
      }

      public void a(gam $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gak.b c() {
         return !this.e().f ? gak.b.e : null;
      }

      public abstract Either<gak.c, gak.b> a(gao var1);
   }

   public static record b(wz f) {
      public static final gak.b a = new gak.b(wz.c("gui.abuseReport.send.no_reason"));
      public static final gak.b b = new gak.b(wz.c("gui.chatReport.send.no_reported_messages"));
      public static final gak.b c = new gak.b(wz.c("gui.chatReport.send.too_many_messages"));
      public static final gak.b d = new gak.b(wz.c("gui.abuseReport.send.comment_too_long"));
      public static final gak.b e = new gak.b(wz.c("gui.abuseReport.send.not_attested"));

      public fjx a() {
         return fjx.a(this.f);
      }

      public wz b() {
         return this.f;
      }
   }

   public static record c(UUID a, gan b, AbuseReport c) {
   }
}
