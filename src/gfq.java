import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gfq {
   private static final xa a = xa.c("selectWorld.newWorld");
   private final List<Consumer<gfq>> b = new ArrayList<>();
   private String c = a.getString();
   private gfq.a d = gfq.a.a;
   private buo e = buo.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private gfo l;
   private gfq.b m;
   private final List<gfq.b> n = new ArrayList<>();
   private final List<gfq.b> o = new ArrayList<>();
   private djt p;

   public gfq(Path $$0, gfo $$1, Optional<alh<erq>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new gfq.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new djt($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<djt.a>b($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(mh.aS).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((eqc)$$0x.a()).b())
         .ifPresent($$0x -> this.a(gfl.a($$0x)));
   }

   public void a(Consumer<gfq> $$0) {
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

      for (Consumer<gfq> $$2 : this.b) {
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

   public void a(gfq.a $$0) {
      this.d = $$0;
      this.a();
   }

   public gfq.a d() {
      return this.l() ? gfq.a.d : this.d;
   }

   public void a(buo $$0) {
      this.e = $$0;
      this.a();
   }

   public buo e() {
      return this.f() ? buo.d : this.e;
   }

   public boolean f() {
      return this.d() == gfq.a.b;
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
         return this.f == null ? this.d() == gfq.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(eib.a(this.h())));
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

   public void a(gfo $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public gfo k() {
      return this.l;
   }

   public void a(gfo.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dkv $$0) {
      dkv $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new gfo(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(gfq.b $$0) {
      this.m = $$0;
      jf<erq> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public gfq.b m() {
      return this.m;
   }

   @Nullable
   public gfl n() {
      jf<erq> $$0 = this.m().c();
      return $$0 != null ? gfl.a.get($$0.e()) : null;
   }

   public List<gfq.b> o() {
      return this.n;
   }

   public List<gfq.b> p() {
      return this.o;
   }

   private void r() {
      js<erq> $$0 = this.k().a().f(mh.bo);
      this.n.clear();
      this.n.addAll(a($$0, axw.a).orElseGet(() -> $$0.c().map(gfq.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axw.b).orElse(this.n));
      jf<erq> $$1 = this.m.c();
      if ($$1 != null) {
         gfq.b $$2 = a(this.k(), $$1.e()).map(gfq.b::new).orElse(this.n.getFirst());
         boolean $$3 = gfl.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<jf<erq>> a(gfo $$0, Optional<alh<erq>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().f(mh.bo).a($$1x));
   }

   private static Optional<List<gfq.b>> a(js<erq> $$0, axt<erq> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(gfq.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(djt $$0) {
      this.p = $$0;
      this.a();
   }

   public djt q() {
      return this.p;
   }

   public static enum a {
      a("survival", dju.a),
      b("hardcore", dju.a),
      c("creative", dju.b),
      d("spectator", dju.d);

      public final dju e;
      public final xa f;
      private final xa g;

      private a(final String $$0, final dju $$1) {
         this.e = $$1;
         this.f = xa.c("selectWorld.gameMode." + $$0);
         this.g = xa.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xa a() {
         return this.g;
      }
   }

   public static record b(@Nullable jf<erq> a) {
      private static final xa b = xa.c("generator.custom");

      public xa a() {
         return Optional.ofNullable(this.a).flatMap(jf::e).map($$0 -> xa.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jf::e).filter($$0 -> $$0.equals(err.d)).isPresent();
      }

      @Nullable
      public jf<erq> c() {
         return this.a;
      }
   }
}
