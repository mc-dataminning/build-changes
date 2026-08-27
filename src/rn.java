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

   public djh a(hx $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dgv b(hx $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(blv.class);
   }

   public void a(Class $$0) {
      elo $$1 = this.k();
      List<blv> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cfi));
      $$2.forEach(blv::al);
   }

   public cbu a(cmt $$0, float $$1, float $$2, float $$3) {
      and $$4 = this.a();
      elt $$5 = this.a(new elt((double)$$1, (double)$$2, (double)$$3));
      cbu $$6 = new cbu($$4, $$5.c, $$5.d, $$5.e, new cmy($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public cbu a(cmt $$0, hx $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends blv> E a(blz<E> $$0, hx $$1) {
      return this.a($$0, elt.c($$1));
   }

   public <E extends blv> E a(blz<E> $$0, elt $$1) {
      and $$2 = this.a();
      E $$3 = $$0.a((ctp)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bmn $$4) {
            $$4.fJ();
         }

         elt $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dC(), $$3.dE());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends blv> E a(blz<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new hx($$1, $$2, $$3));
   }

   public <E extends blv> E a(blz<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new elt((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bmn> E b(blz<E> $$0, hx $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bmn> E b(blz<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new hx($$1, $$2, $$3));
   }

   public <E extends bmn> E b(blz<E> $$0, elt $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bmn> E b(blz<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new elt((double)$$1, (double)$$2, (double)$$3));
   }

   public rs a(bmn $$0, hx $$1, float $$2) {
      return this.i().a(2, () -> {
         efg $$3 = $$0.N().a(this.j($$1), 0);
         $$0.N().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new hx($$0, $$1, $$2));
   }

   public void c(hx $$0) {
      this.b($$0, $$0x -> $$0x.a(ash.f), () -> "Expected button");
      hx $$1 = this.j($$0);
      djh $$2 = this.a().a_($$1);
      cxa $$3 = (cxa)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(hx $$0) {
      this.a($$0, this.d());
   }

   public void a(hx $$0, cfi $$1) {
      hx $$2 = this.j($$0);
      this.a($$0, $$1, new elp(elt.b($$2), ic.c, $$2, true));
   }

   public void a(hx $$0, cfi $$1, elp $$2) {
      hx $$3 = this.j($$0);
      djh $$4 = this.a().a_($$3);
      bkb $$5 = $$4.a(this.a(), $$1, bka.a, $$2);
      if (!$$5.a()) {
         cpj $$6 = new cpj($$1, bka.a, $$2);
         $$1.b(bka.a).a($$6);
      }
   }

   public bml a(bml $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cfi c() {
      return new cfi(this.a(), hx.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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

   public bml b(bml $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cfi d() {
      return new cfi(this.a(), hx.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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
      this.a(cws.dw, $$0);
      hx $$1 = this.j($$0);
      djh $$2 = this.a().a_($$1);
      dbc $$3 = (dbc)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(hx $$0, long $$1) {
      this.a($$0, cws.ha);
      this.b($$1, () -> this.a($$0, cws.a));
   }

   public void f(hx $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cwq $$3) {
      this.a(new hx($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, djh $$3) {
      this.a(new hx($$0, $$1, $$2), $$3);
   }

   public void a(hx $$0, cwq $$1) {
      this.a($$0, $$1.o());
   }

   public void a(hx $$0, djh $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cwq $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hx($$1, $$2, $$3));
   }

   public void a(cwq $$0, hx $$1) {
      djh $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cwq $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new hx($$1, $$2, $$3));
   }

   public void b(cwq $$0, hx $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cwq $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hx($$1, $$2, $$3));
   }

   public void c(cwq $$0, hx $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(hx $$0, Predicate<cwq> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(hx $$0, Predicate<cwq> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(hx $$0, dkk<T> $$1, T $$2) {
      djh $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new ri($$6, this.j($$0), $$0, this.a.q());
      }
   }

   public <T extends Comparable<T>> void a(hx $$0, dkk<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(hx $$0, Predicate<djh> $$1, Supplier<String> $$2) {
      djh $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new ri($$2.get(), this.j($$0), $$0, this.a.q());
      }
   }

   public void a(hx $$0, ic $$1, IntPredicate $$2, Supplier<String> $$3) {
      hx $$4 = this.j($$0);
      and $$5 = this.a();
      djh $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new ri($$3.get(), $$4, $$0, this.a.q());
      }
   }

   public void a(blz<?> $$0) {
      List<? extends blv> $$1 = this.a().a($$0, this.k(), blv::bx);
      if ($$1.isEmpty()) {
         throw new rh("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(blz<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hx($$1, $$2, $$3));
   }

   public void c(blz<?> $$0, hx $$1) {
      hx $$2 = this.j($$1);
      List<? extends blv> $$3 = this.a().a($$0, new elo($$2), blv::bx);
      if ($$3.isEmpty()) {
         throw new ri("Expected " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(blz<?> $$0, elt $$1, elt $$2) {
      List<? extends blv> $$3 = this.a().a($$0, new elo($$1, $$2), blv::bx);
      if ($$3.isEmpty()) {
         throw new ri("Expected " + $$0.i() + " between ", hx.a($$1), hx.a($$2), this.a.q());
      }
   }

   public void a(blz<?> $$0, int $$1) {
      List<? extends blv> $$2 = this.a().a($$0, this.k(), blv::bx);
      if ($$2.size() != $$1) {
         throw new rh("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(blz<?> $$0, hx $$1, int $$2, double $$3) {
      hx $$4 = this.j($$1);
      List<? extends blv> $$5 = this.b((blz<? extends blv>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new ri("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.q());
      }
   }

   public void a(blz<?> $$0, hx $$1, double $$2) {
      List<? extends blv> $$3 = this.b((blz<? extends blv>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         hx $$4 = this.j($$1);
         throw new ri("Expected " + $$0.i(), $$4, $$1, this.a.q());
      }
   }

   public <T extends blv> List<T> b(blz<T> $$0, hx $$1, double $$2) {
      hx $$3 = this.j($$1);
      return this.a().a($$0, new elo($$3).g($$2), blv::bx);
   }

   public void a(blv $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hx($$1, $$2, $$3));
   }

   public void a(blv $$0, hx $$1) {
      hx $$2 = this.j($$1);
      List<? extends blv> $$3 = this.a().a($$0.ai(), new elo($$2), blv::bx);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new ri("Expected " + $$0.ai().i(), $$2, $$1, this.a.q()));
   }

   public void a(cmt $$0, hx $$1, double $$2, int $$3) {
      hx $$4 = this.j($$1);
      List<cbu> $$5 = this.a().a(blz.ae, new elo($$4).g($$2), blv::bx);
      int $$6 = 0;

      for (cbu $$7 : $$5) {
         cmy $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new ri("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.q());
      }
   }

   public void a(cmt $$0, hx $$1, double $$2) {
      hx $$3 = this.j($$1);

      for (blv $$5 : this.a().a(blz.ae, new elo($$3).g($$2), blv::bx)) {
         cbu $$6 = (cbu)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new ri("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
   }

   public void b(cmt $$0, hx $$1, double $$2) {
      hx $$3 = this.j($$1);

      for (blv $$5 : this.a().a(blz.ae, new elo($$3).g($$2), blv::bx)) {
         cbu $$6 = (cbu)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new ri("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
         }
      }
   }

   public void a(cmt $$0) {
      for (blv $$2 : this.a().a(blz.ae, this.k(), blv::bx)) {
         cbu $$3 = (cbu)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new rh("Expected " + $$0.p().getString() + " item");
   }

   public void b(cmt $$0) {
      for (blv $$2 : this.a().a(blz.ae, this.k(), blv::bx)) {
         cbu $$3 = (cbu)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new rh("Did not expect " + $$0.p().getString() + " item");
         }
      }
   }

   public void b(blz<?> $$0) {
      List<? extends blv> $$1 = this.a().a($$0, this.k(), blv::bx);
      if (!$$1.isEmpty()) {
         throw new rh("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(blz<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new hx($$1, $$2, $$3));
   }

   public void d(blz<?> $$0, hx $$1) {
      hx $$2 = this.j($$1);
      List<? extends blv> $$3 = this.a().a($$0, new elo($$2), blv::bx);
      if (!$$3.isEmpty()) {
         throw new ri("Did not expect " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(blz<?> $$0, double $$1, double $$2, double $$3) {
      elt $$4 = new elt($$1, $$2, $$3);
      elt $$5 = this.a($$4);
      Predicate<? super blv> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends blv> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new rh("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(blz<?> $$0, double $$1, double $$2, double $$3) {
      elt $$4 = new elt($$1, $$2, $$3);
      elt $$5 = this.a($$4);
      Predicate<? super blv> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends blv> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new rh("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends blv, T> void a(hx $$0, blz<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      hx $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new elo($$4), blv::bx);
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

   public <E extends bml> void a(hx $$0, blz<E> $$1, cmt $$2) {
      hx $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new elo($$3), blv::bx);
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

   public <E extends blv & cet> void b(hx $$0, blz<E> $$1, cmt $$2) {
      hx $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new elo($$3), $$0x -> ((blv)$$0x).bx());
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
      dgv $$2 = this.a().c_($$1);
      if ($$2 instanceof dgp && !((dgp)$$2).ai_()) {
         throw new rh("Container should be empty");
      }
   }

   public void a(hx $$0, cmt $$1) {
      hx $$2 = this.j($$0);
      dgv $$3 = this.a().c_($$2);
      if (!($$3 instanceof dgp)) {
         throw new rh("Expected a container at " + $$0 + ", found " + kd.k.b($$3.v()));
      } else if (((dgp)$$3).a_($$1) != 1) {
         throw new rh("Container should contain: " + $$1);
      }
   }

   public void a(dyy $$0, hx $$1) {
      hx.a($$0).forEach($$2 -> {
         hx $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(hx $$0, hx $$1) {
      djh $$2 = this.a($$0);
      djh $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, hx $$1, cmt $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, hx $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends blv, T> void b(hx $$0, blz<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends blv> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new rh("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends blv, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new rh("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bml $$0, blg $$1, int $$2) {
      bli $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new rh("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(blz<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new hx($$1, $$2, $$3));
   }

   public void e(blz<?> $$0, hx $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(blz<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new hx($$1, $$2, $$3));
   }

   public void f(blz<?> $$0, hx $$1) {
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
      elo $$0 = this.m();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new hx($$4, $$3, $$5));
         }
      }
   }

   public int a(doq.a $$0, int $$1, int $$2) {
      hx $$3 = this.j(new hx($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, hx $$1) {
      throw new ri($$0, this.j($$1), $$1, this.j());
   }

   public void a(String $$0, blv $$1) {
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
      return edg.a($$2, dbm.a, this.a.v(), $$1);
   }

   public hx k(hx $$0) {
      hx $$1 = this.a.d();
      ddc $$2 = this.a.v().a(ddc.c);
      hx $$3 = edg.a($$0, dbm.a, $$2, $$1);
      return $$3.b($$1);
   }

   public elt a(elt $$0) {
      elt $$1 = elt.a(this.a.d());
      return edg.a($$1.e($$0), dbm.a, this.a.v(), this.a.d());
   }

   public elt b(elt $$0) {
      elt $$1 = elt.a(this.a.d());
      return edg.a($$0.d($$1), dbm.a, this.a.v(), this.a.d());
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

   public elo k() {
      return this.a.g();
   }

   private elo m() {
      elo $$0 = this.a.g();
      return $$0.a(hx.b.b(this.j(hx.b)));
   }

   public void a(Consumer<hx> $$0) {
      elo $$1 = this.m();
      hx.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cfi $$0, cmy $$1, hx $$2, ic $$3) {
      hx $$4 = this.j($$2.a($$3));
      elp $$5 = new elp(elt.b($$4), $$3, $$4, false);
      cpj $$6 = new cpj($$0, bka.a, $$5);
      $$1.a($$6);
   }

   public void a(ahf<cuo> $$0) {
      elo $$1 = this.k();
      hx $$2 = hx.a($$1.a, $$1.b, $$1.c);
      hx $$3 = hx.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = aji.a(this.a(), $$2, $$3, this.a().I_().d(ke.at).f($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
