import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gkf {
   private final evg a;
   @Nullable
   private gkg b;
   private final List<gkf.a> c = Lists.newArrayList();
   private final gjy d;

   public gkf(evg $$0, evk $$1) {
      this.a = $$0;
      this.d = new gjy(this, $$1);
   }

   public void a(fsf $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fnq $$0, @Nullable elq $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fnq $$0, hx $$1, djg $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cmx $$0) {
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

   public void a(ezo $$0, int $$1) {
      this.c.add(new gkf.a($$0, $$1));
      this.a.ay().a($$0);
   }

   public void a(ezo $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gkf.a::a);
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

   public void a(gkh $$0) {
      this.a.m.r = $$0;
      this.a.m.as();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public evg e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == ctl.a;
   }

   public static vf a(String $$0) {
      return vf.d("key." + $$0).a(n.r);
   }

   public void a(cmx $$0, cmx $$1, cii $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final ezo a;
      private final int b;
      private int c;

      a(ezo $$0, int $$1) {
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
