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
import org.joml.Quaternionf;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class ger implements aue, AutoCloseable {
   private static final Logger e = LogUtils.getLogger();
   public static final int a = 16;
   public static final int b = 8;
   private static final float f = 512.0F;
   private static final int g = 32;
   private static final int h = 10;
   private static final int i = 21;
   private static final int j = 15;
   private static final akq k = akq.b("textures/environment/moon_phases.png");
   private static final akq l = akq.b("textures/environment/sun.png");
   protected static final akq c = akq.b("textures/environment/clouds.png");
   private static final akq m = akq.b("textures/environment/end_sky.png");
   private static final akq n = akq.b("textures/misc/forcefield.png");
   private static final akq o = akq.b("textures/environment/rain.png");
   private static final akq p = akq.b("textures/environment/snow.png");
   public static final ji[] d = ji.values();
   private final fgi q;
   private final gkb r;
   private final ggs s;
   private final gez t;
   @Nullable
   private fyz u;
   private final gfg v = new gfg();
   private final ObjectArrayList<ghu.b> w = new ObjectArrayList(10000);
   private final Set<dqf> x = Sets.newHashSet();
   @Nullable
   private gfk y;
   @Nullable
   private fbf z;
   @Nullable
   private fbf A;
   @Nullable
   private fbf B;
   private boolean C = true;
   @Nullable
   private fbf D;
   private final gfc E = new gfc(100);
   private int F;
   private final Int2ObjectMap<apw> G = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<apw>> H = new Long2ObjectOpenHashMap();
   private final Map<jd, gtt> I = Maps.newHashMap();
   @Nullable
   private ezp J;
   @Nullable
   private gew K;
   @Nullable
   private ezp L;
   @Nullable
   private ezp M;
   @Nullable
   private ezp N;
   @Nullable
   private ezp O;
   @Nullable
   private ezp P;
   @Nullable
   private gew Q;
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
   private eww ac = eww.b;
   @Nullable
   private ffv ad;
   @Nullable
   private ghu ae;
   private int af = -1;
   private int ag;
   private int ah;
   private ghy ai;
   private boolean aj;
   @Nullable
   private ghy ak;
   private final Vector4f[] al = new Vector4f[8];
   private final Vector3d am = new Vector3d(0.0, 0.0, 0.0);
   private double an;
   private double ao;
   private double ap;
   private int aq;
   private final float[] ar = new float[1024];
   private final float[] as = new float[1024];

   public ger(fgi $$0, gkb $$1, ggs $$2, gez $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;

      for (int $$4 = 0; $$4 < 32; $$4++) {
         for (int $$5 = 0; $$5 < 32; $$5++) {
            float $$6 = (float)($$5 - 16);
            float $$7 = (float)($$4 - 16);
            float $$8 = ayn.c($$6 * $$6 + $$7 * $$7);
            this.ar[$$4 << 5 | $$5] = -$$7 / $$8;
            this.as[$$4 << 5 | $$5] = $$6 / $$8;
         }
      }

      this.C();
      this.B();
      this.A();
   }

   private void a(ges $$0, float $$1, double $$2, double $$3, double $$4) {
      float $$5 = this.q.r.d($$1);
      if (!($$5 <= 0.0F)) {
         $$0.c();
         dcu $$6 = this.q.r;
         int $$7 = ayn.a($$2);
         int $$8 = ayn.a($$3);
         int $$9 = ayn.a($$4);
         fbe $$10 = fbe.b();
         fax $$11 = null;
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         int $$12 = 5;
         if (fgi.N()) {
            $$12 = 10;
         }

         RenderSystem.depthMask(fgi.O());
         int $$13 = -1;
         float $$14 = (float)this.F + $$1;
         RenderSystem.setShader(gem::s);
         jd.a $$15 = new jd.a();

         for (int $$16 = $$9 - $$12; $$16 <= $$9 + $$12; $$16++) {
            for (int $$17 = $$7 - $$12; $$17 <= $$7 + $$12; $$17++) {
               int $$18 = ($$16 - $$9 + 16) * 32 + $$17 - $$7 + 16;
               double $$19 = (double)this.ar[$$18] * 0.5;
               double $$20 = (double)this.as[$$18] * 0.5;
               $$15.b((double)$$17, $$3, (double)$$16);
               ddu $$21 = $$6.t($$15).a();
               if ($$21.c()) {
                  int $$22 = $$6.a(dyv.a.e, $$17, $$16);
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
                     ayv $$26 = ayv.a((long)($$17 * $$17 * 3121 + $$17 * 45238971 ^ $$16 * $$16 * 418711 + $$16 * 13761));
                     $$15.d($$17, $$23, $$16);
                     ddu.c $$27 = $$21.a($$15);
                     if ($$27 == ddu.c.b) {
                        if ($$13 != 0) {
                           if ($$13 >= 0) {
                              fay.a($$11.b());
                           }

                           $$13 = 0;
                           RenderSystem.setShaderTexture(0, o);
                           $$11 = $$10.a(fbh.c.h, fba.d);
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
                        $$11.a((float)((double)$$17 - $$2 - $$19 + 0.5), (float)((double)$$24 - $$3), (float)((double)$$16 - $$4 - $$20 + 0.5))
                           .a(0.0F, (float)$$23 * 0.25F + $$32)
                           .a(1.0F, 1.0F, 1.0F, $$36)
                           .c($$37);
                        $$11.a((float)((double)$$17 - $$2 + $$19 + 0.5), (float)((double)$$24 - $$3), (float)((double)$$16 - $$4 + $$20 + 0.5))
                           .a(1.0F, (float)$$23 * 0.25F + $$32)
                           .a(1.0F, 1.0F, 1.0F, $$36)
                           .c($$37);
                        $$11.a((float)((double)$$17 - $$2 + $$19 + 0.5), (float)((double)$$23 - $$3), (float)((double)$$16 - $$4 + $$20 + 0.5))
                           .a(1.0F, (float)$$24 * 0.25F + $$32)
                           .a(1.0F, 1.0F, 1.0F, $$36)
                           .c($$37);
                        $$11.a((float)((double)$$17 - $$2 - $$19 + 0.5), (float)((double)$$23 - $$3), (float)((double)$$16 - $$4 - $$20 + 0.5))
                           .a(0.0F, (float)$$24 * 0.25F + $$32)
                           .a(1.0F, 1.0F, 1.0F, $$36)
                           .c($$37);
                     } else if ($$27 == ddu.c.c) {
                        if ($$13 != 1) {
                           if ($$13 >= 0) {
                              fay.a($$11.b());
                           }

                           $$13 = 1;
                           RenderSystem.setShaderTexture(0, p);
                           $$11 = $$10.a(fbh.c.h, fba.d);
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
                        $$11.a((float)((double)$$17 - $$2 - $$19 + 0.5), (float)((double)$$24 - $$3), (float)((double)$$16 - $$4 - $$20 + 0.5))
                           .a(0.0F + $$39, (float)$$23 * 0.25F + $$38 + $$40)
                           .a(1.0F, 1.0F, 1.0F, $$44)
                           .b($$49, $$48);
                        $$11.a((float)((double)$$17 - $$2 + $$19 + 0.5), (float)((double)$$24 - $$3), (float)((double)$$16 - $$4 + $$20 + 0.5))
                           .a(1.0F + $$39, (float)$$23 * 0.25F + $$38 + $$40)
                           .a(1.0F, 1.0F, 1.0F, $$44)
                           .b($$49, $$48);
                        $$11.a((float)((double)$$17 - $$2 + $$19 + 0.5), (float)((double)$$23 - $$3), (float)((double)$$16 - $$4 + $$20 + 0.5))
                           .a(1.0F + $$39, (float)$$24 * 0.25F + $$38 + $$40)
                           .a(1.0F, 1.0F, 1.0F, $$44)
                           .b($$49, $$48);
                        $$11.a((float)((double)$$17 - $$2 - $$19 + 0.5), (float)((double)$$23 - $$3), (float)((double)$$16 - $$4 - $$20 + 0.5))
                           .a(0.0F + $$39, (float)$$24 * 0.25F + $$38 + $$40)
                           .a(1.0F, 1.0F, 1.0F, $$44)
                           .b($$49, $$48);
                     }
                  }
               }
            }
         }

         if ($$13 >= 0) {
            fay.a($$11.b());
         }

         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         $$0.b();
      }
   }

   public void a(ffs $$0) {
      float $$1 = this.q.r.d(1.0F) / (fgi.N() ? 1.0F : 2.0F);
      if (!($$1 <= 0.0F)) {
         ayv $$2 = ayv.a((long)this.F * 312987231L);
         dcx $$3 = this.q.r;
         jd $$4 = jd.a((jw)$$0.b());
         jd $$5 = null;
         int $$6 = (int)(100.0F * $$1 * $$1) / (this.q.m.ar().c() == fgn.b ? 2 : 1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            int $$8 = $$2.a(21) - 10;
            int $$9 = $$2.a(21) - 10;
            jd $$10 = $$3.a(dyv.a.e, $$4.b($$8, 0, $$9));
            if ($$10.v() > $$3.I_() && $$10.v() <= $$4.v() + 10 && $$10.v() >= $$4.v() - 10) {
               ddu $$11 = $$3.t($$10).a();
               if ($$11.a($$10) == ddu.c.b) {
                  $$5 = $$10.d();
                  if (this.q.m.ar().c() == fgn.c) {
                     break;
                  }

                  double $$12 = $$2.j();
                  double $$13 = $$2.j();
                  dta $$14 = $$3.a_($$5);
                  eoy $$15 = $$3.b_($$5);
                  exp $$16 = $$14.k($$3, $$5);
                  double $$17 = $$16.b(ji.a.b, $$12, $$13);
                  double $$18 = (double)$$15.a($$3, $$5);
                  double $$19 = Math.max($$17, $$18);
                  lk $$20 = !$$15.a(awj.b) && !$$14.a(dfy.kJ) && !dgk.g($$14) ? lm.ad : lm.ae;
                  this.q.r.a($$20, (double)$$5.u() + $$12, (double)$$5.v() + $$19, (double)$$5.w() + $$13, 0.0, 0.0, 0.0);
               }
            }
         }

         if ($$5 != null && $$2.a(3) < this.aq++) {
            this.aq = 0;
            if ($$5.v() > $$4.v() + 1 && $$3.a(dyv.a.e, $$4).v() > ayn.d((float)$$4.v())) {
               this.q.r.a($$5, avo.Ce, avp.d, 0.1F, 0.5F, false);
            } else {
               this.q.r.a($$5, avo.Cd, avp.d, 0.2F, 1.0F, false);
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
   public void a(aud $$0) {
      this.a();
      if (fgi.O()) {
         this.y();
      }
   }

   public void a() {
      if (this.K != null) {
         this.K.close();
      }

      akq $$0 = akq.b("shaders/post/entity_outline.json");

      try {
         this.K = new gew(this.q.aa(), this.q.ab(), this.q.h(), $$0);
         this.K.a(this.q.aM().l(), this.q.aM().m());
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
      akq $$0 = akq.b("shaders/post/transparency.json");

      try {
         gew $$1 = new gew(this.q.aa(), this.q.ab(), this.q.h(), $$0);
         $$1.a(this.q.aM().l(), this.q.aM().m());
         ezp $$2 = $$1.a("translucent");
         ezp $$3 = $$1.a("itemEntity");
         ezp $$4 = $$1.a("particles");
         ezp $$5 = $$1.a("weather");
         ezp $$6 = $$1.a("clouds");
         this.Q = $$1;
         this.L = $$2;
         this.M = $$3;
         this.N = $$4;
         this.O = $$5;
         this.P = $$6;
      } catch (Exception var8) {
         String $$8 = var8 instanceof JsonSyntaxException ? "parse" : "load";
         String $$9 = "Failed to " + $$8 + " shader: " + $$0;
         ger.a $$10 = new ger.a($$9, var8);
         if (this.q.ac().d().size() > 1) {
            wy $$11 = this.q.ab().b().findFirst().map($$0x -> wy.b($$0x.b())).orElse(null);
            this.q.m.j().a(fgb.b);
            this.q.a($$10, $$11, null);
         } else {
            this.q.m.j().a(fgb.b);
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
         this.J.c(this.q.aM().l(), this.q.aM().m(), false);
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.q.j.a() && this.J != null && this.K != null && this.q.s != null;
   }

   private void A() {
      if (this.B != null) {
         this.B.close();
      }

      this.B = new fbf(fbf.a.a);
      this.B.a();
      this.B.a(a(fbe.b(), -16.0F));
      fbf.b();
   }

   private void B() {
      if (this.A != null) {
         this.A.close();
      }

      this.A = new fbf(fbf.a.a);
      this.A.a();
      this.A.a(a(fbe.b(), 16.0F));
      fbf.b();
   }

   private static fbb a(fbe $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      float $$3 = 512.0F;
      fax $$4 = $$0.a(fbh.c.g, fba.e);
      $$4.a(0.0F, $$1, 0.0F);

      for (int $$5 = -180; $$5 <= 180; $$5 += 45) {
         $$4.a($$2 * ayn.b((float)$$5 * (float) (Math.PI / 180.0)), $$1, 512.0F * ayn.a((float)$$5 * (float) (Math.PI / 180.0)));
      }

      return $$4.b();
   }

   private void C() {
      if (this.z != null) {
         this.z.close();
      }

      this.z = new fbf(fbf.a.a);
      this.z.a();
      this.z.a(this.a(fbe.b()));
      fbf.b();
   }

   private fbb a(fbe $$0) {
      ayv $$1 = ayv.a(10842L);
      int $$2 = 1500;
      float $$3 = 100.0F;
      fax $$4 = $$0.a(fbh.c.h, fba.e);

      for (int $$5 = 0; $$5 < 1500; $$5++) {
         float $$6 = $$1.i() * 2.0F - 1.0F;
         float $$7 = $$1.i() * 2.0F - 1.0F;
         float $$8 = $$1.i() * 2.0F - 1.0F;
         float $$9 = 0.15F + $$1.i() * 0.1F;
         float $$10 = ayn.k($$6, $$7, $$8);
         if (!($$10 <= 0.010000001F) && !($$10 >= 1.0F)) {
            Vector3f $$11 = new Vector3f($$6, $$7, $$8).normalize(100.0F);
            float $$12 = (float)($$1.j() * (float) Math.PI * 2.0);
            Quaternionf $$13 = new Quaternionf().rotateTo(new Vector3f(0.0F, 0.0F, -1.0F), $$11).rotateZ($$12);
            $$4.a($$11.add(new Vector3f($$9, -$$9, 0.0F).rotate($$13)));
            $$4.a($$11.add(new Vector3f($$9, $$9, 0.0F).rotate($$13)));
            $$4.a($$11.add(new Vector3f(-$$9, $$9, 0.0F).rotate($$13)));
            $$4.a($$11.add(new Vector3f(-$$9, -$$9, 0.0F).rotate($$13)));
         }
      }

      return $$4.b();
   }

   public void a(@Nullable fyz $$0) {
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
      if (fgi.O()) {
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
            this.ae = new ghu(this.u, this, ad.g(), this.t, this.q.ao(), this.q.aq());
         } else {
            this.ae.a(this.u);
         }

         this.C = true;
         geo.a(fgi.N());
         this.af = this.q.m.aD();
         if (this.y != null) {
            this.y.a();
         }

         this.ae.g();
         synchronized (this.x) {
            this.x.clear();
         }

         this.y = new gfk(this.ae, this.u, this.q.m.aD(), this);
         this.v.a(this.y);
         this.w.clear();
         bsq $$0 = this.q.an();
         if ($$0 != null) {
            this.y.a($$0.dv(), $$0.dB());
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

   public ghu h() {
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
         ghu.b $$1 = (ghu.b)var2.next();
         if (!$$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String l() {
      return "E: " + this.ag + "/" + this.u.h() + ", B: " + this.ah + ", SD: " + this.u.m();
   }

   private void a(ffs $$0, ghy $$1, boolean $$2, boolean $$3) {
      eww $$4 = $$0.b();
      if (this.q.m.aD() != this.af) {
         this.f();
      }

      this.u.ag().a("camera");
      double $$5 = this.q.s.dv();
      double $$6 = this.q.s.dx();
      double $$7 = this.q.s.dB();
      int $$8 = kf.a($$5);
      int $$9 = kf.a($$6);
      int $$10 = kf.a($$7);
      if (this.R != $$8 || this.S != $$9 || this.T != $$10) {
         this.R = $$8;
         this.S = $$9;
         this.T = $$10;
         this.y.a($$5, $$7);
      }

      this.ae.a($$4);
      this.u.ag().b("cull");
      this.q.aH().b("culling");
      jd $$11 = $$0.c();
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

         bsq.b(ayn.a((double)this.q.m.aD() / 8.0, 1.0, 2.5) * this.q.m.g().c());
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

   public static ghy a(ghy $$0) {
      return new ghy($$0).a(8);
   }

   private void b(ghy $$0) {
      if (!fgi.Q().bx()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.q.aH().a("apply_frustum");
         this.w.clear();
         this.v.a($$0, this.w);
         this.q.aH().c();
      }
   }

   public void a(ghu.b $$0) {
      this.v.a($$0);
   }

   private void a(Matrix4f $$0, Matrix4f $$1, double $$2, double $$3, double $$4, ghy $$5) {
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

   public void a(eww $$0, Matrix4f $$1, Matrix4f $$2) {
      this.ai = new ghy($$1, $$2);
      this.ai.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(ffz $$0, boolean $$1, ffs $$2, gem $$3, ges $$4, Matrix4f $$5, Matrix4f $$6) {
      brb $$7 = this.q.r.s();
      float $$8 = $$0.a(false);
      RenderSystem.setShaderGameTime(this.u.Z(), $$8);
      this.s.a(this.u, $$2, this.q.v);
      this.r.a(this.u, $$2, this.q.u);
      bne $$9 = this.u.ag();
      $$9.b("light_update_queue");
      this.u.b();
      $$9.b("light_updates");
      this.u.i().p().a();
      eww $$10 = $$2.b();
      double $$11 = $$10.a();
      double $$12 = $$10.b();
      double $$13 = $$10.c();
      $$9.b("culling");
      boolean $$14 = this.ak != null;
      ghy $$15;
      if ($$14) {
         $$15 = this.ak;
         $$15.a(this.am.x, this.am.y, this.am.z);
      } else {
         $$15 = this.ai;
      }

      this.q.aH().b("captureFrustum");
      if (this.aj) {
         this.a($$5, $$6, $$10.c, $$10.d, $$10.e, $$14 ? new ghy($$5, $$6) : $$15);
         this.aj = false;
      }

      $$9.b("clear");
      gel.a($$2, $$8, this.q.r, this.q.m.aD(), $$3.c($$8));
      gel.b();
      RenderSystem.clear(16640, fgi.a);
      float $$17 = $$3.k();
      boolean $$18 = this.q.r.d().a(ayn.a($$11), ayn.a($$12)) || this.q.l.j().d();
      $$9.b("sky");
      RenderSystem.setShader(gem::o);
      this.a($$5, $$6, $$8, $$2, $$18, () -> gel.a($$2, gel.d.a, $$17, $$18, $$8));
      $$9.b("fog");
      gel.a($$2, gel.d.b, Math.max($$17, 32.0F), $$18, $$8);
      $$9.b("terrain_setup");
      this.a($$2, $$15, $$14, this.q.s.N_());
      $$9.b("compile_sections");
      this.c($$2);
      $$9.b("terrain");
      this.a(gfb.c(), $$11, $$12, $$13, $$5, $$6);
      this.a(gfb.d(), $$11, $$12, $$13, $$5, $$6);
      this.a(gfb.e(), $$11, $$12, $$13, $$5, $$6);
      if (this.u.d().e()) {
         ezz.a();
      } else {
         ezz.b();
      }

      $$9.b("entities");
      this.ag = 0;
      this.ah = 0;
      if (this.M != null) {
         this.M.b(fgi.a);
         this.M.a(this.q.h());
         this.q.h().a(false);
      }

      if (this.O != null) {
         this.O.b(fgi.a);
      }

      if (this.d()) {
         this.J.b(fgi.a);
         this.q.h().a(false);
      }

      Matrix4fStack $$19 = RenderSystem.getModelViewStack();
      $$19.pushMatrix();
      $$19.mul($$5);
      RenderSystem.applyModelViewMatrix();
      boolean $$20 = false;
      fbc $$21 = new fbc();
      get.a $$22 = this.t.c();

      for (bsq $$23 : this.u.e()) {
         if (this.r.a($$23, $$15, $$11, $$12, $$13) || $$23.z(this.q.s)) {
            jd $$24 = $$23.dq();
            if ((this.u.d($$24.v()) || this.b($$24))
               && ($$23 != $$2.g() || $$2.i() || $$2.g() instanceof btl && ((btl)$$2.g()).fI())
               && (!($$23 instanceof gdv) || $$2.g() == $$23)) {
               this.ag++;
               if ($$23.ai == 0) {
                  $$23.ad = $$23.dv();
                  $$23.ae = $$23.dx();
                  $$23.af = $$23.dB();
               }

               get $$26;
               if (this.d() && this.q.b($$23)) {
                  $$20 = true;
                  geu $$25 = this.t.e();
                  $$26 = $$25;
                  int $$27 = $$23.q_();
                  $$25.a(axx.b.b($$27), axx.b.c($$27), axx.b.d($$27), 255);
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
      $$22.a(gfb.c(gqe.e));
      $$22.a(gfb.d(gqe.e));
      $$22.a(gfb.e(gqe.e));
      $$22.a(gfb.k(gqe.e));
      $$9.b("blockentities");
      ObjectListIterator var40 = this.w.iterator();

      while (var40.hasNext()) {
         ghu.b $$30 = (ghu.b)var40.next();
         List<dqf> $$31 = $$30.d().b();
         if (!$$31.isEmpty()) {
            for (dqf $$32 : $$31) {
               jd $$33 = $$32.az_();
               get $$34 = $$22;
               $$21.a();
               $$21.a((double)$$33.u() - $$11, (double)$$33.v() - $$12, (double)$$33.w() - $$13);
               SortedSet<apw> $$35 = (SortedSet<apw>)this.H.get($$33.a());
               if ($$35 != null && !$$35.isEmpty()) {
                  int $$36 = $$35.last().c();
                  if ($$36 >= 0) {
                     fbc.a $$37 = $$21.c();
                     fbg $$38 = new fbd(this.t.d().getBuffer(gsl.l.get($$36)), $$37, 1.0F);
                     $$34 = $$2x -> {
                        fbg $$3x = $$22.getBuffer($$2x);
                        return $$2x.L() ? fbj.a($$38, $$3x) : $$3x;
                     };
                  }
               }

               this.s.a($$32, $$8, $$21, $$34);
               $$21.b();
            }
         }
      }

      synchronized (this.x) {
         for (dqf $$39 : this.x) {
            jd $$40 = $$39.az_();
            $$21.a();
            $$21.a((double)$$40.u() - $$11, (double)$$40.v() - $$12, (double)$$40.w() - $$13);
            this.s.a($$39, $$8, $$21, $$22);
            $$21.b();
         }
      }

      this.a($$21);
      $$22.a(gfb.c());
      $$22.a(gfb.s());
      $$22.a(gfb.t());
      $$22.a(gfi.h());
      $$22.a(gfi.i());
      $$22.a(gfi.c());
      $$22.a(gfi.d());
      $$22.a(gfi.e());
      $$22.a(gfi.f());
      $$22.a(gfi.g());
      this.t.e().a();
      if ($$20) {
         this.K.a($$0.a());
         this.q.h().a(false);
      }

      $$9.b("destroyProgress");
      ObjectIterator var42 = this.H.long2ObjectEntrySet().iterator();

      while (var42.hasNext()) {
         Entry<SortedSet<apw>> $$41 = (Entry<SortedSet<apw>>)var42.next();
         jd $$42 = jd.d($$41.getLongKey());
         double $$43 = (double)$$42.u() - $$11;
         double $$44 = (double)$$42.v() - $$12;
         double $$45 = (double)$$42.w() - $$13;
         if (!($$43 * $$43 + $$44 * $$44 + $$45 * $$45 > 1024.0)) {
            SortedSet<apw> $$46 = (SortedSet<apw>)$$41.getValue();
            if ($$46 != null && !$$46.isEmpty()) {
               int $$47 = $$46.last().c();
               $$21.a();
               $$21.a((double)$$42.u() - $$11, (double)$$42.v() - $$12, (double)$$42.w() - $$13);
               fbc.a $$48 = $$21.c();
               fbg $$49 = new fbd(this.t.d().getBuffer(gsl.l.get($$47)), $$48, 1.0F);
               this.q.ao().a(this.u.a_($$42), $$42, this.u, $$21, $$49);
               $$21.b();
            }
         }
      }

      this.a($$21);
      ewu $$50 = this.q.v;
      if ($$1 && $$50 != null && $$50.c() == ewu.a.b) {
         $$9.b("outline");
         jd $$51 = ((ews)$$50).a();
         dta $$52 = this.u.a_($$51);
         if (!$$52.i() && this.u.C_().a($$51)) {
            fbg $$53 = $$22.getBuffer(gfb.w());
            this.a($$21, $$53, $$2.g(), $$11, $$12, $$13, $$51, $$52);
         }
      }

      this.q.k.a($$21, $$22, $$11, $$12, $$13);
      $$22.a();
      $$22.a(gfi.k());
      $$22.a(gfi.a());
      $$22.a(gfi.b());
      $$22.a(gfb.j());
      $$22.a(gfb.l());
      $$22.a(gfb.k());
      $$22.a(gfb.m());
      $$22.a(gfb.n());
      $$22.a(gfb.i());
      this.t.d().b();
      if (this.Q != null) {
         $$22.a(gfb.w());
         $$22.b();
         this.L.b(fgi.a);
         this.L.a(this.q.h());
         $$9.b("translucent");
         this.a(gfb.f(), $$11, $$12, $$13, $$5, $$6);
         $$9.b("string");
         this.a(gfb.r(), $$11, $$12, $$13, $$5, $$6);
         this.N.b(fgi.a);
         this.N.a(this.q.h());
         gfa.aJ.a();
         $$9.b("particles");
         this.q.g.a($$4, $$2, $$8);
         gfa.aJ.b();
      } else {
         $$9.b("translucent");
         if (this.L != null) {
            this.L.b(fgi.a);
         }

         this.a(gfb.f(), $$11, $$12, $$13, $$5, $$6);
         $$22.a(gfb.w());
         $$22.b();
         $$9.b("string");
         this.a(gfb.r(), $$11, $$12, $$13, $$5, $$6);
         $$9.b("particles");
         this.q.g.a($$4, $$2, $$8);
      }

      if (this.q.m.ay() != ffv.a) {
         if (this.Q != null) {
            this.P.b(fgi.a);
         }

         $$9.b("clouds");
         this.a($$21, $$5, $$6, $$8, $$11, $$12, $$13);
      }

      if (this.Q != null) {
         gfa.aK.a();
         $$9.b("weather");
         this.a($$4, $$8, $$11, $$12, $$13);
         this.d($$2);
         gfa.aK.b();
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
      gel.a();
   }

   private void a(fbc $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bsq $$0, double $$1, double $$2, double $$3, float $$4, fbc $$5, get $$6) {
      double $$7 = ayn.d((double)$$4, $$0.ad, $$0.dv());
      double $$8 = ayn.d((double)$$4, $$0.ae, $$0.dx());
      double $$9 = ayn.d((double)$$4, $$0.af, $$0.dB());
      float $$10 = ayn.i($$4, $$0.O, $$0.dG());
      this.r.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$10, $$4, $$5, $$6, this.r.a($$0, $$4));
   }

   private void a(gfb $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      $$0.a();
      if ($$0 == gfb.f()) {
         this.q.aH().a("translucent_sort");
         double $$6 = $$1 - this.an;
         double $$7 = $$2 - this.ao;
         double $$8 = $$3 - this.ap;
         if ($$6 * $$6 + $$7 * $$7 + $$8 * $$8 > 1.0) {
            int $$9 = kf.a($$1);
            int $$10 = kf.a($$2);
            int $$11 = kf.a($$3);
            boolean $$12 = $$9 != kf.a(this.an) || $$11 != kf.a(this.ap) || $$10 != kf.a(this.ao);
            this.an = $$1;
            this.ao = $$2;
            this.ap = $$3;
            int $$13 = 0;
            ObjectListIterator var21 = this.w.iterator();

            while (var21.hasNext()) {
               ghu.b $$14 = (ghu.b)var21.next();
               if ($$13 < 15 && ($$12 || $$14.b($$9, $$10, $$11)) && $$14.a($$0, this.ae)) {
                  $$13++;
               }
            }
         }

         this.q.aH().c();
      }

      this.q.aH().a("filterempty");
      this.q.aH().b(() -> "render_" + $$0);
      boolean $$15 = $$0 != gfb.f();
      ObjectListIterator<ghu.b> $$16 = this.w.listIterator($$15 ? 0 : this.w.size());
      gfh $$17 = RenderSystem.getShader();
      $$17.a(fbh.c.h, $$4, $$5, this.q.aM());
      $$17.g();
      fat $$18 = $$17.p;

      while ($$15 ? $$16.hasNext() : $$16.hasPrevious()) {
         ghu.b $$19 = $$15 ? (ghu.b)$$16.next() : (ghu.b)$$16.previous();
         if (!$$19.d().a($$0)) {
            fbf $$20 = $$19.a($$0);
            jd $$21 = $$19.f();
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
      this.q.aH().c();
      $$0.b();
   }

   private void a(fbc $$0, get $$1, ffs $$2) {
      if (this.q.B || this.q.C) {
         double $$3 = $$2.b().a();
         double $$4 = $$2.b().b();
         double $$5 = $$2.b().c();
         ObjectListIterator var10 = this.w.iterator();

         while (var10.hasNext()) {
            ghu.b $$6 = (ghu.b)var10.next();
            gfg.d $$7 = this.v.b($$6);
            if ($$7 != null) {
               jd $$8 = $$6.f();
               $$0.a();
               $$0.a((double)$$8.u() - $$3, (double)$$8.v() - $$4, (double)$$8.w() - $$5);
               Matrix4f $$9 = $$0.c().a();
               if (this.q.B) {
                  fbg $$10 = $$1.getBuffer(gfb.w());
                  int $$11 = $$7.b == 0 ? 0 : ayn.h((float)$$7.b / 50.0F, 0.9F, 0.9F);
                  int $$12 = $$11 >> 16 & 0xFF;
                  int $$13 = $$11 >> 8 & 0xFF;
                  int $$14 = $$11 & 0xFF;

                  for (int $$15 = 0; $$15 < d.length; $$15++) {
                     if ($$7.a($$15)) {
                        ji $$16 = d[$$15];
                        $$10.a($$9, 8.0F, 8.0F, 8.0F).a($$12, $$13, $$14, 255).b((float)$$16.j(), (float)$$16.k(), (float)$$16.l());
                        $$10.a($$9, (float)(8 - 16 * $$16.j()), (float)(8 - 16 * $$16.k()), (float)(8 - 16 * $$16.l()))
                           .a($$12, $$13, $$14, 255)
                           .b((float)$$16.j(), (float)$$16.k(), (float)$$16.l());
                     }
                  }
               }

               if (this.q.C && !$$6.d().a()) {
                  fbg $$17 = $$1.getBuffer(gfb.w());
                  int $$18 = 0;

                  for (ji $$19 : d) {
                     for (ji $$20 : d) {
                        boolean $$21 = $$6.d().a($$19, $$20);
                        if (!$$21) {
                           $$18++;
                           $$17.a($$9, (float)(8 + 8 * $$19.j()), (float)(8 + 8 * $$19.k()), (float)(8 + 8 * $$19.l()))
                              .a(255, 0, 0, 255)
                              .b((float)$$19.j(), (float)$$19.k(), (float)$$19.l());
                           $$17.a($$9, (float)(8 + 8 * $$20.j()), (float)(8 + 8 * $$20.k()), (float)(8 + 8 * $$20.l()))
                              .a(255, 0, 0, 255)
                              .b((float)$$20.j(), (float)$$20.k(), (float)$$20.l());
                        }
                     }
                  }

                  if ($$18 > 0) {
                     fbg $$22 = $$1.getBuffer(gfb.z());
                     float $$23 = 0.5F;
                     float $$24 = 0.2F;
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 0.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 15.5F, 0.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 15.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 15.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
                     $$22.a($$9, 0.5F, 0.5F, 15.5F).a(0.9F, 0.9F, 0.0F, 0.2F);
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
         fbg $$26 = $$1.getBuffer(gfb.z());
         this.a($$26, $$25, 0, 1, 2, 3, 0, 1, 1);
         this.a($$26, $$25, 4, 5, 6, 7, 1, 0, 0);
         this.a($$26, $$25, 0, 1, 5, 4, 1, 1, 0);
         this.a($$26, $$25, 2, 3, 7, 6, 0, 0, 1);
         this.a($$26, $$25, 0, 4, 7, 3, 0, 1, 0);
         this.a($$26, $$25, 1, 5, 6, 2, 1, 0, 1);
         fbg $$27 = $$1.getBuffer(gfb.w());
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
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a(-16777216).b(0.0F, 0.0F, -1.0F);
   }

   private void a(fbg $$0, Matrix4f $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      float $$9 = 0.25F;
      $$0.a($$1, this.al[$$2].x(), this.al[$$2].y(), this.al[$$2].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F);
      $$0.a($$1, this.al[$$3].x(), this.al[$$3].y(), this.al[$$3].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F);
      $$0.a($$1, this.al[$$4].x(), this.al[$$4].y(), this.al[$$4].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F);
      $$0.a($$1, this.al[$$5].x(), this.al[$$5].y(), this.al[$$5].z()).a((float)$$6, (float)$$7, (float)$$8, 0.25F);
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
         Iterator<apw> $$0 = this.G.values().iterator();

         while ($$0.hasNext()) {
            apw $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.F - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(apw $$0) {
      long $$1 = $$0.b().a();
      Set<apw> $$2 = (Set<apw>)this.H.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.H.remove($$1);
      }
   }

   private void b(fbc $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(gem::r);
      RenderSystem.setShaderTexture(0, m);
      fbe $$1 = fbe.b();

      for (int $$2 = 0; $$2 < 6; $$2++) {
         $$0.a();
         if ($$2 == 1) {
            $$0.a(a.b.rotationDegrees(90.0F));
         }

         if ($$2 == 2) {
            $$0.a(a.b.rotationDegrees(-90.0F));
         }

         if ($$2 == 3) {
            $$0.a(a.b.rotationDegrees(180.0F));
         }

         if ($$2 == 4) {
            $$0.a(a.f.rotationDegrees(90.0F));
         }

         if ($$2 == 5) {
            $$0.a(a.f.rotationDegrees(-90.0F));
         }

         Matrix4f $$3 = $$0.c().a();
         fax $$4 = $$1.a(fbh.c.h, fba.j);
         $$4.a($$3, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(-14145496);
         $$4.a($$3, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(-14145496);
         $$4.a($$3, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(-14145496);
         $$4.a($$3, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(-14145496);
         fay.a($$4.b());
         $$0.b();
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
   }

   public void a(Matrix4f $$0, Matrix4f $$1, float $$2, ffs $$3, boolean $$4, Runnable $$5) {
      $$5.run();
      if (!$$4) {
         epa $$6 = $$3.k();
         if ($$6 != epa.c && $$6 != epa.a && !this.b($$3)) {
            fbc $$7 = new fbc();
            $$7.a($$0);
            if (this.q.r.d().c() == gei.d.c) {
               this.b($$7);
            } else if (this.q.r.d().c() == gei.d.b) {
               eww $$8 = this.u.a(this.q.j.l().b(), $$2);
               float $$9 = (float)$$8.c;
               float $$10 = (float)$$8.d;
               float $$11 = (float)$$8.e;
               gel.b();
               fbe $$12 = fbe.b();
               RenderSystem.depthMask(false);
               RenderSystem.setShaderColor($$9, $$10, $$11, 1.0F);
               gfh $$13 = RenderSystem.getShader();
               this.A.a();
               this.A.a($$7.c().a(), $$1, $$13);
               fbf.b();
               RenderSystem.enableBlend();
               float[] $$14 = this.u.d().a(this.u.f($$2), $$2);
               if ($$14 != null) {
                  RenderSystem.setShader(gem::p);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  $$7.a();
                  $$7.a(a.b.rotationDegrees(90.0F));
                  float $$15 = ayn.a(this.u.a($$2)) < 0.0F ? 180.0F : 0.0F;
                  $$7.a(a.f.rotationDegrees($$15));
                  $$7.a(a.f.rotationDegrees(90.0F));
                  float $$16 = $$14[0];
                  float $$17 = $$14[1];
                  float $$18 = $$14[2];
                  Matrix4f $$19 = $$7.c().a();
                  fax $$20 = $$12.a(fbh.c.g, fba.f);
                  $$20.a($$19, 0.0F, 100.0F, 0.0F).a($$16, $$17, $$18, $$14[3]);
                  int $$21 = 16;

                  for (int $$22 = 0; $$22 <= 16; $$22++) {
                     float $$23 = (float)$$22 * (float) (Math.PI * 2) / 16.0F;
                     float $$24 = ayn.a($$23);
                     float $$25 = ayn.b($$23);
                     $$20.a($$19, $$24 * 120.0F, $$25 * 120.0F, -$$25 * 40.0F * $$14[3]).a($$14[0], $$14[1], $$14[2], 0.0F);
                  }

                  fay.a($$20.b());
                  $$7.b();
               }

               RenderSystem.blendFuncSeparate(
                  GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
               );
               $$7.a();
               float $$26 = 1.0F - this.u.d($$2);
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$26);
               $$7.a(a.d.rotationDegrees(-90.0F));
               $$7.a(a.b.rotationDegrees(this.u.f($$2) * 360.0F));
               Matrix4f $$27 = $$7.c().a();
               float $$28 = 30.0F;
               RenderSystem.setShader(gem::q);
               RenderSystem.setShaderTexture(0, l);
               fax $$29 = $$12.a(fbh.c.h, fba.i);
               $$29.a($$27, -$$28, 100.0F, -$$28).a(0.0F, 0.0F);
               $$29.a($$27, $$28, 100.0F, -$$28).a(1.0F, 0.0F);
               $$29.a($$27, $$28, 100.0F, $$28).a(1.0F, 1.0F);
               $$29.a($$27, -$$28, 100.0F, $$28).a(0.0F, 1.0F);
               fay.a($$29.b());
               $$28 = 20.0F;
               RenderSystem.setShaderTexture(0, k);
               int $$30 = this.u.ar();
               int $$31 = $$30 % 4;
               int $$32 = $$30 / 4 % 2;
               float $$33 = (float)($$31 + 0) / 4.0F;
               float $$34 = (float)($$32 + 0) / 2.0F;
               float $$35 = (float)($$31 + 1) / 4.0F;
               float $$36 = (float)($$32 + 1) / 2.0F;
               $$29 = $$12.a(fbh.c.h, fba.i);
               $$29.a($$27, -$$28, -100.0F, $$28).a($$35, $$36);
               $$29.a($$27, $$28, -100.0F, $$28).a($$33, $$36);
               $$29.a($$27, $$28, -100.0F, -$$28).a($$33, $$34);
               $$29.a($$27, -$$28, -100.0F, -$$28).a($$35, $$34);
               fay.a($$29.b());
               float $$37 = this.u.i($$2) * $$26;
               if ($$37 > 0.0F) {
                  RenderSystem.setShaderColor($$37, $$37, $$37, $$37);
                  gel.a();
                  this.z.a();
                  this.z.a($$7.c().a(), $$1, gem.o());
                  fbf.b();
                  $$5.run();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.disableBlend();
               RenderSystem.defaultBlendFunc();
               $$7.b();
               RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
               double $$38 = this.q.s.k($$2).d - this.u.k().a(this.u);
               if ($$38 < 0.0) {
                  $$7.a();
                  $$7.a(0.0F, 12.0F, 0.0F);
                  this.B.a();
                  this.B.a($$7.c().a(), $$1, $$13);
                  fbf.b();
                  $$7.b();
               }

               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.depthMask(true);
            }
         }
      }
   }

   private boolean b(ffs $$0) {
      return !($$0.g() instanceof btl $$1) ? false : $$1.b(bsa.o) || $$1.b(bsa.G);
   }

   public void a(fbc $$0, Matrix4f $$1, Matrix4f $$2, float $$3, double $$4, double $$5, double $$6) {
      float $$7 = this.u.d().a();
      if (!Float.isNaN($$7)) {
         float $$8 = 12.0F;
         float $$9 = 4.0F;
         double $$10 = 2.0E-4;
         double $$11 = (double)(((float)this.F + $$3) * 0.03F);
         double $$12 = ($$4 + $$11) / 12.0;
         double $$13 = (double)($$7 - (float)$$5 + 0.33F);
         double $$14 = $$6 / 12.0 + 0.33F;
         $$12 -= (double)(ayn.a($$12 / 2048.0) * 2048);
         $$14 -= (double)(ayn.a($$14 / 2048.0) * 2048);
         float $$15 = (float)($$12 - (double)ayn.a($$12));
         float $$16 = (float)($$13 / 4.0 - (double)ayn.a($$13 / 4.0)) * 4.0F;
         float $$17 = (float)($$14 - (double)ayn.a($$14));
         eww $$18 = this.u.h($$3);
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
            if (this.D != null) {
               this.D.close();
            }

            this.D = new fbf(fbf.a.a);
            this.D.a();
            this.D.a(this.a(fbe.b(), $$12, $$13, $$14, $$18));
            fbf.b();
         }

         gel.b();
         $$0.a();
         $$0.a($$1);
         $$0.b(12.0F, 1.0F, 12.0F);
         $$0.a(-$$15, $$16, -$$17);
         if (this.D != null) {
            this.D.a();
            int $$22 = this.ad == ffv.c ? 0 : 1;

            for (int $$23 = $$22; $$23 < 2; $$23++) {
               gfb $$24 = $$23 == 0 ? gfb.v() : gfb.u();
               $$24.a();
               gfh $$25 = RenderSystem.getShader();
               this.D.a($$0.c().a(), $$2, $$25);
               $$24.b();
            }

            fbf.b();
         }

         $$0.b();
      }
   }

   private fbb a(fbe $$0, double $$1, double $$2, double $$3, eww $$4) {
      float $$5 = 4.0F;
      float $$6 = 0.00390625F;
      int $$7 = 8;
      int $$8 = 4;
      float $$9 = 9.765625E-4F;
      float $$10 = (float)ayn.a($$1) * 0.00390625F;
      float $$11 = (float)ayn.a($$3) * 0.00390625F;
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
      fax $$24 = $$0.a(fbh.c.h, fba.m);
      float $$25 = (float)Math.floor($$2 / 4.0) * 4.0F;
      if (this.ad == ffv.c) {
         for (int $$26 = -3; $$26 <= 4; $$26++) {
            for (int $$27 = -3; $$27 <= 4; $$27++) {
               float $$28 = (float)($$26 * 8);
               float $$29 = (float)($$27 * 8);
               if ($$25 > -5.0F) {
                  $$24.a($$28 + 0.0F, $$25 + 0.0F, $$29 + 8.0F)
                     .a(($$28 + 0.0F) * 0.00390625F + $$10, ($$29 + 8.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .b(0.0F, -1.0F, 0.0F);
                  $$24.a($$28 + 8.0F, $$25 + 0.0F, $$29 + 8.0F)
                     .a(($$28 + 8.0F) * 0.00390625F + $$10, ($$29 + 8.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .b(0.0F, -1.0F, 0.0F);
                  $$24.a($$28 + 8.0F, $$25 + 0.0F, $$29 + 0.0F)
                     .a(($$28 + 8.0F) * 0.00390625F + $$10, ($$29 + 0.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .b(0.0F, -1.0F, 0.0F);
                  $$24.a($$28 + 0.0F, $$25 + 0.0F, $$29 + 0.0F)
                     .a(($$28 + 0.0F) * 0.00390625F + $$10, ($$29 + 0.0F) * 0.00390625F + $$11)
                     .a($$18, $$19, $$20, 0.8F)
                     .b(0.0F, -1.0F, 0.0F);
               }

               if ($$25 <= 5.0F) {
                  $$24.a($$28 + 0.0F, $$25 + 4.0F - 9.765625E-4F, $$29 + 8.0F)
                     .a(($$28 + 0.0F) * 0.00390625F + $$10, ($$29 + 8.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .b(0.0F, 1.0F, 0.0F);
                  $$24.a($$28 + 8.0F, $$25 + 4.0F - 9.765625E-4F, $$29 + 8.0F)
                     .a(($$28 + 8.0F) * 0.00390625F + $$10, ($$29 + 8.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .b(0.0F, 1.0F, 0.0F);
                  $$24.a($$28 + 8.0F, $$25 + 4.0F - 9.765625E-4F, $$29 + 0.0F)
                     .a(($$28 + 8.0F) * 0.00390625F + $$10, ($$29 + 0.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .b(0.0F, 1.0F, 0.0F);
                  $$24.a($$28 + 0.0F, $$25 + 4.0F - 9.765625E-4F, $$29 + 0.0F)
                     .a(($$28 + 0.0F) * 0.00390625F + $$10, ($$29 + 0.0F) * 0.00390625F + $$11)
                     .a($$12, $$13, $$14, 0.8F)
                     .b(0.0F, 1.0F, 0.0F);
               }

               if ($$26 > -1) {
                  for (int $$30 = 0; $$30 < 8; $$30++) {
                     $$24.a($$28 + (float)$$30 + 0.0F, $$25 + 0.0F, $$29 + 8.0F)
                        .a(($$28 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$29 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .b(-1.0F, 0.0F, 0.0F);
                     $$24.a($$28 + (float)$$30 + 0.0F, $$25 + 4.0F, $$29 + 8.0F)
                        .a(($$28 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$29 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .b(-1.0F, 0.0F, 0.0F);
                     $$24.a($$28 + (float)$$30 + 0.0F, $$25 + 4.0F, $$29 + 0.0F)
                        .a(($$28 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$29 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .b(-1.0F, 0.0F, 0.0F);
                     $$24.a($$28 + (float)$$30 + 0.0F, $$25 + 0.0F, $$29 + 0.0F)
                        .a(($$28 + (float)$$30 + 0.5F) * 0.00390625F + $$10, ($$29 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .b(-1.0F, 0.0F, 0.0F);
                  }
               }

               if ($$26 <= 1) {
                  for (int $$31 = 0; $$31 < 8; $$31++) {
                     $$24.a($$28 + (float)$$31 + 1.0F - 9.765625E-4F, $$25 + 0.0F, $$29 + 8.0F)
                        .a(($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$10, ($$29 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .b(1.0F, 0.0F, 0.0F);
                     $$24.a($$28 + (float)$$31 + 1.0F - 9.765625E-4F, $$25 + 4.0F, $$29 + 8.0F)
                        .a(($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$10, ($$29 + 8.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .b(1.0F, 0.0F, 0.0F);
                     $$24.a($$28 + (float)$$31 + 1.0F - 9.765625E-4F, $$25 + 4.0F, $$29 + 0.0F)
                        .a(($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$10, ($$29 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .b(1.0F, 0.0F, 0.0F);
                     $$24.a($$28 + (float)$$31 + 1.0F - 9.765625E-4F, $$25 + 0.0F, $$29 + 0.0F)
                        .a(($$28 + (float)$$31 + 0.5F) * 0.00390625F + $$10, ($$29 + 0.0F) * 0.00390625F + $$11)
                        .a($$15, $$16, $$17, 0.8F)
                        .b(1.0F, 0.0F, 0.0F);
                  }
               }

               if ($$27 > -1) {
                  for (int $$32 = 0; $$32 < 8; $$32++) {
                     $$24.a($$28 + 0.0F, $$25 + 4.0F, $$29 + (float)$$32 + 0.0F)
                        .a(($$28 + 0.0F) * 0.00390625F + $$10, ($$29 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .b(0.0F, 0.0F, -1.0F);
                     $$24.a($$28 + 8.0F, $$25 + 4.0F, $$29 + (float)$$32 + 0.0F)
                        .a(($$28 + 8.0F) * 0.00390625F + $$10, ($$29 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .b(0.0F, 0.0F, -1.0F);
                     $$24.a($$28 + 8.0F, $$25 + 0.0F, $$29 + (float)$$32 + 0.0F)
                        .a(($$28 + 8.0F) * 0.00390625F + $$10, ($$29 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .b(0.0F, 0.0F, -1.0F);
                     $$24.a($$28 + 0.0F, $$25 + 0.0F, $$29 + (float)$$32 + 0.0F)
                        .a(($$28 + 0.0F) * 0.00390625F + $$10, ($$29 + (float)$$32 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .b(0.0F, 0.0F, -1.0F);
                  }
               }

               if ($$27 <= 1) {
                  for (int $$33 = 0; $$33 < 8; $$33++) {
                     $$24.a($$28 + 0.0F, $$25 + 4.0F, $$29 + (float)$$33 + 1.0F - 9.765625E-4F)
                        .a(($$28 + 0.0F) * 0.00390625F + $$10, ($$29 + (float)$$33 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .b(0.0F, 0.0F, 1.0F);
                     $$24.a($$28 + 8.0F, $$25 + 4.0F, $$29 + (float)$$33 + 1.0F - 9.765625E-4F)
                        .a(($$28 + 8.0F) * 0.00390625F + $$10, ($$29 + (float)$$33 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .b(0.0F, 0.0F, 1.0F);
                     $$24.a($$28 + 8.0F, $$25 + 0.0F, $$29 + (float)$$33 + 1.0F - 9.765625E-4F)
                        .a(($$28 + 8.0F) * 0.00390625F + $$10, ($$29 + (float)$$33 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .b(0.0F, 0.0F, 1.0F);
                     $$24.a($$28 + 0.0F, $$25 + 0.0F, $$29 + (float)$$33 + 1.0F - 9.765625E-4F)
                        .a(($$28 + 0.0F) * 0.00390625F + $$10, ($$29 + (float)$$33 + 0.5F) * 0.00390625F + $$11)
                        .a($$21, $$22, $$23, 0.8F)
                        .b(0.0F, 0.0F, 1.0F);
                  }
               }
            }
         }
      } else {
         int $$34 = 1;
         int $$35 = 32;

         for (int $$36 = -32; $$36 < 32; $$36 += 32) {
            for (int $$37 = -32; $$37 < 32; $$37 += 32) {
               $$24.a((float)($$36 + 0), $$25, (float)($$37 + 32))
                  .a((float)($$36 + 0) * 0.00390625F + $$10, (float)($$37 + 32) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .b(0.0F, -1.0F, 0.0F);
               $$24.a((float)($$36 + 32), $$25, (float)($$37 + 32))
                  .a((float)($$36 + 32) * 0.00390625F + $$10, (float)($$37 + 32) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .b(0.0F, -1.0F, 0.0F);
               $$24.a((float)($$36 + 32), $$25, (float)($$37 + 0))
                  .a((float)($$36 + 32) * 0.00390625F + $$10, (float)($$37 + 0) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .b(0.0F, -1.0F, 0.0F);
               $$24.a((float)($$36 + 0), $$25, (float)($$37 + 0))
                  .a((float)($$36 + 0) * 0.00390625F + $$10, (float)($$37 + 0) * 0.00390625F + $$11)
                  .a($$12, $$13, $$14, 0.8F)
                  .b(0.0F, -1.0F, 0.0F);
            }
         }
      }

      return $$24.b();
   }

   private void c(ffs $$0) {
      this.q.aH().a("populate_sections_to_compile");
      eon $$1 = this.u.y_();
      ghs $$2 = new ghs();
      jd $$3 = $$0.c();
      List<ghu.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.w.iterator();

      while (var6.hasNext()) {
         ghu.b $$5 = (ghu.b)var6.next();
         kf $$6 = kf.a($$5.f());
         if ($$5.h() && $$1.a($$6)) {
            boolean $$7 = false;
            if (this.q.m.l().c() == fgp.c) {
               jd $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.i();
            } else if (this.q.m.l().c() == fgp.b) {
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

      for (ghu.b $$9 : $$4) {
         $$9.a(this.ae, $$2);
         $$9.g();
      }

      this.q.aH().c();
   }

   private void d(ffs $$0) {
      dur $$1 = this.u.C_();
      double $$2 = (double)(this.q.m.aD() * 16);
      if (!($$0.b().c < $$1.g() - $$2) || !($$0.b().c > $$1.e() + $$2) || !($$0.b().e < $$1.h() - $$2) || !($$0.b().e > $$1.f() + $$2)) {
         double $$3 = 1.0 - $$1.b($$0.b().c, $$0.b().e) / $$2;
         $$3 = Math.pow($$3, 4.0);
         $$3 = ayn.a($$3, 0.0, 1.0);
         double $$4 = $$0.b().c;
         double $$5 = $$0.b().e;
         double $$6 = (double)this.q.j.g();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
         RenderSystem.setShaderTexture(0, n);
         RenderSystem.depthMask(fgi.O());
         int $$7 = $$1.d().a();
         float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
         float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
         float $$10 = (float)($$7 & 0xFF) / 255.0F;
         RenderSystem.setShaderColor($$8, $$9, $$10, (float)$$3);
         RenderSystem.setShader(gem::q);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.disableCull();
         float $$11 = (float)(ad.c() % 3000L) / 3000.0F;
         float $$12 = (float)(-ayn.e($$0.b().d * 0.5));
         float $$13 = $$12 + (float)$$6;
         fax $$14 = fbe.b().a(fbh.c.h, fba.i);
         double $$15 = Math.max((double)ayn.a($$5 - $$2), $$1.f());
         double $$16 = Math.min((double)ayn.c($$5 + $$2), $$1.h());
         float $$17 = (float)(ayn.a($$15) & 1) * 0.5F;
         if ($$4 > $$1.g() - $$2) {
            float $$18 = $$17;

            for (double $$19 = $$15; $$19 < $$16; $$18 += 0.5F) {
               double $$20 = Math.min(1.0, $$16 - $$19);
               float $$21 = (float)$$20 * 0.5F;
               $$14.a((float)($$1.g() - $$4), (float)(-$$6), (float)($$19 - $$5)).a($$11 - $$18, $$11 + $$13);
               $$14.a((float)($$1.g() - $$4), (float)(-$$6), (float)($$19 + $$20 - $$5)).a($$11 - ($$21 + $$18), $$11 + $$13);
               $$14.a((float)($$1.g() - $$4), (float)$$6, (float)($$19 + $$20 - $$5)).a($$11 - ($$21 + $$18), $$11 + $$12);
               $$14.a((float)($$1.g() - $$4), (float)$$6, (float)($$19 - $$5)).a($$11 - $$18, $$11 + $$12);
               $$19++;
            }
         }

         if ($$4 < $$1.e() + $$2) {
            float $$22 = $$17;

            for (double $$23 = $$15; $$23 < $$16; $$22 += 0.5F) {
               double $$24 = Math.min(1.0, $$16 - $$23);
               float $$25 = (float)$$24 * 0.5F;
               $$14.a((float)($$1.e() - $$4), (float)(-$$6), (float)($$23 - $$5)).a($$11 + $$22, $$11 + $$13);
               $$14.a((float)($$1.e() - $$4), (float)(-$$6), (float)($$23 + $$24 - $$5)).a($$11 + $$25 + $$22, $$11 + $$13);
               $$14.a((float)($$1.e() - $$4), (float)$$6, (float)($$23 + $$24 - $$5)).a($$11 + $$25 + $$22, $$11 + $$12);
               $$14.a((float)($$1.e() - $$4), (float)$$6, (float)($$23 - $$5)).a($$11 + $$22, $$11 + $$12);
               $$23++;
            }
         }

         $$15 = Math.max((double)ayn.a($$4 - $$2), $$1.e());
         $$16 = Math.min((double)ayn.c($$4 + $$2), $$1.g());
         $$17 = (float)(ayn.a($$15) & 1) * 0.5F;
         if ($$5 > $$1.h() - $$2) {
            float $$26 = $$17;

            for (double $$27 = $$15; $$27 < $$16; $$26 += 0.5F) {
               double $$28 = Math.min(1.0, $$16 - $$27);
               float $$29 = (float)$$28 * 0.5F;
               $$14.a((float)($$27 - $$4), (float)(-$$6), (float)($$1.h() - $$5)).a($$11 + $$26, $$11 + $$13);
               $$14.a((float)($$27 + $$28 - $$4), (float)(-$$6), (float)($$1.h() - $$5)).a($$11 + $$29 + $$26, $$11 + $$13);
               $$14.a((float)($$27 + $$28 - $$4), (float)$$6, (float)($$1.h() - $$5)).a($$11 + $$29 + $$26, $$11 + $$12);
               $$14.a((float)($$27 - $$4), (float)$$6, (float)($$1.h() - $$5)).a($$11 + $$26, $$11 + $$12);
               $$27++;
            }
         }

         if ($$5 < $$1.f() + $$2) {
            float $$30 = $$17;

            for (double $$31 = $$15; $$31 < $$16; $$30 += 0.5F) {
               double $$32 = Math.min(1.0, $$16 - $$31);
               float $$33 = (float)$$32 * 0.5F;
               $$14.a((float)($$31 - $$4), (float)(-$$6), (float)($$1.f() - $$5)).a($$11 - $$30, $$11 + $$13);
               $$14.a((float)($$31 + $$32 - $$4), (float)(-$$6), (float)($$1.f() - $$5)).a($$11 - ($$33 + $$30), $$11 + $$13);
               $$14.a((float)($$31 + $$32 - $$4), (float)$$6, (float)($$1.f() - $$5)).a($$11 - ($$33 + $$30), $$11 + $$12);
               $$14.a((float)($$31 - $$4), (float)$$6, (float)($$1.f() - $$5)).a($$11 - $$30, $$11 + $$12);
               $$31++;
            }
         }

         fbb $$34 = $$14.a();
         if ($$34 != null) {
            fay.a($$34);
         }

         RenderSystem.enableCull();
         RenderSystem.polygonOffset(0.0F, 0.0F);
         RenderSystem.disablePolygonOffset();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.depthMask(true);
      }
   }

   private void a(fbc $$0, fbg $$1, bsq $$2, double $$3, double $$4, double $$5, jd $$6, dta $$7) {
      a($$0, $$1, $$7.a(this.u, $$6, exb.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   private static eww a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(ayn.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new eww(1.0, (double)$$3, 0.0);
         case 1 -> new eww((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new eww(0.0, 1.0, (double)$$3);
         case 3 -> new eww(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new eww((double)$$3, 0.0, 1.0);
         case 5 -> new eww(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static eww a(float $$0, float $$1, float $$2, float $$3) {
      eww $$4 = a($$3).a((double)$$0);
      eww $$5 = a(($$3 + 0.33333334F) % 1.0F).a((double)$$1);
      eww $$6 = a(($$3 + 0.6666667F) % 1.0F).a((double)$$2);
      eww $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.c), Math.max($$7.d, $$7.e));
      return new eww($$7.c / $$8, $$7.d / $$8, $$7.e / $$8);
   }

   public static void a(fbc $$0, fbg $$1, exp $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<ewr> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         a($$0, $$1, exm.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            ewr $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            eww $$16 = a($$6, $$7, $$8, $$15);
            a($$0, $$1, exm.a($$14), $$3, $$4, $$5, (float)$$16.c, (float)$$16.d, (float)$$16.e, $$9);
         }
      }
   }

   private static void a(fbc $$0, fbg $$1, exp $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9) {
      fbc.a $$10 = $$0.c();
      $$2.a(($$9x, $$10x, $$11, $$12, $$13, $$14) -> {
         float $$15 = (float)($$12 - $$9x);
         float $$16 = (float)($$13 - $$10x);
         float $$17 = (float)($$14 - $$11);
         float $$18 = ayn.c($$15 * $$15 + $$16 * $$16 + $$17 * $$17);
         $$15 /= $$18;
         $$16 /= $$18;
         $$17 /= $$18;
         $$1.a($$10, (float)($$9x + $$3), (float)($$10x + $$4), (float)($$11 + $$5)).a($$6, $$7, $$8, $$9).b($$10, $$15, $$16, $$17);
         $$1.a($$10, (float)($$12 + $$3), (float)($$13 + $$4), (float)($$14 + $$5)).a($$6, $$7, $$8, $$9).b($$10, $$15, $$16, $$17);
      });
   }

   public static void a(fbg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, float $$8, float $$9, float $$10) {
      a(new fbc(), $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$7, $$8, $$9);
   }

   public static void a(fbc $$0, fbg $$1, ewr $$2, float $$3, float $$4, float $$5, float $$6) {
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
      $$1.a($$15, $$16, $$17, $$18).a($$8, $$13, $$14, $$11).b($$15, 1.0F, 0.0F, 0.0F);
      $$1.a($$15, $$19, $$17, $$18).a($$8, $$13, $$14, $$11).b($$15, 1.0F, 0.0F, 0.0F);
      $$1.a($$15, $$16, $$17, $$18).a($$12, $$9, $$14, $$11).b($$15, 0.0F, 1.0F, 0.0F);
      $$1.a($$15, $$16, $$20, $$18).a($$12, $$9, $$14, $$11).b($$15, 0.0F, 1.0F, 0.0F);
      $$1.a($$15, $$16, $$17, $$18).a($$12, $$13, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F);
      $$1.a($$15, $$16, $$17, $$21).a($$12, $$13, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F);
      $$1.a($$15, $$19, $$17, $$18).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 1.0F, 0.0F);
      $$1.a($$15, $$19, $$20, $$18).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 1.0F, 0.0F);
      $$1.a($$15, $$19, $$20, $$18).a($$8, $$9, $$10, $$11).b($$15, -1.0F, 0.0F, 0.0F);
      $$1.a($$15, $$16, $$20, $$18).a($$8, $$9, $$10, $$11).b($$15, -1.0F, 0.0F, 0.0F);
      $$1.a($$15, $$16, $$20, $$18).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F);
      $$1.a($$15, $$16, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F);
      $$1.a($$15, $$16, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, -1.0F, 0.0F);
      $$1.a($$15, $$16, $$17, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, -1.0F, 0.0F);
      $$1.a($$15, $$16, $$17, $$21).a($$8, $$9, $$10, $$11).b($$15, 1.0F, 0.0F, 0.0F);
      $$1.a($$15, $$19, $$17, $$21).a($$8, $$9, $$10, $$11).b($$15, 1.0F, 0.0F, 0.0F);
      $$1.a($$15, $$19, $$17, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, -1.0F);
      $$1.a($$15, $$19, $$17, $$18).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, -1.0F);
      $$1.a($$15, $$16, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 1.0F, 0.0F, 0.0F);
      $$1.a($$15, $$19, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 1.0F, 0.0F, 0.0F);
      $$1.a($$15, $$19, $$17, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 1.0F, 0.0F);
      $$1.a($$15, $$19, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 1.0F, 0.0F);
      $$1.a($$15, $$19, $$20, $$18).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F);
      $$1.a($$15, $$19, $$20, $$21).a($$8, $$9, $$10, $$11).b($$15, 0.0F, 0.0F, 1.0F);
   }

   public static void b(fbc $$0, fbg $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      a($$0, $$1, (float)$$2, (float)$$3, (float)$$4, (float)$$5, (float)$$6, (float)$$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fbc $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, float $$11) {
      Matrix4f $$12 = $$0.c().a();
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$3, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$3, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$3, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$3, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$6, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$2, $$6, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$6, $$4).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11);
      $$1.a($$12, $$5, $$6, $$7).a($$8, $$9, $$10, $$11);
   }

   public void a(dca $$0, jd $$1, dta $$2, dta $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(jd $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(kf.a($$3), kf.a($$4), kf.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(kf.a($$7), kf.a($$8), kf.a($$6));
            }
         }
      }
   }

   public void a(jd $$0, dta $$1, dta $$2) {
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

   public void a(jm<cut> $$0, jd $$1) {
      if (this.u != null) {
         this.c($$1);
         cut $$2 = $$0.a();
         avn $$3 = $$2.b().a();
         gtt $$4 = gto.a($$3, eww.b($$1));
         this.I.put($$1, $$4);
         this.q.aj().a($$4);
         this.q.l.a($$2.c());
         this.a(this.u, $$1, true);
      }
   }

   private void c(jd $$0) {
      gtt $$1 = this.I.remove($$0);
      if ($$1 != null) {
         this.q.aj().b($$1);
      }
   }

   public void a(jd $$0) {
      this.c($$0);
      if (this.u != null) {
         this.a(this.u, $$0, false);
      }
   }

   private void a(dcu $$0, jd $$1, boolean $$2) {
      for (btl $$4 : $$0.a(btl.class, new ewr($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }

   public void a(lk $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(lk $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", lt.i.b($$0.a()));
         $$11.a("Parameters", () -> lm.bf.encodeStart(this.u.H_().a(uo.a), $$0).toString());
         $$11.a("Position", () -> p.a(this.u, $$3, $$4, $$5));
         throw new z($$10);
      }
   }

   private <T extends lk> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   private gch b(lk $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gch b(lk $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      ffs $$9 = this.q.j.l();
      fgn $$10 = this.a($$2);
      if ($$1) {
         return this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == fgn.c ? null : this.q.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private fgn a(boolean $$0) {
      fgn $$1 = this.q.m.ar().c();
      if ($$0 && $$1 == fgn.c && this.u.z.a(10) == 0) {
         $$1 = fgn.b;
      }

      if ($$1 == fgn.b && this.u.z.a(3) == 0) {
         $$1 = fgn.c;
      }

      return $$1;
   }

   public void p() {
   }

   public void a(int $$0, jd $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            ffs $$3 = this.q.j.l();
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
                  this.u.a($$8, $$9, $$10, avo.CH, avp.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.u.a($$8, $$9, $$10, avo.iw, avp.f, 1.0F, 1.0F, false);
               } else {
                  this.u.a($$8, $$9, $$10, avo.ib, avp.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, jd $$1, int $$2) {
      ayv $$3 = this.u.z;
      switch ($$0) {
         case 1000:
            this.u.a($$1, avo.gS, avp.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.u.a($$1, avo.gT, avp.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.u.a($$1, avo.gU, avp.e, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.u.a($$1, avo.iQ, avp.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.u.a($$1, avo.iU, avp.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.u.a($$1, avo.kf, avp.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            this.u.H_().d(lu.L).c($$2).ifPresent($$1x -> this.a($$1x, $$1));
            break;
         case 1011:
            this.a($$1);
            break;
         case 1015:
            this.u.a($$1, avo.kp, avp.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.u.a($$1, avo.ko, avp.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.u.a($$1, avo.ig, avp.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.u.a($$1, avo.ck, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.u.a($$1, avo.Du, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.u.a($$1, avo.Dv, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.u.a($$1, avo.Dw, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.u.a($$1, avo.Cz, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.u.a($$1, avo.CC, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.u.a($$1, avo.bJ, avp.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.u.a($$1, avo.DE, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.u.a($$1, avo.DL, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.u.a($$1, avo.V, avp.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.u.a($$1, avo.ab, avp.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.u.a($$1, avo.Y, avp.e, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.q.aj().a(gto.b(avo.uI, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.u.a($$1, avo.fg, avp.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.u.a($$1, avo.ff, avp.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.u.a($$1, avo.cR, avp.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.u.a($$1, avo.tv, avp.f, 0.3F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.u.a($$1, avo.Dx, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.u.a($$1, avo.na, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.u.a($$1, avo.lo, avp.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.u.a($$1, avo.cy, avp.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.u.a($$1, avo.yj, avp.e, 1.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.u.a($$1, avo.hw, avp.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.u.a($$1, avo.hz, avp.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.u.a($$1, avo.hA, avp.e, 2.0F, this.u.z.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.u.a($$1, avo.xc, avp.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.u.a($$1, avo.gg, avp.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.u.a($$1, avo.gh, avp.e, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.u.a($$1, avo.Cr, avp.e, 0.5F, 0.4F / (this.u.E_().i() * 0.4F + 0.8F), false);
         case 2010:
            this.a($$2, $$1, $$3, lm.af);
            break;
         case 1500:
            dhh.a(this.u, $$1, $$2 > 0);
            break;
         case 1501:
            this.u.a($$1, avo.nQ, avp.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$60 = 0; $$60 < 8; $$60++) {
               this.u.a(lm.X, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.u.a($$1, avo.vv, avp.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$61 = 0; $$61 < 5; $$61++) {
               double $$62 = (double)$$1.u() + $$3.j() * 0.6 + 0.2;
               double $$63 = (double)$$1.v() + $$3.j() * 0.6 + 0.2;
               double $$64 = (double)$$1.w() + $$3.j() * 0.6 + 0.2;
               this.u.a(lm.ae, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.u.a($$1, avo.iv, avp.e, 1.0F, 1.0F, false);

            for (int $$65 = 0; $$65 < 16; $$65++) {
               double $$66 = (double)$$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$67 = (double)$$1.v() + 0.8125;
               double $$68 = (double)$$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.u.a(lm.ae, $$66, $$67, $$68, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            dlo.a(this.u, $$1, this.u.a_($$1));
            break;
         case 1505:
            cso.a(this.u, $$1, $$2);
            this.u.a($$1, avo.cx, avp.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, lm.ae);
            break;
         case 2001:
            dta $$23 = dfw.a($$2);
            if (!$$23.i()) {
               dnk $$24 = $$23.w();
               this.u.a($$1, $$24.c(), avp.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.u.a($$1, $$23);
            break;
         case 2002:
         case 2007:
            eww $$9 = eww.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.a(new li(lm.S, new cuo(cur.vo)), $$9.c, $$9.d, $$9.e, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = (float)($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0F;
            lk $$14 = $$0 == 2007 ? lm.R : lm.p;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               gch $$21 = this.b($$14, $$14.a().b(), $$9.c + $$18 * 0.1, $$9.d + 0.3, $$9.e + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.u.a($$1, avo.yP, avp.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = (double)$$1.u() + 0.5;
            double $$5 = (double)$$1.v();
            double $$6 = (double)$$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.a(new li(lm.S, new cuo(cur.ss)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.a(lm.ac, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.a(lm.ac, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = (double)$$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = (double)$$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = (double)$$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.u.a(lm.ae, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.u.a(lm.F, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$69 = 0; $$69 < 200; $$69++) {
               float $$70 = $$3.i() * 4.0F;
               float $$71 = $$3.i() * (float) (Math.PI * 2);
               double $$72 = (double)(ayn.b($$71) * $$70);
               double $$73 = 0.01 + $$3.j() * 0.5;
               double $$74 = (double)(ayn.a($$71) * $$70);
               gch $$75 = this.b(lm.h, false, (double)$$1.u() + $$72 * 0.1, (double)$$1.v() + 0.3, (double)$$1.w() + $$74 * 0.1, $$72, $$73, $$74);
               if ($$75 != null) {
                  $$75.c($$70);
               }
            }

            if ($$2 == 1) {
               this.u.a($$1, avo.ic, avp.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.u.a(lm.w, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$76 = 0; $$76 < 8; $$76++) {
               this.u.a(lm.e, (double)$$1.u() + $$3.j(), (double)$$1.v() + 1.2, (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2011:
            ayr.a(this.u, $$1, $$2, lm.O);
            break;
         case 2012:
            ayr.a(this.u, $$1, $$2, lm.O);
            break;
         case 2013:
            ayr.a(this.u, $$1, $$2);
            break;
         case 3000:
            this.u.a(lm.v, true, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.u.a($$1, avo.iu, avp.e, 10.0F, (1.0F + (this.u.z.i() - this.u.z.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.u.a($$1, avo.ie, avp.f, 64.0F, 0.8F + this.u.z.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < ji.a.d.length) {
               ayr.a(ji.a.d[$$2], this.u, $$1, 0.125, lm.aT, bqb.a(10, 19));
            } else {
               ayr.a(this.u, $$1, lm.aT, bqb.a(3, 5));
            }
            break;
         case 3003:
            ayr.a(this.u, $$1, lm.aR, bqb.a(3, 5));
            this.u.a($$1, avo.mC, avp.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            ayr.a(this.u, $$1, lm.aS, bqb.a(3, 5));
            break;
         case 3005:
            ayr.a(this.u, $$1, lm.aU, bqb.a(3, 5));
            break;
         case 3006:
            int $$36 = $$2 >> 6;
            if ($$36 > 0) {
               if ($$3.i() < 0.3F + (float)$$36 * 0.1F) {
                  float $$37 = 0.15F + 0.02F * (float)$$36 * (float)$$36 * $$3.i();
                  float $$38 = 0.4F + 0.3F * (float)$$36 * $$3.i();
                  this.u.a($$1, avo.vU, avp.e, $$37, $$38, false);
               }

               byte $$39 = (byte)($$2 & 63);
               bpv $$40 = bqb.a(0, $$36);
               float $$41 = 0.005F;
               Supplier<eww> $$42 = () -> new eww(ayn.a($$3, -0.005F, 0.005F), ayn.a($$3, -0.005F, 0.005F), ayn.a($$3, -0.005F, 0.005F));
               if ($$39 == 0) {
                  for (ji $$43 : ji.values()) {
                     float $$44 = $$43 == ji.a ? (float) Math.PI : 0.0F;
                     double $$45 = $$43.o() == ji.a.b ? 0.65 : 0.57;
                     ayr.a(this.u, $$1, new lo($$44), $$40, $$43, $$42, $$45);
                  }
               } else {
                  for (ji $$46 : dkw.a($$39)) {
                     float $$47 = $$46 == ji.b ? (float) Math.PI : 0.0F;
                     double $$48 = 0.35;
                     ayr.a(this.u, $$1, new lo($$47), $$40, $$46, $$42, 0.35);
                  }
               }
            } else {
               this.u.a($$1, avo.vU, avp.e, 1.0F, 1.0F, false);
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
                        lm.K,
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
               this.u.a(new lp($$57 * 5), false, (double)$$1.u() + 0.5, (double)$$1.v() + dmr.f, (double)$$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            dta $$58 = this.u.a_($$1);
            boolean $$59 = $$58.b(dtq.C) && $$58.c(dtq.C);
            if (!$$59) {
               this.u.a((double)$$1.u() + 0.5, (double)$$1.v() + dmr.f, (double)$$1.w() + 0.5, avo.wr, avp.e, 2.0F, 0.6F + this.u.z.i() * 0.4F, false);
            }
            break;
         case 3008:
            dta $$25 = dfw.a($$2);
            if ($$25.b() instanceof dgb $$26) {
               this.u.a($$1, $$26.d(), avp.h, 1.0F, 1.0F, false);
            }

            this.u.a($$1, $$25);
            break;
         case 3009:
            ayr.a(this.u, $$1, lm.aW, bqb.a(3, 6));
            break;
         case 3011:
            dsd.a(this.u, $$1, $$3, dsd.a.a($$2).c);
            break;
         case 3012:
            this.u.a($$1, avo.mc, avp.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dsd.a(this.u, $$1, $$3, dsd.a.a($$2).c);
            break;
         case 3013:
            this.u.a($$1, avo.mg, avp.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dsd.a(this.u, $$1, $$3, $$2, lm.aY);
            break;
         case 3014:
            this.u.a($$1, avo.mm, avp.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dsd.b(this.u, $$1, $$3);
            break;
         case 3015:
            if (this.u.c_($$1) instanceof dsi $$31) {
               dsi.a.a(this.u, $$31.az_(), $$31.n(), $$31.c(), $$2 == 0 ? lm.aJ : lm.L);
               this.u.a($$1, avo.AA, avp.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            dsi.a.a(this.u, $$1, $$2 == 0 ? lm.aJ : lm.L);
            this.u.a($$1, avo.AE, avp.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            dsd.b(this.u, $$1, $$3);
            break;
         case 3018:
            for (int $$32 = 0; $$32 < 10; $$32++) {
               double $$33 = $$3.k() * 0.02;
               double $$34 = $$3.k() * 0.02;
               double $$35 = $$3.k() * 0.02;
               this.u.a(lm.ab, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), $$33, $$34, $$35);
            }

            this.u.a($$1, avo.fk, avp.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3019:
            this.u.a($$1, avo.mg, avp.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dsd.a(this.u, $$1, $$3, $$2, lm.aZ);
            break;
         case 3020:
            this.u.a($$1, avo.mh, avp.e, $$2 == 0 ? 0.3F : 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dsd.a(this.u, $$1, $$3, 0, lm.aZ);
            dsd.a(this.u, $$1, $$3);
            break;
         case 3021:
            this.u.a($$1, avo.me, avp.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            dsd.a(this.u, $$1, $$3, dsd.a.a($$2).c);
      }
   }

   public void c(int $$0, jd $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         apw $$4 = (apw)this.G.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new apw($$0, $$1);
            this.G.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.F);
         ((SortedSet)this.H.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         apw $$3 = (apw)this.G.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean q() {
      return this.ae.h();
   }

   public void a(dcb $$0) {
      this.v.a($$0);
   }

   public void r() {
      this.v.a();
      this.C = true;
   }

   public void a(Collection<dqf> $$0, Collection<dqf> $$1) {
      synchronized (this.x) {
         this.x.removeAll($$0);
         this.x.addAll($$1);
      }
   }

   public static int a(dbx $$0, jd $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(dbx $$0, dta $$1, jd $$2) {
      if ($$1.e($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(ddd.a, $$2);
         int $$4 = $$0.a(ddd.b, $$2);
         int $$5 = $$1.h();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean b(jd $$0) {
      ghu.b $$1 = this.y.a($$0);
      return $$1 != null && $$1.c.get() != ghu.a.a;
   }

   @Nullable
   public ezp s() {
      return this.J;
   }

   @Nullable
   public ezp t() {
      return this.L;
   }

   @Nullable
   public ezp u() {
      return this.M;
   }

   @Nullable
   public ezp v() {
      return this.N;
   }

   @Nullable
   public ezp w() {
      return this.O;
   }

   @Nullable
   public ezp x() {
      return this.P;
   }

   private void a(int $$0, jd $$1, ayv $$2, lq $$3) {
      ji $$4 = ji.a($$0);
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
