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

public class gfe extends gad {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final xa u = xa.c("selectWorld.gameMode");
   static final xa v = xa.c("selectWorld.enterName");
   static final xa w = xa.c("selectWorld.experiments");
   static final xa x = xa.c("selectWorld.allowCommands.info");
   private static final xa y = xa.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final ali a = ali.b("textures/gui/tab_header_background.png");
   private final fxz B = new fxz(this);
   final gfq C;
   private final fwp D = new fwp($$1x -> {
      fuj var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final ffg F;
   private final gfd G;
   @Nullable
   private final gad H;
   @Nullable
   private Path I;
   @Nullable
   private aup J;
   @Nullable
   private fwq K;

   public static void a(frd $$0, @Nullable gad $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (fab)$$2));
   }

   public static void a(frd $$0, @Nullable gad $$1, gfd $$2) {
      gfp $$3 = ($$0x, $$1x, $$2x) -> new gfo($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<amg.a, ehz> $$4 = $$0x -> new ehz(eib.a(), err.a($$0x.c()));
      a($$0, $$1, $$4, $$3, err.a, $$2);
   }

   public static void b(frd $$0, @Nullable gad $$1) {
      gfp $$2 = ($$0x, $$1x, $$2x) -> new gfo($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gfj(gfq.a.c, Set.of(djt.m, djt.x, djt.f), eqd.h));
      Function<amg.a, ehz> $$3 = $$0x -> new ehz(eib.b(), err.c($$0x.c()));
      a($$0, $$1, $$3, $$2, err.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (fab)$$2x));
   }

