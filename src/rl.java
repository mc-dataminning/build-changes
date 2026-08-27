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

public class rl {
   private final rm a;
   private boolean b;

   public rl(rm $$0) {
      this.a = $$0;
   }

   public amz a() {
      return this.a.h();
   }

   public dja a(hx $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dgo b(hx $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(blp.class);
   }

   public void a(Class $$0) {
      elh $$1 = this.k();
      List<blp> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cfb));
      $$2.forEach(blp::al);
   }

   public cbo a(cmm $$0, float $$1, float $$2, float $$3) {
      amz $$4 = this.a();
      elm $$5 = this.a(new elm((double)$$1, (double)$$2, (double)$$3));
      cbo $$6 = new cbo($$4, $$5.c, $$5.d, $$5.e, new cmr($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public cbo a(cmm $$0, hx $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends blp> E a(blt<E> $$0, hx $$1) {
      return this.a($$0, elm.c($$1));
   }

   public <E extends blp> E a(blt<E> $$0, elm $$1) {
      amz $$2 = this.a();
      E $$3 = $$0.a((cti)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bmh $$4) {
            $$4.fJ();
         }

         elm $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dC(), $$3.dE());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends blp> E a(blt<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new hx($$1, $$2, $$3));
   }

   public <E extends blp> E a(blt<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new elm((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bmh> E b(blt<E> $$0, hx $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bmh> E b(blt<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new hx($$1, $$2, $$3));
   }

   public <E extends bmh> E b(blt<E> $$0, elm $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bmh> E b(blt<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new elm((double)$$1, (double)$$2, (double)$$3));
   }

   public rq a(bmh $$0, hx $$1, float $$2) {
      return this.i().a(2, () -> {
         eez $$3 = $$0.N().a(this.j($$1), 0);
         $$0.N().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new hx($$0, $$1, $$2));
   }

   public void c(hx $$0) {
      this.b($$0, $$0x -> $$0x.a(asb.f), () -> "Expected button");
      hx $$1 = this.j($$0);
      dja $$2 = this.a().a_($$1);
      cwt $$3 = (cwt)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(hx $$0) {
      this.a($$0, this.d());
   }

   public void a(hx $$0, cfb $$1) {
      hx $$2 = this.j($$0);
      this.a($$0, $$1, new eli(elm.b($$2), ic.c, $$2, true));
   }

   public void a(hx $$0, cfb $$1, eli $$2) {
      hx $$3 = this.j($$0);
      dja $$4 = this.a().a_($$3);
      bjv $$5 = $$4.a(this.a(), $$1, bju.a, $$2);
      if (!$$5.a()) {
         cpc $$6 = new cpc($$1, bju.a, $$2);
         $$1.b(bju.a).a($$6);
      }
   }

   public bmf a(bmf $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cfb c() {
      return new cfb(this.a(), hx.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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

   public bmf b(bmf $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cfb d() {
      return new cfb(this.a(), hx.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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
   public ana e() {
      ano $$0 = ano.a(new GameProfile(UUID.randomUUID(), "test-mock-player"));
      ana $$1 = new ana(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      ue $$2 = new ue(xe.a);
      EmbeddedChannel $$3 = new EmbeddedChannel(new ChannelHandler[]{$$2});
      $$3.attr(ue.e).set(uf.b.b(xe.a));
      this.a().o().ae().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new hx($$0, $$1, $$2));
   }

   public void e(hx $$0) {
      this.a(cwl.dw, $$0);
      hx $$1 = this.j($$0);
      dja $$2 = this.a().a_($$1);
      dav $$3 = (dav)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(hx $$0, long $$1) {
      this.a($$0, cwl.ha);
      this.b($$1, () -> this.a($$0, cwl.a));
   }

   public void f(hx $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cwj $$3) {
      this.a(new hx($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dja $$3) {
      this.a(new hx($$0, $$1, $$2), $$3);
   }

   public void a(hx $$0, cwj $$1) {
      this.a($$0, $$1.o());
   }

   public void a(hx $$0, dja $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cwj $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hx($$1, $$2, $$3));
   }

   public void a(cwj $$0, hx $$1) {
      dja $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cwj $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new hx($$1, $$2, $$3));
   }

   public void b(cwj $$0, hx $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cwj $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hx($$1, $$2, $$3));
   }

   public void c(cwj $$0, hx $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(hx $$0, Predicate<cwj> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(hx $$0, Predicate<cwj> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(hx $$0, dkd<T> $$1, T $$2) {
      dja $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new rg($$6, this.j($$0), $$0, this.a.q());
      }
   }

   public <T extends Comparable<T>> void a(hx $$0, dkd<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(hx $$0, Predicate<dja> $$1, Supplier<String> $$2) {
      dja $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new rg($$2.get(), this.j($$0), $$0, this.a.q());
      }
   }

   public void a(hx $$0, ic $$1, IntPredicate $$2, Supplier<String> $$3) {
      hx $$4 = this.j($$0);
      amz $$5 = this.a();
      dja $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new rg($$3.get(), $$4, $$0, this.a.q());
      }
   }

   public void a(blt<?> $$0) {
      List<? extends blp> $$1 = this.a().a($$0, this.k(), blp::bx);
      if ($$1.isEmpty()) {
         throw new rf("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(blt<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hx($$1, $$2, $$3));
   }

   public void c(blt<?> $$0, hx $$1) {
      hx $$2 = this.j($$1);
      List<? extends blp> $$3 = this.a().a($$0, new elh($$2), blp::bx);
      if ($$3.isEmpty()) {
         throw new rg("Expected " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(blt<?> $$0, elm $$1, elm $$2) {
      List<? extends blp> $$3 = this.a().a($$0, new elh($$1, $$2), blp::bx);
      if ($$3.isEmpty()) {
         throw new rg("Expected " + $$0.i() + " between ", hx.a($$1), hx.a($$2), this.a.q());
      }
   }

   public void a(blt<?> $$0, int $$1) {
      List<? extends blp> $$2 = this.a().a($$0, this.k(), blp::bx);
      if ($$2.size() != $$1) {
         throw new rf("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(blt<?> $$0, hx $$1, int $$2, double $$3) {
      hx $$4 = this.j($$1);
      List<? extends blp> $$5 = this.b((blt<? extends blp>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new rg("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.q());
      }
   }

   public void a(blt<?> $$0, hx $$1, double $$2) {
      List<? extends blp> $$3 = this.b((blt<? extends blp>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         hx $$4 = this.j($$1);
         throw new rg("Expected " + $$0.i(), $$4, $$1, this.a.q());
      }
   }

   public <T extends blp> List<T> b(blt<T> $$0, hx $$1, double $$2) {
      hx $$3 = this.j($$1);
      return this.a().a($$0, new elh($$3).g($$2), blp::bx);
   }

   public void a(blp $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hx($$1, $$2, $$3));
   }

   public void a(blp $$0, hx $$1) {
      hx $$2 = this.j($$1);
      List<? extends blp> $$3 = this.a().a($$0.ai(), new elh($$2), blp::bx);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new rg("Expected " + $$0.ai().i(), $$2, $$1, this.a.q()));
   }

   public void a(cmm $$0, hx $$1, double $$2, int $$3) {
      hx $$4 = this.j($$1);
      List<cbo> $$5 = this.a().a(blt.ae, new elh($$4).g($$2), blp::bx);
      int $$6 = 0;

      for (cbo $$7 : $$5) {
         cmr $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new rg("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.q());
      }
   }

   public void a(cmm $$0, hx $$1, double $$2) {
      hx $$3 = this.j($$1);

      for (blp $$5 : this.a().a(blt.ae, new elh($$3).g($$2), blp::bx)) {
         cbo $$6 = (cbo)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new rg("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
   }

   public void b(cmm $$0, hx $$1, double $$2) {
      hx $$3 = this.j($$1);

      for (blp $$5 : this.a().a(blt.ae, new elh($$3).g($$2), blp::bx)) {
         cbo $$6 = (cbo)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new rg("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.q());
         }
      }
   }

   public void a(cmm $$0) {
      for (blp $$2 : this.a().a(blt.ae, this.k(), blp::bx)) {
         cbo $$3 = (cbo)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new rf("Expected " + $$0.p().getString() + " item");
   }

   public void b(cmm $$0) {
      for (blp $$2 : this.a().a(blt.ae, this.k(), blp::bx)) {
         cbo $$3 = (cbo)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new rf("Did not expect " + $$0.p().getString() + " item");
         }
      }
   }

   public void b(blt<?> $$0) {
      List<? extends blp> $$1 = this.a().a($$0, this.k(), blp::bx);
      if (!$$1.isEmpty()) {
         throw new rf("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(blt<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new hx($$1, $$2, $$3));
   }

   public void d(blt<?> $$0, hx $$1) {
      hx $$2 = this.j($$1);
      List<? extends blp> $$3 = this.a().a($$0, new elh($$2), blp::bx);
      if (!$$3.isEmpty()) {
         throw new rg("Did not expect " + $$0.i(), $$2, $$1, this.a.q());
      }
   }

   public void a(blt<?> $$0, double $$1, double $$2, double $$3) {
      elm $$4 = new elm($$1, $$2, $$3);
      elm $$5 = this.a($$4);
      Predicate<? super blp> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends blp> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new rf("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(blt<?> $$0, double $$1, double $$2, double $$3) {
      elm $$4 = new elm($$1, $$2, $$3);
      elm $$5 = this.a($$4);
      Predicate<? super blp> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends blp> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new rf("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends blp, T> void a(hx $$0, blt<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      hx $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new elh($$4), blp::bx);
      if ($$5.isEmpty()) {
         throw new rg("Expected " + $$1.i(), $$4, $$0, this.a.q());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new rf("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new rf("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bmf> void a(hx $$0, blt<E> $$1, cmm $$2) {
      hx $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new elh($$3), blp::bx);
      if ($$4.isEmpty()) {
         throw new rg("Expected entity of type: " + $$1, $$3, $$0, this.j());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new rg("Entity should be holding: " + $$2, $$3, $$0, this.j());
      }
   }

   public <E extends blp & cem> void b(hx $$0, blt<E> $$1, cmm $$2) {
      hx $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new elh($$3), $$0x -> ((blp)$$0x).bx());
      if ($$4.isEmpty()) {
         throw new rg("Expected " + $$1.i() + " to exist", $$3, $$0, this.j());
      } else {
         for (E $$5 : $$4) {
            if ($$5.A().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new rg("Entity inventory should contain: " + $$2, $$3, $$0, this.j());
      }
   }

   public void g(hx $$0) {
      hx $$1 = this.j($$0);
      dgo $$2 = this.a().c_($$1);
      if ($$2 instanceof dgi && !((dgi)$$2).ai_()) {
         throw new rf("Container should be empty");
      }
   }

   public void a(hx $$0, cmm $$1) {
      hx $$2 = this.j($$0);
      dgo $$3 = this.a().c_($$2);
      if (!($$3 instanceof dgi)) {
         throw new rf("Expected a container at " + $$0 + ", found " + kd.k.b($$3.v()));
      } else if (((dgi)$$3).a_($$1) != 1) {
         throw new rf("Container should contain: " + $$1);
      }
   }

   public void a(dyr $$0, hx $$1) {
      hx.a($$0).forEach($$2 -> {
         hx $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(hx $$0, hx $$1) {
      dja $$2 = this.a($$0);
      dja $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, hx $$1, cmm $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, hx $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends blp, T> void b(hx $$0, blt<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends blp> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new rf("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends blp, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new rf("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bmf $$0, bla $$1, int $$2) {
      blc $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new rf("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(blt<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new hx($$1, $$2, $$3));
   }

   public void e(blt<?> $$0, hx $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(blt<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new hx($$1, $$2, $$3));
   }

   public void f(blt<?> $$0, hx $$1) {
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
      amz $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(hx $$0) {
      hx $$1 = this.j($$0);
      amz $$2 = this.a();
      $$2.a($$1);
   }

   public void h() {
      elh $$0 = this.m();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new hx($$4, $$3, $$5));
         }
      }
   }

   public int a(doj.a $$0, int $$1, int $$2) {
      hx $$3 = this.j(new hx($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, hx $$1) {
      throw new rg($$0, this.j($$1), $$1, this.j());
   }

   public void a(String $$0, blp $$1) {
      throw new rg($$0, $$1.dm(), this.k($$1.dm()), this.j());
   }

   public void a(String $$0) {
      throw new rf($$0);
   }

   public void c(Runnable $$0) {
      this.a.r().a($$0).a(() -> new rf("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public rq i() {
      return this.a.r();
   }

   public hx j(hx $$0) {
      hx $$1 = this.a.d();
      hx $$2 = $$1.a((jb)$$0);
      return ecz.a($$2, dbf.a, this.a.v(), $$1);
   }

   public hx k(hx $$0) {
      hx $$1 = this.a.d();
      dcv $$2 = this.a.v().a(dcv.c);
      hx $$3 = ecz.a($$0, dbf.a, $$2, $$1);
      return $$3.b($$1);
   }

   public elm a(elm $$0) {
      elm $$1 = elm.a(this.a.d());
      return ecz.a($$1.e($$0), dbf.a, this.a.v(), this.a.d());
   }

   public elm b(elm $$0) {
      elm $$1 = elm.a(this.a.d());
      return ecz.a($$0.d($$1), dbf.a, this.a.v(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new rf($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new rf($$1);
      }
   }

   public long j() {
      return this.a.q();
   }

   public elh k() {
      return this.a.g();
   }

   private elh m() {
      elh $$0 = this.a.g();
      return $$0.a(hx.b.b(this.j(hx.b)));
   }

   public void a(Consumer<hx> $$0) {
      elh $$1 = this.m();
      hx.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.q(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cfb $$0, cmr $$1, hx $$2, ic $$3) {
      hx $$4 = this.j($$2.a($$3));
      eli $$5 = new eli(elm.b($$4), $$3, $$4, false);
      cpc $$6 = new cpc($$0, bju.a, $$5);
      $$1.a($$6);
   }

   public void a(ahc<cuh> $$0) {
      elh $$1 = this.k();
      hx $$2 = hx.a($$1.a, $$1.b, $$1.c);
      hx $$3 = hx.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ajf.a(this.a(), $$2, $$3, this.a().I_().d(ke.at).f($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
