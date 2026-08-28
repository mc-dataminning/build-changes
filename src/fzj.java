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

public class fzj extends fuk {
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
   public static final akv a = akv.b("textures/gui/tab_header_background.png");
   private final fsg B = new fsg(this);
   final fzv C;
   private final fqw D = new fqw($$1x -> {
      fop var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final fap F;
   private final fzi G;
   @Nullable
   private final fuk H;
   @Nullable
   private Path I;
   @Nullable
   private aua J;
   @Nullable
   private fqx K;

   public static void a(fli $$0, @Nullable fuk $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (evk)$$2));
   }

   public static void a(fli $$0, @Nullable fuk $$1, fzi $$2) {
      fzu $$3 = ($$0x, $$1x, $$2x) -> new fzt($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<alt.a, edn> $$4 = $$0x -> new edn(edp.a(), enb.a($$0x.c()));
      a($$0, $$1, $$4, $$3, enb.a, $$2);
   }

   public static void b(fli $$0, @Nullable fuk $$1) {
      fzu $$2 = ($$0x, $$1x, $$2x) -> new fzt($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new fzo(fzv.a.c, Set.of(dgd.l, dgd.w, dgd.e), eln.h));
      Function<alt.a, edn> $$3 = $$0x -> new edn(edp.b(), enb.c($$0x.c()));
      a($$0, $$1, $$3, $$2, enb.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (evk)$$2x));
   }

