import javax.annotation.Nullable;

public class zz implements wb<xu> {
   private final double a;
   private final double b;
   private final double c;
   private final int d;
   private final ef.a e;
   private final ef.a f;
   private final boolean g;

   public zz(ef.a $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = 0;
      this.g = false;
      this.f = null;
   }

   public zz(ef.a $$0, bjt $$1, ef.a $$2) {
      this.e = $$0;
      this.d = $$1.ah();
      this.f = $$2;
      eif $$3 = $$2.a($$1);
      this.a = $$3.c;
      this.b = $$3.d;
      this.c = $$3.e;
      this.g = true;
   }

   public zz(tl $$0) {
      this.e = $$0.b(ef.a.class);
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.g = $$0.readBoolean();
      if (this.g) {
         this.d = $$0.n();
         this.f = $$0.b(ef.a.class);
      } else {
         this.d = 0;
         this.f = null;
      }
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.e);
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.g);
      if (this.g) {
         $$0.c(this.d);
         $$0.a(this.f);
      }
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public ef.a a() {
      return this.e;
   }

   @Nullable
   public eif a(cqz $$0) {
      if (this.g) {
         bjt $$1 = $$0.a(this.d);
         return $$1 == null ? new eif(this.a, this.b, this.c) : this.f.a($$1);
      } else {
         return new eif(this.a, this.b, this.c);
      }
   }
}
