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

public class fuq extends fpt {
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
   public static final alb a = alb.b("textures/gui/tab_header_background.png");
   private final fno B = new fno(this);
   final fuz C;
   private final fme D = new fme(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final exu F;
   @Nullable
   private final fpt G;
   @Nullable
   private Path H;
   @Nullable
   private aud I;
   @Nullable
   private fmf J;

   public static void a(fib $$0, @Nullable fpt $$1) {
      a($$0, y);
      aud $$2 = new aud(new aug($$0.be()));
      alz.c $$3 = a($$2, deo.c);
      CompletableFuture<fuy> $$4 = alz.a(
         $$3, $$0x -> new alz.b<>(new fuq.a(new eas(eau.a(), eke.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fuy($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ad.g(), $$0
      );
      $$0.b($$4::isDone);
      $$0.a(new fuq($$0, $$1, $$4.join(), Optional.of(eke.a), OptionalLong.empty()));
   }

   public static fuq a(fib $$0, @Nullable fpt $$1, ddw $$2, fuy $$3, @Nullable Path $$4) {
      fuq $$5 = new fuq($$0, $$1, $$3, eke.a($$3.e()), OptionalLong.of($$3.c().b()));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fuz.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fuz.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fuz.a.c);
      }

      $$5.H = $$4;
      return $$5;
   }

   private fuq(fib $$0, @Nullable fpt $$1, fuy $$2, Optional<ala<ekd>> $$3, OptionalLong $$4) {
      super(xd.c("selectWorld.create"));
      this.G = $$1;
      this.F = $$0.be();
      this.C = new fuz($$0.m().c(), $$2, $$3, $$4);
   }

   public fuz m() {
      return this.C;
   }

   @Override
   protected void aT_() {
      this.J = fmf.a(this.D, this.n).a(new fuq.b(), new fuq.d(), new fuq.c()).a();
      this.c(this.J);
      fns $$0 = this.B.b(fns.e().a(8));
      $$0.a(fka.a(xd.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(fka.a(xc.e, $$0x -> this.D()).a());
      this.B.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.J.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aI_() {
   }

   @Override
   public void c() {
      if (this.J != null) {
         this.J.a(this.n);
         this.J.b();
         int $$0 = this.J.H().c();
         foh $$1 = new foh(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fib $$0, xd $$1) {
      $$0.d(new fpe($$1));
   }

   private void E() {
      fuy $$0 = this.C.k();
      ear.b $$1 = $$0.e().a($$0.d());
      ju<alk> $$2 = $$0.f().a(alk.c, $$1.b());
      Lifecycle $$3 = cqj.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      fva.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(esl.a $$0, ju<alk> $$1, Lifecycle $$2) {
      a(this.m, y);
      Optional<esh.c> $$3 = this.J();
      if (!$$3.isEmpty()) {
         this.G();
         boolean $$4 = $$0 == esl.a.c;
         fuy $$5 = this.C.k();
         ddw $$6 = this.c($$4);
         esn $$7 = new esl($$6, $$5.c(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private ddw c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         ddo $$2 = new ddo(deo.c.b());
         $$2.a(ddo.l).a(false, null);
         return new ddw($$1, ddp.d, false, brh.a, true, $$2, deo.c);
      } else {
         return new ddw($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(ghe::C, fpt.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fjn $$0) {
      $$0.a(ghe::C, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Override
   protected <T extends flx & fnv> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends flx & fld & fnv> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path F() {
      if (this.H == null) {
         try {
            this.H = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fmj.c(this.m, this.C.c());
            this.D();
         }
      }

      return this.H;
   }

   void a(deo $$0) {
      Pair<Path, aud> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fut(this, (aud)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(deo $$0) {
      Pair<Path, aud> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fti((aud)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xd.c("dataPack.title")));
      }
   }

   private void a(aud $$0, boolean $$1, Consumer<deo> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      deo $$5 = new deo(new ddf($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cqh $$6 = $$0.e();
         if (cqj.a($$6) && $$1) {
            this.m.a(new fup($$0.f(), $$3x -> {
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

   private void a(aud $$0, deo $$1, Consumer<deo> $$2) {
      this.m.d(new fpe(xd.c("dataPack.validation.working")));
      alz.c $$3 = a($$0, $$1);
      alz.<fuq.a, fuy>a(
            $$3,
            $$0x -> {
               if ($$0x.c().b(lv.aY).b().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().b(lv.aF).b().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fuy $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = eas.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  eas $$5 = (eas)$$3x.flatMap($$1xx -> eas.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new alz.b<>(new fuq.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fuy($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new foq($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(deo.c);
                  }
               }, xd.c("dataPack.validation.failed"), xc.a, xd.c("dataPack.validation.back"), xd.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static alz.c a(aud $$0, deo $$1) {
      alz.d $$2 = new alz.d($$0, $$1, false, true);
      return new alz.c($$2, eu.a.c, 2);
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

   private Optional<esh.c> J() {
      String $$0 = this.C.c();

      try {
         esh.c $$1 = this.m.m().e($$0);
         if (this.H == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.H)) {
               Path $$3 = $$1.a(esf.j);
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

      fmj.c(this.m, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fib $$1) {
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
         fmj.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aud> c(deo $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.I == null) {
            this.I = aug.a($$1, this.F);
            this.I.a();
         }

         this.I.b($$0.a().a());
         return Pair.of($$1, this.I);
      } else {
         return null;
      }
   }

   static record a(eas a, deo b) {
   }

   class b extends fmc {
      private static final xd c = xd.c("createWorld.tab.game.title");
      private static final xd d = xd.c("selectWorld.allowCommands");
      private final fkj e;

      b() {
         super(c);
         fnn.b $$0 = this.a.b(8).d(1);
         fnr $$1 = $$0.b();
         this.e = new fkj(fuq.this.p, 208, 20, xd.c("selectWorld.enterName"));
         this.e.a(fuq.this.C.b());
         this.e.b(fuq.this.C::a);
         fuq.this.C.a($$0x -> this.e.a(fll.a(xd.a("selectWorld.targetFolder", xd.b($$0x.c()).a(n.u)))));
         fuq.this.b(this.e);
         $$0.a(fnk.a(fuq.this.p, this.e, fuq.v), $$0.b().b());
         fkh<fuz.a> $$2 = $$0.a(fkh.<fuz.a>a($$0x -> $$0x.f).a(fuz.a.a, fuz.a.b, fuz.a.c).a(0, 0, 210, 20, fuq.u, ($$0x, $$1x) -> fuq.this.C.a($$1x)), $$1);
         fuq.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fll.a($$1x.d().a()));
         });
         fkh<brh> $$3 = $$0.a(fkh.a(brh::b).a(brh.values()).a(0, 0, 210, 20, xd.c("options.difficulty"), ($$0x, $$1x) -> fuq.this.C.a($$1x)), $$1);
         fuq.this.C.a($$1x -> {
            $$3.a(fuq.this.C.e());
            $$3.j = !fuq.this.C.f();
            $$3.a(fll.a(fuq.this.C.e().d()));
         });
         fkh<Boolean> $$4 = $$0.a(fkh.e().a($$0x -> fll.a(fuq.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fuq.this.C.a($$1x)));
         fuq.this.C.a($$1x -> {
            $$4.a(fuq.this.C.g());
            $$4.j = !fuq.this.C.l() && !fuq.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fka.a(fuq.w, $$0x -> fuq.this.a(fuq.this.C.k().h())).a(210).a());
         }
      }
   }

   class c extends fmc {
      private static final xd c = xd.c("createWorld.tab.more.title");
      private static final xd d = xd.c("selectWorld.gameRules");
      private static final xd e = xd.c("selectWorld.dataPacks");

      c() {
         super(c);
         fnn.b $$0 = this.a.b(8).d(1);
         $$0.a(fka.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fka.a(fuq.w, $$0x -> fuq.this.a(fuq.this.C.k().h())).a(210).a());
         $$0.a(fka.a(e, $$0x -> fuq.this.b(fuq.this.C.k().h())).a(210).a());
      }

      private void b() {
         fuq.this.m.a(new fur(fuq.this.C.q().a(fuq.this.C.k().h().b()), $$0 -> {
            fuq.this.m.a(fuq.this);
            $$0.ifPresent(fuq.this.C::a);
         }));
      }
   }

   class d extends fmc {
      private static final xd c = xd.c("createWorld.tab.world.title");
      private static final xd d = xd.c("generator.minecraft.amplified.info");
      private static final xd e = xd.c("selectWorld.mapFeatures");
      private static final xd f = xd.c("selectWorld.mapFeatures.info");
      private static final xd g = xd.c("selectWorld.bonusItems");
      private static final xd h = xd.c("selectWorld.enterSeed");
      static final xd i = xd.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fkj k;
      private final fka l;

      d() {
         super(c);
         fnn.b $$0 = this.a.a(10).b(8).d(2);
         fkh<fuz.b> $$1 = $$0.a(
            fkh.<fuz.b>a(fuz.b::a).a(this.c()).a(fuq.d::a).a(0, 0, 150, 20, xd.c("selectWorld.mapType"), ($$0x, $$1x) -> fuq.this.C.a($$1x))
         );
         $$1.a(fuq.this.C.m());
         fuq.this.C.a($$1x -> {
            fuz.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fll.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fuq.this.C.m().c() != null;
         });
         this.l = $$0.a(fka.a(xd.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fuq.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fkj(fuq.this.p, 308, 20, xd.c("selectWorld.enterSeed")) {
            @Override
            protected xr aQ_() {
               return super.aQ_().b(xc.t).b(fuq.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fuq.this.C.h());
         this.k.b($$0x -> fuq.this.C.b(this.k.a()));
         $$0.a(fnk.a(fuq.this.p, this.k, h), 2);
         fux.a $$2 = fux.a(310);
         $$2.a(e, fuq.this.C::i, fuq.this.C::b).a(() -> !fuq.this.C.l()).a(f);
         $$2.a(g, fuq.this.C::j, fuq.this.C::c).a(() -> !fuq.this.C.f() && !fuq.this.C.l());
         fux $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fuq.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fuv $$0 = fuq.this.C.n();
         if ($$0 != null) {
            fuq.this.m.a($$0.createEditScreen(fuq.this, fuq.this.C.k()));
         }
      }

      private fkh.c<fuz.b> c() {
         return new fkh.c<fuz.b>() {
            @Override
            public List<fuz.b> a() {
               return fkh.a.getAsBoolean() ? fuq.this.C.p() : fuq.this.C.o();
            }

            @Override
            public List<fuz.b> b() {
               return fuq.this.C.o();
            }
         };
      }

      private static xr a(fkh<fuz.b> $$0) {
         return $$0.a().b() ? xc.a($$0.c(), d) : $$0.c();
      }
   }
}
