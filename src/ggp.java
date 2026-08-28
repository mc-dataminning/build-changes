import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ggp {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected ggr e;
   protected boolean f;

   public ggp(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract ggp b();

   public abstract fty a(fty var1, ggt var2);

   public abstract static class a<R extends ggp> {
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
      public ggr i() {
         return this.a.e;
      }

      public void a(ggr $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public ggp.b c() {
         return !this.e().f ? ggp.b.e : null;
      }

      public abstract Either<ggp.c, ggp.b> a(ggt var1);
   }

   public static record b(xv f) {
      public static final ggp.b a = new ggp.b(xv.c("gui.abuseReport.send.no_reason"));
      public static final ggp.b b = new ggp.b(xv.c("gui.chatReport.send.no_reported_messages"));
      public static final ggp.b c = new ggp.b(xv.c("gui.chatReport.send.too_many_messages"));
      public static final ggp.b d = new ggp.b(xv.c("gui.abuseReport.send.comment_too_long"));
      public static final ggp.b e = new ggp.b(xv.c("gui.abuseReport.send.not_attested"));

      public fpr a() {
         return fpr.a(this.f);
      }

      public xv b() {
         return this.f;
      }
   }

   public static record c(UUID a, ggs b, AbuseReport c) {
   }
}
