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

public class gez implements AutoCloseable {
   private static final akt e = new akt("textures/misc/nausea.png");
   private static final akt f = new akt("shaders/post/blur.json");
   private static final float g = 10.0F;
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float a = 0.05F;
   private static final float j = 1000.0F;
   final fgj k;
   private final aud l;
   private final ayt m = ayt.a();
   private float n;
   public final gfc b;
   private final fid o;
   private final gfm p;
   private int q;
   private float r;
   private float s;
   private float t;
   private float u;
   private boolean v = true;
   private boolean w = true;
   private long x;
   private boolean y;
   private long z = ad.b();
   private final gff A;
   private final gqp B = new gqp();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private cuh G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gfj K;
   @Nullable
   private gfj L;
   private boolean M;
   private final ffu N = new ffu();
   public gfu d;
   private final Map<String, gfu> O = Maps.newHashMap();
   @Nullable
   private static gfu P;
   @Nullable
   private static gfu Q;
   @Nullable
   private static gfu R;
   @Nullable
   private static gfu S;
   @Nullable
   private static gfu T;
   @Nullable
   private static gfu U;
   @Nullable
   private static gfu V;
   @Nullable
   private static gfu W;
   @Nullable
   private static gfu X;
   @Nullable
   private static gfu Y;
   @Nullable
   private static gfu Z;
   @Nullable
   private static gfu aa;
   @Nullable
   private static gfu ab;
   @Nullable
   private static gfu ac;
   @Nullable
   private static gfu ad;
   @Nullable
   private static gfu ae;
   @Nullable
   private static gfu af;
   @Nullable
   private static gfu ag;
   @Nullable
   private static gfu ah;
   @Nullable
   private static gfu ai;
   @Nullable
   private static gfu aj;
   @Nullable
   private static gfu ak;
   @Nullable
   private static gfu al;
   @Nullable
   private static gfu am;
   @Nullable
   private static gfu an;
   @Nullable
   private static gfu ao;
   @Nullable
   private static gfu ap;
   @Nullable
   private static gfu aq;
   @Nullable
   private static gfu ar;
   @Nullable
   private static gfu as;
   @Nullable
   private static gfu at;
   @Nullable
   private static gfu au;
   @Nullable
   private static gfu av;
   @Nullable
   private static gfu aw;
   @Nullable
   private static gfu ax;
   @Nullable
   private static gfu ay;
   @Nullable
   private static gfu az;
   @Nullable
   private static gfu aA;
   @Nullable
   private static gfu aB;
   @Nullable
   private static gfu aC;
   @Nullable
   private static gfu aD;
   @Nullable
   private static gfu aE;
   @Nullable
   private static gfu aF;
   @Nullable
   private static gfu aG;
   @Nullable
   private static gfu aH;
   @Nullable
   private static gfu aI;
   @Nullable
   private static gfu aJ;
   @Nullable
   private static gfu aK;
   @Nullable
   private static gfu aL;
   @Nullable
   private static gfu aM;
   @Nullable
   private static gfu aN;
   @Nullable
   private static gfu aO;
   @Nullable
   private static gfu aP;
   @Nullable
   private static gfu aQ;
   @Nullable
   private static gfu aR;
   @Nullable
   private static gfu aS;
   @Nullable
   private static gfu aT;
   @Nullable
   private static gfu aU;

   public gez(fgj $$0, gfc $$1, aud $$2, gfm $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new fid($$0.aa(), $$0.aH());
      this.A = new gff(this, $$0);
      this.p = $$3;
      this.K = null;
   }

   @Override
   public void close() {
      this.A.close();
      this.o.close();
      this.B.close();
      this.b();
      this.av();
      if (this.d != null) {
         this.d.close();
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
   }

   public void c() {
      this.M = !this.M;
   }

   public void a(@Nullable brv $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cio) {
         this.a(new akt("shaders/post/creeper.json"));
      } else if ($$0 instanceof cjp) {
         this.a(new akt("shaders/post/spider.json"));
      } else if ($$0 instanceof cis) {
         this.a(new akt("shaders/post/invert.json"));
      }
   }

