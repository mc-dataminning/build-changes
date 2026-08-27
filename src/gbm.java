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

public class gbm implements ats, AutoCloseable {
   private static final Logger e = LogUtils.getLogger();
   public static final int a = 16;
   public static final int b = 8;
   private static final float f = 512.0F;
   private static final int g = 32;
   private static final int h = 10;
   private static final int i = 21;
   private static final int j = 15;
   private static final akh k = new akh("textures/environment/moon_phases.png");
   private static final akh l = new akh("textures/environment/sun.png");
   protected static final akh c = new akh("textures/environment/clouds.png");
   private static final akh m = new akh("textures/environment/end_sky.png");
   private static final akh n = new akh("textures/misc/forcefield.png");
   private static final akh o = new akh("textures/environment/rain.png");
   private static final akh p = new akh("textures/environment/snow.png");
   public static final is[] d = is.values();
   private final fde q;
   private final ggv r;
   private final gdn s;
   private final gbu t;
   @Nullable
   private fvw u;
   private final gcb v = new gcb();
   private final ObjectArrayList<geo.b> w = new ObjectArrayList(10000);
   private final Set<dnm> x = Sets.newHashSet();
   @Nullable
   private gcf y;
   @Nullable
   private eya z;
   @Nullable
   private eya A;
   @Nullable
   private eya B;
   private boolean C = true;
   @Nullable
   private eya D;
   private final gbx E = new gbx(100);
   private int F;
   private final Int2ObjectMap<apn> G = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<apn>> H = new Long2ObjectOpenHashMap();
   private final Map<in, gqm> I = Maps.newHashMap();
   @Nullable
   private ewj J;
   @Nullable
   private gbr K;
   @Nullable
   private ewj L;
   @Nullable
   private ewj M;
   @Nullable
   private ewj N;
   @Nullable
   private ewj O;
   @Nullable
   private ewj P;
   @Nullable
   private gbr Q;
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
   private etp ac = etp.b;
   @Nullable
   private fcs ad;
   @Nullable
   private geo ae;
   private int af = -1;
   private int ag;
   private int ah;
   private ges ai;
   private boolean aj;
   @Nullable
   private ges ak;
   private final Vector4f[] al = new Vector4f[8];
   private final Vector3d am = new Vector3d(0.0, 0.0, 0.0);
   private double an;
   private double ao;
   private double ap;
   private int aq;
   private final float[] ar = new float[1024];
   private final float[] as = new float[1024];

   public gbm(fde $$0, ggv $$1, gdn $$2, gbu $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;

      for (int $$4 = 0; $$4 < 32; $$4++) {
         for (int $$5 = 0; $$5 < 32; $$5++) {
            float $$6 = (float)($$5 - 16);
            float $$7 = (float)($$4 - 16);
            float $$8 = axz.c($$6 * $$6 + $$7 * $$7);
            this.ar[$$4 << 5 | $$5] = -$$7 / $$8;
            this.as[$$4 << 5 | $$5] = $$6 / $$8;
         }
      }

      this.C();
      this.B();
      this.A();
   }

