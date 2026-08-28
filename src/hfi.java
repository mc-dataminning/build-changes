import javax.annotation.Nullable;

public class hfi {
   private final fke a;
   @Nullable
   private hfj b;

   public hfi(fke $$0, fki $$1) {
      this.a = $$0;
   }

   public void a(gia $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable gdh $$0, @Nullable ezw $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(gdh $$0, jh $$1, dvv $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cwm $$0) {
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

      this.b = this.a.n.r.a(this);
   }

   public void d() {
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

   public void a(hfk $$0) {
      this.a.n.r = $$0;
      this.a.n.ay();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fke e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.j() == dfj.a;
   }

   public static xj a(String $$0) {
      return xj.d("key." + $$0).a(n.r);
   }

   public void a(cwm $$0, cwm $$1, csj $$2) {
   }
}
