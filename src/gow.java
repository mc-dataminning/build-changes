import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gow {
   private final ezi a;
   @Nullable
   private gox b;
   private final List<gow.a> c = Lists.newArrayList();
   private final gop d;

   public gow(ezi $$0, ezm $$1) {
      this.a = $$0;
      this.d = new gop(this, $$1);
   }

   public void a(fws $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fsa $$0, @Nullable epr $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fsa $$0, ib $$1, dnb $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cqm $$0) {
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

   public void a(fdt $$0, int $$1) {
      this.c.add(new gow.a($$0, $$1));
      this.a.aA().a($$0);
   }

   public void a(fdt $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gow.a::a);
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

   public void a(goy $$0) {
      this.a.m.r = $$0;
      this.a.m.at();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public ezi e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == cwy.a;
   }

   public static vu a(String $$0) {
      return vu.d("key." + $$0).a(n.r);
   }

   public void a(cqm $$0, cqm $$1, cly $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fdt a;
      private final int b;
      private int c;

      a(fdt $$0, int $$1) {
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
