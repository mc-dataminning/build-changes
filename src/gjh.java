import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;

public class gjh {
   private static final int a = 10;
   private static final int b = 21;
   private static final ali c = ali.b("textures/environment/rain.png");
   private static final ali d = ali.b("textures/environment/snow.png");
   private static final int e = 32;
   private static final int f = 16;
   private int g;
   private final float[] h = new float[1024];
   private final float[] i = new float[1024];

   public gjh() {
      for (int $$0 = 0; $$0 < 32; $$0++) {
         for (int $$1 = 0; $$1 < 32; $$1++) {
            float $$2 = (float)($$1 - 16);
            float $$3 = (float)($$0 - 16);
            float $$4 = azk.f($$2, $$3);
            this.h[$$0 * 32 + $$1] = -$$3 / $$4;
            this.i[$$0 * 32 + $$1] = $$2 / $$4;
         }
      }
   }

   public void a(dfb $$0, gif $$1, int $$2, float $$3, ezn $$4) {
      float $$5 = $$0.d($$3);
      if (!($$5 <= 0.0F)) {
         int $$6 = fji.N() ? 10 : 5;
         List<gjh.a> $$7 = new ArrayList<>();
         List<gjh.a> $$8 = new ArrayList<>();
         this.a($$0, $$2, $$3, $$4, $$6, $$7, $$8);
         if (!$$7.isEmpty() || !$$8.isEmpty()) {
            this.a($$1, $$4, $$6, $$5, $$7, $$8);
         }
      }
   }

   private void a(dfb $$0, int $$1, float $$2, ezn $$3, int $$4, List<gjh.a> $$5, List<gjh.a> $$6) {
      int $$7 = azk.a($$3.d);
      int $$8 = azk.a($$3.e);
      int $$9 = azk.a($$3.f);
      jh.a $$10 = new jh.a();
      azs $$11 = azs.a();

      for (int $$12 = $$9 - $$4; $$12 <= $$9 + $$4; $$12++) {
         for (int $$13 = $$7 - $$4; $$13 <= $$7 + $$4; $$13++) {
            int $$14 = $$0.a(ebf.a.e, $$13, $$12);
            int $$15 = Math.max($$8 - $$4, $$14);
            int $$16 = Math.max($$8 + $$4, $$14);
            if ($$16 - $$15 != 0) {
               dgc.c $$17 = this.a($$0, $$10.d($$13, $$8, $$12));
               if ($$17 != dgc.c.a) {
                  int $$18 = $$13 * $$13 * 3121 + $$13 * 45238971 ^ $$12 * $$12 * 418711 + $$12 * 13761;
                  $$11.b((long)$$18);
                  int $$19 = Math.max($$8, $$14);
                  int $$20 = gid.a($$0, $$10.d($$13, $$19, $$12));
                  if ($$17 == dgc.c.b) {
                     $$5.add(this.a($$11, $$1, $$13, $$15, $$16, $$12, $$20, $$2));
                  } else if ($$17 == dgc.c.c) {
                     $$6.add(this.b($$11, $$1, $$13, $$15, $$16, $$12, $$20, $$2));
                  }
               }
            }
         }
      }
   }