   private void a(akt $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gfj(this.k.aa(), this.l, this.k.h(), $$0);
         this.K.a(this.k.aP().k(), this.k.aP().l());
         this.M = true;
      } catch (IOException var3) {
         h.warn("Failed to load shader: {}", $$0, var3);
         this.M = false;
      } catch (JsonSyntaxException var4) {
         h.warn("Failed to parse shader: {}", $$0, var4);
         this.M = false;
      }
   }

   public void d() {
      if (this.L != null) {
         this.L.close();
      }

      try {
         this.L = new gfj(this.k.aa(), this.l, this.k.h(), f);
         this.L.a(this.k.aP().k(), this.k.aP().l());
      } catch (IOException var2) {
         h.warn("Failed to load shader: {}", f, var2);
      } catch (JsonSyntaxException var3) {
         h.warn("Failed to parse shader: {}", f, var3);
      }
   }

   public void a(float $$0) {
      float $$1 = (float)this.k.m.q();
      float $$2 = $$1 * 10.0F;
      if (this.L != null && $$2 >= 1.0F) {
         RenderSystem.enableBlend();
         this.L.a("Radius", $$2);
         this.L.a($$0);
         RenderSystem.disableBlend();
      }
   }

   public atx e() {
      return new aui<gez.a>() {
         protected gez.a a(aud $$0, bmo $$1) {
            Map<akt, aub> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(faq.a.b.b()) || $$1x.endsWith(faq.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<akt, aub> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new aub($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gez.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gez.a($$0, $$3);
         }

         protected void a(gez.a $$0, aud $$1, bmo $$2) {
            gez.this.b($$0);
            if (gez.this.K != null) {
               gez.this.K.close();
            }

            gez.this.K = null;
            gez.this.a(gez.this.k.ao());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(aug $$0) {
      if (this.d != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.d = new gfu($$0, "blit_screen", fba.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", fba.n);
         aS = this.a($$0, "rendertype_gui_overlay", fba.n);
         P = this.a($$0, "position", fba.m);
         Q = this.a($$0, "position_color", fba.n);
         R = this.a($$0, "position_color_tex", fba.r);
         S = this.a($$0, "position_tex", fba.q);
         T = this.a($$0, "position_tex_color", fba.s);
         aE = this.a($$0, "rendertype_text", fba.t);
      }
   }

   private gfu a(aug $$0, String $$1, fbh $$2) {
      try {
         gfu $$3 = new gfu($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(aug $$0) {
      RenderSystem.assertOnRenderThread();
      List<faq> $$1 = Lists.newArrayList();
      $$1.addAll(faq.a.b.c().values());
      $$1.addAll(faq.a.a.c().values());
      $$1.forEach(faq::a);
      List<Pair<gfu, Consumer<gfu>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new gfu($$0, "particle", fba.l), (Consumer<gfu>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new gfu($$0, "position", fba.m), (Consumer<gfu>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new gfu($$0, "position_color", fba.n), (Consumer<gfu>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new gfu($$0, "position_color_lightmap", fba.p), (Consumer<gfu>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new gfu($$0, "position_color_tex", fba.r), (Consumer<gfu>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new gfu($$0, "position_color_tex_lightmap", fba.t), (Consumer<gfu>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new gfu($$0, "position_tex", fba.q), (Consumer<gfu>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new gfu($$0, "position_tex_color", fba.s), (Consumer<gfu>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_solid", fba.j), (Consumer<gfu>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_cutout_mipped", fba.j), (Consumer<gfu>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_cutout", fba.j), (Consumer<gfu>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_translucent", fba.j), (Consumer<gfu>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_translucent_moving_block", fba.j), (Consumer<gfu>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_armor_cutout_no_cull", fba.k), (Consumer<gfu>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_solid", fba.k), (Consumer<gfu>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_cutout", fba.k), (Consumer<gfu>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_cutout_no_cull", fba.k), (Consumer<gfu>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_cutout_no_cull_z_offset", fba.k), (Consumer<gfu>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_item_entity_translucent_cull", fba.k), (Consumer<gfu>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_translucent_cull", fba.k), (Consumer<gfu>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_translucent", fba.k), (Consumer<gfu>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_translucent_emissive", fba.k), (Consumer<gfu>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_smooth_cutout", fba.k), (Consumer<gfu>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_beacon_beam", fba.j), (Consumer<gfu>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_decal", fba.k), (Consumer<gfu>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_no_outline", fba.k), (Consumer<gfu>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_shadow", fba.k), (Consumer<gfu>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_alpha", fba.k), (Consumer<gfu>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_eyes", fba.k), (Consumer<gfu>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_energy_swirl", fba.k), (Consumer<gfu>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_leash", fba.p), (Consumer<gfu>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_water_mask", fba.m), (Consumer<gfu>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_outline", fba.r), (Consumer<gfu>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_armor_glint", fba.q), (Consumer<gfu>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_armor_entity_glint", fba.q), (Consumer<gfu>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_glint_translucent", fba.q), (Consumer<gfu>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_glint", fba.q), (Consumer<gfu>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_glint_direct", fba.q), (Consumer<gfu>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_glint", fba.q), (Consumer<gfu>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_entity_glint_direct", fba.q), (Consumer<gfu>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_text", fba.t), (Consumer<gfu>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_text_background", fba.p), (Consumer<gfu>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_text_intensity", fba.t), (Consumer<gfu>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_text_see_through", fba.t), (Consumer<gfu>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_text_background_see_through", fba.p), (Consumer<gfu>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_text_intensity_see_through", fba.t), (Consumer<gfu>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_lightning", fba.n), (Consumer<gfu>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_tripwire", fba.j), (Consumer<gfu>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_end_portal", fba.m), (Consumer<gfu>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_end_gateway", fba.m), (Consumer<gfu>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_clouds", fba.v), (Consumer<gfu>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_lines", fba.o), (Consumer<gfu>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_crumbling", fba.j), (Consumer<gfu>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_gui", fba.n), (Consumer<gfu>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_gui_overlay", fba.n), (Consumer<gfu>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_gui_text_highlight", fba.n), (Consumer<gfu>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_gui_ghost_recipe_overlay", fba.n), (Consumer<gfu>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new gfu($$0, "rendertype_breeze_wind", fba.k), (Consumer<gfu>)$$0x -> at = $$0x));
         this.d();
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((gfu)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.av();
      $$2.forEach($$0x -> {
         gfu $$1x = (gfu)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void av() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(gfu::close);
      this.O.clear();
   }

   @Nullable
   public gfu a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.aw();
      this.A.a();
      if (this.k.ao() == null) {
         this.k.a(this.k.s);
      }

      this.N.a();
      this.b.a();
      this.q++;
      if (this.k.r.s().i()) {
         this.k.f.a(this.N);
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
   public gfj g() {
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
      brv $$1 = this.k.ao();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aJ().a("pick");
            double $$2 = this.k.s.gN();
            double $$3 = this.k.s.gO();
            ews $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof ewr $$5 ? $$5.a() : null;
            this.k.aJ().c();
         }
      }
   }

   private ews a(brv $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = aym.k($$4);
      ewu $$6 = $$0.j($$3);
      ews $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != ews.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      ewu $$9 = $$0.f($$3);
      ewu $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      ewp $$12 = $$0.cP().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      ewr $$13 = cmu.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.O_() && $$0x.bE(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static ews a(ews $$0, ewu $$1, double $$2) {
      ewu $$3 = $$0.e();
      if (!$$3.a((jk)$$1, $$2)) {
         ewu $$4 = $$0.e();
         iw $$5 = iw.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return ewq.a($$4, $$5, ir.a($$4));
      } else {
         return $$0;
      }
   }

   private void aw() {
      float $$0 = 1.0F;
      if (this.k.ao() instanceof gef $$1) {
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

   private double a(ffu $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)aym.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof bso && ((bso)$$0.g()).eJ()) {
            float $$4 = Math.min((float)((bso)$$0.g()).bb + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         epg $$5 = $$0.k();
         if ($$5 == epg.a || $$5 == epg.b) {
            $$3 *= aym.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fbc $$0, float $$1) {
      if (this.k.ao() instanceof bso $$2) {
         float $$3 = (float)$$2.aZ - $$1;
         if ($$2.eJ()) {
            float $$4 = Math.min((float)$$2.bb + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.ba;
         $$3 = aym.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eQ();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fbc $$0, float $$1) {
      brv $$2 = this.k.ao();
      if ($$2 != null) {
         ewu $$3 = $$2.ak.a($$2.aj, (double)$$1);
         $$0.a($$3.c, $$3.d, $$3.e);
         if ($$2 instanceof cly $$4) {
            float $$5 = $$4.aa - $$4.Z;
            float $$6 = -($$4.aa + $$5 * $$1);
            float $$7 = aym.i($$1, $$4.ct, $$4.cu);
            $$0.a(aym.a($$6 * (float) Math.PI) * $$7 * 0.5F, -Math.abs(aym.b($$6 * (float) Math.PI) * $$7), 0.0F);
            $$0.a(a.f.rotationDegrees(aym.a($$6 * (float) Math.PI) * $$7 * 3.0F));
            $$0.a(a.b.rotationDegrees(Math.abs(aym.b($$6 * (float) Math.PI - 0.2F) * $$7) * 5.0F));
         }
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

   private void a(ffu $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         fbc $$3 = new fbc();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         RenderSystem.applyModelViewMatrix();
         this.a($$3, $$1);
         if (this.k.m.ab().c()) {
            this.b($$3, $$1);
         }

         boolean $$5 = this.k.ao() instanceof bso && ((bso)this.k.ao()).fU();
         if (this.k.m.aA().a() && !$$5 && !this.k.m.aa && this.k.q.j() != dbx.d) {
            this.A.c();
            this.b.a($$1, $$3, this.p.c(), this.k.s, this.k.aq().a(this.k.s, $$1));
            this.A.b();
         }

         $$4.popMatrix();
         RenderSystem.applyModelViewMatrix();
         $$3.b();
         if (this.k.m.aA().a() && !$$5) {
            gfq.a(this.k, $$3);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, fbk.a);
   }

   public Matrix4f a(double $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.D != 1.0F) {
         $$1.translate(this.E, -this.F, 0.0F);
         $$1.scale(this.D, this.D, 1.0F);
      }

      return $$1.perspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.k.aP().k() / (float)this.k.aP().l(), 0.05F, this.h());
   }

   public float h() {
      return this.n * 4.0F;
   }

   public static float a(bso $$0, float $$1) {
      brh $$2 = $$0.c(brj.p);
      return !$$2.a(200) ? 1.0F : 0.7F + aym.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.k.aC() && this.k.m.n && (!this.k.m.Z().c() || !this.k.n.d())) {
         if (ad.b() - this.z > 500L) {
            this.k.b(false);
         }
      } else {
         this.z = ad.b();
      }

      if (!this.k.x) {
         float $$3 = this.k.r != null && this.k.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.k.c();
         int $$5 = (int)(this.k.n.e() * (double)this.k.aP().o() / (double)this.k.aP().m());
         int $$6 = (int)(this.k.n.f() * (double)this.k.aP().p() / (double)this.k.aP().n());
         RenderSystem.viewport(0, 0, this.k.aP().k(), this.k.aP().l());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aJ().a("level");
            this.a($$0, $$1);
            this.ax();
            this.k.f.b();
            if (this.K != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$3);
            }

            this.k.h().a(true);
         }

         fag $$7 = this.k.aP();
         RenderSystem.clear(256, fgj.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, fbk.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ezy.d();
         fia $$10 = new fia(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aJ().b("gui");
            if (this.k.s != null) {
               float $$11 = aym.i($$3, this.k.s.cX, this.k.s.cW);
               float $$12 = this.k.m.aj().c().floatValue();
               if ($$11 > 0.0F && this.k.s.b(brj.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.aa) {
               this.a(this.k.aP().o(), this.k.aP().p(), $$3);
            }

            this.k.l.a($$10, $$3);
            RenderSystem.clear(256, fgj.a);
            this.k.aJ().c();
         }

         if (this.k.aM() != null) {
            try {
               this.k.aM().a($$10, $$5, $$6, this.k.av());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.k.aM().getClass().getCanonicalName());
               throw new z($$14);
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
                        this.k.aP().o(),
                        this.k.aP().p(),
                        this.k.aP().k(),
                        this.k.aP().l(),
                        this.k.aP().s()
                     )
               );
               throw new z($$17);
            }

            try {
               if (this.k.y != null) {
                  this.k.y.y();
               }
            } catch (Throwable var16) {
               o $$20 = o.a(var16, "Narrating screen");
               p $$21 = $$20.a("Screen details");
               $$21.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               throw new z($$20);
            }
         }

         if ($$4 && $$2 && this.k.r != null) {
            this.k.l.b($$10, $$3);
         }

         if ($$4) {
            this.k.aJ().a("toasts");
            this.k.aA().a($$10);
            this.k.aJ().c();
         }

         $$10.e();
         $$9.popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ax() {
      if (!this.y && this.k.T()) {
         long $$0 = ad.b();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gvd $$1 = this.k.V();
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
         fad $$1 = fgu.a(this.k.h());
         ad.g().execute(() -> {
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

            try (fad $$6 = new fad(64, 64, false)) {
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

   private boolean ay() {
      if (!this.w) {
         return false;
      } else {
         brv $$0 = this.k.ao();
         boolean $$1 = $$0 instanceof cly && !this.k.m.aa;
         if ($$1 && !((cly)$$0).gm().e) {
            cuh $$2 = ((bso)$$0).fg();
            ews $$3 = this.k.v;
            if ($$3 != null && $$3.c() == ews.a.b) {
               ir $$4 = ((ewq)$$3).a();
               dtc $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == dbx.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dtg $$6 = new dtg(this.k.r, $$4, false);
                  jn<dfc> $$7 = this.k.r.I_().d(li.f);
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
      this.k.aJ().a("center");
      boolean $$2 = this.ay();
      this.k.aJ().b("camera");
      ffu $$3 = this.N;
      brv $$4 = (brv)(this.k.ao() == null ? this.k.s : this.k.ao());
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), this.k.r.s().a($$4) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aD() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      fbc $$7 = new fbc();
      this.a($$7, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.k.m.aj().c().floatValue();
      float $$9 = aym.i($$0, this.k.s.cX, this.k.s.cW) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.b(brj.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, aym.g / 2.0F, aym.g / 2.0F);
         float $$13 = ((float)this.q + $$0) * (float)$$10 * (float) (Math.PI / 180.0);
         $$6.rotate($$13, $$12);
         $$6.scale(1.0F / $$11, 1.0F, 1.0F);
         $$6.rotate(-$$13, $$12);
      }

      this.a($$6);
      Matrix4f $$14 = new Matrix4f().rotationXYZ($$3.d() * (float) (Math.PI / 180.0), $$3.e() * (float) (Math.PI / 180.0) + (float) Math.PI, 0.0F);
      this.k.f.a($$3.b(), $$14, this.a(Math.max($$5, (double)this.k.m.ah().c().intValue())));
      this.k.f.a($$0, $$1, $$2, $$3, this, this.A, $$14, $$6);
      this.k.aJ().b("hand");
      if (this.v) {
         RenderSystem.clear(256, fgj.a);
         this.a($$3, $$0, $$14);
      }

      this.k.aJ().c();
   }

   public void i() {
      this.G = null;
      this.o.a();
      this.N.o();
      this.y = false;
   }

   public fid j() {
      return this.o;
   }

   public void a(cuh $$0) {
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
         fbc $$11 = new fbc();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * aym.e(aym.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * aym.e(aym.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * aym.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * aym.e(aym.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * aym.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * aym.b($$4 * 8.0F)));
         gfg.a $$13 = this.p.c();
         this.k.as().a(this.G, cue.i, 15728880, gqp.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(fia $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = aym.i($$1, 2.0F, 1.0F);
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
      $$0.a(e, 0, 0, -90, 0.0F, 0.0F, $$2, $$3, $$2, $$3);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.c().b();
   }

   public fgj k() {
      return this.k;
   }

   public float c(float $$0) {
      return aym.i($$0, this.u, this.t);
   }

   public float l() {
      return this.n;
   }

   public ffu m() {
      return this.N;
   }

   public gff n() {
      return this.A;
   }

   public gqp o() {
      return this.B;
   }

   @Nullable
   public static gfu p() {
      return P;
   }

   @Nullable
   public static gfu q() {
      return Q;
   }

   @Nullable
   public static gfu r() {
      return R;
   }

   @Nullable
   public static gfu s() {
      return S;
   }

   @Nullable
   public static gfu t() {
      return T;
   }

   @Nullable
   public static gfu u() {
      return U;
   }

   @Nullable
   public static gfu v() {
      return V;
   }

   @Nullable
   public static gfu w() {
      return W;
   }

   @Nullable
   public static gfu x() {
      return X;
   }

   @Nullable
   public static gfu y() {
      return Y;
   }

   @Nullable
   public static gfu z() {
      return Z;
   }

   @Nullable
   public static gfu A() {
      return aa;
   }

   @Nullable
   public static gfu B() {
      return ab;
   }

   @Nullable
   public static gfu C() {
      return ac;
   }

   @Nullable
   public static gfu D() {
      return ad;
   }

   @Nullable
   public static gfu E() {
      return ae;
   }

   @Nullable
   public static gfu F() {
      return af;
   }

   @Nullable
   public static gfu G() {
      return ag;
   }

   @Nullable
   public static gfu H() {
      return ah;
   }

   @Nullable
   public static gfu I() {
      return ai;
   }

   @Nullable
   public static gfu J() {
      return aj;
   }

   @Nullable
   public static gfu K() {
      return ak;
   }

   @Nullable
   public static gfu L() {
      return al;
   }

   @Nullable
   public static gfu M() {
      return am;
   }

   @Nullable
   public static gfu N() {
      return an;
   }

   @Nullable
   public static gfu O() {
      return ao;
   }

   @Nullable
   public static gfu P() {
      return ap;
   }

   @Nullable
   public static gfu Q() {
      return aq;
   }

   @Nullable
   public static gfu R() {
      return ar;
   }

   @Nullable
   public static gfu S() {
      return as;
   }

   @Nullable
   public static gfu T() {
      return at;
   }

   @Nullable
   public static gfu U() {
      return au;
   }

   @Nullable
   public static gfu V() {
      return av;
   }

   @Nullable
   public static gfu W() {
      return aw;
   }

   @Nullable
   public static gfu X() {
      return ax;
   }

   @Nullable
   public static gfu Y() {
      return ay;
   }

   @Nullable
   public static gfu Z() {
      return az;
   }

   @Nullable
   public static gfu aa() {
      return aA;
   }

   @Nullable
   public static gfu ab() {
      return aB;
   }

   @Nullable
   public static gfu ac() {
      return aC;
   }

   @Nullable
   public static gfu ad() {
      return aD;
   }

   @Nullable
   public static gfu ae() {
      return aE;
   }

   @Nullable
   public static gfu af() {
      return aF;
   }

   @Nullable
   public static gfu ag() {
      return aG;
   }

   @Nullable
   public static gfu ah() {
      return aH;
   }

   @Nullable
   public static gfu ai() {
      return aI;
   }

   @Nullable
   public static gfu aj() {
      return aJ;
   }

   @Nullable
   public static gfu ak() {
      return aK;
   }

   @Nullable
   public static gfu al() {
      return aL;
   }

   @Nullable
   public static gfu am() {
      return aM;
   }

   @Nullable
   public static gfu an() {
      return aN;
   }

   @Nullable
   public static gfu ao() {
      return aO;
   }

   @Nullable
   public static gfu ap() {
      return aP;
   }

   @Nullable
   public static gfu aq() {
      return aQ;
   }

   @Nullable
   public static gfu ar() {
      return aR;
   }

   @Nullable
   public static gfu as() {
      return aS;
   }

   @Nullable
   public static gfu at() {
      return aT;
   }

   @Nullable
   public static gfu au() {
      return aU;
   }

   public static record a(aug a, Map<akt, aub> c) implements aug {
      @Override
      public Optional<aub> getResource(akt $$0) {
         aub $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<akt, aub> b() {
         return this.c;
      }
   }
}
