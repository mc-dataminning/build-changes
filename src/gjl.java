import org.joml.Matrix4f;

public abstract class gjl<T extends bsg> {
   protected static final float b = 0.025F;
   protected final gjk c;
   private final fhd a;
   protected float d;
   protected float e = 1.0F;

   protected gjl(gjm.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      ja $$2 = ja.a($$0.l($$1));
      return gec.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, ja $$1) {
      return $$0.dQ().a(dco.a, $$1);
   }

   protected int a(T $$0, ja $$1) {
      return $$0.bR() ? 15 : $$0.dQ().a(dco.b, $$1);
   }

   public boolean a(T $$0, ghh $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.au) {
         return true;
      } else {
         ewa $$5 = $$0.h_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new ewa($$0.dv() - 2.0, $$0.dx() - 2.0, $$0.dB() - 2.0, $$0.dv() + 2.0, $$0.dx() + 2.0, $$0.dB() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public ewf a(T $$0, float $$1) {
      return ewf.b;
   }

   public void a(T $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.O_(), $$3, $$4, $$5, $$2);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cG() || $$0.ah() && $$0 == this.c.c;
   }

   public abstract akk a(T var1);

   public fhd b() {
      return this.a;
   }

   protected void a(T $$0, wu $$1, fam $$2, ged $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      if (!($$6 > 4096.0)) {
         ewf $$7 = $$0.dn().a(bsh.c, 0, $$0.i($$5));
         if ($$7 != null) {
            boolean $$8 = !$$0.bZ();
            int $$9 = "deadmau5".equals($$1.getString()) ? -10 : 0;
            $$2.a();
            $$2.a($$7.c, $$7.d + 0.5, $$7.e);
            $$2.a(this.c.b());
            $$2.b(-0.025F, -0.025F, 0.025F);
            Matrix4f $$10 = $$2.c().a();
            float $$11 = fft.Q().m.a(0.25F);
            int $$12 = (int)($$11 * 255.0F) << 24;
            fhd $$13 = this.b();
            float $$14 = (float)(-$$13.a($$1) / 2);
            $$13.a($$1, $$14, (float)$$9, 553648127, false, $$10, $$3, $$8 ? fhd.a.b : fhd.a.a, $$12, $$4);
            if ($$8) {
               $$13.a($$1, $$14, (float)$$9, -1, false, $$10, $$3, fhd.a.a, 0, $$4);
            }

            $$2.b();
         }
      }
   }

   protected float c(T $$0) {
      return this.d;
   }
}
