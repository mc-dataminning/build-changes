import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gje {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gjg e;
   protected boolean f;

   public gje(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gje b();

   public abstract fwf a(fwf var1, gji var2);

   public abstract static class a<R extends gje> {
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
      public gjg i() {
         return this.a.e;
      }

      public void a(gjg $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gje.b c() {
         return !this.e().f ? gje.b.e : null;
      }

      public abstract Either<gje.c, gje.b> a(gji var1);
   }

   public static record b(wv f) {
      public static final gje.b a = new gje.b(wv.c("gui.abuseReport.send.no_reason"));
      public static final gje.b b = new gje.b(wv.c("gui.chatReport.send.no_reported_messages"));
      public static final gje.b c = new gje.b(wv.c("gui.chatReport.send.too_many_messages"));
      public static final gje.b d = new gje.b(wv.c("gui.abuseReport.send.comment_too_long"));
      public static final gje.b e = new gje.b(wv.c("gui.abuseReport.send.not_attested"));

      public fry a() {
         return fry.a(this.f);
      }

      public wv b() {
         return this.f;
      }
   }

   public static record c(UUID a, gjh b, AbuseReport c) {
   }
}
