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
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fve extends fqh {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final xe u = xe.c("selectWorld.gameMode");
   static final xe v = xe.c("selectWorld.enterName");
   static final xe w = xe.c("selectWorld.experiments");
   static final xe x = xe.c("selectWorld.allowCommands.info");
   private static final xe y = xe.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final ale a = ale.b("textures/gui/tab_header_background.png");
   private final foc B = new foc(this);
   final fvn C;
   private final fms D = new fms(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final eym F;
   @Nullable
   private final fqh G;
   @Nullable
   private Path H;
   @Nullable
   private aug I;
   @Nullable
   private fmt J;

   public static void a(fip $$0, @Nullable fqh $$1) {
      a($$0, y);
      aug $$2 = new aug(new auj($$0.bf()));
      amc.c $$3 = a($$2, dff.c);
      CompletableFuture<fvm> $$4 = amc.a(
         $$3, $$0x -> new amc.b<>(new fve.a(new ebk(ebm.a(), ekw.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fvm($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ad.g(), $$0
      );
      $$0.b($$4::isDone);
      $$0.a(new fve($$0, $$1, $$4.join(), Optional.of(ekw.a), OptionalLong.empty()));
   }

   public static fve a(fip $$0, @Nullable fqh $$1, den $$2, fvm $$3, @Nullable Path $$4) {
      fve $$5 = new fve($$0, $$1, $$3, ekw.a($$3.e()), OptionalLong.of($$3.c().b()));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fvn.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fvn.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fvn.a.c);
      }

      $$5.H = $$4;
      return $$5;
   }

   private fve(fip $$0, @Nullable fqh $$1, fvm $$2, Optional<ald<ekv>> $$3, OptionalLong $$4) {
      super(xe.c("selectWorld.create"));
      this.G = $$1;
      this.F = $$0.bf();
      this.C = new fvn($$0.m().c(), $$2, $$3, $$4);
   }

   public fvn m() {
      return this.C;
   }

   @Override
   protected void aS_() {
      this.J = fmt.a(this.D, this.n).a(new fve.b(), new fve.d(), new fve.c()).a();
      this.c(this.J);
      fog $$0 = this.B.b(fog.e().a(8));
      $$0.a(fko.a(xe.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(fko.a(xd.e, $$0x -> this.D()).a());
      this.B.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.J.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aH_() {
   }

   @Override
   public void c() {
      if (this.J != null) {
         this.J.a(this.n);
         this.J.b();
         int $$0 = this.J.H().c();
         fow $$1 = new fow(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fip $$0, xe $$1) {
      $$0.d(new fps($$1));
   }

   private void E() {
      fvm $$0 = this.C.k();
      ebj.b $$1 = $$0.e().a($$0.d());
      jv<aln> $$2 = $$0.f().a(aln.c, $$1.b());
      Lifecycle $$3 = cqs.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().c();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      fvo.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(etd.a $$0, jv<aln> $$1, Lifecycle $$2) {
      a(this.m, y);
      Optional<esz.c> $$3 = this.J();
      if (!$$3.isEmpty()) {
         this.G();
         boolean $$4 = $$0 == etd.a.c;
         fvm $$5 = this.C.k();
         den $$6 = this.c($$4);
         etf $$7 = new etd($$6, $$5.c(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private den c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         def $$2 = new def(dff.c.b());
         $$2.a(def.l).a(false, null);
         return new den($$1, deg.d, false, brp.a, true, $$2, dff.c);
      } else {
         return new den($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.J.b($$0)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.E();
         return true;
      }
   }

   @Override
   public void d() {
      this.D();
   }

   public void D() {
      this.m.a(this.G);
      this.G();
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(ghv::B, fqh.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fkb $$0) {
      $$0.a(ghv::B, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Override
   protected <T extends fml & foj> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fml & flr & foj> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path F() {
      if (this.H == null) {
         try {
            this.H = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fmx.c(this.m, this.C.c());
            this.D();
         }
      }

      return this.H;
   }

   void a(dff $$0) {
      Pair<Path, aug> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fvh(this, (aug)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dff $$0) {
      Pair<Path, aug> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new ftw((aug)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xe.c("dataPack.title")));
      }
   }

   private void a(aug $$0, boolean $$1, Consumer<dff> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dff $$5 = new dff(new ddw($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cqq $$6 = $$0.e();
         if (cqs.a($$6) && $$1) {
            this.m.a(new fvd($$0.f(), $$3x -> {
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

   private void a(aug $$0, dff $$1, Consumer<dff> $$2) {
      this.m.d(new fps(xe.c("dataPack.validation.working")));
      amc.c $$3 = a($$0, $$1);
      amc.<fve.a, fvm>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lw.ba).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lw.aH).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fvm $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = ebk.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  ebk $$5 = (ebk)$$3x.flatMap($$1xx -> ebk.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amc.b<>(new fve.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fvm($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ad.g(),
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
               this.m.a(new fpf($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dff.c);
                  }
               }, xe.c("dataPack.validation.failed"), xd.a, xe.c("dataPack.validation.back"), xe.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amc.c a(aug $$0, dff $$1) {
      amc.d $$2 = new amc.d($$0, $$1, false, true);
      return new amc.c($$2, ev.a.c, 2);
   }

   private void G() {
      if (this.H != null) {
         try (Stream<Path> $$0 = Files.walk(this.H)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  d.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            d.warn("Failed to list temporary dir {}", this.H);
         }

         this.H = null;
      }
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ad.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<esz.c> J() {
      String $$0 = this.C.c();

      try {
         esz.c $$1 = this.m.m().e($$0);
         if (this.H == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.H)) {
               Path $$3 = $$1.a(esx.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.H)).forEach($$1x -> a(this.H, $$3, $$1x));
               var5 = Optional.of($$1);
            }

            return var5;
         } catch (UncheckedIOException | IOException var8) {
            d.warn("Failed to copy datapacks to world {}", $$0, var8);
            $$1.close();
         }
      } catch (UncheckedIOException | IOException var9) {
         d.warn("Failed to create access for {}", $$0, var9);
      }

      fmx.c(this.m, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fip $$1) {
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
         fmx.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aug> c(dff $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.I == null) {
            this.I = auj.a($$1, this.F);
            this.I.a();
         }

         this.I.b($$0.a().a());
         return Pair.of($$1, this.I);
      } else {
         return null;
      }
   }

   static record a(ebk a, dff b) {
   }

   class b extends fmq {
      private static final xe c = xe.c("createWorld.tab.game.title");
      private static final xe d = xe.c("selectWorld.allowCommands");
      private final fkx e;

      b() {
         super(c);
         fob.b $$0 = this.a.b(8).d(1);
         fof $$1 = $$0.b();
         this.e = new fkx(fve.this.p, 208, 20, xe.c("selectWorld.enterName"));
         this.e.a(fve.this.C.b());
         this.e.b(fve.this.C::a);
         fve.this.C.a($$0x -> this.e.a(flz.a(xe.a("selectWorld.targetFolder", xe.b($$0x.c()).a(n.u)))));
         fve.this.b(this.e);
         $$0.a(fny.a(fve.this.p, this.e, fve.v), $$0.b().b());
         fkv<fvn.a> $$2 = $$0.a(fkv.<fvn.a>a($$0x -> $$0x.f).a(fvn.a.a, fvn.a.b, fvn.a.c).a(0, 0, 210, 20, fve.u, ($$0x, $$1x) -> fve.this.C.a($$1x)), $$1);
         fve.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(flz.a($$1x.d().a()));
         });
         fkv<brp> $$3 = $$0.a(fkv.a(brp::b).a(brp.values()).a(0, 0, 210, 20, xe.c("options.difficulty"), ($$0x, $$1x) -> fve.this.C.a($$1x)), $$1);
         fve.this.C.a($$1x -> {
            $$3.a(fve.this.C.e());
            $$3.j = !fve.this.C.f();
            $$3.a(flz.a(fve.this.C.e().d()));
         });
         fkv<Boolean> $$4 = $$0.a(fkv.e().a($$0x -> flz.a(fve.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fve.this.C.a($$1x)));
         fve.this.C.a($$1x -> {
            $$4.a(fve.this.C.g());
            $$4.j = !fve.this.C.l() && !fve.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fko.a(fve.w, $$0x -> fve.this.a(fve.this.C.k().h())).a(210).a());
         }
      }
   }

   class c extends fmq {
      private static final xe c = xe.c("createWorld.tab.more.title");
      private static final xe d = xe.c("selectWorld.gameRules");
      private static final xe e = xe.c("selectWorld.dataPacks");

      c() {
         super(c);
         fob.b $$0 = this.a.b(8).d(1);
         $$0.a(fko.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fko.a(fve.w, $$0x -> fve.this.a(fve.this.C.k().h())).a(210).a());
         $$0.a(fko.a(e, $$0x -> fve.this.b(fve.this.C.k().h())).a(210).a());
      }

      private void b() {
         fve.this.m.a(new fvf(fve.this.C.q().a(fve.this.C.k().h().b()), $$0 -> {
            fve.this.m.a(fve.this);
            $$0.ifPresent(fve.this.C::a);
         }));
      }
   }

   class d extends fmq {
      private static final xe c = xe.c("createWorld.tab.world.title");
      private static final xe d = xe.c("generator.minecraft.amplified.info");
      private static final xe e = xe.c("selectWorld.mapFeatures");
      private static final xe f = xe.c("selectWorld.mapFeatures.info");
      private static final xe g = xe.c("selectWorld.bonusItems");
      private static final xe h = xe.c("selectWorld.enterSeed");
      static final xe i = xe.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fkx k;
      private final fko l;

      d() {
         super(c);
         fob.b $$0 = this.a.a(10).b(8).d(2);
         fkv<fvn.b> $$1 = $$0.a(
            fkv.<fvn.b>a(fvn.b::a).a(this.c()).a(fve.d::a).a(0, 0, 150, 20, xe.c("selectWorld.mapType"), ($$0x, $$1x) -> fve.this.C.a($$1x))
         );
         $$1.a(fve.this.C.m());
         fve.this.C.a($$1x -> {
            fvn.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(flz.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fve.this.C.m().c() != null;
         });
         this.l = $$0.a(fko.a(xe.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fve.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fkx(fve.this.p, 308, 20, xe.c("selectWorld.enterSeed")) {
            @Override
            protected xs aP_() {
               return super.aP_().b(xd.t).b(fve.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fve.this.C.h());
         this.k.b($$0x -> fve.this.C.b(this.k.a()));
         $$0.a(fny.a(fve.this.p, this.k, h), 2);
         fvl.a $$2 = fvl.a(310);
         $$2.a(e, fve.this.C::i, fve.this.C::b).a(() -> !fve.this.C.l()).a(f);
         $$2.a(g, fve.this.C::j, fve.this.C::c).a(() -> !fve.this.C.f() && !fve.this.C.l());
         fvl $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fve.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fvj $$0 = fve.this.C.n();
         if ($$0 != null) {
            fve.this.m.a($$0.createEditScreen(fve.this, fve.this.C.k()));
         }
      }

      private fkv.c<fvn.b> c() {
         return new fkv.c<fvn.b>() {
            @Override
            public List<fvn.b> a() {
               return fkv.a.getAsBoolean() ? fve.this.C.p() : fve.this.C.o();
            }

            @Override
            public List<fvn.b> b() {
               return fve.this.C.o();
            }
         };
      }

      private static xs a(fkv<fvn.b> $$0) {
         return $$0.a().b() ? xd.a($$0.c(), d) : $$0.c();
      }
   }
}
