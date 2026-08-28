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

public class tg {
   private final th a;
   private boolean b;

   public tg(th $$0) {
      this.a = $$0;
   }

   public arx a() {
      return this.a.g();
   }

   public dxo a(jh $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends duq> T b(jh $$0) {
      duq $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new ta("Missing block entity", this.j($$0), $$0, this.a.p());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bvb.class);
   }

   public void a(Class $$0) {
      fbm $$1 = this.j();
      List<bvb> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cpo));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public cls a(cxc $$0, fbr $$1) {
      arx $$2 = this.a();
      fbr $$3 = this.a($$1);
      cls $$4 = new cls($$2, $$3.d, $$3.e, $$3.f, new cxg($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cls a(cxc $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fbr((double)$$1, (double)$$2, (double)$$3));
   }

   public cls a(cxc $$0, jh $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bvb> E a(bvi<E> $$0, jh $$1) {
      return this.a($$0, fbr.c($$1));
   }

   public <E extends bvb> E a(bvi<E> $$0, fbr $$1) {
      arx $$2 = this.a();
      E $$3 = $$0.a($$2, bvh.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bvz $$4) {
            $$4.ai();
         }

         fbr $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dM(), $$3.dO());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bvb $$0, btr $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bvb $$0) {
      $$0.c(this.a());
   }

   public <E extends bvb> E a(bvi<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bvb> E a(bvi<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sz("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sz("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         fbr $$6 = this.a(new fbr((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.du().f($$6);
            double $$4x = $$2x.du().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bvb> List<E> b(bvi<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, fbr.c(new jh($$1, $$2, $$3)), $$4);
   }

   public <E extends bvb> List<E> a(bvi<E> $$0, fbr $$1, double $$2) {
      arx $$3 = this.a();
      fbr $$4 = this.a($$1);
      fbm $$5 = this.a.e();
      fbm $$6 = new fbm($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bL());
   }

   public <E extends bvb> E a(bvi<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bvb> E a(bvi<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fbr((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bvz> E b(bvi<E> $$0, jh $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gh();
      return $$2;
   }

   public <E extends bvz> E b(bvi<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bvz> E b(bvi<E> $$0, fbr $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gh();
      return $$2;
   }

   public <E extends bvz> E b(bvi<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new fbr((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bvz $$0, float $$1, float $$2, float $$3) {
      fbr $$4 = this.a(new fbr((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dM(), $$0.dO());
   }

   public tl a(bvz $$0, jh $$1, float $$2) {
      return this.g().a(2, () -> {
         eue $$3 = $$0.L().a(this.j($$1), 0);
         $$0.L().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new jh($$0, $$1, $$2));
   }

   public void c(jh $$0) {
      this.b($$0, $$0x -> $$0x.a(axk.f), () -> "Expected button");
      jh $$1 = this.j($$0);
      dxo $$2 = this.a().a_($$1);
      dko $$3 = (dko)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(jh $$0) {
      this.a($$0, this.a(dgw.b));
   }

   public void a(jh $$0, cpo $$1) {
      jh $$2 = this.j($$0);
      this.a($$0, $$1, new fbn(fbr.b($$2), jm.c, $$2, true));
   }

   public void a(jh $$0, cpo $$1, fbn $$2) {
      jh $$3 = this.j($$0);
      dxo $$4 = this.a().a_($$3);
      bsz $$5 = bsz.a;
      bta $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bta.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            daz $$7 = new daz($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bvx a(bvx $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public bvx b(bvx $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public cpo a(final dgw $$0) {
      return new cpo(this.a(), jh.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean aa_() {
            return $$0 == dgw.d;
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
   public ary c() {
      asn $$0 = asn.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      ary $$1 = new ary(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean aa_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      we $$2 = new we(zs.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new jh($$0, $$1, $$2));
   }

   public void e(jh $$0) {
      this.a(dkf.dI, $$0);
      jh $$1 = this.j($$0);
      dxo $$2 = this.a().a_($$1);
      dos $$3 = (dos)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jh $$0, long $$1) {
      this.a($$0, dkf.hx);
      this.b($$1, () -> this.a($$0, dkf.a));
   }

   public void f(jh $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dkd $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dxo $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(jh $$0, dkd $$1) {
      this.a($$0, $$1.m());
   }

   public void a(jh $$0, dxo $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dkd $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(dkd $$0, jh $$1) {
      dxo $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dkd $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jh($$1, $$2, $$3));
   }

   public void b(dkd $$0, jh $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dkd $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(dkd $$0, jh $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jh $$0, Predicate<dkd> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(jh $$0, Predicate<dkd> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(jh $$0, dyq<T> $$1, T $$2) {
      dxo $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new ta($$6, this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(jh $$0, dyq<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(jh $$0, Predicate<dxo> $$1, Supplier<String> $$2) {
      dxo $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new ta($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends duq> void c(jh $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new ta($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public void a(jh $$0, jm $$1, IntPredicate $$2, Supplier<String> $$3) {
      jh $$4 = this.j($$0);
      arx $$5 = this.a();
      dxo $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new ta($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void b(bvi<?> $$0) {
      List<? extends bvb> $$1 = this.a().a($$0, this.j(), bvb::bL);
      if ($$1.isEmpty()) {
         throw new sz("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bvi<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(bvi<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvb> $$3 = this.a().a($$0, new fbm($$2), bvb::bL);
      if ($$3.isEmpty()) {
         throw new ta("Expected " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void a(bvi<?> $$0, fbm $$1) {
      fbm $$2 = this.a($$1);
      List<? extends bvb> $$3 = this.a().a($$0, $$2, bvb::bL);
      if ($$3.isEmpty()) {
         throw new ta("Expected " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.p());
      }
   }

   public void a(bvi<?> $$0, int $$1) {
      List<? extends bvb> $$2 = this.a().a($$0, this.j(), bvb::bL);
      if ($$2.size() != $$1) {
         throw new sz("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bvi<?> $$0, jh $$1, int $$2, double $$3) {
      jh $$4 = this.j($$1);
      List<? extends bvb> $$5 = this.b((bvi<? extends bvb>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new ta("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bvi<?> $$0, jh $$1, double $$2) {
      List<? extends bvb> $$3 = this.b((bvi<? extends bvb>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jh $$4 = this.j($$1);
         throw new ta("Expected " + $$0.j(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bvb> List<T> b(bvi<T> $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);
      return this.a().a($$0, new fbm($$3).g($$2), bvb::bL);
   }

   public <T extends bvb> List<T> c(bvi<T> $$0) {
      return this.a().a($$0, this.j(), bvb::bL);
   }

   public void a(bvb $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(bvb $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvb> $$3 = this.a().a($$0.aq(), new fbm($$2), bvb::bL);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new ta("Expected " + $$0.aq().j(), $$2, $$1, this.a.p()));
   }

   public void a(cxc $$0, jh $$1, double $$2, int $$3) {
      jh $$4 = this.j($$1);
      List<cls> $$5 = this.a().a(bvi.ar, new fbm($$4).g($$2), bvb::bL);
      int $$6 = 0;

      for (cls $$7 : $$5) {
         cxg $$8 = $$7.l();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw new ta("Expected " + $$3 + " " + $$0.m().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cxc $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bvb $$5 : this.a().a(bvi.ar, new fbm($$3).g($$2), bvb::bL)) {
         cls $$6 = (cls)$$5;
         if ($$6.l().h().equals($$0)) {
            return;
         }
      }

      throw new ta("Expected " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cxc $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bvb $$5 : this.a().a(bvi.ar, new fbm($$3).g($$2), bvb::bL)) {
         cls $$6 = (cls)$$5;
         if ($$6.l().h().equals($$0)) {
            throw new ta("Did not expect " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(cxc $$0) {
      for (bvb $$2 : this.a().a(bvi.ar, this.j(), bvb::bL)) {
         cls $$3 = (cls)$$2;
         if ($$3.l().h().equals($$0)) {
            return;
         }
      }

      throw new sz("Expected " + $$0.m().getString() + " item");
   }

   public void b(cxc $$0) {
      for (bvb $$2 : this.a().a(bvi.ar, this.j(), bvb::bL)) {
         cls $$3 = (cls)$$2;
         if ($$3.l().h().equals($$0)) {
            throw new sz("Did not expect " + $$0.m().getString() + " item");
         }
      }
   }

   public void d(bvi<?> $$0) {
      List<? extends bvb> $$1 = this.a().a($$0, this.j(), bvb::bL);
      if (!$$1.isEmpty()) {
         throw new sz("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bvi<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jh($$1, $$2, $$3));
   }

   public void d(bvi<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvb> $$3 = this.a().a($$0, new fbm($$2), bvb::bL);
      if (!$$3.isEmpty()) {
         throw new ta("Did not expect " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void b(bvi<?> $$0, fbm $$1) {
      fbm $$2 = this.a($$1);
      List<? extends bvb> $$3 = this.a().a($$0, $$2, bvb::bL);
      if (!$$3.isEmpty()) {
         throw new ta("Did not expect " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.p());
      }
   }

   public void a(bvi<?> $$0, double $$1, double $$2, double $$3) {
      fbr $$4 = new fbr($$1, $$2, $$3);
      fbr $$5 = this.a($$4);
      Predicate<? super bvb> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bvb> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sz("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bvi<?> $$0, double $$1, double $$2, double $$3) {
      fbr $$4 = new fbr($$1, $$2, $$3);
      fbr $$5 = this.a($$4);
      Predicate<? super bvb> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bvb> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sz("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bvb, T> void a(jh $$0, bvi<E> $$1, Predicate<E> $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbm($$3), bvb::bL);
      if ($$4.isEmpty()) {
         throw new ta("Expected " + $$1.j(), $$3, $$0, this.a.p());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw new sz("Test failed for entity " + $$5);
            }
         }
      }
   }

   public <E extends bvb, T> void a(jh $$0, bvi<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jh $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new fbm($$4), bvb::bL);
      if ($$5.isEmpty()) {
         throw new ta("Expected " + $$1.j(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw new sz("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bvx> void a(jh $$0, bvi<E> $$1, cxc $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbm($$3), bvb::bL);
      if ($$4.isEmpty()) {
         throw new ta("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new ta("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bvb & coy> void b(jh $$0, bvi<E> $$1, cxc $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbm($$3), $$0x -> ((bvb)$$0x).bL());
      if ($$4.isEmpty()) {
         throw new ta("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.t().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new ta("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(jh $$0) {
      jh $$1 = this.j($$0);
      duq $$2 = this.a().c_($$1);
      if ($$2 instanceof duk && !((duk)$$2).c()) {
         throw new sz("Container should be empty");
      }
   }

   public void a(jh $$0, cxc $$1) {
      jh $$2 = this.j($$0);
      duq $$3 = this.a().c_($$2);
      if (!($$3 instanceof duk)) {
         alp $$4 = $$3 != null ? ma.j.b($$3.p()) : null;
         throw new sz("Expected a container at " + $$0 + ", found " + $$4);
      } else if (((duk)$$3).a_($$1) != 1) {
         throw new sz("Container should contain: " + $$1);
      }
   }

   public void a(env $$0, jh $$1) {
      jh.a($$0).forEach($$2 -> {
         jh $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jh $$0, jh $$1) {
      dxo $$2 = this.a($$0);
      dxo $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, jh $$1, cxc $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jh $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bvb, T> void b(jh $$0, bvi<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bvb $$0, fbm $$1, String $$2) {
      if (!$$1.d(this.b($$0.du()))) {
         this.a($$2);
      }
   }

   public <E extends bvb> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sz("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bvb, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sz("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bvx $$0, jq<bue> $$1, int $$2) {
      bug $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sz("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bvi<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jh($$1, $$2, $$3));
   }

   public void e(bvi<?> $$0, jh $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bvi<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jh($$1, $$2, $$3));
   }

   public void f(bvi<?> $$0, jh $$1) {
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
      arx $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void i(jh $$0) {
      jh $$1 = this.j($$0);
      arx $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      fbm $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jh($$4, $$3, $$5));
         }
      }
   }

   public int a(edj.a $$0, int $$1, int $$2) {
      jh $$3 = this.j(new jh($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, jh $$1) {
      throw new ta($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, bvb $$1) {
      throw new ta($$0, $$1.dw(), this.k($$1.dw()), this.i());
   }

   public void a(String $$0) {
      throw new sz($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new sz("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public tl g() {
      return this.a.q();
   }

   public jh j(jh $$0) {
      jh $$1 = this.a.d();
      jh $$2 = $$1.a((kl)$$0);
      return esf.a($$2, dpc.a, this.a.u(), $$1);
   }

   public jh k(jh $$0) {
      jh $$1 = this.a.d();
      dqv $$2 = this.a.u().a(dqv.c);
      jh $$3 = esf.a($$0, dpc.a, $$2, $$1);
      return $$3.b($$1);
   }

   public fbm a(fbm $$0) {
      fbr $$1 = this.a($$0.h());
      fbr $$2 = this.a($$0.i());
      return new fbm($$1, $$2);
   }

   public fbm b(fbm $$0) {
      fbr $$1 = this.b($$0.h());
      fbr $$2 = this.b($$0.i());
      return new fbm($$1, $$2);
   }

   public fbr a(fbr $$0) {
      fbr $$1 = fbr.a(this.a.d());
      return esf.a($$1.e($$0), dpc.a, this.a.u(), this.a.d());
   }

   public fbr b(fbr $$0) {
      fbr $$1 = fbr.a(this.a.d());
      return esf.a($$0.d($$1), dpc.a, this.a.u(), this.a.d());
   }

   public dqv h() {
      return this.a.u();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sz($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sz("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sz($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   public fbm j() {
      return this.a.e();
   }

   private fbm l() {
      fbm $$0 = this.a.e();
      dqv $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new fbm(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new fbm(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<jh> $$0) {
      fbm $$1 = this.l().a(1.0, 1.0, 1.0);
      jh.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cpo $$0, cxg $$1, jh $$2, jm $$3) {
      jh $$4 = this.j($$2.a($$3));
      fbn $$5 = new fbn(fbr.b($$4), $$3, $$4, false);
      daz $$6 = new daz($$0, bsz.a, $$5);
      $$1.a($$6);
   }

   public void a(alo<dib> $$0) {
      fbm $$1 = this.j();
      jh $$2 = jh.a($$1.a, $$1.b, $$1.c);
      jh $$3 = jh.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = anu.a(this.a(), $$2, $$3, this.a().K_().e(mb.aI).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