   private void a(gbn $$0, float $$1, double $$2, double $$3, double $$4) {
      float $$5 = this.q.r.d($$1);
      if (!($$5 <= 0.0F)) {
         $$0.c();
         dad $$6 = this.q.r;
         int $$7 = axz.a($$2);
         int $$8 = axz.a($$3);
         int $$9 = axz.a($$4);
         exz $$10 = exz.b();
         exs $$11 = $$10.d();
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         int $$12 = 5;
         if (fde.N()) {
            $$12 = 10;
         }

         RenderSystem.depthMask(fde.O());
         int $$13 = -1;
         float $$14 = (float)this.F + $$1;
         RenderSystem.setShader(gbh::u);
         in.a $$15 = new in.a();

         for (int $$16 = $$9 - $$12; $$16 <= $$9 + $$12; $$16++) {
            for (int $$17 = $$7 - $$12; $$17 <= $$7 + $$12; $$17++) {
               int $$18 = ($$16 - $$9 + 16) * 32 + $$17 - $$7 + 16;
               double $$19 = (double)this.ar[$$18] * 0.5;
               double $$20 = (double)this.as[$$18] * 0.5;
               $$15.b((double)$$17, $$3, (double)$$16);
               dbc $$21 = $$6.t($$15).a();
               if ($$21.c()) {
                  int $$22 = $$6.a(dvz.a.e, $$17, $$16);
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
                     ayg $$26 = ayg.a((long)($$17 * $$17 * 3121 + $$17 * 45238971 ^ $$16 * $$16 * 418711 + $$16 * 13761));
                     $$15.d($$17, $$23, $$16);
                     dbc.c $$27 = $$21.a($$15);
                     if ($$27 == dbc.c.b) {
                        if ($$13 != 0) {
                           if ($$13 >= 0) {
                              $$10.c();
                           }

                           $$13 = 0;
                           RenderSystem.setShaderTexture(0, o);
                           $$11.a(eyc.b.h, exv.l);
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
                     } else if ($$27 == dbc.c.c) {
                        if ($$13 != 1) {
                           if ($$13 >= 0) {
                              $$10.c();
                           }

                           $$13 = 1;
                           RenderSystem.setShaderTexture(0, p);
                           $$11.a(eyc.b.h, exv.l);
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

   public void a(fcp $$0) {
      float $$1 = this.q.r.d(1.0F) / (fde.N() ? 1.0F : 2.0F);
      if (!($$1 <= 0.0F)) {
         ayg $$2 = ayg.a((long)this.F * 312987231L);
         dag $$3 = this.q.r;
         in $$4 = in.a($$0.b());
         in $$5 = null;
         int $$6 = (int)(100.0F * $$1 * $$1) / (this.q.m.ar().c() == fdj.b ? 2 : 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            int $$8 = $$2.a(21) - 10;
            int $$9 = $$2.a(21) - 10;
            in $$10 = $$3.a(dvz.a.e, $$4.b($$8, 0, $$9));
            if ($$10.v() > $$3.I_() && $$10.v() <= $$4.v() + 10 && $$10.v() >= $$4.v() - 10) {
               dbc $$11 = $$3.t($$10).a();
               if ($$11.a($$10) == dbc.c.b) {
                  $$5 = $$10.d();
                  if (this.q.m.ar().c() == fdj.c) {
                     break;
                  }

                  double $$12 = $$2.j();
                  double $$13 = $$2.j();
                  dqh $$14 = $$3.a_($$5);
                  ema $$15 = $$3.b_($$5);
                  eui $$16 = $$14.k($$3, $$5);
                  double $$17 = $$16.b(is.a.b, $$12, $$13);
                  double $$18 = (double)$$15.a($$3, $$5);
                  double $$19 = Math.max($$17, $$18);
                  kv $$20 = !$$15.a(avw.b) && !$$14.a(ddg.kJ) && !dds.g($$14) ? kx.aa : kx.ab;
                  this.q.r.a($$20, (double)$$5.u() + $$12, (double)$$5.v() + $$19, (double)$$5.w() + $$13, 0.0, 0.0, 0.0);
               }
            }
         }

         if ($$5 != null && $$2.a(3) < this.aq++) {
            this.aq = 0;
            if ($$5.v() > $$4.v() + 1 && $$3.a(dvz.a.e, $$4).v() > axz.d((float)$$4.v())) {
               this.q.r.a($$5, avc.BP, avd.d, 0.1F, 0.5F, false);
            } else {
               this.q.r.a($$5, avc.BO, avd.d, 0.2F, 1.0F, false);
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
   public void a(atr $$0) {
      this.a();
      if (fde.O()) {
         this.y();
      }
   }

   public void a() {
      if (this.K != null) {
         this.K.close();
      }

      akh $$0 = new akh("shaders/post/entity_outline.json");

      try {
         this.K = new gbr(this.q.aa(), this.q.ab(), this.q.h(), $$0);
         this.K.a(this.q.aP().k(), this.q.aP().l());
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
      akh $$0 = new akh("shaders/post/transparency.json");

      try {
         gbr $$1 = new gbr(this.q.aa(), this.q.ab(), this.q.h(), $$0);
         $$1.a(this.q.aP().k(), this.q.aP().l());
         ewj $$2 = $$1.a("translucent");
         ewj $$3 = $$1.a("itemEntity");
         ewj $$4 = $$1.a("particles");
         ewj $$5 = $$1.a("weather");
         ewj $$6 = $$1.a("clouds");
         this.Q = $$1;
         this.L = $$2;
         this.M = $$3;
         this.N = $$4;
         this.O = $$5;
         this.P = $$6;
      } catch (Exception var8) {
         String $$8 = var8 instanceof JsonSyntaxException ? "parse" : "load";
         String $$9 = "Failed to " + $$8 + " shader: " + $$0;
         gbm.a $$10 = new gbm.a($$9, var8);
         if (this.q.ac().d().size() > 1) {
            wu $$11 = this.q.ab().b().findFirst().map($$0x -> wu.b($$0x.b())).orElse(null);
            this.q.m.j().a(fcx.b);
            this.q.a($$10, $$11, null);
         } else {
            this.q.m.j().a(fcx.b);
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
         this.J.c(this.q.aP().k(), this.q.aP().l(), false);
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.q.j.a() && this.J != null && this.K != null && this.q.s != null;
   }

   private void A() {
      exz $$0 = exz.b();
      exs $$1 = $$0.d();
      if (this.B != null) {
         this.B.close();
      }

      this.B = new eya(eya.a.a);
      exs.b $$2 = a($$1, -16.0F);
      this.B.a();
      this.B.a($$2);
      eya.b();
   }

   private void B() {
      exz $$0 = exz.b();
      exs $$1 = $$0.d();
      if (this.A != null) {
         this.A.close();
      }

      this.A = new eya(eya.a.a);
      exs.b $$2 = a($$1, 16.0F);
      this.A.a();
      this.A.a($$2);
      eya.b();
   }

   private static exs.b a(exs $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      float $$3 = 512.0F;
      RenderSystem.setShader(gbh::p);
      $$0.a(eyc.b.g, exv.m);
      $$0.a(0.0, (double)$$1, 0.0).e();

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$0.a((double)($$2 * axz.b((float)$$4 * (float) (Math.PI / 180.0))), (double)$$1, (double)(512.0F * axz.a((float)$$4 * (float) (Math.PI / 180.0))))
            .e();
      }

      return $$0.d();
   }

   private void C() {
      exz $$0 = exz.b();
      exs $$1 = $$0.d();
      RenderSystem.setShader(gbh::p);
      if (this.z != null) {
         this.z.close();
      }

      this.z = new eya(eya.a.a);
      exs.b $$2 = this.a($$1);
      this.z.a();
      this.z.a($$2);
      eya.b();
   }

   private exs.b a(exs $$0) {
      ayg $$1 = ayg.a(10842L);
      $$0.a(eyc.b.h, exv.m);

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

   public void a(@Nullable fvw $$0) {
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
      if (fde.O()) {
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
            this.ae = new geo(this.u, this, ac.f(), this.t);
         } else {
            this.ae.a(this.u);
         }

         this.C = true;
         gbj.a(fde.N());
         this.af = this.q.m.aD();
         if (this.y != null) {
            this.y.a();
         }

         this.ae.g();
         synchronized (this.x) {
            this.x.clear();
         }

         this.y = new gcf(this.ae, this.u, this.q.m.aD(), this);
         this.v.a(this.y);
         this.w.clear();
         brh $$0 = this.q.ao();
         if ($$0 != null) {
            this.y.a($$0.ds(), $$0.dy());
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

   public geo h() {
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
         geo.b $$1 = (geo.b)var2.next();
         if (!$$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String l() {
      return "E: " + this.ag + "/" + this.u.h() + ", B: " + this.ah + ", SD: " + this.u.m();
   }

   private void a(fcp $$0, ges $$1, boolean $$2, boolean $$3) {
      etp $$4 = $$0.b();
      if (this.q.m.aD() != this.af) {
         this.f();
      }

      this.u.af().a("camera");
      double $$5 = this.q.s.ds();
      double $$6 = this.q.s.du();
      double $$7 = this.q.s.dy();
      int $$8 = jp.a($$5);
      int $$9 = jp.a($$6);
      int $$10 = jp.a($$7);
      if (this.R != $$8 || this.S != $$9 || this.T != $$10) {
         this.R = $$8;
         this.S = $$9;
         this.T = $$10;
         this.y.a($$5, $$7);
      }

      this.ae.a($$4);
      this.u.af().b("cull");
      this.q.aJ().b("culling");
      in $$11 = $$0.c();
      double $$12 = Math.floor($$4.c / 8.0);
      double $$13 = Math.floor($$4.d / 8.0);
      double $$14 = Math.floor($$4.e / 8.0);
      if ($$12 != this.U || $$13 != this.V || $$14 != this.W) {
         this.v.a();
      }

      this.U = $$12;
      this.V = $$13;
      this.W = $$14;
      this.q.aJ().b("update");
      if (!$$2) {
         boolean $$15 = this.q.D;
         if ($$3 && this.u.a_($$11).i(this.u, $$11)) {
            $$15 = false;
         }

         brh.b(axz.a((double)this.q.m.aD() / 8.0, 1.0, 2.5) * this.q.m.g().c());
         this.q.aJ().a("section_occlusion_graph");
         this.v.a($$15, $$0, $$1, this.w);
         this.q.aJ().c();
         double $$16 = Math.floor((double)($$0.d() / 2.0F));
         double $$17 = Math.floor((double)($$0.e() / 2.0F));
         if (this.v.b() || $$16 != this.X || $$17 != this.Y) {
            this.b(a($$1));
            this.X = $$16;
            this.Y = $$17;
         }
      }

      this.q.aJ().c();
   }

   public static ges a(ges $$0) {
      return new ges($$0).a(8);
   }

   private void b(ges $$0) {
      if (!fde.Q().bv()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.q.aJ().a("apply_frustum");
         this.w.clear();
         this.v.a($$0, this.w);
         this.q.aJ().c();
      }
   }

   public void a(geo.b $$0) {
      this.v.a($$0);
   }

   private void a(Matrix4f $$0, Matrix4f $$1, double $$2, double $$3, double $$4, ges $$5) {
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

   public void a(etp $$0, Matrix4f $$1, Matrix4f $$2) {
      this.ai = new ges($$1, $$2);
      this.ai.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(float $$0, long $$1, boolean $$2, fcp $$3, gbh $$4, gbn $$5, Matrix4f $$6, Matrix4f $$7) {
      bpx $$8 = this.q.r.s();
      float $$9 = $$8.i() ? $$0 : 1.0F;
      RenderSystem.setShaderGameTime(this.u.Y(), $$9);
      this.s.a(this.u, $$3, this.q.v);
      this.r.a(this.u, $$3, this.q.u);
      bma $$10 = this.u.af();
      $$10.b("light_update_queue");
      this.u.b();
      $$10.b("light_updates");
      this.u.i().p().a();
      etp $$11 = $$3.b();
      double $$12 = $$11.a();
      double $$13 = $$11.b();
      double $$14 = $$11.c();
      $$10.b("culling");
      boolean $$15 = this.ak != null;
      ges $$16;
      if ($$15) {
         $$16 = this.ak;
         $$16.a(this.am.x, this.am.y, this.am.z);
      } else {
         $$16 = this.ai;
      }

      this.q.aJ().b("captureFrustum");
      if (this.aj) {
         this.a($$6, $$7, $$11.c, $$11.d, $$11.e, $$15 ? new ges($$6, $$7) : $$16);
         this.aj = false;
      }

      $$10.b("clear");
      gbg.a($$3, $$9, this.q.r, this.q.m.aD(), $$4.c($$9));
      gbg.b();
      RenderSystem.clear(16640, fde.a);
      float $$18 = $$4.l();
      boolean $$19 = this.q.r.d().a(axz.a($$12), axz.a($$13)) || this.q.l.j().d();
      $$10.b("sky");
      RenderSystem.setShader(gbh::p);
      this.a($$6, $$7, $$9, $$3, $$19, () -> gbg.a($$3, gbg.d.a, $$18, $$19, $$9));
      $$10.b("fog");
      gbg.a($$3, gbg.d.b, Math.max($$18, 32.0F), $$19, $$9);
      $$10.b("terrain_setup");
      this.a($$3, $$16, $$15, this.q.s.N_());
      $$10.b("compile_sections");
      this.c($$3);
      $$10.b("terrain");
      this.a(gbw.c(), $$12, $$13, $$14, $$6, $$7);
      this.a(gbw.d(), $$12, $$13, $$14, $$6, $$7);
      this.a(gbw.e(), $$12, $$13, $$14, $$6, $$7);
      if (this.u.d().e()) {
         ewt.a();
      } else {
         ewt.b();
      }

      $$10.b("entities");
      this.ag = 0;
      this.ah = 0;
      if (this.M != null) {
         this.M.b(fde.a);
         this.M.a(this.q.h());
         this.q.h().a(false);
      }

      if (this.O != null) {
         this.O.b(fde.a);
      }

      if (this.d()) {
         this.J.b(fde.a);
         this.q.h().a(false);
      }

      Matrix4fStack $$20 = RenderSystem.getModelViewStack();
      $$20.pushMatrix();
      $$20.mul($$6);
      RenderSystem.applyModelViewMatrix();
      boolean $$21 = false;
      exx $$22 = new exx();
      gbo.a $$23 = this.t.c();

      for (brh $$24 : this.u.e()) {
         if (this.r.a($$24, $$16, $$12, $$13, $$14) || $$24.z(this.q.s)) {
            in $$25 = $$24.dn();
            if ((this.u.d($$25.v()) || this.a($$25))
               && ($$24 != $$3.g() || $$3.i() || $$3.g() instanceof bsa && ((bsa)$$3.g()).fJ())
               && (!($$24 instanceof gaq) || $$3.g() == $$24)) {
               this.ag++;
               if ($$24.ai == 0) {
                  $$24.ad = $$24.ds();
                  $$24.ae = $$24.du();
                  $$24.af = $$24.dy();
               }

               gbo $$27;
               if (this.d() && this.q.b($$24)) {
                  $$21 = true;
                  gbp $$26 = this.t.e();
                  $$27 = $$26;
                  int $$28 = $$24.i_();
                  $$26.a(axj.b.b($$28), axj.b.c($$28), axj.b.d($$28), 255);
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
      $$23.a(gbw.c(gmx.e));
      $$23.a(gbw.d(gmx.e));
      $$23.a(gbw.e(gmx.e));
      $$23.a(gbw.k(gmx.e));
      $$10.b("blockentities");
      ObjectListIterator var42 = this.w.iterator();

      while (var42.hasNext()) {
         geo.b $$31 = (geo.b)var42.next();
         List<dnm> $$32 = $$31.d().b();
         if (!$$32.isEmpty()) {
            for (dnm $$33 : $$32) {
               in $$34 = $$33.az_();
               gbo $$35 = $$23;
               $$22.a();
               $$22.a((double)$$34.u() - $$12, (double)$$34.v() - $$13, (double)$$34.w() - $$14);
               SortedSet<apn> $$36 = (SortedSet<apn>)this.H.get($$34.a());
               if ($$36 != null && !$$36.isEmpty()) {
                  int $$37 = $$36.last().c();
                  if ($$37 >= 0) {
                     exx.a $$38 = $$22.c();
                     eyb $$39 = new exy(this.t.d().getBuffer(gpe.l.get($$37)), $$38, 1.0F);
                     $$35 = $$2x -> {
                        eyb $$3x = $$23.getBuffer($$2x);
                        return $$2x.N() ? eye.a($$39, $$3x) : $$3x;
                     };
                  }
               }

               this.s.a($$33, $$9, $$22, $$35);
               $$22.b();
            }
         }
      }

      synchronized (this.x) {
         for (dnm $$40 : this.x) {
            in $$41 = $$40.az_();
            $$22.a();
            $$22.a((double)$$41.u() - $$12, (double)$$41.v() - $$13, (double)$$41.w() - $$14);
            this.s.a($$40, $$9, $$22, $$23);
            $$22.b();
         }
      }

      this.a($$22);
      $$23.a(gbw.c());
      $$23.a(gbw.u());
      $$23.a(gbw.v());
      $$23.a(gcd.h());
      $$23.a(gcd.i());
      $$23.a(gcd.c());
      $$23.a(gcd.d());
      $$23.a(gcd.e());
      $$23.a(gcd.f());
      $$23.a(gcd.g());
      this.t.e().a();
      if ($$21) {
         this.K.a($$9);
         this.q.h().a(false);
      }

      $$10.b("destroyProgress");
      ObjectIterator var44 = this.H.long2ObjectEntrySet().iterator();

      while (var44.hasNext()) {
         Entry<SortedSet<apn>> $$42 = (Entry<SortedSet<apn>>)var44.next();
         in $$43 = in.d($$42.getLongKey());
         double $$44 = (double)$$43.u() - $$12;
         double $$45 = (double)$$43.v() - $$13;
         double $$46 = (double)$$43.w() - $$14;
         if (!($$44 * $$44 + $$45 * $$45 + $$46 * $$46 > 1024.0)) {
            SortedSet<apn> $$47 = (SortedSet<apn>)$$42.getValue();
            if ($$47 != null && !$$47.isEmpty()) {
               int $$48 = $$47.last().c();
               $$22.a();
               $$22.a((double)$$43.u() - $$12, (double)$$43.v() - $$13, (double)$$43.w() - $$14);
               exx.a $$49 = $$22.c();
               eyb $$50 = new exy(this.t.d().getBuffer(gpe.l.get($$48)), $$49, 1.0F);
               this.q.ap().a(this.u.a_($$43), $$43, this.u, $$22, $$50);
               $$22.b();
            }
         }
      }

      this.a($$22);
      etn $$51 = this.q.v;
      if ($$2 && $$51 != null && $$51.c() == etn.a.b) {
         $$10.b("outline");
         in $$52 = ((etl)$$51).a();
         dqh $$53 = this.u.a_($$52);
         if (!$$53.i() && this.u.C_().a($$52)) {
            eyb $$54 = $$23.getBuffer(gbw.y());
            this.a($$22, $$54, $$3.g(), $$12, $$13, $$14, $$52, $$53);
         }
      }

      this.q.k.a($$22, $$23, $$12, $$13, $$14);
      $$23.a();
      $$23.a(gcd.k());
      $$23.a(gcd.a());
      $$23.a(gcd.b());
      $$23.a(gbw.j());
      $$23.a(gbw.k());
      $$23.a(gbw.m());
      $$23.a(gbw.n());
      $$23.a(gbw.l());
      $$23.a(gbw.o());
      $$23.a(gbw.p());
      $$23.a(gbw.i());
      this.t.d().b();
      if (this.Q != null) {
         $$23.a(gbw.y());
         $$23.b();
         this.L.b(fde.a);
         this.L.a(this.q.h());
         $$10.b("translucent");
         this.a(gbw.f(), $$12, $$13, $$14, $$6, $$7);
         $$10.b("string");
         this.a(gbw.t(), $$12, $$13, $$14, $$6, $$7);
         this.N.b(fde.a);
         this.N.a(this.q.h());
         gbv.aM.a();
         $$10.b("particles");
         this.q.g.a($$5, $$3, $$9);
         gbv.aM.b();
      } else {
         $$10.b("translucent");
         if (this.L != null) {
            this.L.b(fde.a);
         }

         this.a(gbw.f(), $$12, $$13, $$14, $$6, $$7);
         $$23.a(gbw.y());
         $$23.b();
         $$10.b("string");
         this.a(gbw.t(), $$12, $$13, $$14, $$6, $$7);
         $$10.b("particles");
         this.q.g.a($$5, $$3, $$9);
      }

      if (this.q.m.ay() != fcs.a) {
         if (this.Q != null) {
            this.P.b(fde.a);
         }

         $$10.b("clouds");
         this.a($$22, $$6, $$7, $$9, $$12, $$13, $$14);
      }

      if (this.Q != null) {
         gbv.aN.a();
         $$10.b("weather");
         this.a($$5, $$9, $$12, $$13, $$14);
         this.d($$3);
         gbv.aN.b();
         this.Q.a($$9);
         this.q.h().a(false);
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
      gbg.a();
   }

   private void a(exx $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(brh $$0, double $$1, double $$2, double $$3, float $$4, exx $$5, gbo $$6) {
      double $$7 = axz.d((double)$$4, $$0.ad, $$0.ds());
      double $$8 = axz.d((double)$$4, $$0.ae, $$0.du());
      double $$9 = axz.d((double)$$4, $$0.af, $$0.dy());
      float $$10 = axz.i($$4, $$0.O, $$0.dD());
      this.r.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$10, $$4, $$5, $$6, this.r.a($$0, $$4));
   }

   private void a(gbw $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      $$0.a();
      if ($$0 == gbw.f()) {
         this.q.aJ().a("translucent_sort");
         double $$6 = $$1 - this.an;
         double $$7 = $$2 - this.ao;
         double $$8 = $$3 - this.ap;
         if ($$6 * $$6 + $$7 * $$7 + $$8 * $$8 > 1.0) {
            int $$9 = jp.a($$1);
            int $$10 = jp.a($$2);
            int $$11 = jp.a($$3);
            boolean $$12 = $$9 != jp.a(this.an) || $$11 != jp.a(this.ap) || $$10 != jp.a(this.ao);
            this.an = $$1;
            this.ao = $$2;
            this.ap = $$3;
            int $$13 = 0;
            ObjectListIterator var21 = this.w.iterator();

            while (var21.hasNext()) {
               geo.b $$14 = (geo.b)var21.next();
               if ($$13 < 15 && ($$12 || $$14.b($$9, $$10, $$11)) && $$14.a($$0, this.ae)) {
                  $$13++;
               }
            }
         }

         this.q.aJ().c();
      }

      this.q.aJ().a("filterempty");
      this.q.aJ().b(() -> "render_" + $$0);
      boolean $$15 = $$0 != gbw.f();
      ObjectListIterator<geo.b> $$16 = this.w.listIterator($$15 ? 0 : this.w.size());
      gcc $$17 = RenderSystem.getShader();

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
      exo $$20 = $$17.p;

      while ($$15 ? $$16.hasNext() : $$16.hasPrevious()) {
         geo.b $$21 = $$15 ? (geo.b)$$16.next() : (geo.b)$$16.previous();
         if (!$$21.d().a($$0)) {
            eya $$22 = $$21.a($$0);
            in $$23 = $$21.f();
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
      eya.b();
      this.q.aJ().c();
      $$0.b();
   }

   private void a(exx $$0, gbo $$1, fcp $$2) {
      if (this.q.B || this.q.C) {
         double $$3 = $$2.b().a();
         double $$4 = $$2.b().b();
         double $$5 = $$2.b().c();
         ObjectListIterator var10 = this.w.iterator();

         while (var10.hasNext()) {
            geo.b $$6 = (geo.b)var10.next();
            gcb.d $$7 = this.v.b($$6);
            if ($$7 != null) {
               in $$8 = $$6.f();
               $$0.a();
               $$0.a((double)$$8.u() - $$3, (double)$$8.v() - $$4, (double)$$8.w() - $$5);
               Matrix4f $$9 = $$0.c().a();
               if (this.q.B) {
                  eyb $$10 = $$1.getBuffer(gbw.y());
                  int $$11 = $$7.b == 0 ? 0 : axz.h((float)$$7.b / 50.0F, 0.9F, 0.9F);
                  int $$12 = $$11 >> 16 & 0xFF;
                  int $$13 = $$11 >> 8 & 0xFF;
                  int $$14 = $$11 & 0xFF;

                  for (int $$15 = 0; $$15 < d.length; $$15++) {
                     if ($$7.a($$15)) {
                        is $$16 = d[$$15];
                        $$10.a($$9, 8.0F, 8.0F, 8.0F).a($$12, $$13, $$14, 255).a((float)$$16.j(), (float)$$16.k(), (float)$$16.l()).e();
                        $$10.a($$9, (float)(8 - 16 * $$16.j()), (float)(8 - 16 * $$16.k()), (float)(8 - 16 * $$16.l()))
                           .a($$12, $$13, $$14, 255)
                           .a((float)$$16.j(), (float)$$16.k(), (float)$$16.l())
                           .e();
                     }
                  }
               }

               if (this.q.C && !$$6.d().a()) {
                  eyb $$17 = $$1.getBuffer(gbw.y());
                  int $$18 = 0;

                  for (is $$19 : d) {
                     for (is $$20 : d) {
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
                     eyb $$22 = $$1.getBuffer(gbw.B());
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
         eyb $$26 = $$1.getBuffer(gbw.B());
         this.a($$26, $$25, 0, 1, 2, 3, 0, 1, 1);
         this.a($$26, $$25, 4, 5, 6, 7, 1, 0, 0);
         this.a($$26, $$25, 0, 1, 5, 4, 1, 1, 0);
         this.a($$26, $$25, 2, 3, 7, 6, 0, 0, 1);
         this.a($$26, $$25, 0, 4, 7, 3, 0, 1, 0);
         this.a($$26, $$25, 1, 5, 6, 2, 1, 0, 1);
         eyb $$27 = $$1.getBuffer(gbw.y());
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

   private void a(eyb $$0, Matrix4f $$1, int $$2) {
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a(0, 0, 0, 255).a(0.0F, 0.0F, -1.0F).e();
   }

   private void a(eyb $$0, Matrix4f $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
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
         Iterator<apn> $$0 = this.G.values().iterator();

         while ($$0.hasNext()) {
            apn $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.F - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(apn $$0) {
      long $$1 = $$0.b().a();
      Set<apn> $$2 = (Set<apn>)this.H.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.H.remove($$1);
      }
   }

   private void b(exx $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(gbh::t);
      RenderSystem.setShaderTexture(0, m);
      exz $$1 = exz.b();
      exs $$2 = $$1.d();

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
         $$2.a(eyc.b.h, exv.s);
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

   public void a(Matrix4f $$0, Matrix4f $$1, float $$2, fcp $$3, boolean $$4, Runnable $$5) {
      $$5.run();
      if (!$$4) {
         emc $$6 = $$3.k();
         if ($$6 != emc.c && $$6 != emc.a && !this.b($$3)) {
            exx $$7 = new exx();
            $$7.a($$0);
            if (this.q.r.d().c() == gbd.d.c) {
               this.b($$7);
            } else if (this.q.r.d().c() == gbd.d.b) {
               etp $$8 = this.u.a(this.q.j.m().b(), $$2);
               float $$9 = (float)$$8.c;
               float $$10 = (float)$$8.d;
               float $$11 = (float)$$8.e;
               gbg.b();
               exs $$12 = exz.b().d();
               RenderSystem.depthMask(false);
               RenderSystem.setShaderColor($$9, $$10, $$11, 1.0F);
               gcc $$13 = RenderSystem.getShader();
               this.A.a();
               this.A.a($$7.c().a(), $$1, $$13);
               eya.b();
               RenderSystem.enableBlend();
               float[] $$14 = this.u.d().a(this.u.f($$2), $$2);
               if ($$14 != null) {
                  RenderSystem.setShader(gbh::q);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  $$7.a();
                  $$7.a(a.b.rotationDegrees(90.0F));
                  float $$15 = axz.a(this.u.a($$2)) < 0.0F ? 180.0F : 0.0F;
                  $$7.a(a.f.rotationDegrees($$15));
                  $$7.a(a.f.rotationDegrees(90.0F));
                  float $$16 = $$14[0];
                  float $$17 = $$14[1];
                  float $$18 = $$14[2];
                  Matrix4f $$19 = $$7.c().a();
                  $$12.a(eyc.b.g, exv.n);
                  $$12.a($$19, 0.0F, 100.0F, 0.0F).a($$16, $$17, $$18, $$14[3]).e();
                  int $$20 = 16;

                  for (int $$21 = 0; $$21 <= 16; $$21++) {
                     float $$22 = (float)$$21 * (float) (Math.PI * 2) / 16.0F;
                     float $$23 = axz.a($$22);
                     float $$24 = axz.b($$22);
                     $$12.a($$19, $$23 * 120.0F, $$24 * 120.0F, -$$24 * 40.0F * $$14[3]).a($$14[0], $$14[1], $$14[2], 0.0F).e();
                  }

                  ext.a($$12.d());
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
               RenderSystem.setShader(gbh::s);
               RenderSystem.setShaderTexture(0, l);
               $$12.a(eyc.b.h, exv.q);
               $$12.a($$26, -$$27, 100.0F, -$$27).a(0.0F, 0.0F).e();
               $$12.a($$26, $$27, 100.0F, -$$27).a(1.0F, 0.0F).e();
               $$12.a($$26, $$27, 100.0F, $$27).a(1.0F, 1.0F).e();
               $$12.a($$26, -$$27, 100.0F, $$27).a(0.0F, 1.0F).e();
               ext.a($$12.d());
               $$27 = 20.0F;
               RenderSystem.setShaderTexture(0, k);
               int $$28 = this.u.aq();
               int $$29 = $$28 % 4;
               int $$30 = $$28 / 4 % 2;
               float $$31 = (float)($$29 + 0) / 4.0F;
               float $$32 = (float)($$30 + 0) / 2.0F;
               float $$33 = (float)($$29 + 1) / 4.0F;
               float $$34 = (float)($$30 + 1) / 2.0F;
               $$12.a(eyc.b.h, exv.q);
               $$12.a($$26, -$$27, -100.0F, $$27).a($$33, $$34).e();
               $$12.a($$26, $$27, -100.0F, $$27).a($$31, $$34).e();
               $$12.a($$26, $$27, -100.0F, -$$27).a($$31, $$32).e();
               $$12.a($$26, -$$27, -100.0F, -$$27).a($$33, $$32).e();
               ext.a($$12.d());
               float $$35 = this.u.i($$2) * $$25;
               if ($$35 > 0.0F) {
                  RenderSystem.setShaderColor($$35, $$35, $$35, $$35);
                  gbg.a();
                  this.z.a();
                  this.z.a($$7.c().a(), $$1, gbh.p());
                  eya.b();
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
                  eya.b();
                  $$7.b();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.depthMask(true);
            }
         }
      }
   }

   private boolean b(fcp $$0) {
      return !($$0.g() instanceof bsa $$1) ? false : $$1.b(bqv.o) || $$1.b(bqv.G);
   }

   public void a(exx $$0, Matrix4f $$1, Matrix4f $$2, float $$3, double $$4, double $$5, double $$6) {
      float $$7 = this.u.d().a();
      if (!Float.isNaN($$7)) {
         float $$8 = 12.0F;
         float $$9 = 4.0F;
         double $$10 = 2.0E-4;
         double $$11 = (double)(((float)this.F + $$3) * 0.03F);
         double $$12 = ($$4 + $$11) / 12.0;
         double $$13 = (double)($$7 - (float)$$5 + 0.33F);
         double $$14 = $$6 / 12.0 + 0.33F;
         $$12 -= (double)(axz.a($$12 / 2048.0) * 2048);
         $$14 -= (double)(axz.a($$14 / 2048.0) * 2048);
         float $$15 = (float)($$12 - (double)axz.a($$12));
         float $$16 = (float)($$13 / 4.0 - (double)axz.a($$13 / 4.0)) * 4.0F;
         float $$17 = (float)($$14 - (double)axz.a($$14));
         etp $$18 = this.u.h($$3);
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
            exs $$22 = exz.b().d();
            if (this.D != null) {
               this.D.close();
            }

            this.D = new eya(eya.a.a);
            exs.b $$23 = this.a($$22, $$12, $$13, $$14, $$18);
            this.D.a();
            this.D.a($$23);
            eya.b();
         }

         gbg.b();
         $$0.a();
         $$0.a($$1);
         $$0.b(12.0F, 1.0F, 12.0F);
         $$0.a(-$$15, $$16, -$$17);
         if (this.D != null) {
            this.D.a();
            int $$24 = this.ad == fcs.c ? 0 : 1;

            for (int $$25 = $$24; $$25 < 2; $$25++) {
               gbw $$26 = $$25 == 0 ? gbw.x() : gbw.w();
               $$26.a();
               gcc $$27 = RenderSystem.getShader();
               this.D.a($$0.c().a(), $$2, $$27);
               $$26.b();
            }

            eya.b();
         }

         $$0.b();
      }
   }

   private exs.b a(exs $$0, double $$1, double $$2, double $$3, etp $$4) {
      float $$5 = 4.0F;
      float $$6 = 0.00390625F;
      int $$7 = 8;
      int $$8 = 4;
      float $$9 = 9.765625E-4F;
      float $$10 = (float)axz.a($$1) * 0.00390625F;
      float $$11 = (float)axz.a($$3) * 0.00390625F;
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
      $$0.a(eyc.b.h, exv.v);
      float $$24 = (float)Math.floor($$2 / 4.0) * 4.0F;
      if (this.ad == fcs.c) {
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

   private void c(fcp $$0) {
      this.q.aJ().a("populate_sections_to_compile");
      elp $$1 = this.u.y_();
      gen $$2 = new gen();
      in $$3 = $$0.c();
      List<geo.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.w.iterator();

      while (var6.hasNext()) {
         geo.b $$5 = (geo.b)var6.next();
         jp $$6 = jp.a($$5.f());
         if ($$5.h() && $$1.a($$6)) {
            boolean $$7 = false;
            if (this.q.m.l().c() == fdl.c) {
               in $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.i();
            } else if (this.q.m.l().c() == fdl.b) {
               $$7 = $$5.i();
            }

            if ($$7) {
               this.q.aJ().a("build_near_sync");
               this.ae.a($$5, $$2);
               $$5.g();
               this.q.aJ().c();
            } else {
               $$4.add($$5);
            }
         }
      }

      this.q.aJ().b("upload");
      this.ae.f();
      this.q.aJ().b("schedule_async_compile");

      for (geo.b $$9 : $$4) {
         $$9.a(this.ae, $$2);
         $$9.g();
      }

      this.q.aJ().c();
   }

   private void d(fcp $$0) {
      exs $$1 = exz.b().d();
      dry $$2 = this.u.C_();
      double $$3 = (double)(this.q.m.aD() * 16);
      if (!($$0.b().c < $$2.g() - $$3) || !($$0.b().c > $$2.e() + $$3) || !($$0.b().e < $$2.h() - $$3) || !($$0.b().e > $$2.f() + $$3)) {
         double $$4 = 1.0 - $$2.b($$0.b().c, $$0.b().e) / $$3;
         $$4 = Math.pow($$4, 4.0);
         $$4 = axz.a($$4, 0.0, 1.0);
         double $$5 = $$0.b().c;
         double $$6 = $$0.b().e;
         double $$7 = (double)this.q.j.h();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
         RenderSystem.setShaderTexture(0, n);
         RenderSystem.depthMask(fde.O());
         int $$8 = $$2.d().a();
         float $$9 = (float)($$8 >> 16 & 0xFF) / 255.0F;
         float $$10 = (float)($$8 >> 8 & 0xFF) / 255.0F;
         float $$11 = (float)($$8 & 0xFF) / 255.0F;
         RenderSystem.setShaderColor($$9, $$10, $$11, (float)$$4);
         RenderSystem.setShader(gbh::s);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.disableCull();
         float $$12 = (float)(ac.b() % 3000L) / 3000.0F;
         float $$13 = (float)(-axz.e($$0.b().d * 0.5));
         float $$14 = $$13 + (float)$$7;
         $$1.a(eyc.b.h, exv.q);
         double $$15 = Math.max((double)axz.a($$6 - $$3), $$2.f());
         double $$16 = Math.min((double)axz.c($$6 + $$3), $$2.h());
         float $$17 = (float)(axz.a($$15) & 1) * 0.5F;
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

         $$15 = Math.max((double)axz.a($$5 - $$3), $$2.e());
         $$16 = Math.min((double)axz.c($$5 + $$3), $$2.g());
         $$17 = (float)(axz.a($$15) & 1) * 0.5F;
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

         ext.a($$1.d());
         RenderSystem.enableCull();
         RenderSystem.polygonOffset(0.0F, 0.0F);
         RenderSystem.disablePolygonOffset();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.depthMask(true);
      }
   }

   private void a(exx $$0, eyb $$1, brh $$2, double $$3, double $$4, double $$5, in $$6, dqh $$7) {
      a($$0, $$1, $$7.a(this.u, $$6, etu.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   private static etp a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(axz.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new etp(1.0, (double)$$3, 0.0);
         case 1 -> new etp((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new etp(0.0, 1.0, (double)$$3);
         case 3 -> new etp(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new etp((double)$$3, 0.0, 1.0);
         case 5 -> new etp(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static etp a(float $$0, float $$1, float $$2, float $$3) {
      etp $$4 = a($$3).a((double)$$0);
      etp $$5 = a(($$3 + 0.33333334F) % 1.0F).a((double)$$1);
      etp $$6 = a(($$3 + 0.6666667F) % 1.0F).a((double)$$2);
      etp $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.c), Math.max($$7.d, $$7.e));
      return new etp($$7.c / $$8, $$7.d / $$8, $$7.e / $$8);
   }

   public static void a(exx $$0, eyb $$1, eui $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<etk> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         a($$0, $$1, euf.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            etk $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            etp $$16 = a($$6, $$7, $$8, $$15);
            a($$0, $$1, euf.a($$14), $$3, $$4, $$5, (float)$$16.c, (float)$$16.d, (float)$$16.e, $$9);
         }
      }
   }

   private static void a(exx $$0, eyb $$1, eui $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9) {
      exx.a $$10 = $$0.c();
      $$2.a(($$9x, $$10x, $$11, $$12, $$13, $$14) -> {
         float $$15 = (float)($$12 - $$9x);
         float $$16 = (float)($$13 - $$10x);
         float $$17 = (float)($$14 - $$11);
         float $$18 = axz.c($$15 * $$15 + $$16 * $$16 + $$17 * $$17);
         $$15 /= $$18;
         $$16 /= $$18;
         $$17 /= $$18;
         $$1.a($$10, (float)($$9x + $$3), (float)($$10x + $$4), (float)($$11 + $$5)).a($$6, $$7, $$8, $$9).b($$10, $$15, $$16, $$17).e();
         $$1.a($$10, (float)($$12 + $$3), (float)($$13 + $$4), (float)($$14 + $$5)).a($$6, $$7, $$8, $$9).b($$10, $$15, $$16, $$17).e();
      });
   }

   public static void a(eyb $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, float $$8, float $$9, float $$10) {
      a(new exx(), $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$7, $$8, $$9);
   }

   public static void a(exx $$0, eyb $$1, etk $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6, $$3, $$4, $$5);
   }

   public static void a(exx $$0, eyb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$8, $$9, $$10);
   }

   public static void a(
      exx $$0,
      eyb $$1,
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
      exx.a $$15 = $$0.c();
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

   public static void b(exx $$0, eyb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, (float)$$2, (float)$$3, (float)$$4, (float)$$5, (float)$$6, (float)$$7, $$8, $$9, $$10, $$11);
   }

   public static void a(exx $$0, eyb $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
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

   public void a(czj $$0, in $$1, dqh $$2, dqh $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(in $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(jp.a($$3), jp.a($$4), jp.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(jp.a($$7), jp.a($$8), jp.a($$6));
            }
         }
      }
   }

   public void a(in $$0, dqh $$1, dqh $$2) {
      if (this.q.aE().a($$1, $$2)) {
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

   public void a(@Nullable avb $$0, in $$1) {
      gqm $$2 = this.I.get($$1);
      if ($$2 != null) {
         this.q.ak().b($$2);
         this.I.remove($$1);
      }

      if ($$0 != null) {
         cts $$3 = cts.a($$0);
         if ($$3 != null) {
            this.q.l.a($$3.i());
         }

         gqm var5 = gqh.a($$0, etp.b($$1));
         this.I.put($$1, var5);
         this.q.ak().a(var5);
      }

      this.a(this.u, $$1, $$0 != null);
   }

   private void a(dad $$0, in $$1, boolean $$2) {
      for (bsa $$4 : $$0.a(bsa.class, new etk($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }

   public void a(kv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(kv $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", ld.j.b($$0.a()));
         $$11.a("Parameters", () -> $$0.a(this.u.H_()));
         $$11.a("Position", () -> p.a(this.u, $$3, $$4, $$5));
         throw new y($$10);
      }
   }

   private <T extends kv> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private fzc b(kv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private fzc b(kv $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fcp $$9 = this.q.j.m();
      fdj $$10 = this.a($$2);
      if ($$1) {
         return this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == fdj.c ? null : this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private fdj a(boolean $$0) {
      fdj $$1 = this.q.m.ar().c();
      if ($$0 && $$1 == fdj.c && this.u.z.a(10) == 0) {
         $$1 = fdj.b;
      }

      if ($$1 == fdj.b && this.u.z.a(3) == 0) {
         $$1 = fdj.c;
      }

      return $$1;
   }

   public void p() {
   }

   public void a(int $$0, in $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            fcp $$3 = this.q.j.m();
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
                  this.u.a($$8, $$9, $$10, avc.Cs, avd.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.u.a($$8, $$9, $$10, avc.ir, avd.f, 1.0F, 1.0F, false);
               } else {
                  this.u.a($$8, $$9, $$10, avc.hW, avd.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, in $$1, int $$2) {
      ayg $$3 = this.u.z;
      switch ($$0) {
         case 1000:
            this.u.a($$1, avc.gN, avd.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.u.a($$1, avc.gO, avd.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.u.a($$1, avc.gP, avd.e, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.u.a($$1, avc.id, avd.g, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.u.a($$1, avc.iL, avd.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.u.a($$1, avc.iP, avd.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.u.a($$1, avc.ka, avd.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            if (csu.b($$2) instanceof cts $$73) {
               this.a($$73.j(), $$1);
            }
            break;
         case 1011:
            this.a(null, $$1);
            break;
         case 1015:
            this.u.a($$1, avc.kk, avd.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.u.a($$1, avc.kj, avd.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.u.a($$1, avc.ib, avd.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.u.a($$1, avc.ck, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.u.a($$1, avc.Df, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.u.a($$1, avc.Dg, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.u.a($$1, avc.Dh, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.u.a($$1, avc.Ck, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.u.a($$1, avc.Cn, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.u.a($$1, avc.bJ, avd.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.u.a($$1, avc.Dp, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.u.a($$1, avc.Dw, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.u.a($$1, avc.V, avd.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.u.a($$1, avc.ab, avd.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.u.a($$1, avc.Y, avd.e, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.q.ak().a(gqh.b(avc.uu, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.u.a($$1, avc.fg, avd.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.u.a($$1, avc.ff, avd.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.u.a($$1, avc.cR, avd.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.u.a($$1, avc.th, avd.f, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.u.a($$1, avc.Di, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.u.a($$1, avc.mQ, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.u.a($$1, avc.lj, avd.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.u.a($$1, avc.cy, avd.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.u.a($$1, avc.xV, avd.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.u.a($$1, avc.hr, avd.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.u.a($$1, avc.hu, avd.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.u.a($$1, avc.hv, avd.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.u.a($$1, avc.wO, avd.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.u.a($$1, avc.gb, avd.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.u.a($$1, avc.gc, avd.e, 1.0F, 1.0F, false);
            break;
         case 1500:
            dep.a(this.u, $$1, $$2 > 0);
            break;
         case 1501:
            this.u.a($$1, avc.nG, avd.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$56 = 0; $$56 < 8; $$56++) {
               this.u.a(kx.U, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.u.a($$1, avc.vh, avd.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$57 = 0; $$57 < 5; $$57++) {
               double $$58 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$59 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$60 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.u.a(kx.ab, $$58, $$59, $$60, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.u.a($$1, avc.iq, avd.e, 1.0F, 1.0F, false);

            for (int $$61 = 0; $$61 < 16; $$61++) {
               double $$62 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$63 = (double)$$1.v() + 0.8125;
               double $$64 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.u.a(kx.ab, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            diw.a(this.u, $$1, this.u.a_($$1));
            break;
         case 1505:
            cqz.a(this.u, $$1, $$2);
            this.u.a($$1, avc.cx, avd.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, kx.ab);
            break;
         case 2001:
            dqh $$23 = dde.a($$2);
            if (!$$23.i()) {
               dkr $$24 = $$23.w();
               this.u.a($$1, $$24.c(), avd.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.u.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            etp $$9 = etp.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.a(new kt(kx.Q, new csz(ctc.vo)), $$9.c, $$9.d, $$9.e, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            kv $$14 = $$0 == 2007 ? kx.P : kx.p;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               fzc $$21 = this.b($$14, $$14.a().b(), $$9.c + $$18 * 0.1, $$9.d + 0.3, $$9.e + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.u.a($$1, avc.yB, avd.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.a(new kt(kx.Q, new csz(ctc.ss)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.a(kx.Z, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.a(kx.Z, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.u.a(kx.ab, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.u.a(kx.E, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$65 = 0; $$65 < 200; $$65++) {
               float $$66 = $$3.i() * 4.0F;
               float $$67 = $$3.i() * (float) (Math.PI * 2);
               double $$68 = (double)(axz.b($$67) * $$66);
               double $$69 = 0.01 + $$3.j() * 0.5;
               double $$70 = (double)(axz.a($$67) * $$66);
               fzc $$71 = this.b(kx.h, false, (double)$$1.u() + $$68 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$70 * 0.1, $$68, $$69, $$70);
               if ($$71 != null) {
                  $$71.c($$66);
               }
            }

            if ($$2 == 1) {
               this.u.a($$1, avc.hX, avd.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.u.a(kx.w, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$72 = 0; $$72 < 8; $$72++) {
               this.u.a(kx.e, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2010:
            this.a($$2, $$1, $$3, kx.ac);
            break;
         case 2011:
            ayc.a(this.u, $$1, $$2, kx.M);
            break;
         case 2012:
            ayc.a(this.u, $$1, $$2, kx.M);
            break;
         case 3000:
            this.u.a(kx.v, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.u.a($$1, avc.ip, avd.e, 10.0F, (1.0F + (this.u.z.i() - this.u.z.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.u.a($$1, avc.hZ, avd.f, 64.0F, 0.8F + this.u.z.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < is.a.d.length) {
               ayc.a(is.a.d[$$2], this.u, $$1, 0.125, kx.aQ, box.a(10, 19));
            } else {
               ayc.a(this.u, $$1, kx.aQ, box.a(3, 5));
            }
            break;
         case 3003:
            ayc.a(this.u, $$1, kx.aO, box.a(3, 5));
            this.u.a($$1, avc.ms, avd.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            ayc.a(this.u, $$1, kx.aP, box.a(3, 5));
            break;
         case 3005:
            ayc.a(this.u, $$1, kx.aR, box.a(3, 5));
            break;
         case 3006:
            int $$32 = $$2 >> 6;
            if ($$32 > 0) {
               if ($$3.i() < 0.3F + (float)$$32 * 0.1F) {
                  float $$33 = 0.15F + 0.02F * (float)$$32 * (float)$$32 * $$3.i();
                  float $$34 = 0.4F + 0.3F * (float)$$32 * $$3.i();
                  this.u.a($$1, avc.vG, avd.e, $$33, $$34, false);
               }

               byte $$35 = (byte)($$2 & 63);
               bor $$36 = box.a(0, $$32);
               float $$37 = 0.005F;
               Supplier<etp> $$38 = () -> new etp(axz.a($$3, -0.005F, 0.005F), axz.a($$3, -0.005F, 0.005F), axz.a($$3, -0.005F, 0.005F));
               if ($$35 == 0) {
                  for (is $$39 : is.values()) {
                     float $$40 = $$39 == is.a ? (float) Math.PI : 0.0F;
                     double $$41 = $$39.o() == is.a.b ? 0.65 : 0.57;
                     ayc.a(this.u, $$1, new ky($$40), $$36, $$39, $$38, $$41);
                  }
               } else {
                  for (is $$42 : die.a($$35)) {
                     float $$43 = $$42 == is.b ? (float) Math.PI : 0.0F;
                     double $$44 = 0.35;
                     ayc.a(this.u, $$1, new ky($$43), $$36, $$42, $$38, 0.35);
                  }
               }
            } else {
               this.u.a($$1, avc.vG, avd.e, 1.0F, 1.0F, false);
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
                        kx.I,
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
               this.u.a(new kz($$53 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + djy.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dqh $$54 = this.u.a_($$1);
            boolean $$55 = $$54.b(dqx.C) && $$54.c(dqx.C);
            if (!$$55) {
               this.u.a((double)$$1.u() + 0.5, (double)$$1.v() + djy.f, (double)$$1.w() + 0.5, avc.wd, avd.e, 2.0F, 0.6F + this.u.z.i() * 0.4F, false);
            }
            break;
         case 3008:
            dqh $$25 = dde.a($$2);
            if ($$25.b() instanceof ddj $$26) {
               this.u.a($$1, $$26.d(), avd.h, 1.0F, 1.0F, false);
            }

            this.u.a($$1, $$25);
            break;
         case 3009:
            ayc.a(this.u, $$1, kx.aT, box.a(3, 6));
            break;
         case 3011:
            dpk.a(this.u, $$1, $$3);
            break;
         case 3012:
            this.u.a($$1, avc.lX, avd.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dpk.a(this.u, $$1, $$3);
            break;
         case 3013:
            this.u.a($$1, avc.lY, avd.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dpk.a(this.u, $$1, $$3, $$2);
            break;
         case 3014:
            this.u.a($$1, avc.mc, avd.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dpk.b(this.u, $$1, $$3);
            break;
         case 3015:
            if (this.u.c_($$1) instanceof dpp $$31) {
               dpp.a.a(this.u, $$31.az_(), $$31.n(), $$31.c());
               this.u.a($$1, avc.Am, avd.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            dpp.a.a(this.u, $$1);
            this.u.a($$1, avc.Aq, avd.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dpk.b(this.u, $$1, $$3);
      }
   }

   public void c(int $$0, in $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         apn $$4 = (apn)this.G.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new apn($$0, $$1);
            this.G.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.F);
         ((SortedSet)this.H.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         apn $$3 = (apn)this.G.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean q() {
      return this.ae.h();
   }

   public void a(czk $$0) {
      this.v.a($$0);
   }

   public void r() {
      this.v.a();
      this.C = true;
   }

   public void a(Collection<dnm> $$0, Collection<dnm> $$1) {
      synchronized (this.x) {
         this.x.removeAll($$0);
         this.x.addAll($$1);
      }
   }

   public static int a(czg $$0, in $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(czg $$0, dqh $$1, in $$2) {
      if ($$1.e($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(dam.a, $$2);
         int $$4 = $$0.a(dam.b, $$2);
         int $$5 = $$1.h();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(in $$0) {
      geo.b $$1 = this.y.a($$0);
      return $$1 != null && $$1.c.get() != geo.a.a;
   }

   @Nullable
   public ewj s() {
      return this.J;
   }

   @Nullable
   public ewj t() {
      return this.L;
   }

   @Nullable
   public ewj u() {
      return this.M;
   }

   @Nullable
   public ewj v() {
      return this.N;
   }

   @Nullable
   public ewj w() {
      return this.O;
   }

   @Nullable
   public ewj x() {
      return this.P;
   }

   private void a(int $$0, in $$1, ayg $$2, la $$3) {
      is $$4 = is.a($$0);
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
