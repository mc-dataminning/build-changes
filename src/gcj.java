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

public class gcj extends fxi {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final ww u = ww.c("selectWorld.gameMode");
   static final ww v = ww.c("selectWorld.enterName");
   static final ww w = ww.c("selectWorld.experiments");
   static final ww x = ww.c("selectWorld.allowCommands.info");
   private static final ww y = ww.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final ale a = ale.b("textures/gui/tab_header_background.png");
   private final fve B = new fve(this);
   final gcv C;
   private final ftu D = new ftu($$1x -> {
      fro var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final fdm F;
   private final gci G;
   @Nullable
   private final fxi H;
   @Nullable
   private Path I;
   @Nullable
   private aul J;
   @Nullable
   private ftv K;

   public static void a(fof $$0, @Nullable fxi $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (eyh)$$2));
   }

   public static void a(fof $$0, @Nullable fxi $$1, gci $$2) {
      gcu $$3 = ($$0x, $$1x, $$2x) -> new gct($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<amc.a, egj> $$4 = $$0x -> new egj(egl.a(), epy.a($$0x.c()));
      a($$0, $$1, $$4, $$3, epy.a, $$2);
   }

   public static void b(fof $$0, @Nullable fxi $$1) {
      gcu $$2 = ($$0x, $$1x, $$2x) -> new gct($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gco(gcv.a.c, Set.of(dil.l, dil.w, dil.e), eok.h));
      Function<amc.a, egj> $$3 = $$0x -> new egj(egl.b(), epy.c($$0x.c()));
      a($$0, $$1, $$3, $$2, epy.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (eyh)$$2x));
   }

