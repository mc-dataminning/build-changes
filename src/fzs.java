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

public class fzs implements AutoCloseable {
   private static final ajt f = new ajt("textures/misc/nausea.png");
   private static final ajt g = new ajt("shaders/post/blur.json");
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float a = 0.05F;
   private static final float j = 1000.0F;
   final fbp k;
   private final atc l;
   private final axr m = axr.a();
   private float n;
   public final fzv b;
   private final fdf o;
   private final gaf p;
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
   private final fzy A;
   private final gla B = new gla();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private crj G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gac K;
   @Nullable
   private gac L;
   static final ajt[] M = new ajt[]{
      new ajt("shaders/post/notch.json"),
      new ajt("shaders/post/fxaa.json"),
      new ajt("shaders/post/art.json"),
      new ajt("shaders/post/bumpy.json"),
      new ajt("shaders/post/blobs2.json"),
      new ajt("shaders/post/pencil.json"),
      new ajt("shaders/post/color_convolve.json"),
      new ajt("shaders/post/deconverge.json"),
      new ajt("shaders/post/flip.json"),
      new ajt("shaders/post/invert.json"),
      new ajt("shaders/post/ntsc.json"),
      new ajt("shaders/post/outline.json"),
      new ajt("shaders/post/phosphor.json"),
      new ajt("shaders/post/scan_pincushion.json"),
      new ajt("shaders/post/sobel.json"),
      new ajt("shaders/post/bits.json"),
      new ajt("shaders/post/desaturate.json"),
      new ajt("shaders/post/green.json"),
      g,
      new ajt("shaders/post/wobble.json"),
      new ajt("shaders/post/blobs.json"),
      new ajt("shaders/post/antialias.json"),
      new ajt("shaders/post/creeper.json"),
      new ajt("shaders/post/spider.json")
   };
   public static final int d = M.length;
   int N = d;
   private boolean O;
   private final fba P = new fba();
   public gan e;
   private final Map<String, gan> Q = Maps.newHashMap();
   @Nullable
   private static gan R;
   @Nullable
   private static gan S;
   @Nullable
   private static gan T;
   @Nullable
   private static gan U;
   @Nullable
   private static gan V;
   @Nullable
   private static gan W;
   @Nullable
   private static gan X;
   @Nullable
   private static gan Y;
   @Nullable
   private static gan Z;
   @Nullable
   private static gan aa;
   @Nullable
   private static gan ab;
   @Nullable
   private static gan ac;
   @Nullable
   private static gan ad;
   @Nullable
   private static gan ae;
   @Nullable
   private static gan af;
   @Nullable
   private static gan ag;
   @Nullable
   private static gan ah;
   @Nullable
   private static gan ai;
   @Nullable
   private static gan aj;
   @Nullable
   private static gan ak;
   @Nullable
   private static gan al;
   @Nullable
   private static gan am;
   @Nullable
   private static gan an;
   @Nullable
   private static gan ao;
   @Nullable
   private static gan ap;
   @Nullable
   private static gan aq;
   @Nullable
   private static gan ar;
   @Nullable
   private static gan as;
   @Nullable
   private static gan at;
   @Nullable
   private static gan au;
   @Nullable
   private static gan av;
   @Nullable
   private static gan aw;
   @Nullable
   private static gan ax;
   @Nullable
   private static gan ay;
   @Nullable
   private static gan az;
   @Nullable
   private static gan aA;
   @Nullable
   private static gan aB;
   @Nullable
   private static gan aC;
   @Nullable
   private static gan aD;
   @Nullable
   private static gan aE;
   @Nullable
   private static gan aF;
   @Nullable
   private static gan aG;
   @Nullable
   private static gan aH;
   @Nullable
   private static gan aI;
   @Nullable
   private static gan aJ;
   @Nullable
   private static gan aK;
   @Nullable
   private static gan aL;
   @Nullable
   private static gan aM;
   @Nullable
   private static gan aN;
   @Nullable
   private static gan aO;
   @Nullable
   private static gan aP;
   @Nullable
   private static gan aQ;
   @Nullable
   private static gan aR;
   @Nullable
   private static gan aS;
   @Nullable
   private static gan aT;
   @Nullable
   private static gan aU;
   @Nullable
   private static gan aV;
   @Nullable
   private static gan aW;

