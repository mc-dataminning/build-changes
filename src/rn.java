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

public class rn {
   private final ro a;
   private boolean b;

   public rn(ro $$0) {
      this.a = $$0;
   }

   public and a() {
      return this.a.h();
   }

   public djg a(hx $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dgu b(hx $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(blu.class);
   }

   public void a(Class $$0) {
      eln $$1 = this.k();
      List<blu> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cfh));
      $$2.forEach(blu::al);
   }

   public cbt a(cms $$0, float $$1, float $$2, float $$3) {
      and $$4 = this.a();
      els $$5 = this.a(new els((double)$$1, (double)$$2, (double)$$3));
      cbt $$6 = new cbt($$4, $$5.c, $$5.d, $$5.e, new cmx($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public cbt a(cms $$0, hx $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends blu> E a(bly<E> $$0, hx $$1) {
      return this.a($$0, els.c($$1));
   }

   public <E extends blu> E a(bly<E> $$0, els $$1) {
      and $$2 = this.a();
      E $$3 = $$0.a((cto)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bmm $$4) {
            $$4.fJ();
         }

         els $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dC(), $$3.dE());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends blu> E a(bly<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new hx($$1, $$2, $$3));
   }

   public <E extends blu> E a(bly<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new els((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bmm> E b(bly<E> $$0, hx $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bmm> E b(bly<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new hx($$1, $$2, $$3));
   }

   public <E extends bmm> E b(bly<E> $$0, els $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bmm> E b(bly<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new els((double)$$1, (double)$$2, (double)$$3));
   }

   public rs a(bmm $$0, hx $$1, float $$2) {
      return this.i().a(2, () -> {
         eff $$3 = $$0.N().a(this.j($$1), 0);
         $$0.N().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new hx($$0, $$1, $$2));
   }

   public void c(hx $$0) {
      this.b($$0, $$0x -> $$0x.a(asg.f), () -> "Expected button");
      hx $$1 = this.j($$0);
      djg $$2 = this.a().a_($$1);
      cwz $$3 = (cwz)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(hx $$0) {
      this.a($$0, this.d());
   }

   public void a(hx $$0, cfh $$1) {
      hx $$2 = this.j($$0);
      this.a($$0, $$1, new elo(els.b($$2), ic.c, $$2, true));
   }

   public void a(hx $$0, cfh $$1, elo $$2) {
      hx $$3 = this.j($$0);
      djg $$4 = this.a().a_($$3);
      bka $$5 = $$4.a(this.a(), $$1, bjz.a, $$2);
      if (!$$5.a()) {
         cpi $$6 = new cpi($$1, bjz.a, $$2);
         $$1.b(bjz.a).a($$6);
      }
   }

   public bmk a(bmk $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cfh c() {
      return new cfh(this.a(), hx.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return false;
         }
      };
   }

   public bmk b(bmk $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cfh d() {
      return new cfh(this.a(), hx.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
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
   public ane e() {
      ans $$0 = ans.a(new GameProfile(UUID.randomUUID(), "test-mock-player"));
      ane $$1 = new ane(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      ug $$2 = new ug(xg.a);
      EmbeddedChannel $$3 = new EmbeddedChannel(new ChannelHandler[]{$$2});
      $$3.attr(ug.e).set(uh.b.b(xg.a));
      this.a().o().ae().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new hx($$0, $$1, $$2));
   }

   public void e(hx $$0) {
      this.a(cwr.dw, $$0);
      hx $$1 = this.j($$0);
      djg $$2 = this.a().a_($$1);
      dbb $$3 = (dbb)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(hx $$0, long $$1) {
      this.a($$0, cwr.ha);
      this.b($$1, () -> this.a($$0, cwr.a));
   }

   public void f(hx $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cwp $$3) {
      this.a(new hx($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, djg $$3) {
      this.a(new hx($$0, $$1, $$2), $$3);
   }

   public void a(hx $$0, cwp $$1) {
      this.a($$0, $$1.o());
   }

   public void a(hx $$0, djg $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cwp $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hx($$1, $$2, $$3));
   }

   public void a(cwp $$0, hx $$1) {
      djg $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cwp $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new hx($$1, $$2, $$3));
   }

   public void b(cwp $$0, hx $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cwp $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hx($$1, $$2, $$3));
   }

   public void c(cwp $$0, hx $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(hx $$0, Predicate<cwp> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(hx $$0, Predicate<cwp> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(hx $$0, dkj<T> $$1, T $$2) {
      djg $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new ri($$6, this.j($$0), $$0, this.a.q());
      }
   }

   public <T extends Comparable<T>> void a(hx $$0, dkj<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(hx $$0, Predicate<djg> $$1, Supplier<String> $$2) {
      djg $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new ri($$2.get(), this.j($$0), $$0, this.a.q());
      }
   }

   public void a(hx $$0, ic $$1, IntPredicate $$2, Supplier<String> $$3) {
      hx $$4 = this.j($$0);
      and $$5 = this.a();
      djg $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new ri($$3.get(), $$4, $$0, this.a.q());
      }
   }

   public void a(bly<?> $$0) {
      List<? extends blu> $$1 = this.a().a($$0, this.k(), blu::bx);
      if ($$1.isEmpty()) {
         throw new rh("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bly<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hx($$1, $$2, $$3));
   }

   public void c(bly<?> $$0, hx $$1) {
      hx $$2 = this.j($$1);
      List<? extends blu> $$3 = this.a().a($$0, new eln($$2), blu::bx);
      if ($$3.isEmpty()) {
         throw new ri("Expected " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(bly<?> $$0, els $$1, els $$2) {
      List<? extends blu> $$3 = this.a().a($$0, new eln($$1, $$2), blu::bx);
      if ($$3.isEmpty()) {
         throw new ri("Expected " + $$0.i() + " between ", hx.a($$1), hx.a($$2), this.a.q());
      }
   }

   public void a(bly<?> $$0, int $$1) {
      List<? extends blu> $$2 = this.a().a($$0, this.k(), blu::bx);
      if ($$2.size() != $$1) {
         throw new rh("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(bly<?> $$0, hx $$1, int $$2, double $$3) {
      hx $$4 = this.j($$1);
      List<? extends blu> $$5 = this.b((bly<? extends blu>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new ri("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.q());
      }
   }

   public void a(bly<?> $$0, hx $$1, double $$2) {
      List<? extends blu> $$3 = this.b((bly<? extends blu>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         hx $$4 = this.j($$1);
         throw new ri("Expected " + $$0.i(), $$4, $$1, this.a.q());
      }
   }

   public <T extends blu> List<T> b(bly<T> $$0, hx $$1, double $$2) {
      hx $$3 = this.j($$1);
      return this.a().a($$0, new eln($$3).g($$2), blu::bx);
   }

   public void a(blu $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hx($$1, $$2, $$3));
   }

   public void a(blu $$0, hx $$1) {
      hx $$2 = this.j($$1);
      List<? extends blu> $$3 = this.a().a($$0.ai(), new eln($$2), blu::bx);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new ri("Expected " + $$0.ai().i(), $$2, $$1, this.a.q()));
   }

   public void a(cms $$0, hx $$1, double $$2, int $$3) {
      hx $$4 = this.j($$1);
      List<cbt> $$5 = this.a().a(bly.ae, new eln($$4).g($$2), blu::bx);
      int $$6 = 0;

      for (cbt $$7 : $$5) {
         cmx $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new ri("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.q());
      }
   }

   public void a(cms $$0, hx $$1, double $$2) {
      hx $$3 = this.j($$1);

      for (blu $$5 : this.a().a(bly.ae, new eln($$3).g($$2), blu::bx)) {
         cbt $$6 = (cbt)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new ri("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
   }

   public void b(cms $$0, hx $$1, double $$2) {
      hx $$3 = this.j($$1);

      for (blu $$5 : this.a().a(bly.ae, new eln($$3).g($$2), blu::bx)) {
         cbt $$6 = (cbt)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new ri("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
         }
      }
   }

   public void a(cms $$0) {
      for (blu $$2 : this.a().a(bly.ae, this.k(), blu::bx)) {
         cbt $$3 = (cbt)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new rh("Expected " + $$0.p().getString() + " item");
   }

   public void b(cms $$0) {
      for (blu $$2 : this.a().a(bly.ae, this.k(), blu::bx)) {
         cbt $$3 = (cbt)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new rh("Did not expect " + $$0.p().getString() + " item");
         }
      }
   }

   public void b(bly<?> $$0) {
      List<? extends blu> $$1 = this.a().a($$0, this.k(), blu::bx);
      if (!$$1.isEmpty()) {
         throw new rh("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bly<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new hx($$1, $$2, $$3));
   }

   public void d(bly<?> $$0, hx $$1) {
      hx $$2 = this.j($$1);
      List<? extends blu> $$3 = this.a().a($$0, new eln($$2), blu::bx);
      if (!$$3.isEmpty()) {
         throw new ri("Did not expect " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(bly<?> $$0, double $$1, double $$2, double $$3) {
      els $$4 = new els($$1, $$2, $$3);
      els $$5 = this.a($$4);
      Predicate<? super blu> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends blu> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new rh("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bly<?> $$0, double $$1, double $$2, double $$3) {
      els $$4 = new els($$1, $$2, $$3);
      els $$5 = this.a($$4);
      Predicate<? super blu> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends blu> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new rh("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends blu, T> void a(hx $$0, bly<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      hx $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new eln($$4), blu::bx);
      if ($$5.isEmpty()) {
         throw new ri("Expected " + $$1.i(), $$4, $$0, this.a.q());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new rh("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new rh("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bmk> void a(hx $$0, bly<E> $$1, cms $$2) {
      hx $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new eln($$3), blu::bx);
      if ($$4.isEmpty()) {
         throw new ri("Expected entity of type: " + $$1, $$3, $$0, this.j());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new ri("Entity should be holding: " + $$2, $$3, $$0, this.j());
      }
   }

   public <E extends blu & ces> void b(hx $$0, bly<E> $$1, cms $$2) {
      hx $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new eln($$3), $$0x -> ((blu)$$0x).bx());
      if ($$4.isEmpty()) {
         throw new ri("Expected " + $$1.i() + " to exist", $$3, $$0, this.j());
      } else {
         for (E $$5 : $$4) {
            if ($$5.A().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new ri("Entity inventory should contain: " + $$2, $$3, $$0, this.j());
      }
   }

   public void g(hx $$0) {
      hx $$1 = this.j($$0);
      dgu $$2 = this.a().c_($$1);
      if ($$2 instanceof dgo && !((dgo)$$2).ai_()) {
         throw new rh("Container should be empty");
      }
   }

   public void a(hx $$0, cms $$1) {
      hx $$2 = this.j($$0);
      dgu $$3 = this.a().c_($$2);
      if (!($$3 instanceof dgo)) {
         throw new rh("Expected a container at " + $$0 + ", found " + kd.k.b($$3.v()));
      } else if (((dgo)$$3).a_($$1) != 1) {
         throw new rh("Container should contain: " + $$1);
      }
   }

   public void a(dyx $$0, hx $$1) {
      hx.a($$0).forEach($$2 -> {
         hx $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(hx $$0, hx $$1) {
      djg $$2 = this.a($$0);
      djg $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, hx $$1, cms $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, hx $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends blu, T> void b(hx $$0, bly<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends blu> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new rh("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends blu, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new rh("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bmk $$0, blf $$1, int $$2) {
      blh $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new rh("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(bly<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new hx($$1, $$2, $$3));
   }

   public void e(bly<?> $$0, hx $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bly<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new hx($$1, $$2, $$3));
   }

   public void f(bly<?> $$0, hx $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void g() {
      this.a.n();
   }

   private void l() {
      if (this.b) {
         throw new IllegalStateException("This test already has final clause");
      } else {
         this.b = true;
      }
   }

   public void a(Runnable $$0) {
      this.l();
      this.a.r().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.l();
      this.a.r().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.l();
      this.a.r().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.q() + $$0, $$1);
   }

   public void h(hx $$0) {
      hx $$1 = this.j($$0);
      and $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(hx $$0) {
      hx $$1 = this.j($$0);
      and $$2 = this.a();
      $$2.a($$1);
   }

   public void h() {
      eln $$0 = this.m();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new hx($$4, $$3, $$5));
         }
      }
   }

   public int a(dop.a $$0, int $$1, int $$2) {
      hx $$3 = this.j(new hx($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, hx $$1) {
      throw new ri($$0, this.j($$1), $$1, this.j());
   }

   public void a(String $$0, blu $$1) {
      throw new ri($$0, $$1.dm(), this.k($$1.dm()), this.j());
   }

   public void a(String $$0) {
      throw new rh($$0);
   }

   public void c(Runnable $$0) {
      this.a.r().a($$0).a(() -> new rh("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public rs i() {
      return this.a.r();
   }

   public hx j(hx $$0) {
      hx $$1 = this.a.d();
      hx $$2 = $$1.a((jb)$$0);
      return edf.a($$2, dbl.a, this.a.v(), $$1);
   }

   public hx k(hx $$0) {
      hx $$1 = this.a.d();
      ddb $$2 = this.a.v().a(ddb.c);
      hx $$3 = edf.a($$0, dbl.a, $$2, $$1);
      return $$3.b($$1);
   }

   public els a(els $$0) {
      els $$1 = els.a(this.a.d());
      return edf.a($$1.e($$0), dbl.a, this.a.v(), this.a.d());
   }

   public els b(els $$0) {
      els $$1 = els.a(this.a.d());
      return edf.a($$0.d($$1), dbl.a, this.a.v(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new rh($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new rh($$1);
      }
   }

   public long j() {
      return this.a.q();
   }

   public eln k() {
      return this.a.g();
   }

   private eln m() {
      eln $$0 = this.a.g();
      return $$0.a(hx.b.b(this.j(hx.b)));
   }

   public void a(Consumer<hx> $$0) {
      eln $$1 = this.m();
      hx.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cfh $$0, cmx $$1, hx $$2, ic $$3) {
      hx $$4 = this.j($$2.a($$3));
      elo $$5 = new elo(els.b($$4), $$3, $$4, false);
      cpi $$6 = new cpi($$0, bjz.a, $$5);
      $$1.a($$6);
   }

   public void a(ahf<cun> $$0) {
      eln $$1 = this.k();
      hx $$2 = hx.a($$1.a, $$1.b, $$1.c);
      hx $$3 = hx.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = aji.a(this.a(), $$2, $$3, this.a().I_().d(ke.at).f($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
