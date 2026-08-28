import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class gcx extends fsm<gcx.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ale m = ale.b("world_list/error_highlighted");
   static final ale n = ale.b("world_list/error");
   static final ale o = ale.b("world_list/marked_join_highlighted");
   static final ale p = ale.b("world_list/marked_join");
   static final ale q = ale.b("world_list/warning_highlighted");
   static final ale r = ale.b("world_list/warning");
   static final ale s = ale.b("world_list/join_highlighted");
   static final ale u = ale.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final ww w = ww.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final ww x = ww.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final ww y = ww.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final ww z = ww.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final ww A = ww.c("selectWorld.locked").a(n.m);
   static final ww B = ww.c("selectWorld.conversion.tooltip").a(n.m);
   static final ww C = ww.c("selectWorld.incompatible.tooltip").a(n.m);
   static final ww D = ww.c("selectWorld.experimental");
   private final gcr E;
   private CompletableFuture<List<eyc>> F;
   @Nullable
   private List<eyc> G;
   private String H;
   private final gcx.b I;

   public gcx(gcr $$0, fof $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable gcx $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new gcx.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.O();
      }

      this.a(this.M());
   }

   @Override
   protected void s() {
      this.aD_().forEach(gcx.a::close);
      super.s();
   }

   @Nullable
   private List<eyc> M() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void N() {
      this.F = this.O();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fvs.a($$0)) {
         Optional<gcx.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hlr.a(awl.Bp, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      List<eyc> $$4 = this.M();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eyc> $$0) {
      if ($$0 == null) {
         this.P();
      } else {
         this.a(this.H, $$0);
      }

      this.G = $$0;
   }

   public void a(String $$0) {
      if (this.G != null && !$$0.equals(this.H)) {
         this.a($$0, this.G);
      }

      this.H = $$0;
   }

   private CompletableFuture<List<eyc>> O() {
      eyb.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (eya var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         gcj.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eyc> $$1) {
      this.s();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eyc $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new gcx.c(this, $$2));
         }
      }

      this.Q();
   }

   private boolean a(String $$0, eyc $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void P() {
      this.s();
      this.b(this.I);
      this.Q();
   }

   private void Q() {
      this.h();
      this.E.d(true);
   }

   private void c(ww $$0) {
      this.c.a(new fwr(ww.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable gcx.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof gcx.c $$1 ? $$1.f : null);
   }

   public Optional<gcx.c> b() {
      gcx.a $$0 = this.p();
      return $$0 instanceof gcx.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public gcr c() {
      return this.E;
   }

   @Override
   public void a(fvn $$0) {
      if (this.aD_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fsm.a<gcx.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gcx.a {
      private static final ww a = ww.c("selectWorld.loading_list");
      private final fof b;

      public b(fof $$0) {
         this.b = $$0;
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = fwx.a(af.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public ww a() {
         return a;
      }
   }

   public final class c extends gcx.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fof d;
      private final gcr e;
      final eyc f;
      private final fws g;
      @Nullable
      private Path h;
      private long i;

      public c(final gcx $$1, final eyc $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = fws.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.k();
         this.m();
      }

      private void k() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<fdn> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     gcx.v.warn("{}", fdl.a(this.h, $$1));
                     this.h = null;
                  } else {
                     $$0 = Files.readAttributes(this.h, BasicFileAttributes.class);
                  }
               }

               if (!$$0.isRegularFile()) {
                  this.h = null;
               }
            } catch (NoSuchFileException var3) {
               this.h = null;
            } catch (IOException var4) {
               gcx.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public ww a() {
         ww $$0 = ww.a("narrator.select.world_info", this.f.b(), ww.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wv.a($$0, gcx.A);
         }

         if (this.f.e()) {
            $$0 = wv.a($$0, gcx.D);
         }

         return ww.a("narrator.select", $$0);
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + gcx.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hjg.a("selectWorld.world") + " " + ($$1 + 1);
         }

         ww $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(gpn::H, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            ale $$16 = $$15 ? gcx.s : gcx.u;
            ale $$17 = $$15 ? gcx.q : gcx.r;
            ale $$18 = $$15 ? gcx.m : gcx.n;
            ale $$19 = $$15 ? gcx.o : gcx.p;
            if (this.f instanceof eyc.c || this.f instanceof eyc.b) {
               $$0.a(gpn::H, $$18, $$3, $$2, 32, 32);
               $$0.a(gpn::H, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gpn::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gcx.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(gpn::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gcx.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(gpn::H, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(gcx.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(gpn::H, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gpn::H, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gcx.w.g(), gcx.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(gpn::H, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(gcx.y.g(), gcx.z.g()));
                  }
               }
            } else {
               $$0.a(gpn::H, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            gcx.this.a((gcx.a)this);
            if (!($$0 - (double)gcx.this.u() <= 32.0) && af.c() - this.i >= 250L) {
               this.i = af.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hlr.a(awl.Bp, 1.0F));
                  this.c();
               }

               return true;
            }
         }
      }

      public boolean b() {
         return this.f.u();
      }

      public void c() {
         if (this.f.u()) {
            if (this.f instanceof eyc.c) {
               this.d.a(fxa.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  gcx.this.N();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fwg($$0 -> {
            if ($$0) {
               this.d.a(new fxf(true));
               this.e();
            }

            this.d.a(this.e);
         }, ww.c("selectWorld.deleteQuestion"), ww.a("selectWorld.deleteWarning", this.f.b()), ww.c("selectWorld.deleteButton"), wv.e));
      }

      public void e() {
         eyb $$0 = this.d.m();
         String $$1 = this.f.a();

         try (eyb.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            ftz.b(this.d, $$1);
            gcx.v.error("Failed to delete world {}", $$1, var8);
         }

         gcx.this.N();
      }

      public void g() {
         this.l();
         String $$0 = this.f.a();

         eyb.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            ftz.a(this.d, $$0);
            gcx.v.error("Failed to access level {}", $$0, var6);
            gcx.this.N();
            return;
         } catch (fdl var7) {
            gcx.v.warn("{}", var7.getMessage());
            this.d.a(fxa.a(() -> this.d.a(this.e)));
            return;
         }

         gcm $$5;
         try {
            $$5 = gcm.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  gcx.this.N();
               }

               this.d.a(this.e);
            });
         } catch (ui | uo | IOException var5) {
            $$1.c();
            ftz.a(this.d, $$0);
            gcx.v.error("Failed to load world data {}", $$0, var5);
            gcx.this.N();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.l();

         try (eyb.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dit, gct> $$1 = this.d.x().a($$0);
            dit $$2 = (dit)$$1.getFirst();
            gct $$3 = (gct)$$1.getSecond();
            Path $$4 = gcj.a($$0.a(exz.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fwg(
                        $$3x -> this.d.a((fxi)($$3x ? gcj.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        ww.c("selectWorld.recreate.customized.title"),
                        ww.c("selectWorld.recreate.customized.text"),
                        wv.i,
                        wv.e
                     )
                  );
            } else {
               this.d.a(gcj.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (fdl var8) {
            gcx.v.warn("{}", var8.getMessage());
            this.d.a(fxa.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            gcx.v.error("Unable to recreate world", var9);
            this.d.a(new fwb(() -> this.d.a(this.e), ww.c("selectWorld.recreate.error.title"), ww.c("selectWorld.recreate.error.text")));
         }
      }

      private void l() {
         this.d.d(new fwt(ww.c("selectWorld.data_read")));
      }

      private void m() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fhq.a($$1));
            } catch (Throwable var7) {
               gcx.v.error("Invalid icon for world {}", this.f.a(), var7);
               this.h = null;
            }
         } else {
            this.g.a();
         }
      }

      @Override
      public void close() {
         this.g.close();
      }

      public String i() {
         return this.f.b();
      }
   }
}
