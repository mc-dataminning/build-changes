import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gju {
   private final eva a;
   @Nullable
   private gjv b;
   private final List<gju.a> c = Lists.newArrayList();
   private final gjn d;

   public gju(eva $$0, eve $$1) {
      this.a = $$0;
      this.d = new gjn(this, $$1);
   }

   public void a(frz $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fnk $$0, @Nullable elk $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fnk $$0, hx $$1, dja $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cmr $$0) {
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

   public void a(ezi $$0, int $$1) {
      this.c.add(new gju.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(ezi $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gju.a::a);
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

   public void a(gjw $$0) {
      this.a.m.r = $$0;
      this.a.m.as();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public eva e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == ctf.a;
   }

   public static vd a(String $$0) {
      return vd.d("key." + $$0).a(n.r);
   }

   public void a(cmr $$0, cmr $$1, cic $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final ezi a;
      private final int b;
      private int c;

      a(ezi $$0, int $$1) {
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
