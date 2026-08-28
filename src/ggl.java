import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class ggl implements AutoCloseable {
   private static final alb f = alb.b("shaders/post/blur.json");
   public static final int a = 10;
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float b = 0.05F;
   private static final float i = 1000.0F;
   final fib j;
   private final aus k;
   private final azk l = azk.a();
   private float m;
   public final ggo c;
   private final ghc n;
   private int o;
   private float p;
   private float q;
   private float r;
   private float s;
   private boolean t = true;
   private boolean u = true;
   private long v;
   private boolean w;
   private long x = ad.c();
   private final ggt y;
   private final gwb z = new gwb();
   private boolean A;
   private float B = 1.0F;
   private float C;
   private float D;
   public static final int d = 40;
   @Nullable
   private cvl E;
   private int F;
   private float G;
   private float H;
   private final fbx I = new fbx(3);
   @Nullable
   ggy J;
   @Nullable
   private ggy K;
   private boolean L;
   private final fhk M = new fhk();
   @Nullable
   public ghk e;
   private final Map<String, ghk> N = Maps.newHashMap();
   @Nullable
   private static ghk O;
   @Nullable
   private static ghk P;
   @Nullable
   private static ghk Q;
   @Nullable
   private static ghk R;
   @Nullable
   private static ghk S;
   @Nullable
   private static ghk T;
   @Nullable
   private static ghk U;
   @Nullable
   private static ghk V;
   @Nullable
   private static ghk W;
   @Nullable
   private static ghk X;
   @Nullable
   private static ghk Y;
   @Nullable
   private static ghk Z;
   @Nullable
   private static ghk aa;
   @Nullable
   private static ghk ab;
   @Nullable
   private static ghk ac;
   @Nullable
   private static ghk ad;
   @Nullable
   private static ghk ae;
   @Nullable
   private static ghk af;
   @Nullable
   private static ghk ag;
   @Nullable
   private static ghk ah;
   @Nullable
   private static ghk ai;
   @Nullable
   private static ghk aj;
   @Nullable
   private static ghk ak;
   @Nullable
   private static ghk al;
   @Nullable
   private static ghk am;
   @Nullable
   private static ghk an;
   @Nullable
   private static ghk ao;
   @Nullable
   private static ghk ap;
   @Nullable
   private static ghk aq;
   @Nullable
   private static ghk ar;
   @Nullable
   private static ghk as;
   @Nullable
   private static ghk at;
   @Nullable
   private static ghk au;
   @Nullable
   private static ghk av;
   @Nullable
   private static ghk aw;
   @Nullable
   private static ghk ax;
   @Nullable
   private static ghk ay;
   @Nullable
   private static ghk az;
   @Nullable
   private static ghk aA;
   @Nullable
   private static ghk aB;
   @Nullable
   private static ghk aC;
   @Nullable
   private static ghk aD;
   @Nullable
   private static ghk aE;
   @Nullable
   private static ghk aF;
   @Nullable
   private static ghk aG;
   @Nullable
   private static ghk aH;
   @Nullable
   private static ghk aI;
   @Nullable
   private static ghk aJ;
   @Nullable
   private static ghk aK;
   @Nullable
   private static ghk aL;
   @Nullable
   private static ghk aM;
   @Nullable
   private static ghk aN;
   @Nullable
   private static ghk aO;
   @Nullable
   private static ghk aP;
   @Nullable
   private static ghk aQ;
   @Nullable
   private static ghk aR;
   @Nullable
   private static ghk aS;

   public ggl(fib $$0, ggo $$1, aus $$2, ghc $$3) {
      this.j = $$0;
      this.k = $$2;
      this.c = $$1;
      this.y = new ggt(this, $$0);
      this.n = $$3;
      this.J = null;
   }

   @Override
   public void close() {
      this.y.close();
      this.z.close();
      this.I.close();
      this.b();
      this.at();
      if (this.K != null) {
         this.K.close();
      }

      if (this.e != null) {
         this.e.close();
      }
   }

   public void a(boolean $$0) {
      this.t = $$0;
   }

   public void b(boolean $$0) {
      this.u = $$0;
   }

   public void c(boolean $$0) {
      this.A = $$0;
   }

   public boolean a() {
      return this.A;
   }

   public void b() {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
   }

   public void c() {
      this.L = !this.L;
   }

   public void a(@Nullable btj $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof ckh) {
         this.a(alb.b("shaders/post/creeper.json"));
      } else if ($$0 instanceof clg) {
         this.a(alb.b("shaders/post/spider.json"));
      } else if ($$0 instanceof ckl) {
         this.a(alb.b("shaders/post/invert.json"));
      }
   }

   private void a(alb $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = ggy.a(this.k, this.j.aa(), $$0, Set.of(ggy.a));
         this.L = true;
      } catch (IOException var3) {
         g.warn("Failed to load shader: {}", $$0, var3);
         this.L = false;
      } catch (JsonSyntaxException var4) {
         g.warn("Failed to parse shader: {}", $$0, var4);
         this.L = false;
      }
   }

   private void b(auv $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = ggy.a($$0, this.j.aa(), f, Set.of(ggy.a));
      } catch (IOException var3) {
         g.warn("Failed to load shader: {}", f, var3);
      } catch (JsonSyntaxException var4) {
         g.warn("Failed to parse shader: {}", f, var4);
      }
   }

   public void d() {
      float $$0 = (float)this.j.n.r();
      if (this.K != null && $$0 >= 1.0F) {
         this.K.a("Radius", $$0);
         this.K.a(this.j.h(), this.I, this.j.au());
      }
   }

   public aum e() {
      return new auy<ggl.a>() {
         protected ggl.a a(aus $$0, bny $$1) {
            Map<alb, auq> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(fci.a.b.b()) || $$1x.endsWith(fci.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<alb, auq> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new auq($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  ggl.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new ggl.a($$0, $$3);
         }

         protected void a(ggl.a $$0, aus $$1, bny $$2) {
            ggl.this.c($$0);
            if (ggl.this.J != null) {
               ggl.this.J.close();
            }

            ggl.this.J = null;
            ggl.this.a(ggl.this.j.an());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(auv $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new ghk($$0, "blit_screen", fcs.a);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aP = this.a($$0, "rendertype_gui", fcs.f);
         aQ = this.a($$0, "rendertype_gui_overlay", fcs.f);
         O = this.a($$0, "position", fcs.e);
         P = this.a($$0, "position_color", fcs.f);
         Q = this.a($$0, "position_tex", fcs.i);
         R = this.a($$0, "position_tex_color", fcs.j);
         aC = this.a($$0, "rendertype_text", fcs.k);
      }
   }

   private ghk a(auv $$0, String $$1, fcz $$2) {
      try {
         ghk $$3 = new ghk($$0, $$1, $$2);
         this.N.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void c(auv $$0) {
      RenderSystem.assertOnRenderThread();
      List<fci> $$1 = Lists.newArrayList();
      $$1.addAll(fci.a.b.c().values());
      $$1.addAll(fci.a.a.c().values());
      $$1.forEach(fci::a);
      List<Pair<ghk, Consumer<ghk>>> $$2 = Lists.newArrayListWithCapacity(this.N.size());

      try {
         $$2.add(Pair.of(new ghk($$0, "particle", fcs.d), (Consumer<ghk>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new ghk($$0, "position", fcs.e), (Consumer<ghk>)$$0x -> O = $$0x));
         $$2.add(Pair.of(new ghk($$0, "position_color", fcs.f), (Consumer<ghk>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new ghk($$0, "position_color_lightmap", fcs.h), (Consumer<ghk>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new ghk($$0, "position_color_tex_lightmap", fcs.k), (Consumer<ghk>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new ghk($$0, "position_tex", fcs.i), (Consumer<ghk>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new ghk($$0, "position_tex_color", fcs.j), (Consumer<ghk>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_solid", fcs.b), (Consumer<ghk>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_cutout_mipped", fcs.b), (Consumer<ghk>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_cutout", fcs.b), (Consumer<ghk>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_translucent", fcs.b), (Consumer<ghk>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_translucent_moving_block", fcs.b), (Consumer<ghk>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_armor_cutout_no_cull", fcs.c), (Consumer<ghk>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_solid", fcs.c), (Consumer<ghk>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_cutout", fcs.c), (Consumer<ghk>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_cutout_no_cull", fcs.c), (Consumer<ghk>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_cutout_no_cull_z_offset", fcs.c), (Consumer<ghk>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_item_entity_translucent_cull", fcs.c), (Consumer<ghk>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_translucent_cull", fcs.c), (Consumer<ghk>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_translucent", fcs.c), (Consumer<ghk>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_translucent_emissive", fcs.c), (Consumer<ghk>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_smooth_cutout", fcs.c), (Consumer<ghk>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_beacon_beam", fcs.b), (Consumer<ghk>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_decal", fcs.c), (Consumer<ghk>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_no_outline", fcs.c), (Consumer<ghk>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_shadow", fcs.c), (Consumer<ghk>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_alpha", fcs.c), (Consumer<ghk>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_eyes", fcs.c), (Consumer<ghk>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_energy_swirl", fcs.c), (Consumer<ghk>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_leash", fcs.h), (Consumer<ghk>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_water_mask", fcs.e), (Consumer<ghk>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_outline", fcs.j), (Consumer<ghk>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_armor_entity_glint", fcs.i), (Consumer<ghk>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_glint_translucent", fcs.i), (Consumer<ghk>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_glint", fcs.i), (Consumer<ghk>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_glint", fcs.i), (Consumer<ghk>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_entity_glint_direct", fcs.i), (Consumer<ghk>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_text", fcs.k), (Consumer<ghk>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_text_background", fcs.h), (Consumer<ghk>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_text_intensity", fcs.k), (Consumer<ghk>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_text_see_through", fcs.k), (Consumer<ghk>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_text_background_see_through", fcs.h), (Consumer<ghk>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_text_intensity_see_through", fcs.k), (Consumer<ghk>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_lightning", fcs.f), (Consumer<ghk>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_tripwire", fcs.b), (Consumer<ghk>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_end_portal", fcs.e), (Consumer<ghk>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_end_gateway", fcs.e), (Consumer<ghk>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_clouds", fcs.f), (Consumer<ghk>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_lines", fcs.g), (Consumer<ghk>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_crumbling", fcs.b), (Consumer<ghk>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_gui", fcs.f), (Consumer<ghk>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_gui_overlay", fcs.f), (Consumer<ghk>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_gui_text_highlight", fcs.f), (Consumer<ghk>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_gui_ghost_recipe_overlay", fcs.f), (Consumer<ghk>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new ghk($$0, "rendertype_breeze_wind", fcs.c), (Consumer<ghk>)$$0x -> ar = $$0x));
         this.b($$0);
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((ghk)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.at();
      $$2.forEach($$0x -> {
         ghk $$1x = (ghk)$$0x.getFirst();
         this.N.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
      this.y.a($$0);
   }

   private void at() {
      RenderSystem.assertOnRenderThread();
      this.N.values().forEach(ghk::close);
      this.N.clear();
   }

   @Nullable
   public ghk a(@Nullable String $$0) {
      return $$0 == null ? null : this.N.get($$0);
   }

   public void f() {
      this.au();
      this.y.a();
      if (this.j.an() == null) {
         this.j.a(this.j.t);
      }

      this.M.a();
      this.c.a();
      this.o++;
      if (this.j.s.s().i()) {
         this.j.f.a(this.M);
         this.s = this.r;
         if (this.j.m.j().c()) {
            this.r += 0.05F;
            if (this.r > 1.0F) {
               this.r = 1.0F;
            }
         } else if (this.r > 0.0F) {
            this.r -= 0.0125F;
         }

         if (this.F > 0) {
            this.F--;
            if (this.F == 0) {
               this.E = null;
            }
         }
      }
   }

   @Nullable
   public ggy g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      this.I.b();
      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      btj $$1 = this.j.an();
      if ($$1 != null) {
         if (this.j.s != null && this.j.t != null) {
            this.j.aJ().a("pick");
            double $$2 = this.j.t.gC();
            double $$3 = this.j.t.gD();
            eyc $$4 = this.a($$1, $$2, $$3, $$0);
            this.j.w = $$4;
            this.j.v = $$4 instanceof eyb $$5 ? $$5.a() : null;
            this.j.aJ().c();
         }
      }
   }

   private eyc a(btj $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = azc.k($$4);
      eye $$6 = $$0.m($$3);
      eyc $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != eyc.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      eye $$9 = $$0.g($$3);
      eye $$10 = $$6.b($$9.d * $$4, $$9.e * $$4, $$9.f * $$4);
      float $$11 = 1.0F;
      exz $$12 = $$0.cO().b($$9.c($$4)).c(1.0, 1.0, 1.0);
      eyb $$13 = cok.a($$0, $$6, $$10, $$12, bto.h, $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static eyc a(eyc $$0, eye $$1, double $$2) {
      eye $$3 = $$0.e();
      if (!$$3.a((jx)$$1, $$2)) {
         eye $$4 = $$0.e();
         jj $$5 = jj.a($$4.d - $$1.d, $$4.e - $$1.e, $$4.f - $$1.f);
         return eya.a($$4, $$5, je.a((jx)$$4));
      } else {
         return $$0;
      }
   }

   private void au() {
      float $$4;
      if (this.j.an() instanceof gfp $$0) {
         fif $$1 = this.j.n;
         boolean $$2 = $$1.aD().a();
         float $$3 = $$1.am().c().floatValue();
         $$4 = azc.h($$3, 1.0F, $$0.a($$2));
      } else {
         $$4 = 1.0F;
      }

      this.q = this.p;
      this.p = this.p + ($$4 - this.p) * 0.5F;
      this.p = azc.a(this.p, 0.1F, 1.5F);
   }

   private float a(fhk $$0, float $$1, boolean $$2) {
      if (this.A) {
         return 90.0F;
      } else {
         float $$3 = 70.0F;
         if ($$2) {
            $$3 = (float)this.j.n.aj().c().intValue();
            $$3 *= azc.h($$1, this.q, this.p);
         }

         if ($$0.g() instanceof buf $$4 && $$4.eB()) {
            float $$5 = Math.min((float)$$4.aM + $$1, 20.0F);
            $$3 /= (1.0F - 500.0F / ($$5 + 500.0F)) * 2.0F + 1.0F;
         }

         eqd $$6 = $$0.k();
         if ($$6 == eqd.a || $$6 == eqd.b) {
            float $$7 = this.j.n.am().c().floatValue();
            $$3 *= azc.h($$7, 1.0F, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fcu $$0, float $$1) {
      if (this.j.an() instanceof buf $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.eB()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = azc.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eI();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.n.aq().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fcu $$0, float $$1) {
      if (this.j.an() instanceof gfp $$2) {
         float var7 = $$2.h - $$2.g;
         float $$5 = -($$2.h + var7 * $$1);
         float $$6 = azc.h($$1, $$2.cd, $$2.ce);
         $$0.a(azc.a($$5 * (float) Math.PI) * $$6 * 0.5F, -Math.abs(azc.b($$5 * (float) Math.PI) * $$6), 0.0F);
         $$0.a(a.f.rotationDegrees(azc.a($$5 * (float) Math.PI) * $$6 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(azc.b($$5 * (float) Math.PI - 0.2F) * $$6) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.B = $$0;
      this.C = $$1;
      this.D = $$2;
      this.b(false);
      this.a(false);
      this.a(fhr.a);
      this.B = 1.0F;
   }

   private void a(fhk $$0, float $$1, Matrix4f $$2) {
      if (!this.A) {
         Matrix4f $$3 = this.b(this.a($$0, $$1, false));
         RenderSystem.setProjectionMatrix($$3, fdc.a);
         fcu $$4 = new fcu();
         $$4.a();
         $$4.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$5 = RenderSystem.getModelViewStack();
         $$5.pushMatrix().mul($$2);
         this.a($$4, $$1);
         if (this.j.n.ad().c()) {
            this.b($$4, $$1);
         }

         boolean $$6 = this.j.an() instanceof buf && ((buf)this.j.an()).fL();
         if (this.j.n.aD().a() && !$$6 && !this.j.n.X && this.j.r.j() != ddp.d) {
            this.y.c();
            this.c.a($$1, $$4, this.n.c(), this.j.t, this.j.ap().a(this.j.t, $$1));
            this.y.b();
         }

         $$5.popMatrix();
         $$4.b();
         if (this.j.n.aD().a() && !$$6) {
            ghg.a(this.j, $$4);
         }
      }
   }

   public Matrix4f b(float $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.B != 1.0F) {
         $$1.translate(this.C, -this.D, 0.0F);
         $$1.scale(this.B, this.B, 1.0F);
      }

      return $$1.perspective($$0 * (float) (Math.PI / 180.0), (float)this.j.aO().l() / (float)this.j.aO().m(), 0.05F, this.h());
   }

   public float h() {
      return this.m * 4.0F;
   }

   public static float a(buf $$0, float $$1) {
      bsq $$2 = $$0.c(bss.p);
      return !$$2.a(200) ? 1.0F : 0.7F + azc.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(fhr $$0, boolean $$1) {
      if (!this.j.aB() && this.j.n.n && (!this.j.n.ab().c() || !this.j.o.d())) {
         if (ad.c() - this.x > 500L) {
            this.j.b(false);
         }
      } else {
         this.x = ad.c();
      }

      if (!this.j.y) {
         boolean $$2 = this.j.c();
         int $$3 = (int)(this.j.o.e() * (double)this.j.aO().p() / (double)this.j.aO().n());
         int $$4 = (int)(this.j.o.f() * (double)this.j.aO().q() / (double)this.j.aO().o());
         RenderSystem.viewport(0, 0, this.j.aO().l(), this.j.aO().m());
         if ($$2 && $$1 && this.j.s != null) {
            this.j.aJ().a("level");
            this.a($$0);
            this.av();
            this.j.f.b();
            if (this.J != null && this.L) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.J.a(this.j.h(), this.I, $$0);
            }

            this.j.h().a(true);
         }

         fbs $$5 = this.j.aO();
         RenderSystem.clear(256);
         Matrix4f $$6 = new Matrix4f().setOrtho(0.0F, (float)((double)$$5.l() / $$5.t()), (float)((double)$$5.m() / $$5.t()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$6, fdc.b);
         Matrix4fStack $$7 = RenderSystem.getModelViewStack();
         $$7.pushMatrix();
         $$7.translation(0.0F, 0.0F, -11000.0F);
         fbl.d();
         fjn $$8 = new fjn(this.j, this.n.c());
         if ($$2 && $$1 && this.j.s != null) {
            this.j.aJ().b("gui");
            if (!this.j.n.X) {
               this.a($$8, $$0.a(false));
            }

            this.j.m.a($$8, $$0);
            $$8.e();
            RenderSystem.clear(256);
            this.j.aJ().c();
         }

         if (this.j.aM() != null) {
            try {
               this.j.aM().a($$8, $$3, $$4, $$0.a());
            } catch (Throwable var15) {
               o $$10 = o.a(var15, "Rendering overlay");
               p $$11 = $$10.a("Overlay render details");
               $$11.a("Overlay name", () -> this.j.aM().getClass().getCanonicalName());
               throw new z($$10);
            }
         } else if ($$2 && this.j.z != null) {
            try {
               this.j.z.c($$8, $$3, $$4, $$0.a());
            } catch (Throwable var14) {
               o $$13 = o.a(var14, "Rendering screen");
               p $$14 = $$13.a("Screen render details");
               $$14.a("Screen name", () -> this.j.z.getClass().getCanonicalName());
               $$14.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$3, $$4, this.j.o.e(), this.j.o.f()));
               $$14.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.j.aO().p(),
                        this.j.aO().q(),
                        this.j.aO().l(),
                        this.j.aO().m(),
                        this.j.aO().t()
                     )
               );
               throw new z($$13);
            }

            try {
               if (this.j.z != null) {
                  this.j.z.z();
               }
            } catch (Throwable var13) {
               o $$16 = o.a(var13, "Narrating screen");
               p $$17 = $$16.a("Screen details");
               $$17.a("Screen name", () -> this.j.z.getClass().getCanonicalName());
               throw new z($$16);
            }
         }

         if ($$2 && $$1 && this.j.s != null) {
            this.j.m.b($$8, $$0);
         }

         if ($$2) {
            this.j.aJ().a("toasts");
            this.j.az().a($$8);
            this.j.aJ().c();
         }

         $$8.e();
         $$7.popMatrix();
         this.I.a();
      }
   }

   private void av() {
      if (!this.w && this.j.T()) {
         long $$0 = ad.c();
         if ($$0 - this.v >= 1000L) {
            this.v = $$0;
            has $$1 = this.j.V();
            if ($$1 != null && !$$1.af()) {
               $$1.C().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.w = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.j.f.k() > 10 && this.j.f.p()) {
         fbp $$1 = fik.a(this.j.h());
         ad.h().execute(() -> {
            int $$2 = $$1.a();
            int $$3 = $$1.b();
            int $$4 = 0;
            int $$5 = 0;
            if ($$2 > $$3) {
               $$4 = ($$2 - $$3) / 2;
               $$2 = $$3;
            } else {
               $$5 = ($$3 - $$2) / 2;
               $$3 = $$2;
            }

            try (fbp $$6 = new fbp(64, 64, false)) {
               $$1.a($$4, $$5, $$2, $$3, $$6);
               $$6.a($$0);
            } catch (IOException var16) {
               g.warn("Couldn't save auto screenshot", var16);
            } finally {
               $$1.close();
            }
         });
      }
   }

   private boolean aw() {
      if (!this.u) {
         return false;
      } else {
         btj $$0 = this.j.an();
         boolean $$1 = $$0 instanceof cnp && !this.j.n.X;
         if ($$1 && !((cnp)$$0).gd().e) {
            cvl $$2 = ((buf)$$0).eW();
            eyc $$3 = this.j.w;
            if ($$3 != null && $$3.c() == eyc.a.b) {
               je $$4 = ((eya)$$3).a();
               dua $$5 = this.j.s.a_($$4);
               if (this.j.r.j() == ddp.d) {
                  $$1 = $$5.b(this.j.s, $$4) != null;
               } else {
                  due $$6 = new due(this.j.s, $$4, false);
                  ka<dgv> $$7 = this.j.s.F_().d(lv.f);
                  $$1 = !$$2.f() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(fhr $$0) {
      float $$1 = $$0.a(true);
      this.y.a($$1);
      if (this.j.an() == null) {
         this.j.a(this.j.t);
      }

      this.a($$1);
      this.j.aJ().a("center");
      boolean $$2 = this.aw();
      this.j.aJ().b("camera");
      fhk $$3 = this.M;
      btj $$4 = (btj)(this.j.an() == null ? this.j.t : this.j.an());
      float $$5 = this.j.s.s().a($$4) ? 1.0F : $$1;
      $$3.a(this.j.s, $$4, !this.j.n.aD().a(), this.j.n.aD().b(), $$5);
      this.m = (float)(this.j.n.aG() * 16);
      float $$6 = this.a($$3, $$1, true);
      Matrix4f $$7 = this.b($$6);
      fcu $$8 = new fcu();
      this.a($$8, $$3.p());
      if (this.j.n.ad().c()) {
         this.b($$8, $$3.p());
      }

      $$7.mul($$8.c().a());
      float $$9 = this.j.n.al().c().floatValue();
      float $$10 = azc.h($$1, this.j.t.cH, this.j.t.cG) * $$9 * $$9;
      if ($$10 > 0.0F) {
         int $$11 = this.j.t.b(bss.i) ? 7 : 20;
         float $$12 = 5.0F / ($$10 * $$10 + 5.0F) - $$10 * 0.04F;
         $$12 *= $$12;
         Vector3f $$13 = new Vector3f(0.0F, azc.g / 2.0F, azc.g / 2.0F);
         float $$14 = ((float)this.o + $$1) * (float)$$11 * (float) (Math.PI / 180.0);
         $$7.rotate($$14, $$13);
         $$7.scale(1.0F / $$12, 1.0F, 1.0F);
         $$7.rotate(-$$14, $$13);
      }

      float $$15 = Math.max($$6, (float)this.j.n.aj().c().intValue());
      Matrix4f $$16 = this.b($$15);
      RenderSystem.setProjectionMatrix($$7, fdc.a);
      Quaternionf $$17 = $$3.f().conjugate(new Quaternionf());
      Matrix4f $$18 = new Matrix4f().rotation($$17);
      this.j.f.a($$3.b(), $$18, $$16);
      this.j.h().a(true);
      this.j.f.a(this.I, $$0, $$2, $$3, this, this.y, $$18, $$7);
      this.j.aJ().b("hand");
      if (this.t) {
         RenderSystem.clear(256);
         this.a($$3, $$1, $$18);
      }

      this.j.aJ().c();
   }

   public void i() {
      this.E = null;
      this.j.aG().a();
      this.M.o();
      this.w = false;
   }

   public void a(cvl $$0) {
      this.E = $$0;
      this.F = 40;
      this.G = this.l.i() * 2.0F - 1.0F;
      this.H = this.l.i() * 2.0F - 1.0F;
   }

   private void a(fjn $$0, float $$1) {
      if (this.E != null && this.F > 0) {
         int $$2 = 40 - this.F;
         float $$3 = ((float)$$2 + $$1) / 40.0F;
         float $$4 = $$3 * $$3;
         float $$5 = $$3 * $$4;
         float $$6 = 10.25F * $$5 * $$4 - 24.95F * $$4 * $$4 + 25.5F * $$5 - 13.8F * $$4 + 4.0F * $$3;
         float $$7 = $$6 * (float) Math.PI;
         float $$8 = this.G * (float)($$0.a() / 4);
         float $$9 = this.H * (float)($$0.b() / 4);
         fcu $$10 = new fcu();
         $$10.a();
         $$10.a((float)($$0.a() / 2) + $$8 * azc.e(azc.a($$7 * 2.0F)), (float)($$0.b() / 2) + $$9 * azc.e(azc.a($$7 * 2.0F)), -50.0F);
         float $$11 = 50.0F + 175.0F * azc.a($$7);
         $$10.b($$11, -$$11, $$11);
         $$10.a(a.d.rotationDegrees(900.0F * azc.e(azc.a($$7))));
         $$10.a(a.b.rotationDegrees(6.0F * azc.b($$3 * 8.0F)));
         $$10.a(a.f.rotationDegrees(6.0F * azc.b($$3 * 8.0F)));
         this.j.ar().a(this.E, cvi.i, 15728880, gwb.d, $$10, $$0.d(), this.j.s, 0);
         $$10.b();
      }
   }

   public fib j() {
      return this.j;
   }

   public float c(float $$0) {
      return azc.h($$0, this.s, this.r);
   }

   public float k() {
      return this.m;
   }

   public fhk l() {
      return this.M;
   }

   public ggt m() {
      return this.y;
   }

   public gwb n() {
      return this.z;
   }

   @Nullable
   public static ghk o() {
      return O;
   }

   @Nullable
   public static ghk p() {
      return P;
   }

   @Nullable
   public static ghk q() {
      return Q;
   }

   @Nullable
   public static ghk r() {
      return R;
   }

   @Nullable
   public static ghk s() {
      return S;
   }

   @Nullable
   public static ghk t() {
      return T;
   }

   @Nullable
   public static ghk u() {
      return U;
   }

   @Nullable
   public static ghk v() {
      return V;
   }

   @Nullable
   public static ghk w() {
      return W;
   }

   @Nullable
   public static ghk x() {
      return X;
   }

   @Nullable
   public static ghk y() {
      return Y;
   }

   @Nullable
   public static ghk z() {
      return Z;
   }

   @Nullable
   public static ghk A() {
      return aa;
   }

   @Nullable
   public static ghk B() {
      return ab;
   }

   @Nullable
   public static ghk C() {
      return ac;
   }

   @Nullable
   public static ghk D() {
      return ad;
   }

   @Nullable
   public static ghk E() {
      return ae;
   }

   @Nullable
   public static ghk F() {
      return af;
   }

   @Nullable
   public static ghk G() {
      return ag;
   }

   @Nullable
   public static ghk H() {
      return ah;
   }

   @Nullable
   public static ghk I() {
      return ai;
   }

   @Nullable
   public static ghk J() {
      return aj;
   }

   @Nullable
   public static ghk K() {
      return ak;
   }

   @Nullable
   public static ghk L() {
      return al;
   }

   @Nullable
   public static ghk M() {
      return am;
   }

   @Nullable
   public static ghk N() {
      return an;
   }

   @Nullable
   public static ghk O() {
      return ao;
   }

   @Nullable
   public static ghk P() {
      return ap;
   }

   @Nullable
   public static ghk Q() {
      return aq;
   }

   @Nullable
   public static ghk R() {
      return ar;
   }

   @Nullable
   public static ghk S() {
      return as;
   }

   @Nullable
   public static ghk T() {
      return at;
   }

   @Nullable
   public static ghk U() {
      return au;
   }

   @Nullable
   public static ghk V() {
      return av;
   }

   @Nullable
   public static ghk W() {
      return aw;
   }

   @Nullable
   public static ghk X() {
      return ax;
   }

   @Nullable
   public static ghk Y() {
      return ay;
   }

   @Nullable
   public static ghk Z() {
      return az;
   }

   @Nullable
   public static ghk aa() {
      return aA;
   }

   @Nullable
   public static ghk ab() {
      return aB;
   }

   @Nullable
   public static ghk ac() {
      return aC;
   }

   @Nullable
   public static ghk ad() {
      return aD;
   }

   @Nullable
   public static ghk ae() {
      return aE;
   }

   @Nullable
   public static ghk af() {
      return aF;
   }

   @Nullable
   public static ghk ag() {
      return aG;
   }

   @Nullable
   public static ghk ah() {
      return aH;
   }

   @Nullable
   public static ghk ai() {
      return aI;
   }

   @Nullable
   public static ghk aj() {
      return aJ;
   }

   @Nullable
   public static ghk ak() {
      return aK;
   }

   @Nullable
   public static ghk al() {
      return aL;
   }

   @Nullable
   public static ghk am() {
      return aM;
   }

   @Nullable
   public static ghk an() {
      return aN;
   }

   @Nullable
   public static ghk ao() {
      return aO;
   }

   @Nullable
   public static ghk ap() {
      return aP;
   }

   @Nullable
   public static ghk aq() {
      return aQ;
   }

   @Nullable
   public static ghk ar() {
      return aR;
   }

   @Nullable
   public static ghk as() {
      return aS;
   }

   public static record a(auv a, Map<alb, auq> c) implements auv {
      @Override
      public Optional<auq> getResource(alb $$0) {
         auq $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<alb, auq> b() {
         return this.c;
      }
   }
}
