import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class glt implements auq, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   private static final aku e = aku.b("transparency");
   private static final aku f = aku.b("entity_outline");
   public static final int a = 16;
   public static final int b = 8;
   public static final int c = 32;
   private static final int g = 15;
   private final flj h;
   private final gsa i;
   private final goh j;
   private final gmf k;
   private final gmt l = new gmt();
   private final glg m = new glg();
   private final gmz n = new gmz();
   private final gmy o = new gmy();
   @Nullable
   private gfy p;
   private final gmm q = new gmm();
   private final ObjectArrayList<gpk.b> r = new ObjectArrayList(10000);
   private final ObjectArrayList<gpk.b> s = new ObjectArrayList(50);
   private final Set<dtz> t = Sets.newHashSet();
   @Nullable
   private gmw u;
   private int v;
   private final Int2ObjectMap<aqd> w = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aqd>> x = new Long2ObjectOpenHashMap();
   @Nullable
   private fee y;
   private final glu z = new glu();
   private int A = Integer.MIN_VALUE;
   private int B = Integer.MIN_VALUE;
   private int C = Integer.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   private double G = Double.MIN_VALUE;
   private double H = Double.MIN_VALUE;
   @Nullable
   private gpk I;
   private int J = -1;
   private final List<buk> K = new ArrayList<>();
   private int L;
   private gpo M;
   private boolean N;
   @Nullable
   private gpo O;
   @Nullable
   private ji P;
   private int Q;

   public glt(flj $$0, gsa $$1, goh $$2, gmf $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
   }

   public void a(fkr $$0) {
      this.o.a(this.h.s, $$0, this.v, this.h.n.au().c());
   }

   @Override
   public void close() {
      if (this.y != null) {
         this.y.a();
      }

      this.l.close();
      this.m.close();
   }

   @Override
   public void a(aup $$0) {
      this.a();
   }

   public void a() {
      if (this.y != null) {
         this.y.a();
      }

      this.y = new fef(this.h.aO().k(), this.h.aO().l(), true);
      this.y.a(0.0F, 0.0F, 0.0F, 0.0F);
   }

   @Nullable
   private gmb A() {
      if (!flj.O()) {
         return null;
      } else {
         gmb $$0 = this.h.ab().a(e, glu.j);
         if ($$0 == null) {
            this.h.n.k().a(flb.b);
            this.h.n.az();
         }

         return $$0;
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
         this.y.d(this.h.aO().k(), this.h.aO().l());
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.h.j.a() && this.y != null && this.h.t != null;
   }

   public void a(@Nullable gfy $$0) {
      this.A = Integer.MIN_VALUE;
      this.B = Integer.MIN_VALUE;
      this.C = Integer.MIN_VALUE;
      this.i.a($$0);
      this.p = $$0;
      if ($$0 != null) {
         this.e();
      } else {
         if (this.u != null) {
            this.u.a();
            this.u = null;
         }

         if (this.I != null) {
            this.I.i();
         }

         this.I = null;
         this.t.clear();
         this.q.a(null);
         this.B();
      }
   }

   private void B() {
      this.r.clear();
      this.s.clear();
   }

   public void e() {
      if (this.p != null) {
         this.p.f();
         if (this.I == null) {
            this.I = new gpk(this.p, this, af.g(), this.k, this.h.ap(), this.h.ar());
         } else {
            this.I.a(this.p);
         }

         this.m.a();
         glq.a(flj.N());
         this.J = this.h.n.aH();
         if (this.u != null) {
            this.u.a();
         }

         this.I.g();
         synchronized (this.t) {
            this.t.clear();
         }

         this.u = new gmw(this.I, this.p, this.h.n.aH(), this);
         this.q.a(this.u);
         this.B();
         buk $$0 = this.h.ao();
         if ($$0 != null) {
            this.u.a(kk.a($$0));
         }
      }
   }

   public void a(int $$0, int $$1) {
      this.p();
      if (this.y != null) {
         this.y.a($$0, $$1);
      }
   }

   public String f() {
      int $$0 = this.u.f.length;
      int $$1 = this.j();
      return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.h.E ? "(s) " : "", this.J, this.I == null ? "null" : this.I.a());
   }

   public gpk g() {
      return this.I;
   }

   public double h() {
      return (double)this.u.f.length;
   }

   public double i() {
      return (double)this.J;
   }

   public int j() {
      int $$0 = 0;
      ObjectListIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         gpk.b $$1 = (gpk.b)var2.next();
         if ($$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String k() {
      return "E: " + this.L + "/" + this.p.g() + ", SD: " + this.p.m();
   }

   private void a(fkr $$0, gpo $$1, boolean $$2, boolean $$3) {
      fba $$4 = $$0.b();
      if (this.h.n.aH() != this.J) {
         this.e();
      }

      bos $$5 = bor.a();
      $$5.a("camera");
      int $$6 = kk.a($$4.a());
      int $$7 = kk.a($$4.b());
      int $$8 = kk.a($$4.c());
      if (this.A != $$6 || this.B != $$7 || this.C != $$8) {
         this.A = $$6;
         this.B = $$7;
         this.C = $$8;
         this.u.a(kk.a($$4));
      }

      this.I.a($$4);
      $$5.b("cull");
      double $$9 = Math.floor($$4.d / 8.0);
      double $$10 = Math.floor($$4.e / 8.0);
      double $$11 = Math.floor($$4.f / 8.0);
      if ($$9 != this.D || $$10 != this.E || $$11 != this.F) {
         this.q.a();
      }

      this.D = $$9;
      this.E = $$10;
      this.F = $$11;
      $$5.b("update");
      if (!$$2) {
         boolean $$12 = this.h.E;
         if ($$3 && this.p.a_($$0.c()).s()) {
            $$12 = false;
         }

         $$5.a("section_occlusion_graph");
         this.q.a($$12, $$0, $$1, this.r, this.p.h().a());
         $$5.c();
         double $$13 = Math.floor((double)($$0.d() / 2.0F));
         double $$14 = Math.floor((double)($$0.e() / 2.0F));
         if (this.q.b() || $$13 != this.G || $$14 != this.H) {
            this.b(a($$1));
            this.G = $$13;
            this.H = $$14;
         }
      }

      $$5.c();
   }

   public static gpo a(gpo $$0) {
      return new gpo($$0).a(8);
   }

   private void b(gpo $$0) {
      if (!flj.Q().bx()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         bor.a().a("apply_frustum");
         this.B();
         this.q.a($$0, this.r, this.s);
         bor.a().c();
      }
   }

   public void a(gpk.b $$0) {
      this.q.a($$0);
   }

   public void a(fba $$0, Matrix4f $$1, Matrix4f $$2) {
      this.M = new gpo($$1, $$2);
      this.M.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(ffd $$0, fkz $$1, boolean $$2, fkr $$3, glo $$4, Matrix4f $$5, Matrix4f $$6) {
      float $$7 = $$1.a(false);
      RenderSystem.setShaderGameTime(this.p.ad(), $$7);
      this.j.a(this.p, $$3, this.h.w);
      this.i.a(this.p, $$3, this.h.v);
      final bos $$8 = bor.a();
      $$8.b("light_update_queue");
      this.p.b();
      $$8.b("light_updates");
      this.p.h().p().a();
      fba $$9 = $$3.b();
      double $$10 = $$9.a();
      double $$11 = $$9.b();
      double $$12 = $$9.c();
      $$8.b("culling");
      boolean $$13 = this.O != null;
      gpo $$14 = $$13 ? this.O : this.M;
      bor.a().b("captureFrustum");
      if (this.N) {
         this.O = $$13 ? new gpo($$5, $$6) : $$14;
         this.O.a($$10, $$11, $$12);
         this.N = false;
      }

      $$8.b("fog");
      float $$15 = $$4.j();
      boolean $$16 = this.h.s.c().a(ayz.a($$10), ayz.a($$11)) || this.h.m.j().d();
      Vector4f $$17 = gln.a($$3, $$7, this.h.s, this.h.n.aH(), $$4.c($$7));
      glm $$18 = gln.a($$3, gln.d.b, $$17, $$15, $$16, $$7);
      glm $$19 = gln.a($$3, gln.d.a, $$17, $$15, $$16, $$7);
      $$8.b("cullEntities");
      boolean $$20 = this.a($$3, $$14, this.K);
      this.L = this.K.size();
      $$8.b("terrain_setup");
      this.a($$3, $$14, $$13, this.h.t.Z_());
      $$8.b("compile_sections");
      this.c($$3);
      Matrix4fStack $$21 = RenderSystem.getModelViewStack();
      $$21.pushMatrix();
      $$21.mul($$5);
      fdy $$22 = new fdy();
      this.z.k = $$22.a("main", this.h.h());
      int $$23 = this.h.h().c;
      int $$24 = this.h.h().d;
      ffe $$25 = new ffe($$23, $$24, true);
      gmb $$26 = this.A();
      if ($$26 != null) {
         this.z.l = $$22.a("translucent", $$25);
         this.z.m = $$22.a("item_entity", $$25);
         this.z.n = $$22.a("particles", $$25);
         this.z.o = $$22.a("weather", $$25);
         this.z.p = $$22.a("clouds", $$25);
      }

      if (this.y != null) {
         this.z.q = $$22.a("entity_outline", this.y);
      }

      fdz $$27 = $$22.a("clear");
      this.z.k = $$27.b(this.z.k);
      $$27.a(() -> {
         RenderSystem.clearColor($$17.x, $$17.y, $$17.z, 0.0F);
         RenderSystem.clear(16640);
      });
      if (!$$16) {
         this.b($$22, $$3, $$7, $$19);
      }

      this.a($$22, $$14, $$3, $$5, $$6, $$18, $$2, $$20, $$1, $$8);
      gmb $$28 = this.h.ab().a(f, glu.i);
      if ($$20 && $$28 != null) {
         $$28.a($$22, $$23, $$24, this.z);
      }

      this.a($$22, $$3, $$7, $$18);
      fkv $$29 = this.h.n.aC();
      if ($$29 != fkv.a) {
         float $$30 = this.p.c().a();
         if (!Float.isNaN($$30)) {
            float $$31 = (float)this.v + $$7;
            int $$32 = this.p.h($$7);
            this.a($$22, $$5, $$6, $$29, $$3.b(), $$31, $$32, $$30 + 0.33F);
         }
      }

      this.a($$22, $$3.b(), $$7, $$18);
      if ($$26 != null) {
         $$26.a($$22, $$23, $$24, this.z);
      }

      this.a($$22, $$9, $$18);
      $$8.b("framegraph");
      $$22.a($$0, new fdy.c() {
         @Override
         public void c(String $$0) {
            $$8.a($$0);
         }

         @Override
         public void d(String $$0) {
            $$8.c();
         }
      });
      this.h.h().a(false);
      this.K.clear();
      this.z.a();
      $$21.popMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.setShaderFog(glm.a);
   }

   private void a(fdy $$0, gpo $$1, fkr $$2, Matrix4f $$3, Matrix4f $$4, glm $$5, boolean $$6, boolean $$7, fkz $$8, bos $$9) {
      fdz $$10 = $$0.a("main");
      this.z.k = $$10.b(this.z.k);
      if (this.z.l != null) {
         this.z.l = $$10.b(this.z.l);
      }

      if (this.z.m != null) {
         this.z.m = $$10.b(this.z.m);
      }

      if (this.z.o != null) {
         this.z.o = $$10.b(this.z.o);
      }

      if ($$7 && this.z.q != null) {
         this.z.q = $$10.b(this.z.q);
      }

      ffg<fee> $$11 = this.z.k;
      ffg<fee> $$12 = this.z.l;
      ffg<fee> $$13 = this.z.m;
      ffg<fee> $$14 = this.z.o;
      ffg<fee> $$15 = this.z.q;
      $$10.a(() -> {
         RenderSystem.setShaderFog($$5);
         float $$13x = $$8.a(false);
         fba $$14x = $$2.b();
         double $$15x = $$14x.a();
         double $$16 = $$14x.b();
         double $$17 = $$14x.c();
         $$9.a("terrain");
         this.a(gmh.c(), $$15x, $$16, $$17, $$3, $$4);
         this.a(gmh.d(), $$15x, $$16, $$17, $$3, $$4);
         this.a(gmh.e(), $$15x, $$16, $$17, $$3, $$4);
         if (this.p.c().e()) {
            feq.a();
         } else {
            feq.b();
         }

         if ($$13 != null) {
            $$13.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$13.get().f();
            $$13.get().a(this.h.h());
            $$11.get().a(false);
         }

         if ($$14 != null) {
            $$14.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$14.get().f();
         }

         if (this.d() && $$15 != null) {
            $$15.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$15.get().f();
            $$11.get().a(false);
         }

         ffu $$18 = new ffu();
         glx.a $$19 = this.k.c();
         glx.a $$20 = this.k.d();
         $$9.b("entities");
         this.a($$18, $$19, $$2, $$8, this.K);
         $$19.a();
         this.a($$18);
         $$9.b("blockentities");
         this.a($$18, $$19, $$20, $$2, $$13x);
         $$19.a();
         this.a($$18);
         $$19.a(gmh.c());
         $$19.a(gmh.t());
         $$19.a(gmh.u());
         $$19.a(gms.h());
         $$19.a(gms.i());
         $$19.a(gms.c());
         $$19.a(gms.d());
         $$19.a(gms.e());
         $$19.a(gms.f());
         $$19.a(gms.g());
         this.k.e().a();
         if ($$6) {
            this.a($$2, $$19, $$18, false);
         }

         $$9.b("debug");
         this.h.l.a($$18, $$1, $$19, $$15x, $$16, $$17);
         $$19.a();
         this.a($$18);
         $$19.a(gms.j());
         $$19.a(gms.a());
         $$19.a(gms.b());
         $$19.a(gmh.j());
         $$19.a(gmh.l());
         $$19.a(gmh.k());
         $$19.a(gmh.m());
         $$9.b("destroyProgress");
         this.a($$18, $$2, $$20);
         $$20.b();
         this.a($$18);
         $$19.a(gmh.i());
         $$19.b();
         if ($$12 != null) {
            $$12.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$12.get().f();
            $$12.get().a($$11.get());
         }

         $$9.b("translucent");
         this.a(gmh.f(), $$15x, $$16, $$17, $$3, $$4);
         $$9.b("string");
         this.a(gmh.s(), $$15x, $$16, $$17, $$3, $$4);
         if ($$6) {
            this.a($$2, $$19, $$18, true);
         }

         $$19.b();
         $$9.c();
      });
   }

   private void a(fdy $$0, fkr $$1, float $$2, glm $$3) {
      fdz $$4 = $$0.a("particles");
      if (this.z.n != null) {
         this.z.n = $$4.b(this.z.n);
         $$4.a(this.z.k);
      } else {
         this.z.k = $$4.b(this.z.k);
      }

      ffg<fee> $$5 = this.z.k;
      ffg<fee> $$6 = this.z.n;
      $$4.a(() -> {
         RenderSystem.setShaderFog($$3);
         if ($$6 != null) {
            $$6.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$6.get().f();
            $$6.get().a($$5.get());
         }

         this.h.g.a($$1, $$2, this.k.c());
      });
   }

   private void a(fdy $$0, Matrix4f $$1, Matrix4f $$2, fkv $$3, fba $$4, float $$5, int $$6, float $$7) {
      fdz $$8 = $$0.a("clouds");
      if (this.z.p != null) {
         this.z.p = $$8.b(this.z.p);
      } else {
         this.z.k = $$8.b(this.z.k);
      }

      ffg<fee> $$9 = this.z.p;
      $$8.a(() -> {
         if ($$9 != null) {
            $$9.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$9.get().f();
         }

         this.m.a($$6, $$3, $$7, $$1, $$2, $$4, $$5);
      });
   }

   private void a(fdy $$0, fba $$1, float $$2, glm $$3) {
      int $$4 = this.h.n.aH() * 16;
      float $$5 = this.h.j.g();
      fdz $$6 = $$0.a("weather");
      if (this.z.o != null) {
         this.z.o = $$6.b(this.z.o);
      } else {
         this.z.k = $$6.b(this.z.k);
      }

      $$6.a(() -> {
         RenderSystem.setShaderFog($$3);
         glx.a $$5x = this.k.c();
         this.o.a(this.h.s, $$5x, this.v, $$2, $$1);
         this.n.a(this.p.F_(), $$1, (double)$$4, (double)$$5);
         $$5x.b();
      });
   }

   private void a(fdy $$0, fba $$1, glm $$2) {
      fdz $$3 = $$0.a("late_debug");
      this.z.k = $$3.b(this.z.k);
      if (this.z.m != null) {
         this.z.m = $$3.b(this.z.m);
      }

      ffg<fee> $$4 = this.z.k;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         $$4.get().a(false);
         ffu $$3x = new ffu();
         glx.a $$4x = this.k.c();
         this.h.l.a($$3x, $$4x, $$1.d, $$1.e, $$1.f);
         $$4x.a();
         this.a($$3x);
      });
   }

   private boolean a(fkr $$0, gpo $$1, List<buk> $$2) {
      fba $$3 = $$0.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.d();
      buk.b(ayz.a((double)this.h.n.aH() / 8.0, 1.0, 2.5) * this.h.n.g().c());

      for (buk $$9 : this.p.d()) {
         if (this.i.a($$9, $$1, $$4, $$5, $$6) || $$9.A(this.h.t)) {
            ji $$10 = $$9.dw();
            if ((this.p.e($$10.v()) || this.a($$10))
               && ($$9 != $$0.g() || $$0.i() || $$0.g() instanceof bvg && ((bvg)$$0.g()).fR())
               && (!($$9 instanceof gkv) || $$0.g() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.h.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(ffu $$0, glx.a $$1, fkr $$2, fkz $$3, List<buk> $$4) {
      fba $$5 = $$2.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      bss $$9 = this.h.s.u();
      boolean $$10 = this.d();

      for (buk $$11 : $$4) {
         if ($$11.af == 0) {
            $$11.aa = $$11.dB();
            $$11.ab = $$11.dD();
            $$11.ac = $$11.dH();
         }

         glx $$13;
         if ($$10 && this.h.b($$11)) {
            glz $$12 = this.k.e();
            $$13 = $$12;
            int $$14 = $$11.k_();
            $$12.a(axk.b($$14), axk.c($$14), axk.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(ffu $$0, glx.a $$1, glx.a $$2, fkr $$3, float $$4) {
      fba $$5 = $$3.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator var13 = this.r.iterator();

      while (var13.hasNext()) {
         gpk.b $$9 = (gpk.b)var13.next();
         List<dtz> $$10 = $$9.d().b();
         if (!$$10.isEmpty()) {
            for (dtz $$11 : $$10) {
               ji $$12 = $$11.aA_();
               glx $$13 = $$1;
               $$0.a();
               $$0.a((double)$$12.u() - $$6, (double)$$12.v() - $$7, (double)$$12.w() - $$8);
               SortedSet<aqd> $$14 = (SortedSet<aqd>)this.x.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     ffu.a $$16 = $$0.c();
                     ffy $$17 = new ffv($$2.getBuffer(hgv.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        ffy $$3x = $$1.getBuffer($$2x);
                        return $$2x.W() ? fgb.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.j.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      synchronized (this.t) {
         for (dtz $$18 : this.t) {
            ji $$19 = $$18.aA_();
            $$0.a();
            $$0.a((double)$$19.u() - $$6, (double)$$19.v() - $$7, (double)$$19.w() - $$8);
            this.j.a($$18, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(ffu $$0, fkr $$1, glx.a $$2) {
      fba $$3 = $$1.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.x.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<aqd>> $$7 = (Entry<SortedSet<aqd>>)var11.next();
         ji $$8 = ji.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<aqd> $$9 = (SortedSet<aqd>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
               ffu.a $$11 = $$0.c();
               ffy $$12 = new ffv($$2.getBuffer(hgv.l.get($$10)), $$11, 1.0F);
               this.h.ap().a(this.p.a_($$8), $$8, this.p, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(fkr $$0, glx.a $$1, ffu $$2, boolean $$3) {
      if (this.h.w instanceof faw $$4) {
         if ($$4.d() != fay.a.a) {
            ji $$6 = $$4.b();
            dwx $$7 = this.p.a_($$6);
            if (!$$7.l() && this.p.F_().a($$6)) {
               boolean $$8 = glq.a($$7).Y();
               if ($$8 != $$3) {
                  return;
               }

               fba $$9 = $$0.b();
               Boolean $$10 = this.h.n.v().c();
               if ($$10) {
                  ffy $$11 = $$1.getBuffer(gmh.z());
                  this.a($$2, $$11, $$0.g(), $$9.d, $$9.e, $$9.f, $$6, $$7, -16777216);
               }

               ffy $$12 = $$1.getBuffer(gmh.y());
               int $$13 = $$10 ? -11010079 : axk.c(102, -16777216);
               this.a($$2, $$12, $$0.g(), $$9.d, $$9.e, $$9.f, $$6, $$7, $$13);
               $$1.a();
            }
         }
      }
   }

   private void a(ffu $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(buk $$0, double $$1, double $$2, double $$3, float $$4, ffu $$5, glx $$6) {
      double $$7 = ayz.d((double)$$4, $$0.aa, $$0.dB());
      double $$8 = ayz.d((double)$$4, $$0.ab, $$0.dD());
      double $$9 = ayz.d((double)$$4, $$0.ac, $$0.dH());
      this.i.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.i.a($$0, $$4));
   }

   private void a(fba $$0) {
      if (!this.r.isEmpty()) {
         ji $$1 = ji.a((kb)$$0);
         boolean $$2 = !$$1.equals(this.P);
         bor.a().a("translucent_sort");
         gpk.d $$3 = new gpk.d();
         ObjectListIterator $$5 = this.s.iterator();

         while ($$5.hasNext()) {
            gpk.b $$4 = (gpk.b)$$5.next();
            this.a($$4, $$3, $$0, $$2, true);
         }

         this.Q = this.Q % this.r.size();
         int $$5x = Math.max(this.r.size() / 8, 15);

         while ($$5x-- > 0) {
            int $$6 = this.Q++ % this.r.size();
            this.a((gpk.b)this.r.get($$6), $$3, $$0, $$2, false);
         }

         this.P = $$1;
         bor.a().c();
      }
   }

   private void a(gpk.b $$0, gpk.d $$1, fba $$2, boolean $$3, boolean $$4) {
      $$1.b($$2, $$0.g());
      boolean $$5 = !$$1.equals($$0.d.get());
      boolean $$6 = $$3 && ($$1.a() || $$4);
      if (($$6 || $$5) && !$$0.l() && $$0.k()) {
         $$0.a(this.I);
      }
   }

   private void a(gmh $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      box $$6 = bor.a().c(() -> "render_" + $$0.b);
      $$6.a($$0::toString);
      boolean $$7 = $$0 != gmh.f();
      ObjectListIterator<gpk.b> $$8 = this.r.listIterator($$7 ? 0 : this.r.size());
      $$0.a();
      glh $$9 = RenderSystem.getShader();
      if ($$9 == null) {
         $$0.b();
         $$6.close();
      } else {
         $$9.a(ffz.c.h, $$4, $$5, this.h.aO());
         $$9.b();
         ffl $$10 = $$9.o;

         while ($$7 ? $$8.hasNext() : $$8.hasPrevious()) {
            gpk.b $$11 = $$7 ? (gpk.b)$$8.next() : (gpk.b)$$8.previous();
            if (!$$11.d().a($$0)) {
               ffx $$12 = $$11.a($$0);
               ji $$13 = $$11.f();
               if ($$10 != null) {
                  $$10.a((float)((double)$$13.u() - $$1), (float)((double)$$13.v() - $$2), (float)((double)$$13.w() - $$3));
                  $$10.b();
               }

               $$12.a();
               $$12.c();
            }
         }

         if ($$10 != null) {
            $$10.a(0.0F, 0.0F, 0.0F);
         }

         $$9.a();
         ffx.b();
         $$6.close();
         $$0.b();
      }
   }

   public void l() {
      this.N = true;
   }

   public void m() {
      this.O = null;
   }

   public void n() {
      if (this.p.u().i()) {
         this.v++;
      }

      if (this.v % 20 == 0) {
         Iterator<aqd> $$0 = this.w.values().iterator();

         while ($$0.hasNext()) {
            aqd $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.v - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(aqd $$0) {
      long $$1 = $$0.b().a();
      Set<aqd> $$2 = (Set<aqd>)this.x.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.x.remove($$1);
      }
   }

   private void b(fdy $$0, fkr $$1, float $$2, glm $$3) {
      etb $$4 = $$1.k();
      if ($$4 != etb.c && $$4 != etb.a && !this.b($$1)) {
         glk $$5 = this.p.c();
         glk.d $$6 = $$5.c();
         if ($$6 != glk.d.a) {
            fdz $$7 = $$0.a("sky");
            this.z.k = $$7.b(this.z.k);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               if ($$6 == glk.d.c) {
                  this.l.a();
               } else {
                  ffu $$4x = new ffu();
                  float $$5x = this.p.a($$2);
                  float $$6x = this.p.f($$2);
                  float $$7x = 1.0F - this.p.d($$2);
                  float $$8 = this.p.i($$2) * $$7x;
                  int $$9 = $$5.b($$6x);
                  int $$10 = this.p.as();
                  int $$11 = this.p.a(this.h.j.k().b(), $$2);
                  float $$12 = axk.j($$11);
                  float $$13 = axk.k($$11);
                  float $$14 = axk.l($$11);
                  this.l.a($$12, $$13, $$14);
                  glx.a $$15 = this.k.c();
                  if ($$5.a($$6x)) {
                     this.l.a($$4x, $$15, $$5x, $$9);
                  }

                  this.l.a($$4x, $$15, $$6x, $$10, $$7x, $$8, $$3);
                  $$15.b();
                  if (this.a($$2)) {
                     this.l.a($$4x);
                  }
               }
            });
         }
      }
   }

   private boolean a(float $$0) {
      return this.h.t.m($$0).e - this.p.k().a(this.p) < 0.0;
   }

   private boolean b(fkr $$0) {
      return !($$0.g() instanceof bvg $$1) ? false : $$1.b(btr.o) || $$1.b(btr.G);
   }

   private void c(fkr $$0) {
      bos $$1 = bor.a();
      $$1.a("populate_sections_to_compile");
      gpi $$2 = new gpi();
      ji $$3 = $$0.c();
      List<gpk.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.r.iterator();

      while (var6.hasNext()) {
         gpk.b $$5 = (gpk.b)var6.next();
         if ($$5.i() && $$5.a()) {
            boolean $$6 = false;
            if (this.h.n.m().c() == flp.c) {
               ji $$7 = $$5.f().b(8, 8, 8);
               $$6 = $$7.j($$3) < 768.0 || $$5.j();
            } else if (this.h.n.m().c() == flp.b) {
               $$6 = $$5.j();
            }

            if ($$6) {
               $$1.a("build_near_sync");
               this.I.a($$5, $$2);
               $$5.h();
               $$1.c();
            } else {
               $$4.add($$5);
            }
         }
      }

      $$1.b("upload");
      this.I.f();
      $$1.b("schedule_async_compile");

      for (gpk.b $$8 : $$4) {
         $$8.a(this.I, $$2);
         $$8.h();
      }

      $$1.c();
      this.a($$0.b());
   }

   private void a(ffu $$0, ffy $$1, buk $$2, double $$3, double $$4, double $$5, ji $$6, dwx $$7, int $$8) {
      gmr.a($$0, $$1, $$7.a(this.p, $$6, fbf.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, $$8);
   }

   public void a(dfn $$0, ji $$1, dwx $$2, dwx $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(ji $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(kk.a($$3), kk.a($$4), kk.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(kk.a($$7), kk.a($$8), kk.a($$6));
            }
         }
      }
   }

   public void a(ji $$0, dwx $$1, dwx $$2) {
      if (this.h.aE().a($$1, $$2)) {
         this.a($$0.u(), $$0.v(), $$0.w(), $$0.u(), $$0.v(), $$0.w());
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b($$0 - 1, $$1 - 1, $$2 - 1, $$0 + 1, $$1 + 1, $$2 + 1);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2; $$6 <= $$5; $$6++) {
         for (int $$7 = $$0; $$7 <= $$3; $$7++) {
            for (int $$8 = $$1; $$8 <= $$4; $$8++) {
               this.b($$7, $$8, $$6);
            }
         }
      }
   }

   public void b(int $$0, int $$1, int $$2) {
      this.a($$0, $$1, $$2, false);
   }

   private void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.u.a($$0, $$1, $$2, $$3);
   }

   public void a(long $$0) {
      gpk.b $$1 = this.u.a($$0);
      if ($$1 != null) {
         this.q.a($$1);
      }
   }

   public void a(lr $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(lr $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", mb.i.b($$0.a()));
         $$11.a("Parameters", () -> lt.bi.encodeStart(this.p.K_().a(ue.a), $$0).toString());
         $$11.a("Position", () -> p.a(this.p, $$3, $$4, $$5));
         throw new z($$10);
      }
   }

   public <T extends lr> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   gjg b(lr $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gjg b(lr $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fkr $$9 = this.h.j.k();
      aqu $$10 = this.a($$2);
      if ($$1) {
         return this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == aqu.c ? null : this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private aqu a(boolean $$0) {
      aqu $$1 = this.h.n.au().c();
      if ($$0 && $$1 == aqu.c && this.p.A.a(10) == 0) {
         $$1 = aqu.b;
      }

      if ($$1 == aqu.b && this.p.A.a(3) == 0) {
         $$1 = aqu.c;
      }

      return $$1;
   }

   public void a(int $$0, ji $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         aqd $$4 = (aqd)this.w.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new aqd($$0, $$1);
            this.w.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.v);
         ((SortedSet)this.x.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         aqd $$3 = (aqd)this.w.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean o() {
      return this.I.h();
   }

   public void a(dfo $$0) {
      this.q.a($$0);
   }

   public void p() {
      this.q.a();
      this.m.a();
   }

   public void a(Collection<dtz> $$0, Collection<dtz> $$1) {
      synchronized (this.t) {
         this.t.removeAll($$0);
         this.t.addAll($$1);
      }
   }

   public static int a(dfk $$0, ji $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(dfk $$0, dwx $$1, ji $$2) {
      if ($$1.b($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(dgr.a, $$2);
         int $$4 = $$0.a(dgr.b, $$2);
         int $$5 = $$1.k();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(ji $$0) {
      gpk.b $$1 = this.u.a($$0);
      return $$1 != null && $$1.c.get() != gpk.a.a;
   }

   @Nullable
   public fee q() {
      return this.z.q != null ? this.z.q.get() : null;
   }

   @Nullable
   public fee r() {
      return this.z.l != null ? this.z.l.get() : null;
   }

   @Nullable
   public fee s() {
      return this.z.m != null ? this.z.m.get() : null;
   }

   @Nullable
   public fee t() {
      return this.z.n != null ? this.z.n.get() : null;
   }

   @Nullable
   public fee u() {
      return this.z.o != null ? this.z.o.get() : null;
   }

   @Nullable
   public fee v() {
      return this.z.p != null ? this.z.p.get() : null;
   }

   @bag
   public ObjectArrayList<gpk.b> w() {
      return this.r;
   }

   @bag
   public gmm x() {
      return this.q;
   }

   @Nullable
   public gpo y() {
      return this.O;
   }

   public glg z() {
      return this.m;
   }
}
