import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gvm {
   private final ffw a;
   @Nullable
   private gvn b;
   private final List<gvm.a> c = Lists.newArrayList();
   private final gvf d;

   public gvm(ffw $$0, fga $$1) {
      this.a = $$0;
      this.d = new gvf(this, $$1);
   }

   public void a(gdf $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fyl $$0, @Nullable ewf $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fyl $$0, ja $$1, dsl $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cud $$0) {
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

   public void a(fkf $$0, int $$1) {
      this.c.add(new gvm.a($$0, $$1));
      this.a.aw().a($$0);
   }

   public void a(fkf $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gvm.a::a);
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

   public void a(gvo $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public ffw e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == dcd.a;
   }

   public static wu a(String $$0) {
      return wu.d("key." + $$0).a(n.r);
   }

   public void a(cud $$0, cud $$1, cpr $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fkf a;
      private final int b;
      private int c;

      a(fkf $$0, int $$1) {
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
