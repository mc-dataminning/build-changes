import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fwj {
   private static final xi a = xi.c("selectWorld.newWorld");
   private final List<Consumer<fwj>> b = new ArrayList<>();
   private String c = a.getString();
   private fwj.a d = fwj.a.a;
   private bsa e = bsa.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fwh l;
   private fwj.b m;
   private final List<fwj.b> n = new ArrayList<>();
   private final List<fwj.b> o = new ArrayList<>();
   private dex p;

   public fwj(Path $$0, fwh $$1, Optional<alh<elm>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fwj.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new dex($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<dex.a>a($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(lz.aO).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((ejy)$$0x.a()).b())
         .ifPresent($$0x -> this.a(fwe.a($$0x)));
   }

   public void a(Consumer<fwj> $$0) {
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

      for (Consumer<fwj> $$2 : this.b) {
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

   public void a(fwj.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fwj.a d() {
      return this.l() ? fwj.a.d : this.d;
   }

   public void a(bsa $$0) {
      this.e = $$0;
      this.a();
   }

   public bsa e() {
      return this.f() ? bsa.d : this.e;
   }

   public boolean f() {
      return this.d() == fwj.a.b;
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
         return this.f == null ? this.d() == fwj.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(ecd.a(this.h())));
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

   public void a(fwh $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fwh k() {
      return this.l;
   }

   public void a(fwh.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dfx $$0) {
      dfx $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fwh(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fwj.b $$0) {
      this.m = $$0;
      jq<elm> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fwj.b m() {
      return this.m;
   }

   @Nullable
   public fwe n() {
      jq<elm> $$0 = this.m().c();
      return $$0 != null ? fwe.a.get($$0.e()) : null;
   }

   public List<fwj.b> o() {
      return this.n;
   }

   public List<fwj.b> p() {
      return this.o;
   }

   private void r() {
      kd<elm> $$0 = this.k().a().e(lz.aZ);
      this.n.clear();
      this.n.addAll(a($$0, axt.a).orElseGet(() -> $$0.c().map(fwj.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axt.b).orElse(this.n));
      jq<elm> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fwj.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<jq<elm>> a(fwh $$0, Optional<alh<elm>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().e(lz.aZ).a($$1x));
   }

   private static Optional<List<fwj.b>> a(kd<elm> $$0, axq<elm> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(fwj.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dex $$0) {
      this.p = $$0;
      this.a();
   }

   public dex q() {
      return this.p;
   }

   public static enum a {
      a("survival", dey.a),
      b("hardcore", dey.a),
      c("creative", dey.b),
      d("spectator", dey.d);

      public final dey e;
      public final xi f;
      private final xi g;

      private a(final String $$0, final dey $$1) {
         this.e = $$1;
         this.f = xi.c("selectWorld.gameMode." + $$0);
         this.g = xi.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xi a() {
         return this.g;
      }
   }

   public static record b(@Nullable jq<elm> a) {
      private static final xi b = xi.c("generator.custom");

      public xi a() {
         return Optional.ofNullable(this.a).flatMap(jq::e).map($$0 -> xi.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jq::e).filter($$0 -> $$0.equals(eln.d)).isPresent();
      }

      @Nullable
      public jq<elm> c() {
         return this.a;
      }
   }
}
