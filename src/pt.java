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

public class pt {
   private final pu a;
   private boolean b;

   public pt(pu $$0) {
      this.a = $$0;
   }

   public akn a() {
      return this.a.g();
   }

   public dfe a(gw $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public dcq b(gw $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(bil.class);
   }

   public void a(Class $$0) {
      ehd $$1 = this.k();
      List<bil> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cbp));
      $$2.forEach(bil::aj);
   }

   public byi a(civ $$0, float $$1, float $$2, float $$3) {
      akn $$4 = this.a();
      ehi $$5 = this.a(new ehi((double)$$1, (double)$$2, (double)$$3));
      byi $$6 = new byi($$4, $$5.c, $$5.d, $$5.e, new cja($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public byi a(civ $$0, gw $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bil> E a(bip<E> $$0, gw $$1) {
      return this.a($$0, ehi.c($$1));
   }

   public <E extends bil> E a(bip<E> $$0, ehi $$1) {
      akn $$2 = this.a();
      E $$3 = $$0.a((cpq)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bjd $$4) {
            $$4.fF();
         }

         ehi $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dA(), $$3.dC());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bil> E a(bip<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new gw($$1, $$2, $$3));
   }

   public <E extends bil> E a(bip<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ehi((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bjd> E b(bip<E> $$0, gw $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fV();
      return $$2;
   }

   public <E extends bjd> E b(bip<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new gw($$1, $$2, $$3));
   }

   public <E extends bjd> E b(bip<E> $$0, ehi $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fV();
      return $$2;
   }

   public <E extends bjd> E b(bip<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ehi((double)$$1, (double)$$2, (double)$$3));
   }

   public py a(bjd $$0, gw $$1, float $$2) {
      return this.h().a(2, () -> {
         eaw $$3 = $$0.H().a(this.i($$1), 0);
         $$0.H().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new gw($$0, $$1, $$2));
   }

   public void c(gw $$0) {
      this.b($$0, $$0x -> $$0x.a(apo.f), () -> "Expected button");
      gw $$1 = this.i($$0);
      dfe $$2 = this.a().a_($$1);
      csz $$3 = (csz)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(gw $$0) {
      this.a($$0, this.d());
   }

   public void a(gw $$0, cbp $$1) {
      gw $$2 = this.i($$0);
      this.a($$0, $$1, new ehe(ehi.b($$2), hc.c, $$2, true));
   }

   public void a(gw $$0, cbp $$1, ehe $$2) {
      gw $$3 = this.i($$0);
      dfe $$4 = this.a().a_($$3);
      bgt $$5 = $$4.a(this.a(), $$1, bgs.a, $$2);
      if (!$$5.a()) {
         clk $$6 = new clk($$1, bgs.a, $$2);
         $$1.b(bgs.a).a($$6);
      }
   }

   public bjb a(bjb $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cbp c() {
      return new cbp(this.a(), gw.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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

   public bjb b(bjb $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cbp d() {
      return new cbp(this.a(), gw.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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
   public ako e() {
      ako $$0 = new ako(this.a().n(), this.a(), new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean G_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      sj $$1 = new sj(vb.a);
      EmbeddedChannel $$2 = new EmbeddedChannel(new ChannelHandler[]{$$1});
      $$2.attr(sj.e).set(sk.b.b(vb.a));
      this.a().n().ac().a($$1, $$0, 0);
      return $$0;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new gw($$0, $$1, $$2));
   }

   public void e(gw $$0) {
      this.a(csr.dw, $$0);
      gw $$1 = this.i($$0);
      dfe $$2 = this.a().a_($$1);
      cxa $$3 = (cxa)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(gw $$0, long $$1) {
      this.a($$0, csr.ha);
      this.b($$1, () -> this.a($$0, csr.a));
   }

   public void f(gw $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, csq $$3) {
      this.a(new gw($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dfe $$3) {
      this.a(new gw($$0, $$1, $$2), $$3);
   }

   public void a(gw $$0, csq $$1) {
      this.a($$0, $$1.n());
   }

   public void a(gw $$0, dfe $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(csq $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gw($$1, $$2, $$3));
   }

   public void a(csq $$0, gw $$1) {
      dfe $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.e().getString() + ", got " + $$2.b().e().getString());
   }

   public void b(csq $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new gw($$1, $$2, $$3));
   }

   public void b(csq $$0, gw $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.e().getString());
   }

   public void c(csq $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gw($$1, $$2, $$3));
   }

   public void c(csq $$0, gw $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(gw $$0, Predicate<csq> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(gw $$0, Predicate<csq> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(gw $$0, dgh<T> $$1, T $$2) {
      dfe $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new po($$6, this.i($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(gw $$0, dgh<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(gw $$0, Predicate<dfe> $$1, Supplier<String> $$2) {
      dfe $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new po($$2.get(), this.i($$0), $$0, this.a.p());
      }
   }

   public void a(gw $$0, hc $$1, IntPredicate $$2, Supplier<String> $$3) {
      gw $$4 = this.i($$0);
      akn $$5 = this.a();
      dfe $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new po($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void a(bip<?> $$0) {
      List<? extends bil> $$1 = this.a().a($$0, this.k(), bil::bv);
      if ($$1.isEmpty()) {
         throw new pn("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bip<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gw($$1, $$2, $$3));
   }

   public void c(bip<?> $$0, gw $$1) {
      gw $$2 = this.i($$1);
      List<? extends bil> $$3 = this.a().a($$0, new ehd($$2), bil::bv);
      if ($$3.isEmpty()) {
         throw new po("Expected " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bip<?> $$0, ehi $$1, ehi $$2) {
      List<? extends bil> $$3 = this.a().a($$0, new ehd($$1, $$2), bil::bv);
      if ($$3.isEmpty()) {
         throw new po("Expected " + $$0.i() + " between ", gw.a($$1), gw.a($$2), this.a.p());
      }
   }

   public void a(bip<?> $$0, gw $$1, int $$2, double $$3) {
      gw $$4 = this.i($$1);
      List<? extends bil> $$5 = this.b((bip<? extends bil>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new po("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bip<?> $$0, gw $$1, double $$2) {
      List<? extends bil> $$3 = this.b((bip<? extends bil>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         gw $$4 = this.i($$1);
         throw new po("Expected " + $$0.i(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bil> List<T> b(bip<T> $$0, gw $$1, double $$2) {
      gw $$3 = this.i($$1);
      return this.a().a($$0, new ehd($$3).g($$2), bil::bv);
   }

   public void a(bil $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gw($$1, $$2, $$3));
   }

   public void a(bil $$0, gw $$1) {
      gw $$2 = this.i($$1);
      List<? extends bil> $$3 = this.a().a($$0.ag(), new ehd($$2), bil::bv);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new po("Expected " + $$0.ag().i(), $$2, $$1, this.a.p()));
   }

   public void a(civ $$0, gw $$1, double $$2, int $$3) {
      gw $$4 = this.i($$1);
      List<byi> $$5 = this.a().a(bip.ad, new ehd($$4).g($$2), bil::bv);
      int $$6 = 0;

      for (byi $$7 : $$5) {
         cja $$8 = $$7.j();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new po("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(civ $$0, gw $$1, double $$2) {
      gw $$3 = this.i($$1);

      for (bil $$5 : this.a().a(bip.ad, new ehd($$3).g($$2), bil::bv)) {
         byi $$6 = (byi)$$5;
         if ($$6.j().d().equals($$0)) {
            return;
         }
      }

      throw new po("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(civ $$0, gw $$1, double $$2) {
      gw $$3 = this.i($$1);

      for (bil $$5 : this.a().a(bip.ad, new ehd($$3).g($$2), bil::bv)) {
         byi $$6 = (byi)$$5;
         if ($$6.j().d().equals($$0)) {
            throw new po("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void b(bip<?> $$0) {
      List<? extends bil> $$1 = this.a().a($$0, this.k(), bil::bv);
      if (!$$1.isEmpty()) {
         throw new pn("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bip<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new gw($$1, $$2, $$3));
   }

   public void d(bip<?> $$0, gw $$1) {
      gw $$2 = this.i($$1);
      List<? extends bil> $$3 = this.a().a($$0, new ehd($$2), bil::bv);
      if (!$$3.isEmpty()) {
         throw new po("Did not expect " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bip<?> $$0, double $$1, double $$2, double $$3) {
      ehi $$4 = new ehi($$1, $$2, $$3);
      ehi $$5 = this.a($$4);
      Predicate<? super bil> $$6 = $$1x -> $$1x.cG().a($$5, $$5);
      List<? extends bil> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new pn("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bip<?> $$0, double $$1, double $$2, double $$3) {
      ehi $$4 = new ehi($$1, $$2, $$3);
      ehi $$5 = this.a($$4);
      Predicate<? super bil> $$6 = $$1x -> !$$1x.cG().a($$5, $$5);
      List<? extends bil> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new pn("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bil, T> void a(gw $$0, bip<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      gw $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new ehd($$4), bil::bv);
      if ($$5.isEmpty()) {
         throw new po("Expected " + $$1.i(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new pn("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new pn("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bjb> void a(gw $$0, bip<E> $$1, civ $$2) {
      gw $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ehd($$3), bil::bv);
      if ($$4.isEmpty()) {
         throw new po("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new po("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bil & cba> void b(gw $$0, bip<E> $$1, civ $$2) {
      gw $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ehd($$3), $$0x -> ((bil)$$0x).bv());
      if ($$4.isEmpty()) {
         throw new po("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.t().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new po("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(gw $$0) {
      gw $$1 = this.i($$0);
      dcq $$2 = this.a().c_($$1);
      if ($$2 instanceof dck && !((dck)$$2).aa_()) {
         throw new pn("Container should be empty");
      }
   }

   public void a(gw $$0, civ $$1) {
      gw $$2 = this.i($$0);
      dcq $$3 = this.a().c_($$2);
      if (!($$3 instanceof dck)) {
         throw new pn("Expected a container at " + $$0 + ", found " + jd.l.b($$3.u()));
      } else if (((dck)$$3).a_($$1) != 1) {
         throw new pn("Container should contain: " + $$1);
      }
   }

   public void a(duv $$0, gw $$1) {
      gw.a($$0).forEach($$2 -> {
         gw $$3 = $$1.b($$2.u() - $$0.g(), $$2.v() - $$0.h(), $$2.w() - $$0.i());
         this.a($$2, $$3);
      });
   }

   public void a(gw $$0, gw $$1) {
      dfe $$2 = this.a($$0);
      dfe $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, gw $$1, civ $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, gw $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bil, T> void b(gw $$0, bip<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bil> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new pn("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bil, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new pn("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bjb $$0, bhw $$1, int $$2) {
      bhy $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new pn("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(bip<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new gw($$1, $$2, $$3));
   }

   public void e(bip<?> $$0, gw $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bip<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new gw($$1, $$2, $$3));
   }

   public void f(bip<?> $$0, gw $$1) {
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
      akn $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dkn.a $$0, int $$1, int $$2) {
      gw $$3 = this.i(new gw($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, gw $$1) {
      throw new po($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, bil $$1) {
      throw new po($$0, $$1.dk(), this.j($$1.dk()), this.i());
   }

   public void a(String $$0) {
      throw new pn($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new pn("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public py h() {
      return this.a.q();
   }

   public gw i(gw $$0) {
      gw $$1 = this.a.d();
      gw $$2 = $$1.a((ib)$$0);
      return dyw.a($$2, cxl.a, this.a.u(), $$1);
   }

   public gw j(gw $$0) {
      gw $$1 = this.a.d();
      czc $$2 = this.a.u().a(czc.c);
      gw $$3 = dyw.a($$0, cxl.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ehi a(ehi $$0) {
      ehi $$1 = ehi.a(this.a.d());
      return dyw.a($$1.e($$0), cxl.a, this.a.u(), this.a.d());
   }

   public ehi b(ehi $$0) {
      ehi $$1 = ehi.a(this.a.d());
      return dyw.a($$0.d($$1), cxl.a, this.a.u(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new pn($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new pn($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   private ehd k() {
      return this.a.f();
   }

   private ehd l() {
      ehd $$0 = this.a.f();
      return $$0.a(gw.b.b(this.i(gw.b)));
   }

   public void a(Consumer<gw> $$0) {
      ehd $$1 = this.l();
      gw.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cbp $$0, cja $$1, gw $$2, hc $$3) {
      gw $$4 = this.i($$2.a($$3));
      ehe $$5 = new ehe(ehi.b($$4), $$3, $$4, false);
      clk $$6 = new clk($$0, bgs.a, $$5);
      $$1.a($$6);
   }
}
