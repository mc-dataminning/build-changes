import org.joml.Matrix4f;

public abstract class gaz<T extends bnq> {
   protected static final float b = 0.025F;
   protected final gay c;
   private final eyz a;
   protected float d;
   protected float e = 1.0F;

   protected gaz(gba.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      hz $$2 = hz.a($$0.k($$1));
      return fvs.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, hz $$1) {
      return $$0.dM().a(cwa.a, $$1);
   }

   protected int a(T $$0, hz $$1) {
      return $$0.bN() ? 15 : $$0.dM().a(cwa.b, $$1);
   }

   public boolean a(T $$0, fyw $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.as) {
         return true;
      } else {
         enu $$5 = $$0.i_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new enu($$0.dr() - 2.0, $$0.dt() - 2.0, $$0.dx() - 2.0, $$0.dr() + 2.0, $$0.dt() + 2.0, $$0.dx() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public enz a(T $$0, float $$1) {
      return enz.b;
   }

   public void a(T $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.Q_(), $$3, $$4, $$5, $$2);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cC() || $$0.ae() && $$0 == this.c.c;
   }

   public abstract aiy a(T var1);

   public eyz b() {
      return this.a;
   }

   protected void a(T $$0, vq $$1, esh $$2, fvt $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      if (!($$6 > 4096.0)) {
         enz $$7 = $$0.dj().a(bnr.c, 0, $$0.h($$5));
         if ($$7 != null) {
            boolean $$8 = !$$0.bV();
            int $$9 = "deadmau5".equals($$1.getString()) ? -10 : 0;
            $$2.a();
            $$2.a($$7.c, $$7.d + 0.5, $$7.e);
            $$2.a(this.c.b());
            $$2.b(-0.025F, -0.025F, 0.025F);
            Matrix4f $$10 = $$2.c().a();
            float $$11 = exo.P().m.a(0.25F);
            int $$12 = (int)($$11 * 255.0F) << 24;
            eyz $$13 = this.b();
            float $$14 = (float)(-$$13.a($$1) / 2);
            $$13.a($$1, $$14, (float)$$9, 553648127, false, $$10, $$3, $$8 ? eyz.a.b : eyz.a.a, $$12, $$4);
            if ($$8) {
               $$13.a($$1, $$14, (float)$$9, -1, false, $$10, $$3, eyz.a.a, 0, $$4);
            }

            $$2.b();
         }
      }
   }

   protected float c(T $$0) {
      return this.d;
   }
}
