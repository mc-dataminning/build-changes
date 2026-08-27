import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class grm {
   private final fby a;
   @Nullable
   private grn b;
   private final List<grm.a> c = Lists.newArrayList();
   private final grf d;

   public grm(fby $$0, fcc $$1) {
      this.a = $$0;
      this.d = new grf(this, $$1);
   }

   public void a(fzi $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fuq $$0, @Nullable esh $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fuq $$0, id $$1, dpi $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(crs $$0) {
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

   public void a(fgj $$0, int $$1) {
      this.c.add(new grm.a($$0, $$1));
      this.a.aA().a($$0);
   }

   public void a(fgj $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(grm.a::a);
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

   public void a(gro $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fby e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == czd.a;
   }

   public static wi a(String $$0) {
      return wi.d("key." + $$0).a(n.r);
   }

   public void a(crs $$0, crs $$1, cne $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fgj a;
      private final int b;
      private int c;

      a(fgj $$0, int $$1) {
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
