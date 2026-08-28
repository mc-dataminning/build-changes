import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fxv extends fww<cuq> {
   private float G;
   private float H;
   private boolean I;
   private final fxn J;

   public fxv(cqi $$0) {
      super($$0.bO, new gaa($$0.bO), $$0.gi(), wv.c("container.crafting"));
      this.v = 97;
      this.J = new fxn(this);
   }

   @Override
   public void E() {
      super.E();
      if (this.m.t.fU()) {
         this.m.a(new fxk(this.m.t, this.m.t.j.y(), this.m.n.L().c()));
      }
   }

   @Override
   protected void aN_() {
      if (this.m.t.fU()) {
         this.m.a(new fxk(this.m.t, this.m.t.j.y(), this.m.n.L().c()));
      } else {
         super.aN_();
      }
   }

   @Override
   protected fut G() {
      return new fut(this.C + 104, this.o / 2 - 22);
   }

   @Override
   protected void H() {
      this.I = true;
   }

   @Override
   protected void b(fpz $$0, int $$1, int $$2) {
      $$0.a(this.p, this.l, this.v, this.w, 4210752, false);
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.J.a($$0, $$1, $$2, $$3);
      this.G = (float)$$1;
      this.H = (float)$$2;
   }

   @Override
   public boolean C() {
      return this.J.a();
   }

   @Override
   protected boolean I() {
      return false;
   }

   @Override
   protected void a(fpz $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(goi::H, a, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      a($$0, $$4 + 26, $$5 + 8, $$4 + 75, $$5 + 78, 30, 0.0625F, this.G, this.H, this.m.t);
   }

   public static void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, bwr $$9) {
      float $$10 = (float)($$1 + $$3) / 2.0F;
      float $$11 = (float)($$2 + $$4) / 2.0F;
      $$0.c($$1, $$2, $$3, $$4);
      float $$12 = (float)Math.atan((double)(($$10 - $$7) / 40.0F));
      float $$13 = (float)Math.atan((double)(($$11 - $$8) / 40.0F));
      Quaternionf $$14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf $$15 = new Quaternionf().rotateX($$13 * 20.0F * (float) (Math.PI / 180.0));
      $$14.mul($$15);
      float $$16 = $$9.aU;
      float $$17 = $$9.dL();
      float $$18 = $$9.dN();
      float $$19 = $$9.aX;
      float $$20 = $$9.aW;
      $$9.aU = 180.0F + $$12 * 20.0F;
      $$9.w(180.0F + $$12 * 40.0F);
      $$9.x(-$$13 * 20.0F);
      $$9.aW = $$9.dL();
      $$9.aX = $$9.dL();
      float $$21 = $$9.ek();
      Vector3f $$22 = new Vector3f(0.0F, $$9.dr() / 2.0F + $$6 * $$21, 0.0F);
      float $$23 = (float)$$5 / $$21;
      a($$0, $$10, $$11, $$23, $$22, $$14, $$15, $$9);
      $$9.aU = $$16;
      $$9.w($$17);
      $$9.x($$18);
      $$9.aX = $$19;
      $$9.aW = $$20;
      $$0.e();
   }

   public static void a(fpz $$0, float $$1, float $$2, float $$3, Vector3f $$4, Quaternionf $$5, @Nullable Quaternionf $$6, bwr $$7) {
      $$0.c().a();
      $$0.c().a((double)$$1, (double)$$2, 50.0);
      $$0.c().b($$3, $$3, -$$3);
      $$0.c().a($$4.x, $$4.y, $$4.z);
      $$0.c().a($$5);
      $$0.d();
      fgk.e();
      gud $$8 = fnd.Q().aq();
      if ($$6 != null) {
         $$8.a($$6.conjugate(new Quaternionf()).rotateY((float) Math.PI));
      }

      $$8.a(false);
      $$0.a($$3x -> $$8.a($$7, 0.0, 0.0, 0.0, 1.0F, $$0.c(), $$3x, 15728880));
      $$0.d();
      $$8.a(true);
      $$0.c().b();
      fgk.d();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.I) {
         this.I = false;
         return true;
      } else {
         return super.b($$0, $$1, $$2);
      }
   }
}
