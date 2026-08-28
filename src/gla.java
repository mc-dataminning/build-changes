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

public class gla implements avw, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   private static final alz e = alz.b("transparency");
   private static final alz f = alz.b("entity_outline");
   public static final int a = 16;
   public static final int b = 8;
   public static final int c = 32;
   private static final int g = 15;
   private final flz h;
   private final grh i;
   private final gno j;
   private final glm k;
   private final gma l = new gma();
   private final gkm m = new gkm();
   private final gmf n = new gmf();
   private final gme o = new gme();
   @Nullable
   private gfd p;
   private final glt q = new glt();
   private final ObjectArrayList<gor.b> r = new ObjectArrayList(10000);
   private final ObjectArrayList<gor.b> s = new ObjectArrayList(50);
   private final Set<dup> t = Sets.newHashSet();
   @Nullable
   private gmc u;
   private int v;
   private final Int2ObjectMap<ari> w = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<ari>> x = new Long2ObjectOpenHashMap();
   @Nullable
   private fev y;
   private final glb z = new glb();
   private int A = Integer.MIN_VALUE;
   private int B = Integer.MIN_VALUE;
   private int C = Integer.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   private double G = Double.MIN_VALUE;
   private double H = Double.MIN_VALUE;
   @Nullable
   private gor I;
   private int J = -1;
   private final List<bvf> K = new ArrayList<>();
   private int L;
   private gov M;
   private boolean N;
   @Nullable
   private gov O;
   @Nullable
   private jh P;
   private int Q;

   public gla(flz $$0, grh $$1, gno $$2, glm $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
   }

   public void a(fli $$0) {
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
   public void a(avv $$0) {
      this.a();
   }

   public void a() {
      if (this.y != null) {
         this.y.a();
      }

      this.y = new few(this.h.aO().k(), this.h.aO().l(), true);
      this.y.a(0.0F, 0.0F, 0.0F, 0.0F);
   }

   @Nullable
   private gli A() {
      if (!flz.O()) {
         return null;
      } else {
         gli $$0 = this.h.ab().a(e, glb.j);
         if ($$0 == null) {
            this.h.n.k().a(flr.b);
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

   public void a(@Nullable gfd $$0) {
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
            this.I = new gor(this.p, this, ae.g(), this.k, this.h.ap(), this.h.ar());
         } else {
            this.I.a(this.p);
         }

         this.m.a();
         gkw.a(flz.N());
         this.J = this.h.n.aH();
         if (this.u != null) {
            this.u.a();
         }

         this.I.g();
         synchronized (this.t) {
            this.t.clear();
         }

         this.u = new gmc(this.I, this.p, this.h.n.aH(), this);
         this.q.a(this.u);
         this.B();
         bvf $$0 = this.h.ao();
         if ($$0 != null) {
            this.u.a(kj.a($$0));
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

   public gor g() {
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
         gor.b $$1 = (gor.b)var2.next();
         if ($$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String k() {
      return "E: " + this.L + "/" + this.p.g() + ", SD: " + this.p.l();
   }

   private void a(fli $$0, gov $$1, boolean $$2, boolean $$3) {
      fbs $$4 = $$0.b();
      if (this.h.n.aH() != this.J) {
         this.e();
      }

      bpo $$5 = bpn.a();
      $$5.a("camera");
      int $$6 = kj.a($$4.a());
      int $$7 = kj.a($$4.b());
      int $$8 = kj.a($$4.c());
      if (this.A != $$6 || this.B != $$7 || this.C != $$8) {
         this.A = $$6;
         this.B = $$7;
         this.C = $$8;
         this.u.a(kj.a($$4));
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

   public static gov a(gov $$0) {
      return new gov($$0).a(8);
   }

   private void b(gov $$0) {
      if (!flz.Q().bx()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         bpn.a().a("apply_frustum");
         this.B();
         this.q.a($$0, this.r, this.s);
         bpn.a().c();
      }
   }

   public void a(gor.b $$0) {
      this.q.a($$0);
   }

   public void a(fbs $$0, Matrix4f $$1, Matrix4f $$2) {
      this.M = new gov($$1, $$2);
      this.M.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(ffu $$0, flp $$1, boolean $$2, fli $$3, gku $$4, glc $$5, Matrix4f $$6, Matrix4f $$7) {
      float $$8 = $$1.a(false);
      RenderSystem.setShaderGameTime(this.p.ac(), $$8);
      this.j.a(this.p, $$3, this.h.w);
      this.i.a(this.p, $$3, this.h.v);
      final bpo $$9 = bpn.a();
      $$9.b("light_update_queue");
      this.p.b();
      $$9.b("light_updates");
      this.p.h().p().a();
      fbs $$10 = $$3.b();
      double $$11 = $$10.a();
      double $$12 = $$10.b();
      double $$13 = $$10.c();
      $$9.b("culling");
      boolean $$14 = this.O != null;
      gov $$15 = $$14 ? this.O : this.M;
      bpn.a().b("captureFrustum");
      if (this.N) {
         this.O = $$14 ? new gov($$6, $$7) : $$15;
         this.O.a($$11, $$12, $$13);
         this.N = false;
      }

      $$9.b("fog");
      float $$16 = $$4.j();
      boolean $$17 = this.h.s.c().a(bae.a($$11), bae.a($$12)) || this.h.m.j().d();
      Vector4f $$18 = gkt.a($$3, $$8, this.h.s, this.h.n.aH(), $$4.c($$8));
      gks $$19 = gkt.a($$3, gkt.d.b, $$18, $$16, $$17, $$8);
      gks $$20 = gkt.a($$3, gkt.d.a, $$18, $$16, $$17, $$8);
      $$9.b("cullEntities");
      boolean $$21 = this.a($$3, $$15, this.K);
      this.L = this.K.size();
      $$9.b("terrain_setup");
      this.a($$3, $$15, $$14, this.h.t.aa_());
      $$9.b("compile_sections");
      this.c($$3);
      Matrix4fStack $$22 = RenderSystem.getModelViewStack();
      $$22.pushMatrix();
      $$22.mul($$6);
      fep $$23 = new fep();
      this.z.k = $$23.a("main", this.h.h());
      int $$24 = this.h.h().c;
      int $$25 = this.h.h().d;
      ffv $$26 = new ffv($$24, $$25, true);
      gli $$27 = this.A();
      if ($$27 != null) {
         this.z.l = $$23.a("translucent", $$26);
         this.z.m = $$23.a("item_entity", $$26);
         this.z.n = $$23.a("particles", $$26);
         this.z.o = $$23.a("weather", $$26);
         this.z.p = $$23.a("clouds", $$26);
      }

      if (this.y != null) {
         this.z.q = $$23.a("entity_outline", this.y);
      }

      feq $$28 = $$23.a("clear");
      this.z.k = $$28.b(this.z.k);
      $$28.a(() -> {
         RenderSystem.clearColor($$18.x, $$18.y, $$18.z, 0.0F);
         RenderSystem.clear(16640);
      });
      if (!$$17) {
         this.a($$23, $$3, $$8, $$20);
      }

      this.a($$23, $$15, $$3, $$6, $$7, $$19, $$2, $$21, $$1, $$9);
      gli $$29 = this.h.ab().a(f, glb.i);
      if ($$21 && $$29 != null) {
         $$29.a($$23, $$24, $$25, this.z);
      }

      this.a($$23, $$3, $$5, $$8, $$19);
      fll $$30 = this.h.n.aC();
      if ($$30 != fll.a) {
         float $$31 = this.p.c().a();
         if (!Float.isNaN($$31)) {
            float $$32 = (float)this.v + $$8;
            int $$33 = this.p.h($$8);
            this.a($$23, $$6, $$7, $$30, $$3.b(), $$32, $$33, $$31 + 0.33F);
         }
      }

      this.a($$23, $$5, $$3.b(), $$8, $$19);
      if ($$27 != null) {
         $$27.a($$23, $$24, $$25, this.z);
      }

      this.a($$23, $$10, $$19);
      $$9.b("framegraph");
      $$23.a($$0, new fep.c() {
         @Override
         public void c(String $$0) {
            $$9.a($$0);
         }

         @Override
         public void d(String $$0) {
            $$9.c();
         }
      });
      this.h.h().a(false);
      this.K.clear();
      this.z.a();
      $$22.popMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.setShaderFog(gks.a);
   }

   private void a(fep $$0, gov $$1, fli $$2, Matrix4f $$3, Matrix4f $$4, gks $$5, boolean $$6, boolean $$7, flp $$8, bpo $$9) {
      feq $$10 = $$0.a("main");
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

      ffx<fev> $$11 = this.z.k;
      ffx<fev> $$12 = this.z.l;
      ffx<fev> $$13 = this.z.m;
      ffx<fev> $$14 = this.z.o;
      ffx<fev> $$15 = this.z.q;
      $$10.a(() -> {
         RenderSystem.setShaderFog($$5);
         float $$13x = $$8.a(false);
         fbs $$14x = $$2.b();
         double $$15x = $$14x.a();
         double $$16 = $$14x.b();
         double $$17 = $$14x.c();
         $$9.a("terrain");
         this.a(glo.c(), $$15x, $$16, $$17, $$3, $$4);
         this.a(glo.d(), $$15x, $$16, $$17, $$3, $$4);
         this.a(glo.e(), $$15x, $$16, $$17, $$3, $$4);
         if (this.p.c().e()) {
            ffh.a();
         } else {
            ffh.b();
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

         fgl $$18 = new fgl();
         gle.a $$19 = this.k.c();
         gle.a $$20 = this.k.d();
         $$9.b("entities");
         this.a($$18, $$19, $$2, $$8, this.K);
         $$19.a();
         this.a($$18);
         $$9.b("blockentities");
         this.a($$18, $$19, $$20, $$2, $$13x);
         $$19.a();
         this.a($$18);
         $$19.a(glo.c());
         $$19.a(glo.t());
         $$19.a(glo.u());
         $$19.a(glz.h());
         $$19.a(glz.i());
         $$19.a(glz.c());
         $$19.a(glz.d());
         $$19.a(glz.e());
         $$19.a(glz.f());
         $$19.a(glz.g());
         this.k.e().a();
         if ($$6) {
            this.a($$2, $$19, $$18, false);
         }

         $$9.b("debug");
         this.h.l.a($$18, $$1, $$19, $$15x, $$16, $$17);
         $$19.a();
         this.a($$18);
         $$19.a(glz.j());
         $$19.a(glz.a());
         $$19.a(glz.b());
         $$19.a(glo.j());
         $$19.a(glo.l());
         $$19.a(glo.k());
         $$19.a(glo.m());
         $$9.b("destroyProgress");
         this.a($$18, $$2, $$20);
         $$20.b();
         this.a($$18);
         $$19.a(glo.i());
         $$19.b();
         if ($$12 != null) {
            $$12.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$12.get().f();
            $$12.get().a($$11.get());
         }

         $$9.b("translucent");
         this.a(glo.f(), $$15x, $$16, $$17, $$3, $$4);
         $$9.b("string");
         this.a(glo.s(), $$15x, $$16, $$17, $$3, $$4);
         if ($$6) {
            this.a($$2, $$19, $$18, true);
         }

         $$19.b();
         $$9.c();
      });
   }

   private void a(fep $$0, fli $$1, glc $$2, float $$3, gks $$4) {
      feq $$5 = $$0.a("particles");
      if (this.z.n != null) {
         this.z.n = $$5.b(this.z.n);
         $$5.a(this.z.k);
      } else {
         this.z.k = $$5.b(this.z.k);
      }

      ffx<fev> $$6 = this.z.k;
      ffx<fev> $$7 = this.z.n;
      $$5.a(() -> {
         RenderSystem.setShaderFog($$4);
         if ($$7 != null) {
            $$7.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$7.get().f();
            $$7.get().a($$6.get());
         }

         gln.aN.a();
         this.h.g.a($$2, $$1, $$3);
         gln.aN.b();
      });
   }

   private void a(fep $$0, Matrix4f $$1, Matrix4f $$2, fll $$3, fbs $$4, float $$5, int $$6, float $$7) {
      feq $$8 = $$0.a("clouds");
      if (this.z.p != null) {
         this.z.p = $$8.b(this.z.p);
      } else {
         this.z.k = $$8.b(this.z.k);
      }

      ffx<fev> $$9 = this.z.p;
      $$8.a(() -> {
         if ($$9 != null) {
            $$9.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$9.get().f();
         }

         this.m.a($$6, $$3, $$7, $$1, $$2, $$4, $$5);
      });
   }

   private void a(fep $$0, glc $$1, fbs $$2, float $$3, gks $$4) {
      int $$5 = this.h.n.aH() * 16;
      float $$6 = this.h.j.g();
      feq $$7 = $$0.a("weather");
      if (this.z.o != null) {
         this.z.o = $$7.b(this.z.o);
      } else {
         this.z.k = $$7.b(this.z.k);
      }

      $$7.a(() -> {
         RenderSystem.setShaderFog($$4);
         gln.aO.a();
         this.o.a(this.h.s, $$1, this.v, $$3, $$2);
         this.n.a(this.p.F_(), $$2, (double)$$5, (double)$$6);
         gln.aO.b();
      });
   }

   private void a(fep $$0, fbs $$1, gks $$2) {
      feq $$3 = $$0.a("late_debug");
      this.z.k = $$3.b(this.z.k);
      if (this.z.m != null) {
         this.z.m = $$3.b(this.z.m);
      }

      ffx<fev> $$4 = this.z.k;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         $$4.get().a(false);
         fgl $$3x = new fgl();
         gle.a $$4x = this.k.c();
         this.h.l.a($$3x, $$4x, $$1.d, $$1.e, $$1.f);
         $$4x.a();
         this.a($$3x);
      });
   }

   private boolean a(fli $$0, gov $$1, List<bvf> $$2) {
      fbs $$3 = $$0.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.d();
      bvf.b(bae.a((double)this.h.n.aH() / 8.0, 1.0, 2.5) * this.h.n.g().c());

      for (bvf $$9 : this.p.d()) {
         if (this.i.a($$9, $$1, $$4, $$5, $$6) || $$9.A(this.h.t)) {
            jh $$10 = $$9.dv();
            if ((this.p.e($$10.v()) || this.a($$10))
               && ($$9 != $$0.g() || $$0.i() || $$0.g() instanceof bwb && ((bwb)$$0.g()).fP())
               && (!($$9 instanceof gka) || $$0.g() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.h.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(fgl $$0, gle.a $$1, fli $$2, flp $$3, List<bvf> $$4) {
      fbs $$5 = $$2.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      btn $$9 = this.h.s.t();
      boolean $$10 = this.d();

      for (bvf $$11 : $$4) {
         if ($$11.af == 0) {
            $$11.aa = $$11.dA();
            $$11.ab = $$11.dC();
            $$11.ac = $$11.dG();
         }

         gle $$13;
         if ($$10 && this.h.b($$11)) {
            glg $$12 = this.k.e();
            $$13 = $$12;
            int $$14 = $$11.k_();
            $$12.a(ayp.b($$14), ayp.c($$14), ayp.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(fgl $$0, gle.a $$1, gle.a $$2, fli $$3, float $$4) {
      fbs $$5 = $$3.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator var13 = this.r.iterator();

      while (var13.hasNext()) {
         gor.b $$9 = (gor.b)var13.next();
         List<dup> $$10 = $$9.d().b();
         if (!$$10.isEmpty()) {
            for (dup $$11 : $$10) {
               jh $$12 = $$11.aB_();
               gle $$13 = $$1;
               $$0.a();
               $$0.a((double)$$12.u() - $$6, (double)$$12.v() - $$7, (double)$$12.w() - $$8);
               SortedSet<ari> $$14 = (SortedSet<ari>)this.x.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     fgl.a $$16 = $$0.c();
                     fgp $$17 = new fgm($$2.getBuffer(hdq.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        fgp $$3x = $$1.getBuffer($$2x);
                        return $$2x.S() ? fgs.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.j.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      synchronized (this.t) {
         for (dup $$18 : this.t) {
            jh $$19 = $$18.aB_();
            $$0.a();
            $$0.a((double)$$19.u() - $$6, (double)$$19.v() - $$7, (double)$$19.w() - $$8);
            this.j.a($$18, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(fgl $$0, fli $$1, gle.a $$2) {
      fbs $$3 = $$1.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.x.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<ari>> $$7 = (Entry<SortedSet<ari>>)var11.next();
         jh $$8 = jh.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<ari> $$9 = (SortedSet<ari>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
               fgl.a $$11 = $$0.c();
               fgp $$12 = new fgm($$2.getBuffer(hdq.l.get($$10)), $$11, 1.0F);
               this.h.ap().a(this.p.a_($$8), $$8, this.p, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(fli $$0, gle.a $$1, fgl $$2, boolean $$3) {
      if (this.h.w instanceof fbo $$4) {
         if ($$4.d() != fbq.a.a) {
            jh $$6 = $$4.b();
            dxn $$7 = this.p.a_($$6);
            if (!$$7.l() && this.p.F_().a($$6)) {
               boolean $$8 = gkw.a($$7).U();
               if ($$8 != $$3) {
                  return;
               }

               fbs $$9 = $$0.b();
               Boolean $$10 = this.h.n.v().c();
               if ($$10) {
                  fgp $$11 = $$1.getBuffer(glo.z());
                  this.a($$2, $$11, $$0.g(), $$9.d, $$9.e, $$9.f, $$6, $$7, -16777216);
               }

               fgp $$12 = $$1.getBuffer(glo.y());
               int $$13 = $$10 ? -11010079 : ayp.c(102, -16777216);
               this.a($$2, $$12, $$0.g(), $$9.d, $$9.e, $$9.f, $$6, $$7, $$13);
               $$1.a();
            }
         }
      }
   }

   private void a(fgl $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bvf $$0, double $$1, double $$2, double $$3, float $$4, fgl $$5, gle $$6) {
      double $$7 = bae.d((double)$$4, $$0.aa, $$0.dA());
      double $$8 = bae.d((double)$$4, $$0.ab, $$0.dC());
      double $$9 = bae.d((double)$$4, $$0.ac, $$0.dG());
      this.i.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.i.a($$0, $$4));
   }

   private void a(fbs $$0) {
      if (!this.r.isEmpty()) {
         jh $$1 = jh.a((ka)$$0);
         boolean $$2 = !$$1.equals(this.P);
         bpn.a().a("translucent_sort");
         gor.d $$3 = new gor.d();
         ObjectListIterator $$5 = this.s.iterator();

         while ($$5.hasNext()) {
            gor.b $$4 = (gor.b)$$5.next();
            this.a($$4, $$3, $$0, $$2, true);
         }

         this.Q = this.Q % this.r.size();
         int $$5x = Math.max(this.r.size() / 8, 15);

         while ($$5x-- > 0) {
            int $$6 = this.Q++ % this.r.size();
            this.a((gor.b)this.r.get($$6), $$3, $$0, $$2, false);
         }

         this.P = $$1;
         bpn.a().c();
      }
   }

   private void a(gor.b $$0, gor.d $$1, fbs $$2, boolean $$3, boolean $$4) {
      $$1.b($$2, $$0.g());
      boolean $$5 = !$$1.equals($$0.d.get());
      boolean $$6 = $$3 && ($$1.a() || $$4);
      if (($$6 || $$5) && !$$0.l() && $$0.k()) {
         $$0.a(this.I);
      }
   }

   private void a(glo $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      bpt $$6 = bpn.a().c(() -> "render_" + $$0.b);
      $$6.a($$0::toString);
      boolean $$7 = $$0 != glo.f();
      ObjectListIterator<gor.b> $$8 = this.r.listIterator($$7 ? 0 : this.r.size());
      $$0.a();
      gkn $$9 = RenderSystem.getShader();
      if ($$9 == null) {
         $$0.b();
         $$6.close();
      } else {
         $$9.a(fgq.c.h, $$4, $$5, this.h.aO());
         $$9.b();
         fgc $$10 = $$9.o;

         while ($$7 ? $$8.hasNext() : $$8.hasPrevious()) {
            gor.b $$11 = $$7 ? (gor.b)$$8.next() : (gor.b)$$8.previous();
            if (!$$11.d().a($$0)) {
               fgo $$12 = $$11.a($$0);
               jh $$13 = $$11.f();
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
         fgo.b();
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
      if (this.p.t().i()) {
         this.v++;
      }

      if (this.v % 20 == 0) {
         Iterator<ari> $$0 = this.w.values().iterator();

         while ($$0.hasNext()) {
            ari $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.v - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(ari $$0) {
      long $$1 = $$0.b().a();
      Set<ari> $$2 = (Set<ari>)this.x.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.x.remove($$1);
      }
   }

   private void a(fep $$0, fli $$1, float $$2, gks $$3) {
      etr $$4 = $$1.k();
      if ($$4 != etr.c && $$4 != etr.a && !this.b($$1)) {
         gkq $$5 = this.p.c();
         gkq.d $$6 = $$5.c();
         if ($$6 != gkq.d.a) {
            feq $$7 = $$0.a("sky");
            this.z.k = $$7.b(this.z.k);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               gln.aK.a();
               fgl $$4x = new fgl();
               if ($$6 == gkq.d.c) {
                  this.l.b($$4x);
               } else {
                  fgn $$5x = fgn.b();
                  float $$6x = this.p.a($$2);
                  float $$7x = this.p.f($$2);
                  float $$8 = 1.0F - this.p.d($$2);
                  float $$9 = this.p.i($$2) * $$8;
                  int $$10 = $$5.b($$7x);
                  int $$11 = this.p.ar();
                  int $$12 = this.p.a(this.h.j.k().b(), $$2);
                  float $$13 = ayp.h(ayp.b($$12));
                  float $$14 = ayp.h(ayp.c($$12));
                  float $$15 = ayp.h(ayp.d($$12));
                  this.l.a($$13, $$14, $$15);
                  if ($$5.a($$7x)) {
                     this.l.a($$4x, $$5x, $$6x, $$10);
                  }

                  this.l.a($$4x, $$5x, $$7x, $$11, $$8, $$9, $$3);
                  if (this.a($$2)) {
                     this.l.a($$4x);
                  }
               }
            });
         }
      }
   }

   private boolean a(float $$0) {
      return this.h.t.m($$0).e - this.p.j().a(this.p) < 0.0;
   }

   private boolean b(fli $$0) {
      return !($$0.g() instanceof bwb $$1) ? false : $$1.b(bum.o) || $$1.b(bum.G);
   }

   private void c(fli $$0) {
      bpo $$1 = bpn.a();
      $$1.a("populate_sections_to_compile");
      ete $$2 = this.p.C_();
      gop $$3 = new gop();
      jh $$4 = $$0.c();
      List<gor.b> $$5 = Lists.newArrayList();
      ObjectListIterator var7 = this.r.iterator();

      while (var7.hasNext()) {
         gor.b $$6 = (gor.b)var7.next();
         long $$7 = $$6.g();
         if ($$6.i() && $$6.a() && a($$2, $$7)) {
            boolean $$8 = false;
            if (this.h.n.m().c() == fmf.c) {
               jh $$9 = $$6.f().b(8, 8, 8);
               $$8 = $$9.j($$4) < 768.0 || $$6.j();
            } else if (this.h.n.m().c() == fmf.b) {
               $$8 = $$6.j();
            }

            if ($$8) {
               $$1.a("build_near_sync");
               this.I.a($$6, $$3);
               $$6.h();
               $$1.c();
            } else {
               $$5.add($$6);
            }
         }
      }

      $$1.b("upload");
      this.I.f();
      $$1.b("schedule_async_compile");

      for (gor.b $$10 : $$5) {
         $$10.a(this.I, $$3);
         $$10.h();
      }

      $$1.c();
      this.a($$0.b());
   }

   private static boolean a(ete $$0, long $$1) {
      int $$2 = kj.d($$1);
      int $$3 = kj.b($$1);

      for (int $$4 = $$2 - 1; $$4 <= $$2 + 1; $$4++) {
         for (int $$5 = $$3 - 1; $$5 <= $$3 + 1; $$5++) {
            if (!$$0.a(kj.b($$5, $$4))) {
               return false;
            }
         }
      }

      return true;
   }

   private void a(fgl $$0, fgp $$1, bvf $$2, double $$3, double $$4, double $$5, jh $$6, dxn $$7, int $$8) {
      gly.a($$0, $$1, $$7.a(this.p, $$6, fbx.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, $$8);
   }

   public void a(dgf $$0, jh $$1, dxn $$2, dxn $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(jh $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(kj.a($$3), kj.a($$4), kj.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(kj.a($$7), kj.a($$8), kj.a($$6));
            }
         }
      }
   }

   public void a(jh $$0, dxn $$1, dxn $$2) {
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
      gor.b $$1 = this.u.a($$0);
      if ($$1 != null) {
         this.q.a($$1);
      }
   }

   public void a(lq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(lq $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", ma.i.b($$0.a()));
         $$11.a("Parameters", () -> ls.bh.encodeStart(this.p.K_().a(vl.a), $$0).toString());
         $$11.a("Position", () -> p.a(this.p, $$3, $$4, $$5));
         throw new z($$10);
      }
   }

   public <T extends lq> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   gil b(lq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gil b(lq $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fli $$9 = this.h.j.k();
      arz $$10 = this.a($$2);
      if ($$1) {
         return this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == arz.c ? null : this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private arz a(boolean $$0) {
      arz $$1 = this.h.n.au().c();
      if ($$0 && $$1 == arz.c && this.p.A.a(10) == 0) {
         $$1 = arz.b;
      }

      if ($$1 == arz.b && this.p.A.a(3) == 0) {
         $$1 = arz.c;
      }

      return $$1;
   }

   public void a(int $$0, jh $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         ari $$4 = (ari)this.w.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new ari($$0, $$1);
            this.w.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.v);
         ((SortedSet)this.x.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         ari $$3 = (ari)this.w.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean o() {
      return this.I.h();
   }

   public void a(dgg $$0) {
      this.q.a($$0);
   }

   public void p() {
      this.q.a();
      this.m.a();
   }

   public void a(Collection<dup> $$0, Collection<dup> $$1) {
      synchronized (this.t) {
         this.t.removeAll($$0);
         this.t.addAll($$1);
      }
   }

   public static int a(dgc $$0, jh $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(dgc $$0, dxn $$1, jh $$2) {
      if ($$1.b($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(dhj.a, $$2);
         int $$4 = $$0.a(dhj.b, $$2);
         int $$5 = $$1.k();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(jh $$0) {
      gor.b $$1 = this.u.a($$0);
      return $$1 != null && $$1.c.get() != gor.a.a;
   }

   @Nullable
   public fev q() {
      return this.z.q != null ? this.z.q.get() : null;
   }

   @Nullable
   public fev r() {
      return this.z.l != null ? this.z.l.get() : null;
   }

   @Nullable
   public fev s() {
      return this.z.m != null ? this.z.m.get() : null;
   }

   @Nullable
   public fev t() {
      return this.z.n != null ? this.z.n.get() : null;
   }

   @Nullable
   public fev u() {
      return this.z.o != null ? this.z.o.get() : null;
   }

   @Nullable
   public fev v() {
      return this.z.p != null ? this.z.p.get() : null;
   }

   @bbl
   public ObjectArrayList<gor.b> w() {
      return this.r;
   }

   @bbl
   public glt x() {
      return this.q;
   }

   @Nullable
   public gov y() {
      return this.O;
   }

   public gkm z() {
      return this.m;
   }
}
