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

public class tf {
   private final tg a;
   private boolean b;

   public tf(tg $$0) {
      this.a = $$0;
   }

   public aqt a() {
      return this.a.f();
   }

   public dtc a(ir $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dqc b(ir $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(brv.class);
   }

   public void a(Class $$0) {
      ewp $$1 = this.i();
      List<brv> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cly));
      $$2.forEach(brv::an);
   }

   public cig a(cuc $$0, ewu $$1) {
      aqt $$2 = this.a();
      ewu $$3 = this.a($$1);
      cig $$4 = new cig($$2, $$3.c, $$3.d, $$3.e, new cuh($$0, 1));
      $$4.o(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cig a(cuc $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ewu((double)$$1, (double)$$2, (double)$$3));
   }

   public cig a(cuc $$0, ir $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends brv> E a(bsb<E> $$0, ir $$1) {
      return this.a($$0, ewu.c($$1));
   }

   public <E extends brv> E a(bsb<E> $$0, ewu $$1) {
      aqt $$2 = this.a();
      E $$3 = $$0.a((dca)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bsq $$4) {
            $$4.gc();
         }

         ewu $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dK(), $$3.dM());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends brv> E a(bsb<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends brv> E a(bsb<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sy("Expected " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sy("Expected only one " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         ewu $$6 = this.a(new ewu((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.ds().f($$6);
            double $$4x = $$2x.ds().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends brv> List<E> b(bsb<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, ewu.c(new ir($$1, $$2, $$3)), $$4);
   }

   public <E extends brv> List<E> a(bsb<E> $$0, ewu $$1, double $$2) {
      aqt $$3 = this.a();
      ewu $$4 = this.a($$1);
      ewp $$5 = this.a.d();
      ewp $$6 = new ewp($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cP().c($$6) && $$1x.bI());
   }

   public <E extends brv> E a(bsb<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ir($$1, $$2, $$3));
   }

   public <E extends brv> E a(bsb<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ewu((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bsq> E b(bsb<E> $$0, ir $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gt();
      return $$2;
   }

   public <E extends bsq> E b(bsb<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ir($$1, $$2, $$3));
   }

   public <E extends bsq> E b(bsb<E> $$0, ewu $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gt();
      return $$2;
   }

   public <E extends bsq> E b(bsb<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ewu((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bsq $$0, float $$1, float $$2, float $$3) {
      ewu $$4 = this.a(new ewu((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dK(), $$0.dM());
   }

   public tk a(bsq $$0, ir $$1, float $$2) {
      return this.g().a(2, () -> {
         eps $$3 = $$0.J().a(this.j($$1), 0);
         $$0.J().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ir($$0, $$1, $$2));
   }

   public void c(ir $$0) {
      this.b($$0, $$0x -> $$0x.a(awe.f), () -> "Expected button");
      ir $$1 = this.j($$0);
      dtc $$2 = this.a().a_($$1);
      dfm $$3 = (dfm)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(ir $$0) {
      this.a($$0, this.a(dbx.b));
   }

   public void a(ir $$0, cly $$1) {
      ir $$2 = this.j($$0);
      this.a($$0, $$1, new ewq(ewu.b($$2), iw.c, $$2, true));
   }

   public void a(ir $$0, cly $$1, ewq $$2) {
      ir $$3 = this.j($$0);
      dtc $$4 = this.a().a_($$3);
      bpz $$5 = bpz.a;
      bqc $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bqc.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cyf $$7 = new cyf($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bso a(bso $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public bso b(bso $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public cly a(final dbx $$0) {
      return new cly(this.a(), ir.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean O_() {
            return $$0 == dbx.d;
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
   public aqu c() {
      ari $$0 = ari.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aqu $$1 = new aqu(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean O_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      wc $$2 = new wc(zm.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new ir($$0, $$1, $$2));
   }

   public void e(ir $$0) {
      this.a(dfe.ek, $$0);
      ir $$1 = this.j($$0);
      dtc $$2 = this.a().a_($$1);
      djt $$3 = (djt)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(ir $$0, long $$1) {
      this.a($$0, dfe.hU);
      this.b($$1, () -> this.a($$0, dfe.a));
   }

   public void f(ir $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dfc $$3) {
      this.a(new ir($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dtc $$3) {
      this.a(new ir($$0, $$1, $$2), $$3);
   }

   public void a(ir $$0, dfc $$1) {
      this.a($$0, $$1.n());
   }

   public void a(ir $$0, dtc $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dfc $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ir($$1, $$2, $$3));
   }

   public void a(dfc $$0, ir $$1) {
      dtc $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dfc $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ir($$1, $$2, $$3));
   }

   public void b(dfc $$0, ir $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dfc $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ir($$1, $$2, $$3));
   }

   public void c(dfc $$0, ir $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ir $$0, Predicate<dfc> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ir $$0, Predicate<dfc> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ir $$0, duf<T> $$1, T $$2) {
      dtc $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sz($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(ir $$0, duf<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ir $$0, Predicate<dtc> $$1, Supplier<String> $$2) {
      dtc $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sz($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(ir $$0, iw $$1, IntPredicate $$2, Supplier<String> $$3) {
      ir $$4 = this.j($$0);
      aqt $$5 = this.a();
      dtc $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sz($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bsb<?> $$0) {
      List<? extends brv> $$1 = this.a().a($$0, this.i(), brv::bI);
      if ($$1.isEmpty()) {
         throw new sy("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bsb<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ir($$1, $$2, $$3));
   }

   public void c(bsb<?> $$0, ir $$1) {
      ir $$2 = this.j($$1);
      List<? extends brv> $$3 = this.a().a($$0, new ewp($$2), brv::bI);
      if ($$3.isEmpty()) {
         throw new sz("Expected " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bsb<?> $$0, ewu $$1, ewu $$2) {
      List<? extends brv> $$3 = this.a().a($$0, new ewp($$1, $$2), brv::bI);
      if ($$3.isEmpty()) {
         throw new sz("Expected " + $$0.i() + " between ", ir.a($$1), ir.a($$2), this.a.o());
      }
   }

   public void a(bsb<?> $$0, int $$1) {
      List<? extends brv> $$2 = this.a().a($$0, this.i(), brv::bI);
      if ($$2.size() != $$1) {
         throw new sy("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(bsb<?> $$0, ir $$1, int $$2, double $$3) {
      ir $$4 = this.j($$1);
      List<? extends brv> $$5 = this.b((bsb<? extends brv>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sz("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bsb<?> $$0, ir $$1, double $$2) {
      List<? extends brv> $$3 = this.b((bsb<? extends brv>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ir $$4 = this.j($$1);
         throw new sz("Expected " + $$0.i(), $$4, $$1, this.a.o());
      }
   }

   public <T extends brv> List<T> b(bsb<T> $$0, ir $$1, double $$2) {
      ir $$3 = this.j($$1);
      return this.a().a($$0, new ewp($$3).g($$2), brv::bI);
   }

   public <T extends brv> List<T> c(bsb<T> $$0) {
      return this.a().a($$0, this.i(), brv::bI);
   }

   public void a(brv $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ir($$1, $$2, $$3));
   }

   public void a(brv $$0, ir $$1) {
      ir $$2 = this.j($$1);
      List<? extends brv> $$3 = this.a().a($$0.ak(), new ewp($$2), brv::bI);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sz("Expected " + $$0.ak().i(), $$2, $$1, this.a.o()));
   }

   public void a(cuc $$0, ir $$1, double $$2, int $$3) {
      ir $$4 = this.j($$1);
      List<cig> $$5 = this.a().a(bsb.ai, new ewp($$4).g($$2), brv::bI);
      int $$6 = 0;

      for (cig $$7 : $$5) {
         cuh $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.G();
         }
      }

      if ($$6 != $$3) {
         throw new sz("Expected " + $$3 + " " + $$0.r().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cuc $$0, ir $$1, double $$2) {
      ir $$3 = this.j($$1);

      for (brv $$5 : this.a().a(bsb.ai, new ewp($$3).g($$2), brv::bI)) {
         cig $$6 = (cig)$$5;
         if ($$6.p().f().equals($$0)) {
            return;
         }
      }

      throw new sz("Expected " + $$0.r().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cuc $$0, ir $$1, double $$2) {
      ir $$3 = this.j($$1);

      for (brv $$5 : this.a().a(bsb.ai, new ewp($$3).g($$2), brv::bI)) {
         cig $$6 = (cig)$$5;
         if ($$6.p().f().equals($$0)) {
            throw new sz("Did not expect " + $$0.r().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cuc $$0) {
      for (brv $$2 : this.a().a(bsb.ai, this.i(), brv::bI)) {
         cig $$3 = (cig)$$2;
         if ($$3.p().f().equals($$0)) {
            return;
         }
      }

      throw new sy("Expected " + $$0.r().getString() + " item");
   }

   public void b(cuc $$0) {
      for (brv $$2 : this.a().a(bsb.ai, this.i(), brv::bI)) {
         cig $$3 = (cig)$$2;
         if ($$3.p().f().equals($$0)) {
            throw new sy("Did not expect " + $$0.r().getString() + " item");
         }
      }
   }

   public void d(bsb<?> $$0) {
      List<? extends brv> $$1 = this.a().a($$0, this.i(), brv::bI);
      if (!$$1.isEmpty()) {
         throw new sy("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bsb<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ir($$1, $$2, $$3));
   }

   public void d(bsb<?> $$0, ir $$1) {
      ir $$2 = this.j($$1);
      List<? extends brv> $$3 = this.a().a($$0, new ewp($$2), brv::bI);
      if (!$$3.isEmpty()) {
         throw new sz("Did not expect " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bsb<?> $$0, double $$1, double $$2, double $$3) {
      ewu $$4 = new ewu($$1, $$2, $$3);
      ewu $$5 = this.a($$4);
      Predicate<? super brv> $$6 = $$1x -> $$1x.cP().a($$5, $$5);
      List<? extends brv> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sy("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bsb<?> $$0, double $$1, double $$2, double $$3) {
      ewu $$4 = new ewu($$1, $$2, $$3);
      ewu $$5 = this.a($$4);
      Predicate<? super brv> $$6 = $$1x -> !$$1x.cP().a($$5, $$5);
      List<? extends brv> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sy("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends brv, T> void a(ir $$0, bsb<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ir $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ewp($$4), brv::bI);
      if ($$5.isEmpty()) {
         throw new sz("Expected " + $$1.i(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new sy("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new sy("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bso> void a(ir $$0, bsb<E> $$1, cuc $$2) {
      ir $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ewp($$3), brv::bI);
      if ($$4.isEmpty()) {
         throw new sz("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sz("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends brv & clj> void b(ir $$0, bsb<E> $$1, cuc $$2) {
      ir $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ewp($$3), $$0x -> ((brv)$$0x).bI());
      if ($$4.isEmpty()) {
         throw new sz("Expected " + $$1.i() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.x().b($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sz("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(ir $$0) {
      ir $$1 = this.j($$0);
      dqc $$2 = this.a().c_($$1);
      if ($$2 instanceof dpv && !((dpv)$$2).c()) {
         throw new sy("Container should be empty");
      }
   }

   public void a(ir $$0, cuc $$1) {
      ir $$2 = this.j($$0);
      dqc $$3 = this.a().c_($$2);
      if (!($$3 instanceof dpv)) {
         throw new sy("Expected a container at " + $$0 + ", found " + lh.k.b($$3.r()));
      } else if (((dpv)$$3).a_($$1) != 1) {
         throw new sy("Container should contain: " + $$1);
      }
   }

   public void a(ejl $$0, ir $$1) {
      ir.a($$0).forEach($$2 -> {
         ir $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(ir $$0, ir $$1) {
      dtc $$2 = this.a($$0);
      dtc $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ir $$1, cuc $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ir $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends brv, T> void b(ir $$0, bsb<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends brv> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sy("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends brv, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sy("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bso $$0, ja<brf> $$1, int $$2) {
      brh $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sy("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bsb<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ir($$1, $$2, $$3));
   }

   public void e(bsb<?> $$0, ir $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bsb<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ir($$1, $$2, $$3));
   }

   public void f(bsb<?> $$0, ir $$1) {
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

   public void h(ir $$0) {
      ir $$1 = this.j($$0);
      aqt $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void i(ir $$0) {
      ir $$1 = this.j($$0);
      aqt $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ewp $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new ir($$4, $$3, $$5));
         }
      }
   }

   public int a(dyu.a $$0, int $$1, int $$2) {
      ir $$3 = this.j(new ir($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ir $$1) {
      throw new sz($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, brv $$1) {
      throw new sz($$0, $$1.du(), this.k($$1.du()), this.h());
   }

   public void a(String $$0) {
      throw new sy($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new sy("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public tk g() {
      return this.a.p();
   }

   public ir j(ir $$0) {
      ir $$1 = this.a.c();
      ir $$2 = $$1.a((jv)$$0);
      return ent.a($$2, dke.a, this.a.t(), $$1);
   }

   public ir k(ir $$0) {
      ir $$1 = this.a.c();
      dmd $$2 = this.a.t().a(dmd.c);
      ir $$3 = ent.a($$0, dke.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ewu a(ewu $$0) {
      ewu $$1 = ewu.a(this.a.c());
      return ent.a($$1.e($$0), dke.a, this.a.t(), this.a.c());
   }

   public ewu b(ewu $$0) {
      ewu $$1 = ewu.a(this.a.c());
      return ent.a($$0.d($$1), dke.a, this.a.t(), this.a.c());
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

   public long h() {
      return this.a.o();
   }

   public ewp i() {
      return this.a.d();
   }

   private ewp k() {
      ewp $$0 = this.a.d();
      return $$0.a(ir.c.b(this.j(ir.c)));
   }

   public void a(Consumer<ir> $$0) {
      ewp $$1 = this.k().a(1.0, 1.0, 1.0);
      ir.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cly $$0, cuh $$1, ir $$2, iw $$3) {
      ir $$4 = this.j($$2.a($$3));
      ewq $$5 = new ewq(ewu.b($$4), $$3, $$4, false);
      cyf $$6 = new cyf($$0, bpz.a, $$5);
      $$1.a($$6);
   }

   public void a(aks<dcz> $$0) {
      ewp $$1 = this.i();
      ir $$2 = ir.a($$1.a, $$1.b, $$1.c);
      ir $$3 = ir.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = amw.a(this.a(), $$2, $$3, this.a().I_().d(li.az).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
