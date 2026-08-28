import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class sp {
   private final sq a;
   private boolean b;

   public sp(sq $$0) {
      this.a = $$0;
   }

   public sh a(xa $$0) {
      return new sh($$0, this.a.p());
   }

   public sh a(String $$0, Object... $$1) {
      return this.a((xa)xa.b($$0, $$1));
   }

   public si a(iv $$0, xa $$1) {
      return new si($$1, this.j($$0), $$0, this.a.p());
   }

   public si a(iv $$0, String $$1, Object... $$2) {
      return this.a($$0, xa.b($$1, $$2));
   }

   public ars a() {
      return this.a.g();
   }

   public ebe a(iv $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dyc> T a(iv $$0, Class<T> $$1) {
      dyc $$2 = this.a().c_(this.j($$0));
      if ($$2 == null) {
         throw this.a($$0, "test.error.missing_block_entity");
      } else if ($$1.isInstance($$2)) {
         return $$1.cast($$2);
      } else {
         throw this.a($$0, "test.error.wrong_block_entity", $$2.p().a().g());
      }
   }

   public void b() {
      this.a(bwt.class);
   }

   public void a(Class<? extends bwt> $$0) {
      ffl $$1 = this.j();
      List<? extends bwt> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof crx));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public coc a(czu $$0, ffq $$1) {
      ars $$2 = this.a();
      ffq $$3 = this.a($$1);
      coc $$4 = new coc($$2, $$3.d, $$3.e, $$3.f, new czy($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public coc a(czu $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ffq((double)$$1, (double)$$2, (double)$$3));
   }

   public coc a(czu $$0, iv $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bwt> E a(bxc<E> $$0, iv $$1) {
      return this.a($$0, ffq.c($$1));
   }

   public <E extends bwt> E a(bxc<E> $$0, ffq $$1) {
      ars $$2 = this.a();
      E $$3 = $$0.a($$2, bxb.d);
      if ($$3 == null) {
         throw this.a(iv.a((jp)$$1), "test.error.spawn_failure", $$0.r().g());
      } else {
         if ($$3 instanceof bxw $$4) {
            $$4.gc();
         }

         ffq $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dL(), $$3.dN());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bwt $$0, bvi $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bwt $$0) {
      $$0.c(this.a());
   }

   public <E extends bwt> E a(bxc<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bwt> E a(bxc<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw this.a("test.error.expected_entity_around", $$0.h(), $$1, $$2, $$3);
      } else if ($$5.size() > 1) {
         throw this.a("test.error.too_many_entities", $$0.i(), $$1, $$2, $$3, $$5.size());
      } else {
         ffq $$6 = this.a(new ffq((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dt().f($$6);
            double $$4x = $$2x.dt().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bwt> List<E> b(bxc<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, ffq.c(new iv($$1, $$2, $$3)), $$4);
   }

   public <E extends bwt> List<E> a(bxc<E> $$0, ffq $$1, double $$2) {
      ars $$3 = this.a();
      ffq $$4 = this.a($$1);
      ffl $$5 = this.a.e();
      ffl $$6 = new ffl($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bJ());
   }

   public <E extends bwt> E a(bxc<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new iv($$1, $$2, $$3));
   }

   public <E extends bwt> E a(bxc<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ffq((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bxw> E b(bxc<E> $$0, iv $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gp();
      return $$2;
   }

   public <E extends bxw> E b(bxc<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new iv($$1, $$2, $$3));
   }

   public <E extends bxw> E b(bxc<E> $$0, ffq $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gp();
      return $$2;
   }

   public <E extends bxw> E b(bxc<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ffq((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bxw $$0, float $$1, float $$2, float $$3) {
      ffq $$4 = this.a(new ffq((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dL(), $$0.dN());
   }

   public sw a(bxw $$0, iv $$1, float $$2) {
      return this.g().a(2, () -> {
         eyc $$3 = $$0.O().a(this.j($$1), 0);
         $$0.O().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b(new iv($$0, $$1, $$2));
   }

   public void b(iv $$0) {
      this.a(axe.f, $$0);
      iv $$1 = this.j($$0);
      ebe $$2 = this.a().a_($$1);
      dnn $$3 = (dnn)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void c(iv $$0) {
      this.a($$0, this.a(dju.b));
   }

   public void a(iv $$0, crx $$1) {
      iv $$2 = this.j($$0);
      this.a($$0, $$1, new ffm(ffq.b($$2), jb.c, $$2, true));
   }

   public void a(iv $$0, crx $$1, ffm $$2) {
      iv $$3 = this.j($$0);
      ebe $$4 = this.a().a_($$3);
      buq $$5 = buq.a;
      bur $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bur.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            ddt $$7 = new ddt($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bxu a(bxu $$0) {
      $$0.j(0);
      $$0.d(0.25F);
      return $$0;
   }

   public bxu b(bxu $$0) {
      $$0.d(0.25F);
      return $$0;
   }

   public crx a(final dju $$0) {
      return new crx(this.a(), iv.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean Z_() {
            return $$0 == dju.d;
         }

         @Override
         public boolean b() {
            return $$0.g();
         }

         @Override
         public boolean P_() {
            return false;
         }
      };
   }

   @Deprecated(
      forRemoval = true
   )
   public art c() {
      asi $$0 = asi.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      art $$1 = new art(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean Z_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      vt $$2 = new vt(zi.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.d(new iv($$0, $$1, $$2));
   }

   public void d(iv $$0) {
      this.a(dne.dL, $$0);
      iv $$1 = this.j($$0);
      ebe $$2 = this.a().a_($$1);
      drv $$3 = (drv)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(iv $$0, long $$1) {
      this.a($$0, dne.hB);
      this.b($$1, () -> this.a($$0, dne.a));
   }

   public void e(iv $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dnc $$3) {
      this.a(new iv($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, ebe $$3) {
      this.a(new iv($$0, $$1, $$2), $$3);
   }

   public void a(iv $$0, dnc $$1) {
      this.a($$0, $$1.m());
   }

   public void a(iv $$0, ebe $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dnc $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iv($$1, $$2, $$3));
   }

   public void a(dnc $$0, iv $$1) {
      ebe $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), $$1x -> xa.a("test.error.expected_block", $$0.f(), $$1x.f()));
   }

   public void b(dnc $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new iv($$1, $$2, $$3));
   }

   public void b(dnc $$0, iv $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), $$1x -> xa.a("test.error.unexpected_block", $$0.f()));
   }

   public void a(axt<dnc> $$0, iv $$1) {
      this.b($$1, $$1x -> $$1x.a($$0), $$1x -> xa.a("test.error.expected_block_tag", $$0.b(), $$1x.b().f()));
   }

   public void c(dnc $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iv($$1, $$2, $$3));
   }

   public void c(dnc $$0, iv $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(iv $$0, Predicate<dnc> $$1, Function<dnc, xa> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$1x -> $$2.apply($$1x.b()));
   }

   public <T extends Comparable<T>> void a(iv $$0, ech<T> $$1, T $$2) {
      ebe $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4) {
         throw this.a($$0, "test.error.block_property_missing", $$1.f(), $$2);
      } else if (!$$3.<T>c($$1).equals($$2)) {
         throw this.a($$0, "test.error.block_property_mismatch", $$1.f(), $$2, $$3.c($$1));
      }
   }

   public <T extends Comparable<T>> void a(iv $$0, ech<T> $$1, Predicate<T> $$2, xa $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, $$1x -> $$3);
   }

   public void b(iv $$0, ebe $$1) {
      ebe $$2 = this.a($$0);
      if (!$$2.equals($$1)) {
         throw this.a($$0, "test.error.state_not_equal", $$1, $$2);
      }
   }

   public void b(iv $$0, Predicate<ebe> $$1, Function<ebe, xa> $$2) {
      ebe $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw this.a($$0, $$2.apply($$3));
      }
   }

   public <T extends dyc> void a(iv $$0, Class<T> $$1, Predicate<T> $$2, Supplier<xa> $$3) {
      T $$4 = this.a($$0, $$1);
      if (!$$2.test($$4)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void a(iv $$0, jb $$1, IntPredicate $$2, Supplier<xa> $$3) {
      iv $$4 = this.j($$0);
      ars $$5 = this.a();
      ebe $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void b(bxc<?> $$0) {
      List<? extends bwt> $$1 = this.a().a($$0, this.j(), bwt::bJ);
      if ($$1.isEmpty()) {
         throw this.a("test.error.expected_entity_in_test", $$0.h());
      }
   }

   public void c(bxc<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iv($$1, $$2, $$3));
   }

   public void c(bxc<?> $$0, iv $$1) {
      iv $$2 = this.j($$1);
      List<? extends bwt> $$3 = this.a().a($$0, new ffl($$2), bwt::bJ);
      if ($$3.isEmpty()) {
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bxc<?> $$0, ffl $$1) {
      ffl $$2 = this.a($$1);
      List<? extends bwt> $$3 = this.a().a($$0, $$2, bwt::bJ);
      if ($$3.isEmpty()) {
         throw this.a(iv.a((jp)$$1.f()), "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bxc<?> $$0, int $$1) {
      List<? extends bwt> $$2 = this.a().a($$0, this.j(), bwt::bJ);
      if ($$2.size() != $$1) {
         throw this.a("test.error.expected_entity_count", $$1, $$0.h(), $$2.size());
      }
   }

   public void a(bxc<?> $$0, iv $$1, int $$2, double $$3) {
      iv $$4 = this.j($$1);
      List<? extends bwt> $$5 = this.b((bxc<? extends bwt>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw this.a($$1, "test.error.expected_entity_count", $$2, $$0.h(), $$5.size());
      }
   }

   public void a(bxc<?> $$0, iv $$1, double $$2) {
      List<? extends bwt> $$3 = this.b((bxc<? extends bwt>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         iv $$4 = this.j($$1);
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public <T extends bwt> List<T> b(bxc<T> $$0, iv $$1, double $$2) {
      iv $$3 = this.j($$1);
      return this.a().a($$0, new ffl($$3).g($$2), bwt::bJ);
   }

   public <T extends bwt> List<T> c(bxc<T> $$0) {
      return this.a().a($$0, this.j(), bwt::bJ);
   }

   public void a(bwt $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iv($$1, $$2, $$3));
   }

   public void a(bwt $$0, iv $$1) {
      iv $$2 = this.j($$1);
      List<? extends bwt> $$3 = this.a().a($$0.an(), new ffl($$2), bwt::bJ);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> this.a($$1, "test.error.expected_entity", $$0.an().h()));
   }

   public void a(czu $$0, iv $$1, double $$2, int $$3) {
      iv $$4 = this.j($$1);
      List<coc> $$5 = this.a().a(bxc.ar, new ffl($$4).g($$2), bwt::bJ);
      int $$6 = 0;

      for (coc $$7 : $$5) {
         czy $$8 = $$7.f();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw this.a($$1, "test.error.expected_items_count", $$3, $$0.l(), $$6);
      }
   }

   public void a(czu $$0, iv $$1, double $$2) {
      iv $$3 = this.j($$1);

      for (bwt $$5 : this.a().a(bxc.ar, new ffl($$3).g($$2), bwt::bJ)) {
         coc $$6 = (coc)$$5;
         if ($$6.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a($$1, "test.error.expected_item", $$0.l());
   }

   public void b(czu $$0, iv $$1, double $$2) {
      iv $$3 = this.j($$1);

      for (bwt $$5 : this.a().a(bxc.ar, new ffl($$3).g($$2), bwt::bJ)) {
         coc $$6 = (coc)$$5;
         if ($$6.f().h().equals($$0)) {
            throw this.a($$1, "test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void a(czu $$0) {
      for (bwt $$2 : this.a().a(bxc.ar, this.j(), bwt::bJ)) {
         coc $$3 = (coc)$$2;
         if ($$3.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a("test.error.expected_item", $$0.l());
   }

   public void b(czu $$0) {
      for (bwt $$2 : this.a().a(bxc.ar, this.j(), bwt::bJ)) {
         coc $$3 = (coc)$$2;
         if ($$3.f().h().equals($$0)) {
            throw this.a("test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void d(bxc<?> $$0) {
      List<? extends bwt> $$1 = this.a().a($$0, this.j(), bwt::bJ);
      if (!$$1.isEmpty()) {
         throw this.a($$1.getFirst().dv(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void d(bxc<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new iv($$1, $$2, $$3));
   }

   public void d(bxc<?> $$0, iv $$1) {
      iv $$2 = this.j($$1);
      List<? extends bwt> $$3 = this.a().a($$0, new ffl($$2), bwt::bJ);
      if (!$$3.isEmpty()) {
         throw this.a($$1, "test.error.unexpected_entity", $$0.h());
      }
   }

   public void b(bxc<?> $$0, ffl $$1) {
      ffl $$2 = this.a($$1);
      List<? extends bwt> $$3 = this.a().a($$0, $$2, bwt::bJ);
      if (!$$3.isEmpty()) {
         throw this.a($$3.getFirst().dv(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void a(bxc<?> $$0, double $$1, double $$2, double $$3) {
      ffq $$4 = new ffq($$1, $$2, $$3);
      ffq $$5 = this.a($$4);
      Predicate<? super bwt> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bwt> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public void b(bxc<?> $$0, double $$1, double $$2, double $$3) {
      ffq $$4 = new ffq($$1, $$2, $$3);
      ffq $$5 = this.a($$4);
      Predicate<? super bwt> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bwt> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_not_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public <E extends bwt, T> void a(iv $$0, bxc<E> $$1, Predicate<E> $$2) {
      iv $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ffl($$3), bwt::bJ);
      if ($$4.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw this.a($$5.dv(), "test.error.expected_entity_data_predicate", $$5.ai());
            }
         }
      }
   }

   public <E extends bwt, T> void a(iv $$0, bxc<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      iv $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ffl($$4), bwt::bJ);
      if ($$5.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw this.a($$0, "test.error.expected_entity_data", $$3, $$7);
            }
         }
      }
   }

   public <E extends bxu> void a(iv $$0, bxc<E> $$1, czu $$2) {
      iv $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ffl($$3), bwt::bJ);
      if ($$4.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw this.a($$0, "test.error.expected_entity_holding", $$2.l());
      }
   }

   public <E extends bwt & crh> void b(iv $$0, bxc<E> $$1, czu $$2) {
      iv $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ffl($$3), $$0x -> ((bwt)$$0x).bJ());
      if ($$4.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.n().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw this.a($$0, "test.error.expected_entity_having", $$2.l());
      }
   }

   public void f(iv $$0) {
      dxv $$1 = this.a($$0, dxv.class);
      if (!$$1.c()) {
         throw this.a($$0, "test.error.expected_empty_container");
      }
   }

   public void a(iv $$0, czu $$1) {
      dxv $$2 = this.a($$0, dxv.class);
      if ($$2.a_($$1) != 1) {
         throw this.a($$0, "test.error.expected_container_contents_single", $$1.l());
      }
   }

   public void b(iv $$0, czu $$1) {
      dxv $$2 = this.a($$0, dxv.class);
      if ($$2.a_($$1) == 0) {
         throw this.a($$0, "test.error.expected_container_contents", $$1.l());
      }
   }

   public void a(ert $$0, iv $$1) {
      iv.a($$0).forEach($$2 -> {
         iv $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(iv $$0, iv $$1) {
      ebe $$2 = this.a($$0);
      ebe $$3 = this.a($$1);
      if ($$2 != $$3) {
         throw this.a($$0, "test.error.state_not_equal", $$3, $$2);
      }
   }

   public void a(long $$0, iv $$1, czu $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, iv $$1) {
      this.a($$0, () -> this.f($$1));
   }

   public <E extends bwt, T> void b(iv $$0, bxc<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bwt $$0, ffl $$1, xa $$2) {
      if (!$$1.d(this.b($$0.dt()))) {
         throw this.a($$2);
      }
   }

   public <E extends bwt> void a(E $$0, Predicate<E> $$1, xa $$2) {
      if (!$$1.test($$0)) {
         throw this.a($$0.dv(), "test.error.entity_property", $$0.ai(), $$2);
      }
   }

   public <E extends bwt, T> void a(E $$0, Function<E, T> $$1, T $$2, xa $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$2)) {
         throw this.a($$0.dv(), "test.error.entity_property_details", $$0.ai(), $$3, $$4, $$2);
      }
   }

   public void a(bxu $$0, jf<bvv> $$1, int $$2) {
      bvx $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         throw this.a("test.error.expected_entity_effect", $$0.ai(), dbu.a($$1, $$2));
      }
   }

   public void e(bxc<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new iv($$1, $$2, $$3));
   }

   public void e(bxc<?> $$0, iv $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bxc<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new iv($$1, $$2, $$3));
   }

   public void f(bxc<?> $$0, iv $$1) {
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
      this.a((long)this.a.p() + $$0, $$1);
   }

   public void g(iv $$0) {
      iv $$1 = this.j($$0);
      ars $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void h(iv $$0) {
      iv $$1 = this.j($$0);
      ars $$2 = this.a();
      $$2.a_($$1).a($$2, $$1, $$2.A);
   }

   public void i(iv $$0) {
      iv $$1 = this.j($$0);
      ars $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ffl $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new iv($$4, $$3, $$5));
         }
      }
   }

   public int a(ehd.a $$0, int $$1, int $$2) {
      iv $$3 = this.j(new iv($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(xa $$0, iv $$1) {
      throw this.a($$1, $$0);
   }

   public void a(xa $$0, bwt $$1) {
      throw this.a($$1.dv(), $$0);
   }

   public void b(xa $$0) {
      throw this.a($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> this.a("test.error.fail"));
   }

   public void d(Runnable $$0) {
      LongStream.range((long)this.a.p(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public sw g() {
      return this.a.q();
   }

   public iv j(iv $$0) {
      iv $$1 = this.a.d();
      iv $$2 = $$1.a((ka)$$0);
      return ewd.a($$2, dsf.a, this.a.u(), $$1);
   }

   public iv k(iv $$0) {
      iv $$1 = this.a.d();
      dtw $$2 = this.a.u().a(dtw.c);
      iv $$3 = ewd.a($$0, dsf.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ffl a(ffl $$0) {
      ffq $$1 = this.a($$0.h());
      ffq $$2 = this.a($$0.i());
      return new ffl($$1, $$2);
   }

   public ffl b(ffl $$0) {
      ffq $$1 = this.b($$0.h());
      ffq $$2 = this.b($$0.i());
      return new ffl($$1, $$2);
   }

   public ffq a(ffq $$0) {
      ffq $$1 = ffq.a(this.a.d());
      return ewd.a($$1.e($$0), dsf.a, this.a.u(), this.a.d());
   }

   public ffq b(ffq $$0) {
      ffq $$1 = ffq.a(this.a.d());
      return ewd.a($$0.d($$1), dsf.a, this.a.u(), this.a.d());
   }

   public dtw h() {
      return this.a.u();
   }

   public void a(boolean $$0, xa $$1) {
      if (!$$0) {
         throw this.a($$1);
      }
   }

   public <N> void a(N $$0, N $$1, xa $$2) {
      if (!$$0.equals($$1)) {
         throw this.a("test.error.value_not_equal", $$2, $$0, $$1);
      }
   }

   public void b(boolean $$0, xa $$1) {
      this.a(!$$0, $$1);
   }

   public long i() {
      return (long)this.a.p();
   }

   public ffl j() {
      return this.a.e();
   }

   private ffl l() {
      ffl $$0 = this.a.e();
      dtw $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new ffl(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new ffl(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<iv> $$0) {
      ffl $$1 = this.l().a(1.0, 1.0, 1.0);
      iv.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range((long)this.a.p(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(crx $$0, czy $$1, iv $$2, jb $$3) {
      iv $$4 = this.j($$2.a($$3));
      ffm $$5 = new ffm(ffq.b($$4), $$3, $$4, false);
      ddt $$6 = new ddt($$0, buq.a, $$5);
      $$1.a($$6);
   }

   public void a(alh<dla> $$0) {
      ffl $$1 = this.j();
      iv $$2 = iv.a($$1.a, $$1.b, $$1.c);
      iv $$3 = iv.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ann.a(this.a(), $$2, $$3, this.a().J_().f(mh.aG).b($$0));
      if ($$4.right().isPresent()) {
         throw this.a("test.error.set_biome");
      }
   }
}
