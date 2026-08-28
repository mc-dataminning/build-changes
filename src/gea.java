import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gea {
   private static final wy a = wy.c("selectWorld.newWorld");
   private final List<Consumer<gea>> b = new ArrayList<>();
   private String c = a.getString();
   private gea.a d = gea.a.a;
   private bud e = bud.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private gdy l;
   private gea.b m;
   private final List<gea.b> n = new ArrayList<>();
   private final List<gea.b> o = new ArrayList<>();
   private djd p;

   public gea(Path $$0, gdy $$1, Optional<alf<eqx>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new gea.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new djd($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<djd.a>b($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(mh.aS).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((epj)$$0x.a()).b())
         .ifPresent($$0x -> this.a(gdv.a($$0x)));
   }

   public void a(Consumer<gea> $$0) {
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

      for (Consumer<gea> $$2 : this.b) {
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

   public void a(gea.a $$0) {
      this.d = $$0;
      this.a();
   }

   public gea.a d() {
      return this.l() ? gea.a.d : this.d;
   }

   public void a(bud $$0) {
      this.e = $$0;
      this.a();
   }

   public bud e() {
      return this.f() ? bud.d : this.e;
   }

   public boolean f() {
      return this.d() == gea.a.b;
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
         return this.f == null ? this.d() == gea.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(ehl.a(this.h())));
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

   public void a(gdy $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public gdy k() {
      return this.l;
   }

   public void a(gdy.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dkf $$0) {
      dkf $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new gdy(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(gea.b $$0) {
      this.m = $$0;
      jf<eqx> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public gea.b m() {
      return this.m;
   }

   @Nullable
   public gdv n() {
      jf<eqx> $$0 = this.m().c();
      return $$0 != null ? gdv.a.get($$0.e()) : null;
   }

   public List<gea.b> o() {
      return this.n;
   }

   public List<gea.b> p() {
      return this.o;
   }

   private void r() {
      js<eqx> $$0 = this.k().a().f(mh.bn);
      this.n.clear();
      this.n.addAll(a($$0, axu.a).orElseGet(() -> $$0.c().map(gea.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axu.b).orElse(this.n));
      jf<eqx> $$1 = this.m.c();
      if ($$1 != null) {
         gea.b $$2 = a(this.k(), $$1.e()).map(gea.b::new).orElse(this.n.getFirst());
         boolean $$3 = gdv.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<jf<eqx>> a(gdy $$0, Optional<alf<eqx>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().f(mh.bn).a($$1x));
   }

   private static Optional<List<gea.b>> a(js<eqx> $$0, axr<eqx> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(gea.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(djd $$0) {
      this.p = $$0;
      this.a();
   }

   public djd q() {
      return this.p;
   }

   public static enum a {
      a("survival", dje.a),
      b("hardcore", dje.a),
      c("creative", dje.b),
      d("spectator", dje.d);

      public final dje e;
      public final wy f;
      private final wy g;

      private a(final String $$0, final dje $$1) {
         this.e = $$1;
         this.f = wy.c("selectWorld.gameMode." + $$0);
         this.g = wy.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wy a() {
         return this.g;
      }
   }

   public static record b(@Nullable jf<eqx> a) {
      private static final wy b = wy.c("generator.custom");

      public wy a() {
         return Optional.ofNullable(this.a).flatMap(jf::e).map($$0 -> wy.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jf::e).filter($$0 -> $$0.equals(eqy.d)).isPresent();
      }

      @Nullable
      public jf<eqx> c() {
         return this.a;
      }
   }
}
