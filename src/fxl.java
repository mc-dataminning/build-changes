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

public class fxl implements AutoCloseable {
   private static final ajh f = new ajh("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final ezi j;
   private final aso k;
   private final axd l = axd.a();
   private float m;
   public final fxo b;
   private final fay n;
   private final fxy o;
   private int p;
   private float q;
   private float r;
   private float s;
   private float t;
   private boolean u = true;
   private boolean v = true;
   private long w;
   private boolean x;
   private long y = ac.b();
   private final fxr z;
   private final git A = new git();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private cqm F;
   private int G;
   private float H;
   private float I;
   @Nullable
   fxv J;
   static final ajh[] K = new ajh[]{
      new ajh("shaders/post/notch.json"),
      new ajh("shaders/post/fxaa.json"),
      new ajh("shaders/post/art.json"),
      new ajh("shaders/post/bumpy.json"),
      new ajh("shaders/post/blobs2.json"),
      new ajh("shaders/post/pencil.json"),
      new ajh("shaders/post/color_convolve.json"),
      new ajh("shaders/post/deconverge.json"),
      new ajh("shaders/post/flip.json"),
      new ajh("shaders/post/invert.json"),
      new ajh("shaders/post/ntsc.json"),
      new ajh("shaders/post/outline.json"),
      new ajh("shaders/post/phosphor.json"),
      new ajh("shaders/post/scan_pincushion.json"),
      new ajh("shaders/post/sobel.json"),
      new ajh("shaders/post/bits.json"),
      new ajh("shaders/post/desaturate.json"),
      new ajh("shaders/post/green.json"),
      new ajh("shaders/post/blur.json"),
      new ajh("shaders/post/wobble.json"),
      new ajh("shaders/post/blobs.json"),
      new ajh("shaders/post/antialias.json"),
      new ajh("shaders/post/creeper.json"),
      new ajh("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final eyt N = new eyt();
   public fyg e;
   private final Map<String, fyg> O = Maps.newHashMap();
   @Nullable
   private static fyg P;
   @Nullable
   private static fyg Q;
   @Nullable
   private static fyg R;
   @Nullable
   private static fyg S;
   @Nullable
   private static fyg T;
   @Nullable
   private static fyg U;
   @Nullable
   private static fyg V;
   @Nullable
   private static fyg W;
   @Nullable
   private static fyg X;
   @Nullable
   private static fyg Y;
   @Nullable
   private static fyg Z;
   @Nullable
   private static fyg aa;
   @Nullable
   private static fyg ab;
   @Nullable
   private static fyg ac;
   @Nullable
   private static fyg ad;
   @Nullable
   private static fyg ae;
   @Nullable
   private static fyg af;
   @Nullable
   private static fyg ag;
   @Nullable
   private static fyg ah;
   @Nullable
   private static fyg ai;
   @Nullable
   private static fyg aj;
   @Nullable
   private static fyg ak;
   @Nullable
   private static fyg al;
   @Nullable
   private static fyg am;
   @Nullable
   private static fyg an;
   @Nullable
   private static fyg ao;
   @Nullable
   private static fyg ap;
   @Nullable
   private static fyg aq;
   @Nullable
   private static fyg ar;
   @Nullable
   private static fyg as;
   @Nullable
   private static fyg at;
   @Nullable
   private static fyg au;
   @Nullable
   private static fyg av;
   @Nullable
   private static fyg aw;
   @Nullable
   private static fyg ax;
   @Nullable
   private static fyg ay;
   @Nullable
   private static fyg az;
   @Nullable
   private static fyg aA;
   @Nullable
   private static fyg aB;
   @Nullable
   private static fyg aC;
   @Nullable
   private static fyg aD;
   @Nullable
   private static fyg aE;
   @Nullable
   private static fyg aF;
   @Nullable
   private static fyg aG;
   @Nullable
   private static fyg aH;
   @Nullable
   private static fyg aI;
   @Nullable
   private static fyg aJ;
   @Nullable
   private static fyg aK;
   @Nullable
   private static fyg aL;
   @Nullable
   private static fyg aM;
   @Nullable
   private static fyg aN;
   @Nullable
   private static fyg aO;
   @Nullable
   private static fyg aP;
   @Nullable
   private static fyg aQ;
   @Nullable
   private static fyg aR;
   @Nullable
   private static fyg aS;
   @Nullable
   private static fyg aT;
   @Nullable
   private static fyg aU;

   public fxl(ezi $$0, fxo $$1, aso $$2, fxy $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new fay($$0.aa());
      this.z = new fxr(this, $$0);
      this.o = $$3;
      this.J = null;
   }

   @Override
   public void close() {
      this.z.close();
      this.n.close();
      this.A.close();
      this.b();
      this.av();
      if (this.e != null) {
         this.e.close();
      }
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public void b(boolean $$0) {
      this.v = $$0;
   }

   public void c(boolean $$0) {
      this.B = $$0;
   }

   public boolean a() {
      return this.B;
   }

   public void b() {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      this.L = d;
   }

   public void c() {
      this.M = !this.M;
   }

   public void a(@Nullable box $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof cfm) {
         this.a(new ajh("shaders/post/creeper.json"));
      } else if ($$0 instanceof cgl) {
         this.a(new ajh("shaders/post/spider.json"));
      } else if ($$0 instanceof cfq) {
         this.a(new ajh("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.ao() instanceof ciu) {
         if (this.J != null) {
            this.J.close();
         }

         this.L = (this.L + 1) % (K.length + 1);
         if (this.L == d) {
            this.J = null;
         } else {
            this.a(K[this.L]);
         }
      }
   }

   void a(ajh $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new fxv(this.j.aa(), this.k, this.j.h(), $$0);
         this.J.a(this.j.aO().k(), this.j.aO().l());
         this.M = true;
      } catch (IOException var3) {
         g.warn("Failed to load shader: {}", $$0, var3);
         this.L = d;
         this.M = false;
      } catch (JsonSyntaxException var4) {
         g.warn("Failed to parse shader: {}", $$0, var4);
         this.L = d;
         this.M = false;
      }
   }

   public asi e() {
      return new ast<fxl.a>() {
         protected fxl.a a(aso $$0, bjr $$1) {
            Map<ajh, asm> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(etp.a.b.b()) || $$1x.endsWith(etp.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<ajh, asm> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new asm($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fxl.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fxl.a($$0, $$3);
         }

         protected void a(fxl.a $$0, aso $$1, bjr $$2) {
            fxl.this.b($$0);
            if (fxl.this.J != null) {
               fxl.this.J.close();
            }

            fxl.this.J = null;
            if (fxl.this.L == fxl.d) {
               fxl.this.a(fxl.this.j.ao());
            } else {
               fxl.this.a(fxl.K[fxl.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(asr $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fyg($$0, "blit_screen", etz.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", etz.n);
         aS = this.a($$0, "rendertype_gui_overlay", etz.n);
         P = this.a($$0, "position", etz.m);
         Q = this.a($$0, "position_color", etz.n);
         R = this.a($$0, "position_color_tex", etz.r);
         S = this.a($$0, "position_tex", etz.q);
         T = this.a($$0, "position_tex_color", etz.s);
         aE = this.a($$0, "rendertype_text", etz.t);
      }
   }

   private fyg a(asr $$0, String $$1, eug $$2) {
      try {
         fyg $$3 = new fyg($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(asr $$0) {
      RenderSystem.assertOnRenderThread();
      List<etp> $$1 = Lists.newArrayList();
      $$1.addAll(etp.a.b.c().values());
      $$1.addAll(etp.a.a.c().values());
      $$1.forEach(etp::a);
      List<Pair<fyg, Consumer<fyg>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fyg($$0, "particle", etz.l), (Consumer<fyg>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fyg($$0, "position", etz.m), (Consumer<fyg>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fyg($$0, "position_color", etz.n), (Consumer<fyg>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fyg($$0, "position_color_lightmap", etz.p), (Consumer<fyg>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fyg($$0, "position_color_tex", etz.r), (Consumer<fyg>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fyg($$0, "position_color_tex_lightmap", etz.t), (Consumer<fyg>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fyg($$0, "position_tex", etz.q), (Consumer<fyg>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fyg($$0, "position_tex_color", etz.s), (Consumer<fyg>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_solid", etz.j), (Consumer<fyg>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_cutout_mipped", etz.j), (Consumer<fyg>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_cutout", etz.j), (Consumer<fyg>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_translucent", etz.j), (Consumer<fyg>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_translucent_moving_block", etz.j), (Consumer<fyg>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_armor_cutout_no_cull", etz.k), (Consumer<fyg>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_solid", etz.k), (Consumer<fyg>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_cutout", etz.k), (Consumer<fyg>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_cutout_no_cull", etz.k), (Consumer<fyg>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_cutout_no_cull_z_offset", etz.k), (Consumer<fyg>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_item_entity_translucent_cull", etz.k), (Consumer<fyg>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_translucent_cull", etz.k), (Consumer<fyg>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_translucent", etz.k), (Consumer<fyg>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_translucent_emissive", etz.k), (Consumer<fyg>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_smooth_cutout", etz.k), (Consumer<fyg>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_beacon_beam", etz.j), (Consumer<fyg>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_decal", etz.k), (Consumer<fyg>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_no_outline", etz.k), (Consumer<fyg>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_shadow", etz.k), (Consumer<fyg>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_alpha", etz.k), (Consumer<fyg>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_eyes", etz.k), (Consumer<fyg>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_energy_swirl", etz.k), (Consumer<fyg>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_leash", etz.p), (Consumer<fyg>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_water_mask", etz.m), (Consumer<fyg>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_outline", etz.r), (Consumer<fyg>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_armor_glint", etz.q), (Consumer<fyg>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_armor_entity_glint", etz.q), (Consumer<fyg>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_glint_translucent", etz.q), (Consumer<fyg>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_glint", etz.q), (Consumer<fyg>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_glint_direct", etz.q), (Consumer<fyg>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_glint", etz.q), (Consumer<fyg>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_entity_glint_direct", etz.q), (Consumer<fyg>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_text", etz.t), (Consumer<fyg>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_text_background", etz.p), (Consumer<fyg>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_text_intensity", etz.t), (Consumer<fyg>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_text_see_through", etz.t), (Consumer<fyg>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_text_background_see_through", etz.p), (Consumer<fyg>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_text_intensity_see_through", etz.t), (Consumer<fyg>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_lightning", etz.n), (Consumer<fyg>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_tripwire", etz.j), (Consumer<fyg>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_end_portal", etz.m), (Consumer<fyg>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_end_gateway", etz.m), (Consumer<fyg>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_clouds", etz.v), (Consumer<fyg>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_lines", etz.o), (Consumer<fyg>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_crumbling", etz.j), (Consumer<fyg>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_gui", etz.n), (Consumer<fyg>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_gui_overlay", etz.n), (Consumer<fyg>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_gui_text_highlight", etz.n), (Consumer<fyg>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_gui_ghost_recipe_overlay", etz.n), (Consumer<fyg>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fyg($$0, "rendertype_breeze_wind", etz.k), (Consumer<fyg>)$$0x -> at = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fyg)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.av();
      $$2.forEach($$0x -> {
         fyg $$1x = (fyg)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void av() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fyg::close);
      this.O.clear();
   }

   @Nullable
   public fyg a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.aw();
      this.z.a();
      if (this.j.ao() == null) {
         this.j.a(this.j.s);
      }

      this.N.a();
      this.b.a();
      this.p++;
      if (this.j.r.s().i()) {
         this.j.f.a(this.N);
         this.t = this.s;
         if (this.j.l.j().c()) {
            this.s += 0.05F;
            if (this.s > 1.0F) {
               this.s = 1.0F;
            }
         } else if (this.s > 0.0F) {
            this.s -= 0.0125F;
         }

         if (this.G > 0) {
            this.G--;
            if (this.G == 0) {
               this.F = null;
            }
         }
      }
   }

   @Nullable
   public fxv g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      box $$1 = this.j.ao();
      if ($$1 != null) {
         if (this.j.r != null && this.j.s != null) {
            this.j.aI().a("pick");
            double $$2 = this.j.s.gz();
            double $$3 = this.j.s.gA();
            epr $$4 = this.a($$1, $$2, $$3, $$0);
            this.j.v = $$4;
            this.j.u = $$4 instanceof epq $$5 ? $$5.a() : null;
            this.j.aI().c();
         }
      }
   }

   private epr a(box $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = aww.k($$4);
      ept $$6 = $$0.j($$3);
      epr $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != epr.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      ept $$9 = $$0.f($$3);
      ept $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      epo $$12 = $$0.cH().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      epq $$13 = cjo.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bw(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static epr a(epr $$0, ept $$1, double $$2) {
      ept $$3 = $$0.e();
      if (!$$3.a((iv)$$1, $$2)) {
         ept $$4 = $$0.e();
         ih $$5 = ih.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return epp.a($$4, $$5, ib.a($$4));
      } else {
         return $$0;
      }
   }

   private void aw() {
      float $$0 = 1.0F;
      if (this.j.ao() instanceof fwr $$1) {
         $$0 = $$1.c();
      }

      this.r = this.q;
      this.q = this.q + ($$0 - this.q) * 0.5F;
      if (this.q > 1.5F) {
         this.q = 1.5F;
      }

      if (this.q < 0.1F) {
         this.q = 0.1F;
      }
   }

   private double a(eyt $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.af().c().intValue();
            $$3 *= (double)aww.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof bpp && ((bpp)$$0.g()).ey()) {
            float $$4 = Math.min((float)((bpp)$$0.g()).aP + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eir $$5 = $$0.k();
         if ($$5 == eir.a || $$5 == eir.b) {
            $$3 *= aww.d(this.j.m.ai().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(eub $$0, float $$1) {
      if (this.j.ao() instanceof bpp $$2) {
         float $$3 = (float)$$2.aN - $$1;
         if ($$2.ey()) {
            float $$4 = Math.min((float)$$2.aP + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aO;
         $$3 = aww.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eG();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.am().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(eub $$0, float $$1) {
      if (this.j.ao() instanceof ciu) {
         ciu $$2 = (ciu)this.j.ao();
         float $$3 = $$2.Y - $$2.X;
         float $$4 = -($$2.Y + $$3 * $$1);
         float $$5 = aww.i($$1, $$2.cc, $$2.cd);
         $$0.a(aww.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(aww.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(aww.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(aww.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L);
      this.C = 1.0F;
   }

   private void a(eyt $$0, float $$1) {
      if (!this.B) {
         this.a(this.a(this.a($$0, $$1, false)));
         eub $$2 = new eub();
         $$2.a();
         this.a($$2, $$1);
         if (this.j.m.Z().c()) {
            this.b($$2, $$1);
         }

         boolean $$3 = this.j.ao() instanceof bpp && ((bpp)this.j.ao()).fI();
         if (this.j.m.ay().a() && !$$3 && !this.j.m.Z && this.j.q.j() != cwy.d) {
            this.z.c();
            this.b.a($$1, $$2, this.o.c(), this.j.s, this.j.aq().a(this.j.s, $$1));
            this.z.b();
         }

         $$2.b();
         if (this.j.m.ay().a() && !$$3) {
            fyc.a(this.j, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, euj.a);
   }

   public Matrix4f a(double $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.C != 1.0F) {
         $$1.translate(this.D, -this.E, 0.0F);
         $$1.scale(this.C, this.C, 1.0F);
      }

      return $$1.perspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.j.aO().k() / (float)this.j.aO().l(), 0.05F, this.h());
   }

   public float h() {
      return this.m * 4.0F;
   }

   public static float a(bpp $$0, float $$1) {
      bok $$2 = $$0.c(bom.p);
      return !$$2.a(200) ? 1.0F : 0.7F + aww.a(((float)$$2.c() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.j.aC() && this.j.m.n && (!this.j.m.X().c() || !this.j.n.d())) {
         if (ac.b() - this.y > 500L) {
            this.j.b(false);
         }
      } else {
         this.y = ac.b();
      }

      if (!this.j.x) {
         float $$3 = this.j.r != null && this.j.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.j.c();
         int $$5 = (int)(this.j.n.e() * (double)this.j.aO().o() / (double)this.j.aO().m());
         int $$6 = (int)(this.j.n.f() * (double)this.j.aO().p() / (double)this.j.aO().n());
         RenderSystem.viewport(0, 0, this.j.aO().k(), this.j.aO().l());
         if ($$4 && $$2 && this.j.r != null) {
            this.j.aI().a("level");
            this.a($$0, $$1);
            this.ax();
            this.j.f.b();
            if (this.J != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.J.a($$3);
            }

            this.j.h().a(true);
         }

         etf $$7 = this.j.aO();
         RenderSystem.clear(256, ezi.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, euj.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         esx.d();
         fav $$10 = new fav(this.j, this.o.c());
         if ($$4 && $$2 && this.j.r != null) {
            this.j.aI().b("gui");
            if (this.j.s != null) {
               float $$11 = aww.i($$3, this.j.s.cE, this.j.s.cD);
               float $$12 = this.j.m.ah().c().floatValue();
               if ($$11 > 0.0F && this.j.s.a(bom.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.j.m.Z) {
               this.a(this.j.aO().o(), this.j.aO().p(), $$3);
            }

            this.j.l.a($$10, $$3);
            RenderSystem.clear(256, ezi.a);
            this.j.aI().c();
         }

         if (this.j.aL() != null) {
            try {
               this.j.aL().a($$10, $$5, $$6, this.j.av());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.j.aL().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.j.y != null) {
            try {
               this.j.y.c($$10, $$5, $$6, this.j.av());
            } catch (Throwable var17) {
               o $$17 = o.a(var17, "Rendering screen");
               p $$18 = $$17.a("Screen render details");
               $$18.a("Screen name", () -> this.j.y.getClass().getCanonicalName());
               $$18.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$5, $$6, this.j.n.e(), this.j.n.f()));
               $$18.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.j.aO().o(),
                        this.j.aO().p(),
                        this.j.aO().k(),
                        this.j.aO().l(),
                        this.j.aO().s()
                     )
               );
               throw new y($$17);
            }

            try {
               if (this.j.y != null) {
                  this.j.y.A();
               }
            } catch (Throwable var16) {
               o $$20 = o.a(var16, "Narrating screen");
               p $$21 = $$20.a("Screen details");
               $$21.a("Screen name", () -> this.j.y.getClass().getCanonicalName());
               throw new y($$20);
            }
         }

         if ($$4) {
            this.j.aI().a("toasts");
            this.j.aA().a($$10);
            this.j.aI().c();
         }

         $$10.e();
         $$9.popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ax() {
      if (!this.x && this.j.T()) {
         long $$0 = ac.b();
         if ($$0 - this.w >= 1000L) {
            this.w = $$0;
            gng $$1 = this.j.V();
            if ($$1 != null && !$$1.ag()) {
               $$1.B().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.x = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.j.f.k() > 10 && this.j.f.q()) {
         etc $$1 = ezt.a(this.j.h());
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

            try (etc $$6 = new etc(64, 64, false)) {
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

   private boolean ay() {
      if (!this.v) {
         return false;
      } else {
         box $$0 = this.j.ao();
         boolean $$1 = $$0 instanceof ciu && !this.j.m.Z;
         if ($$1 && !((ciu)$$0).ga().e) {
            cqm $$2 = ((bpp)$$0).eU();
            epr $$3 = this.j.v;
            if ($$3 != null && $$3.c() == epr.a.b) {
               ib $$4 = ((epp)$$3).a();
               dnb $$5 = this.j.r.a_($$4);
               if (this.j.q.j() == cwy.d) {
                  $$1 = $$5.b(this.j.r, $$4) != null;
               } else {
                  dnf $$6 = new dnf(this.j.r, $$4, false);
                  iy<dac> $$7 = this.j.r.H_().d(kj.f);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1) {
      this.z.a($$0);
      if (this.j.ao() == null) {
         this.j.a(this.j.s);
      }

      this.a($$0);
      this.j.aI().a("center");
      boolean $$2 = this.ay();
      this.j.aI().b("camera");
      eyt $$3 = this.N;
      box $$4 = (box)(this.j.ao() == null ? this.j.s : this.j.ao());
      $$3.a(this.j.r, $$4, !this.j.m.ay().a(), this.j.m.ay().b(), this.j.r.s().a($$4) ? 1.0F : $$0);
      this.m = (float)(this.j.m.aB() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      eub $$7 = new eub();
      this.a($$7, $$3.p());
      if (this.j.m.Z().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.j.m.ah().c().floatValue();
      float $$9 = aww.i($$0, this.j.s.cE, this.j.s.cD) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.j.s.a(bom.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, aww.g / 2.0F, aww.g / 2.0F);
         float $$13 = ((float)this.p + $$0) * (float)$$10 * (float) (Math.PI / 180.0);
         $$6.rotate($$13, $$12);
         $$6.scale(1.0F / $$11, 1.0F, 1.0F);
         $$6.rotate(-$$13, $$12);
      }

      this.a($$6);
      Matrix4f $$14 = new Matrix4f().rotationXYZ($$3.d() * (float) (Math.PI / 180.0), $$3.e() * (float) (Math.PI / 180.0) + (float) Math.PI, 0.0F);
      this.j.f.a($$3.b(), $$14, this.a(Math.max($$5, (double)this.j.m.af().c().intValue())));
      this.j.f.a($$0, $$1, $$2, $$3, this, this.z, $$14, $$6);
      this.j.aI().b("hand");
      if (this.u) {
         RenderSystem.clear(256, ezi.a);
         this.a($$3, $$0);
      }

      this.j.aI().c();
   }

   public void i() {
      this.F = null;
      this.n.a();
      this.N.o();
      this.x = false;
   }

   public fay j() {
      return this.n;
   }

   public void a(cqm $$0) {
      this.F = $$0;
      this.G = 40;
      this.H = this.l.i() * 2.0F - 1.0F;
      this.I = this.l.i() * 2.0F - 1.0F;
   }

   private void a(int $$0, int $$1, float $$2) {
      if (this.F != null && this.G > 0) {
         int $$3 = 40 - this.G;
         float $$4 = ((float)$$3 + $$2) / 40.0F;
         float $$5 = $$4 * $$4;
         float $$6 = $$4 * $$5;
         float $$7 = 10.25F * $$6 * $$5 - 24.95F * $$5 * $$5 + 25.5F * $$6 - 13.8F * $$5 + 4.0F * $$4;
         float $$8 = $$7 * (float) Math.PI;
         float $$9 = this.H * (float)($$0 / 4);
         float $$10 = this.I * (float)($$1 / 4);
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         eub $$11 = new eub();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * aww.e(aww.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * aww.e(aww.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * aww.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * aww.e(aww.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * aww.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * aww.b($$4 * 8.0F)));
         fxs.a $$13 = this.o.c();
         this.j.as().a(this.F, cqj.i, 15728880, git.d, $$11, $$13, this.j.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(fav $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = aww.i($$1, 2.0F, 1.0F);
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

   public ezi k() {
      return this.j;
   }

   public float b(float $$0) {
      return aww.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public eyt m() {
      return this.N;
   }

   public fxr n() {
      return this.z;
   }

   public git o() {
      return this.A;
   }

   @Nullable
   public static fyg p() {
      return P;
   }

   @Nullable
   public static fyg q() {
      return Q;
   }

   @Nullable
   public static fyg r() {
      return R;
   }

   @Nullable
   public static fyg s() {
      return S;
   }

   @Nullable
   public static fyg t() {
      return T;
   }

   @Nullable
   public static fyg u() {
      return U;
   }

   @Nullable
   public static fyg v() {
      return V;
   }

   @Nullable
   public static fyg w() {
      return W;
   }

   @Nullable
   public static fyg x() {
      return X;
   }

   @Nullable
   public static fyg y() {
      return Y;
   }

   @Nullable
   public static fyg z() {
      return Z;
   }

   @Nullable
   public static fyg A() {
      return aa;
   }

   @Nullable
   public static fyg B() {
      return ab;
   }

   @Nullable
   public static fyg C() {
      return ac;
   }

   @Nullable
   public static fyg D() {
      return ad;
   }

   @Nullable
   public static fyg E() {
      return ae;
   }

   @Nullable
   public static fyg F() {
      return af;
   }

   @Nullable
   public static fyg G() {
      return ag;
   }

   @Nullable
   public static fyg H() {
      return ah;
   }

   @Nullable
   public static fyg I() {
      return ai;
   }

   @Nullable
   public static fyg J() {
      return aj;
   }

   @Nullable
   public static fyg K() {
      return ak;
   }

   @Nullable
   public static fyg L() {
      return al;
   }

   @Nullable
   public static fyg M() {
      return am;
   }

   @Nullable
   public static fyg N() {
      return an;
   }

   @Nullable
   public static fyg O() {
      return ao;
   }

   @Nullable
   public static fyg P() {
      return ap;
   }

   @Nullable
   public static fyg Q() {
      return aq;
   }

   @Nullable
   public static fyg R() {
      return ar;
   }

   @Nullable
   public static fyg S() {
      return as;
   }

   @Nullable
   public static fyg T() {
      return at;
   }

   @Nullable
   public static fyg U() {
      return au;
   }

   @Nullable
   public static fyg V() {
      return av;
   }

   @Nullable
   public static fyg W() {
      return aw;
   }

   @Nullable
   public static fyg X() {
      return ax;
   }

   @Nullable
   public static fyg Y() {
      return ay;
   }

   @Nullable
   public static fyg Z() {
      return az;
   }

   @Nullable
   public static fyg aa() {
      return aA;
   }

   @Nullable
   public static fyg ab() {
      return aB;
   }

   @Nullable
   public static fyg ac() {
      return aC;
   }

   @Nullable
   public static fyg ad() {
      return aD;
   }

   @Nullable
   public static fyg ae() {
      return aE;
   }

   @Nullable
   public static fyg af() {
      return aF;
   }

   @Nullable
   public static fyg ag() {
      return aG;
   }

   @Nullable
   public static fyg ah() {
      return aH;
   }

   @Nullable
   public static fyg ai() {
      return aI;
   }

   @Nullable
   public static fyg aj() {
      return aJ;
   }

   @Nullable
   public static fyg ak() {
      return aK;
   }

   @Nullable
   public static fyg al() {
      return aL;
   }

   @Nullable
   public static fyg am() {
      return aM;
   }

   @Nullable
   public static fyg an() {
      return aN;
   }

   @Nullable
   public static fyg ao() {
      return aO;
   }

   @Nullable
   public static fyg ap() {
      return aP;
   }

   @Nullable
   public static fyg aq() {
      return aQ;
   }

   @Nullable
   public static fyg ar() {
      return aR;
   }

   @Nullable
   public static fyg as() {
      return aS;
   }

   @Nullable
   public static fyg at() {
      return aT;
   }

   @Nullable
   public static fyg au() {
      return aU;
   }

   public static record a(asr a, Map<ajh, asm> c) implements asr {
      @Override
      public Optional<asm> getResource(ajh $$0) {
         asm $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<ajh, asm> b() {
         return this.c;
      }
   }
}
