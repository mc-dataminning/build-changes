import org.joml.Quaternionf;

public class gmw extends gnl {
   private static final float a = 1.0472F;
   private int b;

   gmw(gjd $$0, double $$1, double $$2, double $$3, int $$4) {
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
      return this.D * azk.a(((float)this.s + $$0) / (float)this.t * 0.75F, 0.0F, 1.0F);
   }

   @Override
   public void a(fiu $$0, fnn $$1, float $$2) {
      if (this.b <= 0) {
         this.y = 1.0F - azk.a(((float)this.s + $$2) / (float)this.t, 0.0F, 1.0F);
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
   public gmp b() {
      return gmp.c;
   }

   @Override
   public void a() {
      if (this.b > 0) {
         this.b--;
      } else {
         super.a();
      }
   }

   public static class a implements gmo<ma> {
      private final gng a;

      public a(gng $$0) {
         this.a = $$0;
      }

      public gml a(ma $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gmw $$8 = new gmw($$1, $$2, $$3, $$4, $$0.b());
         $$8.a(this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
