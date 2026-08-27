import org.joml.Matrix4f;

public abstract class fye<T extends blp> {
   protected static final float b = 0.025F;
   protected final fyd c;
   private final ewk a;
   protected float d;
   protected float e = 1.0F;

   protected fye(fyf.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      hx $$2 = hx.a($$0.k($$1));
      return fsy.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, hx $$1) {
      return $$0.dM().a(ctr.a, $$1);
   }

   protected int a(T $$0, hx $$1) {
      return $$0.bN() ? 15 : $$0.dM().a(ctr.b, $$1);
   }

   public boolean a(T $$0, fwc $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.at) {
         return true;
      } else {
         elh $$5 = $$0.i_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new elh($$0.dr() - 2.0, $$0.dt() - 2.0, $$0.dx() - 2.0, $$0.dr() + 2.0, $$0.dt() + 2.0, $$0.dx() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public elm a(T $$0, float $$1) {
      return elm.b;
   }

   public void a(T $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.Q_(), $$3, $$4, $$5);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cC() || $$0.ae() && $$0 == this.c.c;
   }

   public abstract ahd a(T var1);

   public ewk b() {
      return this.a;
   }

   protected void a(T $$0, vd $$1, ept $$2, fsz $$3, int $$4) {
      double $$5 = this.c.b($$0);
      if (!($$5 > 4096.0)) {
         boolean $$6 = !$$0.bV();
         float $$7 = $$0.di();
         int $$8 = "deadmau5".equals($$1.getString()) ? -10 : 0;
         $$2.a();
         $$2.a(0.0F, $$7, 0.0F);
         $$2.a(this.c.b());
         $$2.b(-0.025F, -0.025F, 0.025F);
         Matrix4f $$9 = $$2.c().a();
         float $$10 = eva.N().m.a(0.25F);
         int $$11 = (int)($$10 * 255.0F) << 24;
         ewk $$12 = this.b();
         float $$13 = (float)(-$$12.a($$1) / 2);
         $$12.a($$1, $$13, (float)$$8, 553648127, false, $$9, $$3, $$6 ? ewk.a.b : ewk.a.a, $$11, $$4);
         if ($$6) {
            $$12.a($$1, $$13, (float)$$8, -1, false, $$9, $$3, ewk.a.a, 0, $$4);
         }

         $$2.b();
      }
   }
}
