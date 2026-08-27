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

public class qz {
   private final ra a;
   private boolean b;

   public qz(ra $$0) {
      this.a = $$0;
   }

   public ame a() {
      return this.a.h();
   }

   public dhi a(ht $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public dfd b(ht $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(bkq.class);
   }

   public void a(Class $$0) {
      ejp $$1 = this.j();
      List<bkq> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cdu));
      $$2.forEach(bkq::al);
   }

   public can a(cle $$0, float $$1, float $$2, float $$3) {
      ame $$4 = this.a();
      eju $$5 = this.a(new eju((double)$$1, (double)$$2, (double)$$3));
      can $$6 = new can($$4, $$5.c, $$5.d, $$5.e, new clj($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public can a(cle $$0, ht $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bkq> E a(bku<E> $$0, ht $$1) {
      return this.a($$0, eju.c($$1));
   }

   public <E extends bkq> E a(bku<E> $$0, eju $$1) {
      ame $$2 = this.a();
      E $$3 = $$0.a((csa)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bli $$4) {
            $$4.fK();
         }

         eju $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dD(), $$3.dF());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bkq> E a(bku<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ht($$1, $$2, $$3));
   }

   public <E extends bkq> E a(bku<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eju((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bli> E b(bku<E> $$0, ht $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.ga();
      return $$2;
   }

   public <E extends bli> E b(bku<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ht($$1, $$2, $$3));
   }

   public <E extends bli> E b(bku<E> $$0, eju $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.ga();
      return $$2;
   }

   public <E extends bli> E b(bku<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new eju((double)$$1, (double)$$2, (double)$$3));
   }

   public re a(bli $$0, ht $$1, float $$2) {
      return this.h().a(2, () -> {
         edh $$3 = $$0.N().a(this.i($$1), 0);
         $$0.N().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ht($$0, $$1, $$2));
   }

   public void c(ht $$0) {
      this.b($$0, $$0x -> $$0x.a(arg.f), () -> "Expected button");
      ht $$1 = this.i($$0);
      dhi $$2 = this.a().a_($$1);
      cvk $$3 = (cvk)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(ht $$0) {
      this.a($$0, this.d());
   }

   public void a(ht $$0, cdu $$1) {
      ht $$2 = this.i($$0);
      this.a($$0, $$1, new ejq(eju.b($$2), hx.c, $$2, true));
   }

   public void a(ht $$0, cdu $$1, ejq $$2) {
      ht $$3 = this.i($$0);
      dhi $$4 = this.a().a_($$3);
      bix $$5 = $$4.a(this.a(), $$1, biw.a, $$2);
      if (!$$5.a()) {
         cnt $$6 = new cnt($$1, biw.a, $$2);
         $$1.b(biw.a).a($$6);
      }
   }

   public blg a(blg $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cdu c() {
      return new cdu(this.a(), ht.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean O_() {
            return false;
         }

         @Override
         public boolean f() {
            return false;
         }
      };
   }

   public blg b(blg $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cdu d() {
      return new cdu(this.a(), ht.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean O_() {
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
   public amf e() {
      amt $$0 = amt.a(new GameProfile(UUID.randomUUID(), "test-mock-player"));
      amf $$1 = new amf(this.a().n(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean O_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      ts $$2 = new ts(wl.a);
      EmbeddedChannel $$3 = new EmbeddedChannel(new ChannelHandler[]{$$2});
      $$3.attr(ts.e).set(tt.b.b(wl.a));
      this.a().n().ae().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new ht($$0, $$1, $$2));
   }

   public void e(ht $$0) {
      this.a(cvc.dw, $$0);
      ht $$1 = this.i($$0);
      dhi $$2 = this.a().a_($$1);
      czm $$3 = (czm)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(ht $$0, long $$1) {
      this.a($$0, cvc.ha);
      this.b($$1, () -> this.a($$0, cvc.a));
   }

   public void f(ht $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cva $$3) {
      this.a(new ht($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dhi $$3) {
      this.a(new ht($$0, $$1, $$2), $$3);
   }

   public void a(ht $$0, cva $$1) {
      this.a($$0, $$1.o());
   }

   public void a(ht $$0, dhi $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cva $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ht($$1, $$2, $$3));
   }

   public void a(cva $$0, ht $$1) {
      dhi $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cva $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ht($$1, $$2, $$3));
   }

   public void b(cva $$0, ht $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cva $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ht($$1, $$2, $$3));
   }

   public void c(cva $$0, ht $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ht $$0, Predicate<cva> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ht $$0, Predicate<cva> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ht $$0, dil<T> $$1, T $$2) {
      dhi $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new qu($$6, this.i($$0), $$0, this.a.q());
      }
   }

   public <T extends Comparable<T>> void a(ht $$0, dil<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ht $$0, Predicate<dhi> $$1, Supplier<String> $$2) {
      dhi $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new qu($$2.get(), this.i($$0), $$0, this.a.q());
      }
   }

   public void a(ht $$0, hx $$1, IntPredicate $$2, Supplier<String> $$3) {
      ht $$4 = this.i($$0);
      ame $$5 = this.a();
      dhi $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new qu($$3.get(), $$4, $$0, this.a.q());
      }
   }

   public void a(bku<?> $$0) {
      List<? extends bkq> $$1 = this.a().a($$0, this.j(), bkq::bx);
      if ($$1.isEmpty()) {
         throw new qt("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bku<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ht($$1, $$2, $$3));
   }

   public void c(bku<?> $$0, ht $$1) {
      ht $$2 = this.i($$1);
      List<? extends bkq> $$3 = this.a().a($$0, new ejp($$2), bkq::bx);
      if ($$3.isEmpty()) {
         throw new qu("Expected " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(bku<?> $$0, eju $$1, eju $$2) {
      List<? extends bkq> $$3 = this.a().a($$0, new ejp($$1, $$2), bkq::bx);
      if ($$3.isEmpty()) {
         throw new qu("Expected " + $$0.i() + " between ", ht.a($$1), ht.a($$2), this.a.q());
      }
   }

   public void a(bku<?> $$0, ht $$1, int $$2, double $$3) {
      ht $$4 = this.i($$1);
      List<? extends bkq> $$5 = this.b((bku<? extends bkq>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new qu("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.q());
      }
   }

   public void a(bku<?> $$0, ht $$1, double $$2) {
      List<? extends bkq> $$3 = this.b((bku<? extends bkq>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ht $$4 = this.i($$1);
         throw new qu("Expected " + $$0.i(), $$4, $$1, this.a.q());
      }
   }

   public <T extends bkq> List<T> b(bku<T> $$0, ht $$1, double $$2) {
      ht $$3 = this.i($$1);
      return this.a().a($$0, new ejp($$3).g($$2), bkq::bx);
   }

   public void a(bkq $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ht($$1, $$2, $$3));
   }

   public void a(bkq $$0, ht $$1) {
      ht $$2 = this.i($$1);
      List<? extends bkq> $$3 = this.a().a($$0.ai(), new ejp($$2), bkq::bx);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new qu("Expected " + $$0.ai().i(), $$2, $$1, this.a.q()));
   }

   public void a(cle $$0, ht $$1, double $$2, int $$3) {
      ht $$4 = this.i($$1);
      List<can> $$5 = this.a().a(bku.ad, new ejp($$4).g($$2), bkq::bx);
      int $$6 = 0;

      for (can $$7 : $$5) {
         clj $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new qu("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.q());
      }
   }

   public void a(cle $$0, ht $$1, double $$2) {
      ht $$3 = this.i($$1);

      for (bkq $$5 : this.a().a(bku.ad, new ejp($$3).g($$2), bkq::bx)) {
         can $$6 = (can)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new qu("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
   }

   public void b(cle $$0, ht $$1, double $$2) {
      ht $$3 = this.i($$1);

      for (bkq $$5 : this.a().a(bku.ad, new ejp($$3).g($$2), bkq::bx)) {
         can $$6 = (can)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new qu("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
         }
      }
   }

   public void a(cle $$0) {
      for (bkq $$2 : this.a().a(bku.ad, this.j(), bkq::bx)) {
         can $$3 = (can)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new qt("Expected " + $$0.p().getString() + " item");
   }

   public void b(cle $$0) {
      for (bkq $$2 : this.a().a(bku.ad, this.j(), bkq::bx)) {
         can $$3 = (can)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new qt("Did not expect " + $$0.p().getString() + " item");
         }
      }
   }

   public void b(bku<?> $$0) {
      List<? extends bkq> $$1 = this.a().a($$0, this.j(), bkq::bx);
      if (!$$1.isEmpty()) {
         throw new qt("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bku<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ht($$1, $$2, $$3));
   }

   public void d(bku<?> $$0, ht $$1) {
      ht $$2 = this.i($$1);
      List<? extends bkq> $$3 = this.a().a($$0, new ejp($$2), bkq::bx);
      if (!$$3.isEmpty()) {
         throw new qu("Did not expect " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(bku<?> $$0, double $$1, double $$2, double $$3) {
      eju $$4 = new eju($$1, $$2, $$3);
      eju $$5 = this.a($$4);
      Predicate<? super bkq> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends bkq> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new qt("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bku<?> $$0, double $$1, double $$2, double $$3) {
      eju $$4 = new eju($$1, $$2, $$3);
      eju $$5 = this.a($$4);
      Predicate<? super bkq> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends bkq> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new qt("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bkq, T> void a(ht $$0, bku<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ht $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new ejp($$4), bkq::bx);
      if ($$5.isEmpty()) {
         throw new qu("Expected " + $$1.i(), $$4, $$0, this.a.q());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new qt("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new qt("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends blg> void a(ht $$0, bku<E> $$1, cle $$2) {
      ht $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ejp($$3), bkq::bx);
      if ($$4.isEmpty()) {
         throw new qu("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new qu("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bkq & cdf> void b(ht $$0, bku<E> $$1, cle $$2) {
      ht $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ejp($$3), $$0x -> ((bkq)$$0x).bx());
      if ($$4.isEmpty()) {
         throw new qu("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.A().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new qu("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(ht $$0) {
      ht $$1 = this.i($$0);
      dfd $$2 = this.a().c_($$1);
      if ($$2 instanceof dex && !((dex)$$2).ai_()) {
         throw new qt("Container should be empty");
      }
   }

   public void a(ht $$0, cle $$1) {
      ht $$2 = this.i($$0);
      dfd $$3 = this.a().c_($$2);
      if (!($$3 instanceof dex)) {
         throw new qt("Expected a container at " + $$0 + ", found " + jy.l.b($$3.u()));
      } else if (((dex)$$3).a_($$1) != 1) {
         throw new qt("Container should contain: " + $$1);
      }
   }

   public void a(dwz $$0, ht $$1) {
      ht.a($$0).forEach($$2 -> {
         ht $$3 = $$1.b($$2.u() - $$0.g(), $$2.v() - $$0.h(), $$2.w() - $$0.i());
         this.a($$2, $$3);
      });
   }

   public void a(ht $$0, ht $$1) {
      dhi $$2 = this.a($$0);
      dhi $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ht $$1, cle $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ht $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bkq, T> void b(ht $$0, bku<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bkq> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new qt("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bkq, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new qt("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(blg $$0, bkb $$1, int $$2) {
      bkd $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new qt("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(bku<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ht($$1, $$2, $$3));
   }

   public void e(bku<?> $$0, ht $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bku<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ht($$1, $$2, $$3));
   }

   public void f(bku<?> $$0, ht $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void g() {
      this.a.n();
   }

   private void k() {
      if (this.b) {
         throw new IllegalStateException("This test already has final clause");
      } else {
         this.b = true;
      }
   }

   public void a(Runnable $$0) {
      this.k();
      this.a.r().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.k();
      this.a.r().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.k();
      this.a.r().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.q() + $$0, $$1);
   }

   public void h(ht $$0) {
      ht $$1 = this.i($$0);
      ame $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dmr.a $$0, int $$1, int $$2) {
      ht $$3 = this.i(new ht($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ht $$1) {
      throw new qu($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, bkq $$1) {
      throw new qu($$0, $$1.dn(), this.j($$1.dn()), this.i());
   }

   public void a(String $$0) {
      throw new qt($$0);
   }

   public void c(Runnable $$0) {
      this.a.r().a($$0).a(() -> new qt("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public re h() {
      return this.a.r();
   }

   public ht i(ht $$0) {
      ht $$1 = this.a.d();
      ht $$2 = $$1.a((iw)$$0);
      return ebh.a($$2, czw.a, this.a.v(), $$1);
   }

   public ht j(ht $$0) {
      ht $$1 = this.a.d();
      dbm $$2 = this.a.v().a(dbm.c);
      ht $$3 = ebh.a($$0, czw.a, $$2, $$1);
      return $$3.b($$1);
   }

   public eju a(eju $$0) {
      eju $$1 = eju.a(this.a.d());
      return ebh.a($$1.e($$0), czw.a, this.a.v(), this.a.d());
   }

   public eju b(eju $$0) {
      eju $$1 = eju.a(this.a.d());
      return ebh.a($$0.d($$1), czw.a, this.a.v(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new qt($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new qt($$1);
      }
   }

   public long i() {
      return this.a.q();
   }

   public ejp j() {
      return this.a.g();
   }

   private ejp l() {
      ejp $$0 = this.a.g();
      return $$0.a(ht.b.b(this.i(ht.b)));
   }

   public void a(Consumer<ht> $$0) {
      ejp $$1 = this.l();
      ht.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cdu $$0, clj $$1, ht $$2, hx $$3) {
      ht $$4 = this.i($$2.a($$3));
      ejq $$5 = new ejq(eju.b($$4), $$3, $$4, false);
      cnt $$6 = new cnt($$0, biw.a, $$5);
      $$1.a($$6);
   }
}
