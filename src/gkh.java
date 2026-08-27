import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gkh {
   private final evi a;
   @Nullable
   private gki b;
   private final List<gkh.a> c = Lists.newArrayList();
   private final gka d;

   public gkh(evi $$0, evm $$1) {
      this.a = $$0;
      this.d = new gka(this, $$1);
   }

   public void a(fsh $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fns $$0, @Nullable elr $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fns $$0, hx $$1, djh $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cmy $$0) {
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

   public void a(ezq $$0, int $$1) {
      this.c.add(new gkh.a($$0, $$1));
      this.a.ay().a($$0);
   }

   public void a(ezq $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gkh.a::a);
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

   public void a(gkj $$0) {
      this.a.m.r = $$0;
      this.a.m.as();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public evi e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == ctm.a;
   }

   public static vf a(String $$0) {
      return vf.d("key." + $$0).a(n.r);
   }

   public void a(cmy $$0, cmy $$1, cij $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final ezq a;
      private final int b;
      private int c;

      a(ezq $$0, int $$1) {
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
