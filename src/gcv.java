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

public class gcv extends fxu {
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
   private final fvq B = new fvq(this);
   final gdh C;
   private final fug D = new fug($$1x -> {
      fsa var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final fdy F;
   private final gcu G;
   @Nullable
   private final fxu H;
   @Nullable
   private Path I;
   @Nullable
   private aun J;
   @Nullable
   private fuh K;

   public static void a(fos $$0, @Nullable fxu $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (eyt)$$2));
   }

   public static void a(fos $$0, @Nullable fxu $$1, gcu $$2) {
      gdg $$3 = ($$0x, $$1x, $$2x) -> new gdf($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<ame.a, egu> $$4 = $$0x -> new egu(egw.a(), eqj.a($$0x.c()));
      a($$0, $$1, $$4, $$3, eqj.a, $$2);
   }

   public static void b(fos $$0, @Nullable fxu $$1) {
      gdg $$2 = ($$0x, $$1x, $$2x) -> new gdf($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gda(gdh.a.c, Set.of(dir.l, dir.w, dir.e), eov.h));
      Function<ame.a, egu> $$3 = $$0x -> new egu(egw.b(), eqj.c($$0x.c()));
      a($$0, $$1, $$3, $$2, eqj.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (eyt)$$2x));
   }

   private static void a(fos $$0, @Nullable fxu $$1, Function<ame.a, egu> $$2, gdg $$3, alf<eqi> $$4, gcu $$5) {
      a($$0, y);
      aun $$6 = new aun(new auq($$0.be()));
      djt $$7 = ab.aU ? new djt(new dij(List.of("vanilla", "tests"), List.of()), cuj.h) : djt.d;
      ame.c $$8 = a($$6, $$7);
      CompletableFuture<gdf> $$9 = ame.a($$8, $$1x -> new ame.b<>(new gcw($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, af.h(), $$0);
      $$0.b($$9::isDone);
      $$0.a(new gcv($$0, $$1, $$9.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static gcv a(fos $$0, @Nullable fxu $$1, diz $$2, gdf $$3, @Nullable Path $$4) {
      gcv $$5 = new gcv($$0, $$1, $$3, eqj.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (eyt)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(gdh.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(gdh.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(gdh.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private gcv(fos $$0, @Nullable fxu $$1, gdf $$2, Optional<alf<eqi>> $$3, OptionalLong $$4, gcu $$5) {
      super(wy.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new gdh($$0.m().c(), $$2, $$3, $$4);
   }

   public gdh m() {
      return this.C;
   }

   @Override
   protected void aN_() {
      this.K = fuh.a(this.D, this.n).a(new gcv.a(), new gcv.c(), new gcv.b()).a();
      this.c(this.K);
      fvu $$0 = this.B.b(fvu.e().a(8));
      $$0.a(fsc.a(wy.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fsc.a(wx.e, $$0x -> this.E()).a());
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
         fwj $$1 = new fwj(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fos $$0, wy $$1) {
      $$0.d(new fxf($$1));
   }

   private void F() {
      gdf $$0 = this.C.k();
      egt.b $$1 = $$0.e().a($$0.d());
      jl<alp> $$2 = $$0.f().a(alp.c, $$1.b());
      Lifecycle $$3 = cuj.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      diz $$7 = this.c($$1.d() == eyr.a.c);
      eyr $$8 = new eyr($$7, this.C.k().c(), $$1.d(), $$5);
      gdi.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jl<alp> $$0, eyr $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jl<alp> $$0, eyt $$1) {
      String $$2 = this.C.c();
      gdf $$3 = this.C.k();
      a(this.m, y);
      Optional<eyn.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         ful.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private diz c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dir $$2 = new dir(djt.d.b());
         $$2.b(dir.l).a(false, null);
         return new diz($$1, dis.d, false, bty.a, true, $$2, djt.d);
      } else {
         return new diz($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gqc::H, fxu.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fro $$0) {
      $$0.a(gqc::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            ful.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(djt $$0) {
      Pair<Path, aun> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gcz(this, (aun)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(djt $$0) {
      Pair<Path, aun> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gbm((aun)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wy.c("dataPack.title")));
      }
   }

   private void a(aun $$0, boolean $$1, Consumer<djt> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      djt $$5 = new djt(new dij($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cuh $$6 = $$0.f();
         if (cuj.a($$6) && $$1) {
            this.m.a(new gct($$0.g(), $$3x -> {
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

   private void a(aun $$0, djt $$1, Consumer<djt> $$2) {
      this.m.d(new fxf(wy.c("dataPack.validation.working")));
      ame.c $$3 = a($$0, $$1);
      ame.<gcw, gdf>a(
            $$3,
            $$0x -> {
               if ($$0x.c().e(mg.bm).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().e(mg.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  gdf $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = egu.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  egu $$5 = (egu)$$3x.flatMap($$1xx -> egu.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new ame.b<>(new gcw($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new gdf($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fws($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(djt.d);
                  }
               }, wy.c("dataPack.validation.failed"), wx.a, wy.c("dataPack.validation.back"), wy.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static ame.c a(aun $$0, djt $$1) {
      ame.d $$2 = new ame.d($$0, $$1, false, true);
      return new ame.c($$2, ej.a.c, 2);
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

   private static Optional<eyn.c> a(fos $$0, String $$1, @Nullable Path $$2) {
      try {
         eyn.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(eyl.j);
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
   public static Path a(Path $$0, fos $$1) {
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
         ful.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aun> c(djt $$0) {
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

   class a extends fue {
      private static final wy c = wy.c("createWorld.tab.game.title");
      private static final wy d = wy.c("selectWorld.allowCommands");
      private final fsl e;

      a() {
         super(c);
         fvp.b $$0 = this.a.b(8).d(1);
         fvt $$1 = $$0.b();
         this.e = new fsl(gcv.this.p, 208, 20, wy.c("selectWorld.enterName"));
         this.e.a(gcv.this.C.b());
         this.e.b(gcv.this.C::a);
         gcv.this.C.a($$0x -> this.e.a(ftn.a(wy.a("selectWorld.targetFolder", wy.b($$0x.c()).a(n.u)))));
         gcv.this.b(this.e);
         $$0.a(fvm.a(gcv.this.p, this.e, gcv.v), $$0.b().b());
         fsj<gdh.a> $$2 = $$0.a(fsj.<gdh.a>a($$0x -> $$0x.f).a(gdh.a.a, gdh.a.b, gdh.a.c).a(0, 0, 210, 20, gcv.u, ($$0x, $$1x) -> gcv.this.C.a($$1x)), $$1);
         gcv.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(ftn.a($$1x.d().a()));
         });
         fsj<bty> $$3 = $$0.a(fsj.a(bty::b).a(bty.values()).a(0, 0, 210, 20, wy.c("options.difficulty"), ($$0x, $$1x) -> gcv.this.C.a($$1x)), $$1);
         gcv.this.C.a($$1x -> {
            $$3.a(gcv.this.C.e());
            $$3.j = !gcv.this.C.f();
            $$3.a(ftn.a(gcv.this.C.e().d()));
         });
         fsj<Boolean> $$4 = $$0.a(fsj.e().a($$0x -> ftn.a(gcv.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> gcv.this.C.a($$1x)));
         gcv.this.C.a($$1x -> {
            $$4.a(gcv.this.C.g());
            $$4.j = !gcv.this.C.l() && !gcv.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fsc.a(gcv.w, $$0x -> gcv.this.a(gcv.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fue {
      private static final wy c = wy.c("createWorld.tab.more.title");
      private static final wy d = wy.c("selectWorld.gameRules");
      private static final wy e = wy.c("selectWorld.dataPacks");

      b() {
         super(c);
         fvp.b $$0 = this.a.b(8).d(1);
         $$0.a(fsc.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fsc.a(gcv.w, $$0x -> gcv.this.a(gcv.this.C.k().h())).a(210).a());
         $$0.a(fsc.a(e, $$0x -> gcv.this.b(gcv.this.C.k().h())).a(210).a());
      }

      private void b() {
         gcv.this.m.a(new gcx(gcv.this.C.q().a(gcv.this.C.k().h().b()), $$0 -> {
            gcv.this.m.a(gcv.this);
            $$0.ifPresent(gcv.this.C::a);
         }));
      }
   }

   class c extends fue {
      private static final wy c = wy.c("createWorld.tab.world.title");
      private static final wy d = wy.c("generator.minecraft.amplified.info");
      private static final wy e = wy.c("selectWorld.mapFeatures");
      private static final wy f = wy.c("selectWorld.mapFeatures.info");
      private static final wy g = wy.c("selectWorld.bonusItems");
      private static final wy h = wy.c("selectWorld.enterSeed");
      static final wy i = wy.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fsl k;
      private final fsc l;

      c() {
         super(c);
         fvp.b $$0 = this.a.a(10).b(8).d(2);
         fsj<gdh.b> $$1 = $$0.a(
            fsj.<gdh.b>a(gdh.b::a).a(this.c()).a(gcv.c::a).a(0, 0, 150, 20, wy.c("selectWorld.mapType"), ($$0x, $$1x) -> gcv.this.C.a($$1x))
         );
         $$1.a(gcv.this.C.m());
         gcv.this.C.a($$1x -> {
            gdh.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(ftn.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = gcv.this.C.m().c() != null;
         });
         this.l = $$0.a(fsc.a(wy.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         gcv.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fsl(gcv.this.p, 308, 20, wy.c("selectWorld.enterSeed")) {
            @Override
            protected xm d() {
               return super.d().b(wx.t).b(gcv.c.i);
            }
         };
         this.k.c(i);
         this.k.a(gcv.this.C.h());
         this.k.b($$0x -> gcv.this.C.b(this.k.a()));
         $$0.a(fvm.a(gcv.this.p, this.k, h), 2);
         gde.a $$2 = gde.a(310);
         $$2.a(e, gcv.this.C::i, gcv.this.C::b).a(() -> !gcv.this.C.l()).a(f);
         $$2.a(g, gcv.this.C::j, gcv.this.C::c).a(() -> !gcv.this.C.f() && !gcv.this.C.l());
         gde $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         gcv.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         gdc $$0 = gcv.this.C.n();
         if ($$0 != null) {
            gcv.this.m.a($$0.createEditScreen(gcv.this, gcv.this.C.k()));
         }
      }

      private fsj.c<gdh.b> c() {
         return new fsj.c<gdh.b>() {
            @Override
            public List<gdh.b> a() {
               return fsj.a.getAsBoolean() ? gcv.this.C.p() : gcv.this.C.o();
            }

            @Override
            public List<gdh.b> b() {
               return gcv.this.C.o();
            }
         };
      }

      private static xm a(fsj<gdh.b> $$0) {
         return $$0.a().b() ? wx.a($$0.c(), d) : $$0.c();
      }
   }
}
