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

public class ss {
   private final st a;
   private boolean b;

   public ss(st $$0) {
      this.a = $$0;
   }

   public aqm a() {
      return this.a.f();
   }

   public dsk a(ja $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dpp b(ja $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(bsg.class);
   }

   public void a(Class $$0) {
      ewa $$1 = this.i();
      List<bsg> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cmk));
      $$2.forEach(bsg::ao);
   }

   public ciu a(ctx $$0, ewf $$1) {
      aqm $$2 = this.a();
      ewf $$3 = this.a($$1);
      ciu $$4 = new ciu($$2, $$3.c, $$3.d, $$3.e, new cuc($$0, 1));
      $$4.o(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public ciu a(ctx $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ewf((double)$$1, (double)$$2, (double)$$3));
   }

   public ciu a(ctx $$0, ja $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bsg> E a(bsm<E> $$0, ja $$1) {
      return this.a($$0, ewf.c($$1));
   }

   public <E extends bsg> E a(bsm<E> $$0, ewf $$1) {
      aqm $$2 = this.a();
      E $$3 = $$0.a((dcf)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof btd $$4) {
            $$4.fR();
         }

         ewf $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dG(), $$3.dI());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bsg> E a(bsm<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bsg> E a(bsm<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sl("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sl("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         ewf $$6 = this.a(new ewf((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.do().f($$6);
            double $$4x = $$2x.do().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bsg> List<E> b(bsm<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, ewf.c(new ja($$1, $$2, $$3)), $$4);
   }

   public <E extends bsg> List<E> a(bsm<E> $$0, ewf $$1, double $$2) {
      aqm $$3 = this.a();
      ewf $$4 = this.a($$1);
      ewa $$5 = this.a.d();
      ewa $$6 = new ewa($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cL().c($$6) && $$1x.bE());
   }

   public <E extends bsg> E a(bsm<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ja($$1, $$2, $$3));
   }

   public <E extends bsg> E a(bsm<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ewf((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends btd> E b(bsm<E> $$0, ja $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gj();
      return $$2;
   }

   public <E extends btd> E b(bsm<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ja($$1, $$2, $$3));
   }

   public <E extends btd> E b(bsm<E> $$0, ewf $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gj();
      return $$2;
   }

   public <E extends btd> E b(bsm<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ewf((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(btd $$0, float $$1, float $$2, float $$3) {
      ewf $$4 = this.a(new ewf((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dG(), $$0.dI());
   }

   public sx a(btd $$0, ja $$1, float $$2) {
      return this.g().a(2, () -> {
         eov $$3 = $$0.K().a(this.j($$1), 0);
         $$0.K().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ja($$0, $$1, $$2));
   }

   public void c(ja $$0) {
      this.b($$0, $$0x -> $$0x.a(avw.f), () -> "Expected button");
      ja $$1 = this.j($$0);
      dsk $$2 = this.a().a_($$1);
      dfr $$3 = (dfr)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(ja $$0) {
      this.a($$0, this.a(dcc.b));
   }

   public void a(ja $$0, cmk $$1) {
      ja $$2 = this.j($$0);
      this.a($$0, $$1, new ewb(ewf.b($$2), jf.c, $$2, true));
   }

   public void a(ja $$0, cmk $$1, ewb $$2) {
      ja $$3 = this.j($$0);
      dsk $$4 = this.a().a_($$3);
      bqf $$5 = bqf.a;
      bqi $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bqi.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cxo $$7 = new cxo($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public btb a(btb $$0) {
      $$0.j(0);
      $$0.u(0.25F);
      return $$0;
   }

   public btb b(btb $$0) {
      $$0.u(0.25F);
      return $$0;
   }

   public cmk a(final dcc $$0) {
      return new cmk(this.a(), ja.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return $$0 == dcc.d;
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
   public aqn c() {
      arb $$0 = arb.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aqn $$1 = new aqn(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      vp $$2 = new vp(zc.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ai().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new ja($$0, $$1, $$2));
   }

   public void e(ja $$0) {
      this.a(dfj.dw, $$0);
      ja $$1 = this.j($$0);
      dsk $$2 = this.a().a_($$1);
      dju $$3 = (dju)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(ja $$0, long $$1) {
      this.a($$0, dfj.ha);
      this.b($$1, () -> this.a($$0, dfj.a));
   }

   public void f(ja $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dfh $$3) {
      this.a(new ja($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dsk $$3) {
      this.a(new ja($$0, $$1, $$2), $$3);
   }

   public void a(ja $$0, dfh $$1) {
      this.a($$0, $$1.o());
   }

   public void a(ja $$0, dsk $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dfh $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ja($$1, $$2, $$3));
   }

   public void a(dfh $$0, ja $$1) {
      dsk $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dfh $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ja($$1, $$2, $$3));
   }

   public void b(dfh $$0, ja $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dfh $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ja($$1, $$2, $$3));
   }

   public void c(dfh $$0, ja $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ja $$0, Predicate<dfh> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ja $$0, Predicate<dfh> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ja $$0, dtn<T> $$1, T $$2) {
      dsk $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sm($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(ja $$0, dtn<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ja $$0, Predicate<dsk> $$1, Supplier<String> $$2) {
      dsk $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sm($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(ja $$0, jf $$1, IntPredicate $$2, Supplier<String> $$3) {
      ja $$4 = this.j($$0);
      aqm $$5 = this.a();
      dsk $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sm($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bsm<?> $$0) {
      List<? extends bsg> $$1 = this.a().a($$0, this.i(), bsg::bE);
      if ($$1.isEmpty()) {
         throw new sl("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bsm<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ja($$1, $$2, $$3));
   }

   public void c(bsm<?> $$0, ja $$1) {
      ja $$2 = this.j($$1);
      List<? extends bsg> $$3 = this.a().a($$0, new ewa($$2), bsg::bE);
      if ($$3.isEmpty()) {
         throw new sm("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(bsm<?> $$0, ewf $$1, ewf $$2) {
      List<? extends bsg> $$3 = this.a().a($$0, new ewa($$1, $$2), bsg::bE);
      if ($$3.isEmpty()) {
         throw new sm("Expected " + $$0.j() + " between ", ja.a($$1), ja.a($$2), this.a.o());
      }
   }

   public void a(bsm<?> $$0, int $$1) {
      List<? extends bsg> $$2 = this.a().a($$0, this.i(), bsg::bE);
      if ($$2.size() != $$1) {
         throw new sl("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bsm<?> $$0, ja $$1, int $$2, double $$3) {
      ja $$4 = this.j($$1);
      List<? extends bsg> $$5 = this.b((bsm<? extends bsg>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sm("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bsm<?> $$0, ja $$1, double $$2) {
      List<? extends bsg> $$3 = this.b((bsm<? extends bsg>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ja $$4 = this.j($$1);
         throw new sm("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bsg> List<T> b(bsm<T> $$0, ja $$1, double $$2) {
      ja $$3 = this.j($$1);
      return this.a().a($$0, new ewa($$3).g($$2), bsg::bE);
   }

   public <T extends bsg> List<T> c(bsm<T> $$0) {
      return this.a().a($$0, this.i(), bsg::bE);
   }

   public void a(bsg $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ja($$1, $$2, $$3));
   }

   public void a(bsg $$0, ja $$1) {
      ja $$2 = this.j($$1);
      List<? extends bsg> $$3 = this.a().a($$0.al(), new ewa($$2), bsg::bE);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sm("Expected " + $$0.al().j(), $$2, $$1, this.a.o()));
   }

   public void a(ctx $$0, ja $$1, double $$2, int $$3) {
      ja $$4 = this.j($$1);
      List<ciu> $$5 = this.a().a(bsm.ag, new ewa($$4).g($$2), bsg::bE);
      int $$6 = 0;

      for (ciu $$7 : $$5) {
         cuc $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.H();
         }
      }

      if ($$6 != $$3) {
         throw new sm("Expected " + $$3 + " " + $$0.s().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(ctx $$0, ja $$1, double $$2) {
      ja $$3 = this.j($$1);

      for (bsg $$5 : this.a().a(bsm.ag, new ewa($$3).g($$2), bsg::bE)) {
         ciu $$6 = (ciu)$$5;
         if ($$6.p().g().equals($$0)) {
            return;
         }
      }

      throw new sm("Expected " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(ctx $$0, ja $$1, double $$2) {
      ja $$3 = this.j($$1);

      for (bsg $$5 : this.a().a(bsm.ag, new ewa($$3).g($$2), bsg::bE)) {
         ciu $$6 = (ciu)$$5;
         if ($$6.p().g().equals($$0)) {
            throw new sm("Did not expect " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(ctx $$0) {
      for (bsg $$2 : this.a().a(bsm.ag, this.i(), bsg::bE)) {
         ciu $$3 = (ciu)$$2;
         if ($$3.p().g().equals($$0)) {
            return;
         }
      }

      throw new sl("Expected " + $$0.s().getString() + " item");
   }

   public void b(ctx $$0) {
      for (bsg $$2 : this.a().a(bsm.ag, this.i(), bsg::bE)) {
         ciu $$3 = (ciu)$$2;
         if ($$3.p().g().equals($$0)) {
            throw new sl("Did not expect " + $$0.s().getString() + " item");
         }
      }
   }

   public void d(bsm<?> $$0) {
      List<? extends bsg> $$1 = this.a().a($$0, this.i(), bsg::bE);
      if (!$$1.isEmpty()) {
         throw new sl("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bsm<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ja($$1, $$2, $$3));
   }

   public void d(bsm<?> $$0, ja $$1) {
      ja $$2 = this.j($$1);
      List<? extends bsg> $$3 = this.a().a($$0, new ewa($$2), bsg::bE);
      if (!$$3.isEmpty()) {
         throw new sm("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void b(bsm<?> $$0, ewf $$1, ewf $$2) {
      List<? extends bsg> $$3 = this.a().a($$0, new ewa($$1, $$2), bsg::bE);
      if (!$$3.isEmpty()) {
         throw new sm("Did not expect " + $$0.j() + " between ", ja.a($$1), ja.a($$2), this.a.o());
      }
   }

   public void a(bsm<?> $$0, double $$1, double $$2, double $$3) {
      ewf $$4 = new ewf($$1, $$2, $$3);
      ewf $$5 = this.a($$4);
      Predicate<? super bsg> $$6 = $$1x -> $$1x.cL().a($$5, $$5);
      List<? extends bsg> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sl("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bsm<?> $$0, double $$1, double $$2, double $$3) {
      ewf $$4 = new ewf($$1, $$2, $$3);
      ewf $$5 = this.a($$4);
      Predicate<? super bsg> $$6 = $$1x -> !$$1x.cL().a($$5, $$5);
      List<? extends bsg> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sl("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bsg, T> void a(ja $$0, bsm<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ja $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ewa($$4), bsg::bE);
      if ($$5.isEmpty()) {
         throw new sm("Expected " + $$1.j(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new sl("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new sl("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends btb> void a(ja $$0, bsm<E> $$1, ctx $$2) {
      ja $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ewa($$3), bsg::bE);
      if ($$4.isEmpty()) {
         throw new sm("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sm("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends bsg & clv> void b(ja $$0, bsm<E> $$1, ctx $$2) {
      ja $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ewa($$3), $$0x -> ((bsg)$$0x).bE());
      if ($$4.isEmpty()) {
         throw new sm("Expected " + $$1.j() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sm("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(ja $$0) {
      ja $$1 = this.j($$0);
      dpp $$2 = this.a().c_($$1);
      if ($$2 instanceof dpj && !((dpj)$$2).c()) {
         throw new sl("Container should be empty");
      }
   }

   public void a(ja $$0, ctx $$1) {
      ja $$2 = this.j($$0);
      dpp $$3 = this.a().c_($$2);
      if (!($$3 instanceof dpj)) {
         throw new sl("Expected a container at " + $$0 + ", found " + lq.j.b($$3.r()));
      } else if (((dpj)$$3).a_($$1) != 1) {
         throw new sl("Container should contain: " + $$1);
      }
   }

   public void a(eio $$0, ja $$1) {
      ja.a($$0).forEach($$2 -> {
         ja $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(ja $$0, ja $$1) {
      dsk $$2 = this.a($$0);
      dsk $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ja $$1, ctx $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ja $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bsg, T> void b(ja $$0, bsm<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bsg> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sl("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bsg, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sl("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(btb $$0, jj<brm> $$1, int $$2) {
      bro $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sl("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bsm<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ja($$1, $$2, $$3));
   }

   public void e(bsm<?> $$0, ja $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bsm<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ja($$1, $$2, $$3));
   }

   public void f(bsm<?> $$0, ja $$1) {
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

   public void h(ja $$0) {
      ja $$1 = this.j($$0);
      aqm $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(ja $$0) {
      ja $$1 = this.j($$0);
      aqm $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ewa $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new ja($$4, $$3, $$5));
         }
      }
   }

   public int a(dyf.a $$0, int $$1, int $$2) {
      ja $$3 = this.j(new ja($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ja $$1) {
      throw new sm($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, bsg $$1) {
      throw new sm($$0, $$1.dq(), this.k($$1.dq()), this.h());
   }

   public void a(String $$0) {
      throw new sl($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new sl("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public sx g() {
      return this.a.p();
   }

   public ja j(ja $$0) {
      ja $$1 = this.a.c();
      ja $$2 = $$1.a((ke)$$0);
      return emw.a($$2, dke.a, this.a.t(), $$1);
   }

   public ja k(ja $$0) {
      ja $$1 = this.a.c();
      dlu $$2 = this.a.t().a(dlu.c);
      ja $$3 = emw.a($$0, dke.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ewf a(ewf $$0) {
      ewf $$1 = ewf.a(this.a.c());
      return emw.a($$1.e($$0), dke.a, this.a.t(), this.a.c());
   }

   public ewf b(ewf $$0) {
      ewf $$1 = ewf.a(this.a.c());
      return emw.a($$0.d($$1), dke.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sl($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sl("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sl($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public ewa i() {
      return this.a.d();
   }

   private ewa k() {
      ewa $$0 = this.a.d();
      return $$0.a(ja.c.b(this.j(ja.c)));
   }

   public void a(Consumer<ja> $$0) {
      ewa $$1 = this.k().a(1.0, 1.0, 1.0);
      ja.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cmk $$0, cuc $$1, ja $$2, jf $$3) {
      ja $$4 = this.j($$2.a($$3));
      ewb $$5 = new ewb(ewf.b($$4), $$3, $$4, false);
      cxo $$6 = new cxo($$0, bqf.a, $$5);
      $$1.a($$6);
   }

   public void a(akj<ddf> $$0) {
      ewa $$1 = this.i();
      ja $$2 = ja.a($$1.a, $$1.b, $$1.c);
      ja $$3 = ja.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = amn.a(this.a(), $$2, $$3, this.a().H_().d(lr.aE).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