   private static void a(fof $$0, @Nullable fxi $$1, Function<amc.a, egj> $$2, gcu $$3, ald<epx> $$4, gci $$5) {
      a($$0, y);
      aul $$6 = new aul(new auo($$0.be()));
      djn $$7 = ab.aU ? new djn(new did(List.of("vanilla", "tests"), List.of()), cud.h) : djn.c;
      amc.c $$8 = a($$6, $$7);
      CompletableFuture<gct> $$9 = amc.a($$8, $$1x -> new amc.b<>(new gck($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, af.h(), $$0);
      $$0.b($$9::isDone);
      $$0.a(new gcj($$0, $$1, $$9.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static gcj a(fof $$0, @Nullable fxi $$1, dit $$2, gct $$3, @Nullable Path $$4) {
      gcj $$5 = new gcj($$0, $$1, $$3, epy.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (eyh)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(gcv.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(gcv.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(gcv.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private gcj(fof $$0, @Nullable fxi $$1, gct $$2, Optional<ald<epx>> $$3, OptionalLong $$4, gci $$5) {
      super(ww.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new gcv($$0.m().c(), $$2, $$3, $$4);
   }

   public gcv m() {
      return this.C;
   }

   @Override
   protected void aN_() {
      this.K = ftv.a(this.D, this.n).a(new gcj.a(), new gcj.c(), new gcj.b()).a();
      this.c(this.K);
      fvi $$0 = this.B.b(fvi.e().a(8));
      $$0.a(frq.a(ww.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(frq.a(wv.e, $$0x -> this.E()).a());
      this.B.a($$0x -> {
         $$0x.l(1);
         this.c($$0x);
      });
      this.K.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aB_() {
   }

   @Override
   public void c() {
      if (this.K != null) {
         this.K.a(this.n);
         this.K.b();
         int $$0 = this.K.J().c();
         fvx $$1 = new fvx(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fof $$0, ww $$1) {
      $$0.d(new fwt($$1));
   }

   private void F() {
      gct $$0 = this.C.k();
      egi.b $$1 = $$0.e().a($$0.d());
      jl<aln> $$2 = $$0.f().a(aln.c, $$1.b());
      Lifecycle $$3 = cud.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dit $$7 = this.c($$1.d() == eyf.a.c);
      eyf $$8 = new eyf($$7, this.C.k().c(), $$1.d(), $$5);
      gcw.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jl<aln> $$0, eyf $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jl<aln> $$0, eyh $$1) {
      String $$2 = this.C.c();
      gct $$3 = this.C.k();
      a(this.m, y);
      Optional<eyb.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         ftz.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dit c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dil $$2 = new dil(djn.c.b());
         $$2.b(dil.l).a(false, null);
         return new dit($$1, dim.d, false, btv.a, true, $$2, djn.c);
      } else {
         return new dit($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void aK_() {
      this.E();
   }

   public void E() {
      this.m.a(this.H);
      this.H();
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gpn::H, fxi.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(frc $$0) {
      $$0.a(gpn::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            ftz.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(djn $$0) {
      Pair<Path, aul> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gcn(this, (aul)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(djn $$0) {
      Pair<Path, aul> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gba((aul)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), ww.c("dataPack.title")));
      }
   }

   private void a(aul $$0, boolean $$1, Consumer<djn> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      djn $$5 = new djn(new did($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cub $$6 = $$0.f();
         if (cud.a($$6) && $$1) {
            this.m.a(new gch($$0.g(), $$3x -> {
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

   private void a(aul $$0, djn $$1, Consumer<djn> $$2) {
      this.m.d(new fwt(ww.c("dataPack.validation.working")));
      amc.c $$3 = a($$0, $$1);
      amc.<gck, gct>a(
            $$3,
            $$0x -> {
               if ($$0x.c().e(mg.bl).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().e(mg.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  gct $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = egj.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  egj $$5 = (egj)$$3x.flatMap($$1xx -> egj.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amc.b<>(new gck($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new gct($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            af.h(),
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
               this.m.a(new fwg($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(djn.c);
                  }
               }, ww.c("dataPack.validation.failed"), wv.a, ww.c("dataPack.validation.back"), ww.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amc.c a(aul $$0, djn $$1) {
      amc.d $$2 = new amc.d($$0, $$1, false, true);
      return new amc.c($$2, ej.a.c, 2);
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
         af.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private static Optional<eyb.c> a(fof $$0, String $$1, @Nullable Path $$2) {
      try {
         eyb.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(exz.j);
               v.c($$5);
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
   public static Path a(Path $$0, fof $$1) {
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
         ftz.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aul> c(djn $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = auo.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends fts {
      private static final ww c = ww.c("createWorld.tab.game.title");
      private static final ww d = ww.c("selectWorld.allowCommands");
      private final frz e;

      a() {
         super(c);
         fvd.b $$0 = this.a.b(8).d(1);
         fvh $$1 = $$0.b();
         this.e = new frz(gcj.this.p, 208, 20, ww.c("selectWorld.enterName"));
         this.e.a(gcj.this.C.b());
         this.e.b(gcj.this.C::a);
         gcj.this.C.a($$0x -> this.e.a(ftb.a(ww.a("selectWorld.targetFolder", ww.b($$0x.c()).a(n.u)))));
         gcj.this.b(this.e);
         $$0.a(fva.a(gcj.this.p, this.e, gcj.v), $$0.b().b());
         frx<gcv.a> $$2 = $$0.a(frx.<gcv.a>a($$0x -> $$0x.f).a(gcv.a.a, gcv.a.b, gcv.a.c).a(0, 0, 210, 20, gcj.u, ($$0x, $$1x) -> gcj.this.C.a($$1x)), $$1);
         gcj.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(ftb.a($$1x.d().a()));
         });
         frx<btv> $$3 = $$0.a(frx.a(btv::b).a(btv.values()).a(0, 0, 210, 20, ww.c("options.difficulty"), ($$0x, $$1x) -> gcj.this.C.a($$1x)), $$1);
         gcj.this.C.a($$1x -> {
            $$3.a(gcj.this.C.e());
            $$3.j = !gcj.this.C.f();
            $$3.a(ftb.a(gcj.this.C.e().d()));
         });
         frx<Boolean> $$4 = $$0.a(frx.e().a($$0x -> ftb.a(gcj.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> gcj.this.C.a($$1x)));
         gcj.this.C.a($$1x -> {
            $$4.a(gcj.this.C.g());
            $$4.j = !gcj.this.C.l() && !gcj.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(frq.a(gcj.w, $$0x -> gcj.this.a(gcj.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fts {
      private static final ww c = ww.c("createWorld.tab.more.title");
      private static final ww d = ww.c("selectWorld.gameRules");
      private static final ww e = ww.c("selectWorld.dataPacks");

      b() {
         super(c);
         fvd.b $$0 = this.a.b(8).d(1);
         $$0.a(frq.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(frq.a(gcj.w, $$0x -> gcj.this.a(gcj.this.C.k().h())).a(210).a());
         $$0.a(frq.a(e, $$0x -> gcj.this.b(gcj.this.C.k().h())).a(210).a());
      }

      private void b() {
         gcj.this.m.a(new gcl(gcj.this.C.q().a(gcj.this.C.k().h().b()), $$0 -> {
            gcj.this.m.a(gcj.this);
            $$0.ifPresent(gcj.this.C::a);
         }));
      }
   }

   class c extends fts {
      private static final ww c = ww.c("createWorld.tab.world.title");
      private static final ww d = ww.c("generator.minecraft.amplified.info");
      private static final ww e = ww.c("selectWorld.mapFeatures");
      private static final ww f = ww.c("selectWorld.mapFeatures.info");
      private static final ww g = ww.c("selectWorld.bonusItems");
      private static final ww h = ww.c("selectWorld.enterSeed");
      static final ww i = ww.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final frz k;
      private final frq l;

      c() {
         super(c);
         fvd.b $$0 = this.a.a(10).b(8).d(2);
         frx<gcv.b> $$1 = $$0.a(
            frx.<gcv.b>a(gcv.b::a).a(this.c()).a(gcj.c::a).a(0, 0, 150, 20, ww.c("selectWorld.mapType"), ($$0x, $$1x) -> gcj.this.C.a($$1x))
         );
         $$1.a(gcj.this.C.m());
         gcj.this.C.a($$1x -> {
            gcv.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(ftb.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = gcj.this.C.m().c() != null;
         });
         this.l = $$0.a(frq.a(ww.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         gcj.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new frz(gcj.this.p, 308, 20, ww.c("selectWorld.enterSeed")) {
            @Override
            protected xk d() {
               return super.d().b(wv.t).b(gcj.c.i);
            }
         };
         this.k.c(i);
         this.k.a(gcj.this.C.h());
         this.k.b($$0x -> gcj.this.C.b(this.k.a()));
         $$0.a(fva.a(gcj.this.p, this.k, h), 2);
         gcs.a $$2 = gcs.a(310);
         $$2.a(e, gcj.this.C::i, gcj.this.C::b).a(() -> !gcj.this.C.l()).a(f);
         $$2.a(g, gcj.this.C::j, gcj.this.C::c).a(() -> !gcj.this.C.f() && !gcj.this.C.l());
         gcs $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         gcj.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         gcq $$0 = gcj.this.C.n();
         if ($$0 != null) {
            gcj.this.m.a($$0.createEditScreen(gcj.this, gcj.this.C.k()));
         }
      }

      private frx.c<gcv.b> c() {
         return new frx.c<gcv.b>() {
            @Override
            public List<gcv.b> a() {
               return frx.a.getAsBoolean() ? gcj.this.C.p() : gcj.this.C.o();
            }

            @Override
            public List<gcv.b> b() {
               return gcj.this.C.o();
            }
         };
      }

      private static xk a(frx<gcv.b> $$0) {
         return $$0.a().b() ? wv.a($$0.c(), d) : $$0.c();
      }
   }
}