   private void a(gif $$0, ezn $$1, int $$2, float $$3, List<gjh.a> $$4, List<gjh.a> $$5) {
      $$0.c();
      fed $$6 = fed.b();
      RenderSystem.disableCull();
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(fji.O());
      RenderSystem.setShader(ghr.c);
      if (!$$4.isEmpty()) {
         RenderSystem.setShaderTexture(0, c);
         this.a($$6, $$4, $$1, 1.0F, $$2, $$3);
      }

      if (!$$5.isEmpty()) {
         RenderSystem.setShaderTexture(0, d);
         this.a($$6, $$5, $$1, 0.8F, $$2, $$3);
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      $$0.b();
   }

   private gjh.a a(azs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
      int $$8 = $$1 & 131071;
      int $$9 = $$2 * $$2 * 3121 + $$2 * 45238971 + $$5 * $$5 * 418711 + $$5 * 13761 & 0xFF;
      float $$10 = 3.0F + $$0.i();
      float $$11 = -((float)($$8 + $$9) + $$7) / 32.0F * $$10;
      float $$12 = $$11 % 32.0F;
      return new gjh.a($$2, $$5, $$3, $$4, 0.0F, $$12, $$6);
   }

   private gjh.a b(azs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
      float $$8 = (float)$$1 + $$7;
      float $$9 = (float)($$0.j() + (double)($$8 * 0.01F * (float)$$0.k()));
      float $$10 = (float)($$0.j() + (double)($$8 * (float)$$0.k() * 0.001F));
      float $$11 = -((float)($$1 & 511) + $$7) / 512.0F;
      int $$12 = gif.a((gif.a($$6) * 3 + 15) / 4, (gif.b($$6) * 3 + 15) / 4);
      return new gjh.a($$2, $$5, $$3, $$4, $$9, $$11 + $$10, $$12);
   }

   private void a(fed $$0, List<gjh.a> $$1, ezn $$2, float $$3, int $$4, float $$5) {
      fdw $$6 = $$0.a(feg.c.h, fdz.d);

      for (gjh.a $$7 : $$1) {
         float $$8 = (float)((double)$$7.a + 0.5 - $$2.d);
         float $$9 = (float)((double)$$7.b + 0.5 - $$2.f);
         float $$10 = (float)azk.e((double)$$8, (double)$$9);
         float $$11 = azk.h($$10 / (float)($$4 * $$4), $$3, 0.5F) * $$5;
         int $$12 = axv.a($$11);
         int $$13 = ($$7.b - azk.a($$2.f) + 16) * 32 + $$7.a - azk.a($$2.d) + 16;
         float $$14 = this.h[$$13] / 2.0F;
         float $$15 = this.i[$$13] / 2.0F;
         float $$16 = $$8 - $$14;
         float $$17 = $$8 + $$14;
         float $$18 = (float)((double)$$7.d - $$2.e);
         float $$19 = (float)((double)$$7.c - $$2.e);
         float $$20 = $$9 - $$15;
         float $$21 = $$9 + $$15;
         float $$22 = $$7.e + 0.0F;
         float $$23 = $$7.e + 1.0F;
         float $$24 = (float)$$7.c * 0.25F + $$7.f;
         float $$25 = (float)$$7.d * 0.25F + $$7.f;
         $$6.a($$16, $$18, $$20).a($$22, $$24).a($$12).c($$7.g);
         $$6.a($$17, $$18, $$21).a($$23, $$24).a($$12).c($$7.g);
         $$6.a($$17, $$19, $$21).a($$23, $$25).a($$12).c($$7.g);
         $$6.a($$16, $$19, $$20).a($$22, $$25).a($$12).c($$7.g);
      }

      fdx.a($$6.b());
   }

   public void a(gci $$0, fir $$1, int $$2, arg $$3) {
      float $$4 = $$0.d(1.0F) / (fji.N() ? 1.0F : 2.0F);
      if (!($$4 <= 0.0F)) {
         azs $$5 = azs.a((long)$$2 * 312987231L);
         jh $$6 = jh.a((ka)$$1.b());
         jh $$7 = null;
         int $$8 = (int)(100.0F * $$4 * $$4) / ($$3 == arg.b ? 2 : 1);

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$5.a(21) - 10;
            int $$11 = $$5.a(21) - 10;
            jh $$12 = $$0.a(ebf.a.e, $$6.b($$10, 0, $$11));
            if ($$12.v() > $$0.I_() && $$12.v() <= $$6.v() + 10 && $$12.v() >= $$6.v() - 10 && this.a($$0, $$12) == dgc.c.b) {
               $$7 = $$12.e();
               if ($$3 == arg.c) {
                  break;
               }

               double $$13 = $$5.j();
               double $$14 = $$5.j();
               dvj $$15 = $$0.a_($$7);
               erk $$16 = $$0.b_($$7);
               fah $$17 = $$15.g($$0, $$7);
               double $$18 = $$17.b(jm.a.b, $$13, $$14);
               double $$19 = (double)$$16.a($$0, $$7);
               double $$20 = Math.max($$18, $$19);
               lp $$21 = !$$16.a(axg.b) && !$$15.a(dig.kJ) && !dis.h($$15) ? lr.ad : lr.ae;
               $$0.a($$21, (double)$$7.u() + $$13, (double)$$7.v() + $$20, (double)$$7.w() + $$14, 0.0, 0.0, 0.0);
            }
         }

         if ($$7 != null && $$5.a(3) < this.g++) {
            this.g = 0;
            if ($$7.v() > $$6.v() + 1 && $$0.a(ebf.a.e, $$6).v() > azk.d((float)$$6.v())) {
               $$0.a($$7, awl.Ci, awm.d, 0.1F, 0.5F, false);
            } else {
               $$0.a($$7, awl.Ch, awm.d, 0.2F, 1.0F, false);
            }
         }
      }
   }

   private dgc.c a(dfb $$0, jh $$1) {
      if (!$$0.P().b(kj.a($$1.u()), kj.a($$1.w()))) {
         return dgc.c.a;
      } else {
         dgc $$2 = $$0.t($$1).a();
         return $$2.a($$1, $$0.N());
      }
   }

   static record a(int a, int b, int c, int d, float e, float f, int g) {
   }
}
