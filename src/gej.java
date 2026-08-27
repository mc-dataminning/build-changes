import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gej {
   private final eql a;
   @Nullable
   private gek b;
   private final List<gej.a> c = Lists.newArrayList();
   private final gec d;

   public gej(eql $$0, eqp $$1) {
      this.a = $$0;
      this.d = new gec(this, $$1);
   }

   public void a(fmu $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fin $$0, @Nullable ehb $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fin $$0, gu $$1, dez $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cix $$0) {
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
      this.c.add(new gej.a($$0, $$1));
      this.a.ay().a($$0);
   }

   public void a(eup $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gej.a::a);
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

   public void a(gel $$0) {
      this.a.m.r = $$0;
      this.a.m.ar();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public eql e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == cpi.a;
   }

   public static tf a(String $$0) {
      return tf.d("key." + $$0).a(n.r);
   }

   public void a(cix $$0, cix $$1, cel $$2) {
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
