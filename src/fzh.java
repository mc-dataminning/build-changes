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

public class fzh extends fui {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final wo u = wo.c("selectWorld.gameMode");
   static final wo v = wo.c("selectWorld.enterName");
   static final wo w = wo.c("selectWorld.experiments");
   static final wo x = wo.c("selectWorld.allowCommands.info");
   private static final wo y = wo.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final aku a = aku.b("textures/gui/tab_header_background.png");
   private final fse B = new fse(this);
   final fzt C;
   private final fqu D = new fqu($$1x -> {
      fon var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final fao F;
   private final fzg G;
   @Nullable
   private final fui H;
   @Nullable
   private Path I;
   @Nullable
   private atz J;
   @Nullable
   private fqv K;

   public static void a(flh $$0, @Nullable fui $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (evj)$$2));
   }

   public static void a(flh $$0, @Nullable fui $$1, fzg $$2) {
      fzs $$3 = ($$0x, $$1x, $$2x) -> new fzr($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<als.a, edm> $$4 = $$0x -> new edm(edo.a(), ena.a($$0x.c()));
      a($$0, $$1, $$4, $$3, ena.a, $$2);
   }

   public static void b(flh $$0, @Nullable fui $$1) {
      fzs $$2 = ($$0x, $$1x, $$2x) -> new fzr($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new fzm(fzt.a.c, Set.of(dgc.l, dgc.w, dgc.e), elm.h));
      Function<als.a, edm> $$3 = $$0x -> new edm(edo.b(), ena.c($$0x.c()));
      a($$0, $$1, $$3, $$2, ena.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (evj)$$2x));
   }

