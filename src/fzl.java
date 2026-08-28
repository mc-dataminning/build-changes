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

public class fzl extends fum {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final wp u = wp.c("selectWorld.gameMode");
   static final wp v = wp.c("selectWorld.enterName");
   static final wp w = wp.c("selectWorld.experiments");
   static final wp x = wp.c("selectWorld.allowCommands.info");
   private static final wp y = wp.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final akv a = akv.b("textures/gui/tab_header_background.png");
   private final fsi B = new fsi(this);
   final fzx C;
   private final fqy D = new fqy($$1x -> {
      fos var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final far F;
   private final fzk G;
   @Nullable
   private final fum H;
   @Nullable
   private Path I;
   @Nullable
   private aua J;
   @Nullable
   private fqz K;

   public static void a(flk $$0, @Nullable fum $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (evm)$$2));
   }

   public static void a(flk $$0, @Nullable fum $$1, fzk $$2) {
      fzw $$3 = ($$0x, $$1x, $$2x) -> new fzv($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<alt.a, edp> $$4 = $$0x -> new edp(edr.a(), end.a($$0x.c()));
      a($$0, $$1, $$4, $$3, end.a, $$2);
   }

   public static void b(flk $$0, @Nullable fum $$1) {
      fzw $$2 = ($$0x, $$1x, $$2x) -> new fzv($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new fzq(fzx.a.c, Set.of(dgf.l, dgf.w, dgf.e), elp.h));
      Function<alt.a, edp> $$3 = $$0x -> new edp(edr.b(), end.c($$0x.c()));
      a($$0, $$1, $$3, $$2, end.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (evm)$$2x));
   }

