import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gev {
   private final eqx a;
   @Nullable
   private gew b;
   private final List<gev.a> c = Lists.newArrayList();
   private final geo d;

   public gev(eqx $$0, erb $$1) {
      this.a = $$0;
      this.d = new geo(this, $$1);
   }

   public void a(fng $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fiz $$0, @Nullable ehn $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fiz $$0, gw $$1, dfl $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cjh $$0) {
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

   public void a(evb $$0, int $$1) {
      this.c.add(new gev.a($$0, $$1));
      this.a.ay().a($$0);
   }

   public void a(evb $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gev.a::a);
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

   public void a(gex $$0) {
      this.a.m.r = $$0;
      this.a.m.ar();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public eqx e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == cpu.a;
   }

   public static tn a(String $$0) {
      return tn.d("key." + $$0).a(n.r);
   }

   public void a(cjh $$0, cjh $$1, cev $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final evb a;
      private final int b;
      private int c;

      a(evb $$0, int $$1) {
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
