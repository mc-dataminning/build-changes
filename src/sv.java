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

public class sv {
   private final sw a;
   private boolean b;

   public sv(sw $$0) {
      this.a = $$0;
   }

   public aqh a() {
      return this.a.f();
   }

   public dqh a(in $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dnm b(in $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(brh.class);
   }

   public void a(Class $$0) {
      etk $$1 = this.i();
      List<brh> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof clh));
      $$2.forEach(brh::al);
   }

   public chr a(csu $$0, etp $$1) {
      aqh $$2 = this.a();
      etp $$3 = this.a($$1);
      chr $$4 = new chr($$2, $$3.c, $$3.d, $$3.e, new csz($$0, 1));
      $$4.o(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public chr a(csu $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new etp((double)$$1, (double)$$2, (double)$$3));
   }

   public chr a(csu $$0, in $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends brh> E a(brn<E> $$0, in $$1) {
      return this.a($$0, etp.c($$1));
   }

   public <E extends brh> E a(brn<E> $$0, etp $$1) {
      aqh $$2 = this.a();
      E $$3 = $$0.a((dad)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bsc $$4) {
            $$4.fT();
         }

         etp $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dD(), $$3.dF());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends brh> E a(brn<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends brh> E a(brn<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new so("Expected " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new so("Expected only one " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         etp $$6 = this.a(new etp((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dl().f($$6);
            double $$4x = $$2x.dl().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends brh> List<E> b(brn<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, etp.c(new in($$1, $$2, $$3)), $$4);
   }

   public <E extends brh> List<E> a(brn<E> $$0, etp $$1, double $$2) {
      aqh $$3 = this.a();
      etp $$4 = this.a($$1);
      etk $$5 = this.a.d();
      etk $$6 = new etk($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cI().c($$6) && $$1x.bB());
   }

   public <E extends brh> E a(brn<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new in($$1, $$2, $$3));
   }

   public <E extends brh> E a(brn<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new etp((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bsc> E b(brn<E> $$0, in $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gk();
      return $$2;
   }

   public <E extends bsc> E b(brn<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new in($$1, $$2, $$3));
   }

   public <E extends bsc> E b(brn<E> $$0, etp $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gk();
      return $$2;
   }

   public <E extends bsc> E b(brn<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new etp((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bsc $$0, float $$1, float $$2, float $$3) {
      etp $$4 = this.a(new etp((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dD(), $$0.dF());
   }

   public ta a(bsc $$0, in $$1, float $$2) {
      return this.g().a(2, () -> {
         emo $$3 = $$0.K().a(this.j($$1), 0);
         $$0.K().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new in($$0, $$1, $$2));
   }

   public void c(in $$0) {
      this.b($$0, $$0x -> $$0x.a(avr.f), () -> "Expected button");
      in $$1 = this.j($$0);
      dqh $$2 = this.a().a_($$1);
      ddo $$3 = (ddo)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(in $$0) {
      this.a($$0, this.a(daa.b));
   }

   public void a(in $$0, clh $$1) {
      in $$2 = this.j($$0);
      this.a($$0, $$1, new etl(etp.b($$2), is.c, $$2, true));
   }

   public void a(in $$0, clh $$1, etl $$2) {
      in $$3 = this.j($$0);
      dqh $$4 = this.a().a_($$3);
      bpl $$5 = bpl.a;
      bpo $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bpo.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cwk $$7 = new cwk($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bsa a(bsa $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public bsa b(bsa $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public clh a(final daa $$0) {
      return new clh(this.a(), in.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return $$0 == daa.d;
         }

         @Override
         public boolean f() {
            return $$0.g();
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
   public aqi c() {
      aqw $$0 = aqw.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aqi $$1 = new aqi(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      vs $$2 = new vs(zc.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new in($$0, $$1, $$2));
   }

   public void e(in $$0) {
      this.a(ddg.dw, $$0);
      in $$1 = this.j($$0);
      dqh $$2 = this.a().a_($$1);
      dhr $$3 = (dhr)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(in $$0, long $$1) {
      this.a($$0, ddg.ha);
      this.b($$1, () -> this.a($$0, ddg.a));
   }

   public void f(in $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dde $$3) {
      this.a(new in($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dqh $$3) {
      this.a(new in($$0, $$1, $$2), $$3);
   }

   public void a(in $$0, dde $$1) {
      this.a($$0, $$1.n());
   }

   public void a(in $$0, dqh $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dde $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new in($$1, $$2, $$3));
   }

   public void a(dde $$0, in $$1) {
      dqh $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dde $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new in($$1, $$2, $$3));
   }

   public void b(dde $$0, in $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dde $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new in($$1, $$2, $$3));
   }

   public void c(dde $$0, in $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(in $$0, Predicate<dde> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(in $$0, Predicate<dde> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(in $$0, drk<T> $$1, T $$2) {
      dqh $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sp($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(in $$0, drk<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(in $$0, Predicate<dqh> $$1, Supplier<String> $$2) {
      dqh $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sp($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(in $$0, is $$1, IntPredicate $$2, Supplier<String> $$3) {
      in $$4 = this.j($$0);
      aqh $$5 = this.a();
      dqh $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sp($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(brn<?> $$0) {
      List<? extends brh> $$1 = this.a().a($$0, this.i(), brh::bB);
      if ($$1.isEmpty()) {
         throw new so("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(brn<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new in($$1, $$2, $$3));
   }

   public void c(brn<?> $$0, in $$1) {
      in $$2 = this.j($$1);
      List<? extends brh> $$3 = this.a().a($$0, new etk($$2), brh::bB);
      if ($$3.isEmpty()) {
         throw new sp("Expected " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(brn<?> $$0, etp $$1, etp $$2) {
      List<? extends brh> $$3 = this.a().a($$0, new etk($$1, $$2), brh::bB);
      if ($$3.isEmpty()) {
         throw new sp("Expected " + $$0.i() + " between ", in.a($$1), in.a($$2), this.a.o());
      }
   }

   public void a(brn<?> $$0, int $$1) {
      List<? extends brh> $$2 = this.a().a($$0, this.i(), brh::bB);
      if ($$2.size() != $$1) {
         throw new so("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(brn<?> $$0, in $$1, int $$2, double $$3) {
      in $$4 = this.j($$1);
      List<? extends brh> $$5 = this.b((brn<? extends brh>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sp("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(brn<?> $$0, in $$1, double $$2) {
      List<? extends brh> $$3 = this.b((brn<? extends brh>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         in $$4 = this.j($$1);
         throw new sp("Expected " + $$0.i(), $$4, $$1, this.a.o());
      }
   }

   public <T extends brh> List<T> b(brn<T> $$0, in $$1, double $$2) {
      in $$3 = this.j($$1);
      return this.a().a($$0, new etk($$3).g($$2), brh::bB);
   }

   public <T extends brh> List<T> c(brn<T> $$0) {
      return this.a().a($$0, this.i(), brh::bB);
   }

   public void a(brh $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new in($$1, $$2, $$3));
   }

   public void a(brh $$0, in $$1) {
      in $$2 = this.j($$1);
      List<? extends brh> $$3 = this.a().a($$0.ai(), new etk($$2), brh::bB);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sp("Expected " + $$0.ai().i(), $$2, $$1, this.a.o()));
   }

   public void a(csu $$0, in $$1, double $$2, int $$3) {
      in $$4 = this.j($$1);
      List<chr> $$5 = this.a().a(brn.ag, new etk($$4).g($$2), brh::bB);
      int $$6 = 0;

      for (chr $$7 : $$5) {
         csz $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.G();
         }
      }

      if ($$6 != $$3) {
         throw new sp("Expected " + $$3 + " " + $$0.r().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(csu $$0, in $$1, double $$2) {
      in $$3 = this.j($$1);

      for (brh $$5 : this.a().a(brn.ag, new etk($$3).g($$2), brh::bB)) {
         chr $$6 = (chr)$$5;
         if ($$6.p().f().equals($$0)) {
            return;
         }
      }

      throw new sp("Expected " + $$0.r().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(csu $$0, in $$1, double $$2) {
      in $$3 = this.j($$1);

      for (brh $$5 : this.a().a(brn.ag, new etk($$3).g($$2), brh::bB)) {
         chr $$6 = (chr)$$5;
         if ($$6.p().f().equals($$0)) {
            throw new sp("Did not expect " + $$0.r().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(csu $$0) {
      for (brh $$2 : this.a().a(brn.ag, this.i(), brh::bB)) {
         chr $$3 = (chr)$$2;
         if ($$3.p().f().equals($$0)) {
            return;
         }
      }

      throw new so("Expected " + $$0.r().getString() + " item");
   }

   public void b(csu $$0) {
      for (brh $$2 : this.a().a(brn.ag, this.i(), brh::bB)) {
         chr $$3 = (chr)$$2;
         if ($$3.p().f().equals($$0)) {
            throw new so("Did not expect " + $$0.r().getString() + " item");
         }
      }
   }

   public void d(brn<?> $$0) {
      List<? extends brh> $$1 = this.a().a($$0, this.i(), brh::bB);
      if (!$$1.isEmpty()) {
         throw new so("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(brn<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new in($$1, $$2, $$3));
   }

   public void d(brn<?> $$0, in $$1) {
      in $$2 = this.j($$1);
      List<? extends brh> $$3 = this.a().a($$0, new etk($$2), brh::bB);
      if (!$$3.isEmpty()) {
         throw new sp("Did not expect " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(brn<?> $$0, double $$1, double $$2, double $$3) {
      etp $$4 = new etp($$1, $$2, $$3);
      etp $$5 = this.a($$4);
      Predicate<? super brh> $$6 = $$1x -> $$1x.cI().a($$5, $$5);
      List<? extends brh> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new so("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(brn<?> $$0, double $$1, double $$2, double $$3) {
      etp $$4 = new etp($$1, $$2, $$3);
      etp $$5 = this.a($$4);
      Predicate<? super brh> $$6 = $$1x -> !$$1x.cI().a($$5, $$5);
      List<? extends brh> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new so("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends brh, T> void a(in $$0, brn<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      in $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new etk($$4), brh::bB);
      if ($$5.isEmpty()) {
         throw new sp("Expected " + $$1.i(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new so("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new so("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bsa> void a(in $$0, brn<E> $$1, csu $$2) {
      in $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new etk($$3), brh::bB);
      if ($$4.isEmpty()) {
         throw new sp("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sp("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends brh & cks> void b(in $$0, brn<E> $$1, csu $$2) {
      in $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new etk($$3), $$0x -> ((brh)$$0x).bB());
      if ($$4.isEmpty()) {
         throw new sp("Expected " + $$1.i() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sp("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(in $$0) {
      in $$1 = this.j($$0);
      dnm $$2 = this.a().c_($$1);
      if ($$2 instanceof dng && !((dng)$$2).c()) {
         throw new so("Container should be empty");
      }
   }

   public void a(in $$0, csu $$1) {
      in $$2 = this.j($$0);
      dnm $$3 = this.a().c_($$2);
      if (!($$3 instanceof dng)) {
         throw new so("Expected a container at " + $$0 + ", found " + ld.k.b($$3.r()));
      } else if (((dng)$$3).a_($$1) != 1) {
         throw new so("Container should contain: " + $$1);
      }
   }

   public void a(egh $$0, in $$1) {
      in.a($$0).forEach($$2 -> {
         in $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(in $$0, in $$1) {
      dqh $$2 = this.a($$0);
      dqh $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, in $$1, csu $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, in $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends brh, T> void b(in $$0, brn<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends brh> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new so("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends brh, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new so("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bsa $$0, iw<bqr> $$1, int $$2) {
      bqt $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new so("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(brn<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new in($$1, $$2, $$3));
   }

   public void e(brn<?> $$0, in $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(brn<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new in($$1, $$2, $$3));
   }

   public void f(brn<?> $$0, in $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void e() {
      this.a.l();
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
      this.a.p().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.j();
      this.a.p().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.j();
      this.a.p().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.o() + $$0, $$1);
   }

   public void h(in $$0) {
      in $$1 = this.j($$0);
      aqh $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(in $$0) {
      in $$1 = this.j($$0);
      aqh $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      etk $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new in($$4, $$3, $$5));
         }
      }
   }

   public int a(dvz.a $$0, int $$1, int $$2) {
      in $$3 = this.j(new in($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, in $$1) {
      throw new sp($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, brh $$1) {
      throw new sp($$0, $$1.dn(), this.k($$1.dn()), this.h());
   }

   public void a(String $$0) {
      throw new so($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new so("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public ta g() {
      return this.a.p();
   }

   public in j(in $$0) {
      in $$1 = this.a.c();
      in $$2 = $$1.a((jr)$$0);
      return ekp.a($$2, dib.a, this.a.t(), $$1);
   }

   public in k(in $$0) {
      in $$1 = this.a.c();
      djr $$2 = this.a.t().a(djr.c);
      in $$3 = ekp.a($$0, dib.a, $$2, $$1);
      return $$3.b($$1);
   }

   public etp a(etp $$0) {
      etp $$1 = etp.a(this.a.c());
      return ekp.a($$1.e($$0), dib.a, this.a.t(), this.a.c());
   }

   public etp b(etp $$0) {
      etp $$1 = etp.a(this.a.c());
      return ekp.a($$0.d($$1), dib.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new so($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new so("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new so($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public etk i() {
      return this.a.d();
   }

   private etk k() {
      etk $$0 = this.a.d();
      return $$0.a(in.c.b(this.j(in.c)));
   }

   public void a(Consumer<in> $$0) {
      etk $$1 = this.k().a(1.0, 1.0, 1.0);
      in.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(clh $$0, csz $$1, in $$2, is $$3) {
      in $$4 = this.j($$2.a($$3));
      etl $$5 = new etl(etp.b($$4), $$3, $$4, false);
      cwk $$6 = new cwk($$0, bpl.a, $$5);
      $$1.a($$6);
   }

   public void a(akg<dbc> $$0) {
      etk $$1 = this.i();
      in $$2 = in.a($$1.a, $$1.b, $$1.c);
      in $$3 = in.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = amk.a(this.a(), $$2, $$3, this.a().H_().d(le.az).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
