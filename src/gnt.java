import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gnt {
   private final eyk a;
   @Nullable
   private gnu b;
   private final List<gnt.a> c = Lists.newArrayList();
   private final gnm d;

   public gnt(eyk $$0, eyo $$1) {
      this.a = $$0;
      this.d = new gnm(this, $$1);
   }

   public void a(fvq $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fra $$0, @Nullable eot $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fra $$0, ib $$1, dme $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cpq $$0) {
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

   public void a(fcv $$0, int $$1) {
      this.c.add(new gnt.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(fcv $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gnt.a::a);
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

   public void a(gnv $$0) {
      this.a.m.r = $$0;
      this.a.m.as();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public eyk e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == cwb.a;
   }

   public static vs a(String $$0) {
      return vs.d("key." + $$0).a(n.r);
   }

   public void a(cpq $$0, cpq $$1, clc $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fcv a;
      private final int b;
      private int c;

      a(fcv $$0, int $$1) {
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
