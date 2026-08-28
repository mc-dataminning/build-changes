import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gve {
   private final ffn a;
   @Nullable
   private gvf b;
   private final List<gve.a> c = Lists.newArrayList();
   private final gux d;

   public gve(ffn $$0, ffr $$1) {
      this.a = $$0;
      this.d = new gux(this, $$1);
   }

   public void a(gcx $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fyd $$0, @Nullable evx $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fyd $$0, ja $$1, dsh $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cua $$0) {
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

   public void a(fjx $$0, int $$1) {
      this.c.add(new gve.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(fjx $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gve.a::a);
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

   public void a(gvg $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public ffn e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == dca.a;
   }

   public static wu a(String $$0) {
      return wu.d("key." + $$0).a(n.r);
   }

   public void a(cua $$0, cua $$1, cpn $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fjx a;
      private final int b;
      private int c;

      a(fjx $$0, int $$1) {
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
