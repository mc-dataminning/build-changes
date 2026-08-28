import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class guy {
   private final fff a;
   @Nullable
   private guz b;
   private final List<guy.a> c = Lists.newArrayList();
   private final gur d;

   public guy(fff $$0, ffj $$1) {
      this.a = $$0;
      this.d = new gur(this, $$1);
   }

   public void a(gco $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fxv $$0, @Nullable evp $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fxv $$0, iz $$1, dsc $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cup $$0) {
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

   public void a(fjp $$0, int $$1) {
      this.c.add(new guy.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(fjp $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(guy.a::a);
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

   public void a(gva $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fff e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == dbv.a;
   }

   public static xp a(String $$0) {
      return xp.d("key." + $$0).a(n.r);
   }

   public void a(cup $$0, cup $$1, cqc $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fjp a;
      private final int b;
      private int c;

      a(fjp $$0, int $$1) {
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
