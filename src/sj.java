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

public class sj {
   private final sk a;
   private boolean b;

   public sj(sk $$0) {
      this.a = $$0;
   }

   public apu a() {
      return this.a.f();
   }

   public dpi a(id $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dmo b(id $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(bqa.class);
   }

   public void a(Class $$0) {
      ese $$1 = this.i();
      List<bqa> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cka));
      $$2.forEach(bqa::al);
   }

   public cgk a(crn $$0, esj $$1) {
      apu $$2 = this.a();
      esj $$3 = this.a($$1);
      cgk $$4 = new cgk($$2, $$3.c, $$3.d, $$3.e, new crs($$0, 1));
      $$4.o(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cgk a(crn $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new esj((double)$$1, (double)$$2, (double)$$3));
   }

   public cgk a(crn $$0, id $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bqa> E a(bqg<E> $$0, id $$1) {
      return this.a($$0, esj.c($$1));
   }

   public <E extends bqa> E a(bqg<E> $$0, esj $$1) {
      apu $$2 = this.a();
      E $$3 = $$0.a((czg)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bqv $$4) {
            $$4.fS();
         }

         esj $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dC(), $$3.dE());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bqa> E a(bqg<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bqa> E a(bqg<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sc("Expected " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sc("Expected only one " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         esj $$6 = this.a(new esj((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dk().f($$6);
            double $$4x = $$2x.dk().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bqa> List<E> b(bqg<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, esj.c(new id($$1, $$2, $$3)), $$4);
   }

   public <E extends bqa> List<E> a(bqg<E> $$0, esj $$1, double $$2) {
      apu $$3 = this.a();
      esj $$4 = this.a($$1);
      ese $$5 = this.a.d();
      ese $$6 = new ese($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cH().c($$6) && $$1x.bA());
   }

   public <E extends bqa> E a(bqg<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new id($$1, $$2, $$3));
   }

   public <E extends bqa> E a(bqg<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new esj((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bqv> E b(bqg<E> $$0, id $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gi();
      return $$2;
   }

   public <E extends bqv> E b(bqg<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new id($$1, $$2, $$3));
   }

   public <E extends bqv> E b(bqg<E> $$0, esj $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gi();
      return $$2;
   }

   public <E extends bqv> E b(bqg<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new esj((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bqv $$0, float $$1, float $$2, float $$3) {
      esj $$4 = this.a(new esj((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dC(), $$0.dE());
   }

   public so a(bqv $$0, id $$1, float $$2) {
      return this.g().a(2, () -> {
         elp $$3 = $$0.K().a(this.j($$1), 0);
         $$0.K().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new id($$0, $$1, $$2));
   }

   public void c(id $$0) {
      this.b($$0, $$0x -> $$0x.a(ave.f), () -> "Expected button");
      id $$1 = this.j($$0);
      dpi $$2 = this.a().a_($$1);
      dcr $$3 = (dcr)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(id $$0) {
      this.a($$0, this.a(czd.b));
   }

   public void a(id $$0, cka $$1) {
      id $$2 = this.j($$0);
      this.a($$0, $$1, new esf(esj.b($$2), ij.c, $$2, true));
   }

   public void a(id $$0, cka $$1, esf $$2) {
      id $$3 = this.j($$0);
      dpi $$4 = this.a().a_($$3);
      boe $$5 = boe.a;
      boh $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != boh.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cuz $$7 = new cuz($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bqt a(bqt $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public bqt b(bqt $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public cka a(final czd $$0) {
      return new cka(this.a(), id.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return $$0 == czd.d;
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
   public apv c() {
      aqj $$0 = aqj.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      apv $$1 = new apv(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      vg $$2 = new vg(yq.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new id($$0, $$1, $$2));
   }

   public void e(id $$0) {
      this.a(dcj.dw, $$0);
      id $$1 = this.j($$0);
      dpi $$2 = this.a().a_($$1);
      dgt $$3 = (dgt)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(id $$0, long $$1) {
      this.a($$0, dcj.ha);
      this.b($$1, () -> this.a($$0, dcj.a));
   }

   public void f(id $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dch $$3) {
      this.a(new id($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dpi $$3) {
      this.a(new id($$0, $$1, $$2), $$3);
   }

   public void a(id $$0, dch $$1) {
      this.a($$0, $$1.n());
   }

   public void a(id $$0, dpi $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dch $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new id($$1, $$2, $$3));
   }

   public void a(dch $$0, id $$1) {
      dpi $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dch $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new id($$1, $$2, $$3));
   }

   public void b(dch $$0, id $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dch $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new id($$1, $$2, $$3));
   }

   public void c(dch $$0, id $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(id $$0, Predicate<dch> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(id $$0, Predicate<dch> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(id $$0, dql<T> $$1, T $$2) {
      dpi $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sd($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(id $$0, dql<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(id $$0, Predicate<dpi> $$1, Supplier<String> $$2) {
      dpi $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sd($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(id $$0, ij $$1, IntPredicate $$2, Supplier<String> $$3) {
      id $$4 = this.j($$0);
      apu $$5 = this.a();
      dpi $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sd($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bqg<?> $$0) {
      List<? extends bqa> $$1 = this.a().a($$0, this.i(), bqa::bA);
      if ($$1.isEmpty()) {
         throw new sc("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bqg<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new id($$1, $$2, $$3));
   }

   public void c(bqg<?> $$0, id $$1) {
      id $$2 = this.j($$1);
      List<? extends bqa> $$3 = this.a().a($$0, new ese($$2), bqa::bA);
      if ($$3.isEmpty()) {
         throw new sd("Expected " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bqg<?> $$0, esj $$1, esj $$2) {
      List<? extends bqa> $$3 = this.a().a($$0, new ese($$1, $$2), bqa::bA);
      if ($$3.isEmpty()) {
         throw new sd("Expected " + $$0.i() + " between ", id.a($$1), id.a($$2), this.a.o());
      }
   }

   public void a(bqg<?> $$0, int $$1) {
      List<? extends bqa> $$2 = this.a().a($$0, this.i(), bqa::bA);
      if ($$2.size() != $$1) {
         throw new sc("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(bqg<?> $$0, id $$1, int $$2, double $$3) {
      id $$4 = this.j($$1);
      List<? extends bqa> $$5 = this.b((bqg<? extends bqa>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sd("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bqg<?> $$0, id $$1, double $$2) {
      List<? extends bqa> $$3 = this.b((bqg<? extends bqa>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         id $$4 = this.j($$1);
         throw new sd("Expected " + $$0.i(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bqa> List<T> b(bqg<T> $$0, id $$1, double $$2) {
      id $$3 = this.j($$1);
      return this.a().a($$0, new ese($$3).g($$2), bqa::bA);
   }

   public <T extends bqa> List<T> c(bqg<T> $$0) {
      return this.a().a($$0, this.i(), bqa::bA);
   }

   public void a(bqa $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new id($$1, $$2, $$3));
   }

   public void a(bqa $$0, id $$1) {
      id $$2 = this.j($$1);
      List<? extends bqa> $$3 = this.a().a($$0.ai(), new ese($$2), bqa::bA);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sd("Expected " + $$0.ai().i(), $$2, $$1, this.a.o()));
   }

   public void a(crn $$0, id $$1, double $$2, int $$3) {
      id $$4 = this.j($$1);
      List<cgk> $$5 = this.a().a(bqg.ag, new ese($$4).g($$2), bqa::bA);
      int $$6 = 0;

      for (cgk $$7 : $$5) {
         crs $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.G();
         }
      }

      if ($$6 != $$3) {
         throw new sd("Expected " + $$3 + " " + $$0.t().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(crn $$0, id $$1, double $$2) {
      id $$3 = this.j($$1);

      for (bqa $$5 : this.a().a(bqg.ag, new ese($$3).g($$2), bqa::bA)) {
         cgk $$6 = (cgk)$$5;
         if ($$6.p().f().equals($$0)) {
            return;
         }
      }

      throw new sd("Expected " + $$0.t().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(crn $$0, id $$1, double $$2) {
      id $$3 = this.j($$1);

      for (bqa $$5 : this.a().a(bqg.ag, new ese($$3).g($$2), bqa::bA)) {
         cgk $$6 = (cgk)$$5;
         if ($$6.p().f().equals($$0)) {
            throw new sd("Did not expect " + $$0.t().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(crn $$0) {
      for (bqa $$2 : this.a().a(bqg.ag, this.i(), bqa::bA)) {
         cgk $$3 = (cgk)$$2;
         if ($$3.p().f().equals($$0)) {
            return;
         }
      }

      throw new sc("Expected " + $$0.t().getString() + " item");
   }

   public void b(crn $$0) {
      for (bqa $$2 : this.a().a(bqg.ag, this.i(), bqa::bA)) {
         cgk $$3 = (cgk)$$2;
         if ($$3.p().f().equals($$0)) {
            throw new sc("Did not expect " + $$0.t().getString() + " item");
         }
      }
   }

   public void d(bqg<?> $$0) {
      List<? extends bqa> $$1 = this.a().a($$0, this.i(), bqa::bA);
      if (!$$1.isEmpty()) {
         throw new sc("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bqg<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new id($$1, $$2, $$3));
   }

   public void d(bqg<?> $$0, id $$1) {
      id $$2 = this.j($$1);
      List<? extends bqa> $$3 = this.a().a($$0, new ese($$2), bqa::bA);
      if (!$$3.isEmpty()) {
         throw new sd("Did not expect " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bqg<?> $$0, double $$1, double $$2, double $$3) {
      esj $$4 = new esj($$1, $$2, $$3);
      esj $$5 = this.a($$4);
      Predicate<? super bqa> $$6 = $$1x -> $$1x.cH().a($$5, $$5);
      List<? extends bqa> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sc("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bqg<?> $$0, double $$1, double $$2, double $$3) {
      esj $$4 = new esj($$1, $$2, $$3);
      esj $$5 = this.a($$4);
      Predicate<? super bqa> $$6 = $$1x -> !$$1x.cH().a($$5, $$5);
      List<? extends bqa> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sc("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bqa, T> void a(id $$0, bqg<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      id $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ese($$4), bqa::bA);
      if ($$5.isEmpty()) {
         throw new sd("Expected " + $$1.i(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new sc("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new sc("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bqt> void a(id $$0, bqg<E> $$1, crn $$2) {
      id $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ese($$3), bqa::bA);
      if ($$4.isEmpty()) {
         throw new sd("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sd("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends bqa & cjl> void b(id $$0, bqg<E> $$1, crn $$2) {
      id $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ese($$3), $$0x -> ((bqa)$$0x).bA());
      if ($$4.isEmpty()) {
         throw new sd("Expected " + $$1.i() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sd("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(id $$0) {
      id $$1 = this.j($$0);
      dmo $$2 = this.a().c_($$1);
      if ($$2 instanceof dmi && !((dmi)$$2).c()) {
         throw new sc("Container should be empty");
      }
   }

   public void a(id $$0, crn $$1) {
      id $$2 = this.j($$0);
      dmo $$3 = this.a().c_($$2);
      if (!($$3 instanceof dmi)) {
         throw new sc("Expected a container at " + $$0 + ", found " + kt.k.b($$3.r()));
      } else if (((dmi)$$3).a_($$1) != 1) {
         throw new sc("Container should contain: " + $$1);
      }
   }

   public void a(efi $$0, id $$1) {
      id.a($$0).forEach($$2 -> {
         id $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(id $$0, id $$1) {
      dpi $$2 = this.a($$0);
      dpi $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, id $$1, crn $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, id $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bqa, T> void b(id $$0, bqg<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bqa> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sc("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bqa, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sc("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bqt $$0, in<bpk> $$1, int $$2) {
      bpm $$3 = $$0.c($$1);
      if ($$3 == null || $$3.d() != $$2) {
         int $$4 = $$2 + 1;
         throw new sc("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bqg<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new id($$1, $$2, $$3));
   }

   public void e(bqg<?> $$0, id $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bqg<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new id($$1, $$2, $$3));
   }

   public void f(bqg<?> $$0, id $$1) {
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

   public void h(id $$0) {
      id $$1 = this.j($$0);
      apu $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(id $$0) {
      id $$1 = this.j($$0);
      apu $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ese $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new id($$4, $$3, $$5));
         }
      }
   }

   public int a(dva.a $$0, int $$1, int $$2) {
      id $$3 = this.j(new id($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, id $$1) {
      throw new sd($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, bqa $$1) {
      throw new sd($$0, $$1.dm(), this.k($$1.dm()), this.h());
   }

   public void a(String $$0) {
      throw new sc($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new sc("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public so g() {
      return this.a.p();
   }

   public id j(id $$0) {
      id $$1 = this.a.c();
      id $$2 = $$1.a((ji)$$0);
      return ejq.a($$2, dhd.a, this.a.t(), $$1);
   }

   public id k(id $$0) {
      id $$1 = this.a.c();
      dit $$2 = this.a.t().a(dit.c);
      id $$3 = ejq.a($$0, dhd.a, $$2, $$1);
      return $$3.b($$1);
   }

   public esj a(esj $$0) {
      esj $$1 = esj.a(this.a.c());
      return ejq.a($$1.e($$0), dhd.a, this.a.t(), this.a.c());
   }

   public esj b(esj $$0) {
      esj $$1 = esj.a(this.a.c());
      return ejq.a($$0.d($$1), dhd.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sc($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sc("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sc($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public ese i() {
      return this.a.d();
   }

   private ese k() {
      ese $$0 = this.a.d();
      return $$0.a(id.c.b(this.j(id.c)));
   }

   public void a(Consumer<id> $$0) {
      ese $$1 = this.k().a(1.0, 1.0, 1.0);
      id.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cka $$0, crs $$1, id $$2, ij $$3) {
      id $$4 = this.j($$2.a($$3));
      esf $$5 = new esf(esj.b($$4), $$3, $$4, false);
      cuz $$6 = new cuz($$0, boe.a, $$5);
      $$1.a($$6);
   }

   public void a(aju<daf> $$0) {
      ese $$1 = this.i();
      id $$2 = id.a($$1.a, $$1.b, $$1.c);
      id $$3 = id.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = alx.a(this.a(), $$2, $$3, this.a().H_().d(ku.aw).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
