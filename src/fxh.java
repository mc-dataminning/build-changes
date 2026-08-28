import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fxh {
   private static final xj a = xj.c("selectWorld.newWorld");
   private final List<Consumer<fxh>> b = new ArrayList<>();
   private String c = a.getString();
   private fxh.a d = fxh.a.a;
   private bsh e = bsh.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fxf l;
   private fxh.b m;
   private final List<fxh.b> n = new ArrayList<>();
   private final List<fxh.b> o = new ArrayList<>();
   private dfi p;

   public fxh(Path $$0, fxf $$1, Optional<ali<elx>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fxh.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new dfi($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<dfi.a>a($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(ma.aO).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((ekj)$$0x.a()).b())
         .ifPresent($$0x -> this.a(fxc.a($$0x)));
   }

   public void a(Consumer<fxh> $$0) {
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

      for (Consumer<fxh> $$2 : this.b) {
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

   public void a(fxh.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fxh.a d() {
      return this.l() ? fxh.a.d : this.d;
   }

   public void a(bsh $$0) {
      this.e = $$0;
      this.a();
   }

   public bsh e() {
      return this.f() ? bsh.d : this.e;
   }

   public boolean f() {
      return this.d() == fxh.a.b;
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
         return this.f == null ? this.d() == fxh.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(eco.a(this.h())));
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

   public void a(fxf $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fxf k() {
      return this.l;
   }

   public void a(fxf.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dgj $$0) {
      dgj $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fxf(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fxh.b $$0) {
      this.m = $$0;
      jq<elx> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fxh.b m() {
      return this.m;
   }

   @Nullable
   public fxc n() {
      jq<elx> $$0 = this.m().c();
      return $$0 != null ? fxc.a.get($$0.e()) : null;
   }

   public List<fxh.b> o() {
      return this.n;
   }

   public List<fxh.b> p() {
      return this.o;
   }

   private void r() {
      kd<elx> $$0 = this.k().a().e(ma.aZ);
      this.n.clear();
      this.n.addAll(a($$0, axv.a).orElseGet(() -> $$0.c().map(fxh.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axv.b).orElse(this.n));
      jq<elx> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fxh.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<jq<elx>> a(fxf $$0, Optional<ali<elx>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().e(ma.aZ).a($$1x));
   }

   private static Optional<List<fxh.b>> a(kd<elx> $$0, axs<elx> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(fxh.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dfi $$0) {
      this.p = $$0;
      this.a();
   }

   public dfi q() {
      return this.p;
   }

   public static enum a {
      a("survival", dfj.a),
      b("hardcore", dfj.a),
      c("creative", dfj.b),
      d("spectator", dfj.d);

      public final dfj e;
      public final xj f;
      private final xj g;

      private a(final String $$0, final dfj $$1) {
         this.e = $$1;
         this.f = xj.c("selectWorld.gameMode." + $$0);
         this.g = xj.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xj a() {
         return this.g;
      }
   }

   public static record b(@Nullable jq<elx> a) {
      private static final xj b = xj.c("generator.custom");

      public xj a() {
         return Optional.ofNullable(this.a).flatMap(jq::e).map($$0 -> xj.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jq::e).filter($$0 -> $$0.equals(ely.d)).isPresent();
      }

      @Nullable
      public jq<elx> c() {
         return this.a;
      }
   }
}
