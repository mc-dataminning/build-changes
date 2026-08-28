import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fwy extends fvz<ctz> {
   private float G;
   private float H;
   private boolean I;
   private final fwq J;

   public fwy(cpr $$0) {
      super($$0.bP, new fzb($$0.bP), $$0.gl(), wp.c("container.crafting"));
      this.v = 97;
      this.J = new fwq(this);
   }

   @Override
   public void E() {
      super.E();
      if (this.m.t.fX()) {
         this.m.a(new fwn(this.m.t, this.m.t.j.y(), this.m.n.L().c()));
      }
   }

   @Override
   protected void aR_() {
      if (this.m.t.fX()) {
         this.m.a(new fwn(this.m.t, this.m.t.j.y(), this.m.n.L().c()));
      } else {
         super.aR_();
      }
   }

   @Override
   protected ftw G() {
      return new ftw(this.C + 104, this.o / 2 - 22);
   }

   @Override
   protected void H() {
      this.I = true;
   }

   @Override
   protected void b(fpc $$0, int $$1, int $$2) {
      $$0.a(this.p, this.l, this.v, this.w, 4210752, false);
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
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
   protected void a(fpc $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gnh::H, a, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      a($$0, $$4 + 26, $$5 + 8, $$4 + 75, $$5 + 78, 30, 0.0625F, this.G, this.H, this.m.t);
   }

   public static void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, bvy $$9) {
      float $$10 = (float)($$1 + $$3) / 2.0F;
      float $$11 = (float)($$2 + $$4) / 2.0F;
      $$0.c($$1, $$2, $$3, $$4);
      float $$12 = (float)Math.atan((double)(($$10 - $$7) / 40.0F));
      float $$13 = (float)Math.atan((double)(($$11 - $$8) / 40.0F));
      Quaternionf $$14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf $$15 = new Quaternionf().rotateX($$13 * 20.0F * (float) (Math.PI / 180.0));
      $$14.mul($$15);
      float $$16 = $$9.aV;
      float $$17 = $$9.dK();
      float $$18 = $$9.dM();
      float $$19 = $$9.aY;
      float $$20 = $$9.aX;
      $$9.aV = 180.0F + $$12 * 20.0F;
      $$9.w(180.0F + $$12 * 40.0F);
      $$9.x(-$$13 * 20.0F);
      $$9.aX = $$9.dK();
      $$9.aY = $$9.dK();
      float $$21 = $$9.ej();
      Vector3f $$22 = new Vector3f(0.0F, $$9.dq() / 2.0F + $$6 * $$21, 0.0F);
      float $$23 = (float)$$5 / $$21;
      a($$0, $$10, $$11, $$23, $$22, $$14, $$15, $$9);
      $$9.aV = $$16;
      $$9.w($$17);
      $$9.x($$18);
      $$9.aY = $$19;
      $$9.aX = $$20;
      $$0.e();
   }

   public static void a(fpc $$0, float $$1, float $$2, float $$3, Vector3f $$4, Quaternionf $$5, @Nullable Quaternionf $$6, bvy $$7) {
      $$0.c().a();
      $$0.c().a((double)$$1, (double)$$2, 50.0);
      $$0.c().b($$3, $$3, -$$3);
      $$0.c().a($$4.x, $$4.y, $$4.z);
      $$0.c().a($$5);
      $$0.d();
      ffn.e();
      gtb $$8 = fmg.Q().aq();
      if ($$6 != null) {
         $$8.a($$6.conjugate(new Quaternionf()).rotateY((float) Math.PI));
      }

      $$8.a(false);
      $$0.a($$3x -> $$8.a($$7, 0.0, 0.0, 0.0, 1.0F, $$0.c(), $$3x, 15728880));
      $$0.d();
      $$8.a(true);
      $$0.c().b();
      ffn.d();
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
