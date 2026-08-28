import java.util.Optional;
import org.joml.Quaternionf;

public class gqc extends gpx {
   private final egu a;
   private float b;
   private float F;
   private float G;
   private float H;

   gqc(glo $$0, double $$1, double $$2, double $$3, egu $$4, int $$5) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.D = 0.3F;
      this.a = $$4;
      this.t = $$5;
      Optional<fgc> $$6 = $$4.a($$0);
      if ($$6.isPresent()) {
         fgc $$7 = $$6.get();
         double $$8 = $$1 - $$7.a();
         double $$9 = $$2 - $$7.b();
         double $$10 = $$3 - $$7.c();
         this.F = this.b = (float)azz.d($$8, $$10);
         this.H = this.G = (float)azz.d($$9, Math.sqrt($$8 * $$8 + $$10 * $$10));
      }
   }

   @Override
   public void a(flg $$0, fpy $$1, float $$2) {
      float $$3 = azz.a(((float)this.s + $$2 - (float) (Math.PI * 2)) * 0.05F) * 2.0F;
      float $$4 = azz.h($$2, this.F, this.b);
      float $$5 = azz.h($$2, this.H, this.G) + (float) (Math.PI / 2);
      Quaternionf $$6 = new Quaternionf();
      $$6.rotationY($$4).rotateX(-$$5).rotateY($$3);
      this.a($$0, $$1, $$6, $$2);
      $$6.rotationY((float) -Math.PI + $$4).rotateX($$5).rotateY($$3);
      this.a($$0, $$1, $$6, $$2);
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public gpb b() {
      return gpb.c;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         Optional<fgc> $$0 = this.a.a(this.c);
         if ($$0.isEmpty()) {
            this.k();
         } else {
            int $$1 = this.t - this.s;
            double $$2 = 1.0 / (double)$$1;
            fgc $$3 = $$0.get();
            this.g = azz.d($$2, this.g, $$3.a());
            this.h = azz.d($$2, this.h, $$3.b());
            this.i = azz.d($$2, this.i, $$3.c());
            double $$4 = this.g - $$3.a();
            double $$5 = this.h - $$3.b();
            double $$6 = this.i - $$3.c();
            this.F = this.b;
            this.b = (float)azz.d($$4, $$6);
            this.H = this.G;
            this.G = (float)azz.d($$5, Math.sqrt($$4 * $$4 + $$6 * $$6));
         }
      }
   }

   public static class a implements gpa<mf> {
      private final gps a;

      public a(gps $$0) {
         this.a = $$0;
      }

      public gox a(mf $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gqc $$8 = new gqc($$1, $$2, $$3, $$4, $$0.b(), $$0.c());
         $$8.a(this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
