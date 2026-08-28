import org.joml.Quaternionf;
import org.joml.Vector3f;

public class grw extends gsa<cjt, gyf> {
   public static final aku a = aku.b("textures/entity/end_crystal/end_crystal_beam.png");
   private static final aku b = aku.b("textures/entity/enderdragon/dragon_exploding.png");
   private static final aku h = aku.b("textures/entity/enderdragon/dragon.png");
   private static final aku i = aku.b("textures/entity/enderdragon/dragon_eyes.png");
   private static final gmf j = gmf.g(h);
   private static final gmf k = gmf.m(h);
   private static final gmf l = gmf.q(i);
   private static final gmf m = gmf.l(a);
   private static final float n = (float)(Math.sqrt(3.0) / 2.0);
   private final geu o;

   public grw(gsb.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.o = new geu($$0.a(gez.aJ));
   }

   public void a(gyf $$0, ffs $$1, glv $$2, int $$3) {
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
         int $$7 = axj.c(ayy.d($$6 * 255.0F), -1);
         ffw $$8 = $$2.getBuffer(gmf.p(b));
         this.o.a($$1, $$8, $$3, hec.d, $$7);
         ffw $$9 = $$2.getBuffer(k);
         this.o.a($$1, $$9, $$3, hec.a(0.0F, $$0.c));
      } else {
         ffw $$10 = $$2.getBuffer(j);
         this.o.a($$1, $$10, $$3, hec.a(0.0F, $$0.c));
      }

      ffw $$11 = $$2.getBuffer(l);
      this.o.a($$1, $$11, $$3, hec.d);
      if ($$0.b > 0.0F) {
         float $$12 = $$0.b / 200.0F;
         $$1.a();
         $$1.a(0.0F, -1.0F, -2.0F);
         a($$1, $$12, $$2.getBuffer(gmf.q()));
         a($$1, $$12, $$2.getBuffer(gmf.r()));
         $$1.b();
      }

      $$1.b();
      if ($$0.d != null) {
         a((float)$$0.d.d, (float)$$0.d.e, (float)$$0.d.f, $$0.u, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(ffs $$0, float $$1, ffw $$2) {
      $$0.a();
      float $$3 = Math.min($$1 > 0.8F ? ($$1 - 0.8F) / 0.2F : 0.0F, 1.0F);
      int $$4 = axj.a(1.0F - $$3, 1.0F, 1.0F, 1.0F);
      int $$5 = 16711935;
      azg $$6 = azg.a(432L);
      Vector3f $$7 = new Vector3f();
      Vector3f $$8 = new Vector3f();
      Vector3f $$9 = new Vector3f();
      Vector3f $$10 = new Vector3f();
      Quaternionf $$11 = new Quaternionf();
      int $$12 = ayy.d(($$1 + $$1 * $$1) / 2.0F * 60.0F);

      for (int $$13 = 0; $$13 < $$12; $$13++) {
         $$11.rotationXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2))
            .rotateXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2) + $$1 * (float) (Math.PI / 2));
         $$0.a($$11);
         float $$14 = $$6.i() * 20.0F + 5.0F + $$3 * 10.0F;
         float $$15 = $$6.i() * 2.0F + 1.0F + $$3 * 2.0F;
         $$8.set(-n * $$15, $$14, -0.5F * $$15);
         $$9.set(n * $$15, $$14, -0.5F * $$15);
         $$10.set(0.0F, $$14, $$15);
         ffs.a $$16 = $$0.c();
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

   public static void a(float $$0, float $$1, float $$2, float $$3, ffs $$4, glv $$5, int $$6) {
      float $$7 = ayy.c($$0 * $$0 + $$2 * $$2);
      float $$8 = ayy.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      $$4.a();
      $$4.a(0.0F, 2.0F, 0.0F);
      $$4.a(a.d.rotation((float)(-Math.atan2((double)$$2, (double)$$0)) - (float) (Math.PI / 2)));
      $$4.a(a.b.rotation((float)(-Math.atan2((double)$$7, (double)$$1)) - (float) (Math.PI / 2)));
      ffw $$9 = $$5.getBuffer(m);
      float $$10 = 0.0F - $$3 * 0.01F;
      float $$11 = $$8 / 32.0F - $$3 * 0.01F;
      int $$12 = 8;
      float $$13 = 0.0F;
      float $$14 = 0.75F;
      float $$15 = 0.0F;
      ffs.a $$16 = $$4.c();

      for (int $$17 = 1; $$17 <= 8; $$17++) {
         float $$18 = ayy.a((float)$$17 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$19 = ayy.b((float)$$17 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$20 = (float)$$17 / 8.0F;
         $$9.a($$16, $$13 * 0.2F, $$14 * 0.2F, 0.0F).a(-16777216).a($$15, $$10).b(hec.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$13, $$14, $$8).a(-1).a($$15, $$11).b(hec.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$18, $$19, $$8).a(-1).a($$20, $$11).b(hec.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$18 * 0.2F, $$19 * 0.2F, 0.0F).a(-16777216).a($$20, $$10).b(hec.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$13 = $$18;
         $$14 = $$19;
         $$15 = $$20;
      }

      $$4.b();
   }

   public gyf a() {
      return new gyf();
   }

   public void a(cjt $$0, gyf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayy.h($$2, $$0.d, $$0.bX);
      $$1.b = $$0.bZ > 0 ? (float)$$0.bZ + $$2 : 0.0F;
      $$1.c = $$0.aN > 0;
      cjs $$3 = $$0.cb;
      if ($$3 != null) {
         fay $$4 = $$3.o($$2).b(0.0, (double)grv.a((float)$$3.a + $$2), 0.0);
         $$1.d = $$4.d($$0.o($$2));
      } else {
         $$1.d = null;
      }

      ckd $$5 = $$0.gl().a();
      $$1.e = $$5 == ckj.d || $$5 == ckj.e;
      $$1.f = $$5.a();
      ji $$6 = $$0.dW().a(ecq.a.f, efv.a($$0.m()));
      $$1.g = $$6.b($$0.du());
      $$1.h = $$0.eF() ? 0.0F : $$2;
      $$1.i.a($$0.b);
   }

   protected boolean a(cjt $$0) {
      return false;
   }
}
