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

public class gjc implements ave, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   private static final alj e = alj.b("transparency");
   private static final alj f = alj.b("entity_outline");
   public static final int a = 16;
   public static final int b = 8;
   public static final int c = 32;
   private static final int g = 15;
   private final fke h;
   private final gpi i;
   private final glq j;
   private final gjo k;
   private final gkc l = new gkc();
   private final gio m = new gio();
   private final gkh n = new gkh();
   private final gkg o = new gkg();
   @Nullable
   private gdh p;
   private final gjv q = new gjv();
   private final ObjectArrayList<gmt.b> r = new ObjectArrayList(10000);
   private final ObjectArrayList<gmt.b> s = new ObjectArrayList(50);
   private final Set<dsy> t = Sets.newHashSet();
   @Nullable
   private gke u;
   private int v;
   private final Int2ObjectMap<aqq> w = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aqq>> x = new Long2ObjectOpenHashMap();
   @Nullable
   private fdb y;
   private final gjd z = new gjd();
   private int A = Integer.MIN_VALUE;
   private int B = Integer.MIN_VALUE;
   private int C = Integer.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   private double G = Double.MIN_VALUE;
   private double H = Double.MIN_VALUE;
   @Nullable
   private gmt I;
   private int J = -1;
   private final List<bul> K = new ArrayList<>();
   private int L;
   private gmx M;
   private boolean N;
   @Nullable
   private gmx O;
   @Nullable
   private jh P;
   private int Q;

   public gjc(fke $$0, gpi $$1, glq $$2, gjo $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
   }

   public void a(fjn $$0) {
      this.o.a(this.h.s, $$0, this.v, this.h.n.at().c());
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

      this.y = new fdc(this.h.aO().k(), this.h.aO().l(), true);
      this.y.a(0.0F, 0.0F, 0.0F, 0.0F);
   }

   @Nullable
   private gjk A() {
      if (!fke.O()) {
         return null;
      } else {
         gjk $$0 = this.h.ab().a(e, gjd.j);
         if ($$0 == null) {
            this.h.n.k().a(fjw.b);
            this.h.n.ay();
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

   public void a(@Nullable gdh $$0) {
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
            this.I = new gmt(this.p, this, ae.g(), this.k, this.h.ap(), this.h.ar());
         } else {
            this.I.a(this.p);
         }

         this.m.a();
         giy.a(fke.N());
         this.J = this.h.n.aG();
         if (this.u != null) {
            this.u.a();
         }

         this.I.g();
         synchronized (this.t) {
            this.t.clear();
         }

         this.u = new gke(this.I, this.p, this.h.n.aG(), this);
         this.q.a(this.u);
         this.B();
         bul $$0 = this.h.ao();
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

   public gmt g() {
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
         gmt.b $$1 = (gmt.b)var2.next();
         if ($$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String k() {
      return "E: " + this.L + "/" + this.p.g() + ", SD: " + this.p.l();
   }

   private void a(fjn $$0, gmx $$1, boolean $$2, boolean $$3) {
      ezy $$4 = $$0.b();
      if (this.h.n.aG() != this.J) {
         this.e();
      }

      bou $$5 = bot.a();
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

   public static gmx a(gmx $$0) {
      return new gmx($$0).a(8);
   }

   private void b(gmx $$0) {
      if (!fke.Q().bx()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         bot.a().a("apply_frustum");
         this.B();
         this.q.a($$0, this.r, this.s);
         bot.a().c();
      }
   }

   public void a(gmt.b $$0) {
      this.q.a($$0);
   }

   public void a(ezy $$0, Matrix4f $$1, Matrix4f $$2) {
      this.M = new gmx($$1, $$2);
      this.M.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(fea $$0, fju $$1, boolean $$2, fjn $$3, giw $$4, gje $$5, Matrix4f $$6, Matrix4f $$7) {
      float $$8 = $$1.a(false);
      RenderSystem.setShaderGameTime(this.p.ab(), $$8);
      this.j.a(this.p, $$3, this.h.w);
      this.i.a(this.p, $$3, this.h.v);
      final bou $$9 = bot.a();
      $$9.b("light_update_queue");
      this.p.b();
      $$9.b("light_updates");
      this.p.h().p().a();
      ezy $$10 = $$3.b();
      double $$11 = $$10.a();
      double $$12 = $$10.b();
      double $$13 = $$10.c();
      $$9.b("culling");
      boolean $$14 = this.O != null;
      gmx $$15 = $$14 ? this.O : this.M;
      bot.a().b("captureFrustum");
      if (this.N) {
         this.O = $$14 ? new gmx($$6, $$7) : $$15;
         this.O.a($$11, $$12, $$13);
         this.N = false;
      }

      $$9.b("fog");
      float $$16 = $$4.j();
      boolean $$17 = this.h.s.c().a(azm.a($$11), azm.a($$12)) || this.h.m.j().d();
      Vector4f $$18 = giv.a($$3, $$8, this.h.s, this.h.n.aG(), $$4.c($$8));
      giu $$19 = giv.a($$3, giv.d.b, $$18, $$16, $$17, $$8);
      giu $$20 = giv.a($$3, giv.d.a, $$18, $$16, $$17, $$8);
      $$9.b("cullEntities");
      boolean $$21 = this.a($$3, $$15, this.K);
      this.L = this.K.size();
      $$9.b("terrain_setup");
      this.a($$3, $$15, $$14, this.h.t.Y_());
      $$9.b("compile_sections");
      this.c($$3);
      Matrix4fStack $$22 = RenderSystem.getModelViewStack();
      $$22.pushMatrix();
      $$22.mul($$6);
      fcv $$23 = new fcv();
      this.z.k = $$23.a("main", this.h.h());
      int $$24 = this.h.h().c;
      int $$25 = this.h.h().d;
      feb $$26 = new feb($$24, $$25, true);
      gjk $$27 = this.A();
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

      fcw $$28 = $$23.a("clear");
      this.z.k = $$28.b(this.z.k);
      $$28.a(() -> {
         RenderSystem.clearColor($$18.x, $$18.y, $$18.z, 0.0F);
         RenderSystem.clear(16640);
      });
      if (!$$17) {
         this.a($$23, $$3, $$8, $$20);
      }

      this.a($$23, $$15, $$3, $$6, $$7, $$19, $$2, $$21, $$1, $$9);
      gjk $$29 = this.h.ab().a(f, gjd.i);
      if ($$21 && $$29 != null) {
         $$29.a($$23, $$24, $$25, this.z);
      }

      this.a($$23, $$3, $$5, $$8, $$19);
      fjq $$30 = this.h.n.aB();
      if ($$30 != fjq.a) {
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
      $$23.a($$0, new fcv.c() {
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
      RenderSystem.setShaderFog(giu.a);
   }

   private void a(fcv $$0, gmx $$1, fjn $$2, Matrix4f $$3, Matrix4f $$4, giu $$5, boolean $$6, boolean $$7, fju $$8, bou $$9) {
      fcw $$10 = $$0.a("main");
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

      fed<fdb> $$11 = this.z.k;
      fed<fdb> $$12 = this.z.l;
      fed<fdb> $$13 = this.z.m;
      fed<fdb> $$14 = this.z.o;
      fed<fdb> $$15 = this.z.q;
      $$10.a(() -> {
         RenderSystem.setShaderFog($$5);
         float $$13x = $$8.a(false);
         ezy $$14x = $$2.b();
         double $$15x = $$14x.a();
         double $$16 = $$14x.b();
         double $$17 = $$14x.c();
         $$9.a("terrain");
         this.a(gjq.c(), $$15x, $$16, $$17, $$3, $$4);
         this.a(gjq.d(), $$15x, $$16, $$17, $$3, $$4);
         this.a(gjq.e(), $$15x, $$16, $$17, $$3, $$4);
         if (this.p.c().e()) {
            fdn.a();
         } else {
            fdn.b();
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

         fer $$18 = new fer();
         gjg.a $$19 = this.k.c();
         gjg.a $$20 = this.k.d();
         $$9.b("entities");
         this.a($$18, $$19, $$2, $$8, this.K);
         $$19.a();
         this.a($$18);
         $$9.b("blockentities");
         this.a($$18, $$19, $$20, $$2, $$13x);
         $$19.a();
         this.a($$18);
         $$19.a(gjq.c());
         $$19.a(gjq.t());
         $$19.a(gjq.u());
         $$19.a(gkb.h());
         $$19.a(gkb.i());
         $$19.a(gkb.c());
         $$19.a(gkb.d());
         $$19.a(gkb.e());
         $$19.a(gkb.f());
         $$19.a(gkb.g());
         this.k.e().a();
         if ($$6) {
            this.a($$2, $$19, $$18, false);
         }

         $$9.b("debug");
         this.h.l.a($$18, $$1, $$19, $$15x, $$16, $$17);
         $$19.a();
         this.a($$18);
         $$19.a(gkb.j());
         $$19.a(gkb.a());
         $$19.a(gkb.b());
         $$19.a(gjq.j());
         $$19.a(gjq.l());
         $$19.a(gjq.k());
         $$19.a(gjq.m());
         $$9.b("destroyProgress");
         this.a($$18, $$2, $$20);
         $$20.b();
         this.a($$18);
         $$19.a(gjq.i());
         $$19.b();
         if ($$12 != null) {
            $$12.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$12.get().f();
            $$12.get().a($$11.get());
         }

         $$9.b("translucent");
         this.a(gjq.f(), $$15x, $$16, $$17, $$3, $$4);
         $$9.b("string");
         this.a(gjq.s(), $$15x, $$16, $$17, $$3, $$4);
         if ($$6) {
            this.a($$2, $$19, $$18, true);
         }

         $$19.b();
         $$9.c();
      });
   }

   private void a(fcv $$0, fjn $$1, gje $$2, float $$3, giu $$4) {
      fcw $$5 = $$0.a("particles");
      if (this.z.n != null) {
         this.z.n = $$5.b(this.z.n);
         $$5.a(this.z.k);
      } else {
         this.z.k = $$5.b(this.z.k);
      }

      fed<fdb> $$6 = this.z.k;
      fed<fdb> $$7 = this.z.n;
      $$5.a(() -> {
         RenderSystem.setShaderFog($$4);
         if ($$7 != null) {
            $$7.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$7.get().f();
            $$7.get().a($$6.get());
         }

         gjp.aN.a();
         this.h.g.a($$2, $$1, $$3);
         gjp.aN.b();
      });
   }

   private void a(fcv $$0, Matrix4f $$1, Matrix4f $$2, fjq $$3, ezy $$4, float $$5, int $$6, float $$7) {
      fcw $$8 = $$0.a("clouds");
      if (this.z.p != null) {
         this.z.p = $$8.b(this.z.p);
      } else {
         this.z.k = $$8.b(this.z.k);
      }

      fed<fdb> $$9 = this.z.p;
      $$8.a(() -> {
         if ($$9 != null) {
            $$9.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$9.get().f();
         }

         this.m.a($$6, $$3, $$7, $$1, $$2, $$4, $$5);
      });
   }

   private void a(fcv $$0, gje $$1, ezy $$2, float $$3, giu $$4) {
      int $$5 = this.h.n.aG() * 16;
      float $$6 = this.h.j.g();
      fcw $$7 = $$0.a("weather");
      if (this.z.o != null) {
         this.z.o = $$7.b(this.z.o);
      } else {
         this.z.k = $$7.b(this.z.k);
      }

      $$7.a(() -> {
         RenderSystem.setShaderFog($$4);
         gjp.aO.a();
         this.o.a(this.h.s, $$1, this.v, $$3, $$2);
         this.n.a(this.p.E_(), $$2, (double)$$5, (double)$$6);
         gjp.aO.b();
      });
   }

   private void a(fcv $$0, ezy $$1, giu $$2) {
      fcw $$3 = $$0.a("late_debug");
      this.z.k = $$3.b(this.z.k);
      if (this.z.m != null) {
         this.z.m = $$3.b(this.z.m);
      }

      fed<fdb> $$4 = this.z.k;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         $$4.get().a(false);
         fer $$3x = new fer();
         gjg.a $$4x = this.k.c();
         this.h.l.a($$3x, $$4x, $$1.d, $$1.e, $$1.f);
         $$4x.a();
         this.a($$3x);
      });
   }

   private boolean a(fjn $$0, gmx $$1, List<bul> $$2) {
      ezy $$3 = $$0.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.d();
      bul.b(azm.a((double)this.h.n.aG() / 8.0, 1.0, 2.5) * this.h.n.g().c());

      for (bul $$9 : this.p.d()) {
         if (this.i.a($$9, $$1, $$4, $$5, $$6) || $$9.A(this.h.t)) {
            jh $$10 = $$9.dv();
            if ((this.p.e($$10.v()) || this.a($$10))
               && ($$9 != $$0.g() || $$0.i() || $$0.g() instanceof bvh && ((bvh)$$0.g()).fP())
               && (!($$9 instanceof gic) || $$0.g() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.h.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(fer $$0, gjg.a $$1, fjn $$2, fju $$3, List<bul> $$4) {
      ezy $$5 = $$2.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      bst $$9 = this.h.s.t();
      boolean $$10 = this.d();

      for (bul $$11 : $$4) {
         if ($$11.af == 0) {
            $$11.aa = $$11.dA();
            $$11.ab = $$11.dC();
            $$11.ac = $$11.dG();
         }

         gjg $$13;
         if ($$10 && this.h.b($$11)) {
            gji $$12 = this.k.e();
            $$13 = $$12;
            int $$14 = $$11.j_();
            $$12.a(axx.b($$14), axx.c($$14), axx.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(fer $$0, gjg.a $$1, gjg.a $$2, fjn $$3, float $$4) {
      ezy $$5 = $$3.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator var13 = this.r.iterator();

      while (var13.hasNext()) {
         gmt.b $$9 = (gmt.b)var13.next();
         List<dsy> $$10 = $$9.d().b();
         if (!$$10.isEmpty()) {
            for (dsy $$11 : $$10) {
               jh $$12 = $$11.aA_();
               gjg $$13 = $$1;
               $$0.a();
               $$0.a((double)$$12.u() - $$6, (double)$$12.v() - $$7, (double)$$12.w() - $$8);
               SortedSet<aqq> $$14 = (SortedSet<aqq>)this.x.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     fer.a $$16 = $$0.c();
                     fev $$17 = new fes($$2.getBuffer(hbq.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        fev $$3x = $$1.getBuffer($$2x);
                        return $$2x.R() ? fey.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.j.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      synchronized (this.t) {
         for (dsy $$18 : this.t) {
            jh $$19 = $$18.aA_();
            $$0.a();
            $$0.a((double)$$19.u() - $$6, (double)$$19.v() - $$7, (double)$$19.w() - $$8);
            this.j.a($$18, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(fer $$0, fjn $$1, gjg.a $$2) {
      ezy $$3 = $$1.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.x.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<aqq>> $$7 = (Entry<SortedSet<aqq>>)var11.next();
         jh $$8 = jh.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<aqq> $$9 = (SortedSet<aqq>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
               fer.a $$11 = $$0.c();
               fev $$12 = new fes($$2.getBuffer(hbq.l.get($$10)), $$11, 1.0F);
               this.h.ap().a(this.p.a_($$8), $$8, this.p, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(fjn $$0, gjg.a $$1, fer $$2, boolean $$3) {
      if (this.h.w instanceof ezu $$4) {
         if ($$4.d() != ezw.a.a) {
            jh $$6 = $$4.b();
            dvv $$7 = this.p.a_($$6);
            if (!$$7.l() && this.p.E_().a($$6)) {
               boolean $$8 = giy.a($$7).T();
               if ($$8 != $$3) {
                  return;
               }

               fev $$9 = $$1.getBuffer(gjq.y());
               ezy $$10 = $$0.b();
               this.a($$2, $$9, $$0.g(), $$10.d, $$10.e, $$10.f, $$6, $$7);
               $$1.a();
            }
         }
      }
   }

   private void a(fer $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bul $$0, double $$1, double $$2, double $$3, float $$4, fer $$5, gjg $$6) {
      double $$7 = azm.d((double)$$4, $$0.aa, $$0.dA());
      double $$8 = azm.d((double)$$4, $$0.ab, $$0.dC());
      double $$9 = azm.d((double)$$4, $$0.ac, $$0.dG());
      this.i.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.i.a($$0, $$4));
   }

   private void a(ezy $$0) {
      if (!this.r.isEmpty()) {
         jh $$1 = jh.a((ka)$$0);
         boolean $$2 = !$$1.equals(this.P);
         bot.a().a("translucent_sort");
         gmt.d $$3 = new gmt.d();
         ObjectListIterator $$5 = this.s.iterator();

         while ($$5.hasNext()) {
            gmt.b $$4 = (gmt.b)$$5.next();
            this.a($$4, $$3, $$0, $$2, true);
         }

         this.Q = this.Q % this.r.size();
         int $$5x = Math.max(this.r.size() / 8, 15);

         while ($$5x-- > 0) {
            int $$6 = this.Q++ % this.r.size();
            this.a((gmt.b)this.r.get($$6), $$3, $$0, $$2, false);
         }

         this.P = $$1;
         bot.a().c();
      }
   }

   private void a(gmt.b $$0, gmt.d $$1, ezy $$2, boolean $$3, boolean $$4) {
      $$1.b($$2, $$0.g());
      boolean $$5 = !$$1.equals($$0.d.get());
      boolean $$6 = $$3 && ($$1.a() || $$4);
      if (($$6 || $$5) && !$$0.l() && $$0.k()) {
         $$0.a(this.I);
      }
   }

   private void a(gjq $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      boz $$6 = bot.a().c(() -> "render_" + $$0.b);
      $$6.a($$0::toString);
      boolean $$7 = $$0 != gjq.f();
      ObjectListIterator<gmt.b> $$8 = this.r.listIterator($$7 ? 0 : this.r.size());
      $$0.a();
      gip $$9 = RenderSystem.getShader();
      if ($$9 == null) {
         $$0.b();
         $$6.close();
      } else {
         $$9.a(few.c.h, $$4, $$5, this.h.aO());
         $$9.b();
         fei $$10 = $$9.o;

         while ($$7 ? $$8.hasNext() : $$8.hasPrevious()) {
            gmt.b $$11 = $$7 ? (gmt.b)$$8.next() : (gmt.b)$$8.previous();
            if (!$$11.d().a($$0)) {
               feu $$12 = $$11.a($$0);
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
         feu.b();
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

   private void a(fcv $$0, fjn $$1, float $$2, giu $$3) {
      erx $$4 = $$1.k();
      if ($$4 != erx.c && $$4 != erx.a && !this.b($$1)) {
         gis $$5 = this.p.c();
         gis.d $$6 = $$5.c();
         if ($$6 != gis.d.a) {
            fcw $$7 = $$0.a("sky");
            this.z.k = $$7.b(this.z.k);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               gjp.aK.a();
               fer $$4x = new fer();
               if ($$6 == gis.d.c) {
                  this.l.b($$4x);
               } else {
                  fet $$5x = fet.b();
                  float $$6x = this.p.a($$2);
                  float $$7x = this.p.f($$2);
                  float $$8 = 1.0F - this.p.d($$2);
                  float $$9 = this.p.i($$2) * $$8;
                  int $$10 = $$5.b($$7x);
                  int $$11 = this.p.aq();
                  int $$12 = this.p.a(this.h.j.k().b(), $$2);
                  float $$13 = axx.h(axx.b($$12));
                  float $$14 = axx.h(axx.c($$12));
                  float $$15 = axx.h(axx.d($$12));
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

   private boolean b(fjn $$0) {
      return !($$0.g() instanceof bvh $$1) ? false : $$1.b(bts.o) || $$1.b(bts.G);
   }

   private void c(fjn $$0) {
      bou $$1 = bot.a();
      $$1.a("populate_sections_to_compile");
      erk $$2 = this.p.B_();
      gmr $$3 = new gmr();
      jh $$4 = $$0.c();
      List<gmt.b> $$5 = Lists.newArrayList();
      ObjectListIterator var7 = this.r.iterator();

      while (var7.hasNext()) {
         gmt.b $$6 = (gmt.b)var7.next();
         long $$7 = $$6.g();
         if ($$6.i() && $$6.a() && a($$2, $$7)) {
            boolean $$8 = false;
            if (this.h.n.m().c() == fkk.c) {
               jh $$9 = $$6.f().b(8, 8, 8);
               $$8 = $$9.j($$4) < 768.0 || $$6.j();
            } else if (this.h.n.m().c() == fkk.b) {
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

      for (gmt.b $$10 : $$5) {
         $$10.a(this.I, $$3);
         $$10.h();
      }

      $$1.c();
      this.a($$0.b());
   }

   private static boolean a(erk $$0, long $$1) {
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

   private void a(fer $$0, fev $$1, bul $$2, double $$3, double $$4, double $$5, jh $$6, dvv $$7) {
      gka.a($$0, $$1, $$7.a(this.p, $$6, fad.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   public void a(der $$0, jh $$1, dvv $$2, dvv $$3, int $$4) {
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

   public void a(jh $$0, dvv $$1, dvv $$2) {
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
      gmt.b $$1 = this.u.a($$0);
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
         $$11.a("ID", lz.i.b($$0.a()));
         $$11.a("Parameters", () -> ls.bf.encodeStart(this.p.J_().a(uz.a), $$0).toString());
         $$11.a("Position", () -> p.a(this.p, $$3, $$4, $$5));
         throw new z($$10);
      }
   }

   public <T extends lq> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   ggo b(lq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private ggo b(lq $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fjn $$9 = this.h.j.k();
      arh $$10 = this.a($$2);
      if ($$1) {
         return this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == arh.c ? null : this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private arh a(boolean $$0) {
      arh $$1 = this.h.n.at().c();
      if ($$0 && $$1 == arh.c && this.p.A.a(10) == 0) {
         $$1 = arh.b;
      }

      if ($$1 == arh.b && this.p.A.a(3) == 0) {
         $$1 = arh.c;
      }

      return $$1;
   }

   public void a(int $$0, jh $$1, int $$2) {
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

   public boolean o() {
      return this.I.h();
   }

   public void a(des $$0) {
      this.q.a($$0);
   }

   public void p() {
      this.q.a();
      this.m.a();
   }

   public void a(Collection<dsy> $$0, Collection<dsy> $$1) {
      synchronized (this.t) {
         this.t.removeAll($$0);
         this.t.addAll($$1);
      }
   }

   public static int a(deo $$0, jh $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(deo $$0, dvv $$1, jh $$2) {
      if ($$1.b($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(dfv.a, $$2);
         int $$4 = $$0.a(dfv.b, $$2);
         int $$5 = $$1.k();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(jh $$0) {
      gmt.b $$1 = this.u.a($$0);
      return $$1 != null && $$1.c.get() != gmt.a.a;
   }

   @Nullable
   public fdb q() {
      return this.z.q != null ? this.z.q.get() : null;
   }

   @Nullable
   public fdb r() {
      return this.z.l != null ? this.z.l.get() : null;
   }

   @Nullable
   public fdb s() {
      return this.z.m != null ? this.z.m.get() : null;
   }

   @Nullable
   public fdb t() {
      return this.z.n != null ? this.z.n.get() : null;
   }

   @Nullable
   public fdb u() {
      return this.z.o != null ? this.z.o.get() : null;
   }

   @Nullable
   public fdb v() {
      return this.z.p != null ? this.z.p.get() : null;
   }

   @bat
   public ObjectArrayList<gmt.b> w() {
      return this.r;
   }

   @bat
   public gjv x() {
      return this.q;
   }

   @Nullable
   public gmx y() {
      return this.O;
   }

   public gio z() {
      return this.m;
   }
}
