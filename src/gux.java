import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gux {
   private final ffe a;
   @Nullable
   private guy b;
   private final List<gux.a> c = Lists.newArrayList();
   private final guq d;

   public gux(ffe $$0, ffi $$1) {
      this.a = $$0;
      this.d = new guq(this, $$1);
   }

   public void a(gcn $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fxu $$0, @Nullable evo $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fxu $$0, iz $$1, dsb $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cuo $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void b() {
      if (this.b != null) {
         this.b.b();
         this.b = null;
      }
   }

   public void c() {
      if (this.b != null) {
         this.b();
      }

      this.b = this.a.m.r.a(this);
   }

   public void a(fjo $$0, int $$1) {
      this.c.add(new gux.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(fjo $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gux.a::a);
      if (this.b != null) {
         if (this.a.r != null) {
            this.b.a();
         } else {
            this.b();
         }
      } else if (this.a.r != null) {
         this.c();
      }
   }

   public void a(guz $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public ffe e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == dbu.a;
   }

   public static xo a(String $$0) {
      return xo.d("key." + $$0).a(n.r);
   }

   public void a(cuo $$0, cuo $$1, cqb $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fjo a;
      private final int b;
      private int c;

      a(fjo $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private boolean a() {
         this.a.a(Math.min((float)(++this.c) / (float)this.b, 1.0F));
         if (this.c > this.b) {
            this.a.c();
            return true;
         } else {
            return false;
         }
      }
   }
}
