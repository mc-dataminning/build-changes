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

public class fvp extends fqs {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final xh u = xh.c("selectWorld.gameMode");
   static final xh v = xh.c("selectWorld.enterName");
   static final xh w = xh.c("selectWorld.experiments");
   static final xh x = xh.c("selectWorld.allowCommands.info");
   private static final xh y = xh.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final alh a = alh.b("textures/gui/tab_header_background.png");
   private final fon B = new fon(this);
   final fvy C;
   private final fnd D = new fnd(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final eyx F;
   @Nullable
   private final fqs G;
   @Nullable
   private Path H;
   @Nullable
   private auk I;
   @Nullable
   private fne J;

   public static void a(fja $$0, @Nullable fqs $$1) {
      a($$0, y);
      auk $$2 = new auk(new aun($$0.bg()));
      amf.c $$3 = a($$2, dfr.c);
      CompletableFuture<fvx> $$4 = amf.a(
         $$3, $$0x -> new amf.b<>(new fvp.a(new ebv(ebx.a(), elh.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fvx($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ad.g(), $$0
      );
      $$0.b($$4::isDone);
      $$0.a(new fvp($$0, $$1, $$4.join(), Optional.of(elh.a), OptionalLong.empty()));
   }

   public static fvp a(fja $$0, @Nullable fqs $$1, dez $$2, fvx $$3, @Nullable Path $$4) {
      fvp $$5 = new fvp($$0, $$1, $$3, elh.a($$3.e()), OptionalLong.of($$3.c().b()));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(fvy.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(fvy.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(fvy.a.c);
      }

      $$5.H = $$4;
      return $$5;
   }

   private fvp(fja $$0, @Nullable fqs $$1, fvx $$2, Optional<alg<elg>> $$3, OptionalLong $$4) {
      super(xh.c("selectWorld.create"));
      this.G = $$1;
      this.F = $$0.bg();
      this.C = new fvy($$0.m().c(), $$2, $$3, $$4);
   }

   public fvy m() {
      return this.C;
   }

   @Override
   protected void aS_() {
      this.J = fne.a(this.D, this.n).a(new fvp.b(), new fvp.d(), new fvp.c()).a();
      this.c(this.J);
      fos $$0 = this.B.b(fos.e().a(8));
      $$0.a(fkz.a(xh.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(fkz.a(xg.e, $$0x -> this.D()).a());
      this.B.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.J.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aH_() {
   }

   @Override
   public void c() {
      if (this.J != null) {
         this.J.a(this.n);
         this.J.b();
         int $$0 = this.J.H().c();
         fph $$1 = new fph(0, $$0, this.n, this.o - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fja $$0, xh $$1) {
      $$0.d(new fqd($$1));
   }

   private void E() {
      fvx $$0 = this.C.k();
      ebu.b $$1 = $$0.e().a($$0.d());
      jw<alq> $$2 = $$0.f().a(alq.c, $$1.b());
      Lifecycle $$3 = crc.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().c();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      fvz.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eto.a $$0, jw<alq> $$1, Lifecycle $$2) {
      a(this.m, y);
      Optional<etk.c> $$3 = this.J();
      if (!$$3.isEmpty()) {
         this.G();
         boolean $$4 = $$0 == eto.a.c;
         fvx $$5 = this.C.k();
         dez $$6 = this.c($$4);
         etq $$7 = new eto($$6, $$5.c(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private dez c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         der $$2 = new der(dfr.c.b());
         $$2.a(der.l).a(false, null);
         return new dez($$1, des.d, false, brv.a, true, $$2, dfr.c);
      } else {
         return new dez($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
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
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gig::B, fqs.i, 0, this.o - this.B.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
   }

   @Override
   protected void a(fkm $$0) {
      $$0.a(gig::B, a, 0, 0, 0.0F, 0.0F, this.n, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.n, this.o);
   }

   @Override
   protected <T extends fmw & fov> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fmw & fmc & fov> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path F() {
      if (this.H == null) {
         try {
            this.H = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fni.c(this.m, this.C.c());
            this.D();
         }
      }

      return this.H;
   }

   void a(dfr $$0) {
      Pair<Path, auk> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fvs(this, (auk)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dfr $$0) {
      Pair<Path, auk> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fuh((auk)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xh.c("dataPack.title")));
      }
   }

   private void a(auk $$0, boolean $$1, Consumer<dfr> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dfr $$5 = new dfr(new dei($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.m.a(this);
      } else {
         cra $$6 = $$0.f();
         if (crc.a($$6) && $$1) {
            this.m.a(new fvo($$0.g(), $$3x -> {
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

   private void a(auk $$0, dfr $$1, Consumer<dfr> $$2) {
      this.m.d(new fqd(xh.c("dataPack.validation.working")));
      amf.c $$3 = a($$0, $$1);
      amf.<fvp.a, fvx>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(ly.aZ).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(ly.aG).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fvx $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = ebv.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  ebv $$5 = (ebv)$$3x.flatMap($$1xx -> ebv.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amf.b<>(new fvp.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fvx($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.m.a(new fpq($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(dfr.c);
                  }
               }, xh.c("dataPack.validation.failed"), xg.a, xh.c("dataPack.validation.back"), xh.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amf.c a(auk $$0, dfr $$1) {
      amf.d $$2 = new amf.d($$0, $$1, false, true);
      return new amf.c($$2, ew.a.c, 2);
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

   private Optional<etk.c> J() {
      String $$0 = this.C.c();

      try {
         etk.c $$1 = this.m.m().e($$0);
         if (this.H == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.H)) {
               Path $$3 = $$1.a(eti.j);
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

      fni.c(this.m, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fja $$1) {
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
         fni.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, auk> c(dfr $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.I == null) {
            this.I = aun.a($$1, this.F);
            this.I.a();
         }

         this.I.b($$0.a().a());
         return Pair.of($$1, this.I);
      } else {
         return null;
      }
   }

   static record a(ebv a, dfr b) {
   }

   class b extends fnb {
      private static final xh c = xh.c("createWorld.tab.game.title");
      private static final xh d = xh.c("selectWorld.allowCommands");
      private final fli e;

      b() {
         super(c);
         fom.b $$0 = this.a.b(8).d(1);
         foq $$1 = $$0.b();
         this.e = new fli(fvp.this.p, 208, 20, xh.c("selectWorld.enterName"));
         this.e.a(fvp.this.C.b());
         this.e.b(fvp.this.C::a);
         fvp.this.C.a($$0x -> this.e.a(fmk.a(xh.a("selectWorld.targetFolder", xh.b($$0x.c()).a(n.u)))));
         fvp.this.b(this.e);
         $$0.a(foj.a(fvp.this.p, this.e, fvp.v), $$0.b().b());
         flg<fvy.a> $$2 = $$0.a(flg.<fvy.a>a($$0x -> $$0x.f).a(fvy.a.a, fvy.a.b, fvy.a.c).a(0, 0, 210, 20, fvp.u, ($$0x, $$1x) -> fvp.this.C.a($$1x)), $$1);
         fvp.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fmk.a($$1x.d().a()));
         });
         flg<brv> $$3 = $$0.a(flg.a(brv::b).a(brv.values()).a(0, 0, 210, 20, xh.c("options.difficulty"), ($$0x, $$1x) -> fvp.this.C.a($$1x)), $$1);
         fvp.this.C.a($$1x -> {
            $$3.a(fvp.this.C.e());
            $$3.j = !fvp.this.C.f();
            $$3.a(fmk.a(fvp.this.C.e().d()));
         });
         flg<Boolean> $$4 = $$0.a(flg.e().a($$0x -> fmk.a(fvp.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fvp.this.C.a($$1x)));
         fvp.this.C.a($$1x -> {
            $$4.a(fvp.this.C.g());
            $$4.j = !fvp.this.C.l() && !fvp.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fkz.a(fvp.w, $$0x -> fvp.this.a(fvp.this.C.k().h())).a(210).a());
         }
      }
   }

   class c extends fnb {
      private static final xh c = xh.c("createWorld.tab.more.title");
      private static final xh d = xh.c("selectWorld.gameRules");
      private static final xh e = xh.c("selectWorld.dataPacks");

      c() {
         super(c);
         fom.b $$0 = this.a.b(8).d(1);
         $$0.a(fkz.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fkz.a(fvp.w, $$0x -> fvp.this.a(fvp.this.C.k().h())).a(210).a());
         $$0.a(fkz.a(e, $$0x -> fvp.this.b(fvp.this.C.k().h())).a(210).a());
      }

      private void b() {
         fvp.this.m.a(new fvq(fvp.this.C.q().a(fvp.this.C.k().h().b()), $$0 -> {
            fvp.this.m.a(fvp.this);
            $$0.ifPresent(fvp.this.C::a);
         }));
      }
   }

   class d extends fnb {
      private static final xh c = xh.c("createWorld.tab.world.title");
      private static final xh d = xh.c("generator.minecraft.amplified.info");
      private static final xh e = xh.c("selectWorld.mapFeatures");
      private static final xh f = xh.c("selectWorld.mapFeatures.info");
      private static final xh g = xh.c("selectWorld.bonusItems");
      private static final xh h = xh.c("selectWorld.enterSeed");
      static final xh i = xh.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fli k;
      private final fkz l;

      d() {
         super(c);
         fom.b $$0 = this.a.a(10).b(8).d(2);
         flg<fvy.b> $$1 = $$0.a(
            flg.<fvy.b>a(fvy.b::a).a(this.c()).a(fvp.d::a).a(0, 0, 150, 20, xh.c("selectWorld.mapType"), ($$0x, $$1x) -> fvp.this.C.a($$1x))
         );
         $$1.a(fvp.this.C.m());
         fvp.this.C.a($$1x -> {
            fvy.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fmk.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fvp.this.C.m().c() != null;
         });
         this.l = $$0.a(fkz.a(xh.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fvp.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fli(fvp.this.p, 308, 20, xh.c("selectWorld.enterSeed")) {
            @Override
            protected xv aP_() {
               return super.aP_().b(xg.t).b(fvp.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fvp.this.C.h());
         this.k.b($$0x -> fvp.this.C.b(this.k.a()));
         $$0.a(foj.a(fvp.this.p, this.k, h), 2);
         fvw.a $$2 = fvw.a(310);
         $$2.a(e, fvp.this.C::i, fvp.this.C::b).a(() -> !fvp.this.C.l()).a(f);
         $$2.a(g, fvp.this.C::j, fvp.this.C::c).a(() -> !fvp.this.C.f() && !fvp.this.C.l());
         fvw $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fvp.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fvu $$0 = fvp.this.C.n();
         if ($$0 != null) {
            fvp.this.m.a($$0.createEditScreen(fvp.this, fvp.this.C.k()));
         }
      }

      private flg.c<fvy.b> c() {
         return new flg.c<fvy.b>() {
            @Override
            public List<fvy.b> a() {
               return flg.a.getAsBoolean() ? fvp.this.C.p() : fvp.this.C.o();
            }

            @Override
            public List<fvy.b> b() {
               return fvp.this.C.o();
            }
         };
      }

      private static xv a(flg<fvy.b> $$0) {
         return $$0.a().b() ? xg.a($$0.c(), d) : $$0.c();
      }
   }
}
