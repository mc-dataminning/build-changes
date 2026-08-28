import com.google.common.collect.Lists;
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

public class ggr implements aut, AutoCloseable {
   private static final Logger c = LogUtils.getLogger();
   public static final int a = 16;
   public static final int b = 8;
   private static final int d = 15;
   private final fib e;
   private final gmq f;
   private final gjb g;
   private final ghc h;
   private final ghn i = new ghn();
   private final gge j = new gge();
   private final ghs k = new ghs();
   private final ghr l = new ghr();
   @Nullable
   private gax m;
   private final ghj n = new ghj();
   private final ObjectArrayList<gkd.b> o = new ObjectArrayList(10000);
   private final Set<dre> p = Sets.newHashSet();
   @Nullable
   private ghp q;
   private int r;
   private final Int2ObjectMap<aqi> s = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aqi>> t = new Long2ObjectOpenHashMap();
   @Nullable
   private ggy u;
   @Nullable
   private faz v;
   @Nullable
   private ggy w;
   private final ggs x = new ggs();
   private int y = Integer.MIN_VALUE;
   private int z = Integer.MIN_VALUE;
   private int A = Integer.MIN_VALUE;
   private double B = Double.MIN_VALUE;
   private double C = Double.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   @Nullable
   private gkd G;
   private int H = -1;
   private final List<btj> I = new ArrayList<>();
   private int J;
   private gkh K;
   private boolean L;
   @Nullable
   private gkh M;
   @Nullable
   private eye N;

   public ggr(fib $$0, gmq $$1, gjb $$2, ghc $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
   }

   public void a(fhk $$0) {
      this.l.a(this.e.s, $$0, this.r, this.e.n.at().c());
   }

   @Override
   public void close() {
      if (this.u != null) {
         this.u.close();
      }

      if (this.v != null) {
         this.v.a();
      }

      if (this.w != null) {
         this.w.close();
      }

      this.j.close();
   }

   @Override
   public void a(aus $$0) {
      this.a();
      if (fib.O()) {
         this.B();
      }
   }

   public void a() {
      if (this.u != null) {
         this.u.close();
      }

      if (this.v != null) {
         this.v.a();
      }

      alb $$0 = alb.b("shaders/post/entity_outline.json");

      try {
         this.u = ggy.a(this.e.ab(), this.e.aa(), $$0, Set.of(ggs.a, ggs.g));
         this.v = new fba(this.e.aO().l(), this.e.aO().m(), true);
         this.v.a(0.0F, 0.0F, 0.0F, 0.0F);
      } catch (IOException var3) {
         c.warn("Failed to load shader: {}", $$0, var3);
         this.u = null;
         this.v = null;
      } catch (JsonSyntaxException var4) {
         c.warn("Failed to parse shader: {}", $$0, var4);
         this.u = null;
         this.v = null;
      }
   }

   private void B() {
      this.C();
      alb $$0 = alb.b("shaders/post/transparency.json");

      try {
         this.w = ggy.a(this.e.ab(), this.e.aa(), $$0, ggs.h);
      } catch (Exception var7) {
         String $$2 = var7 instanceof JsonSyntaxException ? "parse" : "load";
         String $$3 = "Failed to " + $$2 + " shader: " + $$0;
         ggr.a $$4 = new ggr.a($$3, var7);
         if (this.e.ac().d().size() > 1) {
            xd $$5 = this.e.ab().b().findFirst().map($$0x -> xd.b($$0x.b())).orElse(null);
            this.e.n.k().a(fht.b);
            this.e.a($$4, $$5, null);
         } else {
            this.e.n.k().a(fht.b);
            this.e.n.ay();
            c.error(LogUtils.FATAL_MARKER, $$3, $$4);
            this.e.c(new o($$3, $$4));
         }
      }
   }

