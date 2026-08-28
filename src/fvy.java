import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fvy {
   private static final xh a = xh.c("selectWorld.newWorld");
   private final List<Consumer<fvy>> b = new ArrayList<>();
   private String c = a.getString();
   private fvy.a d = fvy.a.a;
   private brv e = brv.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fvx l;
   private fvy.b m;
   private final List<fvy.b> n = new ArrayList<>();
   private final List<fvy.b> o = new ArrayList<>();
   private der p;

   public fvy(Path $$0, fvx $$1, Optional<alg<elg>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fvy.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().c();
      this.i = $$1.c().d();
      this.k = this.c(this.c);
      this.p = new der($$1.h().b());
   }

   public void a(Consumer<fvy> $$0) {
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

      for (Consumer<fvy> $$2 : this.b) {
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

   public void a(fvy.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fvy.a d() {
      return this.l() ? fvy.a.d : this.d;
   }

   public void a(brv $$0) {
      this.e = $$0;
      this.a();
   }

   public brv e() {
      return this.f() ? brv.d : this.e;
   }

   public boolean f() {
      return this.d() == fvy.a.b;
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
         return this.f == null ? this.d() == fvy.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(ebx.a(this.h())));
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

   public void a(fvx $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fvx k() {
      return this.l;
   }

   public void a(fvx.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dfr $$0) {
      dfr $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fvx(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fvy.b $$0) {
      this.m = $$0;
      jp<elg> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fvy.b m() {
      return this.m;
   }

   @Nullable
   public fvu n() {
      jp<elg> $$0 = this.m().c();
      return $$0 != null ? fvu.a.get($$0.e()) : null;
   }

   public List<fvy.b> o() {
      return this.n;
   }

   public List<fvy.b> p() {
      return this.o;
   }

   private void r() {
      kc<elg> $$0 = this.k().a().e(ly.aZ);
      this.n.clear();
      this.n.addAll(a($$0, axs.a).orElseGet(() -> $$0.c().map(fvy.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axs.b).orElse(this.n));
      jp<elg> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fvy.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<jp<elg>> a(fvx $$0, Optional<alg<elg>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().e(ly.aZ).a($$1x));
   }

   private static Optional<List<fvy.b>> a(kc<elg> $$0, axp<elg> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(fvy.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(der $$0) {
      this.p = $$0;
      this.a();
   }

   public der q() {
      return this.p;
   }

   public static enum a {
      a("survival", des.a),
      b("hardcore", des.a),
      c("creative", des.b),
      d("spectator", des.d);

      public final des e;
      public final xh f;
      private final xh g;

      private a(final String $$0, final des $$1) {
         this.e = $$1;
         this.f = xh.c("selectWorld.gameMode." + $$0);
         this.g = xh.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xh a() {
         return this.g;
      }
   }

   public static record b(@Nullable jp<elg> a) {
      private static final xh b = xh.c("generator.custom");

      public xh a() {
         return Optional.ofNullable(this.a).flatMap(jp::e).map($$0 -> xh.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jp::e).filter($$0 -> $$0.equals(elh.d)).isPresent();
      }

      @Nullable
      public jp<elg> c() {
         return this.a;
      }
   }
}
