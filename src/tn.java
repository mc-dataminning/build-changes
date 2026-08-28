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

public class tn {
   private final to a;
   private boolean b;

   public tn(to $$0) {
      this.a = $$0;
   }

   public arf a() {
      return this.a.f();
   }

   public dse a(iz $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dpj b(iz $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(bsw.class);
   }

   public void a(Class $$0) {
      evo $$1 = this.i();
      List<bsw> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cmz));
      $$2.forEach(bsw::an);
   }

   public cjj a(cum $$0, evt $$1) {
      arf $$2 = this.a();
      evt $$3 = this.a($$1);
      cjj $$4 = new cjj($$2, $$3.c, $$3.d, $$3.e, new cur($$0, 1));
      $$4.o(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cjj a(cum $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new evt((double)$$1, (double)$$2, (double)$$3));
   }

   public cjj a(cum $$0, iz $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bsw> E a(btc<E> $$0, iz $$1) {
      return this.a($$0, evt.c($$1));
   }

   public <E extends bsw> E a(btc<E> $$0, evt $$1) {
      arf $$2 = this.a();
      E $$3 = $$0.a((dca)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof btt $$4) {
            $$4.fU();
         }

         evt $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dF(), $$3.dH());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bsw> E a(btc<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bsw> E a(btc<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new tg("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new tg("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         evt $$6 = this.a(new evt((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dn().f($$6);
            double $$4x = $$2x.dn().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bsw> List<E> b(btc<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, evt.c(new iz($$1, $$2, $$3)), $$4);
   }

   public <E extends bsw> List<E> a(btc<E> $$0, evt $$1, double $$2) {
      arf $$3 = this.a();
      evt $$4 = this.a($$1);
      evo $$5 = this.a.d();
      evo $$6 = new evo($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cK().c($$6) && $$1x.bD());
   }

   public <E extends bsw> E a(btc<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new iz($$1, $$2, $$3));
   }

   public <E extends bsw> E a(btc<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new evt((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends btt> E b(btc<E> $$0, iz $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends btt> E b(btc<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new iz($$1, $$2, $$3));
   }

   public <E extends btt> E b(btc<E> $$0, evt $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends btt> E b(btc<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new evt((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(btt $$0, float $$1, float $$2, float $$3) {
      evt $$4 = this.a(new evt((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dF(), $$0.dH());
   }

   public ts a(btt $$0, iz $$1, float $$2) {
      return this.g().a(2, () -> {
         eol $$3 = $$0.K().a(this.j($$1), 0);
         $$0.K().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new iz($$0, $$1, $$2));
   }

   public void c(iz $$0) {
      this.b($$0, $$0x -> $$0x.a(awp.f), () -> "Expected button");
      iz $$1 = this.j($$0);
      dse $$2 = this.a().a_($$1);
      dfl $$3 = (dfl)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(iz $$0) {
      this.a($$0, this.a(dbx.b));
   }

   public void a(iz $$0, cmz $$1) {
      iz $$2 = this.j($$0);
      this.a($$0, $$1, new evp(evt.b($$2), je.c, $$2, true));
   }

   public void a(iz $$0, cmz $$1, evp $$2) {
      iz $$3 = this.j($$0);
      dse $$4 = this.a().a_($$3);
      bqv $$5 = bqv.a;
      bqy $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bqy.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cye $$7 = new cye($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public btr a(btr $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public btr b(btr $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public cmz a(final dbx $$0) {
      return new cmz(this.a(), iz.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return $$0 == dbx.d;
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
   public arg c() {
      aru $$0 = aru.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      arg $$1 = new arg(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      wk $$2 = new wk(zx.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new iz($$0, $$1, $$2));
   }

   public void e(iz $$0) {
      this.a(dfd.dw, $$0);
      iz $$1 = this.j($$0);
      dse $$2 = this.a().a_($$1);
      djo $$3 = (djo)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(iz $$0, long $$1) {
      this.a($$0, dfd.ha);
      this.b($$1, () -> this.a($$0, dfd.a));
   }

   public void f(iz $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dfb $$3) {
      this.a(new iz($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dse $$3) {
      this.a(new iz($$0, $$1, $$2), $$3);
   }

   public void a(iz $$0, dfb $$1) {
      this.a($$0, $$1.o());
   }

   public void a(iz $$0, dse $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dfb $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iz($$1, $$2, $$3));
   }

   public void a(dfb $$0, iz $$1) {
      dse $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dfb $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new iz($$1, $$2, $$3));
   }

   public void b(dfb $$0, iz $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dfb $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iz($$1, $$2, $$3));
   }

   public void c(dfb $$0, iz $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(iz $$0, Predicate<dfb> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(iz $$0, Predicate<dfb> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(iz $$0, dth<T> $$1, T $$2) {
      dse $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new th($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(iz $$0, dth<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(iz $$0, Predicate<dse> $$1, Supplier<String> $$2) {
      dse $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new th($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(iz $$0, je $$1, IntPredicate $$2, Supplier<String> $$3) {
      iz $$4 = this.j($$0);
      arf $$5 = this.a();
      dse $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new th($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(btc<?> $$0) {
      List<? extends bsw> $$1 = this.a().a($$0, this.i(), bsw::bD);
      if ($$1.isEmpty()) {
         throw new tg("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(btc<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iz($$1, $$2, $$3));
   }

   public void c(btc<?> $$0, iz $$1) {
      iz $$2 = this.j($$1);
      List<? extends bsw> $$3 = this.a().a($$0, new evo($$2), bsw::bD);
      if ($$3.isEmpty()) {
         throw new th("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(btc<?> $$0, evt $$1, evt $$2) {
      List<? extends bsw> $$3 = this.a().a($$0, new evo($$1, $$2), bsw::bD);
      if ($$3.isEmpty()) {
         throw new th("Expected " + $$0.j() + " between ", iz.a($$1), iz.a($$2), this.a.o());
      }
   }

   public void a(btc<?> $$0, int $$1) {
      List<? extends bsw> $$2 = this.a().a($$0, this.i(), bsw::bD);
      if ($$2.size() != $$1) {
         throw new tg("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(btc<?> $$0, iz $$1, int $$2, double $$3) {
      iz $$4 = this.j($$1);
      List<? extends bsw> $$5 = this.b((btc<? extends bsw>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new th("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(btc<?> $$0, iz $$1, double $$2) {
      List<? extends bsw> $$3 = this.b((btc<? extends bsw>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         iz $$4 = this.j($$1);
         throw new th("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bsw> List<T> b(btc<T> $$0, iz $$1, double $$2) {
      iz $$3 = this.j($$1);
      return this.a().a($$0, new evo($$3).g($$2), bsw::bD);
   }

   public <T extends bsw> List<T> c(btc<T> $$0) {
      return this.a().a($$0, this.i(), bsw::bD);
   }

   public void a(bsw $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iz($$1, $$2, $$3));
   }

   public void a(bsw $$0, iz $$1) {
      iz $$2 = this.j($$1);
      List<? extends bsw> $$3 = this.a().a($$0.ak(), new evo($$2), bsw::bD);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new th("Expected " + $$0.ak().j(), $$2, $$1, this.a.o()));
   }

   public void a(cum $$0, iz $$1, double $$2, int $$3) {
      iz $$4 = this.j($$1);
      List<cjj> $$5 = this.a().a(btc.ag, new evo($$4).g($$2), bsw::bD);
      int $$6 = 0;

      for (cjj $$7 : $$5) {
         cur $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.I();
         }
      }

      if ($$6 != $$3) {
         throw new th("Expected " + $$3 + " " + $$0.s().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cum $$0, iz $$1, double $$2) {
      iz $$3 = this.j($$1);

      for (bsw $$5 : this.a().a(btc.ag, new evo($$3).g($$2), bsw::bD)) {
         cjj $$6 = (cjj)$$5;
         if ($$6.p().g().equals($$0)) {
            return;
         }
      }

      throw new th("Expected " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cum $$0, iz $$1, double $$2) {
      iz $$3 = this.j($$1);

      for (bsw $$5 : this.a().a(btc.ag, new evo($$3).g($$2), bsw::bD)) {
         cjj $$6 = (cjj)$$5;
         if ($$6.p().g().equals($$0)) {
            throw new th("Did not expect " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cum $$0) {
      for (bsw $$2 : this.a().a(btc.ag, this.i(), bsw::bD)) {
         cjj $$3 = (cjj)$$2;
         if ($$3.p().g().equals($$0)) {
            return;
         }
      }

      throw new tg("Expected " + $$0.s().getString() + " item");
   }

   public void b(cum $$0) {
      for (bsw $$2 : this.a().a(btc.ag, this.i(), bsw::bD)) {
         cjj $$3 = (cjj)$$2;
         if ($$3.p().g().equals($$0)) {
            throw new tg("Did not expect " + $$0.s().getString() + " item");
         }
      }
   }

   public void d(btc<?> $$0) {
      List<? extends bsw> $$1 = this.a().a($$0, this.i(), bsw::bD);
      if (!$$1.isEmpty()) {
         throw new tg("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(btc<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new iz($$1, $$2, $$3));
   }

   public void d(btc<?> $$0, iz $$1) {
      iz $$2 = this.j($$1);
      List<? extends bsw> $$3 = this.a().a($$0, new evo($$2), bsw::bD);
      if (!$$3.isEmpty()) {
         throw new th("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void b(btc<?> $$0, evt $$1, evt $$2) {
      List<? extends bsw> $$3 = this.a().a($$0, new evo($$1, $$2), bsw::bD);
      if (!$$3.isEmpty()) {
         throw new th("Did not expect " + $$0.j() + " between ", iz.a($$1), iz.a($$2), this.a.o());
      }
   }

   public void a(btc<?> $$0, double $$1, double $$2, double $$3) {
      evt $$4 = new evt($$1, $$2, $$3);
      evt $$5 = this.a($$4);
      Predicate<? super bsw> $$6 = $$1x -> $$1x.cK().a($$5, $$5);
      List<? extends bsw> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new tg("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(btc<?> $$0, double $$1, double $$2, double $$3) {
      evt $$4 = new evt($$1, $$2, $$3);
      evt $$5 = this.a($$4);
      Predicate<? super bsw> $$6 = $$1x -> !$$1x.cK().a($$5, $$5);
      List<? extends bsw> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new tg("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bsw, T> void a(iz $$0, btc<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      iz $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new evo($$4), bsw::bD);
      if ($$5.isEmpty()) {
         throw new th("Expected " + $$1.j(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new tg("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new tg("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends btr> void a(iz $$0, btc<E> $$1, cum $$2) {
      iz $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new evo($$3), bsw::bD);
      if ($$4.isEmpty()) {
         throw new th("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new th("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends bsw & cmk> void b(iz $$0, btc<E> $$1, cum $$2) {
      iz $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new evo($$3), $$0x -> ((bsw)$$0x).bD());
      if ($$4.isEmpty()) {
         throw new th("Expected " + $$1.j() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new th("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(iz $$0) {
      iz $$1 = this.j($$0);
      dpj $$2 = this.a().c_($$1);
      if ($$2 instanceof dpd && !((dpd)$$2).c()) {
         throw new tg("Container should be empty");
      }
   }

   public void a(iz $$0, cum $$1) {
      iz $$2 = this.j($$0);
      dpj $$3 = this.a().c_($$2);
      if (!($$3 instanceof dpd)) {
         throw new tg("Expected a container at " + $$0 + ", found " + lp.k.b($$3.r()));
      } else if (((dpd)$$3).a_($$1) != 1) {
         throw new tg("Container should contain: " + $$1);
      }
   }

   public void a(eie $$0, iz $$1) {
      iz.a($$0).forEach($$2 -> {
         iz $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(iz $$0, iz $$1) {
      dse $$2 = this.a($$0);
      dse $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, iz $$1, cum $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, iz $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bsw, T> void b(iz $$0, btc<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bsw> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new tg("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bsw, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new tg("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(btr $$0, ji<bsc> $$1, int $$2) {
      bse $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new tg("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(btc<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new iz($$1, $$2, $$3));
   }

   public void e(btc<?> $$0, iz $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(btc<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new iz($$1, $$2, $$3));
   }

   public void f(btc<?> $$0, iz $$1) {
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

   public void h(iz $$0) {
      iz $$1 = this.j($$0);
      arf $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(iz $$0) {
      iz $$1 = this.j($$0);
      arf $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      evo $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new iz($$4, $$3, $$5));
         }
      }
   }

   public int a(dxw.a $$0, int $$1, int $$2) {
      iz $$3 = this.j(new iz($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, iz $$1) {
      throw new th($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, bsw $$1) {
      throw new th($$0, $$1.dp(), this.k($$1.dp()), this.h());
   }

   public void a(String $$0) {
      throw new tg($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new tg("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public ts g() {
      return this.a.p();
   }

   public iz j(iz $$0) {
      iz $$1 = this.a.c();
      iz $$2 = $$1.a((kd)$$0);
      return emm.a($$2, djy.a, this.a.t(), $$1);
   }

   public iz k(iz $$0) {
      iz $$1 = this.a.c();
      dlo $$2 = this.a.t().a(dlo.c);
      iz $$3 = emm.a($$0, djy.a, $$2, $$1);
      return $$3.b($$1);
   }

   public evt a(evt $$0) {
      evt $$1 = evt.a(this.a.c());
      return emm.a($$1.e($$0), djy.a, this.a.t(), this.a.c());
   }

   public evt b(evt $$0) {
      evt $$1 = evt.a(this.a.c());
      return emm.a($$0.d($$1), djy.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new tg($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new tg("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new tg($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public evo i() {
      return this.a.d();
   }

   private evo k() {
      evo $$0 = this.a.d();
      return $$0.a(iz.c.b(this.j(iz.c)));
   }

   public void a(Consumer<iz> $$0) {
      evo $$1 = this.k().a(1.0, 1.0, 1.0);
      iz.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cmz $$0, cur $$1, iz $$2, je $$3) {
      iz $$4 = this.j($$2.a($$3));
      evp $$5 = new evp(evt.b($$4), $$3, $$4, false);
      cye $$6 = new cye($$0, bqv.a, $$5);
      $$1.a($$6);
   }

   public void a(ale<dcz> $$0) {
      evo $$1 = this.i();
      iz $$2 = iz.a($$1.a, $$1.b, $$1.c);
      iz $$3 = iz.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ani.a(this.a(), $$2, $$3, this.a().H_().d(lq.az).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