   private static void a(fli $$0, @Nullable fuk $$1, Function<alt.a, edn> $$2, fzu $$3, aku<ena> $$4, fzi $$5) {
      a($$0, y);
      aua $$6 = new aua(new aud($$0.be()));
      alt.c $$7 = a($$6, dhe.c);
      CompletableFuture<fzt> $$8 = alt.a($$7, $$1x -> new alt.b<>(new fzk($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, af.g(), $$0);
      $$0.b($$8::isDone);
      $$0.a(new fzj($$0, $$1, $$8.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static fzj a(fli $$0, @Nullable fuk $$1, dgl $$2, fzt $$3, @Nullable Path $$4) {
      fzj $$5 = new fzj($$0, $$1, $$3, enb.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (evk)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fzv.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fzv.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fzv.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private fzj(fli $$0, @Nullable fuk $$1, fzt $$2, Optional<aku<ena>> $$3, OptionalLong $$4, fzi $$5) {
      super(wp.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new fzv($$0.m().c(), $$2, $$3, $$4);
   }

   public fzv m() {
      return this.C;
   }

   @Override
   protected void aR_() {
      this.K = fqx.a(this.D, this.n).a(new fzj.a(), new fzj.c(), new fzj.b()).a();
      this.c(this.K);
      fsk $$0 = this.B.b(fsk.e().a(8));
      $$0.a(fos.a(wp.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fos.a(wo.e, $$0x -> this.E()).a());
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
         fsz $$1 = new fsz(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fli $$0, wp $$1) {
      $$0.d(new ftv($$1));
   }

   private void F() {
      fzt $$0 = this.C.k();
      edm.b $$1 = $$0.e().a($$0.d());
      jy<ale> $$2 = $$0.f().a(ale.c, $$1.b());
      Lifecycle $$3 = cru.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dgl $$7 = this.c($$1.d() == evi.a.c);
      evi $$8 = new evi($$7, this.C.k().c(), $$1.d(), $$5);
      fzw.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jy<ale> $$0, evi $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jy<ale> $$0, evk $$1) {
      String $$2 = this.C.c();
      fzt $$3 = this.C.k();
      a(this.m, y);
      Optional<eve.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         frb.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dgl c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dgd $$2 = new dgd(dhe.c.b());
         $$2.a(dgd.l).a(false, null);
         return new dgl($$1, dge.d, false, bsg.a, true, $$2, dhe.c);
      } else {
         return new dgl($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gmh::H, fuk.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fod $$0) {
      $$0.a(gmh::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            frb.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dhe $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fzn(this, (aua)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dhe $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fya((aua)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wp.c("dataPack.title")));
      }
   }

   private void a(aua $$0, boolean $$1, Consumer<dhe> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dhe $$5 = new dhe(new dfu($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         crs $$6 = $$0.f();
         if (cru.a($$6) && $$1) {
            this.m.a(new fzh($$0.g(), $$3x -> {
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

   private void a(aua $$0, dhe $$1, Consumer<dhe> $$2) {
      this.m.d(new ftv(wp.c("dataPack.validation.working")));
      alt.c $$3 = a($$0, $$1);
      alt.<fzk, fzt>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(mc.bb).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(mc.aI).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fzt $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = edn.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  edn $$5 = (edn)$$3x.flatMap($$1xx -> edn.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new alt.b<>(new fzk($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fzt($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            af.g(),
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
               this.m.a(new fti($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dhe.c);
                  }
               }, wp.c("dataPack.validation.failed"), wo.a, wp.c("dataPack.validation.back"), wp.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static alt.c a(aua $$0, dhe $$1) {
      alt.d $$2 = new alt.d($$0, $$1, false, true);
      return new alt.c($$2, ey.a.c, 2);
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

   private static Optional<eve.c> a(fli $$0, String $$1, @Nullable Path $$2) {
      try {
         eve.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(evc.j);
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
   public static Path a(Path $$0, fli $$1) {
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
         frb.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aua> c(dhe $$0) {
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

   class a extends fqu {
      private static final wp c = wp.c("createWorld.tab.game.title");
      private static final wp d = wp.c("selectWorld.allowCommands");
      private final fpb e;

      a() {
         super(c);
         fsf.b $$0 = this.a.b(8).d(1);
         fsj $$1 = $$0.b();
         this.e = new fpb(fzj.this.p, 208, 20, wp.c("selectWorld.enterName"));
         this.e.a(fzj.this.C.b());
         this.e.b(fzj.this.C::a);
         fzj.this.C.a($$0x -> this.e.a(fqd.a(wp.a("selectWorld.targetFolder", wp.b($$0x.c()).a(n.u)))));
         fzj.this.b(this.e);
         $$0.a(fsc.a(fzj.this.p, this.e, fzj.v), $$0.b().b());
         foz<fzv.a> $$2 = $$0.a(foz.<fzv.a>a($$0x -> $$0x.f).a(fzv.a.a, fzv.a.b, fzv.a.c).a(0, 0, 210, 20, fzj.u, ($$0x, $$1x) -> fzj.this.C.a($$1x)), $$1);
         fzj.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fqd.a($$1x.d().a()));
         });
         foz<bsg> $$3 = $$0.a(foz.a(bsg::b).a(bsg.values()).a(0, 0, 210, 20, wp.c("options.difficulty"), ($$0x, $$1x) -> fzj.this.C.a($$1x)), $$1);
         fzj.this.C.a($$1x -> {
            $$3.a(fzj.this.C.e());
            $$3.j = !fzj.this.C.f();
            $$3.a(fqd.a(fzj.this.C.e().d()));
         });
         foz<Boolean> $$4 = $$0.a(foz.e().a($$0x -> fqd.a(fzj.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fzj.this.C.a($$1x)));
         fzj.this.C.a($$1x -> {
            $$4.a(fzj.this.C.g());
            $$4.j = !fzj.this.C.l() && !fzj.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fos.a(fzj.w, $$0x -> fzj.this.a(fzj.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fqu {
      private static final wp c = wp.c("createWorld.tab.more.title");
      private static final wp d = wp.c("selectWorld.gameRules");
      private static final wp e = wp.c("selectWorld.dataPacks");

      b() {
         super(c);
         fsf.b $$0 = this.a.b(8).d(1);
         $$0.a(fos.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fos.a(fzj.w, $$0x -> fzj.this.a(fzj.this.C.k().h())).a(210).a());
         $$0.a(fos.a(e, $$0x -> fzj.this.b(fzj.this.C.k().h())).a(210).a());
      }

      private void b() {
         fzj.this.m.a(new fzl(fzj.this.C.q().a(fzj.this.C.k().h().b()), $$0 -> {
            fzj.this.m.a(fzj.this);
            $$0.ifPresent(fzj.this.C::a);
         }));
      }
   }

   class c extends fqu {
      private static final wp c = wp.c("createWorld.tab.world.title");
      private static final wp d = wp.c("generator.minecraft.amplified.info");
      private static final wp e = wp.c("selectWorld.mapFeatures");
      private static final wp f = wp.c("selectWorld.mapFeatures.info");
      private static final wp g = wp.c("selectWorld.bonusItems");
      private static final wp h = wp.c("selectWorld.enterSeed");
      static final wp i = wp.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fpb k;
      private final fos l;

      c() {
         super(c);
         fsf.b $$0 = this.a.a(10).b(8).d(2);
         foz<fzv.b> $$1 = $$0.a(
            foz.<fzv.b>a(fzv.b::a).a(this.c()).a(fzj.c::a).a(0, 0, 150, 20, wp.c("selectWorld.mapType"), ($$0x, $$1x) -> fzj.this.C.a($$1x))
         );
         $$1.a(fzj.this.C.m());
         fzj.this.C.a($$1x -> {
            fzv.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fqd.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fzj.this.C.m().c() != null;
         });
         this.l = $$0.a(fos.a(wp.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fzj.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fpb(fzj.this.p, 308, 20, wp.c("selectWorld.enterSeed")) {
            @Override
            protected xd d() {
               return super.d().b(wo.t).b(fzj.c.i);
            }
         };
         this.k.c(i);
         this.k.a(fzj.this.C.h());
         this.k.b($$0x -> fzj.this.C.b(this.k.a()));
         $$0.a(fsc.a(fzj.this.p, this.k, h), 2);
         fzs.a $$2 = fzs.a(310);
         $$2.a(e, fzj.this.C::i, fzj.this.C::b).a(() -> !fzj.this.C.l()).a(f);
         $$2.a(g, fzj.this.C::j, fzj.this.C::c).a(() -> !fzj.this.C.f() && !fzj.this.C.l());
         fzs $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         fzj.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         fzq $$0 = fzj.this.C.n();
         if ($$0 != null) {
            fzj.this.m.a($$0.createEditScreen(fzj.this, fzj.this.C.k()));
         }
      }

      private foz.c<fzv.b> c() {
         return new foz.c<fzv.b>() {
            @Override
            public List<fzv.b> a() {
               return foz.a.getAsBoolean() ? fzj.this.C.p() : fzj.this.C.o();
            }

            @Override
            public List<fzv.b> b() {
               return fzj.this.C.o();
            }
         };
      }

      private static xd a(foz<fzv.b> $$0) {
         return $$0.a().b() ? wo.a($$0.c(), d) : $$0.c();
      }
   }
}
