import org.joml.Quaternionf;

public class gnl extends goa {
   private static final float a = 1.0472F;
   private int b;

   gnl(gjr $$0, double $$1, double $$2, double $$3, int $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.D = 0.85F;
      this.b = $$4;
      this.t = 30;
      this.u = 0.0F;
      this.j = 0.0;
      this.k = 0.1;
      this.l = 0.0;
   }

   @Override
   public float b(float $$0) {
      return this.D * azm.a(((float)this.s + $$0) / (float)this.t * 0.75F, 0.0F, 1.0F);
   }

   @Override
   public void a(fjg $$0, fnz $$1, float $$2) {
      if (this.b <= 0) {
         this.y = 1.0F - azm.a(((float)this.s + $$2) / (float)this.t, 0.0F, 1.0F);
         Quaternionf $$3 = new Quaternionf();
         $$3.rotationX(-1.0472F);
         this.a($$0, $$1, $$3, $$2);
         $$3.rotationYXZ((float) -Math.PI, 1.0472F, 0.0F);
         this.a($$0, $$1, $$3, $$2);
      }
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public gne b() {
      return gne.c;
   }

   @Override
   public void a() {
      if (this.b > 0) {
         this.b--;
      } else {
         super.a();
      }
   }

   public static class a implements gnd<ma> {
      private final gnv a;

      public a(gnv $$0) {
         this.a = $$0;
      }

      public gna a(ma $$0, gjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gnl $$8 = new gnl($$1, $$2, $$3, $$4, $$0.b());
         $$8.a(this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
