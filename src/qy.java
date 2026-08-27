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

public class qy {
   private final qz a;
   private boolean b;

   public qy(qz $$0) {
      this.a = $$0;
   }

   public ama a() {
      return this.a.g();
   }

   public dgw a(ht $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public der b(ht $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(bki.class);
   }

   public void a(Class $$0) {
      ejd $$1 = this.j();
      List<bki> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cdm));
      $$2.forEach(bki::aj);
   }

   public caf a(ckw $$0, float $$1, float $$2, float $$3) {
      ama $$4 = this.a();
      eji $$5 = this.a(new eji((double)$$1, (double)$$2, (double)$$3));
      caf $$6 = new caf($$4, $$5.c, $$5.d, $$5.e, new clb($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public caf a(ckw $$0, ht $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bki> E a(bkm<E> $$0, ht $$1) {
      return this.a($$0, eji.c($$1));
   }

   public <E extends bki> E a(bkm<E> $$0, eji $$1) {
      ama $$2 = this.a();
      E $$3 = $$0.a((crs)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bla $$4) {
            $$4.fJ();
         }

         eji $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dB(), $$3.dD());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bki> E a(bkm<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ht($$1, $$2, $$3));
   }

   public <E extends bki> E a(bkm<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eji((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bla> E b(bkm<E> $$0, ht $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bla> E b(bkm<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ht($$1, $$2, $$3));
   }

   public <E extends bla> E b(bkm<E> $$0, eji $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bla> E b(bkm<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new eji((double)$$1, (double)$$2, (double)$$3));
   }

   public rd a(bla $$0, ht $$1, float $$2) {
      return this.h().a(2, () -> {
         ecv $$3 = $$0.L().a(this.i($$1), 0);
         $$0.L().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ht($$0, $$1, $$2));
   }

   public void c(ht $$0) {
      this.b($$0, $$0x -> $$0x.a(arc.f), () -> "Expected button");
      ht $$1 = this.i($$0);
      dgw $$2 = this.a().a_($$1);
      cvd $$3 = (cvd)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(ht $$0) {
      this.a($$0, this.d());
   }

   public void a(ht $$0, cdm $$1) {
      ht $$2 = this.i($$0);
      this.a($$0, $$1, new eje(eji.b($$2), hx.c, $$2, true));
   }

   public void a(ht $$0, cdm $$1, eje $$2) {
      ht $$3 = this.i($$0);
      dgw $$4 = this.a().a_($$3);
      biq $$5 = $$4.a(this.a(), $$1, bip.a, $$2);
      if (!$$5.a()) {
         cnl $$6 = new cnl($$1, bip.a, $$2);
         $$1.b(bip.a).a($$6);
      }
   }

   public bky a(bky $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cdm c() {
      return new cdm(this.a(), ht.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return false;
         }
      };
   }

   public bky b(bky $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cdm d() {
      return new cdm(this.a(), ht.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
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
   public amb e() {
      amp $$0 = amp.a(new GameProfile(UUID.randomUUID(), "test-mock-player"));
      amb $$1 = new amb(this.a().n(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
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
      this.a().n().ac().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new ht($$0, $$1, $$2));
   }

   public void e(ht $$0) {
      this.a(cuv.dw, $$0);
      ht $$1 = this.i($$0);
      dgw $$2 = this.a().a_($$1);
      czf $$3 = (czf)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(ht $$0, long $$1) {
      this.a($$0, cuv.ha);
      this.b($$1, () -> this.a($$0, cuv.a));
   }

   public void f(ht $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cut $$3) {
      this.a(new ht($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dgw $$3) {
      this.a(new ht($$0, $$1, $$2), $$3);
   }

   public void a(ht $$0, cut $$1) {
      this.a($$0, $$1.o());
   }

   public void a(ht $$0, dgw $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cut $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ht($$1, $$2, $$3));
   }

   public void a(cut $$0, ht $$1) {
      dgw $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cut $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ht($$1, $$2, $$3));
   }

   public void b(cut $$0, ht $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cut $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ht($$1, $$2, $$3));
   }

   public void c(cut $$0, ht $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ht $$0, Predicate<cut> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ht $$0, Predicate<cut> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ht $$0, dhz<T> $$1, T $$2) {
      dgw $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new qt($$6, this.i($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(ht $$0, dhz<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ht $$0, Predicate<dgw> $$1, Supplier<String> $$2) {
      dgw $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new qt($$2.get(), this.i($$0), $$0, this.a.p());
      }
   }

   public void a(ht $$0, hx $$1, IntPredicate $$2, Supplier<String> $$3) {
      ht $$4 = this.i($$0);
      ama $$5 = this.a();
      dgw $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new qt($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void a(bkm<?> $$0) {
      List<? extends bki> $$1 = this.a().a($$0, this.j(), bki::bv);
      if ($$1.isEmpty()) {
         throw new qs("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bkm<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ht($$1, $$2, $$3));
   }

   public void c(bkm<?> $$0, ht $$1) {
      ht $$2 = this.i($$1);
      List<? extends bki> $$3 = this.a().a($$0, new ejd($$2), bki::bv);
      if ($$3.isEmpty()) {
         throw new qt("Expected " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bkm<?> $$0, eji $$1, eji $$2) {
      List<? extends bki> $$3 = this.a().a($$0, new ejd($$1, $$2), bki::bv);
      if ($$3.isEmpty()) {
         throw new qt("Expected " + $$0.i() + " between ", ht.a($$1), ht.a($$2), this.a.p());
      }
   }

   public void a(bkm<?> $$0, ht $$1, int $$2, double $$3) {
      ht $$4 = this.i($$1);
      List<? extends bki> $$5 = this.b((bkm<? extends bki>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new qt("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bkm<?> $$0, ht $$1, double $$2) {
      List<? extends bki> $$3 = this.b((bkm<? extends bki>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ht $$4 = this.i($$1);
         throw new qt("Expected " + $$0.i(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bki> List<T> b(bkm<T> $$0, ht $$1, double $$2) {
      ht $$3 = this.i($$1);
      return this.a().a($$0, new ejd($$3).g($$2), bki::bv);
   }

   public void a(bki $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ht($$1, $$2, $$3));
   }

   public void a(bki $$0, ht $$1) {
      ht $$2 = this.i($$1);
      List<? extends bki> $$3 = this.a().a($$0.ag(), new ejd($$2), bki::bv);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new qt("Expected " + $$0.ag().i(), $$2, $$1, this.a.p()));
   }

   public void a(ckw $$0, ht $$1, double $$2, int $$3) {
      ht $$4 = this.i($$1);
      List<caf> $$5 = this.a().a(bkm.ad, new ejd($$4).g($$2), bki::bv);
      int $$6 = 0;

      for (caf $$7 : $$5) {
         clb $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new qt("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(ckw $$0, ht $$1, double $$2) {
      ht $$3 = this.i($$1);

      for (bki $$5 : this.a().a(bkm.ad, new ejd($$3).g($$2), bki::bv)) {
         caf $$6 = (caf)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new qt("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(ckw $$0, ht $$1, double $$2) {
      ht $$3 = this.i($$1);

      for (bki $$5 : this.a().a(bkm.ad, new ejd($$3).g($$2), bki::bv)) {
         caf $$6 = (caf)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new qt("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(ckw $$0) {
      for (bki $$2 : this.a().a(bkm.ad, this.j(), bki::bv)) {
         caf $$3 = (caf)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new qs("Expected " + $$0.p().getString() + " item");
   }

   public void b(ckw $$0) {
      for (bki $$2 : this.a().a(bkm.ad, this.j(), bki::bv)) {
         caf $$3 = (caf)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new qs("Did not expect " + $$0.p().getString() + " item");
         }
      }
   }

   public void b(bkm<?> $$0) {
      List<? extends bki> $$1 = this.a().a($$0, this.j(), bki::bv);
      if (!$$1.isEmpty()) {
         throw new qs("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bkm<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ht($$1, $$2, $$3));
   }

   public void d(bkm<?> $$0, ht $$1) {
      ht $$2 = this.i($$1);
      List<? extends bki> $$3 = this.a().a($$0, new ejd($$2), bki::bv);
      if (!$$3.isEmpty()) {
         throw new qt("Did not expect " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bkm<?> $$0, double $$1, double $$2, double $$3) {
      eji $$4 = new eji($$1, $$2, $$3);
      eji $$5 = this.a($$4);
      Predicate<? super bki> $$6 = $$1x -> $$1x.cG().a($$5, $$5);
      List<? extends bki> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new qs("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bkm<?> $$0, double $$1, double $$2, double $$3) {
      eji $$4 = new eji($$1, $$2, $$3);
      eji $$5 = this.a($$4);
      Predicate<? super bki> $$6 = $$1x -> !$$1x.cG().a($$5, $$5);
      List<? extends bki> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new qs("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bki, T> void a(ht $$0, bkm<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ht $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new ejd($$4), bki::bv);
      if ($$5.isEmpty()) {
         throw new qt("Expected " + $$1.i(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new qs("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new qs("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bky> void a(ht $$0, bkm<E> $$1, ckw $$2) {
      ht $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ejd($$3), bki::bv);
      if ($$4.isEmpty()) {
         throw new qt("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new qt("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bki & ccx> void b(ht $$0, bkm<E> $$1, ckw $$2) {
      ht $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ejd($$3), $$0x -> ((bki)$$0x).bv());
      if ($$4.isEmpty()) {
         throw new qt("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new qt("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(ht $$0) {
      ht $$1 = this.i($$0);
      der $$2 = this.a().c_($$1);
      if ($$2 instanceof del && !((del)$$2).ai_()) {
         throw new qs("Container should be empty");
      }
   }

   public void a(ht $$0, ckw $$1) {
      ht $$2 = this.i($$0);
      der $$3 = this.a().c_($$2);
      if (!($$3 instanceof del)) {
         throw new qs("Expected a container at " + $$0 + ", found " + jy.l.b($$3.u()));
      } else if (((del)$$3).a_($$1) != 1) {
         throw new qs("Container should contain: " + $$1);
      }
   }

   public void a(dwn $$0, ht $$1) {
      ht.a($$0).forEach($$2 -> {
         ht $$3 = $$1.b($$2.u() - $$0.g(), $$2.v() - $$0.h(), $$2.w() - $$0.i());
         this.a($$2, $$3);
      });
   }

   public void a(ht $$0, ht $$1) {
      dgw $$2 = this.a($$0);
      dgw $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ht $$1, ckw $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ht $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bki, T> void b(ht $$0, bkm<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bki> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new qs("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bki, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new qs("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bky $$0, bjt $$1, int $$2) {
      bjv $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new qs("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(bkm<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ht($$1, $$2, $$3));
   }

   public void e(bkm<?> $$0, ht $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bkm<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ht($$1, $$2, $$3));
   }

   public void f(bkm<?> $$0, ht $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void g() {
      this.a.m();
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
      this.a.q().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.k();
      this.a.q().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.k();
      this.a.q().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.p() + $$0, $$1);
   }

   public void h(ht $$0) {
      ht $$1 = this.i($$0);
      ama $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dmf.a $$0, int $$1, int $$2) {
      ht $$3 = this.i(new ht($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ht $$1) {
      throw new qt($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, bki $$1) {
      throw new qt($$0, $$1.dl(), this.j($$1.dl()), this.i());
   }

   public void a(String $$0) {
      throw new qs($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new qs("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public rd h() {
      return this.a.q();
   }

   public ht i(ht $$0) {
      ht $$1 = this.a.d();
      ht $$2 = $$1.a((iw)$$0);
      return eav.a($$2, czp.a, this.a.u(), $$1);
   }

   public ht j(ht $$0) {
      ht $$1 = this.a.d();
      dbf $$2 = this.a.u().a(dbf.c);
      ht $$3 = eav.a($$0, czp.a, $$2, $$1);
      return $$3.b($$1);
   }

   public eji a(eji $$0) {
      eji $$1 = eji.a(this.a.d());
      return eav.a($$1.e($$0), czp.a, this.a.u(), this.a.d());
   }

   public eji b(eji $$0) {
      eji $$1 = eji.a(this.a.d());
      return eav.a($$0.d($$1), czp.a, this.a.u(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new qs($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new qs($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   public ejd j() {
      return this.a.f();
   }

   private ejd l() {
      ejd $$0 = this.a.f();
      return $$0.a(ht.b.b(this.i(ht.b)));
   }

   public void a(Consumer<ht> $$0) {
      ejd $$1 = this.l();
      ht.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cdm $$0, clb $$1, ht $$2, hx $$3) {
      ht $$4 = this.i($$2.a($$3));
      eje $$5 = new eje(eji.b($$4), $$3, $$4, false);
      cnl $$6 = new cnl($$0, bip.a, $$5);
      $$1.a($$6);
   }
}
