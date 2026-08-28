import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fzc {
   private static final xk a = xk.c("selectWorld.newWorld");
   private final List<Consumer<fzc>> b = new ArrayList<>();
   private String c = a.getString();
   private fzc.a d = fzc.a.a;
   private bsx e = bsx.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fza l;
   private fzc.b m;
   private final List<fzc.b> n = new ArrayList<>();
   private final List<fzc.b> o = new ArrayList<>();
   private dgv p;

   public fzc(Path $$0, fza $$1, Optional<alo<ens>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fzc.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new dgv($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<dgv.a>a($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(mb.aQ).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((eme)$$0x.a()).b())
         .ifPresent($$0x -> this.a(fyx.a($$0x)));
   }

   public void a(Consumer<fzc> $$0) {
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

      for (Consumer<fzc> $$2 : this.b) {
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

   public void a(fzc.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fzc.a d() {
      return this.l() ? fzc.a.d : this.d;
   }

   public void a(bsx $$0) {
      this.e = $$0;
      this.a();
   }

   public bsx e() {
      return this.f() ? bsx.d : this.e;
   }

   public boolean f() {
      return this.d() == fzc.a.b;
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
         return this.f == null ? this.d() == fzc.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(eeh.a(this.h())));
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

   public void a(fza $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fza k() {
      return this.l;
   }

   public void a(fza.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(dhw $$0) {
      dhw $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fza(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fzc.b $$0) {
      this.m = $$0;
      jq<ens> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fzc.b m() {
      return this.m;
   }

   @Nullable
   public fyx n() {
      jq<ens> $$0 = this.m().c();
      return $$0 != null ? fyx.a.get($$0.e()) : null;
   }

   public List<fzc.b> o() {
      return this.n;
   }

   public List<fzc.b> p() {
      return this.o;
   }

   private void r() {
      kd<ens> $$0 = this.k().a().e(mb.bb);
      this.n.clear();
      this.n.addAll(a($$0, ayd.a).orElseGet(() -> $$0.c().map(fzc.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, ayd.b).orElse(this.n));
      jq<ens> $$1 = this.m.c();
      if ($$1 != null) {
         fzc.b $$2 = a(this.k(), $$1.e()).map(fzc.b::new).orElse(this.n.getFirst());
         boolean $$3 = fyx.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<jq<ens>> a(fza $$0, Optional<alo<ens>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().e(mb.bb).a($$1x));
   }

   private static Optional<List<fzc.b>> a(kd<ens> $$0, aya<ens> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(fzc.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dgv $$0) {
      this.p = $$0;
      this.a();
   }

   public dgv q() {
      return this.p;
   }

   public static enum a {
      a("survival", dgw.a),
      b("hardcore", dgw.a),
      c("creative", dgw.b),
      d("spectator", dgw.d);

      public final dgw e;
      public final xk f;
      private final xk g;

      private a(final String $$0, final dgw $$1) {
         this.e = $$1;
         this.f = xk.c("selectWorld.gameMode." + $$0);
         this.g = xk.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xk a() {
         return this.g;
      }
   }

   public static record b(@Nullable jq<ens> a) {
      private static final xk b = xk.c("generator.custom");

      public xk a() {
         return Optional.ofNullable(this.a).flatMap(jq::e).map($$0 -> xk.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jq::e).filter($$0 -> $$0.equals(ent.d)).isPresent();
      }

      @Nullable
      public jq<ens> c() {
         return this.a;
      }
   }
}