   private void C() {
      if (this.w != null) {
         this.w.close();
         this.w = null;
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
         this.v.a(this.e.aO().l(), this.e.aO().m(), false);
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.e.j.a() && this.v != null && this.u != null && this.e.t != null;
   }

   public void a(@Nullable gax $$0) {
      this.y = Integer.MIN_VALUE;
      this.z = Integer.MIN_VALUE;
      this.A = Integer.MIN_VALUE;
      this.f.a($$0);
      this.m = $$0;
      if ($$0 != null) {
         this.f();
      } else {
         if (this.q != null) {
            this.q.a();
            this.q = null;
         }

         if (this.G != null) {
            this.G.i();
         }

         this.G = null;
         this.p.clear();
         this.n.a(null);
         this.o.clear();
      }
   }

   public void e() {
      if (fib.O()) {
         this.B();
      } else {
         this.C();
      }
   }

   public void f() {
      if (this.m != null) {
         this.e();
         this.m.f();
         if (this.G == null) {
            this.G = new gkd(this.m, this, ad.g(), this.h, this.e.ao(), this.e.aq());
         } else {
            this.G.a(this.m);
         }

         this.j.a();
         ggn.a(fib.N());
         this.H = this.e.n.aG();
         if (this.q != null) {
            this.q.a();
         }

         this.G.g();
         synchronized (this.p) {
            this.p.clear();
         }

         this.q = new ghp(this.G, this.m, this.e.n.aG(), this);
         this.n.a(this.q);
         this.o.clear();
         btj $$0 = this.e.an();
         if ($$0 != null) {
            this.q.a($$0.dx(), $$0.dD());
         }
      }
   }

   public void a(int $$0, int $$1) {
      this.q();
      if (this.v != null) {
         this.v.a($$0, $$1);
      }
   }

   public String g() {
      int $$0 = this.q.f.length;
      int $$1 = this.k();
      return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.e.E ? "(s) " : "", this.H, this.G == null ? "null" : this.G.a());
   }

   public gkd h() {
      return this.G;
   }

   public double i() {
      return (double)this.q.f.length;
   }

   public double j() {
      return (double)this.H;
   }

