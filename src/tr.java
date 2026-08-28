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

   public dxv a(jh $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dux> T b(jh $$0) {
      dux $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new tl("Missing block entity", this.j($$0), $$0, this.a.p());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bvk.class);
   }

   public void a(Class $$0) {
      fbt $$1 = this.j();
      List<bvk> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cpx));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public cmb a(cxl $$0, fby $$1) {
      ash $$2 = this.a();
      fby $$3 = this.a($$1);
      cmb $$4 = new cmb($$2, $$3.d, $$3.e, $$3.f, new cxp($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cmb a(cxl $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fby((double)$$1, (double)$$2, (double)$$3));
   }

   public cmb a(cxl $$0, jh $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bvk> E a(bvr<E> $$0, jh $$1) {
      return this.a($$0, fby.c($$1));
   }

   public <E extends bvk> E a(bvr<E> $$0, fby $$1) {
      ash $$2 = this.a();
      E $$3 = $$0.a($$2, bvq.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bwi $$4) {
            $$4.ai();
         }

         fby $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dM(), $$3.dO());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bvk $$0, bua $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bvk $$0) {
      $$0.c(this.a());
   }

   public <E extends bvk> E a(bvr<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bvk> E a(bvr<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new tk("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new tk("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         fby $$6 = this.a(new fby((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.du().f($$6);
            double $$4x = $$2x.du().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bvk> List<E> b(bvr<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, fby.c(new jh($$1, $$2, $$3)), $$4);
   }

   public <E extends bvk> List<E> a(bvr<E> $$0, fby $$1, double $$2) {
      ash $$3 = this.a();
      fby $$4 = this.a($$1);
      fbt $$5 = this.a.e();
      fbt $$6 = new fbt($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bL());
   }

   public <E extends bvk> E a(bvr<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bvk> E a(bvr<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fby((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bwi> E b(bvr<E> $$0, jh $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gh();
      return $$2;
   }

   public <E extends bwi> E b(bvr<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bwi> E b(bvr<E> $$0, fby $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gh();
      return $$2;
   }

   public <E extends bwi> E b(bvr<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new fby((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bwi $$0, float $$1, float $$2, float $$3) {
      fby $$4 = this.a(new fby((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dM(), $$0.dO());
   }

   public tw a(bwi $$0, jh $$1, float $$2) {
      return this.g().a(2, () -> {
         eul $$3 = $$0.L().a(this.j($$1), 0);
         $$0.L().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new jh($$0, $$1, $$2));
   }

   public void c(jh $$0) {
      this.b($$0, $$0x -> $$0x.a(axu.f), () -> "Expected button");
      jh $$1 = this.j($$0);
      dxv $$2 = this.a().a_($$1);
      dkx $$3 = (dkx)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(jh $$0) {
      this.a($$0, this.a(dhf.b));
   }

   public void a(jh $$0, cpx $$1) {
      jh $$2 = this.j($$0);
      this.a($$0, $$1, new fbu(fby.b($$2), jm.c, $$2, true));
   }

   public void a(jh $$0, cpx $$1, fbu $$2) {
      jh $$3 = this.j($$0);
      dxv $$4 = this.a().a_($$3);
      bti $$5 = bti.a;
      btj $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof btj.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            dbi $$7 = new dbi($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bwg a(bwg $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public bwg b(bwg $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public cpx a(final dhf $$0) {
      return new cpx(this.a(), jh.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean aa_() {
            return $$0 == dhf.d;
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
      this.a(dko.dI, $$0);
      jh $$1 = this.j($$0);
      dxv $$2 = this.a().a_($$1);
      dpb $$3 = (dpb)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jh $$0, long $$1) {
      this.a($$0, dko.hq);
      this.b($$1, () -> this.a($$0, dko.a));
   }

   public void f(jh $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dkm $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dxv $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(jh $$0, dkm $$1) {
      this.a($$0, $$1.m());
   }

   public void a(jh $$0, dxv $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dkm $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(dkm $$0, jh $$1) {
      dxv $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dkm $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jh($$1, $$2, $$3));
   }

   public void b(dkm $$0, jh $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dkm $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(dkm $$0, jh $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jh $$0, Predicate<dkm> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(jh $$0, Predicate<dkm> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(jh $$0, dyx<T> $$1, T $$2) {
      dxv $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new tl($$6, this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(jh $$0, dyx<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(jh $$0, Predicate<dxv> $$1, Supplier<String> $$2) {
      dxv $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new tl($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends dux> void c(jh $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new tl($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public void a(jh $$0, jm $$1, IntPredicate $$2, Supplier<String> $$3) {
      jh $$4 = this.j($$0);
      ash $$5 = this.a();
      dxv $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new tl($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void b(bvr<?> $$0) {
      List<? extends bvk> $$1 = this.a().a($$0, this.j(), bvk::bL);
      if ($$1.isEmpty()) {
         throw new tk("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bvr<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(bvr<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvk> $$3 = this.a().a($$0, new fbt($$2), bvk::bL);
      if ($$3.isEmpty()) {
         throw new tl("Expected " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void a(bvr<?> $$0, fbt $$1) {
      fbt $$2 = this.a($$1);
      List<? extends bvk> $$3 = this.a().a($$0, $$2, bvk::bL);
      if ($$3.isEmpty()) {
         throw new tl("Expected " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.p());
      }
   }

   public void a(bvr<?> $$0, int $$1) {
      List<? extends bvk> $$2 = this.a().a($$0, this.j(), bvk::bL);
      if ($$2.size() != $$1) {
         throw new tk("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bvr<?> $$0, jh $$1, int $$2, double $$3) {
      jh $$4 = this.j($$1);
      List<? extends bvk> $$5 = this.b((bvr<? extends bvk>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new tl("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bvr<?> $$0, jh $$1, double $$2) {
      List<? extends bvk> $$3 = this.b((bvr<? extends bvk>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jh $$4 = this.j($$1);
         throw new tl("Expected " + $$0.j(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bvk> List<T> b(bvr<T> $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);
      return this.a().a($$0, new fbt($$3).g($$2), bvk::bL);
   }

   public <T extends bvk> List<T> c(bvr<T> $$0) {
      return this.a().a($$0, this.j(), bvk::bL);
   }

   public void a(bvk $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(bvk $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvk> $$3 = this.a().a($$0.aq(), new fbt($$2), bvk::bL);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new tl("Expected " + $$0.aq().j(), $$2, $$1, this.a.p()));
   }

   public void a(cxl $$0, jh $$1, double $$2, int $$3) {
      jh $$4 = this.j($$1);
      List<cmb> $$5 = this.a().a(bvr.ar, new fbt($$4).g($$2), bvk::bL);
      int $$6 = 0;

      for (cmb $$7 : $$5) {
         cxp $$8 = $$7.l();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new tl("Expected " + $$3 + " " + $$0.m().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cxl $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bvk $$5 : this.a().a(bvr.ar, new fbt($$3).g($$2), bvk::bL)) {
         cmb $$6 = (cmb)$$5;
         if ($$6.l().h().equals($$0)) {
            return;
         }
      }

      throw new tl("Expected " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cxl $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bvk $$5 : this.a().a(bvr.ar, new fbt($$3).g($$2), bvk::bL)) {
         cmb $$6 = (cmb)$$5;
         if ($$6.l().h().equals($$0)) {
            throw new tl("Did not expect " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(cxl $$0) {
      for (bvk $$2 : this.a().a(bvr.ar, this.j(), bvk::bL)) {
         cmb $$3 = (cmb)$$2;
         if ($$3.l().h().equals($$0)) {
            return;
         }
      }

      throw new tk("Expected " + $$0.m().getString() + " item");
   }

   public void b(cxl $$0) {
      for (bvk $$2 : this.a().a(bvr.ar, this.j(), bvk::bL)) {
         cmb $$3 = (cmb)$$2;
         if ($$3.l().h().equals($$0)) {
            throw new tk("Did not expect " + $$0.m().getString() + " item");
         }
      }
   }

   public void d(bvr<?> $$0) {
      List<? extends bvk> $$1 = this.a().a($$0, this.j(), bvk::bL);
      if (!$$1.isEmpty()) {
         throw new tk("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bvr<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jh($$1, $$2, $$3));
   }

   public void d(bvr<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvk> $$3 = this.a().a($$0, new fbt($$2), bvk::bL);
      if (!$$3.isEmpty()) {
         throw new tl("Did not expect " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void b(bvr<?> $$0, fbt $$1) {
      fbt $$2 = this.a($$1);
      List<? extends bvk> $$3 = this.a().a($$0, $$2, bvk::bL);
      if (!$$3.isEmpty()) {
         throw new tl("Did not expect " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.p());
      }
   }

   public void a(bvr<?> $$0, double $$1, double $$2, double $$3) {
      fby $$4 = new fby($$1, $$2, $$3);
      fby $$5 = this.a($$4);
      Predicate<? super bvk> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bvk> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new tk("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bvr<?> $$0, double $$1, double $$2, double $$3) {
      fby $$4 = new fby($$1, $$2, $$3);
      fby $$5 = this.a($$4);
      Predicate<? super bvk> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bvk> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new tk("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bvk, T> void a(jh $$0, bvr<E> $$1, Predicate<E> $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbt($$3), bvk::bL);
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

   public <E extends bvk, T> void a(jh $$0, bvr<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jh $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new fbt($$4), bvk::bL);
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

   public <E extends bwg> void a(jh $$0, bvr<E> $$1, cxl $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbt($$3), bvk::bL);
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

   public <E extends bvk & cph> void b(jh $$0, bvr<E> $$1, cxl $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbt($$3), $$0x -> ((bvk)$$0x).bL());
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
      dux $$2 = this.a().c_($$1);
      if ($$2 instanceof dur && !((dur)$$2).c()) {
         throw new tk("Container should be empty");
      }
   }

   public void a(jh $$0, cxl $$1) {
      jh $$2 = this.j($$0);
      dux $$3 = this.a().c_($$2);
      if (!($$3 instanceof dur)) {
         alz $$4 = $$3 != null ? ma.j.b($$3.q()) : null;
         throw new tk("Expected a container at " + $$0 + ", found " + $$4);
      } else if (((dur)$$3).a_($$1) != 1) {
         throw new tk("Container should contain: " + $$1);
      }
   }

   public void a(eoc $$0, jh $$1) {
      jh.a($$0).forEach($$2 -> {
         jh $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jh $$0, jh $$1) {
      dxv $$2 = this.a($$0);
      dxv $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, jh $$1, cxl $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jh $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bvk, T> void b(jh $$0, bvr<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bvk $$0, fbt $$1, String $$2) {
      if (!$$1.d(this.b($$0.du()))) {
         this.a($$2);
      }
   }

   public <E extends bvk> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new tk("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bvk, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new tk("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bwg $$0, jq<bun> $$1, int $$2) {
      bup $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new tk("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bvr<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jh($$1, $$2, $$3));
   }

   public void e(bvr<?> $$0, jh $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bvr<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jh($$1, $$2, $$3));
   }

   public void f(bvr<?> $$0, jh $$1) {
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
      fbt $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jh($$4, $$3, $$5));
         }
      }
   }

   public int a(edq.a $$0, int $$1, int $$2) {
      jh $$3 = this.j(new jh($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, jh $$1) {
      throw new tl($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, bvk $$1) {
      throw new tl($$0, $$1.dw(), this.k($$1.dw()), this.i());
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
      return esm.a($$2, dpl.a, this.a.u(), $$1);
   }

   public jh k(jh $$0) {
      jh $$1 = this.a.d();
      drc $$2 = this.a.u().a(drc.c);
      jh $$3 = esm.a($$0, dpl.a, $$2, $$1);
      return $$3.b($$1);
   }

   public fbt a(fbt $$0) {
      fby $$1 = this.a($$0.h());
      fby $$2 = this.a($$0.i());
      return new fbt($$1, $$2);
   }

   public fbt b(fbt $$0) {
      fby $$1 = this.b($$0.h());
      fby $$2 = this.b($$0.i());
      return new fbt($$1, $$2);
   }

   public fby a(fby $$0) {
      fby $$1 = fby.a(this.a.d());
      return esm.a($$1.e($$0), dpl.a, this.a.u(), this.a.d());
   }

   public fby b(fby $$0) {
      fby $$1 = fby.a(this.a.d());
      return esm.a($$0.d($$1), dpl.a, this.a.u(), this.a.d());
   }

   public drc h() {
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

   public fbt j() {
      return this.a.e();
   }

   private fbt l() {
      fbt $$0 = this.a.e();
      drc $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new fbt(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new fbt(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<jh> $$0) {
      fbt $$1 = this.l().a(1.0, 1.0, 1.0);
      jh.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cpx $$0, cxp $$1, jh $$2, jm $$3) {
      jh $$4 = this.j($$2.a($$3));
      fbu $$5 = new fbu(fby.b($$4), $$3, $$4, false);
      dbi $$6 = new dbi($$0, bti.a, $$5);
      $$1.a($$6);
   }

   public void a(aly<dik> $$0) {
      fbt $$1 = this.j();
      jh $$2 = jh.a($$1.a, $$1.b, $$1.c);
      jh $$3 = jh.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = aoe.a(this.a(), $$2, $$3, this.a().K_().e(mb.aI).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
