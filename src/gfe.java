import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3d;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class gfe implements aue, AutoCloseable {
   private static final Logger e = LogUtils.getLogger();
   public static final int a = 16;
   public static final int b = 8;
   private static final float f = 512.0F;
   private static final int g = 32;
   private static final int h = 10;
   private static final int i = 21;
   private static final int j = 15;
   private static final akt k = new akt("textures/environment/moon_phases.png");
   private static final akt l = new akt("textures/environment/sun.png");
   private static final akt m = new akt("textures/environment/poisonus_sun.png");
   protected static final akt c = new akt("textures/environment/clouds.png");
   private static final akt n = new akt("textures/environment/end_sky.png");
   private static final akt o = new akt("textures/misc/forcefield.png");
   private static final akt p = new akt("textures/environment/rain.png");
   private static final akt q = new akt("textures/environment/rain_potato.png");
   private static final akt r = new akt("textures/environment/snow.png");
   public static final iw[] d = iw.values();
   private final fgj s;
   private final gko t;
   private final ghf u;
   private final gfm v;
   @Nullable
   private fzn w;
   private final gft x = new gft();
   private final ObjectArrayList<gig.b> y = new ObjectArrayList(10000);
   private final Set<dqc> z = Sets.newHashSet();
   @Nullable
   private gfx A;
   @Nullable
   private fbf B;
   @Nullable
   private fbf C;
   @Nullable
   private fbf D;
   private boolean E = true;
   @Nullable
   private fbf F;
   private final gfp G = new gfp(100);
   private int H;
   private final Int2ObjectMap<apz> I = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<apz>> J = new Long2ObjectOpenHashMap();
   private final Map<ir, gum> K = Maps.newHashMap();
   @Nullable
   private ezo L;
   @Nullable
   private gfj M;
   @Nullable
   private ezo N;
   @Nullable
   private ezo O;
   @Nullable
   private ezo P;
   @Nullable
   private ezo Q;
   @Nullable
   private ezo R;
   @Nullable
   private gfj S;
   private int T = Integer.MIN_VALUE;
   private int U = Integer.MIN_VALUE;
   private int V = Integer.MIN_VALUE;
   private double W = Double.MIN_VALUE;
   private double X = Double.MIN_VALUE;
   private double Y = Double.MIN_VALUE;
   private double Z = Double.MIN_VALUE;
   private double aa = Double.MIN_VALUE;
   private int ab = Integer.MIN_VALUE;
   private int ac = Integer.MIN_VALUE;
   private int ad = Integer.MIN_VALUE;
   private ewu ae = ewu.b;
   @Nullable
   private ffx af;
   @Nullable
   private gig ag;
   private int ah = -1;
   private int ai;
   private int aj;
   private gik ak;
   private boolean al;
   @Nullable
   private gik am;
   private final Vector4f[] an = new Vector4f[8];
   private final Vector3d ao = new Vector3d(0.0, 0.0, 0.0);
   private double ap;
   private double aq;
   private double ar;
   private int as;
   private final float[] at = new float[1024];
   private final float[] au = new float[1024];

   public gfe(fgj $$0, gko $$1, ghf $$2, gfm $$3) {
      this.s = $$0;
      this.t = $$1;
      this.u = $$2;
      this.v = $$3;

      for (int $$4 = 0; $$4 < 32; $$4++) {
         for (int $$5 = 0; $$5 < 32; $$5++) {
            float $$6 = (float)($$5 - 16);
            float $$7 = (float)($$4 - 16);
            float $$8 = aym.c($$6 * $$6 + $$7 * $$7);
            this.at[$$4 << 5 | $$5] = -$$7 / $$8;
            this.au[$$4 << 5 | $$5] = $$6 / $$8;
         }
      }

      this.C();
      this.B();
      this.A();
   }

   private void a(gff $$0, float $$1, double $$2, double $$3, double $$4) {
      float $$5 = this.s.r.d($$1);
      if (!($$5 <= 0.0F)) {
         $$0.c();
         dca $$6 = this.s.r;
         boolean $$7 = $$6.z_();
         int $$8 = aym.a($$2);
         int $$9 = aym.a($$3);
         int $$10 = aym.a($$4);
         fbe $$11 = fbe.b();
         fax $$12 = $$11.d();
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         int $$13 = 5;
         if (fgj.N()) {
            $$13 = 10;
         }

         RenderSystem.depthMask(fgj.O());
         int $$14 = -1;
         float $$15 = (float)this.H + $$1;
         RenderSystem.setShader(gez::u);
         ir.a $$16 = new ir.a();

         for (int $$17 = $$10 - $$13; $$17 <= $$10 + $$13; $$17++) {
            for (int $$18 = $$8 - $$13; $$18 <= $$8 + $$13; $$18++) {
               int $$19 = ($$17 - $$10 + 16) * 32 + $$18 - $$8 + 16;
               double $$20 = (double)this.at[$$19] * 0.5;
               double $$21 = (double)this.au[$$19] * 0.5;
               $$16.b((double)$$18, $$3, (double)$$17);
               dcz $$22 = $$6.t($$16).a();
               if ($$22.c()) {
                  int $$23 = $$6.a(dyu.a.e, $$18, $$17);
                  int $$24 = $$9 - $$13;
                  int $$25 = $$9 + $$13;
                  if ($$24 < $$23) {
                     $$24 = $$23;
                  }

                  if ($$25 < $$23) {
                     $$25 = $$23;
                  }

                  if ($$7) {
                     int $$26 = 112;
                     if ($$24 > 112) {
                        $$24 = 112;
                     }

                     if ($$25 > 112) {
                        $$25 = 112;
                     }
                  }

                  int $$27 = $$23;
                  if ($$23 < $$9) {
                     $$27 = $$9;
                  }

                  if ($$24 != $$25) {
                     ayt $$28 = ayt.a((long)($$18 * $$18 * 3121 + $$18 * 45238971 ^ $$17 * $$17 * 418711 + $$17 * 13761));
                     $$16.d($$18, $$24, $$17);
                     dcz.c $$29 = $$22.a($$16);
                     if ($$29 == dcz.c.b) {
                        if ($$14 != 0) {
                           if ($$14 >= 0) {
                              $$11.c();
                           }

                           $$14 = 0;
                           if ($$7) {
                              RenderSystem.setShaderTexture(0, q);
                           } else {
                              RenderSystem.setShaderTexture(0, p);
                           }

                           $$12.a(fbh.b.h, fba.l);
                        }

                        int $$30 = this.H & 131071;
                        int $$31 = $$18 * $$18 * 3121 + $$18 * 45238971 + $$17 * $$17 * 418711 + $$17 * 13761 & 0xFF;
                        float $$32 = 3.0F + $$28.i();
                        float $$33 = -((float)($$30 + $$31) + $$1) / 32.0F * $$32;
                        float $$34 = $$33 % 32.0F;
                        double $$35 = (double)$$18 + 0.5 - $$2;
                        double $$36 = (double)$$17 + 0.5 - $$4;
                        float $$37 = (float)Math.sqrt($$35 * $$35 + $$36 * $$36) / (float)$$13;
                        float $$38 = ((1.0F - $$37 * $$37) * 0.5F + 0.5F) * $$5;
                        $$16.d($$18, $$27, $$17);
                        int $$39 = a($$6, $$16);
                        float $$41;
                        float $$42;
                        float $$43;
                        if ($$7) {
                           int $$40 = ges.c($$6, $$16);
                           $$41 = (float)axw.b.b($$40) / 255.0F;
                           $$42 = (float)axw.b.c($$40) / 255.0F;
                           $$43 = (float)axw.b.d($$40) / 255.0F;
                        } else {
                           $$41 = 1.0F;
                           $$42 = 1.0F;
                           $$43 = 1.0F;
                        }

                        $$12.a((double)$$18 - $$2 - $$20 + 0.5, (double)$$25 - $$3, (double)$$17 - $$4 - $$21 + 0.5)
                           .a(0.0F, (float)$$24 * 0.25F + $$34)
                           .a($$41, $$42, $$43, $$38)
                           .b($$39)
                           .e();
                        $$12.a((double)$$18 - $$2 + $$20 + 0.5, (double)$$25 - $$3, (double)$$17 - $$4 + $$21 + 0.5)
                           .a(1.0F, (float)$$24 * 0.25F + $$34)
                           .a($$41, $$42, $$43, $$38)
                           .b($$39)
                           .e();
                        $$12.a((double)$$18 - $$2 + $$20 + 0.5, (double)$$24 - $$3, (double)$$17 - $$4 + $$21 + 0.5)
                           .a(1.0F, (float)$$25 * 0.25F + $$34)
                           .a($$41, $$42, $$43, $$38)
                           .b($$39)
                           .e();
                        $$12.a((double)$$18 - $$2 - $$20 + 0.5, (double)$$24 - $$3, (double)$$17 - $$4 - $$21 + 0.5)
                           .a(0.0F, (float)$$25 * 0.25F + $$34)
                           .a($$41, $$42, $$43, $$38)
                           .b($$39)
                           .e();
                     } else if ($$29 == dcz.c.c) {
                        if ($$14 != 1) {
                           if ($$14 >= 0) {
                              $$11.c();
                           }

                           $$14 = 1;
                           RenderSystem.setShaderTexture(0, r);
                           $$12.a(fbh.b.h, fba.l);
                        }

                        float $$47 = -((float)(this.H & 511) + $$1) / 512.0F;
                        float $$48 = (float)($$28.j() + (double)$$15 * 0.01 * (double)((float)$$28.k()));
                        float $$49 = (float)($$28.j() + (double)($$15 * (float)$$28.k()) * 0.001);
                        double $$50 = (double)$$18 + 0.5 - $$2;
                        double $$51 = (double)$$17 + 0.5 - $$4;
                        float $$52 = (float)Math.sqrt($$50 * $$50 + $$51 * $$51) / (float)$$13;
                        float $$53 = ((1.0F - $$52 * $$52) * 0.3F + 0.5F) * $$5;
                        $$16.d($$18, $$27, $$17);
                        int $$54 = a($$6, $$16);
                        int $$55 = $$54 >> 16 & 65535;
                        int $$56 = $$54 & 65535;
                        int $$57 = ($$55 * 3 + 240) / 4;
                        int $$58 = ($$56 * 3 + 240) / 4;
                        $$12.a((double)$$18 - $$2 - $$20 + 0.5, (double)$$25 - $$3, (double)$$17 - $$4 - $$21 + 0.5)
                           .a(0.0F + $$48, (float)$$24 * 0.25F + $$47 + $$49)
                           .a(1.0F, 1.0F, 1.0F, $$53)
                           .b($$58, $$57)
                           .e();
                        $$12.a((double)$$18 - $$2 + $$20 + 0.5, (double)$$25 - $$3, (double)$$17 - $$4 + $$21 + 0.5)
                           .a(1.0F + $$48, (float)$$24 * 0.25F + $$47 + $$49)
                           .a(1.0F, 1.0F, 1.0F, $$53)
                           .b($$58, $$57)
                           .e();
                        $$12.a((double)$$18 - $$2 + $$20 + 0.5, (double)$$24 - $$3, (double)$$17 - $$4 + $$21 + 0.5)
                           .a(1.0F + $$48, (float)$$25 * 0.25F + $$47 + $$49)
                           .a(1.0F, 1.0F, 1.0F, $$53)
                           .b($$58, $$57)
                           .e();
                        $$12.a((double)$$18 - $$2 - $$20 + 0.5, (double)$$24 - $$3, (double)$$17 - $$4 - $$21 + 0.5)
                           .a(0.0F + $$48, (float)$$25 * 0.25F + $$47 + $$49)
                           .a(1.0F, 1.0F, 1.0F, $$53)
                           .b($$58, $$57)
                           .e();
                     }
                  }
               }
            }
         }

         if ($$14 >= 0) {
            $$11.c();
         }

         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         $$0.b();
      }
   }

   public void a(ffu $$0) {
      float $$1 = this.s.r.d(1.0F) / (fgj.N() ? 1.0F : 2.0F);
      if (!($$1 <= 0.0F)) {
         ayt $$2 = ayt.a((long)this.H * 312987231L);
         dcd $$3 = this.s.r;
         ir $$4 = ir.a($$0.b());
         ir $$5 = null;
         int $$6 = (int)(100.0F * $$1 * $$1) / (this.s.m.ar().c() == fgo.b ? 2 : 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            int $$8 = $$2.a(21) - 10;
            int $$9 = $$2.a(21) - 10;
            ir $$10 = $$3.a(dyu.a.e, $$4.b($$8, 0, $$9));
            if ($$10.v() > $$3.J_() && $$10.v() <= $$4.v() + 10 && $$10.v() >= $$4.v() - 10) {
               dcz $$11 = $$3.t($$10).a();
               if ($$11.a($$10) == dcz.c.b) {
                  $$5 = $$10.d();
                  if (this.s.m.ar().c() == fgo.c) {
                     break;
                  }

                  double $$12 = $$2.j();
                  double $$13 = $$2.j();
                  dtc $$14 = $$3.a_($$5);
                  epe $$15 = $$3.b_($$5);
                  exn $$16 = $$14.k($$3, $$5);
                  double $$17 = $$16.b(iw.a.b, $$12, $$13);
                  double $$18 = (double)$$15.a($$3, $$5);
                  double $$19 = Math.max($$17, $$18);
                  kz $$20 = !$$15.a(awj.b) && !$$14.a(dfe.lH) && !dfq.g($$14) ? lb.ab : lb.ac;
                  this.s.r.a($$20, (double)$$5.u() + $$12, (double)$$5.v() + $$19, (double)$$5.w() + $$13, 0.0, 0.0, 0.0);
               }
            }
         }

         if ($$5 != null && $$2.a(3) < this.as++) {
            this.as = 0;
            if ($$5.v() > $$4.v() + 1 && $$3.a(dyu.a.e, $$4).v() > aym.d((float)$$4.v())) {
               this.s.r.a($$5, avo.Cy, avq.d, 0.1F, 0.5F, false);
            } else {
               this.s.r.a($$5, avo.Cx, avq.d, 0.2F, 1.0F, false);
            }
         }
      }
   }

   @Override
   public void close() {
      if (this.M != null) {
         this.M.close();
      }

      if (this.S != null) {
         this.S.close();
      }
   }

   @Override
   public void a(aud $$0) {
      this.a();
      if (fgj.O()) {
         this.y();
      }
   }

   public void a() {
      if (this.M != null) {
         this.M.close();
      }

      akt $$0 = new akt("shaders/post/entity_outline.json");

      try {
         this.M = new gfj(this.s.aa(), this.s.ab(), this.s.h(), $$0);
         this.M.a(this.s.aP().k(), this.s.aP().l());
         this.L = this.M.a("final");
      } catch (IOException var3) {
         e.warn("Failed to load shader: {}", $$0, var3);
         this.M = null;
         this.L = null;
      } catch (JsonSyntaxException var4) {
         e.warn("Failed to parse shader: {}", $$0, var4);
         this.M = null;
         this.L = null;
      }
   }

   private void y() {
      this.z();
      akt $$0 = new akt("shaders/post/transparency.json");

      try {
         gfj $$1 = new gfj(this.s.aa(), this.s.ab(), this.s.h(), $$0);
         $$1.a(this.s.aP().k(), this.s.aP().l());
         ezo $$2 = $$1.a("translucent");
         ezo $$3 = $$1.a("itemEntity");
         ezo $$4 = $$1.a("particles");
         ezo $$5 = $$1.a("weather");
         ezo $$6 = $$1.a("clouds");
         this.S = $$1;
         this.N = $$2;
         this.O = $$3;
         this.P = $$4;
         this.Q = $$5;
         this.R = $$6;
      } catch (Exception var8) {
         String $$8 = var8 instanceof JsonSyntaxException ? "parse" : "load";
         String $$9 = "Failed to " + $$8 + " shader: " + $$0;
         gfe.a $$10 = new gfe.a($$9, var8);
         if (this.s.ac().d().size() > 1) {
            xe $$11 = this.s.ab().b().findFirst().map($$0x -> xe.b($$0x.b())).orElse(null);
            this.s.m.j().a(fgc.b);
            this.s.a($$10, $$11, null);
         } else {
            this.s.m.j().a(fgc.b);
            this.s.m.av();
            e.error(LogUtils.FATAL_MARKER, $$9, $$10);
            this.s.c(new o($$9, $$10));
         }
      }
   }

   private void z() {
      if (this.S != null) {
         this.S.close();
         this.N.a();
         this.O.a();
         this.P.a();
         this.Q.a();
         this.R.a();
         this.S = null;
         this.N = null;
         this.O = null;
         this.P = null;
         this.Q = null;
         this.R = null;
      }
   }

   public void b() {
      if (this.d()) {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
            GlStateManager.SourceFactor.ZERO,
            GlStateManager.DestFactor.ONE
         );
         this.L.c(this.s.aP().k(), this.s.aP().l(), false);
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.s.j.a() && this.L != null && this.M != null && this.s.s != null;
   }

   private void A() {
      fbe $$0 = fbe.b();
      fax $$1 = $$0.d();
      if (this.D != null) {
         this.D.close();
      }

      this.D = new fbf(fbf.a.a);
      fax.b $$2 = a($$1, -16.0F);
      this.D.a();
      this.D.a($$2);
      fbf.b();
   }

   private void B() {
      fbe $$0 = fbe.b();
      fax $$1 = $$0.d();
      if (this.C != null) {
         this.C.close();
      }

      this.C = new fbf(fbf.a.a);
      fax.b $$2 = a($$1, 16.0F);
      this.C.a();
      this.C.a($$2);
      fbf.b();
   }

   private static fax.b a(fax $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      float $$3 = 512.0F;
      RenderSystem.setShader(gez::p);
      $$0.a(fbh.b.g, fba.m);
      $$0.a(0.0, (double)$$1, 0.0).e();

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$0.a((double)($$2 * aym.b((float)$$4 * (float) (Math.PI / 180.0))), (double)$$1, (double)(512.0F * aym.a((float)$$4 * (float) (Math.PI / 180.0))))
            .e();
      }

      return $$0.d();
   }

   private void C() {
      fbe $$0 = fbe.b();
      fax $$1 = $$0.d();
      RenderSystem.setShader(gez::p);
      if (this.B != null) {
         this.B.close();
      }

      this.B = new fbf(fbf.a.a);
      fax.b $$2 = this.a($$1);
      this.B.a();
      this.B.a($$2);
      fbf.b();
   }

   private fax.b a(fax $$0) {
      ayt $$1 = ayt.a(10842L);
      $$0.a(fbh.b.h, fba.m);

      for (int $$2 = 0; $$2 < 1500; $$2++) {
         double $$3 = (double)($$1.i() * 2.0F - 1.0F);
         double $$4 = (double)($$1.i() * 2.0F - 1.0F);
         double $$5 = (double)($$1.i() * 2.0F - 1.0F);
         double $$6 = (double)(0.15F + $$1.i() * 0.1F);
         double $$7 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
         if ($$7 < 1.0 && $$7 > 0.01) {
            $$7 = 1.0 / Math.sqrt($$7);
            $$3 *= $$7;
            $$4 *= $$7;
            $$5 *= $$7;
            double $$8 = $$3 * 100.0;
            double $$9 = $$4 * 100.0;
            double $$10 = $$5 * 100.0;
            double $$11 = Math.atan2($$3, $$5);
            double $$12 = Math.sin($$11);
            double $$13 = Math.cos($$11);
            double $$14 = Math.atan2(Math.sqrt($$3 * $$3 + $$5 * $$5), $$4);
            double $$15 = Math.sin($$14);
            double $$16 = Math.cos($$14);
            double $$17 = $$1.j() * Math.PI * 2.0;
            double $$18 = Math.sin($$17);
            double $$19 = Math.cos($$17);

            for (int $$20 = 0; $$20 < 4; $$20++) {
               double $$21 = 0.0;
               double $$22 = (double)(($$20 & 2) - 1) * $$6;
               double $$23 = (double)(($$20 + 1 & 2) - 1) * $$6;
               double $$24 = 0.0;
               double $$25 = $$22 * $$19 - $$23 * $$18;
               double $$26 = $$23 * $$19 + $$22 * $$18;
               double $$28 = $$25 * $$15 + 0.0 * $$16;
               double $$29 = 0.0 * $$15 - $$25 * $$16;
               double $$30 = $$29 * $$12 - $$26 * $$13;
               double $$32 = $$26 * $$12 + $$29 * $$13;
               $$0.a($$8 + $$30, $$9 + $$28, $$10 + $$32).e();
            }
         }
      }

      return $$0.d();
   }

   public void a(@Nullable fzn $$0) {
      this.T = Integer.MIN_VALUE;
      this.U = Integer.MIN_VALUE;
      this.V = Integer.MIN_VALUE;
      this.t.a($$0);
      this.w = $$0;
      if ($$0 != null) {
         this.f();
      } else {
         if (this.A != null) {
            this.A.a();
            this.A = null;
         }

         if (this.ag != null) {
            this.ag.i();
         }

         this.ag = null;
         this.z.clear();
         this.x.a(null);
         this.y.clear();
      }
   }

   public void e() {
      if (fgj.O()) {
         this.y();
      } else {
         this.z();
      }
   }

   public void f() {
      if (this.w != null) {
         this.e();
         this.w.g();
         if (this.ag == null) {
            this.ag = new gig(this.w, this, ad.f(), this.v);
         } else {
            this.ag.a(this.w);
         }

         this.E = true;
         gfb.a(fgj.N());
         this.ah = this.s.m.aD();
         if (this.A != null) {
            this.A.a();
         }

         this.ag.g();
         synchronized (this.z) {
            this.z.clear();
         }

         this.A = new gfx(this.ag, this.w, this.s.m.aD(), this);
         this.x.a(this.A);
         this.y.clear();
         brv $$0 = this.s.ao();
         if ($$0 != null) {
            this.A.a($$0.dz(), $$0.dF());
         }
      }
   }

   public void a(int $$0, int $$1) {
      this.r();
      if (this.M != null) {
         this.M.a($$0, $$1);
      }

      if (this.S != null) {
         this.S.a($$0, $$1);
      }
   }

   public String g() {
      int $$0 = this.A.f.length;
      int $$1 = this.k();
      return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.s.D ? "(s) " : "", this.ah, this.ag == null ? "null" : this.ag.a());
   }

   public gig h() {
      return this.ag;
   }

   public double i() {
      return (double)this.A.f.length;
   }

   public double j() {
      return (double)this.ah;
   }

   public int k() {
      int $$0 = 0;
      ObjectListIterator var2 = this.y.iterator();

      while (var2.hasNext()) {
         gig.b $$1 = (gig.b)var2.next();
         if (!$$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String l() {
      return "E: " + this.ai + "/" + this.w.h() + ", B: " + this.aj + ", SD: " + this.w.m();
   }

   private void a(ffu $$0, gik $$1, boolean $$2, boolean $$3) {
      ewu $$4 = $$0.b();
      if (this.s.m.aD() != this.ah) {
         this.f();
      }

      this.w.ag().a("camera");
      double $$5 = this.s.s.dz();
      double $$6 = this.s.s.dB();
      double $$7 = this.s.s.dF();
      int $$8 = jt.a($$5);
      int $$9 = jt.a($$6);
      int $$10 = jt.a($$7);
      if (this.T != $$8 || this.U != $$9 || this.V != $$10) {
         this.T = $$8;
         this.U = $$9;
         this.V = $$10;
         this.A.a($$5, $$7);
      }

      this.ag.a($$4);
      this.w.ag().b("cull");
      this.s.aJ().b("culling");
      ir $$11 = $$0.c();
      double $$12 = Math.floor($$4.c / 8.0);
      double $$13 = Math.floor($$4.d / 8.0);
      double $$14 = Math.floor($$4.e / 8.0);
      if ($$12 != this.W || $$13 != this.X || $$14 != this.Y) {
         this.x.a();
      }

      this.W = $$12;
      this.X = $$13;
      this.Y = $$14;
      this.s.aJ().b("update");
      if (!$$2) {
         boolean $$15 = this.s.D;
         if ($$3 && this.w.a_($$11).i(this.w, $$11)) {
            $$15 = false;
         }

         brv.b(aym.a((double)this.s.m.aD() / 8.0, 1.0, 2.5) * this.s.m.g().c());
         this.s.aJ().a("section_occlusion_graph");
         this.x.a($$15, $$0, $$1, this.y);
         this.s.aJ().c();
         double $$16 = Math.floor((double)($$0.d() / 2.0F));
         double $$17 = Math.floor((double)($$0.e() / 2.0F));
         if (this.x.b() || $$16 != this.Z || $$17 != this.aa) {
            this.b(a($$1));
            this.Z = $$16;
            this.aa = $$17;
         }
      }

      this.s.aJ().c();
   }

   public static gik a(gik $$0) {
      return new gik($$0).a(8);
   }

   private void b(gik $$0) {
      if (!fgj.Q().bv()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.s.aJ().a("apply_frustum");
         this.y.clear();
         this.x.a($$0, this.y);
         this.s.aJ().c();
      }
   }

   public void a(gig.b $$0) {
      this.x.a($$0);
   }

   private void a(Matrix4f $$0, Matrix4f $$1, double $$2, double $$3, double $$4, gik $$5) {
      this.am = $$5;
      Matrix4f $$6 = new Matrix4f($$1);
      $$6.mul($$0);
      $$6.invert();
      this.ao.x = $$2;
      this.ao.y = $$3;
      this.ao.z = $$4;
      this.an[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
      this.an[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
      this.an[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
      this.an[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
      this.an[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
      this.an[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
      this.an[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.an[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);

      for (int $$7 = 0; $$7 < 8; $$7++) {
         $$6.transform(this.an[$$7]);
         this.an[$$7].div(this.an[$$7].w());
      }
   }

   public void a(ewu $$0, Matrix4f $$1, Matrix4f $$2) {
      this.ak = new gik($$1, $$2);
      this.ak.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(float $$0, long $$1, boolean $$2, ffu $$3, gez $$4, gff $$5, Matrix4f $$6, Matrix4f $$7) {
      bql $$8 = this.s.r.s();
      float $$9 = $$8.i() ? $$0 : 1.0F;
      RenderSystem.setShaderGameTime(this.w.Z(), $$9);
      this.u.a(this.w, $$3, this.s.v);
      this.t.a(this.w, $$3, this.s.u);
      bmo $$10 = this.w.ag();
      $$10.b("light_update_queue");
      this.w.b();
      $$10.b("light_updates");
      this.w.i().p().a();
      ewu $$11 = $$3.b();
      double $$12 = $$11.a();
      double $$13 = $$11.b();
      double $$14 = $$11.c();
      $$10.b("culling");
      boolean $$15 = this.am != null;
      gik $$16;
      if ($$15) {
         $$16 = this.am;
         $$16.a(this.ao.x, this.ao.y, this.ao.z);
      } else {
         $$16 = this.ak;
      }

      this.s.aJ().b("captureFrustum");
      if (this.al) {
         this.a($$6, $$7, $$11.c, $$11.d, $$11.e, $$15 ? new gik($$6, $$7) : $$16);
         this.al = false;
      }

      $$10.b("clear");
      gey.a($$3, $$9, this.s.r, this.s.m.aD(), $$4.c($$9));
      gey.b();
      RenderSystem.clear(16640, fgj.a);
      float $$18 = $$4.l();
      boolean $$19 = this.s.r.d().a(aym.a($$12), aym.a($$13)) || this.s.l.j().d();
      $$10.b("sky");
      RenderSystem.setShader(gez::p);
      this.a($$6, $$7, $$9, $$3, $$19, () -> gey.a($$3, gey.d.a, $$18, $$19, $$9));
      $$10.b("fog");
      gey.a($$3, gey.d.b, Math.max($$18, 32.0F), $$19, $$9);
      $$10.b("terrain_setup");
      this.a($$3, $$16, $$15, this.s.s.O_());
      $$10.b("compile_sections");
      this.c($$3);
      $$10.b("terrain");
      this.a(gfo.c(), $$12, $$13, $$14, $$6, $$7);
      this.a(gfo.d(), $$12, $$13, $$14, $$6, $$7);
      this.a(gfo.e(), $$12, $$13, $$14, $$6, $$7);
      $$10.b("grids");
      this.a($$6, $$7, $$9, $$12, $$13, $$14, $$16, false);
      if (this.w.d().f()) {
         ezy.a();
      } else {
         ezy.b();
      }

      $$10.b("entities");
      this.ai = 0;
      this.aj = 0;
      if (this.O != null) {
         this.O.b(fgj.a);
         this.O.a(this.s.h());
         this.s.h().a(false);
      }

      if (this.Q != null) {
         this.Q.b(fgj.a);
      }

      if (this.d()) {
         this.L.b(fgj.a);
         this.s.h().a(false);
      }

      Matrix4fStack $$20 = RenderSystem.getModelViewStack();
      $$20.pushMatrix();
      $$20.mul($$6);
      RenderSystem.applyModelViewMatrix();
      boolean $$21 = false;
      fbc $$22 = new fbc();
      gfg.a $$23 = this.v.c();

      for (brv $$24 : this.w.e()) {
         if (this.t.a($$24, $$16, $$12, $$13, $$14) || $$24.z(this.s.s)) {
            ir $$25 = $$24.du();
            if ((this.w.d($$25.v()) || this.a($$25))
               && ($$24 != $$3.g() || $$3.i() || $$3.g() instanceof bso && ((bso)$$3.g()).fU())
               && (!($$24 instanceof gei) || $$3.g() == $$24)) {
               this.ai++;
               if ($$24.am == 0) {
                  $$24.ae = $$24.dz();
                  $$24.af = $$24.dB();
                  $$24.ag = $$24.dF();
               }

               gfg $$27;
               if (this.d() && this.s.b($$24)) {
                  $$21 = true;
                  gfh $$26 = this.v.e();
                  $$27 = $$26;
                  int $$28 = $$24.q_();
                  $$26.a(axw.b.b($$28), axw.b.c($$28), axw.b.d($$28), 255);
               } else {
                  $$27 = $$23;
               }

               float $$30 = $$8.a($$24) ? $$9 : $$0;
               this.a($$24, $$12, $$13, $$14, $$30, $$22, $$27);
            }
         }
      }

      $$23.a();
      this.a($$22);
      $$23.a(gfo.c(gqx.e));
      $$23.a(gfo.d(gqx.e));
      $$23.a(gfo.e(gqx.e));
      $$23.a(gfo.k(gqx.e));
      $$10.b("blockentities");
      ObjectListIterator var42 = this.y.iterator();

      while (var42.hasNext()) {
         gig.b $$31 = (gig.b)var42.next();
         List<dqc> $$32 = $$31.d().b();
         if (!$$32.isEmpty()) {
            for (dqc $$33 : $$32) {
               ir $$34 = $$33.az_();
               gfg $$35 = $$23;
               $$22.a();
               $$22.a((double)$$34.u() - $$12, (double)$$34.v() - $$13, (double)$$34.w() - $$14);
               SortedSet<apz> $$36 = (SortedSet<apz>)this.J.get($$34.a());
               if ($$36 != null && !$$36.isEmpty()) {
                  int $$37 = $$36.last().c();
                  if ($$37 >= 0) {
                     fbc.a $$38 = $$22.c();
                     fbg $$39 = new fbd(this.v.d().getBuffer(gte.l.get($$37)), $$38, 1.0F);
                     $$35 = $$2x -> {
                        fbg $$3x = $$23.getBuffer($$2x);
                        return $$2x.O() ? fbj.a($$39, $$3x) : $$3x;
                     };
                  }
               }

               this.u.a($$33, $$9, $$22, $$35);
               $$22.b();
            }
         }
      }

      synchronized (this.z) {
         for (dqc $$40 : this.z) {
            ir $$41 = $$40.az_();
            $$22.a();
            $$22.a((double)$$41.u() - $$12, (double)$$41.v() - $$13, (double)$$41.w() - $$14);
            this.u.a($$40, $$9, $$22, $$23);
            $$22.b();
         }
      }

      this.a($$22);
      $$23.a(gfo.c());
      $$23.a(gfo.u());
      $$23.a(gfo.w());
      $$23.a(gfv.h());
      $$23.a(gfv.i());
      $$23.a(gfv.c());
      $$23.a(gfv.d());
      $$23.a(gfv.e());
      $$23.a(gfv.f());
      $$23.a(gfv.g());
      this.v.e().a();
      if ($$21) {
         this.M.a($$9);
         this.s.h().a(false);
      }

      $$10.b("destroyProgress");
      ObjectIterator var44 = this.J.long2ObjectEntrySet().iterator();

      while (var44.hasNext()) {
         Entry<SortedSet<apz>> $$42 = (Entry<SortedSet<apz>>)var44.next();
         ir $$43 = ir.d($$42.getLongKey());
         double $$44 = (double)$$43.u() - $$12;
         double $$45 = (double)$$43.v() - $$13;
         double $$46 = (double)$$43.w() - $$14;
         if (!($$44 * $$44 + $$45 * $$45 + $$46 * $$46 > 1024.0)) {
            SortedSet<apz> $$47 = (SortedSet<apz>)$$42.getValue();
            if ($$47 != null && !$$47.isEmpty()) {
               int $$48 = $$47.last().c();
               $$22.a();
               $$22.a((double)$$43.u() - $$12, (double)$$43.v() - $$13, (double)$$43.w() - $$14);
               fbc.a $$49 = $$22.c();
               fbg $$50 = new fbd(this.v.d().getBuffer(gte.l.get($$48)), $$49, 1.0F);
               this.s.ap().a(this.w.a_($$43), $$43, this.w, $$22, $$50);
               $$22.b();
            }
         }
      }

      this.a($$22);
      ews $$51 = this.s.v;
      if ($$2 && $$51 != null && $$51.c() == ews.a.b) {
         $$10.b("outline");
         ir $$52 = ((ewq)$$51).a();
         dtc $$53 = this.w.a_($$52);
         if (!$$53.i() && this.w.D_().a($$52)) {
            fbg $$54 = $$23.getBuffer(gfo.z());
            this.a($$22, $$54, $$3.g(), $$12, $$13, $$14, $$52, $$53);
         }
      }

      this.s.k.a($$22, $$23, $$12, $$13, $$14);
      $$23.a();
      $$23.a(gfv.k());
      $$23.a(gfv.a());
      $$23.a(gfv.b());
      $$23.a(gfo.j());
      $$23.a(gfo.k());
      $$23.a(gfo.m());
      $$23.a(gfo.n());
      $$23.a(gfo.l());
      $$23.a(gfo.o());
      $$23.a(gfo.p());
      $$23.a(gfo.i());
      this.v.d().b();
      if (this.S != null) {
         $$23.a(gfo.z());
         $$23.b();
         this.N.b(fgj.a);
         this.N.a(this.s.h());
         $$10.b("translucent");
         this.a(gfo.f(), $$12, $$13, $$14, $$6, $$7);
         $$10.b("string");
         this.a(gfo.t(), $$12, $$13, $$14, $$6, $$7);
         $$10.b("grids_transluicent");
         this.a($$6, $$7, $$9, $$12, $$13, $$14, $$16, true);
         this.P.b(fgj.a);
         this.P.a(this.s.h());
         gfn.aM.a();
         $$10.b("particles");
         this.s.g.a($$5, $$3, $$9);
         gfn.aM.b();
      } else {
         $$10.b("translucent");
         if (this.N != null) {
            this.N.b(fgj.a);
         }

         this.a(gfo.f(), $$12, $$13, $$14, $$6, $$7);
         $$23.a(gfo.z());
         $$23.b();
         $$10.b("string");
         this.a(gfo.t(), $$12, $$13, $$14, $$6, $$7);
         $$10.b("grids_transluicent");
         this.a($$6, $$7, $$9, $$12, $$13, $$14, $$16, true);
         $$10.b("particles");
         this.s.g.a($$5, $$3, $$9);
      }

      if (this.s.m.ay() != ffx.a) {
         if (this.S != null) {
            this.R.b(fgj.a);
         }

         $$10.b("clouds");
         this.a($$22, $$6, $$7, $$9, $$12, $$13, $$14);
      }

      if (this.S != null) {
         gfn.aN.a();
         $$10.b("weather");
         this.a($$5, $$9, $$12, $$13, $$14);
         this.d($$3);
         gfn.aN.b();
         this.S.a($$9);
         this.s.h().a(false);
      } else {
         RenderSystem.depthMask(false);
         $$10.b("weather");
         this.a($$5, $$9, $$12, $$13, $$14);
         this.d($$3);
         RenderSystem.depthMask(true);
      }

      this.a($$22, $$23, $$3);
      $$23.a();
      $$20.popMatrix();
      RenderSystem.applyModelViewMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      gey.a();
   }

   private void a(Matrix4f $$0, Matrix4f $$1, float $$2, double $$3, double $$4, double $$5, gik $$6, boolean $$7) {
      for (fht $$8 : this.w.H()) {
         $$8.b().a($$2, $$3, $$4, $$5, $$6, $$0, $$1, $$7);
      }
   }

   private void a(fbc $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(brv $$0, double $$1, double $$2, double $$3, float $$4, fbc $$5, gfg $$6) {
      double $$7 = aym.d((double)$$4, $$0.ae, $$0.dz());
      double $$8 = aym.d((double)$$4, $$0.af, $$0.dB());
      double $$9 = aym.d((double)$$4, $$0.ag, $$0.dF());
      float $$10 = aym.i($$4, $$0.P, $$0.dK());
      this.t.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$10, $$4, $$5, $$6, this.t.a($$0, $$4));
   }

   private void a(gfo $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      $$0.a();
      if ($$0 == gfo.f()) {
         this.s.aJ().a("translucent_sort");
         double $$6 = $$1 - this.ap;
         double $$7 = $$2 - this.aq;
         double $$8 = $$3 - this.ar;
         if ($$6 * $$6 + $$7 * $$7 + $$8 * $$8 > 1.0) {
            int $$9 = jt.a($$1);
            int $$10 = jt.a($$2);
            int $$11 = jt.a($$3);
            boolean $$12 = $$9 != jt.a(this.ap) || $$11 != jt.a(this.ar) || $$10 != jt.a(this.aq);
            this.ap = $$1;
            this.aq = $$2;
            this.ar = $$3;
            int $$13 = 0;
            ObjectListIterator var21 = this.y.iterator();

            while (var21.hasNext()) {
               gig.b $$14 = (gig.b)var21.next();
               if ($$13 < 15 && ($$12 || $$14.b($$9, $$10, $$11)) && $$14.a($$0, this.ag)) {
                  $$13++;
               }
            }
         }

         this.s.aJ().c();
      }

      this.s.aJ().a("filterempty");
      this.s.aJ().b(() -> "render_" + $$0);
      boolean $$15 = $$0 != gfo.f();
      ObjectListIterator<gig.b> $$16 = this.y.listIterator($$15 ? 0 : this.y.size());
      gfu $$17 = RenderSystem.getShader();
      $$17.a(fbh.b.h, $$4, $$5, this.s.aP());
      $$17.g();
      fat $$18 = $$17.p;

      while ($$15 ? $$16.hasNext() : $$16.hasPrevious()) {
         gig.b $$19 = $$15 ? (gig.b)$$16.next() : (gig.b)$$16.previous();
         if (!$$19.d().a($$0)) {
            fbf $$20 = $$19.a($$0);
            ir $$21 = $$19.f();
            if ($$18 != null) {
               $$18.a((float)((double)$$21.u() - $$1), (float)((double)$$21.v() - $$2), (float)((double)$$21.w() - $$3));
               $$18.b();
            }

            $$20.a();
            $$20.c();
         }
      }

      if ($$18 != null) {
         $$18.a(0.0F, 0.0F, 0.0F);
      }

      $$17.f();
      fbf.b();
      this.s.aJ().c();
      $$0.b();
   }

   private void a(fbc $$0, gfg $$1, ffu $$2) {
      if (this.s.B || this.s.C) {
         double $$3 = $$2.b().a();
         double $$4 = $$2.b().b();
         double $$5 = $$2.b().c();
         ObjectListIterator var10 = this.y.iterator();

         while (var10.hasNext()) {
            gig.b $$6 = (gig.b)var10.next();
            gft.d $$7 = this.x.b($$6);
            if ($$7 != null) {
               ir $$8 = $$6.f();
               $$0.a();
               $$0.a((double)$$8.u() - $$3, (double)$$8.v() - $$4, (double)$$8.w() - $$5);
               Matrix4f $$9 = $$0.c().a();
               if (this.s.B) {
                  fbg $$10 = $$1.getBuffer(gfo.z());
                  int $$11 = $$7.b == 0 ? 0 : aym.h((float)$$7.b / 50.0F, 0.9F, 0.9F);
                  int $$12 = $$11 >> 16 & 0xFF;
                  int $$13 = $$11 >> 8 & 0xFF;
                  int $$14 = $$11 & 0xFF;

                  for (int $$15 = 0; $$15 < d.length; $$15++) {
                     if ($$7.a($$15)) {
                        iw $$16 = d[$$15];
                        $$10.a($$9, 8.0F, 8.0F, 8.0F).a($$12, $$13, $$14, 255).a((float)$$16.j(), (float)$$16.k(), (float)$$16.l()).e();
                        $$10.a($$9, (float)(8 - 16 * $$16.j()), (float)(8 - 16 * $$16.k()), (float)(8 - 16 * $$16.l()))
                           .a($$12, $$13, $$14, 255)
                           .a((float)$$16.j(), (float)$$16.k(), (float)$$16.l())
                           .e();
                     }
                  }
               }

               if (this.s.C && !$$6.d().a()) {
                  fbg $$17 = $$1.getBuffer(gfo.z());
                  int $$18 = 0;

                  for (iw $$19 : d) {
                     for (iw $$20 : d) {
                        boolean $$21 = $$6.d().a($$19, $$20);
                        if (!$$21) {
                           $$18++;
                           $$17.a($$9, (float)(8 + 8 * $$19.j()), (float)(8 + 8 * $$19.k()), (float)(8 + 8 * $$19.l()))
                              .a(255, 0, 0, 255)
                              .a((float)$$19.j(), (float)$$19.k(), (float)$$19.l())
                              .e();
                           $$17.a($$9, (float)(8 + 8 * $$20.j()), (float)(8 + 8 * $$20.k()), (float)(8 + 8 * $$20.l()))
                              .a(255, 0, 0, 255)
                              .a((float)$$20.j(), (float)$$20.k(), (float)$$20.l())
                              .e();
                        }
                     }
                  }

                  if ($$18 > 0) {
                     fbg $$22 = $$1.getBuffer(gfo.C());
                     float $$23 = 0.5F;
                     float $$24 = 0.2F;
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F).e();
                  }
               }

               $$0.b();
            }
         }
      }

      if (this.am != null) {
         $$0.a();
         $$0.a((float)(this.ao.x - $$2.b().c), (float)(this.ao.y - $$2.b().d), (float)(this.ao.z - $$2.b().e));
         Matrix4f $$25 = $$0.c().a();
         fbg $$26 = $$1.getBuffer(gfo.C());
         this.a($$26, $$25, 0, 1, 2, 3, 0, 1, 1);
         this.a($$26, $$25, 4, 5, 6, 7, 1, 0, 0);
         this.a($$26, $$25, 0, 1, 5, 4, 1, 1, 0);
         this.a($$26, $$25, 2, 3, 7, 6, 0, 0, 1);
         this.a($$26, $$25, 0, 4, 7, 3, 0, 1, 0);
         this.a($$26, $$25, 1, 5, 6, 2, 1, 0, 1);
         fbg $$27 = $$1.getBuffer(gfo.z());
         this.a($$27, $$25, 0);
         this.a($$27, $$25, 1);
         this.a($$27, $$25, 1);
         this.a($$27, $$25, 2);
         this.a($$27, $$25, 2);
         this.a($$27, $$25, 3);
         this.a($$27, $$25, 3);
         this.a($$27, $$25, 0);
         this.a($$27, $$25, 4);
         this.a($$27, $$25, 5);
         this.a($$27, $$25, 5);
         this.a($$27, $$25, 6);
         this.a($$27, $$25, 6);
         this.a($$27, $$25, 7);
         this.a($$27, $$25, 7);
         this.a($$27, $$25, 4);
         this.a($$27, $$25, 0);
         this.a($$27, $$25, 4);
         this.a($$27, $$25, 1);
         this.a($$27, $$25, 5);
         this.a($$27, $$25, 2);
         this.a($$27, $$25, 6);
         this.a($$27, $$25, 3);
         this.a($$27, $$25, 7);
         $$0.b();
      }
   }

   private void a(fbg $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, this.an[$$2].x(), this.an[$$2].y(), this.an[$$2].z()).a(0, 0, 0, 255).a(0.0F, 0.0F, -1.0F).e();
   }

   private void a(fbg $$0, Matrix4f $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      float $$9 = 0.25F;
      $$0.a($$1, this.an[$$2].x(), this.an[$$2].y(), this.an[$$2].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.an[$$3].x(), this.an[$$3].y(), this.an[$$3].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.an[$$4].x(), this.an[$$4].y(), this.an[$$4].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.an[$$5].x(), this.an[$$5].y(), this.an[$$5].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
   }

   public void m() {
      this.al = true;
   }

   public void n() {
      this.am = null;
   }

   public void o() {
      if (this.w.s().i()) {
         this.H++;
      }

      if (this.H % 20 == 0) {
         Iterator<apz> $$0 = this.I.values().iterator();

         while ($$0.hasNext()) {
            apz $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.H - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(apz $$0) {
      long $$1 = $$0.b().a();
      Set<apz> $$2 = (Set<apz>)this.J.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.J.remove($$1);
      }
   }

   private void b(fbc $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(gez::t);
      RenderSystem.setShaderTexture(0, n);
      fbe $$1 = fbe.b();
      fax $$2 = $$1.d();

      for (int $$3 = 0; $$3 < 6; $$3++) {
         $$0.a();
         if ($$3 == 1) {
            $$0.a(a.b.rotationDegrees(90.0F));
         }

         if ($$3 == 2) {
            $$0.a(a.b.rotationDegrees(-90.0F));
         }

         if ($$3 == 3) {
            $$0.a(a.b.rotationDegrees(180.0F));
         }

         if ($$3 == 4) {
            $$0.a(a.f.rotationDegrees(90.0F));
         }

         if ($$3 == 5) {
            $$0.a(a.f.rotationDegrees(-90.0F));
         }

         Matrix4f $$4 = $$0.c().a();
         $$2.a(fbh.b.h, fba.s);
         $$2.a($$4, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(40, 40, 40, 255).e();
         $$2.a($$4, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(40, 40, 40, 255).e();
         $$2.a($$4, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(40, 40, 40, 255).e();
         $$2.a($$4, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(40, 40, 40, 255).e();
         $$1.c();
         $$0.b();
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
   }

   public void a(Matrix4f $$0, Matrix4f $$1, float $$2, ffu $$3, boolean $$4, Runnable $$5) {
      $$5.run();
      if (!$$4) {
         epg $$6 = $$3.k();
         if ($$6 != epg.c && $$6 != epg.a && !this.b($$3)) {
            fbc $$7 = new fbc();
            $$7.a($$0);
            if (this.s.r.d().c() == gev.e.c) {
               this.b($$7);
            } else if (this.s.r.d().c() == gev.e.b) {
               ewu $$8 = this.w.a(this.s.j.m().b(), $$2);
               float $$9 = (float)$$8.c;
               float $$10 = (float)$$8.d;
               float $$11 = (float)$$8.e;
               gey.b();
               fax $$12 = fbe.b().d();
               RenderSystem.depthMask(false);
               RenderSystem.setShaderColor($$9, $$10, $$11, 1.0F);
               gfu $$13 = RenderSystem.getShader();
               this.C.a();
               this.C.a($$7.c().a(), $$1, $$13);
               fbf.b();
               RenderSystem.enableBlend();
               float[] $$14 = this.w.d().a(this.w.f($$2), $$2);
               if ($$14 != null) {
                  RenderSystem.setShader(gez::q);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  $$7.a();
                  $$7.a(a.b.rotationDegrees(90.0F));
                  float $$15 = aym.a(this.w.a($$2)) < 0.0F ? 180.0F : 0.0F;
                  $$7.a(a.f.rotationDegrees($$15));
                  $$7.a(a.f.rotationDegrees(90.0F));
                  float $$16 = $$14[0];
                  float $$17 = $$14[1];
                  float $$18 = $$14[2];
                  Matrix4f $$19 = $$7.c().a();
                  $$12.a(fbh.b.g, fba.n);
                  $$12.a($$19, 0.0F, 100.0F, 0.0F).a($$16, $$17, $$18, $$14[3]).e();
                  int $$20 = 16;

                  for (int $$21 = 0; $$21 <= 16; $$21++) {
                     float $$22 = (float)$$21 * (float) (Math.PI * 2) / 16.0F;
                     float $$23 = aym.a($$22);
                     float $$24 = aym.b($$22);
                     $$12.a($$19, $$23 * 120.0F, $$24 * 120.0F, -$$24 * 40.0F * $$14[3]).a($$14[0], $$14[1], $$14[2], 0.0F).e();
                  }

                  fay.a($$12.d());
                  $$7.b();
               }

               RenderSystem.blendFuncSeparate(
                  GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
               );
               $$7.a();
               float $$25 = 1.0F - this.w.a($$2, $$3.b().b());
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$25);
               $$7.a(a.d.rotationDegrees(-90.0F));
               $$7.a(a.b.rotationDegrees(this.w.f($$2) * 360.0F));
               Matrix4f $$26 = $$7.c().a();
               float $$27 = 30.0F;
               RenderSystem.setShader(gez::s);
               if (this.w.ae().a(dws.d)) {
                  RenderSystem.setShaderTexture(0, m);
               } else {
                  RenderSystem.setShaderTexture(0, l);
               }

               $$12.a(fbh.b.h, fba.q);
               $$12.a($$26, -$$27, 100.0F, -$$27).a(0.0F, 0.0F).e();
               $$12.a($$26, $$27, 100.0F, -$$27).a(1.0F, 0.0F).e();
               $$12.a($$26, $$27, 100.0F, $$27).a(1.0F, 1.0F).e();
               $$12.a($$26, -$$27, 100.0F, $$27).a(0.0F, 1.0F).e();
               fay.a($$12.d());
               $$27 = 20.0F;
               RenderSystem.setShaderTexture(0, k);
               int $$28 = this.w.ar();
               int $$29 = $$28 % 4;
               int $$30 = $$28 / 4 % 2;
               float $$31 = (float)($$29 + 0) / 4.0F;
               float $$32 = (float)($$30 + 0) / 2.0F;
               float $$33 = (float)($$29 + 1) / 4.0F;
               float $$34 = (float)($$30 + 1) / 2.0F;
               $$12.a(fbh.b.h, fba.q);
               $$12.a($$26, -$$27, -100.0F, $$27).a($$33, $$34).e();
               $$12.a($$26, $$27, -100.0F, $$27).a($$31, $$34).e();
               $$12.a($$26, $$27, -100.0F, -$$27).a($$31, $$32).e();
               $$12.a($$26, -$$27, -100.0F, -$$27).a($$33, $$32).e();
               fay.a($$12.d());
               float $$35 = this.w.i($$2) * $$25;
               if ($$35 > 0.0F) {
                  RenderSystem.setShaderColor($$35, $$35, $$35, $$35);
                  gey.a();
                  this.B.a();
                  this.B.a($$7.c().a(), $$1, gez.p());
                  fbf.b();
                  $$5.run();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.disableBlend();
               RenderSystem.defaultBlendFunc();
               $$7.b();
               RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
               double $$36 = this.s.s.j($$2).d - this.w.k().a(this.w);
               if ($$36 < 0.0) {
                  $$7.a();
                  $$7.a(0.0F, 12.0F, 0.0F);
                  this.D.a();
                  this.D.a($$7.c().a(), $$1, $$13);
                  fbf.b();
                  $$7.b();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.depthMask(true);
            }
         }
      }
   }

   private boolean b(ffu $$0) {
      return !($$0.g() instanceof bso $$1) ? false : $$1.b(brj.o) || $$1.b(brj.G);
   }

   public void a(fbc $$0, Matrix4f $$1, Matrix4f $$2, float $$3, double $$4, double $$5, double $$6) {
      float $$7 = this.w.d().a();
      if (!Float.isNaN($$7)) {
         float $$8 = 12.0F;
         float $$9 = 4.0F;
         double $$10 = 2.0E-4;
         double $$11 = (double)(((float)this.H + $$3) * 0.03F);
         double $$12 = ($$4 + $$11) / 12.0;
         double $$13 = (double)($$7 - (float)$$5 + 0.33F);
         double $$14 = $$6 / 12.0 + 0.33F;
         $$12 -= (double)(aym.a($$12 / 2048.0) * 2048);
         $$14 -= (double)(aym.a($$14 / 2048.0) * 2048);
         float $$15 = (float)($$12 - (double)aym.a($$12));
         float $$16 = (float)($$13 / 4.0 - (double)aym.a($$13 / 4.0)) * 4.0F;
         float $$17 = (float)($$14 - (double)aym.a($$14));
         ewu $$18 = this.w.h($$3);
         int $$19 = (int)Math.floor($$12);
         int $$20 = (int)Math.floor($$13 / 4.0);
         int $$21 = (int)Math.floor($$14);
         if ($$19 != this.ab || $$20 != this.ac || $$21 != this.ad || this.s.m.ay() != this.af || this.ae.g($$18) > 2.0E-4) {
            this.ab = $$19;
            this.ac = $$20;
            this.ad = $$21;
            this.ae = $$18;
            this.af = this.s.m.ay();
            this.E = true;
         }

         if (this.E) {
            this.E = false;
            fax $$22 = fbe.b().d();
            if (this.F != null) {
               this.F.close();
            }

            this.F = new fbf(fbf.a.a);
            fax.b $$23 = this.a($$22, $$12, $$13, $$14, $$18);
            this.F.a();
            this.F.a($$23);
            fbf.b();
         }

         gey.b();
         $$0.a();
         $$0.a($$1);
         $$0.b(12.0F, 1.0F, 12.0F);
         $$0.a(-$$15, $$16, -$$17);
         if (this.F != null) {
            this.F.a();
            int $$24 = this.af == ffx.c ? 0 : 1;

            for (int $$25 = $$24; $$25 < 2; $$25++) {
               gfo $$26 = $$25 == 0 ? gfo.y() : gfo.x();
               $$26.a();
               gfu $$27 = RenderSystem.getShader();
               this.F.a($$0.c().a(), $$2, $$27);
               $$26.b();
            }

            fbf.b();
         }

         $$0.b();
      }
   }

   private fax.b a(fax $$0, double $$1, double $$2, double $$3, ewu $$4) {
      float $$5 = 4.0F;
      float $$6 = 0.00390625F;
      int $$7 = 8;
      int $$8 = 4;
      float $$9 = 9.765625E-4F;
      float $$10 = (float)aym.a($$1) * 0.00390625F;
      float $$11 = (float)aym.a($$3) * 0.00390625F;
      float $$12 = (float)$$4.c;
      float $$13 = (float)$$4.d;
      float $$14 = (float)$$4.e;
      float $$15 = $$12 * 0.9F;
      float $$16 = $$13 * 0.9F;
      float $$17 = $$14 * 0.9F;
      float $$18 = $$12 * 0.7F;
      float $$19 = $$13 * 0.7F;
      float $$20 = $$14 * 0.7F;
      float $$21 = $$12 * 0.8F;
      float $$22 = $$13 * 0.8F;
      float $$23 = $$14 * 0.8F;
      $$0.a(fbh.b.h, fba.v);
      float $$24 = (float)Math.floor($$2 / 4.0) * 4.0F;
      if (this.af == ffx.c) {
         for (int $$25 = -3; $$25 <= 4; $$25++) {
            for (int $$26 = -3; $$26 <= 4; $$26++) {
               float $$27 = (float)($$25 * 8);
               float $$28 = (float)($$26 * 8);
               if ($$24 > -5.0F) {
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .a(0.0F, -1.0F, 0.0F)
                     .e();
               }

               if ($$24 <= 5.0F) {
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 8.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 8.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 0.0F))
                     .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
                  $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F - 9.765625E-4F), (double)($$28 + 0.0F))
                     .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .a(0.0F, 1.0F, 0.0F)
                     .e();
               }

               if ($$25 > -1) {
                  for (int $$29 = 0; $$29 < 8; $$29++) {
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$29 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$29 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(-1.0F, 0.0F, 0.0F)
                        .e();
                  }
               }

               if ($$25 <= 1) {
                  for (int $$30 = 0; $$30 < 8; $$30++) {
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 0.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 4.0F), (double)($$28 + 8.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 4.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                     $$0.a((double)($$27 + (float)$$30 + 1.0F - 9.765625E-4F), (double)($$24 + 0.0F), (double)($$28 + 0.0F))
                        .a(($$27 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$28 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .a(1.0F, 0.0F, 0.0F)
                        .e();
                  }
               }

               if ($$26 > -1) {
                  for (int $$31 = 0; $$31 < 8; $$31++) {
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$31 + 0.0F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, -1.0F)
                        .e();
                  }
               }

               if ($$26 <= 1) {
                  for (int $$32 = 0; $$32 < 8; $$32++) {
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 4.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                     $$0.a((double)($$27 + 8.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 8.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                     $$0.a((double)($$27 + 0.0F), (double)($$24 + 0.0F), (double)($$28 + (float)$$32 + 1.0F - 9.765625E-4F))
                        .a(($$27 + 0.0F) * 0.00390625F + $$10, ($$28 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .a(0.0F, 0.0F, 1.0F)
                        .e();
                  }
               }
            }
         }
      } else {
         int $$33 = 1;
         int $$34 = 32;

         for (int $$35 = -32; $$35 < 32; $$35 += 32) {
            for (int $$36 = -32; $$36 < 32; $$36 += 32) {
               $$0.a((double)($$35 + 0), (double)$$24, (double)($$36 + 32))
                  .a((float)($$35 + 0) * 0.00390625F + $$10, (float)($$36 + 32) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
               $$0.a((double)($$35 + 32), (double)$$24, (double)($$36 + 32))
                  .a((float)($$35 + 32) * 0.00390625F + $$10, (float)($$36 + 32) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
               $$0.a((double)($$35 + 32), (double)$$24, (double)($$36 + 0))
                  .a((float)($$35 + 32) * 0.00390625F + $$10, (float)($$36 + 0) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
               $$0.a((double)($$35 + 0), (double)$$24, (double)($$36 + 0))
                  .a((float)($$35 + 0) * 0.00390625F + $$10, (float)($$36 + 0) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .a(0.0F, -1.0F, 0.0F)
                  .e();
            }
         }
      }

      return $$0.d();
   }

   private void c(ffu $$0) {
      this.s.aJ().a("populate_sections_to_compile");
      eot $$1 = this.w.y_();
      gif $$2 = new gif();
      ir $$3 = $$0.c();
      List<gig.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.y.iterator();

      while (var6.hasNext()) {
         gig.b $$5 = (gig.b)var6.next();
         jt $$6 = jt.a($$5.f());
         if ($$5.h() && $$1.a($$6)) {
            boolean $$7 = false;
            if (this.s.m.l().c() == fgq.c) {
               ir $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.i();
            } else if (this.s.m.l().c() == fgq.b) {
               $$7 = $$5.i();
            }

            if ($$7) {
               this.s.aJ().a("build_near_sync");
               this.ag.a($$5, $$2);
               $$5.g();
               this.s.aJ().c();
            } else {
               $$4.add($$5);
            }
         }
      }

      this.s.aJ().b("upload");
      this.ag.f();
      this.s.aJ().b("schedule_async_compile");

      for (gig.b $$9 : $$4) {
         $$9.a(this.ag, $$2);
         $$9.g();
      }

      this.s.aJ().c();
   }

   private void d(ffu $$0) {
      fax $$1 = fbe.b().d();
      dut $$2 = this.w.D_();
      double $$3 = (double)(this.s.m.aD() * 16);
      if (!($$0.b().c < $$2.g() - $$3) || !($$0.b().c > $$2.e() + $$3) || !($$0.b().e < $$2.h() - $$3) || !($$0.b().e > $$2.f() + $$3)) {
         double $$4 = 1.0 - $$2.b($$0.b().c, $$0.b().e) / $$3;
         $$4 = Math.pow($$4, 4.0);
         $$4 = aym.a($$4, 0.0, 1.0);
         double $$5 = $$0.b().c;
         double $$6 = $$0.b().e;
         double $$7 = (double)this.s.j.h();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
         RenderSystem.setShaderTexture(0, o);
         RenderSystem.depthMask(fgj.O());
         int $$8 = $$2.d().a();
         float $$9 = (float)($$8 >> 16 & 0xFF) / 255.0F;
         float $$10 = (float)($$8 >> 8 & 0xFF) / 255.0F;
         float $$11 = (float)($$8 & 0xFF) / 255.0F;
         RenderSystem.setShaderColor($$9, $$10, $$11, (float)$$4);
         RenderSystem.setShader(gez::s);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.disableCull();
         float $$12 = (float)(ad.b() % 3000L) / 3000.0F;
         float $$13 = (float)(-aym.e($$0.b().d * 0.5));
         float $$14 = $$13 + (float)$$7;
         $$1.a(fbh.b.h, fba.q);
         double $$15 = Math.max((double)aym.a($$6 - $$3), $$2.f());
         double $$16 = Math.min((double)aym.c($$6 + $$3), $$2.h());
         float $$17 = (float)(aym.a($$15) & 1) * 0.5F;
         if ($$5 > $$2.g() - $$3) {
            float $$18 = $$17;

            for (double $$19 = $$15; $$19 < $$16; $$18 += 0.5F) {
               double $$20 = Math.min(1.0, $$16 - $$19);
               float $$21 = (float)$$20 * 0.5F;
               $$1.a($$2.g() - $$5, -$$7, $$19 - $$6).a($$12 - $$18, $$12 + $$14).e();
               $$1.a($$2.g() - $$5, -$$7, $$19 + $$20 - $$6).a($$12 - ($$21 + $$18), $$12 + $$14).e();
               $$1.a($$2.g() - $$5, $$7, $$19 + $$20 - $$6).a($$12 - ($$21 + $$18), $$12 + $$13).e();
               $$1.a($$2.g() - $$5, $$7, $$19 - $$6).a($$12 - $$18, $$12 + $$13).e();
               $$19++;
            }
         }

         if ($$5 < $$2.e() + $$3) {
            float $$22 = $$17;

            for (double $$23 = $$15; $$23 < $$16; $$22 += 0.5F) {
               double $$24 = Math.min(1.0, $$16 - $$23);
               float $$25 = (float)$$24 * 0.5F;
               $$1.a($$2.e() - $$5, -$$7, $$23 - $$6).a($$12 + $$22, $$12 + $$14).e();
               $$1.a($$2.e() - $$5, -$$7, $$23 + $$24 - $$6).a($$12 + $$25 + $$22, $$12 + $$14).e();
               $$1.a($$2.e() - $$5, $$7, $$23 + $$24 - $$6).a($$12 + $$25 + $$22, $$12 + $$13).e();
               $$1.a($$2.e() - $$5, $$7, $$23 - $$6).a($$12 + $$22, $$12 + $$13).e();
               $$23++;
            }
         }

         $$15 = Math.max((double)aym.a($$5 - $$3), $$2.e());
         $$16 = Math.min((double)aym.c($$5 + $$3), $$2.g());
         $$17 = (float)(aym.a($$15) & 1) * 0.5F;
         if ($$6 > $$2.h() - $$3) {
            float $$26 = $$17;

            for (double $$27 = $$15; $$27 < $$16; $$26 += 0.5F) {
               double $$28 = Math.min(1.0, $$16 - $$27);
               float $$29 = (float)$$28 * 0.5F;
               $$1.a($$27 - $$5, -$$7, $$2.h() - $$6).a($$12 + $$26, $$12 + $$14).e();
               $$1.a($$27 + $$28 - $$5, -$$7, $$2.h() - $$6).a($$12 + $$29 + $$26, $$12 + $$14).e();
               $$1.a($$27 + $$28 - $$5, $$7, $$2.h() - $$6).a($$12 + $$29 + $$26, $$12 + $$13).e();
               $$1.a($$27 - $$5, $$7, $$2.h() - $$6).a($$12 + $$26, $$12 + $$13).e();
               $$27++;
            }
         }

         if ($$6 < $$2.f() + $$3) {
            float $$30 = $$17;

            for (double $$31 = $$15; $$31 < $$16; $$30 += 0.5F) {
               double $$32 = Math.min(1.0, $$16 - $$31);
               float $$33 = (float)$$32 * 0.5F;
               $$1.a($$31 - $$5, -$$7, $$2.f() - $$6).a($$12 - $$30, $$12 + $$14).e();
               $$1.a($$31 + $$32 - $$5, -$$7, $$2.f() - $$6).a($$12 - ($$33 + $$30), $$12 + $$14).e();
               $$1.a($$31 + $$32 - $$5, $$7, $$2.f() - $$6).a($$12 - ($$33 + $$30), $$12 + $$13).e();
               $$1.a($$31 - $$5, $$7, $$2.f() - $$6).a($$12 - $$30, $$12 + $$13).e();
               $$31++;
            }
         }

         fay.a($$1.d());
         RenderSystem.enableCull();
         RenderSystem.polygonOffset(0.0F, 0.0F);
         RenderSystem.disablePolygonOffset();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.depthMask(true);
      }
   }

   private void a(fbc $$0, fbg $$1, brv $$2, double $$3, double $$4, double $$5, ir $$6, dtc $$7) {
      a($$0, $$1, $$7.a(this.w, $$6, ewz.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   private static ewu a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(aym.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new ewu(1.0, (double)$$3, 0.0);
         case 1 -> new ewu((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new ewu(0.0, 1.0, (double)$$3);
         case 3 -> new ewu(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new ewu((double)$$3, 0.0, 1.0);
         case 5 -> new ewu(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static ewu a(float $$0, float $$1, float $$2, float $$3) {
      ewu $$4 = a($$3).a((double)$$0);
      ewu $$5 = a(($$3 + 0.33333334F) % 1.0F).a((double)$$1);
      ewu $$6 = a(($$3 + 0.6666667F) % 1.0F).a((double)$$2);
      ewu $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.c), Math.max($$7.d, $$7.e));
      return new ewu($$7.c / $$8, $$7.d / $$8, $$7.e / $$8);
   }

   public static void a(fbc $$0, fbg $$1, exn $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<ewp> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         a($$0, $$1, exk.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            ewp $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            ewu $$16 = a($$6, $$7, $$8, $$15);
            a($$0, $$1, exk.a($$14), $$3, $$4, $$5, (float)$$16.c, (float)$$16.d, (float)$$16.e, $$9);
         }
      }
   }

   private static void a(fbc $$0, fbg $$1, exn $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9) {
      fbc.a $$10 = $$0.c();
      $$2.a(($$9x, $$10x, $$11, $$12, $$13, $$14) -> {
         float $$15 = (float)($$12 - $$9x);
         float $$16 = (float)($$13 - $$10x);
         float $$17 = (float)($$14 - $$11);
         float $$18 = aym.c($$15 * $$15 + $$16 * $$16 + $$17 * $$17);
         $$15 /= $$18;
         $$16 /= $$18;
         $$17 /= $$18;
         $$1.a($$10, (float)($$9x + $$3), (float)($$10x + $$4), (float)($$11 + $$5)).a($$6, $$7, $$8, $$9).b($$10, $$15, $$16, $$17).e();
         $$1.a($$10, (float)($$12 + $$3), (float)($$13 + $$4), (float)($$14 + $$5)).a($$6, $$7, $$8, $$9).b($$10, $$15, $$16, $$17).e();
      });
   }

   public static void a(fbg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, float $$8, float $$9, float $$10) {
      a(new fbc(), $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$7, $$8, $$9);
   }

   public static void a(fbc $$0, fbg $$1, ewp $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6, $$3, $$4, $$5);
   }

   public static void a(fbc $$0, fbg $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$8, $$9, $$10);
   }

   public static void a(
      fbc $$0,
      fbg $$1,
      double $$2,
      double $$3,
      double $$4,
      double $$5,
      double $$6,
      double $$7,
      float $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      float $$13,
      float $$14
   ) {
      fbc.a $$15 = $$0.c();
      float $$16 = (float)$$2;
      float $$17 = (float)$$3;
      float $$18 = (float)$$4;
      float $$19 = (float)$$5;
      float $$20 = (float)$$6;
      float $$21 = (float)$$7;
      $$1.a($$15, $$16, $$17, $$18).a($$8, $$13, $$14, $$11).b($$15, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$19, $$17, $$18).a($$8, $$13, $$14, $$11).b($$15, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$16, $$17, $$18).a($$12, $$9, $$14, $$11).b($$15, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$16, $$20, $$18).a($$12, $$9, $$14, $$11).b($$15, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$16, $$17, $$18).a($$12, $$13, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$16, $$17, $$21).a($$12, $$13, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$19, $$17, $$18).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$19, $$20, $$18).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$19, $$20, $$18).a($$8, $$9, $$10, $$11).b($$15, -1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$16, $$20, $$18).a($$8, $$9, $$10, $$11).b($$15, -1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$16, $$20, $$18).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$16, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$16, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, -1.0F, 0.0F).e();
      $$1.a($$15, $$16, $$17, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, -1.0F, 0.0F).e();
      $$1.a($$15, $$16, $$17, $$21).a($$8, $$9, $$10, $$11).b($$15, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$19, $$17, $$21).a($$8, $$9, $$10, $$11).b($$15, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$19, $$17, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, -1.0F).e();
      $$1.a($$15, $$19, $$17, $$18).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, -1.0F).e();
      $$1.a($$15, $$16, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$19, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$19, $$17, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$19, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$19, $$20, $$18).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$19, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F).e();
   }

   public static void b(fbc $$0, fbg $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, (float)$$2, (float)$$3, (float)$$4, (float)$$5, (float)$$6, (float)$$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fbc $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
      Matrix4f $$12 = $$0.c().a();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11).e();
   }

   public void a(dbg $$0, ir $$1, dtc $$2, dtc $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(ir $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(jt.a($$3), jt.a($$4), jt.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(jt.a($$7), jt.a($$8), jt.a($$6));
            }
         }
      }
   }

   public void a(ir $$0, dtc $$1, dtc $$2) {
      if (this.s.aE().a($$1, $$2)) {
         this.a($$0.u(), $$0.v(), $$0.w(), $$0.u(), $$0.v(), $$0.w());
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      for (int $$3 = $$2 - 1; $$3 <= $$2 + 1; $$3++) {
         for (int $$4 = $$0 - 1; $$4 <= $$0 + 1; $$4++) {
            for (int $$5 = $$1 - 1; $$5 <= $$1 + 1; $$5++) {
               this.b($$4, $$5, $$3);
            }
         }
      }
   }

   public void b(int $$0, int $$1, int $$2) {
      this.a($$0, $$1, $$2, false);
   }

   private void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.A.a($$0, $$1, $$2, $$3);
   }

   public void a(@Nullable avn $$0, ir $$1) {
      gum $$2 = this.K.get($$1);
      if ($$2 != null) {
         this.s.ak().b($$2);
         this.K.remove($$1);
      }

      if ($$0 != null) {
         cvk $$3 = cvk.a($$0);
         if ($$3 != null) {
            this.s.l.a($$3.h());
         }

         gum var5 = guh.a($$0, ewu.b($$1));
         this.K.put($$1, var5);
         this.s.ak().a(var5);
      }

      this.a(this.w, $$1, $$0 != null);
   }

   private void a(dca $$0, ir $$1, boolean $$2) {
      for (bso $$4 : $$0.a(bso.class, new ewp($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }

   public void a(kz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(kz $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", lh.j.b($$0.a()));
         $$11.a("Parameters", () -> $$0.a(this.w.I_()));
         $$11.a("Position", () -> p.a(this.w, $$3, $$4, $$5));
         throw new z($$10);
      }
   }

   private <T extends kz> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private gcu b(kz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gcu b(kz $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      ffu $$9 = this.s.j.m();
      fgo $$10 = this.a($$2);
      if ($$1) {
         return this.s.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == fgo.c ? null : this.s.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private fgo a(boolean $$0) {
      fgo $$1 = this.s.m.ar().c();
      if ($$0 && $$1 == fgo.c && this.w.A.a(10) == 0) {
         $$1 = fgo.b;
      }

      if ($$1 == fgo.b && this.w.A.a(3) == 0) {
         $$1 = fgo.c;
      }

      return $$1;
   }

   public void p() {
   }

   public void a(int $$0, ir $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            ffu $$3 = this.s.j.m();
            if ($$3.h()) {
               double $$4 = (double)$$1.u() - $$3.b().c;
               double $$5 = (double)$$1.v() - $$3.b().d;
               double $$6 = (double)$$1.w() - $$3.b().e;
               double $$7 = Math.sqrt($$4 * $$4 + $$5 * $$5 + $$6 * $$6);
               double $$8 = $$3.b().c;
               double $$9 = $$3.b().d;
               double $$10 = $$3.b().e;
               if ($$7 > 0.0) {
                  $$8 += $$4 / $$7 * 2.0;
                  $$9 += $$5 / $$7 * 2.0;
                  $$10 += $$6 / $$7 * 2.0;
               }

               if ($$0 == 1023) {
                  this.w.a($$8, $$9, $$10, avo.Db, avq.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.w.a($$8, $$9, $$10, avo.iJ, avq.f, 1.0F, 1.0F, false);
               } else {
                  this.w.a($$8, $$9, $$10, avo.io, avq.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, ir $$1, int $$2) {
      ayt $$3 = this.w.A;
      switch ($$0) {
         case 1000:
            this.w.a($$1, avo.gS, avq.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.w.a($$1, avo.gT, avq.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.w.a($$1, avo.gU, avq.e, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.w.a($$1, avo.iv, avq.g, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.w.a($$1, avo.jd, avq.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.w.a($$1, avo.jh, avq.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.w.a($$1, avo.ks, avq.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            if (cuc.b($$2) instanceof cvk $$59) {
               this.a($$59.i(), $$1);
            }
            break;
         case 1011:
            this.a(null, $$1);
            break;
         case 1015:
            this.w.a($$1, avo.kC, avq.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.w.a($$1, avo.kB, avq.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.w.a($$1, avo.it, avq.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.w.a($$1, avo.cp, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.w.a($$1, avo.DO, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.w.a($$1, avo.DP, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.w.a($$1, avo.DQ, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.w.a($$1, avo.CT, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.w.a($$1, avo.CW, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.w.a($$1, avo.bO, avq.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.w.a($$1, avo.DY, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.w.a($$1, avo.El, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.w.a($$1, avo.aa, avq.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.w.a($$1, avo.ag, avq.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.w.a($$1, avo.ad, avq.e, 0.3F, this.w.A.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.s.ak().a(guh.b($$2 > 0 ? avo.hP : avo.vd, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.w.a($$1, avo.fl, avq.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.w.a($$1, avo.fk, avq.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.w.a($$1, avo.cW, avq.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.w.a($$1, avo.tQ, avq.f, 0.3F, this.w.A.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.w.a($$1, avo.DR, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.w.a($$1, avo.nq, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.w.a($$1, avo.lB, avq.e, 1.0F, this.w.A.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.w.a($$1, avo.cD, avq.e, 1.0F, this.w.A.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.w.a($$1, avo.yE, avq.e, 1.0F, this.w.A.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.w.a($$1, avo.hw, avq.e, 2.0F, this.w.A.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.w.a($$1, avo.hz, avq.e, 2.0F, this.w.A.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.w.a($$1, avo.hA, avq.e, 2.0F, this.w.A.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.w.a($$1, avo.xx, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.w.a($$1, avo.gg, avq.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.w.a($$1, avo.gh, avq.e, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.w.a($$1, avo.Ed, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1052:
            this.w.a($$1, avo.Ea, avq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1500:
            dgn.a(this.w, $$1, $$2 > 0);
            break;
         case 1501:
            this.w.a($$1, avo.og, avq.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$42 = 0; $$42 < 8; $$42++) {
               this.w.a(lb.V, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.w.a($$1, avo.vQ, avq.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$43 = 0; $$43 < 5; $$43++) {
               double $$44 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$45 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$46 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.w.a(lb.ac, $$44, $$45, $$46, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.w.a($$1, avo.iI, avq.e, 1.0F, 1.0F, false);

            for (int $$47 = 0; $$47 < 16; $$47++) {
               double $$48 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$49 = (double)$$1.v() + 0.8125;
               double $$50 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.w.a(lb.ac, $$48, $$49, $$50, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            dla.a(this.w, $$1, this.w.a_($$1));
            break;
         case 1505:
            cse.a(this.w, $$1, $$2);
            this.w.a($$1, avo.cC, avq.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, lb.ac);
            break;
         case 2001:
            dtc $$9 = dfc.a($$2);
            if (!$$9.i()) {
               dnd $$10 = $$9.w();
               this.w.a($$1, $$10.c(), avq.e, ($$10.a() + 1.0F) / 2.0F, $$10.b() * 0.8F, false);
            }

            this.w.a($$1, $$9);
            break;
         case 2002:
         case 2007:
            this.a($$0, $$1, $$2, $$3);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.a(new kx(lb.Q, new cuh(cuk.tP)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.a(lb.aa, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.a(lb.aa, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$13 = 0; $$13 < 20; $$13++) {
               double $$14 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$15 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$16 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.w.a(lb.ac, $$14, $$15, $$16, 0.0, 0.0, 0.0);
               this.w.a(lb.E, $$14, $$15, $$16, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$51 = 0; $$51 < 200; $$51++) {
               float $$52 = $$3.i() * 4.0F;
               float $$53 = $$3.i() * (float) (Math.PI * 2);
               double $$54 = (double)(aym.b($$53) * $$52);
               double $$55 = 0.01 + $$3.j() * 0.5;
               double $$56 = (double)(aym.a($$53) * $$52);
               gcu $$57 = this.b(lb.h, false, (double)$$1.u() + $$54 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$56 * 0.1, $$54, $$55, $$56);
               if ($$57 != null) {
                  $$57.c($$52);
               }
            }

            if ($$2 == 1) {
               this.w.a($$1, avo.ip, avq.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.w.a(lb.w, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$58 = 0; $$58 < 8; $$58++) {
               this.w.a(lb.e, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2010:
            this.a($$2, $$1, $$3, lb.ad);
            break;
         case 2011:
            ayp.a(this.w, $$1, $$2, lb.M);
            break;
         case 2012:
            ayp.a(this.w, $$1, $$2, lb.M);
            break;
         case 3000:
            this.w.a(lb.v, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.w.a($$1, avo.iH, avq.e, 10.0F, (1.0F + (this.w.A.i() - this.w.A.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.w.a($$1, avo.ir, avq.f, 64.0F, 0.8F + this.w.A.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < iw.a.d.length) {
               ayp.a(iw.a.d[$$2], this.w, $$1, 0.125, lb.aU, bpl.a(10, 19));
            } else {
               ayp.a(this.w, $$1, lb.aU, bpl.a(3, 5));
            }
            break;
         case 3003:
            ayp.a(this.w, $$1, lb.aS, bpl.a(3, 5));
            this.w.a($$1, avo.mS, avq.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            ayp.a(this.w, $$1, lb.aT, bpl.a(3, 5));
            break;
         case 3005:
            ayp.a(this.w, $$1, lb.aV, bpl.a(3, 5));
            break;
         case 3006:
            int $$18 = $$2 >> 6;
            if ($$18 > 0) {
               if ($$3.i() < 0.3F + (float)$$18 * 0.1F) {
                  float $$19 = 0.15F + 0.02F * (float)$$18 * (float)$$18 * $$3.i();
                  float $$20 = 0.4F + 0.3F * (float)$$18 * $$3.i();
                  this.w.a($$1, avo.wp, avq.e, $$19, $$20, false);
               }

               byte $$21 = (byte)($$2 & 63);
               bpf $$22 = bpl.a(0, $$18);
               float $$23 = 0.005F;
               Supplier<ewu> $$24 = () -> new ewu(aym.a($$3, -0.005F, 0.005F), aym.a($$3, -0.005F, 0.005F), aym.a($$3, -0.005F, 0.005F));
               if ($$21 == 0) {
                  for (iw $$25 : iw.values()) {
                     float $$26 = $$25 == iw.a ? (float) Math.PI : 0.0F;
                     double $$27 = $$25.o() == iw.a.b ? 0.65 : 0.57;
                     ayp.a(this.w, $$1, new lc($$26), $$22, $$25, $$24, $$27);
                  }
               } else {
                  for (iw $$28 : dkh.a($$21)) {
                     float $$29 = $$28 == iw.b ? (float) Math.PI : 0.0F;
                     double $$30 = 0.35;
                     ayp.a(this.w, $$1, new lc($$29), $$22, $$28, $$24, 0.35);
                  }
               }
            } else {
               this.w.a($$1, avo.wp, avq.e, 1.0F, 1.0F, false);
               boolean $$31 = this.w.a_($$1).r(this.w, $$1);
               int $$32 = $$31 ? 40 : 20;
               float $$33 = $$31 ? 0.45F : 0.25F;
               float $$34 = 0.07F;

               for (int $$35 = 0; $$35 < $$32; $$35++) {
                  float $$36 = 2.0F * $$3.i() - 1.0F;
                  float $$37 = 2.0F * $$3.i() - 1.0F;
                  float $$38 = 2.0F * $$3.i() - 1.0F;
                  this.w
                     .a(
                        lb.I,
                        (double)$$1.u() + 0.5 + (double)($$36 * $$33),
                        (double)$$1.v() + 0.5 + (double)($$37 * $$33),
                        (double)$$1.w() + 0.5 + (double)($$38 * $$33),
                        (double)($$36 * 0.07F),
                        (double)($$37 * 0.07F),
                        (double)($$38 * 0.07F)
                     );
               }
            }
            break;
         case 3007:
            for (int $$39 = 0; $$39 < 10; $$39++) {
               this.w.a(new ld($$39 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + dmk.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dtc $$40 = this.w.a_($$1);
            boolean $$41 = $$40.b(dts.C) && $$40.c(dts.C);
            if (!$$41) {
               this.w.a((double)$$1.u() + 0.5, (double)$$1.v() + dmk.f, (double)$$1.w() + 0.5, avo.wM, avq.e, 2.0F, 0.6F + this.w.A.i() * 0.4F, false);
            }
            break;
         case 3008:
            dtc $$11 = dfc.a($$2);
            if ($$11.b() instanceof dfh $$12) {
               this.w.a($$1, $$12.d(), avq.h, 1.0F, 1.0F, false);
            }

            this.w.a($$1, $$11);
            break;
         case 3009:
            ayp.a(this.w, $$1, lb.aX, bpl.a(3, 6));
            break;
         case 3011:
            dsf.a(this.w, $$1, $$3);
            break;
         case 3012:
            this.w.a($$1, avo.mx, avq.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dsf.a(this.w, $$1, $$3);
            break;
         case 3013:
            this.w.a($$1, avo.my, avq.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dsf.a(this.w, $$1, $$3, $$2);
            break;
         case 3014:
            this.w.a($$1, avo.mC, avq.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dsf.b(this.w, $$1, $$3);
            break;
         case 3015:
            if (this.w.c_($$1) instanceof dsk $$17) {
               dsk.a.a(this.w, $$17.az_(), $$17.n(), $$17.c());
               this.w.a($$1, avo.AV, avq.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            dsk.a.a(this.w, $$1);
            this.w.a($$1, avo.AZ, avq.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dsf.b(this.w, $$1, $$3);
      }
   }

   private void a(int $$0, ir $$1, int $$2, ayt $$3) {
      ewu $$4 = ewu.c($$1);

      for (int $$5 = 0; $$5 < 8; $$5++) {
         this.a(new kx(lb.Q, new cuh(cuk.wZ)), $$4.c, $$4.d, $$4.e, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
      }

      float $$6 = (float)($$2 >> 16 & 0xFF) / 255.0F;
      float $$7 = (float)($$2 >> 8 & 0xFF) / 255.0F;
      float $$8 = (float)($$2 >> 0 & 0xFF) / 255.0F;
      kz $$9 = $$0 == 2007 ? lb.P : lb.p;

      for (int $$10 = 0; $$10 < 100; $$10++) {
         double $$11 = $$3.j() * 4.0;
         double $$12 = $$3.j() * Math.PI * 2.0;
         double $$13 = Math.cos($$12) * $$11;
         double $$14 = 0.01 + $$3.j() * 0.5;
         double $$15 = Math.sin($$12) * $$11;
         gcu $$16 = this.b($$9, $$9.a().b(), $$4.c + $$13 * 0.1, $$4.d + 0.3, $$4.e + $$15 * 0.1, $$13, $$14, $$15);
         if ($$16 != null) {
            float $$17 = 0.75F + $$3.i() * 0.25F;
            $$16.a($$6 * $$17, $$7 * $$17, $$8 * $$17);
            $$16.c((float)$$11);
         }
      }

      this.w.a($$1, avo.zk, avq.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
   }

   public void c(int $$0, ir $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         apz $$4 = (apz)this.I.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new apz($$0, $$1);
            this.I.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.H);
         ((SortedSet)this.J.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         apz $$3 = (apz)this.I.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean q() {
      return this.ag.h();
   }

   public void a(dbh $$0) {
      this.x.a($$0);
   }

   public void r() {
      this.x.a();
      this.E = true;
   }

   public void a(Collection<dqc> $$0, Collection<dqc> $$1) {
      synchronized (this.z) {
         this.z.removeAll($$0);
         this.z.addAll($$1);
      }
   }

   public static int a(dbd $$0, ir $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(dbd $$0, dtc $$1, ir $$2) {
      if ($$1.e($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(dcj.a, $$2);
         int $$4 = $$0.a(dcj.b, $$2);
         int $$5 = $$1.h();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(ir $$0) {
      gig.b $$1 = this.A.a($$0);
      return $$1 != null && $$1.c.get() != gig.a.a;
   }

   @Nullable
   public ezo s() {
      return this.L;
   }

   @Nullable
   public ezo t() {
      return this.N;
   }

   @Nullable
   public ezo u() {
      return this.O;
   }

   @Nullable
   public ezo v() {
      return this.P;
   }

   @Nullable
   public ezo w() {
      return this.Q;
   }

   @Nullable
   public ezo x() {
      return this.R;
   }

   private void a(int $$0, ir $$1, ayt $$2, le $$3) {
      iw $$4 = iw.a($$0);
      int $$5 = $$4.j();
      int $$6 = $$4.k();
      int $$7 = $$4.l();
      double $$8 = (double)$$1.u() + (double)$$5 * 0.6 + 0.5;
      double $$9 = (double)$$1.v() + (double)$$6 * 0.6 + 0.5;
      double $$10 = (double)$$1.w() + (double)$$7 * 0.6 + 0.5;

      for (int $$11 = 0; $$11 < 10; $$11++) {
         double $$12 = $$2.j() * 0.2 + 0.01;
         double $$13 = $$8 + (double)$$5 * 0.01 + ($$2.j() - 0.5) * (double)$$7 * 0.5;
         double $$14 = $$9 + (double)$$6 * 0.01 + ($$2.j() - 0.5) * (double)$$6 * 0.5;
         double $$15 = $$10 + (double)$$7 * 0.01 + ($$2.j() - 0.5) * (double)$$5 * 0.5;
         double $$16 = (double)$$5 * $$12 + $$2.k() * 0.01;
         double $$17 = (double)$$6 * $$12 + $$2.k() * 0.01;
         double $$18 = (double)$$7 * $$12 + $$2.k() * 0.01;
         this.a($$3, $$13, $$14, $$15, $$16, $$17, $$18);
      }
   }

   public static class a extends RuntimeException {
      public a(String $$0, Throwable $$1) {
         super($$0, $$1);
      }
   }
}
