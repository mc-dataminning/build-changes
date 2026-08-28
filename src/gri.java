import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class gri implements avp, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   private static final alr e = alr.b("transparency");
   private static final alr f = alr.b("entity_outline");
   public static final int a = 16;
   public static final int b = 8;
   public static final int c = 32;
   private static final int g = 15;
   private final fqq h;
   private final gxt i;
   private final gtz j;
   private final grv k;
   private final gsi l = new gsi();
   private final gqx m = new gqx();
   private final gso n = new gso();
   private final gsn o = new gsn();
   @Nullable
   private glo p;
   private final gsd q = new gsd();
   private final ObjectArrayList<gvd.b> r = new ObjectArrayList(10000);
   private final ObjectArrayList<gvd.b> s = new ObjectArrayList(50);
   private final Set<dyo> t = Sets.newHashSet();
   @Nullable
   private gsl u;
   private int v;
   private final Int2ObjectMap<arb> w = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<arb>> x = new Long2ObjectOpenHashMap();
   @Nullable
   private fjr y;
   private final grj z = new grj();
   private int A = Integer.MIN_VALUE;
   private int B = Integer.MIN_VALUE;
   private int C = Integer.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   private double G = Double.MIN_VALUE;
   private double H = Double.MIN_VALUE;
   @Nullable
   private gvd I;
   private int J = -1;
   private final List<bxe> K = new ArrayList<>();
   private int L;
   private gvh M;
   private boolean N;
   @Nullable
   private gvh O;
   @Nullable
   private iw P;
   private int Q;

   public gri(fqq $$0, gxt $$1, gtz $$2, grv $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
   }

   public void a(fpy $$0) {
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
   public void a(avo $$0) {
      this.a();
   }

   public void a() {
      if (this.y != null) {
         this.y.a();
      }

      this.y = new fjs("Entity Outline", this.h.aO().k(), this.h.aO().l(), true);
   }

   @Nullable
   private grr z() {
      if (!fqq.O()) {
         return null;
      } else {
         grr $$0 = this.h.ab().a(e, grj.j);
         if ($$0 == null) {
            this.h.n.k().a(fqi.b);
            this.h.n.az();
         }

         return $$0;
      }
   }

   public void b() {
      if (this.c()) {
         this.y.a(this.h.h().c());
      }
   }

   protected boolean c() {
      return !this.h.j.a() && this.y != null && this.h.t != null;
   }

   public void a(@Nullable glo $$0) {
      this.A = Integer.MIN_VALUE;
      this.B = Integer.MIN_VALUE;
      this.C = Integer.MIN_VALUE;
      this.i.a($$0);
      this.p = $$0;
      if ($$0 != null) {
         this.d();
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
         this.A();
      }
   }

   private void A() {
      this.r.clear();
      this.s.clear();
   }

   public void d() {
      if (this.p != null) {
         this.p.f();
         if (this.I == null) {
            this.I = new gvd(this.p, this, ag.h(), this.k, this.h.ap(), this.h.ar());
         } else {
            this.I.a(this.p);
         }

         this.m.a();
         grf.a(fqq.N());
         this.J = this.h.n.aH();
         if (this.u != null) {
            this.u.a();
         }

         this.I.g();
         synchronized (this.t) {
            this.t.clear();
         }

         this.u = new gsl(this.I, this.p, this.h.n.aH(), this);
         this.q.a(this.u);
         this.A();
         fpy $$0 = this.h.j.k();
         this.u.a(jz.a($$0.b()));
      }
   }

   public void a(int $$0, int $$1) {
      this.o();
      if (this.y != null) {
         this.y.a($$0, $$1);
      }
   }

   public String e() {
      int $$0 = this.u.f.length;
      int $$1 = this.i();
      return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.h.E ? "(s) " : "", this.J, this.I == null ? "null" : this.I.a());
   }

   public gvd f() {
      return this.I;
   }

   public double g() {
      return (double)this.u.f.length;
   }

   public double h() {
      return (double)this.J;
   }

   public int i() {
      int $$0 = 0;
      ObjectListIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         gvd.b $$1 = (gvd.b)var2.next();
         if ($$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String j() {
      return "E: " + this.L + "/" + this.p.g() + ", SD: " + this.p.m();
   }

   private void a(fpy $$0, gvh $$1, boolean $$2, boolean $$3) {
      fgc $$4 = $$0.b();
      if (this.h.n.aH() != this.J) {
         this.d();
      }

      brm $$5 = brl.a();
      $$5.a("camera");
      int $$6 = jz.a($$4.a());
      int $$7 = jz.a($$4.b());
      int $$8 = jz.a($$4.c());
      if (this.A != $$6 || this.B != $$7 || this.C != $$8) {
         this.A = $$6;
         this.B = $$7;
         this.C = $$8;
         this.u.a(jz.a($$4));
         this.n.a();
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

   public static gvh a(gvh $$0) {
      return new gvh($$0).a(8);
   }

   private void b(gvh $$0) {
      if (!fqq.Q().bx()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         brl.a().a("apply_frustum");
         this.A();
         this.q.a($$0, this.r, this.s);
         brl.a().c();
      }
   }

   public void a(gvd.b $$0) {
      this.q.a($$0);
   }

   public void a(fgc $$0, Matrix4f $$1, Matrix4f $$2) {
      this.M = new gvh($$1, $$2);
      this.M.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(fko $$0, fqg $$1, boolean $$2, fpy $$3, grd $$4, Matrix4f $$5, Matrix4f $$6) {
      float $$7 = $$1.a(false);
      RenderSystem.setShaderGameTime(this.p.ae(), $$7);
      this.j.a(this.p, $$3, this.h.w);
      this.i.a(this.p, $$3, this.h.v);
      final brm $$8 = brl.a();
      $$8.b("light_update_queue");
      this.p.b();
      $$8.b("light_updates");
      this.p.h().q().a();
      fgc $$9 = $$3.b();
      double $$10 = $$9.a();
      double $$11 = $$9.b();
      double $$12 = $$9.c();
      $$8.b("culling");
      boolean $$13 = this.O != null;
      gvh $$14 = $$13 ? this.O : this.M;
      brl.a().b("captureFrustum");
      if (this.N) {
         this.O = $$13 ? new gvh($$5, $$6) : $$14;
         this.O.a($$10, $$11, $$12);
         this.N = false;
      }

      $$8.b("fog");
      float $$15 = $$4.j();
      boolean $$16 = this.h.s.c().a(azz.a($$10), azz.a($$11)) || this.h.m.j().d();
      Vector4f $$17 = grc.a($$3, $$7, this.h.s, this.h.n.aH(), $$4.c($$7));
      grb $$18 = grc.a($$3, grc.d.b, $$17, $$15, $$16, $$7);
      grb $$19 = grc.a($$3, grc.d.a, $$17, $$15, $$16, $$7);
      $$8.b("cullEntities");
      boolean $$20 = this.a($$3, $$14, this.K);
      this.L = this.K.size();
      $$8.b("terrain_setup");
      this.a($$3, $$14, $$13, this.h.t.ak());
      $$8.b("compile_sections");
      this.c($$3);
      Matrix4fStack $$21 = RenderSystem.getModelViewStack();
      $$21.pushMatrix();
      $$21.mul($$5);
      fix $$22 = new fix();
      this.z.k = $$22.a("main", this.h.h());
      int $$23 = this.h.h().c;
      int $$24 = this.h.h().d;
      fkp $$25 = new fkp($$23, $$24, true, 0);
      grr $$26 = this.z();
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

      fiy $$27 = $$22.a("clear");
      this.z.k = $$27.b(this.z.k);
      $$27.a(() -> {
         fjr $$1x = this.h.h();
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$1x.c(), ayh.a(0.0F, $$17.x, $$17.y, $$17.z), $$1x.d(), 1.0);
      });
      if (!$$16) {
         this.b($$22, $$3, $$7, $$19);
      }

      this.a($$22, $$14, $$3, $$5, $$6, $$18, $$2, $$20, $$1, $$8);
      grr $$28 = this.h.ab().a(f, grj.i);
      if ($$20 && $$28 != null) {
         $$28.a($$22, $$23, $$24, this.z, null);
      }

      this.a($$22, $$3, $$7, $$18);
      fqc $$29 = this.h.n.aC();
      if ($$29 != fqc.a) {
         float $$30 = this.p.c().a();
         if (!Float.isNaN($$30)) {
            float $$31 = (float)this.v + $$7;
            int $$32 = this.p.h($$7);
            this.a($$22, $$29, $$3.b(), $$31, $$32, $$30 + 0.33F);
         }
      }

      this.a($$22, $$3.b(), $$7, $$18);
      if ($$26 != null) {
         $$26.a($$22, $$23, $$24, this.z, null);
      }

      this.a($$22, $$9, $$18);
      $$8.b("framegraph");
      $$22.a($$0, new fix.c() {
         @Override
         public void c(String $$0) {
            $$8.a($$0);
         }

         @Override
         public void d(String $$0) {
            $$8.c();
         }
      });
      this.K.clear();
      this.z.a();
      $$21.popMatrix();
      RenderSystem.setShaderFog(grb.a);
   }

   private void a(fix $$0, gvh $$1, fpy $$2, Matrix4f $$3, Matrix4f $$4, grb $$5, boolean $$6, boolean $$7, fqg $$8, brm $$9) {
      fiy $$10 = $$0.a("main");
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

      fkr<fjr> $$11 = this.z.k;
      fkr<fjr> $$12 = this.z.l;
      fkr<fjr> $$13 = this.z.m;
      fkr<fjr> $$14 = this.z.q;
      $$10.a(() -> {
         RenderSystem.setShaderFog($$5);
         float $$12x = $$8.a(false);
         fgc $$13x = $$2.b();
         double $$14x = $$13x.a();
         double $$15 = $$13x.b();
         double $$16 = $$13x.c();
         $$9.a("terrain");
         this.a(gry.d(), $$14x, $$15, $$16, $$3, $$4);
         this.a(gry.e(), $$14x, $$15, $$16, $$3, $$4);
         this.a(gry.f(), $$14x, $$15, $$16, $$3, $$4);
         if (this.p.c().e()) {
            fkb.a();
         } else {
            fkb.b();
         }

         if ($$13 != null) {
            $$13.get().a(this.h.h());
         }

         if (this.c() && $$14 != null) {
            fjr $$17 = $$14.get();
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$17.c(), 0, $$17.d(), 1.0);
         }

         fld $$18 = new fld();
         grn.a $$19 = this.k.c();
         grn.a $$20 = this.k.d();
         $$9.b("entities");
         this.a($$18, $$19, $$2, $$8, this.K);
         $$19.a();
         this.a($$18);
         $$9.b("blockentities");
         this.a($$18, $$19, $$20, $$2, $$12x);
         $$19.a();
         this.a($$18);
         $$19.a(gry.d());
         $$19.a(gry.u());
         $$19.a(gry.v());
         $$19.a(gsh.h());
         $$19.a(gsh.i());
         $$19.a(gsh.c());
         $$19.a(gsh.d());
         $$19.a(gsh.e());
         $$19.a(gsh.f());
         $$19.a(gsh.g());
         this.k.e().a();
         if ($$6) {
            this.a($$2, $$19, $$18, false);
         }

         $$9.b("debug");
         this.h.l.a($$18, $$1, $$19, $$14x, $$15, $$16);
         $$19.a();
         this.a($$18);
         $$19.a(gsh.j());
         $$19.a(gsh.a());
         $$19.a(gsh.b());
         $$19.a(gry.k());
         $$19.a(gry.m());
         $$19.a(gry.l());
         $$19.a(gry.n());
         $$9.b("destroyProgress");
         this.a($$18, $$2, $$20);
         $$20.b();
         this.a($$18);
         $$19.a(gry.j());
         $$19.b();
         if ($$12 != null) {
            $$12.get().a($$11.get());
         }

         $$9.b("translucent");
         this.a(gry.g(), $$14x, $$15, $$16, $$3, $$4);
         $$9.b("string");
         this.a(gry.t(), $$14x, $$15, $$16, $$3, $$4);
         if ($$6) {
            this.a($$2, $$19, $$18, true);
         }

         $$19.b();
         $$9.c();
      });
   }

   private void a(fix $$0, fpy $$1, float $$2, grb $$3) {
      fiy $$4 = $$0.a("particles");
      if (this.z.n != null) {
         this.z.n = $$4.b(this.z.n);
         $$4.a(this.z.k);
      } else {
         this.z.k = $$4.b(this.z.k);
      }

      fkr<fjr> $$5 = this.z.k;
      fkr<fjr> $$6 = this.z.n;
      $$4.a(() -> {
         RenderSystem.setShaderFog($$3);
         if ($$6 != null) {
            $$6.get().a($$5.get());
         }

         this.h.g.a($$1, $$2, this.k.c());
      });
   }

   private void a(fix $$0, fqc $$1, fgc $$2, float $$3, int $$4, float $$5) {
      fiy $$6 = $$0.a("clouds");
      if (this.z.p != null) {
         this.z.p = $$6.b(this.z.p);
      } else {
         this.z.k = $$6.b(this.z.k);
      }

      $$6.a(() -> this.m.a($$4, $$1, $$5, $$2, $$3));
   }

   private void a(fix $$0, fgc $$1, float $$2, grb $$3) {
      int $$4 = this.h.n.aH() * 16;
      float $$5 = this.h.j.g();
      fiy $$6 = $$0.a("weather");
      if (this.z.o != null) {
         this.z.o = $$6.b(this.z.o);
      } else {
         this.z.k = $$6.b(this.z.k);
      }

      $$6.a(() -> {
         RenderSystem.setShaderFog($$3);
         grn.a $$5x = this.k.c();
         this.o.a(this.h.s, $$5x, this.v, $$2, $$1);
         this.n.a(this.p.E_(), $$1, (double)$$4, (double)$$5);
         $$5x.b();
      });
   }

   private void a(fix $$0, fgc $$1, grb $$2) {
      fiy $$3 = $$0.a("late_debug");
      this.z.k = $$3.b(this.z.k);
      if (this.z.m != null) {
         this.z.m = $$3.b(this.z.m);
      }

      fkr<fjr> $$4 = this.z.k;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         fld $$2x = new fld();
         grn.a $$3x = this.k.c();
         this.h.l.a($$2x, $$3x, $$1.d, $$1.e, $$1.f);
         $$3x.a();
         this.a($$2x);
      });
   }

   private boolean a(fpy $$0, gvh $$1, List<bxe> $$2) {
      fgc $$3 = $$0.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.c();
      bxe.b(azz.a((double)this.h.n.aH() / 8.0, 1.0, 2.5) * this.h.n.g().c());

      for (bxe $$9 : this.p.d()) {
         if (this.i.a($$9, $$1, $$4, $$5, $$6) || $$9.A(this.h.t)) {
            iw $$10 = $$9.dv();
            if ((this.p.e($$10.v()) || this.a($$10))
               && ($$9 != $$0.g() || $$0.i() || $$0.g() instanceof byf && ((byf)$$0.g()).fR())
               && (!($$9 instanceof gqm) || $$0.g() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.h.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(fld $$0, grn.a $$1, fpy $$2, fqg $$3, List<bxe> $$4) {
      fgc $$5 = $$2.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      bvl $$9 = this.h.s.u();
      boolean $$10 = this.c();

      for (bxe $$11 : $$4) {
         if ($$11.af == 0) {
            $$11.aa = $$11.dA();
            $$11.ab = $$11.dC();
            $$11.ac = $$11.dG();
         }

         grn $$13;
         if ($$10 && this.h.b($$11)) {
            grp $$12 = this.k.e();
            $$13 = $$12;
            int $$14 = $$11.m_();
            $$12.a(ayh.b($$14), ayh.c($$14), ayh.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(fld $$0, grn.a $$1, grn.a $$2, fpy $$3, float $$4) {
      fgc $$5 = $$3.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator var13 = this.r.iterator();

      while (var13.hasNext()) {
         gvd.b $$9 = (gvd.b)var13.next();
         List<dyo> $$10 = $$9.d().b();
         if (!$$10.isEmpty()) {
            for (dyo $$11 : $$10) {
               iw $$12 = $$11.ax_();
               grn $$13 = $$1;
               $$0.a();
               $$0.a((double)$$12.u() - $$6, (double)$$12.v() - $$7, (double)$$12.w() - $$8);
               SortedSet<arb> $$14 = (SortedSet<arb>)this.x.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     fld.a $$16 = $$0.c();
                     flg $$17 = new fle($$2.getBuffer(hna.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        flg $$3x = $$1.getBuffer($$2x);
                        return $$2x.T() ? flh.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.j.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      synchronized (this.t) {
         for (dyo $$18 : this.t) {
            iw $$19 = $$18.ax_();
            $$0.a();
            $$0.a((double)$$19.u() - $$6, (double)$$19.v() - $$7, (double)$$19.w() - $$8);
            this.j.a($$18, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(fld $$0, fpy $$1, grn.a $$2) {
      fgc $$3 = $$1.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.x.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<arb>> $$7 = (Entry<SortedSet<arb>>)var11.next();
         iw $$8 = iw.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<arb> $$9 = (SortedSet<arb>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
               fld.a $$11 = $$0.c();
               flg $$12 = new fle($$2.getBuffer(hna.l.get($$10)), $$11, 1.0F);
               this.h.ap().a(this.p.a_($$8), $$8, this.p, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(fpy $$0, grn.a $$1, fld $$2, boolean $$3) {
      if (this.h.w instanceof ffy $$4) {
         if ($$4.d() != fga.a.a) {
            iw $$6 = $$4.b();
            ebq $$7 = this.p.a_($$6);
            if (!$$7.l() && this.p.E_().a($$6)) {
               boolean $$8 = grf.a($$7).V();
               if ($$8 != $$3) {
                  return;
               }

               fgc $$9 = $$0.b();
               Boolean $$10 = this.h.n.v().c();
               if ($$10) {
                  flg $$11 = $$1.getBuffer(gry.x());
                  this.a($$2, $$11, $$0.g(), $$9.d, $$9.e, $$9.f, $$6, $$7, -16777216);
               }

               flg $$12 = $$1.getBuffer(gry.w());
               int $$13 = $$10 ? -11010079 : ayh.c(102, -16777216);
               this.a($$2, $$12, $$0.g(), $$9.d, $$9.e, $$9.f, $$6, $$7, $$13);
               $$1.a();
            }
         }
      }
   }

   private void a(fld $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bxe $$0, double $$1, double $$2, double $$3, float $$4, fld $$5, grn $$6) {
      double $$7 = azz.d((double)$$4, $$0.aa, $$0.dA());
      double $$8 = azz.d((double)$$4, $$0.ab, $$0.dC());
      double $$9 = azz.d((double)$$4, $$0.ac, $$0.dG());
      this.i.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.i.a($$0, $$4));
   }

   private void a(fgc $$0) {
      if (!this.r.isEmpty()) {
         iw $$1 = iw.a((jq)$$0);
         boolean $$2 = !$$1.equals(this.P);
         brl.a().a("translucent_sort");
         gvd.e $$3 = new gvd.e();
         ObjectListIterator $$5 = this.s.iterator();

         while ($$5.hasNext()) {
            gvd.b $$4 = (gvd.b)$$5.next();
            this.a($$4, $$3, $$0, $$2, true);
         }

         this.Q = this.Q % this.r.size();
         int $$5x = Math.max(this.r.size() / 8, 15);

         while ($$5x-- > 0) {
            int $$6 = this.Q++ % this.r.size();
            this.a((gvd.b)this.r.get($$6), $$3, $$0, $$2, false);
         }

         this.P = $$1;
         brl.a().c();
      }
   }

   private void a(gvd.b $$0, gvd.e $$1, fgc $$2, boolean $$3, boolean $$4) {
      $$1.b($$2, $$0.g());
      boolean $$5 = !$$1.equals($$0.d.get());
      boolean $$6 = $$3 && ($$1.a() || $$4);
      if (($$6 || $$5) && !$$0.l() && $$0.k()) {
         $$0.a(this.I);
      }
   }

   private void a(gry $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      brr $$6 = brl.a().c(() -> "render_" + $$0.b);
      $$6.a($$0::toString);
      boolean $$7 = $$0 != gry.g();
      ObjectListIterator<gvd.b> $$8 = this.r.listIterator($$7 ? 0 : this.r.size());
      $$0.a();
      RenderPipeline $$9 = $$0.M();
      ArrayList<RenderPass.a> $$10 = new ArrayList<>();
      RenderSystem.a $$11 = RenderSystem.getSequentialBuffer($$0.Q());
      int $$12 = 0;

      while ($$7 ? $$8.hasNext() : $$8.hasPrevious()) {
         gvd.b $$13 = $$7 ? (gvd.b)$$8.next() : (gvd.b)$$8.previous();
         gvd.c $$14 = $$13.a($$0);
         if (!$$13.d().a($$0) && $$14 != null) {
            GpuBuffer $$15;
            VertexFormat.a $$16;
            if ($$14.b() == null) {
               if ($$14.c() > $$12) {
                  $$12 = $$14.c();
               }

               $$15 = null;
               $$16 = null;
            } else {
               $$15 = $$14.b();
               $$16 = $$14.d();
            }

            iw $$19 = $$13.f();
            $$10.add(
               new RenderPass.a(
                  0,
                  $$14.a(),
                  $$15,
                  $$16,
                  0,
                  $$14.c(),
                  $$4x -> $$4x.upload("ModelOffset", (float)((double)$$19.u() - $$1), (float)((double)$$19.v() - $$2), (float)((double)$$19.w() - $$3))
               )
            );
         }
      }

      GpuBuffer $$20 = $$12 == 0 ? null : $$11.b($$12);
      VertexFormat.a $$21 = $$12 == 0 ? null : $$11.a();

      try (RenderPass $$22 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass($$0.L().c(), OptionalInt.empty(), $$0.L().d(), OptionalDouble.empty())) {
         $$22.setPipeline($$9);

         for (int $$23 = 0; $$23 < 12; $$23++) {
            GpuTexture $$24 = RenderSystem.getShaderTexture($$23);
            if ($$24 != null) {
               $$22.bindSampler("Sampler" + $$23, $$24);
            }
         }

         $$22.drawMultipleIndexed($$10, $$20, $$21);
      }

      $$6.close();
      $$0.b();
   }

   public void k() {
      this.N = true;
   }

   public void l() {
      this.O = null;
   }

   public void m() {
      if (this.p.u().i()) {
         this.v++;
      }

      if (this.v % 20 == 0) {
         Iterator<arb> $$0 = this.w.values().iterator();

         while ($$0.hasNext()) {
            arb $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.v - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(arb $$0) {
      long $$1 = $$0.b().a();
      Set<arb> $$2 = (Set<arb>)this.x.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.x.remove($$1);
      }
   }

   private void b(fix $$0, fpy $$1, float $$2, grb $$3) {
      eyc $$4 = $$1.k();
      if ($$4 != eyc.c && $$4 != eyc.a && !this.b($$1)) {
         gqz $$5 = this.p.c();
         gqz.d $$6 = $$5.c();
         if ($$6 != gqz.d.a) {
            fiy $$7 = $$0.a("sky");
            this.z.k = $$7.b(this.z.k);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               if ($$6 == gqz.d.c) {
                  this.l.b();
               } else {
                  fld $$4x = new fld();
                  float $$5x = this.p.a($$2);
                  float $$6x = this.p.f($$2);
                  float $$7x = 1.0F - this.p.d($$2);
                  float $$8 = this.p.i($$2) * $$7x;
                  int $$9 = $$5.b($$6x);
                  int $$10 = this.p.at();
                  int $$11 = this.p.a(this.h.j.k().b(), $$2);
                  float $$12 = ayh.j($$11);
                  float $$13 = ayh.k($$11);
                  float $$14 = ayh.l($$11);
                  this.l.a($$12, $$13, $$14);
                  grn.a $$15 = this.k.c();
                  if ($$5.a($$6x)) {
                     this.l.a($$4x, $$15, $$5x, $$9);
                  }

                  this.l.a($$4x, $$15, $$6x, $$10, $$7x, $$8, $$3);
                  $$15.b();
                  if (this.a($$2)) {
                     this.l.a();
                  }
               }
            });
         }
      }
   }

   private boolean a(float $$0) {
      return this.h.t.n($$0).e - this.p.k().a(this.p) < 0.0;
   }

   private boolean b(fpy $$0) {
      return !($$0.g() instanceof byf $$1) ? false : $$1.b(bwk.o) || $$1.b(bwk.G);
   }

   private void c(fpy $$0) {
      brm $$1 = brl.a();
      $$1.a("populate_sections_to_compile");
      gvb $$2 = new gvb();
      iw $$3 = $$0.c();
      List<gvd.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.r.iterator();

      while (var6.hasNext()) {
         gvd.b $$5 = (gvd.b)var6.next();
         if ($$5.i() && $$5.a()) {
            boolean $$6 = false;
            if (this.h.n.m().c() == fqw.c) {
               iw $$7 = jz.a($$5.g()).k();
               $$6 = $$7.j($$3) < 768.0 || $$5.j();
            } else if (this.h.n.m().c() == fqw.b) {
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

      for (gvd.b $$8 : $$4) {
         $$8.a(this.I, $$2);
         $$8.h();
      }

      $$1.c();
      this.a($$0.b());
   }

   private void a(fld $$0, flg $$1, bxe $$2, double $$3, double $$4, double $$5, iw $$6, ebq $$7, int $$8) {
      gsg.a($$0, $$1, $$7.a(this.p, $$6, fgh.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, $$8);
   }

   public void a(djn $$0, iw $$1, ebq $$2, ebq $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(iw $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(jz.a($$3), jz.a($$4), jz.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(jz.a($$7), jz.a($$8), jz.a($$6));
            }
         }
      }
   }

   public void a(iw $$0, ebq $$1, ebq $$2) {
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
      gvd.b $$1 = this.u.a($$0);
      if ($$1 != null) {
         this.q.a($$1);
      }
   }

   public void a(lx $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(lx $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         p $$10 = p.a(var19, "Exception while adding particle");
         q $$11 = $$10.a("Particle being added");
         $$11.a("ID", mh.i.b($$0.a()));
         $$11.a("Parameters", () -> lz.bk.encodeStart(this.p.J_().a(uo.a), $$0).toString());
         $$11.a("Position", () -> q.a(this.p, $$3, $$4, $$5));
         throw new aa($$10);
      }
   }

   public <T extends lx> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   gox b(lx $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gox b(lx $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fpy $$9 = this.h.j.k();
      art $$10 = this.a($$2);
      if ($$1) {
         return this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == art.c ? null : this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private art a(boolean $$0) {
      art $$1 = this.h.n.au().c();
      if ($$0 && $$1 == art.c && this.p.A.a(10) == 0) {
         $$1 = art.b;
      }

      if ($$1 == art.b && this.p.A.a(3) == 0) {
         $$1 = art.c;
      }

      return $$1;
   }

   public void a(int $$0, iw $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         arb $$4 = (arb)this.w.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new arb($$0, $$1);
            this.w.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.v);
         ((SortedSet)this.x.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         arb $$3 = (arb)this.w.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean n() {
      return this.I.h();
   }

   public void a(djo $$0) {
      this.q.a($$0);
   }

   public void o() {
      this.q.a();
      this.m.a();
   }

   public void a(Collection<dyo> $$0, Collection<dyo> $$1) {
      synchronized (this.t) {
         this.t.removeAll($$0);
         this.t.addAll($$1);
      }
   }

   public static int a(djk $$0, iw $$1) {
      return a(gri.a.a, $$0, $$0.a_($$1), $$1);
   }

   public static int a(gri.a $$0, djk $$1, ebq $$2, iw $$3) {
      if ($$2.b($$1, $$3)) {
         return 15728880;
      } else {
         int $$4 = $$0.packedBrightness($$1, $$3);
         int $$5 = grk.a($$4);
         int $$6 = $$2.k();
         if ($$5 < $$6) {
            int $$7 = grk.b($$4);
            return grk.a($$6, $$7);
         } else {
            return $$4;
         }
      }
   }

   public boolean a(iw $$0) {
      gvd.b $$1 = this.u.a($$0);
      return $$1 != null && $$1.c.get() != gvd.a.a;
   }

   @Nullable
   public fjr p() {
      return this.z.q != null ? this.z.q.get() : null;
   }

   @Nullable
   public fjr q() {
      return this.z.l != null ? this.z.l.get() : null;
   }

   @Nullable
   public fjr r() {
      return this.z.m != null ? this.z.m.get() : null;
   }

   @Nullable
   public fjr s() {
      return this.z.n != null ? this.z.n.get() : null;
   }

   @Nullable
   public fjr t() {
      return this.z.o != null ? this.z.o.get() : null;
   }

   @Nullable
   public fjr u() {
      return this.z.p != null ? this.z.p.get() : null;
   }

   @bbi
   public ObjectArrayList<gvd.b> v() {
      return this.r;
   }

   @bbi
   public gsd w() {
      return this.q;
   }

   @Nullable
   public gvh x() {
      return this.O;
   }

   public gqx y() {
      return this.m;
   }

   @FunctionalInterface
   public interface a {
      gri.a a = ($$0, $$1) -> {
         int $$2 = $$0.a(dks.a, $$1);
         int $$3 = $$0.a(dks.b, $$1);
         return ayn.a($$3, $$2);
      };

      int packedBrightness(djk var1, iw var2);
   }
}
