import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gki {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gkk e;
   protected boolean f;

   public gki(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gki b();

   public abstract fxi a(fxi var1, gkm var2);

   public abstract static class a<R extends gki> {
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
      public gkk i() {
         return this.a.e;
      }

      public void a(gkk $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gki.b c() {
         return !this.e().f ? gki.b.e : null;
      }

      public abstract Either<gki.c, gki.b> a(gkm var1);
   }

   public static record b(ww f) {
      public static final gki.b a = new gki.b(ww.c("gui.abuseReport.send.no_reason"));
      public static final gki.b b = new gki.b(ww.c("gui.chatReport.send.no_reported_messages"));
      public static final gki.b c = new gki.b(ww.c("gui.chatReport.send.too_many_messages"));
      public static final gki.b d = new gki.b(ww.c("gui.abuseReport.send.comment_too_long"));
      public static final gki.b e = new gki.b(ww.c("gui.abuseReport.send.not_attested"));

      public ftb a() {
         return ftb.a(this.f);
      }

      public ww b() {
         return this.f;
      }
   }

   public static record c(UUID a, gkl b, AbuseReport c) {
   }
}
