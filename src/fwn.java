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

public class fwn extends frp {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final xl u = xl.c("selectWorld.gameMode");
   static final xl v = xl.c("selectWorld.enterName");
   static final xl w = xl.c("selectWorld.experiments");
   static final xl x = xl.c("selectWorld.allowCommands.info");
   private static final xl y = xl.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final all a = all.b("textures/gui/tab_header_background.png");
   private final fpl B = new fpl(this);
   final fwz C;
   private final foa D = new foa(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final ezh F;
   private final fwm G;
   @Nullable
   private final frp H;
   @Nullable
   private Path I;
   @Nullable
   private auo J;
   @Nullable
   private fob K;

   public static void a(fjx $$0, @Nullable frp $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (eua)$$2));
   }

   public static void a(fjx $$0, @Nullable frp $$1, fwm $$2) {
      fwy $$3 = ($$0x, $$1x, $$2x) -> new fwx($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<amj.a, ecf> $$4 = $$0x -> new ecf(ech.a(), elr.a($$0x.c()));
      a($$0, $$1, $$4, $$3, elr.a, $$2);
   }

   public static void b(fjx $$0, @Nullable frp $$1) {
      fwy $$2 = ($$0x, $$1x, $$2x) -> new fwx($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new fws(fwz.a.c, Set.of(dfb.l, dfb.v, dfb.e), ekd.h));
      Function<amj.a, ecf> $$3 = $$0x -> new ecf(ech.b(), elr.c($$0x.c()));
      a($$0, $$1, $$3, $$2, elr.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (eua)$$2x));
   }

   private static void a(fjx $$0, @Nullable frp $$1, Function<amj.a, ecf> $$2, fwy $$3, alk<elq> $$4, fwm $$5) {
      a($$0, y);
      auo $$6 = new auo(new aur($$0.bf()));
      amj.c $$7 = a($$6, dgc.c);
      CompletableFuture<fwx> $$8 = amj.a($$7, $$1x -> new amj.b<>(new fwo($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ae.g(), $$0);
      $$0.b($$8::isDone);
      $$0.a(new fwn($$0, $$1, $$8.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static fwn a(fjx $$0, @Nullable frp $$1, dfj $$2, fwx $$3, @Nullable Path $$4) {
      fwn $$5 = new fwn($$0, $$1, $$3, elr.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (eua)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fwz.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fwz.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fwz.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private fwn(fjx $$0, @Nullable frp $$1, fwx $$2, Optional<alk<elq>> $$3, OptionalLong $$4, fwm $$5) {
      super(xl.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.bf();
      this.G = $$5;
      this.C = new fwz($$0.m().c(), $$2, $$3, $$4);
   }

   public fwz m() {
      return this.C;
   }

   @Override
   protected void aS_() {
      this.K = fob.a(this.D, this.n).a(new fwn.a(), new fwn.c(), new fwn.b()).a();
      this.c(this.K);
      fpp $$0 = this.B.b(fpp.e().a(8));
      $$0.a(flw.a(xl.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(flw.a(xk.e, $$0x -> this.D()).a());
      this.B.a($$0x -> {
         $$0x.o(1);
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
         fqe $$1 = new fqe(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fjx $$0, xl $$1) {
      $$0.d(new fra($$1));
   }

   private void E() {
      fwx $$0 = this.C.k();
      ece.b $$1 = $$0.e().a($$0.d());
      jx<alu> $$2 = $$0.f().a(alu.c, $$1.b());
      Lifecycle $$3 = crl.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dfj $$7 = this.c($$1.d() == ety.a.c);
      ety $$8 = new ety($$7, this.C.k().c(), $$1.d(), $$5);
      fxa.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jx<alu> $$0, ety $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.G();
      if (!$$2) {
         this.D();
      }
   }

   private boolean a(jx<alu> $$0, eua $$1) {
      String $$2 = this.C.c();
      fwx $$3 = this.C.k();
      a(this.m, y);
      Optional<etu.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fof.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dfj c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dfb $$2 = new dfb(dgc.c.b());
         $$2.a(dfb.l).a(false, null);
         return new dfj($$1, dfc.d, false, bse.a, true, $$2, dgc.c);
      } else {
         return new dfj($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
         this.E();
         return true;
      }
   }

   @Override
   public void aP_() {
      this.D();
   }

   public void D() {
      this.m.a(this.H);
      this.G();
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gjh::B, frp.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(flj $$0) {
      $$0.a(gjh::B, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Override
   protected <T extends fnt & fps> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fnt & fmz & fps> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path F() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fof.c(this.m, this.C.c());
            this.D();
         }
      }

      return this.I;
   }

   void a(dgc $$0) {
      Pair<Path, auo> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fwr(this, (auo)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dgc $$0) {
      Pair<Path, auo> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fve((auo)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xl.c("dataPack.title")));
      }
   }

   private void a(auo $$0, boolean $$1, Consumer<dgc> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dgc $$5 = new dgc(new des($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         crj $$6 = $$0.f();
         if (crl.a($$6) && $$1) {
            this.m.a(new fwl($$0.g(), $$3x -> {
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

   private void a(auo $$0, dgc $$1, Consumer<dgc> $$2) {
      this.m.d(new fra(xl.c("dataPack.validation.working")));
      amj.c $$3 = a($$0, $$1);
      amj.<fwo, fwx>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(ma.aZ).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(ma.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fwx $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = ecf.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  ecf $$5 = (ecf)$$3x.flatMap($$1xx -> ecf.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amj.b<>(new fwo($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fwx($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fqn($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dgc.c);
                  }
               }, xl.c("dataPack.validation.failed"), xk.a, xl.c("dataPack.validation.back"), xl.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amj.c a(auo $$0, dgc $$1) {
      amj.d $$2 = new amj.d($$0, $$1, false, true);
      return new amj.c($$2, ex.a.c, 2);
   }

   private void G() {
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

   private static Optional<etu.c> a(fjx $$0, String $$1, @Nullable Path $$2) {
      try {
         etu.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(ets.j);
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
   public static Path a(Path $$0, fjx $$1) {
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
         fof.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, auo> c(dgc $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = aur.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends fny {
      private static final xl c = xl.c("createWorld.tab.game.title");
      private static final xl d = xl.c("selectWorld.allowCommands");
      private final fmf e;

      a() {
         super(c);
         fpk.b $$0 = this.a.b(8).d(1);
         fpo $$1 = $$0.b();
         this.e = new fmf(fwn.this.p, 208, 20, xl.c("selectWorld.enterName"));
         this.e.a(fwn.this.C.b());
         this.e.b(fwn.this.C::a);
         fwn.this.C.a($$0x -> this.e.a(fnh.a(xl.a("selectWorld.targetFolder", xl.b($$0x.c()).a(n.u)))));
         fwn.this.b(this.e);
         $$0.a(fph.a(fwn.this.p, this.e, fwn.v), $$0.b().b());
         fmd<fwz.a> $$2 = $$0.a(fmd.<fwz.a>a($$0x -> $$0x.f).a(fwz.a.a, fwz.a.b, fwz.a.c).a(0, 0, 210, 20, fwn.u, ($$0x, $$1x) -> fwn.this.C.a($$1x)), $$1);
         fwn.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fnh.a($$1x.d().a()));
         });
         fmd<bse> $$3 = $$0.a(fmd.a(bse::b).a(bse.values()).a(0, 0, 210, 20, xl.c("options.difficulty"), ($$0x, $$1x) -> fwn.this.C.a($$1x)), $$1);
         fwn.this.C.a($$1x -> {
            $$3.a(fwn.this.C.e());
            $$3.j = !fwn.this.C.f();
            $$3.a(fnh.a(fwn.this.C.e().d()));
         });
         fmd<Boolean> $$4 = $$0.a(fmd.e().a($$0x -> fnh.a(fwn.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fwn.this.C.a($$1x)));
         fwn.this.C.a($$1x -> {
            $$4.a(fwn.this.C.g());
            $$4.j = !fwn.this.C.l() && !fwn.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(flw.a(fwn.w, $$0x -> fwn.this.a(fwn.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fny {
      private static final xl c = xl.c("createWorld.tab.more.title");
      private static final xl d = xl.c("selectWorld.gameRules");
      private static final xl e = xl.c("selectWorld.dataPacks");

      b() {
         super(c);
         fpk.b $$0 = this.a.b(8).d(1);
         $$0.a(flw.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(flw.a(fwn.w, $$0x -> fwn.this.a(fwn.this.C.k().h())).a(210).a());
         $$0.a(flw.a(e, $$0x -> fwn.this.b(fwn.this.C.k().h())).a(210).a());
      }

      private void b() {
         fwn.this.m.a(new fwp(fwn.this.C.q().a(fwn.this.C.k().h().b()), $$0 -> {
            fwn.this.m.a(fwn.this);
            $$0.ifPresent(fwn.this.C::a);
         }));
      }
   }

   class c extends fny {
      private static final xl c = xl.c("createWorld.tab.world.title");
      private static final xl d = xl.c("generator.minecraft.amplified.info");
      private static final xl e = xl.c("selectWorld.mapFeatures");
      private static final xl f = xl.c("selectWorld.mapFeatures.info");
      private static final xl g = xl.c("selectWorld.bonusItems");
      private static final xl h = xl.c("selectWorld.enterSeed");
      static final xl i = xl.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fmf k;
      private final flw l;

      c() {
         super(c);
         fpk.b $$0 = this.a.a(10).b(8).d(2);
         fmd<fwz.b> $$1 = $$0.a(
            fmd.<fwz.b>a(fwz.b::a).a(this.c()).a(fwn.c::a).a(0, 0, 150, 20, xl.c("selectWorld.mapType"), ($$0x, $$1x) -> fwn.this.C.a($$1x))
         );
         $$1.a(fwn.this.C.m());
         fwn.this.C.a($$1x -> {
            fwz.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fnh.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fwn.this.C.m().c() != null;
         });
         this.l = $$0.a(flw.a(xl.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fwn.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fmf(fwn.this.p, 308, 20, xl.c("selectWorld.enterSeed")) {
            @Override
            protected xz aO_() {
               return super.aO_().b(xk.t).b(fwn.c.i);
            }
         };
         this.k.c(i);
         this.k.a(fwn.this.C.h());
         this.k.b($$0x -> fwn.this.C.b(this.k.a()));
         $$0.a(fph.a(fwn.this.p, this.k, h), 2);
         fww.a $$2 = fww.a(310);
         $$2.a(e, fwn.this.C::i, fwn.this.C::b).a(() -> !fwn.this.C.l()).a(f);
         $$2.a(g, fwn.this.C::j, fwn.this.C::c).a(() -> !fwn.this.C.f() && !fwn.this.C.l());
         fww $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fwn.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fwu $$0 = fwn.this.C.n();
         if ($$0 != null) {
            fwn.this.m.a($$0.createEditScreen(fwn.this, fwn.this.C.k()));
         }
      }

      private fmd.c<fwz.b> c() {
         return new fmd.c<fwz.b>() {
            @Override
            public List<fwz.b> a() {
               return fmd.a.getAsBoolean() ? fwn.this.C.p() : fwn.this.C.o();
            }

            @Override
            public List<fwz.b> b() {
               return fwn.this.C.o();
            }
         };
      }

      private static xz a(fmd<fwz.b> $$0) {
         return $$0.a().b() ? xk.a($$0.c(), d) : $$0.c();
      }
   }
}
