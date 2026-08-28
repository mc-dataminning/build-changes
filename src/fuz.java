import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fuz {
   private static final xd a = xd.c("selectWorld.newWorld");
   private final List<Consumer<fuz>> b = new ArrayList<>();
   private String c = a.getString();
   private fuz.a d = fuz.a.a;
   private brh e = brh.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private fuy l;
   private fuz.b m;
   private final List<fuz.b> n = new ArrayList<>();
   private final List<fuz.b> o = new ArrayList<>();
   private ddo p;

   public fuz(Path $$0, fuy $$1, Optional<ala<ekd>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new fuz.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().c();
      this.i = $$1.c().d();
      this.k = this.c(this.c);
      this.p = new ddo($$1.h().b());
   }

   public void a(Consumer<fuz> $$0) {
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

      for (Consumer<fuz> $$2 : this.b) {
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

   public void a(fuz.a $$0) {
      this.d = $$0;
      this.a();
   }

   public fuz.a d() {
      return this.l() ? fuz.a.d : this.d;
   }

   public void a(brh $$0) {
      this.e = $$0;
      this.a();
   }

   public brh e() {
      return this.f() ? brh.d : this.e;
   }

   public boolean f() {
      return this.d() == fuz.a.b;
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
         return this.f == null ? this.d() == fuz.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(eau.a(this.h())));
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

   public void a(fuy $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public fuy k() {
      return this.l;
   }

   public void a(fuy.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(deo $$0) {
      deo $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new fuy(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0);
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(fuz.b $$0) {
      this.m = $$0;
      jn<ekd> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public fuz.b m() {
      return this.m;
   }

   @Nullable
   public fuv n() {
      jn<ekd> $$0 = this.m().c();
      return $$0 != null ? fuv.a.get($$0.e()) : null;
   }

   public List<fuz.b> o() {
      return this.n;
   }

   public List<fuz.b> p() {
      return this.o;
   }

   private void r() {
      ka<ekd> $$0 = this.k().a().d(lv.aY);
      this.n.clear();
      this.n.addAll(a($$0, axl.a).orElseGet(() -> $$0.i().map(fuz.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axl.b).orElse(this.n));
      jn<ekd> $$1 = this.m.c();
      if ($$1 != null) {
         this.m = a(this.k(), $$1.e()).map(fuz.b::new).orElse(this.n.get(0));
      }
   }

   private static Optional<jn<ekd>> a(fuy $$0, Optional<ala<ekd>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().d(lv.aY).b($$1x));
   }

   private static Optional<List<fuz.b>> a(ka<ekd> $$0, axi<ekd> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(fuz.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(ddo $$0) {
      this.p = $$0;
      this.a();
   }

   public ddo q() {
      return this.p;
   }

   public static enum a {
      a("survival", ddp.a),
      b("hardcore", ddp.a),
      c("creative", ddp.b),
      d("spectator", ddp.d);

      public final ddp e;
      public final xd f;
      private final xd g;

      private a(final String $$0, final ddp $$1) {
         this.e = $$1;
         this.f = xd.c("selectWorld.gameMode." + $$0);
         this.g = xd.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public xd a() {
         return this.g;
      }
   }

   public static record b(@Nullable jn<ekd> a) {
      private static final xd b = xd.c("generator.custom");

      public xd a() {
         return Optional.ofNullable(this.a).flatMap(jn::e).map($$0 -> xd.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(jn::e).filter($$0 -> $$0.equals(eke.d)).isPresent();
      }

      @Nullable
      public jn<ekd> c() {
         return this.a;
      }
   }
}
