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

public class ged implements atx, AutoCloseable {
   private static final Logger e = LogUtils.getLogger();
   public static final int a = 16;
   public static final int b = 8;
   private static final float f = 512.0F;
   private static final int g = 32;
   private static final int h = 10;
   private static final int i = 21;
   private static final int j = 15;
   private static final akk k = new akk("textures/environment/moon_phases.png");
   private static final akk l = new akk("textures/environment/sun.png");
   protected static final akk c = new akk("textures/environment/clouds.png");
   private static final akk m = new akk("textures/environment/end_sky.png");
   private static final akk n = new akk("textures/misc/forcefield.png");
   private static final akk o = new akk("textures/environment/rain.png");
   private static final akk p = new akk("textures/environment/snow.png");
   public static final jf[] d = jf.values();
   private final ffw q;
   private final gjm r;
   private final gge s;
   private final gel t;
   @Nullable
   private fyl u;
   private final ges v = new ges();
   private final ObjectArrayList<ghf.b> w = new ObjectArrayList(10000);
   private final Set<dpq> x = Sets.newHashSet();
   @Nullable
   private gew y;
   @Nullable
   private far z;
   @Nullable
   private far A;
   @Nullable
   private far B;
   private boolean C = true;
   @Nullable
   private far D;
   private final geo E = new geo(100);
   private int F;
   private final Int2ObjectMap<app> G = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<app>> H = new Long2ObjectOpenHashMap();
   private final Map<ja, gte> I = Maps.newHashMap();
   @Nullable
   private eza J;
   @Nullable
   private gei K;
   @Nullable
   private eza L;
   @Nullable
   private eza M;
   @Nullable
   private eza N;
   @Nullable
   private eza O;
   @Nullable
   private eza P;
   @Nullable
   private gei Q;
   private int R = Integer.MIN_VALUE;
   private int S = Integer.MIN_VALUE;
   private int T = Integer.MIN_VALUE;
   private double U = Double.MIN_VALUE;
   private double V = Double.MIN_VALUE;
   private double W = Double.MIN_VALUE;
   private double X = Double.MIN_VALUE;
   private double Y = Double.MIN_VALUE;
   private int Z = Integer.MIN_VALUE;
   private int aa = Integer.MIN_VALUE;
   private int ab = Integer.MIN_VALUE;
   private ewh ac = ewh.b;
   @Nullable
   private ffj ad;
   @Nullable
   private ghf ae;
   private int af = -1;
   private int ag;
   private int ah;
   private ghj ai;
   private boolean aj;
   @Nullable
   private ghj ak;
   private final Vector4f[] al = new Vector4f[8];
   private final Vector3d am = new Vector3d(0.0, 0.0, 0.0);
   private double an;
   private double ao;
   private double ap;
   private int aq;
   private final float[] ar = new float[1024];
   private final float[] as = new float[1024];

   public ged(ffw $$0, gjm $$1, gge $$2, gel $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;

      for (int $$4 = 0; $$4 < 32; $$4++) {
         for (int $$5 = 0; $$5 < 32; $$5++) {
            float $$6 = (float)($$5 - 16);
            float $$7 = (float)($$4 - 16);
            float $$8 = ayg.c($$6 * $$6 + $$7 * $$7);
            this.ar[$$4 << 5 | $$5] = -$$7 / $$8;
            this.as[$$4 << 5 | $$5] = $$6 / $$8;
         }
      }

      this.C();
      this.B();
      this.A();
   }

