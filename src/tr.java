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

public class tr {
   private final ts a;
   private boolean b;

   public tr(ts $$0) {
      this.a = $$0;
   }

   public ash a() {
      return this.a.g();
   }

   public dxu a(jh $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends duw> T b(jh $$0) {
      duw $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new tl("Missing block entity", this.j($$0), $$0, this.a.p());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bvj.class);
   }

   public void a(Class $$0) {
      fbs $$1 = this.j();
      List<bvj> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cpw));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public cma a(cxk $$0, fbx $$1) {
      ash $$2 = this.a();
      fbx $$3 = this.a($$1);
      cma $$4 = new cma($$2, $$3.d, $$3.e, $$3.f, new cxo($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cma a(cxk $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fbx((double)$$1, (double)$$2, (double)$$3));
   }

   public cma a(cxk $$0, jh $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bvj> E a(bvq<E> $$0, jh $$1) {
      return this.a($$0, fbx.c($$1));
   }

   public <E extends bvj> E a(bvq<E> $$0, fbx $$1) {
      ash $$2 = this.a();
      E $$3 = $$0.a($$2, bvp.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bwh $$4) {
            $$4.ai();
         }

         fbx $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dL(), $$3.dN());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bvj $$0, btz $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bvj $$0) {
      $$0.c(this.a());
   }

   public <E extends bvj> E a(bvq<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bvj> E a(bvq<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new tk("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new tk("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         fbx $$6 = this.a(new fbx((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dt().f($$6);
            double $$4x = $$2x.dt().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bvj> List<E> b(bvq<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, fbx.c(new jh($$1, $$2, $$3)), $$4);
   }

   public <E extends bvj> List<E> a(bvq<E> $$0, fbx $$1, double $$2) {
      ash $$3 = this.a();
      fbx $$4 = this.a($$1);
      fbs $$5 = this.a.e();
      fbs $$6 = new fbs($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bL());
   }

   public <E extends bvj> E a(bvq<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bvj> E a(bvq<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fbx((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bwh> E b(bvq<E> $$0, jh $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gf();
      return $$2;
   }

   public <E extends bwh> E b(bvq<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bwh> E b(bvq<E> $$0, fbx $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gf();
      return $$2;
   }

   public <E extends bwh> E b(bvq<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new fbx((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bwh $$0, float $$1, float $$2, float $$3) {
      fbx $$4 = this.a(new fbx((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dL(), $$0.dN());
   }

   public tw a(bwh $$0, jh $$1, float $$2) {
      return this.g().a(2, () -> {
         euk $$3 = $$0.L().a(this.j($$1), 0);
         $$0.L().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new jh($$0, $$1, $$2));
   }

   public void c(jh $$0) {
      this.b($$0, $$0x -> $$0x.a(axu.f), () -> "Expected button");
      jh $$1 = this.j($$0);
      dxu $$2 = this.a().a_($$1);
      dkw $$3 = (dkw)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(jh $$0) {
      this.a($$0, this.a(dhe.b));
   }

   public void a(jh $$0, cpw $$1) {
      jh $$2 = this.j($$0);
      this.a($$0, $$1, new fbt(fbx.b($$2), jm.c, $$2, true));
   }

   public void a(jh $$0, cpw $$1, fbt $$2) {
      jh $$3 = this.j($$0);
      dxu $$4 = this.a().a_($$3);
      bth $$5 = bth.a;
      bti $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bti.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            dbh $$7 = new dbh($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bwf a(bwf $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public bwf b(bwf $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public cpw a(final dhe $$0) {
      return new cpw(this.a(), jh.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean aa_() {
            return $$0 == dhe.d;
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
   public asi c() {
      asx $$0 = asx.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      asi $$1 = new asi(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean aa_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      wp $$2 = new wp(aad.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new jh($$0, $$1, $$2));
   }

   public void e(jh $$0) {
      this.a(dkn.dI, $$0);
      jh $$1 = this.j($$0);
      dxu $$2 = this.a().a_($$1);
      dpa $$3 = (dpa)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jh $$0, long $$1) {
      this.a($$0, dkn.hq);
      this.b($$1, () -> this.a($$0, dkn.a));
   }

   public void f(jh $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dkl $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dxu $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(jh $$0, dkl $$1) {
      this.a($$0, $$1.m());
   }

   public void a(jh $$0, dxu $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dkl $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(dkl $$0, jh $$1) {
      dxu $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dkl $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jh($$1, $$2, $$3));
   }

   public void b(dkl $$0, jh $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dkl $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(dkl $$0, jh $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jh $$0, Predicate<dkl> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(jh $$0, Predicate<dkl> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(jh $$0, dyw<T> $$1, T $$2) {
      dxu $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new tl($$6, this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(jh $$0, dyw<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(jh $$0, Predicate<dxu> $$1, Supplier<String> $$2) {
      dxu $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new tl($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends duw> void c(jh $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new tl($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public void a(jh $$0, jm $$1, IntPredicate $$2, Supplier<String> $$3) {
      jh $$4 = this.j($$0);
      ash $$5 = this.a();
      dxu $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new tl($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void b(bvq<?> $$0) {
      List<? extends bvj> $$1 = this.a().a($$0, this.j(), bvj::bL);
      if ($$1.isEmpty()) {
         throw new tk("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bvq<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(bvq<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvj> $$3 = this.a().a($$0, new fbs($$2), bvj::bL);
      if ($$3.isEmpty()) {
         throw new tl("Expected " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void a(bvq<?> $$0, fbs $$1) {
      fbs $$2 = this.a($$1);
      List<? extends bvj> $$3 = this.a().a($$0, $$2, bvj::bL);
      if ($$3.isEmpty()) {
         throw new tl("Expected " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.p());
      }
   }

   public void a(bvq<?> $$0, int $$1) {
      List<? extends bvj> $$2 = this.a().a($$0, this.j(), bvj::bL);
      if ($$2.size() != $$1) {
         throw new tk("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bvq<?> $$0, jh $$1, int $$2, double $$3) {
      jh $$4 = this.j($$1);
      List<? extends bvj> $$5 = this.b((bvq<? extends bvj>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new tl("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bvq<?> $$0, jh $$1, double $$2) {
      List<? extends bvj> $$3 = this.b((bvq<? extends bvj>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jh $$4 = this.j($$1);
         throw new tl("Expected " + $$0.j(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bvj> List<T> b(bvq<T> $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);
      return this.a().a($$0, new fbs($$3).g($$2), bvj::bL);
   }

   public <T extends bvj> List<T> c(bvq<T> $$0) {
      return this.a().a($$0, this.j(), bvj::bL);
   }

   public void a(bvj $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(bvj $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvj> $$3 = this.a().a($$0.aq(), new fbs($$2), bvj::bL);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new tl("Expected " + $$0.aq().j(), $$2, $$1, this.a.p()));
   }

   public void a(cxk $$0, jh $$1, double $$2, int $$3) {
      jh $$4 = this.j($$1);
      List<cma> $$5 = this.a().a(bvq.ar, new fbs($$4).g($$2), bvj::bL);
      int $$6 = 0;

      for (cma $$7 : $$5) {
         cxo $$8 = $$7.l();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new tl("Expected " + $$3 + " " + $$0.m().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cxk $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bvj $$5 : this.a().a(bvq.ar, new fbs($$3).g($$2), bvj::bL)) {
         cma $$6 = (cma)$$5;
         if ($$6.l().h().equals($$0)) {
            return;
         }
      }

      throw new tl("Expected " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cxk $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bvj $$5 : this.a().a(bvq.ar, new fbs($$3).g($$2), bvj::bL)) {
         cma $$6 = (cma)$$5;
         if ($$6.l().h().equals($$0)) {
            throw new tl("Did not expect " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(cxk $$0) {
      for (bvj $$2 : this.a().a(bvq.ar, this.j(), bvj::bL)) {
         cma $$3 = (cma)$$2;
         if ($$3.l().h().equals($$0)) {
            return;
         }
      }

      throw new tk("Expected " + $$0.m().getString() + " item");
   }

   public void b(cxk $$0) {
      for (bvj $$2 : this.a().a(bvq.ar, this.j(), bvj::bL)) {
         cma $$3 = (cma)$$2;
         if ($$3.l().h().equals($$0)) {
            throw new tk("Did not expect " + $$0.m().getString() + " item");
         }
      }
   }

   public void d(bvq<?> $$0) {
      List<? extends bvj> $$1 = this.a().a($$0, this.j(), bvj::bL);
      if (!$$1.isEmpty()) {
         throw new tk("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bvq<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jh($$1, $$2, $$3));
   }

   public void d(bvq<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvj> $$3 = this.a().a($$0, new fbs($$2), bvj::bL);
      if (!$$3.isEmpty()) {
         throw new tl("Did not expect " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void b(bvq<?> $$0, fbs $$1) {
      fbs $$2 = this.a($$1);
      List<? extends bvj> $$3 = this.a().a($$0, $$2, bvj::bL);
      if (!$$3.isEmpty()) {
         throw new tl("Did not expect " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.p());
      }
   }

   public void a(bvq<?> $$0, double $$1, double $$2, double $$3) {
      fbx $$4 = new fbx($$1, $$2, $$3);
      fbx $$5 = this.a($$4);
      Predicate<? super bvj> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bvj> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new tk("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bvq<?> $$0, double $$1, double $$2, double $$3) {
      fbx $$4 = new fbx($$1, $$2, $$3);
      fbx $$5 = this.a($$4);
      Predicate<? super bvj> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bvj> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new tk("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bvj, T> void a(jh $$0, bvq<E> $$1, Predicate<E> $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbs($$3), bvj::bL);
      if ($$4.isEmpty()) {
         throw new tl("Expected " + $$1.j(), $$3, $$0, this.a.p());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw new tk("Test failed for entity " + $$5);
            }
         }
      }
   }

   public <E extends bvj, T> void a(jh $$0, bvq<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jh $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new fbs($$4), bvj::bL);
      if ($$5.isEmpty()) {
         throw new tl("Expected " + $$1.j(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw new tk("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bwf> void a(jh $$0, bvq<E> $$1, cxk $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbs($$3), bvj::bL);
      if ($$4.isEmpty()) {
         throw new tl("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new tl("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bvj & cpg> void b(jh $$0, bvq<E> $$1, cxk $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbs($$3), $$0x -> ((bvj)$$0x).bL());
      if ($$4.isEmpty()) {
         throw new tl("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.t().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new tl("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(jh $$0) {
      jh $$1 = this.j($$0);
      duw $$2 = this.a().c_($$1);
      if ($$2 instanceof duq && !((duq)$$2).c()) {
         throw new tk("Container should be empty");
      }
   }

   public void a(jh $$0, cxk $$1) {
      jh $$2 = this.j($$0);
      duw $$3 = this.a().c_($$2);
      if (!($$3 instanceof duq)) {
         throw new tk("Expected a container at " + $$0 + ", found " + ma.j.b($$3.q()));
      } else if (((duq)$$3).a_($$1) != 1) {
         throw new tk("Container should contain: " + $$1);
      }
   }

   public void a(eob $$0, jh $$1) {
      jh.a($$0).forEach($$2 -> {
         jh $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jh $$0, jh $$1) {
      dxu $$2 = this.a($$0);
      dxu $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, jh $$1, cxk $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jh $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bvj, T> void b(jh $$0, bvq<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bvj $$0, fbs $$1, String $$2) {
      if (!$$1.d(this.b($$0.dt()))) {
         this.a($$2);
      }
   }

   public <E extends bvj> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new tk("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bvj, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new tk("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bwf $$0, jq<bum> $$1, int $$2) {
      buo $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new tk("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bvq<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jh($$1, $$2, $$3));
   }

   public void e(bvq<?> $$0, jh $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bvq<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jh($$1, $$2, $$3));
   }

   public void f(bvq<?> $$0, jh $$1) {
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
      ash $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void i(jh $$0) {
      jh $$1 = this.j($$0);
      ash $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      fbs $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jh($$4, $$3, $$5));
         }
      }
   }

   public int a(edp.a $$0, int $$1, int $$2) {
      jh $$3 = this.j(new jh($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, jh $$1) {
      throw new tl($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, bvj $$1) {
      throw new tl($$0, $$1.dv(), this.k($$1.dv()), this.i());
   }

   public void a(String $$0) {
      throw new tk($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new tk("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public tw g() {
      return this.a.q();
   }

   public jh j(jh $$0) {
      jh $$1 = this.a.d();
      jh $$2 = $$1.a((kl)$$0);
      return esl.a($$2, dpk.a, this.a.u(), $$1);
   }

   public jh k(jh $$0) {
      jh $$1 = this.a.d();
      drb $$2 = this.a.u().a(drb.c);
      jh $$3 = esl.a($$0, dpk.a, $$2, $$1);
      return $$3.b($$1);
   }

   public fbs a(fbs $$0) {
      fbx $$1 = this.a($$0.h());
      fbx $$2 = this.a($$0.i());
      return new fbs($$1, $$2);
   }

   public fbs b(fbs $$0) {
      fbx $$1 = this.b($$0.h());
      fbx $$2 = this.b($$0.i());
      return new fbs($$1, $$2);
   }

   public fbx a(fbx $$0) {
      fbx $$1 = fbx.a(this.a.d());
      return esl.a($$1.e($$0), dpk.a, this.a.u(), this.a.d());
   }

   public fbx b(fbx $$0) {
      fbx $$1 = fbx.a(this.a.d());
      return esl.a($$0.d($$1), dpk.a, this.a.u(), this.a.d());
   }

   public drb h() {
      return this.a.u();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new tk($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new tk("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new tk($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   public fbs j() {
      return this.a.e();
   }

   private fbs l() {
      fbs $$0 = this.a.e();
      drb $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new fbs(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new fbs(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<jh> $$0) {
      fbs $$1 = this.l().a(1.0, 1.0, 1.0);
      jh.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cpw $$0, cxo $$1, jh $$2, jm $$3) {
      jh $$4 = this.j($$2.a($$3));
      fbt $$5 = new fbt(fbx.b($$4), $$3, $$4, false);
      dbh $$6 = new dbh($$0, bth.a, $$5);
      $$1.a($$6);
   }

   public void a(aly<dij> $$0) {
      fbs $$1 = this.j();
      jh $$2 = jh.a($$1.a, $$1.b, $$1.c);
      jh $$3 = jh.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = aoe.a(this.a(), $$2, $$3, this.a().K_().e(mb.aI).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
