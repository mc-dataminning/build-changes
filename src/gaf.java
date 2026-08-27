import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gaf {
   private final enn a;
   @Nullable
   private gag b;
   private final List<gaf.a> c = Lists.newArrayList();
   private final fzy d;

   public gaf(enn $$0, enr $$1) {
      this.a = $$0;
      this.d = new fzy(this, $$1);
   }

   public void a(fiw $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable few $$0, @Nullable eeg $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(few $$0, gu $$1, dcb $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cfz $$0) {
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

   public void a(eri $$0, int $$1) {
      this.c.add(new gaf.a($$0, $$1));
      this.a.az().a($$0);
   }

   public void a(eri $$0) {
      this.c.removeIf($$1 -> $$1.a == $$0);
      $$0.c();
   }

   public void d() {
      this.c.removeIf(gaf.a::a);
      if (this.b != null) {
         if (this.a.s != null) {
            this.b.a();
         } else {
            this.b();
         }
      } else if (this.a.s != null) {
         this.c();
      }
   }

   public void a(gah $$0) {
      this.a.m.r = $$0;
      this.a.m.aq();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public enn e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.l() == cmj.a;
   }

   public static sw a(String $$0) {
      return sw.d("key." + $$0).a(n.r);
   }

   public void a(cfz $$0, cfz $$1, cbn $$2) {
      this.d.a($$0, $$1, $$2);
   }

   static final class a {
      final eri a;
      private final int b;
      private int c;

      a(eri $$0, int $$1) {
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
