import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ger extends fzq {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final xg u = xg.c("selectWorld.gameMode");
   static final xg v = xg.c("selectWorld.enterName");
   static final xg w = xg.c("selectWorld.experiments");
   static final xg x = xg.c("selectWorld.allowCommands.info");
   private static final xg y = xg.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final alr a = alr.b("textures/gui/tab_header_background.png");
   private final fxm B = new fxm(this);
   final gfd C;
   private final fwc D = new fwc($$1x -> {
      ftw var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final ffs F;
   private final geq G;
   @Nullable
   private final fzq H;
   @Nullable
   private Path I;
   @Nullable
   private auz J;
   @Nullable
   private fwd K;

   public static void a(fqq $$0, @Nullable fzq $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (fan)$$2));
   }

   public static void a(fqq $$0, @Nullable fzq $$1, geq $$2) {
      gfc $$3 = ($$0x, $$1x, $$2x) -> new gfb($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<amp.a, eil> $$4 = $$0x -> new eil(ein.a(), esd.a($$0x.c()));
      a($$0, $$1, $$4, $$3, esd.a, $$2);
   }

   public static void b(fqq $$0, @Nullable fzq $$1) {
      gfc $$2 = ($$0x, $$1x, $$2x) -> new gfb($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gew(gfd.a.c, Set.of(dkf.m, dkf.x, dkf.f), eqp.h));
      Function<amp.a, eil> $$3 = $$0x -> new eil(ein.b(), esd.c($$0x.c()));
      a($$0, $$1, $$3, $$2, esd.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (fan)$$2x));
   }

   private static void a(fqq $$0, @Nullable fzq $$1, Function<amp.a, eil> $$2, gfc $$3, alq<esc> $$4, geq $$5) {
      a($$0, y);
      auz $$6 = new auz(new avc($$0.be()));
      dlh $$7 = ac.aV ? new dlh(new djw(List.of("vanilla", "tests"), List.of()), cvu.h) : dlh.d;
      amp.c $$8 = a($$6, $$7);
      CompletableFuture<gfb> $$9 = amp.a($$8, $$1x -> new amp.b<>(new ges($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ag.h(), $$0);
      $$0.b($$9::isDone);
      $$0.a(new ger($$0, $$1, $$9.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static ger a(fqq $$0, @Nullable fzq $$1, dkn $$2, gfb $$3, @Nullable Path $$4) {
      ger $$5 = new ger($$0, $$1, $$3, esd.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (fan)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(gfd.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(gfd.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(gfd.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private ger(fqq $$0, @Nullable fzq $$1, gfb $$2, Optional<alq<esc>> $$3, OptionalLong $$4, geq $$5) {
      super(xg.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new gfd($$0.m().c(), $$2, $$3, $$4);
   }

   public gfd m() {
      return this.C;
   }

   @Override
   protected void aO_() {
      this.K = fwd.a(this.D, this.n).a(new ger.a(), new ger.c(), new ger.b()).a();
      this.c(this.K);
      fxq $$0 = this.B.b(fxq.e().a(8));
      $$0.a(fty.a(xg.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fty.a(xf.e, $$0x -> this.E()).a());
      this.B.a($$0x -> {
         $$0x.l(1);
         this.c($$0x);
      });
      this.K.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aC_() {
   }

   @Override
   public void c() {
      if (this.K != null) {
         this.K.a(this.n);
         this.K.b();
         int $$0 = this.K.J().c();
         fyf $$1 = new fyf(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fqq $$0, xg $$1) {
      $$0.d(new fzb($$1));
   }

   private void F() {
      gfb $$0 = this.C.k();
      eik.b $$1 = $$0.e().a($$0.d());
      jn<ama> $$2 = $$0.f().a(ama.c, $$1.b());
      Lifecycle $$3 = cvu.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dkn $$7 = this.c($$1.d() == fal.a.c);
      fal $$8 = new fal($$7, this.C.k().c(), $$1.d(), $$5);
      gfe.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jn<ama> $$0, fal $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jn<ama> $$0, fan $$1) {
      String $$2 = this.C.c();
      gfb $$3 = this.C.k();
      a(this.m, y);
      Optional<fah.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fwh.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dkn c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dkf $$2 = new dkf(dlh.d.b());
         $$2.b(dkf.m).a(false, null);
         return new dkn($$1, dkg.d, false, buz.a, true, $$2, dlh.d);
      } else {
         return new dkn($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.K.b($$0)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.F();
         return true;
      }
   }

   @Override
   public void aL_() {
      this.E();
   }

   public void E() {
      this.m.a(this.H);
      this.H();
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gry::H, fzq.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(ftk $$0) {
      $$0.a(gry::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fwh.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dlh $$0) {
      Pair<Path, auz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gev(this, (auz)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dlh $$0) {
      Pair<Path, auz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gdi((auz)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xg.c("dataPack.title")));
      }
   }

   private void a(auz $$0, boolean $$1, Consumer<dlh> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dlh $$5 = new dlh(new djw($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cvs $$6 = $$0.f();
         if (cvu.a($$6) && $$1) {
            this.m.a(new gep($$0.g(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.C.k().h());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(auz $$0, dlh $$1, Consumer<dlh> $$2) {
      this.m.d(new fzb(xg.c("dataPack.validation.working")));
      amp.c $$3 = a($$0, $$1);
      amp.<ges, gfb>a(
            $$3,
            $$0x -> {
               if ($$0x.c().e(mi.bo).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().e(mi.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  gfb $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = eil.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  eil $$5 = (eil)$$3x.flatMap($$1xx -> eil.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amp.b<>(new ges($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new gfb($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ag.h(),
            this.m
         )
         .thenApply($$0x -> {
            $$0x.b();
            return $$0x;
         })
         .thenAcceptAsync(this.C::a, this.m)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new fyo($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dlh.d);
                  }
               }, xg.c("dataPack.validation.failed"), xf.a, xg.c("dataPack.validation.back"), xg.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amp.c a(auz $$0, dlh $$1) {
      amp.d $$2 = new amp.d($$0, $$1, false, true);
      return new amp.c($$2, el.a.c, 2);
   }

   private void H() {
      if (this.I != null && Files.exists(this.I)) {
         try (Stream<Path> $$0 = Files.walk(this.I)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  d.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            d.warn("Failed to list temporary dir {}", this.I);
         }
      }

      this.I = null;
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ag.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private static Optional<fah.c> a(fqq $$0, String $$1, @Nullable Path $$2) {
      try {
         fah.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(faf.j);
               w.c($$5);
               $$4.filter($$1x -> !$$1x.equals($$2)).forEach($$2x -> a($$2, $$5, $$2x));
               var6 = Optional.of($$3);
            }

            return var6;
         } catch (UncheckedIOException | IOException var9) {
            d.warn("Failed to copy datapacks to world {}", $$1, var9);
            $$3.close();
         }
      } catch (UncheckedIOException | IOException var10) {
         d.warn("Failed to create access for {}", $$1, var10);
      }

      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fqq $$1) {
      MutableObject<Path> $$2 = new MutableObject();

      try (Stream<Path> $$3 = Files.walk($$0)) {
         $$3.filter($$1x -> !$$1x.equals($$0)).forEach($$2x -> {
            Path $$3x = (Path)$$2.getValue();
            if ($$3x == null) {
               try {
                  $$3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  d.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(var5);
               }

               $$2.setValue($$3x);
            }

            a($$0, $$3x, $$2x);
         });
      } catch (UncheckedIOException | IOException var8) {
         d.warn("Failed to copy datapacks from world {}", $$0, var8);
         fwh.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, auz> c(dlh $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = avc.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends fwa {
      private static final xg c = xg.c("createWorld.tab.game.title");
      private static final xg d = xg.c("selectWorld.allowCommands");
      private final fuh e;

      a() {
         super(c);
         fxl.b $$0 = this.a.b(8).d(1);
         fxp $$1 = $$0.b();
         this.e = new fuh(ger.this.p, 208, 20, xg.c("selectWorld.enterName"));
         this.e.a(ger.this.C.b());
         this.e.b(ger.this.C::a);
         ger.this.C.a($$0x -> this.e.a(fvj.a(xg.a("selectWorld.targetFolder", xg.b($$0x.c()).a(o.u)))));
         ger.this.b(this.e);
         $$0.a(fxi.a(ger.this.p, this.e, ger.v), $$0.b().b());
         fuf<gfd.a> $$2 = $$0.a(fuf.<gfd.a>a($$0x -> $$0x.f).a(gfd.a.a, gfd.a.b, gfd.a.c).a(0, 0, 210, 20, ger.u, ($$0x, $$1x) -> ger.this.C.a($$1x)), $$1);
         ger.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fvj.a($$1x.d().a()));
         });
         fuf<buz> $$3 = $$0.a(fuf.a(buz::b).a(buz.values()).a(0, 0, 210, 20, xg.c("options.difficulty"), ($$0x, $$1x) -> ger.this.C.a($$1x)), $$1);
         ger.this.C.a($$1x -> {
            $$3.a(ger.this.C.e());
            $$3.j = !ger.this.C.f();
            $$3.a(fvj.a(ger.this.C.e().d()));
         });
         fuf<Boolean> $$4 = $$0.a(fuf.e().a($$0x -> fvj.a(ger.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> ger.this.C.a($$1x)));
         ger.this.C.a($$1x -> {
            $$4.a(ger.this.C.g());
            $$4.j = !ger.this.C.l() && !ger.this.C.f();
         });
         if (!ac.b().g()) {
            $$0.a(fty.a(ger.w, $$0x -> ger.this.a(ger.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fwa {
      private static final xg c = xg.c("createWorld.tab.more.title");
      private static final xg d = xg.c("selectWorld.gameRules");
      private static final xg e = xg.c("selectWorld.dataPacks");

      b() {
         super(c);
         fxl.b $$0 = this.a.b(8).d(1);
         $$0.a(fty.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fty.a(ger.w, $$0x -> ger.this.a(ger.this.C.k().h())).a(210).a());
         $$0.a(fty.a(e, $$0x -> ger.this.b(ger.this.C.k().h())).a(210).a());
      }

      private void b() {
         ger.this.m.a(new get(ger.this.C.q().a(ger.this.C.k().h().b()), $$0 -> {
            ger.this.m.a(ger.this);
            $$0.ifPresent(ger.this.C::a);
         }));
      }
   }

   class c extends fwa {
      private static final xg c = xg.c("createWorld.tab.world.title");
      private static final xg d = xg.c("generator.minecraft.amplified.info");
      private static final xg e = xg.c("selectWorld.mapFeatures");
      private static final xg f = xg.c("selectWorld.mapFeatures.info");
      private static final xg g = xg.c("selectWorld.bonusItems");
      private static final xg h = xg.c("selectWorld.enterSeed");
      static final xg i = xg.c("selectWorld.seedInfo").a(o.i);
      private static final int j = 310;
      private final fuh k;
      private final fty l;

      c() {
         super(c);
         fxl.b $$0 = this.a.a(10).b(8).d(2);
         fuf<gfd.b> $$1 = $$0.a(
            fuf.<gfd.b>a(gfd.b::a).a(this.c()).a(ger.c::a).a(0, 0, 150, 20, xg.c("selectWorld.mapType"), ($$0x, $$1x) -> ger.this.C.a($$1x))
         );
         $$1.a(ger.this.C.m());
         ger.this.C.a($$1x -> {
            gfd.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fvj.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = ger.this.C.m().c() != null;
         });
         this.l = $$0.a(fty.a(xg.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         ger.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fuh(ger.this.p, 308, 20, xg.c("selectWorld.enterSeed")) {
            @Override
            protected xu d() {
               return super.d().b(xf.t).b(ger.c.i);
            }
         };
         this.k.c(i);
         this.k.a(ger.this.C.h());
         this.k.b($$0x -> ger.this.C.b(this.k.a()));
         $$0.a(fxi.a(ger.this.p, this.k, h), 2);
         gfa.a $$2 = gfa.a(310);
         $$2.a(e, ger.this.C::i, ger.this.C::b).a(() -> !ger.this.C.l()).a(f);
         $$2.a(g, ger.this.C::j, ger.this.C::c).a(() -> !ger.this.C.f() && !ger.this.C.l());
         gfa $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         ger.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         gey $$0 = ger.this.C.n();
         if ($$0 != null) {
            ger.this.m.a($$0.createEditScreen(ger.this, ger.this.C.k()));
         }
      }

      private fuf.c<gfd.b> c() {
         return new fuf.c<gfd.b>() {
            @Override
            public List<gfd.b> a() {
               return fuf.a.getAsBoolean() ? ger.this.C.p() : ger.this.C.o();
            }

            @Override
            public List<gfd.b> b() {
               return ger.this.C.o();
            }
         };
      }

      private static xu a(fuf<gfd.b> $$0) {
         return $$0.a().b() ? xf.a($$0.c(), d) : $$0.c();
      }
   }
}
