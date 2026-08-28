import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gyd extends gyh<cmv, hen> {
   public static final ali a = ali.b("textures/entity/end_crystal/end_crystal_beam.png");
   private static final ali g = ali.b("textures/entity/enderdragon/dragon_exploding.png");
   private static final ali h = ali.b("textures/entity/enderdragon/dragon.png");
   private static final ali i = ali.b("textures/entity/enderdragon/dragon_eyes.png");
   private static final gsl j = gsl.g(h);
   private static final gsl k = gsl.m(h);
   private static final gsl l = gsl.q(i);
   private static final gsl m = gsl.l(a);
   private static final float n = (float)(Math.sqrt(3.0) / 2.0);
   private final gky o;

   public gyd(gyi.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.o = new gky($$0.a(gld.aT));
   }

   public void a(hen $$0, flo $$1, gsa $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.a(7).b();
      float $$5 = (float)($$0.a(5).a() - $$0.a(10).a());
      $$1.a(a.d.rotationDegrees(-$$4));
      $$1.a(a.b.rotationDegrees($$5 * 10.0F));
      $$1.a(0.0F, 0.0F, 1.0F);
      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(0.0F, -1.501F, 0.0F);
      this.o.a($$0);
      if ($$0.b > 0.0F) {
         float $$6 = $$0.b / 200.0F;
         int $$7 = axy.c(azo.d($$6 * 255.0F), -1);
         flr $$8 = $$2.getBuffer(gsl.p(g));
         this.o.a($$1, $$8, $$3, hkq.d, $$7);
         flr $$9 = $$2.getBuffer(k);
         this.o.a($$1, $$9, $$3, hkq.a(0.0F, $$0.c));
      } else {
         flr $$10 = $$2.getBuffer(j);
         this.o.a($$1, $$10, $$3, hkq.a(0.0F, $$0.c));
      }

      flr $$11 = $$2.getBuffer(l);
      this.o.a($$1, $$11, $$3, hkq.d);
      if ($$0.b > 0.0F) {
         float $$12 = $$0.b / 200.0F;
         $$1.a();
         $$1.a(0.0F, -1.0F, -2.0F);
         a($$1, $$12, $$2.getBuffer(gsl.r()));
         a($$1, $$12, $$2.getBuffer(gsl.s()));
         $$1.b();
      }

      $$1.b();
      if ($$0.d != null) {
         a((float)$$0.d.d, (float)$$0.d.e, (float)$$0.d.f, $$0.u, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(flo $$0, float $$1, flr $$2) {
      $$0.a();
      float $$3 = Math.min($$1 > 0.8F ? ($$1 - 0.8F) / 0.2F : 0.0F, 1.0F);
      int $$4 = axy.a(1.0F - $$3, 1.0F, 1.0F, 1.0F);
      int $$5 = 16711935;
      azx $$6 = azx.a(432L);
      Vector3f $$7 = new Vector3f();
      Vector3f $$8 = new Vector3f();
      Vector3f $$9 = new Vector3f();
      Vector3f $$10 = new Vector3f();
      Quaternionf $$11 = new Quaternionf();
      int $$12 = azo.d(($$1 + $$1 * $$1) / 2.0F * 60.0F);

      for (int $$13 = 0; $$13 < $$12; $$13++) {
         $$11.rotationXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2))
            .rotateXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2) + $$1 * (float) (Math.PI / 2));
         $$0.a($$11);
         float $$14 = $$6.i() * 20.0F + 5.0F + $$3 * 10.0F;
         float $$15 = $$6.i() * 2.0F + 1.0F + $$3 * 2.0F;
         $$8.set(-n * $$15, $$14, -0.5F * $$15);
         $$9.set(n * $$15, $$14, -0.5F * $$15);
         $$10.set(0.0F, $$14, $$15);
         flo.a $$16 = $$0.c();
         $$2.a($$16, $$7).a($$4);
         $$2.a($$16, $$8).a(16711935);
         $$2.a($$16, $$9).a(16711935);
         $$2.a($$16, $$7).a($$4);
         $$2.a($$16, $$9).a(16711935);
         $$2.a($$16, $$10).a(16711935);
         $$2.a($$16, $$7).a($$4);
         $$2.a($$16, $$10).a(16711935);
         $$2.a($$16, $$8).a(16711935);
      }

      $$0.b();
   }

   public static void a(float $$0, float $$1, float $$2, float $$3, flo $$4, gsa $$5, int $$6) {
      float $$7 = azo.c($$0 * $$0 + $$2 * $$2);
      float $$8 = azo.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      $$4.a();
      $$4.a(0.0F, 2.0F, 0.0F);
      $$4.a(a.d.rotation((float)(-Math.atan2((double)$$2, (double)$$0)) - (float) (Math.PI / 2)));
      $$4.a(a.b.rotation((float)(-Math.atan2((double)$$7, (double)$$1)) - (float) (Math.PI / 2)));
      flr $$9 = $$5.getBuffer(m);
      float $$10 = 0.0F - $$3 * 0.01F;
      float $$11 = $$8 / 32.0F - $$3 * 0.01F;
      int $$12 = 8;
      float $$13 = 0.0F;
      float $$14 = 0.75F;
      float $$15 = 0.0F;
      flo.a $$16 = $$4.c();

      for (int $$17 = 1; $$17 <= 8; $$17++) {
         float $$18 = azo.a((float)$$17 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$19 = azo.b((float)$$17 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$20 = (float)$$17 / 8.0F;
         $$9.a($$16, $$13 * 0.2F, $$14 * 0.2F, 0.0F).a(-16777216).a($$15, $$10).b(hkq.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$13, $$14, $$8).a(-1).a($$15, $$11).b(hkq.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$18, $$19, $$8).a(-1).a($$20, $$11).b(hkq.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$18 * 0.2F, $$19 * 0.2F, 0.0F).a(-16777216).a($$20, $$10).b(hkq.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$13 = $$18;
         $$14 = $$19;
         $$15 = $$20;
      }

      $$4.b();
   }

   public hen a() {
      return new hen();
   }

   public void a(cmv $$0, hen $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azo.h($$2, $$0.d, $$0.e);
      $$1.b = $$0.bH > 0 ? (float)$$0.bH + $$2 : 0.0F;
      $$1.c = $$0.aN > 0;
      cmu $$3 = $$0.bJ;
      if ($$3 != null) {
         ffq $$4 = $$3.p($$2).b(0.0, (double)gyc.a((float)$$3.a + $$2), 0.0);
         $$1.d = $$4.d($$0.p($$2));
      } else {
         $$1.d = null;
      }

      cnf $$5 = $$0.t().a();
      $$1.e = $$5 == cnl.d || $$5 == cnl.e;
      $$1.f = $$5.a();
      iv $$6 = $$0.dV().a(ehd.a.f, eki.a($$0.j()));
      $$1.g = $$6.b($$0.dt());
      $$1.h = $$0.eH() ? 0.0F : $$2;
      $$1.i.a($$0.b);
   }

   protected boolean a(cmv $$0) {
      return false;
   }
}
