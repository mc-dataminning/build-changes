import org.joml.Matrix4f;

public abstract class gda<T extends box> {
   protected static final float b = 0.025F;
   protected final gcz c;
   private final fat a;
   protected float d;
   protected float e = 1.0F;

   protected gda(gdb.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      ib $$2 = ib.a($$0.k($$1));
      return fxr.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, ib $$1) {
      return $$0.dM().a(cxk.a, $$1);
   }

   protected int a(T $$0, ib $$1) {
      return $$0.bN() ? 15 : $$0.dM().a(cxk.b, $$1);
   }

   public boolean a(T $$0, gaw $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.at) {
         return true;
      } else {
         epo $$5 = $$0.h_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new epo($$0.dr() - 2.0, $$0.dt() - 2.0, $$0.dx() - 2.0, $$0.dr() + 2.0, $$0.dt() + 2.0, $$0.dx() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public ept a(T $$0, float $$1) {
      return ept.b;
   }

   public void a(T $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.O_(), $$3, $$4, $$5, $$2);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cC() || $$0.ae() && $$0 == this.c.c;
   }

   public abstract ajh a(T var1);

   public fat b() {
      return this.a;
   }

   protected void a(T $$0, vu $$1, eub $$2, fxs $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      if (!($$6 > 4096.0)) {
         ept $$7 = $$0.dj().a(boy.c, 0, $$0.h($$5));
         if ($$7 != null) {
            boolean $$8 = !$$0.bV();
            int $$9 = "deadmau5".equals($$1.getString()) ? -10 : 0;
            $$2.a();
            $$2.a($$7.c, $$7.d + 0.5, $$7.e);
            $$2.a(this.c.b());
            $$2.b(-0.025F, -0.025F, 0.025F);
            Matrix4f $$10 = $$2.c().a();
            float $$11 = ezi.Q().m.a(0.25F);
            int $$12 = (int)($$11 * 255.0F) << 24;
            fat $$13 = this.b();
            float $$14 = (float)(-$$13.a($$1) / 2);
            $$13.a($$1, $$14, (float)$$9, 553648127, false, $$10, $$3, $$8 ? fat.a.b : fat.a.a, $$12, $$4);
            if ($$8) {
               $$13.a($$1, $$14, (float)$$9, -1, false, $$10, $$3, fat.a.a, 0, $$4);
            }

            $$2.b();
         }
      }
   }

   protected float c(T $$0) {
      return this.d;
   }
}
