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

   public sh a(wy $$0) {
      return new sh($$0, this.a.p());
   }

   public sh a(String $$0, Object... $$1) {
      return this.a((wy)wy.b($$0, $$1));
   }

   public si a(iv $$0, wy $$1) {
      return new si($$1, this.j($$0), $$0, this.a.p());
   }

   public si a(iv $$0, String $$1, Object... $$2) {
      return this.a($$0, wy.b($$1, $$2));
   }

   public arq a() {
      return this.a.g();
   }

   public eat a(iv $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dxr> T a(iv $$0, Class<T> $$1) {
      dxr $$2 = this.a().c_(this.j($$0));
      if ($$2 == null) {
         throw this.a($$0, "test.error.missing_block_entity");
      } else if ($$1.isInstance($$2)) {
         return $$1.cast($$2);
      } else {
         throw this.a($$0, "test.error.wrong_block_entity", $$2.p().a().g());
      }
   }

   public void b() {
      this.a(bwi.class);
   }

   public void a(Class<? extends bwi> $$0) {
      fex $$1 = this.j();
      List<? extends bwi> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof crm));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public cnr a(czj $$0, ffc $$1) {
      arq $$2 = this.a();
      ffc $$3 = this.a($$1);
      cnr $$4 = new cnr($$2, $$3.d, $$3.e, $$3.f, new czn($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cnr a(czj $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ffc((double)$$1, (double)$$2, (double)$$3));
   }

   public cnr a(czj $$0, iv $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bwi> E a(bwr<E> $$0, iv $$1) {
      return this.a($$0, ffc.c($$1));
   }

   public <E extends bwi> E a(bwr<E> $$0, ffc $$1) {
      arq $$2 = this.a();
      E $$3 = $$0.a($$2, bwq.d);
      if ($$3 == null) {
         throw this.a(iv.a((jp)$$1), "test.error.spawn_failure", $$0.r().g());
      } else {
         if ($$3 instanceof bxl $$4) {
            $$4.gb();
         }

         ffc $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dK(), $$3.dM());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bwi $$0, bux $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bwi $$0) {
      $$0.c(this.a());
   }

   public <E extends bwi> E a(bwr<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bwi> E a(bwr<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw this.a("test.error.expected_entity_around", $$0.h(), $$1, $$2, $$3);
      } else if ($$5.size() > 1) {
         throw this.a("test.error.too_many_entities", $$0.i(), $$1, $$2, $$3, $$5.size());
      } else {
         ffc $$6 = this.a(new ffc((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.ds().f($$6);
            double $$4x = $$2x.ds().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bwi> List<E> b(bwr<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, ffc.c(new iv($$1, $$2, $$3)), $$4);
   }

   public <E extends bwi> List<E> a(bwr<E> $$0, ffc $$1, double $$2) {
      arq $$3 = this.a();
      ffc $$4 = this.a($$1);
      fex $$5 = this.a.e();
      fex $$6 = new fex($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cQ().c($$6) && $$1x.bI());
   }

   public <E extends bwi> E a(bwr<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new iv($$1, $$2, $$3));
   }

   public <E extends bwi> E a(bwr<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ffc((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bxl> E b(bwr<E> $$0, iv $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.go();
      return $$2;
   }

   public <E extends bxl> E b(bwr<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new iv($$1, $$2, $$3));
   }

   public <E extends bxl> E b(bwr<E> $$0, ffc $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.go();
      return $$2;
   }

   public <E extends bxl> E b(bwr<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ffc((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bxl $$0, float $$1, float $$2, float $$3) {
      ffc $$4 = this.a(new ffc((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dK(), $$0.dM());
   }

   public sw a(bxl $$0, iv $$1, float $$2) {
      return this.g().a(2, () -> {
         exo $$3 = $$0.O().a(this.j($$1), 0);
         $$0.O().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b(new iv($$0, $$1, $$2));
   }

   public void b(iv $$0) {
      this.a(axc.f, $$0);
      iv $$1 = this.j($$0);
      eat $$2 = this.a().a_($$1);
      dnc $$3 = (dnc)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void c(iv $$0) {
      this.a($$0, this.a(djj.b));
   }

   public void a(iv $$0, crm $$1) {
      iv $$2 = this.j($$0);
      this.a($$0, $$1, new fey(ffc.b($$2), jb.c, $$2, true));
   }

   public void a(iv $$0, crm $$1, fey $$2) {
      iv $$3 = this.j($$0);
      eat $$4 = this.a().a_($$3);
      buf $$5 = buf.a;
      bug $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bug.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            ddi $$7 = new ddi($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bxj a(bxj $$0) {
      $$0.j(0);
      $$0.d(0.25F);
      return $$0;
   }

   public bxj b(bxj $$0) {
      $$0.d(0.25F);
      return $$0;
   }

   public crm a(final djj $$0) {
      return new crm(this.a(), iv.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean V_() {
            return $$0 == djj.d;
         }

         @Override
         public boolean b() {
            return $$0.g();
         }

         @Override
         public boolean L_() {
            return false;
         }
      };
   }

   @Deprecated(
      forRemoval = true
   )
   public arr c() {
      asg $$0 = asg.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      arr $$1 = new arr(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean V_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      vr $$2 = new vr(zg.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.d(new iv($$0, $$1, $$2));
   }

   public void d(iv $$0) {
      this.a(dmt.dL, $$0);
      iv $$1 = this.j($$0);
      eat $$2 = this.a().a_($$1);
      drk $$3 = (drk)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(iv $$0, long $$1) {
      this.a($$0, dmt.hB);
      this.b($$1, () -> this.a($$0, dmt.a));
   }

   public void e(iv $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dmr $$3) {
      this.a(new iv($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, eat $$3) {
      this.a(new iv($$0, $$1, $$2), $$3);
   }

   public void a(iv $$0, dmr $$1) {
      this.a($$0, $$1.m());
   }

   public void a(iv $$0, eat $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dmr $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iv($$1, $$2, $$3));
   }

   public void a(dmr $$0, iv $$1) {
      eat $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), $$1x -> wy.a("test.error.expected_block", $$0.f(), $$1x.f()));
   }

   public void b(dmr $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new iv($$1, $$2, $$3));
   }

   public void b(dmr $$0, iv $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), $$1x -> wy.a("test.error.unexpected_block", $$0.f()));
   }

   public void a(axr<dmr> $$0, iv $$1) {
      this.b($$1, $$1x -> $$1x.a($$0), $$1x -> wy.a("test.error.expected_block_tag", $$0.b(), $$1x.b().f()));
   }

   public void c(dmr $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iv($$1, $$2, $$3));
   }

   public void c(dmr $$0, iv $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(iv $$0, Predicate<dmr> $$1, Function<dmr, wy> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$1x -> $$2.apply($$1x.b()));
   }

   public <T extends Comparable<T>> void a(iv $$0, ebw<T> $$1, T $$2) {
      eat $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4) {
         throw this.a($$0, "test.error.block_property_missing", $$1.f(), $$2);
      } else if (!$$3.<T>c($$1).equals($$2)) {
         throw this.a($$0, "test.error.block_property_mismatch", $$1.f(), $$2, $$3.c($$1));
      }
   }

   public <T extends Comparable<T>> void a(iv $$0, ebw<T> $$1, Predicate<T> $$2, wy $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, $$1x -> $$3);
   }

   public void b(iv $$0, eat $$1) {
      eat $$2 = this.a($$0);
      if (!$$2.equals($$1)) {
         throw this.a($$0, "test.error.state_not_equal", $$1, $$2);
      }
   }

   public void b(iv $$0, Predicate<eat> $$1, Function<eat, wy> $$2) {
      eat $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw this.a($$0, $$2.apply($$3));
      }
   }

   public <T extends dxr> void a(iv $$0, Class<T> $$1, Predicate<T> $$2, Supplier<wy> $$3) {
      T $$4 = this.a($$0, $$1);
      if (!$$2.test($$4)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void a(iv $$0, jb $$1, IntPredicate $$2, Supplier<wy> $$3) {
      iv $$4 = this.j($$0);
      arq $$5 = this.a();
      eat $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void b(bwr<?> $$0) {
      List<? extends bwi> $$1 = this.a().a($$0, this.j(), bwi::bI);
      if ($$1.isEmpty()) {
         throw this.a("test.error.expected_entity_in_test", $$0.h());
      }
   }

   public void c(bwr<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iv($$1, $$2, $$3));
   }

   public void c(bwr<?> $$0, iv $$1) {
      iv $$2 = this.j($$1);
      List<? extends bwi> $$3 = this.a().a($$0, new fex($$2), bwi::bI);
      if ($$3.isEmpty()) {
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bwr<?> $$0, fex $$1) {
      fex $$2 = this.a($$1);
      List<? extends bwi> $$3 = this.a().a($$0, $$2, bwi::bI);
      if ($$3.isEmpty()) {
         throw this.a(iv.a((jp)$$1.f()), "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bwr<?> $$0, int $$1) {
      List<? extends bwi> $$2 = this.a().a($$0, this.j(), bwi::bI);
      if ($$2.size() != $$1) {
         throw this.a("test.error.expected_entity_count", $$1, $$0.h(), $$2.size());
      }
   }

   public void a(bwr<?> $$0, iv $$1, int $$2, double $$3) {
      iv $$4 = this.j($$1);
      List<? extends bwi> $$5 = this.b((bwr<? extends bwi>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw this.a($$1, "test.error.expected_entity_count", $$2, $$0.h(), $$5.size());
      }
   }

   public void a(bwr<?> $$0, iv $$1, double $$2) {
      List<? extends bwi> $$3 = this.b((bwr<? extends bwi>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         iv $$4 = this.j($$1);
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public <T extends bwi> List<T> b(bwr<T> $$0, iv $$1, double $$2) {
      iv $$3 = this.j($$1);
      return this.a().a($$0, new fex($$3).g($$2), bwi::bI);
   }

   public <T extends bwi> List<T> c(bwr<T> $$0) {
      return this.a().a($$0, this.j(), bwi::bI);
   }

   public void a(bwi $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iv($$1, $$2, $$3));
   }

   public void a(bwi $$0, iv $$1) {
      iv $$2 = this.j($$1);
      List<? extends bwi> $$3 = this.a().a($$0.an(), new fex($$2), bwi::bI);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> this.a($$1, "test.error.expected_entity", $$0.an().h()));
   }

   public void a(czj $$0, iv $$1, double $$2, int $$3) {
      iv $$4 = this.j($$1);
      List<cnr> $$5 = this.a().a(bwr.aq, new fex($$4).g($$2), bwi::bI);
      int $$6 = 0;

      for (cnr $$7 : $$5) {
         czn $$8 = $$7.f();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw this.a($$1, "test.error.expected_items_count", $$3, $$0.l(), $$6);
      }
   }

   public void a(czj $$0, iv $$1, double $$2) {
      iv $$3 = this.j($$1);

      for (bwi $$5 : this.a().a(bwr.aq, new fex($$3).g($$2), bwi::bI)) {
         cnr $$6 = (cnr)$$5;
         if ($$6.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a($$1, "test.error.expected_item", $$0.l());
   }

   public void b(czj $$0, iv $$1, double $$2) {
      iv $$3 = this.j($$1);

      for (bwi $$5 : this.a().a(bwr.aq, new fex($$3).g($$2), bwi::bI)) {
         cnr $$6 = (cnr)$$5;
         if ($$6.f().h().equals($$0)) {
            throw this.a($$1, "test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void a(czj $$0) {
      for (bwi $$2 : this.a().a(bwr.aq, this.j(), bwi::bI)) {
         cnr $$3 = (cnr)$$2;
         if ($$3.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a("test.error.expected_item", $$0.l());
   }

   public void b(czj $$0) {
      for (bwi $$2 : this.a().a(bwr.aq, this.j(), bwi::bI)) {
         cnr $$3 = (cnr)$$2;
         if ($$3.f().h().equals($$0)) {
            throw this.a("test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void d(bwr<?> $$0) {
      List<? extends bwi> $$1 = this.a().a($$0, this.j(), bwi::bI);
      if (!$$1.isEmpty()) {
         throw this.a($$1.getFirst().du(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void d(bwr<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new iv($$1, $$2, $$3));
   }

   public void d(bwr<?> $$0, iv $$1) {
      iv $$2 = this.j($$1);
      List<? extends bwi> $$3 = this.a().a($$0, new fex($$2), bwi::bI);
      if (!$$3.isEmpty()) {
         throw this.a($$1, "test.error.unexpected_entity", $$0.h());
      }
   }

   public void b(bwr<?> $$0, fex $$1) {
      fex $$2 = this.a($$1);
      List<? extends bwi> $$3 = this.a().a($$0, $$2, bwi::bI);
      if (!$$3.isEmpty()) {
         throw this.a($$3.getFirst().du(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void a(bwr<?> $$0, double $$1, double $$2, double $$3) {
      ffc $$4 = new ffc($$1, $$2, $$3);
      ffc $$5 = this.a($$4);
      Predicate<? super bwi> $$6 = $$1x -> $$1x.cQ().a($$5, $$5);
      List<? extends bwi> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public void b(bwr<?> $$0, double $$1, double $$2, double $$3) {
      ffc $$4 = new ffc($$1, $$2, $$3);
      ffc $$5 = this.a($$4);
      Predicate<? super bwi> $$6 = $$1x -> !$$1x.cQ().a($$5, $$5);
      List<? extends bwi> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_not_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public <E extends bwi, T> void a(iv $$0, bwr<E> $$1, Predicate<E> $$2) {
      iv $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fex($$3), bwi::bI);
      if ($$4.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw this.a($$5.du(), "test.error.expected_entity_data_predicate", $$5.ai());
            }
         }
      }
   }

   public <E extends bwi, T> void a(iv $$0, bwr<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      iv $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new fex($$4), bwi::bI);
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

   public <E extends bxj> void a(iv $$0, bwr<E> $$1, czj $$2) {
      iv $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fex($$3), bwi::bI);
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

   public <E extends bwi & cqw> void b(iv $$0, bwr<E> $$1, czj $$2) {
      iv $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fex($$3), $$0x -> ((bwi)$$0x).bI());
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
      dxk $$1 = this.a($$0, dxk.class);
      if (!$$1.c()) {
         throw this.a($$0, "test.error.expected_empty_container");
      }
   }

   public void a(iv $$0, czj $$1) {
      dxk $$2 = this.a($$0, dxk.class);
      if ($$2.a_($$1) != 1) {
         throw this.a($$0, "test.error.expected_container_contents_single", $$1.l());
      }
   }

   public void b(iv $$0, czj $$1) {
      dxk $$2 = this.a($$0, dxk.class);
      if ($$2.a_($$1) == 0) {
         throw this.a($$0, "test.error.expected_container_contents", $$1.l());
      }
   }

   public void a(erf $$0, iv $$1) {
      iv.a($$0).forEach($$2 -> {
         iv $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(iv $$0, iv $$1) {
      eat $$2 = this.a($$0);
      eat $$3 = this.a($$1);
      if ($$2 != $$3) {
         throw this.a($$0, "test.error.state_not_equal", $$3, $$2);
      }
   }

   public void a(long $$0, iv $$1, czj $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, iv $$1) {
      this.a($$0, () -> this.f($$1));
   }

   public <E extends bwi, T> void b(iv $$0, bwr<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bwi $$0, fex $$1, wy $$2) {
      if (!$$1.d(this.b($$0.ds()))) {
         throw this.a($$2);
      }
   }

   public <E extends bwi> void a(E $$0, Predicate<E> $$1, wy $$2) {
      if (!$$1.test($$0)) {
         throw this.a($$0.du(), "test.error.entity_property", $$0.ai(), $$2);
      }
   }

   public <E extends bwi, T> void a(E $$0, Function<E, T> $$1, T $$2, wy $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$2)) {
         throw this.a($$0.du(), "test.error.entity_property_details", $$0.ai(), $$3, $$4, $$2);
      }
   }

   public void a(bxj $$0, jf<bvk> $$1, int $$2) {
      bvm $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         throw this.a("test.error.expected_entity_effect", $$0.ai(), dbj.a($$1, $$2));
      }
   }

   public void e(bwr<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new iv($$1, $$2, $$3));
   }

   public void e(bwr<?> $$0, iv $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bwr<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new iv($$1, $$2, $$3));
   }

   public void f(bwr<?> $$0, iv $$1) {
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
      arq $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void h(iv $$0) {
      iv $$1 = this.j($$0);
      arq $$2 = this.a();
      $$2.a_($$1).a($$2, $$1, $$2.A);
   }

   public void i(iv $$0) {
      iv $$1 = this.j($$0);
      arq $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      fex $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new iv($$4, $$3, $$5));
         }
      }
   }

   public int a(egs.a $$0, int $$1, int $$2) {
      iv $$3 = this.j(new iv($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(wy $$0, iv $$1) {
      throw this.a($$1, $$0);
   }

   public void a(wy $$0, bwi $$1) {
      throw this.a($$1.du(), $$0);
   }

   public void b(wy $$0) {
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
      return evp.a($$2, dru.a, this.a.u(), $$1);
   }

   public iv k(iv $$0) {
      iv $$1 = this.a.d();
      dtl $$2 = this.a.u().a(dtl.c);
      iv $$3 = evp.a($$0, dru.a, $$2, $$1);
      return $$3.b($$1);
   }

   public fex a(fex $$0) {
      ffc $$1 = this.a($$0.h());
      ffc $$2 = this.a($$0.i());
      return new fex($$1, $$2);
   }

   public fex b(fex $$0) {
      ffc $$1 = this.b($$0.h());
      ffc $$2 = this.b($$0.i());
      return new fex($$1, $$2);
   }

   public ffc a(ffc $$0) {
      ffc $$1 = ffc.a(this.a.d());
      return evp.a($$1.e($$0), dru.a, this.a.u(), this.a.d());
   }

   public ffc b(ffc $$0) {
      ffc $$1 = ffc.a(this.a.d());
      return evp.a($$0.d($$1), dru.a, this.a.u(), this.a.d());
   }

   public dtl h() {
      return this.a.u();
   }

   public void a(boolean $$0, wy $$1) {
      if (!$$0) {
         throw this.a($$1);
      }
   }

   public <N> void a(N $$0, N $$1, wy $$2) {
      if (!$$0.equals($$1)) {
         throw this.a("test.error.value_not_equal", $$2, $$0, $$1);
      }
   }

   public void b(boolean $$0, wy $$1) {
      this.a(!$$0, $$1);
   }

   public long i() {
      return (long)this.a.p();
   }

   public fex j() {
      return this.a.e();
   }

   private fex l() {
      fex $$0 = this.a.e();
      dtl $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new fex(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new fex(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<iv> $$0) {
      fex $$1 = this.l().a(1.0, 1.0, 1.0);
      iv.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range((long)this.a.p(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(crm $$0, czn $$1, iv $$2, jb $$3) {
      iv $$4 = this.j($$2.a($$3));
      fey $$5 = new fey(ffc.b($$4), $$3, $$4, false);
      ddi $$6 = new ddi($$0, buf.a, $$5);
      $$1.a($$6);
   }

   public void a(alf<dkp> $$0) {
      fex $$1 = this.j();
      iv $$2 = iv.a($$1.a, $$1.b, $$1.c);
      iv $$3 = iv.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = anl.a(this.a(), $$2, $$3, this.a().F_().f(mh.aG).b($$0));
      if ($$4.right().isPresent()) {
         throw this.a("test.error.set_biome");
      }
   }
}
