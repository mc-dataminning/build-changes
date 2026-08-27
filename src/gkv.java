import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gkv {
   private final evr a;
   @Nullable
   private gkw b;
   private final List<gkv.a> c = Lists.newArrayList();
   private final gko d;

   public gkv(evr $$0, evv $$1) {
      this.a = $$0;
      this.d = new gko(this, $$1);
   }

   public void a(fst $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable foe $$0, @Nullable ema $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(foe $$0, hx $$1, djp $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cng $$0) {
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

   public void a(fab $$0, int $$1) {
      this.c.add(new gkv.a($$0, $$1));
      this.a.ay().a($$0);
   }

   public void a(fab $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gkv.a::a);
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

   public void a(gkx $$0) {
      this.a.m.r = $$0;
      this.a.m.as();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public evr e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == ctu.a;
   }

   public static vg a(String $$0) {
      return vg.d("key." + $$0).a(n.r);
   }

   public void a(cng $$0, cng $$1, cir $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fab a;
      private final int b;
      private int c;

      a(fab $$0, int $$1) {
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
