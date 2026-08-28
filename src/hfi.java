import java.util.Arrays;
import javax.annotation.Nullable;

public class hfi {
   cyw a;
   boolean b;
   private int c;
   private hfi.b[] d;

   public hfi() {
      this.a = cyw.a;
      this.d = new hfi.b[]{new hfi.b()};
   }

   public void a(int $$0) {
      int $$1 = this.d.length;
      int $$2 = this.c + $$0;
      if ($$2 > $$1) {
         this.d = Arrays.copyOf(this.d, $$2);

         for (int $$3 = $$1; $$3 < $$2; $$3++) {
            this.d[$$3] = new hfi.b();
         }
      }
   }

   public hfi.b a() {
      this.a(1);
      return this.d[this.c++];
   }

   public void b() {
      this.a = cyw.a;
      this.b = false;

      for (int $$0 = 0; $$0 < this.c; $$0++) {
         this.d[$$0].a();
      }

      this.c = 0;
   }

   private hfi.b g() {
      return this.d[0];
   }

   public boolean c() {
      return this.c == 0;
   }

   public boolean d() {
      return this.g().c();
   }

   public boolean e() {
      return this.g().d();
   }

   @Nullable
   public hip a(azv $$0) {
      if (this.c == 0) {
         return null;
      } else {
         hkp $$1 = this.d[$$0.a(this.c)].b;
         return $$1 == null ? null : $$1.d();
      }
   }

   public gri f() {
      return this.g().b();
   }

   public void a(fjc $$0, gps $$1, int $$2, int $$3) {
      for (int $$4 = 0; $$4 < this.c; $$4++) {
         this.d[$$4].a($$0, $$1, $$2, $$3);
      }
   }

   public static enum a {
      a,
      b,
      c;
   }

   public class b {
      @Nullable
      hkp b;
      @Nullable
      private gqc c;
      private hfi.a d = hfi.a.a;
      private int[] e = new int[0];
      @Nullable
      private hht<Object> f;
      @Nullable
      private Object g;

      public void a() {
         this.b = null;
         this.c = null;
         this.d = hfi.a.a;
         this.f = null;
         this.g = null;
         Arrays.fill(this.e, -1);
      }

      public void a(hkp $$0, gqc $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public <T> void a(hht<T> $$0, @Nullable T $$1, hkp $$2) {
         this.b = $$2;
         this.f = a($$0);
         this.g = $$1;
      }

      private static hht<Object> a(hht<?> $$0) {
         return (hht<Object>)$$0;
      }

      public void a(hfi.a $$0) {
         this.d = $$0;
      }

      public int[] a(int $$0) {
         if ($$0 > this.e.length) {
            this.e = new int[$$0];
            Arrays.fill(this.e, -1);
         }

         return this.e;
      }

      gri b() {
         return this.b != null ? this.b.e().a(hfi.this.a) : gri.a;
      }

      void a(fjc $$0, gps $$1, int $$2, int $$3) {
         $$0.a();
         this.b().a(hfi.this.b, $$0);
         $$0.a(-0.5F, -0.5F, -0.5F);
         if (this.f != null) {
            this.f.a(this.g, hfi.this.a, $$0, $$1, $$2, $$3, this.d != hfi.a.a);
         } else if (this.b != null) {
            gwx.a(hfi.this.a, $$0, $$1, $$2, $$3, this.e, this.b, this.c, this.d);
         }

         $$0.b();
      }

      boolean c() {
         return this.b != null && this.b.b();
      }

      boolean d() {
         return this.b != null && this.b.c();
      }
   }
}
