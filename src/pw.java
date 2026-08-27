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

public class pw {
   private final px a;
   private boolean b;

   public pw(px $$0) {
      this.a = $$0;
   }

   public akr a() {
      return this.a.g();
   }

   public dfj a(gw $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public dcv b(gw $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(biq.class);
   }

   public void a(Class $$0) {
      ehi $$1 = this.k();
      List<biq> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cbu));
      $$2.forEach(biq::ak);
   }

   public byn a(cja $$0, float $$1, float $$2, float $$3) {
      akr $$4 = this.a();
      ehn $$5 = this.a(new ehn((double)$$1, (double)$$2, (double)$$3));
      byn $$6 = new byn($$4, $$5.c, $$5.d, $$5.e, new cjf($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public byn a(cja $$0, gw $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends biq> E a(biu<E> $$0, gw $$1) {
      return this.a($$0, ehn.c($$1));
   }

   public <E extends biq> E a(biu<E> $$0, ehn $$1) {
      akr $$2 = this.a();
      E $$3 = $$0.a((cpv)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bji $$4) {
            $$4.fI();
         }

         ehn $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dB(), $$3.dD());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends biq> E a(biu<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new gw($$1, $$2, $$3));
   }

   public <E extends biq> E a(biu<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ehn((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bji> E b(biu<E> $$0, gw $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fY();
      return $$2;
   }

   public <E extends bji> E b(biu<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new gw($$1, $$2, $$3));
   }

   public <E extends bji> E b(biu<E> $$0, ehn $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fY();
      return $$2;
   }

   public <E extends bji> E b(biu<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ehn((double)$$1, (double)$$2, (double)$$3));
   }

   public qb a(bji $$0, gw $$1, float $$2) {
      return this.h().a(2, () -> {
         ebb $$3 = $$0.L().a(this.i($$1), 0);
         $$0.L().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new gw($$0, $$1, $$2));
   }

   public void c(gw $$0) {
      this.b($$0, $$0x -> $$0x.a(apt.f), () -> "Expected button");
      gw $$1 = this.i($$0);
      dfj $$2 = this.a().a_($$1);
      cte $$3 = (cte)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(gw $$0) {
      this.a($$0, this.d());
   }

   public void a(gw $$0, cbu $$1) {
      gw $$2 = this.i($$0);
      this.a($$0, $$1, new ehj(ehn.b($$2), hc.c, $$2, true));
   }

   public void a(gw $$0, cbu $$1, ehj $$2) {
      gw $$3 = this.i($$0);
      dfj $$4 = this.a().a_($$3);
      bgy $$5 = $$4.a(this.a(), $$1, bgx.a, $$2);
      if (!$$5.a()) {
         clp $$6 = new clp($$1, bgx.a, $$2);
         $$1.b(bgx.a).a($$6);
      }
   }

   public bjg a(bjg $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cbu c() {
      return new cbu(this.a(), gw.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean M_() {
            return false;
         }

         @Override
         public boolean f() {
            return false;
         }
      };
   }

   public bjg b(bjg $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cbu d() {
      return new cbu(this.a(), gw.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean M_() {
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
   public aks e() {
      alg $$0 = alg.a(new GameProfile(UUID.randomUUID(), "test-mock-player"));
      aks $$1 = new aks(this.a().n(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean M_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      sm $$2 = new sm(ve.a);
      EmbeddedChannel $$3 = new EmbeddedChannel(new ChannelHandler[]{$$2});
      $$3.attr(sm.e).set(sn.b.b(ve.a));
      this.a().n().ac().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new gw($$0, $$1, $$2));
   }

   public void e(gw $$0) {
      this.a(csw.dw, $$0);
      gw $$1 = this.i($$0);
      dfj $$2 = this.a().a_($$1);
      cxf $$3 = (cxf)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(gw $$0, long $$1) {
      this.a($$0, csw.ha);
      this.b($$1, () -> this.a($$0, csw.a));
   }

   public void f(gw $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, csv $$3) {
      this.a(new gw($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dfj $$3) {
      this.a(new gw($$0, $$1, $$2), $$3);
   }

   public void a(gw $$0, csv $$1) {
      this.a($$0, $$1.n());
   }

   public void a(gw $$0, dfj $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(csv $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gw($$1, $$2, $$3));
   }

   public void a(csv $$0, gw $$1) {
      dfj $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.e().getString() + ", got " + $$2.b().e().getString());
   }

   public void b(csv $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new gw($$1, $$2, $$3));
   }

   public void b(csv $$0, gw $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.e().getString());
   }

   public void c(csv $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gw($$1, $$2, $$3));
   }

   public void c(csv $$0, gw $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(gw $$0, Predicate<csv> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(gw $$0, Predicate<csv> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(gw $$0, dgm<T> $$1, T $$2) {
      dfj $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new pr($$6, this.i($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(gw $$0, dgm<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(gw $$0, Predicate<dfj> $$1, Supplier<String> $$2) {
      dfj $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new pr($$2.get(), this.i($$0), $$0, this.a.p());
      }
   }

   public void a(gw $$0, hc $$1, IntPredicate $$2, Supplier<String> $$3) {
      gw $$4 = this.i($$0);
      akr $$5 = this.a();
      dfj $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new pr($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void a(biu<?> $$0) {
      List<? extends biq> $$1 = this.a().a($$0, this.k(), biq::bw);
      if ($$1.isEmpty()) {
         throw new pq("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(biu<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gw($$1, $$2, $$3));
   }

   public void c(biu<?> $$0, gw $$1) {
      gw $$2 = this.i($$1);
      List<? extends biq> $$3 = this.a().a($$0, new ehi($$2), biq::bw);
      if ($$3.isEmpty()) {
         throw new pr("Expected " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(biu<?> $$0, ehn $$1, ehn $$2) {
      List<? extends biq> $$3 = this.a().a($$0, new ehi($$1, $$2), biq::bw);
      if ($$3.isEmpty()) {
         throw new pr("Expected " + $$0.i() + " between ", gw.a($$1), gw.a($$2), this.a.p());
      }
   }

   public void a(biu<?> $$0, gw $$1, int $$2, double $$3) {
      gw $$4 = this.i($$1);
      List<? extends biq> $$5 = this.b((biu<? extends biq>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new pr("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(biu<?> $$0, gw $$1, double $$2) {
      List<? extends biq> $$3 = this.b((biu<? extends biq>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         gw $$4 = this.i($$1);
         throw new pr("Expected " + $$0.i(), $$4, $$1, this.a.p());
      }
   }

   public <T extends biq> List<T> b(biu<T> $$0, gw $$1, double $$2) {
      gw $$3 = this.i($$1);
      return this.a().a($$0, new ehi($$3).g($$2), biq::bw);
   }

   public void a(biq $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gw($$1, $$2, $$3));
   }

   public void a(biq $$0, gw $$1) {
      gw $$2 = this.i($$1);
      List<? extends biq> $$3 = this.a().a($$0.ah(), new ehi($$2), biq::bw);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new pr("Expected " + $$0.ah().i(), $$2, $$1, this.a.p()));
   }

   public void a(cja $$0, gw $$1, double $$2, int $$3) {
      gw $$4 = this.i($$1);
      List<byn> $$5 = this.a().a(biu.ad, new ehi($$4).g($$2), biq::bw);
      int $$6 = 0;

      for (byn $$7 : $$5) {
         cjf $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new pr("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cja $$0, gw $$1, double $$2) {
      gw $$3 = this.i($$1);

      for (biq $$5 : this.a().a(biu.ad, new ehi($$3).g($$2), biq::bw)) {
         byn $$6 = (byn)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new pr("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cja $$0, gw $$1, double $$2) {
      gw $$3 = this.i($$1);

      for (biq $$5 : this.a().a(biu.ad, new ehi($$3).g($$2), biq::bw)) {
         byn $$6 = (byn)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new pr("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void b(biu<?> $$0) {
      List<? extends biq> $$1 = this.a().a($$0, this.k(), biq::bw);
      if (!$$1.isEmpty()) {
         throw new pq("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(biu<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new gw($$1, $$2, $$3));
   }

   public void d(biu<?> $$0, gw $$1) {
      gw $$2 = this.i($$1);
      List<? extends biq> $$3 = this.a().a($$0, new ehi($$2), biq::bw);
      if (!$$3.isEmpty()) {
         throw new pr("Did not expect " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(biu<?> $$0, double $$1, double $$2, double $$3) {
      ehn $$4 = new ehn($$1, $$2, $$3);
      ehn $$5 = this.a($$4);
      Predicate<? super biq> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends biq> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new pq("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(biu<?> $$0, double $$1, double $$2, double $$3) {
      ehn $$4 = new ehn($$1, $$2, $$3);
      ehn $$5 = this.a($$4);
      Predicate<? super biq> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends biq> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new pq("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends biq, T> void a(gw $$0, biu<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      gw $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new ehi($$4), biq::bw);
      if ($$5.isEmpty()) {
         throw new pr("Expected " + $$1.i(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new pq("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new pq("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bjg> void a(gw $$0, biu<E> $$1, cja $$2) {
      gw $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ehi($$3), biq::bw);
      if ($$4.isEmpty()) {
         throw new pr("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new pr("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends biq & cbf> void b(gw $$0, biu<E> $$1, cja $$2) {
      gw $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ehi($$3), $$0x -> ((biq)$$0x).bw());
      if ($$4.isEmpty()) {
         throw new pr("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new pr("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(gw $$0) {
      gw $$1 = this.i($$0);
      dcv $$2 = this.a().c_($$1);
      if ($$2 instanceof dcp && !((dcp)$$2).af_()) {
         throw new pq("Container should be empty");
      }
   }

   public void a(gw $$0, cja $$1) {
      gw $$2 = this.i($$0);
      dcv $$3 = this.a().c_($$2);
      if (!($$3 instanceof dcp)) {
         throw new pq("Expected a container at " + $$0 + ", found " + jd.l.b($$3.u()));
      } else if (((dcp)$$3).a_($$1) != 1) {
         throw new pq("Container should contain: " + $$1);
      }
   }

   public void a(dva $$0, gw $$1) {
      gw.a($$0).forEach($$2 -> {
         gw $$3 = $$1.b($$2.u() - $$0.g(), $$2.v() - $$0.h(), $$2.w() - $$0.i());
         this.a($$2, $$3);
      });
   }

   public void a(gw $$0, gw $$1) {
      dfj $$2 = this.a($$0);
      dfj $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, gw $$1, cja $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, gw $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends biq, T> void b(gw $$0, biu<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends biq> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new pq("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends biq, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new pq("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bjg $$0, bib $$1, int $$2) {
      bid $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new pq("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(biu<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new gw($$1, $$2, $$3));
   }

   public void e(biu<?> $$0, gw $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(biu<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new gw($$1, $$2, $$3));
   }

   public void f(biu<?> $$0, gw $$1) {
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

   public void h(gw $$0) {
      gw $$1 = this.i($$0);
      akr $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dks.a $$0, int $$1, int $$2) {
      gw $$3 = this.i(new gw($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, gw $$1) {
      throw new pr($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, biq $$1) {
      throw new pr($$0, $$1.dl(), this.j($$1.dl()), this.i());
   }

   public void a(String $$0) {
      throw new pq($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new pq("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public qb h() {
      return this.a.q();
   }

   public gw i(gw $$0) {
      gw $$1 = this.a.d();
      gw $$2 = $$1.a((ib)$$0);
      return dzb.a($$2, cxq.a, this.a.u(), $$1);
   }

   public gw j(gw $$0) {
      gw $$1 = this.a.d();
      czh $$2 = this.a.u().a(czh.c);
      gw $$3 = dzb.a($$0, cxq.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ehn a(ehn $$0) {
      ehn $$1 = ehn.a(this.a.d());
      return dzb.a($$1.e($$0), cxq.a, this.a.u(), this.a.d());
   }

   public ehn b(ehn $$0) {
      ehn $$1 = ehn.a(this.a.d());
      return dzb.a($$0.d($$1), cxq.a, this.a.u(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new pq($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new pq($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   private ehi k() {
      return this.a.f();
   }

   private ehi l() {
      ehi $$0 = this.a.f();
      return $$0.a(gw.b.b(this.i(gw.b)));
   }

   public void a(Consumer<gw> $$0) {
      ehi $$1 = this.l();
      gw.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cbu $$0, cjf $$1, gw $$2, hc $$3) {
      gw $$4 = this.i($$2.a($$3));
      ehj $$5 = new ehj(ehn.b($$4), $$3, $$4, false);
      clp $$6 = new clp($$0, bgx.a, $$5);
      $$1.a($$6);
   }
}
