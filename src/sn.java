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

public class sn {
   private final so a;
   private boolean b;

   public sn(so $$0) {
      this.a = $$0;
   }

   public sg a(wv $$0) {
      return new sg($$0, this.a.p());
   }

   public sg a(String $$0, Object... $$1) {
      return this.a((wv)wv.b($$0, $$1));
   }

   public sh a(jj $$0, wv $$1) {
      return new sh($$1, this.j($$0), $$0, this.a.p());
   }

   public sh a(jj $$0, String $$1, Object... $$2) {
      return this.a($$0, wv.b($$1, $$2));
   }

   public arn a() {
      return this.a.g();
   }

   public dym a(jj $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dvl> T a(jj $$0, Class<T> $$1) {
      dvl $$2 = this.a().c_(this.j($$0));
      if ($$2 == null) {
         throw this.a($$0, "test.error.missing_block_entity");
      } else if ($$1.isInstance($$2)) {
         return $$1.cast($$2);
      } else {
         throw this.a($$0, "test.error.wrong_block_entity", $$2.p().a().g());
      }
   }

   public void b() {
      this.a(bvs.class);
   }

   public void a(Class<? extends bvs> $$0) {
      fcp $$1 = this.j();
      List<? extends bvs> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cqi));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public cmn a(cxu $$0, fcu $$1) {
      arn $$2 = this.a();
      fcu $$3 = this.a($$1);
      cmn $$4 = new cmn($$2, $$3.d, $$3.e, $$3.f, new cxy($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cmn a(cxu $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fcu((double)$$1, (double)$$2, (double)$$3));
   }

   public cmn a(cxu $$0, jj $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bvs> E a(bwb<E> $$0, jj $$1) {
      return this.a($$0, fcu.c($$1));
   }

   public <E extends bvs> E a(bwb<E> $$0, fcu $$1) {
      arn $$2 = this.a();
      E $$3 = $$0.a($$2, bwa.d);
      if ($$3 == null) {
         throw this.a(jj.a((kc)$$1), "test.error.spawn_failure", $$0.r().g());
      } else {
         if ($$3 instanceof bwt $$4) {
            $$4.fY();
         }

         fcu $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dL(), $$3.dN());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bvs $$0, buh $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bvs $$0) {
      $$0.c(this.a());
   }

   public <E extends bvs> E a(bwb<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bvs> E a(bwb<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw this.a("test.error.expected_entity_at_pos", $$0.h(), $$1, $$2, $$3);
      } else if ($$5.size() > 1) {
         throw this.a("test.error.too_many_entities", $$0.i(), $$1, $$2, $$3, $$5.size());
      } else {
         fcu $$6 = this.a(new fcu((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dt().f($$6);
            double $$4x = $$2x.dt().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bvs> List<E> b(bwb<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, fcu.c(new jj($$1, $$2, $$3)), $$4);
   }

   public <E extends bvs> List<E> a(bwb<E> $$0, fcu $$1, double $$2) {
      arn $$3 = this.a();
      fcu $$4 = this.a($$1);
      fcp $$5 = this.a.e();
      fcp $$6 = new fcp($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bK());
   }

   public <E extends bvs> E a(bwb<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jj($$1, $$2, $$3));
   }

   public <E extends bvs> E a(bwb<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fcu((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bwt> E b(bwb<E> $$0, jj $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends bwt> E b(bwb<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jj($$1, $$2, $$3));
   }

   public <E extends bwt> E b(bwb<E> $$0, fcu $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends bwt> E b(bwb<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new fcu((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bwt $$0, float $$1, float $$2, float $$3) {
      fcu $$4 = this.a(new fcu((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dL(), $$0.dN());
   }

   public su a(bwt $$0, jj $$1, float $$2) {
      return this.g().a(2, () -> {
         evh $$3 = $$0.O().a(this.j($$1), 0);
         $$0.O().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b(new jj($$0, $$1, $$2));
   }

   public void b(jj $$0) {
      this.a(awz.f, $$0);
      jj $$1 = this.j($$0);
      dym $$2 = this.a().a_($$1);
      dlf $$3 = (dlf)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void c(jj $$0) {
      this.a($$0, this.a(dhm.b));
   }

   public void a(jj $$0, cqi $$1) {
      jj $$2 = this.j($$0);
      this.a($$0, $$1, new fcq(fcu.b($$2), jo.c, $$2, true));
   }

   public void a(jj $$0, cqi $$1, fcq $$2) {
      jj $$3 = this.j($$0);
      dym $$4 = this.a().a_($$3);
      btp $$5 = btp.a;
      btq $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof btq.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            dbp $$7 = new dbp($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bwr a(bwr $$0) {
      $$0.j(0);
      $$0.d(0.25F);
      return $$0;
   }

   public bwr b(bwr $$0) {
      $$0.d(0.25F);
      return $$0;
   }

   public cqi a(final dhm $$0) {
      return new cqi(this.a(), jj.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean U_() {
            return $$0 == dhm.d;
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
   public aro c() {
      asd $$0 = asd.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aro $$1 = new aro(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean U_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      vo $$2 = new vo(zd.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.d(new jj($$0, $$1, $$2));
   }

   public void d(jj $$0) {
      this.a(dkw.dI, $$0);
      jj $$1 = this.j($$0);
      dym $$2 = this.a().a_($$1);
      dpl $$3 = (dpl)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jj $$0, long $$1) {
      this.a($$0, dkw.hx);
      this.b($$1, () -> this.a($$0, dkw.a));
   }

   public void e(jj $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dku $$3) {
      this.a(new jj($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dym $$3) {
      this.a(new jj($$0, $$1, $$2), $$3);
   }

   public void a(jj $$0, dku $$1) {
      this.a($$0, $$1.m());
   }

   public void a(jj $$0, dym $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dku $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jj($$1, $$2, $$3));
   }

   public void a(dku $$0, jj $$1) {
      dym $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), $$1x -> wv.a("test.error.expected_block", $$0.f(), $$1x.f()));
   }

   public void b(dku $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jj($$1, $$2, $$3));
   }

   public void b(dku $$0, jj $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), $$1x -> wv.a("test.error.unexpected_block", $$0.f()));
   }

   public void a(axp<dku> $$0, jj $$1) {
      this.b($$1, $$1x -> $$1x.a($$0), $$1x -> wv.a("test.error.expected_block_tag", $$0.b(), $$1x.b().f()));
   }

   public void c(dku $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jj($$1, $$2, $$3));
   }

   public void c(dku $$0, jj $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jj $$0, Predicate<dku> $$1, Function<dku, wv> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$1x -> $$2.apply($$1x.b()));
   }

   public <T extends Comparable<T>> void a(jj $$0, dzp<T> $$1, T $$2) {
      dym $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4) {
         throw this.a($$0, "test.error.block_property_missing", $$1.f(), $$2);
      } else if (!$$3.<T>c($$1).equals($$2)) {
         throw this.a($$0, "test.error.block_property_mismatch", $$1.f(), $$2, $$3.c($$1));
      }
   }

   public <T extends Comparable<T>> void a(jj $$0, dzp<T> $$1, Predicate<T> $$2, wv $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, $$1x -> $$3);
   }

   public void b(jj $$0, dym $$1) {
      dym $$2 = this.a($$0);
      if (!$$2.equals($$1)) {
         throw this.a($$0, "test.error.state_not_equal", $$1, $$2);
      }
   }

   public void b(jj $$0, Predicate<dym> $$1, Function<dym, wv> $$2) {
      dym $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw this.a($$0, $$2.apply($$3));
      }
   }

   public <T extends dvl> void a(jj $$0, Class<T> $$1, Predicate<T> $$2, Supplier<wv> $$3) {
      T $$4 = this.a($$0, $$1);
      if (!$$2.test($$4)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void a(jj $$0, jo $$1, IntPredicate $$2, Supplier<wv> $$3) {
      jj $$4 = this.j($$0);
      arn $$5 = this.a();
      dym $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void b(bwb<?> $$0) {
      List<? extends bvs> $$1 = this.a().a($$0, this.j(), bvs::bK);
      if ($$1.isEmpty()) {
         throw this.a("test.error.expected_entity_in_test", $$0.h());
      }
   }

   public void c(bwb<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jj($$1, $$2, $$3));
   }

   public void c(bwb<?> $$0, jj $$1) {
      jj $$2 = this.j($$1);
      List<? extends bvs> $$3 = this.a().a($$0, new fcp($$2), bvs::bK);
      if ($$3.isEmpty()) {
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bwb<?> $$0, fcp $$1) {
      fcp $$2 = this.a($$1);
      List<? extends bvs> $$3 = this.a().a($$0, $$2, bvs::bK);
      if ($$3.isEmpty()) {
         throw this.a(jj.a((kc)$$1.f()), "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bwb<?> $$0, int $$1) {
      List<? extends bvs> $$2 = this.a().a($$0, this.j(), bvs::bK);
      if ($$2.size() != $$1) {
         throw this.a("test.error.expected_entity_count", $$1, $$0.h(), $$2.size());
      }
   }

   public void a(bwb<?> $$0, jj $$1, int $$2, double $$3) {
      jj $$4 = this.j($$1);
      List<? extends bvs> $$5 = this.b((bwb<? extends bvs>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw this.a($$1, "test.error.expected_entity_count", $$2, $$0.h(), $$5.size());
      }
   }

   public void a(bwb<?> $$0, jj $$1, double $$2) {
      List<? extends bvs> $$3 = this.b((bwb<? extends bvs>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jj $$4 = this.j($$1);
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public <T extends bvs> List<T> b(bwb<T> $$0, jj $$1, double $$2) {
      jj $$3 = this.j($$1);
      return this.a().a($$0, new fcp($$3).g($$2), bvs::bK);
   }

   public <T extends bvs> List<T> c(bwb<T> $$0) {
      return this.a().a($$0, this.j(), bvs::bK);
   }

   public void a(bvs $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jj($$1, $$2, $$3));
   }

   public void a(bvs $$0, jj $$1) {
      jj $$2 = this.j($$1);
      List<? extends bvs> $$3 = this.a().a($$0.aq(), new fcp($$2), bvs::bK);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> this.a($$1, "test.error.expected_entity", $$0.aq().h()));
   }

   public void a(cxu $$0, jj $$1, double $$2, int $$3) {
      jj $$4 = this.j($$1);
      List<cmn> $$5 = this.a().a(bwb.aq, new fcp($$4).g($$2), bvs::bK);
      int $$6 = 0;

      for (cmn $$7 : $$5) {
         cxy $$8 = $$7.f();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw this.a($$1, "test.error.expected_items_count", $$3, $$0.m(), $$6);
      }
   }

   public void a(cxu $$0, jj $$1, double $$2) {
      jj $$3 = this.j($$1);

      for (bvs $$5 : this.a().a(bwb.aq, new fcp($$3).g($$2), bvs::bK)) {
         cmn $$6 = (cmn)$$5;
         if ($$6.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a($$1, "test.error.expected_item", $$0.m());
   }

   public void b(cxu $$0, jj $$1, double $$2) {
      jj $$3 = this.j($$1);

      for (bvs $$5 : this.a().a(bwb.aq, new fcp($$3).g($$2), bvs::bK)) {
         cmn $$6 = (cmn)$$5;
         if ($$6.f().h().equals($$0)) {
            throw this.a($$1, "test.error.unexpected_item", $$0.m());
         }
      }
   }

   public void a(cxu $$0) {
      for (bvs $$2 : this.a().a(bwb.aq, this.j(), bvs::bK)) {
         cmn $$3 = (cmn)$$2;
         if ($$3.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a("test.error.expected_item", $$0.m());
   }

   public void b(cxu $$0) {
      for (bvs $$2 : this.a().a(bwb.aq, this.j(), bvs::bK)) {
         cmn $$3 = (cmn)$$2;
         if ($$3.f().h().equals($$0)) {
            throw this.a("test.error.unexpected_item", $$0.m());
         }
      }
   }

   public void d(bwb<?> $$0) {
      List<? extends bvs> $$1 = this.a().a($$0, this.j(), bvs::bK);
      if (!$$1.isEmpty()) {
         throw this.a($$1.getFirst().dv(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void d(bwb<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jj($$1, $$2, $$3));
   }

   public void d(bwb<?> $$0, jj $$1) {
      jj $$2 = this.j($$1);
      List<? extends bvs> $$3 = this.a().a($$0, new fcp($$2), bvs::bK);
      if (!$$3.isEmpty()) {
         throw this.a($$1, "test.error.unexpected_entity", $$0.h());
      }
   }

   public void b(bwb<?> $$0, fcp $$1) {
      fcp $$2 = this.a($$1);
      List<? extends bvs> $$3 = this.a().a($$0, $$2, bvs::bK);
      if (!$$3.isEmpty()) {
         throw this.a($$3.getFirst().dv(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void a(bwb<?> $$0, double $$1, double $$2, double $$3) {
      fcu $$4 = new fcu($$1, $$2, $$3);
      fcu $$5 = this.a($$4);
      Predicate<? super bvs> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bvs> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public void b(bwb<?> $$0, double $$1, double $$2, double $$3) {
      fcu $$4 = new fcu($$1, $$2, $$3);
      fcu $$5 = this.a($$4);
      Predicate<? super bvs> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bvs> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_not_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public <E extends bvs, T> void a(jj $$0, bwb<E> $$1, Predicate<E> $$2) {
      jj $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fcp($$3), bvs::bK);
      if ($$4.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw this.a($$5.dv(), "test.error.expected_entity_data_predicate", $$5.al());
            }
         }
      }
   }

   public <E extends bvs, T> void a(jj $$0, bwb<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jj $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new fcp($$4), bvs::bK);
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

   public <E extends bwr> void a(jj $$0, bwb<E> $$1, cxu $$2) {
      jj $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fcp($$3), bvs::bK);
      if ($$4.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw this.a($$0, "test.error.expected_entity_holding", $$2.m());
      }
   }

   public <E extends bvs & cps> void b(jj $$0, bwb<E> $$1, cxu $$2) {
      jj $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fcp($$3), $$0x -> ((bvs)$$0x).bK());
      if ($$4.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.n().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw this.a($$0, "test.error.expected_entity_having", $$2.m());
      }
   }

   public void f(jj $$0) {
      dve $$1 = this.a($$0, dve.class);
      if (!$$1.c()) {
         throw this.a($$0, "test.error.expected_empty_container");
      }
   }

   public void a(jj $$0, cxu $$1) {
      dve $$2 = this.a($$0, dve.class);
      if ($$2.a_($$1) != 1) {
         throw this.a($$0, "test.error.expected_container_contents_single", $$1.m());
      }
   }

   public void b(jj $$0, cxu $$1) {
      dve $$2 = this.a($$0, dve.class);
      if ($$2.a_($$1) == 0) {
         throw this.a($$0, "test.error.expected_container_contents", $$1.m());
      }
   }

   public void a(eoy $$0, jj $$1) {
      jj.a($$0).forEach($$2 -> {
         jj $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jj $$0, jj $$1) {
      dym $$2 = this.a($$0);
      dym $$3 = this.a($$1);
      if ($$2 != $$3) {
         throw this.a($$0, "test.error.state_not_equal", $$3, $$2);
      }
   }

   public void a(long $$0, jj $$1, cxu $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jj $$1) {
      this.a($$0, () -> this.f($$1));
   }

   public <E extends bvs, T> void b(jj $$0, bwb<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bvs $$0, fcp $$1, wv $$2) {
      if (!$$1.d(this.b($$0.dt()))) {
         throw this.a($$2);
      }
   }

   public <E extends bvs> void a(E $$0, Predicate<E> $$1, wv $$2) {
      if (!$$1.test($$0)) {
         throw this.a($$0.dv(), "test.error.entity_property", $$0.al(), $$2);
      }
   }

   public <E extends bvs, T> void a(E $$0, Function<E, T> $$1, T $$2, wv $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$2)) {
         throw this.a($$0.dv(), "test.error.entity_property_details", $$0.al(), $$3, $$4, $$2);
      }
   }

   public void a(bwr $$0, js<buu> $$1, int $$2) {
      buw $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         throw this.a("test.error.expected_entity_effect", $$0.al(), czu.a($$1, $$2));
      }
   }

   public void e(bwb<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jj($$1, $$2, $$3));
   }

   public void e(bwb<?> $$0, jj $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bwb<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jj($$1, $$2, $$3));
   }

   public void f(bwb<?> $$0, jj $$1) {
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

   public void g(jj $$0) {
      jj $$1 = this.j($$0);
      arn $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void h(jj $$0) {
      jj $$1 = this.j($$0);
      arn $$2 = this.a();
      $$2.a_($$1).a($$2, $$1, $$2.A);
   }

   public void i(jj $$0) {
      jj $$1 = this.j($$0);
      arn $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      fcp $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jj($$4, $$3, $$5));
         }
      }
   }

   public int a(eel.a $$0, int $$1, int $$2) {
      jj $$3 = this.j(new jj($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(wv $$0, jj $$1) {
      throw this.a($$1, $$0);
   }

   public void a(wv $$0, bvs $$1) {
      throw this.a($$1.dv(), $$0);
   }

   public void b(wv $$0) {
      throw this.a($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> this.a("test.error.fail"));
   }

   public void d(Runnable $$0) {
      LongStream.range((long)this.a.p(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public su g() {
      return this.a.q();
   }

   public jj j(jj $$0) {
      jj $$1 = this.a.d();
      jj $$2 = $$1.a((kn)$$0);
      return eti.a($$2, dpv.a, this.a.u(), $$1);
   }

   public jj k(jj $$0) {
      jj $$1 = this.a.d();
      drm $$2 = this.a.u().a(drm.c);
      jj $$3 = eti.a($$0, dpv.a, $$2, $$1);
      return $$3.b($$1);
   }

   public fcp a(fcp $$0) {
      fcu $$1 = this.a($$0.h());
      fcu $$2 = this.a($$0.i());
      return new fcp($$1, $$2);
   }

   public fcp b(fcp $$0) {
      fcu $$1 = this.b($$0.h());
      fcu $$2 = this.b($$0.i());
      return new fcp($$1, $$2);
   }

   public fcu a(fcu $$0) {
      fcu $$1 = fcu.a(this.a.d());
      return eti.a($$1.e($$0), dpv.a, this.a.u(), this.a.d());
   }

   public fcu b(fcu $$0) {
      fcu $$1 = fcu.a(this.a.d());
      return eti.a($$0.d($$1), dpv.a, this.a.u(), this.a.d());
   }

   public drm h() {
      return this.a.u();
   }

   public void a(boolean $$0, wv $$1) {
      if (!$$0) {
         throw this.a($$1);
      }
   }

   public <N> void a(N $$0, N $$1, wv $$2) {
      if (!$$0.equals($$1)) {
         throw this.a("test.error.value_not_equal", $$2, $$0, $$1);
      }
   }

   public void b(boolean $$0, wv $$1) {
      this.a(!$$0, $$1);
   }

   public long i() {
      return (long)this.a.p();
   }

   public fcp j() {
      return this.a.e();
   }

   private fcp l() {
      fcp $$0 = this.a.e();
      drm $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new fcp(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new fcp(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<jj> $$0) {
      fcp $$1 = this.l().a(1.0, 1.0, 1.0);
      jj.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range((long)this.a.p(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cqi $$0, cxy $$1, jj $$2, jo $$3) {
      jj $$4 = this.j($$2.a($$3));
      fcq $$5 = new fcq(fcu.b($$4), $$3, $$4, false);
      dbp $$6 = new dbp($$0, btp.a, $$5);
      $$1.a($$6);
   }

   public void a(alc<dis> $$0) {
      fcp $$1 = this.j();
      jj $$2 = jj.a($$1.a, $$1.b, $$1.c);
      jj $$3 = jj.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ani.a(this.a(), $$2, $$3, this.a().F_().f(me.aM).b($$0));
      if ($$4.right().isPresent()) {
         throw this.a("test.error.set_biome");
      }
   }
}
