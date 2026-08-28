import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class fus implements fut {
   private static final alg a = alg.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final fus.a h;
   private wy i;
   private List<ayy> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fut.a o = fut.a.b;

   public fus(fus.a $$0, wy $$1, @Nullable wy $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(foz.Q().h.a($$1), $$2 == null ? 0 : foz.Q().h.a($$2))));
   }

   public static fus a(foz $$0, fus.a $$1, wy $$2, wy $$3) {
      frt $$4 = $$0.h;
      List<ayy> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new fus($$1, $$2, $$5, $$6 + 30);
   }

   private fus(fus.a $$0, wy $$1, List<ayy> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<ayy> a(@Nullable wy $$0) {
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
   public fut.a a() {
      return this.o;
   }

   @Override
   public void a(fuu $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fut.a.a : fut.a.b;
   }

   @Override
   public void a(frv $$0, frt $$1, long $$2) {
      $$0.a(gqk::H, a, 0, 0, this.c(), this.d());
      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
            $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
         }
      }
   }

   public void a(wy $$0, @Nullable wy $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public fus.a f() {
      return this.h;
   }

   public static void a(fuu $$0, fus.a $$1, wy $$2, @Nullable wy $$3) {
      $$0.a(new fus($$1, $$2, $$3));
   }

   public static void b(fuu $$0, fus.a $$1, wy $$2, @Nullable wy $$3) {
      fus $$4 = $$0.a(fus.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fuu $$0, fus.a $$1) {
      fus $$2 = $$0.a(fus.class, $$1);
      if ($$2 != null) {
         $$2.e();
      }
   }

   public static void a(foz $$0, String $$1) {
      a($$0.aA(), fus.a.d, wy.c("selectWorld.access_failure"), wy.b($$1));
   }

   public static void b(foz $$0, String $$1) {
      a($$0.aA(), fus.a.d, wy.c("selectWorld.delete_failure"), wy.b($$1));
   }

   public static void c(foz $$0, String $$1) {
      a($$0.aA(), fus.a.e, wy.c("pack.copyFailure"), wy.b($$1));
   }

   public static void a(foz $$0, int $$1) {
      a($$0.aA(), fus.a.f, wy.c("gui.fileDropFailure.title"), wy.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(foz $$0) {
      b($$0.aA(), fus.a.h, wy.c("chunk.toast.lowDiskSpace"), wy.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(foz $$0, dih $$1) {
      b($$0.aA(), fus.a.i, wy.a("chunk.toast.loadFailure", wy.a($$1)).a(n.m), wy.c("chunk.toast.checkLog"));
   }

   public static void b(foz $$0, dih $$1) {
      b($$0.aA(), fus.a.j, wy.a("chunk.toast.saveFailure", wy.a($$1)).a(n.m), wy.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final fus.a a = new fus.a();
      public static final fus.a b = new fus.a();
      public static final fus.a c = new fus.a();
      public static final fus.a d = new fus.a();
      public static final fus.a e = new fus.a();
      public static final fus.a f = new fus.a();
      public static final fus.a g = new fus.a();
      public static final fus.a h = new fus.a(10000L);
      public static final fus.a i = new fus.a();
      public static final fus.a j = new fus.a();
      public static final fus.a k = new fus.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
