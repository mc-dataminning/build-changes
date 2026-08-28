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

public class gdw implements AutoCloseable {
   private static final akk e = new akk("textures/misc/nausea.png");
   private static final akk f = new akk("shaders/post/blur.json");
   private static final float g = 10.0F;
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float a = 0.05F;
   private static final float j = 1000.0F;
   final fft k;
   private final atw l;
   private final ayo m = ayo.a();
   private float n;
   public final gdz b;
   private final fhi o;
   private final gej p;
   private int q;
   private float r;
   private float s;
   private float t;
   private float u;
   private boolean v = true;
   private boolean w = true;
   private long x;
   private boolean y;
   private long z = ac.c();
   private final gec A;
   private final gpf B = new gpf();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int c = 40;
   @Nullable
   private cuc G;
   private int H;
   private float I;
   private float J;
   @Nullable
   geg K;
   @Nullable
   private geg L;
   private boolean M;
   private final ffe N = new ffe();
   public ger d;
   private final Map<String, ger> O = Maps.newHashMap();
   @Nullable
   private static ger P;
   @Nullable
   private static ger Q;
   @Nullable
   private static ger R;
   @Nullable
   private static ger S;
   @Nullable
   private static ger T;
   @Nullable
   private static ger U;
   @Nullable
   private static ger V;
   @Nullable
   private static ger W;
   @Nullable
   private static ger X;
   @Nullable
   private static ger Y;
   @Nullable
   private static ger Z;
   @Nullable
   private static ger aa;
   @Nullable
   private static ger ab;
   @Nullable
   private static ger ac;
   @Nullable
   private static ger ad;
   @Nullable
   private static ger ae;
   @Nullable
   private static ger af;
   @Nullable
   private static ger ag;
   @Nullable
   private static ger ah;
   @Nullable
   private static ger ai;
   @Nullable
   private static ger aj;
   @Nullable
   private static ger ak;
   @Nullable
   private static ger al;
   @Nullable
   private static ger am;
   @Nullable
   private static ger an;
   @Nullable
   private static ger ao;
   @Nullable
   private static ger ap;
   @Nullable
   private static ger aq;
   @Nullable
   private static ger ar;
   @Nullable
   private static ger as;
   @Nullable
   private static ger at;
   @Nullable
   private static ger au;
   @Nullable
   private static ger av;
   @Nullable
   private static ger aw;
   @Nullable
   private static ger ax;
   @Nullable
   private static ger ay;
   @Nullable
   private static ger az;
   @Nullable
   private static ger aA;
   @Nullable
   private static ger aB;
   @Nullable
   private static ger aC;
   @Nullable
   private static ger aD;
   @Nullable
   private static ger aE;
   @Nullable
   private static ger aF;
   @Nullable
   private static ger aG;
   @Nullable
   private static ger aH;
   @Nullable
   private static ger aI;
   @Nullable
   private static ger aJ;
   @Nullable
   private static ger aK;
   @Nullable
   private static ger aL;
   @Nullable
   private static ger aM;
   @Nullable
   private static ger aN;
   @Nullable
   private static ger aO;
   @Nullable
   private static ger aP;
   @Nullable
   private static ger aQ;
   @Nullable
   private static ger aR;
   @Nullable
   private static ger aS;
   @Nullable
   private static ger aT;
   @Nullable
   private static ger aU;

   public gdw(fft $$0, gdz $$1, atw $$2, gej $$3) {
      this.k = $$0;
      this.l = $$2;
      this.b = $$1;
      this.o = new fhi($$0.aa(), $$0.aG());
      this.A = new gec(this, $$0);
      this.p = $$3;
      this.K = null;
   }

   @Override
   public void close() {
      this.A.close();
      this.o.close();
      this.B.close();
      this.b();
      this.au();
      if (this.L != null) {
         this.L.close();
      }

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

   public void a(@Nullable bsg $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cjc) {
         this.a(new akk("shaders/post/creeper.json"));
      } else if ($$0 instanceof ckb) {
         this.a(new akk("shaders/post/spider.json"));
      } else if ($$0 instanceof cjg) {
         this.a(new akk("shaders/post/invert.json"));
      }
   }

