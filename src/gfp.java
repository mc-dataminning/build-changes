import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gfp {
   private final ero a;
   @Nullable
   private gfq b;
   private final List<gfp.a> c = Lists.newArrayList();
   private final gfi d;

   public gfp(ero $$0, ers $$1) {
      this.a = $$0;
      this.d = new gfi(this, $$1);
   }

   public void a(foa $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fjr $$0, @Nullable eid $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fjr $$0, ht $$1, dgb $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(ckj $$0) {
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

   public void a(evt $$0, int $$1) {
      this.c.add(new gfp.a($$0, $$1));
      this.a.ay().a($$0);
   }

   public void a(evt $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gfp.a::a);
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

   public void a(gfr $$0) {
      this.a.m.r = $$0;
      this.a.m.ar();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public ero e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == cqw.a;
   }

   public static ui a(String $$0) {
      return ui.d("key." + $$0).a(n.r);
   }

   public void a(ckj $$0, ckj $$1, cfx $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final evt a;
      private final int b;
      private int c;

      a(evt $$0, int $$1) {
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
