import org.joml.Matrix4f;

public abstract class fvw<T extends bkq> {
   protected static final float b = 0.025F;
   protected final fvv c;
   private final eum a;
   protected float d;
   protected float e = 1.0F;

   protected fvw(fvx.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      ht $$2 = ht.a($$0.k($$1));
      return fqt.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, ht $$1) {
      return $$0.dN().a(csj.a, $$1);
   }

   protected int a(T $$0, ht $$1) {
      return $$0.bN() ? 15 : $$0.dN().a(csj.b, $$1);
   }

   public boolean a(T $$0, ftw $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.at) {
         return true;
      } else {
         ejp $$5 = $$0.h_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new ejp($$0.ds() - 2.0, $$0.du() - 2.0, $$0.dy() - 2.0, $$0.ds() + 2.0, $$0.du() + 2.0, $$0.dy() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public eju a(T $$0, float $$1) {
      return eju.b;
   }

   public void a(T $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.P_(), $$3, $$4, $$5);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cC() || $$0.ae() && $$0 == this.c.c;
   }

   public abstract agi a(T var1);

   public eum b() {
      return this.a;
   }

   protected void a(T $$0, ur $$1, enw $$2, fqu $$3, int $$4) {
      double $$5 = this.c.b($$0);
      if (!($$5 > 4096.0)) {
         boolean $$6 = !$$0.bV();
         float $$7 = $$0.dj();
         int $$8 = "deadmau5".equals($$1.getString()) ? -10 : 0;
         $$2.a();
         $$2.a(0.0F, $$7, 0.0F);
         $$2.a(this.c.b());
         $$2.b(-0.025F, -0.025F, 0.025F);
         Matrix4f $$9 = $$2.c().a();
         float $$10 = etd.N().m.a(0.25F);
         int $$11 = (int)($$10 * 255.0F) << 24;
         eum $$12 = this.b();
         float $$13 = (float)(-$$12.a($$1) / 2);
         $$12.a($$1, $$13, (float)$$8, 553648127, false, $$9, $$3, $$6 ? eum.a.b : eum.a.a, $$11, $$4);
         if ($$6) {
            $$12.a($$1, $$13, (float)$$8, -1, false, $$9, $$3, eum.a.a, 0, $$4);
         }

         $$2.b();
      }
   }
}
