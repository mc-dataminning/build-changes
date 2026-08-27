import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gmo {
   private final exh a;
   @Nullable
   private gmp b;
   private final List<gmo.a> c = Lists.newArrayList();
   private final gmh d;

   public gmo(exh $$0, exl $$1) {
      this.a = $$0;
      this.d = new gmh(this, $$1);
   }

   public void a(fum $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fpx $$0, @Nullable enq $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fpx $$0, hz $$1, dlf $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(coz $$0) {
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

   public void a(fbs $$0, int $$1) {
      this.c.add(new gmo.a($$0, $$1));
      this.a.ay().a($$0);
   }

   public void a(fbs $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gmo.a::a);
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

   public void a(gmq $$0) {
      this.a.m.r = $$0;
      this.a.m.as();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public exh e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == cvk.a;
   }

   public static vq a(String $$0) {
      return vq.d("key." + $$0).a(n.r);
   }

   public void a(coz $$0, coz $$1, ckj $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fbs a;
      private final int b;
      private int c;

      a(fbs $$0, int $$1) {
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
