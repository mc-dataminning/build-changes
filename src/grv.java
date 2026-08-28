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
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class grv implements avg, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   private static final ali e = ali.b("transparency");
   private static final ali f = ali.b("entity_outline");
   public static final int a = 16;
   public static final int b = 8;
   public static final int c = 32;
   private static final int g = 15;
   private final frd h;
   private final gyg i;
   private final gum j;
   private final gsi k;
   private final gsv l = new gsv();
   private final grk m = new grk();
   private final gtb n = new gtb();
   private final gta o = new gta();
   @Nullable
   private gmb p;
   private final gsq q = new gsq();
   private final ObjectArrayList<gvq.b> r = new ObjectArrayList(10000);
   private final ObjectArrayList<gvq.b> s = new ObjectArrayList(50);
   private final Set<dyc> t = Sets.newHashSet();
   @Nullable
   private gsy u;
   private int v;
   private final Int2ObjectMap<aqs> w = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aqs>> x = new Long2ObjectOpenHashMap();
   @Nullable
   private fjq y;
   private final grw z = new grw();
   private int A = Integer.MIN_VALUE;
   private int B = Integer.MIN_VALUE;
   private int C = Integer.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   private double G = Double.MIN_VALUE;
   private double H = Double.MIN_VALUE;
   @Nullable
   private gvq I;
   private int J = -1;
   private final List<bwt> K = new ArrayList<>();
   private int L;
   private gvu M;
   private boolean N;
   @Nullable
   private gvu O;
   @Nullable
   private iv P;
   private int Q;

   public grv(frd $$0, gyg $$1, gum $$2, gsi $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
   }

   public void a(fql $$0) {
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
   public void a(avf $$0) {
      this.a();
   }

   public void a() {
      if (this.y != null) {
         this.y.a();
      }

      this.y = new fjr("Entity Outline", this.h.aO().k(), this.h.aO().l(), true);
   }

   @Nullable
   private gse z() {
      if (!frd.O()) {
         return null;
      } else {
         gse $$0 = this.h.ab().a(e, grw.j);
         if ($$0 == null) {
            this.h.n.k().a(fqv.b);
            this.h.n.az();
         }

         return $$0;
      }
   }

   public void b() {
      if (this.c()) {
         this.y.a(this.h.h().d());
      }
   }

   protected boolean c() {
      return !this.h.j.a() && this.y != null && this.h.t != null;
   }

   public void a(@Nullable gmb $$0) {
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
            this.I = new gvq(this.p, this, ag.h(), this.k, this.h.ap(), this.h.ar());
         } else {
            this.I.a(this.p);
         }

         this.m.a();
         grs.a(frd.N());
         this.J = this.h.n.aH();
         if (this.u != null) {
            this.u.a();
         }

         this.I.g();
         synchronized (this.t) {
            this.t.clear();
         }

         this.u = new gsy(this.I, this.p, this.h.n.aH(), this);
         this.q.a(this.u);
         this.A();
         fql $$0 = this.h.j.k();
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

   public gvq f() {
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
         gvq.b $$1 = (gvq.b)var2.next();
         if ($$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String j() {
      return "E: " + this.L + "/" + this.p.g() + ", SD: " + this.p.m();
   }

   private void a(fql $$0, gvu $$1, boolean $$2, boolean $$3) {
      ffq $$4 = $$0.b();
      if (this.h.n.aH() != this.J) {
         this.d();
      }

      brb $$5 = bra.a();
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

   public static gvu a(gvu $$0) {
      return new gvu($$0).a(8);
   }

   private void b(gvu $$0) {
      if (!frd.Q().bx()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         bra.a().a("apply_frustum");
         this.A();
         this.q.a($$0, this.r, this.s);
         bra.a().c();
      }
   }

   public void a(gvq.b $$0) {
      this.q.a($$0);
   }

   public void a(ffq $$0, Matrix4f $$1, Matrix4f $$2) {
      this.M = new gvu($$1, $$2);
      this.M.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(fkq $$0, fqt $$1, boolean $$2, fql $$3, grq $$4, Matrix4f $$5, Matrix4f $$6) {
      float $$7 = $$1.a(false);
      RenderSystem.setShaderGameTime(this.p.ae(), $$7);
      this.j.a(this.p, $$3, this.h.w);
      this.i.a(this.p, $$3, this.h.v);
      final brb $$8 = bra.a();
      $$8.b("light_update_queue");
      this.p.b();
      $$8.b("light_updates");
      this.p.h().q().a();
      ffq $$9 = $$3.b();
      double $$10 = $$9.a();
      double $$11 = $$9.b();
      double $$12 = $$9.c();
      $$8.b("culling");
      boolean $$13 = this.O != null;
      gvu $$14 = $$13 ? this.O : this.M;
      bra.a().b("captureFrustum");
      if (this.N) {
         this.O = $$13 ? new gvu($$5, $$6) : $$14;
         this.O.a($$10, $$11, $$12);
         this.N = false;
      }

      $$8.b("fog");
      float $$15 = $$4.j();
      boolean $$16 = this.h.s.c().a(azo.a($$10), azo.a($$11)) || this.h.m.j().d();
      Vector4f $$17 = grp.a($$3, $$7, this.h.s, this.h.n.aH(), $$4.c($$7));
      gro $$18 = grp.a($$3, grp.d.b, $$17, $$15, $$16, $$7);
      gro $$19 = grp.a($$3, grp.d.a, $$17, $$15, $$16, $$7);
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
      fip $$22 = new fip();
      this.z.k = $$22.a("main", this.h.h());
      int $$23 = this.h.h().c;
      int $$24 = this.h.h().d;
      fkr $$25 = new fkr($$23, $$24, true, 0);
      gse $$26 = this.z();
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

      fiq $$27 = $$22.a("clear");
      this.z.k = $$27.b(this.z.k);
      $$27.a(() -> {
         fjq $$1x = this.h.h();
         RenderSystem.getDevice().b().a($$1x.d(), axy.a(0.0F, $$17.x, $$17.y, $$17.z), $$1x.e(), 1.0);
      });
      if (!$$16) {
         this.b($$22, $$3, $$7, $$19);
      }

      this.a($$22, $$14, $$3, $$5, $$6, $$18, $$2, $$20, $$1, $$8);
      gse $$28 = this.h.ab().a(f, grw.i);
      if ($$20 && $$28 != null) {
         $$28.a($$22, $$23, $$24, this.z, null);
      }

      this.a($$22, $$3, $$7, $$18);
      fqp $$29 = this.h.n.aC();
      if ($$29 != fqp.a) {
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
      $$22.a($$0, new fip.c() {
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
      RenderSystem.setShaderFog(gro.a);
   }

   private void a(fip $$0, gvu $$1, fql $$2, Matrix4f $$3, Matrix4f $$4, gro $$5, boolean $$6, boolean $$7, fqt $$8, brb $$9) {
      fiq $$10 = $$0.a("main");
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

      fkt<fjq> $$11 = this.z.k;
      fkt<fjq> $$12 = this.z.l;
      fkt<fjq> $$13 = this.z.m;
      fkt<fjq> $$14 = this.z.q;
      $$10.a(() -> {
         RenderSystem.setShaderFog($$5);
         float $$12x = $$8.a(false);
         ffq $$13x = $$2.b();
         double $$14x = $$13x.a();
         double $$15 = $$13x.b();
         double $$16 = $$13x.c();
         $$9.a("terrain");
         this.a(gsl.d(), $$14x, $$15, $$16, $$3, $$4);
         this.a(gsl.e(), $$14x, $$15, $$16, $$3, $$4);
         this.a(gsl.f(), $$14x, $$15, $$16, $$3, $$4);
         if (this.p.c().e()) {
            fkb.a();
         } else {
            fkb.b();
         }

         if ($$13 != null) {
            $$13.get().a(this.h.h());
         }

         if (this.c() && $$14 != null) {
            fjq $$17 = $$14.get();
            RenderSystem.getDevice().b().a($$17.d(), 0, $$17.e(), 1.0);
         }

         flo $$18 = new flo();
         gsa.a $$19 = this.k.c();
         gsa.a $$20 = this.k.d();
         $$9.b("entities");
         this.a($$18, $$19, $$2, $$8, this.K);
         $$19.a();
         this.a($$18);
         $$9.b("blockentities");
         this.a($$18, $$19, $$20, $$2, $$12x);
         $$19.a();
         this.a($$18);
         $$19.a(gsl.d());
         $$19.a(gsl.u());
         $$19.a(gsl.v());
         $$19.a(gsu.h());
         $$19.a(gsu.i());
         $$19.a(gsu.c());
         $$19.a(gsu.d());
         $$19.a(gsu.e());
         $$19.a(gsu.f());
         $$19.a(gsu.g());
         this.k.e().a();
         if ($$6) {
            this.a($$2, $$19, $$18, false);
         }

         $$9.b("debug");
         this.h.l.a($$18, $$1, $$19, $$14x, $$15, $$16);
         $$19.a();
         this.a($$18);
         $$19.a(gsu.j());
         $$19.a(gsu.a());
         $$19.a(gsu.b());
         $$19.a(gsl.k());
         $$19.a(gsl.m());
         $$19.a(gsl.l());
         $$19.a(gsl.n());
         $$9.b("destroyProgress");
         this.a($$18, $$2, $$20);
         $$20.b();
         this.a($$18);
         $$19.a(gsl.j());
         $$19.b();
         if ($$12 != null) {
            $$12.get().a($$11.get());
         }

         $$9.b("translucent");
         this.a(gsl.g(), $$14x, $$15, $$16, $$3, $$4);
         $$9.b("string");
         this.a(gsl.t(), $$14x, $$15, $$16, $$3, $$4);
         if ($$6) {
            this.a($$2, $$19, $$18, true);
         }

         $$19.b();
         $$9.c();
      });
   }

   private void a(fip $$0, fql $$1, float $$2, gro $$3) {
      fiq $$4 = $$0.a("particles");
      if (this.z.n != null) {
         this.z.n = $$4.b(this.z.n);
         $$4.a(this.z.k);
      } else {
         this.z.k = $$4.b(this.z.k);
      }

      fkt<fjq> $$5 = this.z.k;
      fkt<fjq> $$6 = this.z.n;
      $$4.a(() -> {
         RenderSystem.setShaderFog($$3);
         if ($$6 != null) {
            $$6.get().a($$5.get());
         }

         this.h.g.a($$1, $$2, this.k.c());
      });
   }

   private void a(fip $$0, fqp $$1, ffq $$2, float $$3, int $$4, float $$5) {
      fiq $$6 = $$0.a("clouds");
      if (this.z.p != null) {
         this.z.p = $$6.b(this.z.p);
      } else {
         this.z.k = $$6.b(this.z.k);
      }

      $$6.a(() -> this.m.a($$4, $$1, $$5, $$2, $$3));
   }

   private void a(fip $$0, ffq $$1, float $$2, gro $$3) {
      int $$4 = this.h.n.aH() * 16;
      float $$5 = this.h.j.g();
      fiq $$6 = $$0.a("weather");
      if (this.z.o != null) {
         this.z.o = $$6.b(this.z.o);
      } else {
         this.z.k = $$6.b(this.z.k);
      }

      $$6.a(() -> {
         RenderSystem.setShaderFog($$3);
         gsa.a $$5x = this.k.c();
         this.o.a(this.h.s, $$5x, this.v, $$2, $$1);
         this.n.a(this.p.E_(), $$1, (double)$$4, (double)$$5);
         $$5x.b();
      });
   }

   private void a(fip $$0, ffq $$1, gro $$2) {
      fiq $$3 = $$0.a("late_debug");
      this.z.k = $$3.b(this.z.k);
      if (this.z.m != null) {
         this.z.m = $$3.b(this.z.m);
      }

      fkt<fjq> $$4 = this.z.k;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         flo $$2x = new flo();
         gsa.a $$3x = this.k.c();
         this.h.l.a($$2x, $$3x, $$1.d, $$1.e, $$1.f);
         $$3x.a();
         this.a($$2x);
      });
   }

   private boolean a(fql $$0, gvu $$1, List<bwt> $$2) {
      ffq $$3 = $$0.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.c();
      bwt.b(azo.a((double)this.h.n.aH() / 8.0, 1.0, 2.5) * this.h.n.g().c());

      for (bwt $$9 : this.p.d()) {
         if (this.i.a($$9, $$1, $$4, $$5, $$6) || $$9.A(this.h.t)) {
            iv $$10 = $$9.dv();
            if ((this.p.e($$10.v()) || this.a($$10))
               && ($$9 != $$0.g() || $$0.i() || $$0.g() instanceof bxu && ((bxu)$$0.g()).fR())
               && (!($$9 instanceof gqz) || $$0.g() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.h.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(flo $$0, gsa.a $$1, fql $$2, fqt $$3, List<bwt> $$4) {
      ffq $$5 = $$2.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      bva $$9 = this.h.s.u();
      boolean $$10 = this.c();

      for (bwt $$11 : $$4) {
         if ($$11.af == 0) {
            $$11.aa = $$11.dA();
            $$11.ab = $$11.dC();
            $$11.ac = $$11.dG();
         }

         gsa $$13;
         if ($$10 && this.h.b($$11)) {
            gsc $$12 = this.k.e();
            $$13 = $$12;
            int $$14 = $$11.f_();
            $$12.a(axy.b($$14), axy.c($$14), axy.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(flo $$0, gsa.a $$1, gsa.a $$2, fql $$3, float $$4) {
      ffq $$5 = $$3.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator var13 = this.r.iterator();

      while (var13.hasNext()) {
         gvq.b $$9 = (gvq.b)var13.next();
         List<dyc> $$10 = $$9.d().b();
         if (!$$10.isEmpty()) {
            for (dyc $$11 : $$10) {
               iv $$12 = $$11.aB_();
               gsa $$13 = $$1;
               $$0.a();
               $$0.a((double)$$12.u() - $$6, (double)$$12.v() - $$7, (double)$$12.w() - $$8);
               SortedSet<aqs> $$14 = (SortedSet<aqs>)this.x.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     flo.a $$16 = $$0.c();
                     flr $$17 = new flp($$2.getBuffer(hnk.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        flr $$3x = $$1.getBuffer($$2x);
                        return $$2x.T() ? flu.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.j.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      synchronized (this.t) {
         for (dyc $$18 : this.t) {
            iv $$19 = $$18.aB_();
            $$0.a();
            $$0.a((double)$$19.u() - $$6, (double)$$19.v() - $$7, (double)$$19.w() - $$8);
            this.j.a($$18, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(flo $$0, fql $$1, gsa.a $$2) {
      ffq $$3 = $$1.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.x.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<aqs>> $$7 = (Entry<SortedSet<aqs>>)var11.next();
         iv $$8 = iv.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<aqs> $$9 = (SortedSet<aqs>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
               flo.a $$11 = $$0.c();
               flr $$12 = new flp($$2.getBuffer(hnk.l.get($$10)), $$11, 1.0F);
               this.h.ap().a(this.p.a_($$8), $$8, this.p, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(fql $$0, gsa.a $$1, flo $$2, boolean $$3) {
      if (this.h.w instanceof ffm $$4) {
         if ($$4.d() != ffo.a.a) {
            iv $$6 = $$4.b();
            ebe $$7 = this.p.a_($$6);
            if (!$$7.l() && this.p.E_().a($$6)) {
               boolean $$8 = grs.a($$7).V();
               if ($$8 != $$3) {
                  return;
               }

               ffq $$9 = $$0.b();
               Boolean $$10 = this.h.n.v().c();
               if ($$10) {
                  flr $$11 = $$1.getBuffer(gsl.x());
                  this.a($$2, $$11, $$0.g(), $$9.d, $$9.e, $$9.f, $$6, $$7, -16777216);
               }

               flr $$12 = $$1.getBuffer(gsl.w());
               int $$13 = $$10 ? -11010079 : axy.c(102, -16777216);
               this.a($$2, $$12, $$0.g(), $$9.d, $$9.e, $$9.f, $$6, $$7, $$13);
               $$1.a();
            }
         }
      }
   }

   private void a(flo $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bwt $$0, double $$1, double $$2, double $$3, float $$4, flo $$5, gsa $$6) {
      double $$7 = azo.d((double)$$4, $$0.aa, $$0.dA());
      double $$8 = azo.d((double)$$4, $$0.ab, $$0.dC());
      double $$9 = azo.d((double)$$4, $$0.ac, $$0.dG());
      this.i.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.i.a($$0, $$4));
   }

   private void a(ffq $$0) {
      if (!this.r.isEmpty()) {
         iv $$1 = iv.a((jp)$$0);
         boolean $$2 = !$$1.equals(this.P);
         bra.a().a("translucent_sort");
         gvq.e $$3 = new gvq.e();
         ObjectListIterator $$5 = this.s.iterator();

         while ($$5.hasNext()) {
            gvq.b $$4 = (gvq.b)$$5.next();
            this.a($$4, $$3, $$0, $$2, true);
         }

         this.Q = this.Q % this.r.size();
         int $$5x = Math.max(this.r.size() / 8, 15);

         while ($$5x-- > 0) {
            int $$6 = this.Q++ % this.r.size();
            this.a((gvq.b)this.r.get($$6), $$3, $$0, $$2, false);
         }

         this.P = $$1;
         bra.a().c();
      }
   }

   private void a(gvq.b $$0, gvq.e $$1, ffq $$2, boolean $$3, boolean $$4) {
      $$1.b($$2, $$0.g());
      boolean $$5 = !$$1.equals($$0.d.get());
      boolean $$6 = $$3 && ($$1.a() || $$4);
      if (($$6 || $$5) && !$$0.l() && $$0.k()) {
         $$0.a(this.I);
      }
   }

   private void a(gsl $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      brg $$6 = bra.a().c(() -> "render_" + $$0.b);
      $$6.a($$0::toString);
      boolean $$7 = $$0 != gsl.g();
      ObjectListIterator<gvq.b> $$8 = this.r.listIterator($$7 ? 0 : this.r.size());
      $$0.a();
      fjp $$9 = $$0.M();

      try (flb $$10 = RenderSystem.getDevice().b().a($$0.L().d(), OptionalInt.empty(), $$0.L().e(), OptionalDouble.empty())) {
         $$10.a($$9);

         for (int $$11 = 0; $$11 < 12; $$11++) {
            flh $$12 = RenderSystem.getShaderTexture($$11);
            if ($$12 != null) {
               $$10.a("Sampler" + $$11, $$12);
            }
         }

         ArrayList<flb.a> $$13 = new ArrayList<>();

         while ($$7 ? $$8.hasNext() : $$8.hasPrevious()) {
            gvq.b $$14 = $$7 ? (gvq.b)$$8.next() : (gvq.b)$$8.previous();
            gvq.c $$15 = $$14.a($$0);
            if (!$$14.d().a($$0) && $$15 != null) {
               fig $$17;
               fls.b $$18;
               if ($$15.b() == null) {
                  RenderSystem.a $$16 = RenderSystem.getSequentialBuffer($$0.Q());
                  $$17 = $$16.b($$15.c());
                  $$18 = $$16.a();
               } else {
                  $$17 = $$15.b();
                  $$18 = $$15.d();
               }

               iv $$21 = $$14.f();
               $$13.add(
                  new flb.a(
                     0,
                     $$15.a(),
                     $$17,
                     $$18,
                     0,
                     $$15.c(),
                     $$4x -> $$4x.upload("ModelOffset", (float)((double)$$21.u() - $$1), (float)((double)$$21.v() - $$2), (float)((double)$$21.w() - $$3))
                  )
               );
            }
         }

         $$10.a($$13);
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
         Iterator<aqs> $$0 = this.w.values().iterator();

         while ($$0.hasNext()) {
            aqs $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.v - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(aqs $$0) {
      long $$1 = $$0.b().a();
      Set<aqs> $$2 = (Set<aqs>)this.x.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.x.remove($$1);
      }
   }

   private void b(fip $$0, fql $$1, float $$2, gro $$3) {
      exq $$4 = $$1.k();
      if ($$4 != exq.c && $$4 != exq.a && !this.b($$1)) {
         grm $$5 = this.p.c();
         grm.d $$6 = $$5.c();
         if ($$6 != grm.d.a) {
            fiq $$7 = $$0.a("sky");
            this.z.k = $$7.b(this.z.k);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               if ($$6 == grm.d.c) {
                  this.l.b();
               } else {
                  flo $$4x = new flo();
                  float $$5x = this.p.a($$2);
                  float $$6x = this.p.f($$2);
                  float $$7x = 1.0F - this.p.d($$2);
                  float $$8 = this.p.i($$2) * $$7x;
                  int $$9 = $$5.b($$6x);
                  int $$10 = this.p.at();
                  int $$11 = this.p.a(this.h.j.k().b(), $$2);
                  float $$12 = axy.j($$11);
                  float $$13 = axy.k($$11);
                  float $$14 = axy.l($$11);
                  this.l.a($$12, $$13, $$14);
                  gsa.a $$15 = this.k.c();
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

   private boolean b(fql $$0) {
      return !($$0.g() instanceof bxu $$1) ? false : $$1.b(bvz.o) || $$1.b(bvz.G);
   }

   private void c(fql $$0) {
      brb $$1 = bra.a();
      $$1.a("populate_sections_to_compile");
      gvo $$2 = new gvo();
      iv $$3 = $$0.c();
      List<gvq.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.r.iterator();

      while (var6.hasNext()) {
         gvq.b $$5 = (gvq.b)var6.next();
         if ($$5.i() && $$5.a()) {
            boolean $$6 = false;
            if (this.h.n.m().c() == frj.c) {
               iv $$7 = jy.a($$5.g()).k();
               $$6 = $$7.j($$3) < 768.0 || $$5.j();
            } else if (this.h.n.m().c() == frj.b) {
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

      for (gvq.b $$8 : $$4) {
         $$8.a(this.I, $$2);
         $$8.h();
      }

      $$1.c();
      this.a($$0.b());
   }

   private void a(flo $$0, flr $$1, bwt $$2, double $$3, double $$4, double $$5, iv $$6, ebe $$7, int $$8) {
      gst.a($$0, $$1, $$7.a(this.p, $$6, ffv.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, $$8);
   }

   public void a(djb $$0, iv $$1, ebe $$2, ebe $$3, int $$4) {
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

   public void a(iv $$0, ebe $$1, ebe $$2) {
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
      gvq.b $$1 = this.u.a($$0);
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
         $$11.a("Parameters", () -> ly.bk.encodeStart(this.p.J_().a(un.a), $$0).toString());
         $$11.a("Position", () -> q.a(this.p, $$3, $$4, $$5));
         throw new aa($$10);
      }
   }

   public <T extends lw> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   gpk b(lw $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gpk b(lw $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fql $$9 = this.h.j.k();
      ark $$10 = this.a($$2);
      if ($$1) {
         return this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == ark.c ? null : this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private ark a(boolean $$0) {
      ark $$1 = this.h.n.au().c();
      if ($$0 && $$1 == ark.c && this.p.A.a(10) == 0) {
         $$1 = ark.b;
      }

      if ($$1 == ark.b && this.p.A.a(3) == 0) {
         $$1 = ark.c;
      }

      return $$1;
   }

   public void a(int $$0, iv $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         aqs $$4 = (aqs)this.w.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new aqs($$0, $$1);
            this.w.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.v);
         ((SortedSet)this.x.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         aqs $$3 = (aqs)this.w.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean n() {
      return this.I.h();
   }

   public void a(djc $$0) {
      this.q.a($$0);
   }

   public void o() {
      this.q.a();
      this.m.a();
   }

   public void a(Collection<dyc> $$0, Collection<dyc> $$1) {
      synchronized (this.t) {
         this.t.removeAll($$0);
         this.t.addAll($$1);
      }
   }

   public static int a(diy $$0, iv $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(diy $$0, ebe $$1, iv $$2) {
      if ($$1.b($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(dkg.a, $$2);
         int $$4 = $$0.a(dkg.b, $$2);
         int $$5 = $$1.k();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(iv $$0) {
      gvq.b $$1 = this.u.a($$0);
      return $$1 != null && $$1.c.get() != gvq.a.a;
   }

   @Nullable
   public fjq p() {
      return this.z.q != null ? this.z.q.get() : null;
   }

   @Nullable
   public fjq q() {
      return this.z.l != null ? this.z.l.get() : null;
   }

   @Nullable
   public fjq r() {
      return this.z.m != null ? this.z.m.get() : null;
   }

   @Nullable
   public fjq s() {
      return this.z.n != null ? this.z.n.get() : null;
   }

   @Nullable
   public fjq t() {
      return this.z.o != null ? this.z.o.get() : null;
   }

   @Nullable
   public fjq u() {
      return this.z.p != null ? this.z.p.get() : null;
   }

   @bax
   public ObjectArrayList<gvq.b> v() {
      return this.r;
   }

   @bax
   public gsq w() {
      return this.q;
   }

   @Nullable
   public gvu x() {
      return this.O;
   }

   public grk y() {
      return this.m;
   }
}
