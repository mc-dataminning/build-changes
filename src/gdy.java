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

public class gdy implements AutoCloseable {
   private static final akk f = new akk("textures/misc/nausea.png");
   private static final akk g = new akk("shaders/post/blur.json");
   public static final int a = 10;
   static final Logger h = LogUtils.getLogger();
   private static final boolean i = false;
   public static final float b = 0.05F;
   private static final float j = 1000.0F;
   final ffw k;
   private final atw l;
   private final ayo m = ayo.a();
   private float n;
   public final geb c;
   private final fhk o;
   private final gel p;
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
   private final gee A;
   private final gph B = new gph();
   private boolean C;
   private float D = 1.0F;
   private float E;
   private float F;
   public static final int d = 40;
   @Nullable
   private cud G;
   private int H;
   private float I;
   private float J;
   @Nullable
   gei K;
   @Nullable
   private gei L;
   private boolean M;
   private final ffg N = new ffg();
   public get e;
   private final Map<String, get> O = Maps.newHashMap();
   @Nullable
   private static get P;
   @Nullable
   private static get Q;
   @Nullable
   private static get R;
   @Nullable
   private static get S;
   @Nullable
   private static get T;
   @Nullable
   private static get U;
   @Nullable
   private static get V;
   @Nullable
   private static get W;
   @Nullable
   private static get X;
   @Nullable
   private static get Y;
   @Nullable
   private static get Z;
   @Nullable
   private static get aa;
   @Nullable
   private static get ab;
   @Nullable
   private static get ac;
   @Nullable
   private static get ad;
   @Nullable
   private static get ae;
   @Nullable
   private static get af;
   @Nullable
   private static get ag;
   @Nullable
   private static get ah;
   @Nullable
   private static get ai;
   @Nullable
   private static get aj;
   @Nullable
   private static get ak;
   @Nullable
   private static get al;
   @Nullable
   private static get am;
   @Nullable
   private static get an;
   @Nullable
   private static get ao;
   @Nullable
   private static get ap;
   @Nullable
   private static get aq;
   @Nullable
   private static get ar;
   @Nullable
   private static get as;
   @Nullable
   private static get at;
   @Nullable
   private static get au;
   @Nullable
   private static get av;
   @Nullable
   private static get aw;
   @Nullable
   private static get ax;
   @Nullable
   private static get ay;
   @Nullable
   private static get az;
   @Nullable
   private static get aA;
   @Nullable
   private static get aB;
   @Nullable
   private static get aC;
   @Nullable
   private static get aD;
   @Nullable
   private static get aE;
   @Nullable
   private static get aF;
   @Nullable
   private static get aG;
   @Nullable
   private static get aH;
   @Nullable
   private static get aI;
   @Nullable
   private static get aJ;
   @Nullable
   private static get aK;
   @Nullable
   private static get aL;
   @Nullable
   private static get aM;
   @Nullable
   private static get aN;
   @Nullable
   private static get aO;
   @Nullable
   private static get aP;
   @Nullable
   private static get aQ;
   @Nullable
   private static get aR;
   @Nullable
   private static get aS;
   @Nullable
   private static get aT;
   @Nullable
   private static get aU;

   public gdy(ffw $$0, geb $$1, atw $$2, gel $$3) {
      this.k = $$0;
      this.l = $$2;
      this.c = $$1;
      this.o = new fhk($$0.aa(), $$0.aF());
      this.A = new gee(this, $$0);
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
   }

   public void c() {
      this.M = !this.M;
   }

   public void a(@Nullable bsh $$0) {
      if (this.K != null) {
         this.K.close();
      }

      this.K = null;
      if ($$0 instanceof cjd) {
         this.a(new akk("shaders/post/creeper.json"));
      } else if ($$0 instanceof ckc) {
         this.a(new akk("shaders/post/spider.json"));
      } else if ($$0 instanceof cjh) {
         this.a(new akk("shaders/post/invert.json"));
      }
   }

   private void a(akk $$0) {
      if (this.K != null) {
         this.K.close();
      }

      try {
         this.K = new gei(this.k.aa(), this.l, this.k.h(), $$0);
         this.K.a(this.k.aM().k(), this.k.aM().l());
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
         this.L = new gei(this.k.aa(), $$0, this.k.h(), g);
         this.L.a(this.k.aM().k(), this.k.aM().l());
      } catch (IOException var3) {
         h.warn("Failed to load shader: {}", g, var3);
      } catch (JsonSyntaxException var4) {
         h.warn("Failed to parse shader: {}", g, var4);
      }
   }

