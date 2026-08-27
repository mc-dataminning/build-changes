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

public class pr {
   private final ps a;
   private boolean b;

   public pr(ps $$0) {
      this.a = $$0;
   }

   public aki a() {
      return this.a.g();
   }

   public dey a(gv $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public dck b(gv $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(big.class);
   }

   public void a(Class $$0) {
      eha $$1 = this.k();
      List<big> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cbl));
      $$2.forEach(big::aj);
   }

   public bye a(cir $$0, float $$1, float $$2, float $$3) {
      aki $$4 = this.a();
      ehf $$5 = this.a(new ehf((double)$$1, (double)$$2, (double)$$3));
      bye $$6 = new bye($$4, $$5.c, $$5.d, $$5.e, new ciw($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public bye a(cir $$0, gv $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends big> E a(bik<E> $$0, gv $$1) {
      return this.a($$0, ehf.c($$1));
   }

   public <E extends big> E a(bik<E> $$0, ehf $$1) {
      aki $$2 = this.a();
      E $$3 = $$0.a((cpk)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof biy $$4) {
            $$4.fF();
         }

         ehf $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dA(), $$3.dC());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends big> E a(bik<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new gv($$1, $$2, $$3));
   }

   public <E extends big> E a(bik<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ehf((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends biy> E b(bik<E> $$0, gv $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fU();
      return $$2;
   }

   public <E extends biy> E b(bik<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new gv($$1, $$2, $$3));
   }

   public <E extends biy> E b(bik<E> $$0, ehf $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fU();
      return $$2;
   }

   public <E extends biy> E b(bik<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ehf((double)$$1, (double)$$2, (double)$$3));
   }

   public pw a(biy $$0, gv $$1, float $$2) {
      return this.h().a(2, () -> {
         eaq $$3 = $$0.H().a(this.i($$1), 0);
         $$0.H().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new gv($$0, $$1, $$2));
   }

   public void c(gv $$0) {
      this.b($$0, $$0x -> $$0x.a(apj.f), () -> "Expected button");
      gv $$1 = this.i($$0);
      dey $$2 = this.a().a_($$1);
      cst $$3 = (cst)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(gv $$0) {
      this.a($$0, this.d());
   }

   public void a(gv $$0, cbl $$1) {
      gv $$2 = this.i($$0);
      this.a($$0, $$1, new ehb(ehf.b($$2), hb.c, $$2, true));
   }

   public void a(gv $$0, cbl $$1, ehb $$2) {
      gv $$3 = this.i($$0);
      dey $$4 = this.a().a_($$3);
      bgo $$5 = $$4.a(this.a(), $$1, bgn.a, $$2);
      if (!$$5.a()) {
         clg $$6 = new clg($$1, bgn.a, $$2);
         $$1.b(bgn.a).a($$6);
      }
   }

   public biw a(biw $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cbl c() {
      return new cbl(this.a(), gv.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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

   public biw b(biw $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cbl d() {
      return new cbl(this.a(), gv.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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
   public akj e() {
      akj $$0 = new akj(this.a().n(), this.a(), new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean G_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      sf $$1 = new sf(ux.a);
      EmbeddedChannel $$2 = new EmbeddedChannel(new ChannelHandler[]{$$1});
      $$2.attr(sf.e).set(sg.b.b(ux.a));
      this.a().n().ac().a($$1, $$0, 0);
      return $$0;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new gv($$0, $$1, $$2));
   }

   public void e(gv $$0) {
      this.a(csl.dw, $$0);
      gv $$1 = this.i($$0);
      dey $$2 = this.a().a_($$1);
      cwu $$3 = (cwu)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(gv $$0, long $$1) {
      this.a($$0, csl.ha);
      this.b($$1, () -> this.a($$0, csl.a));
   }

   public void f(gv $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, csk $$3) {
      this.a(new gv($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dey $$3) {
      this.a(new gv($$0, $$1, $$2), $$3);
   }

   public void a(gv $$0, csk $$1) {
      this.a($$0, $$1.n());
   }

   public void a(gv $$0, dey $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(csk $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gv($$1, $$2, $$3));
   }

   public void a(csk $$0, gv $$1) {
      dey $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.e().getString() + ", got " + $$2.b().e().getString());
   }

   public void b(csk $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new gv($$1, $$2, $$3));
   }

   public void b(csk $$0, gv $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.e().getString());
   }

   public void c(csk $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gv($$1, $$2, $$3));
   }

   public void c(csk $$0, gv $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(gv $$0, Predicate<csk> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(gv $$0, Predicate<csk> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(gv $$0, dgb<T> $$1, T $$2) {
      dey $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new pm($$6, this.i($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(gv $$0, dgb<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(gv $$0, Predicate<dey> $$1, Supplier<String> $$2) {
      dey $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new pm($$2.get(), this.i($$0), $$0, this.a.p());
      }
   }

   public void a(gv $$0, hb $$1, IntPredicate $$2, Supplier<String> $$3) {
      gv $$4 = this.i($$0);
      aki $$5 = this.a();
      dey $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new pm($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void a(bik<?> $$0) {
      List<? extends big> $$1 = this.a().a($$0, this.k(), big::bv);
      if ($$1.isEmpty()) {
         throw new pl("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bik<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gv($$1, $$2, $$3));
   }

   public void c(bik<?> $$0, gv $$1) {
      gv $$2 = this.i($$1);
      List<? extends big> $$3 = this.a().a($$0, new eha($$2), big::bv);
      if ($$3.isEmpty()) {
         throw new pm("Expected " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bik<?> $$0, ehf $$1, ehf $$2) {
      List<? extends big> $$3 = this.a().a($$0, new eha($$1, $$2), big::bv);
      if ($$3.isEmpty()) {
         throw new pm("Expected " + $$0.i() + " between ", gv.a($$1), gv.a($$2), this.a.p());
      }
   }

   public void a(bik<?> $$0, gv $$1, int $$2, double $$3) {
      gv $$4 = this.i($$1);
      List<? extends big> $$5 = this.b((bik<? extends big>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new pm("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bik<?> $$0, gv $$1, double $$2) {
      List<? extends big> $$3 = this.b((bik<? extends big>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         gv $$4 = this.i($$1);
         throw new pm("Expected " + $$0.i(), $$4, $$1, this.a.p());
      }
   }

   public <T extends big> List<T> b(bik<T> $$0, gv $$1, double $$2) {
      gv $$3 = this.i($$1);
      return this.a().a($$0, new eha($$3).g($$2), big::bv);
   }

   public void a(big $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gv($$1, $$2, $$3));
   }

   public void a(big $$0, gv $$1) {
      gv $$2 = this.i($$1);
      List<? extends big> $$3 = this.a().a($$0.ag(), new eha($$2), big::bv);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new pm("Expected " + $$0.ag().i(), $$2, $$1, this.a.p()));
   }

   public void a(cir $$0, gv $$1, double $$2, int $$3) {
      gv $$4 = this.i($$1);
      List<bye> $$5 = this.a().a(bik.ad, new eha($$4).g($$2), big::bv);
      int $$6 = 0;

      for (bye $$7 : $$5) {
         ciw $$8 = $$7.j();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new pm("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cir $$0, gv $$1, double $$2) {
      gv $$3 = this.i($$1);

      for (big $$5 : this.a().a(bik.ad, new eha($$3).g($$2), big::bv)) {
         bye $$6 = (bye)$$5;
         if ($$6.j().d().equals($$0)) {
            return;
         }
      }

      throw new pm("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cir $$0, gv $$1, double $$2) {
      gv $$3 = this.i($$1);

      for (big $$5 : this.a().a(bik.ad, new eha($$3).g($$2), big::bv)) {
         bye $$6 = (bye)$$5;
         if ($$6.j().d().equals($$0)) {
            throw new pm("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void b(bik<?> $$0) {
      List<? extends big> $$1 = this.a().a($$0, this.k(), big::bv);
      if (!$$1.isEmpty()) {
         throw new pl("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bik<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new gv($$1, $$2, $$3));
   }

   public void d(bik<?> $$0, gv $$1) {
      gv $$2 = this.i($$1);
      List<? extends big> $$3 = this.a().a($$0, new eha($$2), big::bv);
      if (!$$3.isEmpty()) {
         throw new pm("Did not expect " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bik<?> $$0, double $$1, double $$2, double $$3) {
      ehf $$4 = new ehf($$1, $$2, $$3);
      ehf $$5 = this.a($$4);
      Predicate<? super big> $$6 = $$1x -> $$1x.cG().a($$5, $$5);
      List<? extends big> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new pl("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bik<?> $$0, double $$1, double $$2, double $$3) {
      ehf $$4 = new ehf($$1, $$2, $$3);
      ehf $$5 = this.a($$4);
      Predicate<? super big> $$6 = $$1x -> !$$1x.cG().a($$5, $$5);
      List<? extends big> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new pl("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends big, T> void a(gv $$0, bik<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      gv $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new eha($$4), big::bv);
      if ($$5.isEmpty()) {
         throw new pm("Expected " + $$1.i(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new pl("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new pl("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends biw> void a(gv $$0, bik<E> $$1, cir $$2) {
      gv $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new eha($$3), big::bv);
      if ($$4.isEmpty()) {
         throw new pm("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new pm("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends big & caw> void b(gv $$0, bik<E> $$1, cir $$2) {
      gv $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new eha($$3), $$0x -> ((big)$$0x).bv());
      if ($$4.isEmpty()) {
         throw new pm("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.t().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new pm("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(gv $$0) {
      gv $$1 = this.i($$0);
      dck $$2 = this.a().c_($$1);
      if ($$2 instanceof dce && !((dce)$$2).ab_()) {
         throw new pl("Container should be empty");
      }
   }

   public void a(gv $$0, cir $$1) {
      gv $$2 = this.i($$0);
      dck $$3 = this.a().c_($$2);
      if (!($$3 instanceof dce)) {
         throw new pl("Expected a container at " + $$0 + ", found " + jc.l.b($$3.u()));
      } else if (((dce)$$3).a_($$1) != 1) {
         throw new pl("Container should contain: " + $$1);
      }
   }

   public void a(dup $$0, gv $$1) {
      gv.a($$0).forEach($$2 -> {
         gv $$3 = $$1.b($$2.u() - $$0.g(), $$2.v() - $$0.h(), $$2.w() - $$0.i());
         this.a($$2, $$3);
      });
   }

   public void a(gv $$0, gv $$1) {
      dey $$2 = this.a($$0);
      dey $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, gv $$1, cir $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, gv $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends big, T> void b(gv $$0, bik<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends big> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new pl("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends big, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new pl("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(biw $$0, bhr $$1, int $$2) {
      bht $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new pl("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(bik<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new gv($$1, $$2, $$3));
   }

   public void e(bik<?> $$0, gv $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bik<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new gv($$1, $$2, $$3));
   }

   public void f(bik<?> $$0, gv $$1) {
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

   public void h(gv $$0) {
      gv $$1 = this.i($$0);
      aki $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dkh.a $$0, int $$1, int $$2) {
      gv $$3 = this.i(new gv($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, gv $$1) {
      throw new pm($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, big $$1) {
      throw new pm($$0, $$1.dk(), this.j($$1.dk()), this.i());
   }

   public void a(String $$0) {
      throw new pl($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new pl("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public pw h() {
      return this.a.q();
   }

   public gv i(gv $$0) {
      gv $$1 = this.a.d();
      gv $$2 = $$1.a((ia)$$0);
      return dyq.a($$2, cxf.a, this.a.u(), $$1);
   }

   public gv j(gv $$0) {
      gv $$1 = this.a.d();
      cyw $$2 = this.a.u().a(cyw.c);
      gv $$3 = dyq.a($$0, cxf.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ehf a(ehf $$0) {
      ehf $$1 = ehf.a(this.a.d());
      return dyq.a($$1.e($$0), cxf.a, this.a.u(), this.a.d());
   }

   public ehf b(ehf $$0) {
      ehf $$1 = ehf.a(this.a.d());
      return dyq.a($$0.d($$1), cxf.a, this.a.u(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new pl($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new pl($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   private eha k() {
      return this.a.f();
   }

   private eha l() {
      eha $$0 = this.a.f();
      return $$0.a(gv.b.b(this.i(gv.b)));
   }

   public void a(Consumer<gv> $$0) {
      eha $$1 = this.l();
      gv.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cbl $$0, ciw $$1, gv $$2, hb $$3) {
      gv $$4 = this.i($$2.a($$3));
      ehb $$5 = new ehb(ehf.b($$4), $$3, $$4, false);
      clg $$6 = new clg($$0, bgn.a, $$5);
      $$1.a($$6);
   }
}