   public fzs(fbp $$0, fzv $$1, atc $$2, gaf $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new fdf($$0.aa());
      this.A = new fzy(this, $$0);
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

   public void a(@Nullable bpv $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cgl) {
         this.a(new ajt("shaders/post/creeper.json"));
      } else if ($$0 instanceof chk) {
         this.a(new ajt("shaders/post/spider.json"));
      } else if ($$0 instanceof cgp) {
         this.a(new ajt("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.k.ao() instanceof cjt) {
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

   void a(ajt $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gac(this.k.aa(), this.l, this.k.h(), $$0);
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
         this.L = new gac(this.k.aa(), this.l, this.k.h(), g);
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

   public asw f() {
      return new ath<fzs.a>() {
         protected fzs.a a(atc $$0, bko $$1) {
            Map<ajt, ata> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(evw.a.b.b()) || $$1x.endsWith(evw.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<ajt, ata> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new ata($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fzs.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fzs.a($$0, $$3);
         }

         protected void a(fzs.a $$0, atc $$1, bko $$2) {
            fzs.this.b($$0);
            if (fzs.this.K != null) {
               fzs.this.K.close();
            }

            fzs.this.K = null;
            if (fzs.this.N == fzs.d) {
               fzs.this.a(fzs.this.k.ao());
            } else {
               fzs.this.a(fzs.M[fzs.this.N]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(atf $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new gan($$0, "blit_screen", ewg.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aT = this.a($$0, "rendertype_gui", ewg.n);
         aU = this.a($$0, "rendertype_gui_overlay", ewg.n);
         R = this.a($$0, "position", ewg.m);
         S = this.a($$0, "position_color", ewg.n);
         T = this.a($$0, "position_color_tex", ewg.r);
         U = this.a($$0, "position_tex", ewg.q);
         V = this.a($$0, "position_tex_color", ewg.s);
         aG = this.a($$0, "rendertype_text", ewg.t);
      }
   }

   private gan a(atf $$0, String $$1, ewn $$2) {
      try {
         gan $$3 = new gan($$0, $$1, $$2);
         this.Q.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(atf $$0) {
      RenderSystem.assertOnRenderThread();
      List<evw> $$1 = Lists.newArrayList();
      $$1.addAll(evw.a.b.c().values());
      $$1.addAll(evw.a.a.c().values());
      $$1.forEach(evw::a);
      List<Pair<gan, Consumer<gan>>> $$2 = Lists.newArrayListWithCapacity(this.Q.size());

      try {
         $$2.add(Pair.of(new gan($$0, "particle", ewg.l), (Consumer<gan>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new gan($$0, "position", ewg.m), (Consumer<gan>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new gan($$0, "position_color", ewg.n), (Consumer<gan>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new gan($$0, "position_color_lightmap", ewg.p), (Consumer<gan>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new gan($$0, "position_color_tex", ewg.r), (Consumer<gan>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new gan($$0, "position_color_tex_lightmap", ewg.t), (Consumer<gan>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new gan($$0, "position_tex", ewg.q), (Consumer<gan>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new gan($$0, "position_tex_color", ewg.s), (Consumer<gan>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_solid", ewg.j), (Consumer<gan>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_cutout_mipped", ewg.j), (Consumer<gan>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_cutout", ewg.j), (Consumer<gan>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_translucent", ewg.j), (Consumer<gan>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_translucent_moving_block", ewg.j), (Consumer<gan>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_armor_cutout_no_cull", ewg.k), (Consumer<gan>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_solid", ewg.k), (Consumer<gan>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_cutout", ewg.k), (Consumer<gan>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_cutout_no_cull", ewg.k), (Consumer<gan>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_cutout_no_cull_z_offset", ewg.k), (Consumer<gan>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_item_entity_translucent_cull", ewg.k), (Consumer<gan>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_translucent_cull", ewg.k), (Consumer<gan>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_translucent", ewg.k), (Consumer<gan>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_translucent_emissive", ewg.k), (Consumer<gan>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_smooth_cutout", ewg.k), (Consumer<gan>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_beacon_beam", ewg.j), (Consumer<gan>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_decal", ewg.k), (Consumer<gan>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_no_outline", ewg.k), (Consumer<gan>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_shadow", ewg.k), (Consumer<gan>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_alpha", ewg.k), (Consumer<gan>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_eyes", ewg.k), (Consumer<gan>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_energy_swirl", ewg.k), (Consumer<gan>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_leash", ewg.p), (Consumer<gan>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_water_mask", ewg.m), (Consumer<gan>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_outline", ewg.r), (Consumer<gan>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_armor_glint", ewg.q), (Consumer<gan>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_armor_entity_glint", ewg.q), (Consumer<gan>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_glint_translucent", ewg.q), (Consumer<gan>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_glint", ewg.q), (Consumer<gan>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_glint_direct", ewg.q), (Consumer<gan>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_glint", ewg.q), (Consumer<gan>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_entity_glint_direct", ewg.q), (Consumer<gan>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_text", ewg.t), (Consumer<gan>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_text_background", ewg.p), (Consumer<gan>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_text_intensity", ewg.t), (Consumer<gan>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_text_see_through", ewg.t), (Consumer<gan>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_text_background_see_through", ewg.p), (Consumer<gan>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_text_intensity_see_through", ewg.t), (Consumer<gan>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_lightning", ewg.n), (Consumer<gan>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_tripwire", ewg.j), (Consumer<gan>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_end_portal", ewg.m), (Consumer<gan>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_end_gateway", ewg.m), (Consumer<gan>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_clouds", ewg.v), (Consumer<gan>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_lines", ewg.o), (Consumer<gan>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_crumbling", ewg.j), (Consumer<gan>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_gui", ewg.n), (Consumer<gan>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_gui_overlay", ewg.n), (Consumer<gan>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_gui_text_highlight", ewg.n), (Consumer<gan>)$$0x -> aV = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_gui_ghost_recipe_overlay", ewg.n), (Consumer<gan>)$$0x -> aW = $$0x));
         $$2.add(Pair.of(new gan($$0, "rendertype_breeze_wind", ewg.k), (Consumer<gan>)$$0x -> av = $$0x));
         this.e();
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((gan)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         gan $$1x = (gan)$$0x.getFirst();
         this.Q.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.Q.values().forEach(gan::close);
      this.Q.clear();
   }

   @Nullable
   public gan a(@Nullable String $$0) {
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
   public gac h() {
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
      bpv $$1 = this.k.ao();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aI().a("pick");
            double $$2 = this.k.s.gz();
            double $$3 = this.k.s.gA();
            ery $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof erx $$5 ? $$5.a() : null;
            this.k.aI().c();
         }
      }
   }

   private ery a(bpv $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = axk.k($$4);
      esa $$6 = $$0.j($$3);
      ery $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != ery.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      esa $$9 = $$0.f($$3);
      esa $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      erv $$12 = $$0.cH().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      erx $$13 = ckn.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bw(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static ery a(ery $$0, esa $$1, double $$2) {
      esa $$3 = $$0.e();
      if (!$$3.a((iv)$$1, $$2)) {
         esa $$4 = $$0.e();
         ih $$5 = ih.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return erw.a($$4, $$5, ib.a($$4));
      } else {
         return $$0;
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.k.ao() instanceof fyy $$1) {
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

   private double a(fba $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)axk.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bqo && ((bqo)$$0.g()).ey()) {
            float $$4 = Math.min((float)((bqo)$$0.g()).aP + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eku $$5 = $$0.k();
         if ($$5 == eku.a || $$5 == eku.b) {
            $$3 *= axk.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(ewi $$0, float $$1) {
      if (this.k.ao() instanceof bqo $$2) {
         float $$3 = (float)$$2.aN - $$1;
         if ($$2.ey()) {
            float $$4 = Math.min((float)$$2.aP + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aO;
         $$3 = axk.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eG();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(ewi $$0, float $$1) {
      if (this.k.ao() instanceof cjt) {
         cjt $$2 = (cjt)this.k.ao();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = axk.i($$1, $$2.cb, $$2.cc);
         $$0.a(axk.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(axk.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(axk.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(axk.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
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

   private void a(fba $$0, float $$1) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         ewi $$2 = new ewi();
         $$2.a();
         this.a($$2, $$1);
         if (this.k.m.ab().c()) {
            this.b($$2, $$1);
         }

         boolean $$3 = this.k.ao() instanceof bqo && ((bqo)this.k.ao()).fI();
         if (this.k.m.aA().a() && !$$3 && !this.k.m.Z && this.k.q.j() != cyu.d) {
            this.A.c();
            this.b.a($$1, $$2, this.p.c(), this.k.s, this.k.aq().a(this.k.s, $$1));
            this.A.b();
         }

         $$2.b();
         if (this.k.m.aA().a() && !$$3) {
            gaj.a(this.k, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, ewq.a);
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

   public static float a(bqo $$0, float $$1) {
      bph $$2 = $$0.c(bpj.p);
      return !$$2.a(200) ? 1.0F : 0.7F + axk.a(((float)$$2.c() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
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

         evm $$7 = this.k.aO();
         RenderSystem.clear(256, fbp.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, ewq.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         eve.d();
         fdc $$10 = new fdc(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aI().b("gui");
            if (this.k.s != null) {
               float $$11 = axk.i($$3, this.k.s.cD, this.k.s.cC);
               float $$12 = this.k.m.aj().c().floatValue();
               if ($$11 > 0.0F && this.k.s.b(bpj.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Z) {
               this.a(this.k.aO().o(), this.k.aO().p(), $$3);
            }

            this.k.l.a($$10, $$3);
            RenderSystem.clear(256, fbp.a);
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
            gpn $$1 = this.k.V();
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
         evj $$1 = fca.a(this.k.h());
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

            try (evj $$6 = new evj(64, 64, false)) {
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
         bpv $$0 = this.k.ao();
         boolean $$1 = $$0 instanceof cjt && !this.k.m.Z;
         if ($$1 && !((cjt)$$0).ga().e) {
            crj $$2 = ((bqo)$$0).eU();
            ery $$3 = this.k.v;
            if ($$3 != null && $$3.c() == ery.a.b) {
               ib $$4 = ((erw)$$3).a();
               doz $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == cyu.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dpd $$6 = new dpd(this.k.r, $$4, false);
                  iy<dby> $$7 = this.k.r.H_().d(ks.f);
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
      fba $$3 = this.P;
      bpv $$4 = (bpv)(this.k.ao() == null ? this.k.s : this.k.ao());
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), this.k.r.s().a($$4) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aD() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      ewi $$7 = new ewi();
      this.a($$7, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.k.m.aj().c().floatValue();
      float $$9 = axk.i($$0, this.k.s.cD, this.k.s.cC) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.b(bpj.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, axk.g / 2.0F, axk.g / 2.0F);
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
         RenderSystem.clear(256, fbp.a);
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

   public fdf k() {
      return this.o;
   }

   public void a(crj $$0) {
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
         ewi $$11 = new ewi();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * axk.e(axk.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * axk.e(axk.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * axk.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * axk.e(axk.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * axk.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * axk.b($$4 * 8.0F)));
         fzz.a $$13 = this.p.c();
         this.k.as().a(this.G, crg.i, 15728880, gla.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(fdc $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = axk.i($$1, 2.0F, 1.0F);
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

   public fbp l() {
      return this.k;
   }

   public float c(float $$0) {
      return axk.i($$0, this.u, this.t);
   }

   public float m() {
      return this.n;
   }

   public fba n() {
      return this.P;
   }

   public fzy o() {
      return this.A;
   }

   public gla p() {
      return this.B;
   }

   @Nullable
   public static gan q() {
      return R;
   }

   @Nullable
   public static gan r() {
      return S;
   }

   @Nullable
   public static gan s() {
      return T;
   }

   @Nullable
   public static gan t() {
      return U;
   }

   @Nullable
   public static gan u() {
      return V;
   }

   @Nullable
   public static gan v() {
      return W;
   }

   @Nullable
   public static gan w() {
      return X;
   }

   @Nullable
   public static gan x() {
      return Y;
   }

   @Nullable
   public static gan y() {
      return Z;
   }

   @Nullable
   public static gan z() {
      return aa;
   }

   @Nullable
   public static gan A() {
      return ab;
   }

   @Nullable
   public static gan B() {
      return ac;
   }

   @Nullable
   public static gan C() {
      return ad;
   }

   @Nullable
   public static gan D() {
      return ae;
   }

   @Nullable
   public static gan E() {
      return af;
   }

   @Nullable
   public static gan F() {
      return ag;
   }

   @Nullable
   public static gan G() {
      return ah;
   }

   @Nullable
   public static gan H() {
      return ai;
   }

   @Nullable
   public static gan I() {
      return aj;
   }

   @Nullable
   public static gan J() {
      return ak;
   }

   @Nullable
   public static gan K() {
      return al;
   }

   @Nullable
   public static gan L() {
      return am;
   }

   @Nullable
   public static gan M() {
      return an;
   }

   @Nullable
   public static gan N() {
      return ao;
   }

   @Nullable
   public static gan O() {
      return ap;
   }

   @Nullable
   public static gan P() {
      return aq;
   }

   @Nullable
   public static gan Q() {
      return ar;
   }

   @Nullable
   public static gan R() {
      return as;
   }

   @Nullable
   public static gan S() {
      return at;
   }

   @Nullable
   public static gan T() {
      return au;
   }

   @Nullable
   public static gan U() {
      return av;
   }

   @Nullable
   public static gan V() {
      return aw;
   }

   @Nullable
   public static gan W() {
      return ax;
   }

   @Nullable
   public static gan X() {
      return ay;
   }

   @Nullable
   public static gan Y() {
      return az;
   }

   @Nullable
   public static gan Z() {
      return aA;
   }

   @Nullable
   public static gan aa() {
      return aB;
   }

   @Nullable
   public static gan ab() {
      return aC;
   }

   @Nullable
   public static gan ac() {
      return aD;
   }

   @Nullable
   public static gan ad() {
      return aE;
   }

   @Nullable
   public static gan ae() {
      return aF;
   }

   @Nullable
   public static gan af() {
      return aG;
   }

   @Nullable
   public static gan ag() {
      return aH;
   }

   @Nullable
   public static gan ah() {
      return aI;
   }

   @Nullable
   public static gan ai() {
      return aJ;
   }

   @Nullable
   public static gan aj() {
      return aK;
   }

   @Nullable
   public static gan ak() {
      return aL;
   }

   @Nullable
   public static gan al() {
      return aM;
   }

   @Nullable
   public static gan am() {
      return aN;
   }

   @Nullable
   public static gan an() {
      return aO;
   }

   @Nullable
   public static gan ao() {
      return aP;
   }

   @Nullable
   public static gan ap() {
      return aQ;
   }

   @Nullable
   public static gan aq() {
      return aR;
   }

   @Nullable
   public static gan ar() {
      return aS;
   }

   @Nullable
   public static gan as() {
      return aT;
   }

   @Nullable
   public static gan at() {
      return aU;
   }

   @Nullable
   public static gan au() {
      return aV;
   }

   @Nullable
   public static gan av() {
      return aW;
   }

   public static record a(atf a, Map<ajt, ata> c) implements atf {
      @Override
      public Optional<ata> getResource(ajt $$0) {
         ata $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<ajt, ata> b() {
         return this.c;
      }
   }
}
