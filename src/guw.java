import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class guw {
   private final ffd a;
   @Nullable
   private gux b;
   private final List<guw.a> c = Lists.newArrayList();
   private final gup d;

   public guw(ffd $$0, ffh $$1) {
      this.a = $$0;
      this.d = new gup(this, $$1);
   }

   public void a(gcm $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fxt $$0, @Nullable evn $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fxt $$0, iz $$1, dsa $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cun $$0) {
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

   public void a(fjn $$0, int $$1) {
      this.c.add(new guw.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(fjn $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(guw.a::a);
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

   public void a(guy $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public ffd e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == dbt.a;
   }

   public static xo a(String $$0) {
      return xo.d("key." + $$0).a(n.r);
   }

   public void a(cun $$0, cun $$1, cqa $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fjn a;
      private final int b;
      private int c;

      a(fjn $$0, int $$1) {
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
