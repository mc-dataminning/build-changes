import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ggi {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected ggk e;
   protected boolean f;

   public ggi(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract ggi b();

   public abstract ftr a(ftr var1, ggm var2);

   public abstract static class a<R extends ggi> {
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
      public ggk i() {
         return this.a.e;
      }

      public void a(ggk $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public ggi.b c() {
         return !this.e().f ? ggi.b.e : null;
      }

      public abstract Either<ggi.c, ggi.b> a(ggm var1);
   }

   public static record b(xv f) {
      public static final ggi.b a = new ggi.b(xv.c("gui.abuseReport.send.no_reason"));
      public static final ggi.b b = new ggi.b(xv.c("gui.chatReport.send.no_reported_messages"));
      public static final ggi.b c = new ggi.b(xv.c("gui.chatReport.send.too_many_messages"));
      public static final ggi.b d = new ggi.b(xv.c("gui.abuseReport.send.comment_too_long"));
      public static final ggi.b e = new ggi.b(xv.c("gui.abuseReport.send.not_attested"));

      public fpk a() {
         return fpk.a(this.f);
      }

      public xv b() {
         return this.f;
      }
   }

   public static record c(UUID a, ggl b, AbuseReport c) {
   }
}
