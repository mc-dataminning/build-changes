import javax.annotation.Nullable;

public class wz implements uo<ur> {
   private final double a;
   private final double b;
   private final double c;
   private final int d;
   private final eb.a e;
   private final eb.a f;
   private final boolean g;

   public wz(eb.a $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = 0;
      this.g = false;
      this.f = null;
   }

   public wz(eb.a $$0, bfj $$1, eb.a $$2) {
      this.e = $$0;
      this.d = $$1.af();
      this.f = $$2;
      eei $$3 = $$2.a($$1);
      this.a = $$3.c;
      this.b = $$3.d;
      this.c = $$3.e;
      this.g = true;
   }

   public wz(sf $$0) {
      this.e = $$0.b(eb.a.class);
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.g = $$0.readBoolean();
      if (this.g) {
         this.d = $$0.m();
         this.f = $$0.b(eb.a.class);
      } else {
         this.d = 0;
         this.f = null;
      }
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.e);
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeBoolean(this.g);
      if (this.g) {
         $$0.d(this.d);
         $$0.a(this.f);
      }
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public eb.a a() {
      return this.e;
   }

   @Nullable
   public eei a(cmm $$0) {
      if (this.g) {
         bfj $$1 = $$0.a(this.d);
         return $$1 == null ? new eei(this.a, this.b, this.c) : this.f.a($$1);
      } else {
         return new eei(this.a, this.b, this.c);
      }
   }
}
