import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gtq {
   private final feb a;
   @Nullable
   private gtr b;
   private final List<gtq.a> c = Lists.newArrayList();
   private final gtj d;

   public gtq(feb $$0, fef $$1) {
      this.a = $$0;
      this.d = new gtj(this, $$1);
   }

   public void a(gbk $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fwr $$0, @Nullable euk $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fwr $$0, io $$1, drd $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(ctq $$0) {
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

   public void a(fil $$0, int $$1) {
      this.c.add(new gtq.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(fil $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gtq.a::a);
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

   public void a(gts $$0) {
      this.a.m.r = $$0;
      this.a.m.av();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public feb e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.j() == daw.a;
   }

   public static wx a(String $$0) {
      return wx.d("key." + $$0).a(n.r);
   }

   public void a(ctq $$0, ctq $$1, cpd $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final fil a;
      private final int b;
      private int c;

      a(fil $$0, int $$1) {
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
