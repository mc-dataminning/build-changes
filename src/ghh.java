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

public class ghh implements auw, AutoCloseable {
   private static final Logger c = LogUtils.getLogger();
   private static final ale d = ale.b("transparency");
   private static final ale e = ale.b("entity_outline");
   public static final int a = 16;
   public static final int b = 8;
   private static final int f = 15;
   private final fip g;
   private final gnm h;
   private final gjv i;
   private final ght j;
   private final gih k = new gih();
   private final ggt l = new ggt();
   private final gim m = new gim();
   private final gil n = new gil();
   @Nullable
   private gbm o;
   private final gia p = new gia();
   private final ObjectArrayList<gky.b> q = new ObjectArrayList(10000);
   private final Set<drv> r = Sets.newHashSet();
   @Nullable
   private gij s;
   private int t;
   private final Int2ObjectMap<aql> u = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aql>> v = new Long2ObjectOpenHashMap();
   @Nullable
   private fbs w;
   private final ghi x = new ghi();
   private int y = Integer.MIN_VALUE;
   private int z = Integer.MIN_VALUE;
   private int A = Integer.MIN_VALUE;
   private double B = Double.MIN_VALUE;
   private double C = Double.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   @Nullable
   private gky G;
   private int H = -1;
   private final List<btr> I = new ArrayList<>();
   private int J;
   private glc K;
   private boolean L;
   @Nullable
   private glc M;
   @Nullable
   private eyw N;

   public ghh(fip $$0, gnm $$1, gjv $$2, ght $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
   }

   public void a(fhy $$0) {
      this.n.a(this.g.s, $$0, this.t, this.g.n.at().c());
   }

   @Override
   public void close() {
      if (this.w != null) {
         this.w.a();
      }

      this.k.close();
      this.l.close();
   }

   @Override
   public void a(auv $$0) {
      this.a();
   }

   public void a() {
      if (this.w != null) {
         this.w.a();
      }

      this.w = new fbt(this.g.aP().l(), this.g.aP().m(), true);
      this.w.a(0.0F, 0.0F, 0.0F, 0.0F);
   }

