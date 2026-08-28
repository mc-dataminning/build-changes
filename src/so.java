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

public class so {
   private final sp a;
   private boolean b;

   public so(sp $$0) {
      this.a = $$0;
   }

   public sh a(ww $$0) {
      return new sh($$0, this.a.p());
   }

   public sh a(String $$0, Object... $$1) {
      return this.a((ww)ww.b($$0, $$1));
   }

   public si a(iu $$0, ww $$1) {
      return new si($$1, this.j($$0), $$0, this.a.p());
   }

   public si a(iu $$0, String $$1, Object... $$2) {
      return this.a($$0, ww.b($$1, $$2));
   }

   public aro a() {
      return this.a.g();
   }

   public dzo a(iu $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dwn> T a(iu $$0, Class<T> $$1) {
      dwn $$2 = this.a().c_(this.j($$0));
      if ($$2 == null) {
         throw this.a($$0, "test.error.missing_block_entity");
      } else if ($$1.isInstance($$2)) {
         return $$1.cast($$2);
      } else {
         throw this.a($$0, "test.error.wrong_block_entity", $$2.p().a().g());
      }
   }

   public void b() {
      this.a(bwa.class);
   }

   public void a(Class<? extends bwa> $$0) {
      fdr $$1 = this.j();
      List<? extends bwa> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cqs));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public cmx a(cyo $$0, fdw $$1) {
      aro $$2 = this.a();
      fdw $$3 = this.a($$1);
      cmx $$4 = new cmx($$2, $$3.d, $$3.e, $$3.f, new cys($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cmx a(cyo $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fdw((double)$$1, (double)$$2, (double)$$3));
   }

   public cmx a(cyo $$0, iu $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bwa> E a(bwj<E> $$0, iu $$1) {
      return this.a($$0, fdw.c($$1));
   }

   public <E extends bwa> E a(bwj<E> $$0, fdw $$1) {
      aro $$2 = this.a();
      E $$3 = $$0.a($$2, bwi.d);
      if ($$3 == null) {
         throw this.a(iu.a((jo)$$1), "test.error.spawn_failure", $$0.r().g());
      } else {
         if ($$3 instanceof bxb $$4) {
            $$4.fY();
         }

         fdw $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dL(), $$3.dN());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bwa $$0, bup $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bwa $$0) {
      $$0.c(this.a());
   }

   public <E extends bwa> E a(bwj<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bwa> E a(bwj<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw this.a("test.error.expected_entity_around", $$0.h(), $$1, $$2, $$3);
      } else if ($$5.size() > 1) {
         throw this.a("test.error.too_many_entities", $$0.i(), $$1, $$2, $$3, $$5.size());
      } else {
         fdw $$6 = this.a(new fdw((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dt().f($$6);
            double $$4x = $$2x.dt().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bwa> List<E> b(bwj<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, fdw.c(new iu($$1, $$2, $$3)), $$4);
   }

   public <E extends bwa> List<E> a(bwj<E> $$0, fdw $$1, double $$2) {
      aro $$3 = this.a();
      fdw $$4 = this.a($$1);
      fdr $$5 = this.a.e();
      fdr $$6 = new fdr($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bK());
   }

   public <E extends bwa> E a(bwj<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new iu($$1, $$2, $$3));
   }

   public <E extends bwa> E a(bwj<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fdw((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bxb> E b(bwj<E> $$0, iu $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends bxb> E b(bwj<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new iu($$1, $$2, $$3));
   }

   public <E extends bxb> E b(bwj<E> $$0, fdw $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends bxb> E b(bwj<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new fdw((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bxb $$0, float $$1, float $$2, float $$3) {
      fdw $$4 = this.a(new fdw((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dL(), $$0.dN());
   }

   public sv a(bxb $$0, iu $$1, float $$2) {
      return this.g().a(2, () -> {
         ewj $$3 = $$0.O().a(this.j($$1), 0);
         $$0.O().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b(new iu($$0, $$1, $$2));
   }

   public void b(iu $$0) {
      this.a(axa.f, $$0);
      iu $$1 = this.j($$0);
      dzo $$2 = this.a().a_($$1);
      dmf $$3 = (dmf)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void c(iu $$0) {
      this.a($$0, this.a(dim.b));
   }

   public void a(iu $$0, cqs $$1) {
      iu $$2 = this.j($$0);
      this.a($$0, $$1, new fds(fdw.b($$2), ja.c, $$2, true));
   }

   public void a(iu $$0, cqs $$1, fds $$2) {
      iu $$3 = this.j($$0);
      dzo $$4 = this.a().a_($$3);
      btx $$5 = btx.a;
      bty $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bty.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            dcn $$7 = new dcn($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bwz a(bwz $$0) {
      $$0.j(0);
      $$0.d(0.25F);
      return $$0;
   }

   public bwz b(bwz $$0) {
      $$0.d(0.25F);
      return $$0;
   }

   public cqs a(final dim $$0) {
      return new cqs(this.a(), iu.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean U_() {
            return $$0 == dim.d;
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
   public arp c() {
      ase $$0 = ase.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      arp $$1 = new arp(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean U_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      vp $$2 = new vp(ze.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.d(new iu($$0, $$1, $$2));
   }

   public void d(iu $$0) {
      this.a(dlw.dI, $$0);
      iu $$1 = this.j($$0);
      dzo $$2 = this.a().a_($$1);
      dql $$3 = (dql)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(iu $$0, long $$1) {
      this.a($$0, dlw.hx);
      this.b($$1, () -> this.a($$0, dlw.a));
   }

   public void e(iu $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dlu $$3) {
      this.a(new iu($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dzo $$3) {
      this.a(new iu($$0, $$1, $$2), $$3);
   }

   public void a(iu $$0, dlu $$1) {
      this.a($$0, $$1.m());
   }

   public void a(iu $$0, dzo $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dlu $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iu($$1, $$2, $$3));
   }

   public void a(dlu $$0, iu $$1) {
      dzo $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), $$1x -> ww.a("test.error.expected_block", $$0.f(), $$1x.f()));
   }

   public void b(dlu $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new iu($$1, $$2, $$3));
   }

   public void b(dlu $$0, iu $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), $$1x -> ww.a("test.error.unexpected_block", $$0.f()));
   }

   public void a(axp<dlu> $$0, iu $$1) {
      this.b($$1, $$1x -> $$1x.a($$0), $$1x -> ww.a("test.error.expected_block_tag", $$0.b(), $$1x.b().f()));
   }

   public void c(dlu $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iu($$1, $$2, $$3));
   }

   public void c(dlu $$0, iu $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(iu $$0, Predicate<dlu> $$1, Function<dlu, ww> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$1x -> $$2.apply($$1x.b()));
   }

   public <T extends Comparable<T>> void a(iu $$0, ear<T> $$1, T $$2) {
      dzo $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4) {
         throw this.a($$0, "test.error.block_property_missing", $$1.f(), $$2);
      } else if (!$$3.<T>c($$1).equals($$2)) {
         throw this.a($$0, "test.error.block_property_mismatch", $$1.f(), $$2, $$3.c($$1));
      }
   }

   public <T extends Comparable<T>> void a(iu $$0, ear<T> $$1, Predicate<T> $$2, ww $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, $$1x -> $$3);
   }

   public void b(iu $$0, dzo $$1) {
      dzo $$2 = this.a($$0);
      if (!$$2.equals($$1)) {
         throw this.a($$0, "test.error.state_not_equal", $$1, $$2);
      }
   }

   public void b(iu $$0, Predicate<dzo> $$1, Function<dzo, ww> $$2) {
      dzo $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw this.a($$0, $$2.apply($$3));
      }
   }

   public <T extends dwn> void a(iu $$0, Class<T> $$1, Predicate<T> $$2, Supplier<ww> $$3) {
      T $$4 = this.a($$0, $$1);
      if (!$$2.test($$4)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void a(iu $$0, ja $$1, IntPredicate $$2, Supplier<ww> $$3) {
      iu $$4 = this.j($$0);
      aro $$5 = this.a();
      dzo $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void b(bwj<?> $$0) {
      List<? extends bwa> $$1 = this.a().a($$0, this.j(), bwa::bK);
      if ($$1.isEmpty()) {
         throw this.a("test.error.expected_entity_in_test", $$0.h());
      }
   }

   public void c(bwj<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iu($$1, $$2, $$3));
   }

   public void c(bwj<?> $$0, iu $$1) {
      iu $$2 = this.j($$1);
      List<? extends bwa> $$3 = this.a().a($$0, new fdr($$2), bwa::bK);
      if ($$3.isEmpty()) {
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bwj<?> $$0, fdr $$1) {
      fdr $$2 = this.a($$1);
      List<? extends bwa> $$3 = this.a().a($$0, $$2, bwa::bK);
      if ($$3.isEmpty()) {
         throw this.a(iu.a((jo)$$1.f()), "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bwj<?> $$0, int $$1) {
      List<? extends bwa> $$2 = this.a().a($$0, this.j(), bwa::bK);
      if ($$2.size() != $$1) {
         throw this.a("test.error.expected_entity_count", $$1, $$0.h(), $$2.size());
      }
   }

   public void a(bwj<?> $$0, iu $$1, int $$2, double $$3) {
      iu $$4 = this.j($$1);
      List<? extends bwa> $$5 = this.b((bwj<? extends bwa>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw this.a($$1, "test.error.expected_entity_count", $$2, $$0.h(), $$5.size());
      }
   }

   public void a(bwj<?> $$0, iu $$1, double $$2) {
      List<? extends bwa> $$3 = this.b((bwj<? extends bwa>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         iu $$4 = this.j($$1);
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public <T extends bwa> List<T> b(bwj<T> $$0, iu $$1, double $$2) {
      iu $$3 = this.j($$1);
      return this.a().a($$0, new fdr($$3).g($$2), bwa::bK);
   }

   public <T extends bwa> List<T> c(bwj<T> $$0) {
      return this.a().a($$0, this.j(), bwa::bK);
   }

   public void a(bwa $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iu($$1, $$2, $$3));
   }

   public void a(bwa $$0, iu $$1) {
      iu $$2 = this.j($$1);
      List<? extends bwa> $$3 = this.a().a($$0.aq(), new fdr($$2), bwa::bK);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> this.a($$1, "test.error.expected_entity", $$0.aq().h()));
   }

   public void a(cyo $$0, iu $$1, double $$2, int $$3) {
      iu $$4 = this.j($$1);
      List<cmx> $$5 = this.a().a(bwj.aq, new fdr($$4).g($$2), bwa::bK);
      int $$6 = 0;

      for (cmx $$7 : $$5) {
         cys $$8 = $$7.f();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw this.a($$1, "test.error.expected_items_count", $$3, $$0.l(), $$6);
      }
   }

   public void a(cyo $$0, iu $$1, double $$2) {
      iu $$3 = this.j($$1);

      for (bwa $$5 : this.a().a(bwj.aq, new fdr($$3).g($$2), bwa::bK)) {
         cmx $$6 = (cmx)$$5;
         if ($$6.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a($$1, "test.error.expected_item", $$0.l());
   }

   public void b(cyo $$0, iu $$1, double $$2) {
      iu $$3 = this.j($$1);

      for (bwa $$5 : this.a().a(bwj.aq, new fdr($$3).g($$2), bwa::bK)) {
         cmx $$6 = (cmx)$$5;
         if ($$6.f().h().equals($$0)) {
            throw this.a($$1, "test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void a(cyo $$0) {
      for (bwa $$2 : this.a().a(bwj.aq, this.j(), bwa::bK)) {
         cmx $$3 = (cmx)$$2;
         if ($$3.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a("test.error.expected_item", $$0.l());
   }

   public void b(cyo $$0) {
      for (bwa $$2 : this.a().a(bwj.aq, this.j(), bwa::bK)) {
         cmx $$3 = (cmx)$$2;
         if ($$3.f().h().equals($$0)) {
            throw this.a("test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void d(bwj<?> $$0) {
      List<? extends bwa> $$1 = this.a().a($$0, this.j(), bwa::bK);
      if (!$$1.isEmpty()) {
         throw this.a($$1.getFirst().dv(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void d(bwj<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new iu($$1, $$2, $$3));
   }

   public void d(bwj<?> $$0, iu $$1) {
      iu $$2 = this.j($$1);
      List<? extends bwa> $$3 = this.a().a($$0, new fdr($$2), bwa::bK);
      if (!$$3.isEmpty()) {
         throw this.a($$1, "test.error.unexpected_entity", $$0.h());
      }
   }

   public void b(bwj<?> $$0, fdr $$1) {
      fdr $$2 = this.a($$1);
      List<? extends bwa> $$3 = this.a().a($$0, $$2, bwa::bK);
      if (!$$3.isEmpty()) {
         throw this.a($$3.getFirst().dv(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void a(bwj<?> $$0, double $$1, double $$2, double $$3) {
      fdw $$4 = new fdw($$1, $$2, $$3);
      fdw $$5 = this.a($$4);
      Predicate<? super bwa> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bwa> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public void b(bwj<?> $$0, double $$1, double $$2, double $$3) {
      fdw $$4 = new fdw($$1, $$2, $$3);
      fdw $$5 = this.a($$4);
      Predicate<? super bwa> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bwa> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_not_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public <E extends bwa, T> void a(iu $$0, bwj<E> $$1, Predicate<E> $$2) {
      iu $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fdr($$3), bwa::bK);
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

   public <E extends bwa, T> void a(iu $$0, bwj<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      iu $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new fdr($$4), bwa::bK);
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

   public <E extends bwz> void a(iu $$0, bwj<E> $$1, cyo $$2) {
      iu $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fdr($$3), bwa::bK);
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

   public <E extends bwa & cqc> void b(iu $$0, bwj<E> $$1, cyo $$2) {
      iu $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fdr($$3), $$0x -> ((bwa)$$0x).bK());
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

   public void f(iu $$0) {
      dwg $$1 = this.a($$0, dwg.class);
      if (!$$1.c()) {
         throw this.a($$0, "test.error.expected_empty_container");
      }
   }

   public void a(iu $$0, cyo $$1) {
      dwg $$2 = this.a($$0, dwg.class);
      if ($$2.a_($$1) != 1) {
         throw this.a($$0, "test.error.expected_container_contents_single", $$1.l());
      }
   }

   public void b(iu $$0, cyo $$1) {
      dwg $$2 = this.a($$0, dwg.class);
      if ($$2.a_($$1) == 0) {
         throw this.a($$0, "test.error.expected_container_contents", $$1.l());
      }
   }

   public void a(eqa $$0, iu $$1) {
      iu.a($$0).forEach($$2 -> {
         iu $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(iu $$0, iu $$1) {
      dzo $$2 = this.a($$0);
      dzo $$3 = this.a($$1);
      if ($$2 != $$3) {
         throw this.a($$0, "test.error.state_not_equal", $$3, $$2);
      }
   }

   public void a(long $$0, iu $$1, cyo $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, iu $$1) {
      this.a($$0, () -> this.f($$1));
   }

   public <E extends bwa, T> void b(iu $$0, bwj<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bwa $$0, fdr $$1, ww $$2) {
      if (!$$1.d(this.b($$0.dt()))) {
         throw this.a($$2);
      }
   }

   public <E extends bwa> void a(E $$0, Predicate<E> $$1, ww $$2) {
      if (!$$1.test($$0)) {
         throw this.a($$0.dv(), "test.error.entity_property", $$0.al(), $$2);
      }
   }

   public <E extends bwa, T> void a(E $$0, Function<E, T> $$1, T $$2, ww $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$2)) {
         throw this.a($$0.dv(), "test.error.entity_property_details", $$0.al(), $$3, $$4, $$2);
      }
   }

   public void a(bwz $$0, je<bvc> $$1, int $$2) {
      bve $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         throw this.a("test.error.expected_entity_effect", $$0.al(), dao.a($$1, $$2));
      }
   }

   public void e(bwj<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new iu($$1, $$2, $$3));
   }

   public void e(bwj<?> $$0, iu $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bwj<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new iu($$1, $$2, $$3));
   }

   public void f(bwj<?> $$0, iu $$1) {
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

   public void g(iu $$0) {
      iu $$1 = this.j($$0);
      aro $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void h(iu $$0) {
      iu $$1 = this.j($$0);
      aro $$2 = this.a();
      $$2.a_($$1).a($$2, $$1, $$2.A);
   }

   public void i(iu $$0) {
      iu $$1 = this.j($$0);
      aro $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      fdr $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new iu($$4, $$3, $$5));
         }
      }
   }

   public int a(efn.a $$0, int $$1, int $$2) {
      iu $$3 = this.j(new iu($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(ww $$0, iu $$1) {
      throw this.a($$1, $$0);
   }

   public void a(ww $$0, bwa $$1) {
      throw this.a($$1.dv(), $$0);
   }

   public void b(ww $$0) {
      throw this.a($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> this.a("test.error.fail"));
   }

   public void d(Runnable $$0) {
      LongStream.range((long)this.a.p(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public sv g() {
      return this.a.q();
   }

   public iu j(iu $$0) {
      iu $$1 = this.a.d();
      iu $$2 = $$1.a((jz)$$0);
      return euk.a($$2, dqv.a, this.a.u(), $$1);
   }

   public iu k(iu $$0) {
      iu $$1 = this.a.d();
      dsm $$2 = this.a.u().a(dsm.c);
      iu $$3 = euk.a($$0, dqv.a, $$2, $$1);
      return $$3.b($$1);
   }

   public fdr a(fdr $$0) {
      fdw $$1 = this.a($$0.h());
      fdw $$2 = this.a($$0.i());
      return new fdr($$1, $$2);
   }

   public fdr b(fdr $$0) {
      fdw $$1 = this.b($$0.h());
      fdw $$2 = this.b($$0.i());
      return new fdr($$1, $$2);
   }

   public fdw a(fdw $$0) {
      fdw $$1 = fdw.a(this.a.d());
      return euk.a($$1.e($$0), dqv.a, this.a.u(), this.a.d());
   }

   public fdw b(fdw $$0) {
      fdw $$1 = fdw.a(this.a.d());
      return euk.a($$0.d($$1), dqv.a, this.a.u(), this.a.d());
   }

   public dsm h() {
      return this.a.u();
   }

   public void a(boolean $$0, ww $$1) {
      if (!$$0) {
         throw this.a($$1);
      }
   }

   public <N> void a(N $$0, N $$1, ww $$2) {
      if (!$$0.equals($$1)) {
         throw this.a("test.error.value_not_equal", $$2, $$0, $$1);
      }
   }

   public void b(boolean $$0, ww $$1) {
      this.a(!$$0, $$1);
   }

   public long i() {
      return (long)this.a.p();
   }

   public fdr j() {
      return this.a.e();
   }

   private fdr l() {
      fdr $$0 = this.a.e();
      dsm $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new fdr(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new fdr(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<iu> $$0) {
      fdr $$1 = this.l().a(1.0, 1.0, 1.0);
      iu.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range((long)this.a.p(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cqs $$0, cys $$1, iu $$2, ja $$3) {
      iu $$4 = this.j($$2.a($$3));
      fds $$5 = new fds(fdw.b($$4), $$3, $$4, false);
      dcn $$6 = new dcn($$0, btx.a, $$5);
      $$1.a($$6);
   }

   public void a(ald<djs> $$0) {
      fdr $$1 = this.j();
      iu $$2 = iu.a($$1.a, $$1.b, $$1.c);
      iu $$3 = iu.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = anj.a(this.a(), $$2, $$3, this.a().F_().f(mg.aG).b($$0));
      if ($$4.right().isPresent()) {
         throw this.a("test.error.set_biome");
      }
   }
}
