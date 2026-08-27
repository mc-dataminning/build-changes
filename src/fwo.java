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

public class fwo implements asg, AutoCloseable {
   private static final Logger e = LogUtils.getLogger();
   public static final int a = 16;
   public static final int b = 8;
   private static final float f = 512.0F;
   private static final int g = 32;
   private static final int h = 10;
   private static final int i = 21;
   private static final int j = 15;
   private static final ajc k = new ajc("textures/environment/moon_phases.png");
   private static final ajc l = new ajc("textures/environment/sun.png");
   protected static final ajc c = new ajc("textures/environment/clouds.png");
   private static final ajc m = new ajc("textures/environment/end_sky.png");
   private static final ajc n = new ajc("textures/misc/forcefield.png");
   private static final ajc o = new ajc("textures/environment/rain.png");
   private static final ajc p = new ajc("textures/environment/snow.png");
   public static final ih[] d = ih.values();
   private final eyk q;
   private final gbw r;
   private final fyp s;
   private final fww t;
   @Nullable
   private fra u;
   private final fxd v = new fxd();
   private final ObjectArrayList<fzq.b> w = new ObjectArrayList(10000);
   private final Set<djl> x = Sets.newHashSet();
   @Nullable
   private fxh y;
   @Nullable
   private etg z;
   @Nullable
   private etg A;
   @Nullable
   private etg B;
   private boolean C = true;
   @Nullable
   private etg D;
   private final fwz E = new fwz(100);
   private int F;
   private final Int2ObjectMap<aoh> G = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aoh>> H = new Long2ObjectOpenHashMap();
   private final Map<ib, glm> I = Maps.newHashMap();
   @Nullable
   private erp J;
   @Nullable
   private fwt K;
   @Nullable
   private erp L;
   @Nullable
   private erp M;
   @Nullable
   private erp N;
   @Nullable
   private erp O;
   @Nullable
   private erp P;
   @Nullable
   private fwt Q;
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
   private eov ac = eov.b;
   @Nullable
   private exy ad;
   @Nullable
   private fzq ae;
   private int af = -1;
   private int ag;
   private int ah;
   private fzu ai;
   private boolean aj;
   @Nullable
   private fzu ak;
   private final Vector4f[] al = new Vector4f[8];
   private final Vector3d am = new Vector3d(0.0, 0.0, 0.0);
   private double an;
   private double ao;
   private double ap;
   private int aq;
   private final float[] ar = new float[1024];
   private final float[] as = new float[1024];

   public fwo(eyk $$0, gbw $$1, fyp $$2, fww $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;

      for (int $$4 = 0; $$4 < 32; $$4++) {
         for (int $$5 = 0; $$5 < 32; $$5++) {
            float $$6 = (float)($$5 - 16);
            float $$7 = (float)($$4 - 16);
            float $$8 = awm.c($$6 * $$6 + $$7 * $$7);
            this.ar[$$4 << 5 | $$5] = -$$7 / $$8;
            this.as[$$4 << 5 | $$5] = $$6 / $$8;
         }
      }

      this.C();
      this.B();
      this.A();
   }

