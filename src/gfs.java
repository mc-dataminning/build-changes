import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gfs {
   private static final xc a = xc.c("selectWorld.newWorld");
   private final List<Consumer<gfs>> b = new ArrayList<>();
   private String c = a.getString();
   private gfs.a d = gfs.a.a;
   private buq e = buq.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private gfq l;
   private gfs.b m;
   private final List<gfs.b> n = new ArrayList<>();
   private final List<gfs.b> o = new ArrayList<>();
   private djv p;

   public gfs(Path $$0, gfq $$1, Optional<alj<ers>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new gfs.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new djv($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<djv.a>b($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(mi.aS).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((eqe)$$0x.a()).b())
         .ifPresent($$0x -> this.a(gfn.a($$0x)));
   }

   public void a(Consumer<gfs> $$0) {
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

      for (Consumer<gfs> $$2 : this.b) {
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

   public void a(gfs.a $$0) {
      this.d = $$0;
      this.a();
   }

   public gfs.a d() {
      return this.l() ? gfs.a.d : this.d;
   }

   public void a(buq $$0) {
      this.e = $$0;
      this.a();
   }

   public buq e() {
      return this.f() ? buq.d : this.e;
   }

   public boolean f() {
      return this.d() == gfs.a.b;
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
         return this.f == null ? this.d() == gfs.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(eid.a(this.h())));
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

   public void a(gfq $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public gfq k() {
      return this.l;
   }

   public void a(gfq.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dkx $$0) {
      dkx $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new gfq(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(gfs.b $$0) {
      this.m = $$0;
      jg<ers> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public gfs.b m() {
      return this.m;
   }

   @Nullable
   public gfn n() {
      jg<ers> $$0 = this.m().c();
      return $$0 != null ? gfn.a.get($$0.e()) : null;
   }

   public List<gfs.b> o() {
      return this.n;
   }

   public List<gfs.b> p() {
      return this.o;
   }

   private void r() {
      jt<ers> $$0 = this.k().a().f(mi.bo);
      this.n.clear();
      this.n.addAll(a($$0, axy.a).orElseGet(() -> $$0.c().map(gfs.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axy.b).orElse(this.n));
      jg<ers> $$1 = this.m.c();
      if ($$1 != null) {
         gfs.b $$2 = a(this.k(), $$1.e()).map(gfs.b::new).orElse(this.n.getFirst());
         boolean $$3 = gfn.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<jg<ers>> a(gfq $$0, Optional<alj<ers>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().f(mi.bo).a($$1x));
   }

   private static Optional<List<gfs.b>> a(jt<ers> $$0, axv<ers> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(gfs.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(djv $$0) {
      this.p = $$0;
      this.a();
   }

   public djv q() {
      return this.p;
   }

   public static enum a {
      a("survival", djw.a),
      b("hardcore", djw.a),
      c("creative", djw.b),
      d("spectator", djw.d);

      public final djw e;
      public final xc f;
      private final xc g;

      private a(final String $$0, final djw $$1) {
         this.e = $$1;
         this.f = xc.c("selectWorld.gameMode." + $$0);
         this.g = xc.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xc a() {
         return this.g;
      }
   }

   public static record b(@Nullable jg<ers> a) {
      private static final xc b = xc.c("generator.custom");

      public xc a() {
         return Optional.ofNullable(this.a).flatMap(jg::e).map($$0 -> xc.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jg::e).filter($$0 -> $$0.equals(ert.d)).isPresent();
      }

      @Nullable
      public jg<ers> c() {
         return this.a;
      }
   }
}
