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

   public si a(xc $$0) {
      return new si($$0, this.a.p());
   }

   public si a(String $$0, Object... $$1) {
      return this.a((xc)xc.b($$0, $$1));
   }

   public sj a(iw $$0, xc $$1) {
      return new sj($$1, this.j($$0), $$0, this.a.p());
   }

   public sj a(iw $$0, String $$1, Object... $$2) {
      return this.a($$0, xc.b($$1, $$2));
   }

   public aru a() {
      return this.a.g();
   }

   public ebg a(iw $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dye> T a(iw $$0, Class<T> $$1) {
      dye $$2 = this.a().c_(this.j($$0));
      if ($$2 == null) {
         throw this.a($$0, "test.error.missing_block_entity");
      } else if ($$1.isInstance($$2)) {
         return $$1.cast($$2);
      } else {
         throw this.a($$0, "test.error.wrong_block_entity", $$2.p().a().g());
      }
   }

   public void b() {
      this.a(bwv.class);
   }

   public void a(Class<? extends bwv> $$0) {
      ffn $$1 = this.j();
      List<? extends bwv> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof crz));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public coe a(czw $$0, ffs $$1) {
      aru $$2 = this.a();
      ffs $$3 = this.a($$1);
      coe $$4 = new coe($$2, $$3.d, $$3.e, $$3.f, new daa($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public coe a(czw $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ffs((double)$$1, (double)$$2, (double)$$3));
   }

   public coe a(czw $$0, iw $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bwv> E a(bxe<E> $$0, iw $$1) {
      return this.a($$0, ffs.c($$1));
   }

   public <E extends bwv> E a(bxe<E> $$0, ffs $$1) {
      aru $$2 = this.a();
      E $$3 = $$0.a($$2, bxd.d);
      if ($$3 == null) {
         throw this.a(iw.a((jq)$$1), "test.error.spawn_failure", $$0.r().g());
      } else {
         if ($$3 instanceof bxy $$4) {
            $$4.gc();
         }

         ffs $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dL(), $$3.dN());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bwv $$0, bvk $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bwv $$0) {
      $$0.c(this.a());
   }

   public <E extends bwv> E a(bxe<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bwv> E a(bxe<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw this.a("test.error.expected_entity_around", $$0.h(), $$1, $$2, $$3);
      } else if ($$5.size() > 1) {
         throw this.a("test.error.too_many_entities", $$0.i(), $$1, $$2, $$3, $$5.size());
      } else {
         ffs $$6 = this.a(new ffs((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dt().f($$6);
            double $$4x = $$2x.dt().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bwv> List<E> b(bxe<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, ffs.c(new iw($$1, $$2, $$3)), $$4);
   }

   public <E extends bwv> List<E> a(bxe<E> $$0, ffs $$1, double $$2) {
      aru $$3 = this.a();
      ffs $$4 = this.a($$1);
      ffn $$5 = this.a.e();
      ffn $$6 = new ffn($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bJ());
   }

   public <E extends bwv> E a(bxe<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new iw($$1, $$2, $$3));
   }

   public <E extends bwv> E a(bxe<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ffs((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bxy> E b(bxe<E> $$0, iw $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gp();
      return $$2;
   }

   public <E extends bxy> E b(bxe<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new iw($$1, $$2, $$3));
   }

   public <E extends bxy> E b(bxe<E> $$0, ffs $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gp();
      return $$2;
   }

   public <E extends bxy> E b(bxe<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ffs((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bxy $$0, float $$1, float $$2, float $$3) {
      ffs $$4 = this.a(new ffs((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dL(), $$0.dN());
   }

   public sx a(bxy $$0, iw $$1, float $$2) {
      return this.g().a(2, () -> {
         eye $$3 = $$0.O().a(this.j($$1), 0);
         $$0.O().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b(new iw($$0, $$1, $$2));
   }

   public void b(iw $$0) {
      this.a(axg.f, $$0);
      iw $$1 = this.j($$0);
      ebg $$2 = this.a().a_($$1);
      dnp $$3 = (dnp)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void c(iw $$0) {
      this.a($$0, this.a(djw.b));
   }

   public void a(iw $$0, crz $$1) {
      iw $$2 = this.j($$0);
      this.a($$0, $$1, new ffo(ffs.b($$2), jc.c, $$2, true));
   }

   public void a(iw $$0, crz $$1, ffo $$2) {
      iw $$3 = this.j($$0);
      ebg $$4 = this.a().a_($$3);
      bus $$5 = bus.a;
      but $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof but.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            ddv $$7 = new ddv($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bxw a(bxw $$0) {
      $$0.j(0);
      $$0.d(0.25F);
      return $$0;
   }

   public bxw b(bxw $$0) {
      $$0.d(0.25F);
      return $$0;
   }

   public crz a(final djw $$0) {
      return new crz(this.a(), iw.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean Z_() {
            return $$0 == djw.d;
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
   public arv c() {
      ask $$0 = ask.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      arv $$1 = new arv(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean Z_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      vv $$2 = new vv(zk.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.d(new iw($$0, $$1, $$2));
   }

   public void d(iw $$0) {
      this.a(dng.dL, $$0);
      iw $$1 = this.j($$0);
      ebg $$2 = this.a().a_($$1);
      drx $$3 = (drx)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(iw $$0, long $$1) {
      this.a($$0, dng.hB);
      this.b($$1, () -> this.a($$0, dng.a));
   }

   public void e(iw $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dne $$3) {
      this.a(new iw($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, ebg $$3) {
      this.a(new iw($$0, $$1, $$2), $$3);
   }

   public void a(iw $$0, dne $$1) {
      this.a($$0, $$1.m());
   }

   public void a(iw $$0, ebg $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dne $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iw($$1, $$2, $$3));
   }

   public void a(dne $$0, iw $$1) {
      ebg $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), $$1x -> xc.a("test.error.expected_block", $$0.f(), $$1x.f()));
   }

   public void b(dne $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new iw($$1, $$2, $$3));
   }

   public void b(dne $$0, iw $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), $$1x -> xc.a("test.error.unexpected_block", $$0.f()));
   }

   public void a(axv<dne> $$0, iw $$1) {
      this.b($$1, $$1x -> $$1x.a($$0), $$1x -> xc.a("test.error.expected_block_tag", $$0.b(), $$1x.b().f()));
   }

   public void c(dne $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iw($$1, $$2, $$3));
   }

   public void c(dne $$0, iw $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(iw $$0, Predicate<dne> $$1, Function<dne, xc> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$1x -> $$2.apply($$1x.b()));
   }

   public <T extends Comparable<T>> void a(iw $$0, ecj<T> $$1, T $$2) {
      ebg $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4) {
         throw this.a($$0, "test.error.block_property_missing", $$1.f(), $$2);
      } else if (!$$3.<T>c($$1).equals($$2)) {
         throw this.a($$0, "test.error.block_property_mismatch", $$1.f(), $$2, $$3.c($$1));
      }
   }

   public <T extends Comparable<T>> void a(iw $$0, ecj<T> $$1, Predicate<T> $$2, xc $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, $$1x -> $$3);
   }

   public void b(iw $$0, ebg $$1) {
      ebg $$2 = this.a($$0);
      if (!$$2.equals($$1)) {
         throw this.a($$0, "test.error.state_not_equal", $$1, $$2);
      }
   }

   public void b(iw $$0, Predicate<ebg> $$1, Function<ebg, xc> $$2) {
      ebg $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw this.a($$0, $$2.apply($$3));
      }
   }

   public <T extends dye> void a(iw $$0, Class<T> $$1, Predicate<T> $$2, Supplier<xc> $$3) {
      T $$4 = this.a($$0, $$1);
      if (!$$2.test($$4)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void a(iw $$0, jc $$1, IntPredicate $$2, Supplier<xc> $$3) {
      iw $$4 = this.j($$0);
      aru $$5 = this.a();
      ebg $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void b(bxe<?> $$0) {
      List<? extends bwv> $$1 = this.a().a($$0, this.j(), bwv::bJ);
      if ($$1.isEmpty()) {
         throw this.a("test.error.expected_entity_in_test", $$0.h());
      }
   }

   public void c(bxe<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new iw($$1, $$2, $$3));
   }

   public void c(bxe<?> $$0, iw $$1) {
      iw $$2 = this.j($$1);
      List<? extends bwv> $$3 = this.a().a($$0, new ffn($$2), bwv::bJ);
      if ($$3.isEmpty()) {
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bxe<?> $$0, ffn $$1) {
      ffn $$2 = this.a($$1);
      List<? extends bwv> $$3 = this.a().a($$0, $$2, bwv::bJ);
      if ($$3.isEmpty()) {
         throw this.a(iw.a((jq)$$1.f()), "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bxe<?> $$0, int $$1) {
      List<? extends bwv> $$2 = this.a().a($$0, this.j(), bwv::bJ);
      if ($$2.size() != $$1) {
         throw this.a("test.error.expected_entity_count", $$1, $$0.h(), $$2.size());
      }
   }

   public void a(bxe<?> $$0, iw $$1, int $$2, double $$3) {
      iw $$4 = this.j($$1);
      List<? extends bwv> $$5 = this.b((bxe<? extends bwv>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw this.a($$1, "test.error.expected_entity_count", $$2, $$0.h(), $$5.size());
      }
   }

   public void a(bxe<?> $$0, iw $$1, double $$2) {
      List<? extends bwv> $$3 = this.b((bxe<? extends bwv>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         iw $$4 = this.j($$1);
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public <T extends bwv> List<T> b(bxe<T> $$0, iw $$1, double $$2) {
      iw $$3 = this.j($$1);
      return this.a().a($$0, new ffn($$3).g($$2), bwv::bJ);
   }

   public <T extends bwv> List<T> c(bxe<T> $$0) {
      return this.a().a($$0, this.j(), bwv::bJ);
   }

   public void a(bwv $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new iw($$1, $$2, $$3));
   }

   public void a(bwv $$0, iw $$1) {
      iw $$2 = this.j($$1);
      List<? extends bwv> $$3 = this.a().a($$0.an(), new ffn($$2), bwv::bJ);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> this.a($$1, "test.error.expected_entity", $$0.an().h()));
   }

   public void a(czw $$0, iw $$1, double $$2, int $$3) {
      iw $$4 = this.j($$1);
      List<coe> $$5 = this.a().a(bxe.ar, new ffn($$4).g($$2), bwv::bJ);
      int $$6 = 0;

      for (coe $$7 : $$5) {
         daa $$8 = $$7.f();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw this.a($$1, "test.error.expected_items_count", $$3, $$0.l(), $$6);
      }
   }

   public void a(czw $$0, iw $$1, double $$2) {
      iw $$3 = this.j($$1);

      for (bwv $$5 : this.a().a(bxe.ar, new ffn($$3).g($$2), bwv::bJ)) {
         coe $$6 = (coe)$$5;
         if ($$6.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a($$1, "test.error.expected_item", $$0.l());
   }

   public void b(czw $$0, iw $$1, double $$2) {
      iw $$3 = this.j($$1);

      for (bwv $$5 : this.a().a(bxe.ar, new ffn($$3).g($$2), bwv::bJ)) {
         coe $$6 = (coe)$$5;
         if ($$6.f().h().equals($$0)) {
            throw this.a($$1, "test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void a(czw $$0) {
      for (bwv $$2 : this.a().a(bxe.ar, this.j(), bwv::bJ)) {
         coe $$3 = (coe)$$2;
         if ($$3.f().h().equals($$0)) {
            return;
         }
      }

      throw this.a("test.error.expected_item", $$0.l());
   }

   public void b(czw $$0) {
      for (bwv $$2 : this.a().a(bxe.ar, this.j(), bwv::bJ)) {
         coe $$3 = (coe)$$2;
         if ($$3.f().h().equals($$0)) {
            throw this.a("test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void d(bxe<?> $$0) {
      List<? extends bwv> $$1 = this.a().a($$0, this.j(), bwv::bJ);
      if (!$$1.isEmpty()) {
         throw this.a($$1.getFirst().dv(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void d(bxe<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new iw($$1, $$2, $$3));
   }

   public void d(bxe<?> $$0, iw $$1) {
      iw $$2 = this.j($$1);
      List<? extends bwv> $$3 = this.a().a($$0, new ffn($$2), bwv::bJ);
      if (!$$3.isEmpty()) {
         throw this.a($$1, "test.error.unexpected_entity", $$0.h());
      }
   }

   public void b(bxe<?> $$0, ffn $$1) {
      ffn $$2 = this.a($$1);
      List<? extends bwv> $$3 = this.a().a($$0, $$2, bwv::bJ);
      if (!$$3.isEmpty()) {
         throw this.a($$3.getFirst().dv(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void a(bxe<?> $$0, double $$1, double $$2, double $$3) {
      ffs $$4 = new ffs($$1, $$2, $$3);
      ffs $$5 = this.a($$4);
      Predicate<? super bwv> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bwv> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public void b(bxe<?> $$0, double $$1, double $$2, double $$3) {
      ffs $$4 = new ffs($$1, $$2, $$3);
      ffs $$5 = this.a($$4);
      Predicate<? super bwv> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bwv> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_not_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public <E extends bwv, T> void a(iw $$0, bxe<E> $$1, Predicate<E> $$2) {
      iw $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ffn($$3), bwv::bJ);
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

   public <E extends bwv, T> void a(iw $$0, bxe<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      iw $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ffn($$4), bwv::bJ);
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

   public <E extends bxw> void a(iw $$0, bxe<E> $$1, czw $$2) {
      iw $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ffn($$3), bwv::bJ);
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

   public <E extends bwv & crj> void b(iw $$0, bxe<E> $$1, czw $$2) {
      iw $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ffn($$3), $$0x -> ((bwv)$$0x).bJ());
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
      dxx $$1 = this.a($$0, dxx.class);
      if (!$$1.c()) {
         throw this.a($$0, "test.error.expected_empty_container");
      }
   }

   public void a(iw $$0, czw $$1) {
      dxx $$2 = this.a($$0, dxx.class);
      if ($$2.a_($$1) != 1) {
         throw this.a($$0, "test.error.expected_container_contents_single", $$1.l());
      }
   }

   public void b(iw $$0, czw $$1) {
      dxx $$2 = this.a($$0, dxx.class);
      if ($$2.a_($$1) == 0) {
         throw this.a($$0, "test.error.expected_container_contents", $$1.l());
      }
   }

   public void a(erv $$0, iw $$1) {
      iw.a($$0).forEach($$2 -> {
         iw $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(iw $$0, iw $$1) {
      ebg $$2 = this.a($$0);
      ebg $$3 = this.a($$1);
      if ($$2 != $$3) {
         throw this.a($$0, "test.error.state_not_equal", $$3, $$2);
      }
   }

   public void a(long $$0, iw $$1, czw $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, iw $$1) {
      this.a($$0, () -> this.f($$1));
   }

   public <E extends bwv, T> void b(iw $$0, bxe<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bwv $$0, ffn $$1, xc $$2) {
      if (!$$1.d(this.b($$0.dt()))) {
         throw this.a($$2);
      }
   }

   public <E extends bwv> void a(E $$0, Predicate<E> $$1, xc $$2) {
      if (!$$1.test($$0)) {
         throw this.a($$0.dv(), "test.error.entity_property", $$0.ai(), $$2);
      }
   }

   public <E extends bwv, T> void a(E $$0, Function<E, T> $$1, T $$2, xc $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$2)) {
         throw this.a($$0.dv(), "test.error.entity_property_details", $$0.ai(), $$3, $$4, $$2);
      }
   }

   public void a(bxw $$0, jg<bvx> $$1, int $$2) {
      bvz $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         throw this.a("test.error.expected_entity_effect", $$0.ai(), dbw.a($$1, $$2));
      }
   }

   public void e(bxe<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new iw($$1, $$2, $$3));
   }

   public void e(bxe<?> $$0, iw $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bxe<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new iw($$1, $$2, $$3));
   }

   public void f(bxe<?> $$0, iw $$1) {
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
      aru $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void h(iw $$0) {
      iw $$1 = this.j($$0);
      aru $$2 = this.a();
      $$2.a_($$1).a($$2, $$1, $$2.A);
   }

   public void i(iw $$0) {
      iw $$1 = this.j($$0);
      aru $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ffn $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new iw($$4, $$3, $$5));
         }
      }
   }

   public int a(ehf.a $$0, int $$1, int $$2) {
      iw $$3 = this.j(new iw($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(xc $$0, iw $$1) {
      throw this.a($$1, $$0);
   }

   public void a(xc $$0, bwv $$1) {
      throw this.a($$1.dv(), $$0);
   }

   public void b(xc $$0) {
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
      return ewf.a($$2, dsh.a, this.a.u(), $$1);
   }

   public iw k(iw $$0) {
      iw $$1 = this.a.d();
      dty $$2 = this.a.u().a(dty.c);
      iw $$3 = ewf.a($$0, dsh.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ffn a(ffn $$0) {
      ffs $$1 = this.a($$0.h());
      ffs $$2 = this.a($$0.i());
      return new ffn($$1, $$2);
   }

   public ffn b(ffn $$0) {
      ffs $$1 = this.b($$0.h());
      ffs $$2 = this.b($$0.i());
      return new ffn($$1, $$2);
   }

   public ffs a(ffs $$0) {
      ffs $$1 = ffs.a(this.a.d());
      return ewf.a($$1.e($$0), dsh.a, this.a.u(), this.a.d());
   }

   public ffs b(ffs $$0) {
      ffs $$1 = ffs.a(this.a.d());
      return ewf.a($$0.d($$1), dsh.a, this.a.u(), this.a.d());
   }

   public dty h() {
      return this.a.u();
   }

   public void a(boolean $$0, xc $$1) {
      if (!$$0) {
         throw this.a($$1);
      }
   }

   public <N> void a(N $$0, N $$1, xc $$2) {
      if (!$$0.equals($$1)) {
         throw this.a("test.error.value_not_equal", $$2, $$0, $$1);
      }
   }

   public void b(boolean $$0, xc $$1) {
      this.a(!$$0, $$1);
   }

   public long i() {
      return (long)this.a.p();
   }

   public ffn j() {
      return this.a.e();
   }

   private ffn l() {
      ffn $$0 = this.a.e();
      dty $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new ffn(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new ffn(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<iw> $$0) {
      ffn $$1 = this.l().a(1.0, 1.0, 1.0);
      iw.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range((long)this.a.p(), (long)this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(crz $$0, daa $$1, iw $$2, jc $$3) {
      iw $$4 = this.j($$2.a($$3));
      ffo $$5 = new ffo(ffs.b($$4), $$3, $$4, false);
      ddv $$6 = new ddv($$0, bus.a, $$5);
      $$1.a($$6);
   }

   public void a(alj<dlc> $$0) {
      ffn $$1 = this.j();
      iw $$2 = iw.a($$1.a, $$1.b, $$1.c);
      iw $$3 = iw.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = anp.a(this.a(), $$2, $$3, this.a().J_().f(mi.aG).b($$0));
      if ($$4.right().isPresent()) {
         throw this.a("test.error.set_biome");
      }
   }
}
