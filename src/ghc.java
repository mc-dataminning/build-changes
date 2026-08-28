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

public class ghc implements auu, AutoCloseable {
   private static final Logger c = LogUtils.getLogger();
   private static final alc d = alc.b("transparency");
   private static final alc e = alc.b("entity_outline");
   public static final int a = 16;
   public static final int b = 8;
   private static final int f = 15;
   private final fil g;
   private final gnh h;
   private final gjq i;
   private final gho j;
   private final gic k = new gic();
   private final ggo l = new ggo();
   private final gih m = new gih();
   private final gig n = new gig();
   @Nullable
   private gbh o;
   private final ghv p = new ghv();
   private final ObjectArrayList<gkt.b> q = new ObjectArrayList(10000);
   private final Set<drs> r = Sets.newHashSet();
   @Nullable
   private gie s;
   private int t;
   private final Int2ObjectMap<aqj> u = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aqj>> v = new Long2ObjectOpenHashMap();
   @Nullable
   private fbo w;
   private final ghd x = new ghd();
   private int y = Integer.MIN_VALUE;
   private int z = Integer.MIN_VALUE;
   private int A = Integer.MIN_VALUE;
   private double B = Double.MIN_VALUE;
   private double C = Double.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   @Nullable
   private gkt G;
   private int H = -1;
   private final List<bto> I = new ArrayList<>();
   private int J;
   private gkx K;
   private boolean L;
   @Nullable
   private gkx M;
   @Nullable
   private eys N;

   public ghc(fil $$0, gnh $$1, gjq $$2, gho $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
   }

