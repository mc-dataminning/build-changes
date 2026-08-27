import javax.annotation.Nullable;

public class yu implements uw<wo> {
   private final double a;
   private final double b;
   private final double c;
   private final int d;
   private final ec.a e;
   private final ec.a f;
   private final boolean g;

   public yu(ec.a $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = 0;
      this.g = false;
      this.f = null;
   }

   public yu(ec.a $$0, big $$1, ec.a $$2) {
      this.e = $$0;
      this.d = $$1.ah();
      this.f = $$2;
      ehf $$3 = $$2.a($$1);
      this.a = $$3.c;
      this.b = $$3.d;
      this.c = $$3.e;
      this.g = true;
   }

   public yu(sh $$0) {
      this.e = $$0.b(ec.a.class);
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.g = $$0.readBoolean();
      if (this.g) {
         this.d = $$0.m();
         this.f = $$0.b(ec.a.class);
      } else {
         this.d = 0;
         this.f = null;
      }
   }

   @Override
   public void a(sh $$0) {
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

   public void a(wo $$0) {
      $$0.a(this);
   }

   public ec.a a() {
      return this.e;
   }

   @Nullable
   public ehf a(cpk $$0) {
      if (this.g) {
         big $$1 = $$0.a(this.d);
         return $$1 == null ? new ehf(this.a, this.b, this.c) : this.f.a($$1);
      } else {
         return new ehf(this.a, this.b, this.c);
      }
   }
}
