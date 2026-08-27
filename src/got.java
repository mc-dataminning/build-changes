import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class got {
   private final ezg a;
   @Nullable
   private gou b;
   private final List<got.a> c = Lists.newArrayList();
   private final gom d;

   public got(ezg $$0, ezk $$1) {
      this.a = $$0;
      this.d = new gom(this, $$1);
   }

   public void a(fwq $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fry $$0, @Nullable epp $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fry $$0, ib $$1, dmz $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cqk $$0) {
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

   public void a(fdr $$0, int $$1) {
      this.c.add(new got.a($$0, $$1));
      this.a.aA().a($$0);
   }

   public void a(fdr $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(got.a::a);
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

   public void a(gov $$0) {
      this.a.m.r = $$0;
      this.a.m.at();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public ezg e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == cww.a;
   }

   public static vu a(String $$0) {
      return vu.d("key." + $$0).a(n.r);
   }

   public void a(cqk $$0, cqk $$1, clw $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fdr a;
      private final int b;
      private int c;

      a(fdr $$0, int $$1) {
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
