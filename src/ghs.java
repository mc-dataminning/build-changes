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

public class ghs implements avb, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   private static final alh e = alh.b("transparency");
   private static final alh f = alh.b("entity_outline");
   public static final int a = 16;
   public static final int b = 8;
   public static final int c = 32;
   private static final int g = 15;
   private final fja h;
   private final gnx i;
   private final gkg j;
   private final gie k;
   private final gis l = new gis();
   private final ghe m = new ghe();
   private final gix n = new gix();
   private final giw o = new giw();
   @Nullable
   private gbx p;
   private final gil q = new gil();
   private final ObjectArrayList<glj.b> r = new ObjectArrayList(10000);
   private final ObjectArrayList<glj.b> s = new ObjectArrayList(50);
   private final Set<dsg> t = Sets.newHashSet();
   @Nullable
   private giu u;
   private int v;
   private final Int2ObjectMap<aqo> w = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<aqo>> x = new Long2ObjectOpenHashMap();
   @Nullable
   private fcd y;
   private final ght z = new ght();
   private int A = Integer.MIN_VALUE;
   private int B = Integer.MIN_VALUE;
   private int C = Integer.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   private double G = Double.MIN_VALUE;
   private double H = Double.MIN_VALUE;
   @Nullable
   private glj I;
   private int J = -1;
   private final List<btz> K = new ArrayList<>();
   private int L;
   private gln M;
   private boolean N;
   @Nullable
   private gln O;
   @Nullable
   private jg P;
   private int Q;

   public ghs(fja $$0, gnx $$1, gkg $$2, gie $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
   }

   public void a(fij $$0) {
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
   public void a(ava $$0) {
      this.a();
   }

   public void a() {
      if (this.y != null) {
         this.y.a();
      }

      this.y = new fce(this.h.aP().l(), this.h.aP().m(), true);
      this.y.a(0.0F, 0.0F, 0.0F, 0.0F);
   }

   @Nullable
   private gia A() {
      if (!fja.O()) {
         return null;
      } else {
         gia $$0 = this.h.ab().a(e, ght.j);
         if ($$0 == null) {
            this.h.n.k().a(fis.b);
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
         this.y.d(this.h.aP().l(), this.h.aP().m());
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   protected boolean d() {
      return !this.h.j.a() && this.y != null && this.h.t != null;
   }

   public void a(@Nullable gbx $$0) {
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
            this.I = new glj(this.p, this, ad.g(), this.k, this.h.ap(), this.h.ar());
         } else {
            this.I.a(this.p);
         }

         this.m.a();
         gho.a(fja.N());
         this.J = this.h.n.aG();
         if (this.u != null) {
            this.u.a();
         }

         this.I.g();
         synchronized (this.t) {
            this.t.clear();
         }

         this.u = new giu(this.I, this.p, this.h.n.aG(), this);
         this.q.a(this.u);
         this.B();
         btz $$0 = this.h.ao();
         if ($$0 != null) {
            this.u.a(ki.a($$0));
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

   public glj g() {
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
         glj.b $$1 = (glj.b)var2.next();
         if ($$1.d().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String k() {
      return "E: " + this.L + "/" + this.p.g() + ", SD: " + this.p.l();
   }

   private void a(fij $$0, gln $$1, boolean $$2, boolean $$3) {
      ezh $$4 = $$0.b();
      if (this.h.n.aG() != this.J) {
         this.e();
      }

      bok $$5 = this.p.ah();
      $$5.a("camera");
      int $$6 = ki.a($$4.a());
      int $$7 = ki.a($$4.b());
      int $$8 = ki.a($$4.c());
      if (this.A != $$6 || this.B != $$7 || this.C != $$8) {
         this.A = $$6;
         this.B = $$7;
         this.C = $$8;
         this.u.a(ki.a($$4));
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

   public static gln a(gln $$0) {
      return new gln($$0).a(8);
   }

   private void b(gln $$0) {
      if (!fja.Q().by()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.h.aK().a("apply_frustum");
         this.B();
         this.q.a($$0, this.r, this.s);
         this.h.aK().c();
      }
   }

   public void a(glj.b $$0) {
      this.q.a($$0);
   }

   public void a(ezh $$0, Matrix4f $$1, Matrix4f $$2) {
      this.M = new gln($$1, $$2);
      this.M.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(fdc $$0, fiq $$1, boolean $$2, fij $$3, ghm $$4, ghu $$5, Matrix4f $$6, Matrix4f $$7) {
      float $$8 = $$1.a(false);
      RenderSystem.setShaderGameTime(this.p.aa(), $$8);
      this.j.a(this.p, $$3, this.h.w);
      this.i.a(this.p, $$3, this.h.v);
      final bok $$9 = this.p.ah();
      $$9.b("light_update_queue");
      this.p.b();
      $$9.b("light_updates");
      this.p.h().p().a();
      ezh $$10 = $$3.b();
      double $$11 = $$10.a();
      double $$12 = $$10.b();
      double $$13 = $$10.c();
      $$9.b("culling");
      boolean $$14 = this.O != null;
      gln $$15 = $$14 ? this.O : this.M;
      this.h.aK().b("captureFrustum");
      if (this.N) {
         this.O = $$14 ? new gln($$6, $$7) : $$15;
         this.O.a($$11, $$12, $$13);
         this.N = false;
      }

      $$9.b("fog");
      float $$16 = $$4.j();
      boolean $$17 = this.h.s.c().a(azj.a($$11), azj.a($$12)) || this.h.m.j().d();
      Vector4f $$18 = ghl.a($$3, $$8, this.h.s, this.h.n.aG(), $$4.c($$8));
      ghk $$19 = ghl.a($$3, ghl.d.b, $$18, $$16, $$17, $$8);
      ghk $$20 = ghl.a($$3, ghl.d.a, $$18, $$16, $$17, $$8);
      $$9.b("cullEntities");
      boolean $$21 = this.a($$3, $$15, this.K);
      this.L = this.K.size();
      $$9.b("terrain_setup");
      this.a($$3, $$15, $$14, this.h.t.R_());
      $$9.b("compile_sections");
      this.c($$3);
      Matrix4fStack $$22 = RenderSystem.getModelViewStack();
      $$22.pushMatrix();
      $$22.mul($$6);
      fbx $$23 = new fbx();
      this.z.k = $$23.a("main", this.h.h());
      int $$24 = this.h.h().c;
      int $$25 = this.h.h().d;
      fdd $$26 = new fdd($$24, $$25, true);
      gia $$27 = this.A();
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

      fby $$28 = $$23.a("clear");
      this.z.k = $$28.b(this.z.k);
      $$28.a(() -> {
         RenderSystem.clearColor($$18.x, $$18.y, $$18.z, 0.0F);
         RenderSystem.clear(16640);
      });
      if (!$$17) {
         this.a($$23, $$3, $$8, $$20);
      }

      this.a($$23, $$15, $$3, $$6, $$7, $$19, $$2, $$21, $$1, $$9);
      gia $$29 = this.h.ab().a(f, ght.i);
      if ($$21 && $$29 != null) {
         $$29.a($$23, $$24, $$25, this.z);
      }

      this.a($$23, $$3, $$5, $$8, $$19);
      fim $$30 = this.h.n.aB();
      if ($$30 != fim.a) {
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
      $$23.a($$0, new fbx.c() {
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
      RenderSystem.setShaderFog(ghk.a);
   }

   private void a(fbx $$0, gln $$1, fij $$2, Matrix4f $$3, Matrix4f $$4, ghk $$5, boolean $$6, boolean $$7, fiq $$8, bok $$9) {
      fby $$10 = $$0.a("main");
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

      fdf<fcd> $$11 = this.z.k;
      fdf<fcd> $$12 = this.z.l;
      fdf<fcd> $$13 = this.z.m;
      fdf<fcd> $$14 = this.z.o;
      fdf<fcd> $$15 = this.z.q;
      $$10.a(() -> {
         RenderSystem.setShaderFog($$5);
         float $$13x = $$8.a(false);
         ezh $$14x = $$2.b();
         double $$15x = $$14x.a();
         double $$16 = $$14x.b();
         double $$17 = $$14x.c();
         $$9.a("terrain");
         this.a(gig.c(), $$15x, $$16, $$17, $$3, $$4);
         this.a(gig.d(), $$15x, $$16, $$17, $$3, $$4);
         this.a(gig.e(), $$15x, $$16, $$17, $$3, $$4);
         if (this.p.c().e()) {
            fcp.a();
         } else {
            fcp.b();
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

         fdt $$18 = new fdt();
         ghw.a $$19 = this.k.c();
         ghw.a $$20 = this.k.d();
         $$9.b("entities");
         this.a($$18, $$19, $$2, $$8, this.K);
         $$19.a();
         this.a($$18);
         $$9.b("blockentities");
         this.a($$18, $$19, $$20, $$2, $$13x);
         $$19.a();
         this.a($$18);
         $$19.a(gig.c());
         $$19.a(gig.t());
         $$19.a(gig.u());
         $$19.a(gir.h());
         $$19.a(gir.i());
         $$19.a(gir.c());
         $$19.a(gir.d());
         $$19.a(gir.e());
         $$19.a(gir.f());
         $$19.a(gir.g());
         this.k.e().a();
         if ($$6) {
            this.a($$2, $$19, $$18, false);
         }

         $$9.b("debug");
         this.h.l.a($$18, $$1, $$19, $$15x, $$16, $$17);
         $$19.a();
         this.a($$18);
         $$19.a(gir.j());
         $$19.a(gir.a());
         $$19.a(gir.b());
         $$19.a(gig.j());
         $$19.a(gig.l());
         $$19.a(gig.k());
         $$19.a(gig.m());
         $$9.b("destroyProgress");
         this.a($$18, $$2, $$20);
         $$20.b();
         this.a($$18);
         $$19.a(gig.i());
         $$19.b();
         if ($$12 != null) {
            $$12.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$12.get().f();
            $$12.get().a($$11.get());
         }

         $$9.b("translucent");
         this.a(gig.f(), $$15x, $$16, $$17, $$3, $$4);
         $$9.b("string");
         this.a(gig.s(), $$15x, $$16, $$17, $$3, $$4);
         if ($$6) {
            this.a($$2, $$19, $$18, true);
         }

         $$19.b();
         $$9.c();
      });
   }

   private void a(fbx $$0, fij $$1, ghu $$2, float $$3, ghk $$4) {
      fby $$5 = $$0.a("particles");
      if (this.z.n != null) {
         this.z.n = $$5.b(this.z.n);
         $$5.a(this.z.k);
      } else {
         this.z.k = $$5.b(this.z.k);
      }

      fdf<fcd> $$6 = this.z.k;
      fdf<fcd> $$7 = this.z.n;
      $$5.a(() -> {
         RenderSystem.setShaderFog($$4);
         if ($$7 != null) {
            $$7.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$7.get().f();
            $$7.get().a($$6.get());
         }

         gif.aN.a();
         this.h.g.a($$2, $$1, $$3);
         gif.aN.b();
      });
   }

   private void a(fbx $$0, Matrix4f $$1, Matrix4f $$2, fim $$3, ezh $$4, float $$5, int $$6, float $$7) {
      fby $$8 = $$0.a("clouds");
      if (this.z.p != null) {
         this.z.p = $$8.b(this.z.p);
      } else {
         this.z.k = $$8.b(this.z.k);
      }

      fdf<fcd> $$9 = this.z.p;
      $$8.a(() -> {
         if ($$9 != null) {
            $$9.get().a(0.0F, 0.0F, 0.0F, 0.0F);
            $$9.get().f();
         }

         this.m.a($$6, $$3, $$7, $$1, $$2, $$4, $$5);
      });
   }

   private void a(fbx $$0, ghu $$1, ezh $$2, float $$3, ghk $$4) {
      int $$5 = this.h.n.aG() * 16;
      float $$6 = this.h.j.g();
      fby $$7 = $$0.a("weather");
      if (this.z.o != null) {
         this.z.o = $$7.b(this.z.o);
      } else {
         this.z.k = $$7.b(this.z.k);
      }

      $$7.a(() -> {
         RenderSystem.setShaderFog($$4);
         gif.aO.a();
         this.o.a(this.h.s, $$1, this.v, $$3, $$2);
         this.n.a(this.p.C_(), $$2, (double)$$5, (double)$$6);
         gif.aO.b();
      });
   }

   private void a(fbx $$0, ezh $$1, ghk $$2) {
      fby $$3 = $$0.a("late_debug");
      this.z.k = $$3.b(this.z.k);
      if (this.z.m != null) {
         this.z.m = $$3.b(this.z.m);
      }

      fdf<fcd> $$4 = this.z.k;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         $$4.get().a(false);
         fdt $$3x = new fdt();
         ghw.a $$4x = this.k.c();
         this.h.l.a($$3x, $$4x, $$1.d, $$1.e, $$1.f);
         $$4x.a();
         this.a($$3x);
      });
   }

   private boolean a(fij $$0, gln $$1, List<btz> $$2) {
      ezh $$3 = $$0.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.d();
      btz.b(azj.a((double)this.h.n.aG() / 8.0, 1.0, 2.5) * this.h.n.g().c());

      for (btz $$9 : this.p.d()) {
         if (this.i.a($$9, $$1, $$4, $$5, $$6) || $$9.A(this.h.t)) {
            jg $$10 = $$9.dx();
            if ((this.p.e($$10.v()) || this.a($$10))
               && ($$9 != $$0.g() || $$0.i() || $$0.g() instanceof buv && ((buv)$$0.g()).fT())
               && (!($$9 instanceof ggs) || $$0.g() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.h.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(fdt $$0, ghw.a $$1, fij $$2, fiq $$3, List<btz> $$4) {
      ezh $$5 = $$2.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      bsh $$9 = this.h.s.s();
      boolean $$10 = this.d();

      for (btz $$11 : $$4) {
         if ($$11.ag == 0) {
            $$11.ab = $$11.dC();
            $$11.ac = $$11.dE();
            $$11.ad = $$11.dI();
         }

         ghw $$13;
         if ($$10 && this.h.b($$11)) {
            ghy $$12 = this.k.e();
            $$13 = $$12;
            int $$14 = $$11.i_();
            $$12.a(axu.b($$14), axu.c($$14), axu.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(fdt $$0, ghw.a $$1, ghw.a $$2, fij $$3, float $$4) {
      ezh $$5 = $$3.b();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator var13 = this.r.iterator();

      while (var13.hasNext()) {
         glj.b $$9 = (glj.b)var13.next();
         List<dsg> $$10 = $$9.d().b();
         if (!$$10.isEmpty()) {
            for (dsg $$11 : $$10) {
               jg $$12 = $$11.aC_();
               ghw $$13 = $$1;
               $$0.a();
               $$0.a((double)$$12.u() - $$6, (double)$$12.v() - $$7, (double)$$12.w() - $$8);
               SortedSet<aqo> $$14 = (SortedSet<aqo>)this.x.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     fdt.a $$16 = $$0.c();
                     fdx $$17 = new fdu($$2.getBuffer(hae.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        fdx $$3x = $$1.getBuffer($$2x);
                        return $$2x.R() ? fea.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.j.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      synchronized (this.t) {
         for (dsg $$18 : this.t) {
            jg $$19 = $$18.aC_();
            $$0.a();
            $$0.a((double)$$19.u() - $$6, (double)$$19.v() - $$7, (double)$$19.w() - $$8);
            this.j.a($$18, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(fdt $$0, fij $$1, ghw.a $$2) {
      ezh $$3 = $$1.b();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.x.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<aqo>> $$7 = (Entry<SortedSet<aqo>>)var11.next();
         jg $$8 = jg.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<aqo> $$9 = (SortedSet<aqo>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a((double)$$8.u() - $$4, (double)$$8.v() - $$5, (double)$$8.w() - $$6);
               fdt.a $$11 = $$0.c();
               fdx $$12 = new fdu($$2.getBuffer(hae.l.get($$10)), $$11, 1.0F);
               this.h.ap().a(this.p.a_($$8), $$8, this.p, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(fij $$0, ghw.a $$1, fdt $$2, boolean $$3) {
      if (this.h.w instanceof ezd $$4) {
         if ($$4.d() != ezf.a.a) {
            jg $$6 = $$4.b();
            dvd $$7 = this.p.a_($$6);
            if (!$$7.l() && this.p.C_().a($$6)) {
               boolean $$8 = gho.a($$7).T();
               if ($$8 != $$3) {
                  return;
               }

               fdx $$9 = $$1.getBuffer(gig.y());
               ezh $$10 = $$0.b();
               this.a($$2, $$9, $$0.g(), $$10.d, $$10.e, $$10.f, $$6, $$7);
               $$1.a();
            }
         }
      }
   }

   private void a(fdt $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(btz $$0, double $$1, double $$2, double $$3, float $$4, fdt $$5, ghw $$6) {
      double $$7 = azj.d((double)$$4, $$0.ab, $$0.dC());
      double $$8 = azj.d((double)$$4, $$0.ac, $$0.dE());
      double $$9 = azj.d((double)$$4, $$0.ad, $$0.dI());
      this.i.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.i.a($$0, $$4));
   }

   private void a(ezh $$0) {
      if (!this.r.isEmpty()) {
         jg $$1 = jg.a((jz)$$0);
         boolean $$2 = !$$1.equals(this.P);
         this.h.aK().a("translucent_sort");
         glj.d $$3 = new glj.d();
         ObjectListIterator $$5 = this.s.iterator();

         while ($$5.hasNext()) {
            glj.b $$4 = (glj.b)$$5.next();
            this.a($$4, $$3, $$0, $$2, true);
         }

         this.Q = this.Q % this.r.size();
         int $$5x = Math.max(this.r.size() / 8, 15);

         while ($$5x-- > 0) {
            int $$6 = this.Q++ % this.r.size();
            this.a((glj.b)this.r.get($$6), $$3, $$0, $$2, false);
         }

         this.P = $$1;
         this.h.aK().c();
      }
   }

   private void a(glj.b $$0, glj.d $$1, ezh $$2, boolean $$3, boolean $$4) {
      $$1.b($$2, $$0.g());
      boolean $$5 = !$$1.equals($$0.d.get());
      boolean $$6 = $$3 && ($$1.a() || $$4);
      if (($$6 || $$5) && !$$0.l() && $$0.k()) {
         $$0.a(this.I);
      }
   }

   private void a(gig $$0, double $$1, double $$2, double $$3, Matrix4f $$4, Matrix4f $$5) {
      RenderSystem.assertOnRenderThread();
      this.h.aK().a(() -> "render_" + $$0);
      boolean $$6 = $$0 != gig.f();
      ObjectListIterator<glj.b> $$7 = this.r.listIterator($$6 ? 0 : this.r.size());
      $$0.a();
      ghf $$8 = RenderSystem.getShader();
      if ($$8 == null) {
         $$0.b();
      } else {
         $$8.a(fdy.c.h, $$4, $$5, this.h.aP());
         $$8.b();
         fdk $$9 = $$8.o;

         while ($$6 ? $$7.hasNext() : $$7.hasPrevious()) {
            glj.b $$10 = $$6 ? (glj.b)$$7.next() : (glj.b)$$7.previous();
            if (!$$10.d().a($$0)) {
               fdw $$11 = $$10.a($$0);
               jg $$12 = $$10.f();
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
         fdw.b();
         this.h.aK().c();
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
      if (this.p.s().i()) {
         this.v++;
      }

      if (this.v % 20 == 0) {
         Iterator<aqo> $$0 = this.w.values().iterator();

         while ($$0.hasNext()) {
            aqo $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.v - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(aqo $$0) {
      long $$1 = $$0.b().a();
      Set<aqo> $$2 = (Set<aqo>)this.x.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.x.remove($$1);
      }
   }

   private void a(fbx $$0, fij $$1, float $$2, ghk $$3) {
      erg $$4 = $$1.k();
      if ($$4 != erg.c && $$4 != erg.a && !this.b($$1)) {
         ghi $$5 = this.p.c();
         ghi.d $$6 = $$5.c();
         if ($$6 != ghi.d.a) {
            fby $$7 = $$0.a("sky");
            this.z.k = $$7.b(this.z.k);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               gif.aK.a();
               fdt $$4x = new fdt();
               if ($$6 == ghi.d.c) {
                  this.l.b($$4x);
               } else {
                  fdv $$5x = fdv.b();
                  float $$6x = this.p.a($$2);
                  float $$7x = this.p.f($$2);
                  float $$8 = 1.0F - this.p.d($$2);
                  float $$9 = this.p.i($$2) * $$8;
                  int $$10 = $$5.b($$7x);
                  int $$11 = this.p.as();
                  int $$12 = this.p.a(this.h.j.k().b(), $$2);
                  float $$13 = axu.h(axu.b($$12));
                  float $$14 = axu.h(axu.c($$12));
                  float $$15 = axu.h(axu.d($$12));
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

   private boolean b(fij $$0) {
      return !($$0.g() instanceof buv $$1) ? false : $$1.b(btg.o) || $$1.b(btg.G);
   }

   private void c(fij $$0) {
      this.h.aK().a("populate_sections_to_compile");
      eqt $$1 = this.p.z_();
      glh $$2 = new glh();
      jg $$3 = $$0.c();
      List<glj.b> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.r.iterator();

      while (var6.hasNext()) {
         glj.b $$5 = (glj.b)var6.next();
         long $$6 = $$5.g();
         if ($$5.i() && $$5.a() && a($$1, $$6)) {
            boolean $$7 = false;
            if (this.h.n.m().c() == fjg.c) {
               jg $$8 = $$5.f().b(8, 8, 8);
               $$7 = $$8.j($$3) < 768.0 || $$5.j();
            } else if (this.h.n.m().c() == fjg.b) {
               $$7 = $$5.j();
            }

            if ($$7) {
               this.h.aK().a("build_near_sync");
               this.I.a($$5, $$2);
               $$5.h();
               this.h.aK().c();
            } else {
               $$4.add($$5);
            }
         }
      }

      this.h.aK().b("upload");
      this.I.f();
      this.h.aK().b("schedule_async_compile");

      for (glj.b $$9 : $$4) {
         $$9.a(this.I, $$2);
         $$9.h();
      }

      this.h.aK().c();
      this.a($$0.b());
   }

   private static boolean a(eqt $$0, long $$1) {
      int $$2 = ki.d($$1);
      int $$3 = ki.b($$1);

      for (int $$4 = $$2 - 1; $$4 <= $$2 + 1; $$4++) {
         for (int $$5 = $$3 - 1; $$5 <= $$3 + 1; $$5++) {
            if (!$$0.a(ki.b($$5, $$4))) {
               return false;
            }
         }
      }

      return true;
   }

   private void a(fdt $$0, fdx $$1, btz $$2, double $$3, double $$4, double $$5, jg $$6, dvd $$7) {
      giq.a($$0, $$1, $$7.a(this.p, $$6, ezm.a($$2)), (double)$$6.u() - $$3, (double)$$6.v() - $$4, (double)$$6.w() - $$5, 0.0F, 0.0F, 0.0F, 0.4F);
   }

   public void a(dea $$0, jg $$1, dvd $$2, dvd $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(jg $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(ki.a($$3), ki.a($$4), ki.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(ki.a($$7), ki.a($$8), ki.a($$6));
            }
         }
      }
   }

   public void a(jg $$0, dvd $$1, dvd $$2) {
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
      glj.b $$1 = this.u.a($$0);
      if ($$1 != null) {
         this.q.a($$1);
      }
   }

   public void a(lo $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(lo $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         o $$10 = o.a(var19, "Exception while adding particle");
         p $$11 = $$10.a("Particle being added");
         $$11.a("ID", lx.i.b($$0.a()));
         $$11.a("Parameters", () -> lq.bf.encodeStart(this.p.H_().a(ux.a), $$0).toString());
         $$11.a("Position", () -> p.a(this.p, $$3, $$4, $$5));
         throw new z($$10);
      }
   }

   public <T extends lo> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   gfe b(lo $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gfe b(lo $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      fij $$9 = this.h.j.k();
      arf $$10 = this.a($$2);
      if ($$1) {
         return this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == arf.c ? null : this.h.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private arf a(boolean $$0) {
      arf $$1 = this.h.n.at().c();
      if ($$0 && $$1 == arf.c && this.p.A.a(10) == 0) {
         $$1 = arf.b;
      }

      if ($$1 == arf.b && this.p.A.a(3) == 0) {
         $$1 = arf.c;
      }

      return $$1;
   }

   public void a(int $$0, jg $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         aqo $$4 = (aqo)this.w.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new aqo($$0, $$1);
            this.w.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.v);
         ((SortedSet)this.x.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         aqo $$3 = (aqo)this.w.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean o() {
      return this.I.h();
   }

   public void a(deb $$0) {
      this.q.a($$0);
   }

   public void p() {
      this.q.a();
      this.m.a();
   }

   public void a(Collection<dsg> $$0, Collection<dsg> $$1) {
      synchronized (this.t) {
         this.t.removeAll($$0);
         this.t.addAll($$1);
      }
   }

   public static int a(ddx $$0, jg $$1) {
      return a($$0, $$0.a_($$1), $$1);
   }

   public static int a(ddx $$0, dvd $$1, jg $$2) {
      if ($$1.b($$0, $$2)) {
         return 15728880;
      } else {
         int $$3 = $$0.a(dfe.a, $$2);
         int $$4 = $$0.a(dfe.b, $$2);
         int $$5 = $$1.k();
         if ($$4 < $$5) {
            $$4 = $$5;
         }

         return $$3 << 20 | $$4 << 4;
      }
   }

   public boolean a(jg $$0) {
      glj.b $$1 = this.u.a($$0);
      return $$1 != null && $$1.c.get() != glj.a.a;
   }

   @Nullable
   public fcd q() {
      return this.z.q != null ? this.z.q.get() : null;
   }

   @Nullable
   public fcd r() {
      return this.z.l != null ? this.z.l.get() : null;
   }

   @Nullable
   public fcd s() {
      return this.z.m != null ? this.z.m.get() : null;
   }

   @Nullable
   public fcd t() {
      return this.z.n != null ? this.z.n.get() : null;
   }

   @Nullable
   public fcd u() {
      return this.z.o != null ? this.z.o.get() : null;
   }

   @Nullable
   public fcd v() {
      return this.z.p != null ? this.z.p.get() : null;
   }

   @bap
   public ObjectArrayList<glj.b> w() {
      return this.r;
   }

   @bap
   public gil x() {
      return this.q;
   }

   @Nullable
   public gln y() {
      return this.O;
   }

   public ghe z() {
      return this.m;
   }
}
