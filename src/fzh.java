import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fzh {
   private static final xv a = xv.c("selectWorld.newWorld");
   private final List<Consumer<fzh>> b = new ArrayList<>();
   private String c = a.getString();
   private fzh.a d = fzh.a.a;
   private btf e = btf.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fzf l;
   private fzh.b m;
   private final List<fzh.b> n = new ArrayList<>();
   private final List<fzh.b> o = new ArrayList<>();
   private dhd p;

   public fzh(Path $$0, fzf $$1, Optional<aly<eny>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fzh.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new dhd($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<dhd.a>a($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(mb.aQ).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((emk)$$0x.a()).b())
         .ifPresent($$0x -> this.a(fzc.a($$0x)));
   }

   public void a(Consumer<fzh> $$0) {
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

      for (Consumer<fzh> $$2 : this.b) {
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

   public void a(fzh.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fzh.a d() {
      return this.l() ? fzh.a.d : this.d;
   }

   public void a(btf $$0) {
      this.e = $$0;
      this.a();
   }

   public btf e() {
      return this.f() ? btf.d : this.e;
   }

   public boolean f() {
      return this.d() == fzh.a.b;
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
         return this.f == null ? this.d() == fzh.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(een.a(this.h())));
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

   public void a(fzf $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fzf k() {
      return this.l;
   }

   public void a(fzf.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(die $$0) {
      die $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fzf(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fzh.b $$0) {
      this.m = $$0;
      jq<eny> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fzh.b m() {
      return this.m;
   }

   @Nullable
   public fzc n() {
      jq<eny> $$0 = this.m().c();
      return $$0 != null ? fzc.a.get($$0.e()) : null;
   }

   public List<fzh.b> o() {
      return this.n;
   }

   public List<fzh.b> p() {
      return this.o;
   }

   private void r() {
      kd<eny> $$0 = this.k().a().e(mb.bb);
      this.n.clear();
      this.n.addAll(a($$0, ayn.a).orElseGet(() -> $$0.c().map(fzh.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, ayn.b).orElse(this.n));
      jq<eny> $$1 = this.m.c();
      if ($$1 != null) {
         fzh.b $$2 = a(this.k(), $$1.e()).map(fzh.b::new).orElse(this.n.getFirst());
         boolean $$3 = fzc.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<jq<eny>> a(fzf $$0, Optional<aly<eny>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().e(mb.bb).a($$1x));
   }

   private static Optional<List<fzh.b>> a(kd<eny> $$0, ayk<eny> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(fzh.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dhd $$0) {
      this.p = $$0;
      this.a();
   }

   public dhd q() {
      return this.p;
   }

   public static enum a {
      a("survival", dhe.a),
      b("hardcore", dhe.a),
      c("creative", dhe.b),
      d("spectator", dhe.d);

      public final dhe e;
      public final xv f;
      private final xv g;

      private a(final String $$0, final dhe $$1) {
         this.e = $$1;
         this.f = xv.c("selectWorld.gameMode." + $$0);
         this.g = xv.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xv a() {
         return this.g;
      }
   }

   public static record b(@Nullable jq<eny> a) {
      private static final xv b = xv.c("generator.custom");

      public xv a() {
         return Optional.ofNullable(this.a).flatMap(jq::e).map($$0 -> xv.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jq::e).filter($$0 -> $$0.equals(enz.d)).isPresent();
      }

      @Nullable
      public jq<eny> c() {
         return this.a;
      }
   }
}