   private void a(gee $$0, float $$1, double $$2, double $$3, double $$4) {
      float $$5 = this.q.r.d($$1);
      if (!($$5 <= 0.0F)) {
         $$0.c();
         dcg $$6 = this.q.r;
         int $$7 = ayg.a($$2);
         int $$8 = ayg.a($$3);
         int $$9 = ayg.a($$4);
         faq $$10 = faq.b();
         faj $$11 = $$10.d();
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         int $$12 = 5;
         if (ffw.N()) {
            $$12 = 10;
         }

         RenderSystem.depthMask(ffw.O());
         int $$13 = -1;
         float $$14 = (float)this.F + $$1;
         RenderSystem.setShader(gdy::t);
         ja.a $$15 = new ja.a();

         for (int $$16 = $$9 - $$12; $$16 <= $$9 + $$12; $$16++) {
            for (int $$17 = $$7 - $$12; $$17 <= $$7 + $$12; $$17++) {
               int $$18 = ($$16 - $$9 + 16) * 32 + $$17 - $$7 + 16;
               double $$19 = (double)this.ar[$$18] * 0.5;
               double $$20 = (double)this.as[$$18] * 0.5;
               $$15.b((double)$$17, $$3, (double)$$16);
               ddg $$21 = $$6.t($$15).a();
               if ($$21.c()) {
                  int $$22 = $$6.a(dyg.a.e, $$17, $$16);
                  int $$23 = $$8 - $$12;
                  int $$24 = $$8 + $$12;
                  if ($$23 < $$22) {
                     $$23 = $$22;
                  }

                  if ($$24 < $$22) {
                     $$24 = $$22;
                  }

                  int $$25 = $$22;
                  if ($$22 < $$8) {
                     $$25 = $$8;
                  }

                  if ($$23 != $$24) {
                     ayo $$26 = ayo.a((long)($$17 * $$17 * 3121 + $$17 * 45238971 ^ $$16 * $$16 * 418711 + $$16 * 13761));
                     $$15.d($$17, $$23, $$16);
                     ddg.c $$27 = $$21.a($$15);
                     if ($$27 == ddg.c.b) {
                        if ($$13 != 0) {
                           if ($$13 >= 0) {
                              $$10.c();
                           }

                           $$13 = 0;
                           RenderSystem.setShaderTexture(0, o);
                           $$11.a(fat.b.h, fam.l);
                        }

                        int $$28 = this.F & 131071;
                        int $$29 = $$17 * $$17 * 3121 + $$17 * 45238971 + $$16 * $$16 * 418711 + $$16 * 13761 & 0xFF;
                        float $$30 = 3.0F + $$26.i();
                        float $$31 = -((float)($$28 + $$29) + $$1) / 32.0F * $$30;
                        float $$32 = $$31 % 32.0F;
                        double $$33 = (double)$$17 + 0.5 - $$2;
                        double $$34 = (double)$$16 + 0.5 - $$4;
                        float $$35 = (float)Math.sqrt($$33 * $$33 + $$34 * $$34) / (float)$$12;
                        float $$36 = ((1.0F - $$35 * $$35) * 0.5F + 0.5F) * $$5;
                        $$15.d($$17, $$25, $$16);
                        int $$37 = a($$6, $$15);
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F, (float)$$23 * 0.25F + $$32)
                           .a(1.0F, 1.0F, 1.0F, $$36)
                           .b($$37)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F, (float)$$23 * 0.25F + $$32)
                           .a(1.0F, 1.0F, 1.0F, $$36)
                           .b($$37)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F, (float)$$24 * 0.25F + $$32)
                           .a(1.0F, 1.0F, 1.0F, $$36)
                           .b($$37)
                           .e();
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F, (float)$$24 * 0.25F + $$32)
                           .a(1.0F, 1.0F, 1.0F, $$36)
                           .b($$37)
                           .e();
                     } else if ($$27 == ddg.c.c) {
                        if ($$13 != 1) {
                           if ($$13 >= 0) {
                              $$10.c();
                           }

                           $$13 = 1;
                           RenderSystem.setShaderTexture(0, p);
                           $$11.a(fat.b.h, fam.l);
                        }

                        float $$38 = -((float)(this.F & 511) + $$1) / 512.0F;
                        float $$39 = (float)($$26.j() + (double)$$14 * 0.01 * (double)((float)$$26.k()));
                        float $$40 = (float)($$26.j() + (double)($$14 * (float)$$26.k()) * 0.001);
                        double $$41 = (double)$$17 + 0.5 - $$2;
                        double $$42 = (double)$$16 + 0.5 - $$4;
                        float $$43 = (float)Math.sqrt($$41 * $$41 + $$42 * $$42) / (float)$$12;
                        float $$44 = ((1.0F - $$43 * $$43) * 0.3F + 0.5F) * $$5;
                        $$15.d($$17, $$25, $$16);
                        int $$45 = a($$6, $$15);
                        int $$46 = $$45 >> 16 & 65535;
                        int $$47 = $$45 & 65535;
                        int $$48 = ($$46 * 3 + 240) / 4;
                        int $$49 = ($$47 * 3 + 240) / 4;
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F + $$39, (float)$$23 * 0.25F + $$38 + $$40)
                           .a(1.0F, 1.0F, 1.0F, $$44)
                           .b($$49, $$48)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$24 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F + $$39, (float)$$23 * 0.25F + $$38 + $$40)
                           .a(1.0F, 1.0F, 1.0F, $$44)
                           .b($$49, $$48)
                           .e();
                        $$11.a((double)$$17 - $$2 + $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 + $$20 + 0.5)
                           .a(1.0F + $$39, (float)$$24 * 0.25F + $$38 + $$40)
                           .a(1.0F, 1.0F, 1.0F, $$44)
                           .b($$49, $$48)
                           .e();
                        $$11.a((double)$$17 - $$2 - $$19 + 0.5, (double)$$23 - $$3, (double)$$16 - $$4 - $$20 + 0.5)
                           .a(0.0F + $$39, (float)$$24 * 0.25F + $$38 + $$40)
                           .a(1.0F, 1.0F, 1.0F, $$44)
                           .b($$49, $$48)
                           .e();
                     }
                  }
               }
            }
         }

         if ($$13 >= 0) {
            $$10.c();
         }

         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         $$0.b();
      }
   }

   public void a(ffg $$0) {
      float $$1 = this.q.r.d(1.0F) / (ffw.N() ? 1.0F : 2.0F);
      if (!($$1 <= 0.0F)) {
         ayo $$2 = ayo.a((long)this.F * 312987231L);
         dcj $$3 = this.q.r;
         ja $$4 = ja.a($$0.b());
         ja $$5 = null;
         int $$6 = (int)(100.0F * $$1 * $$1) / (this.q.m.ar().c() == fgb.b ? 2 : 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            int $$8 = $$2.a(21) - 10;
            int $$9 = $$2.a(21) - 10;
            ja $$10 = $$3.a(dyg.a.e, $$4.b($$8, 0, $$9));
            if ($$10.v() > $$3.I_() && $$10.v() <= $$4.v() + 10 && $$10.v() >= $$4.v() - 10) {
               ddg $$11 = $$3.t($$10).a();
               if ($$11.a($$10) == ddg.c.b) {
                  $$5 = $$10.d();
                  if (this.q.m.ar().c() == fgb.c) {
                     break;
                  }

                  double $$12 = $$2.j();
                  double $$13 = $$2.j();
                  dsl $$14 = $$3.a_($$5);
                  eoj $$15 = $$3.b_($$5);
                  exa $$16 = $$14.k($$3, $$5);
                  double $$17 = $$16.b(jf.a.b, $$12, $$13);
                  double $$18 = (double)$$15.a($$3, $$5);
                  double $$19 = Math.max($$17, $$18);
                  lh $$20 = !$$15.a(awc.b) && !$$14.a(dfk.kJ) && !dfw.g($$14) ? lj.ad : lj.ae;
                  this.q.r.a($$20, (double)$$5.u() + $$12, (double)$$5.v() + $$19, (double)$$5.w() + $$13, 0.0, 0.0, 0.0);
               }
            }
         }

         if ($$5 != null && $$2.a(3) < this.aq++) {
            this.aq = 0;
            if ($$5.v() > $$4.v() + 1 && $$3.a(dyg.a.e, $$4).v() > ayg.d((float)$$4.v())) {
               this.q.r.a($$5, avh.Cd, avi.d, 0.1F, 0.5F, false);
            } else {
               this.q.r.a($$5, avh.Cc, avi.d, 0.2F, 1.0F, false);
            }
         }
      }
   }

   @Override
   public void close() {
      if (this.K != null) {
         this.K.close();
      }

      if (this.Q != null) {
         this.Q.close();
      }
   }

   @Override
   public void a(atw $$0) {
      this.a();
      if (ffw.O()) {
         this.y();
      }
   }

   public void a() {
      if (this.K != null) {
         this.K.close();
      }

      akk $$0 = new akk("shaders/post/entity_outline.json");

      try {
         this.K = new gei(this.q.aa(), this.q.ab(), this.q.h(), $$0);
         this.K.a(this.q.aM().k(), this.q.aM().l());
         this.J = this.K.a("final");
      } catch (IOException var3) {
         e.warn("Failed to load shader: {}", $$0, var3);
         this.K = null;
         this.J = null;
      } catch (JsonSyntaxException var4) {
         e.warn("Failed to parse shader: {}", $$0, var4);
         this.K = null;
         this.J = null;
      }
   }

   private void y() {
      this.z();
      akk $$0 = new akk("shaders/post/transparency.json");

      try {
         gei $$1 = new gei(this.q.aa(), this.q.ab(), this.q.h(), $$0);
         $$1.a(this.q.aM().k(), this.q.aM().l());
         eza $$2 = $$1.a("translucent");
         eza $$3 = $$1.a("itemEntity");
         eza $$4 = $$1.a("particles");
         eza $$5 = $$1.a("weather");
         eza $$6 = $$1.a("clouds");
         this.Q = $$1;
         this.L = $$2;
         this.M = $$3;
         this.N = $$4;
         this.O = $$5;
         this.P = $$6;
      } catch (Exception var8) {
         String $$8 = var8 instanceof JsonSyntaxException ? "parse" : "load";
         String $$9 = "Failed to " + $$8 + " shader: " + $$0;
         ged.a $$10 = new ged.a($$9, var8);
         if (this.q.ac().d().size() > 1) {
            wu $$11 = this.q.ab().b().findFirst().map($$0x -> wu.b($$0x.b())).orElse(null);
            this.q.m.j().a(ffp.b);
            this.q.a($$10, $$11, null);
         } else {
            this.q.m.j().a(ffp.b);
            this.q.m.av();
            e.error(LogUtils.FATAL_MARKER, $$9, $$10);
            this.q.c(new o($$9, $$10));
         }
      }
   }

   private void z() {
      if (this.Q != null) {
         this.Q.close();
         this.L.a();
         this.M.a();
         this.N.a();
         this.O.a();
         this.P.a();
         this.Q = null;
         this.L = null;
         this.M = null;
         this.N = null;
         this.O = null;
         this.P = null;
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
         this.J.c(this.q.aM().k(), this.q.aM().l(), false);
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.q.j.a() && this.J != null && this.K != null && this.q.s != null;
   }

   private void A() {
      faq $$0 = faq.b();
      faj $$1 = $$0.d();
      if (this.B != null) {
         this.B.close();
      }

      this.B = new far(far.a.a);
      faj.b $$2 = a($$1, -16.0F);
      this.B.a();
      this.B.a($$2);
      far.b();
   }

   private void B() {
      faq $$0 = faq.b();
      faj $$1 = $$0.d();
      if (this.A != null) {
         this.A.close();
      }

      this.A = new far(far.a.a);
      faj.b $$2 = a($$1, 16.0F);
      this.A.a();
      this.A.a($$2);
      far.b();
   }

   private static faj.b a(faj $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      float $$3 = 512.0F;
      RenderSystem.setShader(gdy::o);
      $$0.a(fat.b.g, fam.m);
      $$0.a(0.0, (double)$$1, 0.0).e();

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$0.a((double)($$2 * ayg.b((float)$$4 * (float) (Math.PI / 180.0))), (double)$$1, (double)(512.0F * ayg.a((float)$$4 * (float) (Math.PI / 180.0))))
            .e();
      }

      return $$0.d();
   }

   private void C() {
      faq $$0 = faq.b();
      faj $$1 = $$0.d();
      RenderSystem.setShader(gdy::o);
      if (this.z != null) {
         this.z.close();
      }

      this.z = new far(far.a.a);
      faj.b $$2 = this.a($$1);
      this.z.a();
      this.z.a($$2);
      far.b();
   }

   private faj.b a(faj $$0) {
      ayo $$1 = ayo.a(10842L);
      $$0.a(fat.b.h, fam.m);

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

   public void a(@Nullable fyl $$0) {
      this.R = Integer.MIN_VALUE;
      this.S = Integer.MIN_VALUE;
      this.T = Integer.MIN_VALUE;
      this.r.a($$0);
      this.u = $$0;
      if ($$0 != null) {
         this.f();
      } else {
         if (this.y != null) {
            this.y.a();
            this.y = null;
         }

         if (this.ae != null) {
            this.ae.i();
         }

         this.ae = null;
         this.x.clear();
         this.v.a(null);
         this.w.clear();
      }
   }

   public void e() {
      if (ffw.O()) {
         this.y();
      } else {
         this.z();
      }
   }

   public void f() {
      if (this.u != null) {
         this.e();
         this.u.g();
         if (this.ae == null) {
            this.ae = new ghf(this.u, this, ac.g(), this.t);
         } else {
            this.ae.a(this.u);
         }

         this.C = true;
         gea.a(ffw.N());
         this.af = this.q.m.aD();
         if (this.y != null) {
            this.y.a();
         }

         this.ae.g();
         synchronized (this.x) {
            this.x.clear();
         }

         this.y = new gew(this.ae, this.u, this.q.m.aD(), this);
         this.v.a(this.y);
         this.w.clear();
         bsh $$0 = this.q.an();
         if ($$0 != null) {
            this.y.a($$0.dw(), $$0.dC());
         }
      }
   }

   public void a(int $$0, int $$1) {
      this.r();
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      if (this.Q != null) {
         this.Q.a($$0, $$1);
      }
   }

   public String g() {
      int $$0 = this.y.f.length;
      int $$1 = this.k();
      return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.q.D ? "(s) " : "", this.af, this.ae == null ? "null" : this.ae.a());
   }

   public ghf h() {
      return this.ae;
   }

   public double i() {
      return (double)this.y.f.length;
   }

   public double j() {
      return (double)this.af;
   }

   public int k() {
      int $$0 = 0;
      ObjectListIterator var2 = this.w.iterator();

      while (var2.hasNext()) {
         ghf.b $$1 = (ghf.b)var2.next();
         if (!$$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String l() {
      return "E: " + this.ag + "/" + this.u.h() + ", B: " + this.ah + ", SD: " + this.u.m();
   }

   private void a(ffg $$0, ghj $$1, boolean $$2, boolean $$3) {
      ewh $$4 = $$0.b();
      if (this.q.m.aD() != this.af) {
         this.f();
      }

      this.u.ag().a("camera");
      double $$5 = this.q.s.dw();
      double $$6 = this.q.s.dy();
      double $$7 = this.q.s.dC();
      int $$8 = kc.a($$5);
      int $$9 = kc.a($$6);
      int $$10 = kc.a($$7);
      if (this.R != $$8 || this.S != $$9 || this.T != $$10) {
         this.R = $$8;
         this.S = $$9;
         this.T = $$10;
         this.y.a($$5, $$7);
      }

      this.ae.a($$4);
      this.u.ag().b("cull");
      this.q.aH().b("culling");
      ja $$11 = $$0.c();
      double $$12 = Math.floor($$4.c / 8.0);
      double $$13 = Math.floor($$4.d / 8.0);
      double $$14 = Math.floor($$4.e / 8.0);
      if ($$12 != this.U || $$13 != this.V || $$14 != this.W) {
         this.v.a();
      }

      this.U = $$12;
      this.V = $$13;
      this.W = $$14;
      this.q.aH().b("update");
      if (!$$2) {
         boolean $$15 = this.q.D;
         if ($$3 && this.u.a_($$11).i(this.u, $$11)) {
            $$15 = false;
         }

         bsh.b(ayg.a((double)this.q.m.aD() / 8.0, 1.0, 2.5) * this.q.m.g().c());
         this.q.aH().a("section_occlusion_graph");
         this.v.a($$15, $$0, $$1, this.w);
         this.q.aH().c();
         double $$16 = Math.floor((double)($$0.d() / 2.0F));
         double $$17 = Math.floor((double)($$0.e() / 2.0F));
         if (this.v.b() || $$16 != this.X || $$17 != this.Y) {
            this.b(a($$1));
            this.X = $$16;
            this.Y = $$17;
         }
      }

      this.q.aH().c();
   }

   public static ghj a(ghj $$0) {
      return new ghj($$0).a(8);
   }

   private void b(ghj $$0) {
      if (!ffw.Q().bx()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.q.aH().a("apply_frustum");
         this.w.clear();
         this.v.a($$0, this.w);
         this.q.aH().c();
      }
   }

   public void a(ghf.b $$0) {
      this.v.a($$0);
   }

   private void a(Matrix4f $$0, Matrix4f $$1, double $$2, double $$3, double $$4, ghj $$5) {
      this.ak = $$5;
      Matrix4f $$6 = new Matrix4f($$1);
      $$6.mul($$0);
      $$6.invert();
      this.am.x = $$2;
      this.am.y = $$3;
      this.am.z = $$4;
      this.al[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
      this.al[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
      this.al[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
      this.al[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
      this.al[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
      this.al[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
      this.al[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.al[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);

      for (int $$7 = 0; $$7 < 8; $$7++) {
         $$6.transform(this.al[$$7]);
         this.al[$$7].div(this.al[$$7].w());
      }
   }

   public void a(ewh $$0, Matrix4f $$1, Matrix4f $$2) {
      this.ai = new ghj($$1, $$2);
      this.ai.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(ffn $$0, boolean $$1, ffg $$2, gdy $$3, gee $$4, Matrix4f $$5, Matrix4f $$6) {
      bqs $$7 = this.q.r.s();
      float $$8 = $$0.a(false);
      RenderSystem.setShaderGameTime(this.u.Z(), $$8);
      this.s.a(this.u, $$2, this.q.v);
      this.r.a(this.u, $$2, this.q.u);
      bmv $$9 = this.u.ag();
      $$9.b("light_update_queue");
      this.u.b();
      $$9.b("light_updates");
      this.u.i().p().a();
      ewh $$10 = $$2.b();
      double $$11 = $$10.a();
      double $$12 = $$10.b();
      double $$13 = $$10.c();
      $$9.b("culling");
      boolean $$14 = this.ak != null;
      ghj $$15;
      if ($$14) {
         $$15 = this.ak;
         $$15.a(this.am.x, this.am.y, this.am.z);
      } else {
         $$15 = this.ai;
      }

      this.q.aH().b("captureFrustum");
      if (this.aj) {
         this.a($$5, $$6, $$10.c, $$10.d, $$10.e, $$14 ? new ghj($$5, $$6) : $$15);
         this.aj = false;
      }

      $$9.b("clear");
      gdx.a($$2, $$8, this.q.r, this.q.m.aD(), $$3.c($$8));
      gdx.b();
      RenderSystem.clear(16640, ffw.a);
      float $$17 = $$3.k();
      boolean $$18 = this.q.r.d().a(ayg.a($$11), ayg.a($$12)) || this.q.l.j().d();
      $$9.b("sky");
      RenderSystem.setShader(gdy::o);
      this.a($$5, $$6, $$8, $$2, $$18, () -> gdx.a($$2, gdx.d.a, $$17, $$18, $$8));
      $$9.b("fog");
      gdx.a($$2, gdx.d.b, Math.max($$17, 32.0F), $$18, $$8);
      $$9.b("terrain_setup");
      this.a($$2, $$15, $$14, this.q.s.N_());
      $$9.b("compile_sections");
      this.c($$2);
      $$9.b("terrain");
      this.a(gen.c(), $$11, $$12, $$13, $$5, $$6);
      this.a(gen.d(), $$11, $$12, $$13, $$5, $$6);
      this.a(gen.e(), $$11, $$12, $$13, $$5, $$6);
      if (this.u.d().e()) {
         ezk.a();
      } else {
         ezk.b();
      }

      $$9.b("entities");
      this.ag = 0;
      this.ah = 0;
      if (this.M != null) {
         this.M.b(ffw.a);
         this.M.a(this.q.h());
         this.q.h().a(false);
      }

      if (this.O != null) {
         this.O.b(ffw.a);
      }

      if (this.d()) {
         this.J.b(ffw.a);
         this.q.h().a(false);
      }

      Matrix4fStack $$19 = RenderSystem.getModelViewStack();
      $$19.pushMatrix();
      $$19.mul($$5);
      RenderSystem.applyModelViewMatrix();
      boolean $$20 = false;
      fao $$21 = new fao();
      gef.a $$22 = this.t.c();

      for (bsh $$23 : this.u.e()) {
         if (this.r.a($$23, $$15, $$11, $$12, $$13) || $$23.z(this.q.s)) {
            ja $$24 = $$23.dr();
            if ((this.u.d($$24.v()) || this.a($$24))
               && ($$23 != $$2.g() || $$2.i() || $$2.g() instanceof btc && ((btc)$$2.g()).fJ())
               && (!($$23 instanceof gdh) || $$2.g() == $$23)) {
               this.ag++;
               if ($$23.ai == 0) {
                  $$23.ad = $$23.dw();
                  $$23.ae = $$23.dy();
                  $$23.af = $$23.dC();
               }

               gef $$26;
               if (this.d() && this.q.b($$23)) {
                  $$20 = true;
                  geg $$25 = this.t.e();
                  $$26 = $$25;
                  int $$27 = $$23.q_();
                  $$25.a(axq.b.b($$27), axq.b.c($$27), axq.b.d($$27), 255);
               } else {
                  $$26 = $$22;
               }

               float $$29 = $$0.a(!$$7.a($$23));
               this.a($$23, $$11, $$12, $$13, $$29, $$21, $$26);
            }
         }
      }

      $$22.a();
      this.a($$21);
      $$22.a(gen.c(gpp.e));
      $$22.a(gen.d(gpp.e));
      $$22.a(gen.e(gpp.e));
      $$22.a(gen.k(gpp.e));
      $$9.b("blockentities");
      ObjectListIterator var40 = this.w.iterator();

      while (var40.hasNext()) {
         ghf.b $$30 = (ghf.b)var40.next();
         List<dpq> $$31 = $$30.d().b();
         if (!$$31.isEmpty()) {
            for (dpq $$32 : $$31) {
               ja $$33 = $$32.az_();
               gef $$34 = $$22;
               $$21.a();
               $$21.a((double)$$33.u() - $$11, (double)$$33.v() - $$12, (double)$$33.w() - $$13);
               SortedSet<app> $$35 = (SortedSet<app>)this.H.get($$33.a());
               if ($$35 != null && !$$35.isEmpty()) {
                  int $$36 = $$35.last().c();
                  if ($$36 >= 0) {
                     fao.a $$37 = $$21.c();
                     fas $$38 = new fap(this.t.d().getBuffer(grw.l.get($$36)), $$37, 1.0F);
                     $$34 = $$2x -> {
                        fas $$3x = $$22.getBuffer($$2x);
                        return $$2x.N() ? fav.a($$38, $$3x) : $$3x;
                     };
                  }
               }

               this.s.a($$32, $$8, $$21, $$34);
               $$21.b();
            }
         }
      }

      synchronized (this.x) {
         for (dpq $$39 : this.x) {
            ja $$40 = $$39.az_();
            $$21.a();
            $$21.a((double)$$40.u() - $$11, (double)$$40.v() - $$12, (double)$$40.w() - $$13);
            this.s.a($$39, $$8, $$21, $$22);
            $$21.b();
         }
      }

      this.a($$21);
      $$22.a(gen.c());
      $$22.a(gen.u());
      $$22.a(gen.v());
      $$22.a(geu.h());
      $$22.a(geu.i());
      $$22.a(geu.c());
      $$22.a(geu.d());
      $$22.a(geu.e());
      $$22.a(geu.f());
      $$22.a(geu.g());
      this.t.e().a();
      if ($$20) {
         this.K.a($$0.a());
         this.q.h().a(false);
      }

      $$9.b("destroyProgress");
      ObjectIterator var42 = this.H.long2ObjectEntrySet().iterator();

      while (var42.hasNext()) {
         Entry<SortedSet<app>> $$41 = (Entry<SortedSet<app>>)var42.next();
         ja $$42 = ja.d($$41.getLongKey());
         double $$43 = (double)$$42.u() - $$11;
         double $$44 = (double)$$42.v() - $$12;
         double $$45 = (double)$$42.w() - $$13;
         if (!($$43 * $$43 + $$44 * $$44 + $$45 * $$45 > 1024.0)) {
            SortedSet<app> $$46 = (SortedSet<app>)$$41.getValue();
            if ($$46 != null && !$$46.isEmpty()) {
               int $$47 = $$46.last().c();
               $$21.a();
               $$21.a((double)$$42.u() - $$11, (double)$$42.v() - $$12, (double)$$42.w() - $$13);
               fao.a $$48 = $$21.c();
               fas $$49 = new fap(this.t.d().getBuffer(grw.l.get($$47)), $$48, 1.0F);
               this.q.ao().a(this.u.a_($$42), $$42, this.u, $$21, $$49);
               $$21.b();
            }
         }
      }

      this.a($$21);
      ewf $$50 = this.q.v;
      if ($$1 && $$50 != null && $$50.c() == ewf.a.b) {
         $$9.b("outline");
         ja $$51 = ((ewd)$$50).a();
         dsl $$52 = this.u.a_($$51);
         if (!$$52.i() && this.u.C_().a($$51)) {
            fas $$53 = $$22.getBuffer(gen.y());
            this.a($$21, $$53, $$2.g(), $$11, $$12, $$13, $$51, $$52);
         }
      }

      this.q.k.a($$21, $$22, $$11, $$12, $$13);
      $$22.a();
      $$22.a(geu.k());
      $$22.a(geu.a());
      $$22.a(geu.b());
      $$22.a(gen.j());
      $$22.a(gen.k());
      $$22.a(gen.m());
      $$22.a(gen.n());
      $$22.a(gen.l());
      $$22.a(gen.o());
      $$22.a(gen.p());
      $$22.a(gen.i());
      this.t.d().b();
      if (this.Q != null) {
         $$22.a(gen.y());
         $$22.b();
         this.L.b(ffw.a);
         this.L.a(this.q.h());
         $$9.b("translucent");
         this.a(gen.f(), $$11, $$12, $$13, $$5, $$6);
         $$9.b("string");
         this.a(gen.t(), $$11, $$12, $$13, $$5, $$6);
         this.N.b(ffw.a);
         this.N.a(this.q.h());
         gem.aM.a();
         $$9.b("particles");
         this.q.g.a($$4, $$2, $$8);
         gem.aM.b();
      } else {
         $$9.b("translucent");
         if (this.L != null) {
            this.L.b(ffw.a);
         }

         this.a(gen.f(), $$11, $$12, $$13, $$5, $$6);
         $$22.a(gen.y());
         $$22.b();
         $$9.b("string");
         this.a(gen.t(), $$11, $$12, $$13, $$5, $$6);
         $$9.b("particles");
         this.q.g.a($$4, $$2, $$8);
      }

      if (this.q.m.ay() != ffj.a) {
         if (this.Q != null) {
            this.P.b(ffw.a);
         }

         $$9.b("clouds");
         this.a($$21, $$5, $$6, $$8, $$11, $$12, $$13);
      }

      if (this.Q != null) {
         gem.aN.a();
         $$9.b("weather");
         this.a($$4, $$8, $$11, $$12, $$13);
         this.d($$2);
         gem.aN.b();
         this.Q.a($$0.a());
         this.q.h().a(false);
      } else {
         RenderSystem.depthMask(false);
         $$9.b("weather");
         this.a($$4, $$8, $$11, $$12, $$13);
         this.d($$2);
         RenderSystem.depthMask(true);
      }

      this.a($$21, $$22, $$2);
      $$22.a();
      $$19.popMatrix();
      RenderSystem.applyModelViewMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      gdx.a();
   }

   private void a(fao $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bsh $$0, double $$1, double $$2, double $$3, float $$4, fao $$5, gef $$6) {
      double $$7 = ayg.d((double)$$4, $$0.ad, $$0.dw());
      double $$8 = ayg.d((double)$$4, $$0.ae, $$0.dy());
      double $$9 = ayg.d((double)$$4, $$0.af, $$0.dC());
      float $$10 = ayg.i($$4, $$0.O, $$0.dH());
      this.r.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$10, $$4, $$5, $$6, this.r.a($$0, $$4));
   }

   private void a(gen $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      $$0.a();
      if ($$0 == gen.f()) {
         this.q.aH().a("translucent_sort");
         double $$6 = $$1 - this.an;
         double $$7 = $$2 - this.ao;
         double $$8 = $$3 - this.ap;
         if ($$6 * $$6 + $$7 * $$7 + $$8 * $$8 > 1.0) {
            int $$9 = kc.a($$1);
            int $$10 = kc.a($$2);
            int $$11 = kc.a($$3);
            boolean $$12 = $$9 != kc.a(this.an) || $$11 != kc.a(this.ap) || $$10 != kc.a(this.ao);
            this.an = $$1;
            this.ao = $$2;
            this.ap = $$3;
            int $$13 = 0;
            ObjectListIterator var21 = this.w.iterator();

            while (var21.hasNext()) {
               ghf.b $$14 = (ghf.b)var21.next();
               if ($$13 < 15 && ($$12 || $$14.b($$9, $$10, $$11)) && $$14.a($$0, this.ae)) {
                  $$13++;
               }
            }
         }

         this.q.aH().c();
      }

      this.q.aH().a("filterempty");
      this.q.aH().b(() -> "render_" + $$0);
      boolean $$15 = $$0 != gen.f();
      ObjectListIterator<ghf.b> $$16 = this.w.listIterator($$15 ? 0 : this.w.size());
      get $$17 = RenderSystem.getShader();

      for (int $$18 = 0; $$18 < 12; $$18++) {
         int $$19 = RenderSystem.getShaderTexture($$18);
         $$17.a("Sampler" + $$18, $$19);
      }

      if ($$17.b != null) {
         $$17.b.a($$4);
      }

      if ($$17.c != null) {
         $$17.c.a($$5);
      }

      if ($$17.f != null) {
         $$17.f.a(RenderSystem.getShaderColor());
      }

      if ($$17.i != null) {
         $$17.i.a(RenderSystem.getShaderGlintAlpha());
      }

      if ($$17.j != null) {
         $$17.j.a(RenderSystem.getShaderFogStart());
      }

      if ($$17.k != null) {
         $$17.k.a(RenderSystem.getShaderFogEnd());
      }

      if ($$17.l != null) {
         $$17.l.a(RenderSystem.getShaderFogColor());
      }

      if ($$17.m != null) {
         $$17.m.a(RenderSystem.getShaderFogShape().a());
      }

      if ($$17.d != null) {
         $$17.d.a(RenderSystem.getTextureMatrix());
      }

      if ($$17.o != null) {
         $$17.o.a(RenderSystem.getShaderGameTime());
      }

      RenderSystem.setupShaderLights($$17);
      $$17.g();
      faf $$20 = $$17.p;

      while ($$15 ? $$16.hasNext() : $$16.hasPrevious()) {
         ghf.b $$21 = $$15 ? (ghf.b)$$16.next() : (ghf.b)$$16.previous();
         if (!$$21.d().a($$0)) {
            far $$22 = $$21.a($$0);
            ja $$23 = $$21.f();
            if ($$20 != null) {
               $$20.a((float)((double)$$23.u() - $$1), (float)((double)$$23.v() - $$2), (float)((double)$$23.w() - $$3));
               $$20.b();
            }

            $$22.a();
            $$22.c();
         }
      }

      if ($$20 != null) {
         $$20.a(0.0F, 0.0F, 0.0F);
      }

      $$17.f();
      far.b();
      this.q.aH().c();
      $$0.b();
   }

   private void a(fao $$0, gef $$1, ffg $$2) {
      if (this.q.B || this.q.C) {
         double $$3 = $$2.b().a();
         double $$4 = $$2.b().b();
         double $$5 = $$2.b().c();
         ObjectListIterator var10 = this.w.iterator();

         while (var10.hasNext()) {
            ghf.b $$6 = (ghf.b)var10.next();
            ges.d $$7 = this.v.b($$6);
            if ($$7 != null) {
               ja $$8 = $$6.f();
               $$0.a();
               $$0.a((double)$$8.u() - $$3, (double)$$8.v() - $$4, (double)$$8.w() - $$5);
               Matrix4f $$9 = $$0.c().a();
               if (this.q.B) {
                  fas $$10 = $$1.getBuffer(gen.y());
                  int $$11 = $$7.b == 0 ? 0 : ayg.h((float)$$7.b / 50.0F, 0.9F, 0.9F);
                  int $$12 = $$11 >> 16 & 0xFF;
                  int $$13 = $$11 >> 8 & 0xFF;
                  int $$14 = $$11 & 0xFF;

                  for (int $$15 = 0; $$15 < d.length; $$15++) {
                     if ($$7.a($$15)) {
                        jf $$16 = d[$$15];
                        $$10.a($$9, 8.0F, 8.0F, 8.0F).a($$12, $$13, $$14, 255).a((float)$$16.j(), (float)$$16.k(), (float)$$16.l()).e();
                        $$10.a($$9, (float)(8 - 16 * $$16.j()), (float)(8 - 16 * $$16.k()), (float)(8 - 16 * $$16.l()))
                           .a($$12, $$13, $$14, 255)
                           .a((float)$$16.j(), (float)$$16.k(), (float)$$16.l())
                           .e();
                     }
                  }
               }

               if (this.q.C && !$$6.d().a()) {
                  fas $$17 = $$1.getBuffer(gen.y());
                  int $$18 = 0;

                  for (jf $$19 : d) {
                     for (jf $$20 : d) {
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
                     fas $$22 = $$1.getBuffer(gen.B());
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

      if (this.ak != null) {
         $$0.a();
         $$0.a((float)(this.am.x - $$2.b().c), (float)(this.am.y - $$2.b().d), (float)(this.am.z - $$2.b().e));
         Matrix4f $$25 = $$0.c().a();
         fas $$26 = $$1.getBuffer(gen.B());
         this.a($$26, $$25, 0, 1, 2, 3, 0, 1, 1);
         this.a($$26, $$25, 4, 5, 6, 7, 1, 0, 0);
         this.a($$26, $$25, 0, 1, 5, 4, 1, 1, 0);
         this.a($$26, $$25, 2, 3, 7, 6, 0, 0, 1);
         this.a($$26, $$25, 0, 4, 7, 3, 0, 1, 0);
         this.a($$26, $$25, 1, 5, 6, 2, 1, 0, 1);
         fas $$27 = $$1.getBuffer(gen.y());
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

   private void a(fas $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a(0, 0, 0, 255).a(0.0F, 0.0F, -1.0F).e();
   }

   private void a(fas $$0, Matrix4f $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      float $$9 = 0.25F;
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.al[$$3].x(), this.al[$$3].y(), this.al[$$3].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.al[$$4].x(), this.al[$$4].y(), this.al[$$4].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
      $$0.a($$1, this.al[$$5].x(), this.al[$$5].y(), this.al[$$5].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F).e();
   }

   public void m() {
      this.aj = true;
   }

   public void n() {
      this.ak = null;
   }

   public void o() {
      if (this.u.s().i()) {
         this.F++;
      }

      if (this.F % 20 == 0) {
         Iterator<app> $$0 = this.G.values().iterator();

         while ($$0.hasNext()) {
            app $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.F - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(app $$0) {
      long $$1 = $$0.b().a();
      Set<app> $$2 = (Set<app>)this.H.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.H.remove($$1);
      }
   }

   private void b(fao $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(gdy::s);
      RenderSystem.setShaderTexture(0, m);
      faq $$1 = faq.b();
      faj $$2 = $$1.d();

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
         $$2.a(fat.b.h, fam.s);
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

   public void a(Matrix4f $$0, Matrix4f $$1, float $$2, ffg $$3, boolean $$4, Runnable $$5) {
      $$5.run();
      if (!$$4) {
         eol $$6 = $$3.k();
         if ($$6 != eol.c && $$6 != eol.a && !this.b($$3)) {
            fao $$7 = new fao();
            $$7.a($$0);
            if (this.q.r.d().c() == gdu.d.c) {
               this.b($$7);
            } else if (this.q.r.d().c() == gdu.d.b) {
               ewh $$8 = this.u.a(this.q.j.l().b(), $$2);
               float $$9 = (float)$$8.c;
               float $$10 = (float)$$8.d;
               float $$11 = (float)$$8.e;
               gdx.b();
               faj $$12 = faq.b().d();
               RenderSystem.depthMask(false);
               RenderSystem.setShaderColor($$9, $$10, $$11, 1.0F);
               get $$13 = RenderSystem.getShader();
               this.A.a();
               this.A.a($$7.c().a(), $$1, $$13);
               far.b();
               RenderSystem.enableBlend();
               float[] $$14 = this.u.d().a(this.u.f($$2), $$2);
               if ($$14 != null) {
                  RenderSystem.setShader(gdy::p);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  $$7.a();
                  $$7.a(a.b.rotationDegrees(90.0F));
                  float $$15 = ayg.a(this.u.a($$2)) < 0.0F ? 180.0F : 0.0F;
                  $$7.a(a.f.rotationDegrees($$15));
                  $$7.a(a.f.rotationDegrees(90.0F));
                  float $$16 = $$14[0];
                  float $$17 = $$14[1];
                  float $$18 = $$14[2];
                  Matrix4f $$19 = $$7.c().a();
                  $$12.a(fat.b.g, fam.n);
                  $$12.a($$19, 0.0F, 100.0F, 0.0F).a($$16, $$17, $$18, $$14[3]).e();
                  int $$20 = 16;

                  for (int $$21 = 0; $$21 <= 16; $$21++) {
                     float $$22 = (float)$$21 * (float) (Math.PI * 2) / 16.0F;
                     float $$23 = ayg.a($$22);
                     float $$24 = ayg.b($$22);
                     $$12.a($$19, $$23 * 120.0F, $$24 * 120.0F, -$$24 * 40.0F * $$14[3]).a($$14[0], $$14[1], $$14[2], 0.0F).e();
                  }

                  fak.a($$12.d());
                  $$7.b();
               }

               RenderSystem.blendFuncSeparate(
                  GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
               );
               $$7.a();
               float $$25 = 1.0F - this.u.d($$2);
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$25);
               $$7.a(a.d.rotationDegrees(-90.0F));
               $$7.a(a.b.rotationDegrees(this.u.f($$2) * 360.0F));
               Matrix4f $$26 = $$7.c().a();
               float $$27 = 30.0F;
               RenderSystem.setShader(gdy::r);
               RenderSystem.setShaderTexture(0, l);
               $$12.a(fat.b.h, fam.q);
               $$12.a($$26, -$$27, 100.0F, -$$27).a(0.0F, 0.0F).e();
               $$12.a($$26, $$27, 100.0F, -$$27).a(1.0F, 0.0F).e();
               $$12.a($$26, $$27, 100.0F, $$27).a(1.0F, 1.0F).e();
               $$12.a($$26, -$$27, 100.0F, $$27).a(0.0F, 1.0F).e();
               fak.a($$12.d());
               $$27 = 20.0F;
               RenderSystem.setShaderTexture(0, k);
               int $$28 = this.u.ar();
               int $$29 = $$28 % 4;
               int $$30 = $$28 / 4 % 2;
               float $$31 = (float)($$29 + 0) / 4.0F;
               float $$32 = (float)($$30 + 0) / 2.0F;
               float $$33 = (float)($$29 + 1) / 4.0F;
               float $$34 = (float)($$30 + 1) / 2.0F;
               $$12.a(fat.b.h, fam.q);
               $$12.a($$26, -$$27, -100.0F, $$27).a($$33, $$34).e();
               $$12.a($$26, $$27, -100.0F, $$27).a($$31, $$34).e();
               $$12.a($$26, $$27, -100.0F, -$$27).a($$31, $$32).e();
               $$12.a($$26, -$$27, -100.0F, -$$27).a($$33, $$32).e();
               fak.a($$12.d());
               float $$35 = this.u.i($$2) * $$25;
               if ($$35 > 0.0F) {
                  RenderSystem.setShaderColor($$35, $$35, $$35, $$35);
                  gdx.a();
                  this.z.a();
                  this.z.a($$7.c().a(), $$1, gdy.o());
                  far.b();
                  $$5.run();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.disableBlend();
               RenderSystem.defaultBlendFunc();
               $$7.b();
               RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
               double $$36 = this.q.s.k($$2).d - this.u.k().a(this.u);
               if ($$36 < 0.0) {
                  $$7.a();
                  $$7.a(0.0F, 12.0F, 0.0F);
                  this.B.a();
                  this.B.a($$7.c().a(), $$1, $$13);
                  far.b();
                  $$7.b();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.depthMask(true);
            }
         }
      }
   }

   private boolean b(ffg $$0) {
      return !($$0.g() instanceof btc $$1) ? false : $$1.b(brr.o) || $$1.b(brr.G);
   }

   public void a(fao $$0, Matrix4f $$1, Matrix4f $$2, float $$3, double $$4, double $$5, double $$6) {
      float $$7 = this.u.d().a();
      if (!Float.isNaN($$7)) {
         float $$8 = 12.0F;
         float $$9 = 4.0F;
         double $$10 = 2.0E-4;
         double $$11 = (double)(((float)this.F + $$3) * 0.03F);
         double $$12 = ($$4 + $$11) / 12.0;
         double $$13 = (double)($$7 - (float)$$5 + 0.33F);
         double $$14 = $$6 / 12.0 + 0.33F;
         $$12 -= (double)(ayg.a($$12 / 2048.0) * 2048);
         $$14 -= (double)(ayg.a($$14 / 2048.0) * 2048);
         float $$15 = (float)($$12 - (double)ayg.a($$12));
         float $$16 = (float)($$13 / 4.0 - (double)ayg.a($$13 / 4.0)) * 4.0F;
         float $$17 = (float)($$14 - (double)ayg.a($$14));
         ewh $$18 = this.u.h($$3);
         int $$19 = (int)Math.floor($$12);
         int $$20 = (int)Math.floor($$13 / 4.0);
         int $$21 = (int)Math.floor($$14);
         if ($$19 != this.Z || $$20 != this.aa || $$21 != this.ab || this.q.m.ay() != this.ad || this.ac.g($$18) > 2.0E-4) {
            this.Z = $$19;
            this.aa = $$20;
            this.ab = $$21;
            this.ac = $$18;
            this.ad = this.q.m.ay();
            this.C = true;
         }

         if (this.C) {
            this.C = false;
            faj $$22 = faq.b().d();
            if (this.D != null) {
               this.D.close();
            }

            this.D = new far(far.a.a);
            faj.b $$23 = this.a($$22, $$12, $$13, $$14, $$18);
            this.D.a();
            this.D.a($$23);
            far.b();
         }

         gdx.b();
         $$0.a();
         $$0.a($$1);
         $$0.b(12.0F, 1.0F, 12.0F);
         $$0.a(-$$15, $$16, -$$17);
         if (this.D != null) {
            this.D.a();
            int $$24 = this.ad == ffj.c ? 0 : 1;

            for (int $$25 = $$24; $$25 < 2; $$25++) {
               gen $$26 = $$25 == 0 ? gen.x() : gen.w();
               $$26.a();
               get $$27 = RenderSystem.getShader();
               this.D.a($$0.c().a(), $$2, $$27);
               $$26.b();
            }

            far.b();
         }

         $$0.b();
      }
   }

   private faj.b a(faj $$0, double $$1, double $$2, double $$3, ewh $$4) {
      float $$5 = 4.0F;
      float $$6 = 0.00390625F;
      int $$7 = 8;
      int $$8 = 4;
      float $$9 = 9.765625E-4F;
      float $$10 = (float)ayg.a($$1) * 0.00390625F;
      float $$11 = (float)ayg.a($$3) * 0.00390625F;
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
      $$0.a(fat.b.h, fam.v);
      float $$24 = (float)Math.floor($$2 / 4.0) * 4.0F;
      if (this.ad == ffj.c) {
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

   private void c(ffg $$0) {
      this.q.aH().a("populate_sections_to_compile");
      eny $$1 = this.u.y_();
      ghe $$2 = new ghe();
      ja $$3 = $$0.c();
      List<ghf.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.w.iterator();

      while (var6.hasNext()) {
         ghf.b $$5 = (ghf.b)var6.next();
         kc $$6 = kc.a($$5.f());
         if ($$5.h() && $$1.a($$6)) {
            boolean $$7 = false;
            if (this.q.m.l().c() == fgd.c) {
               ja $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.i();
            } else if (this.q.m.l().c() == fgd.b) {
               $$7 = $$5.i();
            }

            if ($$7) {
               this.q.aH().a("build_near_sync");
               this.ae.a($$5, $$2);
               $$5.g();
               this.q.aH().c();
            } else {
               $$4.add($$5);
            }
         }
      }

      this.q.aH().b("upload");
      this.ae.f();
      this.q.aH().b("schedule_async_compile");

      for (ghf.b $$9 : $$4) {
         $$9.a(this.ae, $$2);
         $$9.g();
      }

      this.q.aH().c();
   }

   private void d(ffg $$0) {
      faj $$1 = faq.b().d();
      duc $$2 = this.u.C_();
      double $$3 = (double)(this.q.m.aD() * 16);
      if (!($$0.b().c < $$2.g() - $$3) || !($$0.b().c > $$2.e() + $$3) || !($$0.b().e < $$2.h() - $$3) || !($$0.b().e > $$2.f() + $$3)) {
         double $$4 = 1.0 - $$2.b($$0.b().c, $$0.b().e) / $$3;
         $$4 = Math.pow($$4, 4.0);
         $$4 = ayg.a($$4, 0.0, 1.0);
         double $$5 = $$0.b().c;
         double $$6 = $$0.b().e;
         double $$7 = (double)this.q.j.g();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
         RenderSystem.setShaderTexture(0, n);
         RenderSystem.depthMask(ffw.O());
         int $$8 = $$2.d().a();
         float $$9 = (float)($$8 >> 16 & 0xFF) / 255.0F;
         float $$10 = (float)($$8 >> 8 & 0xFF) / 255.0F;
         float $$11 = (float)($$8 & 0xFF) / 255.0F;
         RenderSystem.setShaderColor($$9, $$10, $$11, (float)$$4);
         RenderSystem.setShader(gdy::r);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.disableCull();
         float $$12 = (float)(ac.c() % 3000L) / 3000.0F;
         float $$13 = (float)(-ayg.e($$0.b().d * 0.5));
         float $$14 = $$13 + (float)$$7;
         $$1.a(fat.b.h, fam.q);
         double $$15 = Math.max((double)ayg.a($$6 - $$3), $$2.f());
         double $$16 = Math.min((double)ayg.c($$6 + $$3), $$2.h());
         float $$17 = (float)(ayg.a($$15) & 1) * 0.5F;
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

         $$15 = Math.max((double)ayg.a($$5 - $$3), $$2.e());
         $$16 = Math.min((double)ayg.c($$5 + $$3), $$2.g());
         $$17 = (float)(ayg.a($$15) & 1) * 0.5F;
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

         fak.a($$1.d());
         RenderSystem.enableCull();
         RenderSystem.polygonOffset(0.0F, 0.0F);
         RenderSystem.disablePolygonOffset();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.depthMask(true);
      }
   }

   private void a(fao $$0, fas $$1, bsh $$2, double $$3, double $$4, double $$5, ja $$6, dsl $$7) {
      a($$0, $$1, $$7.a(this.u, $$6, ewm.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   private static ewh a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(ayg.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new ewh(1.0, (double)$$3, 0.0);
         case 1 -> new ewh((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new ewh(0.0, 1.0, (double)$$3);
         case 3 -> new ewh(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new ewh((double)$$3, 0.0, 1.0);
         case 5 -> new ewh(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static ewh a(float $$0, float $$1, float $$2, float $$3) {
      ewh $$4 = a($$3).a((double)$$0);
      ewh $$5 = a(($$3 + 0.33333334F) % 1.0F).a((double)$$1);
      ewh $$6 = a(($$3 + 0.6666667F) % 1.0F).a((double)$$2);
      ewh $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.c), Math.max($$7.d, $$7.e));
      return new ewh($$7.c / $$8, $$7.d / $$8, $$7.e / $$8);
   }

   public static void a(fao $$0, fas $$1, exa $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<ewc> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         a($$0, $$1, ewx.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            ewc $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            ewh $$16 = a($$6, $$7, $$8, $$15);
            a($$0, $$1, ewx.a($$14), $$3, $$4, $$5, (float)$$16.c, (float)$$16.d, (float)$$16.e, $$9);
         }
      }
   }

   private static void a(fao $$0, fas $$1, exa $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9) {
      fao.a $$10 = $$0.c();
      $$2.a(($$9x, $$10x, $$11, $$12, $$13, $$14) -> {
         float $$15 = (float)($$12 - $$9x);
         float $$16 = (float)($$13 - $$10x);
         float $$17 = (float)($$14 - $$11);
         float $$18 = ayg.c($$15 * $$15 + $$16 * $$16 + $$17 * $$17);
         $$15 /= $$18;
         $$16 /= $$18;
         $$17 /= $$18;
         $$1.a($$10, (float)($$9x + $$3), (float)($$10x + $$4), (float)($$11 + $$5)).a($$6, $$7, $$8, $$9).b($$10, $$15, $$16, $$17).e();
         $$1.a($$10, (float)($$12 + $$3), (float)($$13 + $$4), (float)($$14 + $$5)).a($$6, $$7, $$8, $$9).b($$10, $$15, $$16, $$17).e();
      });
   }

   public static void a(fas $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, float $$8, float $$9, float $$10) {
      a(new fao(), $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$7, $$8, $$9);
   }

   public static void a(fao $$0, fas $$1, ewc $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6, $$3, $$4, $$5);
   }

   public static void a(fao $$0, fas $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$8, $$9, $$10);
   }

   public static void a(
      fao $$0,
      fas $$1,
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
      fao.a $$15 = $$0.c();
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

   public static void b(fao $$0, fas $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, (float)$$2, (float)$$3, (float)$$4, (float)$$5, (float)$$6, (float)$$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fao $$0, fas $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
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

   public void a(dbm $$0, ja $$1, dsl $$2, dsl $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(ja $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(kc.a($$3), kc.a($$4), kc.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(kc.a($$7), kc.a($$8), kc.a($$6));
            }
         }
      }
   }

   public void a(ja $$0, dsl $$1, dsl $$2) {
      if (this.q.aC().a($$1, $$2)) {
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
      this.y.a($$0, $$1, $$2, $$3);
   }

   public void a(@Nullable avg $$0, ja $$1) {
      gte $$2 = this.I.get($$1);
      if ($$2 != null) {
         this.q.aj().b($$2);
         this.I.remove($$1);
      }

      if ($$0 != null) {
         cuy $$3 = cuy.a($$0);
         if ($$3 != null) {
            this.q.l.a($$3.k());
         }

         gte var5 = gsz.a($$0, ewh.b($$1));
         this.I.put($$1, var5);
         this.q.aj().a(var5);
      }

      this.a(this.u, $$1, $$0 != null);
   }

   private void a(dcg $$0, ja $$1, boolean $$2) {
      for (btc $$4 : $$0.a(btc.class, new ewc($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }

   public void a(lh $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(lh $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", lq.i.b($$0.a()));
         $$11.a("Parameters", () -> lj.bf.encodeStart(this.u.H_().a(ul.a), $$0).toString());
         $$11.a("Position", () -> p.a(this.u, $$3, $$4, $$5));
         throw new y($$10);
      }
   }

   private <T extends lh> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private gbt b(lh $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gbt b(lh $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      ffg $$9 = this.q.j.l();
      fgb $$10 = this.a($$2);
      if ($$1) {
         return this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == fgb.c ? null : this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private fgb a(boolean $$0) {
      fgb $$1 = this.q.m.ar().c();
      if ($$0 && $$1 == fgb.c && this.u.z.a(10) == 0) {
         $$1 = fgb.b;
      }

      if ($$1 == fgb.b && this.u.z.a(3) == 0) {
         $$1 = fgb.c;
      }

      return $$1;
   }

   public void p() {
   }

   public void a(int $$0, ja $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            ffg $$3 = this.q.j.l();
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
                  this.u.a($$8, $$9, $$10, avh.CG, avi.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.u.a($$8, $$9, $$10, avh.iw, avi.f, 1.0F, 1.0F, false);
               } else {
                  this.u.a($$8, $$9, $$10, avh.ib, avi.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, ja $$1, int $$2) {
      ayo $$3 = this.u.z;
      switch ($$0) {
         case 1000:
            this.u.a($$1, avh.gS, avi.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.u.a($$1, avh.gT, avi.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.u.a($$1, avh.gU, avi.e, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.u.a($$1, avh.iQ, avi.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.u.a($$1, avh.iU, avi.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.u.a($$1, avh.kf, avi.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            if (cty.b($$2) instanceof cuy $$77) {
               this.a($$77.l(), $$1);
            }
            break;
         case 1011:
            this.a(null, $$1);
            break;
         case 1015:
            this.u.a($$1, avh.kp, avi.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.u.a($$1, avh.ko, avi.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.u.a($$1, avh.ig, avi.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.u.a($$1, avh.ck, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.u.a($$1, avh.Dt, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.u.a($$1, avh.Du, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.u.a($$1, avh.Dv, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.u.a($$1, avh.Cy, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.u.a($$1, avh.CB, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.u.a($$1, avh.bJ, avi.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.u.a($$1, avh.DD, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.u.a($$1, avh.DK, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.u.a($$1, avh.V, avi.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.u.a($$1, avh.ab, avi.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.u.a($$1, avh.Y, avi.e, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.q.aj().a(gsz.b(avh.uI, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.u.a($$1, avh.fg, avi.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.u.a($$1, avh.ff, avi.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.u.a($$1, avh.cR, avi.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.u.a($$1, avh.tv, avi.f, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.u.a($$1, avh.Dw, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.u.a($$1, avh.na, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.u.a($$1, avh.lo, avi.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.u.a($$1, avh.cy, avi.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.u.a($$1, avh.yj, avi.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.u.a($$1, avh.hw, avi.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.u.a($$1, avh.hz, avi.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.u.a($$1, avh.hA, avi.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.u.a($$1, avh.xc, avi.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.u.a($$1, avh.gg, avi.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.u.a($$1, avh.gh, avi.e, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.u.a($$1, avh.Cq, avi.e, 0.5F, 0.4F / (this.u.E_().i() * 0.4F + 0.8F), false);
         case 2010:
            this.a($$2, $$1, $$3, lj.af);
            break;
         case 1500:
            dgt.a(this.u, $$1, $$2 > 0);
            break;
         case 1501:
            this.u.a($$1, avh.nQ, avi.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$60 = 0; $$60 < 8; $$60++) {
               this.u.a(lj.X, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.u.a($$1, avh.vv, avi.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$61 = 0; $$61 < 5; $$61++) {
               double $$62 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$63 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$64 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.u.a(lj.ae, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.u.a($$1, avh.iv, avi.e, 1.0F, 1.0F, false);

            for (int $$65 = 0; $$65 < 16; $$65++) {
               double $$66 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$67 = (double)$$1.v() + 0.8125;
               double $$68 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.u.a(lj.ae, $$66, $$67, $$68, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            dla.a(this.u, $$1, this.u.a_($$1));
            break;
         case 1505:
            cse.a(this.u, $$1, $$2);
            this.u.a($$1, avh.cx, avi.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, lj.ae);
            break;
         case 2001:
            dsl $$23 = dfi.a($$2);
            if (!$$23.i()) {
               dmv $$24 = $$23.w();
               this.u.a($$1, $$24.c(), avi.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.u.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            ewh $$9 = ewh.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.a(new lf(lj.S, new cud(cug.vo)), $$9.c, $$9.d, $$9.e, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            lh $$14 = $$0 == 2007 ? lj.R : lj.p;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               gbt $$21 = this.b($$14, $$14.a().b(), $$9.c + $$18 * 0.1, $$9.d + 0.3, $$9.e + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.u.a($$1, avh.yP, avi.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.a(new lf(lj.S, new cud(cug.ss)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.a(lj.ac, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.a(lj.ac, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.u.a(lj.ae, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.u.a(lj.F, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$69 = 0; $$69 < 200; $$69++) {
               float $$70 = $$3.i() * 4.0F;
               float $$71 = $$3.i() * (float) (Math.PI * 2);
               double $$72 = (double)(ayg.b($$71) * $$70);
               double $$73 = 0.01 + $$3.j() * 0.5;
               double $$74 = (double)(ayg.a($$71) * $$70);
               gbt $$75 = this.b(lj.h, false, (double)$$1.u() + $$72 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$74 * 0.1, $$72, $$73, $$74);
               if ($$75 != null) {
                  $$75.c($$70);
               }
            }

            if ($$2 == 1) {
               this.u.a($$1, avh.ic, avi.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.u.a(lj.w, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$76 = 0; $$76 < 8; $$76++) {
               this.u.a(lj.e, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2011:
            ayk.a(this.u, $$1, $$2, lj.O);
            break;
         case 2012:
            ayk.a(this.u, $$1, $$2, lj.O);
            break;
         case 2013:
            ayk.a(this.u, $$1, $$2);
            break;
         case 3000:
            this.u.a(lj.v, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.u.a($$1, avh.iu, avi.e, 10.0F, (1.0F + (this.u.z.i() - this.u.z.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.u.a($$1, avh.ie, avi.f, 64.0F, 0.8F + this.u.z.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < jf.a.d.length) {
               ayk.a(jf.a.d[$$2], this.u, $$1, 0.125, lj.aT, bps.a(10, 19));
            } else {
               ayk.a(this.u, $$1, lj.aT, bps.a(3, 5));
            }
            break;
         case 3003:
            ayk.a(this.u, $$1, lj.aR, bps.a(3, 5));
            this.u.a($$1, avh.mC, avi.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            ayk.a(this.u, $$1, lj.aS, bps.a(3, 5));
            break;
         case 3005:
            ayk.a(this.u, $$1, lj.aU, bps.a(3, 5));
            break;
         case 3006:
            int $$36 = $$2 >> 6;
            if ($$36 > 0) {
               if ($$3.i() < 0.3F + (float)$$36 * 0.1F) {
                  float $$37 = 0.15F + 0.02F * (float)$$36 * (float)$$36 * $$3.i();
                  float $$38 = 0.4F + 0.3F * (float)$$36 * $$3.i();
                  this.u.a($$1, avh.vU, avi.e, $$37, $$38, false);
               }

               byte $$39 = (byte)($$2 & 63);
               bpm $$40 = bps.a(0, $$36);
               float $$41 = 0.005F;
               Supplier<ewh> $$42 = () -> new ewh(ayg.a($$3, -0.005F, 0.005F), ayg.a($$3, -0.005F, 0.005F), ayg.a($$3, -0.005F, 0.005F));
               if ($$39 == 0) {
                  for (jf $$43 : jf.values()) {
                     float $$44 = $$43 == jf.a ? (float) Math.PI : 0.0F;
                     double $$45 = $$43.o() == jf.a.b ? 0.65 : 0.57;
                     ayk.a(this.u, $$1, new ll($$44), $$40, $$43, $$42, $$45);
                  }
               } else {
                  for (jf $$46 : dki.a($$39)) {
                     float $$47 = $$46 == jf.b ? (float) Math.PI : 0.0F;
                     double $$48 = 0.35;
                     ayk.a(this.u, $$1, new ll($$47), $$40, $$46, $$42, 0.35);
                  }
               }
            } else {
               this.u.a($$1, avh.vU, avi.e, 1.0F, 1.0F, false);
               boolean $$49 = this.u.a_($$1).r(this.u, $$1);
               int $$50 = $$49 ? 40 : 20;
               float $$51 = $$49 ? 0.45F : 0.25F;
               float $$52 = 0.07F;

               for (int $$53 = 0; $$53 < $$50; $$53++) {
                  float $$54 = 2.0F * $$3.i() - 1.0F;
                  float $$55 = 2.0F * $$3.i() - 1.0F;
                  float $$56 = 2.0F * $$3.i() - 1.0F;
                  this.u
                     .a(
                        lj.K,
                        (double)$$1.u() + 0.5 + (double)($$54 * $$51),
                        (double)$$1.v() + 0.5 + (double)($$55 * $$51),
                        (double)$$1.w() + 0.5 + (double)($$56 * $$51),
                        (double)($$54 * 0.07F),
                        (double)($$55 * 0.07F),
                        (double)($$56 * 0.07F)
                     );
               }
            }
            break;
         case 3007:
            for (int $$57 = 0; $$57 < 10; $$57++) {
               this.u.a(new lm($$57 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + dmc.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dsl $$58 = this.u.a_($$1);
            boolean $$59 = $$58.b(dtb.C) && $$58.c(dtb.C);
            if (!$$59) {
               this.u.a((double)$$1.u() + 0.5, (double)$$1.v() + dmc.f, (double)$$1.w() + 0.5, avh.wr, avi.e, 2.0F, 0.6F + this.u.z.i() * 0.4F, false);
            }
            break;
         case 3008:
            dsl $$25 = dfi.a($$2);
            if ($$25.b() instanceof dfn $$26) {
               this.u.a($$1, $$26.d(), avi.h, 1.0F, 1.0F, false);
            }

            this.u.a($$1, $$25);
            break;
         case 3009:
            ayk.a(this.u, $$1, lj.aW, bps.a(3, 6));
            break;
         case 3011:
            dro.a(this.u, $$1, $$3, dro.a.a($$2).c);
            break;
         case 3012:
            this.u.a($$1, avh.mc, avi.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dro.a(this.u, $$1, $$3, dro.a.a($$2).c);
            break;
         case 3013:
            this.u.a($$1, avh.mg, avi.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dro.a(this.u, $$1, $$3, $$2, lj.aY);
            break;
         case 3014:
            this.u.a($$1, avh.mm, avi.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dro.b(this.u, $$1, $$3);
            break;
         case 3015:
            if (this.u.c_($$1) instanceof drt $$31) {
               drt.a.a(this.u, $$31.az_(), $$31.n(), $$31.c(), $$2 == 0 ? lj.aJ : lj.L);
               this.u.a($$1, avh.AA, avi.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            drt.a.a(this.u, $$1, $$2 == 0 ? lj.aJ : lj.L);
            this.u.a($$1, avh.AE, avi.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dro.b(this.u, $$1, $$3);
            break;
         case 3018:
            for (int $$32 = 0; $$32 < 10; $$32++) {
               double $$33 = $$3.k() * 0.02;
               double $$34 = $$3.k() * 0.02;
               double $$35 = $$3.k() * 0.02;
               this.u.a(lj.ab, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), $$33, $$34, $$35);
            }

            this.u.a($$1, avh.fk, avi.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3019:
            this.u.a($$1, avh.mg, avi.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dro.a(this.u, $$1, $$3, $$2, lj.aZ);
            break;
         case 3020:
            this.u.a($$1, avh.mh, avi.e, $$2 == 0 ? 0.3F : 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dro.a(this.u, $$1, $$3, 0, lj.aZ);
            dro.a(this.u, $$1, $$3);
            break;
         case 3021:
            this.u.a($$1, avh.me, avi.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dro.a(this.u, $$1, $$3, dro.a.a($$2).c);
      }
   }

   public void c(int $$0, ja $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         app $$4 = (app)this.G.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new app($$0, $$1);
            this.G.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.F);
         ((SortedSet)this.H.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         app $$3 = (app)this.G.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean q() {
      return this.ae.h();
   }

   public void a(dbn $$0) {
      this.v.a($$0);
   }

   public void r() {
      this.v.a();
      this.C = true;
   }

   public void a(Collection<dpq> $$0, Collection<dpq> $$1) {
      synchronized (this.x) {
         this.x.removeAll($$0);
         this.x.addAll($$1);
      }
   }

   public static int a(dbj $$0, ja $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(dbj $$0, dsl $$1, ja $$2) {
      if ($$1.e($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(dcp.a, $$2);
         int $$4 = $$0.a(dcp.b, $$2);
         int $$5 = $$1.h();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(ja $$0) {
      ghf.b $$1 = this.y.a($$0);
      return $$1 != null && $$1.c.get() != ghf.a.a;
   }

   @Nullable
   public eza s() {
      return this.J;
   }

   @Nullable
   public eza t() {
      return this.L;
   }

   @Nullable
   public eza u() {
      return this.M;
   }

   @Nullable
   public eza v() {
      return this.N;
   }

   @Nullable
   public eza w() {
      return this.O;
   }

   @Nullable
   public eza x() {
      return this.P;
   }

   private void a(int $$0, ja $$1, ayo $$2, ln $$3) {
      jf $$4 = jf.a($$0);
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
