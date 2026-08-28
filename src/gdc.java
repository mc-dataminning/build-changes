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

public class gdc extends fyb {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final wy u = wy.c("selectWorld.gameMode");
   static final wy v = wy.c("selectWorld.enterName");
   static final wy w = wy.c("selectWorld.experiments");
   static final wy x = wy.c("selectWorld.allowCommands.info");
   private static final wy y = wy.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final alg a = alg.b("textures/gui/tab_header_background.png");
   private final fvx B = new fvx(this);
   final gdo C;
   private final fun D = new fun($$1x -> {
      fsh var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final feg F;
   private final gdb G;
   @Nullable
   private final fyb H;
   @Nullable
   private Path I;
   @Nullable
   private aun J;
   @Nullable
   private fuo K;

   public static void a(foz $$0, @Nullable fyb $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (ezb)$$2));
   }

   public static void a(foz $$0, @Nullable fyb $$1, gdb $$2) {
      gdn $$3 = ($$0x, $$1x, $$2x) -> new gdm($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<ame.a, ehc> $$4 = $$0x -> new ehc(ehe.a(), eqr.a($$0x.c()));
      a($$0, $$1, $$4, $$3, eqr.a, $$2);
   }

   public static void b(foz $$0, @Nullable fyb $$1) {
      gdn $$2 = ($$0x, $$1x, $$2x) -> new gdm($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gdh(gdo.a.c, Set.of(diw.m, diw.x, diw.f), epd.h));
      Function<ame.a, ehc> $$3 = $$0x -> new ehc(ehe.b(), eqr.c($$0x.c()));
      a($$0, $$1, $$3, $$2, eqr.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ezb)$$2x));
   }

   private static void a(foz $$0, @Nullable fyb $$1, Function<ame.a, ehc> $$2, gdn $$3, alf<eqq> $$4, gdb $$5) {
      a($$0, y);
      aun $$6 = new aun(new auq($$0.be()));
      djy $$7 = ab.aU ? new djy(new dio(List.of("vanilla", "tests"), List.of()), cuo.h) : djy.d;
      ame.c $$8 = a($$6, $$7);
      CompletableFuture<gdm> $$9 = ame.a($$8, $$1x -> new ame.b<>(new gdd($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, af.h(), $$0);
      $$0.b($$9::isDone);
      $$0.a(new gdc($$0, $$1, $$9.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static gdc a(foz $$0, @Nullable fyb $$1, dje $$2, gdm $$3, @Nullable Path $$4) {
      gdc $$5 = new gdc($$0, $$1, $$3, eqr.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ezb)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(gdo.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(gdo.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(gdo.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private gdc(foz $$0, @Nullable fyb $$1, gdm $$2, Optional<alf<eqq>> $$3, OptionalLong $$4, gdb $$5) {
      super(wy.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new gdo($$0.m().c(), $$2, $$3, $$4);
   }

   public gdo m() {
      return this.C;
   }

   @Override
   protected void aO_() {
      this.K = fuo.a(this.D, this.n).a(new gdc.a(), new gdc.c(), new gdc.b()).a();
      this.c(this.K);
      fwb $$0 = this.B.b(fwb.e().a(8));
      $$0.a(fsj.a(wy.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fsj.a(wx.e, $$0x -> this.E()).a());
      this.B.a($$0x -> {
         $$0x.l(1);
         this.c($$0x);
      });
      this.K.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aC_() {
   }

   @Override
   public void c() {
      if (this.K != null) {
         this.K.a(this.n);
         this.K.b();
         int $$0 = this.K.J().c();
         fwq $$1 = new fwq(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(foz $$0, wy $$1) {
      $$0.d(new fxm($$1));
   }

   private void F() {
      gdm $$0 = this.C.k();
      ehb.b $$1 = $$0.e().a($$0.d());
      jl<alp> $$2 = $$0.f().a(alp.c, $$1.b());
      Lifecycle $$3 = cuo.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      dje $$7 = this.c($$1.d() == eyz.a.c);
      eyz $$8 = new eyz($$7, this.C.k().c(), $$1.d(), $$5);
      gdp.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jl<alp> $$0, eyz $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jl<alp> $$0, ezb $$1) {
      String $$2 = this.C.c();
      gdm $$3 = this.C.k();
      a(this.m, y);
      Optional<eyv.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fus.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dje c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         diw $$2 = new diw(djy.d.b());
         $$2.b(diw.m).a(false, null);
         return new dje($$1, dix.d, false, bua.a, true, $$2, djy.d);
      } else {
         return new dje($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void aL_() {
      this.E();
   }

   public void E() {
      this.m.a(this.H);
      this.H();
   }

   @Override
   public void a(frv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gqk::H, fyb.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(frv $$0) {
      $$0.a(gqk::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fus.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(djy $$0) {
      Pair<Path, aun> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gdg(this, (aun)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(djy $$0) {
      Pair<Path, aun> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gbt((aun)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wy.c("dataPack.title")));
      }
   }

   private void a(aun $$0, boolean $$1, Consumer<djy> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      djy $$5 = new djy(new dio($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cum $$6 = $$0.f();
         if (cuo.a($$6) && $$1) {
            this.m.a(new gda($$0.g(), $$3x -> {
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

   private void a(aun $$0, djy $$1, Consumer<djy> $$2) {
      this.m.d(new fxm(wy.c("dataPack.validation.working")));
      ame.c $$3 = a($$0, $$1);
      ame.<gdd, gdm>a(
            $$3,
            $$0x -> {
               if ($$0x.c().e(mg.bn).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().e(mg.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  gdm $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = ehc.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  ehc $$5 = (ehc)$$3x.flatMap($$1xx -> ehc.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new ame.b<>(new gdd($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new gdm($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fwz($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(djy.d);
                  }
               }, wy.c("dataPack.validation.failed"), wx.a, wy.c("dataPack.validation.back"), wy.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static ame.c a(aun $$0, djy $$1) {
      ame.d $$2 = new ame.d($$0, $$1, false, true);
      return new ame.c($$2, ej.a.c, 2);
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

   private static Optional<eyv.c> a(foz $$0, String $$1, @Nullable Path $$2) {
      try {
         eyv.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(eyt.j);
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
   public static Path a(Path $$0, foz $$1) {
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
         fus.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aun> c(djy $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.J == null) {
            this.J = auq.a($$1, this.F);
            this.J.a();
         }

         this.J.b($$0.a().a());
         return Pair.of($$1, this.J);
      } else {
         return null;
      }
   }

   class a extends ful {
      private static final wy c = wy.c("createWorld.tab.game.title");
      private static final wy d = wy.c("selectWorld.allowCommands");
      private final fss e;

      a() {
         super(c);
         fvw.b $$0 = this.a.b(8).d(1);
         fwa $$1 = $$0.b();
         this.e = new fss(gdc.this.p, 208, 20, wy.c("selectWorld.enterName"));
         this.e.a(gdc.this.C.b());
         this.e.b(gdc.this.C::a);
         gdc.this.C.a($$0x -> this.e.a(ftu.a(wy.a("selectWorld.targetFolder", wy.b($$0x.c()).a(n.u)))));
         gdc.this.b(this.e);
         $$0.a(fvt.a(gdc.this.p, this.e, gdc.v), $$0.b().b());
         fsq<gdo.a> $$2 = $$0.a(fsq.<gdo.a>a($$0x -> $$0x.f).a(gdo.a.a, gdo.a.b, gdo.a.c).a(0, 0, 210, 20, gdc.u, ($$0x, $$1x) -> gdc.this.C.a($$1x)), $$1);
         gdc.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(ftu.a($$1x.d().a()));
         });
         fsq<bua> $$3 = $$0.a(fsq.a(bua::b).a(bua.values()).a(0, 0, 210, 20, wy.c("options.difficulty"), ($$0x, $$1x) -> gdc.this.C.a($$1x)), $$1);
         gdc.this.C.a($$1x -> {
            $$3.a(gdc.this.C.e());
            $$3.j = !gdc.this.C.f();
            $$3.a(ftu.a(gdc.this.C.e().d()));
         });
         fsq<Boolean> $$4 = $$0.a(fsq.e().a($$0x -> ftu.a(gdc.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> gdc.this.C.a($$1x)));
         gdc.this.C.a($$1x -> {
            $$4.a(gdc.this.C.g());
            $$4.j = !gdc.this.C.l() && !gdc.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fsj.a(gdc.w, $$0x -> gdc.this.a(gdc.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends ful {
      private static final wy c = wy.c("createWorld.tab.more.title");
      private static final wy d = wy.c("selectWorld.gameRules");
      private static final wy e = wy.c("selectWorld.dataPacks");

      b() {
         super(c);
         fvw.b $$0 = this.a.b(8).d(1);
         $$0.a(fsj.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fsj.a(gdc.w, $$0x -> gdc.this.a(gdc.this.C.k().h())).a(210).a());
         $$0.a(fsj.a(e, $$0x -> gdc.this.b(gdc.this.C.k().h())).a(210).a());
      }

      private void b() {
         gdc.this.m.a(new gde(gdc.this.C.q().a(gdc.this.C.k().h().b()), $$0 -> {
            gdc.this.m.a(gdc.this);
            $$0.ifPresent(gdc.this.C::a);
         }));
      }
   }

   class c extends ful {
      private static final wy c = wy.c("createWorld.tab.world.title");
      private static final wy d = wy.c("generator.minecraft.amplified.info");
      private static final wy e = wy.c("selectWorld.mapFeatures");
      private static final wy f = wy.c("selectWorld.mapFeatures.info");
      private static final wy g = wy.c("selectWorld.bonusItems");
      private static final wy h = wy.c("selectWorld.enterSeed");
      static final wy i = wy.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fss k;
      private final fsj l;

      c() {
         super(c);
         fvw.b $$0 = this.a.a(10).b(8).d(2);
         fsq<gdo.b> $$1 = $$0.a(
            fsq.<gdo.b>a(gdo.b::a).a(this.c()).a(gdc.c::a).a(0, 0, 150, 20, wy.c("selectWorld.mapType"), ($$0x, $$1x) -> gdc.this.C.a($$1x))
         );
         $$1.a(gdc.this.C.m());
         gdc.this.C.a($$1x -> {
            gdo.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(ftu.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = gdc.this.C.m().c() != null;
         });
         this.l = $$0.a(fsj.a(wy.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         gdc.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fss(gdc.this.p, 308, 20, wy.c("selectWorld.enterSeed")) {
            @Override
            protected xm d() {
               return super.d().b(wx.t).b(gdc.c.i);
            }
         };
         this.k.c(i);
         this.k.a(gdc.this.C.h());
         this.k.b($$0x -> gdc.this.C.b(this.k.a()));
         $$0.a(fvt.a(gdc.this.p, this.k, h), 2);
         gdl.a $$2 = gdl.a(310);
         $$2.a(e, gdc.this.C::i, gdc.this.C::b).a(() -> !gdc.this.C.l()).a(f);
         $$2.a(g, gdc.this.C::j, gdc.this.C::c).a(() -> !gdc.this.C.f() && !gdc.this.C.l());
         gdl $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         gdc.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         gdj $$0 = gdc.this.C.n();
         if ($$0 != null) {
            gdc.this.m.a($$0.createEditScreen(gdc.this, gdc.this.C.k()));
         }
      }

      private fsq.c<gdo.b> c() {
         return new fsq.c<gdo.b>() {
            @Override
            public List<gdo.b> a() {
               return fsq.a.getAsBoolean() ? gdc.this.C.p() : gdc.this.C.o();
            }

            @Override
            public List<gdo.b> b() {
               return gdc.this.C.o();
            }
         };
      }

      private static xm a(fsq<gdo.b> $$0) {
         return $$0.a().b() ? wx.a($$0.c(), d) : $$0.c();
      }
   }
}
