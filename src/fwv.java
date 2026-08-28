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

public class fwv extends frw {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final xj u = xj.c("selectWorld.gameMode");
   static final xj v = xj.c("selectWorld.enterName");
   static final xj w = xj.c("selectWorld.experiments");
   static final xj x = xj.c("selectWorld.allowCommands.info");
   private static final xj y = xj.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final alj a = alj.b("textures/gui/tab_header_background.png");
   private final fps B = new fps(this);
   final fxh C;
   private final foh D = new foh(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final ezo F;
   private final fwu G;
   @Nullable
   private final frw H;
   @Nullable
   private Path I;
   @Nullable
   private aun J;
   @Nullable
   private foi K;

   public static void a(fke $$0, @Nullable frw $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (euh)$$2));
   }

   public static void a(fke $$0, @Nullable frw $$1, fwu $$2) {
      fxg $$3 = ($$0x, $$1x, $$2x) -> new fxf($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<amh.a, ecm> $$4 = $$0x -> new ecm(eco.a(), ely.a($$0x.c()));
      a($$0, $$1, $$4, $$3, ely.a, $$2);
   }

   public static void b(fke $$0, @Nullable frw $$1) {
      fxg $$2 = ($$0x, $$1x, $$2x) -> new fxf($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new fxa(fxh.a.c, Set.of(dfi.l, dfi.v, dfi.e), ekk.h));
      Function<amh.a, ecm> $$3 = $$0x -> new ecm(eco.b(), ely.c($$0x.c()));
      a($$0, $$1, $$3, $$2, ely.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (euh)$$2x));
   }

   private static void a(fke $$0, @Nullable frw $$1, Function<amh.a, ecm> $$2, fxg $$3, ali<elx> $$4, fwu $$5) {
      a($$0, y);
      aun $$6 = new aun(new auq($$0.bf()));
      amh.c $$7 = a($$6, dgj.c);
      CompletableFuture<fxf> $$8 = amh.a($$7, $$1x -> new amh.b<>(new fww($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ae.g(), $$0);
      $$0.b($$8::isDone);
      $$0.a(new fwv($$0, $$1, $$8.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static fwv a(fke $$0, @Nullable frw $$1, dfq $$2, fxf $$3, @Nullable Path $$4) {
      fwv $$5 = new fwv($$0, $$1, $$3, ely.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (euh)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fxh.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fxh.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fxh.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private fwv(fke $$0, @Nullable frw $$1, fxf $$2, Optional<ali<elx>> $$3, OptionalLong $$4, fwu $$5) {
      super(xj.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.bf();
      this.G = $$5;
      this.C = new fxh($$0.m().c(), $$2, $$3, $$4);
   }

   public fxh m() {
      return this.C;
   }

   @Override
   protected void aR_() {
      this.K = foi.a(this.D, this.n).a(new fwv.a(), new fwv.c(), new fwv.b()).a();
      this.c(this.K);
      fpw $$0 = this.B.b(fpw.e().a(8));
      $$0.a(fmd.a(xj.c("selectWorld.create"), $$0x -> this.G()).a());
      $$0.a(fmd.a(xi.e, $$0x -> this.F()).a());
      this.B.a($$0x -> {
         $$0x.o(1);
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
         int $$0 = this.K.H().c();
         fql $$1 = new fql(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fke $$0, xj $$1) {
      $$0.d(new frh($$1));
   }

   private void G() {
      fxf $$0 = this.C.k();
      ecl.b $$1 = $$0.e().a($$0.d());
      jx<als> $$2 = $$0.f().a(als.c, $$1.b());
      Lifecycle $$3 = crs.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dfq $$7 = this.c($$1.d() == euf.a.c);
      euf $$8 = new euf($$7, this.C.k().c(), $$1.d(), $$5);
      fxi.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jx<als> $$0, euf $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.K();
      if (!$$2) {
         this.F();
      }
   }

   private boolean a(jx<als> $$0, euh $$1) {
      String $$2 = this.C.c();
      fxf $$3 = this.C.k();
      a(this.m, y);
      Optional<eub.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fom.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dfq c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dfi $$2 = new dfi(dgj.c.b());
         $$2.a(dfi.l).a(false, null);
         return new dfq($$1, dfj.d, false, bsh.a, true, $$2, dgj.c);
      } else {
         return new dfq($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
         this.G();
         return true;
      }
   }

   @Override
   public void aO_() {
      this.F();
   }

   public void F() {
      this.m.a(this.H);
      this.K();
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gjq::B, frw.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(flq $$0) {
      $$0.a(gjq::B, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Override
   protected <T extends foa & fpz> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends foa & fng & fpz> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path J() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fom.c(this.m, this.C.c());
            this.F();
         }
      }

      return this.I;
   }

   void a(dgj $$0) {
      Pair<Path, aun> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fwz(this, (aun)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dgj $$0) {
      Pair<Path, aun> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fvm((aun)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xj.c("dataPack.title")));
      }
   }

   private void a(aun $$0, boolean $$1, Consumer<dgj> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dgj $$5 = new dgj(new dez($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         crq $$6 = $$0.f();
         if (crs.a($$6) && $$1) {
            this.m.a(new fwt($$0.g(), $$3x -> {
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

   private void a(aun $$0, dgj $$1, Consumer<dgj> $$2) {
      this.m.d(new frh(xj.c("dataPack.validation.working")));
      amh.c $$3 = a($$0, $$1);
      amh.<fww, fxf>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(ma.aZ).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(ma.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fxf $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = ecm.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  ecm $$5 = (ecm)$$3x.flatMap($$1xx -> ecm.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amh.b<>(new fww($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fxf($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fqu($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dgj.c);
                  }
               }, xj.c("dataPack.validation.failed"), xi.a, xj.c("dataPack.validation.back"), xj.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amh.c a(aun $$0, dgj $$1) {
      amh.d $$2 = new amh.d($$0, $$1, false, true);
      return new amh.c($$2, ex.a.c, 2);
   }

   private void K() {
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
         ae.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private static Optional<eub.c> a(fke $$0, String $$1, @Nullable Path $$2) {
      try {
         eub.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(etz.j);
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
   public static Path a(Path $$0, fke $$1) {
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
         fom.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aun> c(dgj $$0) {
      Path $$1 = this.J();
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

   class a extends fof {
      private static final xj c = xj.c("createWorld.tab.game.title");
      private static final xj d = xj.c("selectWorld.allowCommands");
      private final fmm e;

      a() {
         super(c);
         fpr.b $$0 = this.a.b(8).d(1);
         fpv $$1 = $$0.b();
         this.e = new fmm(fwv.this.p, 208, 20, xj.c("selectWorld.enterName"));
         this.e.a(fwv.this.C.b());
         this.e.b(fwv.this.C::a);
         fwv.this.C.a($$0x -> this.e.a(fno.a(xj.a("selectWorld.targetFolder", xj.b($$0x.c()).a(n.u)))));
         fwv.this.b(this.e);
         $$0.a(fpo.a(fwv.this.p, this.e, fwv.v), $$0.b().b());
         fmk<fxh.a> $$2 = $$0.a(fmk.<fxh.a>a($$0x -> $$0x.f).a(fxh.a.a, fxh.a.b, fxh.a.c).a(0, 0, 210, 20, fwv.u, ($$0x, $$1x) -> fwv.this.C.a($$1x)), $$1);
         fwv.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fno.a($$1x.d().a()));
         });
         fmk<bsh> $$3 = $$0.a(fmk.a(bsh::b).a(bsh.values()).a(0, 0, 210, 20, xj.c("options.difficulty"), ($$0x, $$1x) -> fwv.this.C.a($$1x)), $$1);
         fwv.this.C.a($$1x -> {
            $$3.a(fwv.this.C.e());
            $$3.j = !fwv.this.C.f();
            $$3.a(fno.a(fwv.this.C.e().d()));
         });
         fmk<Boolean> $$4 = $$0.a(fmk.e().a($$0x -> fno.a(fwv.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fwv.this.C.a($$1x)));
         fwv.this.C.a($$1x -> {
            $$4.a(fwv.this.C.g());
            $$4.j = !fwv.this.C.l() && !fwv.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fmd.a(fwv.w, $$0x -> fwv.this.a(fwv.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fof {
      private static final xj c = xj.c("createWorld.tab.more.title");
      private static final xj d = xj.c("selectWorld.gameRules");
      private static final xj e = xj.c("selectWorld.dataPacks");

      b() {
         super(c);
         fpr.b $$0 = this.a.b(8).d(1);
         $$0.a(fmd.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fmd.a(fwv.w, $$0x -> fwv.this.a(fwv.this.C.k().h())).a(210).a());
         $$0.a(fmd.a(e, $$0x -> fwv.this.b(fwv.this.C.k().h())).a(210).a());
      }

      private void b() {
         fwv.this.m.a(new fwx(fwv.this.C.q().a(fwv.this.C.k().h().b()), $$0 -> {
            fwv.this.m.a(fwv.this);
            $$0.ifPresent(fwv.this.C::a);
         }));
      }
   }

   class c extends fof {
      private static final xj c = xj.c("createWorld.tab.world.title");
      private static final xj d = xj.c("generator.minecraft.amplified.info");
      private static final xj e = xj.c("selectWorld.mapFeatures");
      private static final xj f = xj.c("selectWorld.mapFeatures.info");
      private static final xj g = xj.c("selectWorld.bonusItems");
      private static final xj h = xj.c("selectWorld.enterSeed");
      static final xj i = xj.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fmm k;
      private final fmd l;

      c() {
         super(c);
         fpr.b $$0 = this.a.a(10).b(8).d(2);
         fmk<fxh.b> $$1 = $$0.a(
            fmk.<fxh.b>a(fxh.b::a).a(this.c()).a(fwv.c::a).a(0, 0, 150, 20, xj.c("selectWorld.mapType"), ($$0x, $$1x) -> fwv.this.C.a($$1x))
         );
         $$1.a(fwv.this.C.m());
         fwv.this.C.a($$1x -> {
            fxh.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fno.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fwv.this.C.m().c() != null;
         });
         this.l = $$0.a(fmd.a(xj.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fwv.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fmm(fwv.this.p, 308, 20, xj.c("selectWorld.enterSeed")) {
            @Override
            protected xx aN_() {
               return super.aN_().b(xi.t).b(fwv.c.i);
            }
         };
         this.k.c(i);
         this.k.a(fwv.this.C.h());
         this.k.b($$0x -> fwv.this.C.b(this.k.a()));
         $$0.a(fpo.a(fwv.this.p, this.k, h), 2);
         fxe.a $$2 = fxe.a(310);
         $$2.a(e, fwv.this.C::i, fwv.this.C::b).a(() -> !fwv.this.C.l()).a(f);
         $$2.a(g, fwv.this.C::j, fwv.this.C::c).a(() -> !fwv.this.C.f() && !fwv.this.C.l());
         fxe $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fwv.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fxc $$0 = fwv.this.C.n();
         if ($$0 != null) {
            fwv.this.m.a($$0.createEditScreen(fwv.this, fwv.this.C.k()));
         }
      }

      private fmk.c<fxh.b> c() {
         return new fmk.c<fxh.b>() {
            @Override
            public List<fxh.b> a() {
               return fmk.a.getAsBoolean() ? fwv.this.C.p() : fwv.this.C.o();
            }

            @Override
            public List<fxh.b> b() {
               return fwv.this.C.o();
            }
         };
      }

      private static xx a(fmk<fxh.b> $$0) {
         return $$0.a().b() ? xi.a($$0.c(), d) : $$0.c();
      }
   }
}
