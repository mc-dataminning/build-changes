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

public class gbg extends fwf {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final wv u = wv.c("selectWorld.gameMode");
   static final wv v = wv.c("selectWorld.enterName");
   static final wv w = wv.c("selectWorld.experiments");
   static final wv x = wv.c("selectWorld.allowCommands.info");
   private static final wv y = wv.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final ald a = ald.b("textures/gui/tab_header_background.png");
   private final fub B = new fub(this);
   final gbs C;
   private final fsr D = new fsr($$1x -> {
      fql var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final fck F;
   private final gbf G;
   @Nullable
   private final fwf H;
   @Nullable
   private Path I;
   @Nullable
   private auk J;
   @Nullable
   private fss K;

   public static void a(fnd $$0, @Nullable fwf $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (exf)$$2));
   }

   public static void a(fnd $$0, @Nullable fwf $$1, gbf $$2) {
      gbr $$3 = ($$0x, $$1x, $$2x) -> new gbq($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<amb.a, efh> $$4 = $$0x -> new efh(efj.a(), eow.a($$0x.c()));
      a($$0, $$1, $$4, $$3, eow.a, $$2);
   }

   public static void b(fnd $$0, @Nullable fwf $$1) {
      gbr $$2 = ($$0x, $$1x, $$2x) -> new gbq($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gbl(gbs.a.c, Set.of(dhl.l, dhl.w, dhl.e), eni.h));
      Function<amb.a, efh> $$3 = $$0x -> new efh(efj.b(), eow.c($$0x.c()));
      a($$0, $$1, $$3, $$2, eow.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (exf)$$2x));
   }

