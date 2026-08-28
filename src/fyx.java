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

public class fyx extends fty {
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
   private final fru B = new fru(this);
   final fzj C;
   private final fqk D = new fqk(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final fbo F;
   private final fyw G;
   @Nullable
   private final fty H;
   @Nullable
   private Path I;
   @Nullable
   private avg J;
   @Nullable
   private fql K;

   public static void a(fmg $$0, @Nullable fty $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (ewj)$$2));
   }

   public static void a(fmg $$0, @Nullable fty $$1, fyw $$2) {
      fzi $$3 = ($$0x, $$1x, $$2x) -> new fzh($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<amx.a, eem> $$4 = $$0x -> new eem(eeo.a(), eoa.a($$0x.c()));
      a($$0, $$1, $$4, $$3, eoa.a, $$2);
   }

   public static void b(fmg $$0, @Nullable fty $$1) {
      fzi $$2 = ($$0x, $$1x, $$2x) -> new fzh($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new fzc(fzj.a.c, Set.of(dhe.l, dhe.w, dhe.e), emm.h));
      Function<amx.a, eem> $$3 = $$0x -> new eem(eeo.b(), eoa.c($$0x.c()));
      a($$0, $$1, $$3, $$2, eoa.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ewj)$$2x));
   }

   private static void a(fmg $$0, @Nullable fty $$1, Function<amx.a, eem> $$2, fzi $$3, aly<enz> $$4, fyw $$5) {
      a($$0, y);
      avg $$6 = new avg(new avj($$0.bf()));
      amx.c $$7 = a($$6, dif.c);
      CompletableFuture<fzh> $$8 = amx.a($$7, $$1x -> new amx.b<>(new fyy($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ae.g(), $$0);
      $$0.b($$8::isDone);
      $$0.a(new fyx($$0, $$1, $$8.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static fyx a(fmg $$0, @Nullable fty $$1, dhm $$2, fzh $$3, @Nullable Path $$4) {
      fyx $$5 = new fyx($$0, $$1, $$3, eoa.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ewj)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fzj.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fzj.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fzj.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private fyx(fmg $$0, @Nullable fty $$1, fzh $$2, Optional<aly<enz>> $$3, OptionalLong $$4, fyw $$5) {
      super(xv.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.bf();
      this.G = $$5;
      this.C = new fzj($$0.m().c(), $$2, $$3, $$4);
   }

   public fzj l() {
      return this.C;
   }

   @Override
   protected void aT_() {
      this.K = fql.a(this.D, this.n).a(new fyx.a(), new fyx.c(), new fyx.b()).a();
      this.c(this.K);
      fry $$0 = this.B.b(fry.e().a(8));
      $$0.a(fof.a(xv.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fof.a(xu.e, $$0x -> this.E()).a());
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
         fsn $$1 = new fsn(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fmg $$0, xv $$1) {
      $$0.d(new ftj($$1));
   }

   private void F() {
      fzh $$0 = this.C.k();
      eel.b $$1 = $$0.e().a($$0.d());
      jx<ami> $$2 = $$0.f().a(ami.c, $$1.b());
      Lifecycle $$3 = csv.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dhm $$7 = this.c($$1.d() == ewh.a.c);
      ewh $$8 = new ewh($$7, this.C.k().c(), $$1.d(), $$5);
      fzk.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jx<ami> $$0, ewh $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.J();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jx<ami> $$0, ewj $$1) {
      String $$2 = this.C.c();
      fzh $$3 = this.C.k();
      a(this.m, y);
      Optional<ewd.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fqp.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dhm c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dhe $$2 = new dhe(dif.c.b());
         $$2.a(dhe.l).a(false, null);
         return new dhm($$1, dhf.d, false, btg.a, true, $$2, dif.c);
      } else {
         return new dhm($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(glv::C, fty.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fns $$0) {
      $$0.a(glv::C, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Override
   protected <T extends fqd & fsb> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fqd & fpj & fsb> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fqp.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dif $$0) {
      Pair<Path, avg> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fzb(this, (avg)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dif $$0) {
      Pair<Path, avg> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fxo((avg)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xv.c("dataPack.title")));
      }
   }

   private void a(avg $$0, boolean $$1, Consumer<dif> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dif $$5 = new dif(new dgv($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cst $$6 = $$0.f();
         if (csv.a($$6) && $$1) {
            this.m.a(new fyv($$0.g(), $$3x -> {
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

   private void a(avg $$0, dif $$1, Consumer<dif> $$2) {
      this.m.d(new ftj(xv.c("dataPack.validation.working")));
      amx.c $$3 = a($$0, $$1);
      amx.<fyy, fzh>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(mb.bb).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(mb.aI).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fzh $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = eem.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  eem $$5 = (eem)$$3x.flatMap($$1xx -> eem.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amx.b<>(new fyy($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fzh($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fsw($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dif.c);
                  }
               }, xv.c("dataPack.validation.failed"), xu.a, xv.c("dataPack.validation.back"), xv.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amx.c a(avg $$0, dif $$1) {
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

   private static Optional<ewd.c> a(fmg $$0, String $$1, @Nullable Path $$2) {
      try {
         ewd.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(ewb.j);
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
         fqp.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, avg> c(dif $$0) {
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

   class a extends fqi {
      private static final xv c = xv.c("createWorld.tab.game.title");
      private static final xv d = xv.c("selectWorld.allowCommands");
      private final foo e;

      a() {
         super(c);
         frt.b $$0 = this.a.b(8).d(1);
         frx $$1 = $$0.b();
         this.e = new foo(fyx.this.p, 208, 20, xv.c("selectWorld.enterName"));
         this.e.a(fyx.this.C.b());
         this.e.b(fyx.this.C::a);
         fyx.this.C.a($$0x -> this.e.a(fpr.a(xv.a("selectWorld.targetFolder", xv.b($$0x.c()).a(n.u)))));
         fyx.this.b(this.e);
         $$0.a(frq.a(fyx.this.p, this.e, fyx.v), $$0.b().b());
         fom<fzj.a> $$2 = $$0.a(fom.<fzj.a>a($$0x -> $$0x.f).a(fzj.a.a, fzj.a.b, fzj.a.c).a(0, 0, 210, 20, fyx.u, ($$0x, $$1x) -> fyx.this.C.a($$1x)), $$1);
         fyx.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fpr.a($$1x.d().a()));
         });
         fom<btg> $$3 = $$0.a(fom.a(btg::b).a(btg.values()).a(0, 0, 210, 20, xv.c("options.difficulty"), ($$0x, $$1x) -> fyx.this.C.a($$1x)), $$1);
         fyx.this.C.a($$1x -> {
            $$3.a(fyx.this.C.e());
            $$3.j = !fyx.this.C.f();
            $$3.a(fpr.a(fyx.this.C.e().d()));
         });
         fom<Boolean> $$4 = $$0.a(fom.e().a($$0x -> fpr.a(fyx.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fyx.this.C.a($$1x)));
         fyx.this.C.a($$1x -> {
            $$4.a(fyx.this.C.g());
            $$4.j = !fyx.this.C.l() && !fyx.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fof.a(fyx.w, $$0x -> fyx.this.a(fyx.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fqi {
      private static final xv c = xv.c("createWorld.tab.more.title");
      private static final xv d = xv.c("selectWorld.gameRules");
      private static final xv e = xv.c("selectWorld.dataPacks");

      b() {
         super(c);
         frt.b $$0 = this.a.b(8).d(1);
         $$0.a(fof.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fof.a(fyx.w, $$0x -> fyx.this.a(fyx.this.C.k().h())).a(210).a());
         $$0.a(fof.a(e, $$0x -> fyx.this.b(fyx.this.C.k().h())).a(210).a());
      }

      private void b() {
         fyx.this.m.a(new fyz(fyx.this.C.q().a(fyx.this.C.k().h().b()), $$0 -> {
            fyx.this.m.a(fyx.this);
            $$0.ifPresent(fyx.this.C::a);
         }));
      }
   }

   class c extends fqi {
      private static final xv c = xv.c("createWorld.tab.world.title");
      private static final xv d = xv.c("generator.minecraft.amplified.info");
      private static final xv e = xv.c("selectWorld.mapFeatures");
      private static final xv f = xv.c("selectWorld.mapFeatures.info");
      private static final xv g = xv.c("selectWorld.bonusItems");
      private static final xv h = xv.c("selectWorld.enterSeed");
      static final xv i = xv.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final foo k;
      private final fof l;

      c() {
         super(c);
         frt.b $$0 = this.a.a(10).b(8).d(2);
         fom<fzj.b> $$1 = $$0.a(
            fom.<fzj.b>a(fzj.b::a).a(this.c()).a(fyx.c::a).a(0, 0, 150, 20, xv.c("selectWorld.mapType"), ($$0x, $$1x) -> fyx.this.C.a($$1x))
         );
         $$1.a(fyx.this.C.m());
         fyx.this.C.a($$1x -> {
            fzj.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fpr.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fyx.this.C.m().c() != null;
         });
         this.l = $$0.a(fof.a(xv.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fyx.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new foo(fyx.this.p, 308, 20, xv.c("selectWorld.enterSeed")) {
            @Override
            protected yj aR_() {
               return super.aR_().b(xu.t).b(fyx.c.i);
            }
         };
         this.k.c(i);
         this.k.a(fyx.this.C.h());
         this.k.b($$0x -> fyx.this.C.b(this.k.a()));
         $$0.a(frq.a(fyx.this.p, this.k, h), 2);
         fzg.a $$2 = fzg.a(310);
         $$2.a(e, fyx.this.C::i, fyx.this.C::b).a(() -> !fyx.this.C.l()).a(f);
         $$2.a(g, fyx.this.C::j, fyx.this.C::c).a(() -> !fyx.this.C.f() && !fyx.this.C.l());
         fzg $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fyx.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fze $$0 = fyx.this.C.n();
         if ($$0 != null) {
            fyx.this.m.a($$0.createEditScreen(fyx.this, fyx.this.C.k()));
         }
      }

      private fom.c<fzj.b> c() {
         return new fom.c<fzj.b>() {
            @Override
            public List<fzj.b> a() {
               return fom.a.getAsBoolean() ? fyx.this.C.p() : fyx.this.C.o();
            }

            @Override
            public List<fzj.b> b() {
               return fyx.this.C.o();
            }
         };
      }

      private static yj a(fom<fzj.b> $$0) {
         return $$0.a().b() ? xu.a($$0.c(), d) : $$0.c();
      }
   }
}
