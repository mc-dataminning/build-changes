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

public class rd {
   private final re a;
   private boolean b;

   public rd(re $$0) {
      this.a = $$0;
   }

   public ami a() {
      return this.a.h();
   }

   public dhn a(hx $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public dfi b(hx $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(bkv.class);
   }

   public void a(Class $$0) {
      eju $$1 = this.j();
      List<bkv> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cdz));
      $$2.forEach(bkv::al);
   }

   public cas a(clj $$0, float $$1, float $$2, float $$3) {
      ami $$4 = this.a();
      ejz $$5 = this.a(new ejz((double)$$1, (double)$$2, (double)$$3));
      cas $$6 = new cas($$4, $$5.c, $$5.d, $$5.e, new clo($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public cas a(clj $$0, hx $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bkv> E a(bkz<E> $$0, hx $$1) {
      return this.a($$0, ejz.c($$1));
   }

   public <E extends bkv> E a(bkz<E> $$0, ejz $$1) {
      ami $$2 = this.a();
      E $$3 = $$0.a((csf)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bln $$4) {
            $$4.fK();
         }

         ejz $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dD(), $$3.dF());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bkv> E a(bkz<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new hx($$1, $$2, $$3));
   }

   public <E extends bkv> E a(bkz<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ejz((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bln> E b(bkz<E> $$0, hx $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.ga();
      return $$2;
   }

   public <E extends bln> E b(bkz<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new hx($$1, $$2, $$3));
   }

   public <E extends bln> E b(bkz<E> $$0, ejz $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.ga();
      return $$2;
   }

   public <E extends bln> E b(bkz<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ejz((double)$$1, (double)$$2, (double)$$3));
   }

   public ri a(bln $$0, hx $$1, float $$2) {
      return this.h().a(2, () -> {
         edm $$3 = $$0.N().a(this.i($$1), 0);
         $$0.N().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new hx($$0, $$1, $$2));
   }

   public void c(hx $$0) {
      this.b($$0, $$0x -> $$0x.a(ark.f), () -> "Expected button");
      hx $$1 = this.i($$0);
      dhn $$2 = this.a().a_($$1);
      cvp $$3 = (cvp)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(hx $$0) {
      this.a($$0, this.d());
   }

   public void a(hx $$0, cdz $$1) {
      hx $$2 = this.i($$0);
      this.a($$0, $$1, new ejv(ejz.b($$2), ib.c, $$2, true));
   }

   public void a(hx $$0, cdz $$1, ejv $$2) {
      hx $$3 = this.i($$0);
      dhn $$4 = this.a().a_($$3);
      bjb $$5 = $$4.a(this.a(), $$1, bja.a, $$2);
      if (!$$5.a()) {
         cny $$6 = new cny($$1, bja.a, $$2);
         $$1.b(bja.a).a($$6);
      }
   }

   public bll a(bll $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cdz c() {
      return new cdz(this.a(), hx.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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

   public bll b(bll $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cdz d() {
      return new cdz(this.a(), hx.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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
   public amj e() {
      amx $$0 = amx.a(new GameProfile(UUID.randomUUID(), "test-mock-player"));
      amj $$1 = new amj(this.a().n(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      tw $$2 = new tw(wp.a);
      EmbeddedChannel $$3 = new EmbeddedChannel(new ChannelHandler[]{$$2});
      $$3.attr(tw.e).set(tx.b.b(wp.a));
      this.a().n().ae().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new hx($$0, $$1, $$2));
   }

   public void e(hx $$0) {
      this.a(cvh.dw, $$0);
      hx $$1 = this.i($$0);
      dhn $$2 = this.a().a_($$1);
      czr $$3 = (czr)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(hx $$0, long $$1) {
      this.a($$0, cvh.ha);
      this.b($$1, () -> this.a($$0, cvh.a));
   }

   public void f(hx $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cvf $$3) {
      this.a(new hx($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dhn $$3) {
      this.a(new hx($$0, $$1, $$2), $$3);
   }

   public void a(hx $$0, cvf $$1) {
      this.a($$0, $$1.o());
   }

   public void a(hx $$0, dhn $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cvf $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hx($$1, $$2, $$3));
   }

   public void a(cvf $$0, hx $$1) {
      dhn $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cvf $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new hx($$1, $$2, $$3));
   }

   public void b(cvf $$0, hx $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cvf $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hx($$1, $$2, $$3));
   }

   public void c(cvf $$0, hx $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(hx $$0, Predicate<cvf> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(hx $$0, Predicate<cvf> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(hx $$0, diq<T> $$1, T $$2) {
      dhn $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new qy($$6, this.i($$0), $$0, this.a.q());
      }
   }

   public <T extends Comparable<T>> void a(hx $$0, diq<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(hx $$0, Predicate<dhn> $$1, Supplier<String> $$2) {
      dhn $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new qy($$2.get(), this.i($$0), $$0, this.a.q());
      }
   }

   public void a(hx $$0, ib $$1, IntPredicate $$2, Supplier<String> $$3) {
      hx $$4 = this.i($$0);
      ami $$5 = this.a();
      dhn $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new qy($$3.get(), $$4, $$0, this.a.q());
      }
   }

   public void a(bkz<?> $$0) {
      List<? extends bkv> $$1 = this.a().a($$0, this.j(), bkv::bx);
      if ($$1.isEmpty()) {
         throw new qx("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bkz<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hx($$1, $$2, $$3));
   }

   public void c(bkz<?> $$0, hx $$1) {
      hx $$2 = this.i($$1);
      List<? extends bkv> $$3 = this.a().a($$0, new eju($$2), bkv::bx);
      if ($$3.isEmpty()) {
         throw new qy("Expected " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(bkz<?> $$0, ejz $$1, ejz $$2) {
      List<? extends bkv> $$3 = this.a().a($$0, new eju($$1, $$2), bkv::bx);
      if ($$3.isEmpty()) {
         throw new qy("Expected " + $$0.i() + " between ", hx.a($$1), hx.a($$2), this.a.q());
      }
   }

   public void a(bkz<?> $$0, hx $$1, int $$2, double $$3) {
      hx $$4 = this.i($$1);
      List<? extends bkv> $$5 = this.b((bkz<? extends bkv>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new qy("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.q());
      }
   }

   public void a(bkz<?> $$0, hx $$1, double $$2) {
      List<? extends bkv> $$3 = this.b((bkz<? extends bkv>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         hx $$4 = this.i($$1);
         throw new qy("Expected " + $$0.i(), $$4, $$1, this.a.q());
      }
   }

   public <T extends bkv> List<T> b(bkz<T> $$0, hx $$1, double $$2) {
      hx $$3 = this.i($$1);
      return this.a().a($$0, new eju($$3).g($$2), bkv::bx);
   }

   public void a(bkv $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hx($$1, $$2, $$3));
   }

   public void a(bkv $$0, hx $$1) {
      hx $$2 = this.i($$1);
      List<? extends bkv> $$3 = this.a().a($$0.ai(), new eju($$2), bkv::bx);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new qy("Expected " + $$0.ai().i(), $$2, $$1, this.a.q()));
   }

   public void a(clj $$0, hx $$1, double $$2, int $$3) {
      hx $$4 = this.i($$1);
      List<cas> $$5 = this.a().a(bkz.ad, new eju($$4).g($$2), bkv::bx);
      int $$6 = 0;

      for (cas $$7 : $$5) {
         clo $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new qy("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.q());
      }
   }

   public void a(clj $$0, hx $$1, double $$2) {
      hx $$3 = this.i($$1);

      for (bkv $$5 : this.a().a(bkz.ad, new eju($$3).g($$2), bkv::bx)) {
         cas $$6 = (cas)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new qy("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
   }

   public void b(clj $$0, hx $$1, double $$2) {
      hx $$3 = this.i($$1);

      for (bkv $$5 : this.a().a(bkz.ad, new eju($$3).g($$2), bkv::bx)) {
         cas $$6 = (cas)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new qy("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
         }
      }
   }

   public void a(clj $$0) {
      for (bkv $$2 : this.a().a(bkz.ad, this.j(), bkv::bx)) {
         cas $$3 = (cas)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new qx("Expected " + $$0.p().getString() + " item");
   }

   public void b(clj $$0) {
      for (bkv $$2 : this.a().a(bkz.ad, this.j(), bkv::bx)) {
         cas $$3 = (cas)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new qx("Did not expect " + $$0.p().getString() + " item");
         }
      }
   }

   public void b(bkz<?> $$0) {
      List<? extends bkv> $$1 = this.a().a($$0, this.j(), bkv::bx);
      if (!$$1.isEmpty()) {
         throw new qx("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bkz<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new hx($$1, $$2, $$3));
   }

   public void d(bkz<?> $$0, hx $$1) {
      hx $$2 = this.i($$1);
      List<? extends bkv> $$3 = this.a().a($$0, new eju($$2), bkv::bx);
      if (!$$3.isEmpty()) {
         throw new qy("Did not expect " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(bkz<?> $$0, double $$1, double $$2, double $$3) {
      ejz $$4 = new ejz($$1, $$2, $$3);
      ejz $$5 = this.a($$4);
      Predicate<? super bkv> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends bkv> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new qx("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bkz<?> $$0, double $$1, double $$2, double $$3) {
      ejz $$4 = new ejz($$1, $$2, $$3);
      ejz $$5 = this.a($$4);
      Predicate<? super bkv> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends bkv> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new qx("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bkv, T> void a(hx $$0, bkz<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      hx $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new eju($$4), bkv::bx);
      if ($$5.isEmpty()) {
         throw new qy("Expected " + $$1.i(), $$4, $$0, this.a.q());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new qx("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new qx("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bll> void a(hx $$0, bkz<E> $$1, clj $$2) {
      hx $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new eju($$3), bkv::bx);
      if ($$4.isEmpty()) {
         throw new qy("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new qy("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bkv & cdk> void b(hx $$0, bkz<E> $$1, clj $$2) {
      hx $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new eju($$3), $$0x -> ((bkv)$$0x).bx());
      if ($$4.isEmpty()) {
         throw new qy("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.A().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new qy("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(hx $$0) {
      hx $$1 = this.i($$0);
      dfi $$2 = this.a().c_($$1);
      if ($$2 instanceof dfc && !((dfc)$$2).aj_()) {
         throw new qx("Container should be empty");
      }
   }

   public void a(hx $$0, clj $$1) {
      hx $$2 = this.i($$0);
      dfi $$3 = this.a().c_($$2);
      if (!($$3 instanceof dfc)) {
         throw new qx("Expected a container at " + $$0 + ", found " + kc.l.b($$3.v()));
      } else if (((dfc)$$3).a_($$1) != 1) {
         throw new qx("Container should contain: " + $$1);
      }
   }

   public void a(dxe $$0, hx $$1) {
      hx.a($$0).forEach($$2 -> {
         hx $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(hx $$0, hx $$1) {
      dhn $$2 = this.a($$0);
      dhn $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, hx $$1, clj $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, hx $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bkv, T> void b(hx $$0, bkz<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bkv> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new qx("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bkv, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new qx("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bll $$0, bkg $$1, int $$2) {
      bki $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new qx("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(bkz<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new hx($$1, $$2, $$3));
   }

   public void e(bkz<?> $$0, hx $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bkz<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new hx($$1, $$2, $$3));
   }

   public void f(bkz<?> $$0, hx $$1) {
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

   public void h(hx $$0) {
      hx $$1 = this.i($$0);
      ami $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dmw.a $$0, int $$1, int $$2) {
      hx $$3 = this.i(new hx($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, hx $$1) {
      throw new qy($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, bkv $$1) {
      throw new qy($$0, $$1.dn(), this.j($$1.dn()), this.i());
   }

   public void a(String $$0) {
      throw new qx($$0);
   }

   public void c(Runnable $$0) {
      this.a.r().a($$0).a(() -> new qx("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public ri h() {
      return this.a.r();
   }

   public hx i(hx $$0) {
      hx $$1 = this.a.d();
      hx $$2 = $$1.a((ja)$$0);
      return ebm.a($$2, dab.a, this.a.v(), $$1);
   }

   public hx j(hx $$0) {
      hx $$1 = this.a.d();
      dbr $$2 = this.a.v().a(dbr.c);
      hx $$3 = ebm.a($$0, dab.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ejz a(ejz $$0) {
      ejz $$1 = ejz.a(this.a.d());
      return ebm.a($$1.e($$0), dab.a, this.a.v(), this.a.d());
   }

   public ejz b(ejz $$0) {
      ejz $$1 = ejz.a(this.a.d());
      return ebm.a($$0.d($$1), dab.a, this.a.v(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new qx($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new qx($$1);
      }
   }

   public long i() {
      return this.a.q();
   }

   public eju j() {
      return this.a.g();
   }

   private eju l() {
      eju $$0 = this.a.g();
      return $$0.a(hx.b.b(this.i(hx.b)));
   }

   public void a(Consumer<hx> $$0) {
      eju $$1 = this.l();
      hx.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cdz $$0, clo $$1, hx $$2, ib $$3) {
      hx $$4 = this.i($$2.a($$3));
      ejv $$5 = new ejv(ejz.b($$4), $$3, $$4, false);
      cny $$6 = new cny($$0, bja.a, $$5);
      $$1.a($$6);
   }
}