   public int k() {
      int $$0 = 0;
      ObjectListIterator var2 = this.o.iterator();

      while (var2.hasNext()) {
         gkd.b $$1 = (gkd.b)var2.next();
         if (!$$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String l() {
      return "E: " + this.J + "/" + this.m.g() + ", SD: " + this.m.l();
   }

   private void a(fhk $$0, gkh $$1, boolean $$2, boolean $$3) {
      eye $$4 = $$0.b();
      if (this.e.n.aG() != this.H) {
         this.f();
      }

      bny $$5 = this.m.ah();
      $$5.a("camera");
      double $$6 = this.e.t.dx();
      double $$7 = this.e.t.dz();
      double $$8 = this.e.t.dD();
      int $$9 = kg.a($$6);
      int $$10 = kg.a($$7);
      int $$11 = kg.a($$8);
      if (this.y != $$9 || this.z != $$10 || this.A != $$11) {
         this.y = $$9;
         this.z = $$10;
         this.A = $$11;
         this.q.a($$6, $$8);
      }

      this.G.a($$4);
      $$5.b("cull");
      double $$12 = Math.floor($$4.d / 8.0);
      double $$13 = Math.floor($$4.e / 8.0);
      double $$14 = Math.floor($$4.f / 8.0);
      if ($$12 != this.B || $$13 != this.C || $$14 != this.D) {
         this.n.a();
      }

      this.B = $$12;
      this.C = $$13;
      this.D = $$14;
      $$5.b("update");
      if (!$$2) {
         boolean $$15 = this.e.E;
         if ($$3 && this.m.a_($$0.c()).s()) {
            $$15 = false;
         }

         $$5.a("section_occlusion_graph");
         this.n.a($$15, $$0, $$1, this.o);
         $$5.c();
         double $$16 = Math.floor((double)($$0.d() / 2.0F));
         double $$17 = Math.floor((double)($$0.e() / 2.0F));
         if (this.n.b() || $$16 != this.E || $$17 != this.F) {
            this.b(a($$1));
            this.E = $$16;
            this.F = $$17;
         }
      }

      $$5.c();
   }

   public static gkh a(gkh $$0) {
      return new gkh($$0).a(8);
   }

   private void b(gkh $$0) {
      if (!fib.Q().by()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.e.aJ().a("apply_frustum");
         this.o.clear();
         this.n.a($$0, this.o);
         this.e.aJ().c();
      }
   }

   public void a(gkd.b $$0) {
      this.n.a($$0);
   }

   public void a(eye $$0, Matrix4f $$1, Matrix4f $$2) {
      this.K = new gkh($$1, $$2);
      this.K.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(fby $$0, fhr $$1, boolean $$2, fhk $$3, ggl $$4, ggt $$5, Matrix4f $$6, Matrix4f $$7) {
      float $$8 = $$1.a(false);
      RenderSystem.setShaderGameTime(this.m.aa(), $$8);
      this.g.a(this.m, $$3, this.e.w);
      this.f.a(this.m, $$3, this.e.v);
      final bny $$9 = this.m.ah();
      $$9.b("light_update_queue");
      this.m.b();
      $$9.b("light_updates");
      this.m.h().p().a();
      eye $$10 = $$3.b();
      double $$11 = $$10.a();
      double $$12 = $$10.b();
      double $$13 = $$10.c();
      $$9.b("culling");
      boolean $$14 = this.M != null;
      gkh $$15 = $$14 ? this.M : this.K;
      this.e.aJ().b("captureFrustum");
      if (this.L) {
         this.M = $$14 ? new gkh($$6, $$7) : $$15;
         this.M.a($$11, $$12, $$13);
         this.L = false;
      }

      $$9.b("fog");
      float $$16 = $$4.k();
      boolean $$17 = this.e.s.c().a(azc.a($$11), azc.a($$12)) || this.e.m.j().d();
      Vector4f $$18 = ggk.a($$3, $$8, this.e.s, this.e.n.aG(), $$4.c($$8));
      ggj $$19 = ggk.a($$3, ggk.d.b, $$18, $$16, $$17, $$8);
      ggj $$20 = ggk.a($$3, ggk.d.a, $$18, $$16, $$17, $$8);
      $$9.b("cullEntities");
      boolean $$21 = this.a($$3, $$15, this.I);
      this.J = this.I.size();
      $$9.b("terrain_setup");
      this.a($$3, $$15, $$14, this.e.t.P_());
      $$9.b("compile_sections");
      this.c($$3);
      Matrix4fStack $$22 = RenderSystem.getModelViewStack();
      $$22.pushMatrix();
      $$22.mul($$6);
      fat $$23 = new fat();
      this.x.i = $$23.a("main", this.e.h());
      int $$24 = this.e.h().c;
      int $$25 = this.e.h().d;
      fbz $$26 = new fbz($$24, $$25, true);
      if (this.w != null) {
         this.x.j = $$23.a("translucent", $$26);
         this.x.k = $$23.a("item_entity", $$26);
         this.x.l = $$23.a("particles", $$26);
         this.x.m = $$23.a("weather", $$26);
         this.x.n = $$23.a("clouds", $$26);
      }

      if (this.v != null) {
         this.x.o = $$23.a("entity_outline", this.v);
      }

      fau $$27 = $$23.a("clear");
      this.x.i = $$27.b(this.x.i);
      $$27.a(() -> {
         RenderSystem.clearColor($$18.x, $$18.y, $$18.z, 0.0F);
         RenderSystem.clear(16640);
      });
      if (!$$17) {
         this.a($$23, $$3, $$8, $$20);
      }

      this.a($$23, $$3, $$6, $$7, $$19, $$2, $$21, $$1, $$9);
      if ($$21 && this.u != null) {
         this.u.a($$23, $$1, $$24, $$25, this.x);
      }

      this.a($$23, $$3, $$5, $$8, $$19);
      fhn $$28 = this.e.n.aB();
      if ($$28 != fhn.a) {
         float $$29 = this.m.c().a();
         if (!Float.isNaN($$29)) {
            float $$30 = (float)this.r + $$8;
            int $$31 = this.m.h($$8);
            this.a($$23, $$6, $$7, $$28, $$3.b(), $$30, $$31, $$29 + 0.33F);
         }
      }

      this.a($$23, $$5, $$3.b(), $$8, $$19);
      if (this.w != null) {
         this.w.a($$23, this.e.au(), $$24, $$25, this.x);
      }

      this.a($$23, $$10, $$19);
      $$9.b("framegraph");
      $$23.a($$0, new fat.c() {
         @Override
         public void c(String $$0) {
            $$9.a($$0);
         }

         @Override
         public void d(String $$0) {
            $$9.c();
         }
      });
      this.e.h().a(false);
      this.I.clear();
      this.x.a();
      $$22.popMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.setShaderFog(ggj.a);
   }

   private void a(fat $$0, fhk $$1, Matrix4f $$2, Matrix4f $$3, ggj $$4, boolean $$5, boolean $$6, fhr $$7, bny $$8) {
      fau $$9 = $$0.a("main");
      this.x.i = $$9.b(this.x.i);
      if (this.x.j != null) {
         this.x.j = $$9.b(this.x.j);
      }

      if (this.x.k != null) {
         this.x.k = $$9.b(this.x.k);
      }

      if (this.x.m != null) {
         this.x.m = $$9.b(this.x.m);
      }

      if ($$6 && this.x.o != null) {
         this.x.o = $$9.b(this.x.o);
      }

      fcb<faz> $$10 = this.x.i;
      fcb<faz> $$11 = this.x.j;
      fcb<faz> $$12 = this.x.k;
      fcb<faz> $$13 = this.x.m;
      fcb<faz> $$14 = this.x.o;
      $$9.a(() -> {
         RenderSystem.setShaderFog($$4);
         float $$12x = $$7.a(false);
         eye $$13x = $$1.b();
         double $$14x = $$13x.a();
         double $$15 = $$13x.b();
         double $$16 = $$13x.c();
         $$8.a("terrain");
         this.a(ghe.c(), $$14x, $$15, $$16, $$2, $$3);
         this.a(ghe.d(), $$14x, $$15, $$16, $$2, $$3);
         this.a(ghe.e(), $$14x, $$15, $$16, $$2, $$3);
         if (this.m.c().e()) {
            fbl.a();
         } else {
            fbl.b();
         }

         if ($$12 != null) {
            $$12.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$12.get().f();
            $$12.get().a(this.e.h());
            $$10.get().a(false);
         }

         if ($$13 != null) {
            $$13.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$13.get().f();
         }

         if (this.d() && $$14 != null) {
            $$14.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$14.get().f();
            $$10.get().a(false);
         }

         fcu $$17 = new fcu();
         ggv.a $$18 = this.h.c();
         ggv.a $$19 = this.h.d();
         $$8.b("entities");
         this.a($$17, $$18, $$1, $$7, this.I);
         $$18.a();
         this.a($$17);
         $$8.b("blockentities");
         this.a($$17, $$18, $$19, $$1, $$12x);
         $$18.a();
         this.a($$17);
         $$18.a(ghe.c());
         $$18.a(ghe.u());
         $$18.a(ghe.v());
         $$18.a(ghm.h());
         $$18.a(ghm.i());
         $$18.a(ghm.c());
         $$18.a(ghm.d());
         $$18.a(ghm.e());
         $$18.a(ghm.f());
         $$18.a(ghm.g());
         this.h.e().a();
         if ($$5) {
            this.a($$1, $$18, $$17, false);
         }

         $$8.b("debug");
         this.e.l.a($$17, $$18, $$14x, $$15, $$16);
         $$18.a();
         this.a($$17);
         $$18.a(ghm.a());
         $$18.a(ghm.b());
         $$18.a(ghe.j());
         $$18.a(ghe.l());
         $$18.a(ghe.k());
         $$18.a(ghe.m());
         $$18.a(ghe.n());
         $$8.b("destroyProgress");
         this.a($$17, $$1, $$19);
         $$19.b();
         this.a($$17);
         $$18.a(ghe.i());
         $$18.a(ghm.k());
         $$18.b();
         if ($$11 != null) {
            $$11.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$11.get().f();
            $$11.get().a($$10.get());
         }

         $$8.b("translucent");
         this.a(ghe.f(), $$14x, $$15, $$16, $$2, $$3);
         $$8.b("string");
         this.a(ghe.t(), $$14x, $$15, $$16, $$2, $$3);
         if ($$5) {
            this.a($$1, $$18, $$17, true);
         }

         $$18.b();
         $$8.c();
      });
   }

   private void a(fat $$0, fhk $$1, ggt $$2, float $$3, ggj $$4) {
      fau $$5 = $$0.a("particles");
      if (this.x.l != null) {
         this.x.l = $$5.b(this.x.l);
         $$5.a(this.x.i);
      } else {
         this.x.i = $$5.b(this.x.i);
      }

      fcb<faz> $$6 = this.x.i;
      fcb<faz> $$7 = this.x.l;
      $$5.a(() -> {
         RenderSystem.setShaderFog($$4);
         if ($$7 != null) {
            $$7.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$7.get().f();
            $$7.get().a($$6.get());
         }

         ghd.aP.a();
         this.e.g.a($$2, $$1, $$3);
         ghd.aP.b();
      });
   }

   private void a(fat $$0, Matrix4f $$1, Matrix4f $$2, fhn $$3, eye $$4, float $$5, int $$6, float $$7) {
      fau $$8 = $$0.a("clouds");
      if (this.x.n != null) {
         this.x.n = $$8.b(this.x.n);
      } else {
         this.x.i = $$8.b(this.x.i);
      }

      fcb<faz> $$9 = this.x.n;
      $$8.a(() -> {
         if ($$9 != null) {
            $$9.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$9.get().f();
         }

         this.j.a($$6, $$3, $$7, $$1, $$2, $$4, $$5);
      });
   }

   private void a(fat $$0, ggt $$1, eye $$2, float $$3, ggj $$4) {
      int $$5 = this.e.n.aG() * 16;
      float $$6 = this.e.j.h();
      fau $$7 = $$0.a("weather");
      if (this.x.m != null) {
         this.x.m = $$7.b(this.x.m);
      } else {
         this.x.i = $$7.b(this.x.i);
      }

      $$7.a(() -> {
         RenderSystem.setShaderFog($$4);
         ghd.aQ.a();
         this.l.a(this.e.s, $$1, this.r, $$3, $$2);
         this.k.a(this.m.A_(), $$2, (double)$$5, (double)$$6);
         ghd.aQ.b();
      });
   }

   private void a(fat $$0, eye $$1, ggj $$2) {
      fau $$3 = $$0.a("late_debug");
      this.x.i = $$3.b(this.x.i);
      if (this.x.k != null) {
         this.x.k = $$3.b(this.x.k);
      }

      fcb<faz> $$4 = this.x.i;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         $$4.get().a(false);
         fcu $$3x = new fcu();
         ggv.a $$4x = this.h.c();
         this.e.l.b($$3x, $$4x, $$1.d, $$1.e, $$1.f);
         $$4x.a();
         this.a($$3x);
      });
   }

   private boolean a(fhk $$0, gkh $$1, List<btj> $$2) {
      eye $$3 = $$0.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.d();
      btj.b(azc.a((double)this.e.n.aG() / 8.0, 1.0, 2.5) * this.e.n.g().c());

      for (btj $$9 : this.m.d()) {
         if (this.f.a($$9, $$1, $$4, $$5, $$6) || $$9.A(this.e.t)) {
            je $$10 = $$9.ds();
            if ((this.m.d($$10.v()) || this.a($$10))
               && ($$9 != $$0.g() || $$0.i() || $$0.g() instanceof buf && ((buf)$$0.g()).fL())
               && (!($$9 instanceof gfs) || $$0.g() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.e.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(fcu $$0, ggv.a $$1, fhk $$2, fhr $$3, List<btj> $$4) {
      eye $$5 = $$2.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      brt $$9 = this.e.s.s();
      boolean $$10 = this.d();

      for (btj $$11 : $$4) {
         if ($$11.ag == 0) {
            $$11.ab = $$11.dx();
            $$11.ac = $$11.dz();
            $$11.ad = $$11.dD();
         }

         ggv $$13;
         if ($$10 && this.e.b($$11)) {
            ggw $$12 = this.h.e();
            $$13 = $$12;
            int $$14 = $$11.h_();
            $$12.a(axn.b($$14), axn.c($$14), axn.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(fcu $$0, ggv.a $$1, ggv.a $$2, fhk $$3, float $$4) {
      eye $$5 = $$3.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator var13 = this.o.iterator();

      while (var13.hasNext()) {
         gkd.b $$9 = (gkd.b)var13.next();
         List<dre> $$10 = $$9.d().b();
         if (!$$10.isEmpty()) {
            for (dre $$11 : $$10) {
               je $$12 = $$11.aD_();
               ggv $$13 = $$1;
               $$0.a();
               $$0.a((double)$$12.u() - $$6, (double)$$12.v() - $$7, (double)$$12.w() - $$8);
               SortedSet<aqi> $$14 = (SortedSet<aqi>)this.t.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     fcu.a $$16 = $$0.c();
                     fcy $$17 = new fcv($$2.getBuffer(gyt.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        fcy $$3x = $$1.getBuffer($$2x);
                        return $$2x.S() ? fdb.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.g.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      synchronized (this.p) {
         for (dre $$18 : this.p) {
            je $$19 = $$18.aD_();
            $$0.a();
            $$0.a((double)$$19.u() - $$6, (double)$$19.v() - $$7, (double)$$19.w() - $$8);
            this.g.a($$18, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(fcu $$0, fhk $$1, ggv.a $$2) {
      eye $$3 = $$1.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.t.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<aqi>> $$7 = (Entry<SortedSet<aqi>>)var11.next();
         je $$8 = je.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<aqi> $$9 = (SortedSet<aqi>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
               fcu.a $$11 = $$0.c();
               fcy $$12 = new fcv($$2.getBuffer(gyt.l.get($$10)), $$11, 1.0F);
               this.e.ao().a(this.m.a_($$8), $$8, this.m, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(fhk $$0, ggv.a $$1, fcu $$2, boolean $$3) {
      if (this.e.w instanceof eya $$4) {
         if ($$4.c() != eyc.a.a) {
            je $$6 = $$4.a();
            dua $$7 = this.m.a_($$6);
            if (!$$7.l() && this.m.A_().a($$6)) {
               boolean $$8 = ggn.a($$7).U();
               if ($$8 != $$3) {
                  return;
               }

               fcy $$9 = $$1.getBuffer(ghe.z());
               eye $$10 = $$0.b();
               this.a($$2, $$9, $$0.g(), $$10.d, $$10.e, $$10.f, $$6, $$7);
               $$1.a();
            }
         }
      }
   }

   private void a(fcu $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(btj $$0, double $$1, double $$2, double $$3, float $$4, fcu $$5, ggv $$6) {
      double $$7 = azc.d((double)$$4, $$0.ab, $$0.dx());
      double $$8 = azc.d((double)$$4, $$0.ac, $$0.dz());
      double $$9 = azc.d((double)$$4, $$0.ad, $$0.dD());
      this.f.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.f.a($$0, $$4));
   }

   private void a(eye $$0, ghe $$1) {
      if (this.N == null || !($$0.g(this.N) <= 1.0)) {
         this.e.aJ().a("translucent_sort");
         int $$2 = kg.a($$0.d);
         int $$3 = kg.a($$0.e);
         int $$4 = kg.a($$0.f);
         boolean $$5 = this.N == null || $$2 != kg.a(this.N.d) || $$4 != kg.a(this.N.e) || $$3 != kg.a(this.N.f);
         this.N = $$0;
         int $$6 = 0;
         ObjectListIterator var8 = this.o.iterator();

         while (var8.hasNext()) {
            gkd.b $$7 = (gkd.b)var8.next();
            if ($$6 < 15 && ($$5 || $$7.b($$2, $$3, $$4)) && $$7.a($$1, this.G)) {
               $$6++;
            }
         }

         this.e.aJ().c();
      }
   }

   private void a(ghe $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      this.e.aJ().a(() -> "render_" + $$0);
      boolean $$6 = $$0 != ghe.f();
      ObjectListIterator<gkd.b> $$7 = this.o.listIterator($$6 ? 0 : this.o.size());
      $$0.a();
      ghk $$8 = RenderSystem.getShader();
      $$8.a(fcz.c.h, $$4, $$5, this.e.aO());
      $$8.g();
      fcl $$9 = $$8.p;

      while ($$6 ? $$7.hasNext() : $$7.hasPrevious()) {
         gkd.b $$10 = $$6 ? (gkd.b)$$7.next() : (gkd.b)$$7.previous();
         if (!$$10.d().a($$0)) {
            fcx $$11 = $$10.a($$0);
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

      $$8.f();
      fcx.b();
      this.e.aJ().c();
      $$0.b();
   }

   public void m() {
      this.L = true;
   }

   public void n() {
      this.M = null;
   }

   public void o() {
      if (this.m.s().i()) {
         this.r++;
      }

      if (this.r % 20 == 0) {
         Iterator<aqi> $$0 = this.s.values().iterator();

         while ($$0.hasNext()) {
            aqi $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.r - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(aqi $$0) {
      long $$1 = $$0.b().a();
      Set<aqi> $$2 = (Set<aqi>)this.t.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.t.remove($$1);
      }
   }

   private void a(fat $$0, fhk $$1, float $$2, ggj $$3) {
      eqd $$4 = $$1.k();
      if ($$4 != eqd.c && $$4 != eqd.a && !this.b($$1)) {
         ggg $$5 = this.m.c();
         ggg.d $$6 = $$5.c();
         if ($$6 != ggg.d.a) {
            fau $$7 = $$0.a("sky");
            this.x.i = $$7.b(this.x.i);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               ghd.aM.a();
               fcu $$4x = new fcu();
               if ($$6 == ggg.d.c) {
                  this.i.b($$4x);
               } else {
                  fcw $$5x = fcw.b();
                  float $$6x = this.m.a($$2);
                  float $$7x = this.m.f($$2);
                  float $$8 = 1.0F - this.m.d($$2);
                  float $$9 = this.m.i($$2) * $$8;
                  int $$10 = $$5.b($$7x);
                  int $$11 = this.m.as();
                  int $$12 = this.m.a(this.e.j.l().b(), $$2);
                  float $$13 = axn.h(axn.b($$12));
                  float $$14 = axn.h(axn.c($$12));
                  float $$15 = axn.h(axn.d($$12));
                  this.i.a($$13, $$14, $$15);
                  if ($$5.a($$7x)) {
                     this.i.a($$4x, $$5x, $$6x, $$10);
                  }

                  this.i.a($$4x, $$5x, $$7x, $$11, $$8, $$9, $$3);
                  if (this.a($$2)) {
                     this.i.a($$4x);
                  }
               }
            });
         }
      }
   }

   private boolean a(float $$0) {
      return this.e.t.m($$0).e - this.m.j().a(this.m) < 0.0;
   }

   private boolean b(fhk $$0) {
      return !($$0.g() instanceof buf $$1) ? false : $$1.b(bss.o) || $$1.b(bss.G);
   }

   private void c(fhk $$0) {
      this.e.aJ().a("populate_sections_to_compile");
      epq $$1 = this.m.x_();
      gkb $$2 = new gkb();
      je $$3 = $$0.c();
      List<gkd.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.o.iterator();

      while (var6.hasNext()) {
         gkd.b $$5 = (gkd.b)var6.next();
         kg $$6 = kg.a($$5.f());
         if ($$5.h() && $$1.a($$6)) {
            boolean $$7 = false;
            if (this.e.n.m().c() == fih.c) {
               je $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.i();
            } else if (this.e.n.m().c() == fih.b) {
               $$7 = $$5.i();
            }

            if ($$7) {
               this.e.aJ().a("build_near_sync");
               this.G.a($$5, $$2);
               $$5.g();
               this.e.aJ().c();
            } else {
               $$4.add($$5);
            }
         }
      }

      this.e.aJ().b("upload");
      this.G.f();
      this.e.aJ().b("schedule_async_compile");

      for (gkd.b $$9 : $$4) {
         $$9.a(this.G, $$2);
         $$9.g();
      }

      this.e.aJ().c();
      this.a($$0.b(), ghe.f());
   }

   private void a(fcu $$0, fcy $$1, btj $$2, double $$3, double $$4, double $$5, je $$6, dua $$7) {
      ghl.a($$0, $$1, $$7.a(this.m, $$6, eyj.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   public void a(dcx $$0, je $$1, dua $$2, dua $$3, int $$4) {
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

   public void a(je $$0, dua $$1, dua $$2) {
      if (this.e.aD().a($$1, $$2)) {
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
      this.q.a($$0, $$1, $$2, $$3);
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
         $$11.a("Parameters", () -> ln.bf.encodeStart(this.m.F_().a(ut.a), $$0).toString());
         $$11.a("Position", () -> p.a(this.m, $$3, $$4, $$5));
         throw new z($$10);
      }
   }

   public <T extends ll> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   gee b(ll $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gee b(ll $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fhk $$9 = this.e.j.l();
      aqz $$10 = this.a($$2);
      if ($$1) {
         return this.e.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == aqz.c ? null : this.e.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private aqz a(boolean $$0) {
      aqz $$1 = this.e.n.at().c();
      if ($$0 && $$1 == aqz.c && this.m.z.a(10) == 0) {
         $$1 = aqz.b;
      }

      if ($$1 == aqz.b && this.m.z.a(3) == 0) {
         $$1 = aqz.c;
      }

      return $$1;
   }

   public void a(int $$0, je $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         aqi $$4 = (aqi)this.s.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new aqi($$0, $$1);
            this.s.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.r);
         ((SortedSet)this.t.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         aqi $$3 = (aqi)this.s.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean p() {
      return this.G.h();
   }

   public void a(dcy $$0) {
      this.n.a($$0);
   }

   public void q() {
      this.n.a();
      this.j.a();
   }

   public void a(Collection<dre> $$0, Collection<dre> $$1) {
      synchronized (this.p) {
         this.p.removeAll($$0);
         this.p.addAll($$1);
      }
   }

   public static int a(dcu $$0, je $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(dcu $$0, dua $$1, je $$2) {
      if ($$1.b($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(deb.a, $$2);
         int $$4 = $$0.a(deb.b, $$2);
         int $$5 = $$1.k();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(je $$0) {
      gkd.b $$1 = this.q.a($$0);
      return $$1 != null && $$1.c.get() != gkd.a.a;
   }

   @Nullable
   public faz r() {
      return this.x.o != null ? this.x.o.get() : null;
   }

   @Nullable
   public faz s() {
      return this.x.j != null ? this.x.j.get() : null;
   }

   @Nullable
   public faz t() {
      return this.x.k != null ? this.x.k.get() : null;
   }

   @Nullable
   public faz u() {
      return this.x.l != null ? this.x.l.get() : null;
   }

   @Nullable
   public faz v() {
      return this.x.m != null ? this.x.m.get() : null;
   }

   @Nullable
   public faz w() {
      return this.x.n != null ? this.x.n.get() : null;
   }

   @bai
   public ObjectArrayList<gkd.b> x() {
      return this.o;
   }

   @bai
   public ghj y() {
      return this.n;
   }

   @Nullable
   public gkh z() {
      return this.M;
   }

   public gge A() {
      return this.j;
   }

   public static class a extends RuntimeException {
      public a(String $$0, Throwable $$1) {
         super($$0, $$1);
      }
   }
}
