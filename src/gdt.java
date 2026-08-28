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

public class gdt extends fys {
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
   private final fwo B = new fwo(this);
   final gef C;
   private final fve D = new fve($$1x -> {
      fsy var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean E;
   private final fes F;
   private final gds G;
   @Nullable
   private final fys H;
   @Nullable
   private Path I;
   @Nullable
   private aun J;
   @Nullable
   private fvf K;

   public static void a(fpt $$0, @Nullable fys $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (ezn)$$2));
   }

   public static void a(fpt $$0, @Nullable fys $$1, gds $$2) {
      gee $$3 = ($$0x, $$1x, $$2x) -> new ged($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<ame.a, eho> $$4 = $$0x -> new eho(ehq.a(), erd.a($$0x.c()));
      a($$0, $$1, $$4, $$3, erd.a, $$2);
   }

   public static void b(fpt $$0, @Nullable fys $$1) {
      gee $$2 = ($$0x, $$1x, $$2x) -> new ged($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gdy(gef.a.c, Set.of(dji.m, dji.x, dji.f), epp.h));
      Function<ame.a, eho> $$3 = $$0x -> new eho(ehq.b(), erd.c($$0x.c()));
      a($$0, $$1, $$3, $$2, erd.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ezn)$$2x));
   }

   private static void a(fpt $$0, @Nullable fys $$1, Function<ame.a, eho> $$2, gee $$3, alf<erc> $$4, gds $$5) {
      a($$0, y);
      aun $$6 = new aun(new auq($$0.be()));
      dkk $$7 = ac.aV ? new dkk(new diz(List.of("vanilla", "tests"), List.of()), cuy.h) : dkk.d;
      ame.c $$8 = a($$6, $$7);
      CompletableFuture<ged> $$9 = ame.a($$8, $$1x -> new ame.b<>(new gdu($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ag.h(), $$0);
      $$0.b($$9::isDone);
      $$0.a(new gdt($$0, $$1, $$9.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static gdt a(fpt $$0, @Nullable fys $$1, djq $$2, ged $$3, @Nullable Path $$4) {
      gdt $$5 = new gdt($$0, $$1, $$3, erd.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (ezn)$$2x));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(gef.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(gef.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(gef.a.c);
      }

      $$5.I = $$4;
      return $$5;
   }

   private gdt(fpt $$0, @Nullable fys $$1, ged $$2, Optional<alf<erc>> $$3, OptionalLong $$4, gds $$5) {
      super(wy.c("selectWorld.create"));
      this.H = $$1;
      this.F = $$0.be();
      this.G = $$5;
      this.C = new gef($$0.m().c(), $$2, $$3, $$4);
   }

   public gef m() {
      return this.C;
   }

   @Override
   protected void aO_() {
      this.K = fvf.a(this.D, this.n).a(new gdt.a(), new gdt.c(), new gdt.b()).a();
      this.c(this.K);
      fws $$0 = this.B.b(fws.e().a(8));
      $$0.a(fta.a(wy.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fta.a(wx.e, $$0x -> this.E()).a());
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
         fxh $$1 = new fxh(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fpt $$0, wy $$1) {
      $$0.d(new fyd($$1));
   }

   private void F() {
      ged $$0 = this.C.k();
      ehn.b $$1 = $$0.e().a($$0.d());
      jm<alp> $$2 = $$0.f().a(alp.c, $$1.b());
      Lifecycle $$3 = cuy.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      djq $$7 = this.c($$1.d() == ezl.a.c);
      ezl $$8 = new ezl($$7, this.C.k().c(), $$1.d(), $$5);
      geg.a(this.m, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(jm<alp> $$0, ezl $$1) {
      boolean $$2 = this.G.create(this, $$0, $$1, this.I);
      this.H();
      if (!$$2) {
         this.E();
      }
   }

   private boolean a(jm<alp> $$0, ezn $$1) {
      String $$2 = this.C.c();
      ged $$3 = this.C.k();
      a(this.m, y);
      Optional<ezh.c> $$4 = a(this.m, $$2, this.I);
      if ($$4.isEmpty()) {
         fvj.c(this.m, $$2);
         return false;
      } else {
         this.m.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private djq c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dji $$2 = new dji(dkk.d.b());
         $$2.b(dji.m).a(false, null);
         return new djq($$1, djj.d, false, bud.a, true, $$2, dkk.d);
      } else {
         return new djq($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(grc::H, fys.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fsm $$0) {
      $$0.a(grc::H, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Nullable
   private Path G() {
      if (this.I == null) {
         try {
            this.I = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fvj.c(this.m, this.C.c());
            this.E();
         }
      }

      return this.I;
   }

   void a(dkk $$0) {
      Pair<Path, aun> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gdx(this, (aun)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dkk $$0) {
      Pair<Path, aun> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new gck((aun)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wy.c("dataPack.title")));
      }
   }

   private void a(aun $$0, boolean $$1, Consumer<dkk> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dkk $$5 = new dkk(new diz($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cuw $$6 = $$0.f();
         if (cuy.a($$6) && $$1) {
            this.m.a(new gdr($$0.g(), $$3x -> {
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

   private void a(aun $$0, dkk $$1, Consumer<dkk> $$2) {
      this.m.d(new fyd(wy.c("dataPack.validation.working")));
      ame.c $$3 = a($$0, $$1);
      ame.<gdu, ged>a(
            $$3,
            $$0x -> {
               if ($$0x.c().e(mh.bo).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().e(mh.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  ged $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = eho.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  eho $$5 = (eho)$$3x.flatMap($$1xx -> eho.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new ame.b<>(new gdu($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new ged($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ag.h(),
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
               this.m.a(new fxq($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dkk.d);
                  }
               }, wy.c("dataPack.validation.failed"), wx.a, wy.c("dataPack.validation.back"), wy.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static ame.c a(aun $$0, dkk $$1) {
      ame.d $$2 = new ame.d($$0, $$1, false, true);
      return new ame.c($$2, ek.a.c, 2);
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
         ag.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private static Optional<ezh.c> a(fpt $$0, String $$1, @Nullable Path $$2) {
      try {
         ezh.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(ezf.j);
               w.c($$5);
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
   public static Path a(Path $$0, fpt $$1) {
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
         fvj.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aun> c(dkk $$0) {
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

   class a extends fvc {
      private static final wy c = wy.c("createWorld.tab.game.title");
      private static final wy d = wy.c("selectWorld.allowCommands");
      private final ftj e;

      a() {
         super(c);
         fwn.b $$0 = this.a.b(8).d(1);
         fwr $$1 = $$0.b();
         this.e = new ftj(gdt.this.p, 208, 20, wy.c("selectWorld.enterName"));
         this.e.a(gdt.this.C.b());
         this.e.b(gdt.this.C::a);
         gdt.this.C.a($$0x -> this.e.a(ful.a(wy.a("selectWorld.targetFolder", wy.b($$0x.c()).a(o.u)))));
         gdt.this.b(this.e);
         $$0.a(fwk.a(gdt.this.p, this.e, gdt.v), $$0.b().b());
         fth<gef.a> $$2 = $$0.a(fth.<gef.a>a($$0x -> $$0x.f).a(gef.a.a, gef.a.b, gef.a.c).a(0, 0, 210, 20, gdt.u, ($$0x, $$1x) -> gdt.this.C.a($$1x)), $$1);
         gdt.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(ful.a($$1x.d().a()));
         });
         fth<bud> $$3 = $$0.a(fth.a(bud::b).a(bud.values()).a(0, 0, 210, 20, wy.c("options.difficulty"), ($$0x, $$1x) -> gdt.this.C.a($$1x)), $$1);
         gdt.this.C.a($$1x -> {
            $$3.a(gdt.this.C.e());
            $$3.j = !gdt.this.C.f();
            $$3.a(ful.a(gdt.this.C.e().d()));
         });
         fth<Boolean> $$4 = $$0.a(fth.e().a($$0x -> ful.a(gdt.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> gdt.this.C.a($$1x)));
         gdt.this.C.a($$1x -> {
            $$4.a(gdt.this.C.g());
            $$4.j = !gdt.this.C.l() && !gdt.this.C.f();
         });
         if (!ac.b().g()) {
            $$0.a(fta.a(gdt.w, $$0x -> gdt.this.a(gdt.this.C.k().h())).a(210).a());
         }
      }
   }

   class b extends fvc {
      private static final wy c = wy.c("createWorld.tab.more.title");
      private static final wy d = wy.c("selectWorld.gameRules");
      private static final wy e = wy.c("selectWorld.dataPacks");

      b() {
         super(c);
         fwn.b $$0 = this.a.b(8).d(1);
         $$0.a(fta.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fta.a(gdt.w, $$0x -> gdt.this.a(gdt.this.C.k().h())).a(210).a());
         $$0.a(fta.a(e, $$0x -> gdt.this.b(gdt.this.C.k().h())).a(210).a());
      }

      private void b() {
         gdt.this.m.a(new gdv(gdt.this.C.q().a(gdt.this.C.k().h().b()), $$0 -> {
            gdt.this.m.a(gdt.this);
            $$0.ifPresent(gdt.this.C::a);
         }));
      }
   }

   class c extends fvc {
      private static final wy c = wy.c("createWorld.tab.world.title");
      private static final wy d = wy.c("generator.minecraft.amplified.info");
      private static final wy e = wy.c("selectWorld.mapFeatures");
      private static final wy f = wy.c("selectWorld.mapFeatures.info");
      private static final wy g = wy.c("selectWorld.bonusItems");
      private static final wy h = wy.c("selectWorld.enterSeed");
      static final wy i = wy.c("selectWorld.seedInfo").a(o.i);
      private static final int j = 310;
      private final ftj k;
      private final fta l;

      c() {
         super(c);
         fwn.b $$0 = this.a.a(10).b(8).d(2);
         fth<gef.b> $$1 = $$0.a(
            fth.<gef.b>a(gef.b::a).a(this.c()).a(gdt.c::a).a(0, 0, 150, 20, wy.c("selectWorld.mapType"), ($$0x, $$1x) -> gdt.this.C.a($$1x))
         );
         $$1.a(gdt.this.C.m());
         gdt.this.C.a($$1x -> {
            gef.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(ful.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = gdt.this.C.m().c() != null;
         });
         this.l = $$0.a(fta.a(wy.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         gdt.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new ftj(gdt.this.p, 308, 20, wy.c("selectWorld.enterSeed")) {
            @Override
            protected xm d() {
               return super.d().b(wx.t).b(gdt.c.i);
            }
         };
         this.k.c(i);
         this.k.a(gdt.this.C.h());
         this.k.b($$0x -> gdt.this.C.b(this.k.a()));
         $$0.a(fwk.a(gdt.this.p, this.k, h), 2);
         gec.a $$2 = gec.a(310);
         $$2.a(e, gdt.this.C::i, gdt.this.C::b).a(() -> !gdt.this.C.l()).a(f);
         $$2.a(g, gdt.this.C::j, gdt.this.C::c).a(() -> !gdt.this.C.f() && !gdt.this.C.l());
         gec $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         gdt.this.C.a($$1x -> $$3.b());
      }

      private void b() {
         gea $$0 = gdt.this.C.n();
         if ($$0 != null) {
            gdt.this.m.a($$0.createEditScreen(gdt.this, gdt.this.C.k()));
         }
      }

      private fth.c<gef.b> c() {
         return new fth.c<gef.b>() {
            @Override
            public List<gef.b> a() {
               return fth.a.getAsBoolean() ? gdt.this.C.p() : gdt.this.C.o();
            }

            @Override
            public List<gef.b> b() {
               return gdt.this.C.o();
            }
         };
      }

      private static xm a(fth<gef.b> $$0) {
         return $$0.a().b() ? wx.a($$0.c(), d) : $$0.c();
      }
   }
}
