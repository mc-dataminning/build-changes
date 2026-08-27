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
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class fve implements AutoCloseable {
   private static final aiy f = new aiy("textures/misc/nausea.png");
   static final Logger g = LogUtils.getLogger();
   private static final boolean h = false;
   public static final float a = 0.05F;
   private static final float i = 1000.0F;
   final exh j;
   private final asa k;
   private final awo l = awo.a();
   private float m;
   public final fvh b;
   private final eyx n;
   private final fvr o;
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
   private final fvk z;
   private final ggk A = new ggk();
   private boolean B;
   private float C = 1.0F;
   private float D;
   private float E;
   public static final int c = 40;
   @Nullable
   private coz F;
   private int G;
   private float H;
   private float I;
   @Nullable
   fvo J;
   static final aiy[] K = new aiy[]{
      new aiy("shaders/post/notch.json"),
      new aiy("shaders/post/fxaa.json"),
      new aiy("shaders/post/art.json"),
      new aiy("shaders/post/bumpy.json"),
      new aiy("shaders/post/blobs2.json"),
      new aiy("shaders/post/pencil.json"),
      new aiy("shaders/post/color_convolve.json"),
      new aiy("shaders/post/deconverge.json"),
      new aiy("shaders/post/flip.json"),
      new aiy("shaders/post/invert.json"),
      new aiy("shaders/post/ntsc.json"),
      new aiy("shaders/post/outline.json"),
      new aiy("shaders/post/phosphor.json"),
      new aiy("shaders/post/scan_pincushion.json"),
      new aiy("shaders/post/sobel.json"),
      new aiy("shaders/post/bits.json"),
      new aiy("shaders/post/desaturate.json"),
      new aiy("shaders/post/green.json"),
      new aiy("shaders/post/blur.json"),
      new aiy("shaders/post/wobble.json"),
      new aiy("shaders/post/blobs.json"),
      new aiy("shaders/post/antialias.json"),
      new aiy("shaders/post/creeper.json"),
      new aiy("shaders/post/spider.json")
   };
   public static final int d = K.length;
   int L = d;
   private boolean M;
   private final ews N = new ews();
   public fvz e;
   private final Map<String, fvz> O = Maps.newHashMap();
   @Nullable
   private static fvz P;
   @Nullable
   private static fvz Q;
   @Nullable
   private static fvz R;
   @Nullable
   private static fvz S;
   @Nullable
   private static fvz T;
   @Nullable
   private static fvz U;
   @Nullable
   private static fvz V;
   @Nullable
   private static fvz W;
   @Nullable
   private static fvz X;
   @Nullable
   private static fvz Y;
   @Nullable
   private static fvz Z;
   @Nullable
   private static fvz aa;
   @Nullable
   private static fvz ab;
   @Nullable
   private static fvz ac;
   @Nullable
   private static fvz ad;
   @Nullable
   private static fvz ae;
   @Nullable
   private static fvz af;
   @Nullable
   private static fvz ag;
   @Nullable
   private static fvz ah;
   @Nullable
   private static fvz ai;
   @Nullable
   private static fvz aj;
   @Nullable
   private static fvz ak;
   @Nullable
   private static fvz al;
   @Nullable
   private static fvz am;
   @Nullable
   private static fvz an;
   @Nullable
   private static fvz ao;
   @Nullable
   private static fvz ap;
   @Nullable
   private static fvz aq;
   @Nullable
   private static fvz ar;
   @Nullable
   private static fvz as;
   @Nullable
   private static fvz at;
   @Nullable
   private static fvz au;
   @Nullable
   private static fvz av;
   @Nullable
   private static fvz aw;
   @Nullable
   private static fvz ax;
   @Nullable
   private static fvz ay;
   @Nullable
   private static fvz az;
   @Nullable
   private static fvz aA;
   @Nullable
   private static fvz aB;
   @Nullable
   private static fvz aC;
   @Nullable
   private static fvz aD;
   @Nullable
   private static fvz aE;
   @Nullable
   private static fvz aF;
   @Nullable
   private static fvz aG;
   @Nullable
   private static fvz aH;
   @Nullable
   private static fvz aI;
   @Nullable
   private static fvz aJ;
   @Nullable
   private static fvz aK;
   @Nullable
   private static fvz aL;
   @Nullable
   private static fvz aM;
   @Nullable
   private static fvz aN;
   @Nullable
   private static fvz aO;
   @Nullable
   private static fvz aP;
   @Nullable
   private static fvz aQ;
   @Nullable
   private static fvz aR;
   @Nullable
   private static fvz aS;
   @Nullable
   private static fvz aT;
   @Nullable
   private static fvz aU;
   @Nullable
   private static fvz aV;

   public fve(exh $$0, fvh $$1, asa $$2, fvr $$3) {
      this.j = $$0;
      this.k = $$2;
      this.b = $$1;
      this.n = new eyx($$0.Y());
      this.z = new fvk(this, $$0);
      this.o = $$3;
      this.J = null;
   }

   @Override
   public void close() {
      this.z.close();
      this.n.close();
      this.A.close();
      this.b();
      this.aw();
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

   public void a(@Nullable bno $$0) {
      if (this.J != null) {
         this.J.close();
      }

      this.J = null;
      if ($$0 instanceof cdz) {
         this.a(new aiy("shaders/post/creeper.json"));
      } else if ($$0 instanceof cey) {
         this.a(new aiy("shaders/post/spider.json"));
      } else if ($$0 instanceof ced) {
         this.a(new aiy("shaders/post/invert.json"));
      }
   }

   public void d() {
      if (this.j.am() instanceof chh) {
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

   void a(aiy $$0) {
      if (this.J != null) {
         this.J.close();
      }

      try {
         this.J = new fvo(this.j.Y(), this.k, this.j.g(), $$0);
         this.J.a(this.j.aM().k(), this.j.aM().l());
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

   public aru e() {
      return new asf<fve.a>() {
         protected fve.a a(asa $$0, bil $$1) {
            Map<aiy, ary> $$2 = $$0.b("shaders", $$0x -> {
               String $$1x = $$0x.a();
               return $$1x.endsWith(".json") || $$1x.endsWith(ero.a.b.b()) || $$1x.endsWith(ero.a.a.b()) || $$1x.endsWith(".glsl");
            });
            Map<aiy, ary> $$3 = new HashMap<>();
            $$2.forEach(($$1x, $$2x) -> {
               try (InputStream $$3x = $$2x.d()) {
                  byte[] $$4 = $$3x.readAllBytes();
                  $$3.put($$1x, new ary($$2x.a(), () -> new ByteArrayInputStream($$4)));
               } catch (Exception var8) {
                  fve.g.warn("Failed to read resource {}", $$1x, var8);
               }
            });
            return new fve.a($$0, $$3);
         }

         protected void a(fve.a $$0, asa $$1, bil $$2) {
            fve.this.b($$0);
            if (fve.this.J != null) {
               fve.this.J.close();
            }

            fve.this.J = null;
            if (fve.this.L == fve.d) {
               fve.this.a(fve.this.j.am());
            } else {
               fve.this.a(fve.K[fve.this.L]);
            }
         }

         @Override
         public String c() {
            return "Shader Loader";
         }
      };
   }

   public void a(asd $$0) {
      if (this.e != null) {
         throw new RuntimeException("Blit shader already preloaded");
      } else {
         try {
            this.e = new fvz($$0, "blit_screen", ery.i);
         } catch (IOException var3) {
            throw new RuntimeException("could not preload blit shader", var3);
         }

         aS = this.a($$0, "rendertype_gui", ery.n);
         aT = this.a($$0, "rendertype_gui_overlay", ery.n);
         P = this.a($$0, "position", ery.m);
         Q = this.a($$0, "position_color", ery.n);
         R = this.a($$0, "position_color_tex", ery.r);
         S = this.a($$0, "position_tex", ery.q);
         T = this.a($$0, "position_tex_color", ery.s);
         aG = this.a($$0, "rendertype_text", ery.t);
      }
   }

   private fvz a(asd $$0, String $$1, esf $$2) {
      try {
         fvz $$3 = new fvz($$0, $$1, $$2);
         this.O.put($$1, $$3);
         return $$3;
      } catch (Exception var5) {
         throw new IllegalStateException("could not preload shader " + $$1, var5);
      }
   }

   void b(asd $$0) {
      RenderSystem.assertOnRenderThread();
      List<ero> $$1 = Lists.newArrayList();
      $$1.addAll(ero.a.b.c().values());
      $$1.addAll(ero.a.a.c().values());
      $$1.forEach(ero::a);
      List<Pair<fvz, Consumer<fvz>>> $$2 = Lists.newArrayListWithCapacity(this.O.size());

      try {
         $$2.add(Pair.of(new fvz($$0, "particle", ery.l), (Consumer<fvz>)$$0x -> U = $$0x));
         $$2.add(Pair.of(new fvz($$0, "position", ery.m), (Consumer<fvz>)$$0x -> P = $$0x));
         $$2.add(Pair.of(new fvz($$0, "position_color", ery.n), (Consumer<fvz>)$$0x -> Q = $$0x));
         $$2.add(Pair.of(new fvz($$0, "position_color_lightmap", ery.p), (Consumer<fvz>)$$0x -> V = $$0x));
         $$2.add(Pair.of(new fvz($$0, "position_color_tex", ery.r), (Consumer<fvz>)$$0x -> R = $$0x));
         $$2.add(Pair.of(new fvz($$0, "position_color_tex_lightmap", ery.t), (Consumer<fvz>)$$0x -> W = $$0x));
         $$2.add(Pair.of(new fvz($$0, "position_tex", ery.q), (Consumer<fvz>)$$0x -> S = $$0x));
         $$2.add(Pair.of(new fvz($$0, "position_tex_color", ery.s), (Consumer<fvz>)$$0x -> T = $$0x));
         $$2.add(Pair.of(new fvz($$0, "position_tex_color_normal", ery.v), (Consumer<fvz>)$$0x -> X = $$0x));
         $$2.add(Pair.of(new fvz($$0, "position_tex_lightmap_color", ery.u), (Consumer<fvz>)$$0x -> Y = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_solid", ery.j), (Consumer<fvz>)$$0x -> Z = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_cutout_mipped", ery.j), (Consumer<fvz>)$$0x -> aa = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_cutout", ery.j), (Consumer<fvz>)$$0x -> ab = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_translucent", ery.j), (Consumer<fvz>)$$0x -> ac = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_translucent_moving_block", ery.j), (Consumer<fvz>)$$0x -> ad = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_armor_cutout_no_cull", ery.k), (Consumer<fvz>)$$0x -> ae = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_solid", ery.k), (Consumer<fvz>)$$0x -> af = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_cutout", ery.k), (Consumer<fvz>)$$0x -> ag = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_cutout_no_cull", ery.k), (Consumer<fvz>)$$0x -> ah = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_cutout_no_cull_z_offset", ery.k), (Consumer<fvz>)$$0x -> ai = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_item_entity_translucent_cull", ery.k), (Consumer<fvz>)$$0x -> aj = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_translucent_cull", ery.k), (Consumer<fvz>)$$0x -> ak = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_translucent", ery.k), (Consumer<fvz>)$$0x -> al = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_translucent_emissive", ery.k), (Consumer<fvz>)$$0x -> am = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_smooth_cutout", ery.k), (Consumer<fvz>)$$0x -> an = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_beacon_beam", ery.j), (Consumer<fvz>)$$0x -> ao = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_decal", ery.k), (Consumer<fvz>)$$0x -> ap = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_no_outline", ery.k), (Consumer<fvz>)$$0x -> aq = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_shadow", ery.k), (Consumer<fvz>)$$0x -> ar = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_alpha", ery.k), (Consumer<fvz>)$$0x -> as = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_eyes", ery.k), (Consumer<fvz>)$$0x -> at = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_energy_swirl", ery.k), (Consumer<fvz>)$$0x -> au = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_leash", ery.p), (Consumer<fvz>)$$0x -> aw = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_water_mask", ery.m), (Consumer<fvz>)$$0x -> ax = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_outline", ery.r), (Consumer<fvz>)$$0x -> ay = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_armor_glint", ery.q), (Consumer<fvz>)$$0x -> az = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_armor_entity_glint", ery.q), (Consumer<fvz>)$$0x -> aA = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_glint_translucent", ery.q), (Consumer<fvz>)$$0x -> aB = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_glint", ery.q), (Consumer<fvz>)$$0x -> aC = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_glint_direct", ery.q), (Consumer<fvz>)$$0x -> aD = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_glint", ery.q), (Consumer<fvz>)$$0x -> aE = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_entity_glint_direct", ery.q), (Consumer<fvz>)$$0x -> aF = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_text", ery.t), (Consumer<fvz>)$$0x -> aG = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_text_background", ery.p), (Consumer<fvz>)$$0x -> aH = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_text_intensity", ery.t), (Consumer<fvz>)$$0x -> aI = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_text_see_through", ery.t), (Consumer<fvz>)$$0x -> aJ = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_text_background_see_through", ery.p), (Consumer<fvz>)$$0x -> aK = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_text_intensity_see_through", ery.t), (Consumer<fvz>)$$0x -> aL = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_lightning", ery.n), (Consumer<fvz>)$$0x -> aM = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_tripwire", ery.j), (Consumer<fvz>)$$0x -> aN = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_end_portal", ery.m), (Consumer<fvz>)$$0x -> aO = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_end_gateway", ery.m), (Consumer<fvz>)$$0x -> aP = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_lines", ery.o), (Consumer<fvz>)$$0x -> aQ = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_crumbling", ery.j), (Consumer<fvz>)$$0x -> aR = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_gui", ery.n), (Consumer<fvz>)$$0x -> aS = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_gui_overlay", ery.n), (Consumer<fvz>)$$0x -> aT = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_gui_text_highlight", ery.n), (Consumer<fvz>)$$0x -> aU = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_gui_ghost_recipe_overlay", ery.n), (Consumer<fvz>)$$0x -> aV = $$0x));
         $$2.add(Pair.of(new fvz($$0, "rendertype_breeze_wind", ery.k), (Consumer<fvz>)$$0x -> av = $$0x));
      } catch (IOException var5) {
         $$2.forEach($$0x -> ((fvz)$$0x.getFirst()).close());
         throw new RuntimeException("could not reload shaders", var5);
      }

      this.aw();
      $$2.forEach($$0x -> {
         fvz $$1x = (fvz)$$0x.getFirst();
         this.O.put($$1x.i(), $$1x);
         ((Consumer)$$0x.getSecond()).accept($$1x);
      });
   }

   private void aw() {
      RenderSystem.assertOnRenderThread();
      this.O.values().forEach(fvz::close);
      this.O.clear();
   }

   @Nullable
   public fvz a(@Nullable String $$0) {
      return $$0 == null ? null : this.O.get($$0);
   }

   public void f() {
      this.ax();
      this.z.a();
      if (this.j.am() == null) {
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
   public fvo g() {
      return this.J;
   }

   public void a(int $$0, int $$1) {
      if (this.J != null) {
         this.J.a($$0, $$1);
      }

      this.j.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bno $$1 = this.j.am();
      if ($$1 != null) {
         if (this.j.r != null && this.j.s != null) {
            this.j.aG().a("pick");
            double $$2 = this.j.s.gt();
            double $$3 = this.j.s.gu();
            enq $$4 = this.a($$1, $$2, $$3, $$0);
            this.j.v = $$4;
            this.j.u = $$4 instanceof enp $$5 ? $$5.a() : null;
            this.j.aG().c();
         }
      }
   }

   private enq a(bno $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = awh.k($$4);
      ens $$6 = $$0.j($$3);
      enq $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.e().g($$6);
      if ($$7.c() != enq.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      ens $$9 = $$0.f($$3);
      ens $$10 = $$6.b($$9.c * $$4, $$9.d * $$4, $$9.e * $$4);
      float $$11 = 1.0F;
      enn $$12 = $$0.cH().b($$9.a($$4)).c(1.0, 1.0, 1.0);
      enp $$13 = cib.a($$0, $$6, $$10, $$12, $$0x -> !$$0x.P_() && $$0x.bt(), $$5);
      return $$13 != null && $$13.e().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static enq a(enq $$0, ens $$1, double $$2) {
      ens $$3 = $$0.e();
      if (!$$3.a((it)$$1, $$2)) {
         ens $$4 = $$0.e();
         ie $$5 = ie.a($$4.c - $$1.c, $$4.d - $$1.d, $$4.e - $$1.e);
         return eno.a($$4, $$5, hz.a($$4));
      } else {
         return $$0;
      }
   }

   private void ax() {
      float $$0 = 1.0F;
      if (this.j.am() instanceof fuk $$1) {
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

   private double a(ews $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0;
      } else {
         double $$3 = 70.0;
         if ($$2) {
            $$3 = (double)this.j.m.ae().c().intValue();
            $$3 *= (double)awh.i($$1, this.r, this.q);
         }

         if ($$0.g() instanceof bog && ((bog)$$0.g()).ex()) {
            float $$4 = Math.min((float)((bog)$$0.g()).aM + $$1, 20.0F);
            $$3 /= (double)((1.0F - 500.0F / ($$4 + 500.0F)) * 2.0F + 1.0F);
         }

         egr $$5 = $$0.k();
         if ($$5 == egr.a || $$5 == egr.b) {
            $$3 *= awh.d(this.j.m.ah().c(), 1.0, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(esa $$0, float $$1) {
      if (this.j.am() instanceof bog $$2) {
         float $$3 = (float)$$2.aK - $$1;
         if ($$2.ex()) {
            float $$4 = Math.min((float)$$2.aM + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= (float)$$2.aL;
         $$3 = awh.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eF();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)((double)(-$$3) * 14.0 * this.j.m.al().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(esa $$0, float $$1) {
      if (this.j.am() instanceof chh) {
         chh $$2 = (chh)this.j.am();
         float $$3 = $$2.X - $$2.W;
         float $$4 = -($$2.X + $$3 * $$1);
         float $$5 = awh.i($$1, $$2.bZ, $$2.ca);
         $$0.a(awh.a($$4 * (float) Math.PI) * $$5 * 0.5F, -Math.abs(awh.b($$4 * (float) Math.PI) * $$5), 0.0F);
         $$0.a(a.f.rotationDegrees(awh.a($$4 * (float) Math.PI) * $$5 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(awh.b($$4 * (float) Math.PI - 0.2F) * $$5) * 5.0F));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.b(false);
      this.a(false);
      this.a(1.0F, 0L, new esa());
      this.C = 1.0F;
   }

   private void a(esa $$0, ews $$1, float $$2) {
      if (!this.B) {
         this.a(this.a(this.a($$1, $$2, false)));
         $$0.e();
         $$0.a();
         this.a($$0, $$2);
         if (this.j.m.Y().c()) {
            this.b($$0, $$2);
         }

         boolean $$3 = this.j.am() instanceof bog && ((bog)this.j.am()).fD();
         if (this.j.m.ax().a() && !$$3 && !this.j.m.Z && this.j.q.j() != cvk.d) {
            this.z.c();
            this.b.a($$2, $$0, this.o.c(), this.j.s, this.j.ao().a(this.j.s, $$2));
            this.z.b();
         }

         $$0.b();
         if (this.j.m.ax().a() && !$$3) {
            fvv.a(this.j, $$0);
            this.a($$0, $$2);
         }

         if (this.j.m.Y().c()) {
            this.b($$0, $$2);
         }
      }
   }

   public void a(Matrix4f $$0) {
      RenderSystem.setProjectionMatrix($$0, esi.a);
   }

   public Matrix4f a(double $$0) {
      esa $$1 = new esa();
      $$1.c().a().identity();
      if (this.C != 1.0F) {
         $$1.a(this.D, -this.E, 0.0F);
         $$1.b(this.C, this.C, 1.0F);
      }

      $$1.c()
         .a()
         .mul(new Matrix4f().setPerspective((float)($$0 * (float) (Math.PI / 180.0)), (float)this.j.aM().k() / (float)this.j.aM().l(), 0.05F, this.h()));
      return $$1.c().a();
   }

   public float h() {
      return this.m * 4.0F;
   }

   public static float a(bog $$0, float $$1) {
      bnb $$2 = $$0.c(bnd.p);
      return !$$2.a(200) ? 1.0F : 0.7F + awh.a(((float)$$2.c() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(float $$0, long $$1, boolean $$2) {
      if (!this.j.aA() && this.j.m.n && (!this.j.m.W().c() || !this.j.n.d())) {
         if (ac.b() - this.y > 500L) {
            this.j.c(false);
         }
      } else {
         this.y = ac.b();
      }

      if (!this.j.x) {
         float $$3 = this.j.r != null && this.j.r.s().i() ? $$0 : 1.0F;
         boolean $$4 = this.j.c();
         int $$5 = (int)(this.j.n.e() * (double)this.j.aM().o() / (double)this.j.aM().m());
         int $$6 = (int)(this.j.n.f() * (double)this.j.aM().p() / (double)this.j.aM().n());
         RenderSystem.viewport(0, 0, this.j.aM().k(), this.j.aM().l());
         if ($$4 && $$2 && this.j.r != null) {
            this.j.aG().a("level");
            this.a($$0, $$1, new esa());
            this.ay();
            this.j.f.b();
            if (this.J != null && this.M) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.resetTextureMatrix();
               this.J.a($$3);
            }

            this.j.g().a(true);
         }

         ere $$7 = this.j.aM();
         RenderSystem.clear(256, exh.a);
         Matrix4f $$8 = new Matrix4f().setOrtho(0.0F, (float)((double)$$7.k() / $$7.s()), (float)((double)$$7.l() / $$7.s()), 0.0F, 1000.0F, 21000.0F);
         RenderSystem.setProjectionMatrix($$8, esi.b);
         esa $$9 = RenderSystem.getModelViewStack();
         $$9.a();
         $$9.e();
         $$9.a(0.0F, 0.0F, -11000.0F);
         RenderSystem.applyModelViewMatrix();
         eqw.b();
         eyu $$10 = new eyu(this.j, this.o.c());
         if ($$4 && $$2 && this.j.r != null) {
            this.j.aG().b("gui");
            if (this.j.s != null) {
               float $$11 = awh.i($$3, this.j.s.cA, this.j.s.cz);
               float $$12 = this.j.m.ag().c().floatValue();
               if ($$11 > 0.0F && this.j.s.a(bnd.i) && $$12 < 1.0F) {
                  this.a($$10, $$11 * (1.0F - $$12));
               }
            }

            if (!this.j.m.Z) {
               this.a(this.j.aM().o(), this.j.aM().p(), $$3);
            }

            this.j.l.a($$10, $$3);
            RenderSystem.clear(256, exh.a);
            this.j.aG().c();
         }

         if (this.j.aJ() != null) {
            try {
               this.j.aJ().a($$10, $$5, $$6, this.j.at());
            } catch (Throwable var18) {
               o $$14 = o.a(var18, "Rendering overlay");
               p $$15 = $$14.a("Overlay render details");
               $$15.a("Overlay name", () -> this.j.aJ().getClass().getCanonicalName());
               throw new y($$14);
            }
         } else if ($$4 && this.j.y != null) {
            try {
               this.j.y.c($$10, $$5, $$6, this.j.at());
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
                        this.j.aM().o(),
                        this.j.aM().p(),
                        this.j.aM().k(),
                        this.j.aM().l(),
                        this.j.aM().s()
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
            this.j.aG().a("toasts");
            this.j.ay().a($$10);
            this.j.aG().c();
         }

         $$10.e();
         $$9.b();
         RenderSystem.applyModelViewMatrix();
      }
   }

   private void ay() {
      if (!this.x && this.j.R()) {
         long $$0 = ac.b();
         if ($$0 - this.w >= 1000L) {
            this.w = $$0;
            gkx $$1 = this.j.T();
            if ($$1 != null && !$$1.ad()) {
               $$1.y().ifPresent($$0x -> {
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
         erb $$1 = exs.a(this.j.g());
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

            try (erb $$6 = new erb(64, 64, false)) {
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

   private boolean az() {
      if (!this.v) {
         return false;
      } else {
         bno $$0 = this.j.am();
         boolean $$1 = $$0 instanceof chh && !this.j.m.Z;
         if ($$1 && !((chh)$$0).fU().e) {
            coz $$2 = ((bog)$$0).eT();
            enq $$3 = this.j.v;
            if ($$3 != null && $$3.c() == enq.a.b) {
               hz $$4 = ((eno)$$3).a();
               dlf $$5 = this.j.r.a_($$4);
               if (this.j.q.j() == cvk.d) {
                  $$1 = $$5.b(this.j.r, $$4) != null;
               } else {
                  dlj $$6 = new dlj(this.j.r, $$4, false);
                  iv<cyo> $$7 = this.j.r.I_().d(kg.f);
                  $$1 = !$$2.b() && ($$2.b($$7, $$6) || $$2.a($$7, $$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(float $$0, long $$1, esa $$2) {
      this.z.a($$0);
      if (this.j.am() == null) {
         this.j.a(this.j.s);
      }

      this.a($$0);
      this.j.aG().a("center");
      boolean $$3 = this.az();
      this.j.aG().b("camera");
      ews $$4 = this.N;
      bno $$5 = (bno)(this.j.am() == null ? this.j.s : this.j.am());
      $$4.a(this.j.r, $$5, !this.j.m.ax().a(), this.j.m.ax().b(), this.j.r.s().a($$5) ? 1.0F : $$0);
      this.m = (float)(this.j.m.aA() * 16);
      esa $$6 = new esa();
      double $$7 = this.a($$4, $$0, true);
      $$6.a(this.a($$7));
      this.a($$6, $$4.p());
      if (this.j.m.Y().c()) {
         this.b($$6, $$4.p());
      }

      float $$8 = this.j.m.ag().c().floatValue();
      float $$9 = awh.i($$0, this.j.s.cA, this.j.s.cz) * $$8 * $$8;
      if ($$9 > 0.0F) {
         int $$10 = this.j.s.a(bnd.i) ? 7 : 20;
         float $$11 = 5.0F / ($$9 * $$9 + 5.0F) - $$9 * 0.04F;
         $$11 *= $$11;
         a $$12 = a.of(new Vector3f(0.0F, awh.g / 2.0F, awh.g / 2.0F));
         $$6.a($$12.rotationDegrees(((float)this.p + $$0) * (float)$$10));
         $$6.b(1.0F / $$11, 1.0F, 1.0F);
         float $$13 = -((float)this.p + $$0) * (float)$$10;
         $$6.a($$12.rotationDegrees($$13));
      }

      Matrix4f $$14 = $$6.c().a();
      this.a($$14);
      $$2.a(a.b.rotationDegrees($$4.d()));
      $$2.a(a.d.rotationDegrees($$4.e() + 180.0F));
      Matrix3f $$15 = new Matrix3f($$2.c().b()).invert();
      RenderSystem.setInverseViewRotationMatrix($$15);
      this.j.f.a($$2, $$4.b(), this.a(Math.max($$7, (double)this.j.m.ae().c().intValue())));
      this.j.f.a($$2, $$0, $$1, $$3, $$4, this, this.z, $$14);
      this.j.aG().b("hand");
      if (this.u) {
         RenderSystem.clear(256, exh.a);
         this.a($$2, $$4, $$0);
      }

      this.j.aG().c();
   }

   public void i() {
      this.F = null;
      this.n.a();
      this.N.o();
      this.x = false;
   }

   public eyx j() {
      return this.n;
   }

   public void a(coz $$0) {
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
         esa $$11 = new esa();
         $$11.a();
         $$11.a((float)($$0 / 2) + $$9 * awh.e(awh.a($$8 * 2.0F)), (float)($$1 / 2) + $$10 * awh.e(awh.a($$8 * 2.0F)), -50.0F);
         float $$12 = 50.0F + 175.0F * awh.a($$8);
         $$11.b($$12, -$$12, $$12);
         $$11.a(a.d.rotationDegrees(900.0F * awh.e(awh.a($$8))));
         $$11.a(a.b.rotationDegrees(6.0F * awh.b($$4 * 8.0F)));
         $$11.a(a.f.rotationDegrees(6.0F * awh.b($$4 * 8.0F)));
         fvl.a $$13 = this.o.c();
         this.j.aq().a(this.F, cow.i, 15728880, ggk.d, $$11, $$13, this.j.r, 0);
         $$11.b();
         $$13.b();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void a(eyu $$0, float $$1) {
      int $$2 = $$0.a();
      int $$3 = $$0.b();
      $$0.c().a();
      float $$4 = awh.i($$1, 2.0F, 1.0F);
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

   public exh k() {
      return this.j;
   }

   public float b(float $$0) {
      return awh.i($$0, this.t, this.s);
   }

   public float l() {
      return this.m;
   }

   public ews m() {
      return this.N;
   }

   public fvk n() {
      return this.z;
   }

   public ggk o() {
      return this.A;
   }

   @Nullable
   public static fvz p() {
      return P;
   }

   @Nullable
   public static fvz q() {
      return Q;
   }

   @Nullable
   public static fvz r() {
      return R;
   }

   @Nullable
   public static fvz s() {
      return S;
   }

   @Nullable
   public static fvz t() {
      return T;
   }

   @Nullable
   public static fvz u() {
      return U;
   }

   @Nullable
   public static fvz v() {
      return V;
   }

   @Nullable
   public static fvz w() {
      return W;
   }

   @Nullable
   public static fvz x() {
      return X;
   }

   @Nullable
   public static fvz y() {
      return Y;
   }

   @Nullable
   public static fvz z() {
      return Z;
   }

   @Nullable
   public static fvz A() {
      return aa;
   }

   @Nullable
   public static fvz B() {
      return ab;
   }

   @Nullable
   public static fvz C() {
      return ac;
   }

   @Nullable
   public static fvz D() {
      return ad;
   }

   @Nullable
   public static fvz E() {
      return ae;
   }

   @Nullable
   public static fvz F() {
      return af;
   }

   @Nullable
   public static fvz G() {
      return ag;
   }

   @Nullable
   public static fvz H() {
      return ah;
   }

   @Nullable
   public static fvz I() {
      return ai;
   }

   @Nullable
   public static fvz J() {
      return aj;
   }

   @Nullable
   public static fvz K() {
      return ak;
   }

   @Nullable
   public static fvz L() {
      return al;
   }

   @Nullable
   public static fvz M() {
      return am;
   }

   @Nullable
   public static fvz N() {
      return an;
   }

   @Nullable
   public static fvz O() {
      return ao;
   }

   @Nullable
   public static fvz P() {
      return ap;
   }

   @Nullable
   public static fvz Q() {
      return aq;
   }

   @Nullable
   public static fvz R() {
      return ar;
   }

   @Nullable
   public static fvz S() {
      return as;
   }

   @Nullable
   public static fvz T() {
      return at;
   }

   @Nullable
   public static fvz U() {
      return au;
   }

   @Nullable
   public static fvz V() {
      return av;
   }

   @Nullable
   public static fvz W() {
      return aw;
   }

   @Nullable
   public static fvz X() {
      return ax;
   }

   @Nullable
   public static fvz Y() {
      return ay;
   }

   @Nullable
   public static fvz Z() {
      return az;
   }

   @Nullable
   public static fvz aa() {
      return aA;
   }

   @Nullable
   public static fvz ab() {
      return aB;
   }

   @Nullable
   public static fvz ac() {
      return aC;
   }

   @Nullable
   public static fvz ad() {
      return aD;
   }

   @Nullable
   public static fvz ae() {
      return aE;
   }

   @Nullable
   public static fvz af() {
      return aF;
   }

   @Nullable
   public static fvz ag() {
      return aG;
   }

   @Nullable
   public static fvz ah() {
      return aH;
   }

   @Nullable
   public static fvz ai() {
      return aI;
   }

   @Nullable
   public static fvz aj() {
      return aJ;
   }

   @Nullable
   public static fvz ak() {
      return aK;
   }

   @Nullable
   public static fvz al() {
      return aL;
   }

   @Nullable
   public static fvz am() {
      return aM;
   }

   @Nullable
   public static fvz an() {
      return aN;
   }

   @Nullable
   public static fvz ao() {
      return aO;
   }

   @Nullable
   public static fvz ap() {
      return aP;
   }

   @Nullable
   public static fvz aq() {
      return aQ;
   }

   @Nullable
   public static fvz ar() {
      return aR;
   }

   @Nullable
   public static fvz as() {
      return aS;
   }

   @Nullable
   public static fvz at() {
      return aT;
   }

   @Nullable
   public static fvz au() {
      return aU;
   }

   @Nullable
   public static fvz av() {
      return aV;
   }

   public static record a(asd a, Map<aiy, ary> b) implements asd {
      @Override
      public Optional<ary> getResource(aiy $$0) {
         ary $$1 = this.b.get($$0);
         return $$1 != null ? Optional.of($$1) : this.a.getResource($$0);
      }
   }
}
