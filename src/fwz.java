import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fwz {
   private static final xl a = xl.c("selectWorld.newWorld");
   private final List<Consumer<fwz>> b = new ArrayList<>();
   private String c = a.getString();
   private fwz.a d = fwz.a.a;
   private bse e = bse.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fwx l;
   private fwz.b m;
   private final List<fwz.b> n = new ArrayList<>();
   private final List<fwz.b> o = new ArrayList<>();
   private dfb p;

   public fwz(Path $$0, fwx $$1, Optional<alk<elq>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fwz.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new dfb($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<dfb.a>a($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(ma.aO).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((ekc)$$0x.a()).b())
         .ifPresent($$0x -> this.a(fwu.a($$0x)));
   }

   public void a(Consumer<fwz> $$0) {
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

      for (Consumer<fwz> $$2 : this.b) {
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

   public void a(fwz.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fwz.a d() {
      return this.l() ? fwz.a.d : this.d;
   }

   public void a(bse $$0) {
      this.e = $$0;
      this.a();
   }

   public bse e() {
      return this.f() ? bse.d : this.e;
   }

   public boolean f() {
      return this.d() == fwz.a.b;
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
         return this.f == null ? this.d() == fwz.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(ech.a(this.h())));
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

   public void a(fwx $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fwx k() {
      return this.l;
   }

   public void a(fwx.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dgc $$0) {
      dgc $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fwx(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fwz.b $$0) {
      this.m = $$0;
      jq<elq> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fwz.b m() {
      return this.m;
   }

   @Nullable
   public fwu n() {
      jq<elq> $$0 = this.m().c();
      return $$0 != null ? fwu.a.get($$0.e()) : null;
   }

   public List<fwz.b> o() {
      return this.n;
   }

   public List<fwz.b> p() {
      return this.o;
   }

   private void r() {
      kd<elq> $$0 = this.k().a().e(ma.aZ);
      this.n.clear();
      this.n.addAll(a($$0, axw.a).orElseGet(() -> $$0.c().map(fwz.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axw.b).orElse(this.n));
      jq<elq> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fwz.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<jq<elq>> a(fwx $$0, Optional<alk<elq>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().e(ma.aZ).a($$1x));
   }

   private static Optional<List<fwz.b>> a(kd<elq> $$0, axt<elq> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(fwz.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dfb $$0) {
      this.p = $$0;
      this.a();
   }

   public dfb q() {
      return this.p;
   }

   public static enum a {
      a("survival", dfc.a),
      b("hardcore", dfc.a),
      c("creative", dfc.b),
      d("spectator", dfc.d);

      public final dfc e;
      public final xl f;
      private final xl g;

      private a(final String $$0, final dfc $$1) {
         this.e = $$1;
         this.f = xl.c("selectWorld.gameMode." + $$0);
         this.g = xl.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xl a() {
         return this.g;
      }
   }

   public static record b(@Nullable jq<elq> a) {
      private static final xl b = xl.c("generator.custom");

      public xl a() {
         return Optional.ofNullable(this.a).flatMap(jq::e).map($$0 -> xl.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jq::e).filter($$0 -> $$0.equals(elr.d)).isPresent();
      }

      @Nullable
      public jq<elq> c() {
         return this.a;
      }
   }
}