   private static void a(frd $$0, @Nullable gad $$1, Function<amg.a, ehz> $$2, gfp $$3, alh<erq> $$4, gfd $$5) {
      a($$0, y);
      aup $$6 = new aup(new aus($$0.be()));
      dkv $$7 = ac.aU ? new dkv(new djk(List.of("vanilla", "tests"), List.of()), cvj.h) : dkv.d;
      amg.c $$8 = a($$6, $$7);
      CompletableFuture<gfo> $$9 = amg.a($$8, $$1x -> new amg.b<>(new gff($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ag.h(), $$0);
      $$0.b($$9::isDone);
      $$0.a(new gfe($$0, $$1, $$9.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static gfe a(frd $$0, @Nullable gad $$1, dkb $$2, gfo $$3, @Nullable Path $$4) {
      gfe $$5 = new gfe($$0, $$1, $$3, err.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (fab)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(gfq.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(gfq.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(gfq.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private gfe(frd $$0, @Nullable gad $$1, gfo $$2, Optional<alh<erq>> $$3, OptionalLong $$4, gfd $$5) {
      super(xa.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new gfq($$0.m().c(), $$2, $$3, $$4);
   }

   public gfq m() {
      return this.C;
   }

   @Override
   protected void aS_() {
      this.K = fwq.a(this.D, this.n).a(new gfe.a(), new gfe.c(), new gfe.b()).a();
      this.c(this.K);
      fyd $$0 = this.B.b(fyd.e().a(8));
      $$0.a(ful.a(xa.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(ful.a(wz.e, $$0x -> this.E()).a());
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
         fys $$1 = new fys(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(frd $$0, xa $$1) {
      $$0.d(new fzo($$1));
   }

   private void F() {
      gfo $$0 = this.C.k();
      ehy.b $$1 = $$0.e().a($$0.d());
      jm<alr> $$2 = $$0.f().a(alr.c, $$1.b());
      Lifecycle $$3 = cvj.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dkb $$7 = this.c($$1.d() == ezz.a.c);
      ezz $$8 = new ezz($$7, this.C.k().c(), $$1.d(), $$5);
      gfr.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jm<alr> $$0, ezz $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jm<alr> $$0, fab $$1) {
      String $$2 = this.C.c();
      gfo $$3 = this.C.k();
      a(this.m, y);
      Optional<ezv.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fwu.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dkb c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         djt $$2 = new djt(dkv.d.b());
         $$2.b(djt.m).a(false, null);
         return new dkb($$1, dju.d, false, buo.a, true, $$2, dkv.d);
      } else {
         return new dkb($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gsl::H, gad.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(ftx $$0) {
      $$0.a(gsl::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fwu.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dkv $$0) {
      Pair<Path, aup> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gfi(this, (aup)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dkv $$0) {
      Pair<Path, aup> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gdv((aup)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xa.c("dataPack.title")));
      }
   }

   private void a(aup $$0, boolean $$1, Consumer<dkv> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dkv $$5 = new dkv(new djk($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cvh $$6 = $$0.f();
         if (cvj.a($$6) && $$1) {
            this.m.a(new gfc($$0.g(), $$3x -> {
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

   private void a(aup $$0, dkv $$1, Consumer<dkv> $$2) {
      this.m.d(new fzo(xa.c("dataPack.validation.working")));
      amg.c $$3 = a($$0, $$1);
      amg.<gff, gfo>a(
            $$3,
            $$0x -> {
               if ($$0x.c().e(mh.bo).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().e(mh.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  gfo $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = ehz.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  ehz $$5 = (ehz)$$3x.flatMap($$1xx -> ehz.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amg.b<>(new gff($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new gfo($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fzb($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dkv.d);
                  }
               }, xa.c("dataPack.validation.failed"), wz.a, xa.c("dataPack.validation.back"), xa.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amg.c a(aup $$0, dkv $$1) {
      amg.d $$2 = new amg.d($$0, $$1, false, true);
      return new amg.c($$2, ek.a.c, 2);
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

   private static Optional<ezv.c> a(frd $$0, String $$1, @Nullable Path $$2) {
      try {
         ezv.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(ezt.j);
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
   public static Path a(Path $$0, frd $$1) {
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
         fwu.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aup> c(dkv $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = aus.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends fwn {
      private static final xa c = xa.c("createWorld.tab.game.title");
      private static final xa d = xa.c("selectWorld.allowCommands");
      private final fuu e;

      a() {
         super(c);
         fxy.b $$0 = this.a.b(8).d(1);
         fyc $$1 = $$0.b();
         this.e = new fuu(gfe.this.p, 208, 20, xa.c("selectWorld.enterName"));
         this.e.a(gfe.this.C.b());
         this.e.b(gfe.this.C::a);
         gfe.this.C.a($$0x -> this.e.a(fvw.a(xa.a("selectWorld.targetFolder", xa.b($$0x.c()).a(o.u)))));
         gfe.this.b(this.e);
         $$0.a(fxv.a(gfe.this.p, this.e, gfe.v), $$0.b().b());
         fus<gfq.a> $$2 = $$0.a(fus.<gfq.a>a($$0x -> $$0x.f).a(gfq.a.a, gfq.a.b, gfq.a.c).a(0, 0, 210, 20, gfe.u, ($$0x, $$1x) -> gfe.this.C.a($$1x)), $$1);
         gfe.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fvw.a($$1x.d().a()));
         });
         fus<buo> $$3 = $$0.a(fus.a(buo::b).a(buo.values()).a(0, 0, 210, 20, xa.c("options.difficulty"), ($$0x, $$1x) -> gfe.this.C.a($$1x)), $$1);
         gfe.this.C.a($$1x -> {
            $$3.a(gfe.this.C.e());
            $$3.j = !gfe.this.C.f();
            $$3.a(fvw.a(gfe.this.C.e().d()));
         });
         fus<Boolean> $$4 = $$0.a(fus.e().a($$0x -> fvw.a(gfe.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> gfe.this.C.a($$1x)));
         gfe.this.C.a($$1x -> {
            $$4.a(gfe.this.C.g());
            $$4.j = !gfe.this.C.l() && !gfe.this.C.f();
         });
         if (!ac.b().g()) {
            $$0.a(ful.a(gfe.w, $$0x -> gfe.this.a(gfe.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fwn {
      private static final xa c = xa.c("createWorld.tab.more.title");
      private static final xa d = xa.c("selectWorld.gameRules");
      private static final xa e = xa.c("selectWorld.dataPacks");

      b() {
         super(c);
         fxy.b $$0 = this.a.b(8).d(1);
         $$0.a(ful.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(ful.a(gfe.w, $$0x -> gfe.this.a(gfe.this.C.k().h())).a(210).a());
         $$0.a(ful.a(e, $$0x -> gfe.this.b(gfe.this.C.k().h())).a(210).a());
      }

      private void b() {
         gfe.this.m.a(new gfg(gfe.this.C.q().a(gfe.this.C.k().h().b()), $$0 -> {
            gfe.this.m.a(gfe.this);
            $$0.ifPresent(gfe.this.C::a);
         }));
      }
   }

   class c extends fwn {
      private static final xa c = xa.c("createWorld.tab.world.title");
      private static final xa d = xa.c("generator.minecraft.amplified.info");
      private static final xa e = xa.c("selectWorld.mapFeatures");
      private static final xa f = xa.c("selectWorld.mapFeatures.info");
      private static final xa g = xa.c("selectWorld.bonusItems");
      private static final xa h = xa.c("selectWorld.enterSeed");
      static final xa i = xa.c("selectWorld.seedInfo").a(o.i);
      private static final int j = 310;
      private final fuu k;
      private final ful l;

      c() {
         super(c);
         fxy.b $$0 = this.a.a(10).b(8).d(2);
         fus<gfq.b> $$1 = $$0.a(
            fus.<gfq.b>a(gfq.b::a).a(this.c()).a(gfe.c::a).a(0, 0, 150, 20, xa.c("selectWorld.mapType"), ($$0x, $$1x) -> gfe.this.C.a($$1x))
         );
         $$1.a(gfe.this.C.m());
         gfe.this.C.a($$1x -> {
            gfq.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fvw.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = gfe.this.C.m().c() != null;
         });
         this.l = $$0.a(ful.a(xa.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         gfe.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fuu(gfe.this.p, 308, 20, xa.c("selectWorld.enterSeed")) {
            @Override
            protected xo d() {
               return super.d().b(wz.t).b(gfe.c.i);
            }
         };
         this.k.c(i);
         this.k.a(gfe.this.C.h());
         this.k.b($$0x -> gfe.this.C.b(this.k.a()));
         $$0.a(fxv.a(gfe.this.p, this.k, h), 2);
         gfn.a $$2 = gfn.a(310);
         $$2.a(e, gfe.this.C::i, gfe.this.C::b).a(() -> !gfe.this.C.l()).a(f);
         $$2.a(g, gfe.this.C::j, gfe.this.C::c).a(() -> !gfe.this.C.f() && !gfe.this.C.l());
         gfn $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         gfe.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         gfl $$0 = gfe.this.C.n();
         if ($$0 != null) {
            gfe.this.m.a($$0.createEditScreen(gfe.this, gfe.this.C.k()));
         }
      }

      private fus.c<gfq.b> c() {
         return new fus.c<gfq.b>() {
            @Override
            public List<gfq.b> a() {
               return fus.a.getAsBoolean() ? gfe.this.C.p() : gfe.this.C.o();
            }

            @Override
            public List<gfq.b> b() {
               return gfe.this.C.o();
            }
         };
      }

      private static xo a(fus<gfq.b> $$0) {
         return $$0.a().b() ? wz.a($$0.c(), d) : $$0.c();
      }
   }
}
