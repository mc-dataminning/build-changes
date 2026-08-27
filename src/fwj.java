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

public class fwj implements AutoCloseable {
   private static final ajc f = new ajc("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final eyk j;
   private final asf k;
   private final awt l = awt.a();
   private float m;
   public final fwm b;
   private final faa n;
   private final fww o;
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
   private final fwp z;
   private final ghq A = new ghq();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private cpq F;
   private int G;
   private float H;
   private float I;
   @Nullable
   fwt J;
   static final ajc[] K = new ajc[]{
      new ajc("shaders/post/notch.json"),
      new ajc("shaders/post/fxaa.json"),
      new ajc("shaders/post/art.json"),
      new ajc("shaders/post/bumpy.json"),
      new ajc("shaders/post/blobs2.json"),
      new ajc("shaders/post/pencil.json"),
      new ajc("shaders/post/color_convolve.json"),
      new ajc("shaders/post/deconverge.json"),
      new ajc("shaders/post/flip.json"),
      new ajc("shaders/post/invert.json"),
      new ajc("shaders/post/ntsc.json"),
      new ajc("shaders/post/outline.json"),
      new ajc("shaders/post/phosphor.json"),
      new ajc("shaders/post/scan_pincushion.json"),
      new ajc("shaders/post/sobel.json"),
      new ajc("shaders/post/bits.json"),
      new ajc("shaders/post/desaturate.json"),
      new ajc("shaders/post/green.json"),
      new ajc("shaders/post/blur.json"),
      new ajc("shaders/post/wobble.json"),
      new ajc("shaders/post/blobs.json"),
      new ajc("shaders/post/antialias.json"),
      new ajc("shaders/post/creeper.json"),
      new ajc("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final exv N = new exv();
   public fxe e;
   private final Map<String, fxe> O = Maps.newHashMap();
   @Nullable
   private static fxe P;
   @Nullable
   private static fxe Q;
   @Nullable
   private static fxe R;
   @Nullable
   private static fxe S;
   @Nullable
   private static fxe T;
   @Nullable
   private static fxe U;
   @Nullable
   private static fxe V;
   @Nullable
   private static fxe W;
   @Nullable
   private static fxe X;
   @Nullable
   private static fxe Y;
   @Nullable
   private static fxe Z;
   @Nullable
   private static fxe aa;
   @Nullable
   private static fxe ab;
   @Nullable
   private static fxe ac;
   @Nullable
   private static fxe ad;
   @Nullable
   private static fxe ae;
   @Nullable
   private static fxe af;
   @Nullable
   private static fxe ag;
   @Nullable
   private static fxe ah;
   @Nullable
   private static fxe ai;
   @Nullable
   private static fxe aj;
   @Nullable
   private static fxe ak;
   @Nullable
   private static fxe al;
   @Nullable
   private static fxe am;
   @Nullable
   private static fxe an;
   @Nullable
   private static fxe ao;
   @Nullable
   private static fxe ap;
   @Nullable
   private static fxe aq;
   @Nullable
   private static fxe ar;
   @Nullable
   private static fxe as;
   @Nullable
   private static fxe at;
   @Nullable
   private static fxe au;
   @Nullable
   private static fxe av;
   @Nullable
   private static fxe aw;
   @Nullable
   private static fxe ax;
   @Nullable
   private static fxe ay;
   @Nullable
   private static fxe az;
   @Nullable
   private static fxe aA;
   @Nullable
   private static fxe aB;
   @Nullable
   private static fxe aC;
   @Nullable
   private static fxe aD;
   @Nullable
   private static fxe aE;
   @Nullable
   private static fxe aF;
   @Nullable
   private static fxe aG;
   @Nullable
   private static fxe aH;
   @Nullable
   private static fxe aI;
   @Nullable
   private static fxe aJ;
   @Nullable
   private static fxe aK;
   @Nullable
   private static fxe aL;
   @Nullable
   private static fxe aM;
   @Nullable
   private static fxe aN;
   @Nullable
   private static fxe aO;
   @Nullable
   private static fxe aP;
   @Nullable
   private static fxe aQ;
   @Nullable
   private static fxe aR;
   @Nullable
   private static fxe aS;
   @Nullable
   private static fxe aT;
   @Nullable
   private static fxe aU;

   public fwj(eyk $$0, fwm $$1, asf $$2, fww $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new faa($$0.Z());
      this.z = new fwp(this, $$0);
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

   public void a(@Nullable bof $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof ces) {
         this.a(new ajc("shaders/post/creeper.json"));
      } else if ($$0 instanceof cfr) {
         this.a(new ajc("shaders/post/spider.json"));
      } else if ($$0 instanceof cew) {
         this.a(new ajc("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.an() instanceof cia) {
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

   void a(ajc $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new fwt(this.j.Z(), this.k, this.j.g(), $$0);
         this.J.a(this.j.aN().k(), this.j.aN().l());
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

   public arz e() {
      return new ask<fwj.a>() {
         protected fwj.a a(asf $$0, bjc $$1) {
            Map<ajc, asd> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(esr.a.b.b()) || $$1x.endsWith(esr.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<ajc, asd> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new asd($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fwj.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fwj.a($$0, $$3);
         }

         protected void a(fwj.a $$0, asf $$1, bjc $$2) {
            fwj.this.b($$0);
            if (fwj.this.J != null) {
               fwj.this.J.close();
            }

            fwj.this.J = null;
            if (fwj.this.L == fwj.d) {
               fwj.this.a(fwj.this.j.an());
            } else {
               fwj.this.a(fwj.K[fwj.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(asi $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fxe($$0, "blit_screen", etb.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", etb.n);
         aS = this.a($$0, "rendertype_gui_overlay", etb.n);
         P = this.a($$0, "position", etb.m);
         Q = this.a($$0, "position_color", etb.n);
         R = this.a($$0, "position_color_tex", etb.r);
         S = this.a($$0, "position_tex", etb.q);
         T = this.a($$0, "position_tex_color", etb.s);
         aE = this.a($$0, "rendertype_text", etb.t);
      }
   }

   private fxe a(asi $$0, String $$1, eti $$2) {
      try {
         fxe $$3 = new fxe($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(asi $$0) {
      RenderSystem.assertOnRenderThread();
      List<esr> $$1 = Lists.newArrayList();
      $$1.addAll(esr.a.b.c().values());
      $$1.addAll(esr.a.a.c().values());
      $$1.forEach(esr::a);
      List<Pair<fxe, Consumer<fxe>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fxe($$0, "particle", etb.l), (Consumer<fxe>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fxe($$0, "position", etb.m), (Consumer<fxe>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fxe($$0, "position_color", etb.n), (Consumer<fxe>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fxe($$0, "position_color_lightmap", etb.p), (Consumer<fxe>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fxe($$0, "position_color_tex", etb.r), (Consumer<fxe>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fxe($$0, "position_color_tex_lightmap", etb.t), (Consumer<fxe>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fxe($$0, "position_tex", etb.q), (Consumer<fxe>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fxe($$0, "position_tex_color", etb.s), (Consumer<fxe>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_solid", etb.j), (Consumer<fxe>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_cutout_mipped", etb.j), (Consumer<fxe>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_cutout", etb.j), (Consumer<fxe>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_translucent", etb.j), (Consumer<fxe>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_translucent_moving_block", etb.j), (Consumer<fxe>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_armor_cutout_no_cull", etb.k), (Consumer<fxe>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_solid", etb.k), (Consumer<fxe>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_cutout", etb.k), (Consumer<fxe>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_cutout_no_cull", etb.k), (Consumer<fxe>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_cutout_no_cull_z_offset", etb.k), (Consumer<fxe>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_item_entity_translucent_cull", etb.k), (Consumer<fxe>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_translucent_cull", etb.k), (Consumer<fxe>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_translucent", etb.k), (Consumer<fxe>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_translucent_emissive", etb.k), (Consumer<fxe>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_smooth_cutout", etb.k), (Consumer<fxe>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_beacon_beam", etb.j), (Consumer<fxe>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_decal", etb.k), (Consumer<fxe>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_no_outline", etb.k), (Consumer<fxe>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_shadow", etb.k), (Consumer<fxe>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_alpha", etb.k), (Consumer<fxe>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_eyes", etb.k), (Consumer<fxe>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_energy_swirl", etb.k), (Consumer<fxe>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_leash", etb.p), (Consumer<fxe>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_water_mask", etb.m), (Consumer<fxe>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_outline", etb.r), (Consumer<fxe>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_armor_glint", etb.q), (Consumer<fxe>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_armor_entity_glint", etb.q), (Consumer<fxe>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_glint_translucent", etb.q), (Consumer<fxe>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_glint", etb.q), (Consumer<fxe>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_glint_direct", etb.q), (Consumer<fxe>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_glint", etb.q), (Consumer<fxe>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_entity_glint_direct", etb.q), (Consumer<fxe>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_text", etb.t), (Consumer<fxe>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_text_background", etb.p), (Consumer<fxe>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_text_intensity", etb.t), (Consumer<fxe>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_text_see_through", etb.t), (Consumer<fxe>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_text_background_see_through", etb.p), (Consumer<fxe>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_text_intensity_see_through", etb.t), (Consumer<fxe>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_lightning", etb.n), (Consumer<fxe>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_tripwire", etb.j), (Consumer<fxe>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_end_portal", etb.m), (Consumer<fxe>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_end_gateway", etb.m), (Consumer<fxe>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_clouds", etb.v), (Consumer<fxe>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_lines", etb.o), (Consumer<fxe>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_crumbling", etb.j), (Consumer<fxe>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_gui", etb.n), (Consumer<fxe>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_gui_overlay", etb.n), (Consumer<fxe>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_gui_text_highlight", etb.n), (Consumer<fxe>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_gui_ghost_recipe_overlay", etb.n), (Consumer<fxe>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fxe($$0, "rendertype_breeze_wind", etb.k), (Consumer<fxe>)$$0x -> at = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fxe)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.av();
      $$2.forEach($$0x -> {
         fxe $$1x = (fxe)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void av() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fxe::close);
      this.O.clear();
   }

   @Nullable
   public fxe a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.aw();
      this.z.a();
      if (this.j.an() == null) {
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
   public fwt g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bof $$1 = this.j.an();
      if ($$1 != null) {
         if (this.j.r != null && this.j.s != null) {
            this.j.aH().a("pick");
            double $$2 = this.j.s.gv();
            double $$3 = this.j.s.gw();
            eot $$4 = this.a($$1, $$2, $$3, $$0);
            this.j.v = $$4;
            this.j.u = $$4 instanceof eos $$5 ? $$5.a() : null;
            this.j.aH().c();
         }
      }
   }

   private eot a(bof $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = awm.k($$4);
      eov $$6 = $$0.j($$3);
      eot $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != eot.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      eov $$9 = $$0.f($$3);
      eov $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      eoq $$12 = $$0.cE().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      eos $$13 = ciu.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.P_() && $$0x.bt(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static eot a(eot $$0, eov $$1, double $$2) {
      eov $$3 = $$0.e();
      if (!$$3.a((iv)$$1, $$2)) {
         eov $$4 = $$0.e();
         ih $$5 = ih.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return eor.a($$4, $$5, ib.a($$4));
      } else {
         return $$0;
      }
   }

   private void aw() {
      float $$0 = 1.0F;
      if (this.j.an() instanceof fvp $$1) {
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

   private double a(exv $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ae().c().intValue();
            $$3 *= (double)awm.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof box && ((box)$$0.g()).ev()) {
            float $$4 = Math.min((float)((box)$$0.g()).aN + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eht $$5 = $$0.k();
         if ($$5 == eht.a || $$5 == eht.b) {
            $$3 *= awm.d(this.j.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(etd $$0, float $$1) {
      if (this.j.an() instanceof box $$2) {
         float $$3 = (float)$$2.aL - $$1;
         if ($$2.ev()) {
            float $$4 = Math.min((float)$$2.aN + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aM;
         $$3 = awm.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eD();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(etd $$0, float $$1) {
      if (this.j.an() instanceof cia) {
         cia $$2 = (cia)this.j.an();
         float $$3 = $$2.X - $$2.W;
         float $$4 = -($$2.X + $$3 * $$1);
         float $$5 = awm.i($$1, $$2.ca, $$2.cb);
         $$0.a(awm.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(awm.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(awm.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(awm.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
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

   private void a(exv $$0, float $$1) {
      if (!this.B) {
         this.a(this.a(this.a($$0, $$1, false)));
         etd $$2 = new etd();
         $$2.a();
         this.a($$2, $$1);
         if (this.j.m.Y().c()) {
            this.b($$2, $$1);
         }

         boolean $$3 = this.j.an() instanceof box && ((box)this.j.an()).fF();
         if (this.j.m.ax().a() && !$$3 && !this.j.m.Z && this.j.q.j() != cwb.d) {
            this.z.c();
            this.b.a($$1, $$2, this.o.c(), this.j.s, this.j.ap().a(this.j.s, $$1));
            this.z.b();
         }

         $$2.b();
         if (this.j.m.ax().a() && !$$3) {
            fxa.a(this.j, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, etl.a);
   }

   public Matrix4f a(double $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.C != 1.0F) {
         $$1.translate(this.D, -this.E, 0.0F);
         $$1.scale(this.C, this.C, 1.0F);
      }

      return $$1.perspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.j.aN().k() / (float)this.j.aN().l(), 0.05F, this.h());
   }

   public float h() {
      return this.m * 4.0F;
   }

   public static float a(box $$0, float $$1) {
      bns $$2 = $$0.c(bnu.p);
      return !$$2.a(200) ? 1.0F : 0.7F + awm.a(((float)$$2.c() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.j.aB() && this.j.m.n && (!this.j.m.W().c() || !this.j.n.d())) {
         if (ac.b() - this.y > 500L) {
            this.j.c(false);
         }
      } else {
         this.y = ac.b();
      }

      if (!this.j.x) {
         float $$3 = this.j.r != null && this.j.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.j.c();
         int $$5 = (int)(this.j.n.e() * (double)this.j.aN().o() / (double)this.j.aN().m());
         int $$6 = (int)(this.j.n.f() * (double)this.j.aN().p() / (double)this.j.aN().n());
         RenderSystem.viewport(0, 0, this.j.aN().k(), this.j.aN().l());
         if ($$4 && $$2 && this.j.r != null) {
            this.j.aH().a("level");
            this.a($$0, $$1);
            this.ax();
            this.j.f.b();
            if (this.J != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.J.a($$3);
            }

            this.j.g().a(true);
         }

         esh $$7 = this.j.aN();
         RenderSystem.clear(256, eyk.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, etl.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         erz.d();
         ezx $$10 = new ezx(this.j, this.o.c());
         if ($$4 && $$2 && this.j.r != null) {
            this.j.aH().b("gui");
            if (this.j.s != null) {
               float $$11 = awm.i($$3, this.j.s.cB, this.j.s.cA);
               float $$12 = this.j.m.ag().c().floatValue();
               if ($$11 > 0.0F && this.j.s.a(bnu.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.j.m.Z) {
               this.a(this.j.aN().o(), this.j.aN().p(), $$3);
            }

            this.j.l.a($$10, $$3);
            RenderSystem.clear(256, eyk.a);
            this.j.aH().c();
         }

         if (this.j.aK() != null) {
            try {
               this.j.aK().a($$10, $$5, $$6, this.j.au());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.j.aK().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.j.y != null) {
            try {
               this.j.y.c($$10, $$5, $$6, this.j.au());
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
                        this.j.aN().o(),
                        this.j.aN().p(),
                        this.j.aN().k(),
                        this.j.aN().l(),
                        this.j.aN().s()
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
            this.j.aH().a("toasts");
            this.j.ax().a($$10);
            this.j.aH().c();
         }

         $$10.e();
         $$9.popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ax() {
      if (!this.x && this.j.S()) {
         long $$0 = ac.b();
         if ($$0 - this.w >= 1000L) {
            this.w = $$0;
            gmd $$1 = this.j.U();
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
         ese $$1 = eyv.a(this.j.g());
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

            try (ese $$6 = new ese(64, 64, false)) {
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
         bof $$0 = this.j.an();
         boolean $$1 = $$0 instanceof cia && !this.j.m.Z;
         if ($$1 && !((cia)$$0).fW().e) {
            cpq $$2 = ((box)$$0).eR();
            eot $$3 = this.j.v;
            if ($$3 != null && $$3.c() == eot.a.b) {
               ib $$4 = ((eor)$$3).a();
               dme $$5 = this.j.r.a_($$4);
               if (this.j.q.j() == cwb.d) {
                  $$1 = $$5.b(this.j.r, $$4) != null;
               } else {
                  dmi $$6 = new dmi(this.j.r, $$4, false);
                  ix<czf> $$7 = this.j.r.I_().d(ki.f);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1) {
      this.z.a($$0);
      if (this.j.an() == null) {
         this.j.a(this.j.s);
      }

      this.a($$0);
      this.j.aH().a("center");
      boolean $$2 = this.ay();
      this.j.aH().b("camera");
      exv $$3 = this.N;
      bof $$4 = (bof)(this.j.an() == null ? this.j.s : this.j.an());
      $$3.a(this.j.r, $$4, !this.j.m.ax().a(), this.j.m.ax().b(), this.j.r.s().a($$4) ? 1.0F : $$0);
      this.m = (float)(this.j.m.aA() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      etd $$7 = new etd();
      this.a($$7, $$3.p());
      if (this.j.m.Y().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.j.m.ag().c().floatValue();
      float $$9 = awm.i($$0, this.j.s.cB, this.j.s.cA) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.j.s.a(bnu.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, awm.g / 2.0F, awm.g / 2.0F);
         float $$13 = ((float)this.p + $$0) * (float)$$10 * (float) (Math.PI / 180.0);
         $$6.rotate($$13, $$12);
         $$6.scale(1.0F / $$11, 1.0F, 1.0F);
         $$6.rotate(-$$13, $$12);
      }

      this.a($$6);
      Matrix4f $$14 = new Matrix4f().rotationXYZ($$3.d() * (float) (Math.PI / 180.0), $$3.e() * (float) (Math.PI / 180.0) + (float) Math.PI, 0.0F);
      this.j.f.a($$3.b(), $$14, this.a(Math.max($$5, (double)this.j.m.ae().c().intValue())));
      this.j.f.a($$0, $$1, $$2, $$3, this, this.z, $$14, $$6);
      this.j.aH().b("hand");
      if (this.u) {
         RenderSystem.clear(256, eyk.a);
         this.a($$3, $$0);
      }

      this.j.aH().c();
   }

   public void i() {
      this.F = null;
      this.n.a();
      this.N.o();
      this.x = false;
   }

   public faa j() {
      return this.n;
   }

   public void a(cpq $$0) {
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
         etd $$11 = new etd();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * awm.e(awm.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * awm.e(awm.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * awm.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * awm.e(awm.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * awm.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * awm.b($$4 * 8.0F)));
         fwq.a $$13 = this.o.c();
         this.j.ar().a(this.F, cpn.i, 15728880, ghq.d, $$11, $$13, this.j.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(ezx $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = awm.i($$1, 2.0F, 1.0F);
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

   public eyk k() {
      return this.j;
   }

   public float b(float $$0) {
      return awm.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public exv m() {
      return this.N;
   }

   public fwp n() {
      return this.z;
   }

   public ghq o() {
      return this.A;
   }

   @Nullable
   public static fxe p() {
      return P;
   }

   @Nullable
   public static fxe q() {
      return Q;
   }

   @Nullable
   public static fxe r() {
      return R;
   }

   @Nullable
   public static fxe s() {
      return S;
   }

   @Nullable
   public static fxe t() {
      return T;
   }

   @Nullable
   public static fxe u() {
      return U;
   }

   @Nullable
   public static fxe v() {
      return V;
   }

   @Nullable
   public static fxe w() {
      return W;
   }

   @Nullable
   public static fxe x() {
      return X;
   }

   @Nullable
   public static fxe y() {
      return Y;
   }

   @Nullable
   public static fxe z() {
      return Z;
   }

   @Nullable
   public static fxe A() {
      return aa;
   }

   @Nullable
   public static fxe B() {
      return ab;
   }

   @Nullable
   public static fxe C() {
      return ac;
   }

   @Nullable
   public static fxe D() {
      return ad;
   }

   @Nullable
   public static fxe E() {
      return ae;
   }

   @Nullable
   public static fxe F() {
      return af;
   }

   @Nullable
   public static fxe G() {
      return ag;
   }

   @Nullable
   public static fxe H() {
      return ah;
   }

   @Nullable
   public static fxe I() {
      return ai;
   }

   @Nullable
   public static fxe J() {
      return aj;
   }

   @Nullable
   public static fxe K() {
      return ak;
   }

   @Nullable
   public static fxe L() {
      return al;
   }

   @Nullable
   public static fxe M() {
      return am;
   }

   @Nullable
   public static fxe N() {
      return an;
   }

   @Nullable
   public static fxe O() {
      return ao;
   }

   @Nullable
   public static fxe P() {
      return ap;
   }

   @Nullable
   public static fxe Q() {
      return aq;
   }

   @Nullable
   public static fxe R() {
      return ar;
   }

   @Nullable
   public static fxe S() {
      return as;
   }

   @Nullable
   public static fxe T() {
      return at;
   }

   @Nullable
   public static fxe U() {
      return au;
   }

   @Nullable
   public static fxe V() {
      return av;
   }

   @Nullable
   public static fxe W() {
      return aw;
   }

   @Nullable
   public static fxe X() {
      return ax;
   }

   @Nullable
   public static fxe Y() {
      return ay;
   }

   @Nullable
   public static fxe Z() {
      return az;
   }

   @Nullable
   public static fxe aa() {
      return aA;
   }

   @Nullable
   public static fxe ab() {
      return aB;
   }

   @Nullable
   public static fxe ac() {
      return aC;
   }

   @Nullable
   public static fxe ad() {
      return aD;
   }

   @Nullable
   public static fxe ae() {
      return aE;
   }

   @Nullable
   public static fxe af() {
      return aF;
   }

   @Nullable
   public static fxe ag() {
      return aG;
   }

   @Nullable
   public static fxe ah() {
      return aH;
   }

   @Nullable
   public static fxe ai() {
      return aI;
   }

   @Nullable
   public static fxe aj() {
      return aJ;
   }

   @Nullable
   public static fxe ak() {
      return aK;
   }

   @Nullable
   public static fxe al() {
      return aL;
   }

   @Nullable
   public static fxe am() {
      return aM;
   }

   @Nullable
   public static fxe an() {
      return aN;
   }

   @Nullable
   public static fxe ao() {
      return aO;
   }

   @Nullable
   public static fxe ap() {
      return aP;
   }

   @Nullable
   public static fxe aq() {
      return aQ;
   }

   @Nullable
   public static fxe ar() {
      return aR;
   }

   @Nullable
   public static fxe as() {
      return aS;
   }

   @Nullable
   public static fxe at() {
      return aT;
   }

   @Nullable
   public static fxe au() {
      return aU;
   }

   public static record a(asi a, Map<ajc, asd> b) implements asi {
      @Override
      public Optional<asd> getResource(ajc $$0) {
         asd $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
