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

public class te {
   private final tf a;
   private boolean b;

   public te(tf $$0) {
      this.a = $$0;
   }

   public arn a() {
      return this.a.f();
   }

   public dvj a(jh $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dsm> T b(jh $$0) {
      dsm $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new sy("Missing block entity", this.j($$0), $$0, this.a.o());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bue.class);
   }

   public void a(Class $$0) {
      ezi $$1 = this.j();
      List<bue> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof com));
      $$2.forEach(bue::au);
   }

   public ckv a(cvx $$0, ezn $$1) {
      arn $$2 = this.a();
      ezn $$3 = this.a($$1);
      ckv $$4 = new ckv($$2, $$3.d, $$3.e, $$3.f, new cwb($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public ckv a(cvx $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ezn((double)$$1, (double)$$2, (double)$$3));
   }

   public ckv a(cvx $$0, jh $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bue> E a(bul<E> $$0, jh $$1) {
      return this.a($$0, ezn.c($$1));
   }

   public <E extends bue> E a(bul<E> $$0, ezn $$1) {
      arn $$2 = this.a();
      E $$3 = $$0.a($$2, buk.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bvc $$4) {
            $$4.ga();
         }

         ezn $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dN(), $$3.dP());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bue> E a(bul<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bue> E a(bul<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sx("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sx("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         ezn $$6 = this.a(new ezn((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dv().f($$6);
            double $$4x = $$2x.dv().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bue> List<E> b(bul<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, ezn.c(new jh($$1, $$2, $$3)), $$4);
   }

   public <E extends bue> List<E> a(bul<E> $$0, ezn $$1, double $$2) {
      arn $$3 = this.a();
      ezn $$4 = this.a($$1);
      ezi $$5 = this.a.d();
      ezi $$6 = new ezi($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cS().c($$6) && $$1x.bM());
   }

   public <E extends bue> E a(bul<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bue> E a(bul<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ezn((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bvc> E b(bul<E> $$0, jh $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gn();
      return $$2;
   }

   public <E extends bvc> E b(bul<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bvc> E b(bul<E> $$0, ezn $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gn();
      return $$2;
   }

   public <E extends bvc> E b(bul<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ezn((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bvc $$0, float $$1, float $$2, float $$3) {
      ezn $$4 = this.a(new ezn((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dN(), $$0.dP());
   }

   public tj a(bvc $$0, jh $$1, float $$2) {
      return this.g().a(2, () -> {
         ery $$3 = $$0.P().a(this.j($$1), 0);
         $$0.P().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new jh($$0, $$1, $$2));
   }

   public void c(jh $$0) {
      this.b($$0, $$0x -> $$0x.a(axa.f), () -> "Expected button");
      jh $$1 = this.j($$0);
      dvj $$2 = this.a().a_($$1);
      dio $$3 = (dio)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(jh $$0) {
      this.a($$0, this.a(dey.b));
   }

   public void a(jh $$0, com $$1) {
      jh $$2 = this.j($$0);
      this.a($$0, $$1, new ezj(ezn.b($$2), jm.c, $$2, true));
   }

   public void a(jh $$0, com $$1, ezj $$2) {
      jh $$3 = this.j($$0);
      dvj $$4 = this.a().a_($$3);
      bsc $$5 = bsc.a;
      bsd $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bsd.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            czu $$7 = new czu($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bva a(bva $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public bva b(bva $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public com a(final dey $$0) {
      return new com(this.a(), jh.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean R_() {
            return $$0 == dey.d;
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
   public aro c() {
      asd $$0 = asd.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aro $$1 = new aro(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean R_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      wc $$2 = new wc(zq.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new jh($$0, $$1, $$2));
   }

   public void e(jh $$0) {
      this.a(dig.dw, $$0);
      jh $$1 = this.j($$0);
      dvj $$2 = this.a().a_($$1);
      dmq $$3 = (dmq)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jh $$0, long $$1) {
      this.a($$0, dig.ha);
      this.b($$1, () -> this.a($$0, dig.a));
   }

   public void f(jh $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, die $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dvj $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(jh $$0, die $$1) {
      this.a($$0, $$1.m());
   }

   public void a(jh $$0, dvj $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(die $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(die $$0, jh $$1) {
      dvj $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(die $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jh($$1, $$2, $$3));
   }

   public void b(die $$0, jh $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(die $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(die $$0, jh $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jh $$0, Predicate<die> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(jh $$0, Predicate<die> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(jh $$0, dwm<T> $$1, T $$2) {
      dvj $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sy($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(jh $$0, dwm<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(jh $$0, Predicate<dvj> $$1, Supplier<String> $$2) {
      dvj $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sy($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends dsm> void c(jh $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new sy($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(jh $$0, jm $$1, IntPredicate $$2, Supplier<String> $$3) {
      jh $$4 = this.j($$0);
      arn $$5 = this.a();
      dvj $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sy($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bul<?> $$0) {
      List<? extends bue> $$1 = this.a().a($$0, this.j(), bue::bM);
      if ($$1.isEmpty()) {
         throw new sx("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bul<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(bul<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bue> $$3 = this.a().a($$0, new ezi($$2), bue::bM);
      if ($$3.isEmpty()) {
         throw new sy("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(bul<?> $$0, ezi $$1) {
      ezi $$2 = this.a($$1);
      List<? extends bue> $$3 = this.a().a($$0, $$2, bue::bM);
      if ($$3.isEmpty()) {
         throw new sy("Expected " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.o());
      }
   }

   public void a(bul<?> $$0, int $$1) {
      List<? extends bue> $$2 = this.a().a($$0, this.j(), bue::bM);
      if ($$2.size() != $$1) {
         throw new sx("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bul<?> $$0, jh $$1, int $$2, double $$3) {
      jh $$4 = this.j($$1);
      List<? extends bue> $$5 = this.b((bul<? extends bue>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sy("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bul<?> $$0, jh $$1, double $$2) {
      List<? extends bue> $$3 = this.b((bul<? extends bue>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jh $$4 = this.j($$1);
         throw new sy("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bue> List<T> b(bul<T> $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);
      return this.a().a($$0, new ezi($$3).g($$2), bue::bM);
   }

   public <T extends bue> List<T> c(bul<T> $$0) {
      return this.a().a($$0, this.j(), bue::bM);
   }

   public void a(bue $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(bue $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bue> $$3 = this.a().a($$0.ar(), new ezi($$2), bue::bM);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sy("Expected " + $$0.ar().j(), $$2, $$1, this.a.o()));
   }

   public void a(cvx $$0, jh $$1, double $$2, int $$3) {
      jh $$4 = this.j($$1);
      List<ckv> $$5 = this.a().a(bul.ag, new ezi($$4).g($$2), bue::bM);
      int $$6 = 0;

      for (ckv $$7 : $$5) {
         cwb $$8 = $$7.m();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new sy("Expected " + $$3 + " " + $$0.n().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cvx $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bue $$5 : this.a().a(bul.ag, new ezi($$3).g($$2), bue::bM)) {
         ckv $$6 = (ckv)$$5;
         if ($$6.m().h().equals($$0)) {
            return;
         }
      }

      throw new sy("Expected " + $$0.n().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cvx $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bue $$5 : this.a().a(bul.ag, new ezi($$3).g($$2), bue::bM)) {
         ckv $$6 = (ckv)$$5;
         if ($$6.m().h().equals($$0)) {
            throw new sy("Did not expect " + $$0.n().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cvx $$0) {
      for (bue $$2 : this.a().a(bul.ag, this.j(), bue::bM)) {
         ckv $$3 = (ckv)$$2;
         if ($$3.m().h().equals($$0)) {
            return;
         }
      }

      throw new sx("Expected " + $$0.n().getString() + " item");
   }

   public void b(cvx $$0) {
      for (bue $$2 : this.a().a(bul.ag, this.j(), bue::bM)) {
         ckv $$3 = (ckv)$$2;
         if ($$3.m().h().equals($$0)) {
            throw new sx("Did not expect " + $$0.n().getString() + " item");
         }
      }
   }

   public void d(bul<?> $$0) {
      List<? extends bue> $$1 = this.a().a($$0, this.j(), bue::bM);
      if (!$$1.isEmpty()) {
         throw new sx("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bul<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jh($$1, $$2, $$3));
   }

   public void d(bul<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bue> $$3 = this.a().a($$0, new ezi($$2), bue::bM);
      if (!$$3.isEmpty()) {
         throw new sy("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void b(bul<?> $$0, ezi $$1) {
      ezi $$2 = this.a($$1);
      List<? extends bue> $$3 = this.a().a($$0, $$2, bue::bM);
      if (!$$3.isEmpty()) {
         throw new sy("Did not expect " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.o());
      }
   }

   public void a(bul<?> $$0, double $$1, double $$2, double $$3) {
      ezn $$4 = new ezn($$1, $$2, $$3);
      ezn $$5 = this.a($$4);
      Predicate<? super bue> $$6 = $$1x -> $$1x.cS().a($$5, $$5);
      List<? extends bue> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sx("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bul<?> $$0, double $$1, double $$2, double $$3) {
      ezn $$4 = new ezn($$1, $$2, $$3);
      ezn $$5 = this.a($$4);
      Predicate<? super bue> $$6 = $$1x -> !$$1x.cS().a($$5, $$5);
      List<? extends bue> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sx("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bue, T> void a(jh $$0, bul<E> $$1, Predicate<E> $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ezi($$3), bue::bM);
      if ($$4.isEmpty()) {
         throw new sy("Expected " + $$1.j(), $$3, $$0, this.a.o());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw new sx("Test failed for entity " + $$5);
            }
         }
      }
   }

   public <E extends bue, T> void a(jh $$0, bul<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jh $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ezi($$4), bue::bM);
      if ($$5.isEmpty()) {
         throw new sy("Expected " + $$1.j(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw new sx("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bva> void a(jh $$0, bul<E> $$1, cvx $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ezi($$3), bue::bM);
      if ($$4.isEmpty()) {
         throw new sy("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sy("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bue & cnw> void b(jh $$0, bul<E> $$1, cvx $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ezi($$3), $$0x -> ((bue)$$0x).bM());
      if ($$4.isEmpty()) {
         throw new sy("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sy("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(jh $$0) {
      jh $$1 = this.j($$0);
      dsm $$2 = this.a().c_($$1);
      if ($$2 instanceof dsg && !((dsg)$$2).c()) {
         throw new sx("Container should be empty");
      }
   }

   public void a(jh $$0, cvx $$1) {
      jh $$2 = this.j($$0);
      dsm $$3 = this.a().c_($$2);
      if (!($$3 instanceof dsg)) {
         throw new sx("Expected a container at " + $$0 + ", found " + ly.j.b($$3.q()));
      } else if (((dsg)$$3).a_($$1) != 1) {
         throw new sx("Container should contain: " + $$1);
      }
   }

   public void a(elp $$0, jh $$1) {
      jh.a($$0).forEach($$2 -> {
         jh $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jh $$0, jh $$1) {
      dvj $$2 = this.a($$0);
      dvj $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, jh $$1, cvx $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jh $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bue, T> void b(jh $$0, bul<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bue $$0, ezi $$1, String $$2) {
      if (!$$1.d(this.b($$0.dv()))) {
         this.a($$2);
      }
   }

   public <E extends bue> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sx("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bue, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sx("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bva $$0, jq<bth> $$1, int $$2) {
      btj $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sx("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bul<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jh($$1, $$2, $$3));
   }

   public void e(bul<?> $$0, jh $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bul<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jh($$1, $$2, $$3));
   }

   public void f(bul<?> $$0, jh $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void e() {
      this.a.l();
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
      this.a.p().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.k();
      this.a.p().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.k();
      this.a.p().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.o() + $$0, $$1);
   }

   public void h(jh $$0) {
      jh $$1 = this.j($$0);
      arn $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void i(jh $$0) {
      jh $$1 = this.j($$0);
      arn $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ezi $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jh($$4, $$3, $$5));
         }
      }
   }

   public int a(ebf.a $$0, int $$1, int $$2) {
      jh $$3 = this.j(new jh($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, jh $$1) {
      throw new sy($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, bue $$1) {
      throw new sy($$0, $$1.dx(), this.k($$1.dx()), this.i());
   }

   public void a(String $$0) {
      throw new sx($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new sx("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public tj g() {
      return this.a.p();
   }

   public jh j(jh $$0) {
      jh $$1 = this.a.c();
      jh $$2 = $$1.a((kl)$$0);
      return epz.a($$2, dna.a, this.a.t(), $$1);
   }

   public jh k(jh $$0) {
      jh $$1 = this.a.c();
      dor $$2 = this.a.t().a(dor.c);
      jh $$3 = epz.a($$0, dna.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ezi a(ezi $$0) {
      ezn $$1 = this.a($$0.h());
      ezn $$2 = this.a($$0.i());
      return new ezi($$1, $$2);
   }

   public ezi b(ezi $$0) {
      ezn $$1 = this.b($$0.h());
      ezn $$2 = this.b($$0.i());
      return new ezi($$1, $$2);
   }

   public ezn a(ezn $$0) {
      ezn $$1 = ezn.a(this.a.c());
      return epz.a($$1.e($$0), dna.a, this.a.t(), this.a.c());
   }

   public ezn b(ezn $$0) {
      ezn $$1 = ezn.a(this.a.c());
      return epz.a($$0.d($$1), dna.a, this.a.t(), this.a.c());
   }

   public dor h() {
      return this.a.t();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sx($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sx("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sx($$1);
      }
   }

   public long i() {
      return this.a.o();
   }

   public ezi j() {
      return this.a.d();
   }

   private ezi l() {
      ezi $$0 = this.a.d();
      dor $$1 = this.a.t();
      switch ($$1) {
         case d:
         case b:
            return new ezi(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new ezi(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<jh> $$0) {
      ezi $$1 = this.l().a(1.0, -1.0, 1.0);
      jh.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(com $$0, cwb $$1, jh $$2, jm $$3) {
      jh $$4 = this.j($$2.a($$3));
      ezj $$5 = new ezj(ezn.b($$4), $$3, $$4, false);
      czu $$6 = new czu($$0, bsc.a, $$5);
      $$1.a($$6);
   }

   public void a(alh<dgc> $$0) {
      ezi $$1 = this.j();
      jh $$2 = jh.a($$1.a, $$1.b, $$1.c);
      jh $$3 = jh.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ann.a(this.a(), $$2, $$3, this.a().H_().e(lz.aG).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
