import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gbs {
   private static final wv a = wv.c("selectWorld.newWorld");
   private final List<Consumer<gbs>> b = new ArrayList<>();
   private String c = a.getString();
   private gbs.a d = gbs.a.a;
   private btn e = btn.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private gbq l;
   private gbs.b m;
   private final List<gbs.b> n = new ArrayList<>();
   private final List<gbs.b> o = new ArrayList<>();
   private dhl p;

   public gbs(Path $$0, gbq $$1, Optional<alc<eov>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new gbs.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new dhl($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<dhl.a>b($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(me.aU).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((enh)$$0x.a()).b())
         .ifPresent($$0x -> this.a(gbn.a($$0x)));
   }

   public void a(Consumer<gbs> $$0) {
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

      for (Consumer<gbs> $$2 : this.b) {
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

   public void a(gbs.a $$0) {
      this.d = $$0;
      this.a();
   }

   public gbs.a d() {
      return this.l() ? gbs.a.d : this.d;
   }

   public void a(btn $$0) {
      this.e = $$0;
      this.a();
   }

   public btn e() {
      return this.f() ? btn.d : this.e;
   }

   public boolean f() {
      return this.d() == gbs.a.b;
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
         return this.f == null ? this.d() == gbs.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(efj.a(this.h())));
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

   public void a(gbq $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public gbq k() {
      return this.l;
   }

   public void a(gbq.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(din $$0) {
      din $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new gbq(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(gbs.b $$0) {
      this.m = $$0;
      js<eov> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public gbs.b m() {
      return this.m;
   }

   @Nullable
   public gbn n() {
      js<eov> $$0 = this.m().c();
      return $$0 != null ? gbn.a.get($$0.e()) : null;
   }

   public List<gbs.b> o() {
      return this.n;
   }

   public List<gbs.b> p() {
      return this.o;
   }

   private void r() {
      kf<eov> $$0 = this.k().a().f(me.bi);
      this.n.clear();
      this.n.addAll(a($$0, axs.a).orElseGet(() -> $$0.c().map(gbs.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axs.b).orElse(this.n));
      js<eov> $$1 = this.m.c();
      if ($$1 != null) {
         gbs.b $$2 = a(this.k(), $$1.e()).map(gbs.b::new).orElse(this.n.getFirst());
         boolean $$3 = gbn.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<js<eov>> a(gbq $$0, Optional<alc<eov>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().f(me.bi).a($$1x));
   }

   private static Optional<List<gbs.b>> a(kf<eov> $$0, axp<eov> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(gbs.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dhl $$0) {
      this.p = $$0;
      this.a();
   }

   public dhl q() {
      return this.p;
   }

   public static enum a {
      a("survival", dhm.a),
      b("hardcore", dhm.a),
      c("creative", dhm.b),
      d("spectator", dhm.d);

      public final dhm e;
      public final wv f;
      private final wv g;

      private a(final String $$0, final dhm $$1) {
         this.e = $$1;
         this.f = wv.c("selectWorld.gameMode." + $$0);
         this.g = wv.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public wv a() {
         return this.g;
      }
   }

   public static record b(@Nullable js<eov> a) {
      private static final wv b = wv.c("generator.custom");

      public wv a() {
         return Optional.ofNullable(this.a).flatMap(js::e).map($$0 -> wv.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(js::e).filter($$0 -> $$0.equals(eow.d)).isPresent();
      }

      @Nullable
      public js<eov> c() {
         return this.a;
      }
   }
}
