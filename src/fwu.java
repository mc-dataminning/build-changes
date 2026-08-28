import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fwu implements fwv {
   private static final ali a = ali.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fwu.a h;
   private xa i;
   private List<aza> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fwv.a o = fwv.a.b;

   public fwu(fwu.a $$0, xa $$1, @Nullable xa $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(frd.Q().h.a($$1), $$2 == null ? 0 : frd.Q().h.a($$2))));
   }

   public static fwu a(frd $$0, fwu.a $$1, xa $$2, xa $$3) {
      ftv $$4 = $$0.h;
      List<aza> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fwu($$1, $$2, $$5, $$6 + 30);
   }

   private fwu(fwu.a $$0, xa $$1, List<aza> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<aza> a(@Nullable xa $$0) {
      return $$0 == null ? ImmutableList.of() : ImmutableList.of($$0.g());
   }

   @Override
   public int c() {
      return this.m;
   }

   @Override
   public int d() {
      return 20 + Math.max(this.j.size(), 1) * 12;
   }

   public void e() {
      this.n = true;
   }

   @Override
   public fwv.a a() {
      return this.o;
   }

   @Override
   public void a(fww $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fwv.a.a : fwv.a.b;
   }

   @Override
   public void a(ftx $$0, ftv $$1, long $$2) {
      $$0.a(gsl::H, a, 0, 0, this.c(), this.d());
      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
            $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
         }
      }
   }

   public void a(xa $$0, @Nullable xa $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fwu.a f() {
      return this.h;
   }

   public static void a(fww $$0, fwu.a $$1, xa $$2, @Nullable xa $$3) {
      $$0.a(new fwu($$1, $$2, $$3));
   }

   public static void b(fww $$0, fwu.a $$1, xa $$2, @Nullable xa $$3) {
      fwu $$4 = $$0.a(fwu.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fww $$0, fwu.a $$1) {
      fwu $$2 = $$0.a(fwu.class, $$1);
      if ($$2 != null) {
         $$2.e();
      }
   }

   public static void a(frd $$0, String $$1) {
      a($$0.aA(), fwu.a.d, xa.c("selectWorld.access_failure"), xa.b($$1));
   }

   public static void b(frd $$0, String $$1) {
      a($$0.aA(), fwu.a.d, xa.c("selectWorld.delete_failure"), xa.b($$1));
   }

   public static void c(frd $$0, String $$1) {
      a($$0.aA(), fwu.a.e, xa.c("pack.copyFailure"), xa.b($$1));
   }

   public static void a(frd $$0, int $$1) {
      a($$0.aA(), fwu.a.f, xa.c("gui.fileDropFailure.title"), xa.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(frd $$0) {
      b($$0.aA(), fwu.a.h, xa.c("chunk.toast.lowDiskSpace"), xa.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(frd $$0, djc $$1) {
      b($$0.aA(), fwu.a.i, xa.a("chunk.toast.loadFailure", xa.a($$1)).a(o.m), xa.c("chunk.toast.checkLog"));
   }

   public static void b(frd $$0, djc $$1) {
      b($$0.aA(), fwu.a.j, xa.a("chunk.toast.saveFailure", xa.a($$1)).a(o.m), xa.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fwu.a a = new fwu.a();
      public static final fwu.a b = new fwu.a();
      public static final fwu.a c = new fwu.a();
      public static final fwu.a d = new fwu.a();
      public static final fwu.a e = new fwu.a();
      public static final fwu.a f = new fwu.a();
      public static final fwu.a g = new fwu.a();
      public static final fwu.a h = new fwu.a(10000L);
      public static final fwu.a i = new fwu.a();
      public static final fwu.a j = new fwu.a();
      public static final fwu.a k = new fwu.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
