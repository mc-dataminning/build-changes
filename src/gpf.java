import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gpf extends gpj<cjv, gvm> {
   public static final alj a = alj.b("textures/entity/end_crystal/end_crystal_beam.png");
   private static final alj b = alj.b("textures/entity/enderdragon/dragon_exploding.png");
   private static final alj h = alj.b("textures/entity/enderdragon/dragon.png");
   private static final alj i = alj.b("textures/entity/enderdragon/dragon_eyes.png");
   private static final gjq j = gjq.f(h);
   private static final gjq k = gjq.l(h);
   private static final gjq l = gjq.p(i);
   private static final gjq m = gjq.k(a);
   private static final float n = (float)(Math.sqrt(3.0) / 2.0);
   private final gcf o;

   public gpf(gpk.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.o = new gcf($$0.a(gck.aF));
   }

   public void a(gvm $$0, fer $$1, gjg $$2, int $$3) {
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
         int $$7 = axx.c(azm.d($$6 * 255.0F), -1);
         fev $$8 = $$2.getBuffer(gjq.o(b));
         this.o.a($$1, $$8, $$3, gyv.d, $$7);
         fev $$9 = $$2.getBuffer(k);
         this.o.a($$1, $$9, $$3, gyv.a(0.0F, $$0.c));
      } else {
         fev $$10 = $$2.getBuffer(j);
         this.o.a($$1, $$10, $$3, gyv.a(0.0F, $$0.c));
      }

      fev $$11 = $$2.getBuffer(l);
      this.o.a($$1, $$11, $$3, gyv.d);
      if ($$0.b > 0.0F) {
         float $$12 = $$0.b / 200.0F;
         $$1.a();
         $$1.a(0.0F, -1.0F, -2.0F);
         a($$1, $$12, $$2.getBuffer(gjq.q()));
         a($$1, $$12, $$2.getBuffer(gjq.r()));
         $$1.b();
      }

      $$1.b();
      if ($$0.d != null) {
         a((float)$$0.d.d, (float)$$0.d.e, (float)$$0.d.f, $$0.p, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fer $$0, float $$1, fev $$2) {
      $$0.a();
      float $$3 = Math.min($$1 > 0.8F ? ($$1 - 0.8F) / 0.2F : 0.0F, 1.0F);
      int $$4 = axx.a(1.0F - $$3, 1.0F, 1.0F, 1.0F);
      int $$5 = 16711935;
      azu $$6 = azu.a(432L);
      Vector3f $$7 = new Vector3f();
      Vector3f $$8 = new Vector3f();
      Vector3f $$9 = new Vector3f();
      Vector3f $$10 = new Vector3f();
      Quaternionf $$11 = new Quaternionf();
      int $$12 = azm.d(($$1 + $$1 * $$1) / 2.0F * 60.0F);

      for (int $$13 = 0; $$13 < $$12; $$13++) {
         $$11.rotationXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2))
            .rotateXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2) + $$1 * (float) (Math.PI / 2));
         $$0.a($$11);
         float $$14 = $$6.i() * 20.0F + 5.0F + $$3 * 10.0F;
         float $$15 = $$6.i() * 2.0F + 1.0F + $$3 * 2.0F;
         $$8.set(-n * $$15, $$14, -0.5F * $$15);
         $$9.set(n * $$15, $$14, -0.5F * $$15);
         $$10.set(0.0F, $$14, $$15);
         fer.a $$16 = $$0.c();
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

   public static void a(float $$0, float $$1, float $$2, float $$3, fer $$4, gjg $$5, int $$6) {
      float $$7 = azm.c($$0 * $$0 + $$2 * $$2);
      float $$8 = azm.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      $$4.a();
      $$4.a(0.0F, 2.0F, 0.0F);
      $$4.a(a.d.rotation((float)(-Math.atan2((double)$$2, (double)$$0)) - (float) (Math.PI / 2)));
      $$4.a(a.b.rotation((float)(-Math.atan2((double)$$7, (double)$$1)) - (float) (Math.PI / 2)));
      fev $$9 = $$5.getBuffer(m);
      float $$10 = 0.0F - $$3 * 0.01F;
      float $$11 = $$8 / 32.0F - $$3 * 0.01F;
      int $$12 = 8;
      float $$13 = 0.0F;
      float $$14 = 0.75F;
      float $$15 = 0.0F;
      fer.a $$16 = $$4.c();

      for (int $$17 = 1; $$17 <= 8; $$17++) {
         float $$18 = azm.a((float)$$17 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$19 = azm.b((float)$$17 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$20 = (float)$$17 / 8.0F;
         $$9.a($$16, $$13 * 0.2F, $$14 * 0.2F, 0.0F).a(-16777216).a($$15, $$10).b(gyv.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$13, $$14, $$8).a(-1).a($$15, $$11).b(gyv.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$18, $$19, $$8).a(-1).a($$20, $$11).b(gyv.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$18 * 0.2F, $$19 * 0.2F, 0.0F).a(-16777216).a($$20, $$10).b(gyv.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$13 = $$18;
         $$14 = $$19;
         $$15 = $$20;
      }

      $$4.b();
   }

   public gvm a() {
      return new gvm();
   }

   public void a(cjv $$0, gvm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.d, $$0.bX);
      $$1.b = $$0.bZ > 0 ? (float)$$0.bZ + $$2 : 0.0F;
      $$1.c = $$0.aM > 0;
      cju $$3 = $$0.cb;
      if ($$3 != null) {
         ezy $$4 = $$3.o($$2).b(0.0, (double)gpe.a((float)$$3.a + $$2), 0.0);
         $$1.d = $$4.d($$0.o($$2));
      } else {
         $$1.d = null;
      }

      ckf $$5 = $$0.gj().a();
      $$1.e = $$5 == ckl.d || $$5 == ckl.e;
      $$1.f = $$5.a();
      jh $$6 = $$0.dV().a(ebq.a.f, eev.a($$0.n()));
      $$1.g = $$6.b($$0.dt());
      $$1.h = $$0.eE() ? 0.0F : $$2;
      $$1.i.a($$0.b);
   }

   protected boolean a(cjv $$0) {
      return false;
   }
}
