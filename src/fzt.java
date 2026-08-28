import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fzt {
   private static final wo a = wo.c("selectWorld.newWorld");
   private final List<Consumer<fzt>> b = new ArrayList<>();
   private String c = a.getString();
   private fzt.a d = fzt.a.a;
   private bsf e = bsf.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fzr l;
   private fzt.b m;
   private final List<fzt.b> n = new ArrayList<>();
   private final List<fzt.b> o = new ArrayList<>();
   private dgc p;

   public fzt(Path $$0, fzr $$1, Optional<akt<emz>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fzt.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new dgc($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<dgc.a>a($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(mc.aQ).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((ell)$$0x.a()).b())
         .ifPresent($$0x -> this.a(fzo.a($$0x)));
   }

   public void a(Consumer<fzt> $$0) {
      this.b.add($$0);
   }

   public void a() {
      boolean $$0 = this.j();
      if ($$0 != this.l.c().e()) {
         this.l = this.l.a($$1x -> $$1x.a($$0));
      }

      boolean $$1 = this.i();
      if ($$1 != this.l.c().d()) {
         this.l = this.l.a($$1x -> $$1x.b($$1));
      }

      for (Consumer<fzt> $$2 : this.b) {
         $$2.accept(this);
      }
   }

   public void a(String $$0) {
      this.c = $$0;
      this.k = this.c($$0);
      this.a();
   }

   private String c(String $$0) {
      String $$1 = $$0.trim();

      try {
         return v.a(this.j, !$$1.isEmpty() ? $$1 : a.getString(), "");
      } catch (Exception var5) {
         try {
            return v.a(this.j, "World", "");
         } catch (IOException var4) {
            throw new RuntimeException("Could not create save folder", var4);
         }
      }
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.k;
   }

   public void a(fzt.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fzt.a d() {
      return this.l() ? fzt.a.d : this.d;
   }

   public void a(bsf $$0) {
      this.e = $$0;
      this.a();
   }

   public bsf e() {
      return this.f() ? bsf.d : this.e;
   }

   public boolean f() {
      return this.d() == fzt.a.b;
   }

   public void a(boolean $$0) {
      this.f = $$0;
      this.a();
   }

   public boolean g() {
      if (this.l()) {
         return true;
      } else if (this.f()) {
         return false;
      } else {
         return this.f == null ? this.d() == fzt.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(edo.a(this.h())));
      this.a();
   }

   public String h() {
      return this.g;
   }

   public void b(boolean $$0) {
      this.h = $$0;
      this.a();
   }

   public boolean i() {
      return this.l() ? false : this.h;
   }

   public void c(boolean $$0) {
      this.i = $$0;
      this.a();
   }

   public boolean j() {
      return !this.l() && !this.f() ? this.i : false;
   }

   public void a(fzr $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fzr k() {
      return this.l;
   }

   public void a(fzr.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dhd $$0) {
      dhd $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fzr(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fzt.b $$0) {
      this.m = $$0;
      jr<emz> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fzt.b m() {
      return this.m;
   }

   @Nullable
   public fzo n() {
      jr<emz> $$0 = this.m().c();
      return $$0 != null ? fzo.a.get($$0.e()) : null;
   }

   public List<fzt.b> o() {
      return this.n;
   }

   public List<fzt.b> p() {
      return this.o;
   }

   private void r() {
      ke<emz> $$0 = this.k().a().e(mc.bb);
      this.n.clear();
      this.n.addAll(a($$0, axh.a).orElseGet(() -> $$0.c().map(fzt.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axh.b).orElse(this.n));
      jr<emz> $$1 = this.m.c();
      if ($$1 != null) {
         fzt.b $$2 = a(this.k(), $$1.e()).map(fzt.b::new).orElse(this.n.getFirst());
         boolean $$3 = fzo.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<jr<emz>> a(fzr $$0, Optional<akt<emz>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().e(mc.bb).a($$1x));
   }

   private static Optional<List<fzt.b>> a(ke<emz> $$0, axe<emz> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(fzt.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dgc $$0) {
      this.p = $$0;
      this.a();
   }

   public dgc q() {
      return this.p;
   }

   public static enum a {
      a("survival", dgd.a),
      b("hardcore", dgd.a),
      c("creative", dgd.b),
      d("spectator", dgd.d);

      public final dgd e;
      public final wo f;
      private final wo g;

      private a(final String $$0, final dgd $$1) {
         this.e = $$1;
         this.f = wo.c("selectWorld.gameMode." + $$0);
         this.g = wo.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wo a() {
         return this.g;
      }
   }

   public static record b(@Nullable jr<emz> a) {
      private static final wo b = wo.c("generator.custom");

      public wo a() {
         return Optional.ofNullable(this.a).flatMap(jr::e).map($$0 -> wo.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jr::e).filter($$0 -> $$0.equals(ena.d)).isPresent();
      }

      @Nullable
      public jr<emz> c() {
         return this.a;
      }
   }
}
