import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fwh implements fwi {
   private static final alr a = alr.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fwh.a h;
   private xg i;
   private List<azk> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fwi.a o = fwi.a.b;

   public fwh(fwh.a $$0, xg $$1, @Nullable xg $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fqq.Q().h.a($$1), $$2 == null ? 0 : fqq.Q().h.a($$2))));
   }

   public static fwh a(fqq $$0, fwh.a $$1, xg $$2, xg $$3) {
      fti $$4 = $$0.h;
      List<azk> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fwh($$1, $$2, $$5, $$6 + 30);
   }

   private fwh(fwh.a $$0, xg $$1, List<azk> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<azk> a(@Nullable xg $$0) {
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
   public fwi.a a() {
      return this.o;
   }

   @Override
   public void a(fwj $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fwi.a.a : fwi.a.b;
   }

   @Override
   public void a(ftk $$0, fti $$1, long $$2) {
      $$0.a(gry::H, a, 0, 0, this.c(), this.d());
      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
            $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
         }
      }
   }

   public void a(xg $$0, @Nullable xg $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fwh.a f() {
      return this.h;
   }

   public static void a(fwj $$0, fwh.a $$1, xg $$2, @Nullable xg $$3) {
      $$0.a(new fwh($$1, $$2, $$3));
   }

   public static void b(fwj $$0, fwh.a $$1, xg $$2, @Nullable xg $$3) {
      fwh $$4 = $$0.a(fwh.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fwj $$0, fwh.a $$1) {
      fwh $$2 = $$0.a(fwh.class, $$1);
      if ($$2 != null) {
         $$2.e();
      }
   }

   public static void a(fqq $$0, String $$1) {
      a($$0.aA(), fwh.a.d, xg.c("selectWorld.access_failure"), xg.b($$1));
   }

   public static void b(fqq $$0, String $$1) {
      a($$0.aA(), fwh.a.d, xg.c("selectWorld.delete_failure"), xg.b($$1));
   }

   public static void c(fqq $$0, String $$1) {
      a($$0.aA(), fwh.a.e, xg.c("pack.copyFailure"), xg.b($$1));
   }

   public static void a(fqq $$0, int $$1) {
      a($$0.aA(), fwh.a.f, xg.c("gui.fileDropFailure.title"), xg.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fqq $$0) {
      b($$0.aA(), fwh.a.h, xg.c("chunk.toast.lowDiskSpace"), xg.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fqq $$0, djo $$1) {
      b($$0.aA(), fwh.a.i, xg.a("chunk.toast.loadFailure", xg.a($$1)).a(o.m), xg.c("chunk.toast.checkLog"));
   }

   public static void b(fqq $$0, djo $$1) {
      b($$0.aA(), fwh.a.j, xg.a("chunk.toast.saveFailure", xg.a($$1)).a(o.m), xg.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fwh.a a = new fwh.a();
      public static final fwh.a b = new fwh.a();
      public static final fwh.a c = new fwh.a();
      public static final fwh.a d = new fwh.a();
      public static final fwh.a e = new fwh.a();
      public static final fwh.a f = new fwh.a();
      public static final fwh.a g = new fwh.a();
      public static final fwh.a h = new fwh.a(10000L);
      public static final fwh.a i = new fwh.a();
      public static final fwh.a j = new fwh.a();
      public static final fwh.a k = new fwh.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
