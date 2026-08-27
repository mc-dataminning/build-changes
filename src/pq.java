import com.mojang.authlib.GameProfile;
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

   public aif a() {
      return this.a.g();
   }

   public dcb a(gu $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public czn b(gu $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(bfj.class);
   }

   public void a(Class $$0) {
      eed $$1 = this.k();
      List<bfj> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof byo));
      $$2.forEach(bfj::ah);
   }

   public bvh a(cfu $$0, float $$1, float $$2, float $$3) {
      aif $$4 = this.a();
      eei $$5 = this.a(new eei((double)$$1, (double)$$2, (double)$$3));
      bvh $$6 = new bvh($$4, $$5.c, $$5.d, $$5.e, new cfz($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public bvh a(cfu $$0, gu $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bfj> E a(bfn<E> $$0, gu $$1) {
      return this.a($$0, eei.c($$1));
   }

   public <E extends bfj> E a(bfn<E> $$0, eei $$1) {
      aif $$2 = this.a();
      E $$3 = $$0.a((cmm)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bgb $$4) {
            $$4.fF();
         }

         eei $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dy(), $$3.dA());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bfj> E a(bfn<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new gu($$1, $$2, $$3));
   }

   public <E extends bfj> E a(bfn<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eei((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bgb> E b(bfn<E> $$0, gu $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fU();
      return $$2;
   }

   public <E extends bgb> E b(bfn<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new gu($$1, $$2, $$3));
   }

   public <E extends bgb> E b(bfn<E> $$0, eei $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fU();
      return $$2;
   }

   public <E extends bgb> E b(bfn<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new eei((double)$$1, (double)$$2, (double)$$3));
   }

   public pv a(bgb $$0, gu $$1, float $$2) {
      return this.h().a(2, () -> {
         dxt $$3 = $$0.J().a(this.i($$1), 0);
         $$0.J().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new gu($$0, $$1, $$2));
   }

   public void c(gu $$0) {
      this.b($$0, $$0x -> $$0x.a(amw.f), () -> "Expected button");
      gu $$1 = this.i($$0);
      dcb $$2 = this.a().a_($$1);
      cpw $$3 = (cpw)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(gu $$0) {
      this.a($$0, this.d());
   }

   public void a(gu $$0, byo $$1) {
      gu $$2 = this.i($$0);
      this.a($$0, $$1, new eee(eei.b($$2), ha.c, $$2, true));
   }

   public void a(gu $$0, byo $$1, eee $$2) {
      gu $$3 = this.i($$0);
      dcb $$4 = this.a().a_($$3);
      bdx $$5 = $$4.a(this.a(), $$1, bdw.a, $$2);
      if (!$$5.a()) {
         cij $$6 = new cij($$1, bdw.a, $$2);
         $$1.b(bdw.a).a($$6);
      }
   }

   public bfz a(bfz $$0) {
      $$0.j(0);
      $$0.t(0.25F);
      return $$0;
   }

   public byo c() {
      return new byo(this.a(), gu.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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

   public bfz b(bfz $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public byo d() {
      return new byo(this.a(), gu.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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

   public aig e() {
      aig $$0 = new aig(this.a().n(), this.a(), new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean G_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      this.a().n().ac().a(new sd(up.a), $$0);
      return $$0;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new gu($$0, $$1, $$2));
   }

   public void e(gu $$0) {
      this.a(cpo.dw, $$0);
      gu $$1 = this.i($$0);
      dcb $$2 = this.a().a_($$1);
      ctx $$3 = (ctx)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(gu $$0, long $$1) {
      this.a($$0, cpo.ha);
      this.b($$1, () -> this.a($$0, cpo.a));
   }

   public void f(gu $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cpn $$3) {
      this.a(new gu($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dcb $$3) {
      this.a(new gu($$0, $$1, $$2), $$3);
   }

   public void a(gu $$0, cpn $$1) {
      this.a($$0, $$1.n());
   }

   public void a(gu $$0, dcb $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cpn $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gu($$1, $$2, $$3));
   }

   public void a(cpn $$0, gu $$1) {
      dcb $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.e().getString() + ", got " + $$2.b().e().getString());
   }

   public void b(cpn $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new gu($$1, $$2, $$3));
   }

   public void b(cpn $$0, gu $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.e().getString());
   }

   public void c(cpn $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gu($$1, $$2, $$3));
   }

   public void c(cpn $$0, gu $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(gu $$0, Predicate<cpn> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(gu $$0, Predicate<cpn> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(gu $$0, dde<T> $$1, T $$2) {
      dcb $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new pl($$6, this.i($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(gu $$0, dde<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(gu $$0, Predicate<dcb> $$1, Supplier<String> $$2) {
      dcb $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new pl($$2.get(), this.i($$0), $$0, this.a.p());
      }
   }

   public void a(gu $$0, ha $$1, IntPredicate $$2, Supplier<String> $$3) {
      gu $$4 = this.i($$0);
      aif $$5 = this.a();
      dcb $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new pl($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void a(bfn<?> $$0) {
      List<? extends bfj> $$1 = this.a().a($$0, this.k(), bfj::bs);
      if ($$1.isEmpty()) {
         throw new pk("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bfn<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gu($$1, $$2, $$3));
   }

   public void c(bfn<?> $$0, gu $$1) {
      gu $$2 = this.i($$1);
      List<? extends bfj> $$3 = this.a().a($$0, new eed($$2), bfj::bs);
      if ($$3.isEmpty()) {
         throw new pl("Expected " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bfn<?> $$0, eei $$1, eei $$2) {
      List<? extends bfj> $$3 = this.a().a($$0, new eed($$1, $$2), bfj::bs);
      if ($$3.isEmpty()) {
         throw new pl("Expected " + $$0.i() + " between ", gu.a($$1), gu.a($$2), this.a.p());
      }
   }

   public void a(bfn<?> $$0, gu $$1, int $$2, double $$3) {
      gu $$4 = this.i($$1);
      List<? extends bfj> $$5 = this.b((bfn<? extends bfj>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new pl("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bfn<?> $$0, gu $$1, double $$2) {
      List<? extends bfj> $$3 = this.b((bfn<? extends bfj>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         gu $$4 = this.i($$1);
         throw new pl("Expected " + $$0.i(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bfj> List<T> b(bfn<T> $$0, gu $$1, double $$2) {
      gu $$3 = this.i($$1);
      return this.a().a($$0, new eed($$3).g($$2), bfj::bs);
   }

   public void a(bfj $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gu($$1, $$2, $$3));
   }

   public void a(bfj $$0, gu $$1) {
      gu $$2 = this.i($$1);
      List<? extends bfj> $$3 = this.a().a($$0.ae(), new eed($$2), bfj::bs);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new pl("Expected " + $$0.ae().i(), $$2, $$1, this.a.p()));
   }

   public void a(cfu $$0, gu $$1, double $$2, int $$3) {
      gu $$4 = this.i($$1);
      List<bvh> $$5 = this.a().a(bfn.ad, new eed($$4).g($$2), bfj::bs);
      int $$6 = 0;

      for (bvh $$7 : $$5) {
         cfz $$8 = $$7.j();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new pl("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cfu $$0, gu $$1, double $$2) {
      gu $$3 = this.i($$1);

      for (bfj $$5 : this.a().a(bfn.ad, new eed($$3).g($$2), bfj::bs)) {
         bvh $$6 = (bvh)$$5;
         if ($$6.j().d().equals($$0)) {
            return;
         }
      }

      throw new pl("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cfu $$0, gu $$1, double $$2) {
      gu $$3 = this.i($$1);

      for (bfj $$5 : this.a().a(bfn.ad, new eed($$3).g($$2), bfj::bs)) {
         bvh $$6 = (bvh)$$5;
         if ($$6.j().d().equals($$0)) {
            throw new pl("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void b(bfn<?> $$0) {
      List<? extends bfj> $$1 = this.a().a($$0, this.k(), bfj::bs);
      if (!$$1.isEmpty()) {
         throw new pk("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bfn<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new gu($$1, $$2, $$3));
   }

   public void d(bfn<?> $$0, gu $$1) {
      gu $$2 = this.i($$1);
      List<? extends bfj> $$3 = this.a().a($$0, new eed($$2), bfj::bs);
      if (!$$3.isEmpty()) {
         throw new pl("Did not expect " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bfn<?> $$0, double $$1, double $$2, double $$3) {
      eei $$4 = new eei($$1, $$2, $$3);
      eei $$5 = this.a($$4);
      Predicate<? super bfj> $$6 = $$1x -> $$1x.cE().a($$5, $$5);
      List<? extends bfj> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new pk("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bfn<?> $$0, double $$1, double $$2, double $$3) {
      eei $$4 = new eei($$1, $$2, $$3);
      eei $$5 = this.a($$4);
      Predicate<? super bfj> $$6 = $$1x -> !$$1x.cE().a($$5, $$5);
      List<? extends bfj> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new pk("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bfj, T> void a(gu $$0, bfn<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      gu $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new eed($$4), bfj::bs);
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

   public <E extends bfz> void a(gu $$0, bfn<E> $$1, cfu $$2) {
      gu $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new eed($$3), bfj::bs);
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

   public <E extends bfj & bxz> void b(gu $$0, bfn<E> $$1, cfu $$2) {
      gu $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new eed($$3), $$0x -> ((bfj)$$0x).bs());
      if ($$4.isEmpty()) {
         throw new pl("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.w().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new pl("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(gu $$0) {
      gu $$1 = this.i($$0);
      czn $$2 = this.a().c_($$1);
      if ($$2 instanceof czh && !((czh)$$2).ab_()) {
         throw new pk("Container should be empty");
      }
   }

   public void a(gu $$0, cfu $$1) {
      gu $$2 = this.i($$0);
      czn $$3 = this.a().c_($$2);
      if (!($$3 instanceof czh)) {
         throw new pk("Expected a container at " + $$0 + ", found " + jb.l.b($$3.u()));
      } else if (((czh)$$3).a_($$1) != 1) {
         throw new pk("Container should contain: " + $$1);
      }
   }

   public void a(drs $$0, gu $$1) {
      gu.a($$0).forEach($$2 -> {
         gu $$3 = $$1.b($$2.u() - $$0.g(), $$2.v() - $$0.h(), $$2.w() - $$0.i());
         this.a($$2, $$3);
      });
   }

   public void a(gu $$0, gu $$1) {
      dcb $$2 = this.a($$0);
      dcb $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, gu $$1, cfu $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, gu $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bfj, T> void b(gu $$0, bfn<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bfj> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new pk("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bfj, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new pk("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void e(bfn<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new gu($$1, $$2, $$3));
   }

   public void e(bfn<?> $$0, gu $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bfn<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new gu($$1, $$2, $$3));
   }

   public void f(bfn<?> $$0, gu $$1) {
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
      aif $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dhk.a $$0, int $$1, int $$2) {
      gu $$3 = this.i(new gu($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, gu $$1) {
      throw new pl($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, bfj $$1) {
      throw new pl($$0, $$1.di(), this.j($$1.di()), this.i());
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
      return dvt.a($$2, cui.a, this.a.u(), $$1);
   }

   public gu j(gu $$0) {
      gu $$1 = this.a.d();
      cvz $$2 = this.a.u().a(cvz.c);
      gu $$3 = dvt.a($$0, cui.a, $$2, $$1);
      return $$3.b($$1);
   }

   public eei a(eei $$0) {
      eei $$1 = eei.a(this.a.d());
      return dvt.a($$1.e($$0), cui.a, this.a.u(), this.a.d());
   }

   public eei b(eei $$0) {
      eei $$1 = eei.a(this.a.d());
      return dvt.a($$0.d($$1), cui.a, this.a.u(), this.a.d());
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

   private eed k() {
      return this.a.f();
   }

   private eed l() {
      eed $$0 = this.a.f();
      return $$0.a(gu.b.b(this.i(gu.b)));
   }

   public void a(Consumer<gu> $$0) {
      eed $$1 = this.l();
      gu.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(byo $$0, cfz $$1, gu $$2, ha $$3) {
      gu $$4 = this.i($$2.a($$3));
      eee $$5 = new eee(eei.b($$4), $$3, $$4, false);
      cij $$6 = new cij($$0, bdw.a, $$5);
      $$1.a($$6);
   }
}
