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

public class gfg extends gaf {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final xc u = xc.c("selectWorld.gameMode");
   static final xc v = xc.c("selectWorld.enterName");
   static final xc w = xc.c("selectWorld.experiments");
   static final xc x = xc.c("selectWorld.allowCommands.info");
   private static final xc y = xc.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final alk a = alk.b("textures/gui/tab_header_background.png");
   private final fyb B = new fyb(this);
   final gfs C;
   private final fwr D = new fwr($$1x -> {
      ful var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final ffi F;
   private final gff G;
   @Nullable
   private final gaf H;
   @Nullable
   private Path I;
   @Nullable
   private aur J;
   @Nullable
   private fws K;

   public static void a(frf $$0, @Nullable gaf $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (fad)$$2));
   }

   public static void a(frf $$0, @Nullable gaf $$1, gff $$2) {
      gfr $$3 = ($$0x, $$1x, $$2x) -> new gfq($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<ami.a, eib> $$4 = $$0x -> new eib(eid.a(), ert.a($$0x.c()));
      a($$0, $$1, $$4, $$3, ert.a, $$2);
   }

   public static void b(frf $$0, @Nullable gaf $$1) {
      gfr $$2 = ($$0x, $$1x, $$2x) -> new gfq($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gfl(gfs.a.c, Set.of(djv.m, djv.x, djv.f), eqf.h));
      Function<ami.a, eib> $$3 = $$0x -> new eib(eid.b(), ert.c($$0x.c()));
      a($$0, $$1, $$3, $$2, ert.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (fad)$$2x));
   }