   @Nullable
   private ghp A() {
      if (!fip.O()) {
         return null;
      } else {
         ghp $$0 = this.g.ab().a(d, ghi.j);
         if ($$0 == null) {
            this.g.n.k().a(fih.b);
            this.g.n.ay();
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
         this.w.d(this.g.aP().l(), this.g.aP().m());
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.g.j.a() && this.w != null && this.g.t != null;
   }

   public void a(@Nullable gbm $$0) {
      this.y = Integer.MIN_VALUE;
      this.z = Integer.MIN_VALUE;
      this.A = Integer.MIN_VALUE;
      this.h.a($$0);
      this.o = $$0;
      if ($$0 != null) {
         this.e();
      } else {
         if (this.s != null) {
            this.s.a();
            this.s = null;
         }

         if (this.G != null) {
            this.G.i();
         }

         this.G = null;
         this.r.clear();
         this.p.a(null);
         this.q.clear();
      }
   }

   public void e() {
      if (this.o != null) {
         this.o.f();
         if (this.G == null) {
            this.G = new gky(this.o, this, ad.g(), this.j, this.g.ap(), this.g.ar());
         } else {
            this.G.a(this.o);
         }

         this.l.a();
         ghd.a(fip.N());
         this.H = this.g.n.aG();
         if (this.s != null) {
            this.s.a();
         }

         this.G.g();
         synchronized (this.r) {
            this.r.clear();
         }

         this.s = new gij(this.G, this.o, this.g.n.aG(), this);
         this.p.a(this.s);
         this.q.clear();
         btr $$0 = this.g.ao();
         if ($$0 != null) {
            this.s.a(kh.a($$0));
         }
      }
   }

   public void a(int $$0, int $$1) {
      this.p();
      if (this.w != null) {
         this.w.a($$0, $$1);
      }
   }

   public String f() {
      int $$0 = this.s.f.length;
      int $$1 = this.j();
      return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.g.E ? "(s) " : "", this.H, this.G == null ? "null" : this.G.a());
   }

   public gky g() {
      return this.G;
   }

   public double h() {
      return (double)this.s.f.length;
   }

   public double i() {
      return (double)this.H;
   }

   public int j() {
      int $$0 = 0;
      ObjectListIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         gky.b $$1 = (gky.b)var2.next();
         if ($$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String k() {
      return "E: " + this.J + "/" + this.o.g() + ", SD: " + this.o.l();
   }

   private void a(fhy $$0, glc $$1, boolean $$2, boolean $$3) {
      eyw $$4 = $$0.b();
      if (this.g.n.aG() != this.H) {
         this.e();
      }

      bog $$5 = this.o.ah();
      $$5.a("camera");
      int $$6 = kh.a($$4.a());
      int $$7 = kh.a($$4.b());
      int $$8 = kh.a($$4.c());
      if (this.y != $$6 || this.z != $$7 || this.A != $$8) {
         this.y = $$6;
         this.z = $$7;
         this.A = $$8;
         this.s.a(kh.a($$4));
      }

      this.G.a($$4);
      $$5.b("cull");
      double $$9 = Math.floor($$4.d / 8.0);
      double $$10 = Math.floor($$4.e / 8.0);
      double $$11 = Math.floor($$4.f / 8.0);
      if ($$9 != this.B || $$10 != this.C || $$11 != this.D) {
         this.p.a();
      }

      this.B = $$9;
      this.C = $$10;
      this.D = $$11;
      $$5.b("update");
      if (!$$2) {
         boolean $$12 = this.g.E;
         if ($$3 && this.o.a_($$0.c()).s()) {
            $$12 = false;
         }

         $$5.a("section_occlusion_graph");
         this.p.a($$12, $$0, $$1, this.q, this.o.h().a());
         $$5.c();
         double $$13 = Math.floor((double)($$0.d() / 2.0F));
         double $$14 = Math.floor((double)($$0.e() / 2.0F));
         if (this.p.b() || $$13 != this.E || $$14 != this.F) {
            this.b(a($$1));
            this.E = $$13;
            this.F = $$14;
         }
      }

      $$5.c();
   }

   public static glc a(glc $$0) {
      return new glc($$0).a(8);
   }

   private void b(glc $$0) {
      if (!fip.Q().by()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.g.aK().a("apply_frustum");
         this.q.clear();
         this.p.a($$0, this.q);
         this.g.aK().c();
      }
   }

   public void a(gky.b $$0) {
      this.p.a($$0);
   }

   public void a(eyw $$0, Matrix4f $$1, Matrix4f $$2) {
      this.K = new glc($$1, $$2);
      this.K.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(fcr $$0, fif $$1, boolean $$2, fhy $$3, ghb $$4, ghj $$5, Matrix4f $$6, Matrix4f $$7) {
      float $$8 = $$1.a(false);
      RenderSystem.setShaderGameTime(this.o.aa(), $$8);
      this.i.a(this.o, $$3, this.g.w);
      this.h.a(this.o, $$3, this.g.v);
      final bog $$9 = this.o.ah();
      $$9.b("light_update_queue");
      this.o.b();
      $$9.b("light_updates");
      this.o.h().p().a();
      eyw $$10 = $$3.b();
      double $$11 = $$10.a();
      double $$12 = $$10.b();
      double $$13 = $$10.c();
      $$9.b("culling");
      boolean $$14 = this.M != null;
      glc $$15 = $$14 ? this.M : this.K;
      this.g.aK().b("captureFrustum");
      if (this.L) {
         this.M = $$14 ? new glc($$6, $$7) : $$15;
         this.M.a($$11, $$12, $$13);
         this.L = false;
      }

      $$9.b("fog");
      float $$16 = $$4.j();
      boolean $$17 = this.g.s.c().a(azf.a($$11), azf.a($$12)) || this.g.m.j().d();
      Vector4f $$18 = gha.a($$3, $$8, this.g.s, this.g.n.aG(), $$4.c($$8));
      ggz $$19 = gha.a($$3, gha.d.b, $$18, $$16, $$17, $$8);
      ggz $$20 = gha.a($$3, gha.d.a, $$18, $$16, $$17, $$8);
      $$9.b("cullEntities");
      boolean $$21 = this.a($$3, $$15, this.I);
      this.J = this.I.size();
      $$9.b("terrain_setup");
      this.a($$3, $$15, $$14, this.g.t.Q_());
      $$9.b("compile_sections");
      this.c($$3);
      Matrix4fStack $$22 = RenderSystem.getModelViewStack();
      $$22.pushMatrix();
      $$22.mul($$6);
      fbm $$23 = new fbm();
      this.x.k = $$23.a("main", this.g.h());
      int $$24 = this.g.h().c;
      int $$25 = this.g.h().d;
      fcs $$26 = new fcs($$24, $$25, true);
      ghp $$27 = this.A();
      if ($$27 != null) {
         this.x.l = $$23.a("translucent", $$26);
         this.x.m = $$23.a("item_entity", $$26);
         this.x.n = $$23.a("particles", $$26);
         this.x.o = $$23.a("weather", $$26);
         this.x.p = $$23.a("clouds", $$26);
      }

      if (this.w != null) {
         this.x.q = $$23.a("entity_outline", this.w);
      }

      fbn $$28 = $$23.a("clear");
      this.x.k = $$28.b(this.x.k);
      $$28.a(() -> {
         RenderSystem.clearColor($$18.x, $$18.y, $$18.z, 0.0F);
         RenderSystem.clear(16640);
      });
      if (!$$17) {
         this.a($$23, $$3, $$8, $$20);
      }

      this.a($$23, $$15, $$3, $$6, $$7, $$19, $$2, $$21, $$1, $$9);
      ghp $$29 = this.g.ab().a(e, ghi.i);
      if ($$21 && $$29 != null) {
         $$29.a($$23, $$24, $$25, this.x);
      }

      this.a($$23, $$3, $$5, $$8, $$19);
      fib $$30 = this.g.n.aB();
      if ($$30 != fib.a) {
         float $$31 = this.o.c().a();
         if (!Float.isNaN($$31)) {
            float $$32 = (float)this.t + $$8;
            int $$33 = this.o.h($$8);
            this.a($$23, $$6, $$7, $$30, $$3.b(), $$32, $$33, $$31 + 0.33F);
         }
      }

      this.a($$23, $$5, $$3.b(), $$8, $$19);
      if ($$27 != null) {
         $$27.a($$23, $$24, $$25, this.x);
      }

      this.a($$23, $$10, $$19);
      $$9.b("framegraph");
      $$23.a($$0, new fbm.c() {
         @Override
         public void c(String $$0) {
            $$9.a($$0);
         }

         @Override
         public void d(String $$0) {
            $$9.c();
         }
      });
      this.g.h().a(false);
      this.I.clear();
      this.x.a();
      $$22.popMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.setShaderFog(ggz.a);
   }

   private void a(fbm $$0, glc $$1, fhy $$2, Matrix4f $$3, Matrix4f $$4, ggz $$5, boolean $$6, boolean $$7, fif $$8, bog $$9) {
      fbn $$10 = $$0.a("main");
      this.x.k = $$10.b(this.x.k);
      if (this.x.l != null) {
         this.x.l = $$10.b(this.x.l);
      }

      if (this.x.m != null) {
         this.x.m = $$10.b(this.x.m);
      }

      if (this.x.o != null) {
         this.x.o = $$10.b(this.x.o);
      }

      if ($$7 && this.x.q != null) {
         this.x.q = $$10.b(this.x.q);
      }

      fcu<fbs> $$11 = this.x.k;
      fcu<fbs> $$12 = this.x.l;
      fcu<fbs> $$13 = this.x.m;
      fcu<fbs> $$14 = this.x.o;
      fcu<fbs> $$15 = this.x.q;
      $$10.a(() -> {
         RenderSystem.setShaderFog($$5);
         float $$13x = $$8.a(false);
         eyw $$14x = $$2.b();
         double $$15x = $$14x.a();
         double $$16 = $$14x.b();
         double $$17 = $$14x.c();
         $$9.a("terrain");
         this.a(ghv.c(), $$15x, $$16, $$17, $$3, $$4);
         this.a(ghv.d(), $$15x, $$16, $$17, $$3, $$4);
         this.a(ghv.e(), $$15x, $$16, $$17, $$3, $$4);
         if (this.o.c().e()) {
            fce.a();
         } else {
            fce.b();
         }

         if ($$13 != null) {
            $$13.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$13.get().f();
            $$13.get().a(this.g.h());
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

         fdi $$18 = new fdi();
         ghl.a $$19 = this.j.c();
         ghl.a $$20 = this.j.d();
         $$9.b("entities");
         this.a($$18, $$19, $$2, $$8, this.I);
         $$19.a();
         this.a($$18);
         $$9.b("blockentities");
         this.a($$18, $$19, $$20, $$2, $$13x);
         $$19.a();
         this.a($$18);
         $$19.a(ghv.c());
         $$19.a(ghv.t());
         $$19.a(ghv.u());
         $$19.a(gig.h());
         $$19.a(gig.i());
         $$19.a(gig.c());
         $$19.a(gig.d());
         $$19.a(gig.e());
         $$19.a(gig.f());
         $$19.a(gig.g());
         this.j.e().a();
         if ($$6) {
            this.a($$2, $$19, $$18, false);
         }

         $$9.b("debug");
         this.g.l.a($$18, $$1, $$19, $$15x, $$16, $$17);
         $$19.a();
         this.a($$18);
         $$19.a(gig.j());
         $$19.a(gig.a());
         $$19.a(gig.b());
         $$19.a(ghv.j());
         $$19.a(ghv.l());
         $$19.a(ghv.k());
         $$19.a(ghv.m());
         $$9.b("destroyProgress");
         this.a($$18, $$2, $$20);
         $$20.b();
         this.a($$18);
         $$19.a(ghv.i());
         $$19.b();
         if ($$12 != null) {
            $$12.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$12.get().f();
            $$12.get().a($$11.get());
         }

         $$9.b("translucent");
         this.a(ghv.f(), $$15x, $$16, $$17, $$3, $$4);
         $$9.b("string");
         this.a(ghv.s(), $$15x, $$16, $$17, $$3, $$4);
         if ($$6) {
            this.a($$2, $$19, $$18, true);
         }

         $$19.b();
         $$9.c();
      });
   }

   private void a(fbm $$0, fhy $$1, ghj $$2, float $$3, ggz $$4) {
      fbn $$5 = $$0.a("particles");
      if (this.x.n != null) {
         this.x.n = $$5.b(this.x.n);
         $$5.a(this.x.k);
      } else {
         this.x.k = $$5.b(this.x.k);
      }

      fcu<fbs> $$6 = this.x.k;
      fcu<fbs> $$7 = this.x.n;
      $$5.a(() -> {
         RenderSystem.setShaderFog($$4);
         if ($$7 != null) {
            $$7.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$7.get().f();
            $$7.get().a($$6.get());
         }

         ghu.aN.a();
         this.g.g.a($$2, $$1, $$3);
         ghu.aN.b();
      });
   }

   private void a(fbm $$0, Matrix4f $$1, Matrix4f $$2, fib $$3, eyw $$4, float $$5, int $$6, float $$7) {
      fbn $$8 = $$0.a("clouds");
      if (this.x.p != null) {
         this.x.p = $$8.b(this.x.p);
      } else {
         this.x.k = $$8.b(this.x.k);
      }

      fcu<fbs> $$9 = this.x.p;
      $$8.a(() -> {
         if ($$9 != null) {
            $$9.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$9.get().f();
         }

         this.l.a($$6, $$3, $$7, $$1, $$2, $$4, $$5);
      });
   }

   private void a(fbm $$0, ghj $$1, eyw $$2, float $$3, ggz $$4) {
      int $$5 = this.g.n.aG() * 16;
      float $$6 = this.g.j.g();
      fbn $$7 = $$0.a("weather");
      if (this.x.o != null) {
         this.x.o = $$7.b(this.x.o);
      } else {
         this.x.k = $$7.b(this.x.k);
      }

      $$7.a(() -> {
         RenderSystem.setShaderFog($$4);
         ghu.aO.a();
         this.n.a(this.g.s, $$1, this.t, $$3, $$2);
         this.m.a(this.o.B_(), $$2, (double)$$5, (double)$$6);
         ghu.aO.b();
      });
   }

   private void a(fbm $$0, eyw $$1, ggz $$2) {
      fbn $$3 = $$0.a("late_debug");
      this.x.k = $$3.b(this.x.k);
      if (this.x.m != null) {
         this.x.m = $$3.b(this.x.m);
      }

      fcu<fbs> $$4 = this.x.k;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         $$4.get().a(false);
         fdi $$3x = new fdi();
         ghl.a $$4x = this.j.c();
         this.g.l.a($$3x, $$4x, $$1.d, $$1.e, $$1.f);
         $$4x.a();
         this.a($$3x);
      });
   }

   private boolean a(fhy $$0, glc $$1, List<btr> $$2) {
      eyw $$3 = $$0.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.d();
      btr.b(azf.a((double)this.g.n.aG() / 8.0, 1.0, 2.5) * this.g.n.g().c());

      for (btr $$9 : this.o.d()) {
         if (this.h.a($$9, $$1, $$4, $$5, $$6) || $$9.A(this.g.t)) {
            jf $$10 = $$9.ds();
            if ((this.o.e($$10.v()) || this.a($$10))
               && ($$9 != $$0.g() || $$0.i() || $$0.g() instanceof bun && ((bun)$$0.g()).fN())
               && (!($$9 instanceof ggh) || $$0.g() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.g.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(fdi $$0, ghl.a $$1, fhy $$2, fif $$3, List<btr> $$4) {
      eyw $$5 = $$2.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      bsb $$9 = this.g.s.s();
      boolean $$10 = this.d();

      for (btr $$11 : $$4) {
         if ($$11.ag == 0) {
            $$11.ab = $$11.dx();
            $$11.ac = $$11.dz();
            $$11.ad = $$11.dD();
         }

         ghl $$13;
         if ($$10 && this.g.b($$11)) {
            ghn $$12 = this.j.e();
            $$13 = $$12;
            int $$14 = $$11.i_();
            $$12.a(axq.b($$14), axq.c($$14), axq.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(fdi $$0, ghl.a $$1, ghl.a $$2, fhy $$3, float $$4) {
      eyw $$5 = $$3.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator var13 = this.q.iterator();

      while (var13.hasNext()) {
         gky.b $$9 = (gky.b)var13.next();
         List<drv> $$10 = $$9.d().b();
         if (!$$10.isEmpty()) {
            for (drv $$11 : $$10) {
               jf $$12 = $$11.aC_();
               ghl $$13 = $$1;
               $$0.a();
               $$0.a((double)$$12.u() - $$6, (double)$$12.v() - $$7, (double)$$12.w() - $$8);
               SortedSet<aql> $$14 = (SortedSet<aql>)this.v.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     fdi.a $$16 = $$0.c();
                     fdm $$17 = new fdj($$2.getBuffer(gzp.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        fdm $$3x = $$1.getBuffer($$2x);
                        return $$2x.R() ? fdp.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.i.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      synchronized (this.r) {
         for (drv $$18 : this.r) {
            jf $$19 = $$18.aC_();
            $$0.a();
            $$0.a((double)$$19.u() - $$6, (double)$$19.v() - $$7, (double)$$19.w() - $$8);
            this.i.a($$18, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(fdi $$0, fhy $$1, ghl.a $$2) {
      eyw $$3 = $$1.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.v.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<aql>> $$7 = (Entry<SortedSet<aql>>)var11.next();
         jf $$8 = jf.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<aql> $$9 = (SortedSet<aql>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
               fdi.a $$11 = $$0.c();
               fdm $$12 = new fdj($$2.getBuffer(gzp.l.get($$10)), $$11, 1.0F);
               this.g.ap().a(this.o.a_($$8), $$8, this.o, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(fhy $$0, ghl.a $$1, fdi $$2, boolean $$3) {
      if (this.g.w instanceof eys $$4) {
         if ($$4.d() != eyu.a.a) {
            jf $$6 = $$4.b();
            dus $$7 = this.o.a_($$6);
            if (!$$7.l() && this.o.B_().a($$6)) {
               boolean $$8 = ghd.a($$7).T();
               if ($$8 != $$3) {
                  return;
               }

               fdm $$9 = $$1.getBuffer(ghv.y());
               eyw $$10 = $$0.b();
               this.a($$2, $$9, $$0.g(), $$10.d, $$10.e, $$10.f, $$6, $$7);
               $$1.a();
            }
         }
      }
   }

   private void a(fdi $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(btr $$0, double $$1, double $$2, double $$3, float $$4, fdi $$5, ghl $$6) {
      double $$7 = azf.d((double)$$4, $$0.ab, $$0.dx());
      double $$8 = azf.d((double)$$4, $$0.ac, $$0.dz());
      double $$9 = azf.d((double)$$4, $$0.ad, $$0.dD());
      this.h.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.h.a($$0, $$4));
   }

   private void a(eyw $$0, ghv $$1) {
      if (this.N == null || !($$0.g(this.N) <= 1.0)) {
         this.g.aK().a("translucent_sort");
         int $$2 = kh.a($$0.d);
         int $$3 = kh.a($$0.e);
         int $$4 = kh.a($$0.f);
         boolean $$5 = this.N == null || $$2 != kh.a(this.N.d) || $$4 != kh.a(this.N.e) || $$3 != kh.a(this.N.f);
         this.N = $$0;
         int $$6 = 0;
         ObjectListIterator var8 = this.q.iterator();

         while (var8.hasNext()) {
            gky.b $$7 = (gky.b)var8.next();
            if ($$6 < 15 && ($$5 || $$7.a($$2, $$3, $$4)) && $$7.a($$1, this.G)) {
               $$6++;
            }
         }

         this.g.aK().c();
      }
   }

   private void a(ghv $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      this.g.aK().a(() -> "render_" + $$0);
      boolean $$6 = $$0 != ghv.f();
      ObjectListIterator<gky.b> $$7 = this.q.listIterator($$6 ? 0 : this.q.size());
      $$0.a();
      ggu $$8 = RenderSystem.getShader();
      if ($$8 == null) {
         $$0.b();
      } else {
         $$8.a(fdn.c.h, $$4, $$5, this.g.aP());
         $$8.b();
         fcz $$9 = $$8.o;

         while ($$6 ? $$7.hasNext() : $$7.hasPrevious()) {
            gky.b $$10 = $$6 ? (gky.b)$$7.next() : (gky.b)$$7.previous();
            if (!$$10.d().a($$0)) {
               fdl $$11 = $$10.a($$0);
               jf $$12 = $$10.f();
               if ($$9 != null) {
                  $$9.a((float)((double)$$12.u() - $$1), (float)((double)$$12.v() - $$2), (float)((double)$$12.w() - $$3));
                  $$9.b();
               }

               $$11.a();
               $$11.c();
            }
         }

         if ($$9 != null) {
            $$9.a(0.0F, 0.0F, 0.0F);
         }

         $$8.a();
         fdl.b();
         this.g.aK().c();
         $$0.b();
      }
   }

   public void l() {
      this.L = true;
   }

   public void m() {
      this.M = null;
   }

   public void n() {
      if (this.o.s().i()) {
         this.t++;
      }

      if (this.t % 20 == 0) {
         Iterator<aql> $$0 = this.u.values().iterator();

         while ($$0.hasNext()) {
            aql $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.t - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(aql $$0) {
      long $$1 = $$0.b().a();
      Set<aql> $$2 = (Set<aql>)this.v.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.v.remove($$1);
      }
   }

   private void a(fbm $$0, fhy $$1, float $$2, ggz $$3) {
      eqv $$4 = $$1.k();
      if ($$4 != eqv.c && $$4 != eqv.a && !this.b($$1)) {
         ggx $$5 = this.o.c();
         ggx.d $$6 = $$5.c();
         if ($$6 != ggx.d.a) {
            fbn $$7 = $$0.a("sky");
            this.x.k = $$7.b(this.x.k);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               ghu.aK.a();
               fdi $$4x = new fdi();
               if ($$6 == ggx.d.c) {
                  this.k.b($$4x);
               } else {
                  fdk $$5x = fdk.b();
                  float $$6x = this.o.a($$2);
                  float $$7x = this.o.f($$2);
                  float $$8 = 1.0F - this.o.d($$2);
                  float $$9 = this.o.i($$2) * $$8;
                  int $$10 = $$5.b($$7x);
                  int $$11 = this.o.as();
                  int $$12 = this.o.a(this.g.j.k().b(), $$2);
                  float $$13 = axq.h(axq.b($$12));
                  float $$14 = axq.h(axq.c($$12));
                  float $$15 = axq.h(axq.d($$12));
                  this.k.a($$13, $$14, $$15);
                  if ($$5.a($$7x)) {
                     this.k.a($$4x, $$5x, $$6x, $$10);
                  }

                  this.k.a($$4x, $$5x, $$7x, $$11, $$8, $$9, $$3);
                  if (this.a($$2)) {
                     this.k.a($$4x);
                  }
               }
            });
         }
      }
   }

   private boolean a(float $$0) {
      return this.g.t.m($$0).e - this.o.j().a(this.o) < 0.0;
   }

   private boolean b(fhy $$0) {
      return !($$0.g() instanceof bun $$1) ? false : $$1.b(bta.o) || $$1.b(bta.G);
   }

   private void c(fhy $$0) {
      this.g.aK().a("populate_sections_to_compile");
      eqi $$1 = this.o.y_();
      gkw $$2 = new gkw();
      jf $$3 = $$0.c();
      List<gky.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.q.iterator();

      while (var6.hasNext()) {
         gky.b $$5 = (gky.b)var6.next();
         long $$6 = $$5.g();
         if ($$5.i() && $$5.a() && a($$1, $$6)) {
            boolean $$7 = false;
            if (this.g.n.m().c() == fiv.c) {
               jf $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.j();
            } else if (this.g.n.m().c() == fiv.b) {
               $$7 = $$5.j();
            }

            if ($$7) {
               this.g.aK().a("build_near_sync");
               this.G.a($$5, $$2);
               $$5.h();
               this.g.aK().c();
            } else {
               $$4.add($$5);
            }
         }
      }

      this.g.aK().b("upload");
      this.G.f();
      this.g.aK().b("schedule_async_compile");

      for (gky.b $$9 : $$4) {
         $$9.a(this.G, $$2);
         $$9.h();
      }

      this.g.aK().c();
      this.a($$0.b(), ghv.f());
   }

   private static boolean a(eqi $$0, long $$1) {
      int $$2 = kh.d($$1);
      int $$3 = kh.b($$1);

      for (int $$4 = $$2 - 1; $$4 <= $$2 + 1; $$4++) {
         for (int $$5 = $$3 - 1; $$5 <= $$3 + 1; $$5++) {
            if (!$$0.a(kh.b($$5, $$4))) {
               return false;
            }
         }
      }

      return true;
   }

   private void a(fdi $$0, fdm $$1, btr $$2, double $$3, double $$4, double $$5, jf $$6, dus $$7) {
      gif.a($$0, $$1, $$7.a(this.o, $$6, ezb.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   public void a(ddo $$0, jf $$1, dus $$2, dus $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(jf $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(kh.a($$3), kh.a($$4), kh.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(kh.a($$7), kh.a($$8), kh.a($$6));
            }
         }
      }
   }

   public void a(jf $$0, dus $$1, dus $$2) {
      if (this.g.aE().a($$1, $$2)) {
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
      this.s.a($$0, $$1, $$2, $$3);
   }

   public void a(long $$0) {
      gky.b $$1 = this.s.a($$0);
      if ($$1 != null) {
         this.p.a($$1);
      }
   }

   public void a(lm $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(lm $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", lv.i.b($$0.a()));
         $$11.a("Parameters", () -> lo.bf.encodeStart(this.o.G_().a(uu.a), $$0).toString());
         $$11.a("Position", () -> p.a(this.o, $$3, $$4, $$5));
         throw new z($$10);
      }
   }

   public <T extends lm> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   get b(lm $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private get b(lm $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fhy $$9 = this.g.j.k();
      arc $$10 = this.a($$2);
      if ($$1) {
         return this.g.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == arc.c ? null : this.g.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private arc a(boolean $$0) {
      arc $$1 = this.g.n.at().c();
      if ($$0 && $$1 == arc.c && this.o.z.a(10) == 0) {
         $$1 = arc.b;
      }

      if ($$1 == arc.b && this.o.z.a(3) == 0) {
         $$1 = arc.c;
      }

      return $$1;
   }

   public void a(int $$0, jf $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         aql $$4 = (aql)this.u.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new aql($$0, $$1);
            this.u.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.t);
         ((SortedSet)this.v.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         aql $$3 = (aql)this.u.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean o() {
      return this.G.h();
   }

   public void a(ddp $$0) {
      this.p.a($$0);
   }

   public void p() {
      this.p.a();
      this.l.a();
   }

   public void a(Collection<drv> $$0, Collection<drv> $$1) {
      synchronized (this.r) {
         this.r.removeAll($$0);
         this.r.addAll($$1);
      }
   }

   public static int a(ddl $$0, jf $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(ddl $$0, dus $$1, jf $$2) {
      if ($$1.b($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(des.a, $$2);
         int $$4 = $$0.a(des.b, $$2);
         int $$5 = $$1.k();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(jf $$0) {
      gky.b $$1 = this.s.a($$0);
      return $$1 != null && $$1.c.get() != gky.a.a;
   }

   @Nullable
   public fbs q() {
      return this.x.q != null ? this.x.q.get() : null;
   }

   @Nullable
   public fbs r() {
      return this.x.l != null ? this.x.l.get() : null;
   }

   @Nullable
   public fbs s() {
      return this.x.m != null ? this.x.m.get() : null;
   }

   @Nullable
   public fbs t() {
      return this.x.n != null ? this.x.n.get() : null;
   }

   @Nullable
   public fbs u() {
      return this.x.o != null ? this.x.o.get() : null;
   }

   @Nullable
   public fbs v() {
      return this.x.p != null ? this.x.p.get() : null;
   }

   @bal
   public ObjectArrayList<gky.b> w() {
      return this.q;
   }

   @bal
   public gia x() {
      return this.p;
   }

   @Nullable
   public glc y() {
      return this.M;
   }

   public ggt z() {
      return this.l;
   }
}
