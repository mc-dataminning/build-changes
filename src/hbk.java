import java.util.Arrays;
import javax.annotation.Nullable;

public class hbk {
   cwl a;
   boolean b;
   private int c;
   private hbk.b[] d;

   public hbk() {
      this.a = cwl.a;
      this.d = new hbk.b[]{new hbk.b()};
   }

   public void a(int $$0) {
      int $$1 = this.d.length;
      int $$2 = this.c + $$0;
      if ($$2 > $$1) {
         this.d = Arrays.copyOf(this.d, $$2);

         for (int $$3 = $$1; $$3 < $$2; $$3++) {
            this.d[$$3] = new hbk.b();
         }
      }
   }

   public hbk.b a() {
      this.a(1);
      return this.d[this.c++];
   }

   public void b() {
      this.a = cwl.a;
      this.b = false;

      for (int $$0 = 0; $$0 < this.c; $$0++) {
         this.d[$$0].a();
      }

      this.c = 0;
   }

   private hbk.b g() {
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
   public hem a(azg $$0) {
      if (this.c == 0) {
         return null;
      } else {
         hgm $$1 = this.d[$$0.a(this.c)].b;
         return $$1 == null ? null : $$1.d();
      }
   }

   public gnl f() {
      return this.g().b();
   }

   public void a(ffs $$0, glv $$1, int $$2, int $$3) {
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
      hgm b;
      @Nullable
      private gmf c;
      private hbk.a d = hbk.a.a;
      private int[] e = new int[0];
      @Nullable
      private hdq<Object> f;
      @Nullable
      private Object g;

      public void a() {
         this.b = null;
         this.c = null;
         this.d = hbk.a.a;
         this.f = null;
         this.g = null;
         Arrays.fill(this.e, -1);
      }

      public void a(hgm $$0, gmf $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public <T> void a(hdq<T> $$0, @Nullable T $$1, hgm $$2) {
         this.b = $$2;
         this.f = a($$0);
         this.g = $$1;
      }

      private static hdq<Object> a(hdq<?> $$0) {
         return (hdq<Object>)$$0;
      }

      public void a(hbk.a $$0) {
         this.d = $$0;
      }

      public int[] a(int $$0) {
         if ($$0 > this.e.length) {
            this.e = new int[$$0];
            Arrays.fill(this.e, -1);
         }

         return this.e;
      }

      gnl b() {
         return this.b != null ? this.b.e().a(hbk.this.a) : gnl.a;
      }

      void a(ffs $$0, glv $$1, int $$2, int $$3) {
         $$0.a();
         this.b().a(hbk.this.b, $$0);
         $$0.a(-0.5F, -0.5F, -0.5F);
         if (this.f != null) {
            this.f.a(this.g, hbk.this.a, $$0, $$1, $$2, $$3, this.d != hbk.a.a);
         } else if (this.b != null) {
            gsz.a(hbk.this.a, $$0, $$1, $$2, $$3, this.e, this.b, this.c, this.d);
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
