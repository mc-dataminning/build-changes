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

public class fyq extends ftr {
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
   private final frn B = new frn(this);
   final fzc C;
   private final fqd D = new fqd(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final fbi F;
   private final fyp G;
   @Nullable
   private final ftr H;
   @Nullable
   private Path I;
   @Nullable
   private avg J;
   @Nullable
   private fqe K;

   public static void a(flz $$0, @Nullable ftr $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (ewb)$$2));
   }

   public static void a(flz $$0, @Nullable ftr $$1, fyp $$2) {
      fzb $$3 = ($$0x, $$1x, $$2x) -> new fza($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<amx.a, eee> $$4 = $$0x -> new eee(eeg.a(), ens.a($$0x.c()));
      a($$0, $$1, $$4, $$3, ens.a, $$2);
   }

   public static void b(flz $$0, @Nullable ftr $$1) {
      fzb $$2 = ($$0x, $$1x, $$2x) -> new fza($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new fyv(fzc.a.c, Set.of(dgw.l, dgw.v, dgw.e), eme.h));
      Function<amx.a, eee> $$3 = $$0x -> new eee(eeg.b(), ens.c($$0x.c()));
      a($$0, $$1, $$3, $$2, ens.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ewb)$$2x));
   }

   private static void a(flz $$0, @Nullable ftr $$1, Function<amx.a, eee> $$2, fzb $$3, aly<enr> $$4, fyp $$5) {
      a($$0, y);
      avg $$6 = new avg(new avj($$0.bf()));
      amx.c $$7 = a($$6, dhx.c);
      CompletableFuture<fza> $$8 = amx.a($$7, $$1x -> new amx.b<>(new fyr($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ae.g(), $$0);
      $$0.b($$8::isDone);
      $$0.a(new fyq($$0, $$1, $$8.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static fyq a(flz $$0, @Nullable ftr $$1, dhe $$2, fza $$3, @Nullable Path $$4) {
      fyq $$5 = new fyq($$0, $$1, $$3, ens.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ewb)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fzc.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fzc.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fzc.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private fyq(flz $$0, @Nullable ftr $$1, fza $$2, Optional<aly<enr>> $$3, OptionalLong $$4, fyp $$5) {
      super(xv.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.bf();
      this.G = $$5;
      this.C = new fzc($$0.m().c(), $$2, $$3, $$4);
   }

   public fzc l() {
      return this.C;
   }

   @Override
   protected void aT_() {
      this.K = fqe.a(this.D, this.n).a(new fyq.a(), new fyq.c(), new fyq.b()).a();
      this.c(this.K);
      frr $$0 = this.B.b(frr.e().a(8));
      $$0.a(fny.a(xv.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fny.a(xu.e, $$0x -> this.E()).a());
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
         fsg $$1 = new fsg(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(flz $$0, xv $$1) {
      $$0.d(new ftc($$1));
   }

   private void F() {
      fza $$0 = this.C.k();
      eed.b $$1 = $$0.e().a($$0.d());
      jx<ami> $$2 = $$0.f().a(ami.c, $$1.b());
      Lifecycle $$3 = csq.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dhe $$7 = this.c($$1.d() == evz.a.c);
      evz $$8 = new evz($$7, this.C.k().c(), $$1.d(), $$5);
      fzd.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jx<ami> $$0, evz $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.J();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jx<ami> $$0, ewb $$1) {
      String $$2 = this.C.c();
      fza $$3 = this.C.k();
      a(this.m, y);
      Optional<evv.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fqi.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dhe c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dgw $$2 = new dgw(dhx.c.b());
         $$2.a(dgw.l).a(false, null);
         return new dhe($$1, dgx.d, false, btb.a, true, $$2, dhx.c);
      } else {
         return new dhe($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(glo::B, ftr.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fnl $$0) {
      $$0.a(glo::B, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Override
   protected <T extends fpw & fru> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fpw & fpc & fru> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fqi.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dhx $$0) {
      Pair<Path, avg> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fyu(this, (avg)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dhx $$0) {
      Pair<Path, avg> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fxh((avg)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xv.c("dataPack.title")));
      }
   }

   private void a(avg $$0, boolean $$1, Consumer<dhx> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dhx $$5 = new dhx(new dgn($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cso $$6 = $$0.f();
         if (csq.a($$6) && $$1) {
            this.m.a(new fyo($$0.g(), $$3x -> {
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

   private void a(avg $$0, dhx $$1, Consumer<dhx> $$2) {
      this.m.d(new ftc(xv.c("dataPack.validation.working")));
      amx.c $$3 = a($$0, $$1);
      amx.<fyr, fza>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(mb.ba).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(mb.aH).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fza $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = eee.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  eee $$5 = (eee)$$3x.flatMap($$1xx -> eee.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amx.b<>(new fyr($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fza($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fsp($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dhx.c);
                  }
               }, xv.c("dataPack.validation.failed"), xu.a, xv.c("dataPack.validation.back"), xv.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amx.c a(avg $$0, dhx $$1) {
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

   private static Optional<evv.c> a(flz $$0, String $$1, @Nullable Path $$2) {
      try {
         evv.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(evt.j);
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
   public static Path a(Path $$0, flz $$1) {
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
         fqi.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, avg> c(dhx $$0) {
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

   class a extends fqb {
      private static final xv c = xv.c("createWorld.tab.game.title");
      private static final xv d = xv.c("selectWorld.allowCommands");
      private final foh e;

      a() {
         super(c);
         frm.b $$0 = this.a.b(8).d(1);
         frq $$1 = $$0.b();
         this.e = new foh(fyq.this.p, 208, 20, xv.c("selectWorld.enterName"));
         this.e.a(fyq.this.C.b());
         this.e.b(fyq.this.C::a);
         fyq.this.C.a($$0x -> this.e.a(fpk.a(xv.a("selectWorld.targetFolder", xv.b($$0x.c()).a(n.u)))));
         fyq.this.b(this.e);
         $$0.a(frj.a(fyq.this.p, this.e, fyq.v), $$0.b().b());
         fof<fzc.a> $$2 = $$0.a(fof.<fzc.a>a($$0x -> $$0x.f).a(fzc.a.a, fzc.a.b, fzc.a.c).a(0, 0, 210, 20, fyq.u, ($$0x, $$1x) -> fyq.this.C.a($$1x)), $$1);
         fyq.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fpk.a($$1x.d().a()));
         });
         fof<btb> $$3 = $$0.a(fof.a(btb::b).a(btb.values()).a(0, 0, 210, 20, xv.c("options.difficulty"), ($$0x, $$1x) -> fyq.this.C.a($$1x)), $$1);
         fyq.this.C.a($$1x -> {
            $$3.a(fyq.this.C.e());
            $$3.j = !fyq.this.C.f();
            $$3.a(fpk.a(fyq.this.C.e().d()));
         });
         fof<Boolean> $$4 = $$0.a(fof.e().a($$0x -> fpk.a(fyq.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fyq.this.C.a($$1x)));
         fyq.this.C.a($$1x -> {
            $$4.a(fyq.this.C.g());
            $$4.j = !fyq.this.C.l() && !fyq.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fny.a(fyq.w, $$0x -> fyq.this.a(fyq.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fqb {
      private static final xv c = xv.c("createWorld.tab.more.title");
      private static final xv d = xv.c("selectWorld.gameRules");
      private static final xv e = xv.c("selectWorld.dataPacks");

      b() {
         super(c);
         frm.b $$0 = this.a.b(8).d(1);
         $$0.a(fny.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fny.a(fyq.w, $$0x -> fyq.this.a(fyq.this.C.k().h())).a(210).a());
         $$0.a(fny.a(e, $$0x -> fyq.this.b(fyq.this.C.k().h())).a(210).a());
      }

      private void b() {
         fyq.this.m.a(new fys(fyq.this.C.q().a(fyq.this.C.k().h().b()), $$0 -> {
            fyq.this.m.a(fyq.this);
            $$0.ifPresent(fyq.this.C::a);
         }));
      }
   }

   class c extends fqb {
      private static final xv c = xv.c("createWorld.tab.world.title");
      private static final xv d = xv.c("generator.minecraft.amplified.info");
      private static final xv e = xv.c("selectWorld.mapFeatures");
      private static final xv f = xv.c("selectWorld.mapFeatures.info");
      private static final xv g = xv.c("selectWorld.bonusItems");
      private static final xv h = xv.c("selectWorld.enterSeed");
      static final xv i = xv.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final foh k;
      private final fny l;

      c() {
         super(c);
         frm.b $$0 = this.a.a(10).b(8).d(2);
         fof<fzc.b> $$1 = $$0.a(
            fof.<fzc.b>a(fzc.b::a).a(this.c()).a(fyq.c::a).a(0, 0, 150, 20, xv.c("selectWorld.mapType"), ($$0x, $$1x) -> fyq.this.C.a($$1x))
         );
         $$1.a(fyq.this.C.m());
         fyq.this.C.a($$1x -> {
            fzc.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fpk.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fyq.this.C.m().c() != null;
         });
         this.l = $$0.a(fny.a(xv.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fyq.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new foh(fyq.this.p, 308, 20, xv.c("selectWorld.enterSeed")) {
            @Override
            protected yj aR_() {
               return super.aR_().b(xu.t).b(fyq.c.i);
            }
         };
         this.k.c(i);
         this.k.a(fyq.this.C.h());
         this.k.b($$0x -> fyq.this.C.b(this.k.a()));
         $$0.a(frj.a(fyq.this.p, this.k, h), 2);
         fyz.a $$2 = fyz.a(310);
         $$2.a(e, fyq.this.C::i, fyq.this.C::b).a(() -> !fyq.this.C.l()).a(f);
         $$2.a(g, fyq.this.C::j, fyq.this.C::c).a(() -> !fyq.this.C.f() && !fyq.this.C.l());
         fyz $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fyq.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fyx $$0 = fyq.this.C.n();
         if ($$0 != null) {
            fyq.this.m.a($$0.createEditScreen(fyq.this, fyq.this.C.k()));
         }
      }

      private fof.c<fzc.b> c() {
         return new fof.c<fzc.b>() {
            @Override
            public List<fzc.b> a() {
               return fof.a.getAsBoolean() ? fyq.this.C.p() : fyq.this.C.o();
            }

            @Override
            public List<fzc.b> b() {
               return fyq.this.C.o();
            }
         };
      }

      private static yj a(fof<fzc.b> $$0) {
         return $$0.a().b() ? xu.a($$0.c(), d) : $$0.c();
      }
   }
}
