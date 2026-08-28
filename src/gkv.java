import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class gkv {
   private static final int b = 96;
   private static final List<gkv.e> c = Lists.newArrayList(new gkv.e[]{new gkv.a(), new gkv.b()});
   public static final float a = 5000.0F;
   private static int d = -1;
   private static int e = -1;
   private static long f = -1L;
   private static boolean g = true;

   public static Vector4f a(fli $$0, float $$1, gff $$2, int $$3, float $$4) {
      ets $$5 = $$0.k();
      bvb $$6 = $$0.g();
      float $$19;
      float $$20;
      float $$21;
      if ($$5 == ets.b) {
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
         float $$15 = azu.a((float)($$7 - f) / 5000.0F, 0.0F, 1.0F);
         float $$16 = azu.h($$15, (float)$$12, (float)$$9);
         float $$17 = azu.h($$15, (float)$$13, (float)$$10);
         float $$18 = azu.h($$15, (float)$$14, (float)$$11);
         $$19 = $$16 / 255.0F;
         $$20 = $$17 / 255.0F;
         $$21 = $$18 / 255.0F;
         if (d != $$8) {
            d = $$8;
            e = azu.d($$16) << 16 | azu.d($$17) << 8 | azu.d($$18);
            f = $$7;
         }
      } else if ($$5 == ets.a) {
         $$19 = 0.6F;
         $$20 = 0.1F;
         $$21 = 0.0F;
         f = -1L;
      } else if ($$5 == ets.c) {
         $$19 = 0.623F;
         $$20 = 0.734F;
         $$21 = 0.785F;
         f = -1L;
      } else {
         float $$28 = 0.25F + 0.75F * (float)$$3 / 32.0F;
         $$28 = 1.0F - (float)Math.pow((double)$$28, 0.25);
         int $$29 = $$2.a($$0.b(), $$1);
         float $$30 = ayf.j($$29);
         float $$31 = ayf.k($$29);
         float $$32 = ayf.l($$29);
         float $$33 = azu.a(azu.b($$2.f($$1) * (float) (Math.PI * 2)) * 2.0F + 0.5F, 0.0F, 1.0F);
         did $$34 = $$2.I_();
         fbr $$35 = $$0.b().a(2.0, 2.0, 2.0).c(0.25);
         fbr $$36 = ayv.a($$35, ($$3x, $$4x, $$5x) -> $$2.c().a(fbr.a($$34.a($$3x, $$4x, $$5x).a().e()), $$33));
         $$19 = (float)$$36.a();
         $$20 = (float)$$36.b();
         $$21 = (float)$$36.c();
         if ($$3 >= 4) {
            float $$40 = azu.a($$2.a($$1)) > 0.0F ? -1.0F : 1.0F;
            Vector3f $$41 = new Vector3f($$40, 0.0F, 0.0F);
            float $$42 = $$0.l().dot($$41);
            if ($$42 < 0.0F) {
               $$42 = 0.0F;
            }

            if ($$42 > 0.0F && $$2.c().a($$2.f($$1))) {
               int $$43 = $$2.c().b($$2.f($$1));
               $$42 *= ayf.i($$43);
               $$19 = $$19 * (1.0F - $$42) + ayf.j($$43) * $$42;
               $$20 = $$20 * (1.0F - $$42) + ayf.k($$43) * $$42;
               $$21 = $$21 * (1.0F - $$42) + ayf.l($$43) * $$42;
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

      float $$49 = ((float)$$0.b().e - (float)$$2.L_()) * $$2.k().e();
      gkv.e $$50 = a($$6, $$1);
      if ($$50 != null) {
         bvx $$51 = (bvx)$$6;
         $$49 = $$50.a($$51, $$51.c($$50.a()), $$49, $$1);
      }

      if ($$49 < 1.0F && $$5 != ets.a && $$5 != ets.c) {
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
      if ($$5 == ets.b) {
         if ($$6 instanceof gkc) {
            $$52 = ((gkc)$$6).F();
         } else {
            $$52 = 1.0F;
         }
      } else {
         label86: {
            if ($$6 instanceof bvx $$54 && $$54.b(bui.p) && !$$54.b(bui.G)) {
               $$52 = gkw.a($$54, $$1);
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
   private static gkv.e a(bvb $$0, float $$1) {
      return $$0 instanceof bvx $$2 ? c.stream().filter($$2x -> $$2x.a($$2, $$1)).findFirst().orElse(null) : null;
   }

   public static gku a(fli $$0, gkv.d $$1, Vector4f $$2, float $$3, boolean $$4, float $$5) {
      if (!g) {
         return gku.a;
      } else {
         ets $$6 = $$0.k();
         bvb $$7 = $$0.g();
         gkv.c $$8 = new gkv.c($$1);
         gkv.e $$9 = a($$7, $$5);
         if ($$6 == ets.a) {
            if ($$7.aa_()) {
               $$8.b = -8.0F;
               $$8.c = $$3 * 0.5F;
            } else if ($$7 instanceof bvx && ((bvx)$$7).b(bui.l)) {
               $$8.b = 0.0F;
               $$8.c = 5.0F;
            } else {
               $$8.b = 0.25F;
               $$8.c = 1.0F;
            }
         } else if ($$6 == ets.c) {
            if ($$7.aa_()) {
               $$8.b = -8.0F;
               $$8.c = $$3 * 0.5F;
            } else {
               $$8.b = 0.0F;
               $$8.c = 2.0F;
            }
         } else if ($$9 != null) {
            bvx $$10 = (bvx)$$7;
            bug $$11 = $$10.c($$9.a());
            if ($$11 != null) {
               $$9.a($$8, $$10, $$11, $$3, $$5);
            }
         } else if ($$6 == ets.b) {
            $$8.b = -8.0F;
            $$8.c = 96.0F;
            if ($$7 instanceof gkc $$12) {
               $$8.c = $$8.c * Math.max(0.25F, $$12.F());
               jq<dib> $$13 = $$12.dW().t($$12.dw());
               if ($$13.a(axj.aa)) {
                  $$8.c *= 0.85F;
               }
            }

            if ($$8.c > $$3) {
               $$8.c = $$3;
               $$8.d = fgb.b;
            }
         } else if ($$4) {
            $$8.b = $$3 * 0.05F;
            $$8.c = Math.min($$3, 192.0F) * 0.5F;
         } else if ($$1 == gkv.d.a) {
            $$8.b = 0.0F;
            $$8.c = $$3;
            $$8.d = fgb.b;
         } else if ($$1 == gkv.d.b) {
            float $$14 = azu.a($$3 / 10.0F, 4.0F, 64.0F);
            $$8.b = $$3 - $$14;
            $$8.c = $$3;
            $$8.d = fgb.b;
         }

         return new gku($$8.b, $$8.c, $$8.d, $$2.x, $$2.y, $$2.z, $$2.w);
      }
   }

   static class a implements gkv.e {
      @Override
      public jq<bue> a() {
         return bui.o;
      }

      @Override
      public void a(gkv.c $$0, bvx $$1, bug $$2, float $$3, float $$4) {
         float $$5 = $$2.b() ? 5.0F : azu.h(Math.min(1.0F, (float)$$2.d() / 20.0F), $$3, 5.0F);
         if ($$0.a == gkv.d.a) {
            $$0.b = 0.0F;
            $$0.c = $$5 * 0.8F;
         } else if ($$0.a == gkv.d.b) {
            $$0.b = $$5 * 0.25F;
            $$0.c = $$5;
         }
      }
   }

   static class b implements gkv.e {
      @Override
      public jq<bue> a() {
         return bui.G;
      }

      @Override
      public void a(gkv.c $$0, bvx $$1, bug $$2, float $$3, float $$4) {
         float $$5 = azu.h($$2.a($$1, $$4), $$3, 15.0F);

         $$0.b = switch ($$0.a) {
            case a -> 0.0F;
            case b -> $$5 * 0.75F;
         };
         $$0.c = $$5;
      }

      @Override
      public float a(bvx $$0, bug $$1, float $$2, float $$3) {
         return 1.0F - $$1.a($$0, $$3);
      }
   }

   static class c {
      public final gkv.d a;
      public float b;
      public float c;
      public fgb d = fgb.a;

      public c(gkv.d $$0) {
         this.a = $$0;
      }
   }

   public static enum d {
      a,
      b;
   }

   interface e {
      jq<bue> a();

      void a(gkv.c var1, bvx var2, bug var3, float var4, float var5);

      default boolean a(bvx $$0, float $$1) {
         return $$0.b(this.a());
      }

      default float a(bvx $$0, bug $$1, float $$2, float $$3) {
         bug $$4 = $$0.c(this.a());
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
