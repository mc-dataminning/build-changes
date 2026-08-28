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

   public dxq a(ji $$0) {
      return this.a().a_(this.k($$0));
   }

   public <T extends dus> T b(ji $$0) {
      dus $$1 = this.a().c_(this.k($$0));
      if ($$1 == null) {
         throw new se("Missing block entity", this.k($$0), $$0, this.a.p());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bva.class);
   }

   public void a(Class $$0) {
      fbs $$1 = this.j();
      List<bva> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cpr));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public clw a(cxd $$0, fbx $$1) {
      ard $$2 = this.a();
      fbx $$3 = this.a($$1);
      clw $$4 = new clw($$2, $$3.d, $$3.e, $$3.f, new cxh($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public clw a(cxd $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fbx((double)$$1, (double)$$2, (double)$$3));
   }

   public clw a(cxd $$0, ji $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bva> E a(bvi<E> $$0, ji $$1) {
      return this.a($$0, fbx.c($$1));
   }

   public <E extends bva> E a(bvi<E> $$0, fbx $$1) {
      ard $$2 = this.a();
      E $$3 = $$0.a($$2, bvh.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bwa $$4) {
            $$4.ga();
         }

         fbx $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dK(), $$3.dM());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bva $$0, btp $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bva $$0) {
      $$0.c(this.a());
   }

   public <E extends bva> E a(bvi<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bva> E a(bvi<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sd("Expected " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sd("Expected only one " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         fbx $$6 = this.a(new fbx((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.ds().f($$6);
            double $$4x = $$2x.ds().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bva> List<E> b(bvi<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, fbx.c(new ji($$1, $$2, $$3)), $$4);
   }

   public <E extends bva> List<E> a(bvi<E> $$0, fbx $$1, double $$2) {
      ard $$3 = this.a();
      fbx $$4 = this.a($$1);
      fbs $$5 = this.a.e();
      fbs $$6 = new fbs($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cQ().c($$6) && $$1x.bJ());
   }

   public <E extends bva> E a(bvi<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ji($$1, $$2, $$3));
   }

   public <E extends bva> E a(bvi<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fbx((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bwa> E b(bvi<E> $$0, ji $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gn();
      return $$2;
   }

   public <E extends bwa> E b(bvi<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ji($$1, $$2, $$3));
   }

   public <E extends bwa> E b(bvi<E> $$0, fbx $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gn();
      return $$2;
   }

   public <E extends bwa> E b(bvi<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new fbx((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bwa $$0, float $$1, float $$2, float $$3) {
      fbx $$4 = this.a(new fbx((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dK(), $$0.dM());
   }

   public sp a(bwa $$0, ji $$1, float $$2) {
      return this.g().a(2, () -> {
         euk $$3 = $$0.O().a(this.k($$1), 0);
         $$0.O().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ji($$0, $$1, $$2));
   }

   public void c(ji $$0) {
      this.b($$0, $$0x -> $$0x.a(awp.f), () -> "Expected button");
      ji $$1 = this.k($$0);
      dxq $$2 = this.a().a_($$1);
      dkp $$3 = (dkp)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(ji $$0) {
      this.a($$0, this.a(dgw.b));
   }

   public void a(ji $$0, cpr $$1) {
      ji $$2 = this.k($$0);
      this.a($$0, $$1, new fbt(fbx.b($$2), jn.c, $$2, true));
   }

   public void a(ji $$0, cpr $$1, fbt $$2) {
      ji $$3 = this.k($$0);
      dxq $$4 = this.a().a_($$3);
      bsx $$5 = bsx.a;
      bsy $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bsy.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            daz $$7 = new daz($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bvy a(bvy $$0) {
      $$0.j(0);
      $$0.d(0.25F);
      return $$0;
   }

   public bvy b(bvy $$0) {
      $$0.d(0.25F);
      return $$0;
   }

   public cpr a(final dgw $$0) {
      return new cpr(this.a(), ji.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean U_() {
            return $$0 == dgw.d;
         }

         @Override
         public boolean b() {
            return $$0.g();
         }

         @Override
         public boolean L_() {
            return false;
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
         public boolean U_() {
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
      this.a(dkg.dI, $$0);
      ji $$1 = this.k($$0);
      dxq $$2 = this.a().a_($$1);
      dov $$3 = (dov)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(ji $$0, long $$1) {
      this.a($$0, dkg.hx);
      this.b($$1, () -> this.a($$0, dkg.a));
   }

   public void f(ji $$0) {
      this.a().a(this.k($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dke $$3) {
      this.a(new ji($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dxq $$3) {
      this.a(new ji($$0, $$1, $$2), $$3);
   }

   public void a(ji $$0, dke $$1) {
      this.a($$0, $$1.m());
   }

   public void a(ji $$0, dxq $$1) {
      this.a().a(this.k($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dke $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ji($$1, $$2, $$3));
   }

   public void a(dke $$0, ji $$1) {
      dxq $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dke $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ji($$1, $$2, $$3));
   }

   public void b(dke $$0, ji $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dke $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ji($$1, $$2, $$3));
   }

   public void c(dke $$0, ji $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ji $$0, Predicate<dke> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ji $$0, Predicate<dke> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ji $$0, dyt<T> $$1, T $$2) {
      dxq $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new se($$6, this.k($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(ji $$0, dyt<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ji $$0, Predicate<dxq> $$1, Supplier<String> $$2) {
      dxq $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new se($$2.get(), this.k($$0), $$0, this.a.p());
      }
   }

   public <T extends dus> void c(ji $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new se($$2.get(), this.k($$0), $$0, this.a.p());
      }
   }

   public void a(ji $$0, jn $$1, IntPredicate $$2, Supplier<String> $$3) {
      ji $$4 = this.k($$0);
      ard $$5 = this.a();
      dxq $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new se($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void b(bvi<?> $$0) {
      List<? extends bva> $$1 = this.a().a($$0, this.j(), bva::bJ);
      if ($$1.isEmpty()) {
         throw new sd("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bvi<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ji($$1, $$2, $$3));
   }

   public void c(bvi<?> $$0, ji $$1) {
      ji $$2 = this.k($$1);
      List<? extends bva> $$3 = this.a().a($$0, new fbs($$2), bva::bJ);
      if ($$3.isEmpty()) {
         throw new se("Expected " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bvi<?> $$0, fbs $$1) {
      fbs $$2 = this.a($$1);
      List<? extends bva> $$3 = this.a().a($$0, $$2, bva::bJ);
      if ($$3.isEmpty()) {
         throw new se("Expected " + $$0.i(), ji.a((kb)$$2.f()), ji.a((kb)$$1.f()), this.a.p());
      }
   }

   public void a(bvi<?> $$0, int $$1) {
      List<? extends bva> $$2 = this.a().a($$0, this.j(), bva::bJ);
      if ($$2.size() != $$1) {
         throw new sd("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(bvi<?> $$0, ji $$1, int $$2, double $$3) {
      ji $$4 = this.k($$1);
      List<? extends bva> $$5 = this.b((bvi<? extends bva>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new se("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bvi<?> $$0, ji $$1, double $$2) {
      List<? extends bva> $$3 = this.b((bvi<? extends bva>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ji $$4 = this.k($$1);
         throw new se("Expected " + $$0.i(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bva> List<T> b(bvi<T> $$0, ji $$1, double $$2) {
      ji $$3 = this.k($$1);
      return this.a().a($$0, new fbs($$3).g($$2), bva::bJ);
   }

   public <T extends bva> List<T> c(bvi<T> $$0) {
      return this.a().a($$0, this.j(), bva::bJ);
   }

   public void a(bva $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ji($$1, $$2, $$3));
   }

   public void a(bva $$0, ji $$1) {
      ji $$2 = this.k($$1);
      List<? extends bva> $$3 = this.a().a($$0.aq(), new fbs($$2), bva::bJ);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new se("Expected " + $$0.aq().i(), $$2, $$1, this.a.p()));
   }

   public void a(cxd $$0, ji $$1, double $$2, int $$3) {
      ji $$4 = this.k($$1);
      List<clw> $$5 = this.a().a(bvi.aq, new fbs($$4).g($$2), bva::bJ);
      int $$6 = 0;

      for (clw $$7 : $$5) {
         cxh $$8 = $$7.f();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw new se("Expected " + $$3 + " " + $$0.m().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cxd $$0, ji $$1, double $$2) {
      ji $$3 = this.k($$1);

      for (bva $$5 : this.a().a(bvi.aq, new fbs($$3).g($$2), bva::bJ)) {
         clw $$6 = (clw)$$5;
         if ($$6.f().h().equals($$0)) {
            return;
         }
      }

      throw new se("Expected " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cxd $$0, ji $$1, double $$2) {
      ji $$3 = this.k($$1);

      for (bva $$5 : this.a().a(bvi.aq, new fbs($$3).g($$2), bva::bJ)) {
         clw $$6 = (clw)$$5;
         if ($$6.f().h().equals($$0)) {
            throw new se("Did not expect " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(cxd $$0) {
      for (bva $$2 : this.a().a(bvi.aq, this.j(), bva::bJ)) {
         clw $$3 = (clw)$$2;
         if ($$3.f().h().equals($$0)) {
            return;
         }
      }

      throw new sd("Expected " + $$0.m().getString() + " item");
   }

   public void b(cxd $$0) {
      for (bva $$2 : this.a().a(bvi.aq, this.j(), bva::bJ)) {
         clw $$3 = (clw)$$2;
         if ($$3.f().h().equals($$0)) {
            throw new sd("Did not expect " + $$0.m().getString() + " item");
         }
      }
   }

   public void d(bvi<?> $$0) {
      List<? extends bva> $$1 = this.a().a($$0, this.j(), bva::bJ);
      if (!$$1.isEmpty()) {
         throw new sd("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bvi<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ji($$1, $$2, $$3));
   }

   public void d(bvi<?> $$0, ji $$1) {
      ji $$2 = this.k($$1);
      List<? extends bva> $$3 = this.a().a($$0, new fbs($$2), bva::bJ);
      if (!$$3.isEmpty()) {
         throw new se("Did not expect " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void b(bvi<?> $$0, fbs $$1) {
      fbs $$2 = this.a($$1);
      List<? extends bva> $$3 = this.a().a($$0, $$2, bva::bJ);
      if (!$$3.isEmpty()) {
         throw new se("Did not expect " + $$0.i(), ji.a((kb)$$2.f()), ji.a((kb)$$1.f()), this.a.p());
      }
   }

   public void a(bvi<?> $$0, double $$1, double $$2, double $$3) {
      fbx $$4 = new fbx($$1, $$2, $$3);
      fbx $$5 = this.a($$4);
      Predicate<? super bva> $$6 = $$1x -> $$1x.cQ().a($$5, $$5);
      List<? extends bva> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sd("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bvi<?> $$0, double $$1, double $$2, double $$3) {
      fbx $$4 = new fbx($$1, $$2, $$3);
      fbx $$5 = this.a($$4);
      Predicate<? super bva> $$6 = $$1x -> !$$1x.cQ().a($$5, $$5);
      List<? extends bva> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sd("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bva, T> void a(ji $$0, bvi<E> $$1, Predicate<E> $$2) {
      ji $$3 = this.k($$0);
      List<E> $$4 = this.a().a($$1, new fbs($$3), bva::bJ);
      if ($$4.isEmpty()) {
         throw new se("Expected " + $$1.i(), $$3, $$0, this.a.p());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw new sd("Test failed for entity " + $$5);
            }
         }
      }
   }

   public <E extends bva, T> void a(ji $$0, bvi<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ji $$4 = this.k($$0);
      List<E> $$5 = this.a().a($$1, new fbs($$4), bva::bJ);
      if ($$5.isEmpty()) {
         throw new se("Expected " + $$1.i(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw new sd("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bvy> void a(ji $$0, bvi<E> $$1, cxd $$2) {
      ji $$3 = this.k($$0);
      List<E> $$4 = this.a().a($$1, new fbs($$3), bva::bJ);
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

   public <E extends bva & cpb> void b(ji $$0, bvi<E> $$1, cxd $$2) {
      ji $$3 = this.k($$0);
      List<E> $$4 = this.a().a($$1, new fbs($$3), $$0x -> ((bva)$$0x).bJ());
      if ($$4.isEmpty()) {
         throw new se("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.n().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new se("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(ji $$0) {
      ji $$1 = this.k($$0);
      dus $$2 = this.a().c_($$1);
      if ($$2 instanceof dum && !((dum)$$2).c()) {
         throw new sd("Container should be empty");
      }
   }

   public void a(ji $$0, cxd $$1) {
      ji $$2 = this.k($$0);
      dus $$3 = this.a().c_($$2);
      if (!($$3 instanceof dum)) {
         aku $$4 = $$3 != null ? mb.j.b($$3.p()) : null;
         throw new sd("Expected a container at " + $$0 + ", found " + $$4);
      } else if (((dum)$$3).a_($$1) != 1) {
         throw new sd("Container should contain: " + $$1);
      }
   }

   public void a(eob $$0, ji $$1) {
      ji.a($$0).forEach($$2 -> {
         ji $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(ji $$0, ji $$1) {
      dxq $$2 = this.a($$0);
      dxq $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ji $$1, cxd $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ji $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bva, T> void b(ji $$0, bvi<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bva $$0, fbs $$1, String $$2) {
      if (!$$1.d(this.b($$0.ds()))) {
         this.a($$2);
      }
   }

   public <E extends bva> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sd("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bva, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sd("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bvy $$0, jr<buc> $$1, int $$2) {
      bue $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sd("Entity " + $$0 + " failed has " + $$1.a().f() + " x " + $$4 + " test");
      }
   }

   public void e(bvi<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ji($$1, $$2, $$3));
   }

   public void e(bvi<?> $$0, ji $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bvi<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ji($$1, $$2, $$3));
   }

   public void f(bvi<?> $$0, ji $$1) {
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
      ji $$1 = this.k($$0);
      ard $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void i(ji $$0) {
      ji $$1 = this.k($$0);
      ard $$2 = this.a();
      $$2.a_($$1).a($$2, $$1, $$2.A);
   }

   public void j(ji $$0) {
      ji $$1 = this.k($$0);
      ard $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      fbs $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.j(new ji($$4, $$3, $$5));
         }
      }
   }

   public int a(edo.a $$0, int $$1, int $$2) {
      ji $$3 = this.k(new ji($$1, 0, $$2));
      return this.l(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ji $$1) {
      throw new se($$0, this.k($$1), $$1, this.i());
   }

   public void a(String $$0, bva $$1) {
      throw new se($$0, $$1.du(), this.l($$1.du()), this.i());
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

   public ji k(ji $$0) {
      ji $$1 = this.a.d();
      ji $$2 = $$1.a((km)$$0);
      return esl.a($$2, dpf.a, this.a.u(), $$1);
   }

   public ji l(ji $$0) {
      ji $$1 = this.a.d();
      dqw $$2 = this.a.u().a(dqw.c);
      ji $$3 = esl.a($$0, dpf.a, $$2, $$1);
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
      return esl.a($$1.e($$0), dpf.a, this.a.u(), this.a.d());
   }

   public fbx b(fbx $$0) {
      fbx $$1 = fbx.a(this.a.d());
      return esl.a($$0.d($$1), dpf.a, this.a.u(), this.a.d());
   }

   public dqw h() {
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

   public fbs j() {
      return this.a.e();
   }

   private fbs l() {
      fbs $$0 = this.a.e();
      dqw $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new fbs(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new fbs(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<ji> $$0) {
      fbs $$1 = this.l().a(1.0, 1.0, 1.0);
      ji.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cpr $$0, cxh $$1, ji $$2, jn $$3) {
      ji $$4 = this.k($$2.a($$3));
      fbt $$5 = new fbt(fbx.b($$4), $$3, $$4, false);
      daz $$6 = new daz($$0, bsx.a, $$5);
      $$1.a($$6);
   }

   public void a(akt<dic> $$0) {
      fbs $$1 = this.j();
      ji $$2 = ji.a($$1.a, $$1.b, $$1.c);
      ji $$3 = ji.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = amz.a(this.a(), $$2, $$3, this.a().F_().e(mc.aJ).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