   private void a(fwp $$0, float $$1, double $$2, double $$3, double $$4) {
      float $$5 = this.q.r.d($$1);
      if (!($$5 <= 0.0F)) {
         $$0.c();
         cwe $$6 = this.q.r;
         int $$7 = awm.a($$2);
         int $$8 = awm.a($$3);
         int $$9 = awm.a($$4);
         etf $$10 = etf.b();
         esy $$11 = $$10.d();
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         int $$12 = 5;
         if (eyk.M()) {
            $$12 = 10;
         }

         RenderSystem.depthMask(eyk.N());
         int $$13 = -1;
         float $$14 = (float)this.F + $$1;
         RenderSystem.setShader(fwj::u);
         ib.a $$15 = new ib.a();

         for (int $$16 = $$9 - $$12; $$16 <= $$9 + $$12; $$16++) {
            for (int $$17 = $$7 - $$12; $$17 <= $$7 + $$12; $$17++) {
               int $$18 = ($$16 - $$9 + 16) * 32 + $$17 - $$7 + 16;
               double $$19 = (double)this.ar[$$18] * 0.5;
               double $$20 = (double)this.as[$$18] * 0.5;
               $$15.b((double)$$17, $$3, (double)$$16);
               cxd $$21 = $$6.t($$15).a();
               if ($$21.c()) {
                  int $$22 = $$6.a(drq.a.e, $$17, $$16);
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
                     awt $$26 = awt.a((long)($$17 * $$17 * 3121 + $$17 * 45238971 ^ $$16 * $$16 * 418711 + $$16 * 13761));
                     $$15.d($$17, $$23, $$16);
                     cxd.c $$27 = $$21.a($$15);
                     if ($$27 == cxd.c.b) {
                        if ($$13 != 0) {
                           if ($$13 >= 0) {
                              $$10.c();
                           }

                           $$13 = 0;
                           RenderSystem.setShaderTexture(0, o);
                           $$11.a(eti.b.h, etb.l);
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
                     } else if ($$27 == cxd.c.c) {
                        if ($$13 != 1) {
                           if ($$13 >= 0) {
                              $$10.c();
                           }

                           $$13 = 1;
                           RenderSystem.setShaderTexture(0, p);
                           $$11.a(eti.b.h, etb.l);
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

   public void a(exv $$0) {
      float $$1 = this.q.r.d(1.0F) / (eyk.M() ? 1.0F : 2.0F);
      if (!($$1 <= 0.0F)) {
         awt $$2 = awt.a((long)this.F * 312987231L);
         cwh $$3 = this.q.r;
         ib $$4 = ib.a($$0.b());
         ib $$5 = null;
         int $$6 = (int)(100.0F * $$1 * $$1) / (this.q.m.ao().c() == eyp.b ? 2 : 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            int $$8 = $$2.a(21) - 10;
            int $$9 = $$2.a(21) - 10;
            ib $$10 = $$3.a(drq.a.e, $$4.b($$8, 0, $$9));
            if ($$10.v() > $$3.J_() && $$10.v() <= $$4.v() + 10 && $$10.v() >= $$4.v() - 10) {
               cxd $$11 = $$3.t($$10).a();
               if ($$11.a($$10) == cxd.c.b) {
                  $$5 = $$10.d();
                  if (this.q.m.ao().c() == eyp.c) {
                     break;
                  }

                  double $$12 = $$2.j();
                  double $$13 = $$2.j();
                  dme $$14 = $$3.a_($$5);
                  ehr $$15 = $$3.b_($$5);
                  epo $$16 = $$14.k($$3, $$5);
                  double $$17 = $$16.b(ih.a.b, $$12, $$13);
                  double $$18 = (double)$$15.a($$3, $$5);
                  double $$19 = Math.max($$17, $$18);
                  jz $$20 = !$$15.a(auj.b) && !$$14.a(czh.kJ) && !czt.g($$14) ? kb.aa : kb.ab;
                  this.q.r.a($$20, (double)$$5.u() + $$12, (double)$$5.v() + $$19, (double)$$5.w() + $$13, 0.0, 0.0, 0.0);
               }
            }
         }

         if ($$5 != null && $$2.a(3) < this.aq++) {
            this.aq = 0;
            if ($$5.v() > $$4.v() + 1 && $$3.a(drq.a.e, $$4).v() > awm.d((float)$$4.v())) {
               this.q.r.a($$5, atp.Bw, atq.d, 0.1F, 0.5F, false);
            } else {
               this.q.r.a($$5, atp.Bv, atq.d, 0.2F, 1.0F, false);
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
   public void a(asf $$0) {
      this.a();
      if (eyk.N()) {
         this.y();
      }
   }

   public void a() {
      if (this.K != null) {
         this.K.close();
      }

      ajc $$0 = new ajc("shaders/post/entity_outline.json");

      try {
         this.K = new fwt(this.q.Z(), this.q.aa(), this.q.g(), $$0);
         this.K.a(this.q.aN().k(), this.q.aN().l());
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
      ajc $$0 = new ajc("shaders/post/transparency.json");

      try {
         fwt $$1 = new fwt(this.q.Z(), this.q.aa(), this.q.g(), $$0);
         $$1.a(this.q.aN().k(), this.q.aN().l());
         erp $$2 = $$1.a("translucent");
         erp $$3 = $$1.a("itemEntity");
         erp $$4 = $$1.a("particles");
         erp $$5 = $$1.a("weather");
         erp $$6 = $$1.a("clouds");
         this.Q = $$1;
         this.L = $$2;
         this.M = $$3;
         this.N = $$4;
         this.O = $$5;
         this.P = $$6;
      } catch (Exception var8) {
         String $$8 = var8 instanceof JsonSyntaxException ? "parse" : "load";
         String $$9 = "Failed to " + $$8 + " shader: " + $$0;
         fwo.a $$10 = new fwo.a($$9, var8);
         if (this.q.ab().d().size() > 1) {
            vs $$11 = this.q.aa().b().findFirst().map($$0x -> vs.b($$0x.a())).orElse(null);
            this.q.m.j().a(eyd.b);
            this.q.a($$10, $$11, null);
         } else {
            this.q.m.j().a(eyd.b);
            this.q.m.as();
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
         this.J.c(this.q.aN().k(), this.q.aN().l(), false);
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.q.j.a() && this.J != null && this.K != null && this.q.s != null;
   }

   private void A() {
      etf $$0 = etf.b();
      esy $$1 = $$0.d();
      if (this.B != null) {
         this.B.close();
      }

      this.B = new etg(etg.a.a);
      esy.b $$2 = a($$1, -16.0F);
      this.B.a();
      this.B.a($$2);
      etg.b();
   }

   private void B() {
      etf $$0 = etf.b();
      esy $$1 = $$0.d();
      if (this.A != null) {
         this.A.close();
      }

      this.A = new etg(etg.a.a);
      esy.b $$2 = a($$1, 16.0F);
      this.A.a();
      this.A.a($$2);
      etg.b();
   }

   private static esy.b a(esy $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      float $$3 = 512.0F;
      RenderSystem.setShader(fwj::p);
      $$0.a(eti.b.g, etb.m);
      $$0.a(0.0, (double)$$1, 0.0).e();

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$0.a((double)($$2 * awm.b((float)$$4 * (float) (Math.PI / 180.0))), (double)$$1, (double)(512.0F * awm.a((float)$$4 * (float) (Math.PI / 180.0))))
            .e();
      }

      return $$0.d();
   }

   private void C() {
      etf $$0 = etf.b();
      esy $$1 = $$0.d();
      RenderSystem.setShader(fwj::p);
      if (this.z != null) {
         this.z.close();
      }

      this.z = new etg(etg.a.a);
      esy.b $$2 = this.a($$1);
      this.z.a();
      this.z.a($$2);
      etg.b();
   }

   private esy.b a(esy $$0) {
      awt $$1 = awt.a(10842L);
      $$0.a(eti.b.h, etb.m);

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

   public void a(@Nullable fra $$0) {
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
      if (eyk.N()) {
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
            this.ae = new fzq(this.u, this, ac.f(), this.t);
         } else {
            this.ae.a(this.u);
         }

         this.C = true;
         fwl.a(eyk.M());
         this.af = this.q.m.aA();
         if (this.y != null) {
            this.y.a();
         }

         this.ae.g();
         synchronized (this.x) {
            this.x.clear();
         }

         this.y = new fxh(this.ae, this.u, this.q.m.aA(), this);
         this.v.a(this.y);
         this.w.clear();
         bof $$0 = this.q.an();
         if ($$0 != null) {
            this.y.a($$0.do(), $$0.du());
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

   public fzq h() {
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
         fzq.b $$1 = (fzq.b)var2.next();
         if (!$$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String l() {
      return "E: " + this.ag + "/" + this.u.h() + ", B: " + this.ah + ", SD: " + this.u.m();
   }

   private void a(exv $$0, fzu $$1, boolean $$2, boolean $$3) {
      eov $$4 = $$0.b();
      if (this.q.m.aA() != this.af) {
         this.f();
      }

      this.u.ae().a("camera");
      double $$5 = this.q.s.do();
      double $$6 = this.q.s.dq();
      double $$7 = this.q.s.du();
      int $$8 = jd.a($$5);
      int $$9 = jd.a($$6);
      int $$10 = jd.a($$7);
      if (this.R != $$8 || this.S != $$9 || this.T != $$10) {
         this.R = $$8;
         this.S = $$9;
         this.T = $$10;
         this.y.a($$5, $$7);
      }

      this.ae.a($$4);
      this.u.ae().b("cull");
      this.q.aH().b("culling");
      ib $$11 = $$0.c();
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

         bof.b(awm.a((double)this.q.m.aA() / 8.0, 1.0, 2.5) * this.q.m.g().c());
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

   public static fzu a(fzu $$0) {
      return new fzu($$0).a(8);
   }

   private void b(fzu $$0) {
      if (!eyk.P().bv()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.q.aH().a("apply_frustum");
         this.w.clear();
         this.v.a($$0, this.w);
         this.q.aH().c();
      }
   }

   public void a(fzq.b $$0) {
      this.v.a($$0);
   }

   private void a(Matrix4f $$0, Matrix4f $$1, double $$2, double $$3, double $$4, fzu $$5) {
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

   public void a(eov $$0, Matrix4f $$1, Matrix4f $$2) {
      this.ai = new fzu($$1, $$2);
      this.ai.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(float $$0, long $$1, boolean $$2, exv $$3, fwj $$4, fwp $$5, Matrix4f $$6, Matrix4f $$7) {
      bmw $$8 = this.q.r.s();
      float $$9 = $$8.i() ? $$0 : 1.0F;
      RenderSystem.setShaderGameTime(this.u.X(), $$9);
      this.s.a(this.u, $$3, this.q.v);
      this.r.a(this.u, $$3, this.q.u);
      bjc $$10 = this.u.ae();
      $$10.b("light_update_queue");
      this.u.b();
      $$10.b("light_updates");
      this.u.i().p().a();
      eov $$11 = $$3.b();
      double $$12 = $$11.a();
      double $$13 = $$11.b();
      double $$14 = $$11.c();
      $$10.b("culling");
      boolean $$15 = this.ak != null;
      fzu $$16;
      if ($$15) {
         $$16 = this.ak;
         $$16.a(this.am.x, this.am.y, this.am.z);
      } else {
         $$16 = this.ai;
      }

      this.q.aH().b("captureFrustum");
      if (this.aj) {
         this.a($$6, $$7, $$11.c, $$11.d, $$11.e, $$15 ? new fzu($$6, $$7) : $$16);
         this.aj = false;
      }

      $$10.b("clear");
      fwi.a($$3, $$9, this.q.r, this.q.m.aA(), $$4.b($$9));
      fwi.b();
      RenderSystem.clear(16640, eyk.a);
      float $$18 = $$4.l();
      boolean $$19 = this.q.r.d().a(awm.a($$12), awm.a($$13)) || this.q.l.j().d();
      $$10.b("sky");
      RenderSystem.setShader(fwj::p);
      this.a($$6, $$7, $$9, $$3, $$19, () -> fwi.a($$3, fwi.d.a, $$18, $$19, $$9));
      $$10.b("fog");
      fwi.a($$3, fwi.d.b, Math.max($$18, 32.0F), $$19, $$9);
      $$10.b("terrain_setup");
      this.a($$3, $$16, $$15, this.q.s.P_());
      $$10.b("compile_sections");
      this.c($$3);
      $$10.b("terrain");
      this.a(fwy.c(), $$12, $$13, $$14, $$6, $$7);
      this.a(fwy.d(), $$12, $$13, $$14, $$6, $$7);
      this.a(fwy.e(), $$12, $$13, $$14, $$6, $$7);
      if (this.u.d().e()) {
         erz.a();
      } else {
         erz.b();
      }

      $$10.b("entities");
      this.ag = 0;
      this.ah = 0;
      if (this.M != null) {
         this.M.b(eyk.a);
         this.M.a(this.q.g());
         this.q.g().a(false);
      }

      if (this.O != null) {
         this.O.b(eyk.a);
      }

      if (this.d()) {
         this.J.b(eyk.a);
         this.q.g().a(false);
      }

      Matrix4fStack $$20 = RenderSystem.getModelViewStack();
      $$20.pushMatrix();
      $$20.mul($$6);
      RenderSystem.applyModelViewMatrix();
      boolean $$21 = false;
      etd $$22 = new etd();
      fwq.a $$23 = this.t.c();

      for (bof $$24 : this.u.e()) {
         if (this.r.a($$24, $$16, $$12, $$13, $$14) || $$24.y(this.q.s)) {
            ib $$25 = $$24.dj();
            if ((this.u.d($$25.v()) || this.a($$25))
               && ($$24 != $$3.g() || $$3.i() || $$3.g() instanceof box && ((box)$$3.g()).fF())
               && (!($$24 instanceof fvs) || $$3.g() == $$24)) {
               this.ag++;
               if ($$24.ag == 0) {
                  $$24.ab = $$24.do();
                  $$24.ac = $$24.dq();
                  $$24.ad = $$24.du();
               }

               fwq $$27;
               if (this.d() && this.q.b($$24)) {
                  $$21 = true;
                  fwr $$26 = this.t.e();
                  $$27 = $$26;
                  int $$28 = $$24.j_();
                  $$26.a(avw.b.b($$28), avw.b.c($$28), avw.b.d($$28), 255);
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
      $$23.a(fwy.c(ghy.e));
      $$23.a(fwy.d(ghy.e));
      $$23.a(fwy.e(ghy.e));
      $$23.a(fwy.k(ghy.e));
      $$10.b("blockentities");
      ObjectListIterator var42 = this.w.iterator();

      while (var42.hasNext()) {
         fzq.b $$31 = (fzq.b)var42.next();
         List<djl> $$32 = $$31.d().b();
         if (!$$32.isEmpty()) {
            for (djl $$33 : $$32) {
               ib $$34 = $$33.aD_();
               fwq $$35 = $$23;
               $$22.a();
               $$22.a((double)$$34.u() - $$12, (double)$$34.v() - $$13, (double)$$34.w() - $$14);
               SortedSet<aoh> $$36 = (SortedSet<aoh>)this.H.get($$34.a());
               if ($$36 != null && !$$36.isEmpty()) {
                  int $$37 = $$36.last().c();
                  if ($$37 >= 0) {
                     etd.a $$38 = $$22.c();
                     eth $$39 = new ete(this.t.d().getBuffer(gke.l.get($$37)), $$38, 1.0F);
                     $$35 = $$2x -> {
                        eth $$3x = $$23.getBuffer($$2x);
                        return $$2x.N() ? etk.a($$39, $$3x) : $$3x;
                     };
                  }
               }

               this.s.a($$33, $$9, $$22, $$35);
               $$22.b();
            }
         }
      }

      synchronized (this.x) {
         for (djl $$40 : this.x) {
            ib $$41 = $$40.aD_();
            $$22.a();
            $$22.a((double)$$41.u() - $$12, (double)$$41.v() - $$13, (double)$$41.w() - $$14);
            this.s.a($$40, $$9, $$22, $$23);
            $$22.b();
         }
      }

      this.a($$22);
      $$23.a(fwy.c());
      $$23.a(fwy.u());
      $$23.a(fwy.v());
      $$23.a(fxf.h());
      $$23.a(fxf.i());
      $$23.a(fxf.c());
      $$23.a(fxf.d());
      $$23.a(fxf.e());
      $$23.a(fxf.f());
      $$23.a(fxf.g());
      this.t.e().a();
      if ($$21) {
         this.K.a($$9);
         this.q.g().a(false);
      }

      $$10.b("destroyProgress");
      ObjectIterator var44 = this.H.long2ObjectEntrySet().iterator();

      while (var44.hasNext()) {
         Entry<SortedSet<aoh>> $$42 = (Entry<SortedSet<aoh>>)var44.next();
         ib $$43 = ib.d($$42.getLongKey());
         double $$44 = (double)$$43.u() - $$12;
         double $$45 = (double)$$43.v() - $$13;
         double $$46 = (double)$$43.w() - $$14;
         if (!($$44 * $$44 + $$45 * $$45 + $$46 * $$46 > 1024.0)) {
            SortedSet<aoh> $$47 = (SortedSet<aoh>)$$42.getValue();
            if ($$47 != null && !$$47.isEmpty()) {
               int $$48 = $$47.last().c();
               $$22.a();
               $$22.a((double)$$43.u() - $$12, (double)$$43.v() - $$13, (double)$$43.w() - $$14);
               etd.a $$49 = $$22.c();
               eth $$50 = new ete(this.t.d().getBuffer(gke.l.get($$48)), $$49, 1.0F);
               this.q.ao().a(this.u.a_($$43), $$43, this.u, $$22, $$50);
               $$22.b();
            }
         }
      }

      this.a($$22);
      eot $$51 = this.q.v;
      if ($$2 && $$51 != null && $$51.c() == eot.a.b) {
         $$10.b("outline");
         ib $$52 = ((eor)$$51).a();
         dme $$53 = this.u.a_($$52);
         if (!$$53.i() && this.u.D_().a($$52)) {
            eth $$54 = $$23.getBuffer(fwy.y());
            this.a($$22, $$54, $$3.g(), $$12, $$13, $$14, $$52, $$53);
         }
      }

      this.q.k.a($$22, $$23, $$12, $$13, $$14);
      $$23.a();
      $$23.a(fxf.k());
      $$23.a(fxf.a());
      $$23.a(fxf.b());
      $$23.a(fwy.j());
      $$23.a(fwy.k());
      $$23.a(fwy.m());
      $$23.a(fwy.n());
      $$23.a(fwy.l());
      $$23.a(fwy.o());
      $$23.a(fwy.p());
      $$23.a(fwy.i());
      this.t.d().b();
      if (this.Q != null) {
         $$23.a(fwy.y());
         $$23.b();
         this.L.b(eyk.a);
         this.L.a(this.q.g());
         $$10.b("translucent");
         this.a(fwy.f(), $$12, $$13, $$14, $$6, $$7);
         $$10.b("string");
         this.a(fwy.t(), $$12, $$13, $$14, $$6, $$7);
         this.N.b(eyk.a);
         this.N.a(this.q.g());
         fwx.aM.a();
         $$10.b("particles");
         this.q.g.a($$5, $$3, $$9);
         fwx.aM.b();
      } else {
         $$10.b("translucent");
         if (this.L != null) {
            this.L.b(eyk.a);
         }

         this.a(fwy.f(), $$12, $$13, $$14, $$6, $$7);
         $$23.a(fwy.y());
         $$23.b();
         $$10.b("string");
         this.a(fwy.t(), $$12, $$13, $$14, $$6, $$7);
         $$10.b("particles");
         this.q.g.a($$5, $$3, $$9);
      }

      if (this.q.m.av() != exy.a) {
         if (this.Q != null) {
            this.P.b(eyk.a);
         }

         $$10.b("clouds");
         this.a($$22, $$6, $$7, $$9, $$12, $$13, $$14);
      }

      if (this.Q != null) {
         fwx.aN.a();
         $$10.b("weather");
         this.a($$5, $$9, $$12, $$13, $$14);
         this.d($$3);
         fwx.aN.b();
         this.Q.a($$9);
         this.q.g().a(false);
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
      fwi.a();
   }

   private void a(etd $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bof $$0, double $$1, double $$2, double $$3, float $$4, etd $$5, fwq $$6) {
      double $$7 = awm.d((double)$$4, $$0.ab, $$0.do());
      double $$8 = awm.d((double)$$4, $$0.ac, $$0.dq());
      double $$9 = awm.d((double)$$4, $$0.ad, $$0.du());
      float $$10 = awm.i($$4, $$0.M, $$0.dz());
      this.r.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$10, $$4, $$5, $$6, this.r.a($$0, $$4));
   }

   private void a(fwy $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      $$0.a();
      if ($$0 == fwy.f()) {
         this.q.aH().a("translucent_sort");
         double $$6 = $$1 - this.an;
         double $$7 = $$2 - this.ao;
         double $$8 = $$3 - this.ap;
         if ($$6 * $$6 + $$7 * $$7 + $$8 * $$8 > 1.0) {
            int $$9 = jd.a($$1);
            int $$10 = jd.a($$2);
            int $$11 = jd.a($$3);
            boolean $$12 = $$9 != jd.a(this.an) || $$11 != jd.a(this.ap) || $$10 != jd.a(this.ao);
            this.an = $$1;
            this.ao = $$2;
            this.ap = $$3;
            int $$13 = 0;
            ObjectListIterator var21 = this.w.iterator();

            while (var21.hasNext()) {
               fzq.b $$14 = (fzq.b)var21.next();
               if ($$13 < 15 && ($$12 || $$14.b($$9, $$10, $$11)) && $$14.a($$0, this.ae)) {
                  $$13++;
               }
            }
         }

         this.q.aH().c();
      }

      this.q.aH().a("filterempty");
      this.q.aH().b(() -> "render_" + $$0);
      boolean $$15 = $$0 != fwy.f();
      ObjectListIterator<fzq.b> $$16 = this.w.listIterator($$15 ? 0 : this.w.size());
      fxe $$17 = RenderSystem.getShader();

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
      esu $$20 = $$17.p;

      while ($$15 ? $$16.hasNext() : $$16.hasPrevious()) {
         fzq.b $$21 = $$15 ? (fzq.b)$$16.next() : (fzq.b)$$16.previous();
         if (!$$21.d().a($$0)) {
            etg $$22 = $$21.a($$0);
            ib $$23 = $$21.f();
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
      etg.b();
      this.q.aH().c();
      $$0.b();
   }

   private void a(etd $$0, fwq $$1, exv $$2) {
      if (this.q.B || this.q.C) {
         double $$3 = $$2.b().a();
         double $$4 = $$2.b().b();
         double $$5 = $$2.b().c();
         ObjectListIterator var10 = this.w.iterator();

         while (var10.hasNext()) {
            fzq.b $$6 = (fzq.b)var10.next();
            fxd.d $$7 = this.v.b($$6);
            if ($$7 != null) {
               ib $$8 = $$6.f();
               $$0.a();
               $$0.a((double)$$8.u() - $$3, (double)$$8.v() - $$4, (double)$$8.w() - $$5);
               Matrix4f $$9 = $$0.c().a();
               if (this.q.B) {
                  eth $$10 = $$1.getBuffer(fwy.y());
                  int $$11 = $$7.b == 0 ? 0 : awm.h((float)$$7.b / 50.0F, 0.9F, 0.9F);
                  int $$12 = $$11 >> 16 & 0xFF;
                  int $$13 = $$11 >> 8 & 0xFF;
                  int $$14 = $$11 & 0xFF;

                  for (int $$15 = 0; $$15 < d.length; $$15++) {
                     if ($$7.a($$15)) {
                        ih $$16 = d[$$15];
                        $$10.a($$9, 8.0F, 8.0F, 8.0F).a($$12, $$13, $$14, 255).a((float)$$16.j(), (float)$$16.k(), (float)$$16.l()).e();
                        $$10.a($$9, (float)(8 - 16 * $$16.j()), (float)(8 - 16 * $$16.k()), (float)(8 - 16 * $$16.l()))
                           .a($$12, $$13, $$14, 255)
                           .a((float)$$16.j(), (float)$$16.k(), (float)$$16.l())
                           .e();
                     }
                  }
               }

               if (this.q.C && !$$6.d().a()) {
                  eth $$17 = $$1.getBuffer(fwy.y());
                  int $$18 = 0;

                  for (ih $$19 : d) {
                     for (ih $$20 : d) {
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
                     eth $$22 = $$1.getBuffer(fwy.B());
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
         eth $$26 = $$1.getBuffer(fwy.B());
         this.a($$26, $$25, 0, 1, 2, 3, 0, 1, 1);
         this.a($$26, $$25, 4, 5, 6, 7, 1, 0, 0);
         this.a($$26, $$25, 0, 1, 5, 4, 1, 1, 0);
         this.a($$26, $$25, 2, 3, 7, 6, 0, 0, 1);
         this.a($$26, $$25, 0, 4, 7, 3, 0, 1, 0);
         this.a($$26, $$25, 1, 5, 6, 2, 1, 0, 1);
         eth $$27 = $$1.getBuffer(fwy.y());
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

   private void a(eth $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a(0, 0, 0, 255).a(0.0F, 0.0F, -1.0F).e();
   }

   private void a(eth $$0, Matrix4f $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
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
         Iterator<aoh> $$0 = this.G.values().iterator();

         while ($$0.hasNext()) {
            aoh $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.F - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(aoh $$0) {
      long $$1 = $$0.b().a();
      Set<aoh> $$2 = (Set<aoh>)this.H.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.H.remove($$1);
      }
   }

   private void b(etd $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(fwj::t);
      RenderSystem.setShaderTexture(0, m);
      etf $$1 = etf.b();
      esy $$2 = $$1.d();

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
         $$2.a(eti.b.h, etb.s);
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

   public void a(Matrix4f $$0, Matrix4f $$1, float $$2, exv $$3, boolean $$4, Runnable $$5) {
      $$5.run();
      if (!$$4) {
         eht $$6 = $$3.k();
         if ($$6 != eht.c && $$6 != eht.a && !this.b($$3)) {
            etd $$7 = new etd();
            $$7.a($$0);
            if (this.q.r.d().c() == fwf.d.c) {
               this.b($$7);
            } else if (this.q.r.d().c() == fwf.d.b) {
               eov $$8 = this.u.a(this.q.j.m().b(), $$2);
               float $$9 = (float)$$8.c;
               float $$10 = (float)$$8.d;
               float $$11 = (float)$$8.e;
               fwi.b();
               esy $$12 = etf.b().d();
               RenderSystem.depthMask(false);
               RenderSystem.setShaderColor($$9, $$10, $$11, 1.0F);
               fxe $$13 = RenderSystem.getShader();
               this.A.a();
               this.A.a($$7.c().a(), $$1, $$13);
               etg.b();
               RenderSystem.enableBlend();
               float[] $$14 = this.u.d().a(this.u.f($$2), $$2);
               if ($$14 != null) {
                  RenderSystem.setShader(fwj::q);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  $$7.a();
                  $$7.a(a.b.rotationDegrees(90.0F));
                  float $$15 = awm.a(this.u.a($$2)) < 0.0F ? 180.0F : 0.0F;
                  $$7.a(a.f.rotationDegrees($$15));
                  $$7.a(a.f.rotationDegrees(90.0F));
                  float $$16 = $$14[0];
                  float $$17 = $$14[1];
                  float $$18 = $$14[2];
                  Matrix4f $$19 = $$7.c().a();
                  $$12.a(eti.b.g, etb.n);
                  $$12.a($$19, 0.0F, 100.0F, 0.0F).a($$16, $$17, $$18, $$14[3]).e();
                  int $$20 = 16;

                  for (int $$21 = 0; $$21 <= 16; $$21++) {
                     float $$22 = (float)$$21 * (float) (Math.PI * 2) / 16.0F;
                     float $$23 = awm.a($$22);
                     float $$24 = awm.b($$22);
                     $$12.a($$19, $$23 * 120.0F, $$24 * 120.0F, -$$24 * 40.0F * $$14[3]).a($$14[0], $$14[1], $$14[2], 0.0F).e();
                  }

                  esz.a($$12.d());
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
               RenderSystem.setShader(fwj::s);
               RenderSystem.setShaderTexture(0, l);
               $$12.a(eti.b.h, etb.q);
               $$12.a($$26, -$$27, 100.0F, -$$27).a(0.0F, 0.0F).e();
               $$12.a($$26, $$27, 100.0F, -$$27).a(1.0F, 0.0F).e();
               $$12.a($$26, $$27, 100.0F, $$27).a(1.0F, 1.0F).e();
               $$12.a($$26, -$$27, 100.0F, $$27).a(0.0F, 1.0F).e();
               esz.a($$12.d());
               $$27 = 20.0F;
               RenderSystem.setShaderTexture(0, k);
               int $$28 = this.u.ap();
               int $$29 = $$28 % 4;
               int $$30 = $$28 / 4 % 2;
               float $$31 = (float)($$29 + 0) / 4.0F;
               float $$32 = (float)($$30 + 0) / 2.0F;
               float $$33 = (float)($$29 + 1) / 4.0F;
               float $$34 = (float)($$30 + 1) / 2.0F;
               $$12.a(eti.b.h, etb.q);
               $$12.a($$26, -$$27, -100.0F, $$27).a($$33, $$34).e();
               $$12.a($$26, $$27, -100.0F, $$27).a($$31, $$34).e();
               $$12.a($$26, $$27, -100.0F, -$$27).a($$31, $$32).e();
               $$12.a($$26, -$$27, -100.0F, -$$27).a($$33, $$32).e();
               esz.a($$12.d());
               float $$35 = this.u.i($$2) * $$25;
               if ($$35 > 0.0F) {
                  RenderSystem.setShaderColor($$35, $$35, $$35, $$35);
                  fwi.a();
                  this.z.a();
                  this.z.a($$7.c().a(), $$1, fwj.p());
                  etg.b();
                  $$5.run();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.disableBlend();
               RenderSystem.defaultBlendFunc();
               $$7.b();
               RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
               double $$36 = this.q.s.j($$2).d - this.u.k().a(this.u);
               if ($$36 < 0.0) {
                  $$7.a();
                  $$7.a(0.0F, 12.0F, 0.0F);
                  this.B.a();
                  this.B.a($$7.c().a(), $$1, $$13);
                  etg.b();
                  $$7.b();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.depthMask(true);
            }
         }
      }
   }

   private boolean b(exv $$0) {
      return !($$0.g() instanceof box $$1) ? false : $$1.a(bnu.o) || $$1.a(bnu.G);
   }

   public void a(etd $$0, Matrix4f $$1, Matrix4f $$2, float $$3, double $$4, double $$5, double $$6) {
      float $$7 = this.u.d().a();
      if (!Float.isNaN($$7)) {
         float $$8 = 12.0F;
         float $$9 = 4.0F;
         double $$10 = 2.0E-4;
         double $$11 = (double)(((float)this.F + $$3) * 0.03F);
         double $$12 = ($$4 + $$11) / 12.0;
         double $$13 = (double)($$7 - (float)$$5 + 0.33F);
         double $$14 = $$6 / 12.0 + 0.33F;
         $$12 -= (double)(awm.a($$12 / 2048.0) * 2048);
         $$14 -= (double)(awm.a($$14 / 2048.0) * 2048);
         float $$15 = (float)($$12 - (double)awm.a($$12));
         float $$16 = (float)($$13 / 4.0 - (double)awm.a($$13 / 4.0)) * 4.0F;
         float $$17 = (float)($$14 - (double)awm.a($$14));
         eov $$18 = this.u.h($$3);
         int $$19 = (int)Math.floor($$12);
         int $$20 = (int)Math.floor($$13 / 4.0);
         int $$21 = (int)Math.floor($$14);
         if ($$19 != this.Z || $$20 != this.aa || $$21 != this.ab || this.q.m.av() != this.ad || this.ac.g($$18) > 2.0E-4) {
            this.Z = $$19;
            this.aa = $$20;
            this.ab = $$21;
            this.ac = $$18;
            this.ad = this.q.m.av();
            this.C = true;
         }

         if (this.C) {
            this.C = false;
            esy $$22 = etf.b().d();
            if (this.D != null) {
               this.D.close();
            }

            this.D = new etg(etg.a.a);
            esy.b $$23 = this.a($$22, $$12, $$13, $$14, $$18);
            this.D.a();
            this.D.a($$23);
            etg.b();
         }

         fwi.b();
         $$0.a();
         $$0.a($$1);
         $$0.b(12.0F, 1.0F, 12.0F);
         $$0.a(-$$15, $$16, -$$17);
         if (this.D != null) {
            this.D.a();
            int $$24 = this.ad == exy.c ? 0 : 1;

            for (int $$25 = $$24; $$25 < 2; $$25++) {
               fwy $$26 = $$25 == 0 ? fwy.x() : fwy.w();
               $$26.a();
               fxe $$27 = RenderSystem.getShader();
               this.D.a($$0.c().a(), $$2, $$27);
               $$26.b();
            }

            etg.b();
         }

         $$0.b();
      }
   }

   private esy.b a(esy $$0, double $$1, double $$2, double $$3, eov $$4) {
      float $$5 = 4.0F;
      float $$6 = 0.00390625F;
      int $$7 = 8;
      int $$8 = 4;
      float $$9 = 9.765625E-4F;
      float $$10 = (float)awm.a($$1) * 0.00390625F;
      float $$11 = (float)awm.a($$3) * 0.00390625F;
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
      $$0.a(eti.b.h, etb.v);
      float $$24 = (float)Math.floor($$2 / 4.0) * 4.0F;
      if (this.ad == exy.c) {
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

   private void c(exv $$0) {
      this.q.aH().a("populate_sections_to_compile");
      ehg $$1 = this.u.z_();
      fzp $$2 = new fzp();
      ib $$3 = $$0.c();
      List<fzq.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.w.iterator();

      while (var6.hasNext()) {
         fzq.b $$5 = (fzq.b)var6.next();
         jd $$6 = jd.a($$5.f());
         if ($$5.h() && $$1.a($$6)) {
            boolean $$7 = false;
            if (this.q.m.l().c() == eyr.c) {
               ib $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.i();
            } else if (this.q.m.l().c() == eyr.b) {
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

      for (fzq.b $$9 : $$4) {
         $$9.a(this.ae, $$2);
         $$9.g();
      }

      this.q.aH().c();
   }

   private void d(exv $$0) {
      esy $$1 = etf.b().d();
      dnv $$2 = this.u.D_();
      double $$3 = (double)(this.q.m.aA() * 16);
      if (!($$0.b().c < $$2.g() - $$3) || !($$0.b().c > $$2.e() + $$3) || !($$0.b().e < $$2.h() - $$3) || !($$0.b().e > $$2.f() + $$3)) {
         double $$4 = 1.0 - $$2.b($$0.b().c, $$0.b().e) / $$3;
         $$4 = Math.pow($$4, 4.0);
         $$4 = awm.a($$4, 0.0, 1.0);
         double $$5 = $$0.b().c;
         double $$6 = $$0.b().e;
         double $$7 = (double)this.q.j.h();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
         RenderSystem.setShaderTexture(0, n);
         RenderSystem.depthMask(eyk.N());
         int $$8 = $$2.d().a();
         float $$9 = (float)($$8 >> 16 & 0xFF) / 255.0F;
         float $$10 = (float)($$8 >> 8 & 0xFF) / 255.0F;
         float $$11 = (float)($$8 & 0xFF) / 255.0F;
         RenderSystem.setShaderColor($$9, $$10, $$11, (float)$$4);
         RenderSystem.setShader(fwj::s);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.disableCull();
         float $$12 = (float)(ac.b() % 3000L) / 3000.0F;
         float $$13 = (float)(-awm.e($$0.b().d * 0.5));
         float $$14 = $$13 + (float)$$7;
         $$1.a(eti.b.h, etb.q);
         double $$15 = Math.max((double)awm.a($$6 - $$3), $$2.f());
         double $$16 = Math.min((double)awm.c($$6 + $$3), $$2.h());
         float $$17 = (float)(awm.a($$15) & 1) * 0.5F;
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

         $$15 = Math.max((double)awm.a($$5 - $$3), $$2.e());
         $$16 = Math.min((double)awm.c($$5 + $$3), $$2.g());
         $$17 = (float)(awm.a($$15) & 1) * 0.5F;
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

         esz.a($$1.d());
         RenderSystem.enableCull();
         RenderSystem.polygonOffset(0.0F, 0.0F);
         RenderSystem.disablePolygonOffset();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.depthMask(true);
      }
   }

   private void a(etd $$0, eth $$1, bof $$2, double $$3, double $$4, double $$5, ib $$6, dme $$7) {
      a($$0, $$1, $$7.a(this.u, $$6, epa.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   private static eov a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(awm.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new eov(1.0, (double)$$3, 0.0);
         case 1 -> new eov((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new eov(0.0, 1.0, (double)$$3);
         case 3 -> new eov(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new eov((double)$$3, 0.0, 1.0);
         case 5 -> new eov(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static eov a(float $$0, float $$1, float $$2, float $$3) {
      eov $$4 = a($$3).a((double)$$0);
      eov $$5 = a(($$3 + 0.33333334F) % 1.0F).a((double)$$1);
      eov $$6 = a(($$3 + 0.6666667F) % 1.0F).a((double)$$2);
      eov $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.c), Math.max($$7.d, $$7.e));
      return new eov($$7.c / $$8, $$7.d / $$8, $$7.e / $$8);
   }

   public static void a(etd $$0, eth $$1, epo $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<eoq> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         a($$0, $$1, epl.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            eoq $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            eov $$16 = a($$6, $$7, $$8, $$15);
            a($$0, $$1, epl.a($$14), $$3, $$4, $$5, (float)$$16.c, (float)$$16.d, (float)$$16.e, $$9);
         }
      }
   }

   private static void a(etd $$0, eth $$1, epo $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9) {
      etd.a $$10 = $$0.c();
      $$2.a(($$9x, $$10x, $$11, $$12, $$13, $$14) -> {
         float $$15 = (float)($$12 - $$9x);
         float $$16 = (float)($$13 - $$10x);
         float $$17 = (float)($$14 - $$11);
         float $$18 = awm.c($$15 * $$15 + $$16 * $$16 + $$17 * $$17);
         $$15 /= $$18;
         $$16 /= $$18;
         $$17 /= $$18;
         $$1.a($$10, (float)($$9x + $$3), (float)($$10x + $$4), (float)($$11 + $$5)).a($$6, $$7, $$8, $$9).b($$10, $$15, $$16, $$17).e();
         $$1.a($$10, (float)($$12 + $$3), (float)($$13 + $$4), (float)($$14 + $$5)).a($$6, $$7, $$8, $$9).b($$10, $$15, $$16, $$17).e();
      });
   }

   public static void a(eth $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, float $$8, float $$9, float $$10) {
      a(new etd(), $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$7, $$8, $$9);
   }

   public static void a(etd $$0, eth $$1, eoq $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6, $$3, $$4, $$5);
   }

   public static void a(etd $$0, eth $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$8, $$9, $$10);
   }

   public static void a(
      etd $$0,
      eth $$1,
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
      etd.a $$15 = $$0.c();
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

   public static void b(etd $$0, eth $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, (float)$$2, (float)$$3, (float)$$4, (float)$$5, (float)$$6, (float)$$7, $$8, $$9, $$10, $$11);
   }

   public static void a(etd $$0, eth $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
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

   public void a(cvk $$0, ib $$1, dme $$2, dme $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(ib $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(jd.a($$3), jd.a($$4), jd.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(jd.a($$7), jd.a($$8), jd.a($$6));
            }
         }
      }
   }

   public void a(ib $$0, dme $$1, dme $$2) {
      if (this.q.aD().a($$1, $$2)) {
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

   public void a(@Nullable ato $$0, ib $$1) {
      glm $$2 = this.I.get($$1);
      if ($$2 != null) {
         this.q.aj().b($$2);
         this.I.remove($$1);
      }

      if ($$0 != null) {
         cqi $$3 = cqi.a($$0);
         if ($$3 != null) {
            this.q.l.a($$3.i());
         }

         glm var5 = glh.a($$0, eov.b($$1));
         this.I.put($$1, var5);
         this.q.aj().a(var5);
      }

      this.a(this.u, $$1, $$0 != null);
   }

   private void a(cwe $$0, ib $$1, boolean $$2) {
      for (box $$4 : $$0.a(box.class, new eoq($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }

   public void a(jz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(jz $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", kh.j.b($$0.a()));
         $$11.a("Parameters", () -> $$0.a(this.u.I_()));
         $$11.a("Position", () -> p.a(this.u, $$3, $$4, $$5));
         throw new y($$10);
      }
   }

   private <T extends jz> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private fue b(jz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private fue b(jz $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      exv $$9 = this.q.j.m();
      eyp $$10 = this.a($$2);
      if ($$1) {
         return this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == eyp.c ? null : this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private eyp a(boolean $$0) {
      eyp $$1 = this.q.m.ao().c();
      if ($$0 && $$1 == eyp.c && this.u.z.a(10) == 0) {
         $$1 = eyp.b;
      }

      if ($$1 == eyp.b && this.u.z.a(3) == 0) {
         $$1 = eyp.c;
      }

      return $$1;
   }

   public void p() {
   }

   public void a(int $$0, ib $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            exv $$3 = this.q.j.m();
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
                  this.u.a($$8, $$9, $$10, atp.BX, atq.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.u.a($$8, $$9, $$10, atp.ii, atq.f, 1.0F, 1.0F, false);
               } else {
                  this.u.a($$8, $$9, $$10, atp.hN, atq.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, ib $$1, int $$2) {
      awt $$3 = this.u.z;
      switch ($$0) {
         case 1000:
            this.u.a($$1, atp.gF, atq.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.u.a($$1, atp.gG, atq.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.u.a($$1, atp.gH, atq.e, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.u.a($$1, atp.hU, atq.g, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.u.a($$1, atp.iC, atq.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.u.a($$1, atp.iG, atq.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.u.a($$1, atp.jR, atq.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            if (cpl.b($$2) instanceof cqi $$73) {
               this.a($$73.j(), $$1);
            }
            break;
         case 1011:
            this.a(null, $$1);
            break;
         case 1015:
            this.u.a($$1, atp.kb, atq.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.u.a($$1, atp.ka, atq.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.u.a($$1, atp.hS, atq.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.u.a($$1, atp.ci, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.u.a($$1, atp.CG, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.u.a($$1, atp.CH, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.u.a($$1, atp.CI, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.u.a($$1, atp.BP, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.u.a($$1, atp.BS, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.u.a($$1, atp.bH, atq.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.u.a($$1, atp.CQ, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.u.a($$1, atp.CX, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.u.a($$1, atp.V, atq.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.u.a($$1, atp.ab, atq.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.u.a($$1, atp.Y, atq.e, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.q.aj().a(glh.b(atp.ub, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.u.a($$1, atp.eY, atq.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.u.a($$1, atp.eX, atq.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.u.a($$1, atp.cJ, atq.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.u.a($$1, atp.sO, atq.f, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.u.a($$1, atp.CJ, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.u.a($$1, atp.mC, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.u.a($$1, atp.la, atq.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.u.a($$1, atp.cr, atq.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.u.a($$1, atp.xC, atq.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.u.a($$1, atp.hi, atq.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.u.a($$1, atp.hl, atq.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.u.a($$1, atp.hm, atq.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.u.a($$1, atp.wv, atq.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.u.a($$1, atp.fT, atq.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.u.a($$1, atp.fU, atq.e, 1.0F, 1.0F, false);
            break;
         case 1500:
            daq.a(this.u, $$1, $$2 > 0);
            break;
         case 1501:
            this.u.a($$1, atp.ns, atq.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$56 = 0; $$56 < 8; $$56++) {
               this.u.a(kb.U, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.u.a($$1, atp.uO, atq.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$57 = 0; $$57 < 5; $$57++) {
               double $$58 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$59 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$60 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.u.a(kb.ab, $$58, $$59, $$60, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.u.a($$1, atp.ih, atq.e, 1.0F, 1.0F, false);

            for (int $$61 = 0; $$61 < 16; $$61++) {
               double $$62 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$63 = (double)$$1.v() + 0.8125;
               double $$64 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.u.a(kb.ab, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            dew.a(this.u, $$1, this.u.a_($$1));
            break;
         case 1505:
            cnn.a(this.u, $$1, $$2);
            this.u.a($$1, atp.cq, atq.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, kb.ab);
            break;
         case 2001:
            dme $$23 = czf.a($$2);
            if (!$$23.i()) {
               dgr $$24 = $$23.w();
               this.u.a($$1, $$24.c(), atq.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.u.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            eov $$9 = eov.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.a(new jx(kb.Q, new cpq(cpt.vk)), $$9.c, $$9.d, $$9.e, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            jz $$14 = $$0 == 2007 ? kb.P : kb.q;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               fue $$21 = this.b($$14, $$14.a().b(), $$9.c + $$18 * 0.1, $$9.d + 0.3, $$9.e + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.u.a($$1, atp.yi, atq.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.a(new jx(kb.Q, new cpq(cpt.sr)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.a(kb.Z, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.a(kb.Z, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.u.a(kb.ab, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.u.a(kb.E, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$65 = 0; $$65 < 200; $$65++) {
               float $$66 = $$3.i() * 4.0F;
               float $$67 = $$3.i() * (float) (Math.PI * 2);
               double $$68 = (double)(awm.b($$67) * $$66);
               double $$69 = 0.01 + $$3.j() * 0.5;
               double $$70 = (double)(awm.a($$67) * $$66);
               fue $$71 = this.b(kb.i, false, (double)$$1.u() + $$68 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$70 * 0.1, $$68, $$69, $$70);
               if ($$71 != null) {
                  $$71.c($$66);
               }
            }

            if ($$2 == 1) {
               this.u.a($$1, atp.hO, atq.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.u.a(kb.x, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$72 = 0; $$72 < 8; $$72++) {
               this.u.a(kb.f, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2010:
            this.a($$2, $$1, $$3, kb.ac);
            break;
         case 2011:
            awp.a(this.u, $$1, $$2, kb.M);
            break;
         case 2012:
            awp.a(this.u, $$1, $$2, kb.M);
            break;
         case 3000:
            this.u.a(kb.w, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.u.a($$1, atp.ig, atq.e, 10.0F, (1.0F + (this.u.z.i() - this.u.z.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.u.a($$1, atp.hQ, atq.f, 64.0F, 0.8F + this.u.z.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < ih.a.d.length) {
               awp.a(ih.a.d[$$2], this.u, $$1, 0.125, kb.aQ, blw.a(10, 19));
            } else {
               awp.a(this.u, $$1, kb.aQ, blw.a(3, 5));
            }
            break;
         case 3003:
            awp.a(this.u, $$1, kb.aO, blw.a(3, 5));
            this.u.a($$1, atp.me, atq.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            awp.a(this.u, $$1, kb.aP, blw.a(3, 5));
            break;
         case 3005:
            awp.a(this.u, $$1, kb.aR, blw.a(3, 5));
            break;
         case 3006:
            int $$32 = $$2 >> 6;
            if ($$32 > 0) {
               if ($$3.i() < 0.3F + (float)$$32 * 0.1F) {
                  float $$33 = 0.15F + 0.02F * (float)$$32 * (float)$$32 * $$3.i();
                  float $$34 = 0.4F + 0.3F * (float)$$32 * $$3.i();
                  this.u.a($$1, atp.vn, atq.e, $$33, $$34, false);
               }

               byte $$35 = (byte)($$2 & 63);
               blq $$36 = blw.a(0, $$32);
               float $$37 = 0.005F;
               Supplier<eov> $$38 = () -> new eov(awm.a($$3, -0.005F, 0.005F), awm.a($$3, -0.005F, 0.005F), awm.a($$3, -0.005F, 0.005F));
               if ($$35 == 0) {
                  for (ih $$39 : ih.values()) {
                     float $$40 = $$39 == ih.a ? (float) Math.PI : 0.0F;
                     double $$41 = $$39.o() == ih.a.b ? 0.65 : 0.57;
                     awp.a(this.u, $$1, new kc($$40), $$36, $$39, $$38, $$41);
                  }
               } else {
                  for (ih $$42 : dee.a($$35)) {
                     float $$43 = $$42 == ih.b ? (float) Math.PI : 0.0F;
                     double $$44 = 0.35;
                     awp.a(this.u, $$1, new kc($$43), $$36, $$42, $$38, 0.35);
                  }
               }
            } else {
               this.u.a($$1, atp.vn, atq.e, 1.0F, 1.0F, false);
               boolean $$45 = this.u.a_($$1).r(this.u, $$1);
               int $$46 = $$45 ? 40 : 20;
               float $$47 = $$45 ? 0.45F : 0.25F;
               float $$48 = 0.07F;

               for (int $$49 = 0; $$49 < $$46; $$49++) {
                  float $$50 = 2.0F * $$3.i() - 1.0F;
                  float $$51 = 2.0F * $$3.i() - 1.0F;
                  float $$52 = 2.0F * $$3.i() - 1.0F;
                  this.u
                     .a(
                        kb.I,
                        (double)$$1.u() + 0.5 + (double)($$50 * $$47),
                        (double)$$1.v() + 0.5 + (double)($$51 * $$47),
                        (double)$$1.w() + 0.5 + (double)($$52 * $$47),
                        (double)($$50 * 0.07F),
                        (double)($$51 * 0.07F),
                        (double)($$52 * 0.07F)
                     );
               }
            }
            break;
         case 3007:
            for (int $$53 = 0; $$53 < 10; $$53++) {
               this.u.a(new kd($$53 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + dfy.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dme $$54 = this.u.a_($$1);
            boolean $$55 = $$54.b(dmu.C) && $$54.c(dmu.C);
            if (!$$55) {
               this.u.a((double)$$1.u() + 0.5, (double)$$1.v() + dfy.f, (double)$$1.w() + 0.5, atp.vK, atq.e, 2.0F, 0.6F + this.u.z.i() * 0.4F, false);
            }
            break;
         case 3008:
            dme $$25 = czf.a($$2);
            if ($$25.b() instanceof czk $$26) {
               this.u.a($$1, $$26.d(), atq.h, 1.0F, 1.0F, false);
            }

            this.u.a($$1, $$25);
            break;
         case 3009:
            awp.a(this.u, $$1, kb.aT, blw.a(3, 6));
            break;
         case 3011:
            dlh.a(this.u, $$1, $$3);
            break;
         case 3012:
            this.u.a($$1, atp.lJ, atq.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dlh.a(this.u, $$1, $$3);
            break;
         case 3013:
            this.u.a($$1, atp.lK, atq.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dlh.a(this.u, $$1, $$3, $$2);
            break;
         case 3014:
            this.u.a($$1, atp.lO, atq.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dlh.b(this.u, $$1, $$3);
            break;
         case 3015:
            if (this.u.c_($$1) instanceof dlm $$31) {
               dlm.a.a(this.u, $$31.aD_(), $$31.n(), $$31.c());
               this.u.a($$1, atp.zT, atq.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            dlm.a.a(this.u, $$1);
            this.u.a($$1, atp.zX, atq.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dlh.b(this.u, $$1, $$3);
      }
   }

   public void c(int $$0, ib $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         aoh $$4 = (aoh)this.G.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new aoh($$0, $$1);
            this.G.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.F);
         ((SortedSet)this.H.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         aoh $$3 = (aoh)this.G.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean q() {
      return this.ae.h();
   }

   public void a(cvl $$0) {
      this.v.a($$0);
   }

   public void r() {
      this.v.a();
      this.C = true;
   }

   public void a(Collection<djl> $$0, Collection<djl> $$1) {
      synchronized (this.x) {
         this.x.removeAll($$0);
         this.x.addAll($$1);
      }
   }

   public static int a(cvh $$0, ib $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(cvh $$0, dme $$1, ib $$2) {
      if ($$1.e($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(cwn.a, $$2);
         int $$4 = $$0.a(cwn.b, $$2);
         int $$5 = $$1.h();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(ib $$0) {
      fzq.b $$1 = this.y.a($$0);
      return $$1 != null && $$1.c.get() != fzq.a.a;
   }

   @Nullable
   public erp s() {
      return this.J;
   }

   @Nullable
   public erp t() {
      return this.L;
   }

   @Nullable
   public erp u() {
      return this.M;
   }

   @Nullable
   public erp v() {
      return this.N;
   }

   @Nullable
   public erp w() {
      return this.O;
   }

   @Nullable
   public erp x() {
      return this.P;
   }

   private void a(int $$0, ib $$1, awt $$2, ke $$3) {
      ih $$4 = ih.a($$0);
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
