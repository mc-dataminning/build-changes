import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class geo {
   private final eqq a;
   @Nullable
   private gep b;
   private final List<geo.a> c = Lists.newArrayList();
   private final geh d;

   public geo(eqq $$0, equ $$1) {
      this.a = $$0;
      this.d = new geh(this, $$1);
   }

   public void a(fmz $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fis $$0, @Nullable ehg $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fis $$0, gw $$1, dfe $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cja $$0) {
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

   public void a(euu $$0, int $$1) {
      this.c.add(new geo.a($$0, $$1));
      this.a.ay().a($$0);
   }

   public void a(euu $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(geo.a::a);
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

   public void a(geq $$0) {
      this.a.m.r = $$0;
      this.a.m.ar();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public eqq e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == cpn.a;
   }

   public static ti a(String $$0) {
      return ti.d("key." + $$0).a(n.r);
   }

   public void a(cja $$0, cja $$1, ceo $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final euu a;
      private final int b;
      private int c;

      a(euu $$0, int $$1) {
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
