import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gcv {
   private static final ww a = ww.c("selectWorld.newWorld");
   private final List<Consumer<gcv>> b = new ArrayList<>();
   private String c = a.getString();
   private gcv.a d = gcv.a.a;
   private btv e = btv.c;
   @Nullable
   private Boolean f;
   private String g;
   private boolean h;
   private boolean i;
   private final Path j;
   private String k;
   private gct l;
   private gcv.b m;
   private final List<gcv.b> n = new ArrayList<>();
   private final List<gcv.b> o = new ArrayList<>();
   private dil p;

   public gcv(Path $$0, gct $$1, Optional<ald<epx>> $$2, OptionalLong $$3) {
      this.j = $$0;
      this.l = $$1;
      this.m = new gcv.b(a($$1, $$2).orElse(null));
      this.r();
      this.g = $$3.isPresent() ? Long.toString($$3.getAsLong()) : "";
      this.h = $$1.c().d();
      this.i = $$1.c().e();
      this.k = this.c(this.c);
      this.d = $$1.i().a();
      this.p = new dil($$1.h().b());
      $$1.i().b().forEach($$0x -> this.p.<dil.a>b($$0x).a(false, null));
      Optional.ofNullable($$1.i().c())
         .flatMap($$1x -> $$1.a().a(mg.aQ).flatMap($$1xx -> $$1xx.a($$1x)))
         .map($$0x -> ((eoj)$$0x.a()).b())
         .ifPresent($$0x -> this.a(gcq.a($$0x)));
   }

   public void a(Consumer<gcv> $$0) {
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

      for (Consumer<gcv> $$2 : this.b) {
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

   public void a(gcv.a $$0) {
      this.d = $$0;
      this.a();
   }

   public gcv.a d() {
      return this.l() ? gcv.a.d : this.d;
   }

   public void a(btv $$0) {
      this.e = $$0;
      this.a();
   }

   public btv e() {
      return this.f() ? btv.d : this.e;
   }

   public boolean f() {
      return this.d() == gcv.a.b;
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
         return this.f == null ? this.d() == gcv.a.c : this.f;
      }
   }

   public void b(String $$0) {
      this.g = $$0;
      this.l = this.l.a($$0x -> $$0x.a(egl.a(this.h())));
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

   public void a(gct $$0) {
      this.l = $$0;
      this.r();
      this.a();
   }

   public gct k() {
      return this.l;
   }

   public void a(gct.a $$0) {
      this.l = this.l.a($$0);
      this.a();
   }

   protected boolean a(djn $$0) {
      djn $$1 = this.l.h();
      if ($$1.a().a().equals($$0.a().a()) && $$1.b().equals($$0.b())) {
         this.l = new gct(this.l.c(), this.l.d(), this.l.e(), this.l.f(), this.l.g(), $$0, this.l.i());
         return true;
      } else {
         return false;
      }
   }

   public boolean l() {
      return this.l.e().c();
   }

   public void a(gcv.b $$0) {
      this.m = $$0;
      je<epx> $$1 = $$0.c();
      if ($$1 != null) {
         this.a(($$1x, $$2) -> $$1.a().a());
      }
   }

   public gcv.b m() {
      return this.m;
   }

   @Nullable
   public gcq n() {
      je<epx> $$0 = this.m().c();
      return $$0 != null ? gcq.a.get($$0.e()) : null;
   }

   public List<gcv.b> o() {
      return this.n;
   }

   public List<gcv.b> p() {
      return this.o;
   }

   private void r() {
      jr<epx> $$0 = this.k().a().f(mg.bl);
      this.n.clear();
      this.n.addAll(a($$0, axs.a).orElseGet(() -> $$0.c().map(gcv.b::new).toList()));
      this.o.clear();
      this.o.addAll(a($$0, axs.b).orElse(this.n));
      je<epx> $$1 = this.m.c();
      if ($$1 != null) {
         gcv.b $$2 = a(this.k(), $$1.e()).map(gcv.b::new).orElse(this.n.getFirst());
         boolean $$3 = gcq.a.get($$1.e()) != null;
         if ($$3) {
            this.m = $$2;
         } else {
            this.a($$2);
         }
      }
   }

   private static Optional<je<epx>> a(gct $$0, Optional<ald<epx>> $$1) {
      return $$1.flatMap($$1x -> $$0.a().f(mg.bl).a($$1x));
   }

   private static Optional<List<gcv.b>> a(jr<epx> $$0, axp<epx> $$1) {
      return $$0.a($$1).map($$0x -> $$0x.a().map(gcv.b::new).toList()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(dil $$0) {
      this.p = $$0;
      this.a();
   }

   public dil q() {
      return this.p;
   }

   public static enum a {
      a("survival", dim.a),
      b("hardcore", dim.a),
      c("creative", dim.b),
      d("spectator", dim.d);

      public final dim e;
      public final ww f;
      private final ww g;

      private a(final String $$0, final dim $$1) {
         this.e = $$1;
         this.f = ww.c("selectWorld.gameMode." + $$0);
         this.g = ww.c("selectWorld.gameMode." + $$0 + ".info");
      }

      public ww a() {
         return this.g;
      }
   }

   public static record b(@Nullable je<epx> a) {
      private static final ww b = ww.c("generator.custom");

      public ww a() {
         return Optional.ofNullable(this.a).flatMap(je::e).map($$0 -> ww.c($$0.a().h("generator"))).orElse(b);
      }

      public boolean b() {
         return Optional.ofNullable(this.a).flatMap(je::e).filter($$0 -> $$0.equals(epy.d)).isPresent();
      }

      @Nullable
      public je<epx> c() {
         return this.a;
      }
   }
}
