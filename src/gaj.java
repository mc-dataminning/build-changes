import java.util.function.Consumer;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gaj extends gay {
   private static final Vector3f a = new Vector3f(0.5F, 0.5F, 0.5F).normalize();
   private static final Vector3f b = new Vector3f(-1.0F, -1.0F, 0.0F);
   private static final float F = 1.0472F;
   private int G;

   gaj(fwr $$0, double $$1, double $$2, double $$3, int $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.D = 0.85F;
      this.G = $$4;
      this.t = 30;
      this.u = 0.0F;
      this.j = 0.0;
      this.k = 0.1;
      this.l = 0.0;
   }

   @Override
   public float b(float $$0) {
      return this.D * ayf.a(((float)this.s + $$0) / (float)this.t * 0.75F, 0.0F, 1.0F);
   }

   @Override
   public void a(eyy $$0, fdm $$1, float $$2) {
      if (this.G <= 0) {
         this.y = 1.0F - ayf.a(((float)this.s + $$2) / (float)this.t, 0.0F, 1.0F);
         this.a($$0, $$1, $$2, $$0x -> $$0x.mul(new Quaternionf().rotationX(-1.0472F)));
         this.a($$0, $$1, $$2, $$0x -> $$0x.mul(new Quaternionf().rotationYXZ((float) -Math.PI, 1.0472F, 0.0F)));
      }
   }

   private void a(eyy $$0, fdm $$1, float $$2, Consumer<Quaternionf> $$3) {
      eum $$4 = $$1.b();
      float $$5 = (float)(ayf.d((double)$$2, this.d, this.g) - $$4.a());
      float $$6 = (float)(ayf.d((double)$$2, this.e, this.h) - $$4.b());
      float $$7 = (float)(ayf.d((double)$$2, this.f, this.i) - $$4.c());
      Quaternionf $$8 = new Quaternionf().setAngleAxis(0.0F, a.x(), a.y(), a.z());
      $$3.accept($$8);
      $$8.transform(b);
      Vector3f[] $$9 = new Vector3f[]{
         new Vector3f(-1.0F, -1.0F, 0.0F), new Vector3f(-1.0F, 1.0F, 0.0F), new Vector3f(1.0F, 1.0F, 0.0F), new Vector3f(1.0F, -1.0F, 0.0F)
      };
      float $$10 = this.b($$2);

      for (int $$11 = 0; $$11 < 4; $$11++) {
         Vector3f $$12 = $$9[$$11];
         $$12.rotate($$8);
         $$12.mul($$10);
         $$12.add($$5, $$6, $$7);
      }

      int $$13 = this.a($$2);
      this.a($$0, $$9[0], this.d(), this.f(), $$13);
      this.a($$0, $$9[1], this.d(), this.e(), $$13);
      this.a($$0, $$9[2], this.c(), this.e(), $$13);
      this.a($$0, $$9[3], this.c(), this.f(), $$13);
   }

   private void a(eyy $$0, Vector3f $$1, float $$2, float $$3, int $$4) {
      $$0.a((double)$$1.x(), (double)$$1.y(), (double)$$1.z()).a($$2, $$3).a(this.v, this.w, this.x, this.y).b($$4).e();
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public gac b() {
      return gac.c;
   }

   @Override
   public void a() {
      if (this.G > 0) {
         this.G--;
      } else {
         super.a();
      }
   }

   public static class a implements gab<la> {
      private final gat a;

      public a(gat $$0) {
         this.a = $$0;
      }

      public fzy a(la $$0, fwr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gaj $$8 = new gaj($$1, $$2, $$3, $$4, $$0.b());
         $$8.a(this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
