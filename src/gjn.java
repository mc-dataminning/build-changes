import org.joml.Matrix4f;

public abstract class gjn<T extends bsh> {
   protected static final float b = 0.025F;
   protected final gjm c;
   private final fhf a;
   protected float d;
   protected float e = 1.0F;

   protected gjn(gjo.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      ja $$2 = ja.a($$0.l($$1));
      return gee.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, ja $$1) {
      return $$0.dR().a(dcp.a, $$1);
   }

   protected int a(T $$0, ja $$1) {
      return $$0.bS() ? 15 : $$0.dR().a(dcp.b, $$1);
   }

   public boolean a(T $$0, ghj $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.au) {
         return true;
      } else {
         ewc $$5 = $$0.h_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new ewc($$0.dw() - 2.0, $$0.dy() - 2.0, $$0.dC() - 2.0, $$0.dw() + 2.0, $$0.dy() + 2.0, $$0.dC() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public ewh a(T $$0, float $$1) {
      return ewh.b;
   }

   public void a(T $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.O_(), $$3, $$4, $$5, $$2);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cH() || $$0.ai() && $$0 == this.c.c;
   }

   public abstract akk a(T var1);

   public fhf b() {
      return this.a;
   }

   protected void a(T $$0, wu $$1, fao $$2, gef $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      if (!($$6 > 4096.0)) {
         ewh $$7 = $$0.do().a(bsi.c, 0, $$0.i($$5));
         if ($$7 != null) {
            boolean $$8 = !$$0.ca();
            int $$9 = "deadmau5".equals($$1.getString()) ? -10 : 0;
            $$2.a();
            $$2.a($$7.c, $$7.d + 0.5, $$7.e);
            $$2.a(this.c.b());
            $$2.b(-0.025F, -0.025F, 0.025F);
            Matrix4f $$10 = $$2.c().a();
            float $$11 = ffw.Q().m.a(0.25F);
            int $$12 = (int)($$11 * 255.0F) << 24;
            fhf $$13 = this.b();
            float $$14 = (float)(-$$13.a($$1) / 2);
            $$13.a($$1, $$14, (float)$$9, 553648127, false, $$10, $$3, $$8 ? fhf.a.b : fhf.a.a, $$12, $$4);
            if ($$8) {
               $$13.a($$1, $$14, (float)$$9, -1, false, $$10, $$3, fhf.a.a, 0, $$4);
            }

            $$2.b();
         }
      }
   }

   protected float c(T $$0) {
      return this.d;
   }
}
