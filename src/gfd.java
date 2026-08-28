import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gfd {
   private static final xg a = xg.c("selectWorld.newWorld");
   private final List<Consumer<gfd>> b = new ArrayList<>();
   private String c = a.getString();
   private gfd.a d = gfd.a.a;
   private buz e = buz.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private gfb l;
   private gfd.b m;
   private final List<gfd.b> n = new ArrayList<>();
   private final List<gfd.b> o = new ArrayList<>();
   private dkf p;

   public gfd(Path $$0, gfb $$1, Optional<alq<esc>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new gfd.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new dkf($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<dkf.a>b($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(mi.aS).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((eqo)$$0x.a()).b())
         .ifPresent($$0x -> this.a(gey.a($$0x)));
   }

   public void a(Consumer<gfd> $$0) {
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

      for (Consumer<gfd> $$2 : this.b) {
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
         return w.a(this.j, !$$1.isEmpty() ? $$1 : a.getString(), "");
      } catch (Exception var5) {
         try {
            return w.a(this.j, "World", "");
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

   public void a(gfd.a $$0) {
      this.d = $$0;
      this.a();
   }

   public gfd.a d() {
      return this.l() ? gfd.a.d : this.d;
   }

   public void a(buz $$0) {
      this.e = $$0;
      this.a();
   }

   public buz e() {
      return this.f() ? buz.d : this.e;
   }

   public boolean f() {
      return this.d() == gfd.a.b;
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
         return this.f == null ? this.d() == gfd.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(ein.a(this.h())));
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

   public void a(gfb $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public gfb k() {
      return this.l;
   }

   public void a(gfb.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dlh $$0) {
      dlh $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new gfb(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(gfd.b $$0) {
      this.m = $$0;
      jg<esc> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public gfd.b m() {
      return this.m;
   }

   @Nullable
   public gey n() {
      jg<esc> $$0 = this.m().c();
      return $$0 != null ? gey.a.get($$0.e()) : null;
   }

   public List<gfd.b> o() {
      return this.n;
   }

   public List<gfd.b> p() {
      return this.o;
   }

   private void r() {
      jt<esc> $$0 = this.k().a().f(mi.bo);
      this.n.clear();
      this.n.addAll(a($$0, ayf.a).orElseGet(() -> $$0.c().map(gfd.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, ayf.b).orElse(this.n));
      jg<esc> $$1 = this.m.c();
      if ($$1 != null) {
         gfd.b $$2 = a(this.k(), $$1.e()).map(gfd.b::new).orElse(this.n.getFirst());
         boolean $$3 = gey.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<jg<esc>> a(gfb $$0, Optional<alq<esc>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().f(mi.bo).a($$1x));
   }

   private static Optional<List<gfd.b>> a(jt<esc> $$0, ayc<esc> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(gfd.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dkf $$0) {
      this.p = $$0;
      this.a();
   }

   public dkf q() {
      return this.p;
   }

   public static enum a {
      a("survival", dkg.a),
      b("hardcore", dkg.a),
      c("creative", dkg.b),
      d("spectator", dkg.d);

      public final dkg e;
      public final xg f;
      private final xg g;

      private a(final String $$0, final dkg $$1) {
         this.e = $$1;
         this.f = xg.c("selectWorld.gameMode." + $$0);
         this.g = xg.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xg a() {
         return this.g;
      }
   }

   public static record b(@Nullable jg<esc> a) {
      private static final xg b = xg.c("generator.custom");

      public xg a() {
         return Optional.ofNullable(this.a).flatMap(jg::e).map($$0 -> xg.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jg::e).filter($$0 -> $$0.equals(esd.d)).isPresent();
      }

      @Nullable
      public jg<esc> c() {
         return this.a;
      }
   }
}
