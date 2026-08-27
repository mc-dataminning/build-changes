import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gjd {
   private final euk a;
   @Nullable
   private gje b;
   private final List<gjd.a> c = Lists.newArrayList();
   private final giw d;

   public gjd(euk $$0, euo $$1) {
      this.a = $$0;
      this.d = new giw(this, $$1);
   }

   public void a(fri $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable fmt $$0, @Nullable ekz $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(fmt $$0, hv $$1, dip $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cmh $$0) {
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

   public void a(eyr $$0, int $$1) {
      this.c.add(new gjd.a($$0, $$1));
      this.a.ax().a($$0);
   }

   public void a(eyr $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gjd.a::a);
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

   public void a(gjf $$0) {
      this.a.m.r = $$0;
      this.a.m.as();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public euk e() {
      return this.a;
   }

   public boolean f() {
      return this.a.q == null ? false : this.a.q.l() == csv.a;
   }

   public static vb a(String $$0) {
      return vb.d("key." + $$0).a(n.r);
   }

   public void a(cmh $$0, cmh $$1, chs $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final eyr a;
      private final int b;
      private int c;

      a(eyr $$0, int $$1) {
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
