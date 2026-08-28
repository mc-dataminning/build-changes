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

public class sq {
   private final sr a;
   private boolean b;

   public sq(sr $$0) {
      this.a = $$0;
   }

   public si a(xg $$0) {
      return new si($$0, this.a.p());
   }

   public si a(String $$0, Object... $$1) {
      return this.a((xg)xg.b($$0, $$1));
   }

   public sj a(iw $$0, xg $$1) {
      return new sj($$1, this.j($$0), $$0, this.a.p());
   }

   public sj a(iw $$0, String $$1, Object... $$2) {
      return this.a($$0, xg.b($$1, $$2));
   }

   public asb a() {
      return this.a.g();
   }

   public ebq a(iw $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dyo> T a(iw $$0, Class<T> $$1) {
      dyo $$2 = this.a().c_(this.j($$0));
      if ($$2 == null) {
         throw this.a($$0, "test.error.missing_block_entity");
      } else if ($$1.isInstance($$2)) {
         return $$1.cast($$2);
      } else {
         throw this.a($$0, "test.error.wrong_block_entity", $$2.p().a().g());
      }
   }

   public void b() {
      this.a(bxe.class);
   }

   public void a(Class<? extends bxe> $$0) {
      ffx $$1 = this.j();
      List<? extends bxe> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof csi));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public coo a(dag $$0, fgc $$1) {
      asb $$2 = this.a();
      fgc $$3 = this.a($$1);
      coo $$4 = new coo($$2, $$3.d, $$3.e, $$3.f, new dak($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public coo a(dag $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fgc((double)$$1, (double)$$2, (double)$$3));
   }

   public coo a(dag $$0, iw $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bxe> E a(bxn<E> $$0, iw $$1) {
      return this.a($$0, fgc.c($$1));
   }

   public <E extends bxe> E a(bxn<E> $$0, fgc $$1) {
      asb $$2 = this.a();
      E $$3 = $$0.a($$2, bxm.d);
      if ($$3 == null) {
         throw this.a(iw.a((jq)$$1), "test.error.spawn_failure", $$0.r().g());
      } else {
         if ($$3 instanceof byh $$4) {
            $$4.gc();
         }

         fgc $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dL(), $$3.dN());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bxe $$0, bvt $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bxe $$0) {
      $$0.c(this.a());
   }

   public <E extends bxe> E a(bxn<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bxe> E a(bxn<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw this.a("test.error.expected_entity_around", $$0.h(), $$1, $$2, $$3);
      } else if ($$5.size() > 1) {
         throw this.a("test.error.too_many_entities", $$0.i(), $$1, $$2, $$3, $$5.size());
      } else {
         fgc $$6 = this.a(new fgc((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dt().f($$6);
            double $$4x = $$2x.dt().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bxe> List<E> b(bxn<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, fgc.c(new iw($$1, $$2, $$3)), $$4);
   }

   public <E extends bxe> List<E> a(bxn<E> $$0, fgc $$1, double $$2) {
      asb $$3 = this.a();
      fgc $$4 = this.a($$1);
      ffx $$5 = this.a.e();
      ffx $$6 = new ffx($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bJ());
   }

   public <E extends bxe> E a(bxn<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new iw($$1, $$2, $$3));
   }

   public <E extends bxe> E a(bxn<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fgc((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends byh> E b(bxn<E> $$0, iw $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gp();
      return $$2;
   }

   public <E extends byh> E b(bxn<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new iw($$1, $$2, $$3));
   }

   public <E extends byh> E b(bxn<E> $$0, fgc $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gp();
      return $$2;
   }

   public <E extends byh> E b(bxn<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new fgc((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(byh $$0, float $$1, float $$2, float $$3) {
      fgc $$4 = this.a(new fgc((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dL(), $$0.dN());
   }

   public sx a(byh $$0, iw $$1, float $$2) {
      return this.g().a(2, () -> {
         eyo $$3 = $$0.O().a(this.j($$1), 0);
         $$0.O().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b(new iw($$0, $$1, $$2));
   }

   public void b(iw $$0) {
      this.a(axn.f, $$0);
      iw $$1 = this.j($$0);
      ebq $$2 = this.a().a_($$1);
      dnz $$3 = (dnz)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void c(iw $$0) {
      this.a($$0, this.a(dkg.b));
   }

   public void a(iw $$0, csi $$1) {
      iw $$2 = this.j($$0);
      this.a($$0, $$1, new ffy(fgc.b($$2), jc.c, $$2, true));
   }

   public void a(iw $$0, csi $$1, ffy $$2) {
      iw $$3 = this.j($$0);
      ebq $$4 = this.a().a_($$3);
      bvb $$5 = bvb.a;
      bvc $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bvc.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            def $$7 = new def($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public byf a(byf $$0) {
      $$0.j(0);
      $$0.d(0.25F);
      return $$0;
   }

   public byf b(byf $$0) {
      $$0.d(0.25F);
      return $$0;
   }

   public csi a(final dkg $$0) {
      return new csi(this.a(), iw.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean aa_() {
            return $$0 == dkg.d;
         }

         @Override
         public boolean b() {
            return $$0.g();
         }

         @Override
         public boolean Q_() {
            return false;
         }
      };
   }

   @Deprecated(
      forRemoval = true
   )
   public asc c() {
      asr $$0 = asr.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      asc $$1 = new asc(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean aa_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      vv $$2 = new vv(zp.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.d(new iw($$0, $$1, $$2));
   }

   public void d(iw $$0) {
      this.a(dnq.dL, $$0);
      iw $$1 = this.j($$0);
      ebq $$2 = this.a().a_($$1);
      dsh $$3 = (dsh)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(iw $$0, long $$1) {
      this.a($$0, dnq.hB);
      this.b($$1, () -> this.a($$0, dnq.a));
   }

   public void e(iw $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dno $$3) {
      this.a(new iw($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, ebq $$3) {
      this.a(new iw($$0, $$1, $$2), $$3);
   }

   public void a(iw $$0, dno $$1) {
      this.a($$0, $$1.m());
   }

   public void a(iw $$0, ebq $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dno $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iw($$1, $$2, $$3));
   }

   public void a(dno $$0, iw $$1) {
      ebq $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), $$1x -> xg.a("test.error.expected_block", $$0.f(), $$1x.f()));
   }

   public void b(dno $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new iw($$1, $$2, $$3));
   }

   public void b(dno $$0, iw $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), $$1x -> xg.a("test.error.unexpected_block", $$0.f()));
   }

   public void a(ayc<dno> $$0, iw $$1) {
      this.b($$1, $$1x -> $$1x.a($$0), $$1x -> xg.a("test.error.expected_block_tag", $$0.b(), $$1x.b().f()));
   }

   public void c(dno $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iw($$1, $$2, $$3));
   }

   public void c(dno $$0, iw $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(iw $$0, Predicate<dno> $$1, Function<dno, xg> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$1x -> $$2.apply($$1x.b()));
   }

   public <T extends Comparable<T>> void a(iw $$0, ect<T> $$1, T $$2) {
      ebq $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4) {
         throw this.a($$0, "test.error.block_property_missing", $$1.f(), $$2);
      } else if (!$$3.<T>c($$1).equals($$2)) {
         throw this.a($$0, "test.error.block_property_mismatch", $$1.f(), $$2, $$3.c($$1));
      }
   }

   public <T extends Comparable<T>> void a(iw $$0, ect<T> $$1, Predicate<T> $$2, xg $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, $$1x -> $$3);
   }

   public void b(iw $$0, ebq $$1) {
      ebq $$2 = this.a($$0);
      if (!$$2.equals($$1)) {
         throw this.a($$0, "test.error.state_not_equal", $$1, $$2);
      }
   }

   public void b(iw $$0, Predicate<ebq> $$1, Function<ebq, xg> $$2) {
      ebq $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw this.a($$0, $$2.apply($$3));
      }
   }

   public <T extends dyo> void a(iw $$0, Class<T> $$1, Predicate<T> $$2, Supplier<xg> $$3) {
      T $$4 = this.a($$0, $$1);
      if (!$$2.test($$4)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void a(iw $$0, jc $$1, IntPredicate $$2, Supplier<xg> $$3) {
      iw $$4 = this.j($$0);
      asb $$5 = this.a();
      ebq $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void b(bxn<?> $$0) {
      List<? extends bxe> $$1 = this.a().a($$0, this.j(), bxe::bJ);
      if ($$1.isEmpty()) {
         throw this.a("test.error.expected_entity_in_test", $$0.h());
      }
   }

   public void c(bxn<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iw($$1, $$2, $$3));
   }

   public void c(bxn<?> $$0, iw $$1) {
      iw $$2 = this.j($$1);
      List<? extends bxe> $$3 = this.a().a($$0, new ffx($$2), bxe::bJ);
      if ($$3.isEmpty()) {
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bxn<?> $$0, ffx $$1) {
      ffx $$2 = this.a($$1);
      List<? extends bxe> $$3 = this.a().a($$0, $$2, bxe::bJ);
      if ($$3.isEmpty()) {
         throw this.a(iw.a((jq)$$1.f()), "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bxn<?> $$0, int $$1) {
      List<? extends bxe> $$2 = this.a().a($$0, this.j(), bxe::bJ);
      if ($$2.size() != $$1) {
         throw this.a("test.error.expected_entity_count", $$1, $$0.h(), $$2.size());
      }
   }

   public void a(bxn<?> $$0, iw $$1, int $$2, double $$3) {
      iw $$4 = this.j($$1);
      List<? extends bxe> $$5 = this.b((bxn<? extends bxe>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw this.a($$1, "test.error.expected_entity_count", $$2, $$0.h(), $$5.size());
      }
   }

   public void a(bxn<?> $$0, iw $$1, double $$2) {
      List<? extends bxe> $$3 = this.b((bxn<? extends bxe>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         iw $$4 = this.j($$1);
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public <T extends bxe> List<T> b(bxn<T> $$0, iw $$1, double $$2) {
      iw $$3 = this.j($$1);
      return this.a().a($$0, new ffx($$3).g($$2), bxe::bJ);
   }

   public <T extends bxe> List<T> c(bxn<T> $$0) {
      return this.a().a($$0, this.j(), bxe::bJ);
   }

   public void a(bxe $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iw($$1, $$2, $$3));
   }

   public void a(bxe $$0, iw $$1) {
      iw $$2 = this.j($$1);
      List<? extends bxe> $$3 = this.a().a($$0.an(), new ffx($$2), bxe::bJ);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> this.a($$1, "test.error.expected_entity", $$0.an().h()));
   }

   public void a(dag $$0, iw $$1, double $$2, int $$3) {
      iw $$4 = this.j($$1);
      List<coo> $$5 = this.a().a(bxn.ar, new ffx($$4).g($$2), bxe::bJ);
      int $$6 = 0;

      for (coo $$7 : $$5) {
         dak $$8 = $$7.f();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw this.a($$1, "test.error.expected_items_count", $$3, $$0.l(), $$6);
      }
   }

   public void a(dag $$0, iw $$1, double $$2) {
      iw $$3 = this.j($$1);

      for (bxe $$5 : this.a().a(bxn.ar, new ffx($$3).g($$2), bxe::bJ)) {
         coo $$6 = (coo)$$5;
         if ($$6.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a($$1, "test.error.expected_item", $$0.l());
   }

   public void b(dag $$0, iw $$1, double $$2) {
      iw $$3 = this.j($$1);

      for (bxe $$5 : this.a().a(bxn.ar, new ffx($$3).g($$2), bxe::bJ)) {
         coo $$6 = (coo)$$5;
         if ($$6.f().h().equals($$0)) {
            throw this.a($$1, "test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void a(dag $$0) {
      for (bxe $$2 : this.a().a(bxn.ar, this.j(), bxe::bJ)) {
         coo $$3 = (coo)$$2;
         if ($$3.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a("test.error.expected_item", $$0.l());
   }

   public void b(dag $$0) {
      for (bxe $$2 : this.a().a(bxn.ar, this.j(), bxe::bJ)) {
         coo $$3 = (coo)$$2;
         if ($$3.f().h().equals($$0)) {
            throw this.a("test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void d(bxn<?> $$0) {
      List<? extends bxe> $$1 = this.a().a($$0, this.j(), bxe::bJ);
      if (!$$1.isEmpty()) {
         throw this.a($$1.getFirst().dv(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void d(bxn<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new iw($$1, $$2, $$3));
   }

   public void d(bxn<?> $$0, iw $$1) {
      iw $$2 = this.j($$1);
      List<? extends bxe> $$3 = this.a().a($$0, new ffx($$2), bxe::bJ);
      if (!$$3.isEmpty()) {
         throw this.a($$1, "test.error.unexpected_entity", $$0.h());
      }
   }

   public void b(bxn<?> $$0, ffx $$1) {
      ffx $$2 = this.a($$1);
      List<? extends bxe> $$3 = this.a().a($$0, $$2, bxe::bJ);
      if (!$$3.isEmpty()) {
         throw this.a($$3.getFirst().dv(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void a(bxn<?> $$0, double $$1, double $$2, double $$3) {
      fgc $$4 = new fgc($$1, $$2, $$3);
      fgc $$5 = this.a($$4);
      Predicate<? super bxe> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bxe> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public void b(bxn<?> $$0, double $$1, double $$2, double $$3) {
      fgc $$4 = new fgc($$1, $$2, $$3);
      fgc $$5 = this.a($$4);
      Predicate<? super bxe> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bxe> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_not_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public <E extends bxe, T> void a(iw $$0, bxn<E> $$1, Predicate<E> $$2) {
      iw $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ffx($$3), bxe::bJ);
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

   public <E extends bxe, T> void a(iw $$0, bxn<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      iw $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ffx($$4), bxe::bJ);
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

   public <E extends byf> void a(iw $$0, bxn<E> $$1, dag $$2) {
      iw $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ffx($$3), bxe::bJ);
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

   public <E extends bxe & crs> void b(iw $$0, bxn<E> $$1, dag $$2) {
      iw $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ffx($$3), $$0x -> ((bxe)$$0x).bJ());
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

   public void f(iw $$0) {
      dyh $$1 = this.a($$0, dyh.class);
      if (!$$1.c()) {
         throw this.a($$0, "test.error.expected_empty_container");
      }
   }

   public void a(iw $$0, dag $$1) {
      dyh $$2 = this.a($$0, dyh.class);
      if ($$2.a_($$1) != 1) {
         throw this.a($$0, "test.error.expected_container_contents_single", $$1.l());
      }
   }

   public void b(iw $$0, dag $$1) {
      dyh $$2 = this.a($$0, dyh.class);
      if ($$2.a_($$1) == 0) {
         throw this.a($$0, "test.error.expected_container_contents", $$1.l());
      }
   }

   public void a(esf $$0, iw $$1) {
      iw.a($$0).forEach($$2 -> {
         iw $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(iw $$0, iw $$1) {
      ebq $$2 = this.a($$0);
      ebq $$3 = this.a($$1);
      if ($$2 != $$3) {
         throw this.a($$0, "test.error.state_not_equal", $$3, $$2);
      }
   }

   public void a(long $$0, iw $$1, dag $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, iw $$1) {
      this.a($$0, () -> this.f($$1));
   }

   public <E extends bxe, T> void b(iw $$0, bxn<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bxe $$0, ffx $$1, xg $$2) {
      if (!$$1.d(this.b($$0.dt()))) {
         throw this.a($$2);
      }
   }

   public <E extends bxe> void a(E $$0, Predicate<E> $$1, xg $$2) {
      if (!$$1.test($$0)) {
         throw this.a($$0.dv(), "test.error.entity_property", $$0.ai(), $$2);
      }
   }

   public <E extends bxe, T> void a(E $$0, Function<E, T> $$1, T $$2, xg $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$2)) {
         throw this.a($$0.dv(), "test.error.entity_property_details", $$0.ai(), $$3, $$4, $$2);
      }
   }

   public void a(byf $$0, jg<bwg> $$1, int $$2) {
      bwi $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         throw this.a("test.error.expected_entity_effect", $$0.ai(), dcg.a($$1, $$2));
      }
   }

   public void e(bxn<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new iw($$1, $$2, $$3));
   }

   public void e(bxn<?> $$0, iw $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bxn<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new iw($$1, $$2, $$3));
   }

   public void f(bxn<?> $$0, iw $$1) {
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

   public void g(iw $$0) {
      iw $$1 = this.j($$0);
      asb $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void h(iw $$0) {
      iw $$1 = this.j($$0);
      asb $$2 = this.a();
      $$2.a_($$1).a($$2, $$1, $$2.A);
   }

   public void i(iw $$0) {
      iw $$1 = this.j($$0);
      asb $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ffx $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new iw($$4, $$3, $$5));
         }
      }
   }

   public int a(ehp.a $$0, int $$1, int $$2) {
      iw $$3 = this.j(new iw($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(xg $$0, iw $$1) {
      throw this.a($$1, $$0);
   }

   public void a(xg $$0, bxe $$1) {
      throw this.a($$1.dv(), $$0);
   }

   public void b(xg $$0) {
      throw this.a($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> this.a("test.error.fail"));
   }

   public void d(Runnable $$0) {
      LongStream.range((long)this.a.p(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public sx g() {
      return this.a.q();
   }

   public iw j(iw $$0) {
      iw $$1 = this.a.d();
      iw $$2 = $$1.a((kb)$$0);
      return ewp.a($$2, dsr.a, this.a.u(), $$1);
   }

   public iw k(iw $$0) {
      iw $$1 = this.a.d();
      dui $$2 = this.a.u().a(dui.c);
      iw $$3 = ewp.a($$0, dsr.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ffx a(ffx $$0) {
      fgc $$1 = this.a($$0.h());
      fgc $$2 = this.a($$0.i());
      return new ffx($$1, $$2);
   }

   public ffx b(ffx $$0) {
      fgc $$1 = this.b($$0.h());
      fgc $$2 = this.b($$0.i());
      return new ffx($$1, $$2);
   }

   public fgc a(fgc $$0) {
      fgc $$1 = fgc.a(this.a.d());
      return ewp.a($$1.e($$0), dsr.a, this.a.u(), this.a.d());
   }

   public fgc b(fgc $$0) {
      fgc $$1 = fgc.a(this.a.d());
      return ewp.a($$0.d($$1), dsr.a, this.a.u(), this.a.d());
   }

   public dui h() {
      return this.a.u();
   }

   public void a(boolean $$0, xg $$1) {
      if (!$$0) {
         throw this.a($$1);
      }
   }

   public <N> void a(N $$0, N $$1, xg $$2) {
      if (!$$0.equals($$1)) {
         throw this.a("test.error.value_not_equal", $$2, $$0, $$1);
      }
   }

   public void b(boolean $$0, xg $$1) {
      this.a(!$$0, $$1);
   }

   public long i() {
      return (long)this.a.p();
   }

   public ffx j() {
      return this.a.e();
   }

   private ffx l() {
      ffx $$0 = this.a.e();
      dui $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new ffx(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new ffx(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<iw> $$0) {
      ffx $$1 = this.l().a(1.0, 1.0, 1.0);
      iw.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range((long)this.a.p(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(csi $$0, dak $$1, iw $$2, jc $$3) {
      iw $$4 = this.j($$2.a($$3));
      ffy $$5 = new ffy(fgc.b($$4), $$3, $$4, false);
      def $$6 = new def($$0, bvb.a, $$5);
      $$1.a($$6);
   }

   public void a(alq<dlm> $$0) {
      ffx $$1 = this.j();
      iw $$2 = iw.a($$1.a, $$1.b, $$1.c);
      iw $$3 = iw.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = anw.a(this.a(), $$2, $$3, this.a().J_().f(mi.aG).b($$0));
      if ($$4.right().isPresent()) {
         throw this.a("test.error.set_biome");
      }
   }
}
