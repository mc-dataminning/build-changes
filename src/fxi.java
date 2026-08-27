import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fxi {
   private static final int b = 96;
   private static final List<fxi.e> c = Lists.newArrayList(new fxi.e[]{new fxi.a(), new fxi.b()});
   public static final float a = 5000.0F;
   private static float d;
   private static float e;
   private static float f;
   private static int g = -1;
   private static int h = -1;
   private static long i = -1L;

   public static void a(eyr $$0, float $$1, fry $$2, int $$3, float $$4) {
      eip $$5 = $$0.k();
      bow $$6 = $$0.g();
      if ($$5 == eip.b) {
         long $$7 = ac.b();
         int $$8 = $$2.t(ib.a($$0.b())).a().j();
         if (i < 0L) {
            g = $$8;
            h = $$8;
            i = $$7;
         }

         int $$9 = g >> 16 & 0xFF;
         int $$10 = g >> 8 & 0xFF;
         int $$11 = g & 0xFF;
         int $$12 = h >> 16 & 0xFF;
         int $$13 = h >> 8 & 0xFF;
         int $$14 = h & 0xFF;
         float $$15 = aww.a((float)($$7 - i) / 5000.0F, 0.0F, 1.0F);
         float $$16 = aww.i($$15, (float)$$12, (float)$$9);
         float $$17 = aww.i($$15, (float)$$13, (float)$$10);
         float $$18 = aww.i($$15, (float)$$14, (float)$$11);
         d = $$16 / 255.0F;
         e = $$17 / 255.0F;
         f = $$18 / 255.0F;
         if (g != $$8) {
            g = $$8;
            h = aww.d($$16) << 16 | aww.d($$17) << 8 | aww.d($$18);
            i = $$7;
         }
      } else if ($$5 == eip.a) {
         d = 0.6F;
         e = 0.1F;
         f = 0.0F;
         i = -1L;
      } else if ($$5 == eip.c) {
         d = 0.623F;
         e = 0.734F;
         f = 0.785F;
         i = -1L;
         RenderSystem.clearColor(d, e, f, 0.0F);
      } else {
         float $$19 = 0.25F + 0.75F * (float)$$3 / 32.0F;
         $$19 = 1.0F - (float)Math.pow((double)$$19, 0.25);
         epr $$20 = $$2.a($$0.b(), $$1);
         float $$21 = (float)$$20.c;
         float $$22 = (float)$$20.d;
         float $$23 = (float)$$20.e;
         float $$24 = aww.a(aww.b($$2.f($$1) * (float) (Math.PI * 2)) * 2.0F + 0.5F, 0.0F, 1.0F);
         cya $$25 = $$2.F_();
         epr $$26 = $$0.b().a(2.0, 2.0, 2.0).a(0.25);
         epr $$27 = avx.a($$26, ($$3x, $$4x, $$5x) -> $$2.d().a(epr.a($$25.a($$3x, $$4x, $$5x).a().e()), $$24));
         d = (float)$$27.a();
         e = (float)$$27.b();
         f = (float)$$27.c();
         if ($$3 >= 4) {
            float $$28 = aww.a($$2.a($$1)) > 0.0F ? -1.0F : 1.0F;
            Vector3f $$29 = new Vector3f($$28, 0.0F, 0.0F);
            float $$30 = $$0.l().dot($$29);
            if ($$30 < 0.0F) {
               $$30 = 0.0F;
            }

            if ($$30 > 0.0F) {
               float[] $$31 = $$2.d().a($$2.f($$1), $$1);
               if ($$31 != null) {
                  $$30 *= $$31[3];
                  d = d * (1.0F - $$30) + $$31[0] * $$30;
                  e = e * (1.0F - $$30) + $$31[1] * $$30;
                  f = f * (1.0F - $$30) + $$31[2] * $$30;
               }
            }
         }

         d = d + ($$21 - d) * $$19;
         e = e + ($$22 - e) * $$19;
         f = f + ($$23 - f) * $$19;
         float $$32 = $$2.d($$1);
         if ($$32 > 0.0F) {
            float $$33 = 1.0F - $$32 * 0.5F;
            float $$34 = 1.0F - $$32 * 0.4F;
            d *= $$33;
            e *= $$33;
            f *= $$34;
         }

         float $$35 = $$2.b($$1);
         if ($$35 > 0.0F) {
            float $$36 = 1.0F - $$35 * 0.5F;
            d *= $$36;
            e *= $$36;
            f *= $$36;
         }

         i = -1L;
      }

      float $$37 = ((float)$$0.b().d - (float)$$2.I_()) * $$2.k().e();
      fxi.e $$38 = a($$6, $$1);
      if ($$38 != null) {
         bpo $$39 = (bpo)$$6;
         $$37 = $$38.a($$39, $$39.c($$38.a()), $$37, $$1);
      }

      if ($$37 < 1.0F && $$5 != eip.a && $$5 != eip.c) {
         if ($$37 < 0.0F) {
            $$37 = 0.0F;
         }

         $$37 *= $$37;
         d *= $$37;
         e *= $$37;
         f *= $$37;
      }

      if ($$4 > 0.0F) {
         d = d * (1.0F - $$4) + d * 0.7F * $$4;
         e = e * (1.0F - $$4) + e * 0.6F * $$4;
         f = f * (1.0F - $$4) + f * 0.6F * $$4;
      }

      float $$40;
      if ($$5 == eip.b) {
         if ($$6 instanceof fws) {
            $$40 = ((fws)$$6).D();
         } else {
            $$40 = 1.0F;
         }
      } else {
         label86: {
            if ($$6 instanceof bpo $$42 && $$42.a(bol.p) && !$$42.a(bol.G)) {
               $$40 = fxj.a($$42, $$1);
               break label86;
            }

            $$40 = 0.0F;
         }
      }

      if (d != 0.0F && e != 0.0F && f != 0.0F) {
         float $$45 = Math.min(1.0F / d, Math.min(1.0F / e, 1.0F / f));
         d = d * (1.0F - $$40) + d * $$45 * $$40;
         e = e * (1.0F - $$40) + e * $$45 * $$40;
         f = f * (1.0F - $$40) + f * $$45 * $$40;
      }

      RenderSystem.clearColor(d, e, f, 0.0F);
   }

   public static void a() {
      RenderSystem.setShaderFogStart(Float.MAX_VALUE);
   }

   @Nullable
   private static fxi.e a(bow $$0, float $$1) {
      return $$0 instanceof bpo $$2 ? c.stream().filter($$2x -> $$2x.a($$2, $$1)).findFirst().orElse(null) : null;
   }

   public static void a(eyr $$0, fxi.d $$1, float $$2, boolean $$3, float $$4) {
      eip $$5 = $$0.k();
      bow $$6 = $$0.g();
      fxi.c $$7 = new fxi.c($$1);
      fxi.e $$8 = a($$6, $$4);
      if ($$5 == eip.a) {
         if ($$6.N_()) {
            $$7.b = -8.0F;
            $$7.c = $$2 * 0.5F;
         } else if ($$6 instanceof bpo && ((bpo)$$6).a(bol.l)) {
            $$7.b = 0.0F;
            $$7.c = 3.0F;
         } else {
            $$7.b = 0.25F;
            $$7.c = 1.0F;
         }
      } else if ($$5 == eip.c) {
         if ($$6.N_()) {
            $$7.b = -8.0F;
            $$7.c = $$2 * 0.5F;
         } else {
            $$7.b = 0.0F;
            $$7.c = 2.0F;
         }
      } else if ($$8 != null) {
         bpo $$9 = (bpo)$$6;
         boj $$10 = $$9.c($$8.a());
         if ($$10 != null) {
            $$8.a($$7, $$9, $$10, $$2, $$4);
         }
      } else if ($$5 == eip.b) {
         $$7.b = -8.0F;
         $$7.c = 96.0F;
         if ($$6 instanceof fws $$11) {
            $$7.c = $$7.c * Math.max(0.25F, $$11.D());
            il<cxy> $$12 = $$11.dM().t($$11.dm());
            if ($$12.a(aum.aa)) {
               $$7.c *= 0.85F;
            }
         }

         if ($$7.c > $$2) {
            $$7.c = $$2;
            $$7.d = etm.b;
         }
      } else if ($$3) {
         $$7.b = $$2 * 0.05F;
         $$7.c = Math.min($$2, 192.0F) * 0.5F;
      } else if ($$1 == fxi.d.a) {
         $$7.b = 0.0F;
         $$7.c = $$2;
         $$7.d = etm.b;
      } else {
         float $$13 = aww.a($$2 / 10.0F, 4.0F, 64.0F);
         $$7.b = $$2 - $$13;
         $$7.c = $$2;
         $$7.d = etm.b;
      }

      RenderSystem.setShaderFogStart($$7.b);
      RenderSystem.setShaderFogEnd($$7.c);
      RenderSystem.setShaderFogShape($$7.d);
   }

   public static void b() {
      RenderSystem.setShaderFogColor(d, e, f);
   }

   static class a implements fxi.e {
      @Override
      public il<boh> a() {
         return bol.o;
      }

      @Override
      public void a(fxi.c $$0, bpo $$1, boj $$2, float $$3, float $$4) {
         float $$5 = $$2.a() ? 5.0F : aww.i(Math.min(1.0F, (float)$$2.c() / 20.0F), $$3, 5.0F);
         if ($$0.a == fxi.d.a) {
            $$0.b = 0.0F;
            $$0.c = $$5 * 0.8F;
         } else {
            $$0.b = $$5 * 0.25F;
            $$0.c = $$5;
         }
      }
   }

   static class b implements fxi.e {
      @Override
      public il<boh> a() {
         return bol.G;
      }

      @Override
      public void a(fxi.c $$0, bpo $$1, boj $$2, float $$3, float $$4) {
         float $$5 = aww.i($$2.a($$1, $$4), $$3, 15.0F);
         $$0.b = $$0.a == fxi.d.a ? 0.0F : $$5 * 0.75F;
         $$0.c = $$5;
      }

      @Override
      public float a(bpo $$0, boj $$1, float $$2, float $$3) {
         return 1.0F - $$1.a($$0, $$3);
      }
   }

   static class c {
      public final fxi.d a;
      public float b;
      public float c;
      public etm d = etm.a;

      public c(fxi.d $$0) {
         this.a = $$0;
      }
   }

   public static enum d {
      a,
      b;
   }

   interface e {
      il<boh> a();

      void a(fxi.c var1, bpo var2, boj var3, float var4, float var5);

      default boolean a(bpo $$0, float $$1) {
         return $$0.a(this.a());
      }

      default float a(bpo $$0, boj $$1, float $$2, float $$3) {
         boj $$4 = $$0.c(this.a());
         if ($$4 != null) {
            if ($$4.a(19)) {
               $$2 = 1.0F - (float)$$4.c() / 20.0F;
            } else {
               $$2 = 0.0F;
            }
         }

         return $$2;
      }
   }
}
