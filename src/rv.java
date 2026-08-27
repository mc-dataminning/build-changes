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

public class rv {
   private final rw a;
   private boolean b;

   public rv(rw $$0) {
      this.a = $$0;
   }

   public apf a() {
      return this.a.f();
   }

   public dnb a(ib $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dki b(ib $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(box.class);
   }

   public void a(Class $$0) {
      epo $$1 = this.i();
      List<box> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof ciu));
      $$2.forEach(box::al);
   }

   public cfe a(cqh $$0, ept $$1) {
      apf $$2 = this.a();
      ept $$3 = this.a($$1);
      cfe $$4 = new cfe($$2, $$3.c, $$3.d, $$3.e, new cqm($$0, 1));
      $$4.o(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cfe a(cqh $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ept((double)$$1, (double)$$2, (double)$$3));
   }

   public cfe a(cqh $$0, ib $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends box> E a(bpd<E> $$0, ib $$1) {
      return this.a($$0, ept.c($$1));
   }

   public <E extends box> E a(bpd<E> $$0, ept $$1) {
      apf $$2 = this.a();
      E $$3 = $$0.a((cxb)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bpr $$4) {
            $$4.fS();
         }

         ept $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dC(), $$3.dE());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends box> E a(bpd<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends box> E a(bpd<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new ro("Expected " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new ro("Expected only one " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         ept $$6 = this.a(new ept((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dk().f($$6);
            double $$4x = $$2x.dk().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends box> List<E> b(bpd<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, ept.c(new ib($$1, $$2, $$3)), $$4);
   }

   public <E extends box> List<E> a(bpd<E> $$0, ept $$1, double $$2) {
      apf $$3 = this.a();
      ept $$4 = this.a($$1);
      epo $$5 = this.a.d();
      epo $$6 = new epo($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cH().c($$6) && $$1x.bA());
   }

   public <E extends box> E a(bpd<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ib($$1, $$2, $$3));
   }

   public <E extends box> E a(bpd<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ept((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bpr> E b(bpd<E> $$0, ib $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gi();
      return $$2;
   }

   public <E extends bpr> E b(bpd<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ib($$1, $$2, $$3));
   }

   public <E extends bpr> E b(bpd<E> $$0, ept $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gi();
      return $$2;
   }

   public <E extends bpr> E b(bpd<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ept((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bpr $$0, float $$1, float $$2, float $$3) {
      ept $$4 = this.a(new ept((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dC(), $$0.dE());
   }

   public sa a(bpr $$0, ib $$1, float $$2) {
      return this.g().a(2, () -> {
         ejd $$3 = $$0.K().a(this.j($$1), 0);
         $$0.K().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ib($$0, $$1, $$2));
   }

   public void c(ib $$0) {
      this.b($$0, $$0x -> $$0x.a(aun.f), () -> "Expected button");
      ib $$1 = this.j($$0);
      dnb $$2 = this.a().a_($$1);
      dam $$3 = (dam)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(ib $$0) {
      this.a($$0, this.a(cwy.b));
   }

   public void a(ib $$0, ciu $$1) {
      ib $$2 = this.j($$0);
      this.a($$0, $$1, new epp(ept.b($$2), ih.c, $$2, true));
   }

   public void a(ib $$0, ciu $$1, epp $$2) {
      ib $$3 = this.j($$0);
      dnb $$4 = this.a().a_($$3);
      bnc $$5 = bnc.a;
      bnf $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bnf.d || !$$4.a(this.a(), $$1, $$2).a()) {
            csw $$7 = new csw($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bpp a(bpp $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public bpp b(bpp $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public ciu a(final cwy $$0) {
      return new ciu(this.a(), ib.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return $$0 == cwy.d;
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
   public apg c() {
      apu $$0 = apu.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      apg $$1 = new apg(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      us $$2 = new us(yc.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new ib($$0, $$1, $$2));
   }

   public void e(ib $$0) {
      this.a(dae.dw, $$0);
      ib $$1 = this.j($$0);
      dnb $$2 = this.a().a_($$1);
      deo $$3 = (deo)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(ib $$0, long $$1) {
      this.a($$0, dae.ha);
      this.b($$1, () -> this.a($$0, dae.a));
   }

   public void f(ib $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dac $$3) {
      this.a(new ib($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dnb $$3) {
      this.a(new ib($$0, $$1, $$2), $$3);
   }

   public void a(ib $$0, dac $$1) {
      this.a($$0, $$1.o());
   }

   public void a(ib $$0, dnb $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dac $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ib($$1, $$2, $$3));
   }

   public void a(dac $$0, ib $$1) {
      dnb $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dac $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ib($$1, $$2, $$3));
   }

   public void b(dac $$0, ib $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dac $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ib($$1, $$2, $$3));
   }

   public void c(dac $$0, ib $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ib $$0, Predicate<dac> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ib $$0, Predicate<dac> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ib $$0, doe<T> $$1, T $$2) {
      dnb $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new rp($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(ib $$0, doe<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ib $$0, Predicate<dnb> $$1, Supplier<String> $$2) {
      dnb $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new rp($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(ib $$0, ih $$1, IntPredicate $$2, Supplier<String> $$3) {
      ib $$4 = this.j($$0);
      apf $$5 = this.a();
      dnb $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new rp($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bpd<?> $$0) {
      List<? extends box> $$1 = this.a().a($$0, this.i(), box::bA);
      if ($$1.isEmpty()) {
         throw new ro("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bpd<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ib($$1, $$2, $$3));
   }

   public void c(bpd<?> $$0, ib $$1) {
      ib $$2 = this.j($$1);
      List<? extends box> $$3 = this.a().a($$0, new epo($$2), box::bA);
      if ($$3.isEmpty()) {
         throw new rp("Expected " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bpd<?> $$0, ept $$1, ept $$2) {
      List<? extends box> $$3 = this.a().a($$0, new epo($$1, $$2), box::bA);
      if ($$3.isEmpty()) {
         throw new rp("Expected " + $$0.i() + " between ", ib.a($$1), ib.a($$2), this.a.o());
      }
   }

   public void a(bpd<?> $$0, int $$1) {
      List<? extends box> $$2 = this.a().a($$0, this.i(), box::bA);
      if ($$2.size() != $$1) {
         throw new ro("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(bpd<?> $$0, ib $$1, int $$2, double $$3) {
      ib $$4 = this.j($$1);
      List<? extends box> $$5 = this.b((bpd<? extends box>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new rp("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bpd<?> $$0, ib $$1, double $$2) {
      List<? extends box> $$3 = this.b((bpd<? extends box>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ib $$4 = this.j($$1);
         throw new rp("Expected " + $$0.i(), $$4, $$1, this.a.o());
      }
   }

   public <T extends box> List<T> b(bpd<T> $$0, ib $$1, double $$2) {
      ib $$3 = this.j($$1);
      return this.a().a($$0, new epo($$3).g($$2), box::bA);
   }

   public <T extends box> List<T> c(bpd<T> $$0) {
      return this.a().a($$0, this.i(), box::bA);
   }

   public void a(box $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ib($$1, $$2, $$3));
   }

   public void a(box $$0, ib $$1) {
      ib $$2 = this.j($$1);
      List<? extends box> $$3 = this.a().a($$0.ai(), new epo($$2), box::bA);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new rp("Expected " + $$0.ai().i(), $$2, $$1, this.a.o()));
   }

   public void a(cqh $$0, ib $$1, double $$2, int $$3) {
      ib $$4 = this.j($$1);
      List<cfe> $$5 = this.a().a(bpd.ah, new epo($$4).g($$2), box::bA);
      int $$6 = 0;

      for (cfe $$7 : $$5) {
         cqm $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw new rp("Expected " + $$3 + " " + $$0.q().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cqh $$0, ib $$1, double $$2) {
      ib $$3 = this.j($$1);

      for (box $$5 : this.a().a(bpd.ah, new epo($$3).g($$2), box::bA)) {
         cfe $$6 = (cfe)$$5;
         if ($$6.p().d().equals($$0)) {
            return;
         }
      }

      throw new rp("Expected " + $$0.q().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cqh $$0, ib $$1, double $$2) {
      ib $$3 = this.j($$1);

      for (box $$5 : this.a().a(bpd.ah, new epo($$3).g($$2), box::bA)) {
         cfe $$6 = (cfe)$$5;
         if ($$6.p().d().equals($$0)) {
            throw new rp("Did not expect " + $$0.q().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cqh $$0) {
      for (box $$2 : this.a().a(bpd.ah, this.i(), box::bA)) {
         cfe $$3 = (cfe)$$2;
         if ($$3.p().d().equals($$0)) {
            return;
         }
      }

      throw new ro("Expected " + $$0.q().getString() + " item");
   }

   public void b(cqh $$0) {
      for (box $$2 : this.a().a(bpd.ah, this.i(), box::bA)) {
         cfe $$3 = (cfe)$$2;
         if ($$3.p().d().equals($$0)) {
            throw new ro("Did not expect " + $$0.q().getString() + " item");
         }
      }
   }

   public void d(bpd<?> $$0) {
      List<? extends box> $$1 = this.a().a($$0, this.i(), box::bA);
      if (!$$1.isEmpty()) {
         throw new ro("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bpd<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ib($$1, $$2, $$3));
   }

   public void d(bpd<?> $$0, ib $$1) {
      ib $$2 = this.j($$1);
      List<? extends box> $$3 = this.a().a($$0, new epo($$2), box::bA);
      if (!$$3.isEmpty()) {
         throw new rp("Did not expect " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bpd<?> $$0, double $$1, double $$2, double $$3) {
      ept $$4 = new ept($$1, $$2, $$3);
      ept $$5 = this.a($$4);
      Predicate<? super box> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends box> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new ro("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bpd<?> $$0, double $$1, double $$2, double $$3) {
      ept $$4 = new ept($$1, $$2, $$3);
      ept $$5 = this.a($$4);
      Predicate<? super box> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends box> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new ro("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends box, T> void a(ib $$0, bpd<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ib $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new epo($$4), box::bA);
      if ($$5.isEmpty()) {
         throw new rp("Expected " + $$1.i(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new ro("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new ro("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bpp> void a(ib $$0, bpd<E> $$1, cqh $$2) {
      ib $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new epo($$3), box::bA);
      if ($$4.isEmpty()) {
         throw new rp("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new rp("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends box & cif> void b(ib $$0, bpd<E> $$1, cqh $$2) {
      ib $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new epo($$3), $$0x -> ((box)$$0x).bA());
      if ($$4.isEmpty()) {
         throw new rp("Expected " + $$1.i() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new rp("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(ib $$0) {
      ib $$1 = this.j($$0);
      dki $$2 = this.a().c_($$1);
      if ($$2 instanceof dkc && !((dkc)$$2).ai_()) {
         throw new ro("Container should be empty");
      }
   }

   public void a(ib $$0, cqh $$1) {
      ib $$2 = this.j($$0);
      dki $$3 = this.a().c_($$2);
      if (!($$3 instanceof dkc)) {
         throw new ro("Expected a container at " + $$0 + ", found " + ki.k.b($$3.r()));
      } else if (((dkc)$$3).a_($$1) != 1) {
         throw new ro("Container should contain: " + $$1);
      }
   }

   public void a(ecw $$0, ib $$1) {
      ib.a($$0).forEach($$2 -> {
         ib $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(ib $$0, ib $$1) {
      dnb $$2 = this.a($$0);
      dnb $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ib $$1, cqh $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ib $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends box, T> void b(ib $$0, bpd<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends box> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new ro("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends box, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new ro("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bpp $$0, il<boi> $$1, int $$2) {
      bok $$3 = $$0.c($$1);
      if ($$3 == null || $$3.d() != $$2) {
         int $$4 = $$2 + 1;
         throw new ro("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bpd<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ib($$1, $$2, $$3));
   }

   public void e(bpd<?> $$0, ib $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bpd<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ib($$1, $$2, $$3));
   }

   public void f(bpd<?> $$0, ib $$1) {
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
      apf $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(ib $$0) {
      ib $$1 = this.j($$0);
      apf $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      epo $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new ib($$4, $$3, $$5));
         }
      }
   }

   public int a(dso.a $$0, int $$1, int $$2) {
      ib $$3 = this.j(new ib($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ib $$1) {
      throw new rp($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, box $$1) {
      throw new rp($$0, $$1.dm(), this.k($$1.dm()), this.h());
   }

   public void a(String $$0) {
      throw new ro($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new ro("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public sa g() {
      return this.a.p();
   }

   public ib j(ib $$0) {
      ib $$1 = this.a.c();
      ib $$2 = $$1.a((jg)$$0);
      return ehe.a($$2, dey.a, this.a.t(), $$1);
   }

   public ib k(ib $$0) {
      ib $$1 = this.a.c();
      dgo $$2 = this.a.t().a(dgo.c);
      ib $$3 = ehe.a($$0, dey.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ept a(ept $$0) {
      ept $$1 = ept.a(this.a.c());
      return ehe.a($$1.e($$0), dey.a, this.a.t(), this.a.c());
   }

   public ept b(ept $$0) {
      ept $$1 = ept.a(this.a.c());
      return ehe.a($$0.d($$1), dey.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new ro($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new ro("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new ro($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public epo i() {
      return this.a.d();
   }

   private epo k() {
      epo $$0 = this.a.d();
      return $$0.a(ib.c.b(this.j(ib.c)));
   }

   public void a(Consumer<ib> $$0) {
      epo $$1 = this.k().a(1.0, 1.0, 1.0);
      ib.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(ciu $$0, cqm $$1, ib $$2, ih $$3) {
      ib $$4 = this.j($$2.a($$3));
      epp $$5 = new epp(ept.b($$4), $$3, $$4, false);
      csw $$6 = new csw($$0, bnc.a, $$5);
      $$1.a($$6);
   }

   public void a(ajg<cya> $$0) {
      epo $$1 = this.i();
      ib $$2 = ib.a($$1.a, $$1.b, $$1.c);
      ib $$3 = ib.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = alj.a(this.a(), $$2, $$3, this.a().H_().d(kj.au).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
