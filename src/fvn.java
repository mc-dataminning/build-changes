import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fvn {
   private static final xe a = xe.c("selectWorld.newWorld");
   private final List<Consumer<fvn>> b = new ArrayList<>();
   private String c = a.getString();
   private fvn.a d = fvn.a.a;
   private brp e = brp.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fvm l;
   private fvn.b m;
   private final List<fvn.b> n = new ArrayList<>();
   private final List<fvn.b> o = new ArrayList<>();
   private def p;

   public fvn(Path $$0, fvm $$1, Optional<ald<ekv>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fvn.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().c();
      this.i = $$1.c().d();
      this.k = this.c(this.c);
      this.p = new def($$1.h().b());
   }

   public void a(Consumer<fvn> $$0) {
      this.b.add($$0);
   }

   public void a() {
      boolean $$0 = this.j();
      if ($$0 != this.l.c().d()) {
         this.l = this.l.a($$1x -> $$1x.a($$0));
      }

      boolean $$1 = this.i();
      if ($$1 != this.l.c().c()) {
         this.l = this.l.a($$1x -> $$1x.b($$1));
      }

      for (Consumer<fvn> $$2 : this.b) {
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

   public void a(fvn.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fvn.a d() {
      return this.l() ? fvn.a.d : this.d;
   }

   public void a(brp $$0) {
      this.e = $$0;
      this.a();
   }

   public brp e() {
      return this.f() ? brp.d : this.e;
   }

   public boolean f() {
      return this.d() == fvn.a.b;
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
         return this.f == null ? this.d() == fvn.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(ebm.a(this.h())));
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

   public void a(fvm $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fvm k() {
      return this.l;
   }

   public void a(fvm.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dff $$0) {
      dff $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fvm(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fvn.b $$0) {
      this.m = $$0;
      jo<ekv> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fvn.b m() {
      return this.m;
   }

   @Nullable
   public fvj n() {
      jo<ekv> $$0 = this.m().c();
      return $$0 != null ? fvj.a.get($$0.e()) : null;
   }

   public List<fvn.b> o() {
      return this.n;
   }

   public List<fvn.b> p() {
      return this.o;
   }

   private void r() {
      kb<ekv> $$0 = this.k().a().e(lw.ba);
      this.n.clear();
      this.n.addAll(a($$0, axo.a).orElseGet(() -> $$0.c().map(fvn.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axo.b).orElse(this.n));
      jo<ekv> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fvn.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<jo<ekv>> a(fvm $$0, Optional<ald<ekv>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().e(lw.ba).a($$1x));
   }

   private static Optional<List<fvn.b>> a(kb<ekv> $$0, axl<ekv> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(fvn.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(def $$0) {
      this.p = $$0;
      this.a();
   }

   public def q() {
      return this.p;
   }

   public static enum a {
      a("survival", deg.a),
      b("hardcore", deg.a),
      c("creative", deg.b),
      d("spectator", deg.d);

      public final deg e;
      public final xe f;
      private final xe g;

      private a(final String $$0, final deg $$1) {
         this.e = $$1;
         this.f = xe.c("selectWorld.gameMode." + $$0);
         this.g = xe.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xe a() {
         return this.g;
      }
   }

   public static record b(@Nullable jo<ekv> a) {
      private static final xe b = xe.c("generator.custom");

      public xe a() {
         return Optional.ofNullable(this.a).flatMap(jo::e).map($$0 -> xe.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jo::e).filter($$0 -> $$0.equals(ekw.d)).isPresent();
      }

      @Nullable
      public jo<ekv> c() {
         return this.a;
      }
   }
}