   public void a(float $$0) {
      float $$1 = (float)this.k.m.q();
      if (this.L != null && $$1 >= 1.0F) {
         RenderSystem.enableBlend();
         this.L.a("Radius", $$1);
         this.L.a($$0);
         RenderSystem.disableBlend();
      }
   }

   public atq d() {
      return new aub<gdy.a>() {
         protected gdy.a a(atw $$0, bmv $$1) {
            Map<akk, atu> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(fac.a.b.b()) || $$1x.endsWith(fac.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<akk, atu> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new atu($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  gdy.h.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new gdy.a($$0, $$3);
         }

         protected void a(gdy.a $$0, atw $$1, bmv $$2) {
            gdy.this.c($$0);
            if (gdy.this.K != null) {
               gdy.this.K.close();
            }

            gdy.this.K = null;
            gdy.this.a(gdy.this.k.an());
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(atz $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new get($$0, "blit_screen", fam.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aR = this.a($$0, "rendertype_gui", fam.n);
         aS = this.a($$0, "rendertype_gui_overlay", fam.n);
         P = this.a($$0, "position", fam.m);
         Q = this.a($$0, "position_color", fam.n);
         R = this.a($$0, "position_color_tex", fam.r);
         S = this.a($$0, "position_tex", fam.q);
         T = this.a($$0, "position_tex_color", fam.s);
         aE = this.a($$0, "rendertype_text", fam.t);
      }
   }

   private get a(atz $$0, String $$1, fat $$2) {
      try {
         get $$3 = new get($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void c(atz $$0) {
      RenderSystem.assertOnRenderThread();
      List<fac> $$1 = Lists.newArrayList();
      $$1.addAll(fac.a.b.c().values());
      $$1.addAll(fac.a.a.c().values());
      $$1.forEach(fac::a);
      List<Pair<get, Consumer<get>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new get($$0, "particle", fam.l), (Consumer<get>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new get($$0, "position", fam.m), (Consumer<get>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new get($$0, "position_color", fam.n), (Consumer<get>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new get($$0, "position_color_lightmap", fam.p), (Consumer<get>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new get($$0, "position_color_tex", fam.r), (Consumer<get>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new get($$0, "position_color_tex_lightmap", fam.t), (Consumer<get>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new get($$0, "position_tex", fam.q), (Consumer<get>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new get($$0, "position_tex_color", fam.s), (Consumer<get>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_solid", fam.j), (Consumer<get>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_cutout_mipped", fam.j), (Consumer<get>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_cutout", fam.j), (Consumer<get>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_translucent", fam.j), (Consumer<get>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_translucent_moving_block", fam.j), (Consumer<get>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_armor_cutout_no_cull", fam.k), (Consumer<get>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_solid", fam.k), (Consumer<get>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_cutout", fam.k), (Consumer<get>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_cutout_no_cull", fam.k), (Consumer<get>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_cutout_no_cull_z_offset", fam.k), (Consumer<get>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_item_entity_translucent_cull", fam.k), (Consumer<get>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_translucent_cull", fam.k), (Consumer<get>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_translucent", fam.k), (Consumer<get>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_translucent_emissive", fam.k), (Consumer<get>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_smooth_cutout", fam.k), (Consumer<get>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_beacon_beam", fam.j), (Consumer<get>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_decal", fam.k), (Consumer<get>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_no_outline", fam.k), (Consumer<get>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_shadow", fam.k), (Consumer<get>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_alpha", fam.k), (Consumer<get>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_eyes", fam.k), (Consumer<get>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_energy_swirl", fam.k), (Consumer<get>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_leash", fam.p), (Consumer<get>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_water_mask", fam.m), (Consumer<get>)$$0x -> av = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_outline", fam.r), (Consumer<get>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_armor_glint", fam.q), (Consumer<get>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_armor_entity_glint", fam.q), (Consumer<get>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_glint_translucent", fam.q), (Consumer<get>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_glint", fam.q), (Consumer<get>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_glint_direct", fam.q), (Consumer<get>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_glint", fam.q), (Consumer<get>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_entity_glint_direct", fam.q), (Consumer<get>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_text", fam.t), (Consumer<get>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_text_background", fam.p), (Consumer<get>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_text_intensity", fam.t), (Consumer<get>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_text_see_through", fam.t), (Consumer<get>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_text_background_see_through", fam.p), (Consumer<get>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_text_intensity_see_through", fam.t), (Consumer<get>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_lightning", fam.n), (Consumer<get>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_tripwire", fam.j), (Consumer<get>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_end_portal", fam.m), (Consumer<get>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_end_gateway", fam.m), (Consumer<get>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_clouds", fam.v), (Consumer<get>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_lines", fam.o), (Consumer<get>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_crumbling", fam.j), (Consumer<get>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_gui", fam.n), (Consumer<get>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_gui_overlay", fam.n), (Consumer<get>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_gui_text_highlight", fam.n), (Consumer<get>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_gui_ghost_recipe_overlay", fam.n), (Consumer<get>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new get($$0, "rendertype_breeze_wind", fam.k), (Consumer<get>)$$0x -> at = $$0x));
         this.b($$0);
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((get)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.au();
      $$2.forEach($$0x -> {
         get $$1x = (get)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void au() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(get::close);
      this.O.clear();
   }

   @Nullable
   public get a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void e() {
      this.av();
      this.A.a();
      if (this.k.an() == null) {
         this.k.a(this.k.s);
      }

      this.N.a();
      this.c.a();
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
   public gei f() {
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
      bsh $$1 = this.k.an();
      if ($$1 != null) {
         if (this.k.r != null && this.k.s != null) {
            this.k.aH().a("pick");
            double $$2 = this.k.s.gA();
            double $$3 = this.k.s.gB();
            ewf $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.v = $$4;
            this.k.u = $$4 instanceof ewe $$5 ? $$5.a() : null;
            this.k.aH().c();
         }
      }
   }

   private ewf a(bsh $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = ayg.k($$4);
      ewh $$6 = $$0.k($$3);
      ewf $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != ewf.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      ewh $$9 = $$0.g($$3);
      ewh $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      ewc $$12 = $$0.cM().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      ewe $$13 = cnf.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.N_() && $$0x.bB(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static ewf a(ewf $$0, ewh $$1, double $$2) {
      ewh $$3 = $$0.e();
      if (!$$3.a((jt)$$1, $$2)) {
         ewh $$4 = $$0.e();
         jf $$5 = jf.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return ewd.a($$4, $$5, ja.a($$4));
      } else {
         return $$0;
      }
   }

   private void av() {
      float $$0 = 1.0F;
      if (this.k.an() instanceof gde $$1) {
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

   private double a(ffg $$0, float $$1, boolean $$2) {
      if (this.C) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.k.m.ah().c().intValue();
            $$3 *= (double)ayg.i($$1, this.s, this.r);
         }

         if ($$0.g() instanceof btc && ((btc)$$0.g()).ez()) {
            float $$4 = Math.min((float)((btc)$$0.g()).aR + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         eol $$5 = $$0.k();
         if ($$5 == eol.a || $$5 == eol.b) {
            $$3 *= ayg.d(this.k.m.ak().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fao $$0, float $$1) {
      if (this.k.an() instanceof btc $$2) {
         float $$3 = (float)$$2.aP - $$1;
         if ($$2.ez()) {
            float $$4 = Math.min((float)$$2.aR + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aQ;
         $$3 = ayg.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eG();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.k.m.ao().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fao $$0, float $$1) {
      if (this.k.an() instanceof cml) {
         cml $$2 = (cml)this.k.an();
         float $$3 = $$2.Z - $$2.Y;
         float $$4 = -($$2.Z + $$3 * $$1);
         float $$5 = ayg.i($$1, $$2.ch, $$2.ci);
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
      this.a(ffn.a);
      this.D = 1.0F;
   }

   private void a(ffg $$0, float $$1, Matrix4f $$2) {
      if (!this.C) {
         this.a(this.a(this.a($$0, $$1, false)));
         fao $$3 = new fao();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         RenderSystem.applyModelViewMatrix();
         this.a($$3, $$1);
         if (this.k.m.ab().c()) {
            this.b($$3, $$1);
         }

         boolean $$5 = this.k.an() instanceof btc && ((btc)this.k.an()).fJ();
         if (this.k.m.aA().a() && !$$5 && !this.k.m.Y && this.k.q.j() != dcd.d) {
            this.A.c();
            this.c.a($$1, $$3, this.p.c(), this.k.s, this.k.ap().a(this.k.s, $$1));
            this.A.b();
         }

         $$4.popMatrix();
         RenderSystem.applyModelViewMatrix();
         $$3.b();
         if (this.k.m.aA().a() && !$$5) {
            gep.a(this.k, $$3);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, faw.a);
   }

   public Matrix4f a(double $$0) {
      Matrix4f $$1 = new Matrix4f();
      if (this.D != 1.0F) {
         $$1.translate(this.E, -this.F, 0.0F);
         $$1.scale(this.D, this.D, 1.0F);
      }

      return $$1.perspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.k.aM().k() / (float)this.k.aM().l(), 0.05F, this.g());
   }

   public float g() {
      return this.n * 4.0F;
   }

   public static float a(btc $$0, float $$1) {
      brp $$2 = $$0.c(brr.p);
      return !$$2.a(200) ? 1.0F : 0.7F + ayg.a(((float)$$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(ffn $$0, boolean $$1) {
      if (!this.k.ay() && this.k.m.n && (!this.k.m.Z().c() || !this.k.n.d())) {
         if (ac.c() - this.z > 500L) {
            this.k.b(false);
         }
      } else {
         this.z = ac.c();
      }

      if (!this.k.x) {
         boolean $$2 = this.k.c();
         int $$3 = (int)(this.k.n.e() * (double)this.k.aM().o() / (double)this.k.aM().m());
         int $$4 = (int)(this.k.n.f() * (double)this.k.aM().p() / (double)this.k.aM().n());
         RenderSystem.viewport(0, 0, this.k.aM().k(), this.k.aM().l());
         if ($$2 && $$1 && this.k.r != null) {
            this.k.aH().a("level");
            this.a($$0);
            this.aw();
            this.k.f.b();
            if (this.K != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.K.a($$0.a());
            }

            this.k.h().a(true);
         }

         ezs $$5 = this.k.aM();
         RenderSystem.clear(256, ffw.a);
         Matrix4f $$6 = new Matrix4f().setOrtho(0.0F, (float)((double)$$5.k() / $$5.s()), (float)((double)$$5.l() / $$5.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$6, faw.b);
         Matrix4fStack $$7 = RenderSystem.getModelViewStack();
         $$7.pushMatrix();
         $$7.translation(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         ezk.d();
         fhh $$8 = new fhh(this.k, this.p.c());
         if ($$2 && $$1 && this.k.r != null) {
            this.k.aH().b("gui");
            if (this.k.s != null) {
               float $$9 = ayg.i($$0.a(false), this.k.s.cK, this.k.s.cJ);
               float $$10 = this.k.m.aj().c().floatValue();
               if ($$9 > 0.0F && this.k.s.b(brr.i) && $$10 < 1.0F) {
                  this.a($$8, $$9 * (1.0F - $$10));
               }
            }

            if (!this.k.m.Y) {
               this.a(this.k.aM().o(), this.k.aM().p(), $$0.a(false));
            }

            this.k.l.a($$8, $$0);
            RenderSystem.clear(256, ffw.a);
            this.k.aH().c();
         }

         if (this.k.aK() != null) {
            try {
               this.k.aK().a($$8, $$3, $$4, $$0.b());
            } catch (Throwable var15) {
               o $$12 = o.a(var15, "Rendering overlay");
               p $$13 = $$12.a("Overlay render details");
               $$13.a("Overlay name", () -> this.k.aK().getClass().getCanonicalName());
               throw new y($$12);
            }
         } else if ($$2 && this.k.y != null) {
            try {
               this.k.y.c($$8, $$3, $$4, $$0.b());
            } catch (Throwable var14) {
               o $$15 = o.a(var14, "Rendering screen");
               p $$16 = $$15.a("Screen render details");
               $$16.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               $$16.a("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", $$3, $$4, this.k.n.e(), this.k.n.f()));
               $$16.a(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.k.aM().o(),
                        this.k.aM().p(),
                        this.k.aM().k(),
                        this.k.aM().l(),
                        this.k.aM().s()
                     )
               );
               throw new y($$15);
            }

            try {
               if (this.k.y != null) {
                  this.k.y.y();
               }
            } catch (Throwable var13) {
               o $$18 = o.a(var13, "Narrating screen");
               p $$19 = $$18.a("Screen details");
               $$19.a("Screen name", () -> this.k.y.getClass().getCanonicalName());
               throw new y($$18);
            }
         }

         if ($$2 && $$1 && this.k.r != null) {
            this.k.l.b($$8, $$0);
         }

         if ($$2) {
            this.k.aH().a("toasts");
            this.k.aw().a($$8);
            this.k.aH().c();
         }

         $$8.e();
         $$7.popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void aw() {
      if (!this.y && this.k.T()) {
         long $$0 = ac.c();
         if ($$0 - this.x >= 1000L) {
            this.x = $$0;
            gts $$1 = this.k.V();
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
         ezp $$1 = fgg.a(this.k.h());
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

            try (ezp $$6 = new ezp(64, 64, false)) {
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
         bsh $$0 = this.k.an();
         boolean $$1 = $$0 instanceof cml && !this.k.m.Y;
         if ($$1 && !((cml)$$0).gb().e) {
            cud $$2 = ((btc)$$0).eV();
            ewf $$3 = this.k.v;
            if ($$3 != null && $$3.c() == ewf.a.b) {
               ja $$4 = ((ewd)$$3).a();
               dsl $$5 = this.k.r.a_($$4);
               if (this.k.q.j() == dcd.d) {
                  $$1 = $$5.b(this.k.r, $$4) != null;
               } else {
                  dsp $$6 = new dsp(this.k.r, $$4, false);
                  jw<dfi> $$7 = this.k.r.H_().d(lr.f);
                  $$1 = !$$2.e() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(ffn $$0) {
      float $$1 = $$0.a(true);
      this.A.a($$1);
      if (this.k.an() == null) {
         this.k.a(this.k.s);
      }

      this.b($$1);
      this.k.aH().a("center");
      boolean $$2 = this.ax();
      this.k.aH().b("camera");
      ffg $$3 = this.N;
      bsh $$4 = (bsh)(this.k.an() == null ? this.k.s : this.k.an());
      float $$5 = this.k.r.s().a($$4) ? 1.0F : $$1;
      $$3.a(this.k.r, $$4, !this.k.m.aA().a(), this.k.m.aA().b(), $$5);
      this.n = (float)(this.k.m.aD() * 16);
      double $$6 = this.a($$3, $$1, true);
      Matrix4f $$7 = this.a($$6);
      fao $$8 = new fao();
      this.a($$8, $$3.p());
      if (this.k.m.ab().c()) {
         this.b($$8, $$3.p());
      }

      $$7.mul($$8.c().a());
      float $$9 = this.k.m.aj().c().floatValue();
      float $$10 = ayg.i($$1, this.k.s.cK, this.k.s.cJ) * $$9 * $$9;
      if ($$10 > 0.0F) {
         int $$11 = this.k.s.b(brr.i) ? 7 : 20;
         float $$12 = 5.0F / ($$10 * $$10 + 5.0F) - $$10 * 0.04F;
         $$12 *= $$12;
         Vector3f $$13 = new Vector3f(0.0F, ayg.g / 2.0F, ayg.g / 2.0F);
         float $$14 = ((float)this.q + $$1) * (float)$$11 * (float) (Math.PI / 180.0);
         $$7.rotate($$14, $$13);
         $$7.scale(1.0F / $$12, 1.0F, 1.0F);
         $$7.rotate(-$$14, $$13);
      }

      this.a($$7);
      Matrix4f $$15 = new Matrix4f().rotationXYZ($$3.d() * (float) (Math.PI / 180.0), $$3.e() * (float) (Math.PI / 180.0) + (float) Math.PI, 0.0F);
      this.k.f.a($$3.b(), $$15, this.a(Math.max($$6, (double)this.k.m.ah().c().intValue())));
      this.k.f.a($$0, $$2, $$3, this, this.A, $$15, $$7);
      this.k.aH().b("hand");
      if (this.v) {
         RenderSystem.clear(256, ffw.a);
         this.a($$3, $$1, $$15);
      }

      this.k.aH().c();
   }

   public void h() {
      this.G = null;
      this.o.a();
      this.N.o();
      this.y = false;
   }

   public fhk i() {
      return this.o;
   }

   public void a(cud $$0) {
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
         fao $$11 = new fao();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * ayg.e(ayg.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * ayg.e(ayg.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * ayg.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * ayg.e(ayg.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * ayg.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * ayg.b($$4 * 8.0F)));
         gef.a $$13 = this.p.c();
         this.k.ar().a(this.G, cua.i, 15728880, gph.d, $$11, $$13, this.k.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(fhh $$0, float $$1) {
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
      $$0.a(f, 0, 0, -90, 0.0F, 0.0F, $$2, $$3, $$2, $$3);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      $$0.c().b();
   }

   public ffw j() {
      return this.k;
   }

   public float c(float $$0) {
      return ayg.i($$0, this.u, this.t);
   }

   public float k() {
      return this.n;
   }

   public ffg l() {
      return this.N;
   }

   public gee m() {
      return this.A;
   }

   public gph n() {
      return this.B;
   }

   @Nullable
   public static get o() {
      return P;
   }

   @Nullable
   public static get p() {
      return Q;
   }

   @Nullable
   public static get q() {
      return R;
   }

   @Nullable
   public static get r() {
      return S;
   }

   @Nullable
   public static get s() {
      return T;
   }

   @Nullable
   public static get t() {
      return U;
   }

   @Nullable
   public static get u() {
      return V;
   }

   @Nullable
   public static get v() {
      return W;
   }

   @Nullable
   public static get w() {
      return X;
   }

   @Nullable
   public static get x() {
      return Y;
   }

   @Nullable
   public static get y() {
      return Z;
   }

   @Nullable
   public static get z() {
      return aa;
   }

   @Nullable
   public static get A() {
      return ab;
   }

   @Nullable
   public static get B() {
      return ac;
   }

   @Nullable
   public static get C() {
      return ad;
   }

   @Nullable
   public static get D() {
      return ae;
   }

   @Nullable
   public static get E() {
      return af;
   }

   @Nullable
   public static get F() {
      return ag;
   }

   @Nullable
   public static get G() {
      return ah;
   }

   @Nullable
   public static get H() {
      return ai;
   }

   @Nullable
   public static get I() {
      return aj;
   }

   @Nullable
   public static get J() {
      return ak;
   }

   @Nullable
   public static get K() {
      return al;
   }

   @Nullable
   public static get L() {
      return am;
   }

   @Nullable
   public static get M() {
      return an;
   }

   @Nullable
   public static get N() {
      return ao;
   }

   @Nullable
   public static get O() {
      return ap;
   }

   @Nullable
   public static get P() {
      return aq;
   }

   @Nullable
   public static get Q() {
      return ar;
   }

   @Nullable
   public static get R() {
      return as;
   }

   @Nullable
   public static get S() {
      return at;
   }

   @Nullable
   public static get T() {
      return au;
   }

   @Nullable
   public static get U() {
      return av;
   }

   @Nullable
   public static get V() {
      return aw;
   }

   @Nullable
   public static get W() {
      return ax;
   }

   @Nullable
   public static get X() {
      return ay;
   }

   @Nullable
   public static get Y() {
      return az;
   }

   @Nullable
   public static get Z() {
      return aA;
   }

   @Nullable
   public static get aa() {
      return aB;
   }

   @Nullable
   public static get ab() {
      return aC;
   }

   @Nullable
   public static get ac() {
      return aD;
   }

   @Nullable
   public static get ad() {
      return aE;
   }

   @Nullable
   public static get ae() {
      return aF;
   }

   @Nullable
   public static get af() {
      return aG;
   }

   @Nullable
   public static get ag() {
      return aH;
   }

   @Nullable
   public static get ah() {
      return aI;
   }

   @Nullable
   public static get ai() {
      return aJ;
   }

   @Nullable
   public static get aj() {
      return aK;
   }

   @Nullable
   public static get ak() {
      return aL;
   }

   @Nullable
   public static get al() {
      return aM;
   }

   @Nullable
   public static get am() {
      return aN;
   }

   @Nullable
   public static get an() {
      return aO;
   }

   @Nullable
   public static get ao() {
      return aP;
   }

   @Nullable
   public static get ap() {
      return aQ;
   }

   @Nullable
   public static get aq() {
      return aR;
   }

   @Nullable
   public static get ar() {
      return aS;
   }

   @Nullable
   public static get as() {
      return aT;
   }

   @Nullable
   public static get at() {
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
