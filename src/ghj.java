import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ghj {
   private final etd a;
   @Nullable
   private ghk b;
   private final List<ghj.a> c = Lists.newArrayList();
   private final ghc d;

   public ghj(etd $$0, eth $$1) {
      this.a = $$0;
      this.d = new ghc(this, $$1);
   }

   public void a(fpu $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable flj $$0, @Nullable ejs $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(flj $$0, ht $$1, dhi $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(clj $$0) {
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

   public void a(exj $$0, int $$1) {
      this.c.add(new ghj.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(exj $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(ghj.a::a);
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

   public void a(ghl $$0) {
      this.a.m.r = $$0;
      this.a.m.as();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public etd e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == crx.a;
   }

   public static ur a(String $$0) {
      return ur.d("key." + $$0).a(n.r);
   }

   public void a(clj $$0, clj $$1, cgu $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final exj a;
      private final int b;
      private int c;

      a(exj $$0, int $$1) {
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
