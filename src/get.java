import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class get {
   private final eqv a;
   @Nullable
   private geu b;
   private final List<get.a> c = Lists.newArrayList();
   private final gem d;

   public get(eqv $$0, eqz $$1) {
      this.a = $$0;
      this.d = new gem(this, $$1);
   }

   public void a(fne $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fix $$0, @Nullable ehl $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fix $$0, gw $$1, dfj $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cjf $$0) {
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

   public void a(euz $$0, int $$1) {
      this.c.add(new get.a($$0, $$1));
      this.a.ay().a($$0);
   }

   public void a(euz $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(get.a::a);
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

   public void a(gev $$0) {
      this.a.m.r = $$0;
      this.a.m.ar();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public eqv e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == cps.a;
   }

   public static tl a(String $$0) {
      return tl.d("key." + $$0).a(n.r);
   }

   public void a(cjf $$0, cjf $$1, cet $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final euz a;
      private final int b;
      private int c;

      a(euz $$0, int $$1) {
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
