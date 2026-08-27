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

public class rr {
   private final rs a;
   private boolean b;

   public rr(rs $$0) {
      this.a = $$0;
   }

   public aov a() {
      return this.a.f();
   }

   public dlf a(hz $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dit b(hz $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(bno.class);
   }

   public void a(Class $$0) {
      enn $$1 = this.k();
      List<bno> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof chh));
      $$2.forEach(bno::al);
   }

   public cds a(cou $$0, float $$1, float $$2, float $$3) {
      aov $$4 = this.a();
      ens $$5 = this.a(new ens((double)$$1, (double)$$2, (double)$$3));
      cds $$6 = new cds($$4, $$5.c, $$5.d, $$5.e, new coz($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public cds a(cou $$0, hz $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bno> E a(bnu<E> $$0, hz $$1) {
      return this.a($$0, ens.c($$1));
   }

   public <E extends bno> E a(bnu<E> $$0, ens $$1) {
      aov $$2 = this.a();
      E $$3 = $$0.a((cvn)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof boi $$4) {
            $$4.fL();
         }

         ens $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dC(), $$3.dE());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bno> E a(bnu<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bno> E a(bnu<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new rk("Expected " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new rk("Expected only one " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         ens $$6 = this.a(new ens((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dk().f($$6);
            double $$4x = $$2x.dk().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bno> List<E> b(bnu<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, ens.c(new hz($$1, $$2, $$3)), $$4);
   }

   public <E extends bno> List<E> a(bnu<E> $$0, ens $$1, double $$2) {
      aov $$3 = this.a();
      ens $$4 = this.a($$1);
      enn $$5 = this.a.d();
      enn $$6 = new enn($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cH().c($$6) && $$1x.bx());
   }

   public <E extends bno> E a(bnu<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new hz($$1, $$2, $$3));
   }

   public <E extends bno> E a(bnu<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ens((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends boi> E b(bnu<E> $$0, hz $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gb();
      return $$2;
   }

   public <E extends boi> E b(bnu<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new hz($$1, $$2, $$3));
   }

   public <E extends boi> E b(bnu<E> $$0, ens $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gb();
      return $$2;
   }

   public <E extends boi> E b(bnu<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ens((double)$$1, (double)$$2, (double)$$3));
   }

   public rw a(boi $$0, hz $$1, float $$2) {
      return this.i().a(2, () -> {
         ehe $$3 = $$0.N().a(this.j($$1), 0);
         $$0.N().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new hz($$0, $$1, $$2));
   }

   public void c(hz $$0) {
      this.b($$0, $$0x -> $$0x.a(atz.f), () -> "Expected button");
      hz $$1 = this.j($$0);
      dlf $$2 = this.a().a_($$1);
      cyy $$3 = (cyy)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(hz $$0) {
      this.a($$0, this.d());
   }

   public void a(hz $$0, chh $$1) {
      hz $$2 = this.j($$0);
      this.a($$0, $$1, new eno(ens.b($$2), ie.c, $$2, true));
   }

   public void a(hz $$0, chh $$1, eno $$2) {
      hz $$3 = this.j($$0);
      dlf $$4 = this.a().a_($$3);
      blt $$5 = blt.a;
      blw $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != blw.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cri $$7 = new cri($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bog a(bog $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public chh c() {
      return new chh(this.a(), hz.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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

   public bog b(bog $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public chh d() {
      return new chh(this.a(), hz.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
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
   public aow e() {
      apk $$0 = apk.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aow $$1 = new aow(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      uo $$2 = new uo(xy.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ae().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new hz($$0, $$1, $$2));
   }

   public void e(hz $$0) {
      this.a(cyq.dw, $$0);
      hz $$1 = this.j($$0);
      dlf $$2 = this.a().a_($$1);
      dda $$3 = (dda)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(hz $$0, long $$1) {
      this.a($$0, cyq.ha);
      this.b($$1, () -> this.a($$0, cyq.a));
   }

   public void f(hz $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, cyo $$3) {
      this.a(new hz($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dlf $$3) {
      this.a(new hz($$0, $$1, $$2), $$3);
   }

   public void a(hz $$0, cyo $$1) {
      this.a($$0, $$1.o());
   }

   public void a(hz $$0, dlf $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(cyo $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hz($$1, $$2, $$3));
   }

   public void a(cyo $$0, hz $$1) {
      dlf $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(cyo $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new hz($$1, $$2, $$3));
   }

   public void b(cyo $$0, hz $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(cyo $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hz($$1, $$2, $$3));
   }

   public void c(cyo $$0, hz $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(hz $$0, Predicate<cyo> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(hz $$0, Predicate<cyo> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(hz $$0, dmi<T> $$1, T $$2) {
      dlf $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new rl($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(hz $$0, dmi<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(hz $$0, Predicate<dlf> $$1, Supplier<String> $$2) {
      dlf $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new rl($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(hz $$0, ie $$1, IntPredicate $$2, Supplier<String> $$3) {
      hz $$4 = this.j($$0);
      aov $$5 = this.a();
      dlf $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new rl($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bnu<?> $$0) {
      List<? extends bno> $$1 = this.a().a($$0, this.k(), bno::bx);
      if ($$1.isEmpty()) {
         throw new rk("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bnu<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new hz($$1, $$2, $$3));
   }

   public void c(bnu<?> $$0, hz $$1) {
      hz $$2 = this.j($$1);
      List<? extends bno> $$3 = this.a().a($$0, new enn($$2), bno::bx);
      if ($$3.isEmpty()) {
         throw new rl("Expected " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bnu<?> $$0, ens $$1, ens $$2) {
      List<? extends bno> $$3 = this.a().a($$0, new enn($$1, $$2), bno::bx);
      if ($$3.isEmpty()) {
         throw new rl("Expected " + $$0.i() + " between ", hz.a($$1), hz.a($$2), this.a.o());
      }
   }

   public void a(bnu<?> $$0, int $$1) {
      List<? extends bno> $$2 = this.a().a($$0, this.k(), bno::bx);
      if ($$2.size() != $$1) {
         throw new rk("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(bnu<?> $$0, hz $$1, int $$2, double $$3) {
      hz $$4 = this.j($$1);
      List<? extends bno> $$5 = this.b((bnu<? extends bno>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new rl("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bnu<?> $$0, hz $$1, double $$2) {
      List<? extends bno> $$3 = this.b((bnu<? extends bno>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         hz $$4 = this.j($$1);
         throw new rl("Expected " + $$0.i(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bno> List<T> b(bnu<T> $$0, hz $$1, double $$2) {
      hz $$3 = this.j($$1);
      return this.a().a($$0, new enn($$3).g($$2), bno::bx);
   }

   public <T extends bno> List<T> c(bnu<T> $$0) {
      return this.a().a($$0, this.k(), bno::bx);
   }

   public void a(bno $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new hz($$1, $$2, $$3));
   }

   public void a(bno $$0, hz $$1) {
      hz $$2 = this.j($$1);
      List<? extends bno> $$3 = this.a().a($$0.ai(), new enn($$2), bno::bx);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new rl("Expected " + $$0.ai().i(), $$2, $$1, this.a.o()));
   }

   public void a(cou $$0, hz $$1, double $$2, int $$3) {
      hz $$4 = this.j($$1);
      List<cds> $$5 = this.a().a(bnu.af, new enn($$4).g($$2), bno::bx);
      int $$6 = 0;

      for (cds $$7 : $$5) {
         coz $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw new rl("Expected " + $$3 + " " + $$0.o().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cou $$0, hz $$1, double $$2) {
      hz $$3 = this.j($$1);

      for (bno $$5 : this.a().a(bnu.af, new enn($$3).g($$2), bno::bx)) {
         cds $$6 = (cds)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new rl("Expected " + $$0.o().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cou $$0, hz $$1, double $$2) {
      hz $$3 = this.j($$1);

      for (bno $$5 : this.a().a(bnu.af, new enn($$3).g($$2), bno::bx)) {
         cds $$6 = (cds)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new rl("Did not expect " + $$0.o().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cou $$0) {
      for (bno $$2 : this.a().a(bnu.af, this.k(), bno::bx)) {
         cds $$3 = (cds)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new rk("Expected " + $$0.o().getString() + " item");
   }

   public void b(cou $$0) {
      for (bno $$2 : this.a().a(bnu.af, this.k(), bno::bx)) {
         cds $$3 = (cds)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new rk("Did not expect " + $$0.o().getString() + " item");
         }
      }
   }

   public void d(bnu<?> $$0) {
      List<? extends bno> $$1 = this.a().a($$0, this.k(), bno::bx);
      if (!$$1.isEmpty()) {
         throw new rk("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bnu<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new hz($$1, $$2, $$3));
   }

   public void d(bnu<?> $$0, hz $$1) {
      hz $$2 = this.j($$1);
      List<? extends bno> $$3 = this.a().a($$0, new enn($$2), bno::bx);
      if (!$$3.isEmpty()) {
         throw new rl("Did not expect " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bnu<?> $$0, double $$1, double $$2, double $$3) {
      ens $$4 = new ens($$1, $$2, $$3);
      ens $$5 = this.a($$4);
      Predicate<? super bno> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends bno> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new rk("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bnu<?> $$0, double $$1, double $$2, double $$3) {
      ens $$4 = new ens($$1, $$2, $$3);
      ens $$5 = this.a($$4);
      Predicate<? super bno> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends bno> $$7 = this.a().a($$0, this.k(), $$6);
      if ($$7.isEmpty()) {
         throw new rk("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bno, T> void a(hz $$0, bnu<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      hz $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new enn($$4), bno::bx);
      if ($$5.isEmpty()) {
         throw new rl("Expected " + $$1.i(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new rk("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new rk("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bog> void a(hz $$0, bnu<E> $$1, cou $$2) {
      hz $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new enn($$3), bno::bx);
      if ($$4.isEmpty()) {
         throw new rl("Expected entity of type: " + $$1, $$3, $$0, this.j());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new rl("Entity should be holding: " + $$2, $$3, $$0, this.j());
      }
   }

   public <E extends bno & cgs> void b(hz $$0, bnu<E> $$1, cou $$2) {
      hz $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new enn($$3), $$0x -> ((bno)$$0x).bx());
      if ($$4.isEmpty()) {
         throw new rl("Expected " + $$1.i() + " to exist", $$3, $$0, this.j());
      } else {
         for (E $$5 : $$4) {
            if ($$5.A().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new rl("Entity inventory should contain: " + $$2, $$3, $$0, this.j());
      }
   }

   public void g(hz $$0) {
      hz $$1 = this.j($$0);
      dit $$2 = this.a().c_($$1);
      if ($$2 instanceof din && !((din)$$2).aj_()) {
         throw new rk("Container should be empty");
      }
   }

   public void a(hz $$0, cou $$1) {
      hz $$2 = this.j($$0);
      dit $$3 = this.a().c_($$2);
      if (!($$3 instanceof din)) {
         throw new rk("Expected a container at " + $$0 + ", found " + kf.k.b($$3.v()));
      } else if (((din)$$3).a_($$1) != 1) {
         throw new rk("Container should contain: " + $$1);
      }
   }

   public void a(eaw $$0, hz $$1) {
      hz.a($$0).forEach($$2 -> {
         hz $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(hz $$0, hz $$1) {
      dlf $$2 = this.a($$0);
      dlf $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, hz $$1, cou $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, hz $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bno, T> void b(hz $$0, bnu<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bno> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new rk("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bno, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new rk("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bog $$0, ij<bmz> $$1, int $$2) {
      bnb $$3 = $$0.c($$1);
      if ($$3 == null || $$3.d() != $$2) {
         int $$4 = $$2 + 1;
         throw new rk("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bnu<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new hz($$1, $$2, $$3));
   }

   public void e(bnu<?> $$0, hz $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bnu<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new hz($$1, $$2, $$3));
   }

   public void f(bnu<?> $$0, hz $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void g() {
      this.a.l();
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
      this.a.p().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.l();
      this.a.p().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.l();
      this.a.p().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.o() + $$0, $$1);
   }

   public void h(hz $$0) {
      hz $$1 = this.j($$0);
      aov $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(hz $$0) {
      hz $$1 = this.j($$0);
      aov $$2 = this.a();
      $$2.a($$1);
   }

   public void h() {
      enn $$0 = this.m();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new hz($$4, $$3, $$5));
         }
      }
   }

   public int a(dqo.a $$0, int $$1, int $$2) {
      hz $$3 = this.j(new hz($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, hz $$1) {
      throw new rl($$0, this.j($$1), $$1, this.j());
   }

   public void a(String $$0, bno $$1) {
      throw new rl($$0, $$1.dm(), this.k($$1.dm()), this.j());
   }

   public void a(String $$0) {
      throw new rk($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new rk("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public rw i() {
      return this.a.p();
   }

   public hz j(hz $$0) {
      hz $$1 = this.a.c();
      hz $$2 = $$1.a((jd)$$0);
      return efe.a($$2, ddk.a, this.a.t(), $$1);
   }

   public hz k(hz $$0) {
      hz $$1 = this.a.c();
      dfa $$2 = this.a.t().a(dfa.c);
      hz $$3 = efe.a($$0, ddk.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ens a(ens $$0) {
      ens $$1 = ens.a(this.a.c());
      return efe.a($$1.e($$0), ddk.a, this.a.t(), this.a.c());
   }

   public ens b(ens $$0) {
      ens $$1 = ens.a(this.a.c());
      return efe.a($$0.d($$1), ddk.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new rk($$1);
      }
   }

   public <N extends Number> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new rk("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new rk($$1);
      }
   }

   public long j() {
      return this.a.o();
   }

   public enn k() {
      return this.a.d();
   }

   private enn m() {
      enn $$0 = this.a.d();
      return $$0.a(hz.c.b(this.j(hz.c)));
   }

   public void a(Consumer<hz> $$0) {
      enn $$1 = this.m().a(1.0, 1.0, 1.0);
      hz.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(chh $$0, coz $$1, hz $$2, ie $$3) {
      hz $$4 = this.j($$2.a($$3));
      eno $$5 = new eno(ens.b($$4), $$3, $$4, false);
      cri $$6 = new cri($$0, blt.a, $$5);
      $$1.a($$6);
   }

   public void a(aix<cwm> $$0) {
      enn $$1 = this.k();
      hz $$2 = hz.a($$1.a, $$1.b, $$1.c);
      hz $$3 = hz.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ala.a(this.a(), $$2, $$3, this.a().I_().d(kg.at).f($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
