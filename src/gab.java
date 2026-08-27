import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.platform.GlStateManager;
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
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class gab implements AutoCloseable {
   private static final ajv f = new ajv("textures/misc/nausea.png");
   private static final ajv g = new ajv("shaders/post/blur.json");
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float a = 0.05F;
   private static final float j = 1000.0F;
   final fby k;
   private final ate l;
   private final axt m = axt.a();
   private float n;
   public final gae b;
   private final fdo o;
   private final gao p;
   private int q;
   private float r;
   private float s;
   private float t;
   private float u;
   private boolean v = true;
   private boolean w = true;
   private long x;
   private boolean y;
   private long z = ac.b();
   private final gah A;
   private final glj B = new glj();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private crs G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gal K;
   @Nullable
   private gal L;
   static final ajv[] M = new ajv[]{
      new ajv("shaders/post/notch.json"),
      new ajv("shaders/post/fxaa.json"),
      new ajv("shaders/post/art.json"),
      new ajv("shaders/post/bumpy.json"),
      new ajv("shaders/post/blobs2.json"),
      new ajv("shaders/post/pencil.json"),
      new ajv("shaders/post/color_convolve.json"),
      new ajv("shaders/post/deconverge.json"),
      new ajv("shaders/post/flip.json"),
      new ajv("shaders/post/invert.json"),
      new ajv("shaders/post/ntsc.json"),
      new ajv("shaders/post/outline.json"),
      new ajv("shaders/post/phosphor.json"),
      new ajv("shaders/post/scan_pincushion.json"),
      new ajv("shaders/post/sobel.json"),
      new ajv("shaders/post/bits.json"),
      new ajv("shaders/post/desaturate.json"),
      new ajv("shaders/post/green.json"),
      g,
      new ajv("shaders/post/wobble.json"),
      new ajv("shaders/post/blobs.json"),
      new ajv("shaders/post/antialias.json"),
      new ajv("shaders/post/creeper.json"),
      new ajv("shaders/post/spider.json")
   };
   public static final int d = M.length;
   int N = d;
   private boolean O;
   private final fbj P = new fbj();
   public gaw e;
   private final Map<String, gaw> Q = Maps.newHashMap();
   @Nullable
   private static gaw R;
   @Nullable
   private static gaw S;
   @Nullable
   private static gaw T;
   @Nullable
   private static gaw U;
   @Nullable
   private static gaw V;
   @Nullable
   private static gaw W;
   @Nullable
   private static gaw X;
   @Nullable
   private static gaw Y;
   @Nullable
   private static gaw Z;
   @Nullable
   private static gaw aa;
   @Nullable
   private static gaw ab;
   @Nullable
   private static gaw ac;
   @Nullable
   private static gaw ad;
   @Nullable
   private static gaw ae;
   @Nullable
   private static gaw af;
   @Nullable
   private static gaw ag;
   @Nullable
   private static gaw ah;
   @Nullable
   private static gaw ai;
   @Nullable
   private static gaw aj;
   @Nullable
   private static gaw ak;
   @Nullable
   private static gaw al;
   @Nullable
   private static gaw am;
   @Nullable
   private static gaw an;
   @Nullable
   private static gaw ao;
   @Nullable
   private static gaw ap;
   @Nullable
   private static gaw aq;
   @Nullable
   private static gaw ar;
   @Nullable
   private static gaw as;
   @Nullable
   private static gaw at;
   @Nullable
   private static gaw au;
   @Nullable
   private static gaw av;
   @Nullable
   private static gaw aw;
   @Nullable
   private static gaw ax;
   @Nullable
   private static gaw ay;
   @Nullable
   private static gaw az;
   @Nullable
   private static gaw aA;
   @Nullable
   private static gaw aB;
   @Nullable
   private static gaw aC;
   @Nullable
   private static gaw aD;
   @Nullable
   private static gaw aE;
   @Nullable
   private static gaw aF;
   @Nullable
   private static gaw aG;
   @Nullable
   private static gaw aH;
   @Nullable
   private static gaw aI;
   @Nullable
   private static gaw aJ;
   @Nullable
   private static gaw aK;
   @Nullable
   private static gaw aL;
   @Nullable
   private static gaw aM;
   @Nullable
   private static gaw aN;
   @Nullable
   private static gaw aO;
   @Nullable
   private static gaw aP;
   @Nullable
   private static gaw aQ;
   @Nullable
   private static gaw aR;
   @Nullable
   private static gaw aS;
   @Nullable
   private static gaw aT;
   @Nullable
   private static gaw aU;
   @Nullable
   private static gaw aV;
   @Nullable
   private static gaw aW;

   public gab(fby $$0, gae $$1, ate $$2, gao $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new fdo($$0.aa());
      this.A = new gah(this, $$0);
      this.p = $$3;
      this.K = null;
   }

   @Override
   public void close() {
      this.A.close();
      this.o.close();
      this.B.close();
      this.b();
      this.aw();
      if (this.e != null) {
         this.e.close();
      }
   }

   public void a(boolean $$0) {
      this.v = $$0;
   }

   public void b(boolean $$0) {
      this.w = $$0;
   }

   public void c(boolean $$0) {
      this.C = $$0;
   }

   public boolean a() {
      return this.C;
   }

   public void b() {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      this.N = d;
   }

   public void c() {
      this.O = !this.O;
   }

   public void a(@Nullable bqa $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cgs) {
         this.a(new ajv("shaders/post/creeper.json"));
      } else if ($$0 instanceof chr) {
         this.a(new ajv("shaders/post/spider.json"));
      } else if ($$0 instanceof cgw) {
         this.a(new ajv("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.k.ao() instanceof cka) {
         if (this.K != null) {
            this.K.close();
         }

         this.N = (this.N + 1) % (M.length + 1);
         if (this.N == d) {
            this.K = null;
         } else {
            this.a(M[this.N]);
         }
      }
   }

   void a(ajv $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gal(this.k.aa(), this.l, this.k.h(), $$0);
         this.K.a(this.k.aO().k(), this.k.aO().l());
         this.O = true;
      } catch (IOException var3) {
         h.warn("Failed to load shader: {}", $$0, var3);
         this.N = d;
         this.O = false;
      } catch (JsonSyntaxException var4) {
         h.warn("Failed to parse shader: {}", $$0, var4);
         this.N = d;
         this.O = false;
      }
   }

   public void e() {
      if (this.L != null) {
         this.L.close();
      }

      try {
         this.L = new gal(this.k.aa(), this.l, this.k.h(), g);
         this.L.a(this.k.aO().k(), this.k.aO().l());
      } catch (IOException var2) {
         h.warn("Failed to load shader: {}", g, var2);
      } catch (JsonSyntaxException var3) {
         h.warn("Failed to parse shader: {}", g, var3);
      }
   }

   public void a(float $$0) {
      if (this.L != null) {
         this.L.a("Alpha", (float)this.k.m.q());
         RenderSystem.enableBlend();
         this.L.a($$0);
         RenderSystem.disableBlend();
      }
   }

   public asy f() {
      return new atj<gab.a>() {
         protected gab.a a(ate $$0, bkt $$1) {
            Map<ajv, atc> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(ewf.a.b.b()) || $$1x.endsWith(ewf.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<ajv, atc> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new atc($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gab.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gab.a($$0, $$3);
         }

         protected void a(gab.a $$0, ate $$1, bkt $$2) {
            gab.this.b($$0);
            if (gab.this.K != null) {
               gab.this.K.close();
            }

            gab.this.K = null;
            if (gab.this.N == gab.d) {
               gab.this.a(gab.this.k.ao());
            } else {
               gab.this.a(gab.M[gab.this.N]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(ath $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new gaw($$0, "blit_screen", ewp.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aT = this.a($$0, "rendertype_gui", ewp.n);
         aU = this.a($$0, "rendertype_gui_overlay", ewp.n);
         R = this.a($$0, "position", ewp.m);
         S = this.a($$0, "position_color", ewp.n);
         T = this.a($$0, "position_color_tex", ewp.r);
         U = this.a($$0, "position_tex", ewp.q);
         V = this.a($$0, "position_tex_color", ewp.s);
         aG = this.a($$0, "rendertype_text", ewp.t);
      }
   }

   private gaw a(ath $$0, String $$1, eww $$2) {
      try {
         gaw $$3 = new gaw($$0, $$1, $$2);
         this.Q.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(ath $$0) {
      RenderSystem.assertOnRenderThread();
      List<ewf> $$1 = Lists.newArrayList();
      $$1.addAll(ewf.a.b.c().values());
      $$1.addAll(ewf.a.a.c().values());
      $$1.forEach(ewf::a);
      List<Pair<gaw, Consumer<gaw>>> $$2 = Lists.newArrayListWithCapacity(this.Q.size());

      try {
         $$2.add(Pair.of(new gaw($$0, "particle", ewp.l), (Consumer<gaw>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new gaw($$0, "position", ewp.m), (Consumer<gaw>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new gaw($$0, "position_color", ewp.n), (Consumer<gaw>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new gaw($$0, "position_color_lightmap", ewp.p), (Consumer<gaw>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new gaw($$0, "position_color_tex", ewp.r), (Consumer<gaw>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new gaw($$0, "position_color_tex_lightmap", ewp.t), (Consumer<gaw>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new gaw($$0, "position_tex", ewp.q), (Consumer<gaw>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new gaw($$0, "position_tex_color", ewp.s), (Consumer<gaw>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_solid", ewp.j), (Consumer<gaw>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_cutout_mipped", ewp.j), (Consumer<gaw>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_cutout", ewp.j), (Consumer<gaw>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_translucent", ewp.j), (Consumer<gaw>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_translucent_moving_block", ewp.j), (Consumer<gaw>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_armor_cutout_no_cull", ewp.k), (Consumer<gaw>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_solid", ewp.k), (Consumer<gaw>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_cutout", ewp.k), (Consumer<gaw>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_cutout_no_cull", ewp.k), (Consumer<gaw>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_cutout_no_cull_z_offset", ewp.k), (Consumer<gaw>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_item_entity_translucent_cull", ewp.k), (Consumer<gaw>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_translucent_cull", ewp.k), (Consumer<gaw>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_translucent", ewp.k), (Consumer<gaw>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_translucent_emissive", ewp.k), (Consumer<gaw>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_smooth_cutout", ewp.k), (Consumer<gaw>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_beacon_beam", ewp.j), (Consumer<gaw>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_decal", ewp.k), (Consumer<gaw>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_no_outline", ewp.k), (Consumer<gaw>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_shadow", ewp.k), (Consumer<gaw>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_alpha", ewp.k), (Consumer<gaw>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_eyes", ewp.k), (Consumer<gaw>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_energy_swirl", ewp.k), (Consumer<gaw>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_leash", ewp.p), (Consumer<gaw>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_water_mask", ewp.m), (Consumer<gaw>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_outline", ewp.r), (Consumer<gaw>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_armor_glint", ewp.q), (Consumer<gaw>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_armor_entity_glint", ewp.q), (Consumer<gaw>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_glint_translucent", ewp.q), (Consumer<gaw>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_glint", ewp.q), (Consumer<gaw>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_glint_direct", ewp.q), (Consumer<gaw>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_glint", ewp.q), (Consumer<gaw>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_entity_glint_direct", ewp.q), (Consumer<gaw>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_text", ewp.t), (Consumer<gaw>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_text_background", ewp.p), (Consumer<gaw>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_text_intensity", ewp.t), (Consumer<gaw>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_text_see_through", ewp.t), (Consumer<gaw>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_text_background_see_through", ewp.p), (Consumer<gaw>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_text_intensity_see_through", ewp.t), (Consumer<gaw>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_lightning", ewp.n), (Consumer<gaw>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_tripwire", ewp.j), (Consumer<gaw>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_end_portal", ewp.m), (Consumer<gaw>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_end_gateway", ewp.m), (Consumer<gaw>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_clouds", ewp.v), (Consumer<gaw>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_lines", ewp.o), (Consumer<gaw>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_crumbling", ewp.j), (Consumer<gaw>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_gui", ewp.n), (Consumer<gaw>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_gui_overlay", ewp.n), (Consumer<gaw>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_gui_text_highlight", ewp.n), (Consumer<gaw>)$$0x -> aV = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_gui_ghost_recipe_overlay", ewp.n), (Consumer<gaw>)$$0x -> aW = $$0x));
         $$2.add(Pair.of(new gaw($$0, "rendertype_breeze_wind", ewp.k), (Consumer<gaw>)$$0x -> av = $$0x));
         this.e();
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((gaw)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         gaw $$1x = (gaw)$$0x.getFirst();
         this.Q.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.Q.values().forEach(gaw::close);
      this.Q.clear();
   }

   @Nullable
   public gaw a(@Nullable String $$0) {
      return $$0 == null ? null : this.Q.get($$0);
   }

   public void g() {
      this.ax();
      this.A.a();
      if (this.k.ao() == null) {
         this.k.a(this.k.s);
      }

      this.P.a();
      this.b.a();
      this.q++;
      if (this.k.r.s().i()) {
         this.k.f.a(this.P);
         this.u = this.t;
         if (this.k.l.j().c()) {
            this.t += 0.05F;
            if (this.t > 1.0F) {
               this.t = 1.0F;
            }
         } else if (this.t > 0.0F) {
            this.t -= 0.0125F;
         }

         if (this.H > 0) {
            this.H--;
            if (this.H == 0) {
               this.G = null;
            }
         }
      }
   }

   @Nullable
   public gal h() {
      return this.K;
   }

   public void a(int $$0, int $$1) {
      if (this.K != null) {
         this.K.a($$0, $$1);
      }

      if (this.L != null) {
         this.L.a($$0, $$1);
      }

      this.k.f.a($$0, $$1);
   }

   public void b(float $$0) {
      bqa $$1 = this.k.ao();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aI().a("pick");
            double $$2 = this.k.s.gz();
            double $$3 = this.k.s.gA();
            esh $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof esg $$5 ? $$5.a() : null;
            this.k.aI().c();
         }
      }
   }

   private esh a(bqa $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = axm.k($$4);
      esj $$6 = $$0.j($$3);
      esh $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != esh.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      esj $$9 = $$0.f($$3);
      esj $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      ese $$12 = $$0.cH().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      esg $$13 = cku.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bw(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static esh a(esh $$0, esj $$1, double $$2) {
      esj $$3 = $$0.e();
      if (!$$3.a((ix)$$1, $$2)) {
         esj $$4 = $$0.e();
         ij $$5 = ij.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return esf.a($$4, $$5, id.a($$4));
      } else {
         return $$0;
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.k.ao() instanceof fzh $$1) {
         $$0 = $$1.c();
      }

      this.s = this.r;
      this.r = this.r + ($$0 - this.r) * 0.5F;
      if (this.r > 1.5F) {
         this.r = 1.5F;
      }

      if (this.r < 0.1F) {
         this.r = 0.1F;
      }
   }

   private double a(fbj $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)axm.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bqt && ((bqt)$$0.g()).ey()) {
            float $$4 = Math.min((float)((bqt)$$0.g()).aP + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eld $$5 = $$0.k();
         if ($$5 == eld.a || $$5 == eld.b) {
            $$3 *= axm.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(ewr $$0, float $$1) {
      if (this.k.ao() instanceof bqt $$2) {
         float $$3 = (float)$$2.aN - $$1;
         if ($$2.ey()) {
            float $$4 = Math.min((float)$$2.aP + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aO;
         $$3 = axm.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eG();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(ewr $$0, float $$1) {
      if (this.k.ao() instanceof cka) {
         cka $$2 = (cka)this.k.ao();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = axm.i($$1, $$2.cd, $$2.ce);
         $$0.a(axm.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(axm.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(axm.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(axm.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.D = $$0;
      this.E = $$1;
      this.F = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L);
      this.D = 1.0F;
   }

   private void a(fbj $$0, float $$1) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         ewr $$2 = new ewr();
         $$2.a();
         this.a($$2, $$1);
         if (this.k.m.ab().c()) {
            this.b($$2, $$1);
         }

         boolean $$3 = this.k.ao() instanceof bqt && ((bqt)this.k.ao()).fI();
         if (this.k.m.aA().a() && !$$3 && !this.k.m.Z && this.k.q.j() != czd.d) {
            this.A.c();
            this.b.a($$1, $$2, this.p.c(), this.k.s, this.k.aq().a(this.k.s, $$1));
            this.A.b();
         }

         $$2.b();
         if (this.k.m.aA().a() && !$$3) {
            gas.a(this.k, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, ewz.a);
   }

   public Matrix4f a(double $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.D != 1.0F) {
         $$1.translate(this.E, -this.F, 0.0F);
         $$1.scale(this.D, this.D, 1.0F);
      }

      return $$1.perspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.k.aO().k() / (float)this.k.aO().l(), 0.05F, this.i());
   }

   public float i() {
      return this.n * 4.0F;
   }

   public static float a(bqt $$0, float $$1) {
      bpm $$2 = $$0.c(bpo.p);
      return !$$2.a(200) ? 1.0F : 0.7F + axm.a(((float)$$2.c() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.k.aC() && this.k.m.n && (!this.k.m.Z().c() || !this.k.n.d())) {
         if (ac.b() - this.z > 500L) {
            this.k.b(false);
         }
      } else {
         this.z = ac.b();
      }

      if (!this.k.x) {
         float $$3 = this.k.r != null && this.k.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.k.c();
         int $$5 = (int)(this.k.n.e() * (double)this.k.aO().o() / (double)this.k.aO().m());
         int $$6 = (int)(this.k.n.f() * (double)this.k.aO().p() / (double)this.k.aO().n());
         RenderSystem.viewport(0, 0, this.k.aO().k(), this.k.aO().l());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aI().a("level");
            this.a($$0, $$1);
            this.ay();
            this.k.f.b();
            if (this.K != null && this.O) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$3);
            }

            this.k.h().a(true);
         }

         evv $$7 = this.k.aO();
         RenderSystem.clear(256, fby.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, ewz.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         evn.d();
         fdl $$10 = new fdl(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aI().b("gui");
            if (this.k.s != null) {
               float $$11 = axm.i($$3, this.k.s.cF, this.k.s.cE);
               float $$12 = this.k.m.aj().c().floatValue();
               if ($$11 > 0.0F && this.k.s.b(bpo.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z) {
               this.a(this.k.aO().o(), this.k.aO().p(), $$3);
            }

            this.k.l.a($$10, $$3);
            RenderSystem.clear(256, fby.a);
            this.k.aI().c();
         }

         if (this.k.aL() != null) {
            try {
               this.k.aL().a($$10, $$5, $$6, this.k.av());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.k.aL().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.k.y != null) {
            try {
               this.k.y.c($$10, $$5, $$6, this.k.av());
            } catch (Throwable var17) {
               o $$17 = o.a(var17, "Rendering screen");
               p $$18 = $$17.a("Screen render details");
               $$18.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               $$18.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$5, $$6, this.k.n.e(), this.k.n.f()));
               $$18.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.k.aO().o(),
                        this.k.aO().p(),
                        this.k.aO().k(),
                        this.k.aO().l(),
                        this.k.aO().s()
                     )
               );
               throw new y($$17);
            }

            try {
               if (this.k.y != null) {
                  this.k.y.y();
               }
            } catch (Throwable var16) {
               o $$20 = o.a(var16, "Narrating screen");
               p $$21 = $$20.a("Screen details");
               $$21.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               throw new y($$20);
            }
         }

         if ($$4) {
            this.k.aI().a("toasts");
            this.k.aA().a($$10);
            this.k.aI().c();
         }

         $$10.e();
         $$9.popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ay() {
      if (!this.y && this.k.T()) {
         long $$0 = ac.b();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gpw $$1 = this.k.V();
            if ($$1 != null && !$$1.ag()) {
               $$1.B().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.y = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.k.f.k() > 10 && this.k.f.q()) {
         evs $$1 = fcj.a(this.k.h());
         ac.g().execute(() -> {
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

            try (evs $$6 = new evs(64, 64, false)) {
               $$1.a($$4, $$5, $$2, $$3, $$6);
               $$6.a($$0);
            } catch (IOException var16) {
               h.warn("Couldn't save auto screenshot", var16);
            } finally {
               $$1.close();
            }
         });
      }
   }

   private boolean az() {
      if (!this.w) {
         return false;
      } else {
         bqa $$0 = this.k.ao();
         boolean $$1 = $$0 instanceof cka && !this.k.m.Z;
         if ($$1 && !((cka)$$0).ga().e) {
            crs $$2 = ((bqt)$$0).eU();
            esh $$3 = this.k.v;
            if ($$3 != null && $$3.c() == esh.a.b) {
               id $$4 = ((esf)$$3).a();
               dpi $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == czd.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dpm $$6 = new dpm(this.k.r, $$4, false);
                  ja<dch> $$7 = this.k.r.H_().d(ku.f);
                  $$1 = !$$2.d() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1) {
      this.A.a($$0);
      if (this.k.ao() == null) {
         this.k.a(this.k.s);
      }

      this.b($$0);
      this.k.aI().a("center");
      boolean $$2 = this.az();
      this.k.aI().b("camera");
      fbj $$3 = this.P;
      bqa $$4 = (bqa)(this.k.ao() == null ? this.k.s : this.k.ao());
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), this.k.r.s().a($$4) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aD() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      ewr $$7 = new ewr();
      this.a($$7, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.k.m.aj().c().floatValue();
      float $$9 = axm.i($$0, this.k.s.cF, this.k.s.cE) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.b(bpo.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, axm.g / 2.0F, axm.g / 2.0F);
         float $$13 = ((float)this.q + $$0) * (float)$$10 * (float) (Math.PI / 180.0);
         $$6.rotate($$13, $$12);
         $$6.scale(1.0F / $$11, 1.0F, 1.0F);
         $$6.rotate(-$$13, $$12);
      }

      this.a($$6);
      Matrix4f $$14 = new Matrix4f().rotationXYZ($$3.d() * (float) (Math.PI / 180.0), $$3.e() * (float) (Math.PI / 180.0) + (float) Math.PI, 0.0F);
      this.k.f.a($$3.b(), $$14, this.a(Math.max($$5, (double)this.k.m.ah().c().intValue())));
      this.k.f.a($$0, $$1, $$2, $$3, this, this.A, $$14, $$6);
      this.k.aI().b("hand");
      if (this.v) {
         RenderSystem.clear(256, fby.a);
         this.a($$3, $$0);
      }

      this.k.aI().c();
   }

   public void j() {
      this.G = null;
      this.o.a();
      this.P.o();
      this.y = false;
   }

   public fdo k() {
      return this.o;
   }

   public void a(crs $$0) {
      this.G = $$0;
      this.H = 40;
      this.I = this.m.i() * 2.0F - 1.0F;
      this.J = this.m.i() * 2.0F - 1.0F;
   }

   private void a(int $$0, int $$1, float $$2) {
      if (this.G != null && this.H > 0) {
         int $$3 = 40 - this.H;
         float $$4 = ((float)$$3 + $$2) / 40.0F;
         float $$5 = $$4 * $$4;
         float $$6 = $$4 * $$5;
         float $$7 = 10.25F * $$6 * $$5 - 24.95F * $$5 * $$5 + 25.5F * $$6 - 13.8F * $$5 + 4.0F * $$4;
         float $$8 = $$7 * (float) Math.PI;
         float $$9 = this.I * (float)($$0 / 4);
         float $$10 = this.J * (float)($$1 / 4);
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         ewr $$11 = new ewr();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * axm.e(axm.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * axm.e(axm.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * axm.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * axm.e(axm.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * axm.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * axm.b($$4 * 8.0F)));
         gai.a $$13 = this.p.c();
         this.k.as().a(this.G, crp.i, 15728880, glj.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(fdl $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = axm.i($$1, 2.0F, 1.0F);
      $$0.c().a((float)$$2 / 2.0F, (float)$$3 / 2.0F, 0.0F);
      $$0.c().b($$4, $$4, $$4);
      $$0.c().a((float)(-$$2) / 2.0F, (float)(-$$3) / 2.0F, 0.0F);
      float $$5 = 0.2F * $$1;
      float $$6 = 0.4F * $$1;
      float $$7 = 0.2F * $$1;
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(
         GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE
      );
      $$0.a($$5, $$6, $$7, 1.0F);
      $$0.a(f, 0, 0, -90, 0.0F, 0.0F, $$2, $$3, $$2, $$3);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.c().b();
   }

   public fby l() {
      return this.k;
   }

   public float c(float $$0) {
      return axm.i($$0, this.u, this.t);
   }

   public float m() {
      return this.n;
   }

   public fbj n() {
      return this.P;
   }

   public gah o() {
      return this.A;
   }

   public glj p() {
      return this.B;
   }

   @Nullable
   public static gaw q() {
      return R;
   }

   @Nullable
   public static gaw r() {
      return S;
   }

   @Nullable
   public static gaw s() {
      return T;
   }

   @Nullable
   public static gaw t() {
      return U;
   }

   @Nullable
   public static gaw u() {
      return V;
   }

   @Nullable
   public static gaw v() {
      return W;
   }

   @Nullable
   public static gaw w() {
      return X;
   }

   @Nullable
   public static gaw x() {
      return Y;
   }

   @Nullable
   public static gaw y() {
      return Z;
   }

   @Nullable
   public static gaw z() {
      return aa;
   }

   @Nullable
   public static gaw A() {
      return ab;
   }

   @Nullable
   public static gaw B() {
      return ac;
   }

   @Nullable
   public static gaw C() {
      return ad;
   }

   @Nullable
   public static gaw D() {
      return ae;
   }

   @Nullable
   public static gaw E() {
      return af;
   }

   @Nullable
   public static gaw F() {
      return ag;
   }

   @Nullable
   public static gaw G() {
      return ah;
   }

   @Nullable
   public static gaw H() {
      return ai;
   }

   @Nullable
   public static gaw I() {
      return aj;
   }

   @Nullable
   public static gaw J() {
      return ak;
   }

   @Nullable
   public static gaw K() {
      return al;
   }

   @Nullable
   public static gaw L() {
      return am;
   }

   @Nullable
   public static gaw M() {
      return an;
   }

   @Nullable
   public static gaw N() {
      return ao;
   }

   @Nullable
   public static gaw O() {
      return ap;
   }

   @Nullable
   public static gaw P() {
      return aq;
   }

   @Nullable
   public static gaw Q() {
      return ar;
   }

   @Nullable
   public static gaw R() {
      return as;
   }

   @Nullable
   public static gaw S() {
      return at;
   }

   @Nullable
   public static gaw T() {
      return au;
   }

   @Nullable
   public static gaw U() {
      return av;
   }

   @Nullable
   public static gaw V() {
      return aw;
   }

   @Nullable
   public static gaw W() {
      return ax;
   }

   @Nullable
   public static gaw X() {
      return ay;
   }

   @Nullable
   public static gaw Y() {
      return az;
   }

   @Nullable
   public static gaw Z() {
      return aA;
   }

   @Nullable
   public static gaw aa() {
      return aB;
   }

   @Nullable
   public static gaw ab() {
      return aC;
   }

   @Nullable
   public static gaw ac() {
      return aD;
   }

   @Nullable
   public static gaw ad() {
      return aE;
   }

   @Nullable
   public static gaw ae() {
      return aF;
   }

   @Nullable
   public static gaw af() {
      return aG;
   }

   @Nullable
   public static gaw ag() {
      return aH;
   }

   @Nullable
   public static gaw ah() {
      return aI;
   }

   @Nullable
   public static gaw ai() {
      return aJ;
   }

   @Nullable
   public static gaw aj() {
      return aK;
   }

   @Nullable
   public static gaw ak() {
      return aL;
   }

   @Nullable
   public static gaw al() {
      return aM;
   }

   @Nullable
   public static gaw am() {
      return aN;
   }

   @Nullable
   public static gaw an() {
      return aO;
   }

   @Nullable
   public static gaw ao() {
      return aP;
   }

   @Nullable
   public static gaw ap() {
      return aQ;
   }

   @Nullable
   public static gaw aq() {
      return aR;
   }

   @Nullable
   public static gaw ar() {
      return aS;
   }

   @Nullable
   public static gaw as() {
      return aT;
   }

   @Nullable
   public static gaw at() {
      return aU;
   }

   @Nullable
   public static gaw au() {
      return aV;
   }

   @Nullable
   public static gaw av() {
      return aW;
   }

   public static record a(ath a, Map<ajv, atc> c) implements ath {
      @Override
      public Optional<atc> getResource(ajv $$0) {
         atc $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<ajv, atc> b() {
         return this.c;
      }
   }
}
