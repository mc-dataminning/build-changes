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

public class sh {
   private final si a;
   private boolean b;

   public sh(si $$0) {
      this.a = $$0;
   }

   public aps a() {
      return this.a.f();
   }

   public doz a(ib $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dmf b(ib $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(bpv.class);
   }

   public void a(Class $$0) {
      erv $$1 = this.i();
      List<bpv> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cjt));
      $$2.forEach(bpv::al);
   }

   public cgd a(cre $$0, esa $$1) {
      aps $$2 = this.a();
      esa $$3 = this.a($$1);
      cgd $$4 = new cgd($$2, $$3.c, $$3.d, $$3.e, new crj($$0, 1));
      $$4.o(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cgd a(cre $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new esa((double)$$1, (double)$$2, (double)$$3));
   }

   public cgd a(cre $$0, ib $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bpv> E a(bqb<E> $$0, ib $$1) {
      return this.a($$0, esa.c($$1));
   }

   public <E extends bpv> E a(bqb<E> $$0, esa $$1) {
      aps $$2 = this.a();
      E $$3 = $$0.a((cyx)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bqq $$4) {
            $$4.fS();
         }

         esa $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dC(), $$3.dE());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bpv> E a(bqb<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bpv> E a(bqb<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sa("Expected " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sa("Expected only one " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         esa $$6 = this.a(new esa((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dk().f($$6);
            double $$4x = $$2x.dk().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bpv> List<E> b(bqb<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, esa.c(new ib($$1, $$2, $$3)), $$4);
   }

   public <E extends bpv> List<E> a(bqb<E> $$0, esa $$1, double $$2) {
      aps $$3 = this.a();
      esa $$4 = this.a($$1);
      erv $$5 = this.a.d();
      erv $$6 = new erv($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cH().c($$6) && $$1x.bA());
   }

   public <E extends bpv> E a(bqb<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ib($$1, $$2, $$3));
   }

   public <E extends bpv> E a(bqb<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new esa((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bqq> E b(bqb<E> $$0, ib $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gi();
      return $$2;
   }

   public <E extends bqq> E b(bqb<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ib($$1, $$2, $$3));
   }

   public <E extends bqq> E b(bqb<E> $$0, esa $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gi();
      return $$2;
   }

   public <E extends bqq> E b(bqb<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new esa((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bqq $$0, float $$1, float $$2, float $$3) {
      esa $$4 = this.a(new esa((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dC(), $$0.dE());
   }

   public sm a(bqq $$0, ib $$1, float $$2) {
      return this.g().a(2, () -> {
         elg $$3 = $$0.K().a(this.j($$1), 0);
         $$0.K().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ib($$0, $$1, $$2));
   }

   public void c(ib $$0) {
      this.b($$0, $$0x -> $$0x.a(avc.f), () -> "Expected button");
      ib $$1 = this.j($$0);
      doz $$2 = this.a().a_($$1);
      dci $$3 = (dci)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(ib $$0) {
      this.a($$0, this.a(cyu.b));
   }

   public void a(ib $$0, cjt $$1) {
      ib $$2 = this.j($$0);
      this.a($$0, $$1, new erw(esa.b($$2), ih.c, $$2, true));
   }

   public void a(ib $$0, cjt $$1, erw $$2) {
      ib $$3 = this.j($$0);
      doz $$4 = this.a().a_($$3);
      bnz $$5 = bnz.a;
      boc $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != boc.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cuq $$7 = new cuq($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bqo a(bqo $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public bqo b(bqo $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public cjt a(final cyu $$0) {
      return new cjt(this.a(), ib.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return $$0 == cyu.d;
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
   public apt c() {
      aqh $$0 = aqh.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      apt $$1 = new apt(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      ve $$2 = new ve(yo.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new ib($$0, $$1, $$2));
   }

   public void e(ib $$0) {
      this.a(dca.dw, $$0);
      ib $$1 = this.j($$0);
      doz $$2 = this.a().a_($$1);
      dgk $$3 = (dgk)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(ib $$0, long $$1) {
      this.a($$0, dca.ha);
      this.b($$1, () -> this.a($$0, dca.a));
   }

   public void f(ib $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dby $$3) {
      this.a(new ib($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, doz $$3) {
      this.a(new ib($$0, $$1, $$2), $$3);
   }

   public void a(ib $$0, dby $$1) {
      this.a($$0, $$1.n());
   }

   public void a(ib $$0, doz $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dby $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ib($$1, $$2, $$3));
   }

   public void a(dby $$0, ib $$1) {
      doz $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dby $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ib($$1, $$2, $$3));
   }

   public void b(dby $$0, ib $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dby $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ib($$1, $$2, $$3));
   }

   public void c(dby $$0, ib $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ib $$0, Predicate<dby> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ib $$0, Predicate<dby> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ib $$0, dqc<T> $$1, T $$2) {
      doz $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sb($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(ib $$0, dqc<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ib $$0, Predicate<doz> $$1, Supplier<String> $$2) {
      doz $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sb($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(ib $$0, ih $$1, IntPredicate $$2, Supplier<String> $$3) {
      ib $$4 = this.j($$0);
      aps $$5 = this.a();
      doz $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sb($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bqb<?> $$0) {
      List<? extends bpv> $$1 = this.a().a($$0, this.i(), bpv::bA);
      if ($$1.isEmpty()) {
         throw new sa("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bqb<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ib($$1, $$2, $$3));
   }

   public void c(bqb<?> $$0, ib $$1) {
      ib $$2 = this.j($$1);
      List<? extends bpv> $$3 = this.a().a($$0, new erv($$2), bpv::bA);
      if ($$3.isEmpty()) {
         throw new sb("Expected " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bqb<?> $$0, esa $$1, esa $$2) {
      List<? extends bpv> $$3 = this.a().a($$0, new erv($$1, $$2), bpv::bA);
      if ($$3.isEmpty()) {
         throw new sb("Expected " + $$0.i() + " between ", ib.a($$1), ib.a($$2), this.a.o());
      }
   }

   public void a(bqb<?> $$0, int $$1) {
      List<? extends bpv> $$2 = this.a().a($$0, this.i(), bpv::bA);
      if ($$2.size() != $$1) {
         throw new sa("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(bqb<?> $$0, ib $$1, int $$2, double $$3) {
      ib $$4 = this.j($$1);
      List<? extends bpv> $$5 = this.b((bqb<? extends bpv>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sb("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bqb<?> $$0, ib $$1, double $$2) {
      List<? extends bpv> $$3 = this.b((bqb<? extends bpv>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ib $$4 = this.j($$1);
         throw new sb("Expected " + $$0.i(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bpv> List<T> b(bqb<T> $$0, ib $$1, double $$2) {
      ib $$3 = this.j($$1);
      return this.a().a($$0, new erv($$3).g($$2), bpv::bA);
   }

   public <T extends bpv> List<T> c(bqb<T> $$0) {
      return this.a().a($$0, this.i(), bpv::bA);
   }

   public void a(bpv $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ib($$1, $$2, $$3));
   }

   public void a(bpv $$0, ib $$1) {
      ib $$2 = this.j($$1);
      List<? extends bpv> $$3 = this.a().a($$0.ai(), new erv($$2), bpv::bA);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sb("Expected " + $$0.ai().i(), $$2, $$1, this.a.o()));
   }

   public void a(cre $$0, ib $$1, double $$2, int $$3) {
      ib $$4 = this.j($$1);
      List<cgd> $$5 = this.a().a(bqb.ag, new erv($$4).g($$2), bpv::bA);
      int $$6 = 0;

      for (cgd $$7 : $$5) {
         crj $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.G();
         }
      }

      if ($$6 != $$3) {
         throw new sb("Expected " + $$3 + " " + $$0.t().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cre $$0, ib $$1, double $$2) {
      ib $$3 = this.j($$1);

      for (bpv $$5 : this.a().a(bqb.ag, new erv($$3).g($$2), bpv::bA)) {
         cgd $$6 = (cgd)$$5;
         if ($$6.p().f().equals($$0)) {
            return;
         }
      }

      throw new sb("Expected " + $$0.t().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cre $$0, ib $$1, double $$2) {
      ib $$3 = this.j($$1);

      for (bpv $$5 : this.a().a(bqb.ag, new erv($$3).g($$2), bpv::bA)) {
         cgd $$6 = (cgd)$$5;
         if ($$6.p().f().equals($$0)) {
            throw new sb("Did not expect " + $$0.t().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cre $$0) {
      for (bpv $$2 : this.a().a(bqb.ag, this.i(), bpv::bA)) {
         cgd $$3 = (cgd)$$2;
         if ($$3.p().f().equals($$0)) {
            return;
         }
      }

      throw new sa("Expected " + $$0.t().getString() + " item");
   }

   public void b(cre $$0) {
      for (bpv $$2 : this.a().a(bqb.ag, this.i(), bpv::bA)) {
         cgd $$3 = (cgd)$$2;
         if ($$3.p().f().equals($$0)) {
            throw new sa("Did not expect " + $$0.t().getString() + " item");
         }
      }
   }

   public void d(bqb<?> $$0) {
      List<? extends bpv> $$1 = this.a().a($$0, this.i(), bpv::bA);
      if (!$$1.isEmpty()) {
         throw new sa("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bqb<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ib($$1, $$2, $$3));
   }

   public void d(bqb<?> $$0, ib $$1) {
      ib $$2 = this.j($$1);
      List<? extends bpv> $$3 = this.a().a($$0, new erv($$2), bpv::bA);
      if (!$$3.isEmpty()) {
         throw new sb("Did not expect " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bqb<?> $$0, double $$1, double $$2, double $$3) {
      esa $$4 = new esa($$1, $$2, $$3);
      esa $$5 = this.a($$4);
      Predicate<? super bpv> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends bpv> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sa("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bqb<?> $$0, double $$1, double $$2, double $$3) {
      esa $$4 = new esa($$1, $$2, $$3);
      esa $$5 = this.a($$4);
      Predicate<? super bpv> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends bpv> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sa("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bpv, T> void a(ib $$0, bqb<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ib $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new erv($$4), bpv::bA);
      if ($$5.isEmpty()) {
         throw new sb("Expected " + $$1.i(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new sa("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new sa("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bqo> void a(ib $$0, bqb<E> $$1, cre $$2) {
      ib $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new erv($$3), bpv::bA);
      if ($$4.isEmpty()) {
         throw new sb("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sb("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends bpv & cje> void b(ib $$0, bqb<E> $$1, cre $$2) {
      ib $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new erv($$3), $$0x -> ((bpv)$$0x).bA());
      if ($$4.isEmpty()) {
         throw new sb("Expected " + $$1.i() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sb("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(ib $$0) {
      ib $$1 = this.j($$0);
      dmf $$2 = this.a().c_($$1);
      if ($$2 instanceof dlz && !((dlz)$$2).ah_()) {
         throw new sa("Container should be empty");
      }
   }

   public void a(ib $$0, cre $$1) {
      ib $$2 = this.j($$0);
      dmf $$3 = this.a().c_($$2);
      if (!($$3 instanceof dlz)) {
         throw new sa("Expected a container at " + $$0 + ", found " + kr.k.b($$3.r()));
      } else if (((dlz)$$3).a_($$1) != 1) {
         throw new sa("Container should contain: " + $$1);
      }
   }

   public void a(eez $$0, ib $$1) {
      ib.a($$0).forEach($$2 -> {
         ib $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(ib $$0, ib $$1) {
      doz $$2 = this.a($$0);
      doz $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ib $$1, cre $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ib $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bpv, T> void b(ib $$0, bqb<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bpv> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sa("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bpv, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sa("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bqo $$0, il<bpf> $$1, int $$2) {
      bph $$3 = $$0.c($$1);
      if ($$3 == null || $$3.d() != $$2) {
         int $$4 = $$2 + 1;
         throw new sa("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bqb<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ib($$1, $$2, $$3));
   }

   public void e(bqb<?> $$0, ib $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bqb<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ib($$1, $$2, $$3));
   }

   public void f(bqb<?> $$0, ib $$1) {
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

   public void h(ib $$0) {
      ib $$1 = this.j($$0);
      aps $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(ib $$0) {
      ib $$1 = this.j($$0);
      aps $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      erv $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new ib($$4, $$3, $$5));
         }
      }
   }

   public int a(dur.a $$0, int $$1, int $$2) {
      ib $$3 = this.j(new ib($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ib $$1) {
      throw new sb($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, bpv $$1) {
      throw new sb($$0, $$1.dm(), this.k($$1.dm()), this.h());
   }

   public void a(String $$0) {
      throw new sa($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new sa("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public sm g() {
      return this.a.p();
   }

   public ib j(ib $$0) {
      ib $$1 = this.a.c();
      ib $$2 = $$1.a((jg)$$0);
      return ejh.a($$2, dgu.a, this.a.t(), $$1);
   }

   public ib k(ib $$0) {
      ib $$1 = this.a.c();
      dik $$2 = this.a.t().a(dik.c);
      ib $$3 = ejh.a($$0, dgu.a, $$2, $$1);
      return $$3.b($$1);
   }

   public esa a(esa $$0) {
      esa $$1 = esa.a(this.a.c());
      return ejh.a($$1.e($$0), dgu.a, this.a.t(), this.a.c());
   }

   public esa b(esa $$0) {
      esa $$1 = esa.a(this.a.c());
      return ejh.a($$0.d($$1), dgu.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sa($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sa("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sa($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public erv i() {
      return this.a.d();
   }

   private erv k() {
      erv $$0 = this.a.d();
      return $$0.a(ib.c.b(this.j(ib.c)));
   }

   public void a(Consumer<ib> $$0) {
      erv $$1 = this.k().a(1.0, 1.0, 1.0);
      ib.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cjt $$0, crj $$1, ib $$2, ih $$3) {
      ib $$4 = this.j($$2.a($$3));
      erw $$5 = new erw(esa.b($$4), $$3, $$4, false);
      cuq $$6 = new cuq($$0, bnz.a, $$5);
      $$1.a($$6);
   }

   public void a(ajs<czw> $$0) {
      erv $$1 = this.i();
      ib $$2 = ib.a($$1.a, $$1.b, $$1.c);
      ib $$3 = ib.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = alv.a(this.a(), $$2, $$3, this.a().H_().d(ks.av).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
