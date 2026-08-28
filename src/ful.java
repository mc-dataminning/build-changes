import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class ful implements fum {
   private static final alg a = alg.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final ful.a h;
   private wy i;
   private List<ayy> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private fum.a o = fum.a.b;

   public ful(ful.a $$0, wy $$1, @Nullable wy $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fos.Q().h.a($$1), $$2 == null ? 0 : fos.Q().h.a($$2))));
   }

   public static ful a(fos $$0, ful.a $$1, wy $$2, wy $$3) {
      frm $$4 = $$0.h;
      List<ayy> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new ful($$1, $$2, $$5, $$6 + 30);
   }

   private ful(ful.a $$0, wy $$1, List<ayy> $$2, int $$3) {
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
   public fum.a a() {
      return this.o;
   }

   @Override
   public void a(fun $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = (double)this.h.l * $$0.d();
      long $$3 = $$1 - this.k;
      this.o = !this.n && (double)$$3 < $$2 ? fum.a.a : fum.a.b;
   }

   @Override
   public void a(fro $$0, frm $$1, long $$2) {
      $$0.a(gqc::H, a, 0, 0, this.c(), this.d());
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

   public ful.a f() {
      return this.h;
   }

   public static void a(fun $$0, ful.a $$1, wy $$2, @Nullable wy $$3) {
      $$0.a(new ful($$1, $$2, $$3));
   }

   public static void b(fun $$0, ful.a $$1, wy $$2, @Nullable wy $$3) {
      ful $$4 = $$0.a(ful.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(fun $$0, ful.a $$1) {
      ful $$2 = $$0.a(ful.class, $$1);
      if ($$2 != null) {
         $$2.e();
      }
   }

   public static void a(fos $$0, String $$1) {
      a($$0.aA(), ful.a.d, wy.c("selectWorld.access_failure"), wy.b($$1));
   }

   public static void b(fos $$0, String $$1) {
      a($$0.aA(), ful.a.d, wy.c("selectWorld.delete_failure"), wy.b($$1));
   }

   public static void c(fos $$0, String $$1) {
      a($$0.aA(), ful.a.e, wy.c("pack.copyFailure"), wy.b($$1));
   }

   public static void a(fos $$0, int $$1) {
      a($$0.aA(), ful.a.f, wy.c("gui.fileDropFailure.title"), wy.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fos $$0) {
      b($$0.aA(), ful.a.h, wy.c("chunk.toast.lowDiskSpace"), wy.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fos $$0, dic $$1) {
      b($$0.aA(), ful.a.i, wy.a("chunk.toast.loadFailure", wy.a($$1)).a(n.m), wy.c("chunk.toast.checkLog"));
   }

   public static void b(fos $$0, dic $$1) {
      b($$0.aA(), ful.a.j, wy.a("chunk.toast.saveFailure", wy.a($$1)).a(n.m), wy.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final ful.a a = new ful.a();
      public static final ful.a b = new ful.a();
      public static final ful.a c = new ful.a();
      public static final ful.a d = new ful.a();
      public static final ful.a e = new ful.a();
      public static final ful.a f = new ful.a();
      public static final ful.a g = new ful.a();
      public static final ful.a h = new ful.a(10000L);
      public static final ful.a i = new ful.a();
      public static final ful.a j = new ful.a();
      public static final ful.a k = new ful.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
