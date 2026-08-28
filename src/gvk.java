import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gvk {
   private final fft a;
   @Nullable
   private gvl b;
   private final List<gvk.a> c = Lists.newArrayList();
   private final gvd d;

   public gvk(fft $$0, ffx $$1) {
      this.a = $$0;
      this.d = new gvd(this, $$1);
   }

   public void a(gdd $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fyj $$0, @Nullable ewd $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fyj $$0, ja $$1, dsk $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cuc $$0) {
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

   public void a(fkd $$0, int $$1) {
      this.c.add(new gvk.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(fkd $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gvk.a::a);
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

   public void a(gvm $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fft e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == dcc.a;
   }

   public static wu a(String $$0) {
      return wu.d("key." + $$0).a(n.r);
   }

   public void a(cuc $$0, cuc $$1, cpq $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fkd a;
      private final int b;
      private int c;

      a(fkd $$0, int $$1) {
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
