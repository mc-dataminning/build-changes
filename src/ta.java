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

public class ta {
   private final tb a;
   private boolean b;

   public ta(tb $$0) {
      this.a = $$0;
   }

   public arj a() {
      return this.a.f();
   }

   public dus a(jf $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends drv> T b(jf $$0) {
      drv $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new su("Missing block entity", this.j($$0), $$0, this.a.o());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(btr.class);
   }

   public void a(Class $$0) {
      eyr $$1 = this.j();
      List<btr> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cnx));
      $$2.forEach(btr::ar);
   }

   public ckh a(cvn $$0, eyw $$1) {
      arj $$2 = this.a();
      eyw $$3 = this.a($$1);
      ckh $$4 = new ckh($$2, $$3.d, $$3.e, $$3.f, new cvs($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public ckh a(cvn $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eyw((double)$$1, (double)$$2, (double)$$3));
   }

   public ckh a(cvn $$0, jf $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends btr> E a(bty<E> $$0, jf $$1) {
      return this.a($$0, eyw.c($$1));
   }

   public <E extends btr> E a(bty<E> $$0, eyw $$1) {
      arj $$2 = this.a();
      E $$3 = $$0.a($$2, btx.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bup $$4) {
            $$4.fW();
         }

         eyw $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dI(), $$3.dK());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends btr> E a(bty<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends btr> E a(bty<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new st("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new st("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         eyw $$6 = this.a(new eyw((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dq().f($$6);
            double $$4x = $$2x.dq().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends btr> List<E> b(bty<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, eyw.c(new jf($$1, $$2, $$3)), $$4);
   }

   public <E extends btr> List<E> a(bty<E> $$0, eyw $$1, double $$2) {
      arj $$3 = this.a();
      eyw $$4 = this.a($$1);
      eyr $$5 = this.a.d();
      eyr $$6 = new eyr($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cO().c($$6) && $$1x.bI());
   }

   public <E extends btr> E a(bty<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jf($$1, $$2, $$3));
   }

   public <E extends btr> E a(bty<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eyw((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bup> E b(bty<E> $$0, jf $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gj();
      return $$2;
   }

   public <E extends bup> E b(bty<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jf($$1, $$2, $$3));
   }

   public <E extends bup> E b(bty<E> $$0, eyw $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gj();
      return $$2;
   }

   public <E extends bup> E b(bty<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new eyw((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bup $$0, float $$1, float $$2, float $$3) {
      eyw $$4 = this.a(new eyw((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dI(), $$0.dK());
   }

   public tf a(bup $$0, jf $$1, float $$2) {
      return this.g().a(2, () -> {
         erh $$3 = $$0.P().a(this.j($$1), 0);
         $$0.P().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new jf($$0, $$1, $$2));
   }

   public void c(jf $$0) {
      this.b($$0, $$0x -> $$0x.a(awv.f), () -> "Expected button");
      jf $$1 = this.j($$0);
      dus $$2 = this.a().a_($$1);
      dhw $$3 = (dhw)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(jf $$0) {
      this.a($$0, this.a(deg.b));
   }

   public void a(jf $$0, cnx $$1) {
      jf $$2 = this.j($$0);
      this.a($$0, $$1, new eys(eyw.b($$2), jk.c, $$2, true));
   }

   public void a(jf $$0, cnx $$1, eys $$2) {
      jf $$3 = this.j($$0);
      dus $$4 = this.a().a_($$3);
      brr $$5 = brr.a;
      brs $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof brs.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            czp $$7 = new czp($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bun a(bun $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public bun b(bun $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public cnx a(final deg $$0) {
      return new cnx(this.a(), jf.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean Q_() {
            return $$0 == deg.d;
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
   public ark c() {
      ary $$0 = ary.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      ark $$1 = new ark(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean Q_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      vy $$2 = new vy(zm.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new jf($$0, $$1, $$2));
   }

   public void e(jf $$0) {
      this.a(dho.dw, $$0);
      jf $$1 = this.j($$0);
      dus $$2 = this.a().a_($$1);
      dlz $$3 = (dlz)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jf $$0, long $$1) {
      this.a($$0, dho.ha);
      this.b($$1, () -> this.a($$0, dho.a));
   }

   public void f(jf $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dhm $$3) {
      this.a(new jf($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dus $$3) {
      this.a(new jf($$0, $$1, $$2), $$3);
   }

   public void a(jf $$0, dhm $$1) {
      this.a($$0, $$1.n());
   }

   public void a(jf $$0, dus $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dhm $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jf($$1, $$2, $$3));
   }

   public void a(dhm $$0, jf $$1) {
      dus $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dhm $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jf($$1, $$2, $$3));
   }

   public void b(dhm $$0, jf $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dhm $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jf($$1, $$2, $$3));
   }

   public void c(dhm $$0, jf $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jf $$0, Predicate<dhm> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(jf $$0, Predicate<dhm> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(jf $$0, dvv<T> $$1, T $$2) {
      dus $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new su($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(jf $$0, dvv<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(jf $$0, Predicate<dus> $$1, Supplier<String> $$2) {
      dus $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new su($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends drv> void c(jf $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new su($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(jf $$0, jk $$1, IntPredicate $$2, Supplier<String> $$3) {
      jf $$4 = this.j($$0);
      arj $$5 = this.a();
      dus $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new su($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bty<?> $$0) {
      List<? extends btr> $$1 = this.a().a($$0, this.j(), btr::bI);
      if ($$1.isEmpty()) {
         throw new st("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bty<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jf($$1, $$2, $$3));
   }

   public void c(bty<?> $$0, jf $$1) {
      jf $$2 = this.j($$1);
      List<? extends btr> $$3 = this.a().a($$0, new eyr($$2), btr::bI);
      if ($$3.isEmpty()) {
         throw new su("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(bty<?> $$0, eyr $$1) {
      eyr $$2 = this.a($$1);
      List<? extends btr> $$3 = this.a().a($$0, $$2, btr::bI);
      if ($$3.isEmpty()) {
         throw new su("Expected " + $$0.j(), jf.a((jy)$$2.f()), jf.a((jy)$$1.f()), this.a.o());
      }
   }

   public void a(bty<?> $$0, int $$1) {
      List<? extends btr> $$2 = this.a().a($$0, this.j(), btr::bI);
      if ($$2.size() != $$1) {
         throw new st("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bty<?> $$0, jf $$1, int $$2, double $$3) {
      jf $$4 = this.j($$1);
      List<? extends btr> $$5 = this.b((bty<? extends btr>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new su("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bty<?> $$0, jf $$1, double $$2) {
      List<? extends btr> $$3 = this.b((bty<? extends btr>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jf $$4 = this.j($$1);
         throw new su("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends btr> List<T> b(bty<T> $$0, jf $$1, double $$2) {
      jf $$3 = this.j($$1);
      return this.a().a($$0, new eyr($$3).g($$2), btr::bI);
   }

   public <T extends btr> List<T> c(bty<T> $$0) {
      return this.a().a($$0, this.j(), btr::bI);
   }

   public void a(btr $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jf($$1, $$2, $$3));
   }

   public void a(btr $$0, jf $$1) {
      jf $$2 = this.j($$1);
      List<? extends btr> $$3 = this.a().a($$0.ao(), new eyr($$2), btr::bI);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new su("Expected " + $$0.ao().j(), $$2, $$1, this.a.o()));
   }

   public void a(cvn $$0, jf $$1, double $$2, int $$3) {
      jf $$4 = this.j($$1);
      List<ckh> $$5 = this.a().a(bty.ag, new eyr($$4).g($$2), btr::bI);
      int $$6 = 0;

      for (ckh $$7 : $$5) {
         cvs $$8 = $$7.m();
         if ($$8.a($$0)) {
            $$6 += $$8.K();
         }
      }

      if ($$6 != $$3) {
         throw new su("Expected " + $$3 + " " + $$0.r().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cvn $$0, jf $$1, double $$2) {
      jf $$3 = this.j($$1);

      for (btr $$5 : this.a().a(bty.ag, new eyr($$3).g($$2), btr::bI)) {
         ckh $$6 = (ckh)$$5;
         if ($$6.m().h().equals($$0)) {
            return;
         }
      }

      throw new su("Expected " + $$0.r().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cvn $$0, jf $$1, double $$2) {
      jf $$3 = this.j($$1);

      for (btr $$5 : this.a().a(bty.ag, new eyr($$3).g($$2), btr::bI)) {
         ckh $$6 = (ckh)$$5;
         if ($$6.m().h().equals($$0)) {
            throw new su("Did not expect " + $$0.r().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cvn $$0) {
      for (btr $$2 : this.a().a(bty.ag, this.j(), btr::bI)) {
         ckh $$3 = (ckh)$$2;
         if ($$3.m().h().equals($$0)) {
            return;
         }
      }

      throw new st("Expected " + $$0.r().getString() + " item");
   }

   public void b(cvn $$0) {
      for (btr $$2 : this.a().a(bty.ag, this.j(), btr::bI)) {
         ckh $$3 = (ckh)$$2;
         if ($$3.m().h().equals($$0)) {
            throw new st("Did not expect " + $$0.r().getString() + " item");
         }
      }
   }

   public void d(bty<?> $$0) {
      List<? extends btr> $$1 = this.a().a($$0, this.j(), btr::bI);
      if (!$$1.isEmpty()) {
         throw new st("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bty<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jf($$1, $$2, $$3));
   }

   public void d(bty<?> $$0, jf $$1) {
      jf $$2 = this.j($$1);
      List<? extends btr> $$3 = this.a().a($$0, new eyr($$2), btr::bI);
      if (!$$3.isEmpty()) {
         throw new su("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void b(bty<?> $$0, eyr $$1) {
      eyr $$2 = this.a($$1);
      List<? extends btr> $$3 = this.a().a($$0, $$2, btr::bI);
      if (!$$3.isEmpty()) {
         throw new su("Did not expect " + $$0.j(), jf.a((jy)$$2.f()), jf.a((jy)$$1.f()), this.a.o());
      }
   }

   public void a(bty<?> $$0, double $$1, double $$2, double $$3) {
      eyw $$4 = new eyw($$1, $$2, $$3);
      eyw $$5 = this.a($$4);
      Predicate<? super btr> $$6 = $$1x -> $$1x.cO().a($$5, $$5);
      List<? extends btr> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new st("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bty<?> $$0, double $$1, double $$2, double $$3) {
      eyw $$4 = new eyw($$1, $$2, $$3);
      eyw $$5 = this.a($$4);
      Predicate<? super btr> $$6 = $$1x -> !$$1x.cO().a($$5, $$5);
      List<? extends btr> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new st("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends btr, T> void a(jf $$0, bty<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jf $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new eyr($$4), btr::bI);
      if ($$5.isEmpty()) {
         throw new su("Expected " + $$1.j(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new st("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new st("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bun> void a(jf $$0, bty<E> $$1, cvn $$2) {
      jf $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new eyr($$3), btr::bI);
      if ($$4.isEmpty()) {
         throw new su("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new su("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends btr & cni> void b(jf $$0, bty<E> $$1, cvn $$2) {
      jf $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new eyr($$3), $$0x -> ((btr)$$0x).bI());
      if ($$4.isEmpty()) {
         throw new su("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new su("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(jf $$0) {
      jf $$1 = this.j($$0);
      drv $$2 = this.a().c_($$1);
      if ($$2 instanceof drp && !((drp)$$2).c()) {
         throw new st("Container should be empty");
      }
   }

   public void a(jf $$0, cvn $$1) {
      jf $$2 = this.j($$0);
      drv $$3 = this.a().c_($$2);
      if (!($$3 instanceof drp)) {
         throw new st("Expected a container at " + $$0 + ", found " + lv.j.b($$3.q()));
      } else if (((drp)$$3).a_($$1) != 1) {
         throw new st("Container should contain: " + $$1);
      }
   }

   public void a(eky $$0, jf $$1) {
      jf.a($$0).forEach($$2 -> {
         jf $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jf $$0, jf $$1) {
      dus $$2 = this.a($$0);
      dus $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, jf $$1, cvn $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jf $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends btr, T> void b(jf $$0, bty<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(btr $$0, eyr $$1, String $$2) {
      if (!$$1.d(this.b($$0.dq()))) {
         this.a($$2);
      }
   }

   public <E extends btr> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new st("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends btr, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new st("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bun $$0, jo<bsw> $$1, int $$2) {
      bsy $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new st("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bty<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jf($$1, $$2, $$3));
   }

   public void e(bty<?> $$0, jf $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bty<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jf($$1, $$2, $$3));
   }

   public void f(bty<?> $$0, jf $$1) {
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

   public void h(jf $$0) {
      jf $$1 = this.j($$0);
      arj $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(jf $$0) {
      jf $$1 = this.j($$0);
      arj $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      eyr $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jf($$4, $$3, $$5));
         }
      }
   }

   public int a(eao.a $$0, int $$1, int $$2) {
      jf $$3 = this.j(new jf($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, jf $$1) {
      throw new su($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, btr $$1) {
      throw new su($$0, $$1.ds(), this.k($$1.ds()), this.i());
   }

   public void a(String $$0) {
      throw new st($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new st("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public tf g() {
      return this.a.p();
   }

   public jf j(jf $$0) {
      jf $$1 = this.a.c();
      jf $$2 = $$1.a((kj)$$0);
      return epi.a($$2, dmj.a, this.a.t(), $$1);
   }

   public jf k(jf $$0) {
      jf $$1 = this.a.c();
      doa $$2 = this.a.t().a(doa.c);
      jf $$3 = epi.a($$0, dmj.a, $$2, $$1);
      return $$3.b($$1);
   }

   public eyr a(eyr $$0) {
      eyw $$1 = this.a($$0.g());
      eyw $$2 = this.a($$0.h());
      return new eyr($$1, $$2);
   }

   public eyr b(eyr $$0) {
      eyw $$1 = this.b($$0.g());
      eyw $$2 = this.b($$0.h());
      return new eyr($$1, $$2);
   }

   public eyw a(eyw $$0) {
      eyw $$1 = eyw.a(this.a.c());
      return epi.a($$1.e($$0), dmj.a, this.a.t(), this.a.c());
   }

   public eyw b(eyw $$0) {
      eyw $$1 = eyw.a(this.a.c());
      return epi.a($$0.d($$1), dmj.a, this.a.t(), this.a.c());
   }

   public doa h() {
      return this.a.t();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new st($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new st("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new st($$1);
      }
   }

   public long i() {
      return this.a.o();
   }

   public eyr j() {
      return this.a.d();
   }

   private eyr l() {
      eyr $$0 = this.a.d();
      doa $$1 = this.a.t();
      switch ($$1) {
         case d:
         case b:
            return new eyr(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new eyr(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<jf> $$0) {
      eyr $$1 = this.l().a(1.0, -1.0, 1.0);
      jf.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cnx $$0, cvs $$1, jf $$2, jk $$3) {
      jf $$4 = this.j($$2.a($$3));
      eys $$5 = new eys(eyw.b($$4), $$3, $$4, false);
      czp $$6 = new czp($$0, brr.a, $$5);
      $$1.a($$6);
   }

   public void a(ald<dfk> $$0) {
      eyr $$1 = this.j();
      jf $$2 = jf.a($$1.a, $$1.b, $$1.c);
      jf $$3 = jf.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = anj.a(this.a(), $$2, $$3, this.a().G_().e(lw.aH).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