   public void a(fhu $$0) {
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
   public void a(aut $$0) {
      this.a();
   }

   public void a() {
      if (this.w != null) {
         this.w.a();
      }

      this.w = new fbp(this.g.aP().l(), this.g.aP().m(), true);
      this.w.a(0.0F, 0.0F, 0.0F, 0.0F);
   }

   @Nullable
   private ghk A() {
      if (!fil.O()) {
         return null;
      } else {
         ghk $$0 = this.g.ab().a(d, ghd.j);
         if ($$0 == null) {
            String $$1 = "Failed to load shader: " + d;
            ghc.a $$2 = new ghc.a($$1);
            if (this.g.ad().d().size() > 1) {
               xd $$3 = this.g.ac().b().findFirst().map($$0x -> xd.b($$0x.b())).orElse(null);
               this.g.n.k().a(fid.b);
               this.g.a($$2, $$3, null);
            } else {
               this.g.n.k().a(fid.b);
               this.g.n.ay();
               c.error(LogUtils.FATAL_MARKER, $$1, $$2);
               this.g.c(new o($$1, $$2));
            }
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

   public void a(@Nullable gbh $$0) {
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
            this.G = new gkt(this.o, this, ad.g(), this.j, this.g.ap(), this.g.ar());
         } else {
            this.G.a(this.o);
         }

         this.l.a();
         ggy.a(fil.N());
         this.H = this.g.n.aG();
         if (this.s != null) {
            this.s.a();
         }

         this.G.g();
         synchronized (this.r) {
            this.r.clear();
         }

         this.s = new gie(this.G, this.o, this.g.n.aG(), this);
         this.p.a(this.s);
         this.q.clear();
         bto $$0 = this.g.ao();
         if ($$0 != null) {
            this.s.a(kg.a($$0));
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

   public gkt g() {
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
         gkt.b $$1 = (gkt.b)var2.next();
         if ($$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String k() {
      return "E: " + this.J + "/" + this.o.g() + ", SD: " + this.o.l();
   }

   private void a(fhu $$0, gkx $$1, boolean $$2, boolean $$3) {
      eys $$4 = $$0.b();
      if (this.g.n.aG() != this.H) {
         this.e();
      }

      bod $$5 = this.o.ah();
      $$5.a("camera");
      double $$6 = this.g.t.dx();
      double $$7 = this.g.t.dz();
      double $$8 = this.g.t.dD();
      int $$9 = kg.a($$6);
      int $$10 = kg.a($$7);
      int $$11 = kg.a($$8);
      if (this.y != $$9 || this.z != $$10 || this.A != $$11) {
         this.y = $$9;
         this.z = $$10;
         this.A = $$11;
         this.s.a(kg.a(this.g.t));
      }

      this.G.a($$4);
      $$5.b("cull");
      double $$12 = Math.floor($$4.d / 8.0);
      double $$13 = Math.floor($$4.e / 8.0);
      double $$14 = Math.floor($$4.f / 8.0);
      if ($$12 != this.B || $$13 != this.C || $$14 != this.D) {
         this.p.a();
      }

      this.B = $$12;
      this.C = $$13;
      this.D = $$14;
      $$5.b("update");
      if (!$$2) {
         boolean $$15 = this.g.E;
         if ($$3 && this.o.a_($$0.c()).s()) {
            $$15 = false;
         }

         $$5.a("section_occlusion_graph");
         this.p.a($$15, $$0, $$1, this.q, this.o.h().a());
         $$5.c();
         double $$16 = Math.floor((double)($$0.d() / 2.0F));
         double $$17 = Math.floor((double)($$0.e() / 2.0F));
         if (this.p.b() || $$16 != this.E || $$17 != this.F) {
            this.b(a($$1));
            this.E = $$16;
            this.F = $$17;
         }
      }

      $$5.c();
   }

   public static gkx a(gkx $$0) {
      return new gkx($$0).a(8);
   }

   private void b(gkx $$0) {
      if (!fil.Q().by()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.g.aK().a("apply_frustum");
         this.q.clear();
         this.p.a($$0, this.q);
         this.g.aK().c();
      }
   }

   public void a(gkt.b $$0) {
      this.p.a($$0);
   }

   public void a(eys $$0, Matrix4f $$1, Matrix4f $$2) {
      this.K = new gkx($$1, $$2);
      this.K.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(fcn $$0, fib $$1, boolean $$2, fhu $$3, ggw $$4, ghe $$5, Matrix4f $$6, Matrix4f $$7) {
      float $$8 = $$1.a(false);
      RenderSystem.setShaderGameTime(this.o.aa(), $$8);
      this.i.a(this.o, $$3, this.g.w);
      this.h.a(this.o, $$3, this.g.v);
      final bod $$9 = this.o.ah();
      $$9.b("light_update_queue");
      this.o.b();
      $$9.b("light_updates");
      this.o.h().p().a();
      eys $$10 = $$3.b();
      double $$11 = $$10.a();
      double $$12 = $$10.b();
      double $$13 = $$10.c();
      $$9.b("culling");
      boolean $$14 = this.M != null;
      gkx $$15 = $$14 ? this.M : this.K;
      this.g.aK().b("captureFrustum");
      if (this.L) {
         this.M = $$14 ? new gkx($$6, $$7) : $$15;
         this.M.a($$11, $$12, $$13);
         this.L = false;
      }

      $$9.b("fog");
      float $$16 = $$4.j();
      boolean $$17 = this.g.s.c().a(azd.a($$11), azd.a($$12)) || this.g.m.j().d();
      Vector4f $$18 = ggv.a($$3, $$8, this.g.s, this.g.n.aG(), $$4.c($$8));
      ggu $$19 = ggv.a($$3, ggv.d.b, $$18, $$16, $$17, $$8);
      ggu $$20 = ggv.a($$3, ggv.d.a, $$18, $$16, $$17, $$8);
      $$9.b("cullEntities");
      boolean $$21 = this.a($$3, $$15, this.I);
      this.J = this.I.size();
      $$9.b("terrain_setup");
      this.a($$3, $$15, $$14, this.g.t.P_());
      $$9.b("compile_sections");
      this.c($$3);
      Matrix4fStack $$22 = RenderSystem.getModelViewStack();
      $$22.pushMatrix();
      $$22.mul($$6);
      fbi $$23 = new fbi();
      this.x.k = $$23.a("main", this.g.h());
      int $$24 = this.g.h().c;
      int $$25 = this.g.h().d;
      fco $$26 = new fco($$24, $$25, true);
      ghk $$27 = this.A();
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

      fbj $$28 = $$23.a("clear");
      this.x.k = $$28.b(this.x.k);
      $$28.a(() -> {
         RenderSystem.clearColor($$18.x, $$18.y, $$18.z, 0.0F);
         RenderSystem.clear(16640);
      });
      if (!$$17) {
         this.a($$23, $$3, $$8, $$20);
      }

      this.a($$23, $$15, $$3, $$6, $$7, $$19, $$2, $$21, $$1, $$9);
      ghk $$29 = this.g.ab().a(e, ghd.i);
      if ($$21 && $$29 != null) {
         $$29.a($$23, $$24, $$25, this.x);
      }

      this.a($$23, $$3, $$5, $$8, $$19);
      fhx $$30 = this.g.n.aB();
      if ($$30 != fhx.a) {
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
      $$23.a($$0, new fbi.c() {
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
      RenderSystem.setShaderFog(ggu.a);
   }

   private void a(fbi $$0, gkx $$1, fhu $$2, Matrix4f $$3, Matrix4f $$4, ggu $$5, boolean $$6, boolean $$7, fib $$8, bod $$9) {
      fbj $$10 = $$0.a("main");
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

      fcq<fbo> $$11 = this.x.k;
      fcq<fbo> $$12 = this.x.l;
      fcq<fbo> $$13 = this.x.m;
      fcq<fbo> $$14 = this.x.o;
      fcq<fbo> $$15 = this.x.q;
      $$10.a(() -> {
         RenderSystem.setShaderFog($$5);
         float $$13x = $$8.a(false);
         eys $$14x = $$2.b();
         double $$15x = $$14x.a();
         double $$16 = $$14x.b();
         double $$17 = $$14x.c();
         $$9.a("terrain");
         this.a(ghq.c(), $$15x, $$16, $$17, $$3, $$4);
         this.a(ghq.d(), $$15x, $$16, $$17, $$3, $$4);
         this.a(ghq.e(), $$15x, $$16, $$17, $$3, $$4);
         if (this.o.c().e()) {
            fca.a();
         } else {
            fca.b();
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

         fde $$18 = new fde();
         ghg.a $$19 = this.j.c();
         ghg.a $$20 = this.j.d();
         $$9.b("entities");
         this.a($$18, $$19, $$2, $$8, this.I);
         $$19.a();
         this.a($$18);
         $$9.b("blockentities");
         this.a($$18, $$19, $$20, $$2, $$13x);
         $$19.a();
         this.a($$18);
         $$19.a(ghq.c());
         $$19.a(ghq.t());
         $$19.a(ghq.u());
         $$19.a(gib.h());
         $$19.a(gib.i());
         $$19.a(gib.c());
         $$19.a(gib.d());
         $$19.a(gib.e());
         $$19.a(gib.f());
         $$19.a(gib.g());
         this.j.e().a();
         if ($$6) {
            this.a($$2, $$19, $$18, false);
         }

         $$9.b("debug");
         this.g.l.a($$18, $$1, $$19, $$15x, $$16, $$17);
         $$19.a();
         this.a($$18);
         $$19.a(gib.j());
         $$19.a(gib.a());
         $$19.a(gib.b());
         $$19.a(ghq.j());
         $$19.a(ghq.l());
         $$19.a(ghq.k());
         $$19.a(ghq.m());
         $$9.b("destroyProgress");
         this.a($$18, $$2, $$20);
         $$20.b();
         this.a($$18);
         $$19.a(ghq.i());
         $$19.b();
         if ($$12 != null) {
            $$12.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$12.get().f();
            $$12.get().a($$11.get());
         }

         $$9.b("translucent");
         this.a(ghq.f(), $$15x, $$16, $$17, $$3, $$4);
         $$9.b("string");
         this.a(ghq.s(), $$15x, $$16, $$17, $$3, $$4);
         if ($$6) {
            this.a($$2, $$19, $$18, true);
         }

         $$19.b();
         $$9.c();
      });
   }

   private void a(fbi $$0, fhu $$1, ghe $$2, float $$3, ggu $$4) {
      fbj $$5 = $$0.a("particles");
      if (this.x.n != null) {
         this.x.n = $$5.b(this.x.n);
         $$5.a(this.x.k);
      } else {
         this.x.k = $$5.b(this.x.k);
      }

      fcq<fbo> $$6 = this.x.k;
      fcq<fbo> $$7 = this.x.n;
      $$5.a(() -> {
         RenderSystem.setShaderFog($$4);
         if ($$7 != null) {
            $$7.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$7.get().f();
            $$7.get().a($$6.get());
         }

         ghp.aN.a();
         this.g.g.a($$2, $$1, $$3);
         ghp.aN.b();
      });
   }

   private void a(fbi $$0, Matrix4f $$1, Matrix4f $$2, fhx $$3, eys $$4, float $$5, int $$6, float $$7) {
      fbj $$8 = $$0.a("clouds");
      if (this.x.p != null) {
         this.x.p = $$8.b(this.x.p);
      } else {
         this.x.k = $$8.b(this.x.k);
      }

      fcq<fbo> $$9 = this.x.p;
      $$8.a(() -> {
         if ($$9 != null) {
            $$9.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$9.get().f();
         }

         this.l.a($$6, $$3, $$7, $$1, $$2, $$4, $$5);
      });
   }

   private void a(fbi $$0, ghe $$1, eys $$2, float $$3, ggu $$4) {
      int $$5 = this.g.n.aG() * 16;
      float $$6 = this.g.j.g();
      fbj $$7 = $$0.a("weather");
      if (this.x.o != null) {
         this.x.o = $$7.b(this.x.o);
      } else {
         this.x.k = $$7.b(this.x.k);
      }

      $$7.a(() -> {
         RenderSystem.setShaderFog($$4);
         ghp.aO.a();
         this.n.a(this.g.s, $$1, this.t, $$3, $$2);
         this.m.a(this.o.A_(), $$2, (double)$$5, (double)$$6);
         ghp.aO.b();
      });
   }

   private void a(fbi $$0, eys $$1, ggu $$2) {
      fbj $$3 = $$0.a("late_debug");
      this.x.k = $$3.b(this.x.k);
      if (this.x.m != null) {
         this.x.m = $$3.b(this.x.m);
      }

      fcq<fbo> $$4 = this.x.k;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         $$4.get().a(false);
         fde $$3x = new fde();
         ghg.a $$4x = this.j.c();
         this.g.l.a($$3x, $$4x, $$1.d, $$1.e, $$1.f);
         $$4x.a();
         this.a($$3x);
      });
   }

   private boolean a(fhu $$0, gkx $$1, List<bto> $$2) {
      eys $$3 = $$0.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.d();
      bto.b(azd.a((double)this.g.n.aG() / 8.0, 1.0, 2.5) * this.g.n.g().c());

      for (bto $$9 : this.o.d()) {
         if (this.h.a($$9, $$1, $$4, $$5, $$6) || $$9.A(this.g.t)) {
            je $$10 = $$9.ds();
            if ((this.o.e($$10.v()) || this.a($$10))
               && ($$9 != $$0.g() || $$0.i() || $$0.g() instanceof buk && ((buk)$$0.g()).fM())
               && (!($$9 instanceof ggc) || $$0.g() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.g.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(fde $$0, ghg.a $$1, fhu $$2, fib $$3, List<bto> $$4) {
      eys $$5 = $$2.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      bry $$9 = this.g.s.s();
      boolean $$10 = this.d();

      for (bto $$11 : $$4) {
         if ($$11.ag == 0) {
            $$11.ab = $$11.dx();
            $$11.ac = $$11.dz();
            $$11.ad = $$11.dD();
         }

         ghg $$13;
         if ($$10 && this.g.b($$11)) {
            ghi $$12 = this.j.e();
            $$13 = $$12;
            int $$14 = $$11.h_();
            $$12.a(axo.b($$14), axo.c($$14), axo.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(fde $$0, ghg.a $$1, ghg.a $$2, fhu $$3, float $$4) {
      eys $$5 = $$3.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator var13 = this.q.iterator();

      while (var13.hasNext()) {
         gkt.b $$9 = (gkt.b)var13.next();
         List<drs> $$10 = $$9.d().b();
         if (!$$10.isEmpty()) {
            for (drs $$11 : $$10) {
               je $$12 = $$11.aB_();
               ghg $$13 = $$1;
               $$0.a();
               $$0.a((double)$$12.u() - $$6, (double)$$12.v() - $$7, (double)$$12.w() - $$8);
               SortedSet<aqj> $$14 = (SortedSet<aqj>)this.v.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     fde.a $$16 = $$0.c();
                     fdi $$17 = new fdf($$2.getBuffer(gzk.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        fdi $$3x = $$1.getBuffer($$2x);
                        return $$2x.R() ? fdl.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.i.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      synchronized (this.r) {
         for (drs $$18 : this.r) {
            je $$19 = $$18.aB_();
            $$0.a();
            $$0.a((double)$$19.u() - $$6, (double)$$19.v() - $$7, (double)$$19.w() - $$8);
            this.i.a($$18, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(fde $$0, fhu $$1, ghg.a $$2) {
      eys $$3 = $$1.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.v.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<aqj>> $$7 = (Entry<SortedSet<aqj>>)var11.next();
         je $$8 = je.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<aqj> $$9 = (SortedSet<aqj>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
               fde.a $$11 = $$0.c();
               fdi $$12 = new fdf($$2.getBuffer(gzk.l.get($$10)), $$11, 1.0F);
               this.g.ap().a(this.o.a_($$8), $$8, this.o, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(fhu $$0, ghg.a $$1, fde $$2, boolean $$3) {
      if (this.g.w instanceof eyo $$4) {
         if ($$4.d() != eyq.a.a) {
            je $$6 = $$4.b();
            duo $$7 = this.o.a_($$6);
            if (!$$7.l() && this.o.A_().a($$6)) {
               boolean $$8 = ggy.a($$7).T();
               if ($$8 != $$3) {
                  return;
               }

               fdi $$9 = $$1.getBuffer(ghq.y());
               eys $$10 = $$0.b();
               this.a($$2, $$9, $$0.g(), $$10.d, $$10.e, $$10.f, $$6, $$7);
               $$1.a();
            }
         }
      }
   }

   private void a(fde $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bto $$0, double $$1, double $$2, double $$3, float $$4, fde $$5, ghg $$6) {
      double $$7 = azd.d((double)$$4, $$0.ab, $$0.dx());
      double $$8 = azd.d((double)$$4, $$0.ac, $$0.dz());
      double $$9 = azd.d((double)$$4, $$0.ad, $$0.dD());
      this.h.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.h.a($$0, $$4));
   }

   private void a(eys $$0, ghq $$1) {
      if (this.N == null || !($$0.g(this.N) <= 1.0)) {
         this.g.aK().a("translucent_sort");
         int $$2 = kg.a($$0.d);
         int $$3 = kg.a($$0.e);
         int $$4 = kg.a($$0.f);
         boolean $$5 = this.N == null || $$2 != kg.a(this.N.d) || $$4 != kg.a(this.N.e) || $$3 != kg.a(this.N.f);
         this.N = $$0;
         int $$6 = 0;
         ObjectListIterator var8 = this.q.iterator();

         while (var8.hasNext()) {
            gkt.b $$7 = (gkt.b)var8.next();
            if ($$6 < 15 && ($$5 || $$7.a($$2, $$3, $$4)) && $$7.a($$1, this.G)) {
               $$6++;
            }
         }

         this.g.aK().c();
      }
   }

   private void a(ghq $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      this.g.aK().a(() -> "render_" + $$0);
      boolean $$6 = $$0 != ghq.f();
      ObjectListIterator<gkt.b> $$7 = this.q.listIterator($$6 ? 0 : this.q.size());
      $$0.a();
      ggp $$8 = RenderSystem.getShader();
      $$8.a(fdj.c.h, $$4, $$5, this.g.aP());
      $$8.b();
      fcv $$9 = $$8.o;

      while ($$6 ? $$7.hasNext() : $$7.hasPrevious()) {
         gkt.b $$10 = $$6 ? (gkt.b)$$7.next() : (gkt.b)$$7.previous();
         if (!$$10.d().a($$0)) {
            fdh $$11 = $$10.a($$0);
            je $$12 = $$10.f();
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
      fdh.b();
      this.g.aK().c();
      $$0.b();
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
         Iterator<aqj> $$0 = this.u.values().iterator();

         while ($$0.hasNext()) {
            aqj $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.t - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(aqj $$0) {
      long $$1 = $$0.b().a();
      Set<aqj> $$2 = (Set<aqj>)this.v.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.v.remove($$1);
      }
   }

   private void a(fbi $$0, fhu $$1, float $$2, ggu $$3) {
      eqr $$4 = $$1.k();
      if ($$4 != eqr.c && $$4 != eqr.a && !this.b($$1)) {
         ggs $$5 = this.o.c();
         ggs.d $$6 = $$5.c();
         if ($$6 != ggs.d.a) {
            fbj $$7 = $$0.a("sky");
            this.x.k = $$7.b(this.x.k);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               ghp.aK.a();
               fde $$4x = new fde();
               if ($$6 == ggs.d.c) {
                  this.k.b($$4x);
               } else {
                  fdg $$5x = fdg.b();
                  float $$6x = this.o.a($$2);
                  float $$7x = this.o.f($$2);
                  float $$8 = 1.0F - this.o.d($$2);
                  float $$9 = this.o.i($$2) * $$8;
                  int $$10 = $$5.b($$7x);
                  int $$11 = this.o.as();
                  int $$12 = this.o.a(this.g.j.k().b(), $$2);
                  float $$13 = axo.h(axo.b($$12));
                  float $$14 = axo.h(axo.c($$12));
                  float $$15 = axo.h(axo.d($$12));
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

   private boolean b(fhu $$0) {
      return !($$0.g() instanceof buk $$1) ? false : $$1.b(bsx.o) || $$1.b(bsx.G);
   }

   private void c(fhu $$0) {
      this.g.aK().a("populate_sections_to_compile");
      eqe $$1 = this.o.x_();
      gkr $$2 = new gkr();
      je $$3 = $$0.c();
      List<gkt.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.q.iterator();

      while (var6.hasNext()) {
         gkt.b $$5 = (gkt.b)var6.next();
         long $$6 = $$5.g();
         if ($$5.i() && $$5.a() && a($$1, $$6)) {
            boolean $$7 = false;
            if (this.g.n.m().c() == fir.c) {
               je $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.j();
            } else if (this.g.n.m().c() == fir.b) {
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

      for (gkt.b $$9 : $$4) {
         $$9.a(this.G, $$2);
         $$9.h();
      }

      this.g.aK().c();
      this.a($$0.b(), ghq.f());
   }

   private static boolean a(eqe $$0, long $$1) {
      int $$2 = kg.d($$1);
      int $$3 = kg.b($$1);

      for (int $$4 = $$2 - 1; $$4 <= $$2 + 1; $$4++) {
         for (int $$5 = $$3 - 1; $$5 <= $$3 + 1; $$5++) {
            if (!$$0.a(kg.b($$5, $$4))) {
               return false;
            }
         }
      }

      return true;
   }

   private void a(fde $$0, fdi $$1, bto $$2, double $$3, double $$4, double $$5, je $$6, duo $$7) {
      gia.a($$0, $$1, $$7.a(this.o, $$6, eyx.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   public void a(ddl $$0, je $$1, duo $$2, duo $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(je $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(kg.a($$3), kg.a($$4), kg.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(kg.a($$7), kg.a($$8), kg.a($$6));
            }
         }
      }
   }

   public void a(je $$0, duo $$1, duo $$2) {
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
      gkt.b $$1 = this.s.a($$0);
      if ($$1 != null) {
         this.p.a($$1);
      }
   }

   public void a(ll $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(ll $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", lu.i.b($$0.a()));
         $$11.a("Parameters", () -> ln.bf.encodeStart(this.o.F_().a(ut.a), $$0).toString());
         $$11.a("Position", () -> p.a(this.o, $$3, $$4, $$5));
         throw new z($$10);
      }
   }

   public <T extends ll> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   geo b(ll $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private geo b(ll $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fhu $$9 = this.g.j.k();
      ara $$10 = this.a($$2);
      if ($$1) {
         return this.g.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == ara.c ? null : this.g.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private ara a(boolean $$0) {
      ara $$1 = this.g.n.at().c();
      if ($$0 && $$1 == ara.c && this.o.z.a(10) == 0) {
         $$1 = ara.b;
      }

      if ($$1 == ara.b && this.o.z.a(3) == 0) {
         $$1 = ara.c;
      }

      return $$1;
   }

   public void a(int $$0, je $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         aqj $$4 = (aqj)this.u.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new aqj($$0, $$1);
            this.u.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.t);
         ((SortedSet)this.v.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         aqj $$3 = (aqj)this.u.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean o() {
      return this.G.h();
   }

   public void a(ddm $$0) {
      this.p.a($$0);
   }

   public void p() {
      this.p.a();
      this.l.a();
   }

   public void a(Collection<drs> $$0, Collection<drs> $$1) {
      synchronized (this.r) {
         this.r.removeAll($$0);
         this.r.addAll($$1);
      }
   }

   public static int a(ddi $$0, je $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(ddi $$0, duo $$1, je $$2) {
      if ($$1.b($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(dep.a, $$2);
         int $$4 = $$0.a(dep.b, $$2);
         int $$5 = $$1.k();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(je $$0) {
      gkt.b $$1 = this.s.a($$0);
      return $$1 != null && $$1.c.get() != gkt.a.a;
   }

   @Nullable
   public fbo q() {
      return this.x.q != null ? this.x.q.get() : null;
   }

   @Nullable
   public fbo r() {
      return this.x.l != null ? this.x.l.get() : null;
   }

   @Nullable
   public fbo s() {
      return this.x.m != null ? this.x.m.get() : null;
   }

   @Nullable
   public fbo t() {
      return this.x.n != null ? this.x.n.get() : null;
   }

   @Nullable
   public fbo u() {
      return this.x.o != null ? this.x.o.get() : null;
   }

   @Nullable
   public fbo v() {
      return this.x.p != null ? this.x.p.get() : null;
   }

   @baj
   public ObjectArrayList<gkt.b> w() {
      return this.q;
   }

   @baj
   public ghv x() {
      return this.p;
   }

   @Nullable
   public gkx y() {
      return this.M;
   }

   public ggo z() {
      return this.l;
   }

   public static class a extends RuntimeException {
      public a(String $$0) {
         super($$0);
      }
   }
}
