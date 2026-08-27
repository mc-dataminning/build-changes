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

public class rj {
   private final rk a;
   private boolean b;

   public rj(rk $$0) {
      this.a = $$0;
   }

   public amp a() {
      return this.a.h();
   }

   public dip a(hv $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public dgd b(hv $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(blf.class);
   }

   public void a(Class $$0) {
      ekw $$1 = this.j();
      List<blf> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cer));
      $$2.forEach(blf::al);
   }

   public cbe a(cmc $$0, float $$1, float $$2, float $$3) {
      amp $$4 = this.a();
      elb $$5 = this.a(new elb((double)$$1, (double)$$2, (double)$$3));
      cbe $$6 = new cbe($$4, $$5.c, $$5.d, $$5.e, new cmh($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public cbe a(cmc $$0, hv $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends blf> E a(blj<E> $$0, hv $$1) {
      return this.a($$0, elb.c($$1));
   }

   public <E extends blf> E a(blj<E> $$0, elb $$1) {
      amp $$2 = this.a();
      E $$3 = $$0.a((csy)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof blx $$4) {
            $$4.fJ();
         }

         elb $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dC(), $$3.dE());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends blf> E a(blj<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new hv($$1, $$2, $$3));
   }

   public <E extends blf> E a(blj<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new elb((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends blx> E b(blj<E> $$0, hv $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends blx> E b(blj<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new hv($$1, $$2, $$3));
   }

   public <E extends blx> E b(blj<E> $$0, elb $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends blx> E b(blj<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new elb((double)$$1, (double)$$2, (double)$$3));
   }

   public ro a(blx $$0, hv $$1, float $$2) {
      return this.h().a(2, () -> {
         eeo $$3 = $$0.N().a(this.i($$1), 0);
         $$0.N().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new hv($$0, $$1, $$2));
   }

   public void c(hv $$0) {
      this.b($$0, $$0x -> $$0x.a(arr.f), () -> "Expected button");
      hv $$1 = this.i($$0);
      dip $$2 = this.a().a_($$1);
      cwj $$3 = (cwj)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(hv $$0) {
      this.a($$0, this.d());
   }

   public void a(hv $$0, cer $$1) {
      hv $$2 = this.i($$0);
      this.a($$0, $$1, new ekx(elb.b($$2), ia.c, $$2, true));
   }

   public void a(hv $$0, cer $$1, ekx $$2) {
      hv $$3 = this.i($$0);
      dip $$4 = this.a().a_($$3);
      bjl $$5 = $$4.a(this.a(), $$1, bjk.a, $$2);
      if (!$$5.a()) {
         cos $$6 = new cos($$1, bjk.a, $$2);
         $$1.b(bjk.a).a($$6);
      }
   }

   public blv a(blv $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cer c() {
      return new cer(this.a(), hv.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return false;
         }
      };
   }

   public blv b(blv $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cer d() {
      return new cer(this.a(), hv.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean P_() {
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
   public amq e() {
      ane $$0 = ane.a(new GameProfile(UUID.randomUUID(), "test-mock-player"));
      amq $$1 = new amq(this.a().n(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      uc $$2 = new uc(wv.a);
      EmbeddedChannel $$3 = new EmbeddedChannel(new ChannelHandler[]{$$2});
      $$3.attr(uc.e).set(ud.b.b(wv.a));
      this.a().n().ae().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new hv($$0, $$1, $$2));
   }

   public void e(hv $$0) {
      this.a(cwb.dw, $$0);
      hv $$1 = this.i($$0);
      dip $$2 = this.a().a_($$1);
      dal $$3 = (dal)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(hv $$0, long $$1) {
      this.a($$0, cwb.ha);
      this.b($$1, () -> this.a($$0, cwb.a));
   }

   public void f(hv $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cvz $$3) {
      this.a(new hv($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dip $$3) {
      this.a(new hv($$0, $$1, $$2), $$3);
   }

   public void a(hv $$0, cvz $$1) {
      this.a($$0, $$1.o());
   }

   public void a(hv $$0, dip $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cvz $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hv($$1, $$2, $$3));
   }

   public void a(cvz $$0, hv $$1) {
      dip $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cvz $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new hv($$1, $$2, $$3));
   }

   public void b(cvz $$0, hv $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cvz $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hv($$1, $$2, $$3));
   }

   public void c(cvz $$0, hv $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(hv $$0, Predicate<cvz> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(hv $$0, Predicate<cvz> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(hv $$0, djs<T> $$1, T $$2) {
      dip $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new re($$6, this.i($$0), $$0, this.a.q());
      }
   }

   public <T extends Comparable<T>> void a(hv $$0, djs<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(hv $$0, Predicate<dip> $$1, Supplier<String> $$2) {
      dip $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new re($$2.get(), this.i($$0), $$0, this.a.q());
      }
   }

   public void a(hv $$0, ia $$1, IntPredicate $$2, Supplier<String> $$3) {
      hv $$4 = this.i($$0);
      amp $$5 = this.a();
      dip $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new re($$3.get(), $$4, $$0, this.a.q());
      }
   }

   public void a(blj<?> $$0) {
      List<? extends blf> $$1 = this.a().a($$0, this.j(), blf::bx);
      if ($$1.isEmpty()) {
         throw new rd("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(blj<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hv($$1, $$2, $$3));
   }

   public void c(blj<?> $$0, hv $$1) {
      hv $$2 = this.i($$1);
      List<? extends blf> $$3 = this.a().a($$0, new ekw($$2), blf::bx);
      if ($$3.isEmpty()) {
         throw new re("Expected " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(blj<?> $$0, elb $$1, elb $$2) {
      List<? extends blf> $$3 = this.a().a($$0, new ekw($$1, $$2), blf::bx);
      if ($$3.isEmpty()) {
         throw new re("Expected " + $$0.i() + " between ", hv.a($$1), hv.a($$2), this.a.q());
      }
   }

   public void a(blj<?> $$0, int $$1) {
      List<? extends blf> $$2 = this.a().a($$0, this.j(), blf::bx);
      if ($$2.size() != $$1) {
         throw new rd("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(blj<?> $$0, hv $$1, int $$2, double $$3) {
      hv $$4 = this.i($$1);
      List<? extends blf> $$5 = this.b((blj<? extends blf>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new re("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.q());
      }
   }

   public void a(blj<?> $$0, hv $$1, double $$2) {
      List<? extends blf> $$3 = this.b((blj<? extends blf>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         hv $$4 = this.i($$1);
         throw new re("Expected " + $$0.i(), $$4, $$1, this.a.q());
      }
   }

   public <T extends blf> List<T> b(blj<T> $$0, hv $$1, double $$2) {
      hv $$3 = this.i($$1);
      return this.a().a($$0, new ekw($$3).g($$2), blf::bx);
   }

   public void a(blf $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hv($$1, $$2, $$3));
   }

   public void a(blf $$0, hv $$1) {
      hv $$2 = this.i($$1);
      List<? extends blf> $$3 = this.a().a($$0.ai(), new ekw($$2), blf::bx);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new re("Expected " + $$0.ai().i(), $$2, $$1, this.a.q()));
   }

   public void a(cmc $$0, hv $$1, double $$2, int $$3) {
      hv $$4 = this.i($$1);
      List<cbe> $$5 = this.a().a(blj.ae, new ekw($$4).g($$2), blf::bx);
      int $$6 = 0;

      for (cbe $$7 : $$5) {
         cmh $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new re("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.q());
      }
   }

   public void a(cmc $$0, hv $$1, double $$2) {
      hv $$3 = this.i($$1);

      for (blf $$5 : this.a().a(blj.ae, new ekw($$3).g($$2), blf::bx)) {
         cbe $$6 = (cbe)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new re("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
   }

   public void b(cmc $$0, hv $$1, double $$2) {
      hv $$3 = this.i($$1);

      for (blf $$5 : this.a().a(blj.ae, new ekw($$3).g($$2), blf::bx)) {
         cbe $$6 = (cbe)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new re("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
         }
      }
   }

   public void a(cmc $$0) {
      for (blf $$2 : this.a().a(blj.ae, this.j(), blf::bx)) {
         cbe $$3 = (cbe)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new rd("Expected " + $$0.p().getString() + " item");
   }

   public void b(cmc $$0) {
      for (blf $$2 : this.a().a(blj.ae, this.j(), blf::bx)) {
         cbe $$3 = (cbe)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new rd("Did not expect " + $$0.p().getString() + " item");
         }
      }
   }

   public void b(blj<?> $$0) {
      List<? extends blf> $$1 = this.a().a($$0, this.j(), blf::bx);
      if (!$$1.isEmpty()) {
         throw new rd("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(blj<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new hv($$1, $$2, $$3));
   }

   public void d(blj<?> $$0, hv $$1) {
      hv $$2 = this.i($$1);
      List<? extends blf> $$3 = this.a().a($$0, new ekw($$2), blf::bx);
      if (!$$3.isEmpty()) {
         throw new re("Did not expect " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(blj<?> $$0, double $$1, double $$2, double $$3) {
      elb $$4 = new elb($$1, $$2, $$3);
      elb $$5 = this.a($$4);
      Predicate<? super blf> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends blf> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new rd("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(blj<?> $$0, double $$1, double $$2, double $$3) {
      elb $$4 = new elb($$1, $$2, $$3);
      elb $$5 = this.a($$4);
      Predicate<? super blf> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends blf> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new rd("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends blf, T> void a(hv $$0, blj<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      hv $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new ekw($$4), blf::bx);
      if ($$5.isEmpty()) {
         throw new re("Expected " + $$1.i(), $$4, $$0, this.a.q());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new rd("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new rd("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends blv> void a(hv $$0, blj<E> $$1, cmc $$2) {
      hv $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ekw($$3), blf::bx);
      if ($$4.isEmpty()) {
         throw new re("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new re("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends blf & cec> void b(hv $$0, blj<E> $$1, cmc $$2) {
      hv $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ekw($$3), $$0x -> ((blf)$$0x).bx());
      if ($$4.isEmpty()) {
         throw new re("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.A().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new re("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(hv $$0) {
      hv $$1 = this.i($$0);
      dgd $$2 = this.a().c_($$1);
      if ($$2 instanceof dfx && !((dfx)$$2).ai_()) {
         throw new rd("Container should be empty");
      }
   }

   public void a(hv $$0, cmc $$1) {
      hv $$2 = this.i($$0);
      dgd $$3 = this.a().c_($$2);
      if (!($$3 instanceof dfx)) {
         throw new rd("Expected a container at " + $$0 + ", found " + kb.k.b($$3.v()));
      } else if (((dfx)$$3).a_($$1) != 1) {
         throw new rd("Container should contain: " + $$1);
      }
   }

   public void a(dyg $$0, hv $$1) {
      hv.a($$0).forEach($$2 -> {
         hv $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(hv $$0, hv $$1) {
      dip $$2 = this.a($$0);
      dip $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, hv $$1, cmc $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, hv $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends blf, T> void b(hv $$0, blj<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends blf> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new rd("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends blf, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new rd("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(blv $$0, bkq $$1, int $$2) {
      bks $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new rd("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(blj<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new hv($$1, $$2, $$3));
   }

   public void e(blj<?> $$0, hv $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(blj<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new hv($$1, $$2, $$3));
   }

   public void f(blj<?> $$0, hv $$1) {
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

   public void h(hv $$0) {
      hv $$1 = this.i($$0);
      amp $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dny.a $$0, int $$1, int $$2) {
      hv $$3 = this.i(new hv($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, hv $$1) {
      throw new re($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, blf $$1) {
      throw new re($$0, $$1.dm(), this.j($$1.dm()), this.i());
   }

   public void a(String $$0) {
      throw new rd($$0);
   }

   public void c(Runnable $$0) {
      this.a.r().a($$0).a(() -> new rd("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public ro h() {
      return this.a.r();
   }

   public hv i(hv $$0) {
      hv $$1 = this.a.d();
      hv $$2 = $$1.a((iz)$$0);
      return eco.a($$2, dav.a, this.a.v(), $$1);
   }

   public hv j(hv $$0) {
      hv $$1 = this.a.d();
      dcl $$2 = this.a.v().a(dcl.c);
      hv $$3 = eco.a($$0, dav.a, $$2, $$1);
      return $$3.b($$1);
   }

   public elb a(elb $$0) {
      elb $$1 = elb.a(this.a.d());
      return eco.a($$1.e($$0), dav.a, this.a.v(), this.a.d());
   }

   public elb b(elb $$0) {
      elb $$1 = elb.a(this.a.d());
      return eco.a($$0.d($$1), dav.a, this.a.v(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new rd($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new rd($$1);
      }
   }

   public long i() {
      return this.a.q();
   }

   public ekw j() {
      return this.a.g();
   }

   private ekw l() {
      ekw $$0 = this.a.g();
      return $$0.a(hv.b.b(this.i(hv.b)));
   }

   public void a(Consumer<hv> $$0) {
      ekw $$1 = this.l();
      hv.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cer $$0, cmh $$1, hv $$2, ia $$3) {
      hv $$4 = this.i($$2.a($$3));
      ekx $$5 = new ekx(elb.b($$4), $$3, $$4, false);
      cos $$6 = new cos($$0, bjk.a, $$5);
      $$1.a($$6);
   }
}
