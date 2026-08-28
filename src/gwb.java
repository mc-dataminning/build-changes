import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gwb {
   private final fgi a;
   @Nullable
   private gwc b;
   private final List<gwb.a> c = Lists.newArrayList();
   private final gvu d;

   public gwb(fgi $$0, fgm $$1) {
      this.a = $$0;
      this.d = new gvu(this, $$1);
   }

   public void a(gdt $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fyz $$0, @Nullable ewu $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fyz $$0, jd $$1, dta $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cuo $$0) {
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

   public void a(fkr $$0, int $$1) {
      this.c.add(new gwb.a($$0, $$1));
      this.a.aw().a($$0);
   }

   public void a(fkr $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gwb.a::a);
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

   public void a(gwd $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fgi e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == dcr.a;
   }

   public static wy a(String $$0) {
      return wy.d("key." + $$0).a(n.r);
   }

   public void a(cuo $$0, cuo $$1, cqb $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fkr a;
      private final int b;
      private int c;

      a(fkr $$0, int $$1) {
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
