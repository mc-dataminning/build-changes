import javax.annotation.Nullable;

public class yv implements ux<wp> {
   private final double a;
   private final double b;
   private final double c;
   private final int d;
   private final eb.a e;
   private final eb.a f;
   private final boolean g;

   public yv(eb.a $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = 0;
      this.g = false;
      this.f = null;
   }

   public yv(eb.a $$0, bii $$1, eb.a $$2) {
      this.e = $$0;
      this.d = $$1.ah();
      this.f = $$2;
      ehe $$3 = $$2.a($$1);
      this.a = $$3.c;
      this.b = $$3.d;
      this.c = $$3.e;
      this.g = true;
   }

   public yv(si $$0) {
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
   public void a(si $$0) {
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

   public void a(wp $$0) {
      $$0.a(this);
   }

   public eb.a a() {
      return this.e;
   }

   @Nullable
   public ehe a(cpm $$0) {
      if (this.g) {
         bii $$1 = $$0.a(this.d);
         return $$1 == null ? new ehe(this.a, this.b, this.c) : this.f.a($$1);
      } else {
         return new ehe(this.a, this.b, this.c);
      }
   }
}
