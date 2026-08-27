import com.mojang.authlib.GameProfile;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class pq {
   private final pr a;
   private boolean b;

   public pq(pr $$0) {
      this.a = $$0;
   }

   public akk a() {
      return this.a.g();
   }

   public dez a(gu $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public dcl b(gu $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(bii.class);
   }

   public void a(Class $$0) {
      egy $$1 = this.k();
      List<bii> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cbm));
      $$2.forEach(bii::aj);
   }

   public byf a(cis $$0, float $$1, float $$2, float $$3) {
      akk $$4 = this.a();
      ehd $$5 = this.a(new ehd((double)$$1, (double)$$2, (double)$$3));
      byf $$6 = new byf($$4, $$5.c, $$5.d, $$5.e, new cix($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public byf a(cis $$0, gu $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bii> E a(bim<E> $$0, gu $$1) {
      return this.a($$0, ehd.c($$1));
   }

   public <E extends bii> E a(bim<E> $$0, ehd $$1) {
      akk $$2 = this.a();
      E $$3 = $$0.a((cpl)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bja $$4) {
            $$4.fF();
         }

         ehd $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dA(), $$3.dC());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bii> E a(bim<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new gu($$1, $$2, $$3));
   }

   public <E extends bii> E a(bim<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ehd((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bja> E b(bim<E> $$0, gu $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fV();
      return $$2;
   }

   public <E extends bja> E b(bim<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new gu($$1, $$2, $$3));
   }

   public <E extends bja> E b(bim<E> $$0, ehd $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fV();
      return $$2;
   }

   public <E extends bja> E b(bim<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ehd((double)$$1, (double)$$2, (double)$$3));
   }

   public pv a(bja $$0, gu $$1, float $$2) {
      return this.h().a(2, () -> {
         ear $$3 = $$0.H().a(this.i($$1), 0);
         $$0.H().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new gu($$0, $$1, $$2));
   }

   public void c(gu $$0) {
      this.b($$0, $$0x -> $$0x.a(apl.f), () -> "Expected button");
      gu $$1 = this.i($$0);
      dez $$2 = this.a().a_($$1);
      csu $$3 = (csu)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(gu $$0) {
      this.a($$0, this.d());
   }

   public void a(gu $$0, cbm $$1) {
      gu $$2 = this.i($$0);
      this.a($$0, $$1, new egz(ehd.b($$2), ha.c, $$2, true));
   }

   public void a(gu $$0, cbm $$1, egz $$2) {
      gu $$3 = this.i($$0);
      dez $$4 = this.a().a_($$3);
      bgq $$5 = $$4.a(this.a(), $$1, bgp.a, $$2);
      if (!$$5.a()) {
         clh $$6 = new clh($$1, bgp.a, $$2);
         $$1.b(bgp.a).a($$6);
      }
   }

   public biy a(biy $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cbm c() {
      return new cbm(this.a(), gu.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean G_() {
            return false;
         }

         @Override
         public boolean f() {
            return false;
         }
      };
   }

   public biy b(biy $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cbm d() {
      return new cbm(this.a(), gu.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean G_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }

         @Override
         public boolean g() {
            return true;
         }
      };
   }

   @Deprecated(
      forRemoval = true
   )
   public akl e() {
      akl $$0 = new akl(this.a().n(), this.a(), new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean G_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      sg $$1 = new sg(uy.a);
      EmbeddedChannel $$2 = new EmbeddedChannel(new ChannelHandler[]{$$1});
      $$2.attr(sg.e).set(sh.b.b(uy.a));
      this.a().n().ac().a($$1, $$0, 0);
      return $$0;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new gu($$0, $$1, $$2));
   }

   public void e(gu $$0) {
      this.a(csm.dw, $$0);
      gu $$1 = this.i($$0);
      dez $$2 = this.a().a_($$1);
      cwv $$3 = (cwv)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(gu $$0, long $$1) {
      this.a($$0, csm.ha);
      this.b($$1, () -> this.a($$0, csm.a));
   }

   public void f(gu $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, csl $$3) {
      this.a(new gu($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dez $$3) {
      this.a(new gu($$0, $$1, $$2), $$3);
   }

   public void a(gu $$0, csl $$1) {
      this.a($$0, $$1.n());
   }

   public void a(gu $$0, dez $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(csl $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gu($$1, $$2, $$3));
   }

   public void a(csl $$0, gu $$1) {
      dez $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.e().getString() + ", got " + $$2.b().e().getString());
   }

   public void b(csl $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new gu($$1, $$2, $$3));
   }

   public void b(csl $$0, gu $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.e().getString());
   }

   public void c(csl $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gu($$1, $$2, $$3));
   }

   public void c(csl $$0, gu $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(gu $$0, Predicate<csl> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(gu $$0, Predicate<csl> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(gu $$0, dgc<T> $$1, T $$2) {
      dez $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new pl($$6, this.i($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(gu $$0, dgc<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(gu $$0, Predicate<dez> $$1, Supplier<String> $$2) {
      dez $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new pl($$2.get(), this.i($$0), $$0, this.a.p());
      }
   }

   public void a(gu $$0, ha $$1, IntPredicate $$2, Supplier<String> $$3) {
      gu $$4 = this.i($$0);
      akk $$5 = this.a();
      dez $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new pl($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void a(bim<?> $$0) {
      List<? extends bii> $$1 = this.a().a($$0, this.k(), bii::bv);
      if ($$1.isEmpty()) {
         throw new pk("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bim<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gu($$1, $$2, $$3));
   }

   public void c(bim<?> $$0, gu $$1) {
      gu $$2 = this.i($$1);
      List<? extends bii> $$3 = this.a().a($$0, new egy($$2), bii::bv);
      if ($$3.isEmpty()) {
         throw new pl("Expected " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bim<?> $$0, ehd $$1, ehd $$2) {
      List<? extends bii> $$3 = this.a().a($$0, new egy($$1, $$2), bii::bv);
      if ($$3.isEmpty()) {
         throw new pl("Expected " + $$0.i() + " between ", gu.a($$1), gu.a($$2), this.a.p());
      }
   }

   public void a(bim<?> $$0, gu $$1, int $$2, double $$3) {
      gu $$4 = this.i($$1);
      List<? extends bii> $$5 = this.b((bim<? extends bii>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new pl("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bim<?> $$0, gu $$1, double $$2) {
      List<? extends bii> $$3 = this.b((bim<? extends bii>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         gu $$4 = this.i($$1);
         throw new pl("Expected " + $$0.i(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bii> List<T> b(bim<T> $$0, gu $$1, double $$2) {
      gu $$3 = this.i($$1);
      return this.a().a($$0, new egy($$3).g($$2), bii::bv);
   }

   public void a(bii $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gu($$1, $$2, $$3));
   }

   public void a(bii $$0, gu $$1) {
      gu $$2 = this.i($$1);
      List<? extends bii> $$3 = this.a().a($$0.ag(), new egy($$2), bii::bv);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new pl("Expected " + $$0.ag().i(), $$2, $$1, this.a.p()));
   }

   public void a(cis $$0, gu $$1, double $$2, int $$3) {
      gu $$4 = this.i($$1);
      List<byf> $$5 = this.a().a(bim.ad, new egy($$4).g($$2), bii::bv);
      int $$6 = 0;

      for (byf $$7 : $$5) {
         cix $$8 = $$7.j();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new pl("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cis $$0, gu $$1, double $$2) {
      gu $$3 = this.i($$1);

      for (bii $$5 : this.a().a(bim.ad, new egy($$3).g($$2), bii::bv)) {
         byf $$6 = (byf)$$5;
         if ($$6.j().d().equals($$0)) {
            return;
         }
      }

      throw new pl("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cis $$0, gu $$1, double $$2) {
      gu $$3 = this.i($$1);

      for (bii $$5 : this.a().a(bim.ad, new egy($$3).g($$2), bii::bv)) {
         byf $$6 = (byf)$$5;
         if ($$6.j().d().equals($$0)) {
            throw new pl("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void b(bim<?> $$0) {
      List<? extends bii> $$1 = this.a().a($$0, this.k(), bii::bv);
      if (!$$1.isEmpty()) {
         throw new pk("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bim<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new gu($$1, $$2, $$3));
   }

   public void d(bim<?> $$0, gu $$1) {
      gu $$2 = this.i($$1);
      List<? extends bii> $$3 = this.a().a($$0, new egy($$2), bii::bv);
      if (!$$3.isEmpty()) {
         throw new pl("Did not expect " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bim<?> $$0, double $$1, double $$2, double $$3) {
      ehd $$4 = new ehd($$1, $$2, $$3);
      ehd $$5 = this.a($$4);
      Predicate<? super bii> $$6 = $$1x -> $$1x.cG().a($$5, $$5);
      List<? extends bii> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new pk("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bim<?> $$0, double $$1, double $$2, double $$3) {
      ehd $$4 = new ehd($$1, $$2, $$3);
      ehd $$5 = this.a($$4);
      Predicate<? super bii> $$6 = $$1x -> !$$1x.cG().a($$5, $$5);
      List<? extends bii> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new pk("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bii, T> void a(gu $$0, bim<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      gu $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new egy($$4), bii::bv);
      if ($$5.isEmpty()) {
         throw new pl("Expected " + $$1.i(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new pk("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new pk("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends biy> void a(gu $$0, bim<E> $$1, cis $$2) {
      gu $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new egy($$3), bii::bv);
      if ($$4.isEmpty()) {
         throw new pl("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new pl("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bii & cax> void b(gu $$0, bim<E> $$1, cis $$2) {
      gu $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new egy($$3), $$0x -> ((bii)$$0x).bv());
      if ($$4.isEmpty()) {
         throw new pl("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.t().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new pl("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(gu $$0) {
      gu $$1 = this.i($$0);
      dcl $$2 = this.a().c_($$1);
      if ($$2 instanceof dcf && !((dcf)$$2).aa_()) {
         throw new pk("Container should be empty");
      }
   }

   public void a(gu $$0, cis $$1) {
      gu $$2 = this.i($$0);
      dcl $$3 = this.a().c_($$2);
      if (!($$3 instanceof dcf)) {
         throw new pk("Expected a container at " + $$0 + ", found " + jb.l.b($$3.u()));
      } else if (((dcf)$$3).a_($$1) != 1) {
         throw new pk("Container should contain: " + $$1);
      }
   }

   public void a(duq $$0, gu $$1) {
      gu.a($$0).forEach($$2 -> {
         gu $$3 = $$1.b($$2.u() - $$0.g(), $$2.v() - $$0.h(), $$2.w() - $$0.i());
         this.a($$2, $$3);
      });
   }

   public void a(gu $$0, gu $$1) {
      dez $$2 = this.a($$0);
      dez $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, gu $$1, cis $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, gu $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bii, T> void b(gu $$0, bim<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bii> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new pk("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bii, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new pk("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(biy $$0, bht $$1, int $$2) {
      bhv $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new pk("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(bim<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new gu($$1, $$2, $$3));
   }

   public void e(bim<?> $$0, gu $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bim<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new gu($$1, $$2, $$3));
   }

   public void f(bim<?> $$0, gu $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void g() {
      this.a.m();
   }

   private void j() {
      if (this.b) {
         throw new IllegalStateException("This test already has final clause");
      } else {
         this.b = true;
      }
   }

   public void a(Runnable $$0) {
      this.j();
      this.a.q().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.j();
      this.a.q().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.j();
      this.a.q().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.p() + $$0, $$1);
   }

   public void h(gu $$0) {
      gu $$1 = this.i($$0);
      akk $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dki.a $$0, int $$1, int $$2) {
      gu $$3 = this.i(new gu($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, gu $$1) {
      throw new pl($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, bii $$1) {
      throw new pl($$0, $$1.dk(), this.j($$1.dk()), this.i());
   }

   public void a(String $$0) {
      throw new pk($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new pk("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public pv h() {
      return this.a.q();
   }

   public gu i(gu $$0) {
      gu $$1 = this.a.d();
      gu $$2 = $$1.a((hz)$$0);
      return dyr.a($$2, cxg.a, this.a.u(), $$1);
   }

   public gu j(gu $$0) {
      gu $$1 = this.a.d();
      cyx $$2 = this.a.u().a(cyx.c);
      gu $$3 = dyr.a($$0, cxg.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ehd a(ehd $$0) {
      ehd $$1 = ehd.a(this.a.d());
      return dyr.a($$1.e($$0), cxg.a, this.a.u(), this.a.d());
   }

   public ehd b(ehd $$0) {
      ehd $$1 = ehd.a(this.a.d());
      return dyr.a($$0.d($$1), cxg.a, this.a.u(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new pk($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new pk($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   private egy k() {
      return this.a.f();
   }

   private egy l() {
      egy $$0 = this.a.f();
      return $$0.a(gu.b.b(this.i(gu.b)));
   }

   public void a(Consumer<gu> $$0) {
      egy $$1 = this.l();
      gu.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cbm $$0, cix $$1, gu $$2, ha $$3) {
      gu $$4 = this.i($$2.a($$3));
      egz $$5 = new egz(ehd.b($$4), $$3, $$4, false);
      clh $$6 = new clh($$0, bgp.a, $$5);
      $$1.a($$6);
   }
}
