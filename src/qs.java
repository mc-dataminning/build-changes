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

public class qs {
   private final qt a;
   private boolean b;

   public qs(qt $$0) {
      this.a = $$0;
   }

   public alq a() {
      return this.a.g();
   }

   public dgb a(ht $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public ddx b(ht $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(bjt.class);
   }

   public void a(Class $$0) {
      eia $$1 = this.j();
      List<bjt> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof ccx));
      $$2.forEach(bjt::aj);
   }

   public bzq a(cke $$0, float $$1, float $$2, float $$3) {
      alq $$4 = this.a();
      eif $$5 = this.a(new eif((double)$$1, (double)$$2, (double)$$3));
      bzq $$6 = new bzq($$4, $$5.c, $$5.d, $$5.e, new ckj($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public bzq a(cke $$0, ht $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bjt> E a(bjx<E> $$0, ht $$1) {
      return this.a($$0, eif.c($$1));
   }

   public <E extends bjt> E a(bjx<E> $$0, eif $$1) {
      alq $$2 = this.a();
      E $$3 = $$0.a((cqz)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bkl $$4) {
            $$4.fJ();
         }

         eif $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dB(), $$3.dD());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bjt> E a(bjx<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ht($$1, $$2, $$3));
   }

   public <E extends bjt> E a(bjx<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eif((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bkl> E b(bjx<E> $$0, ht $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bkl> E b(bjx<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ht($$1, $$2, $$3));
   }

   public <E extends bkl> E b(bjx<E> $$0, eif $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bkl> E b(bjx<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new eif((double)$$1, (double)$$2, (double)$$3));
   }

   public qx a(bkl $$0, ht $$1, float $$2) {
      return this.h().a(2, () -> {
         ebt $$3 = $$0.L().a(this.i($$1), 0);
         $$0.L().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ht($$0, $$1, $$2));
   }

   public void c(ht $$0) {
      this.b($$0, $$0x -> $$0x.a(aqs.f), () -> "Expected button");
      ht $$1 = this.i($$0);
      dgb $$2 = this.a().a_($$1);
      cuk $$3 = (cuk)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(ht $$0) {
      this.a($$0, this.d());
   }

   public void a(ht $$0, ccx $$1) {
      ht $$2 = this.i($$0);
      this.a($$0, $$1, new eib(eif.b($$2), hx.c, $$2, true));
   }

   public void a(ht $$0, ccx $$1, eib $$2) {
      ht $$3 = this.i($$0);
      dgb $$4 = this.a().a_($$3);
      bib $$5 = $$4.a(this.a(), $$1, bia.a, $$2);
      if (!$$5.a()) {
         cmt $$6 = new cmt($$1, bia.a, $$2);
         $$1.b(bia.a).a($$6);
      }
   }

   public bkj a(bkj $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public ccx c() {
      return new ccx(this.a(), ht.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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

   public bkj b(bkj $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public ccx d() {
      return new ccx(this.a(), ht.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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
   public alr e() {
      amf $$0 = amf.a(new GameProfile(UUID.randomUUID(), "test-mock-player"));
      alr $$1 = new alr(this.a().n(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      tj $$2 = new tj(wc.a);
      EmbeddedChannel $$3 = new EmbeddedChannel(new ChannelHandler[]{$$2});
      $$3.attr(tj.e).set(tk.b.b(wc.a));
      this.a().n().ac().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new ht($$0, $$1, $$2));
   }

   public void e(ht $$0) {
      this.a(cuc.dw, $$0);
      ht $$1 = this.i($$0);
      dgb $$2 = this.a().a_($$1);
      cyl $$3 = (cyl)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(ht $$0, long $$1) {
      this.a($$0, cuc.ha);
      this.b($$1, () -> this.a($$0, cuc.a));
   }

   public void f(ht $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cua $$3) {
      this.a(new ht($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dgb $$3) {
      this.a(new ht($$0, $$1, $$2), $$3);
   }

   public void a(ht $$0, cua $$1) {
      this.a($$0, $$1.o());
   }

   public void a(ht $$0, dgb $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cua $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ht($$1, $$2, $$3));
   }

   public void a(cua $$0, ht $$1) {
      dgb $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cua $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ht($$1, $$2, $$3));
   }

   public void b(cua $$0, ht $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cua $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ht($$1, $$2, $$3));
   }

   public void c(cua $$0, ht $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ht $$0, Predicate<cua> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ht $$0, Predicate<cua> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ht $$0, dhe<T> $$1, T $$2) {
      dgb $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new qn($$6, this.i($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(ht $$0, dhe<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ht $$0, Predicate<dgb> $$1, Supplier<String> $$2) {
      dgb $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new qn($$2.get(), this.i($$0), $$0, this.a.p());
      }
   }

   public void a(ht $$0, hx $$1, IntPredicate $$2, Supplier<String> $$3) {
      ht $$4 = this.i($$0);
      alq $$5 = this.a();
      dgb $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new qn($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void a(bjx<?> $$0) {
      List<? extends bjt> $$1 = this.a().a($$0, this.j(), bjt::bv);
      if ($$1.isEmpty()) {
         throw new qm("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bjx<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ht($$1, $$2, $$3));
   }

   public void c(bjx<?> $$0, ht $$1) {
      ht $$2 = this.i($$1);
      List<? extends bjt> $$3 = this.a().a($$0, new eia($$2), bjt::bv);
      if ($$3.isEmpty()) {
         throw new qn("Expected " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bjx<?> $$0, eif $$1, eif $$2) {
      List<? extends bjt> $$3 = this.a().a($$0, new eia($$1, $$2), bjt::bv);
      if ($$3.isEmpty()) {
         throw new qn("Expected " + $$0.i() + " between ", ht.a($$1), ht.a($$2), this.a.p());
      }
   }

   public void a(bjx<?> $$0, ht $$1, int $$2, double $$3) {
      ht $$4 = this.i($$1);
      List<? extends bjt> $$5 = this.b((bjx<? extends bjt>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new qn("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bjx<?> $$0, ht $$1, double $$2) {
      List<? extends bjt> $$3 = this.b((bjx<? extends bjt>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ht $$4 = this.i($$1);
         throw new qn("Expected " + $$0.i(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bjt> List<T> b(bjx<T> $$0, ht $$1, double $$2) {
      ht $$3 = this.i($$1);
      return this.a().a($$0, new eia($$3).g($$2), bjt::bv);
   }

   public void a(bjt $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ht($$1, $$2, $$3));
   }

   public void a(bjt $$0, ht $$1) {
      ht $$2 = this.i($$1);
      List<? extends bjt> $$3 = this.a().a($$0.ag(), new eia($$2), bjt::bv);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new qn("Expected " + $$0.ag().i(), $$2, $$1, this.a.p()));
   }

   public void a(cke $$0, ht $$1, double $$2, int $$3) {
      ht $$4 = this.i($$1);
      List<bzq> $$5 = this.a().a(bjx.ad, new eia($$4).g($$2), bjt::bv);
      int $$6 = 0;

      for (bzq $$7 : $$5) {
         ckj $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new qn("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cke $$0, ht $$1, double $$2) {
      ht $$3 = this.i($$1);

      for (bjt $$5 : this.a().a(bjx.ad, new eia($$3).g($$2), bjt::bv)) {
         bzq $$6 = (bzq)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new qn("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cke $$0, ht $$1, double $$2) {
      ht $$3 = this.i($$1);

      for (bjt $$5 : this.a().a(bjx.ad, new eia($$3).g($$2), bjt::bv)) {
         bzq $$6 = (bzq)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new qn("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(cke $$0) {
      for (bjt $$2 : this.a().a(bjx.ad, this.j(), bjt::bv)) {
         bzq $$3 = (bzq)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new qm("Expected " + $$0.p().getString() + " item");
   }

   public void b(cke $$0) {
      for (bjt $$2 : this.a().a(bjx.ad, this.j(), bjt::bv)) {
         bzq $$3 = (bzq)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new qm("Did not expect " + $$0.p().getString() + " item");
         }
      }
   }

   public void b(bjx<?> $$0) {
      List<? extends bjt> $$1 = this.a().a($$0, this.j(), bjt::bv);
      if (!$$1.isEmpty()) {
         throw new qm("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bjx<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ht($$1, $$2, $$3));
   }

   public void d(bjx<?> $$0, ht $$1) {
      ht $$2 = this.i($$1);
      List<? extends bjt> $$3 = this.a().a($$0, new eia($$2), bjt::bv);
      if (!$$3.isEmpty()) {
         throw new qn("Did not expect " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bjx<?> $$0, double $$1, double $$2, double $$3) {
      eif $$4 = new eif($$1, $$2, $$3);
      eif $$5 = this.a($$4);
      Predicate<? super bjt> $$6 = $$1x -> $$1x.cG().a($$5, $$5);
      List<? extends bjt> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new qm("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bjx<?> $$0, double $$1, double $$2, double $$3) {
      eif $$4 = new eif($$1, $$2, $$3);
      eif $$5 = this.a($$4);
      Predicate<? super bjt> $$6 = $$1x -> !$$1x.cG().a($$5, $$5);
      List<? extends bjt> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new qm("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bjt, T> void a(ht $$0, bjx<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ht $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new eia($$4), bjt::bv);
      if ($$5.isEmpty()) {
         throw new qn("Expected " + $$1.i(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new qm("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new qm("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bkj> void a(ht $$0, bjx<E> $$1, cke $$2) {
      ht $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new eia($$3), bjt::bv);
      if ($$4.isEmpty()) {
         throw new qn("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new qn("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bjt & cci> void b(ht $$0, bjx<E> $$1, cke $$2) {
      ht $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new eia($$3), $$0x -> ((bjt)$$0x).bv());
      if ($$4.isEmpty()) {
         throw new qn("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new qn("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(ht $$0) {
      ht $$1 = this.i($$0);
      ddx $$2 = this.a().c_($$1);
      if ($$2 instanceof ddr && !((ddr)$$2).ai_()) {
         throw new qm("Container should be empty");
      }
   }

   public void a(ht $$0, cke $$1) {
      ht $$2 = this.i($$0);
      ddx $$3 = this.a().c_($$2);
      if (!($$3 instanceof ddr)) {
         throw new qm("Expected a container at " + $$0 + ", found " + jy.l.b($$3.u()));
      } else if (((ddr)$$3).a_($$1) != 1) {
         throw new qm("Container should contain: " + $$1);
      }
   }

   public void a(dvs $$0, ht $$1) {
      ht.a($$0).forEach($$2 -> {
         ht $$3 = $$1.b($$2.u() - $$0.g(), $$2.v() - $$0.h(), $$2.w() - $$0.i());
         this.a($$2, $$3);
      });
   }

   public void a(ht $$0, ht $$1) {
      dgb $$2 = this.a($$0);
      dgb $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ht $$1, cke $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ht $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bjt, T> void b(ht $$0, bjx<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bjt> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new qm("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bjt, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new qm("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bkj $$0, bje $$1, int $$2) {
      bjg $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new qm("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(bjx<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ht($$1, $$2, $$3));
   }

   public void e(bjx<?> $$0, ht $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bjx<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ht($$1, $$2, $$3));
   }

   public void f(bjx<?> $$0, ht $$1) {
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
      alq $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dlk.a $$0, int $$1, int $$2) {
      ht $$3 = this.i(new ht($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ht $$1) {
      throw new qn($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, bjt $$1) {
      throw new qn($$0, $$1.dl(), this.j($$1.dl()), this.i());
   }

   public void a(String $$0) {
      throw new qm($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new qm("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public qx h() {
      return this.a.q();
   }

   public ht i(ht $$0) {
      ht $$1 = this.a.d();
      ht $$2 = $$1.a((iw)$$0);
      return dzt.a($$2, cyv.a, this.a.u(), $$1);
   }

   public ht j(ht $$0) {
      ht $$1 = this.a.d();
      dal $$2 = this.a.u().a(dal.c);
      ht $$3 = dzt.a($$0, cyv.a, $$2, $$1);
      return $$3.b($$1);
   }

   public eif a(eif $$0) {
      eif $$1 = eif.a(this.a.d());
      return dzt.a($$1.e($$0), cyv.a, this.a.u(), this.a.d());
   }

   public eif b(eif $$0) {
      eif $$1 = eif.a(this.a.d());
      return dzt.a($$0.d($$1), cyv.a, this.a.u(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new qm($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new qm($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   public eia j() {
      return this.a.f();
   }

   private eia l() {
      eia $$0 = this.a.f();
      return $$0.a(ht.b.b(this.i(ht.b)));
   }

   public void a(Consumer<ht> $$0) {
      eia $$1 = this.l();
      ht.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(ccx $$0, ckj $$1, ht $$2, hx $$3) {
      ht $$4 = this.i($$2.a($$3));
      eib $$5 = new eib(eif.b($$4), $$3, $$4, false);
      cmt $$6 = new cmt($$0, bia.a, $$5);
      $$1.a($$6);
   }
}
