import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class tf {
   private final tg a;
   private boolean b;

   public tf(tg $$0) {
      this.a = $$0;
   }

   public arp a() {
      return this.a.g();
   }

   public dvv a(jh $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dsy> T b(jh $$0) {
      dsy $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new sz("Missing block entity", this.j($$0), $$0, this.a.p());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bul.class);
   }

   public void a(Class $$0) {
      ezt $$1 = this.j();
      List<bul> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cou));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public clc a(cwi $$0, ezy $$1) {
      arp $$2 = this.a();
      ezy $$3 = this.a($$1);
      clc $$4 = new clc($$2, $$3.d, $$3.e, $$3.f, new cwm($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public clc a(cwi $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ezy((double)$$1, (double)$$2, (double)$$3));
   }

   public clc a(cwi $$0, jh $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bul> E a(bus<E> $$0, jh $$1) {
      return this.a($$0, ezy.c($$1));
   }

   public <E extends bul> E a(bus<E> $$0, ezy $$1) {
      arp $$2 = this.a();
      E $$3 = $$0.a($$2, bur.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bvj $$4) {
            $$4.ai();
         }

         ezy $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dL(), $$3.dN());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bul $$0, btb $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bul $$0) {
      $$0.c(this.a());
   }

   public <E extends bul> E a(bus<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bul> E a(bus<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sy("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sy("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         ezy $$6 = this.a(new ezy((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dt().f($$6);
            double $$4x = $$2x.dt().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bul> List<E> b(bus<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, ezy.c(new jh($$1, $$2, $$3)), $$4);
   }

   public <E extends bul> List<E> a(bus<E> $$0, ezy $$1, double $$2) {
      arp $$3 = this.a();
      ezy $$4 = this.a($$1);
      ezt $$5 = this.a.e();
      ezt $$6 = new ezt($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bL());
   }

   public <E extends bul> E a(bus<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bul> E a(bus<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ezy((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bvj> E b(bus<E> $$0, jh $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gf();
      return $$2;
   }

   public <E extends bvj> E b(bus<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bvj> E b(bus<E> $$0, ezy $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gf();
      return $$2;
   }

   public <E extends bvj> E b(bus<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ezy((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bvj $$0, float $$1, float $$2, float $$3) {
      ezy $$4 = this.a(new ezy((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dL(), $$0.dN());
   }

   public tk a(bvj $$0, jh $$1, float $$2) {
      return this.g().a(2, () -> {
         esj $$3 = $$0.L().a(this.j($$1), 0);
         $$0.L().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new jh($$0, $$1, $$2));
   }

   public void c(jh $$0) {
      this.b($$0, $$0x -> $$0x.a(axc.f), () -> "Expected button");
      jh $$1 = this.j($$0);
      dvv $$2 = this.a().a_($$1);
      dja $$3 = (dja)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(jh $$0) {
      this.a($$0, this.a(dfj.b));
   }

   public void a(jh $$0, cou $$1) {
      jh $$2 = this.j($$0);
      this.a($$0, $$1, new ezu(ezy.b($$2), jm.c, $$2, true));
   }

   public void a(jh $$0, cou $$1, ezu $$2) {
      jh $$3 = this.j($$0);
      dvv $$4 = this.a().a_($$3);
      bsj $$5 = bsj.a;
      bsk $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bsk.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            daf $$7 = new daf($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bvh a(bvh $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public bvh b(bvh $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public cou a(final dfj $$0) {
      return new cou(this.a(), jh.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean Y_() {
            return $$0 == dfj.d;
         }

         @Override
         public boolean b() {
            return $$0.g();
         }

         @Override
         public boolean c() {
            return true;
         }
      };
   }

   @Deprecated(
      forRemoval = true
   )
   public arq c() {
      asf $$0 = asf.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      arq $$1 = new arq(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean Y_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      wd $$2 = new wd(zr.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new jh($$0, $$1, $$2));
   }

   public void e(jh $$0) {
      this.a(dis.dw, $$0);
      jh $$1 = this.j($$0);
      dvv $$2 = this.a().a_($$1);
      dnc $$3 = (dnc)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jh $$0, long $$1) {
      this.a($$0, dis.ha);
      this.b($$1, () -> this.a($$0, dis.a));
   }

   public void f(jh $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, diq $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dvv $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(jh $$0, diq $$1) {
      this.a($$0, $$1.m());
   }

   public void a(jh $$0, dvv $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(diq $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(diq $$0, jh $$1) {
      dvv $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(diq $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jh($$1, $$2, $$3));
   }

   public void b(diq $$0, jh $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(diq $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(diq $$0, jh $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jh $$0, Predicate<diq> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(jh $$0, Predicate<diq> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(jh $$0, dwx<T> $$1, T $$2) {
      dvv $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sz($$6, this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(jh $$0, dwx<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(jh $$0, Predicate<dvv> $$1, Supplier<String> $$2) {
      dvv $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sz($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends dsy> void c(jh $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new sz($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public void a(jh $$0, jm $$1, IntPredicate $$2, Supplier<String> $$3) {
      jh $$4 = this.j($$0);
      arp $$5 = this.a();
      dvv $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sz($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void b(bus<?> $$0) {
      List<? extends bul> $$1 = this.a().a($$0, this.j(), bul::bL);
      if ($$1.isEmpty()) {
         throw new sy("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bus<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(bus<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bul> $$3 = this.a().a($$0, new ezt($$2), bul::bL);
      if ($$3.isEmpty()) {
         throw new sz("Expected " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void a(bus<?> $$0, ezt $$1) {
      ezt $$2 = this.a($$1);
      List<? extends bul> $$3 = this.a().a($$0, $$2, bul::bL);
      if ($$3.isEmpty()) {
         throw new sz("Expected " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.p());
      }
   }

   public void a(bus<?> $$0, int $$1) {
      List<? extends bul> $$2 = this.a().a($$0, this.j(), bul::bL);
      if ($$2.size() != $$1) {
         throw new sy("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bus<?> $$0, jh $$1, int $$2, double $$3) {
      jh $$4 = this.j($$1);
      List<? extends bul> $$5 = this.b((bus<? extends bul>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sz("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bus<?> $$0, jh $$1, double $$2) {
      List<? extends bul> $$3 = this.b((bus<? extends bul>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jh $$4 = this.j($$1);
         throw new sz("Expected " + $$0.j(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bul> List<T> b(bus<T> $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);
      return this.a().a($$0, new ezt($$3).g($$2), bul::bL);
   }

   public <T extends bul> List<T> c(bus<T> $$0) {
      return this.a().a($$0, this.j(), bul::bL);
   }

   public void a(bul $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(bul $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bul> $$3 = this.a().a($$0.aq(), new ezt($$2), bul::bL);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sz("Expected " + $$0.aq().j(), $$2, $$1, this.a.p()));
   }

   public void a(cwi $$0, jh $$1, double $$2, int $$3) {
      jh $$4 = this.j($$1);
      List<clc> $$5 = this.a().a(bus.ap, new ezt($$4).g($$2), bul::bL);
      int $$6 = 0;

      for (clc $$7 : $$5) {
         cwm $$8 = $$7.j();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new sz("Expected " + $$3 + " " + $$0.n().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cwi $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bul $$5 : this.a().a(bus.ap, new ezt($$3).g($$2), bul::bL)) {
         clc $$6 = (clc)$$5;
         if ($$6.j().h().equals($$0)) {
            return;
         }
      }

      throw new sz("Expected " + $$0.n().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cwi $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bul $$5 : this.a().a(bus.ap, new ezt($$3).g($$2), bul::bL)) {
         clc $$6 = (clc)$$5;
         if ($$6.j().h().equals($$0)) {
            throw new sz("Did not expect " + $$0.n().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(cwi $$0) {
      for (bul $$2 : this.a().a(bus.ap, this.j(), bul::bL)) {
         clc $$3 = (clc)$$2;
         if ($$3.j().h().equals($$0)) {
            return;
         }
      }

      throw new sy("Expected " + $$0.n().getString() + " item");
   }

   public void b(cwi $$0) {
      for (bul $$2 : this.a().a(bus.ap, this.j(), bul::bL)) {
         clc $$3 = (clc)$$2;
         if ($$3.j().h().equals($$0)) {
            throw new sy("Did not expect " + $$0.n().getString() + " item");
         }
      }
   }

   public void d(bus<?> $$0) {
      List<? extends bul> $$1 = this.a().a($$0, this.j(), bul::bL);
      if (!$$1.isEmpty()) {
         throw new sy("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bus<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jh($$1, $$2, $$3));
   }

   public void d(bus<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bul> $$3 = this.a().a($$0, new ezt($$2), bul::bL);
      if (!$$3.isEmpty()) {
         throw new sz("Did not expect " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void b(bus<?> $$0, ezt $$1) {
      ezt $$2 = this.a($$1);
      List<? extends bul> $$3 = this.a().a($$0, $$2, bul::bL);
      if (!$$3.isEmpty()) {
         throw new sz("Did not expect " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.p());
      }
   }

   public void a(bus<?> $$0, double $$1, double $$2, double $$3) {
      ezy $$4 = new ezy($$1, $$2, $$3);
      ezy $$5 = this.a($$4);
      Predicate<? super bul> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bul> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sy("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bus<?> $$0, double $$1, double $$2, double $$3) {
      ezy $$4 = new ezy($$1, $$2, $$3);
      ezy $$5 = this.a($$4);
      Predicate<? super bul> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bul> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sy("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bul, T> void a(jh $$0, bus<E> $$1, Predicate<E> $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ezt($$3), bul::bL);
      if ($$4.isEmpty()) {
         throw new sz("Expected " + $$1.j(), $$3, $$0, this.a.p());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw new sy("Test failed for entity " + $$5);
            }
         }
      }
   }

   public <E extends bul, T> void a(jh $$0, bus<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jh $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ezt($$4), bul::bL);
      if ($$5.isEmpty()) {
         throw new sz("Expected " + $$1.j(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw new sy("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bvh> void a(jh $$0, bus<E> $$1, cwi $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ezt($$3), bul::bL);
      if ($$4.isEmpty()) {
         throw new sz("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sz("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bul & cod> void b(jh $$0, bus<E> $$1, cwi $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ezt($$3), $$0x -> ((bul)$$0x).bL());
      if ($$4.isEmpty()) {
         throw new sz("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.v().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sz("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(jh $$0) {
      jh $$1 = this.j($$0);
      dsy $$2 = this.a().c_($$1);
      if ($$2 instanceof dss && !((dss)$$2).c()) {
         throw new sy("Container should be empty");
      }
   }

   public void a(jh $$0, cwi $$1) {
      jh $$2 = this.j($$0);
      dsy $$3 = this.a().c_($$2);
      if (!($$3 instanceof dss)) {
         throw new sy("Expected a container at " + $$0 + ", found " + lz.j.b($$3.q()));
      } else if (((dss)$$3).a_($$1) != 1) {
         throw new sy("Container should contain: " + $$1);
      }
   }

   public void a(ema $$0, jh $$1) {
      jh.a($$0).forEach($$2 -> {
         jh $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jh $$0, jh $$1) {
      dvv $$2 = this.a($$0);
      dvv $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, jh $$1, cwi $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jh $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bul, T> void b(jh $$0, bus<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bul $$0, ezt $$1, String $$2) {
      if (!$$1.d(this.b($$0.dt()))) {
         this.a($$2);
      }
   }

   public <E extends bul> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sy("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bul, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sy("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bvh $$0, jq<bto> $$1, int $$2) {
      btq $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sy("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bus<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jh($$1, $$2, $$3));
   }

   public void e(bus<?> $$0, jh $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bus<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jh($$1, $$2, $$3));
   }

   public void f(bus<?> $$0, jh $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void e() {
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

   public void h(jh $$0) {
      jh $$1 = this.j($$0);
      arp $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void i(jh $$0) {
      jh $$1 = this.j($$0);
      arp $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ezt $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jh($$4, $$3, $$5));
         }
      }
   }

   public int a(ebq.a $$0, int $$1, int $$2) {
      jh $$3 = this.j(new jh($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, jh $$1) {
      throw new sz($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, bul $$1) {
      throw new sz($$0, $$1.dv(), this.k($$1.dv()), this.i());
   }

   public void a(String $$0) {
      throw new sy($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new sy("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public tk g() {
      return this.a.q();
   }

   public jh j(jh $$0) {
      jh $$1 = this.a.d();
      jh $$2 = $$1.a((kl)$$0);
      return eqk.a($$2, dnm.a, this.a.u(), $$1);
   }

   public jh k(jh $$0) {
      jh $$1 = this.a.d();
      dpd $$2 = this.a.u().a(dpd.c);
      jh $$3 = eqk.a($$0, dnm.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ezt a(ezt $$0) {
      ezy $$1 = this.a($$0.h());
      ezy $$2 = this.a($$0.i());
      return new ezt($$1, $$2);
   }

   public ezt b(ezt $$0) {
      ezy $$1 = this.b($$0.h());
      ezy $$2 = this.b($$0.i());
      return new ezt($$1, $$2);
   }

   public ezy a(ezy $$0) {
      ezy $$1 = ezy.a(this.a.d());
      return eqk.a($$1.e($$0), dnm.a, this.a.u(), this.a.d());
   }

   public ezy b(ezy $$0) {
      ezy $$1 = ezy.a(this.a.d());
      return eqk.a($$0.d($$1), dnm.a, this.a.u(), this.a.d());
   }

   public dpd h() {
      return this.a.u();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sy($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sy("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sy($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   public ezt j() {
      return this.a.e();
   }

   private ezt l() {
      ezt $$0 = this.a.e();
      dpd $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new ezt(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new ezt(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<jh> $$0) {
      ezt $$1 = this.l().a(1.0, 1.0, 1.0);
      jh.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cou $$0, cwm $$1, jh $$2, jm $$3) {
      jh $$4 = this.j($$2.a($$3));
      ezu $$5 = new ezu(ezy.b($$4), $$3, $$4, false);
      daf $$6 = new daf($$0, bsj.a, $$5);
      $$1.a($$6);
   }

   public void a(ali<dgo> $$0) {
      ezt $$1 = this.j();
      jh $$2 = jh.a($$1.a, $$1.b, $$1.c);
      jh $$3 = jh.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ano.a(this.a(), $$2, $$3, this.a().J_().e(ma.aG).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
