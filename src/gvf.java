import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gvf extends gvj<clq, hbn> {
   public static final ale a = ale.b("textures/entity/end_crystal/end_crystal_beam.png");
   private static final ale g = ale.b("textures/entity/enderdragon/dragon_exploding.png");
   private static final ale h = ale.b("textures/entity/enderdragon/dragon.png");
   private static final ale i = ale.b("textures/entity/enderdragon/dragon_eyes.png");
   private static final gpn j = gpn.g(h);
   private static final gpn k = gpn.m(h);
   private static final gpn l = gpn.q(i);
   private static final gpn m = gpn.l(a);
   private static final float n = (float)(Math.sqrt(3.0) / 2.0);
   private final gia o;

   public gvf(gvk.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.o = new gia($$0.a(gif.aP));
   }

   public void a(hbn $$0, fiq $$1, gpd $$2, int $$3) {
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
         int $$7 = axu.c(azk.d($$6 * 255.0F), -1);
         fiu $$8 = $$2.getBuffer(gpn.p(g));
         this.o.a($$1, $$8, $$3, hhp.d, $$7);
         fiu $$9 = $$2.getBuffer(k);
         this.o.a($$1, $$9, $$3, hhp.a(0.0F, $$0.c));
      } else {
         fiu $$10 = $$2.getBuffer(j);
         this.o.a($$1, $$10, $$3, hhp.a(0.0F, $$0.c));
      }

      fiu $$11 = $$2.getBuffer(l);
      this.o.a($$1, $$11, $$3, hhp.d);
      if ($$0.b > 0.0F) {
         float $$12 = $$0.b / 200.0F;
         $$1.a();
         $$1.a(0.0F, -1.0F, -2.0F);
         a($$1, $$12, $$2.getBuffer(gpn.q()));
         a($$1, $$12, $$2.getBuffer(gpn.r()));
         $$1.b();
      }

      $$1.b();
      if ($$0.d != null) {
         a((float)$$0.d.d, (float)$$0.d.e, (float)$$0.d.f, $$0.u, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fiq $$0, float $$1, fiu $$2) {
      $$0.a();
      float $$3 = Math.min($$1 > 0.8F ? ($$1 - 0.8F) / 0.2F : 0.0F, 1.0F);
      int $$4 = axu.a(1.0F - $$3, 1.0F, 1.0F, 1.0F);
      int $$5 = 16711935;
      azt $$6 = azt.a(432L);
      Vector3f $$7 = new Vector3f();
      Vector3f $$8 = new Vector3f();
      Vector3f $$9 = new Vector3f();
      Vector3f $$10 = new Vector3f();
      Quaternionf $$11 = new Quaternionf();
      int $$12 = azk.d(($$1 + $$1 * $$1) / 2.0F * 60.0F);

      for (int $$13 = 0; $$13 < $$12; $$13++) {
         $$11.rotationXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2))
            .rotateXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2) + $$1 * (float) (Math.PI / 2));
         $$0.a($$11);
         float $$14 = $$6.i() * 20.0F + 5.0F + $$3 * 10.0F;
         float $$15 = $$6.i() * 2.0F + 1.0F + $$3 * 2.0F;
         $$8.set(-n * $$15, $$14, -0.5F * $$15);
         $$9.set(n * $$15, $$14, -0.5F * $$15);
         $$10.set(0.0F, $$14, $$15);
         fiq.a $$16 = $$0.c();
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

   public static void a(float $$0, float $$1, float $$2, float $$3, fiq $$4, gpd $$5, int $$6) {
      float $$7 = azk.c($$0 * $$0 + $$2 * $$2);
      float $$8 = azk.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      $$4.a();
      $$4.a(0.0F, 2.0F, 0.0F);
      $$4.a(a.d.rotation((float)(-Math.atan2((double)$$2, (double)$$0)) - (float) (Math.PI / 2)));
      $$4.a(a.b.rotation((float)(-Math.atan2((double)$$7, (double)$$1)) - (float) (Math.PI / 2)));
      fiu $$9 = $$5.getBuffer(m);
      float $$10 = 0.0F - $$3 * 0.01F;
      float $$11 = $$8 / 32.0F - $$3 * 0.01F;
      int $$12 = 8;
      float $$13 = 0.0F;
      float $$14 = 0.75F;
      float $$15 = 0.0F;
      fiq.a $$16 = $$4.c();

      for (int $$17 = 1; $$17 <= 8; $$17++) {
         float $$18 = azk.a((float)$$17 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$19 = azk.b((float)$$17 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$20 = (float)$$17 / 8.0F;
         $$9.a($$16, $$13 * 0.2F, $$14 * 0.2F, 0.0F).a(-16777216).a($$15, $$10).b(hhp.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$13, $$14, $$8).a(-1).a($$15, $$11).b(hhp.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$18, $$19, $$8).a(-1).a($$20, $$11).b(hhp.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$18 * 0.2F, $$19 * 0.2F, 0.0F).a(-16777216).a($$20, $$10).b(hhp.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$13 = $$18;
         $$14 = $$19;
         $$15 = $$20;
      }

      $$4.b();
   }

   public hbn a() {
      return new hbn();
   }

   public void a(clq $$0, hbn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azk.h($$2, $$0.d, $$0.bE);
      $$1.b = $$0.bG > 0 ? (float)$$0.bG + $$2 : 0.0F;
      $$1.c = $$0.aN > 0;
      clp $$3 = $$0.bI;
      if ($$3 != null) {
         fdw $$4 = $$3.p($$2).b(0.0, (double)gve.a((float)$$3.a + $$2), 0.0);
         $$1.d = $$4.d($$0.p($$2));
      } else {
         $$1.d = null;
      }

      cma $$5 = $$0.t().a();
      $$1.e = $$5 == cmg.d || $$5 == cmg.e;
      $$1.f = $$5.a();
      iu $$6 = $$0.dV().a(efn.a.f, eis.a($$0.j()));
      $$1.g = $$6.b($$0.dt());
      $$1.h = $$0.eG() ? 0.0F : $$2;
      $$1.i.a($$0.b);
   }

   protected boolean a(clq $$0) {
      return false;
   }
}