   private void a(akk $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new geg(this.k.aa(), this.l, this.k.h(), $$0);
         this.K.a(this.k.aO().k(), this.k.aO().l());
         this.M = true;
      } catch (IOException var3) {
         h.warn("Failed to load shader: {}", $$0, var3);
         this.M = false;
      } catch (JsonSyntaxException var4) {
         h.warn("Failed to parse shader: {}", $$0, var4);
         this.M = false;
      }
   }

   private void b(atz $$0) {
      if (this.L != null) {
         this.L.close();
      }

      try {
         this.L = new geg(this.k.aa(), $$0, this.k.h(), f);
         this.L.a(this.k.aO().k(), this.k.aO().l());
      } catch (IOException var3) {
         h.warn("Failed to load shader: {}", f, var3);
      } catch (JsonSyntaxException var4) {
         h.warn("Failed to parse shader: {}", f, var4);
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

   public atq d() {
      return new aub<gdw.a>() {
         protected gdw.a a(atw $$0, bmu $$1) {
            Map<akk, atu> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(faa.a.b.b()) || $$1x.endsWith(faa.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<akk, atu> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new atu($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gdw.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gdw.a($$0, $$3);
         }

         protected void a(gdw.a $$0, atw $$1, bmu $$2) {
            gdw.this.c($$0);
            if (gdw.this.K != null) {
               gdw.this.K.close();
            }

            gdw.this.K = null;
            gdw.this.a(gdw.this.k.an());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(atz $$0) {
      if (this.d != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.d = new ger($$0, "blit_screen", fak.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", fak.n);
         aS = this.a($$0, "rendertype_gui_overlay", fak.n);
         P = this.a($$0, "position", fak.m);
         Q = this.a($$0, "position_color", fak.n);
         R = this.a($$0, "position_color_tex", fak.r);
         S = this.a($$0, "position_tex", fak.q);
         T = this.a($$0, "position_tex_color", fak.s);
         aE = this.a($$0, "rendertype_text", fak.t);
      }
   }

   private ger a(atz $$0, String $$1, far $$2) {
      try {
         ger $$3 = new ger($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void c(atz $$0) {
      RenderSystem.assertOnRenderThread();
      List<faa> $$1 = Lists.newArrayList();
      $$1.addAll(faa.a.b.c().values());
      $$1.addAll(faa.a.a.c().values());
      $$1.forEach(faa::a);
      List<Pair<ger, Consumer<ger>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new ger($$0, "particle", fak.l), (Consumer<ger>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new ger($$0, "position", fak.m), (Consumer<ger>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new ger($$0, "position_color", fak.n), (Consumer<ger>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new ger($$0, "position_color_lightmap", fak.p), (Consumer<ger>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new ger($$0, "position_color_tex", fak.r), (Consumer<ger>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new ger($$0, "position_color_tex_lightmap", fak.t), (Consumer<ger>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new ger($$0, "position_tex", fak.q), (Consumer<ger>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new ger($$0, "position_tex_color", fak.s), (Consumer<ger>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_solid", fak.j), (Consumer<ger>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_cutout_mipped", fak.j), (Consumer<ger>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_cutout", fak.j), (Consumer<ger>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_translucent", fak.j), (Consumer<ger>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_translucent_moving_block", fak.j), (Consumer<ger>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_armor_cutout_no_cull", fak.k), (Consumer<ger>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_solid", fak.k), (Consumer<ger>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_cutout", fak.k), (Consumer<ger>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_cutout_no_cull", fak.k), (Consumer<ger>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_cutout_no_cull_z_offset", fak.k), (Consumer<ger>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_item_entity_translucent_cull", fak.k), (Consumer<ger>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_translucent_cull", fak.k), (Consumer<ger>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_translucent", fak.k), (Consumer<ger>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_translucent_emissive", fak.k), (Consumer<ger>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_smooth_cutout", fak.k), (Consumer<ger>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_beacon_beam", fak.j), (Consumer<ger>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_decal", fak.k), (Consumer<ger>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_no_outline", fak.k), (Consumer<ger>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_shadow", fak.k), (Consumer<ger>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_alpha", fak.k), (Consumer<ger>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_eyes", fak.k), (Consumer<ger>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_energy_swirl", fak.k), (Consumer<ger>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_leash", fak.p), (Consumer<ger>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_water_mask", fak.m), (Consumer<ger>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_outline", fak.r), (Consumer<ger>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_armor_glint", fak.q), (Consumer<ger>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_armor_entity_glint", fak.q), (Consumer<ger>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_glint_translucent", fak.q), (Consumer<ger>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_glint", fak.q), (Consumer<ger>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_glint_direct", fak.q), (Consumer<ger>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_glint", fak.q), (Consumer<ger>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_entity_glint_direct", fak.q), (Consumer<ger>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_text", fak.t), (Consumer<ger>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_text_background", fak.p), (Consumer<ger>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_text_intensity", fak.t), (Consumer<ger>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_text_see_through", fak.t), (Consumer<ger>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_text_background_see_through", fak.p), (Consumer<ger>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_text_intensity_see_through", fak.t), (Consumer<ger>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_lightning", fak.n), (Consumer<ger>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_tripwire", fak.j), (Consumer<ger>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_end_portal", fak.m), (Consumer<ger>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_end_gateway", fak.m), (Consumer<ger>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_clouds", fak.v), (Consumer<ger>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_lines", fak.o), (Consumer<ger>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_crumbling", fak.j), (Consumer<ger>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_gui", fak.n), (Consumer<ger>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_gui_overlay", fak.n), (Consumer<ger>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_gui_text_highlight", fak.n), (Consumer<ger>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_gui_ghost_recipe_overlay", fak.n), (Consumer<ger>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new ger($$0, "rendertype_breeze_wind", fak.k), (Consumer<ger>)$$0x -> at = $$0x));
         this.b($$0);
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((ger)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.au();
      $$2.forEach($$0x -> {
         ger $$1x = (ger)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void au() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(ger::close);
      this.O.clear();
   }

   @Nullable
   public ger a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void e() {
      this.av();
      this.A.a();
      if (this.k.an() == null) {
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
   public geg f() {
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
      bsg $$1 = this.k.an();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aI().a("pick");
            double $$2 = this.k.s.gz();
            double $$3 = this.k.s.gA();
            ewd $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof ewc $$5 ? $$5.a() : null;
            this.k.aI().c();
         }
      }
   }

   private ewd a(bsg $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = ayg.k($$4);
      ewf $$6 = $$0.k($$3);
      ewd $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != ewd.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      ewf $$9 = $$0.g($$3);
      ewf $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      ewa $$12 = $$0.cL().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      ewc $$13 = cne.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bA(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static ewd a(ewd $$0, ewf $$1, double $$2) {
      ewf $$3 = $$0.e();
      if (!$$3.a((jt)$$1, $$2)) {
         ewf $$4 = $$0.e();
         jf $$5 = jf.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return ewb.a($$4, $$5, ja.a($$4));
      } else {
         return $$0;
      }
   }

   private void av() {
      float $$0 = 1.0F;
      if (this.k.an() instanceof gdc $$1) {
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

   private double a(ffe $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)ayg.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof btb && ((btb)$$0.g()).ey()) {
            float $$4 = Math.min((float)((btb)$$0.g()).aQ + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eoj $$5 = $$0.k();
         if ($$5 == eoj.a || $$5 == eoj.b) {
            $$3 *= ayg.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fam $$0, float $$1) {
      if (this.k.an() instanceof btb $$2) {
         float $$3 = (float)$$2.aO - $$1;
         if ($$2.ey()) {
            float $$4 = Math.min((float)$$2.aQ + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aP;
         $$3 = ayg.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eF();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fam $$0, float $$1) {
      if (this.k.an() instanceof cmk) {
         cmk $$2 = (cmk)this.k.an();
         float $$3 = $$2.Z - $$2.Y;
         float $$4 = -($$2.Z + $$3 * $$1);
         float $$5 = ayg.i($$1, $$2.cg, $$2.ch);
         $$0.a(ayg.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(ayg.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(ayg.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(ayg.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
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

   private void a(ffe $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         fam $$3 = new fam();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         RenderSystem.applyModelViewMatrix();
         this.a($$3, $$1);
         if (this.k.m.ab().c()) {
            this.b($$3, $$1);
         }

         boolean $$5 = this.k.an() instanceof btb && ((btb)this.k.an()).fI();
         if (this.k.m.aA().a() && !$$5 && !this.k.m.Y && this.k.q.j() != dcc.d) {
            this.A.c();
            this.b.a($$1, $$3, this.p.c(), this.k.s, this.k.ap().a(this.k.s, $$1));
            this.A.b();
         }

         $$4.popMatrix();
         RenderSystem.applyModelViewMatrix();
         $$3.b();
         if (this.k.m.aA().a() && !$$5) {
            gen.a(this.k, $$3);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, fau.a);
   }

   public Matrix4f a(double $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.D != 1.0F) {
         $$1.translate(this.E, -this.F, 0.0F);
         $$1.scale(this.D, this.D, 1.0F);
      }

      return $$1.perspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.k.aO().k() / (float)this.k.aO().l(), 0.05F, this.g());
   }

   public float g() {
      return this.n * 4.0F;
   }

   public static float a(btb $$0, float $$1) {
      bro $$2 = $$0.c(brq.p);
      return !$$2.a(200) ? 1.0F : 0.7F + ayg.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.k.aB() && this.k.m.n && (!this.k.m.Z().c() || !this.k.n.d())) {
         if (ac.c() - this.z > 500L) {
            this.k.b(false);
         }
      } else {
         this.z = ac.c();
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
            this.aw();
            this.k.f.b();
            if (this.K != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$3);
            }

            this.k.h().a(true);
         }

         ezq $$7 = this.k.aO();
         RenderSystem.clear(256, fft.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, fau.b);
         Matrix4fStack $$9 = RenderSystem.getModelViewStack();
         $$9.pushMatrix();
         $$9.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ezi.d();
         fhf $$10 = new fhf(this.k, this.p.c());
         if ($$4 && $$2 && this.k.r != null) {
            this.k.aI().b("gui");
            if (this.k.s != null) {
               float $$11 = ayg.i($$3, this.k.s.cK, this.k.s.cJ);
               float $$12 = this.k.m.aj().c().floatValue();
               if ($$11 > 0.0F && this.k.s.b(brq.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.k.m.Y) {
               this.a(this.k.aO().o(), this.k.aO().p(), $$3);
            }

            this.k.l.a($$10, $$3);
            RenderSystem.clear(256, fft.a);
            this.k.aI().c();
         }

         if (this.k.aL() != null) {
            try {
               this.k.aL().a($$10, $$5, $$6, this.k.au());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.k.aL().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.k.y != null) {
            try {
               this.k.y.c($$10, $$5, $$6, this.k.au());
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
                  this.k.y.z();
               }
            } catch (Throwable var16) {
               o $$20 = o.a(var16, "Narrating screen");
               p $$21 = $$20.a("Screen details");
               $$21.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               throw new y($$20);
            }
         }

         if ($$4 && $$2 && this.k.r != null) {
            this.k.l.b($$10, $$3);
         }

         if ($$4) {
            this.k.aI().a("toasts");
            this.k.ax().a($$10);
            this.k.aI().c();
         }

         $$10.e();
         $$9.popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void aw() {
      if (!this.y && this.k.T()) {
         long $$0 = ac.c();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gtq $$1 = this.k.V();
            if ($$1 != null && !$$1.ah()) {
               $$1.C().ifPresent($$0x -> {
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
         ezn $$1 = fgd.a(this.k.h());
         ac.h().execute(() -> {
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

            try (ezn $$6 = new ezn(64, 64, false)) {
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

   private boolean ax() {
      if (!this.w) {
         return false;
      } else {
         bsg $$0 = this.k.an();
         boolean $$1 = $$0 instanceof cmk && !this.k.m.Y;
         if ($$1 && !((cmk)$$0).ga().e) {
            cuc $$2 = ((btb)$$0).eU();
            ewd $$3 = this.k.v;
            if ($$3 != null && $$3.c() == ewd.a.b) {
               ja $$4 = ((ewb)$$3).a();
               dsk $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == dcc.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dso $$6 = new dso(this.k.r, $$4, false);
                  jw<dfh> $$7 = this.k.r.H_().d(lr.f);
                  $$1 = !$$2.e() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1) {
      this.A.a($$0);
      if (this.k.an() == null) {
         this.k.a(this.k.s);
      }

      this.b($$0);
      this.k.aI().a("center");
      boolean $$2 = this.ax();
      this.k.aI().b("camera");
      ffe $$3 = this.N;
      bsg $$4 = (bsg)(this.k.an() == null ? this.k.s : this.k.an());
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), this.k.r.s().a($$4) ? 1.0F : $$0);
      this.n = (float)(this.k.m.aD() * 16);
      double $$5 = this.a($$3, $$0, true);
      Matrix4f $$6 = this.a($$5);
      fam $$7 = new fam();
      this.a($$7, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$7, $$3.p());
      }

      $$6.mul($$7.c().a());
      float $$8 = this.k.m.aj().c().floatValue();
      float $$9 = ayg.i($$0, this.k.s.cK, this.k.s.cJ) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.k.s.b(brq.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         Vector3f $$12 = new Vector3f(0.0F, ayg.g / 2.0F, ayg.g / 2.0F);
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
         RenderSystem.clear(256, fft.a);
         this.a($$3, $$0, $$14);
      }

      this.k.aI().c();
   }

   public void h() {
      this.G = null;
      this.o.a();
      this.N.o();
      this.y = false;
   }

   public fhi i() {
      return this.o;
   }

   public void a(cuc $$0) {
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
         fam $$11 = new fam();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * ayg.e(ayg.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * ayg.e(ayg.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * ayg.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * ayg.e(ayg.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * ayg.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * ayg.b($$4 * 8.0F)));
         ged.a $$13 = this.p.c();
         this.k.ar().a(this.G, ctz.i, 15728880, gpf.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(fhf $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = ayg.i($$1, 2.0F, 1.0F);
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

   public fft j() {
      return this.k;
   }

   public float c(float $$0) {
      return ayg.i($$0, this.u, this.t);
   }

   public float k() {
      return this.n;
   }

   public ffe l() {
      return this.N;
   }

   public gec m() {
      return this.A;
   }

   public gpf n() {
      return this.B;
   }

   @Nullable
   public static ger o() {
      return P;
   }

   @Nullable
   public static ger p() {
      return Q;
   }

   @Nullable
   public static ger q() {
      return R;
   }

   @Nullable
   public static ger r() {
      return S;
   }

   @Nullable
   public static ger s() {
      return T;
   }

   @Nullable
   public static ger t() {
      return U;
   }

   @Nullable
   public static ger u() {
      return V;
   }

   @Nullable
   public static ger v() {
      return W;
   }

   @Nullable
   public static ger w() {
      return X;
   }

   @Nullable
   public static ger x() {
      return Y;
   }

   @Nullable
   public static ger y() {
      return Z;
   }

   @Nullable
   public static ger z() {
      return aa;
   }

   @Nullable
   public static ger A() {
      return ab;
   }

   @Nullable
   public static ger B() {
      return ac;
   }

   @Nullable
   public static ger C() {
      return ad;
   }

   @Nullable
   public static ger D() {
      return ae;
   }

   @Nullable
   public static ger E() {
      return af;
   }

   @Nullable
   public static ger F() {
      return ag;
   }

   @Nullable
   public static ger G() {
      return ah;
   }

   @Nullable
   public static ger H() {
      return ai;
   }

   @Nullable
   public static ger I() {
      return aj;
   }

   @Nullable
   public static ger J() {
      return ak;
   }

   @Nullable
   public static ger K() {
      return al;
   }

   @Nullable
   public static ger L() {
      return am;
   }

   @Nullable
   public static ger M() {
      return an;
   }

   @Nullable
   public static ger N() {
      return ao;
   }

   @Nullable
   public static ger O() {
      return ap;
   }

   @Nullable
   public static ger P() {
      return aq;
   }

   @Nullable
   public static ger Q() {
      return ar;
   }

   @Nullable
   public static ger R() {
      return as;
   }

   @Nullable
   public static ger S() {
      return at;
   }

   @Nullable
   public static ger T() {
      return au;
   }

   @Nullable
   public static ger U() {
      return av;
   }

   @Nullable
   public static ger V() {
      return aw;
   }

   @Nullable
   public static ger W() {
      return ax;
   }

   @Nullable
   public static ger X() {
      return ay;
   }

   @Nullable
   public static ger Y() {
      return az;
   }

   @Nullable
   public static ger Z() {
      return aA;
   }

   @Nullable
   public static ger aa() {
      return aB;
   }

   @Nullable
   public static ger ab() {
      return aC;
   }

   @Nullable
   public static ger ac() {
      return aD;
   }

   @Nullable
   public static ger ad() {
      return aE;
   }

   @Nullable
   public static ger ae() {
      return aF;
   }

   @Nullable
   public static ger af() {
      return aG;
   }

   @Nullable
   public static ger ag() {
      return aH;
   }

   @Nullable
   public static ger ah() {
      return aI;
   }

   @Nullable
   public static ger ai() {
      return aJ;
   }

   @Nullable
   public static ger aj() {
      return aK;
   }

   @Nullable
   public static ger ak() {
      return aL;
   }

   @Nullable
   public static ger al() {
      return aM;
   }

   @Nullable
   public static ger am() {
      return aN;
   }

   @Nullable
   public static ger an() {
      return aO;
   }

   @Nullable
   public static ger ao() {
      return aP;
   }

   @Nullable
   public static ger ap() {
      return aQ;
   }

   @Nullable
   public static ger aq() {
      return aR;
   }

   @Nullable
   public static ger ar() {
      return aS;
   }

   @Nullable
   public static ger as() {
      return aT;
   }

   @Nullable
   public static ger at() {
      return aU;
   }

   public static record a(atz a, Map<akk, atu> c) implements atz {
      @Override
      public Optional<atu> getResource(akk $$0) {
         atu $$1 = this.c.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }

      public Map<akk, atu> b() {
         return this.c;
      }
   }
}
