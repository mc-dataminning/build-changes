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

public class fzk extends ful {
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
   private final fsh B = new fsh(this);
   final fzw C;
   private final fqx D = new fqx($$1x -> {
      foq var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final faq F;
   private final fzj G;
   @Nullable
   private final ful H;
   @Nullable
   private Path I;
   @Nullable
   private aua J;
   @Nullable
   private fqy K;

   public static void a(flj $$0, @Nullable ful $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (evl)$$2));
   }

   public static void a(flj $$0, @Nullable ful $$1, fzj $$2) {
      fzv $$3 = ($$0x, $$1x, $$2x) -> new fzu($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<alt.a, edo> $$4 = $$0x -> new edo(edq.a(), enc.a($$0x.c()));
      a($$0, $$1, $$4, $$3, enc.a, $$2);
   }

   public static void b(flj $$0, @Nullable ful $$1) {
      fzv $$2 = ($$0x, $$1x, $$2x) -> new fzu($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new fzp(fzw.a.c, Set.of(dge.l, dge.w, dge.e), elo.h));
      Function<alt.a, edo> $$3 = $$0x -> new edo(edq.b(), enc.c($$0x.c()));
      a($$0, $$1, $$3, $$2, enc.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (evl)$$2x));
   }

   private static void a(flj $$0, @Nullable ful $$1, Function<alt.a, edo> $$2, fzv $$3, aku<enb> $$4, fzj $$5) {
      a($$0, y);
      aua $$6 = new aua(new aud($$0.be()));
      alt.c $$7 = a($$6, dhf.c);
      CompletableFuture<fzu> $$8 = alt.a($$7, $$1x -> new alt.b<>(new fzl($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, af.g(), $$0);
      $$0.b($$8::isDone);
      $$0.a(new fzk($$0, $$1, $$8.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static fzk a(flj $$0, @Nullable ful $$1, dgm $$2, fzu $$3, @Nullable Path $$4) {
      fzk $$5 = new fzk($$0, $$1, $$3, enc.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (evl)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fzw.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fzw.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fzw.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private fzk(flj $$0, @Nullable ful $$1, fzu $$2, Optional<aku<enb>> $$3, OptionalLong $$4, fzj $$5) {
      super(wp.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new fzw($$0.m().c(), $$2, $$3, $$4);
   }

   public fzw m() {
      return this.C;
   }

   @Override
   protected void aR_() {
      this.K = fqy.a(this.D, this.n).a(new fzk.a(), new fzk.c(), new fzk.b()).a();
      this.c(this.K);
      fsl $$0 = this.B.b(fsl.e().a(8));
      $$0.a(fot.a(wp.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fot.a(wo.e, $$0x -> this.E()).a());
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
         fta $$1 = new fta(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(flj $$0, wp $$1) {
      $$0.d(new ftw($$1));
   }

   private void F() {
      fzu $$0 = this.C.k();
      edn.b $$1 = $$0.e().a($$0.d());
      jy<ale> $$2 = $$0.f().a(ale.c, $$1.b());
      Lifecycle $$3 = crv.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dgm $$7 = this.c($$1.d() == evj.a.c);
      evj $$8 = new evj($$7, this.C.k().c(), $$1.d(), $$5);
      fzx.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jy<ale> $$0, evj $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jy<ale> $$0, evl $$1) {
      String $$2 = this.C.c();
      fzu $$3 = this.C.k();
      a(this.m, y);
      Optional<evf.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         frc.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dgm c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dge $$2 = new dge(dhf.c.b());
         $$2.a(dge.l).a(false, null);
         return new dgm($$1, dgf.d, false, bsh.a, true, $$2, dhf.c);
      } else {
         return new dgm($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gmi::H, ful.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(foe $$0) {
      $$0.a(gmi::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            frc.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dhf $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fzo(this, (aua)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dhf $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fyb((aua)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wp.c("dataPack.title")));
      }
   }

   private void a(aua $$0, boolean $$1, Consumer<dhf> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dhf $$5 = new dhf(new dfv($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         crt $$6 = $$0.f();
         if (crv.a($$6) && $$1) {
            this.m.a(new fzi($$0.g(), $$3x -> {
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

   private void a(aua $$0, dhf $$1, Consumer<dhf> $$2) {
      this.m.d(new ftw(wp.c("dataPack.validation.working")));
      alt.c $$3 = a($$0, $$1);
      alt.<fzl, fzu>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(mc.bb).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(mc.aI).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fzu $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = edo.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  edo $$5 = (edo)$$3x.flatMap($$1xx -> edo.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new alt.b<>(new fzl($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fzu($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new ftj($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dhf.c);
                  }
               }, wp.c("dataPack.validation.failed"), wo.a, wp.c("dataPack.validation.back"), wp.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static alt.c a(aua $$0, dhf $$1) {
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

   private static Optional<evf.c> a(flj $$0, String $$1, @Nullable Path $$2) {
      try {
         evf.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(evd.j);
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
   public static Path a(Path $$0, flj $$1) {
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
         frc.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aua> c(dhf $$0) {
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

   class a extends fqv {
      private static final wp c = wp.c("createWorld.tab.game.title");
      private static final wp d = wp.c("selectWorld.allowCommands");
      private final fpc e;

      a() {
         super(c);
         fsg.b $$0 = this.a.b(8).d(1);
         fsk $$1 = $$0.b();
         this.e = new fpc(fzk.this.p, 208, 20, wp.c("selectWorld.enterName"));
         this.e.a(fzk.this.C.b());
         this.e.b(fzk.this.C::a);
         fzk.this.C.a($$0x -> this.e.a(fqe.a(wp.a("selectWorld.targetFolder", wp.b($$0x.c()).a(n.u)))));
         fzk.this.b(this.e);
         $$0.a(fsd.a(fzk.this.p, this.e, fzk.v), $$0.b().b());
         fpa<fzw.a> $$2 = $$0.a(fpa.<fzw.a>a($$0x -> $$0x.f).a(fzw.a.a, fzw.a.b, fzw.a.c).a(0, 0, 210, 20, fzk.u, ($$0x, $$1x) -> fzk.this.C.a($$1x)), $$1);
         fzk.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fqe.a($$1x.d().a()));
         });
         fpa<bsh> $$3 = $$0.a(fpa.a(bsh::b).a(bsh.values()).a(0, 0, 210, 20, wp.c("options.difficulty"), ($$0x, $$1x) -> fzk.this.C.a($$1x)), $$1);
         fzk.this.C.a($$1x -> {
            $$3.a(fzk.this.C.e());
            $$3.j = !fzk.this.C.f();
            $$3.a(fqe.a(fzk.this.C.e().d()));
         });
         fpa<Boolean> $$4 = $$0.a(fpa.e().a($$0x -> fqe.a(fzk.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fzk.this.C.a($$1x)));
         fzk.this.C.a($$1x -> {
            $$4.a(fzk.this.C.g());
            $$4.j = !fzk.this.C.l() && !fzk.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fot.a(fzk.w, $$0x -> fzk.this.a(fzk.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fqv {
      private static final wp c = wp.c("createWorld.tab.more.title");
      private static final wp d = wp.c("selectWorld.gameRules");
      private static final wp e = wp.c("selectWorld.dataPacks");

      b() {
         super(c);
         fsg.b $$0 = this.a.b(8).d(1);
         $$0.a(fot.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fot.a(fzk.w, $$0x -> fzk.this.a(fzk.this.C.k().h())).a(210).a());
         $$0.a(fot.a(e, $$0x -> fzk.this.b(fzk.this.C.k().h())).a(210).a());
      }

      private void b() {
         fzk.this.m.a(new fzm(fzk.this.C.q().a(fzk.this.C.k().h().b()), $$0 -> {
            fzk.this.m.a(fzk.this);
            $$0.ifPresent(fzk.this.C::a);
         }));
      }
   }

   class c extends fqv {
      private static final wp c = wp.c("createWorld.tab.world.title");
      private static final wp d = wp.c("generator.minecraft.amplified.info");
      private static final wp e = wp.c("selectWorld.mapFeatures");
      private static final wp f = wp.c("selectWorld.mapFeatures.info");
      private static final wp g = wp.c("selectWorld.bonusItems");
      private static final wp h = wp.c("selectWorld.enterSeed");
      static final wp i = wp.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fpc k;
      private final fot l;

      c() {
         super(c);
         fsg.b $$0 = this.a.a(10).b(8).d(2);
         fpa<fzw.b> $$1 = $$0.a(
            fpa.<fzw.b>a(fzw.b::a).a(this.c()).a(fzk.c::a).a(0, 0, 150, 20, wp.c("selectWorld.mapType"), ($$0x, $$1x) -> fzk.this.C.a($$1x))
         );
         $$1.a(fzk.this.C.m());
         fzk.this.C.a($$1x -> {
            fzw.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fqe.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fzk.this.C.m().c() != null;
         });
         this.l = $$0.a(fot.a(wp.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fzk.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fpc(fzk.this.p, 308, 20, wp.c("selectWorld.enterSeed")) {
            @Override
            protected xd d() {
               return super.d().b(wo.t).b(fzk.c.i);
            }
         };
         this.k.c(i);
         this.k.a(fzk.this.C.h());
         this.k.b($$0x -> fzk.this.C.b(this.k.a()));
         $$0.a(fsd.a(fzk.this.p, this.k, h), 2);
         fzt.a $$2 = fzt.a(310);
         $$2.a(e, fzk.this.C::i, fzk.this.C::b).a(() -> !fzk.this.C.l()).a(f);
         $$2.a(g, fzk.this.C::j, fzk.this.C::c).a(() -> !fzk.this.C.f() && !fzk.this.C.l());
         fzt $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         fzk.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         fzr $$0 = fzk.this.C.n();
         if ($$0 != null) {
            fzk.this.m.a($$0.createEditScreen(fzk.this, fzk.this.C.k()));
         }
      }

      private fpa.c<fzw.b> c() {
         return new fpa.c<fzw.b>() {
            @Override
            public List<fzw.b> a() {
               return fpa.a.getAsBoolean() ? fzk.this.C.p() : fzk.this.C.o();
            }

            @Override
            public List<fzw.b> b() {
               return fzk.this.C.o();
            }
         };
      }

      private static xd a(fpa<fzw.b> $$0) {
         return $$0.a().b() ? wo.a($$0.c(), d) : $$0.c();
      }
   }
}
