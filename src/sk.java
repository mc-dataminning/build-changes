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

public class sk {
   private final sl a;
   private boolean b;

   public sk(sl $$0) {
      this.a = $$0;
   }

   public ard a() {
      return this.a.g();
   }

   public dwy a(ji $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dua> T b(ji $$0) {
      dua $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new se("Missing block entity", this.j($$0), $$0, this.a.p());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bum.class);
   }

   public void a(Class $$0) {
      faw $$1 = this.j();
      List<bum> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof coy));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public cld a(cwm $$0, fbb $$1) {
      ard $$2 = this.a();
      fbb $$3 = this.a($$1);
      cld $$4 = new cld($$2, $$3.d, $$3.e, $$3.f, new cwq($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cld a(cwm $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fbb((double)$$1, (double)$$2, (double)$$3));
   }

   public cld a(cwm $$0, ji $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bum> E a(but<E> $$0, ji $$1) {
      return this.a($$0, fbb.c($$1));
   }

   public <E extends bum> E a(but<E> $$0, fbb $$1) {
      ard $$2 = this.a();
      E $$3 = $$0.a($$2, bus.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bvk $$4) {
            $$4.fY();
         }

         fbb $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dL(), $$3.dN());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bum $$0, btc $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bum $$0) {
      $$0.c(this.a());
   }

   public <E extends bum> E a(but<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bum> E a(but<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sd("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sd("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         fbb $$6 = this.a(new fbb((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dt().f($$6);
            double $$4x = $$2x.dt().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bum> List<E> b(but<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, fbb.c(new ji($$1, $$2, $$3)), $$4);
   }

   public <E extends bum> List<E> a(but<E> $$0, fbb $$1, double $$2) {
      ard $$3 = this.a();
      fbb $$4 = this.a($$1);
      faw $$5 = this.a.e();
      faw $$6 = new faw($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bL());
   }

   public <E extends bum> E a(but<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ji($$1, $$2, $$3));
   }

   public <E extends bum> E a(but<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fbb((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bvk> E b(but<E> $$0, ji $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends bvk> E b(but<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ji($$1, $$2, $$3));
   }

   public <E extends bvk> E b(but<E> $$0, fbb $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends bvk> E b(but<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new fbb((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bvk $$0, float $$1, float $$2, float $$3) {
      fbb $$4 = this.a(new fbb((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dL(), $$0.dN());
   }

   public sp a(bvk $$0, ji $$1, float $$2) {
      return this.g().a(2, () -> {
         eto $$3 = $$0.P().a(this.j($$1), 0);
         $$0.P().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ji($$0, $$1, $$2));
   }

   public void c(ji $$0) {
      this.b($$0, $$0x -> $$0x.a(awp.f), () -> "Expected button");
      ji $$1 = this.j($$0);
      dwy $$2 = this.a().a_($$1);
      djy $$3 = (djy)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(ji $$0) {
      this.a($$0, this.a(dgg.b));
   }

   public void a(ji $$0, coy $$1) {
      ji $$2 = this.j($$0);
      this.a($$0, $$1, new fax(fbb.b($$2), jn.c, $$2, true));
   }

   public void a(ji $$0, coy $$1, fax $$2) {
      ji $$3 = this.j($$0);
      dwy $$4 = this.a().a_($$3);
      bsk $$5 = bsk.a;
      bsl $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bsl.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            daj $$7 = new daj($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bvi a(bvi $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public bvi b(bvi $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public coy a(final dgg $$0) {
      return new coy(this.a(), ji.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean Z_() {
            return $$0 == dgg.d;
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
   public are c() {
      art $$0 = art.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      are $$1 = new are(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean Z_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      vi $$2 = new vi(yx.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new ji($$0, $$1, $$2));
   }

   public void e(ji $$0) {
      this.a(djp.dI, $$0);
      ji $$1 = this.j($$0);
      dwy $$2 = this.a().a_($$1);
      doc $$3 = (doc)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(ji $$0, long $$1) {
      this.a($$0, djp.hx);
      this.b($$1, () -> this.a($$0, djp.a));
   }

   public void f(ji $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, djn $$3) {
      this.a(new ji($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dwy $$3) {
      this.a(new ji($$0, $$1, $$2), $$3);
   }

   public void a(ji $$0, djn $$1) {
      this.a($$0, $$1.m());
   }

   public void a(ji $$0, dwy $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(djn $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ji($$1, $$2, $$3));
   }

   public void a(djn $$0, ji $$1) {
      dwy $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(djn $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ji($$1, $$2, $$3));
   }

   public void b(djn $$0, ji $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(djn $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ji($$1, $$2, $$3));
   }

   public void c(djn $$0, ji $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ji $$0, Predicate<djn> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ji $$0, Predicate<djn> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ji $$0, dya<T> $$1, T $$2) {
      dwy $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new se($$6, this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(ji $$0, dya<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ji $$0, Predicate<dwy> $$1, Supplier<String> $$2) {
      dwy $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new se($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends dua> void c(ji $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new se($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public void a(ji $$0, jn $$1, IntPredicate $$2, Supplier<String> $$3) {
      ji $$4 = this.j($$0);
      ard $$5 = this.a();
      dwy $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new se($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void b(but<?> $$0) {
      List<? extends bum> $$1 = this.a().a($$0, this.j(), bum::bL);
      if ($$1.isEmpty()) {
         throw new sd("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(but<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ji($$1, $$2, $$3));
   }

   public void c(but<?> $$0, ji $$1) {
      ji $$2 = this.j($$1);
      List<? extends bum> $$3 = this.a().a($$0, new faw($$2), bum::bL);
      if ($$3.isEmpty()) {
         throw new se("Expected " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void a(but<?> $$0, faw $$1) {
      faw $$2 = this.a($$1);
      List<? extends bum> $$3 = this.a().a($$0, $$2, bum::bL);
      if ($$3.isEmpty()) {
         throw new se("Expected " + $$0.j(), ji.a((kb)$$2.f()), ji.a((kb)$$1.f()), this.a.p());
      }
   }

   public void a(but<?> $$0, int $$1) {
      List<? extends bum> $$2 = this.a().a($$0, this.j(), bum::bL);
      if ($$2.size() != $$1) {
         throw new sd("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(but<?> $$0, ji $$1, int $$2, double $$3) {
      ji $$4 = this.j($$1);
      List<? extends bum> $$5 = this.b((but<? extends bum>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new se("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(but<?> $$0, ji $$1, double $$2) {
      List<? extends bum> $$3 = this.b((but<? extends bum>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ji $$4 = this.j($$1);
         throw new se("Expected " + $$0.j(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bum> List<T> b(but<T> $$0, ji $$1, double $$2) {
      ji $$3 = this.j($$1);
      return this.a().a($$0, new faw($$3).g($$2), bum::bL);
   }

   public <T extends bum> List<T> c(but<T> $$0) {
      return this.a().a($$0, this.j(), bum::bL);
   }

   public void a(bum $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ji($$1, $$2, $$3));
   }

   public void a(bum $$0, ji $$1) {
      ji $$2 = this.j($$1);
      List<? extends bum> $$3 = this.a().a($$0.aq(), new faw($$2), bum::bL);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new se("Expected " + $$0.aq().j(), $$2, $$1, this.a.p()));
   }

   public void a(cwm $$0, ji $$1, double $$2, int $$3) {
      ji $$4 = this.j($$1);
      List<cld> $$5 = this.a().a(but.aq, new faw($$4).g($$2), bum::bL);
      int $$6 = 0;

      for (cld $$7 : $$5) {
         cwq $$8 = $$7.l();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw new se("Expected " + $$3 + " " + $$0.m().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cwm $$0, ji $$1, double $$2) {
      ji $$3 = this.j($$1);

      for (bum $$5 : this.a().a(but.aq, new faw($$3).g($$2), bum::bL)) {
         cld $$6 = (cld)$$5;
         if ($$6.l().h().equals($$0)) {
            return;
         }
      }

      throw new se("Expected " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cwm $$0, ji $$1, double $$2) {
      ji $$3 = this.j($$1);

      for (bum $$5 : this.a().a(but.aq, new faw($$3).g($$2), bum::bL)) {
         cld $$6 = (cld)$$5;
         if ($$6.l().h().equals($$0)) {
            throw new se("Did not expect " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(cwm $$0) {
      for (bum $$2 : this.a().a(but.aq, this.j(), bum::bL)) {
         cld $$3 = (cld)$$2;
         if ($$3.l().h().equals($$0)) {
            return;
         }
      }

      throw new sd("Expected " + $$0.m().getString() + " item");
   }

   public void b(cwm $$0) {
      for (bum $$2 : this.a().a(but.aq, this.j(), bum::bL)) {
         cld $$3 = (cld)$$2;
         if ($$3.l().h().equals($$0)) {
            throw new sd("Did not expect " + $$0.m().getString() + " item");
         }
      }
   }

   public void d(but<?> $$0) {
      List<? extends bum> $$1 = this.a().a($$0, this.j(), bum::bL);
      if (!$$1.isEmpty()) {
         throw new sd("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(but<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ji($$1, $$2, $$3));
   }

   public void d(but<?> $$0, ji $$1) {
      ji $$2 = this.j($$1);
      List<? extends bum> $$3 = this.a().a($$0, new faw($$2), bum::bL);
      if (!$$3.isEmpty()) {
         throw new se("Did not expect " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void b(but<?> $$0, faw $$1) {
      faw $$2 = this.a($$1);
      List<? extends bum> $$3 = this.a().a($$0, $$2, bum::bL);
      if (!$$3.isEmpty()) {
         throw new se("Did not expect " + $$0.j(), ji.a((kb)$$2.f()), ji.a((kb)$$1.f()), this.a.p());
      }
   }

   public void a(but<?> $$0, double $$1, double $$2, double $$3) {
      fbb $$4 = new fbb($$1, $$2, $$3);
      fbb $$5 = this.a($$4);
      Predicate<? super bum> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bum> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sd("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(but<?> $$0, double $$1, double $$2, double $$3) {
      fbb $$4 = new fbb($$1, $$2, $$3);
      fbb $$5 = this.a($$4);
      Predicate<? super bum> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bum> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sd("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bum, T> void a(ji $$0, but<E> $$1, Predicate<E> $$2) {
      ji $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new faw($$3), bum::bL);
      if ($$4.isEmpty()) {
         throw new se("Expected " + $$1.j(), $$3, $$0, this.a.p());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw new sd("Test failed for entity " + $$5);
            }
         }
      }
   }

   public <E extends bum, T> void a(ji $$0, but<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ji $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new faw($$4), bum::bL);
      if ($$5.isEmpty()) {
         throw new se("Expected " + $$1.j(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw new sd("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bvi> void a(ji $$0, but<E> $$1, cwm $$2) {
      ji $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new faw($$3), bum::bL);
      if ($$4.isEmpty()) {
         throw new se("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new se("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bum & coh> void b(ji $$0, but<E> $$1, cwm $$2) {
      ji $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new faw($$3), $$0x -> ((bum)$$0x).bL());
      if ($$4.isEmpty()) {
         throw new se("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.t().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new se("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(ji $$0) {
      ji $$1 = this.j($$0);
      dua $$2 = this.a().c_($$1);
      if ($$2 instanceof dtu && !((dtu)$$2).c()) {
         throw new sd("Container should be empty");
      }
   }

   public void a(ji $$0, cwm $$1) {
      ji $$2 = this.j($$0);
      dua $$3 = this.a().c_($$2);
      if (!($$3 instanceof dtu)) {
         akv $$4 = $$3 != null ? mb.j.b($$3.p()) : null;
         throw new sd("Expected a container at " + $$0 + ", found " + $$4);
      } else if (((dtu)$$3).a_($$1) != 1) {
         throw new sd("Container should contain: " + $$1);
      }
   }

   public void a(enf $$0, ji $$1) {
      ji.a($$0).forEach($$2 -> {
         ji $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(ji $$0, ji $$1) {
      dwy $$2 = this.a($$0);
      dwy $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ji $$1, cwm $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ji $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bum, T> void b(ji $$0, but<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bum $$0, faw $$1, String $$2) {
      if (!$$1.d(this.b($$0.dt()))) {
         this.a($$2);
      }
   }

   public <E extends bum> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sd("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bum, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sd("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bvi $$0, jr<btp> $$1, int $$2) {
      btr $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sd("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(but<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ji($$1, $$2, $$3));
   }

   public void e(but<?> $$0, ji $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(but<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ji($$1, $$2, $$3));
   }

   public void f(but<?> $$0, ji $$1) {
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

   public void h(ji $$0) {
      ji $$1 = this.j($$0);
      ard $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void i(ji $$0) {
      ji $$1 = this.j($$0);
      ard $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      faw $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new ji($$4, $$3, $$5));
         }
      }
   }

   public int a(ect.a $$0, int $$1, int $$2) {
      ji $$3 = this.j(new ji($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ji $$1) {
      throw new se($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, bum $$1) {
      throw new se($$0, $$1.dv(), this.k($$1.dv()), this.i());
   }

   public void a(String $$0) {
      throw new sd($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new sd("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public sp g() {
      return this.a.q();
   }

   public ji j(ji $$0) {
      ji $$1 = this.a.d();
      ji $$2 = $$1.a((km)$$0);
      return erp.a($$2, dom.a, this.a.u(), $$1);
   }

   public ji k(ji $$0) {
      ji $$1 = this.a.d();
      dqf $$2 = this.a.u().a(dqf.c);
      ji $$3 = erp.a($$0, dom.a, $$2, $$1);
      return $$3.b($$1);
   }

   public faw a(faw $$0) {
      fbb $$1 = this.a($$0.h());
      fbb $$2 = this.a($$0.i());
      return new faw($$1, $$2);
   }

   public faw b(faw $$0) {
      fbb $$1 = this.b($$0.h());
      fbb $$2 = this.b($$0.i());
      return new faw($$1, $$2);
   }

   public fbb a(fbb $$0) {
      fbb $$1 = fbb.a(this.a.d());
      return erp.a($$1.e($$0), dom.a, this.a.u(), this.a.d());
   }

   public fbb b(fbb $$0) {
      fbb $$1 = fbb.a(this.a.d());
      return erp.a($$0.d($$1), dom.a, this.a.u(), this.a.d());
   }

   public dqf h() {
      return this.a.u();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sd($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sd("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sd($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   public faw j() {
      return this.a.e();
   }

   private faw l() {
      faw $$0 = this.a.e();
      dqf $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new faw(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new faw(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<ji> $$0) {
      faw $$1 = this.l().a(1.0, 1.0, 1.0);
      ji.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(coy $$0, cwq $$1, ji $$2, jn $$3) {
      ji $$4 = this.j($$2.a($$3));
      fax $$5 = new fax(fbb.b($$4), $$3, $$4, false);
      daj $$6 = new daj($$0, bsk.a, $$5);
      $$1.a($$6);
   }

   public void a(aku<dhl> $$0) {
      faw $$1 = this.j();
      ji $$2 = ji.a($$1.a, $$1.b, $$1.c);
      ji $$3 = ji.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ana.a(this.a(), $$2, $$3, this.a().K_().e(mc.aI).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
