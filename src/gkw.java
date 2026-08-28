import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gkw {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gky e;
   protected boolean f;

   public gkw(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gkw b();

   public abstract fxu a(fxu var1, gla var2);

   public abstract static class a<R extends gkw> {
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
      public gky i() {
         return this.a.e;
      }

      public void a(gky $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gkw.b c() {
         return !this.e().f ? gkw.b.e : null;
      }

      public abstract Either<gkw.c, gkw.b> a(gla var1);
   }

   public static record b(wy f) {
      public static final gkw.b a = new gkw.b(wy.c("gui.abuseReport.send.no_reason"));
      public static final gkw.b b = new gkw.b(wy.c("gui.chatReport.send.no_reported_messages"));
      public static final gkw.b c = new gkw.b(wy.c("gui.chatReport.send.too_many_messages"));
      public static final gkw.b d = new gkw.b(wy.c("gui.abuseReport.send.comment_too_long"));
      public static final gkw.b e = new gkw.b(wy.c("gui.abuseReport.send.not_attested"));

      public ftn a() {
         return ftn.a(this.f);
      }

      public wy b() {
         return this.f;
      }
   }

   public static record c(UUID a, gkz b, AbuseReport c) {
   }
}
