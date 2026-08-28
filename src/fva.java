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
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fva extends fqd {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final xd u = xd.c("selectWorld.gameMode");
   static final xd v = xd.c("selectWorld.enterName");
   static final xd w = xd.c("selectWorld.experiments");
   static final xd x = xd.c("selectWorld.allowCommands.info");
   private static final xd y = xd.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final alc a = alc.b("textures/gui/tab_header_background.png");
   private final fny B = new fny(this);
   final fvj C;
   private final fmo D = new fmo(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final eyi F;
   @Nullable
   private final fqd G;
   @Nullable
   private Path H;
   @Nullable
   private aue I;
   @Nullable
   private fmp J;

   public static void a(fil $$0, @Nullable fqd $$1) {
      a($$0, y);
      aue $$2 = new aue(new auh($$0.bf()));
      ama.c $$3 = a($$2, dfc.c);
      CompletableFuture<fvi> $$4 = ama.a(
         $$3, $$0x -> new ama.b<>(new fva.a(new ebg(ebi.a(), eks.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fvi($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ad.g(), $$0
      );
      $$0.b($$4::isDone);
      $$0.a(new fva($$0, $$1, $$4.join(), Optional.of(eks.a), OptionalLong.empty()));
   }

   public static fva a(fil $$0, @Nullable fqd $$1, dek $$2, fvi $$3, @Nullable Path $$4) {
      fva $$5 = new fva($$0, $$1, $$3, eks.a($$3.e()), OptionalLong.of($$3.c().b()));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fvj.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fvj.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fvj.a.c);
      }

      $$5.H = $$4;
      return $$5;
   }

   private fva(fil $$0, @Nullable fqd $$1, fvi $$2, Optional<alb<ekr>> $$3, OptionalLong $$4) {
      super(xd.c("selectWorld.create"));
      this.G = $$1;
      this.F = $$0.bf();
      this.C = new fvj($$0.m().c(), $$2, $$3, $$4);
   }

   public fvj m() {
      return this.C;
   }

   @Override
   protected void aR_() {
      this.J = fmp.a(this.D, this.n).a(new fva.b(), new fva.d(), new fva.c()).a();
      this.c(this.J);
      foc $$0 = this.B.b(foc.e().a(8));
      $$0.a(fkk.a(xd.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(fkk.a(xc.e, $$0x -> this.D()).a());
      this.B.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.J.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aG_() {
   }

   @Override
   public void c() {
      if (this.J != null) {
         this.J.a(this.n);
         this.J.b();
         int $$0 = this.J.H().c();
         fos $$1 = new fos(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fil $$0, xd $$1) {
      $$0.d(new fpo($$1));
   }

   private void E() {
      fvi $$0 = this.C.k();
      ebf.b $$1 = $$0.e().a($$0.d());
      ju<all> $$2 = $$0.f().a(all.c, $$1.b());
      Lifecycle $$3 = cqp.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      fvk.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(esz.a $$0, ju<all> $$1, Lifecycle $$2) {
      a(this.m, y);
      Optional<esv.c> $$3 = this.J();
      if (!$$3.isEmpty()) {
         this.G();
         boolean $$4 = $$0 == esz.a.c;
         fvi $$5 = this.C.k();
         dek $$6 = this.c($$4);
         etb $$7 = new esz($$6, $$5.c(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private dek c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dec $$2 = new dec(dfc.c.b());
         $$2.a(dec.l).a(false, null);
         return new dek($$1, ded.d, false, brm.a, true, $$2, dfc.c);
      } else {
         return new dek($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.J.b($$0)) {
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
   public void d() {
      this.D();
   }

   public void D() {
      this.m.a(this.G);
      this.G();
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(ghq::B, fqd.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fjx $$0) {
      $$0.a(ghq::B, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Override
   protected <T extends fmh & fof> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fmh & fln & fof> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path F() {
      if (this.H == null) {
         try {
            this.H = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fmt.c(this.m, this.C.c());
            this.D();
         }
      }

      return this.H;
   }

   void a(dfc $$0) {
      Pair<Path, aue> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fvd(this, (aue)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dfc $$0) {
      Pair<Path, aue> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fts((aue)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xd.c("dataPack.title")));
      }
   }

   private void a(aue $$0, boolean $$1, Consumer<dfc> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dfc $$5 = new dfc(new ddt($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cqn $$6 = $$0.e();
         if (cqp.a($$6) && $$1) {
            this.m.a(new fuz($$0.f(), $$3x -> {
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

   private void a(aue $$0, dfc $$1, Consumer<dfc> $$2) {
      this.m.d(new fpo(xd.c("dataPack.validation.working")));
      ama.c $$3 = a($$0, $$1);
      ama.<fva.a, fvi>a(
            $$3,
            $$0x -> {
               if ($$0x.c().b(lv.aZ).b().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().b(lv.aG).b().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fvi $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = ebg.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  ebg $$5 = (ebg)$$3x.flatMap($$1xx -> ebg.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new ama.b<>(new fva.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fvi($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ad.g(),
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
               this.m.a(new fpb($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dfc.c);
                  }
               }, xd.c("dataPack.validation.failed"), xc.a, xd.c("dataPack.validation.back"), xd.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static ama.c a(aue $$0, dfc $$1) {
      ama.d $$2 = new ama.d($$0, $$1, false, true);
      return new ama.c($$2, eu.a.c, 2);
   }

   private void G() {
      if (this.H != null) {
         try (Stream<Path> $$0 = Files.walk(this.H)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  d.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            d.warn("Failed to list temporary dir {}", this.H);
         }

         this.H = null;
      }
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ad.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<esv.c> J() {
      String $$0 = this.C.c();

      try {
         esv.c $$1 = this.m.m().e($$0);
         if (this.H == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.H)) {
               Path $$3 = $$1.a(est.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.H)).forEach($$1x -> a(this.H, $$3, $$1x));
               var5 = Optional.of($$1);
            }

            return var5;
         } catch (UncheckedIOException | IOException var8) {
            d.warn("Failed to copy datapacks to world {}", $$0, var8);
            $$1.close();
         }
      } catch (UncheckedIOException | IOException var9) {
         d.warn("Failed to create access for {}", $$0, var9);
      }

      fmt.c(this.m, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fil $$1) {
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
         fmt.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aue> c(dfc $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.I == null) {
            this.I = auh.a($$1, this.F);
            this.I.a();
         }

         this.I.b($$0.a().a());
         return Pair.of($$1, this.I);
      } else {
         return null;
      }
   }

   static record a(ebg a, dfc b) {
   }

   class b extends fmm {
      private static final xd c = xd.c("createWorld.tab.game.title");
      private static final xd d = xd.c("selectWorld.allowCommands");
      private final fkt e;

      b() {
         super(c);
         fnx.b $$0 = this.a.b(8).d(1);
         fob $$1 = $$0.b();
         this.e = new fkt(fva.this.p, 208, 20, xd.c("selectWorld.enterName"));
         this.e.a(fva.this.C.b());
         this.e.b(fva.this.C::a);
         fva.this.C.a($$0x -> this.e.a(flv.a(xd.a("selectWorld.targetFolder", xd.b($$0x.c()).a(n.u)))));
         fva.this.b(this.e);
         $$0.a(fnu.a(fva.this.p, this.e, fva.v), $$0.b().b());
         fkr<fvj.a> $$2 = $$0.a(fkr.<fvj.a>a($$0x -> $$0x.f).a(fvj.a.a, fvj.a.b, fvj.a.c).a(0, 0, 210, 20, fva.u, ($$0x, $$1x) -> fva.this.C.a($$1x)), $$1);
         fva.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(flv.a($$1x.d().a()));
         });
         fkr<brm> $$3 = $$0.a(fkr.a(brm::b).a(brm.values()).a(0, 0, 210, 20, xd.c("options.difficulty"), ($$0x, $$1x) -> fva.this.C.a($$1x)), $$1);
         fva.this.C.a($$1x -> {
            $$3.a(fva.this.C.e());
            $$3.j = !fva.this.C.f();
            $$3.a(flv.a(fva.this.C.e().d()));
         });
         fkr<Boolean> $$4 = $$0.a(fkr.e().a($$0x -> flv.a(fva.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fva.this.C.a($$1x)));
         fva.this.C.a($$1x -> {
            $$4.a(fva.this.C.g());
            $$4.j = !fva.this.C.l() && !fva.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fkk.a(fva.w, $$0x -> fva.this.a(fva.this.C.k().h())).a(210).a());
         }
      }
   }

   class c extends fmm {
      private static final xd c = xd.c("createWorld.tab.more.title");
      private static final xd d = xd.c("selectWorld.gameRules");
      private static final xd e = xd.c("selectWorld.dataPacks");

      c() {
         super(c);
         fnx.b $$0 = this.a.b(8).d(1);
         $$0.a(fkk.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fkk.a(fva.w, $$0x -> fva.this.a(fva.this.C.k().h())).a(210).a());
         $$0.a(fkk.a(e, $$0x -> fva.this.b(fva.this.C.k().h())).a(210).a());
      }

      private void b() {
         fva.this.m.a(new fvb(fva.this.C.q().a(fva.this.C.k().h().b()), $$0 -> {
            fva.this.m.a(fva.this);
            $$0.ifPresent(fva.this.C::a);
         }));
      }
   }

   class d extends fmm {
      private static final xd c = xd.c("createWorld.tab.world.title");
      private static final xd d = xd.c("generator.minecraft.amplified.info");
      private static final xd e = xd.c("selectWorld.mapFeatures");
      private static final xd f = xd.c("selectWorld.mapFeatures.info");
      private static final xd g = xd.c("selectWorld.bonusItems");
      private static final xd h = xd.c("selectWorld.enterSeed");
      static final xd i = xd.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fkt k;
      private final fkk l;

      d() {
         super(c);
         fnx.b $$0 = this.a.a(10).b(8).d(2);
         fkr<fvj.b> $$1 = $$0.a(
            fkr.<fvj.b>a(fvj.b::a).a(this.c()).a(fva.d::a).a(0, 0, 150, 20, xd.c("selectWorld.mapType"), ($$0x, $$1x) -> fva.this.C.a($$1x))
         );
         $$1.a(fva.this.C.m());
         fva.this.C.a($$1x -> {
            fvj.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(flv.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fva.this.C.m().c() != null;
         });
         this.l = $$0.a(fkk.a(xd.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fva.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fkt(fva.this.p, 308, 20, xd.c("selectWorld.enterSeed")) {
            @Override
            protected xr aO_() {
               return super.aO_().b(xc.t).b(fva.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fva.this.C.h());
         this.k.b($$0x -> fva.this.C.b(this.k.a()));
         $$0.a(fnu.a(fva.this.p, this.k, h), 2);
         fvh.a $$2 = fvh.a(310);
         $$2.a(e, fva.this.C::i, fva.this.C::b).a(() -> !fva.this.C.l()).a(f);
         $$2.a(g, fva.this.C::j, fva.this.C::c).a(() -> !fva.this.C.f() && !fva.this.C.l());
         fvh $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fva.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fvf $$0 = fva.this.C.n();
         if ($$0 != null) {
            fva.this.m.a($$0.createEditScreen(fva.this, fva.this.C.k()));
         }
      }

      private fkr.c<fvj.b> c() {
         return new fkr.c<fvj.b>() {
            @Override
            public List<fvj.b> a() {
               return fkr.a.getAsBoolean() ? fva.this.C.p() : fva.this.C.o();
            }

            @Override
            public List<fvj.b> b() {
               return fva.this.C.o();
            }
         };
      }

      private static xr a(fkr<fvj.b> $$0) {
         return $$0.a().b() ? xc.a($$0.c(), d) : $$0.c();
      }
   }
}
