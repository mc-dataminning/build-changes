import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ggo {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected ggq e;
   protected boolean f;

   public ggo(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract ggo b();

   public abstract ftx a(ftx var1, ggs var2);

   public abstract static class a<R extends ggo> {
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
      public ggq i() {
         return this.a.e;
      }

      public void a(ggq $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public ggo.b c() {
         return !this.e().f ? ggo.b.e : null;
      }

      public abstract Either<ggo.c, ggo.b> a(ggs var1);
   }

   public static record b(xv f) {
      public static final ggo.b a = new ggo.b(xv.c("gui.abuseReport.send.no_reason"));
      public static final ggo.b b = new ggo.b(xv.c("gui.chatReport.send.no_reported_messages"));
      public static final ggo.b c = new ggo.b(xv.c("gui.chatReport.send.too_many_messages"));
      public static final ggo.b d = new ggo.b(xv.c("gui.abuseReport.send.comment_too_long"));
      public static final ggo.b e = new ggo.b(xv.c("gui.abuseReport.send.not_attested"));

      public fpq a() {
         return fpq.a(this.f);
      }

      public xv b() {
         return this.f;
      }
   }

   public static record c(UUID a, ggr b, AbuseReport c) {
   }
}
