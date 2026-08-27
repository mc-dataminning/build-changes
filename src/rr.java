import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
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

public class rr {
   private final rs a;
   private boolean b;

   public rr(rs $$0) {
      this.a = $$0;
   }

   public aow a() {
      return this.a.f();
   }

   public dlj a(hz $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dix b(hz $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(bnq.class);
   }

   public void a(Class $$0) {
      enu $$1 = this.k();
      List<bnq> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof chl));
      $$2.forEach(bnq::al);
   }

   public cdw a(coy $$0, float $$1, float $$2, float $$3) {
      aow $$4 = this.a();
      enz $$5 = this.a(new enz((double)$$1, (double)$$2, (double)$$3));
      cdw $$6 = new cdw($$4, $$5.c, $$5.d, $$5.e, new cpd($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public cdw a(coy $$0, hz $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bnq> E a(bnw<E> $$0, hz $$1) {
      return this.a($$0, enz.c($$1));
   }

   public <E extends bnq> E a(bnw<E> $$0, enz $$1) {
      aow $$2 = this.a();
      E $$3 = $$0.a((cvr)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bok $$4) {
            $$4.fL();
         }

         enz $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dC(), $$3.dE());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bnq> E a(bnw<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bnq> E a(bnw<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new rk("Expected " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new rk("Expected only one " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         enz $$6 = this.a(new enz((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dk().f($$6);
            double $$4x = $$2x.dk().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bnq> List<E> b(bnw<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, enz.c(new hz($$1, $$2, $$3)), $$4);
   }

   public <E extends bnq> List<E> a(bnw<E> $$0, enz $$1, double $$2) {
      aow $$3 = this.a();
      enz $$4 = this.a($$1);
      enu $$5 = this.a.d();
      enu $$6 = new enu($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cH().c($$6) && $$1x.bx());
   }

   public <E extends bnq> E a(bnw<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new hz($$1, $$2, $$3));
   }

   public <E extends bnq> E a(bnw<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new enz((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bok> E b(bnw<E> $$0, hz $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gb();
      return $$2;
   }

   public <E extends bok> E b(bnw<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new hz($$1, $$2, $$3));
   }

   public <E extends bok> E b(bnw<E> $$0, enz $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gb();
      return $$2;
   }

   public <E extends bok> E b(bnw<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new enz((double)$$1, (double)$$2, (double)$$3));
   }

   public rw a(bok $$0, hz $$1, float $$2) {
      return this.i().a(2, () -> {
         ehl $$3 = $$0.N().a(this.j($$1), 0);
         $$0.N().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new hz($$0, $$1, $$2));
   }

   public void c(hz $$0) {
      this.b($$0, $$0x -> $$0x.a(aua.f), () -> "Expected button");
      hz $$1 = this.j($$0);
      dlj $$2 = this.a().a_($$1);
      czc $$3 = (czc)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(hz $$0) {
      this.a($$0, this.d());
   }

   public void a(hz $$0, chl $$1) {
      hz $$2 = this.j($$0);
      this.a($$0, $$1, new env(enz.b($$2), ie.c, $$2, true));
   }

   public void a(hz $$0, chl $$1, env $$2) {
      hz $$3 = this.j($$0);
      dlj $$4 = this.a().a_($$3);
      blv $$5 = blv.a;
      bly $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bly.d || !$$4.a(this.a(), $$1, $$2).a()) {
            crm $$7 = new crm($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public boi a(boi $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public chl c() {
      return new chl(this.a(), hz.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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

   public boi b(boi $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public chl d() {
      return new chl(this.a(), hz.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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
   public aox e() {
      apl $$0 = apl.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aox $$1 = new aox(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      uo $$2 = new uo(xy.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new hz($$0, $$1, $$2));
   }

   public void e(hz $$0) {
      this.a(cyu.dw, $$0);
      hz $$1 = this.j($$0);
      dlj $$2 = this.a().a_($$1);
      dde $$3 = (dde)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(hz $$0, long $$1) {
      this.a($$0, cyu.ha);
      this.b($$1, () -> this.a($$0, cyu.a));
   }

   public void f(hz $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cys $$3) {
      this.a(new hz($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dlj $$3) {
      this.a(new hz($$0, $$1, $$2), $$3);
   }

   public void a(hz $$0, cys $$1) {
      this.a($$0, $$1.o());
   }

   public void a(hz $$0, dlj $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cys $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hz($$1, $$2, $$3));
   }

   public void a(cys $$0, hz $$1) {
      dlj $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cys $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new hz($$1, $$2, $$3));
   }

   public void b(cys $$0, hz $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cys $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hz($$1, $$2, $$3));
   }

   public void c(cys $$0, hz $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(hz $$0, Predicate<cys> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(hz $$0, Predicate<cys> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(hz $$0, dmm<T> $$1, T $$2) {
      dlj $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new rl($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(hz $$0, dmm<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(hz $$0, Predicate<dlj> $$1, Supplier<String> $$2) {
      dlj $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new rl($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(hz $$0, ie $$1, IntPredicate $$2, Supplier<String> $$3) {
      hz $$4 = this.j($$0);
      aow $$5 = this.a();
      dlj $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new rl($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bnw<?> $$0) {
      List<? extends bnq> $$1 = this.a().a($$0, this.k(), bnq::bx);
      if ($$1.isEmpty()) {
         throw new rk("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bnw<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hz($$1, $$2, $$3));
   }

   public void c(bnw<?> $$0, hz $$1) {
      hz $$2 = this.j($$1);
      List<? extends bnq> $$3 = this.a().a($$0, new enu($$2), bnq::bx);
      if ($$3.isEmpty()) {
         throw new rl("Expected " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bnw<?> $$0, enz $$1, enz $$2) {
      List<? extends bnq> $$3 = this.a().a($$0, new enu($$1, $$2), bnq::bx);
      if ($$3.isEmpty()) {
         throw new rl("Expected " + $$0.i() + " between ", hz.a($$1), hz.a($$2), this.a.o());
      }
   }

   public void a(bnw<?> $$0, int $$1) {
      List<? extends bnq> $$2 = this.a().a($$0, this.k(), bnq::bx);
      if ($$2.size() != $$1) {
         throw new rk("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(bnw<?> $$0, hz $$1, int $$2, double $$3) {
      hz $$4 = this.j($$1);
      List<? extends bnq> $$5 = this.b((bnw<? extends bnq>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new rl("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bnw<?> $$0, hz $$1, double $$2) {
      List<? extends bnq> $$3 = this.b((bnw<? extends bnq>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         hz $$4 = this.j($$1);
         throw new rl("Expected " + $$0.i(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bnq> List<T> b(bnw<T> $$0, hz $$1, double $$2) {
      hz $$3 = this.j($$1);
      return this.a().a($$0, new enu($$3).g($$2), bnq::bx);
   }

   public <T extends bnq> List<T> c(bnw<T> $$0) {
      return this.a().a($$0, this.k(), bnq::bx);
   }

   public void a(bnq $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hz($$1, $$2, $$3));
   }

   public void a(bnq $$0, hz $$1) {
      hz $$2 = this.j($$1);
      List<? extends bnq> $$3 = this.a().a($$0.ai(), new enu($$2), bnq::bx);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new rl("Expected " + $$0.ai().i(), $$2, $$1, this.a.o()));
   }

   public void a(coy $$0, hz $$1, double $$2, int $$3) {
      hz $$4 = this.j($$1);
      List<cdw> $$5 = this.a().a(bnw.af, new enu($$4).g($$2), bnq::bx);
      int $$6 = 0;

      for (cdw $$7 : $$5) {
         cpd $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw new rl("Expected " + $$3 + " " + $$0.o().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(coy $$0, hz $$1, double $$2) {
      hz $$3 = this.j($$1);

      for (bnq $$5 : this.a().a(bnw.af, new enu($$3).g($$2), bnq::bx)) {
         cdw $$6 = (cdw)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new rl("Expected " + $$0.o().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(coy $$0, hz $$1, double $$2) {
      hz $$3 = this.j($$1);

      for (bnq $$5 : this.a().a(bnw.af, new enu($$3).g($$2), bnq::bx)) {
         cdw $$6 = (cdw)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new rl("Did not expect " + $$0.o().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(coy $$0) {
      for (bnq $$2 : this.a().a(bnw.af, this.k(), bnq::bx)) {
         cdw $$3 = (cdw)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new rk("Expected " + $$0.o().getString() + " item");
   }

   public void b(coy $$0) {
      for (bnq $$2 : this.a().a(bnw.af, this.k(), bnq::bx)) {
         cdw $$3 = (cdw)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new rk("Did not expect " + $$0.o().getString() + " item");
         }
      }
   }

   public void d(bnw<?> $$0) {
      List<? extends bnq> $$1 = this.a().a($$0, this.k(), bnq::bx);
      if (!$$1.isEmpty()) {
         throw new rk("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bnw<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new hz($$1, $$2, $$3));
   }

   public void d(bnw<?> $$0, hz $$1) {
      hz $$2 = this.j($$1);
      List<? extends bnq> $$3 = this.a().a($$0, new enu($$2), bnq::bx);
      if (!$$3.isEmpty()) {
         throw new rl("Did not expect " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bnw<?> $$0, double $$1, double $$2, double $$3) {
      enz $$4 = new enz($$1, $$2, $$3);
      enz $$5 = this.a($$4);
      Predicate<? super bnq> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends bnq> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new rk("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bnw<?> $$0, double $$1, double $$2, double $$3) {
      enz $$4 = new enz($$1, $$2, $$3);
      enz $$5 = this.a($$4);
      Predicate<? super bnq> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends bnq> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new rk("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bnq, T> void a(hz $$0, bnw<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      hz $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new enu($$4), bnq::bx);
      if ($$5.isEmpty()) {
         throw new rl("Expected " + $$1.i(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new rk("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new rk("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends boi> void a(hz $$0, bnw<E> $$1, coy $$2) {
      hz $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new enu($$3), bnq::bx);
      if ($$4.isEmpty()) {
         throw new rl("Expected entity of type: " + $$1, $$3, $$0, this.j());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new rl("Entity should be holding: " + $$2, $$3, $$0, this.j());
      }
   }

   public <E extends bnq & cgw> void b(hz $$0, bnw<E> $$1, coy $$2) {
      hz $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new enu($$3), $$0x -> ((bnq)$$0x).bx());
      if ($$4.isEmpty()) {
         throw new rl("Expected " + $$1.i() + " to exist", $$3, $$0, this.j());
      } else {
         for (E $$5 : $$4) {
            if ($$5.A().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new rl("Entity inventory should contain: " + $$2, $$3, $$0, this.j());
      }
   }

   public void g(hz $$0) {
      hz $$1 = this.j($$0);
      dix $$2 = this.a().c_($$1);
      if ($$2 instanceof dir && !((dir)$$2).aj_()) {
         throw new rk("Container should be empty");
      }
   }

   public void a(hz $$0, coy $$1) {
      hz $$2 = this.j($$0);
      dix $$3 = this.a().c_($$2);
      if (!($$3 instanceof dir)) {
         throw new rk("Expected a container at " + $$0 + ", found " + kf.k.b($$3.v()));
      } else if (((dir)$$3).a_($$1) != 1) {
         throw new rk("Container should contain: " + $$1);
      }
   }

   public void a(ebd $$0, hz $$1) {
      hz.a($$0).forEach($$2 -> {
         hz $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(hz $$0, hz $$1) {
      dlj $$2 = this.a($$0);
      dlj $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, hz $$1, coy $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, hz $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bnq, T> void b(hz $$0, bnw<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bnq> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new rk("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bnq, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new rk("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(boi $$0, ij<bnb> $$1, int $$2) {
      bnd $$3 = $$0.c($$1);
      if ($$3 == null || $$3.d() != $$2) {
         int $$4 = $$2 + 1;
         throw new rk("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bnw<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new hz($$1, $$2, $$3));
   }

   public void e(bnw<?> $$0, hz $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bnw<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new hz($$1, $$2, $$3));
   }

   public void f(bnw<?> $$0, hz $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void g() {
      this.a.l();
   }

   private void l() {
      if (this.b) {
         throw new IllegalStateException("This test already has final clause");
      } else {
         this.b = true;
      }
   }

   public void a(Runnable $$0) {
      this.l();
      this.a.p().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.l();
      this.a.p().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.l();
      this.a.p().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.o() + $$0, $$1);
   }

   public void h(hz $$0) {
      hz $$1 = this.j($$0);
      aow $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(hz $$0) {
      hz $$1 = this.j($$0);
      aow $$2 = this.a();
      $$2.a($$1);
   }

   public void h() {
      enu $$0 = this.m();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new hz($$4, $$3, $$5));
         }
      }
   }

   public int a(dqv.a $$0, int $$1, int $$2) {
      hz $$3 = this.j(new hz($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, hz $$1) {
      throw new rl($$0, this.j($$1), $$1, this.j());
   }

   public void a(String $$0, bnq $$1) {
      throw new rl($$0, $$1.dm(), this.k($$1.dm()), this.j());
   }

   public void a(String $$0) {
      throw new rk($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new rk("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public rw i() {
      return this.a.p();
   }

   public hz j(hz $$0) {
      hz $$1 = this.a.c();
      hz $$2 = $$1.a((jd)$$0);
      return efl.a($$2, ddo.a, this.a.t(), $$1);
   }

   public hz k(hz $$0) {
      hz $$1 = this.a.c();
      dfe $$2 = this.a.t().a(dfe.c);
      hz $$3 = efl.a($$0, ddo.a, $$2, $$1);
      return $$3.b($$1);
   }

   public enz a(enz $$0) {
      enz $$1 = enz.a(this.a.c());
      return efl.a($$1.e($$0), ddo.a, this.a.t(), this.a.c());
   }

   public enz b(enz $$0) {
      enz $$1 = enz.a(this.a.c());
      return efl.a($$0.d($$1), ddo.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new rk($$1);
      }
   }

   public <N extends Number> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new rk("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new rk($$1);
      }
   }

   public long j() {
      return this.a.o();
   }

   public enu k() {
      return this.a.d();
   }

   private enu m() {
      enu $$0 = this.a.d();
      return $$0.a(hz.c.b(this.j(hz.c)));
   }

   public void a(Consumer<hz> $$0) {
      enu $$1 = this.m().a(1.0, 1.0, 1.0);
      hz.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(chl $$0, cpd $$1, hz $$2, ie $$3) {
      hz $$4 = this.j($$2.a($$3));
      env $$5 = new env(enz.b($$4), $$3, $$4, false);
      crm $$6 = new crm($$0, blv.a, $$5);
      $$1.a($$6);
   }

   public void a(aix<cwq> $$0) {
      enu $$1 = this.k();
      hz $$2 = hz.a($$1.a, $$1.b, $$1.c);
      hz $$3 = hz.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ala.a(this.a(), $$2, $$3, this.a().I_().d(kg.at).f($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
