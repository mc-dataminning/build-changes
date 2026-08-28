import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class hgi {
   czl a;
   private int b;
   private hgi.b[] c;

   public hgi() {
      this.a = czl.a;
      this.c = new hgi.b[]{new hgi.b()};
   }

   public void a(int $$0) {
      int $$1 = this.c.length;
      int $$2 = this.b + $$0;
      if ($$2 > $$1) {
         this.c = Arrays.copyOf(this.c, $$2);

         for (int $$3 = $$1; $$3 < $$2; $$3++) {
            this.c[$$3] = new hgi.b();
         }
      }
   }

   public hgi.b a() {
      this.a(1);
      return this.c[this.b++];
   }

   public void b() {
      this.a = czl.a;

      for (int $$0 = 0; $$0 < this.b; $$0++) {
         this.c[$$0].a();
      }

      this.b = 0;
   }

   private hgi.b e() {
      return this.c[0];
   }

   public boolean c() {
      return this.b == 0;
   }

   public boolean d() {
      return this.e().e;
   }

   @Nullable
   public hjq a(azv $$0) {
      return this.b == 0 ? null : this.c[$$0.a(this.b)].f;
   }

   public void a(Consumer<Vector3fc> $$0) {
      Vector3f $$1 = new Vector3f();
      fkd.a $$2 = new fkd.a();

      for (int $$3 = 0; $$3 < this.b; $$3++) {
         hgi.b $$4 = this.c[$$3];
         $$4.g.a(this.a.d(), $$2);
         Matrix4f $$5 = $$2.a();
         Vector3f[] $$6 = $$4.m.get();

         for (Vector3f $$7 : $$6) {
            $$0.accept($$1.set($$7).mulPosition($$5));
         }

         $$2.c();
      }
   }

   public void a(fkd $$0, gqr $$1, int $$2, int $$3) {
      for (int $$4 = 0; $$4 < this.b; $$4++) {
         this.c[$$4].a($$0, $$1, $$2, $$3);
      }
   }

   public static enum a {
      a,
      b,
      c;
   }

   public class b {
      private static final Vector3f[] c = new Vector3f[0];
      public static final Supplier<Vector3f[]> a = () -> c;
      private final List<grx> d = new ArrayList<>();
      boolean e;
      @Nullable
      hjq f;
      gsg g = gsg.a;
      @Nullable
      private grc h;
      private hgi.a i = hgi.a.a;
      private int[] j = new int[0];
      @Nullable
      private hiu<Object> k;
      @Nullable
      private Object l;
      Supplier<Vector3f[]> m = a;

      public void a() {
         this.d.clear();
         this.h = null;
         this.i = hgi.a.a;
         this.k = null;
         this.l = null;
         Arrays.fill(this.j, -1);
         this.e = false;
         this.f = null;
         this.g = gsg.a;
         this.m = a;
      }

      public List<grx> b() {
         return this.d;
      }

      public void a(grc $$0) {
         this.h = $$0;
      }

      public void a(boolean $$0) {
         this.e = $$0;
      }

      public void a(Supplier<Vector3f[]> $$0) {
         this.m = $$0;
      }

      public void a(hjq $$0) {
         this.f = $$0;
      }

      public void a(gsg $$0) {
         this.g = $$0;
      }

      public <T> void a(hiu<T> $$0, @Nullable T $$1) {
         this.k = a($$0);
         this.l = $$1;
      }

      private static hiu<Object> a(hiu<?> $$0) {
         return (hiu<Object>)$$0;
      }

      public void a(hgi.a $$0) {
         this.i = $$0;
      }

      public int[] a(int $$0) {
         if ($$0 > this.j.length) {
            this.j = new int[$$0];
            Arrays.fill(this.j, -1);
         }

         return this.j;
      }

      void a(fkd $$0, gqr $$1, int $$2, int $$3) {
         $$0.a();
         this.g.a(hgi.this.a.d(), $$0.c());
         if (this.k != null) {
            this.k.a(this.l, hgi.this.a, $$0, $$1, $$2, $$3, this.i != hgi.a.a);
         } else if (this.h != null) {
            gxw.a(hgi.this.a, $$0, $$1, $$2, $$3, this.j, this.d, this.h, this.i);
         }

         $$0.b();
      }
   }
}
