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
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3d;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class fvj implements asb, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 16;
   public static final int b = 8;
   private static final float e = 512.0F;
   private static final int f = 32;
   private static final int g = 10;
   private static final int h = 21;
   private static final int i = 15;
   private static final aiy j = new aiy("textures/environment/moon_phases.png");
   private static final aiy k = new aiy("textures/environment/sun.png");
   private static final aiy l = new aiy("textures/environment/clouds.png");
   private static final aiy m = new aiy("textures/environment/end_sky.png");
   private static final aiy n = new aiy("textures/misc/forcefield.png");
   private static final aiy o = new aiy("textures/environment/rain.png");
   private static final aiy p = new aiy("textures/environment/snow.png");
   public static final ie[] c = ie.values();
   private final exh q;
   private final gaq r;
   private final fxk s;
   private final fvr t;
   @Nullable
   private fpx u;
   private final fvy v = new fvy();
   private final ObjectArrayList<fyk.b> w = new ObjectArrayList(10000);
   private final Set<dit> x = Sets.newHashSet();
   @Nullable
   private fwc y;
   @Nullable
   private esd z;
   @Nullable
   private esd A;
   @Nullable
   private esd B;
   private boolean C = true;
   @Nullable
   private esd D;
   private final fvu E = new fvu(100);
   private int F;
   private final Int2ObjectMap<aoc> G = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aoc>> H = new Long2ObjectOpenHashMap();
   private final Map<hz, gkg> I = Maps.newHashMap();
   @Nullable
   private eqm J;
   @Nullable
   private fvo K;
   @Nullable
   private eqm L;
   @Nullable
   private eqm M;
   @Nullable
   private eqm N;
   @Nullable
   private eqm O;
   @Nullable
   private eqm P;
   @Nullable
   private fvo Q;
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
   private ens ac = ens.b;
   @Nullable
   private ewv ad;
   @Nullable
   private fyk ae;
   private int af = -1;
   private int ag;
   private int ah;
   private fyo ai;
   private boolean aj;
   @Nullable
   private fyo ak;
   private final Vector4f[] al = new Vector4f[8];
   private final Vector3d am = new Vector3d(0.0, 0.0, 0.0);
   private double an;
   private double ao;
   private double ap;
   private int aq;
   private final float[] ar = new float[1024];
   private final float[] as = new float[1024];

   public fvj(exh $$0, gaq $$1, fxk $$2, fvr $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;

      for (int $$4 = 0; $$4 < 32; $$4++) {
         for (int $$5 = 0; $$5 < 32; $$5++) {
            float $$6 = (float)($$5 - 16);
            float $$7 = (float)($$4 - 16);
            float $$8 = awh.c($$6 * $$6 + $$7 * $$7);
            this.ar[$$4 << 5 | $$5] = -$$7 / $$8;
            this.as[$$4 << 5 | $$5] = $$6 / $$8;
         }
      }

      this.C();
      this.B();
      this.A();
   }

   private void a(fvk $$0, float $$1, double $$2, double $$3, double $$4) {
      float $$5 = this.q.r.d($$1);
      if (!($$5 <= 0.0F)) {
         $$0.c();
         cvn $$6 = this.q.r;
         int $$7 = awh.a($$2);
         int $$8 = awh.a($$3);
         int $$9 = awh.a($$4);
         esc $$10 = esc.b();
         erv $$11 = $$10.d();
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         int $$12 = 5;
         if (exh.L()) {
            $$12 = 10;
         }

         RenderSystem.depthMask(exh.M());
         int $$13 = -1;
         float $$14 = (float)this.F + $$1;
         RenderSystem.setShader(fve::u);
         hz.a $$15 = new hz.a();

         for (int $$16 = $$9 - $$12; $$16 <= $$9 + $$12; $$16++) {
            for (int $$17 = $$7 - $$12; $$17 <= $$7 + $$12; $$17++) {
               int $$18 = ($$16 - $$9 + 16) * 32 + $$17 - $$7 + 16;
               double $$19 = (double)this.ar[$$18] * 0.5;
               double $$20 = (double)this.as[$$18] * 0.5;
               $$15.b((double)$$17, $$3, (double)$$16);
               cwm $$21 = $$6.t($$15).a();
               if ($$21.c()) {
                  int $$22 = $$6.a(dqo.a.e, $$17, $$16);
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
                     awo $$26 = awo.a((long)($$17 * $$17 * 3121 + $$17 * 45238971 ^ $$16 * $$16 * 418711 + $$16 * 13761));
                     $$15.d($$17, $$23, $$16);
                     cwm.c $$27 = $$21.a($$15);
                     if ($$27 == cwm.c.b) {
                        if ($$13 != 0) {
                           if ($$13 >= 0) {
                              $$10.c();
                           }

                           $$13 = 0;
                           RenderSystem.setShaderTexture(0, o);
                           $$11.a(esf.b.h, ery.l);
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
                     } else if ($$27 == cwm.c.c) {
                        if ($$13 != 1) {
                           if ($$13 >= 0) {
                              $$10.c();
                           }

                           $$13 = 1;
                           RenderSystem.setShaderTexture(0, p);
                           $$11.a(esf.b.h, ery.l);
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

   public void a(ews $$0) {
      float $$1 = this.q.r.d(1.0F) / (exh.L() ? 1.0F : 2.0F);
      if (!($$1 <= 0.0F)) {
         awo $$2 = awo.a((long)this.F * 312987231L);
         cvq $$3 = this.q.r;
         hz $$4 = hz.a($$0.b());
         hz $$5 = null;
         int $$6 = (int)(100.0F * $$1 * $$1) / (this.q.m.ao().c() == exm.b ? 2 : 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            int $$8 = $$2.a(21) - 10;
            int $$9 = $$2.a(21) - 10;
            hz $$10 = $$3.a(dqo.a.e, $$4.b($$8, 0, $$9));
            if ($$10.v() > $$3.J_() && $$10.v() <= $$4.v() + 10 && $$10.v() >= $$4.v() - 10) {
               cwm $$11 = $$3.t($$10).a();
               if ($$11.a($$10) == cwm.c.b) {
                  $$5 = $$10.d();
                  if (this.q.m.ao().c() == exm.c) {
                     break;
                  }

                  double $$12 = $$2.j();
                  double $$13 = $$2.j();
                  dlf $$14 = $$3.a_($$5);
                  egp $$15 = $$3.b_($$5);
                  eol $$16 = $$14.k($$3, $$5);
                  double $$17 = $$16.b(ie.a.b, $$12, $$13);
                  double $$18 = (double)$$15.a($$3, $$5);
                  double $$19 = Math.max($$17, $$18);
                  jx $$20 = !$$15.a(aue.b) && !$$14.a(cyq.kJ) && !czc.g($$14) ? jz.aa : jz.ab;
                  this.q.r.a($$20, (double)$$5.u() + $$12, (double)$$5.v() + $$19, (double)$$5.w() + $$13, 0.0, 0.0, 0.0);
               }
            }
         }

         if ($$5 != null && $$2.a(3) < this.aq++) {
            this.aq = 0;
            if ($$5.v() > $$4.v() + 1 && $$3.a(dqo.a.e, $$4).v() > awh.d((float)$$4.v())) {
               this.q.r.a($$5, atk.Bi, atl.d, 0.1F, 0.5F, false);
            } else {
               this.q.r.a($$5, atk.Bh, atl.d, 0.2F, 1.0F, false);
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
   public void a(asa $$0) {
      this.a();
      if (exh.M()) {
         this.y();
      }
   }

   public void a() {
      if (this.K != null) {
         this.K.close();
      }

      aiy $$0 = new aiy("shaders/post/entity_outline.json");

      try {
         this.K = new fvo(this.q.Y(), this.q.Z(), this.q.g(), $$0);
         this.K.a(this.q.aM().k(), this.q.aM().l());
         this.J = this.K.a("final");
      } catch (IOException var3) {
         d.warn("Failed to load shader: {}", $$0, var3);
         this.K = null;
         this.J = null;
      } catch (JsonSyntaxException var4) {
         d.warn("Failed to parse shader: {}", $$0, var4);
         this.K = null;
         this.J = null;
      }
   }

   private void y() {
      this.z();
      aiy $$0 = new aiy("shaders/post/transparency.json");

      try {
         fvo $$1 = new fvo(this.q.Y(), this.q.Z(), this.q.g(), $$0);
         $$1.a(this.q.aM().k(), this.q.aM().l());
         eqm $$2 = $$1.a("translucent");
         eqm $$3 = $$1.a("itemEntity");
         eqm $$4 = $$1.a("particles");
         eqm $$5 = $$1.a("weather");
         eqm $$6 = $$1.a("clouds");
         this.Q = $$1;
         this.L = $$2;
         this.M = $$3;
         this.N = $$4;
         this.O = $$5;
         this.P = $$6;
      } catch (Exception var8) {
         String $$8 = var8 instanceof JsonSyntaxException ? "parse" : "load";
         String $$9 = "Failed to " + $$8 + " shader: " + $$0;
         fvj.a $$10 = new fvj.a($$9, var8);
         if (this.q.aa().d().size() > 1) {
            vq $$11 = this.q.Z().b().findFirst().map($$0x -> vq.b($$0x.a())).orElse(null);
            this.q.m.j().a(exa.b);
            this.q.a($$10, $$11, null);
         } else {
            this.q.m.j().a(exa.b);
            this.q.m.as();
            d.error(LogUtils.FATAL_MARKER, $$9, $$10);
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
      esc $$0 = esc.b();
      erv $$1 = $$0.d();
      if (this.B != null) {
         this.B.close();
      }

      this.B = new esd(esd.a.a);
      erv.b $$2 = a($$1, -16.0F);
      this.B.a();
      this.B.a($$2);
      esd.b();
   }

   private void B() {
      esc $$0 = esc.b();
      erv $$1 = $$0.d();
      if (this.A != null) {
         this.A.close();
      }

      this.A = new esd(esd.a.a);
      erv.b $$2 = a($$1, 16.0F);
      this.A.a();
      this.A.a($$2);
      esd.b();
   }

   private static erv.b a(erv $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      float $$3 = 512.0F;
      RenderSystem.setShader(fve::p);
      $$0.a(esf.b.g, ery.m);
      $$0.a(0.0, (double)$$1, 0.0).e();

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$0.a((double)($$2 * awh.b((float)$$4 * (float) (Math.PI / 180.0))), (double)$$1, (double)(512.0F * awh.a((float)$$4 * (float) (Math.PI / 180.0))))
            .e();
      }

      return $$0.d();
   }

   private void C() {
      esc $$0 = esc.b();
      erv $$1 = $$0.d();
      RenderSystem.setShader(fve::p);
      if (this.z != null) {
         this.z.close();
      }

      this.z = new esd(esd.a.a);
      erv.b $$2 = this.a($$1);
      this.z.a();
      this.z.a($$2);
      esd.b();
   }

   private erv.b a(erv $$0) {
      awo $$1 = awo.a(10842L);
      $$0.a(esf.b.h, ery.m);

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

   public void a(@Nullable fpx $$0) {
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
      if (exh.M()) {
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
            this.ae = new fyk(this.u, this, ac.f(), this.t);
         } else {
            this.ae.a(this.u);
         }

         this.C = true;
         fvg.a(exh.L());
         this.af = this.q.m.aA();
         if (this.y != null) {
            this.y.a();
         }

         this.ae.g();
         synchronized (this.x) {
            this.x.clear();
         }

         this.y = new fwc(this.ae, this.u, this.q.m.aA(), this);
         this.v.a(this.y);
         this.w.clear();
         bno $$0 = this.q.am();
         if ($$0 != null) {
            this.y.a($$0.dr(), $$0.dx());
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

   public fyk h() {
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
         fyk.b $$1 = (fyk.b)var2.next();
         if (!$$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String l() {
      return "E: " + this.ag + "/" + this.u.h() + ", B: " + this.ah + ", SD: " + this.u.m();
   }

   private void a(ews $$0, fyo $$1, boolean $$2, boolean $$3) {
      ens $$4 = $$0.b();
      if (this.q.m.aA() != this.af) {
         this.f();
      }

      this.u.af().a("camera");
      double $$5 = this.q.s.dr();
      double $$6 = this.q.s.dt();
      double $$7 = this.q.s.dx();
      int $$8 = jb.a($$5);
      int $$9 = jb.a($$6);
      int $$10 = jb.a($$7);
      if (this.R != $$8 || this.S != $$9 || this.T != $$10) {
         this.R = $$8;
         this.S = $$9;
         this.T = $$10;
         this.y.a($$5, $$7);
      }

      this.ae.a($$4);
      this.u.af().b("cull");
      this.q.aG().b("culling");
      hz $$11 = $$0.c();
      double $$12 = Math.floor($$4.c / 8.0);
      double $$13 = Math.floor($$4.d / 8.0);
      double $$14 = Math.floor($$4.e / 8.0);
      if ($$12 != this.U || $$13 != this.V || $$14 != this.W) {
         this.v.a();
      }

      this.U = $$12;
      this.V = $$13;
      this.W = $$14;
      this.q.aG().b("update");
      if (!$$2) {
         boolean $$15 = this.q.D;
         if ($$3 && this.u.a_($$11).i(this.u, $$11)) {
            $$15 = false;
         }

         bno.b(awh.a((double)this.q.m.aA() / 8.0, 1.0, 2.5) * this.q.m.g().c());
         this.q.aG().a("section_occlusion_graph");
         this.v.a($$15, $$0, $$1, this.w);
         this.q.aG().c();
         double $$16 = Math.floor((double)($$0.d() / 2.0F));
         double $$17 = Math.floor((double)($$0.e() / 2.0F));
         if (this.v.b() || $$16 != this.X || $$17 != this.Y) {
            this.b(a($$1));
            this.X = $$16;
            this.Y = $$17;
         }
      }

      this.q.aG().c();
   }

   public static fyo a(fyo $$0) {
      return new fyo($$0).a(8);
   }

   private void b(fyo $$0) {
      if (!exh.O().br()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.q.aG().a("apply_frustum");
         this.w.clear();
         this.v.a($$0, this.w);
         this.q.aG().c();
      }
   }

   public void a(fyk.b $$0) {
      this.v.a($$0);
   }

   private void a(Matrix4f $$0, Matrix4f $$1, double $$2, double $$3, double $$4, fyo $$5) {
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

   public void a(esa $$0, ens $$1, Matrix4f $$2) {
      Matrix4f $$3 = $$0.c().a();
      double $$4 = $$1.a();
      double $$5 = $$1.b();
      double $$6 = $$1.c();
      this.ai = new fyo($$3, $$2);
      this.ai.a($$4, $$5, $$6);
   }

   public void a(esa $$0, float $$1, long $$2, boolean $$3, ews $$4, fve $$5, fvk $$6, Matrix4f $$7) {
      bmf $$8 = this.q.r.s();
      float $$9 = $$8.i() ? $$1 : 1.0F;
      RenderSystem.setShaderGameTime(this.u.X(), $$9);
      this.s.a(this.u, $$4, this.q.v);
      this.r.a(this.u, $$4, this.q.u);
      bil $$10 = this.u.af();
      $$10.b("light_update_queue");
      this.u.b();
      $$10.b("light_updates");
      this.u.i().p().a();
      ens $$11 = $$4.b();
      double $$12 = $$11.a();
      double $$13 = $$11.b();
      double $$14 = $$11.c();
      Matrix4f $$15 = $$0.c().a();
      $$10.b("culling");
      boolean $$16 = this.ak != null;
      fyo $$17;
      if ($$16) {
         $$17 = this.ak;
         $$17.a(this.am.x, this.am.y, this.am.z);
      } else {
         $$17 = this.ai;
      }

      this.q.aG().b("captureFrustum");
      if (this.aj) {
         this.a($$15, $$7, $$11.c, $$11.d, $$11.e, $$16 ? new fyo($$15, $$7) : $$17);
         this.aj = false;
      }

      $$10.b("clear");
      fvd.a($$4, $$9, this.q.r, this.q.m.aA(), $$5.b($$9));
      fvd.b();
      RenderSystem.clear(16640, exh.a);
      float $$19 = $$5.l();
      boolean $$20 = this.q.r.d().a(awh.a($$12), awh.a($$13)) || this.q.l.j().d();
      $$10.b("sky");
      RenderSystem.setShader(fve::p);
      this.a($$0, $$7, $$9, $$4, $$20, () -> fvd.a($$4, fvd.d.a, $$19, $$20, $$9));
      $$10.b("fog");
      fvd.a($$4, fvd.d.b, Math.max($$19, 32.0F), $$20, $$9);
      $$10.b("terrain_setup");
      this.a($$4, $$17, $$16, this.q.s.P_());
      $$10.b("compile_sections");
      this.c($$4);
      $$10.b("terrain");
      this.a(fvt.c(), $$0, $$12, $$13, $$14, $$7);
      this.a(fvt.d(), $$0, $$12, $$13, $$14, $$7);
      this.a(fvt.e(), $$0, $$12, $$13, $$14, $$7);
      if (this.u.d().e()) {
         eqw.a($$0.c().a());
      } else {
         eqw.b($$0.c().a());
      }

      $$10.b("entities");
      this.ag = 0;
      this.ah = 0;
      if (this.M != null) {
         this.M.b(exh.a);
         this.M.a(this.q.g());
         this.q.g().a(false);
      }

      if (this.O != null) {
         this.O.b(exh.a);
      }

      if (this.d()) {
         this.J.b(exh.a);
         this.q.g().a(false);
      }

      boolean $$21 = false;
      fvl.a $$22 = this.t.c();

      for (bno $$23 : this.u.e()) {
         if (this.r.a($$23, $$17, $$12, $$13, $$14) || $$23.y(this.q.s)) {
            hz $$24 = $$23.dm();
            if ((this.u.d($$24.v()) || this.a($$24))
               && ($$23 != $$4.g() || $$4.i() || $$4.g() instanceof bog && ((bog)$$4.g()).fD())
               && (!($$23 instanceof fun) || $$4.g() == $$23)) {
               this.ag++;
               if ($$23.ag == 0) {
                  $$23.ab = $$23.dr();
                  $$23.ac = $$23.dt();
                  $$23.ad = $$23.dx();
               }

               fvl $$26;
               if (this.d() && this.q.b($$23)) {
                  $$21 = true;
                  fvm $$25 = this.t.e();
                  $$26 = $$25;
                  int $$27 = $$23.j_();
                  $$25.a(avr.b.b($$27), avr.b.c($$27), avr.b.d($$27), 255);
               } else {
                  $$26 = $$22;
               }

               float $$29 = $$8.a($$23) ? $$9 : $$1;
               this.a($$23, $$12, $$13, $$14, $$29, $$0, $$26);
            }
         }
      }

      $$22.a();
      this.a($$0);
      $$22.a(fvt.c(ggs.e));
      $$22.a(fvt.d(ggs.e));
      $$22.a(fvt.e(ggs.e));
      $$22.a(fvt.k(ggs.e));
      $$10.b("blockentities");
      ObjectListIterator var41 = this.w.iterator();

      while (var41.hasNext()) {
         fyk.b $$30 = (fyk.b)var41.next();
         List<dit> $$31 = $$30.d().b();
         if (!$$31.isEmpty()) {
            for (dit $$32 : $$31) {
               hz $$33 = $$32.aE_();
               fvl $$34 = $$22;
               $$0.a();
               $$0.a((double)$$33.u() - $$12, (double)$$33.v() - $$13, (double)$$33.w() - $$14);
               SortedSet<aoc> $$35 = (SortedSet<aoc>)this.H.get($$33.a());
               if ($$35 != null && !$$35.isEmpty()) {
                  int $$36 = $$35.last().c();
                  if ($$36 >= 0) {
                     esa.a $$37 = $$0.c();
                     ese $$38 = new esb(this.t.d().getBuffer(giy.l.get($$36)), $$37.a(), $$37.b(), 1.0F);
                     $$34 = $$2x -> {
                        ese $$3x = $$22.getBuffer($$2x);
                        return $$2x.L() ? esh.a($$38, $$3x) : $$3x;
                     };
                  }
               }

               this.s.a($$32, $$9, $$0, $$34);
               $$0.b();
            }
         }
      }

      synchronized (this.x) {
         for (dit $$39 : this.x) {
            hz $$40 = $$39.aE_();
            $$0.a();
            $$0.a((double)$$40.u() - $$12, (double)$$40.v() - $$13, (double)$$40.w() - $$14);
            this.s.a($$39, $$9, $$0, $$22);
            $$0.b();
         }
      }

      this.a($$0);
      $$22.a(fvt.c());
      $$22.a(fvt.u());
      $$22.a(fvt.v());
      $$22.a(fwa.h());
      $$22.a(fwa.i());
      $$22.a(fwa.c());
      $$22.a(fwa.d());
      $$22.a(fwa.e());
      $$22.a(fwa.f());
      $$22.a(fwa.g());
      this.t.e().a();
      if ($$21) {
         this.K.a($$9);
         this.q.g().a(false);
      }

      $$10.b("destroyProgress");
      ObjectIterator var43 = this.H.long2ObjectEntrySet().iterator();

      while (var43.hasNext()) {
         Entry<SortedSet<aoc>> $$41 = (Entry<SortedSet<aoc>>)var43.next();
         hz $$42 = hz.d($$41.getLongKey());
         double $$43 = (double)$$42.u() - $$12;
         double $$44 = (double)$$42.v() - $$13;
         double $$45 = (double)$$42.w() - $$14;
         if (!($$43 * $$43 + $$44 * $$44 + $$45 * $$45 > 1024.0)) {
            SortedSet<aoc> $$46 = (SortedSet<aoc>)$$41.getValue();
            if ($$46 != null && !$$46.isEmpty()) {
               int $$47 = $$46.last().c();
               $$0.a();
               $$0.a((double)$$42.u() - $$12, (double)$$42.v() - $$13, (double)$$42.w() - $$14);
               esa.a $$48 = $$0.c();
               ese $$49 = new esb(this.t.d().getBuffer(giy.l.get($$47)), $$48.a(), $$48.b(), 1.0F);
               this.q.an().a(this.u.a_($$42), $$42, this.u, $$0, $$49);
               $$0.b();
            }
         }
      }

      this.a($$0);
      enq $$50 = this.q.v;
      if ($$3 && $$50 != null && $$50.c() == enq.a.b) {
         $$10.b("outline");
         hz $$51 = ((eno)$$50).a();
         dlf $$52 = this.u.a_($$51);
         if (!$$52.i() && this.u.D_().a($$51)) {
            ese $$53 = $$22.getBuffer(fvt.w());
            this.a($$0, $$53, $$4.g(), $$12, $$13, $$14, $$51, $$52);
         }
      }

      this.q.k.a($$0, $$22, $$12, $$13, $$14);
      $$22.a();
      esa $$54 = RenderSystem.getModelViewStack();
      RenderSystem.applyModelViewMatrix();
      $$22.a(fwa.k());
      $$22.a(fwa.a());
      $$22.a(fwa.b());
      $$22.a(fvt.j());
      $$22.a(fvt.k());
      $$22.a(fvt.m());
      $$22.a(fvt.n());
      $$22.a(fvt.l());
      $$22.a(fvt.o());
      $$22.a(fvt.p());
      $$22.a(fvt.i());
      this.t.d().b();
      if (this.Q != null) {
         $$22.a(fvt.w());
         $$22.b();
         this.L.b(exh.a);
         this.L.a(this.q.g());
         $$10.b("translucent");
         this.a(fvt.f(), $$0, $$12, $$13, $$14, $$7);
         $$10.b("string");
         this.a(fvt.t(), $$0, $$12, $$13, $$14, $$7);
         this.N.b(exh.a);
         this.N.a(this.q.g());
         fvs.aL.a();
         $$10.b("particles");
         this.q.g.a($$0, $$22, $$6, $$4, $$9);
         fvs.aL.b();
      } else {
         $$10.b("translucent");
         if (this.L != null) {
            this.L.b(exh.a);
         }

         this.a(fvt.f(), $$0, $$12, $$13, $$14, $$7);
         $$22.a(fvt.w());
         $$22.b();
         $$10.b("string");
         this.a(fvt.t(), $$0, $$12, $$13, $$14, $$7);
         $$10.b("particles");
         this.q.g.a($$0, $$22, $$6, $$4, $$9);
      }

      $$54.a();
      $$54.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();
      if (this.q.m.av() != ewv.a) {
         if (this.Q != null) {
            this.P.b(exh.a);
            fvs.aN.a();
            $$10.b("clouds");
            this.a($$0, $$7, $$9, $$12, $$13, $$14);
            fvs.aN.b();
         } else {
            $$10.b("clouds");
            RenderSystem.setShader(fve::x);
            this.a($$0, $$7, $$9, $$12, $$13, $$14);
         }
      }

      if (this.Q != null) {
         fvs.aM.a();
         $$10.b("weather");
         this.a($$6, $$9, $$12, $$13, $$14);
         this.d($$4);
         fvs.aM.b();
         this.Q.a($$9);
         this.q.g().a(false);
      } else {
         RenderSystem.depthMask(false);
         $$10.b("weather");
         this.a($$6, $$9, $$12, $$13, $$14);
         this.d($$4);
         RenderSystem.depthMask(true);
      }

      $$54.b();
      RenderSystem.applyModelViewMatrix();
      this.a($$0, $$22, $$4);
      $$22.a();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      fvd.a();
   }

   private void a(esa $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bno $$0, double $$1, double $$2, double $$3, float $$4, esa $$5, fvl $$6) {
      double $$7 = awh.d((double)$$4, $$0.ab, $$0.dr());
      double $$8 = awh.d((double)$$4, $$0.ac, $$0.dt());
      double $$9 = awh.d((double)$$4, $$0.ad, $$0.dx());
      float $$10 = awh.i($$4, $$0.M, $$0.dC());
      this.r.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$10, $$4, $$5, $$6, this.r.a($$0, $$4));
   }

   private void a(fvt $$0, esa $$1, double $$2, double $$3, double $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      $$0.a();
      if ($$0 == fvt.f()) {
         this.q.aG().a("translucent_sort");
         double $$6 = $$2 - this.an;
         double $$7 = $$3 - this.ao;
         double $$8 = $$4 - this.ap;
         if ($$6 * $$6 + $$7 * $$7 + $$8 * $$8 > 1.0) {
            int $$9 = jb.a($$2);
            int $$10 = jb.a($$3);
            int $$11 = jb.a($$4);
            boolean $$12 = $$9 != jb.a(this.an) || $$11 != jb.a(this.ap) || $$10 != jb.a(this.ao);
            this.an = $$2;
            this.ao = $$3;
            this.ap = $$4;
            int $$13 = 0;
            ObjectListIterator var21 = this.w.iterator();

            while (var21.hasNext()) {
               fyk.b $$14 = (fyk.b)var21.next();
               if ($$13 < 15 && ($$12 || $$14.b($$9, $$10, $$11)) && $$14.a($$0, this.ae)) {
                  $$13++;
               }
            }
         }

         this.q.aG().c();
      }

      this.q.aG().a("filterempty");
      this.q.aG().b(() -> "render_" + $$0);
      boolean $$15 = $$0 != fvt.f();
      ObjectListIterator<fyk.b> $$16 = this.w.listIterator($$15 ? 0 : this.w.size());
      fvz $$17 = RenderSystem.getShader();

      for (int $$18 = 0; $$18 < 12; $$18++) {
         int $$19 = RenderSystem.getShaderTexture($$18);
         $$17.a("Sampler" + $$18, $$19);
      }

      if ($$17.b != null) {
         $$17.b.a($$1.c().a());
      }

      if ($$17.c != null) {
         $$17.c.a($$5);
      }

      if ($$17.g != null) {
         $$17.g.a(RenderSystem.getShaderColor());
      }

      if ($$17.j != null) {
         $$17.j.a(RenderSystem.getShaderGlintAlpha());
      }

      if ($$17.k != null) {
         $$17.k.a(RenderSystem.getShaderFogStart());
      }

      if ($$17.l != null) {
         $$17.l.a(RenderSystem.getShaderFogEnd());
      }

      if ($$17.m != null) {
         $$17.m.a(RenderSystem.getShaderFogColor());
      }

      if ($$17.n != null) {
         $$17.n.a(RenderSystem.getShaderFogShape().a());
      }

      if ($$17.e != null) {
         $$17.e.a(RenderSystem.getTextureMatrix());
      }

      if ($$17.p != null) {
         $$17.p.a(RenderSystem.getShaderGameTime());
      }

      RenderSystem.setupShaderLights($$17);
      $$17.g();
      err $$20 = $$17.q;

      while ($$15 ? $$16.hasNext() : $$16.hasPrevious()) {
         fyk.b $$21 = $$15 ? (fyk.b)$$16.next() : (fyk.b)$$16.previous();
         if (!$$21.d().a($$0)) {
            esd $$22 = $$21.a($$0);
            hz $$23 = $$21.f();
            if ($$20 != null) {
               $$20.a((float)((double)$$23.u() - $$2), (float)((double)$$23.v() - $$3), (float)((double)$$23.w() - $$4));
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
      esd.b();
      this.q.aG().c();
      $$0.b();
   }

   private void a(esa $$0, fvl $$1, ews $$2) {
      if (this.q.B || this.q.C) {
         double $$3 = $$2.b().a();
         double $$4 = $$2.b().b();
         double $$5 = $$2.b().c();
         ObjectListIterator var10 = this.w.iterator();

         while (var10.hasNext()) {
            fyk.b $$6 = (fyk.b)var10.next();
            fvy.d $$7 = this.v.b($$6);
            if ($$7 != null) {
               hz $$8 = $$6.f();
               $$0.a();
               $$0.a((double)$$8.u() - $$3, (double)$$8.v() - $$4, (double)$$8.w() - $$5);
               Matrix4f $$9 = $$0.c().a();
               if (this.q.B) {
                  ese $$10 = $$1.getBuffer(fvt.w());
                  int $$11 = $$7.b == 0 ? 0 : awh.h((float)$$7.b / 50.0F, 0.9F, 0.9F);
                  int $$12 = $$11 >> 16 & 0xFF;
                  int $$13 = $$11 >> 8 & 0xFF;
                  int $$14 = $$11 & 0xFF;

                  for (int $$15 = 0; $$15 < c.length; $$15++) {
                     if ($$7.a($$15)) {
                        ie $$16 = c[$$15];
                        $$10.a($$9, 8.0F, 8.0F, 8.0F).a($$12, $$13, $$14, 255).a((float)$$16.j(), (float)$$16.k(), (float)$$16.l()).e();
                        $$10.a($$9, (float)(8 - 16 * $$16.j()), (float)(8 - 16 * $$16.k()), (float)(8 - 16 * $$16.l()))
                           .a($$12, $$13, $$14, 255)
                           .a((float)$$16.j(), (float)$$16.k(), (float)$$16.l())
                           .e();
                     }
                  }
               }

               if (this.q.C && !$$6.d().a()) {
                  ese $$17 = $$1.getBuffer(fvt.w());
                  int $$18 = 0;

                  for (ie $$19 : c) {
                     for (ie $$20 : c) {
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
                     ese $$22 = $$1.getBuffer(fvt.z());
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
         ese $$26 = $$1.getBuffer(fvt.z());
         this.a($$26, $$25, 0, 1, 2, 3, 0, 1, 1);
         this.a($$26, $$25, 4, 5, 6, 7, 1, 0, 0);
         this.a($$26, $$25, 0, 1, 5, 4, 1, 1, 0);
         this.a($$26, $$25, 2, 3, 7, 6, 0, 0, 1);
         this.a($$26, $$25, 0, 4, 7, 3, 0, 1, 0);
         this.a($$26, $$25, 1, 5, 6, 2, 1, 0, 1);
         ese $$27 = $$1.getBuffer(fvt.w());
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

   private void a(ese $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a(0, 0, 0, 255).a(0.0F, 0.0F, -1.0F).e();
   }

   private void a(ese $$0, Matrix4f $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
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
         Iterator<aoc> $$0 = this.G.values().iterator();

         while ($$0.hasNext()) {
            aoc $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.F - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(aoc $$0) {
      long $$1 = $$0.b().a();
      Set<aoc> $$2 = (Set<aoc>)this.H.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.H.remove($$1);
      }
   }

   private void b(esa $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(fve::t);
      RenderSystem.setShaderTexture(0, m);
      esc $$1 = esc.b();
      erv $$2 = $$1.d();

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
         $$2.a(esf.b.h, ery.s);
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

   public void a(esa $$0, Matrix4f $$1, float $$2, ews $$3, boolean $$4, Runnable $$5) {
      $$5.run();
      if (!$$4) {
         egr $$6 = $$3.k();
         if ($$6 != egr.c && $$6 != egr.a && !this.b($$3)) {
            if (this.q.r.d().c() == fva.d.c) {
               this.b($$0);
            } else if (this.q.r.d().c() == fva.d.b) {
               ens $$7 = this.u.a(this.q.j.m().b(), $$2);
               float $$8 = (float)$$7.c;
               float $$9 = (float)$$7.d;
               float $$10 = (float)$$7.e;
               fvd.b();
               erv $$11 = esc.b().d();
               RenderSystem.depthMask(false);
               RenderSystem.setShaderColor($$8, $$9, $$10, 1.0F);
               fvz $$12 = RenderSystem.getShader();
               this.A.a();
               this.A.a($$0.c().a(), $$1, $$12);
               esd.b();
               RenderSystem.enableBlend();
               float[] $$13 = this.u.d().a(this.u.f($$2), $$2);
               if ($$13 != null) {
                  RenderSystem.setShader(fve::q);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  $$0.a();
                  $$0.a(a.b.rotationDegrees(90.0F));
                  float $$14 = awh.a(this.u.a($$2)) < 0.0F ? 180.0F : 0.0F;
                  $$0.a(a.f.rotationDegrees($$14));
                  $$0.a(a.f.rotationDegrees(90.0F));
                  float $$15 = $$13[0];
                  float $$16 = $$13[1];
                  float $$17 = $$13[2];
                  Matrix4f $$18 = $$0.c().a();
                  $$11.a(esf.b.g, ery.n);
                  $$11.a($$18, 0.0F, 100.0F, 0.0F).a($$15, $$16, $$17, $$13[3]).e();
                  int $$19 = 16;

                  for (int $$20 = 0; $$20 <= 16; $$20++) {
                     float $$21 = (float)$$20 * (float) (Math.PI * 2) / 16.0F;
                     float $$22 = awh.a($$21);
                     float $$23 = awh.b($$21);
                     $$11.a($$18, $$22 * 120.0F, $$23 * 120.0F, -$$23 * 40.0F * $$13[3]).a($$13[0], $$13[1], $$13[2], 0.0F).e();
                  }

                  erw.a($$11.d());
                  $$0.b();
               }

               RenderSystem.blendFuncSeparate(
                  GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
               );
               $$0.a();
               float $$24 = 1.0F - this.u.d($$2);
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$24);
               $$0.a(a.d.rotationDegrees(-90.0F));
               $$0.a(a.b.rotationDegrees(this.u.f($$2) * 360.0F));
               Matrix4f $$25 = $$0.c().a();
               float $$26 = 30.0F;
               RenderSystem.setShader(fve::s);
               RenderSystem.setShaderTexture(0, k);
               $$11.a(esf.b.h, ery.q);
               $$11.a($$25, -$$26, 100.0F, -$$26).a(0.0F, 0.0F).e();
               $$11.a($$25, $$26, 100.0F, -$$26).a(1.0F, 0.0F).e();
               $$11.a($$25, $$26, 100.0F, $$26).a(1.0F, 1.0F).e();
               $$11.a($$25, -$$26, 100.0F, $$26).a(0.0F, 1.0F).e();
               erw.a($$11.d());
               $$26 = 20.0F;
               RenderSystem.setShaderTexture(0, j);
               int $$27 = this.u.aq();
               int $$28 = $$27 % 4;
               int $$29 = $$27 / 4 % 2;
               float $$30 = (float)($$28 + 0) / 4.0F;
               float $$31 = (float)($$29 + 0) / 2.0F;
               float $$32 = (float)($$28 + 1) / 4.0F;
               float $$33 = (float)($$29 + 1) / 2.0F;
               $$11.a(esf.b.h, ery.q);
               $$11.a($$25, -$$26, -100.0F, $$26).a($$32, $$33).e();
               $$11.a($$25, $$26, -100.0F, $$26).a($$30, $$33).e();
               $$11.a($$25, $$26, -100.0F, -$$26).a($$30, $$31).e();
               $$11.a($$25, -$$26, -100.0F, -$$26).a($$32, $$31).e();
               erw.a($$11.d());
               float $$34 = this.u.i($$2) * $$24;
               if ($$34 > 0.0F) {
                  RenderSystem.setShaderColor($$34, $$34, $$34, $$34);
                  fvd.a();
                  this.z.a();
                  this.z.a($$0.c().a(), $$1, fve.p());
                  esd.b();
                  $$5.run();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.disableBlend();
               RenderSystem.defaultBlendFunc();
               $$0.b();
               RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
               double $$35 = this.q.s.j($$2).d - this.u.k().a(this.u);
               if ($$35 < 0.0) {
                  $$0.a();
                  $$0.a(0.0F, 12.0F, 0.0F);
                  this.B.a();
                  this.B.a($$0.c().a(), $$1, $$12);
                  esd.b();
                  $$0.b();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.depthMask(true);
            }
         }
      }
   }

   private boolean b(ews $$0) {
      return !($$0.g() instanceof bog $$1) ? false : $$1.a(bnd.o) || $$1.a(bnd.G);
   }

   public void a(esa $$0, Matrix4f $$1, float $$2, double $$3, double $$4, double $$5) {
      float $$6 = this.u.d().a();
      if (!Float.isNaN($$6)) {
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
            GlStateManager.SourceFactor.ONE,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA
         );
         RenderSystem.depthMask(true);
         float $$7 = 12.0F;
         float $$8 = 4.0F;
         double $$9 = 2.0E-4;
         double $$10 = (double)(((float)this.F + $$2) * 0.03F);
         double $$11 = ($$3 + $$10) / 12.0;
         double $$12 = (double)($$6 - (float)$$4 + 0.33F);
         double $$13 = $$5 / 12.0 + 0.33F;
         $$11 -= (double)(awh.a($$11 / 2048.0) * 2048);
         $$13 -= (double)(awh.a($$13 / 2048.0) * 2048);
         float $$14 = (float)($$11 - (double)awh.a($$11));
         float $$15 = (float)($$12 / 4.0 - (double)awh.a($$12 / 4.0)) * 4.0F;
         float $$16 = (float)($$13 - (double)awh.a($$13));
         ens $$17 = this.u.h($$2);
         int $$18 = (int)Math.floor($$11);
         int $$19 = (int)Math.floor($$12 / 4.0);
         int $$20 = (int)Math.floor($$13);
         if ($$18 != this.Z || $$19 != this.aa || $$20 != this.ab || this.q.m.av() != this.ad || this.ac.g($$17) > 2.0E-4) {
            this.Z = $$18;
            this.aa = $$19;
            this.ab = $$20;
            this.ac = $$17;
            this.ad = this.q.m.av();
            this.C = true;
         }

         if (this.C) {
            this.C = false;
            erv $$21 = esc.b().d();
            if (this.D != null) {
               this.D.close();
            }

            this.D = new esd(esd.a.a);
            erv.b $$22 = this.a($$21, $$11, $$12, $$13, $$17);
            this.D.a();
            this.D.a($$22);
            esd.b();
         }

         RenderSystem.setShader(fve::x);
         RenderSystem.setShaderTexture(0, l);
         fvd.b();
         $$0.a();
         $$0.b(12.0F, 1.0F, 12.0F);
         $$0.a(-$$14, $$15, -$$16);
         if (this.D != null) {
            this.D.a();
            int $$23 = this.ad == ewv.c ? 0 : 1;

            for (int $$24 = $$23; $$24 < 2; $$24++) {
               if ($$24 == 0) {
                  RenderSystem.colorMask(false, false, false, false);
               } else {
                  RenderSystem.colorMask(true, true, true, true);
               }

               fvz $$25 = RenderSystem.getShader();
               this.D.a($$0.c().a(), $$1, $$25);
            }

            esd.b();
         }

         $$0.b();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   private erv.b a(erv $$0, double $$1, double $$2, double $$3, ens $$4) {
      float $$5 = 4.0F;
      float $$6 = 0.00390625F;
      int $$7 = 8;
      int $$8 = 4;
      float $$9 = 9.765625E-4F;
      float $$10 = (float)awh.a($$1) * 0.00390625F;
      float $$11 = (float)awh.a($$3) * 0.00390625F;
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
      RenderSystem.setShader(fve::x);
      $$0.a(esf.b.h, ery.v);
      float $$24 = (float)Math.floor($$2 / 4.0) * 4.0F;
      if (this.ad == ewv.c) {
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

   private void c(ews $$0) {
      this.q.aG().a("populate_sections_to_compile");
      ege $$1 = this.u.z_();
      fyj $$2 = new fyj();
      hz $$3 = $$0.c();
      List<fyk.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.w.iterator();

      while (var6.hasNext()) {
         fyk.b $$5 = (fyk.b)var6.next();
         jb $$6 = jb.a($$5.f());
         if ($$5.h() && $$1.a($$6)) {
            boolean $$7 = false;
            if (this.q.m.l().c() == exo.c) {
               hz $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.i();
            } else if (this.q.m.l().c() == exo.b) {
               $$7 = $$5.i();
            }

            if ($$7) {
               this.q.aG().a("build_near_sync");
               this.ae.a($$5, $$2);
               $$5.g();
               this.q.aG().c();
            } else {
               $$4.add($$5);
            }
         }
      }

      this.q.aG().b("upload");
      this.ae.f();
      this.q.aG().b("schedule_async_compile");

      for (fyk.b $$9 : $$4) {
         $$9.a(this.ae, $$2);
         $$9.g();
      }

      this.q.aG().c();
   }

   private void d(ews $$0) {
      erv $$1 = esc.b().d();
      dmw $$2 = this.u.D_();
      double $$3 = (double)(this.q.m.aA() * 16);
      if (!($$0.b().c < $$2.g() - $$3) || !($$0.b().c > $$2.e() + $$3) || !($$0.b().e < $$2.h() - $$3) || !($$0.b().e > $$2.f() + $$3)) {
         double $$4 = 1.0 - $$2.b($$0.b().c, $$0.b().e) / $$3;
         $$4 = Math.pow($$4, 4.0);
         $$4 = awh.a($$4, 0.0, 1.0);
         double $$5 = $$0.b().c;
         double $$6 = $$0.b().e;
         double $$7 = (double)this.q.j.h();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
         RenderSystem.setShaderTexture(0, n);
         RenderSystem.depthMask(exh.M());
         esa $$8 = RenderSystem.getModelViewStack();
         $$8.a();
         RenderSystem.applyModelViewMatrix();
         int $$9 = $$2.d().a();
         float $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F;
         float $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F;
         float $$12 = (float)($$9 & 0xFF) / 255.0F;
         RenderSystem.setShaderColor($$10, $$11, $$12, (float)$$4);
         RenderSystem.setShader(fve::s);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.disableCull();
         float $$13 = (float)(ac.b() % 3000L) / 3000.0F;
         float $$14 = (float)(-awh.e($$0.b().d * 0.5));
         float $$15 = $$14 + (float)$$7;
         $$1.a(esf.b.h, ery.q);
         double $$16 = Math.max((double)awh.a($$6 - $$3), $$2.f());
         double $$17 = Math.min((double)awh.c($$6 + $$3), $$2.h());
         float $$18 = (float)(awh.a($$16) & 1) * 0.5F;
         if ($$5 > $$2.g() - $$3) {
            float $$19 = $$18;

            for (double $$20 = $$16; $$20 < $$17; $$19 += 0.5F) {
               double $$21 = Math.min(1.0, $$17 - $$20);
               float $$22 = (float)$$21 * 0.5F;
               $$1.a($$2.g() - $$5, -$$7, $$20 - $$6).a($$13 - $$19, $$13 + $$15).e();
               $$1.a($$2.g() - $$5, -$$7, $$20 + $$21 - $$6).a($$13 - ($$22 + $$19), $$13 + $$15).e();
               $$1.a($$2.g() - $$5, $$7, $$20 + $$21 - $$6).a($$13 - ($$22 + $$19), $$13 + $$14).e();
               $$1.a($$2.g() - $$5, $$7, $$20 - $$6).a($$13 - $$19, $$13 + $$14).e();
               $$20++;
            }
         }

         if ($$5 < $$2.e() + $$3) {
            float $$23 = $$18;

            for (double $$24 = $$16; $$24 < $$17; $$23 += 0.5F) {
               double $$25 = Math.min(1.0, $$17 - $$24);
               float $$26 = (float)$$25 * 0.5F;
               $$1.a($$2.e() - $$5, -$$7, $$24 - $$6).a($$13 + $$23, $$13 + $$15).e();
               $$1.a($$2.e() - $$5, -$$7, $$24 + $$25 - $$6).a($$13 + $$26 + $$23, $$13 + $$15).e();
               $$1.a($$2.e() - $$5, $$7, $$24 + $$25 - $$6).a($$13 + $$26 + $$23, $$13 + $$14).e();
               $$1.a($$2.e() - $$5, $$7, $$24 - $$6).a($$13 + $$23, $$13 + $$14).e();
               $$24++;
            }
         }

         $$16 = Math.max((double)awh.a($$5 - $$3), $$2.e());
         $$17 = Math.min((double)awh.c($$5 + $$3), $$2.g());
         $$18 = (float)(awh.a($$16) & 1) * 0.5F;
         if ($$6 > $$2.h() - $$3) {
            float $$27 = $$18;

            for (double $$28 = $$16; $$28 < $$17; $$27 += 0.5F) {
               double $$29 = Math.min(1.0, $$17 - $$28);
               float $$30 = (float)$$29 * 0.5F;
               $$1.a($$28 - $$5, -$$7, $$2.h() - $$6).a($$13 + $$27, $$13 + $$15).e();
               $$1.a($$28 + $$29 - $$5, -$$7, $$2.h() - $$6).a($$13 + $$30 + $$27, $$13 + $$15).e();
               $$1.a($$28 + $$29 - $$5, $$7, $$2.h() - $$6).a($$13 + $$30 + $$27, $$13 + $$14).e();
               $$1.a($$28 - $$5, $$7, $$2.h() - $$6).a($$13 + $$27, $$13 + $$14).e();
               $$28++;
            }
         }

         if ($$6 < $$2.f() + $$3) {
            float $$31 = $$18;

            for (double $$32 = $$16; $$32 < $$17; $$31 += 0.5F) {
               double $$33 = Math.min(1.0, $$17 - $$32);
               float $$34 = (float)$$33 * 0.5F;
               $$1.a($$32 - $$5, -$$7, $$2.f() - $$6).a($$13 - $$31, $$13 + $$15).e();
               $$1.a($$32 + $$33 - $$5, -$$7, $$2.f() - $$6).a($$13 - ($$34 + $$31), $$13 + $$15).e();
               $$1.a($$32 + $$33 - $$5, $$7, $$2.f() - $$6).a($$13 - ($$34 + $$31), $$13 + $$14).e();
               $$1.a($$32 - $$5, $$7, $$2.f() - $$6).a($$13 - $$31, $$13 + $$14).e();
               $$32++;
            }
         }

         erw.a($$1.d());
         RenderSystem.enableCull();
         RenderSystem.polygonOffset(0.0F, 0.0F);
         RenderSystem.disablePolygonOffset();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
         $$8.b();
         RenderSystem.applyModelViewMatrix();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.depthMask(true);
      }
   }

   private void a(esa $$0, ese $$1, bno $$2, double $$3, double $$4, double $$5, hz $$6, dlf $$7) {
      a($$0, $$1, $$7.a(this.u, $$6, enx.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   private static ens a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(awh.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new ens(1.0, (double)$$3, 0.0);
         case 1 -> new ens((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new ens(0.0, 1.0, (double)$$3);
         case 3 -> new ens(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new ens((double)$$3, 0.0, 1.0);
         case 5 -> new ens(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static ens a(float $$0, float $$1, float $$2, float $$3) {
      ens $$4 = a($$3).a((double)$$0);
      ens $$5 = a(($$3 + 0.33333334F) % 1.0F).a((double)$$1);
      ens $$6 = a(($$3 + 0.6666667F) % 1.0F).a((double)$$2);
      ens $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.c), Math.max($$7.d, $$7.e));
      return new ens($$7.c / $$8, $$7.d / $$8, $$7.e / $$8);
   }

   public static void a(esa $$0, ese $$1, eol $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<enn> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         a($$0, $$1, eoi.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            enn $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            ens $$16 = a($$6, $$7, $$8, $$15);
            a($$0, $$1, eoi.a($$14), $$3, $$4, $$5, (float)$$16.c, (float)$$16.d, (float)$$16.e, $$9);
         }
      }
   }

   private static void a(esa $$0, ese $$1, eol $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9) {
      esa.a $$10 = $$0.c();
      $$2.a(($$9x, $$10x, $$11, $$12, $$13, $$14) -> {
         float $$15 = (float)($$12 - $$9x);
         float $$16 = (float)($$13 - $$10x);
         float $$17 = (float)($$14 - $$11);
         float $$18 = awh.c($$15 * $$15 + $$16 * $$16 + $$17 * $$17);
         $$15 /= $$18;
         $$16 /= $$18;
         $$17 /= $$18;
         $$1.a($$10.a(), (float)($$9x + $$3), (float)($$10x + $$4), (float)($$11 + $$5)).a($$6, $$7, $$8, $$9).a($$10.b(), $$15, $$16, $$17).e();
         $$1.a($$10.a(), (float)($$12 + $$3), (float)($$13 + $$4), (float)($$14 + $$5)).a($$6, $$7, $$8, $$9).a($$10.b(), $$15, $$16, $$17).e();
      });
   }

   public static void a(ese $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, float $$8, float $$9, float $$10) {
      a(new esa(), $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$7, $$8, $$9);
   }

   public static void a(esa $$0, ese $$1, enn $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6, $$3, $$4, $$5);
   }

   public static void a(esa $$0, ese $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$8, $$9, $$10);
   }

   public static void a(
      esa $$0,
      ese $$1,
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
      Matrix4f $$15 = $$0.c().a();
      Matrix3f $$16 = $$0.c().b();
      float $$17 = (float)$$2;
      float $$18 = (float)$$3;
      float $$19 = (float)$$4;
      float $$20 = (float)$$5;
      float $$21 = (float)$$6;
      float $$22 = (float)$$7;
      $$1.a($$15, $$17, $$18, $$19).a($$8, $$13, $$14, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$19).a($$8, $$13, $$14, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$19).a($$12, $$9, $$14, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$21, $$19).a($$12, $$9, $$14, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$19).a($$12, $$13, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$17, $$18, $$22).a($$12, $$13, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$20, $$18, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, -1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$17, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, -1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$17, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$17, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$17, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, -1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, -1.0F, 0.0F).e();
      $$1.a($$15, $$17, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, -1.0F).e();
      $$1.a($$15, $$20, $$18, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, -1.0F).e();
      $$1.a($$15, $$17, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 1.0F, 0.0F, 0.0F).e();
      $$1.a($$15, $$20, $$18, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 1.0F, 0.0F).e();
      $$1.a($$15, $$20, $$21, $$19).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
      $$1.a($$15, $$20, $$21, $$22).a($$8, $$9, $$10, $$11).a($$16, 0.0F, 0.0F, 1.0F).e();
   }

   public static void b(esa $$0, ese $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, (float)$$2, (float)$$3, (float)$$4, (float)$$5, (float)$$6, (float)$$7, $$8, $$9, $$10, $$11);
   }

   public static void a(esa $$0, ese $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
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

   public void a(cut $$0, hz $$1, dlf $$2, dlf $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(hz $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(jb.a($$3), jb.a($$4), jb.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(jb.a($$7), jb.a($$8), jb.a($$6));
            }
         }
      }
   }

   public void a(hz $$0, dlf $$1, dlf $$2) {
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

   public void a(@Nullable atj $$0, hz $$1) {
      gkg $$2 = this.I.get($$1);
      if ($$2 != null) {
         this.q.ai().b($$2);
         this.I.remove($$1);
      }

      if ($$0 != null) {
         cpr $$3 = cpr.a($$0);
         if ($$3 != null) {
            this.q.l.a($$3.w());
         }

         gkg var5 = gkb.a($$0, ens.b($$1));
         this.I.put($$1, var5);
         this.q.ai().a(var5);
      }

      this.a(this.u, $$1, $$0 != null);
   }

   private void a(cvn $$0, hz $$1, boolean $$2) {
      for (bog $$4 : $$0.a(bog.class, new enn($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }

   public void a(jx $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(jx $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", kf.j.b($$0.b()));
         $$11.a("Parameters", $$0.a());
         $$11.a("Position", () -> p.a(this.u, $$3, $$4, $$5));
         throw new y($$10);
      }
   }

   private <T extends jx> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.b().c(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private fsz b(jx $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private fsz b(jx $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      ews $$9 = this.q.j.m();
      exm $$10 = this.a($$2);
      if ($$1) {
         return this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == exm.c ? null : this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private exm a(boolean $$0) {
      exm $$1 = this.q.m.ao().c();
      if ($$0 && $$1 == exm.c && this.u.z.a(10) == 0) {
         $$1 = exm.b;
      }

      if ($$1 == exm.b && this.u.z.a(3) == 0) {
         $$1 = exm.c;
      }

      return $$1;
   }

   public void p() {
   }

   public void a(int $$0, hz $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            ews $$3 = this.q.j.m();
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
                  this.u.a($$8, $$9, $$10, atk.BJ, atl.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.u.a($$8, $$9, $$10, atk.ih, atl.f, 1.0F, 1.0F, false);
               } else {
                  this.u.a($$8, $$9, $$10, atk.hM, atl.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, hz $$1, int $$2) {
      awo $$3 = this.u.z;
      switch ($$0) {
         case 1000:
            this.u.a($$1, atk.gE, atl.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.u.a($$1, atk.gF, atl.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.u.a($$1, atk.gG, atl.e, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.u.a($$1, atk.hT, atl.g, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.u.a($$1, atk.iB, atl.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.u.a($$1, atk.iF, atl.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.u.a($$1, atk.jQ, atl.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            if (cou.b($$2) instanceof cpr $$72) {
               this.a($$72.x(), $$1);
            }
            break;
         case 1011:
            this.a(null, $$1);
            break;
         case 1015:
            this.u.a($$1, atk.ka, atl.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.u.a($$1, atk.jZ, atl.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.u.a($$1, atk.hR, atl.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.u.a($$1, atk.ch, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.u.a($$1, atk.Cs, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.u.a($$1, atk.Ct, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.u.a($$1, atk.Cu, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.u.a($$1, atk.BB, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.u.a($$1, atk.BE, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.u.a($$1, atk.bG, atl.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.u.a($$1, atk.CC, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.u.a($$1, atk.CJ, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.u.a($$1, atk.V, atl.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.u.a($$1, atk.ab, atl.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.u.a($$1, atk.Y, atl.e, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.q.ai().a(gkb.b(atk.ua, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.u.a($$1, atk.eX, atl.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.u.a($$1, atk.eW, atl.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.u.a($$1, atk.cI, atl.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.u.a($$1, atk.sN, atl.f, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.u.a($$1, atk.Cv, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.u.a($$1, atk.mB, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.u.a($$1, atk.kZ, atl.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.u.a($$1, atk.cq, atl.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.u.a($$1, atk.xB, atl.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.u.a($$1, atk.hh, atl.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.u.a($$1, atk.hk, atl.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.u.a($$1, atk.hl, atl.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.u.a($$1, atk.wu, atl.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.u.a($$1, atk.fS, atl.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.u.a($$1, atk.fT, atl.e, 1.0F, 1.0F, false);
            break;
         case 1500:
            czz.a(this.u, $$1, $$2 > 0);
            break;
         case 1501:
            this.u.a($$1, atk.nr, atl.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$55 = 0; $$55 < 8; $$55++) {
               this.u.a(jz.U, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.u.a($$1, atk.uN, atl.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$56 = 0; $$56 < 5; $$56++) {
               double $$57 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$58 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$59 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.u.a(jz.ab, $$57, $$58, $$59, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.u.a($$1, atk.ig, atl.e, 1.0F, 1.0F, false);

            for (int $$60 = 0; $$60 < 16; $$60++) {
               double $$61 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$62 = (double)$$1.v() + 0.8125;
               double $$63 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.u.a(jz.ab, $$61, $$62, $$63, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            def.a(this.u, $$1, this.u.a_($$1));
            break;
         case 1505:
            cmu.a(this.u, $$1, $$2);
            this.u.a($$1, atk.cp, atl.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, jz.ab);
            break;
         case 2001:
            dlf $$23 = cyo.a($$2);
            if (!$$23.i()) {
               dga $$24 = $$23.w();
               this.u.a($$1, $$24.c(), atl.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.u.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            ens $$9 = ens.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.a(new jv(jz.Q, new coz(cpc.vk)), $$9.c, $$9.d, $$9.e, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            jx $$14 = $$0 == 2007 ? jz.P : jz.q;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               fsz $$21 = this.b($$14, $$14.b().c(), $$9.c + $$18 * 0.1, $$9.d + 0.3, $$9.e + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.u.a($$1, atk.yh, atl.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.a(new jv(jz.Q, new coz(cpc.sr)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.a(jz.Z, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.a(jz.Z, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.u.a(jz.ab, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.u.a(jz.E, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$64 = 0; $$64 < 200; $$64++) {
               float $$65 = $$3.i() * 4.0F;
               float $$66 = $$3.i() * (float) (Math.PI * 2);
               double $$67 = (double)(awh.b($$66) * $$65);
               double $$68 = 0.01 + $$3.j() * 0.5;
               double $$69 = (double)(awh.a($$66) * $$65);
               fsz $$70 = this.b(jz.i, false, (double)$$1.u() + $$67 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$69 * 0.1, $$67, $$68, $$69);
               if ($$70 != null) {
                  $$70.c($$65);
               }
            }

            if ($$2 == 1) {
               this.u.a($$1, atk.hN, atl.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.u.a(jz.x, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$71 = 0; $$71 < 8; $$71++) {
               this.u.a(jz.f, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2010:
            this.a($$2, $$1, $$3, jz.ac);
            break;
         case 2011:
            awk.a(this.u, $$1, $$2, jz.M);
            break;
         case 2012:
            awk.a(this.u, $$1, $$2, jz.M);
            break;
         case 3000:
            this.u.a(jz.w, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.u.a($$1, atk.if, atl.e, 10.0F, (1.0F + (this.u.z.i() - this.u.z.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.u.a($$1, atk.hP, atl.f, 64.0F, 0.8F + this.u.z.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < ie.a.d.length) {
               awk.a(ie.a.d[$$2], this.u, $$1, 0.125, jz.aQ, blf.a(10, 19));
            } else {
               awk.a(this.u, $$1, jz.aQ, blf.a(3, 5));
            }
            break;
         case 3003:
            awk.a(this.u, $$1, jz.aO, blf.a(3, 5));
            this.u.a($$1, atk.md, atl.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            awk.a(this.u, $$1, jz.aP, blf.a(3, 5));
            break;
         case 3005:
            awk.a(this.u, $$1, jz.aR, blf.a(3, 5));
            break;
         case 3006:
            int $$31 = $$2 >> 6;
            if ($$31 > 0) {
               if ($$3.i() < 0.3F + (float)$$31 * 0.1F) {
                  float $$32 = 0.15F + 0.02F * (float)$$31 * (float)$$31 * $$3.i();
                  float $$33 = 0.4F + 0.3F * (float)$$31 * $$3.i();
                  this.u.a($$1, atk.vm, atl.e, $$32, $$33, false);
               }

               byte $$34 = (byte)($$2 & 63);
               bkz $$35 = blf.a(0, $$31);
               float $$36 = 0.005F;
               Supplier<ens> $$37 = () -> new ens(awh.a($$3, -0.005F, 0.005F), awh.a($$3, -0.005F, 0.005F), awh.a($$3, -0.005F, 0.005F));
               if ($$34 == 0) {
                  for (ie $$38 : ie.values()) {
                     float $$39 = $$38 == ie.a ? (float) Math.PI : 0.0F;
                     double $$40 = $$38.o() == ie.a.b ? 0.65 : 0.57;
                     awk.a(this.u, $$1, new ka($$39), $$35, $$38, $$37, $$40);
                  }
               } else {
                  for (ie $$41 : ddn.a($$34)) {
                     float $$42 = $$41 == ie.b ? (float) Math.PI : 0.0F;
                     double $$43 = 0.35;
                     awk.a(this.u, $$1, new ka($$42), $$35, $$41, $$37, 0.35);
                  }
               }
            } else {
               this.u.a($$1, atk.vm, atl.e, 1.0F, 1.0F, false);
               boolean $$44 = this.u.a_($$1).r(this.u, $$1);
               int $$45 = $$44 ? 40 : 20;
               float $$46 = $$44 ? 0.45F : 0.25F;
               float $$47 = 0.07F;

               for (int $$48 = 0; $$48 < $$45; $$48++) {
                  float $$49 = 2.0F * $$3.i() - 1.0F;
                  float $$50 = 2.0F * $$3.i() - 1.0F;
                  float $$51 = 2.0F * $$3.i() - 1.0F;
                  this.u
                     .a(
                        jz.I,
                        (double)$$1.u() + 0.5 + (double)($$49 * $$46),
                        (double)$$1.v() + 0.5 + (double)($$50 * $$46),
                        (double)$$1.w() + 0.5 + (double)($$51 * $$46),
                        (double)($$49 * 0.07F),
                        (double)($$50 * 0.07F),
                        (double)($$51 * 0.07F)
                     );
               }
            }
            break;
         case 3007:
            for (int $$52 = 0; $$52 < 10; $$52++) {
               this.u.a(new kb($$52 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + dfh.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dlf $$53 = this.u.a_($$1);
            boolean $$54 = $$53.b(dlv.C) && $$53.c(dlv.C);
            if (!$$54) {
               this.u.a((double)$$1.u() + 0.5, (double)$$1.v() + dfh.f, (double)$$1.w() + 0.5, atk.vJ, atl.e, 2.0F, 0.6F + this.u.z.i() * 0.4F, false);
            }
            break;
         case 3008:
            dlf $$25 = cyo.a($$2);
            if ($$25.b() instanceof cyt $$26) {
               this.u.a($$1, $$26.d(), atl.h, 1.0F, 1.0F, false);
            }

            this.u.a($$1, $$25);
            break;
         case 3009:
            awk.a(this.u, $$1, jz.aT, blf.a(3, 6));
            break;
         case 3011:
            dkp.a(this.u, $$1, $$3);
            break;
         case 3012:
            this.u.a($$1, atk.lI, atl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dkp.a(this.u, $$1, $$3);
            break;
         case 3013:
            this.u.a($$1, atk.lJ, atl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dkp.a(this.u, $$1, $$3, $$2);
            break;
         case 3014:
            this.u.a($$1, atk.lN, atl.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dkp.b(this.u, $$1, $$3);
      }
   }

   public void c(int $$0, hz $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         aoc $$4 = (aoc)this.G.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new aoc($$0, $$1);
            this.G.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.F);
         ((SortedSet)this.H.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         aoc $$3 = (aoc)this.G.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean q() {
      return this.ae.h();
   }

   public void a(cuu $$0) {
      this.v.a($$0);
   }

   public void r() {
      this.v.a();
      this.C = true;
   }

   public void a(Collection<dit> $$0, Collection<dit> $$1) {
      synchronized (this.x) {
         this.x.removeAll($$0);
         this.x.addAll($$1);
      }
   }

   public static int a(cuq $$0, hz $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(cuq $$0, dlf $$1, hz $$2) {
      if ($$1.e($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(cvw.a, $$2);
         int $$4 = $$0.a(cvw.b, $$2);
         int $$5 = $$1.h();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(hz $$0) {
      fyk.b $$1 = this.y.a($$0);
      return $$1 != null && $$1.c.get() != fyk.a.a;
   }

   @Nullable
   public eqm s() {
      return this.J;
   }

   @Nullable
   public eqm t() {
      return this.L;
   }

   @Nullable
   public eqm u() {
      return this.M;
   }

   @Nullable
   public eqm v() {
      return this.N;
   }

   @Nullable
   public eqm w() {
      return this.O;
   }

   @Nullable
   public eqm x() {
      return this.P;
   }

   private void a(int $$0, hz $$1, awo $$2, kc $$3) {
      ie $$4 = ie.a($$0);
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
