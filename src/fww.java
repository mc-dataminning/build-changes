import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fww implements fwx {
   private static final alk a = alk.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fww.a h;
   private xc i;
   private List<azc> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fwx.a o = fwx.a.b;

   public fww(fww.a $$0, xc $$1, @Nullable xc $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(frf.Q().h.a($$1), $$2 == null ? 0 : frf.Q().h.a($$2))));
   }

   public static fww a(frf $$0, fww.a $$1, xc $$2, xc $$3) {
      ftx $$4 = $$0.h;
      List<azc> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fww($$1, $$2, $$5, $$6 + 30);
   }

   private fww(fww.a $$0, xc $$1, List<azc> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<azc> a(@Nullable xc $$0) {
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
   public fwx.a a() {
      return this.o;
   }

   @Override
   public void a(fwy $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fwx.a.a : fwx.a.b;
   }

   @Override
   public void a(ftz $$0, ftx $$1, long $$2) {
      $$0.a(gsn::H, a, 0, 0, this.c(), this.d());
      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
            $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
         }
      }
   }

   public void a(xc $$0, @Nullable xc $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fww.a f() {
      return this.h;
   }

   public static void a(fwy $$0, fww.a $$1, xc $$2, @Nullable xc $$3) {
      $$0.a(new fww($$1, $$2, $$3));
   }

   public static void b(fwy $$0, fww.a $$1, xc $$2, @Nullable xc $$3) {
      fww $$4 = $$0.a(fww.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fwy $$0, fww.a $$1) {
      fww $$2 = $$0.a(fww.class, $$1);
      if ($$2 != null) {
         $$2.e();
      }
   }

   public static void a(frf $$0, String $$1) {
      a($$0.aA(), fww.a.d, xc.c("selectWorld.access_failure"), xc.b($$1));
   }

   public static void b(frf $$0, String $$1) {
      a($$0.aA(), fww.a.d, xc.c("selectWorld.delete_failure"), xc.b($$1));
   }

   public static void c(frf $$0, String $$1) {
      a($$0.aA(), fww.a.e, xc.c("pack.copyFailure"), xc.b($$1));
   }

   public static void a(frf $$0, int $$1) {
      a($$0.aA(), fww.a.f, xc.c("gui.fileDropFailure.title"), xc.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(frf $$0) {
      b($$0.aA(), fww.a.h, xc.c("chunk.toast.lowDiskSpace"), xc.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(frf $$0, dje $$1) {
      b($$0.aA(), fww.a.i, xc.a("chunk.toast.loadFailure", xc.a($$1)).a(o.m), xc.c("chunk.toast.checkLog"));
   }

   public static void b(frf $$0, dje $$1) {
      b($$0.aA(), fww.a.j, xc.a("chunk.toast.saveFailure", xc.a($$1)).a(o.m), xc.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fww.a a = new fww.a();
      public static final fww.a b = new fww.a();
      public static final fww.a c = new fww.a();
      public static final fww.a d = new fww.a();
      public static final fww.a e = new fww.a();
      public static final fww.a f = new fww.a();
      public static final fww.a g = new fww.a();
      public static final fww.a h = new fww.a(10000L);
      public static final fww.a i = new fww.a();
      public static final fww.a j = new fww.a();
      public static final fww.a k = new fww.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
