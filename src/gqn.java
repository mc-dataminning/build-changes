import javax.annotation.Nullable;

public class gqn extends gsr<clq, gxb, gaj> {
   public static final alz a = alz.b("textures/entity/armorstand/wood.png");
   private final gaj b = this.c();
   private final gaj k;

   public gqn(grq.a $$0) {
      super($$0, new gak($$0.a(gen.f)), 0.0F);
      this.k = new gak($$0.a(gen.i));
      this.a(new gvu<>(this, new gaj($$0.a(gen.g)), new gaj($$0.a(gen.h)), new gaj($$0.a(gen.j)), new gaj($$0.a(gen.k)), $$0.h()));
      this.a(new gvx<>(this, $$0.b()));
      this.a(new gwq<>(this, $$0.f(), $$0.h()));
      this.a(new gvj<>(this, $$0.f(), $$0.b()));
   }

   public alz a(gxb $$0) {
      return a;
   }

   public gxb a() {
      return new gxb();
   }

   public void a(clq $$0, gxb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsh.a((bwg)$$0, (gyl)$$1, $$2);
      $$1.a = bae.i($$2, $$0.N, $$0.dM());
      $$1.c = $$0.x();
      $$1.d = $$0.p();
      $$1.e = $$0.t();
      $$1.f = $$0.u();
      $$1.h = $$0.z();
      $$1.g = $$0.y();
      $$1.i = $$0.A();
      $$1.j = $$0.B();
      $$1.k = $$0.C();
      $$1.l = $$0.D();
      $$1.b = (float)($$0.dW().ac() - $$0.bQ) + $$2;
   }

   public void a(gxb $$0, fgs $$1, gll $$2, int $$3) {
      this.h = $$0.d ? this.k : this.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gxb $$0, fgs $$1, float $$2, float $$3) {
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      if ($$0.b < 5.0F) {
         $$1.a(a.d.rotationDegrees(bae.a($$0.b / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   protected boolean a(clq $$0, double $$1) {
      return $$0.cL();
   }

   @Nullable
   protected glv a(gxb $$0, boolean $$1, boolean $$2, boolean $$3) {
      if (!$$0.c) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         alz $$4 = this.a($$0);
         if ($$2) {
            return glv.c($$4, false);
         } else {
            return $$1 ? glv.a($$4, false) : null;
         }
      }
   }
}
