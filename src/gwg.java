import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gwg {
   private final fgm a;
   @Nullable
   private gwh b;
   private final List<gwg.a> c = Lists.newArrayList();
   private final gvz d;

   public gwg(fgm $$0, fgq $$1) {
      this.a = $$0;
      this.d = new gvz(this, $$1);
   }

   public void a(gdx $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fzd $$0, @Nullable ewy $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fzd $$0, jd $$1, dtc $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cuq $$0) {
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

   public void a(fkv $$0, int $$1) {
      this.c.add(new gwg.a($$0, $$1));
      this.a.aw().a($$0);
   }

   public void a(fkv $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gwg.a::a);
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

   public void a(gwi $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fgm e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == dct.a;
   }

   public static wz a(String $$0) {
      return wz.d("key." + $$0).a(n.r);
   }

   public void a(cuq $$0, cuq $$1, cqd $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fkv a;
      private final int b;
      private int c;

      a(fkv $$0, int $$1) {
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