   private static void a(flk $$0, @Nullable fum $$1, Function<alt.a, edp> $$2, fzw $$3, aku<enc> $$4, fzk $$5) {
      a($$0, y);
      aua $$6 = new aua(new aud($$0.be()));
      alt.c $$7 = a($$6, dhg.c);
      CompletableFuture<fzv> $$8 = alt.a($$7, $$1x -> new alt.b<>(new fzm($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, af.h(), $$0);
      $$0.b($$8::isDone);
      $$0.a(new fzl($$0, $$1, $$8.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static fzl a(flk $$0, @Nullable fum $$1, dgn $$2, fzv $$3, @Nullable Path $$4) {
      fzl $$5 = new fzl($$0, $$1, $$3, end.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (evm)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fzx.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fzx.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fzx.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private fzl(flk $$0, @Nullable fum $$1, fzv $$2, Optional<aku<enc>> $$3, OptionalLong $$4, fzk $$5) {
      super(wp.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new fzx($$0.m().c(), $$2, $$3, $$4);
   }

   public fzx m() {
      return this.C;
   }

   @Override
   protected void aR_() {
      this.K = fqz.a(this.D, this.n).a(new fzl.a(), new fzl.c(), new fzl.b()).a();
      this.c(this.K);
      fsm $$0 = this.B.b(fsm.e().a(8));
      $$0.a(fou.a(wp.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fou.a(wo.e, $$0x -> this.E()).a());
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
         ftb $$1 = new ftb(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(flk $$0, wp $$1) {
      $$0.d(new ftx($$1));
   }

   private void F() {
      fzv $$0 = this.C.k();
      edo.b $$1 = $$0.e().a($$0.d());
      jy<ale> $$2 = $$0.f().a(ale.c, $$1.b());
      Lifecycle $$3 = crw.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dgn $$7 = this.c($$1.d() == evk.a.c);
      evk $$8 = new evk($$7, this.C.k().c(), $$1.d(), $$5);
      fzy.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jy<ale> $$0, evk $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jy<ale> $$0, evm $$1) {
      String $$2 = this.C.c();
      fzv $$3 = this.C.k();
      a(this.m, y);
      Optional<evg.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         frd.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dgn c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dgf $$2 = new dgf(dhg.c.b());
         $$2.a(dgf.l).a(false, null);
         return new dgn($$1, dgg.d, false, bsi.a, true, $$2, dhg.c);
      } else {
         return new dgn($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gmj::H, fum.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fof $$0) {
      $$0.a(gmj::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            frd.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dhg $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fzp(this, (aua)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dhg $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fyc((aua)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wp.c("dataPack.title")));
      }
   }

   private void a(aua $$0, boolean $$1, Consumer<dhg> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dhg $$5 = new dhg(new dfw($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cru $$6 = $$0.f();
         if (crw.a($$6) && $$1) {
            this.m.a(new fzj($$0.g(), $$3x -> {
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

   private void a(aua $$0, dhg $$1, Consumer<dhg> $$2) {
      this.m.d(new ftx(wp.c("dataPack.validation.working")));
      alt.c $$3 = a($$0, $$1);
      alt.<fzm, fzv>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(mc.bb).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(mc.aI).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fzv $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = edp.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  edp $$5 = (edp)$$3x.flatMap($$1xx -> edp.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new alt.b<>(new fzm($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fzv($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new ftk($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dhg.c);
                  }
               }, wp.c("dataPack.validation.failed"), wo.a, wp.c("dataPack.validation.back"), wp.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static alt.c a(aua $$0, dhg $$1) {
      alt.d $$2 = new alt.d($$0, $$1, false, true);
      return new alt.c($$2, ey.a.c, 2);
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

   private static Optional<evg.c> a(flk $$0, String $$1, @Nullable Path $$2) {
      try {
         evg.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(eve.j);
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
   public static Path a(Path $$0, flk $$1) {
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
         frd.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aua> c(dhg $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = aud.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends fqw {
      private static final wp c = wp.c("createWorld.tab.game.title");
      private static final wp d = wp.c("selectWorld.allowCommands");
      private final fpd e;

      a() {
         super(c);
         fsh.b $$0 = this.a.b(8).d(1);
         fsl $$1 = $$0.b();
         this.e = new fpd(fzl.this.p, 208, 20, wp.c("selectWorld.enterName"));
         this.e.a(fzl.this.C.b());
         this.e.b(fzl.this.C::a);
         fzl.this.C.a($$0x -> this.e.a(fqf.a(wp.a("selectWorld.targetFolder", wp.b($$0x.c()).a(n.u)))));
         fzl.this.b(this.e);
         $$0.a(fse.a(fzl.this.p, this.e, fzl.v), $$0.b().b());
         fpb<fzx.a> $$2 = $$0.a(fpb.<fzx.a>a($$0x -> $$0x.f).a(fzx.a.a, fzx.a.b, fzx.a.c).a(0, 0, 210, 20, fzl.u, ($$0x, $$1x) -> fzl.this.C.a($$1x)), $$1);
         fzl.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fqf.a($$1x.d().a()));
         });
         fpb<bsi> $$3 = $$0.a(fpb.a(bsi::b).a(bsi.values()).a(0, 0, 210, 20, wp.c("options.difficulty"), ($$0x, $$1x) -> fzl.this.C.a($$1x)), $$1);
         fzl.this.C.a($$1x -> {
            $$3.a(fzl.this.C.e());
            $$3.j = !fzl.this.C.f();
            $$3.a(fqf.a(fzl.this.C.e().d()));
         });
         fpb<Boolean> $$4 = $$0.a(fpb.e().a($$0x -> fqf.a(fzl.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fzl.this.C.a($$1x)));
         fzl.this.C.a($$1x -> {
            $$4.a(fzl.this.C.g());
            $$4.j = !fzl.this.C.l() && !fzl.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fou.a(fzl.w, $$0x -> fzl.this.a(fzl.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fqw {
      private static final wp c = wp.c("createWorld.tab.more.title");
      private static final wp d = wp.c("selectWorld.gameRules");
      private static final wp e = wp.c("selectWorld.dataPacks");

      b() {
         super(c);
         fsh.b $$0 = this.a.b(8).d(1);
         $$0.a(fou.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fou.a(fzl.w, $$0x -> fzl.this.a(fzl.this.C.k().h())).a(210).a());
         $$0.a(fou.a(e, $$0x -> fzl.this.b(fzl.this.C.k().h())).a(210).a());
      }

      private void b() {
         fzl.this.m.a(new fzn(fzl.this.C.q().a(fzl.this.C.k().h().b()), $$0 -> {
            fzl.this.m.a(fzl.this);
            $$0.ifPresent(fzl.this.C::a);
         }));
      }
   }

   class c extends fqw {
      private static final wp c = wp.c("createWorld.tab.world.title");
      private static final wp d = wp.c("generator.minecraft.amplified.info");
      private static final wp e = wp.c("selectWorld.mapFeatures");
      private static final wp f = wp.c("selectWorld.mapFeatures.info");
      private static final wp g = wp.c("selectWorld.bonusItems");
      private static final wp h = wp.c("selectWorld.enterSeed");
      static final wp i = wp.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fpd k;
      private final fou l;

      c() {
         super(c);
         fsh.b $$0 = this.a.a(10).b(8).d(2);
         fpb<fzx.b> $$1 = $$0.a(
            fpb.<fzx.b>a(fzx.b::a).a(this.c()).a(fzl.c::a).a(0, 0, 150, 20, wp.c("selectWorld.mapType"), ($$0x, $$1x) -> fzl.this.C.a($$1x))
         );
         $$1.a(fzl.this.C.m());
         fzl.this.C.a($$1x -> {
            fzx.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fqf.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fzl.this.C.m().c() != null;
         });
         this.l = $$0.a(fou.a(wp.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fzl.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fpd(fzl.this.p, 308, 20, wp.c("selectWorld.enterSeed")) {
            @Override
            protected xd d() {
               return super.d().b(wo.t).b(fzl.c.i);
            }
         };
         this.k.c(i);
         this.k.a(fzl.this.C.h());
         this.k.b($$0x -> fzl.this.C.b(this.k.a()));
         $$0.a(fse.a(fzl.this.p, this.k, h), 2);
         fzu.a $$2 = fzu.a(310);
         $$2.a(e, fzl.this.C::i, fzl.this.C::b).a(() -> !fzl.this.C.l()).a(f);
         $$2.a(g, fzl.this.C::j, fzl.this.C::c).a(() -> !fzl.this.C.f() && !fzl.this.C.l());
         fzu $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         fzl.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         fzs $$0 = fzl.this.C.n();
         if ($$0 != null) {
            fzl.this.m.a($$0.createEditScreen(fzl.this, fzl.this.C.k()));
         }
      }

      private fpb.c<fzx.b> c() {
         return new fpb.c<fzx.b>() {
            @Override
            public List<fzx.b> a() {
               return fpb.a.getAsBoolean() ? fzl.this.C.p() : fzl.this.C.o();
            }

            @Override
            public List<fzx.b> b() {
               return fzl.this.C.o();
            }
         };
      }

      private static xd a(fpb<fzx.b> $$0) {
         return $$0.a().b() ? wo.a($$0.c(), d) : $$0.c();
      }
   }
}
