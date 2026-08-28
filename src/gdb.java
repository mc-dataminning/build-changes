import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class gdb {
   protected final UUID a;
   protected final Instant b;
   protected final UUID c;
   protected String d = "";
   @Nullable
   protected gdd e;
   protected boolean f;

   public gdb(UUID $$0, Instant $$1, UUID $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(UUID $$0) {
      return $$0.equals(this.c);
   }

   public abstract gdb b();

   public abstract fqs a(fqs var1, gdf var2);

   public abstract static class a<R extends gdb> {
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
      public gdd i() {
         return this.a.e;
      }

      public void a(gdd $$0) {
         this.a.e = $$0;
      }

      public void a(boolean $$0) {
         this.a.f = $$0;
      }

      public abstract boolean b();

      @Nullable
      public gdb.b c() {
         return !this.e().f ? gdb.b.e : null;
      }

      public abstract Either<gdb.c, gdb.b> a(gdf var1);
   }

   public static record b(xh f) {
      public static final gdb.b a = new gdb.b(xh.c("gui.abuseReport.send.no_reason"));
      public static final gdb.b b = new gdb.b(xh.c("gui.chatReport.send.no_reported_messages"));
      public static final gdb.b c = new gdb.b(xh.c("gui.chatReport.send.too_many_messages"));
      public static final gdb.b d = new gdb.b(xh.c("gui.abuseReport.send.comment_too_long"));
      public static final gdb.b e = new gdb.b(xh.c("gui.abuseReport.send.not_attested"));

      public fmk a() {
         return fmk.a(this.f);
      }

      public xh b() {
         return this.f;
      }
   }

   public static record c(UUID a, gde b, AbuseReport c) {
   }
}
