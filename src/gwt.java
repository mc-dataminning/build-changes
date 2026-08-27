import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gwt {
   private final fgj a;
   @Nullable
   private gwu b;
   private final List<gwt.a> c = Lists.newArrayList();
   private final gwm d;

   public gwt(fgj $$0, fgn $$1) {
      this.a = $$0;
      this.d = new gwm(this, $$1);
   }

   public void a(geg $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fzn $$0, @Nullable ews $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fzn $$0, ir $$1, dtc $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cuh $$0) {
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

   public void a(fky $$0, int $$1) {
      this.c.add(new gwt.a($$0, $$1));
      this.a.aA().a($$0);
   }

   public void a(fky $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gwt.a::a);
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

   public void a(gwv $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fgj e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == dbx.a;
   }

   public static xe a(String $$0) {
      return xe.d("key." + $$0).a(n.r);
   }

   public void a(cuh $$0, cuh $$1, cpo $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fky a;
      private final int b;
      private int c;

      a(fky $$0, int $$1) {
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