   private static void a(fnd $$0, @Nullable fwf $$1, Function<amb.a, efh> $$2, gbr $$3, alc<eov> $$4, gbf $$5) {
      a($$0, y);
      auk $$6 = new auk(new aun($$0.be()));
      din $$7 = ab.aU ? new din(new dhd(List.of("vanilla", "tests"), List.of()), ctg.h) : din.c;
      amb.c $$8 = a($$6, $$7);
      CompletableFuture<gbq> $$9 = amb.a($$8, $$1x -> new amb.b<>(new gbh($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, af.h(), $$0);
      $$0.b($$9::isDone);
      $$0.a(new gbg($$0, $$1, $$9.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static gbg a(fnd $$0, @Nullable fwf $$1, dht $$2, gbq $$3, @Nullable Path $$4) {
      gbg $$5 = new gbg($$0, $$1, $$3, eow.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (exf)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(gbs.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(gbs.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(gbs.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private gbg(fnd $$0, @Nullable fwf $$1, gbq $$2, Optional<alc<eov>> $$3, OptionalLong $$4, gbf $$5) {
      super(wv.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new gbs($$0.m().c(), $$2, $$3, $$4);
   }

   public gbs m() {
      return this.C;
   }

   @Override
   protected void aN_() {
      this.K = fss.a(this.D, this.n).a(new gbg.a(), new gbg.c(), new gbg.b()).a();
      this.c(this.K);
      fuf $$0 = this.B.b(fuf.e().a(8));
      $$0.a(fqn.a(wv.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fqn.a(wu.e, $$0x -> this.E()).a());
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
         fuu $$1 = new fuu(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fnd $$0, wv $$1) {
      $$0.d(new fvq($$1));
   }

   private void F() {
      gbq $$0 = this.C.k();
      efg.b $$1 = $$0.e().a($$0.d());
      jz<alm> $$2 = $$0.f().a(alm.c, $$1.b());
      Lifecycle $$3 = ctg.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dht $$7 = this.c($$1.d() == exd.a.c);
      exd $$8 = new exd($$7, this.C.k().c(), $$1.d(), $$5);
      gbt.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jz<alm> $$0, exd $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jz<alm> $$0, exf $$1) {
      String $$2 = this.C.c();
      gbq $$3 = this.C.k();
      a(this.m, y);
      Optional<ewz.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fsw.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dht c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dhl $$2 = new dhl(din.c.b());
         $$2.b(dhl.l).a(false, null);
         return new dht($$1, dhm.d, false, btn.a, true, $$2, din.c);
      } else {
         return new dht($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(goi::H, fwf.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fpz $$0) {
      $$0.a(goi::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fsw.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(din $$0) {
      Pair<Path, auk> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gbk(this, (auk)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(din $$0) {
      Pair<Path, auk> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fzx((auk)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wv.c("dataPack.title")));
      }
   }

   private void a(auk $$0, boolean $$1, Consumer<din> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      din $$5 = new din(new dhd($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cte $$6 = $$0.f();
         if (ctg.a($$6) && $$1) {
            this.m.a(new gbe($$0.g(), $$3x -> {
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

   private void a(auk $$0, din $$1, Consumer<din> $$2) {
      this.m.d(new fvq(wv.c("dataPack.validation.working")));
      amb.c $$3 = a($$0, $$1);
      amb.<gbh, gbq>a(
            $$3,
            $$0x -> {
               if ($$0x.c().e(me.bi).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().e(me.aM).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  gbq $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = efh.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  efh $$5 = (efh)$$3x.flatMap($$1xx -> efh.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amb.b<>(new gbh($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new gbq($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fvd($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(din.c);
                  }
               }, wv.c("dataPack.validation.failed"), wu.a, wv.c("dataPack.validation.back"), wv.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amb.c a(auk $$0, din $$1) {
      amb.d $$2 = new amb.d($$0, $$1, false, true);
      return new amb.c($$2, ey.a.c, 2);
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

   private static Optional<ewz.c> a(fnd $$0, String $$1, @Nullable Path $$2) {
      try {
         ewz.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(ewx.j);
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
   public static Path a(Path $$0, fnd $$1) {
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
         fsw.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, auk> c(din $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = aun.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends fsp {
      private static final wv c = wv.c("createWorld.tab.game.title");
      private static final wv d = wv.c("selectWorld.allowCommands");
      private final fqw e;

      a() {
         super(c);
         fua.b $$0 = this.a.b(8).d(1);
         fue $$1 = $$0.b();
         this.e = new fqw(gbg.this.p, 208, 20, wv.c("selectWorld.enterName"));
         this.e.a(gbg.this.C.b());
         this.e.b(gbg.this.C::a);
         gbg.this.C.a($$0x -> this.e.a(fry.a(wv.a("selectWorld.targetFolder", wv.b($$0x.c()).a(n.u)))));
         gbg.this.b(this.e);
         $$0.a(ftx.a(gbg.this.p, this.e, gbg.v), $$0.b().b());
         fqu<gbs.a> $$2 = $$0.a(fqu.<gbs.a>a($$0x -> $$0x.f).a(gbs.a.a, gbs.a.b, gbs.a.c).a(0, 0, 210, 20, gbg.u, ($$0x, $$1x) -> gbg.this.C.a($$1x)), $$1);
         gbg.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fry.a($$1x.d().a()));
         });
         fqu<btn> $$3 = $$0.a(fqu.a(btn::b).a(btn.values()).a(0, 0, 210, 20, wv.c("options.difficulty"), ($$0x, $$1x) -> gbg.this.C.a($$1x)), $$1);
         gbg.this.C.a($$1x -> {
            $$3.a(gbg.this.C.e());
            $$3.j = !gbg.this.C.f();
            $$3.a(fry.a(gbg.this.C.e().d()));
         });
         fqu<Boolean> $$4 = $$0.a(fqu.e().a($$0x -> fry.a(gbg.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> gbg.this.C.a($$1x)));
         gbg.this.C.a($$1x -> {
            $$4.a(gbg.this.C.g());
            $$4.j = !gbg.this.C.l() && !gbg.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fqn.a(gbg.w, $$0x -> gbg.this.a(gbg.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fsp {
      private static final wv c = wv.c("createWorld.tab.more.title");
      private static final wv d = wv.c("selectWorld.gameRules");
      private static final wv e = wv.c("selectWorld.dataPacks");

      b() {
         super(c);
         fua.b $$0 = this.a.b(8).d(1);
         $$0.a(fqn.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fqn.a(gbg.w, $$0x -> gbg.this.a(gbg.this.C.k().h())).a(210).a());
         $$0.a(fqn.a(e, $$0x -> gbg.this.b(gbg.this.C.k().h())).a(210).a());
      }

      private void b() {
         gbg.this.m.a(new gbi(gbg.this.C.q().a(gbg.this.C.k().h().b()), $$0 -> {
            gbg.this.m.a(gbg.this);
            $$0.ifPresent(gbg.this.C::a);
         }));
      }
   }

   class c extends fsp {
      private static final wv c = wv.c("createWorld.tab.world.title");
      private static final wv d = wv.c("generator.minecraft.amplified.info");
      private static final wv e = wv.c("selectWorld.mapFeatures");
      private static final wv f = wv.c("selectWorld.mapFeatures.info");
      private static final wv g = wv.c("selectWorld.bonusItems");
      private static final wv h = wv.c("selectWorld.enterSeed");
      static final wv i = wv.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fqw k;
      private final fqn l;

      c() {
         super(c);
         fua.b $$0 = this.a.a(10).b(8).d(2);
         fqu<gbs.b> $$1 = $$0.a(
            fqu.<gbs.b>a(gbs.b::a).a(this.c()).a(gbg.c::a).a(0, 0, 150, 20, wv.c("selectWorld.mapType"), ($$0x, $$1x) -> gbg.this.C.a($$1x))
         );
         $$1.a(gbg.this.C.m());
         gbg.this.C.a($$1x -> {
            gbs.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fry.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = gbg.this.C.m().c() != null;
         });
         this.l = $$0.a(fqn.a(wv.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         gbg.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fqw(gbg.this.p, 308, 20, wv.c("selectWorld.enterSeed")) {
            @Override
            protected xj d() {
               return super.d().b(wu.t).b(gbg.c.i);
            }
         };
         this.k.c(i);
         this.k.a(gbg.this.C.h());
         this.k.b($$0x -> gbg.this.C.b(this.k.a()));
         $$0.a(ftx.a(gbg.this.p, this.k, h), 2);
         gbp.a $$2 = gbp.a(310);
         $$2.a(e, gbg.this.C::i, gbg.this.C::b).a(() -> !gbg.this.C.l()).a(f);
         $$2.a(g, gbg.this.C::j, gbg.this.C::c).a(() -> !gbg.this.C.f() && !gbg.this.C.l());
         gbp $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         gbg.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         gbn $$0 = gbg.this.C.n();
         if ($$0 != null) {
            gbg.this.m.a($$0.createEditScreen(gbg.this, gbg.this.C.k()));
         }
      }

      private fqu.c<gbs.b> c() {
         return new fqu.c<gbs.b>() {
            @Override
            public List<gbs.b> a() {
               return fqu.a.getAsBoolean() ? gbg.this.C.p() : gbg.this.C.o();
            }

            @Override
            public List<gbs.b> b() {
               return gbg.this.C.o();
            }
         };
      }

      private static xj a(fqu<gbs.b> $$0) {
         return $$0.a().b() ? wu.a($$0.c(), d) : $$0.c();
      }
   }
}
