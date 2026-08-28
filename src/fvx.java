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

public class fvx extends fra {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final xi u = xi.c("selectWorld.gameMode");
   static final xi v = xi.c("selectWorld.enterName");
   static final xi w = xi.c("selectWorld.experiments");
   static final xi x = xi.c("selectWorld.allowCommands.info");
   private static final xi y = xi.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final ali a = ali.b("textures/gui/tab_header_background.png");
   private final fow B = new fow(this);
   final fwj C;
   private final fnl D = new fnl(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final ezd F;
   @Nullable
   private final fra G;
   @Nullable
   private Path H;
   @Nullable
   private aul I;
   @Nullable
   private fnm J;

   public static void a(fji $$0, @Nullable fra $$1) {
      fwi $$2 = ($$0x, $$1x, $$2x) -> new fwh($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<amg.a, ecb> $$3 = $$0x -> new ecb(ecd.a(), eln.a($$0x.c()));
      a($$0, $$1, $$3, $$2, eln.a);
   }

   public static void b(fji $$0, @Nullable fra $$1) {
      fwi $$2 = ($$0x, $$1x, $$2x) -> new fwh($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new fwc(fwj.a.c, Set.of(dex.l, dex.v, dex.e), ejz.h));
      Function<amg.a, ecb> $$3 = $$0x -> new ecb(ecd.b(), eln.c($$0x.c()));
      a($$0, $$1, $$3, $$2, eln.b);
   }

   private static void a(fji $$0, @Nullable fra $$1, Function<amg.a, ecb> $$2, fwi $$3, alh<elm> $$4) {
      a($$0, y);
      aul $$5 = new aul(new auo($$0.bf()));
      amg.c $$6 = a($$5, dfx.c);
      CompletableFuture<fwh> $$7 = amg.a($$6, $$1x -> new amg.b<>(new fvy($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ae.g(), $$0);
      $$0.b($$7::isDone);
      $$0.a(new fvx($$0, $$1, $$7.join(), Optional.of($$4), OptionalLong.empty()));
   }

   public static fvx a(fji $$0, @Nullable fra $$1, dff $$2, fwh $$3, @Nullable Path $$4) {
      fvx $$5 = new fvx($$0, $$1, $$3, eln.a($$3.e()), OptionalLong.of($$3.c().c()));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fwj.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fwj.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fwj.a.c);
      }

      $$5.H = $$4;
      return $$5;
   }

   private fvx(fji $$0, @Nullable fra $$1, fwh $$2, Optional<alh<elm>> $$3, OptionalLong $$4) {
      super(xi.c("selectWorld.create"));
      this.G = $$1;
      this.F = $$0.bf();
      this.C = new fwj($$0.m().c(), $$2, $$3, $$4);
   }

   public fwj m() {
      return this.C;
   }

   @Override
   protected void aR_() {
      this.J = fnm.a(this.D, this.n).a(new fvx.a(), new fvx.c(), new fvx.b()).a();
      this.c(this.J);
      fpa $$0 = this.B.b(fpa.e().a(8));
      $$0.a(flh.a(xi.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(flh.a(xh.e, $$0x -> this.D()).a());
      this.B.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.J.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aG_() {
   }

   @Override
   public void c() {
      if (this.J != null) {
         this.J.a(this.n);
         this.J.b();
         int $$0 = this.J.H().c();
         fpp $$1 = new fpp(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fji $$0, xi $$1) {
      $$0.d(new fql($$1));
   }

   private void E() {
      fwh $$0 = this.C.k();
      eca.b $$1 = $$0.e().a($$0.d());
      jx<alr> $$2 = $$0.f().a(alr.c, $$1.b());
      Lifecycle $$3 = crh.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      fwk.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(etu.a $$0, jx<alr> $$1, Lifecycle $$2) {
      a(this.m, y);
      Optional<etq.c> $$3 = this.J();
      if (!$$3.isEmpty()) {
         this.G();
         boolean $$4 = $$0 == etu.a.c;
         fwh $$5 = this.C.k();
         dff $$6 = this.c($$4);
         etw $$7 = new etu($$6, $$5.c(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private dff c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dex $$2 = new dex(dfx.c.b());
         $$2.a(dex.l).a(false, null);
         return new dff($$1, dey.d, false, bsa.a, true, $$2, dfx.c);
      } else {
         return new dff($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gir::B, fra.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fku $$0) {
      $$0.a(gir::B, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Override
   protected <T extends fne & fpd> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fne & fmk & fpd> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path F() {
      if (this.H == null) {
         try {
            this.H = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fnq.c(this.m, this.C.c());
            this.D();
         }
      }

      return this.H;
   }

   void a(dfx $$0) {
      Pair<Path, aul> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fwb(this, (aul)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dfx $$0) {
      Pair<Path, aul> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fup((aul)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xi.c("dataPack.title")));
      }
   }

   private void a(aul $$0, boolean $$1, Consumer<dfx> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dfx $$5 = new dfx(new deo($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         crf $$6 = $$0.f();
         if (crh.a($$6) && $$1) {
            this.m.a(new fvw($$0.g(), $$3x -> {
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

   private void a(aul $$0, dfx $$1, Consumer<dfx> $$2) {
      this.m.d(new fql(xi.c("dataPack.validation.working")));
      amg.c $$3 = a($$0, $$1);
      amg.<fvy, fwh>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lz.aZ).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lz.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fwh $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = ecb.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  ecb $$5 = (ecb)$$3x.flatMap($$1xx -> ecb.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amg.b<>(new fvy($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fwh($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ae.g(),
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
               this.m.a(new fpy($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dfx.c);
                  }
               }, xi.c("dataPack.validation.failed"), xh.a, xi.c("dataPack.validation.back"), xi.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amg.c a(aul $$0, dfx $$1) {
      amg.d $$2 = new amg.d($$0, $$1, false, true);
      return new amg.c($$2, ex.a.c, 2);
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
         ae.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<etq.c> J() {
      String $$0 = this.C.c();

      try {
         etq.c $$1 = this.m.m().e($$0);
         if (this.H == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.H)) {
               Path $$3 = $$1.a(eto.j);
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

      fnq.c(this.m, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fji $$1) {
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
         fnq.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aul> c(dfx $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.I == null) {
            this.I = auo.a($$1, this.F);
            this.I.a();
         }

         this.I.b($$0.a().a());
         return Pair.of($$1, this.I);
      } else {
         return null;
      }
   }

   class a extends fnj {
      private static final xi c = xi.c("createWorld.tab.game.title");
      private static final xi d = xi.c("selectWorld.allowCommands");
      private final flq e;

      a() {
         super(c);
         fov.b $$0 = this.a.b(8).d(1);
         foz $$1 = $$0.b();
         this.e = new flq(fvx.this.p, 208, 20, xi.c("selectWorld.enterName"));
         this.e.a(fvx.this.C.b());
         this.e.b(fvx.this.C::a);
         fvx.this.C.a($$0x -> this.e.a(fms.a(xi.a("selectWorld.targetFolder", xi.b($$0x.c()).a(n.u)))));
         fvx.this.b(this.e);
         $$0.a(fos.a(fvx.this.p, this.e, fvx.v), $$0.b().b());
         flo<fwj.a> $$2 = $$0.a(flo.<fwj.a>a($$0x -> $$0x.f).a(fwj.a.a, fwj.a.b, fwj.a.c).a(0, 0, 210, 20, fvx.u, ($$0x, $$1x) -> fvx.this.C.a($$1x)), $$1);
         fvx.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fms.a($$1x.d().a()));
         });
         flo<bsa> $$3 = $$0.a(flo.a(bsa::b).a(bsa.values()).a(0, 0, 210, 20, xi.c("options.difficulty"), ($$0x, $$1x) -> fvx.this.C.a($$1x)), $$1);
         fvx.this.C.a($$1x -> {
            $$3.a(fvx.this.C.e());
            $$3.j = !fvx.this.C.f();
            $$3.a(fms.a(fvx.this.C.e().d()));
         });
         flo<Boolean> $$4 = $$0.a(flo.e().a($$0x -> fms.a(fvx.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fvx.this.C.a($$1x)));
         fvx.this.C.a($$1x -> {
            $$4.a(fvx.this.C.g());
            $$4.j = !fvx.this.C.l() && !fvx.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(flh.a(fvx.w, $$0x -> fvx.this.a(fvx.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fnj {
      private static final xi c = xi.c("createWorld.tab.more.title");
      private static final xi d = xi.c("selectWorld.gameRules");
      private static final xi e = xi.c("selectWorld.dataPacks");

      b() {
         super(c);
         fov.b $$0 = this.a.b(8).d(1);
         $$0.a(flh.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(flh.a(fvx.w, $$0x -> fvx.this.a(fvx.this.C.k().h())).a(210).a());
         $$0.a(flh.a(e, $$0x -> fvx.this.b(fvx.this.C.k().h())).a(210).a());
      }

      private void b() {
         fvx.this.m.a(new fvz(fvx.this.C.q().a(fvx.this.C.k().h().b()), $$0 -> {
            fvx.this.m.a(fvx.this);
            $$0.ifPresent(fvx.this.C::a);
         }));
      }
   }

   class c extends fnj {
      private static final xi c = xi.c("createWorld.tab.world.title");
      private static final xi d = xi.c("generator.minecraft.amplified.info");
      private static final xi e = xi.c("selectWorld.mapFeatures");
      private static final xi f = xi.c("selectWorld.mapFeatures.info");
      private static final xi g = xi.c("selectWorld.bonusItems");
      private static final xi h = xi.c("selectWorld.enterSeed");
      static final xi i = xi.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final flq k;
      private final flh l;

      c() {
         super(c);
         fov.b $$0 = this.a.a(10).b(8).d(2);
         flo<fwj.b> $$1 = $$0.a(
            flo.<fwj.b>a(fwj.b::a).a(this.c()).a(fvx.c::a).a(0, 0, 150, 20, xi.c("selectWorld.mapType"), ($$0x, $$1x) -> fvx.this.C.a($$1x))
         );
         $$1.a(fvx.this.C.m());
         fvx.this.C.a($$1x -> {
            fwj.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fms.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fvx.this.C.m().c() != null;
         });
         this.l = $$0.a(flh.a(xi.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fvx.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new flq(fvx.this.p, 308, 20, xi.c("selectWorld.enterSeed")) {
            @Override
            protected xw aO_() {
               return super.aO_().b(xh.t).b(fvx.c.i);
            }
         };
         this.k.c(i);
         this.k.a(fvx.this.C.h());
         this.k.b($$0x -> fvx.this.C.b(this.k.a()));
         $$0.a(fos.a(fvx.this.p, this.k, h), 2);
         fwg.a $$2 = fwg.a(310);
         $$2.a(e, fvx.this.C::i, fvx.this.C::b).a(() -> !fvx.this.C.l()).a(f);
         $$2.a(g, fvx.this.C::j, fvx.this.C::c).a(() -> !fvx.this.C.f() && !fvx.this.C.l());
         fwg $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fvx.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fwe $$0 = fvx.this.C.n();
         if ($$0 != null) {
            fvx.this.m.a($$0.createEditScreen(fvx.this, fvx.this.C.k()));
         }
      }

      private flo.c<fwj.b> c() {
         return new flo.c<fwj.b>() {
            @Override
            public List<fwj.b> a() {
               return flo.a.getAsBoolean() ? fvx.this.C.p() : fvx.this.C.o();
            }

            @Override
            public List<fwj.b> b() {
               return fvx.this.C.o();
            }
         };
      }

      private static xw a(flo<fwj.b> $$0) {
         return $$0.a().b() ? xh.a($$0.c(), d) : $$0.c();
      }
   }
}