   private static void a(frf $$0, @Nullable gaf $$1, Function<ami.a, eib> $$2, gfr $$3, alj<ers> $$4, gff $$5) {
      a($$0, y);
      aur $$6 = new aur(new auu($$0.be()));
      dkx $$7 = ac.aU ? new dkx(new djm(List.of("vanilla", "tests"), List.of()), cvl.h) : dkx.d;
      ami.c $$8 = a($$6, $$7);
      CompletableFuture<gfq> $$9 = ami.a($$8, $$1x -> new ami.b<>(new gfh($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ag.h(), $$0);
      $$0.b($$9::isDone);
      $$0.a(new gfg($$0, $$1, $$9.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static gfg a(frf $$0, @Nullable gaf $$1, dkd $$2, gfq $$3, @Nullable Path $$4) {
      gfg $$5 = new gfg($$0, $$1, $$3, ert.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (fad)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(gfs.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(gfs.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(gfs.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private gfg(frf $$0, @Nullable gaf $$1, gfq $$2, Optional<alj<ers>> $$3, OptionalLong $$4, gff $$5) {
      super(xc.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new gfs($$0.m().c(), $$2, $$3, $$4);
   }

   public gfs m() {
      return this.C;
   }

   @Override
   protected void aS_() {
      this.K = fws.a(this.D, this.n).a(new gfg.a(), new gfg.c(), new gfg.b()).a();
      this.c(this.K);
      fyf $$0 = this.B.b(fyf.e().a(8));
      $$0.a(fun.a(xc.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fun.a(xb.e, $$0x -> this.E()).a());
      this.B.a($$0x -> {
         $$0x.l(1);
         this.c($$0x);
      });
      this.K.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aG_() {
   }

   @Override
   public void c() {
      if (this.K != null) {
         this.K.a(this.n);
         this.K.b();
         int $$0 = this.K.J().c();
         fyu $$1 = new fyu(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(frf $$0, xc $$1) {
      $$0.d(new fzq($$1));
   }

   private void F() {
      gfq $$0 = this.C.k();
      eia.b $$1 = $$0.e().a($$0.d());
      jn<alt> $$2 = $$0.f().a(alt.c, $$1.b());
      Lifecycle $$3 = cvl.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dkd $$7 = this.c($$1.d() == fab.a.c);
      fab $$8 = new fab($$7, this.C.k().c(), $$1.d(), $$5);
      gft.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jn<alt> $$0, fab $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jn<alt> $$0, fad $$1) {
      String $$2 = this.C.c();
      gfq $$3 = this.C.k();
      a(this.m, y);
      Optional<ezx.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fww.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dkd c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         djv $$2 = new djv(dkx.d.b());
         $$2.b(djv.m).a(false, null);
         return new dkd($$1, djw.d, false, buq.a, true, $$2, dkx.d);
      } else {
         return new dkd($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void aP_() {
      this.E();
   }

   public void E() {
      this.m.a(this.H);
      this.H();
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gsn::H, gaf.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(ftz $$0) {
      $$0.a(gsn::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fww.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dkx $$0) {
      Pair<Path, aur> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gfk(this, (aur)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dkx $$0) {
      Pair<Path, aur> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gdx((aur)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xc.c("dataPack.title")));
      }
   }

   private void a(aur $$0, boolean $$1, Consumer<dkx> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dkx $$5 = new dkx(new djm($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cvj $$6 = $$0.f();
         if (cvl.a($$6) && $$1) {
            this.m.a(new gfe($$0.g(), $$3x -> {
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

   private void a(aur $$0, dkx $$1, Consumer<dkx> $$2) {
      this.m.d(new fzq(xc.c("dataPack.validation.working")));
      ami.c $$3 = a($$0, $$1);
      ami.<gfh, gfq>a(
            $$3,
            $$0x -> {
               if ($$0x.c().e(mi.bo).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().e(mi.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  gfq $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = eib.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  eib $$5 = (eib)$$3x.flatMap($$1xx -> eib.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new ami.b<>(new gfh($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new gfq($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fzd($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dkx.d);
                  }
               }, xc.c("dataPack.validation.failed"), xb.a, xc.c("dataPack.validation.back"), xc.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static ami.c a(aur $$0, dkx $$1) {
      ami.d $$2 = new ami.d($$0, $$1, false, true);
      return new ami.c($$2, el.a.c, 2);
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

   private static Optional<ezx.c> a(frf $$0, String $$1, @Nullable Path $$2) {
      try {
         ezx.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(ezv.j);
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
   public static Path a(Path $$0, frf $$1) {
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
         fww.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aur> c(dkx $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = auu.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends fwp {
      private static final xc c = xc.c("createWorld.tab.game.title");
      private static final xc d = xc.c("selectWorld.allowCommands");
      private final fuw e;

      a() {
         super(c);
         fya.b $$0 = this.a.b(8).d(1);
         fye $$1 = $$0.b();
         this.e = new fuw(gfg.this.p, 208, 20, xc.c("selectWorld.enterName"));
         this.e.a(gfg.this.C.b());
         this.e.b(gfg.this.C::a);
         gfg.this.C.a($$0x -> this.e.a(fvy.a(xc.a("selectWorld.targetFolder", xc.b($$0x.c()).a(o.u)))));
         gfg.this.b(this.e);
         $$0.a(fxx.a(gfg.this.p, this.e, gfg.v), $$0.b().b());
         fuu<gfs.a> $$2 = $$0.a(fuu.<gfs.a>a($$0x -> $$0x.f).a(gfs.a.a, gfs.a.b, gfs.a.c).a(0, 0, 210, 20, gfg.u, ($$0x, $$1x) -> gfg.this.C.a($$1x)), $$1);
         gfg.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fvy.a($$1x.d().a()));
         });
         fuu<buq> $$3 = $$0.a(fuu.a(buq::b).a(buq.values()).a(0, 0, 210, 20, xc.c("options.difficulty"), ($$0x, $$1x) -> gfg.this.C.a($$1x)), $$1);
         gfg.this.C.a($$1x -> {
            $$3.a(gfg.this.C.e());
            $$3.j = !gfg.this.C.f();
            $$3.a(fvy.a(gfg.this.C.e().d()));
         });
         fuu<Boolean> $$4 = $$0.a(fuu.e().a($$0x -> fvy.a(gfg.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> gfg.this.C.a($$1x)));
         gfg.this.C.a($$1x -> {
            $$4.a(gfg.this.C.g());
            $$4.j = !gfg.this.C.l() && !gfg.this.C.f();
         });
         if (!ac.b().g()) {
            $$0.a(fun.a(gfg.w, $$0x -> gfg.this.a(gfg.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fwp {
      private static final xc c = xc.c("createWorld.tab.more.title");
      private static final xc d = xc.c("selectWorld.gameRules");
      private static final xc e = xc.c("selectWorld.dataPacks");

      b() {
         super(c);
         fya.b $$0 = this.a.b(8).d(1);
         $$0.a(fun.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fun.a(gfg.w, $$0x -> gfg.this.a(gfg.this.C.k().h())).a(210).a());
         $$0.a(fun.a(e, $$0x -> gfg.this.b(gfg.this.C.k().h())).a(210).a());
      }

      private void b() {
         gfg.this.m.a(new gfi(gfg.this.C.q().a(gfg.this.C.k().h().b()), $$0 -> {
            gfg.this.m.a(gfg.this);
            $$0.ifPresent(gfg.this.C::a);
         }));
      }
   }

   class c extends fwp {
      private static final xc c = xc.c("createWorld.tab.world.title");
      private static final xc d = xc.c("generator.minecraft.amplified.info");
      private static final xc e = xc.c("selectWorld.mapFeatures");
      private static final xc f = xc.c("selectWorld.mapFeatures.info");
      private static final xc g = xc.c("selectWorld.bonusItems");
      private static final xc h = xc.c("selectWorld.enterSeed");
      static final xc i = xc.c("selectWorld.seedInfo").a(o.i);
      private static final int j = 310;
      private final fuw k;
      private final fun l;

      c() {
         super(c);
         fya.b $$0 = this.a.a(10).b(8).d(2);
         fuu<gfs.b> $$1 = $$0.a(
            fuu.<gfs.b>a(gfs.b::a).a(this.c()).a(gfg.c::a).a(0, 0, 150, 20, xc.c("selectWorld.mapType"), ($$0x, $$1x) -> gfg.this.C.a($$1x))
         );
         $$1.a(gfg.this.C.m());
         gfg.this.C.a($$1x -> {
            gfs.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fvy.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = gfg.this.C.m().c() != null;
         });
         this.l = $$0.a(fun.a(xc.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         gfg.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fuw(gfg.this.p, 308, 20, xc.c("selectWorld.enterSeed")) {
            @Override
            protected xq d() {
               return super.d().b(xb.t).b(gfg.c.i);
            }
         };
         this.k.c(i);
         this.k.a(gfg.this.C.h());
         this.k.b($$0x -> gfg.this.C.b(this.k.a()));
         $$0.a(fxx.a(gfg.this.p, this.k, h), 2);
         gfp.a $$2 = gfp.a(310);
         $$2.a(e, gfg.this.C::i, gfg.this.C::b).a(() -> !gfg.this.C.l()).a(f);
         $$2.a(g, gfg.this.C::j, gfg.this.C::c).a(() -> !gfg.this.C.f() && !gfg.this.C.l());
         gfp $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         gfg.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         gfn $$0 = gfg.this.C.n();
         if ($$0 != null) {
            gfg.this.m.a($$0.createEditScreen(gfg.this, gfg.this.C.k()));
         }
      }

      private fuu.c<gfs.b> c() {
         return new fuu.c<gfs.b>() {
            @Override
            public List<gfs.b> a() {
               return fuu.a.getAsBoolean() ? gfg.this.C.p() : gfg.this.C.o();
            }

            @Override
            public List<gfs.b> b() {
               return gfg.this.C.o();
            }
         };
      }

      private static xq a(fuu<gfs.b> $$0) {
         return $$0.a().b() ? xb.a($$0.c(), d) : $$0.c();
      }
   }
}
