import org.joml.Matrix4f;

public abstract class fyz<T extends blw> {
   protected static final float b = 0.025F;
   protected final fyy c;
   private final exc a;
   protected float d;
   protected float e = 1.0F;

   protected fyz(fza.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      hx $$2 = hx.a($$0.k($$1));
      return fts.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, hx $$1) {
      return $$0.dL().a(cug.a, $$1);
   }

   protected int a(T $$0, hx $$1) {
      return $$0.bN() ? 15 : $$0.dL().a(cug.b, $$1);
   }

   public boolean a(T $$0, fww $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.at) {
         return true;
      } else {
         elx $$5 = $$0.i_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new elx($$0.dq() - 2.0, $$0.ds() - 2.0, $$0.dw() - 2.0, $$0.dq() + 2.0, $$0.ds() + 2.0, $$0.dw() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public emc a(T $$0, float $$1) {
      return emc.b;
   }

   public void a(T $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.Q_(), $$3, $$4, $$5, $$2);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cC() || $$0.ae() && $$0 == this.c.c;
   }

   public abstract ahh a(T var1);

   public exc b() {
      return this.a;
   }

   protected void a(T $$0, vg $$1, eqk $$2, ftt $$3, int $$4, float $$5) {
      double $$6 = this.c.b($$0);
      if (!($$6 > 4096.0)) {
         bly $$7 = $$0.a($$0.ap()).d();
         emc $$8 = $$7.a(blx.c, 0, $$0.h($$5));
         if ($$8 != null) {
            boolean $$9 = !$$0.bV();
            int $$10 = "deadmau5".equals($$1.getString()) ? -10 : 0;
            $$2.a();
            $$2.a($$8.c, $$8.d + 0.5, $$8.e);
            $$2.a(this.c.b());
            $$2.b(-0.025F, -0.025F, 0.025F);
            Matrix4f $$11 = $$2.c().a();
            float $$12 = evr.O().m.a(0.25F);
            int $$13 = (int)($$12 * 255.0F) << 24;
            exc $$14 = this.b();
            float $$15 = (float)(-$$14.a($$1) / 2);
            $$14.a($$1, $$15, (float)$$10, 553648127, false, $$11, $$3, $$9 ? exc.a.b : exc.a.a, $$13, $$4);
            if ($$9) {
               $$14.a($$1, $$15, (float)$$10, -1, false, $$11, $$3, exc.a.a, 0, $$4);
            }

            $$2.b();
         }
      }
   }

   protected float c(T $$0) {
      return this.d;
   }
}
