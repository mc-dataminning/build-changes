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

public class gdo extends fyn {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final wy u = wy.c("selectWorld.gameMode");
   static final wy v = wy.c("selectWorld.enterName");
   static final wy w = wy.c("selectWorld.experiments");
   static final wy x = wy.c("selectWorld.allowCommands.info");
   private static final wy y = wy.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final alg a = alg.b("textures/gui/tab_header_background.png");
   private final fwj B = new fwj(this);
   final gea C;
   private final fuz D = new fuz($$1x -> {
      fst var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final fen F;
   private final gdn G;
   @Nullable
   private final fyn H;
   @Nullable
   private Path I;
   @Nullable
   private aun J;
   @Nullable
   private fva K;

   public static void a(fpo $$0, @Nullable fyn $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (ezi)$$2));
   }

   public static void a(fpo $$0, @Nullable fyn $$1, gdn $$2) {
      gdz $$3 = ($$0x, $$1x, $$2x) -> new gdy($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<ame.a, ehj> $$4 = $$0x -> new ehj(ehl.a(), eqy.a($$0x.c()));
      a($$0, $$1, $$4, $$3, eqy.a, $$2);
   }

   public static void b(fpo $$0, @Nullable fyn $$1) {
      gdz $$2 = ($$0x, $$1x, $$2x) -> new gdy($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gdt(gea.a.c, Set.of(djd.m, djd.x, djd.f), epk.h));
      Function<ame.a, ehj> $$3 = $$0x -> new ehj(ehl.b(), eqy.c($$0x.c()));
      a($$0, $$1, $$3, $$2, eqy.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ezi)$$2x));
   }

   private static void a(fpo $$0, @Nullable fyn $$1, Function<ame.a, ehj> $$2, gdz $$3, alf<eqx> $$4, gdn $$5) {
      a($$0, y);
      aun $$6 = new aun(new auq($$0.be()));
      dkf $$7 = ac.aV ? new dkf(new div(List.of("vanilla", "tests"), List.of()), cuv.h) : dkf.d;
      ame.c $$8 = a($$6, $$7);
      CompletableFuture<gdy> $$9 = ame.a($$8, $$1x -> new ame.b<>(new gdp($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ag.h(), $$0);
      $$0.b($$9::isDone);
      $$0.a(new gdo($$0, $$1, $$9.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static gdo a(fpo $$0, @Nullable fyn $$1, djl $$2, gdy $$3, @Nullable Path $$4) {
      gdo $$5 = new gdo($$0, $$1, $$3, eqy.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ezi)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(gea.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(gea.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(gea.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private gdo(fpo $$0, @Nullable fyn $$1, gdy $$2, Optional<alf<eqx>> $$3, OptionalLong $$4, gdn $$5) {
      super(wy.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new gea($$0.m().c(), $$2, $$3, $$4);
   }

   public gea m() {
      return this.C;
   }

   @Override
   protected void aO_() {
      this.K = fva.a(this.D, this.n).a(new gdo.a(), new gdo.c(), new gdo.b()).a();
      this.c(this.K);
      fwn $$0 = this.B.b(fwn.e().a(8));
      $$0.a(fsv.a(wy.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fsv.a(wx.e, $$0x -> this.E()).a());
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
         fxc $$1 = new fxc(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fpo $$0, wy $$1) {
      $$0.d(new fxy($$1));
   }

   private void F() {
      gdy $$0 = this.C.k();
      ehi.b $$1 = $$0.e().a($$0.d());
      jm<alp> $$2 = $$0.f().a(alp.c, $$1.b());
      Lifecycle $$3 = cuv.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      djl $$7 = this.c($$1.d() == ezg.a.c);
      ezg $$8 = new ezg($$7, this.C.k().c(), $$1.d(), $$5);
      geb.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jm<alp> $$0, ezg $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jm<alp> $$0, ezi $$1) {
      String $$2 = this.C.c();
      gdy $$3 = this.C.k();
      a(this.m, y);
      Optional<ezc.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fve.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private djl c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         djd $$2 = new djd(dkf.d.b());
         $$2.b(djd.m).a(false, null);
         return new djl($$1, dje.d, false, bud.a, true, $$2, dkf.d);
      } else {
         return new djl($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gqx::H, fyn.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fsh $$0) {
      $$0.a(gqx::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fve.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dkf $$0) {
      Pair<Path, aun> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gds(this, (aun)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dkf $$0) {
      Pair<Path, aun> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gcf((aun)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wy.c("dataPack.title")));
      }
   }

   private void a(aun $$0, boolean $$1, Consumer<dkf> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dkf $$5 = new dkf(new div($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cut $$6 = $$0.f();
         if (cuv.a($$6) && $$1) {
            this.m.a(new gdm($$0.g(), $$3x -> {
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

   private void a(aun $$0, dkf $$1, Consumer<dkf> $$2) {
      this.m.d(new fxy(wy.c("dataPack.validation.working")));
      ame.c $$3 = a($$0, $$1);
      ame.<gdp, gdy>a(
            $$3,
            $$0x -> {
               if ($$0x.c().e(mh.bn).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().e(mh.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  gdy $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = ehj.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  ehj $$5 = (ehj)$$3x.flatMap($$1xx -> ehj.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new ame.b<>(new gdp($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new gdy($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fxl($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dkf.d);
                  }
               }, wy.c("dataPack.validation.failed"), wx.a, wy.c("dataPack.validation.back"), wy.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static ame.c a(aun $$0, dkf $$1) {
      ame.d $$2 = new ame.d($$0, $$1, false, true);
      return new ame.c($$2, ek.a.c, 2);
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

   private static Optional<ezc.c> a(fpo $$0, String $$1, @Nullable Path $$2) {
      try {
         ezc.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(eza.j);
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
   public static Path a(Path $$0, fpo $$1) {
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
         fve.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aun> c(dkf $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = auq.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends fux {
      private static final wy c = wy.c("createWorld.tab.game.title");
      private static final wy d = wy.c("selectWorld.allowCommands");
      private final fte e;

      a() {
         super(c);
         fwi.b $$0 = this.a.b(8).d(1);
         fwm $$1 = $$0.b();
         this.e = new fte(gdo.this.p, 208, 20, wy.c("selectWorld.enterName"));
         this.e.a(gdo.this.C.b());
         this.e.b(gdo.this.C::a);
         gdo.this.C.a($$0x -> this.e.a(fug.a(wy.a("selectWorld.targetFolder", wy.b($$0x.c()).a(o.u)))));
         gdo.this.b(this.e);
         $$0.a(fwf.a(gdo.this.p, this.e, gdo.v), $$0.b().b());
         ftc<gea.a> $$2 = $$0.a(ftc.<gea.a>a($$0x -> $$0x.f).a(gea.a.a, gea.a.b, gea.a.c).a(0, 0, 210, 20, gdo.u, ($$0x, $$1x) -> gdo.this.C.a($$1x)), $$1);
         gdo.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fug.a($$1x.d().a()));
         });
         ftc<bud> $$3 = $$0.a(ftc.a(bud::b).a(bud.values()).a(0, 0, 210, 20, wy.c("options.difficulty"), ($$0x, $$1x) -> gdo.this.C.a($$1x)), $$1);
         gdo.this.C.a($$1x -> {
            $$3.a(gdo.this.C.e());
            $$3.j = !gdo.this.C.f();
            $$3.a(fug.a(gdo.this.C.e().d()));
         });
         ftc<Boolean> $$4 = $$0.a(ftc.e().a($$0x -> fug.a(gdo.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> gdo.this.C.a($$1x)));
         gdo.this.C.a($$1x -> {
            $$4.a(gdo.this.C.g());
            $$4.j = !gdo.this.C.l() && !gdo.this.C.f();
         });
         if (!ac.b().g()) {
            $$0.a(fsv.a(gdo.w, $$0x -> gdo.this.a(gdo.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fux {
      private static final wy c = wy.c("createWorld.tab.more.title");
      private static final wy d = wy.c("selectWorld.gameRules");
      private static final wy e = wy.c("selectWorld.dataPacks");

      b() {
         super(c);
         fwi.b $$0 = this.a.b(8).d(1);
         $$0.a(fsv.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fsv.a(gdo.w, $$0x -> gdo.this.a(gdo.this.C.k().h())).a(210).a());
         $$0.a(fsv.a(e, $$0x -> gdo.this.b(gdo.this.C.k().h())).a(210).a());
      }

      private void b() {
         gdo.this.m.a(new gdq(gdo.this.C.q().a(gdo.this.C.k().h().b()), $$0 -> {
            gdo.this.m.a(gdo.this);
            $$0.ifPresent(gdo.this.C::a);
         }));
      }
   }

   class c extends fux {
      private static final wy c = wy.c("createWorld.tab.world.title");
      private static final wy d = wy.c("generator.minecraft.amplified.info");
      private static final wy e = wy.c("selectWorld.mapFeatures");
      private static final wy f = wy.c("selectWorld.mapFeatures.info");
      private static final wy g = wy.c("selectWorld.bonusItems");
      private static final wy h = wy.c("selectWorld.enterSeed");
      static final wy i = wy.c("selectWorld.seedInfo").a(o.i);
      private static final int j = 310;
      private final fte k;
      private final fsv l;

      c() {
         super(c);
         fwi.b $$0 = this.a.a(10).b(8).d(2);
         ftc<gea.b> $$1 = $$0.a(
            ftc.<gea.b>a(gea.b::a).a(this.c()).a(gdo.c::a).a(0, 0, 150, 20, wy.c("selectWorld.mapType"), ($$0x, $$1x) -> gdo.this.C.a($$1x))
         );
         $$1.a(gdo.this.C.m());
         gdo.this.C.a($$1x -> {
            gea.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fug.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = gdo.this.C.m().c() != null;
         });
         this.l = $$0.a(fsv.a(wy.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         gdo.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fte(gdo.this.p, 308, 20, wy.c("selectWorld.enterSeed")) {
            @Override
            protected xm d() {
               return super.d().b(wx.t).b(gdo.c.i);
            }
         };
         this.k.c(i);
         this.k.a(gdo.this.C.h());
         this.k.b($$0x -> gdo.this.C.b(this.k.a()));
         $$0.a(fwf.a(gdo.this.p, this.k, h), 2);
         gdx.a $$2 = gdx.a(310);
         $$2.a(e, gdo.this.C::i, gdo.this.C::b).a(() -> !gdo.this.C.l()).a(f);
         $$2.a(g, gdo.this.C::j, gdo.this.C::c).a(() -> !gdo.this.C.f() && !gdo.this.C.l());
         gdx $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         gdo.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         gdv $$0 = gdo.this.C.n();
         if ($$0 != null) {
            gdo.this.m.a($$0.createEditScreen(gdo.this, gdo.this.C.k()));
         }
      }

      private ftc.c<gea.b> c() {
         return new ftc.c<gea.b>() {
            @Override
            public List<gea.b> a() {
               return ftc.a.getAsBoolean() ? gdo.this.C.p() : gdo.this.C.o();
            }

            @Override
            public List<gea.b> b() {
               return gdo.this.C.o();
            }
         };
      }

      private static xm a(ftc<gea.b> $$0) {
         return $$0.a().b() ? wx.a($$0.c(), d) : $$0.c();
      }
   }
}
