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

public class fyw extends ftx {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final xv u = xv.c("selectWorld.gameMode");
   static final xv v = xv.c("selectWorld.enterName");
   static final xv w = xv.c("selectWorld.experiments");
   static final xv x = xv.c("selectWorld.allowCommands.info");
   private static final xv y = xv.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final alz a = alz.b("textures/gui/tab_header_background.png");
   private final frt B = new frt(this);
   final fzi C;
   private final fqj D = new fqj(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final fbn F;
   private final fyv G;
   @Nullable
   private final ftx H;
   @Nullable
   private Path I;
   @Nullable
   private avg J;
   @Nullable
   private fqk K;

   public static void a(fmf $$0, @Nullable ftx $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (ewi)$$2));
   }

   public static void a(fmf $$0, @Nullable ftx $$1, fyv $$2) {
      fzh $$3 = ($$0x, $$1x, $$2x) -> new fzg($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<amx.a, eel> $$4 = $$0x -> new eel(een.a(), enz.a($$0x.c()));
      a($$0, $$1, $$4, $$3, enz.a, $$2);
   }

   public static void b(fmf $$0, @Nullable ftx $$1) {
      fzh $$2 = ($$0x, $$1x, $$2x) -> new fzg($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new fzb(fzi.a.c, Set.of(dhd.l, dhd.w, dhd.e), eml.h));
      Function<amx.a, eel> $$3 = $$0x -> new eel(een.b(), enz.c($$0x.c()));
      a($$0, $$1, $$3, $$2, enz.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ewi)$$2x));
   }

   private static void a(fmf $$0, @Nullable ftx $$1, Function<amx.a, eel> $$2, fzh $$3, aly<eny> $$4, fyv $$5) {
      a($$0, y);
      avg $$6 = new avg(new avj($$0.bf()));
      amx.c $$7 = a($$6, die.c);
      CompletableFuture<fzg> $$8 = amx.a($$7, $$1x -> new amx.b<>(new fyx($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ae.g(), $$0);
      $$0.b($$8::isDone);
      $$0.a(new fyw($$0, $$1, $$8.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static fyw a(fmf $$0, @Nullable ftx $$1, dhl $$2, fzg $$3, @Nullable Path $$4) {
      fyw $$5 = new fyw($$0, $$1, $$3, enz.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ewi)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fzi.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fzi.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fzi.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private fyw(fmf $$0, @Nullable ftx $$1, fzg $$2, Optional<aly<eny>> $$3, OptionalLong $$4, fyv $$5) {
      super(xv.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.bf();
      this.G = $$5;
      this.C = new fzi($$0.m().c(), $$2, $$3, $$4);
   }

   public fzi l() {
      return this.C;
   }

   @Override
   protected void aT_() {
      this.K = fqk.a(this.D, this.n).a(new fyw.a(), new fyw.c(), new fyw.b()).a();
      this.c(this.K);
      frx $$0 = this.B.b(frx.e().a(8));
      $$0.a(foe.a(xv.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(foe.a(xu.e, $$0x -> this.E()).a());
      this.B.a($$0x -> {
         $$0x.m(1);
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
         int $$0 = this.K.H().c();
         fsm $$1 = new fsm(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fmf $$0, xv $$1) {
      $$0.d(new fti($$1));
   }

   private void F() {
      fzg $$0 = this.C.k();
      eek.b $$1 = $$0.e().a($$0.d());
      jx<ami> $$2 = $$0.f().a(ami.c, $$1.b());
      Lifecycle $$3 = csu.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dhl $$7 = this.c($$1.d() == ewg.a.c);
      ewg $$8 = new ewg($$7, this.C.k().c(), $$1.d(), $$5);
      fzj.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jx<ami> $$0, ewg $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.J();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jx<ami> $$0, ewi $$1) {
      String $$2 = this.C.c();
      fzg $$3 = this.C.k();
      a(this.m, y);
      Optional<ewc.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fqo.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dhl c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dhd $$2 = new dhd(die.c.b());
         $$2.a(dhd.l).a(false, null);
         return new dhl($$1, dhe.d, false, btf.a, true, $$2, die.c);
      } else {
         return new dhl($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
      this.J();
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(glu::C, ftx.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fnr $$0) {
      $$0.a(glu::C, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Override
   protected <T extends fqc & fsa> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fqc & fpi & fsa> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fqo.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(die $$0) {
      Pair<Path, avg> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fza(this, (avg)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(die $$0) {
      Pair<Path, avg> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fxn((avg)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xv.c("dataPack.title")));
      }
   }

   private void a(avg $$0, boolean $$1, Consumer<die> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      die $$5 = new die(new dgu($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         css $$6 = $$0.f();
         if (csu.a($$6) && $$1) {
            this.m.a(new fyu($$0.g(), $$3x -> {
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

   private void a(avg $$0, die $$1, Consumer<die> $$2) {
      this.m.d(new fti(xv.c("dataPack.validation.working")));
      amx.c $$3 = a($$0, $$1);
      amx.<fyx, fzg>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(mb.bb).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(mb.aI).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fzg $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = eel.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  eel $$5 = (eel)$$3x.flatMap($$1xx -> eel.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amx.b<>(new fyx($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fzg($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fsv($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(die.c);
                  }
               }, xv.c("dataPack.validation.failed"), xu.a, xv.c("dataPack.validation.back"), xv.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amx.c a(avg $$0, die $$1) {
      amx.d $$2 = new amx.d($$0, $$1, false, true);
      return new amx.c($$2, ex.a.c, 2);
   }

   private void J() {
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

   private static Optional<ewc.c> a(fmf $$0, String $$1, @Nullable Path $$2) {
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
   public static Path a(Path $$0, fmf $$1) {
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
         fqo.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, avg> c(die $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = avj.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends fqh {
      private static final xv c = xv.c("createWorld.tab.game.title");
      private static final xv d = xv.c("selectWorld.allowCommands");
      private final fon e;

      a() {
         super(c);
         frs.b $$0 = this.a.b(8).d(1);
         frw $$1 = $$0.b();
         this.e = new fon(fyw.this.p, 208, 20, xv.c("selectWorld.enterName"));
         this.e.a(fyw.this.C.b());
         this.e.b(fyw.this.C::a);
         fyw.this.C.a($$0x -> this.e.a(fpq.a(xv.a("selectWorld.targetFolder", xv.b($$0x.c()).a(n.u)))));
         fyw.this.b(this.e);
         $$0.a(frp.a(fyw.this.p, this.e, fyw.v), $$0.b().b());
         fol<fzi.a> $$2 = $$0.a(fol.<fzi.a>a($$0x -> $$0x.f).a(fzi.a.a, fzi.a.b, fzi.a.c).a(0, 0, 210, 20, fyw.u, ($$0x, $$1x) -> fyw.this.C.a($$1x)), $$1);
         fyw.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fpq.a($$1x.d().a()));
         });
         fol<btf> $$3 = $$0.a(fol.a(btf::b).a(btf.values()).a(0, 0, 210, 20, xv.c("options.difficulty"), ($$0x, $$1x) -> fyw.this.C.a($$1x)), $$1);
         fyw.this.C.a($$1x -> {
            $$3.a(fyw.this.C.e());
            $$3.j = !fyw.this.C.f();
            $$3.a(fpq.a(fyw.this.C.e().d()));
         });
         fol<Boolean> $$4 = $$0.a(fol.e().a($$0x -> fpq.a(fyw.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fyw.this.C.a($$1x)));
         fyw.this.C.a($$1x -> {
            $$4.a(fyw.this.C.g());
            $$4.j = !fyw.this.C.l() && !fyw.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(foe.a(fyw.w, $$0x -> fyw.this.a(fyw.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fqh {
      private static final xv c = xv.c("createWorld.tab.more.title");
      private static final xv d = xv.c("selectWorld.gameRules");
      private static final xv e = xv.c("selectWorld.dataPacks");

      b() {
         super(c);
         frs.b $$0 = this.a.b(8).d(1);
         $$0.a(foe.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(foe.a(fyw.w, $$0x -> fyw.this.a(fyw.this.C.k().h())).a(210).a());
         $$0.a(foe.a(e, $$0x -> fyw.this.b(fyw.this.C.k().h())).a(210).a());
      }

      private void b() {
         fyw.this.m.a(new fyy(fyw.this.C.q().a(fyw.this.C.k().h().b()), $$0 -> {
            fyw.this.m.a(fyw.this);
            $$0.ifPresent(fyw.this.C::a);
         }));
      }
   }

   class c extends fqh {
      private static final xv c = xv.c("createWorld.tab.world.title");
      private static final xv d = xv.c("generator.minecraft.amplified.info");
      private static final xv e = xv.c("selectWorld.mapFeatures");
      private static final xv f = xv.c("selectWorld.mapFeatures.info");
      private static final xv g = xv.c("selectWorld.bonusItems");
      private static final xv h = xv.c("selectWorld.enterSeed");
      static final xv i = xv.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fon k;
      private final foe l;

      c() {
         super(c);
         frs.b $$0 = this.a.a(10).b(8).d(2);
         fol<fzi.b> $$1 = $$0.a(
            fol.<fzi.b>a(fzi.b::a).a(this.c()).a(fyw.c::a).a(0, 0, 150, 20, xv.c("selectWorld.mapType"), ($$0x, $$1x) -> fyw.this.C.a($$1x))
         );
         $$1.a(fyw.this.C.m());
         fyw.this.C.a($$1x -> {
            fzi.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fpq.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fyw.this.C.m().c() != null;
         });
         this.l = $$0.a(foe.a(xv.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fyw.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fon(fyw.this.p, 308, 20, xv.c("selectWorld.enterSeed")) {
            @Override
            protected yj aR_() {
               return super.aR_().b(xu.t).b(fyw.c.i);
            }
         };
         this.k.c(i);
         this.k.a(fyw.this.C.h());
         this.k.b($$0x -> fyw.this.C.b(this.k.a()));
         $$0.a(frp.a(fyw.this.p, this.k, h), 2);
         fzf.a $$2 = fzf.a(310);
         $$2.a(e, fyw.this.C::i, fyw.this.C::b).a(() -> !fyw.this.C.l()).a(f);
         $$2.a(g, fyw.this.C::j, fyw.this.C::c).a(() -> !fyw.this.C.f() && !fyw.this.C.l());
         fzf $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fyw.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fzd $$0 = fyw.this.C.n();
         if ($$0 != null) {
            fyw.this.m.a($$0.createEditScreen(fyw.this, fyw.this.C.k()));
         }
      }

      private fol.c<fzi.b> c() {
         return new fol.c<fzi.b>() {
            @Override
            public List<fzi.b> a() {
               return fol.a.getAsBoolean() ? fyw.this.C.p() : fyw.this.C.o();
            }

            @Override
            public List<fzi.b> b() {
               return fyw.this.C.o();
            }
         };
      }

      private static yj a(fol<fzi.b> $$0) {
         return $$0.a().b() ? xu.a($$0.c(), d) : $$0.c();
      }
   }
}
