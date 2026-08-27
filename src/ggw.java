import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ggw {
   private final esr a;
   @Nullable
   private ggx b;
   private final List<ggw.a> c = Lists.newArrayList();
   private final ggp d;

   public ggw(esr $$0, esv $$1) {
      this.a = $$0;
      this.d = new ggp(this, $$1);
   }

   public void a(fph $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fkw $$0, @Nullable ejg $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fkw $$0, ht $$1, dgw $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(clb $$0) {
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

   public void a(eww $$0, int $$1) {
      this.c.add(new ggw.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(eww $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(ggw.a::a);
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

   public void a(ggy $$0) {
      this.a.m.r = $$0;
      this.a.m.as();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public esr e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == crp.a;
   }

   public static ur a(String $$0) {
      return ur.d("key." + $$0).a(n.r);
   }

   public void a(clb $$0, clb $$1, cgm $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final eww a;
      private final int b;
      private int c;

      a(eww $$0, int $$1) {
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
