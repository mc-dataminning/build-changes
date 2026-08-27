import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gsi {
   private final fcu a;
   @Nullable
   private gsj b;
   private final List<gsi.a> c = Lists.newArrayList();
   private final gsb d;

   public gsi(fcu $$0, fcy $$1) {
      this.a = $$0;
      this.d = new gsb(this, $$1);
   }

   public void a(gae $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fvm $$0, @Nullable etd $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fvm $$0, im $$1, dpy $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(csd $$0) {
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

   public void a(fhf $$0, int $$1) {
      this.c.add(new gsi.a($$0, $$1));
      this.a.aA().a($$0);
   }

   public void a(fhf $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gsi.a::a);
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

   public void a(gsk $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fcu e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == czr.a;
   }

   public static ws a(String $$0) {
      return ws.d("key." + $$0).a(n.r);
   }

   public void a(csd $$0, csd $$1, cnp $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fhf a;
      private final int b;
      private int c;

      a(fhf $$0, int $$1) {
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
