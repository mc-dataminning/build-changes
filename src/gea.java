import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gea {
   private final eqm a;
   @Nullable
   private geb b;
   private final List<gea.a> c = Lists.newArrayList();
   private final gdt d;

   public gea(eqm $$0, eqq $$1) {
      this.a = $$0;
      this.d = new gdt(this, $$1);
   }

   public void a(fml $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fii $$0, @Nullable ehc $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fii $$0, gu $$1, dfa $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(ciy $$0) {
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

   public void a(eup $$0, int $$1) {
      this.c.add(new gea.a($$0, $$1));
      this.a.az().a($$0);
   }

   public void a(eup $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gea.a::a);
      if (this.b != null) {
         if (this.a.u != null) {
            this.b.a();
         } else {
            this.b();
         }
      } else if (this.a.u != null) {
         this.c();
      }
   }

   public void a(gec $$0) {
      this.a.m.r = $$0;
      this.a.m.aq();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public eqm e() {
      return this.a;
   }

   public boolean f() {
      return this.a.t == null ? false : this.a.t.l() == cpj.a;
   }

   public static tf a(String $$0) {
      return tf.d("key." + $$0).a(n.r);
   }

   public void a(ciy $$0, ciy $$1, cem $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final eup a;
      private final int b;
      private int c;

      a(eup $$0, int $$1) {
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
