import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fzx {
   private static final wp a = wp.c("selectWorld.newWorld");
   private final List<Consumer<fzx>> b = new ArrayList<>();
   private String c = a.getString();
   private fzx.a d = fzx.a.a;
   private bsi e = bsi.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fzv l;
   private fzx.b m;
   private final List<fzx.b> n = new ArrayList<>();
   private final List<fzx.b> o = new ArrayList<>();
   private dgf p;

   public fzx(Path $$0, fzv $$1, Optional<aku<enc>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fzx.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new dgf($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<dgf.a>a($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(mc.aQ).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((elo)$$0x.a()).b())
         .ifPresent($$0x -> this.a(fzs.a($$0x)));
   }

   public void a(Consumer<fzx> $$0) {
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

      for (Consumer<fzx> $$2 : this.b) {
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

   public void a(fzx.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fzx.a d() {
      return this.l() ? fzx.a.d : this.d;
   }

   public void a(bsi $$0) {
      this.e = $$0;
      this.a();
   }

   public bsi e() {
      return this.f() ? bsi.d : this.e;
   }

   public boolean f() {
      return this.d() == fzx.a.b;
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
         return this.f == null ? this.d() == fzx.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(edr.a(this.h())));
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

   public void a(fzv $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fzv k() {
      return this.l;
   }

   public void a(fzv.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dhg $$0) {
      dhg $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fzv(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fzx.b $$0) {
      this.m = $$0;
      jr<enc> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fzx.b m() {
      return this.m;
   }

   @Nullable
   public fzs n() {
      jr<enc> $$0 = this.m().c();
      return $$0 != null ? fzs.a.get($$0.e()) : null;
   }

   public List<fzx.b> o() {
      return this.n;
   }

   public List<fzx.b> p() {
      return this.o;
   }

   private void r() {
      ke<enc> $$0 = this.k().a().e(mc.bb);
      this.n.clear();
      this.n.addAll(a($$0, axi.a).orElseGet(() -> $$0.c().map(fzx.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axi.b).orElse(this.n));
      jr<enc> $$1 = this.m.c();
      if ($$1 != null) {
         fzx.b $$2 = a(this.k(), $$1.e()).map(fzx.b::new).orElse(this.n.getFirst());
         boolean $$3 = fzs.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<jr<enc>> a(fzv $$0, Optional<aku<enc>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().e(mc.bb).a($$1x));
   }

   private static Optional<List<fzx.b>> a(ke<enc> $$0, axf<enc> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(fzx.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dgf $$0) {
      this.p = $$0;
      this.a();
   }

   public dgf q() {
      return this.p;
   }

   public static enum a {
      a("survival", dgg.a),
      b("hardcore", dgg.a),
      c("creative", dgg.b),
      d("spectator", dgg.d);

      public final dgg e;
      public final wp f;
      private final wp g;

      private a(final String $$0, final dgg $$1) {
         this.e = $$1;
         this.f = wp.c("selectWorld.gameMode." + $$0);
         this.g = wp.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wp a() {
         return this.g;
      }
   }

   public static record b(@Nullable jr<enc> a) {
      private static final wp b = wp.c("generator.custom");

      public wp a() {
         return Optional.ofNullable(this.a).flatMap(jr::e).map($$0 -> wp.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jr::e).filter($$0 -> $$0.equals(end.d)).isPresent();
      }

      @Nullable
      public jr<enc> c() {
         return this.a;
      }
   }
}
