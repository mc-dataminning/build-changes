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

public class tm {
   private final tn a;
   private boolean b;

   public tm(tn $$0) {
      this.a = $$0;
   }

   public are a() {
      return this.a.f();
   }

   public dsb a(iz $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dpg b(iz $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(bst.class);
   }

   public void a(Class $$0) {
      evl $$1 = this.i();
      List<bst> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cmw));
      $$2.forEach(bst::an);
   }

   public cjg a(cuj $$0, evq $$1) {
      are $$2 = this.a();
      evq $$3 = this.a($$1);
      cjg $$4 = new cjg($$2, $$3.c, $$3.d, $$3.e, new cuo($$0, 1));
      $$4.o(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cjg a(cuj $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new evq((double)$$1, (double)$$2, (double)$$3));
   }

   public cjg a(cuj $$0, iz $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bst> E a(bsz<E> $$0, iz $$1) {
      return this.a($$0, evq.c($$1));
   }

   public <E extends bst> E a(bsz<E> $$0, evq $$1) {
      are $$2 = this.a();
      E $$3 = $$0.a((dbx)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof btq $$4) {
            $$4.fU();
         }

         evq $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dF(), $$3.dH());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bst> E a(bsz<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bst> E a(bsz<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new tf("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new tf("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         evq $$6 = this.a(new evq((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dn().f($$6);
            double $$4x = $$2x.dn().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bst> List<E> b(bsz<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, evq.c(new iz($$1, $$2, $$3)), $$4);
   }

   public <E extends bst> List<E> a(bsz<E> $$0, evq $$1, double $$2) {
      are $$3 = this.a();
      evq $$4 = this.a($$1);
      evl $$5 = this.a.d();
      evl $$6 = new evl($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cK().c($$6) && $$1x.bD());
   }

   public <E extends bst> E a(bsz<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new iz($$1, $$2, $$3));
   }

   public <E extends bst> E a(bsz<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new evq((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends btq> E b(bsz<E> $$0, iz $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends btq> E b(bsz<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new iz($$1, $$2, $$3));
   }

   public <E extends btq> E b(bsz<E> $$0, evq $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends btq> E b(bsz<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new evq((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(btq $$0, float $$1, float $$2, float $$3) {
      evq $$4 = this.a(new evq((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dF(), $$0.dH());
   }

   public tr a(btq $$0, iz $$1, float $$2) {
      return this.g().a(2, () -> {
         eoi $$3 = $$0.K().a(this.j($$1), 0);
         $$0.K().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new iz($$0, $$1, $$2));
   }

   public void c(iz $$0) {
      this.b($$0, $$0x -> $$0x.a(awo.f), () -> "Expected button");
      iz $$1 = this.j($$0);
      dsb $$2 = this.a().a_($$1);
      dfi $$3 = (dfi)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(iz $$0) {
      this.a($$0, this.a(dbu.b));
   }

   public void a(iz $$0, cmw $$1) {
      iz $$2 = this.j($$0);
      this.a($$0, $$1, new evm(evq.b($$2), je.c, $$2, true));
   }

   public void a(iz $$0, cmw $$1, evm $$2) {
      iz $$3 = this.j($$0);
      dsb $$4 = this.a().a_($$3);
      bqs $$5 = bqs.a;
      bqv $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bqv.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cyb $$7 = new cyb($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bto a(bto $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public bto b(bto $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public cmw a(final dbu $$0) {
      return new cmw(this.a(), iz.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return $$0 == dbu.d;
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
   public arf c() {
      art $$0 = art.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      arf $$1 = new arf(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      wj $$2 = new wj(zw.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new iz($$0, $$1, $$2));
   }

   public void e(iz $$0) {
      this.a(dfa.dw, $$0);
      iz $$1 = this.j($$0);
      dsb $$2 = this.a().a_($$1);
      djl $$3 = (djl)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(iz $$0, long $$1) {
      this.a($$0, dfa.ha);
      this.b($$1, () -> this.a($$0, dfa.a));
   }

   public void f(iz $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dey $$3) {
      this.a(new iz($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dsb $$3) {
      this.a(new iz($$0, $$1, $$2), $$3);
   }

   public void a(iz $$0, dey $$1) {
      this.a($$0, $$1.o());
   }

   public void a(iz $$0, dsb $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dey $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iz($$1, $$2, $$3));
   }

   public void a(dey $$0, iz $$1) {
      dsb $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dey $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new iz($$1, $$2, $$3));
   }

   public void b(dey $$0, iz $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dey $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iz($$1, $$2, $$3));
   }

   public void c(dey $$0, iz $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(iz $$0, Predicate<dey> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(iz $$0, Predicate<dey> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(iz $$0, dte<T> $$1, T $$2) {
      dsb $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new tg($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(iz $$0, dte<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(iz $$0, Predicate<dsb> $$1, Supplier<String> $$2) {
      dsb $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new tg($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(iz $$0, je $$1, IntPredicate $$2, Supplier<String> $$3) {
      iz $$4 = this.j($$0);
      are $$5 = this.a();
      dsb $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new tg($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bsz<?> $$0) {
      List<? extends bst> $$1 = this.a().a($$0, this.i(), bst::bD);
      if ($$1.isEmpty()) {
         throw new tf("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bsz<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iz($$1, $$2, $$3));
   }

   public void c(bsz<?> $$0, iz $$1) {
      iz $$2 = this.j($$1);
      List<? extends bst> $$3 = this.a().a($$0, new evl($$2), bst::bD);
      if ($$3.isEmpty()) {
         throw new tg("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(bsz<?> $$0, evq $$1, evq $$2) {
      List<? extends bst> $$3 = this.a().a($$0, new evl($$1, $$2), bst::bD);
      if ($$3.isEmpty()) {
         throw new tg("Expected " + $$0.j() + " between ", iz.a($$1), iz.a($$2), this.a.o());
      }
   }

   public void a(bsz<?> $$0, int $$1) {
      List<? extends bst> $$2 = this.a().a($$0, this.i(), bst::bD);
      if ($$2.size() != $$1) {
         throw new tf("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bsz<?> $$0, iz $$1, int $$2, double $$3) {
      iz $$4 = this.j($$1);
      List<? extends bst> $$5 = this.b((bsz<? extends bst>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new tg("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bsz<?> $$0, iz $$1, double $$2) {
      List<? extends bst> $$3 = this.b((bsz<? extends bst>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         iz $$4 = this.j($$1);
         throw new tg("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bst> List<T> b(bsz<T> $$0, iz $$1, double $$2) {
      iz $$3 = this.j($$1);
      return this.a().a($$0, new evl($$3).g($$2), bst::bD);
   }

   public <T extends bst> List<T> c(bsz<T> $$0) {
      return this.a().a($$0, this.i(), bst::bD);
   }

   public void a(bst $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iz($$1, $$2, $$3));
   }

   public void a(bst $$0, iz $$1) {
      iz $$2 = this.j($$1);
      List<? extends bst> $$3 = this.a().a($$0.ak(), new evl($$2), bst::bD);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new tg("Expected " + $$0.ak().j(), $$2, $$1, this.a.o()));
   }

   public void a(cuj $$0, iz $$1, double $$2, int $$3) {
      iz $$4 = this.j($$1);
      List<cjg> $$5 = this.a().a(bsz.ag, new evl($$4).g($$2), bst::bD);
      int $$6 = 0;

      for (cjg $$7 : $$5) {
         cuo $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.I();
         }
      }

      if ($$6 != $$3) {
         throw new tg("Expected " + $$3 + " " + $$0.s().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cuj $$0, iz $$1, double $$2) {
      iz $$3 = this.j($$1);

      for (bst $$5 : this.a().a(bsz.ag, new evl($$3).g($$2), bst::bD)) {
         cjg $$6 = (cjg)$$5;
         if ($$6.p().g().equals($$0)) {
            return;
         }
      }

      throw new tg("Expected " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cuj $$0, iz $$1, double $$2) {
      iz $$3 = this.j($$1);

      for (bst $$5 : this.a().a(bsz.ag, new evl($$3).g($$2), bst::bD)) {
         cjg $$6 = (cjg)$$5;
         if ($$6.p().g().equals($$0)) {
            throw new tg("Did not expect " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cuj $$0) {
      for (bst $$2 : this.a().a(bsz.ag, this.i(), bst::bD)) {
         cjg $$3 = (cjg)$$2;
         if ($$3.p().g().equals($$0)) {
            return;
         }
      }

      throw new tf("Expected " + $$0.s().getString() + " item");
   }

   public void b(cuj $$0) {
      for (bst $$2 : this.a().a(bsz.ag, this.i(), bst::bD)) {
         cjg $$3 = (cjg)$$2;
         if ($$3.p().g().equals($$0)) {
            throw new tf("Did not expect " + $$0.s().getString() + " item");
         }
      }
   }

   public void d(bsz<?> $$0) {
      List<? extends bst> $$1 = this.a().a($$0, this.i(), bst::bD);
      if (!$$1.isEmpty()) {
         throw new tf("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bsz<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new iz($$1, $$2, $$3));
   }

   public void d(bsz<?> $$0, iz $$1) {
      iz $$2 = this.j($$1);
      List<? extends bst> $$3 = this.a().a($$0, new evl($$2), bst::bD);
      if (!$$3.isEmpty()) {
         throw new tg("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void b(bsz<?> $$0, evq $$1, evq $$2) {
      List<? extends bst> $$3 = this.a().a($$0, new evl($$1, $$2), bst::bD);
      if (!$$3.isEmpty()) {
         throw new tg("Did not expect " + $$0.j() + " between ", iz.a($$1), iz.a($$2), this.a.o());
      }
   }

   public void a(bsz<?> $$0, double $$1, double $$2, double $$3) {
      evq $$4 = new evq($$1, $$2, $$3);
      evq $$5 = this.a($$4);
      Predicate<? super bst> $$6 = $$1x -> $$1x.cK().a($$5, $$5);
      List<? extends bst> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new tf("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bsz<?> $$0, double $$1, double $$2, double $$3) {
      evq $$4 = new evq($$1, $$2, $$3);
      evq $$5 = this.a($$4);
      Predicate<? super bst> $$6 = $$1x -> !$$1x.cK().a($$5, $$5);
      List<? extends bst> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new tf("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bst, T> void a(iz $$0, bsz<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      iz $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new evl($$4), bst::bD);
      if ($$5.isEmpty()) {
         throw new tg("Expected " + $$1.j(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new tf("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new tf("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bto> void a(iz $$0, bsz<E> $$1, cuj $$2) {
      iz $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new evl($$3), bst::bD);
      if ($$4.isEmpty()) {
         throw new tg("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new tg("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends bst & cmh> void b(iz $$0, bsz<E> $$1, cuj $$2) {
      iz $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new evl($$3), $$0x -> ((bst)$$0x).bD());
      if ($$4.isEmpty()) {
         throw new tg("Expected " + $$1.j() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new tg("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(iz $$0) {
      iz $$1 = this.j($$0);
      dpg $$2 = this.a().c_($$1);
      if ($$2 instanceof dpa && !((dpa)$$2).c()) {
         throw new tf("Container should be empty");
      }
   }

   public void a(iz $$0, cuj $$1) {
      iz $$2 = this.j($$0);
      dpg $$3 = this.a().c_($$2);
      if (!($$3 instanceof dpa)) {
         throw new tf("Expected a container at " + $$0 + ", found " + lp.k.b($$3.r()));
      } else if (((dpa)$$3).a_($$1) != 1) {
         throw new tf("Container should contain: " + $$1);
      }
   }

   public void a(eib $$0, iz $$1) {
      iz.a($$0).forEach($$2 -> {
         iz $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(iz $$0, iz $$1) {
      dsb $$2 = this.a($$0);
      dsb $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, iz $$1, cuj $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, iz $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bst, T> void b(iz $$0, bsz<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bst> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new tf("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bst, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new tf("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bto $$0, ji<brz> $$1, int $$2) {
      bsb $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new tf("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bsz<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new iz($$1, $$2, $$3));
   }

   public void e(bsz<?> $$0, iz $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bsz<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new iz($$1, $$2, $$3));
   }

   public void f(bsz<?> $$0, iz $$1) {
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
      are $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(iz $$0) {
      iz $$1 = this.j($$0);
      are $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      evl $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new iz($$4, $$3, $$5));
         }
      }
   }

   public int a(dxt.a $$0, int $$1, int $$2) {
      iz $$3 = this.j(new iz($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, iz $$1) {
      throw new tg($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, bst $$1) {
      throw new tg($$0, $$1.dp(), this.k($$1.dp()), this.h());
   }

   public void a(String $$0) {
      throw new tf($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new tf("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public tr g() {
      return this.a.p();
   }

   public iz j(iz $$0) {
      iz $$1 = this.a.c();
      iz $$2 = $$1.a((kd)$$0);
      return emj.a($$2, djv.a, this.a.t(), $$1);
   }

   public iz k(iz $$0) {
      iz $$1 = this.a.c();
      dll $$2 = this.a.t().a(dll.c);
      iz $$3 = emj.a($$0, djv.a, $$2, $$1);
      return $$3.b($$1);
   }

   public evq a(evq $$0) {
      evq $$1 = evq.a(this.a.c());
      return emj.a($$1.e($$0), djv.a, this.a.t(), this.a.c());
   }

   public evq b(evq $$0) {
      evq $$1 = evq.a(this.a.c());
      return emj.a($$0.d($$1), djv.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new tf($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new tf("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new tf($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public evl i() {
      return this.a.d();
   }

   private evl k() {
      evl $$0 = this.a.d();
      return $$0.a(iz.c.b(this.j(iz.c)));
   }

   public void a(Consumer<iz> $$0) {
      evl $$1 = this.k().a(1.0, 1.0, 1.0);
      iz.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cmw $$0, cuo $$1, iz $$2, je $$3) {
      iz $$4 = this.j($$2.a($$3));
      evm $$5 = new evm(evq.b($$4), $$3, $$4, false);
      cyb $$6 = new cyb($$0, bqs.a, $$5);
      $$1.a($$6);
   }

   public void a(ald<dcw> $$0) {
      evl $$1 = this.i();
      iz $$2 = iz.a($$1.a, $$1.b, $$1.c);
      iz $$3 = iz.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = anh.a(this.a(), $$2, $$3, this.a().H_().d(lq.az).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
