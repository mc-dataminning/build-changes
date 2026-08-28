import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
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

public class gqh implements ave, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   private static final alg e = alg.b("transparency");
   private static final alg f = alg.b("entity_outline");
   public static final int a = 16;
   public static final int b = 8;
   public static final int c = 32;
   private static final int g = 15;
   private final fpo h;
   private final gwr i;
   private final gsx j;
   private final gqu k;
   private final grh l = new grh();
   private final gpu m = new gpu();
   private final grn n = new grn();
   private final grm o = new grm();
   @Nullable
   private gkl p;
   private final grc q = new grc();
   private final ObjectArrayList<gub.b> r = new ObjectArrayList(10000);
   private final ObjectArrayList<gub.b> s = new ObjectArrayList(50);
   private final Set<dxm> t = Sets.newHashSet();
   @Nullable
   private grk u;
   private int v;
   private final Int2ObjectMap<aqq> w = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aqq>> x = new Long2ObjectOpenHashMap();
   @Nullable
   private fie y;
   private final gqi z = new gqi();
   private int A = Integer.MIN_VALUE;
   private int B = Integer.MIN_VALUE;
   private int C = Integer.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   private double G = Double.MIN_VALUE;
   private double H = Double.MIN_VALUE;
   @Nullable
   private gub I;
   private int J = -1;
   private final List<bwi> K = new ArrayList<>();
   private int L;
   private guf M;
   private boolean N;
   @Nullable
   private guf O;
   @Nullable
   private iv P;
   private int Q;

   public gqh(fpo $$0, gwr $$1, gsx $$2, gqu $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
   }

   public void a(fow $$0) {
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
   public void a(avd $$0) {
      this.a();
   }

   public void a() {
      if (this.y != null) {
         this.y.a();
      }

      this.y = new fif("Entity Outline", this.h.aO().k(), this.h.aO().l(), true);
      this.y.a(0.0F, 0.0F, 0.0F, 0.0F);
   }

   @Nullable
   private gqq z() {
      if (!fpo.O()) {
         return null;
      } else {
         gqq $$0 = this.h.ab().a(e, gqi.j);
         if ($$0 == null) {
            this.h.n.k().a(fpg.b);
            this.h.n.az();
         }

         return $$0;
      }
   }

   public void b() {
      if (this.c()) {
         this.y.e();
      }
   }

   protected boolean c() {
      return !this.h.j.a() && this.y != null && this.h.t != null;
   }

   public void a(@Nullable gkl $$0) {
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
            this.I = new gub(this.p, this, ag.h(), this.k, this.h.ap(), this.h.ar());
         } else {
            this.I.a(this.p);
         }

         this.m.a();
         gqe.a(fpo.N());
         this.J = this.h.n.aH();
         if (this.u != null) {
            this.u.a();
         }

         this.I.g();
         synchronized (this.t) {
            this.t.clear();
         }

         this.u = new grk(this.I, this.p, this.h.n.aH(), this);
         this.q.a(this.u);
         this.A();
         fow $$0 = this.h.j.k();
         this.u.a(jy.a($$0.b()));
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

   public gub f() {
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
         gub.b $$1 = (gub.b)var2.next();
         if ($$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String j() {
      return "E: " + this.L + "/" + this.p.g() + ", SD: " + this.p.m();
   }

   private void a(fow $$0, guf $$1, boolean $$2, boolean $$3) {
      fex $$4 = $$0.b();
      if (this.h.n.aH() != this.J) {
         this.d();
      }

      bqq $$5 = bqp.a();
      $$5.a("camera");
      int $$6 = jy.a($$4.a());
      int $$7 = jy.a($$4.b());
      int $$8 = jy.a($$4.c());
      if (this.A != $$6 || this.B != $$7 || this.C != $$8) {
         this.A = $$6;
         this.B = $$7;
         this.C = $$8;
         this.u.a(jy.a($$4));
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

   public static guf a(guf $$0) {
      return new guf($$0).a(8);
   }

   private void b(guf $$0) {
      if (!fpo.Q().bx()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         bqp.a().a("apply_frustum");
         this.A();
         this.q.a($$0, this.r, this.s);
         bqp.a().c();
      }
   }

   public void a(gub.b $$0) {
      this.q.a($$0);
   }

   public void a(fex $$0, Matrix4f $$1, Matrix4f $$2) {
      this.M = new guf($$1, $$2);
      this.M.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(fjd $$0, fpe $$1, boolean $$2, fow $$3, gqc $$4, Matrix4f $$5, Matrix4f $$6) {
      float $$7 = $$1.a(false);
      RenderSystem.setShaderGameTime(this.p.ae(), $$7);
      this.j.a(this.p, $$3, this.h.w);
      this.i.a(this.p, $$3, this.h.v);
      final bqq $$8 = bqp.a();
      $$8.b("light_update_queue");
      this.p.b();
      $$8.b("light_updates");
      this.p.h().q().a();
      fex $$9 = $$3.b();
      double $$10 = $$9.a();
      double $$11 = $$9.b();
      double $$12 = $$9.c();
      $$8.b("culling");
      boolean $$13 = this.O != null;
      guf $$14 = $$13 ? this.O : this.M;
      bqp.a().b("captureFrustum");
      if (this.N) {
         this.O = $$13 ? new guf($$5, $$6) : $$14;
         this.O.a($$10, $$11, $$12);
         this.N = false;
      }

      $$8.b("fog");
      float $$15 = $$4.j();
      boolean $$16 = this.h.s.c().a(azm.a($$10), azm.a($$11)) || this.h.m.j().d();
      Vector4f $$17 = gqb.a($$3, $$7, this.h.s, this.h.n.aH(), $$4.c($$7));
      gqa $$18 = gqb.a($$3, gqb.d.b, $$17, $$15, $$16, $$7);
      gqa $$19 = gqb.a($$3, gqb.d.a, $$17, $$15, $$16, $$7);
      $$8.b("cullEntities");
      boolean $$20 = this.a($$3, $$14, this.K);
      this.L = this.K.size();
      $$8.b("terrain_setup");
      this.a($$3, $$14, $$13, this.h.t.V_());
      $$8.b("compile_sections");
      this.c($$3);
      Matrix4fStack $$21 = RenderSystem.getModelViewStack();
      $$21.pushMatrix();
      $$21.mul($$5);
      fhw $$22 = new fhw();
      this.z.k = $$22.a("main", this.h.h());
      int $$23 = this.h.h().c;
      int $$24 = this.h.h().d;
      fje $$25 = new fje($$23, $$24, true, 0);
      gqq $$26 = this.z();
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

      fhx $$27 = $$22.a("clear");
      this.z.k = $$27.b(this.z.k);
      $$27.a(() -> {
         RenderSystem.clearColor($$17.x, $$17.y, $$17.z, 0.0F);
         RenderSystem.clear(16640);
      });
      if (!$$16) {
         this.b($$22, $$3, $$7, $$19);
      }

      this.a($$22, $$14, $$3, $$5, $$6, $$18, $$2, $$20, $$1, $$8);
      gqq $$28 = this.h.ab().a(f, gqi.i);
      if ($$20 && $$28 != null) {
         $$28.a($$22, $$23, $$24, this.z);
      }

      this.a($$22, $$3, $$7, $$18);
      fpa $$29 = this.h.n.aC();
      if ($$29 != fpa.a) {
         float $$30 = this.p.c().a();
         if (!Float.isNaN($$30)) {
            float $$31 = (float)this.v + $$7;
            int $$32 = this.p.h($$7);
            this.a($$22, $$29, $$3.b(), $$31, $$32, $$30 + 0.33F);
         }
      }

      this.a($$22, $$3.b(), $$7, $$18);
      if ($$26 != null) {
         $$26.a($$22, $$23, $$24, this.z);
      }

      this.a($$22, $$9, $$18);
      $$8.b("framegraph");
      $$22.a($$0, new fhw.c() {
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
      RenderSystem.setShaderFog(gqa.a);
   }

   private void a(fhw $$0, guf $$1, fow $$2, Matrix4f $$3, Matrix4f $$4, gqa $$5, boolean $$6, boolean $$7, fpe $$8, bqq $$9) {
      fhx $$10 = $$0.a("main");
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

      fjg<fie> $$11 = this.z.k;
      fjg<fie> $$12 = this.z.l;
      fjg<fie> $$13 = this.z.m;
      fjg<fie> $$14 = this.z.q;
      $$10.a(() -> {
         RenderSystem.setShaderFog($$5);
         float $$12x = $$8.a(false);
         fex $$13x = $$2.b();
         double $$14x = $$13x.a();
         double $$15 = $$13x.b();
         double $$16 = $$13x.c();
         $$9.a("terrain");
         this.a(gqx.c(), $$14x, $$15, $$16, $$3, $$4);
         this.a(gqx.d(), $$14x, $$15, $$16, $$3, $$4);
         this.a(gqx.e(), $$14x, $$15, $$16, $$3, $$4);
         if (this.p.c().e()) {
            fiq.a();
         } else {
            fiq.b();
         }

         if ($$13 != null) {
            $$13.get().a(this.h.h());
            $$11.get().a(false);
         }

         if (this.c() && $$14 != null) {
            $$14.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$14.get().f();
            $$11.get().a(false);
         }

         fjy $$17 = new fjy();
         gqm.a $$18 = this.k.c();
         gqm.a $$19 = this.k.d();
         $$9.b("entities");
         this.a($$17, $$18, $$2, $$8, this.K);
         $$18.a();
         this.a($$17);
         $$9.b("blockentities");
         this.a($$17, $$18, $$19, $$2, $$12x);
         $$18.a();
         this.a($$17);
         $$18.a(gqx.c());
         $$18.a(gqx.t());
         $$18.a(gqx.u());
         $$18.a(grg.h());
         $$18.a(grg.i());
         $$18.a(grg.c());
         $$18.a(grg.d());
         $$18.a(grg.e());
         $$18.a(grg.f());
         $$18.a(grg.g());
         this.k.e().a();
         if ($$6) {
            this.a($$2, $$18, $$17, false);
         }

         $$9.b("debug");
         this.h.l.a($$17, $$1, $$18, $$14x, $$15, $$16);
         $$18.a();
         this.a($$17);
         $$18.a(grg.j());
         $$18.a(grg.a());
         $$18.a(grg.b());
         $$18.a(gqx.j());
         $$18.a(gqx.l());
         $$18.a(gqx.k());
         $$18.a(gqx.m());
         $$9.b("destroyProgress");
         this.a($$17, $$2, $$19);
         $$19.b();
         this.a($$17);
         $$18.a(gqx.i());
         $$18.b();
         if ($$12 != null) {
            $$12.get().a($$11.get());
         }

         $$9.b("translucent");
         this.a(gqx.f(), $$14x, $$15, $$16, $$3, $$4);
         $$9.b("string");
         this.a(gqx.s(), $$14x, $$15, $$16, $$3, $$4);
         if ($$6) {
            this.a($$2, $$18, $$17, true);
         }

         $$18.b();
         $$9.c();
      });
   }

   private void a(fhw $$0, fow $$1, float $$2, gqa $$3) {
      fhx $$4 = $$0.a("particles");
      if (this.z.n != null) {
         this.z.n = $$4.b(this.z.n);
         $$4.a(this.z.k);
      } else {
         this.z.k = $$4.b(this.z.k);
      }

      fjg<fie> $$5 = this.z.k;
      fjg<fie> $$6 = this.z.n;
      $$4.a(() -> {
         RenderSystem.setShaderFog($$3);
         if ($$6 != null) {
            $$6.get().a($$5.get());
         }

         this.h.g.a($$1, $$2, this.k.c());
      });
   }

   private void a(fhw $$0, fpa $$1, fex $$2, float $$3, int $$4, float $$5) {
      fhx $$6 = $$0.a("clouds");
      if (this.z.p != null) {
         this.z.p = $$6.b(this.z.p);
      } else {
         this.z.k = $$6.b(this.z.k);
      }

      $$6.a(() -> this.m.a($$4, $$1, $$5, $$2, $$3));
   }

   private void a(fhw $$0, fex $$1, float $$2, gqa $$3) {
      int $$4 = this.h.n.aH() * 16;
      float $$5 = this.h.j.g();
      fhx $$6 = $$0.a("weather");
      if (this.z.o != null) {
         this.z.o = $$6.b(this.z.o);
      } else {
         this.z.k = $$6.b(this.z.k);
      }

      $$6.a(() -> {
         RenderSystem.setShaderFog($$3);
         gqm.a $$5x = this.k.c();
         this.o.a(this.h.s, $$5x, this.v, $$2, $$1);
         this.n.a(this.p.A_(), $$1, (double)$$4, (double)$$5);
         $$5x.b();
      });
   }

   private void a(fhw $$0, fex $$1, gqa $$2) {
      fhx $$3 = $$0.a("late_debug");
      this.z.k = $$3.b(this.z.k);
      if (this.z.m != null) {
         this.z.m = $$3.b(this.z.m);
      }

      fjg<fie> $$4 = this.z.k;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         $$4.get().a(false);
         fjy $$3x = new fjy();
         gqm.a $$4x = this.k.c();
         this.h.l.a($$3x, $$4x, $$1.d, $$1.e, $$1.f);
         $$4x.a();
         this.a($$3x);
      });
   }

   private boolean a(fow $$0, guf $$1, List<bwi> $$2) {
      fex $$3 = $$0.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.c();
      bwi.b(azm.a((double)this.h.n.aH() / 8.0, 1.0, 2.5) * this.h.n.g().c());

      for (bwi $$9 : this.p.d()) {
         if (this.i.a($$9, $$1, $$4, $$5, $$6) || $$9.A(this.h.t)) {
            iv $$10 = $$9.du();
            if ((this.p.e($$10.v()) || this.a($$10))
               && ($$9 != $$0.g() || $$0.i() || $$0.g() instanceof bxj && ((bxj)$$0.g()).fQ())
               && (!($$9 instanceof gpj) || $$0.g() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.h.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(fjy $$0, gqm.a $$1, fow $$2, fpe $$3, List<bwi> $$4) {
      fex $$5 = $$2.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      bup $$9 = this.h.s.u();
      boolean $$10 = this.c();

      for (bwi $$11 : $$4) {
         if ($$11.af == 0) {
            $$11.aa = $$11.dz();
            $$11.ab = $$11.dB();
            $$11.ac = $$11.dF();
         }

         gqm $$13;
         if ($$10 && this.h.b($$11)) {
            gqo $$12 = this.k.e();
            $$13 = $$12;
            int $$14 = $$11.f_();
            $$12.a(axw.b($$14), axw.c($$14), axw.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(fjy $$0, gqm.a $$1, gqm.a $$2, fow $$3, float $$4) {
      fex $$5 = $$3.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator var13 = this.r.iterator();

      while (var13.hasNext()) {
         gub.b $$9 = (gub.b)var13.next();
         List<dxm> $$10 = $$9.d().b();
         if (!$$10.isEmpty()) {
            for (dxm $$11 : $$10) {
               iv $$12 = $$11.ax_();
               gqm $$13 = $$1;
               $$0.a();
               $$0.a((double)$$12.u() - $$6, (double)$$12.v() - $$7, (double)$$12.w() - $$8);
               SortedSet<aqq> $$14 = (SortedSet<aqq>)this.x.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     fjy.a $$16 = $$0.c();
                     fkc $$17 = new fjz($$2.getBuffer(hlt.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        fkc $$3x = $$1.getBuffer($$2x);
                        return $$2x.aa() ? fkf.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.j.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      synchronized (this.t) {
         for (dxm $$18 : this.t) {
            iv $$19 = $$18.ax_();
            $$0.a();
            $$0.a((double)$$19.u() - $$6, (double)$$19.v() - $$7, (double)$$19.w() - $$8);
            this.j.a($$18, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(fjy $$0, fow $$1, gqm.a $$2) {
      fex $$3 = $$1.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.x.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<aqq>> $$7 = (Entry<SortedSet<aqq>>)var11.next();
         iv $$8 = iv.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<aqq> $$9 = (SortedSet<aqq>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
               fjy.a $$11 = $$0.c();
               fkc $$12 = new fjz($$2.getBuffer(hlt.l.get($$10)), $$11, 1.0F);
               this.h.ap().a(this.p.a_($$8), $$8, this.p, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(fow $$0, gqm.a $$1, fjy $$2, boolean $$3) {
      if (this.h.w instanceof fet $$4) {
         if ($$4.d() != fev.a.a) {
            iv $$6 = $$4.b();
            eao $$7 = this.p.a_($$6);
            if (!$$7.l() && this.p.A_().a($$6)) {
               boolean $$8 = gqe.a($$7).ac();
               if ($$8 != $$3) {
                  return;
               }

               fex $$9 = $$0.b();
               Boolean $$10 = this.h.n.v().c();
               if ($$10) {
                  fkc $$11 = $$1.getBuffer(gqx.z());
                  this.a($$2, $$11, $$0.g(), $$9.d, $$9.e, $$9.f, $$6, $$7, -16777216);
               }

               fkc $$12 = $$1.getBuffer(gqx.y());
               int $$13 = $$10 ? -11010079 : axw.c(102, -16777216);
               this.a($$2, $$12, $$0.g(), $$9.d, $$9.e, $$9.f, $$6, $$7, $$13);
               $$1.a();
            }
         }
      }
   }

   private void a(fjy $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bwi $$0, double $$1, double $$2, double $$3, float $$4, fjy $$5, gqm $$6) {
      double $$7 = azm.d((double)$$4, $$0.aa, $$0.dz());
      double $$8 = azm.d((double)$$4, $$0.ab, $$0.dB());
      double $$9 = azm.d((double)$$4, $$0.ac, $$0.dF());
      this.i.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.i.a($$0, $$4));
   }

   private void a(fex $$0) {
      if (!this.r.isEmpty()) {
         iv $$1 = iv.a((jp)$$0);
         boolean $$2 = !$$1.equals(this.P);
         bqp.a().a("translucent_sort");
         gub.d $$3 = new gub.d();
         ObjectListIterator $$5 = this.s.iterator();

         while ($$5.hasNext()) {
            gub.b $$4 = (gub.b)$$5.next();
            this.a($$4, $$3, $$0, $$2, true);
         }

         this.Q = this.Q % this.r.size();
         int $$5x = Math.max(this.r.size() / 8, 15);

         while ($$5x-- > 0) {
            int $$6 = this.Q++ % this.r.size();
            this.a((gub.b)this.r.get($$6), $$3, $$0, $$2, false);
         }

         this.P = $$1;
         bqp.a().c();
      }
   }

   private void a(gub.b $$0, gub.d $$1, fex $$2, boolean $$3, boolean $$4) {
      $$1.b($$2, $$0.g());
      boolean $$5 = !$$1.equals($$0.d.get());
      boolean $$6 = $$3 && ($$1.a() || $$4);
      if (($$6 || $$5) && !$$0.l() && $$0.k()) {
         $$0.a(this.I);
      }
   }

   private void a(gqx $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      bqv $$6 = bqp.a().c(() -> "render_" + $$0.b);
      $$6.a($$0::toString);
      boolean $$7 = $$0 != gqx.f();
      ObjectListIterator<gub.b> $$8 = this.r.listIterator($$7 ? 0 : this.r.size());
      $$0.a();
      gpv $$9 = $$0.T();
      if ($$9 == null) {
         $$0.b();
         $$6.close();
      } else {
         $$9.a(fkd.c.h, $$4, $$5, this.h.aO());
         $$9.b();
         fjl $$10 = $$9.o;

         while ($$7 ? $$8.hasNext() : $$8.hasPrevious()) {
            gub.b $$11 = $$7 ? (gub.b)$$8.next() : (gub.b)$$8.previous();
            if (!$$11.d().a($$0)) {
               fkb $$12 = $$11.a($$0);
               iv $$13 = $$11.f();
               if ($$10 != null) {
                  $$10.a((float)((double)$$13.u() - $$1), (float)((double)$$13.v() - $$2), (float)((double)$$13.w() - $$3));
                  $$10.c();
               }

               $$12.a();
               $$12.c();
            }
         }

         if ($$10 != null) {
            $$10.a(0.0F, 0.0F, 0.0F);
         }

         $$9.a();
         fkb.b();
         $$6.close();
         $$0.b();
      }
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
         Iterator<aqq> $$0 = this.w.values().iterator();

         while ($$0.hasNext()) {
            aqq $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.v - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(aqq $$0) {
      long $$1 = $$0.b().a();
      Set<aqq> $$2 = (Set<aqq>)this.x.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.x.remove($$1);
      }
   }

   private void b(fhw $$0, fow $$1, float $$2, gqa $$3) {
      ewx $$4 = $$1.k();
      if ($$4 != ewx.c && $$4 != ewx.a && !this.b($$1)) {
         gpy $$5 = this.p.c();
         gpy.d $$6 = $$5.c();
         if ($$6 != gpy.d.a) {
            fhx $$7 = $$0.a("sky");
            this.z.k = $$7.b(this.z.k);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               if ($$6 == gpy.d.c) {
                  this.l.b();
               } else {
                  fjy $$4x = new fjy();
                  float $$5x = this.p.a($$2);
                  float $$6x = this.p.f($$2);
                  float $$7x = 1.0F - this.p.d($$2);
                  float $$8 = this.p.i($$2) * $$7x;
                  int $$9 = $$5.b($$6x);
                  int $$10 = this.p.at();
                  int $$11 = this.p.a(this.h.j.k().b(), $$2);
                  float $$12 = axw.j($$11);
                  float $$13 = axw.k($$11);
                  float $$14 = axw.l($$11);
                  this.l.a($$12, $$13, $$14);
                  gqm.a $$15 = this.k.c();
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

   private boolean b(fow $$0) {
      return !($$0.g() instanceof bxj $$1) ? false : $$1.b(bvo.o) || $$1.b(bvo.G);
   }

   private void c(fow $$0) {
      bqq $$1 = bqp.a();
      $$1.a("populate_sections_to_compile");
      gtz $$2 = new gtz();
      iv $$3 = $$0.c();
      List<gub.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.r.iterator();

      while (var6.hasNext()) {
         gub.b $$5 = (gub.b)var6.next();
         if ($$5.i() && $$5.a()) {
            boolean $$6 = false;
            if (this.h.n.m().c() == fpu.c) {
               iv $$7 = jy.a($$5.g()).k();
               $$6 = $$7.j($$3) < 768.0 || $$5.j();
            } else if (this.h.n.m().c() == fpu.b) {
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

      for (gub.b $$8 : $$4) {
         $$8.a(this.I, $$2);
         $$8.h();
      }

      $$1.c();
      this.a($$0.b());
   }

   private void a(fjy $$0, fkc $$1, bwi $$2, double $$3, double $$4, double $$5, iv $$6, eao $$7, int $$8) {
      grf.a($$0, $$1, $$7.a(this.p, $$6, ffc.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, $$8);
   }

   public void a(din $$0, iv $$1, eao $$2, eao $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(iv $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(jy.a($$3), jy.a($$4), jy.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(jy.a($$7), jy.a($$8), jy.a($$6));
            }
         }
      }
   }

   public void a(iv $$0, eao $$1, eao $$2) {
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
      gub.b $$1 = this.u.a($$0);
      if ($$1 != null) {
         this.q.a($$1);
      }
   }

   public void a(lw $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(lw $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         p $$10 = p.a(var19, "Exception while adding particle");
         q $$11 = $$10.a("Particle being added");
         $$11.a("ID", mg.i.b($$0.a()));
         $$11.a("Parameters", () -> ly.bk.encodeStart(this.p.F_().a(un.a), $$0).toString());
         $$11.a("Position", () -> q.a(this.p, $$3, $$4, $$5));
         throw new aa($$10);
      }
   }

   public <T extends lw> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   gnu b(lw $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gnu b(lw $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fow $$9 = this.h.j.k();
      ari $$10 = this.a($$2);
      if ($$1) {
         return this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == ari.c ? null : this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private ari a(boolean $$0) {
      ari $$1 = this.h.n.au().c();
      if ($$0 && $$1 == ari.c && this.p.A.a(10) == 0) {
         $$1 = ari.b;
      }

      if ($$1 == ari.b && this.p.A.a(3) == 0) {
         $$1 = ari.c;
      }

      return $$1;
   }

   public void a(int $$0, iv $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         aqq $$4 = (aqq)this.w.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new aqq($$0, $$1);
            this.w.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.v);
         ((SortedSet)this.x.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         aqq $$3 = (aqq)this.w.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean n() {
      return this.I.h();
   }

   public void a(dio $$0) {
      this.q.a($$0);
   }

   public void o() {
      this.q.a();
      this.m.a();
   }

   public void a(Collection<dxm> $$0, Collection<dxm> $$1) {
      synchronized (this.t) {
         this.t.removeAll($$0);
         this.t.addAll($$1);
      }
   }

   public static int a(dik $$0, iv $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(dik $$0, eao $$1, iv $$2) {
      if ($$1.b($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(djq.a, $$2);
         int $$4 = $$0.a(djq.b, $$2);
         int $$5 = $$1.k();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(iv $$0) {
      gub.b $$1 = this.u.a($$0);
      return $$1 != null && $$1.c.get() != gub.a.a;
   }

   @Nullable
   public fie p() {
      return this.z.q != null ? this.z.q.get() : null;
   }

   @Nullable
   public fie q() {
      return this.z.l != null ? this.z.l.get() : null;
   }

   @Nullable
   public fie r() {
      return this.z.m != null ? this.z.m.get() : null;
   }

   @Nullable
   public fie s() {
      return this.z.n != null ? this.z.n.get() : null;
   }

   @Nullable
   public fie t() {
      return this.z.o != null ? this.z.o.get() : null;
   }

   @Nullable
   public fie u() {
      return this.z.p != null ? this.z.p.get() : null;
   }

   @bav
   public ObjectArrayList<gub.b> v() {
      return this.r;
   }

   @bav
   public grc w() {
      return this.q;
   }

   @Nullable
   public guf x() {
      return this.O;
   }

   public gpu y() {
      return this.m;
   }
}
