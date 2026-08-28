import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gdo {
   private static final wy a = wy.c("selectWorld.newWorld");
   private final List<Consumer<gdo>> b = new ArrayList<>();
   private String c = a.getString();
   private gdo.a d = gdo.a.a;
   private bua e = bua.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private gdm l;
   private gdo.b m;
   private final List<gdo.b> n = new ArrayList<>();
   private final List<gdo.b> o = new ArrayList<>();
   private diw p;

   public gdo(Path $$0, gdm $$1, Optional<alf<eqq>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new gdo.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new diw($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<diw.a>b($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(mg.aS).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((epc)$$0x.a()).b())
         .ifPresent($$0x -> this.a(gdj.a($$0x)));
   }

   public void a(Consumer<gdo> $$0) {
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

      for (Consumer<gdo> $$2 : this.b) {
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

   public void a(gdo.a $$0) {
      this.d = $$0;
      this.a();
   }

   public gdo.a d() {
      return this.l() ? gdo.a.d : this.d;
   }

   public void a(bua $$0) {
      this.e = $$0;
      this.a();
   }

   public bua e() {
      return this.f() ? bua.d : this.e;
   }

   public boolean f() {
      return this.d() == gdo.a.b;
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
         return this.f == null ? this.d() == gdo.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(ehe.a(this.h())));
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

   public void a(gdm $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public gdm k() {
      return this.l;
   }

   public void a(gdm.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(djy $$0) {
      djy $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new gdm(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(gdo.b $$0) {
      this.m = $$0;
      je<eqq> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public gdo.b m() {
      return this.m;
   }

   @Nullable
   public gdj n() {
      je<eqq> $$0 = this.m().c();
      return $$0 != null ? gdj.a.get($$0.e()) : null;
   }

   public List<gdo.b> o() {
      return this.n;
   }

   public List<gdo.b> p() {
      return this.o;
   }

   private void r() {
      jr<eqq> $$0 = this.k().a().f(mg.bn);
      this.n.clear();
      this.n.addAll(a($$0, axu.a).orElseGet(() -> $$0.c().map(gdo.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axu.b).orElse(this.n));
      je<eqq> $$1 = this.m.c();
      if ($$1 != null) {
         gdo.b $$2 = a(this.k(), $$1.e()).map(gdo.b::new).orElse(this.n.getFirst());
         boolean $$3 = gdj.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<je<eqq>> a(gdm $$0, Optional<alf<eqq>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().f(mg.bn).a($$1x));
   }

   private static Optional<List<gdo.b>> a(jr<eqq> $$0, axr<eqq> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(gdo.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(diw $$0) {
      this.p = $$0;
      this.a();
   }

   public diw q() {
      return this.p;
   }

   public static enum a {
      a("survival", dix.a),
      b("hardcore", dix.a),
      c("creative", dix.b),
      d("spectator", dix.d);

      public final dix e;
      public final wy f;
      private final wy g;

      private a(final String $$0, final dix $$1) {
         this.e = $$1;
         this.f = wy.c("selectWorld.gameMode." + $$0);
         this.g = wy.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wy a() {
         return this.g;
      }
   }

   public static record b(@Nullable je<eqq> a) {
      private static final wy b = wy.c("generator.custom");

      public wy a() {
         return Optional.ofNullable(this.a).flatMap(je::e).map($$0 -> wy.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(je::e).filter($$0 -> $$0.equals(eqr.d)).isPresent();
      }

      @Nullable
      public je<eqq> c() {
         return this.a;
      }
   }
}
