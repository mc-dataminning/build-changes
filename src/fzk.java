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

public class fzk extends fpb<fzk.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alz m = alz.b("world_list/error_highlighted");
   static final alz n = alz.b("world_list/error");
   static final alz o = alz.b("world_list/marked_join_highlighted");
   static final alz p = alz.b("world_list/marked_join");
   static final alz q = alz.b("world_list/warning_highlighted");
   static final alz r = alz.b("world_list/warning");
   static final alz s = alz.b("world_list/join_highlighted");
   static final alz u = alz.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xv w = xv.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xv x = xv.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xv y = xv.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xv z = xv.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xv A = xv.c("selectWorld.locked").a(n.m);
   static final xv B = xv.c("selectWorld.conversion.tooltip").a(n.m);
   static final xv C = xv.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xv D = xv.c("selectWorld.experimental");
   private final fze E;
   private CompletableFuture<List<ewd>> F;
   @Nullable
   private List<ewd> G;
   private String H;
   private final fzk.b I;

   public fzk(fze $$0, fmf $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fzk $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fzk.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.L();
      }

      this.a(this.J());
   }

   @Override
   protected void j() {
      this.aI_().forEach(fzk.a::close);
      super.j();
   }

   @Nullable
   private List<ewd> J() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void K() {
      this.F = this.L();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fsh.a($$0)) {
         Optional<fzk.c> $$3 = this.b();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(hfc.a(axf.AQ, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fnr $$0, int $$1, int $$2, float $$3) {
      List<ewd> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ewd> $$0) {
      if ($$0 == null) {
         this.M();
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

   private CompletableFuture<List<ewd>> L() {
      ewc.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (ewb var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fyw.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ewd> $$1) {
      this.j();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ewd $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fzk.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, ewd $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void M() {
      this.j();
      this.b(this.I);
      this.N();
   }

   private void N() {
      this.o();
      this.E.d(true);
   }

   private void c(xv $$0) {
      this.c.a(new ftg(xv.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable fzk.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fzk.c $$1 ? $$1.f : null);
   }

   public Optional<fzk.c> b() {
      fzk.a $$0 = this.g();
      return $$0 instanceof fzk.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fze c() {
      return this.E;
   }

   @Override
   public void a(fsc $$0) {
      if (this.aI_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fpb.a<fzk.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fzk.a {
      private static final xv a = xv.c("selectWorld.loading_list");
      private final fmf b;

      public b(fmf $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = ftm.a(ae.c());
         int $$13 = (this.b.z.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xv a() {
         return a;
      }
   }

   public final class c extends fzk.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fmf d;
      private final fze e;
      final ewd f;
      private final fth g;
      @Nullable
      private Path h;
      private long i;

      public c(final fzk $$1, final ewd $$2) {
         this.d = $$1.c;
         this.e = $$1.c();
         this.f = $$2;
         this.g = fth.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<fbo> $$1 = this.d.bf().a(this.h);
                  if (!$$1.isEmpty()) {
                     fzk.v.warn("{}", fbm.a(this.h, $$1));
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
               fzk.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xv a() {
         xv $$0 = xv.a("narrator.select.world_info", this.f.b(), xv.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xu.a($$0, fzk.A);
         }

         if (this.f.e()) {
            $$0 = xu.a($$0, fzk.D);
         }

         return xv.a("narrator.select", $$0);
      }

      @Override
      public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fzk.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = hcr.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xv $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         $$0.a(glu::C, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ac().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            alz $$16 = $$15 ? fzk.s : fzk.u;
            alz $$17 = $$15 ? fzk.q : fzk.r;
            alz $$18 = $$15 ? fzk.m : fzk.n;
            alz $$19 = $$15 ? fzk.o : fzk.p;
            if (this.f instanceof ewd.c || this.f instanceof ewd.b) {
               $$0.a(glu::C, $$18, $$3, $$2, 32, 32);
               $$0.a(glu::C, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(glu::C, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fzk.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a(glu::C, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fzk.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a(glu::C, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fzk.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a(glu::C, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(glu::C, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fzk.w.g(), fzk.x.g()));
                  }
               } else if (!ab.b().g()) {
                  $$0.a(glu::C, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fzk.y.g(), fzk.z.g()));
                  }
               }
            } else {
               $$0.a(glu::C, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fzk.this.a((fzk.a)this);
            if (!($$0 - (double)fzk.this.s() <= 32.0) && ae.c() - this.i >= 250L) {
               this.i = ae.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(hfc.a(axf.AQ, 1.0F));
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
            if (this.f instanceof ewd.c) {
               this.d.a(ftp.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fzk.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fsv($$0 -> {
            if ($$0) {
               this.d.a(new ftu(true));
               this.e();
            }

            this.d.a(this.e);
         }, xv.c("selectWorld.deleteQuestion"), xv.a("selectWorld.deleteWarning", this.f.b()), xv.c("selectWorld.deleteButton"), xu.e));
      }

      public void e() {
         ewc $$0 = this.d.m();
         String $$1 = this.f.a();

         try (ewc.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fqo.b(this.d, $$1);
            fzk.v.error("Failed to delete world {}", $$1, var8);
         }

         fzk.this.K();
      }

      public void g() {
         this.k();
         String $$0 = this.f.a();

         ewc.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fqo.a(this.d, $$0);
            fzk.v.error("Failed to access level {}", $$0, var6);
            fzk.this.K();
            return;
         } catch (fbm var7) {
            fzk.v.warn("{}", var7.getMessage());
            this.d.a(ftp.a(() -> this.d.a(this.e)));
            return;
         }

         fyz $$5;
         try {
            $$5 = fyz.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fzk.this.K();
               }

               this.d.a(this.e);
            });
         } catch (vi | vo | IOException var5) {
            $$1.c();
            fqo.a(this.d, $$0);
            fzk.v.error("Failed to load world data {}", $$0, var5);
            fzk.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (ewc.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dhl, fzg> $$1 = this.d.x().a($$0);
            dhl $$2 = (dhl)$$1.getFirst();
            fzg $$3 = (fzg)$$1.getSecond();
            Path $$4 = fyw.a($$0.a(ewa.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new fsv(
                        $$3x -> this.d.a((ftx)($$3x ? fyw.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xv.c("selectWorld.recreate.customized.title"),
                        xv.c("selectWorld.recreate.customized.text"),
                        xu.i,
                        xu.e
                     )
                  );
            } else {
               this.d.a(fyw.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (fbm var8) {
            fzk.v.warn("{}", var8.getMessage());
            this.d.a(ftp.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fzk.v.error("Unable to recreate world", var9);
            this.d.a(new fsq(() -> this.d.a(this.e), xv.c("selectWorld.recreate.error.title"), xv.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fti(xv.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(ffr.a($$1));
            } catch (Throwable var7) {
               fzk.v.error("Invalid icon for world {}", this.f.a(), var7);
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
