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

public class gah extends fvi {
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
   public static final aku a = aku.b("textures/gui/tab_header_background.png");
   private final fte B = new fte(this);
   final gat C;
   private final fru D = new fru($$1x -> {
      fpo var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final fbn F;
   private final gag G;
   @Nullable
   private final fvi H;
   @Nullable
   private Path I;
   @Nullable
   private aua J;
   @Nullable
   private frv K;

   public static void a(fmg $$0, @Nullable fvi $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (ewi)$$2));
   }

   public static void a(fmg $$0, @Nullable fvi $$1, gag $$2) {
      gas $$3 = ($$0x, $$1x, $$2x) -> new gar($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<als.a, eek> $$4 = $$0x -> new eek(eem.a(), enz.a($$0x.c()));
      a($$0, $$1, $$4, $$3, enz.a, $$2);
   }

   public static void b(fmg $$0, @Nullable fvi $$1) {
      gas $$2 = ($$0x, $$1x, $$2x) -> new gar($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gam(gat.a.c, Set.of(dgv.l, dgv.w, dgv.e), eml.h));
      Function<als.a, eek> $$3 = $$0x -> new eek(eem.b(), enz.c($$0x.c()));
      a($$0, $$1, $$3, $$2, enz.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ewi)$$2x));
   }

   private static void a(fmg $$0, @Nullable fvi $$1, Function<als.a, eek> $$2, gas $$3, akt<eny> $$4, gag $$5) {
      a($$0, y);
      aua $$6 = new aua(new aud($$0.be()));
      als.c $$7 = a($$6, dhx.c);
      CompletableFuture<gar> $$8 = als.a($$7, $$1x -> new als.b<>(new gai($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, af.h(), $$0);
      $$0.b($$8::isDone);
      $$0.a(new gah($$0, $$1, $$8.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static gah a(fmg $$0, @Nullable fvi $$1, dhd $$2, gar $$3, @Nullable Path $$4) {
      gah $$5 = new gah($$0, $$1, $$3, enz.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ewi)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(gat.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(gat.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(gat.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private gah(fmg $$0, @Nullable fvi $$1, gar $$2, Optional<akt<eny>> $$3, OptionalLong $$4, gag $$5) {
      super(wp.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new gat($$0.m().c(), $$2, $$3, $$4);
   }

   public gat m() {
      return this.C;
   }

   @Override
   protected void aR_() {
      this.K = frv.a(this.D, this.n).a(new gah.a(), new gah.c(), new gah.b()).a();
      this.c(this.K);
      fti $$0 = this.B.b(fti.e().a(8));
      $$0.a(fpq.a(wp.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fpq.a(wo.e, $$0x -> this.E()).a());
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
         ftx $$1 = new ftx(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fmg $$0, wp $$1) {
      $$0.d(new fut($$1));
   }

   private void F() {
      gar $$0 = this.C.k();
      eej.b $$1 = $$0.e().a($$0.d());
      jy<ald> $$2 = $$0.f().a(ald.c, $$1.b());
      Lifecycle $$3 = csp.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dhd $$7 = this.c($$1.d() == ewg.a.c);
      ewg $$8 = new ewg($$7, this.C.k().c(), $$1.d(), $$5);
      gau.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jy<ald> $$0, ewg $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jy<ald> $$0, ewi $$1) {
      String $$2 = this.C.c();
      gar $$3 = this.C.k();
      a(this.m, y);
      Optional<ewc.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         frz.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dhd c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dgv $$2 = new dgv(dhx.c.b());
         $$2.a(dgv.l).a(false, null);
         return new dhd($$1, dgw.d, false, bsv.a, true, $$2, dhx.c);
      } else {
         return new dhd($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gnh::H, fvi.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fpc $$0) {
      $$0.a(gnh::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            frz.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dhx $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gal(this, (aua)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dhx $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fyy((aua)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wp.c("dataPack.title")));
      }
   }

   private void a(aua $$0, boolean $$1, Consumer<dhx> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dhx $$5 = new dhx(new dgn($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         csn $$6 = $$0.f();
         if (csp.a($$6) && $$1) {
            this.m.a(new gaf($$0.g(), $$3x -> {
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

   private void a(aua $$0, dhx $$1, Consumer<dhx> $$2) {
      this.m.d(new fut(wp.c("dataPack.validation.working")));
      als.c $$3 = a($$0, $$1);
      als.<gai, gar>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(mc.bd).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(mc.aJ).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  gar $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = eek.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  eek $$5 = (eek)$$3x.flatMap($$1xx -> eek.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new als.b<>(new gai($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new gar($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fug($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dhx.c);
                  }
               }, wp.c("dataPack.validation.failed"), wo.a, wp.c("dataPack.validation.back"), wp.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static als.c a(aua $$0, dhx $$1) {
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

   private static Optional<ewc.c> a(fmg $$0, String $$1, @Nullable Path $$2) {
      try {
         ewc.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(ewa.j);
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
   public static Path a(Path $$0, fmg $$1) {
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
         frz.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aua> c(dhx $$0) {
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

   class a extends frs {
      private static final wp c = wp.c("createWorld.tab.game.title");
      private static final wp d = wp.c("selectWorld.allowCommands");
      private final fpz e;

      a() {
         super(c);
         ftd.b $$0 = this.a.b(8).d(1);
         fth $$1 = $$0.b();
         this.e = new fpz(gah.this.p, 208, 20, wp.c("selectWorld.enterName"));
         this.e.a(gah.this.C.b());
         this.e.b(gah.this.C::a);
         gah.this.C.a($$0x -> this.e.a(frb.a(wp.a("selectWorld.targetFolder", wp.b($$0x.c()).a(n.u)))));
         gah.this.b(this.e);
         $$0.a(fta.a(gah.this.p, this.e, gah.v), $$0.b().b());
         fpx<gat.a> $$2 = $$0.a(fpx.<gat.a>a($$0x -> $$0x.f).a(gat.a.a, gat.a.b, gat.a.c).a(0, 0, 210, 20, gah.u, ($$0x, $$1x) -> gah.this.C.a($$1x)), $$1);
         gah.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(frb.a($$1x.d().a()));
         });
         fpx<bsv> $$3 = $$0.a(fpx.a(bsv::b).a(bsv.values()).a(0, 0, 210, 20, wp.c("options.difficulty"), ($$0x, $$1x) -> gah.this.C.a($$1x)), $$1);
         gah.this.C.a($$1x -> {
            $$3.a(gah.this.C.e());
            $$3.j = !gah.this.C.f();
            $$3.a(frb.a(gah.this.C.e().d()));
         });
         fpx<Boolean> $$4 = $$0.a(fpx.e().a($$0x -> frb.a(gah.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> gah.this.C.a($$1x)));
         gah.this.C.a($$1x -> {
            $$4.a(gah.this.C.g());
            $$4.j = !gah.this.C.l() && !gah.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fpq.a(gah.w, $$0x -> gah.this.a(gah.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends frs {
      private static final wp c = wp.c("createWorld.tab.more.title");
      private static final wp d = wp.c("selectWorld.gameRules");
      private static final wp e = wp.c("selectWorld.dataPacks");

      b() {
         super(c);
         ftd.b $$0 = this.a.b(8).d(1);
         $$0.a(fpq.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fpq.a(gah.w, $$0x -> gah.this.a(gah.this.C.k().h())).a(210).a());
         $$0.a(fpq.a(e, $$0x -> gah.this.b(gah.this.C.k().h())).a(210).a());
      }

      private void b() {
         gah.this.m.a(new gaj(gah.this.C.q().a(gah.this.C.k().h().b()), $$0 -> {
            gah.this.m.a(gah.this);
            $$0.ifPresent(gah.this.C::a);
         }));
      }
   }

   class c extends frs {
      private static final wp c = wp.c("createWorld.tab.world.title");
      private static final wp d = wp.c("generator.minecraft.amplified.info");
      private static final wp e = wp.c("selectWorld.mapFeatures");
      private static final wp f = wp.c("selectWorld.mapFeatures.info");
      private static final wp g = wp.c("selectWorld.bonusItems");
      private static final wp h = wp.c("selectWorld.enterSeed");
      static final wp i = wp.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fpz k;
      private final fpq l;

      c() {
         super(c);
         ftd.b $$0 = this.a.a(10).b(8).d(2);
         fpx<gat.b> $$1 = $$0.a(
            fpx.<gat.b>a(gat.b::a).a(this.c()).a(gah.c::a).a(0, 0, 150, 20, wp.c("selectWorld.mapType"), ($$0x, $$1x) -> gah.this.C.a($$1x))
         );
         $$1.a(gah.this.C.m());
         gah.this.C.a($$1x -> {
            gat.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(frb.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = gah.this.C.m().c() != null;
         });
         this.l = $$0.a(fpq.a(wp.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         gah.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fpz(gah.this.p, 308, 20, wp.c("selectWorld.enterSeed")) {
            @Override
            protected xd d() {
               return super.d().b(wo.t).b(gah.c.i);
            }
         };
         this.k.c(i);
         this.k.a(gah.this.C.h());
         this.k.b($$0x -> gah.this.C.b(this.k.a()));
         $$0.a(fta.a(gah.this.p, this.k, h), 2);
         gaq.a $$2 = gaq.a(310);
         $$2.a(e, gah.this.C::i, gah.this.C::b).a(() -> !gah.this.C.l()).a(f);
         $$2.a(g, gah.this.C::j, gah.this.C::c).a(() -> !gah.this.C.f() && !gah.this.C.l());
         gaq $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         gah.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         gao $$0 = gah.this.C.n();
         if ($$0 != null) {
            gah.this.m.a($$0.createEditScreen(gah.this, gah.this.C.k()));
         }
      }

      private fpx.c<gat.b> c() {
         return new fpx.c<gat.b>() {
            @Override
            public List<gat.b> a() {
               return fpx.a.getAsBoolean() ? gah.this.C.p() : gah.this.C.o();
            }

            @Override
            public List<gat.b> b() {
               return gah.this.C.o();
            }
         };
      }

      private static xd a(fpx<gat.b> $$0) {
         return $$0.a().b() ? wo.a($$0.c(), d) : $$0.c();
      }
   }
}
