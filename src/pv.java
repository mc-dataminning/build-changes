import com.mojang.authlib.GameProfile;
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

public class pv {
   private final pw a;
   private boolean b;

   public pv(pw $$0) {
      this.a = $$0;
   }

   public akt a() {
      return this.a.g();
   }

   public dfd a(gw $$0) {
      return this.a().a_(this.i($$0));
   }

   @Nullable
   public dcz b(gw $$0) {
      return this.a().c_(this.i($$0));
   }

   public void b() {
      this.a(biw.class);
   }

   public void a(Class $$0) {
      ehc $$1 = this.j();
      List<biw> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cca));
      $$2.forEach(biw::aj);
   }

   public byt a(cjg $$0, float $$1, float $$2, float $$3) {
      akt $$4 = this.a();
      ehh $$5 = this.a(new ehh((double)$$1, (double)$$2, (double)$$3));
      byt $$6 = new byt($$4, $$5.c, $$5.d, $$5.e, new cjl($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public byt a(cjg $$0, gw $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends biw> E a(bja<E> $$0, gw $$1) {
      return this.a($$0, ehh.c($$1));
   }

   public <E extends biw> E a(bja<E> $$0, ehh $$1) {
      akt $$2 = this.a();
      E $$3 = $$0.a((cqb)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().g().a());
      } else {
         if ($$3 instanceof bjo $$4) {
            $$4.fJ();
         }

         ehh $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dB(), $$3.dD());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends biw> E a(bja<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new gw($$1, $$2, $$3));
   }

   public <E extends biw> E a(bja<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ehh((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bjo> E b(bja<E> $$0, gw $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bjo> E b(bja<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new gw($$1, $$2, $$3));
   }

   public <E extends bjo> E b(bja<E> $$0, ehh $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.fZ();
      return $$2;
   }

   public <E extends bjo> E b(bja<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ehh((double)$$1, (double)$$2, (double)$$3));
   }

   public qa a(bjo $$0, gw $$1, float $$2) {
      return this.h().a(2, () -> {
         eav $$3 = $$0.L().a(this.i($$1), 0);
         $$0.L().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new gw($$0, $$1, $$2));
   }

   public void c(gw $$0) {
      this.b($$0, $$0x -> $$0x.a(apv.f), () -> "Expected button");
      gw $$1 = this.i($$0);
      dfd $$2 = this.a().a_($$1);
      ctm $$3 = (ctm)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(gw $$0) {
      this.a($$0, this.d());
   }

   public void a(gw $$0, cca $$1) {
      gw $$2 = this.i($$0);
      this.a($$0, $$1, new ehd(ehh.b($$2), ha.c, $$2, true));
   }

   public void a(gw $$0, cca $$1, ehd $$2) {
      gw $$3 = this.i($$0);
      dfd $$4 = this.a().a_($$3);
      bhe $$5 = $$4.a(this.a(), $$1, bhd.a, $$2);
      if (!$$5.a()) {
         clv $$6 = new clv($$1, bhd.a, $$2);
         $$1.b(bhd.a).a($$6);
      }
   }

   public bjm a(bjm $$0) {
      $$0.j(0);
      $$0.c(0.25F);
      return $$0;
   }

   public cca c() {
      return new cca(this.a(), gw.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean M_() {
            return false;
         }

         @Override
         public boolean f() {
            return false;
         }
      };
   }

   public bjm b(bjm $$0) {
      $$0.c(0.25F);
      return $$0;
   }

   public cca d() {
      return new cca(this.a(), gw.b, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean M_() {
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
   public aku e() {
      ali $$0 = ali.a(new GameProfile(UUID.randomUUID(), "test-mock-player"));
      aku $$1 = new aku(this.a().n(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean M_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      sm $$2 = new sm(vf.a);
      EmbeddedChannel $$3 = new EmbeddedChannel(new ChannelHandler[]{$$2});
      $$3.attr(sm.e).set(sn.b.b(vf.a));
      this.a().n().ac().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new gw($$0, $$1, $$2));
   }

   public void e(gw $$0) {
      this.a(cte.dw, $$0);
      gw $$1 = this.i($$0);
      dfd $$2 = this.a().a_($$1);
      cxn $$3 = (cxn)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(gw $$0, long $$1) {
      this.a($$0, cte.ha);
      this.b($$1, () -> this.a($$0, cte.a));
   }

   public void f(gw $$0) {
      this.a().a(this.i($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, ctc $$3) {
      this.a(new gw($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dfd $$3) {
      this.a(new gw($$0, $$1, $$2), $$3);
   }

   public void a(gw $$0, ctc $$1) {
      this.a($$0, $$1.o());
   }

   public void a(gw $$0, dfd $$1) {
      this.a().a(this.i($$0), $$1, 3);
   }

   public void f() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(ctc $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gw($$1, $$2, $$3));
   }

   public void a(ctc $$0, gw $$1) {
      dfd $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(ctc $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new gw($$1, $$2, $$3));
   }

   public void b(ctc $$0, gw $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(ctc $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gw($$1, $$2, $$3));
   }

   public void c(ctc $$0, gw $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(gw $$0, Predicate<ctc> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(gw $$0, Predicate<ctc> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(gw $$0, dgg<T> $$1, T $$2) {
      dfd $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new pq($$6, this.i($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(gw $$0, dgg<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(gw $$0, Predicate<dfd> $$1, Supplier<String> $$2) {
      dfd $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new pq($$2.get(), this.i($$0), $$0, this.a.p());
      }
   }

   public void a(gw $$0, ha $$1, IntPredicate $$2, Supplier<String> $$3) {
      gw $$4 = this.i($$0);
      akt $$5 = this.a();
      dfd $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new pq($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void a(bja<?> $$0) {
      List<? extends biw> $$1 = this.a().a($$0, this.j(), biw::bv);
      if ($$1.isEmpty()) {
         throw new pp("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bja<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new gw($$1, $$2, $$3));
   }

   public void c(bja<?> $$0, gw $$1) {
      gw $$2 = this.i($$1);
      List<? extends biw> $$3 = this.a().a($$0, new ehc($$2), biw::bv);
      if ($$3.isEmpty()) {
         throw new pq("Expected " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bja<?> $$0, ehh $$1, ehh $$2) {
      List<? extends biw> $$3 = this.a().a($$0, new ehc($$1, $$2), biw::bv);
      if ($$3.isEmpty()) {
         throw new pq("Expected " + $$0.i() + " between ", gw.a($$1), gw.a($$2), this.a.p());
      }
   }

   public void a(bja<?> $$0, gw $$1, int $$2, double $$3) {
      gw $$4 = this.i($$1);
      List<? extends biw> $$5 = this.b((bja<? extends biw>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new pq("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bja<?> $$0, gw $$1, double $$2) {
      List<? extends biw> $$3 = this.b((bja<? extends biw>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         gw $$4 = this.i($$1);
         throw new pq("Expected " + $$0.i(), $$4, $$1, this.a.p());
      }
   }

   public <T extends biw> List<T> b(bja<T> $$0, gw $$1, double $$2) {
      gw $$3 = this.i($$1);
      return this.a().a($$0, new ehc($$3).g($$2), biw::bv);
   }

   public void a(biw $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new gw($$1, $$2, $$3));
   }

   public void a(biw $$0, gw $$1) {
      gw $$2 = this.i($$1);
      List<? extends biw> $$3 = this.a().a($$0.ag(), new ehc($$2), biw::bv);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new pq("Expected " + $$0.ag().i(), $$2, $$1, this.a.p()));
   }

   public void a(cjg $$0, gw $$1, double $$2, int $$3) {
      gw $$4 = this.i($$1);
      List<byt> $$5 = this.a().a(bja.ad, new ehc($$4).g($$2), biw::bv);
      int $$6 = 0;

      for (byt $$7 : $$5) {
         cjl $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new pq("Expected " + $$3 + " " + $$0.p().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cjg $$0, gw $$1, double $$2) {
      gw $$3 = this.i($$1);

      for (biw $$5 : this.a().a(bja.ad, new ehc($$3).g($$2), biw::bv)) {
         byt $$6 = (byt)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new pq("Expected " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cjg $$0, gw $$1, double $$2) {
      gw $$3 = this.i($$1);

      for (biw $$5 : this.a().a(bja.ad, new ehc($$3).g($$2), biw::bv)) {
         byt $$6 = (byt)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new pq("Did not expect " + $$0.p().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(cjg $$0) {
      for (biw $$2 : this.a().a(bja.ad, this.j(), biw::bv)) {
         byt $$3 = (byt)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new pp("Expected " + $$0.p().getString() + " item");
   }

   public void b(cjg $$0) {
      for (biw $$2 : this.a().a(bja.ad, this.j(), biw::bv)) {
         byt $$3 = (byt)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new pp("Did not expect " + $$0.p().getString() + " item");
         }
      }
   }

   public void b(bja<?> $$0) {
      List<? extends biw> $$1 = this.a().a($$0, this.j(), biw::bv);
      if (!$$1.isEmpty()) {
         throw new pp("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bja<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new gw($$1, $$2, $$3));
   }

   public void d(bja<?> $$0, gw $$1) {
      gw $$2 = this.i($$1);
      List<? extends biw> $$3 = this.a().a($$0, new ehc($$2), biw::bv);
      if (!$$3.isEmpty()) {
         throw new pq("Did not expect " + $$0.i(), $$2, $$1, this.a.p());
      }
   }

   public void a(bja<?> $$0, double $$1, double $$2, double $$3) {
      ehh $$4 = new ehh($$1, $$2, $$3);
      ehh $$5 = this.a($$4);
      Predicate<? super biw> $$6 = $$1x -> $$1x.cG().a($$5, $$5);
      List<? extends biw> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new pp("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bja<?> $$0, double $$1, double $$2, double $$3) {
      ehh $$4 = new ehh($$1, $$2, $$3);
      ehh $$5 = this.a($$4);
      Predicate<? super biw> $$6 = $$1x -> !$$1x.cG().a($$5, $$5);
      List<? extends biw> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new pp("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends biw, T> void a(gw $$0, bja<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      gw $$4 = this.i($$0);
      List<E> $$5 = this.a().a($$1, new ehc($$4), biw::bv);
      if ($$5.isEmpty()) {
         throw new pq("Expected " + $$1.i(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new pp("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new pp("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bjm> void a(gw $$0, bja<E> $$1, cjg $$2) {
      gw $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ehc($$3), biw::bv);
      if ($$4.isEmpty()) {
         throw new pq("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new pq("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends biw & cbl> void b(gw $$0, bja<E> $$1, cjg $$2) {
      gw $$3 = this.i($$0);
      List<E> $$4 = this.a().a($$1, new ehc($$3), $$0x -> ((biw)$$0x).bv());
      if ($$4.isEmpty()) {
         throw new pq("Expected " + $$1.i() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new pq("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(gw $$0) {
      gw $$1 = this.i($$0);
      dcz $$2 = this.a().c_($$1);
      if ($$2 instanceof dct && !((dct)$$2).af_()) {
         throw new pp("Container should be empty");
      }
   }

   public void a(gw $$0, cjg $$1) {
      gw $$2 = this.i($$0);
      dcz $$3 = this.a().c_($$2);
      if (!($$3 instanceof dct)) {
         throw new pp("Expected a container at " + $$0 + ", found " + jb.l.b($$3.u()));
      } else if (((dct)$$3).a_($$1) != 1) {
         throw new pp("Container should contain: " + $$1);
      }
   }

   public void a(duu $$0, gw $$1) {
      gw.a($$0).forEach($$2 -> {
         gw $$3 = $$1.b($$2.u() - $$0.g(), $$2.v() - $$0.h(), $$2.w() - $$0.i());
         this.a($$2, $$3);
      });
   }

   public void a(gw $$0, gw $$1) {
      dfd $$2 = this.a($$0);
      dfd $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, gw $$1, cjg $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, gw $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends biw, T> void b(gw $$0, bja<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends biw> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new pp("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends biw, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new pp("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bjm $$0, bih $$1, int $$2) {
      bij $$3 = $$0.b($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new pp("Entity " + $$0 + " failed has " + $$1.d() + " x " + $$4 + " test");
      }
   }

   public void e(bja<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new gw($$1, $$2, $$3));
   }

   public void e(bja<?> $$0, gw $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bja<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new gw($$1, $$2, $$3));
   }

   public void f(bja<?> $$0, gw $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void g() {
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

   public void h(gw $$0) {
      gw $$1 = this.i($$0);
      akt $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public int a(dkm.a $$0, int $$1, int $$2) {
      gw $$3 = this.i(new gw($$1, 0, $$2));
      return this.j(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, gw $$1) {
      throw new pq($$0, this.i($$1), $$1, this.i());
   }

   public void a(String $$0, biw $$1) {
      throw new pq($$0, $$1.dl(), this.j($$1.dl()), this.i());
   }

   public void a(String $$0) {
      throw new pp($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new pp("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public qa h() {
      return this.a.q();
   }

   public gw i(gw $$0) {
      gw $$1 = this.a.d();
      gw $$2 = $$1.a((hy)$$0);
      return dyv.a($$2, cxx.a, this.a.u(), $$1);
   }

   public gw j(gw $$0) {
      gw $$1 = this.a.d();
      czn $$2 = this.a.u().a(czn.c);
      gw $$3 = dyv.a($$0, cxx.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ehh a(ehh $$0) {
      ehh $$1 = ehh.a(this.a.d());
      return dyv.a($$1.e($$0), cxx.a, this.a.u(), this.a.d());
   }

   public ehh b(ehh $$0) {
      ehh $$1 = ehh.a(this.a.d());
      return dyv.a($$0.d($$1), cxx.a, this.a.u(), this.a.d());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new pp($$1);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new pp($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   public ehc j() {
      return this.a.f();
   }

   private ehc l() {
      ehc $$0 = this.a.f();
      return $$0.a(gw.b.b(this.i(gw.b)));
   }

   public void a(Consumer<gw> $$0) {
      ehc $$1 = this.l();
      gw.a.a($$1.d(0.0, 1.0, 0.0)).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cca $$0, cjl $$1, gw $$2, ha $$3) {
      gw $$4 = this.i($$2.a($$3));
      ehd $$5 = new ehd(ehh.b($$4), $$3, $$4, false);
      clv $$6 = new clv($$0, bhd.a, $$5);
      $$1.a($$6);
   }
}
