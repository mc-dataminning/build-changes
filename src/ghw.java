import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class ghw {
   private static final int b = 96;
   private static final List<ghw.e> c = Lists.newArrayList(new ghw.e[]{new ghw.a(), new ghw.b()});
   public static final float a = 5000.0F;
   private static int d = -1;
   private static int e = -1;
   private static long f = -1L;
   private static boolean g = true;

   public static Vector4f a(fir $$0, float $$1, gci $$2, int $$3, float $$4) {
      erm $$5 = $$0.k();
      bue $$6 = $$0.g();
      float $$19;
      float $$20;
      float $$21;
      if ($$5 == erm.b) {
         long $$7 = ae.c();
         int $$8 = $$2.t(jh.a((ka)$$0.b())).a().j();
         if (f < 0L) {
            d = $$8;
            e = $$8;
            f = $$7;
         }

         int $$9 = d >> 16 & 0xFF;
         int $$10 = d >> 8 & 0xFF;
         int $$11 = d & 0xFF;
         int $$12 = e >> 16 & 0xFF;
         int $$13 = e >> 8 & 0xFF;
         int $$14 = e & 0xFF;
         float $$15 = azk.a((float)($$7 - f) / 5000.0F, 0.0F, 1.0F);
         float $$16 = azk.h($$15, (float)$$12, (float)$$9);
         float $$17 = azk.h($$15, (float)$$13, (float)$$10);
         float $$18 = azk.h($$15, (float)$$14, (float)$$11);
         $$19 = $$16 / 255.0F;
         $$20 = $$17 / 255.0F;
         $$21 = $$18 / 255.0F;
         if (d != $$8) {
            d = $$8;
            e = azk.d($$16) << 16 | azk.d($$17) << 8 | azk.d($$18);
            f = $$7;
         }
      } else if ($$5 == erm.a) {
         $$19 = 0.6F;
         $$20 = 0.1F;
         $$21 = 0.0F;
         f = -1L;
      } else if ($$5 == erm.c) {
         $$19 = 0.623F;
         $$20 = 0.734F;
         $$21 = 0.785F;
         f = -1L;
      } else {
         float $$28 = 0.25F + 0.75F * (float)$$3 / 32.0F;
         $$28 = 1.0F - (float)Math.pow((double)$$28, 0.25);
         int $$29 = $$2.a($$0.b(), $$1);
         float $$30 = axv.h(axv.b($$29));
         float $$31 = axv.h(axv.c($$29));
         float $$32 = axv.h(axv.d($$29));
         float $$33 = azk.a(azk.b($$2.f($$1) * (float) (Math.PI * 2)) * 2.0F + 0.5F, 0.0F, 1.0F);
         dge $$34 = $$2.F_();
         ezn $$35 = $$0.b().a(2.0, 2.0, 2.0).c(0.25);
         ezn $$36 = ayl.a($$35, ($$3x, $$4x, $$5x) -> $$2.c().a(ezn.a($$34.a($$3x, $$4x, $$5x).a().e()), $$33));
         $$19 = (float)$$36.a();
         $$20 = (float)$$36.b();
         $$21 = (float)$$36.c();
         if ($$3 >= 4) {
            float $$40 = azk.a($$2.a($$1)) > 0.0F ? -1.0F : 1.0F;
            Vector3f $$41 = new Vector3f($$40, 0.0F, 0.0F);
            float $$42 = $$0.l().dot($$41);
            if ($$42 < 0.0F) {
               $$42 = 0.0F;
            }

            if ($$42 > 0.0F && $$2.c().a($$2.f($$1))) {
               int $$43 = $$2.c().b($$2.f($$1));
               $$42 *= axv.h(axv.a($$43));
               $$19 = $$19 * (1.0F - $$42) + axv.h(axv.b($$43)) * $$42;
               $$20 = $$20 * (1.0F - $$42) + axv.h(axv.c($$43)) * $$42;
               $$21 = $$21 * (1.0F - $$42) + axv.h(axv.d($$43)) * $$42;
            }
         }

         $$19 += ($$30 - $$19) * $$28;
         $$20 += ($$31 - $$20) * $$28;
         $$21 += ($$32 - $$21) * $$28;
         float $$44 = $$2.d($$1);
         if ($$44 > 0.0F) {
            float $$45 = 1.0F - $$44 * 0.5F;
            float $$46 = 1.0F - $$44 * 0.4F;
            $$19 *= $$45;
            $$20 *= $$45;
            $$21 *= $$46;
         }

         float $$47 = $$2.b($$1);
         if ($$47 > 0.0F) {
            float $$48 = 1.0F - $$47 * 0.5F;
            $$19 *= $$48;
            $$20 *= $$48;
            $$21 *= $$48;
         }

         f = -1L;
      }

      float $$49 = ((float)$$0.b().e - (float)$$2.I_()) * $$2.j().e();
      ghw.e $$50 = a($$6, $$1);
      if ($$50 != null) {
         bva $$51 = (bva)$$6;
         $$49 = $$50.a($$51, $$51.c($$50.a()), $$49, $$1);
      }

      if ($$49 < 1.0F && $$5 != erm.a && $$5 != erm.c) {
         if ($$49 < 0.0F) {
            $$49 = 0.0F;
         }

         $$49 *= $$49;
         $$19 *= $$49;
         $$20 *= $$49;
         $$21 *= $$49;
      }

      if ($$4 > 0.0F) {
         $$19 = $$19 * (1.0F - $$4) + $$19 * 0.7F * $$4;
         $$20 = $$20 * (1.0F - $$4) + $$20 * 0.6F * $$4;
         $$21 = $$21 * (1.0F - $$4) + $$21 * 0.6F * $$4;
      }

      float $$52;
      if ($$5 == erm.b) {
         if ($$6 instanceof ghd) {
            $$52 = ((ghd)$$6).E();
         } else {
            $$52 = 1.0F;
         }
      } else {
         label86: {
            if ($$6 instanceof bva $$54 && $$54.b(btl.p) && !$$54.b(btl.G)) {
               $$52 = ghx.a($$54, $$1);
               break label86;
            }

            $$52 = 0.0F;
         }
      }

      if ($$19 != 0.0F && $$20 != 0.0F && $$21 != 0.0F) {
         float $$57 = Math.min(1.0F / $$19, Math.min(1.0F / $$20, 1.0F / $$21));
         $$19 = $$19 * (1.0F - $$52) + $$19 * $$57 * $$52;
         $$20 = $$20 * (1.0F - $$52) + $$20 * $$57 * $$52;
         $$21 = $$21 * (1.0F - $$52) + $$21 * $$57 * $$52;
      }

      return new Vector4f($$19, $$20, $$21, 1.0F);
   }

   public static boolean a() {
      return g = !g;
   }

   @Nullable
   private static ghw.e a(bue $$0, float $$1) {
      return $$0 instanceof bva $$2 ? c.stream().filter($$2x -> $$2x.a($$2, $$1)).findFirst().orElse(null) : null;
   }

   public static ghv a(fir $$0, ghw.d $$1, Vector4f $$2, float $$3, boolean $$4, float $$5) {
      if (!g) {
         return ghv.a;
      } else {
         erm $$6 = $$0.k();
         bue $$7 = $$0.g();
         ghw.c $$8 = new ghw.c($$1);
         ghw.e $$9 = a($$7, $$5);
         if ($$6 == erm.a) {
            if ($$7.R_()) {
               $$8.b = -8.0F;
               $$8.c = $$3 * 0.5F;
            } else if ($$7 instanceof bva && ((bva)$$7).b(btl.l)) {
               $$8.b = 0.0F;
               $$8.c = 5.0F;
            } else {
               $$8.b = 0.25F;
               $$8.c = 1.0F;
            }
         } else if ($$6 == erm.c) {
            if ($$7.R_()) {
               $$8.b = -8.0F;
               $$8.c = $$3 * 0.5F;
            } else {
               $$8.b = 0.0F;
               $$8.c = 2.0F;
            }
         } else if ($$9 != null) {
            bva $$10 = (bva)$$7;
            btj $$11 = $$10.c($$9.a());
            if ($$11 != null) {
               $$9.a($$8, $$10, $$11, $$3, $$5);
            }
         } else if ($$6 == erm.b) {
            $$8.b = -8.0F;
            $$8.c = 96.0F;
            if ($$7 instanceof ghd $$12) {
               $$8.c = $$8.c * Math.max(0.25F, $$12.E());
               jq<dgc> $$13 = $$12.dX().t($$12.dx());
               if ($$13.a(awz.aa)) {
                  $$8.c *= 0.85F;
               }
            }

            if ($$8.c > $$3) {
               $$8.c = $$3;
               $$8.d = fdr.b;
            }
         } else if ($$4) {
            $$8.b = $$3 * 0.05F;
            $$8.c = Math.min($$3, 192.0F) * 0.5F;
         } else if ($$1 == ghw.d.a) {
            $$8.b = 0.0F;
            $$8.c = $$3;
            $$8.d = fdr.b;
         } else if ($$1 == ghw.d.b) {
            float $$14 = azk.a($$3 / 10.0F, 4.0F, 64.0F);
            $$8.b = $$3 - $$14;
            $$8.c = $$3;
            $$8.d = fdr.b;
         }

         return new ghv($$8.b, $$8.c, $$8.d, $$2.x, $$2.y, $$2.z, $$2.w);
      }
   }

   static class a implements ghw.e {
      @Override
      public jq<bth> a() {
         return btl.o;
      }

      @Override
      public void a(ghw.c $$0, bva $$1, btj $$2, float $$3, float $$4) {
         float $$5 = $$2.b() ? 5.0F : azk.h(Math.min(1.0F, (float)$$2.d() / 20.0F), $$3, 5.0F);
         if ($$0.a == ghw.d.a) {
            $$0.b = 0.0F;
            $$0.c = $$5 * 0.8F;
         } else if ($$0.a == ghw.d.b) {
            $$0.b = $$5 * 0.25F;
            $$0.c = $$5;
         }
      }
   }

   static class b implements ghw.e {
      @Override
      public jq<bth> a() {
         return btl.G;
      }

      @Override
      public void a(ghw.c $$0, bva $$1, btj $$2, float $$3, float $$4) {
         float $$5 = azk.h($$2.a($$1, $$4), $$3, 15.0F);

         $$0.b = switch ($$0.a) {
            case a -> 0.0F;
            case b -> $$5 * 0.75F;
         };
         $$0.c = $$5;
      }

      @Override
      public float a(bva $$0, btj $$1, float $$2, float $$3) {
         return 1.0F - $$1.a($$0, $$3);
      }
   }

   static class c {
      public final ghw.d a;
      public float b;
      public float c;
      public fdr d = fdr.a;

      public c(ghw.d $$0) {
         this.a = $$0;
      }
   }

   public static enum d {
      a,
      b;
   }

   interface e {
      jq<bth> a();

      void a(ghw.c var1, bva var2, btj var3, float var4, float var5);

      default boolean a(bva $$0, float $$1) {
         return $$0.b(this.a());
      }

      default float a(bva $$0, btj $$1, float $$2, float $$3) {
         btj $$4 = $$0.c(this.a());
         if ($$4 != null) {
            if ($$4.a(19)) {
               $$2 = 1.0F - (float)$$4.d() / 20.0F;
            } else {
               $$2 = 0.0F;
            }
         }

         return $$2;
      }
   }
}