   private static void a(flh $$0, @Nullable fui $$1, Function<als.a, edm> $$2, fzs $$3, akt<emz> $$4, fzg $$5) {
      a($$0, y);
      atz $$6 = new atz(new auc($$0.be()));
      als.c $$7 = a($$6, dhd.c);
      CompletableFuture<fzr> $$8 = als.a($$7, $$1x -> new als.b<>(new fzi($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, af.g(), $$0);
      $$0.b($$8::isDone);
      $$0.a(new fzh($$0, $$1, $$8.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static fzh a(flh $$0, @Nullable fui $$1, dgk $$2, fzr $$3, @Nullable Path $$4) {
      fzh $$5 = new fzh($$0, $$1, $$3, ena.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (evj)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fzt.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fzt.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fzt.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private fzh(flh $$0, @Nullable fui $$1, fzr $$2, Optional<akt<emz>> $$3, OptionalLong $$4, fzg $$5) {
      super(wo.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new fzt($$0.m().c(), $$2, $$3, $$4);
   }

   public fzt m() {
      return this.C;
   }

   @Override
   protected void aR_() {
      this.K = fqv.a(this.D, this.n).a(new fzh.a(), new fzh.c(), new fzh.b()).a();
      this.c(this.K);
      fsi $$0 = this.B.b(fsi.e().a(8));
      $$0.a(fop.a(wo.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fop.a(wn.e, $$0x -> this.E()).a());
      this.B.a($$0x -> {
         $$0x.l(1);
         this.c($$0x);
      });
      this.K.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aF_() {
   }

   @Override
   public void c() {
      if (this.K != null) {
         this.K.a(this.n);
         this.K.b();
         int $$0 = this.K.J().c();
         fsx $$1 = new fsx(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(flh $$0, wo $$1) {
      $$0.d(new ftt($$1));
   }

   private void F() {
      fzr $$0 = this.C.k();
      edl.b $$1 = $$0.e().a($$0.d());
      jy<ald> $$2 = $$0.f().a(ald.c, $$1.b());
      Lifecycle $$3 = crt.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dgk $$7 = this.c($$1.d() == evh.a.c);
      evh $$8 = new evh($$7, this.C.k().c(), $$1.d(), $$5);
      fzu.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jy<ald> $$0, evh $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jy<ald> $$0, evj $$1) {
      String $$2 = this.C.c();
      fzr $$3 = this.C.k();
      a(this.m, y);
      Optional<evd.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fqz.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dgk c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dgc $$2 = new dgc(dhd.c.b());
         $$2.a(dgc.l).a(false, null);
         return new dgk($$1, dgd.d, false, bsf.a, true, $$2, dhd.c);
      } else {
         return new dgk($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void aO_() {
      this.E();
   }

   public void E() {
      this.m.a(this.H);
      this.H();
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gmf::H, fui.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fob $$0) {
      $$0.a(gmf::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fqz.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dhd $$0) {
      Pair<Path, atz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fzl(this, (atz)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dhd $$0) {
      Pair<Path, atz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fxy((atz)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wo.c("dataPack.title")));
      }
   }

   private void a(atz $$0, boolean $$1, Consumer<dhd> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dhd $$5 = new dhd(new dft($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         crr $$6 = $$0.f();
         if (crt.a($$6) && $$1) {
            this.m.a(new fzf($$0.g(), $$3x -> {
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

   private void a(atz $$0, dhd $$1, Consumer<dhd> $$2) {
      this.m.d(new ftt(wo.c("dataPack.validation.working")));
      als.c $$3 = a($$0, $$1);
      als.<fzi, fzr>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(mc.bb).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(mc.aI).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fzr $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = edm.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  edm $$5 = (edm)$$3x.flatMap($$1xx -> edm.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new als.b<>(new fzi($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fzr($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            af.g(),
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
               this.m.a(new ftg($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dhd.c);
                  }
               }, wo.c("dataPack.validation.failed"), wn.a, wo.c("dataPack.validation.back"), wo.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static als.c a(atz $$0, dhd $$1) {
      als.d $$2 = new als.d($$0, $$1, false, true);
      return new als.c($$2, ey.a.c, 2);
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

   private static Optional<evd.c> a(flh $$0, String $$1, @Nullable Path $$2) {
      try {
         evd.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(evb.j);
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
   public static Path a(Path $$0, flh $$1) {
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
         fqz.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, atz> c(dhd $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = auc.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends fqs {
      private static final wo c = wo.c("createWorld.tab.game.title");
      private static final wo d = wo.c("selectWorld.allowCommands");
      private final foz e;

      a() {
         super(c);
         fsd.b $$0 = this.a.b(8).d(1);
         fsh $$1 = $$0.b();
         this.e = new foz(fzh.this.p, 208, 20, wo.c("selectWorld.enterName"));
         this.e.a(fzh.this.C.b());
         this.e.b(fzh.this.C::a);
         fzh.this.C.a($$0x -> this.e.a(fqb.a(wo.a("selectWorld.targetFolder", wo.b($$0x.c()).a(n.u)))));
         fzh.this.b(this.e);
         $$0.a(fsa.a(fzh.this.p, this.e, fzh.v), $$0.b().b());
         fox<fzt.a> $$2 = $$0.a(fox.<fzt.a>a($$0x -> $$0x.f).a(fzt.a.a, fzt.a.b, fzt.a.c).a(0, 0, 210, 20, fzh.u, ($$0x, $$1x) -> fzh.this.C.a($$1x)), $$1);
         fzh.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fqb.a($$1x.d().a()));
         });
         fox<bsf> $$3 = $$0.a(fox.a(bsf::b).a(bsf.values()).a(0, 0, 210, 20, wo.c("options.difficulty"), ($$0x, $$1x) -> fzh.this.C.a($$1x)), $$1);
         fzh.this.C.a($$1x -> {
            $$3.a(fzh.this.C.e());
            $$3.j = !fzh.this.C.f();
            $$3.a(fqb.a(fzh.this.C.e().d()));
         });
         fox<Boolean> $$4 = $$0.a(fox.e().a($$0x -> fqb.a(fzh.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fzh.this.C.a($$1x)));
         fzh.this.C.a($$1x -> {
            $$4.a(fzh.this.C.g());
            $$4.j = !fzh.this.C.l() && !fzh.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fop.a(fzh.w, $$0x -> fzh.this.a(fzh.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fqs {
      private static final wo c = wo.c("createWorld.tab.more.title");
      private static final wo d = wo.c("selectWorld.gameRules");
      private static final wo e = wo.c("selectWorld.dataPacks");

      b() {
         super(c);
         fsd.b $$0 = this.a.b(8).d(1);
         $$0.a(fop.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fop.a(fzh.w, $$0x -> fzh.this.a(fzh.this.C.k().h())).a(210).a());
         $$0.a(fop.a(e, $$0x -> fzh.this.b(fzh.this.C.k().h())).a(210).a());
      }

      private void b() {
         fzh.this.m.a(new fzj(fzh.this.C.q().a(fzh.this.C.k().h().b()), $$0 -> {
            fzh.this.m.a(fzh.this);
            $$0.ifPresent(fzh.this.C::a);
         }));
      }
   }

   class c extends fqs {
      private static final wo c = wo.c("createWorld.tab.world.title");
      private static final wo d = wo.c("generator.minecraft.amplified.info");
      private static final wo e = wo.c("selectWorld.mapFeatures");
      private static final wo f = wo.c("selectWorld.mapFeatures.info");
      private static final wo g = wo.c("selectWorld.bonusItems");
      private static final wo h = wo.c("selectWorld.enterSeed");
      static final wo i = wo.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final foz k;
      private final fop l;

      c() {
         super(c);
         fsd.b $$0 = this.a.a(10).b(8).d(2);
         fox<fzt.b> $$1 = $$0.a(
            fox.<fzt.b>a(fzt.b::a).a(this.c()).a(fzh.c::a).a(0, 0, 150, 20, wo.c("selectWorld.mapType"), ($$0x, $$1x) -> fzh.this.C.a($$1x))
         );
         $$1.a(fzh.this.C.m());
         fzh.this.C.a($$1x -> {
            fzt.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fqb.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fzh.this.C.m().c() != null;
         });
         this.l = $$0.a(fop.a(wo.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fzh.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new foz(fzh.this.p, 308, 20, wo.c("selectWorld.enterSeed")) {
            @Override
            protected xc d() {
               return super.d().b(wn.t).b(fzh.c.i);
            }
         };
         this.k.c(i);
         this.k.a(fzh.this.C.h());
         this.k.b($$0x -> fzh.this.C.b(this.k.a()));
         $$0.a(fsa.a(fzh.this.p, this.k, h), 2);
         fzq.a $$2 = fzq.a(310);
         $$2.a(e, fzh.this.C::i, fzh.this.C::b).a(() -> !fzh.this.C.l()).a(f);
         $$2.a(g, fzh.this.C::j, fzh.this.C::c).a(() -> !fzh.this.C.f() && !fzh.this.C.l());
         fzq $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         fzh.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         fzo $$0 = fzh.this.C.n();
         if ($$0 != null) {
            fzh.this.m.a($$0.createEditScreen(fzh.this, fzh.this.C.k()));
         }
      }

      private fox.c<fzt.b> c() {
         return new fox.c<fzt.b>() {
            @Override
            public List<fzt.b> a() {
               return fox.a.getAsBoolean() ? fzh.this.C.p() : fzh.this.C.o();
            }

            @Override
            public List<fzt.b> b() {
               return fzh.this.C.o();
            }
         };
      }

      private static xc a(fox<fzt.b> $$0) {
         return $$0.a().b() ? wn.a($$0.c(), d) : $$0.c();
      }
   }
}
