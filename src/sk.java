import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class sk {
   private final sl a;
   private boolean b;

   public sk(sl $$0) {
      this.a = $$0;
   }

   public ard a() {
      return this.a.g();
   }

   public dww a(ji $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dty> T b(ji $$0) {
      dty $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new se("Missing block entity", this.j($$0), $$0, this.a.p());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(buk.class);
   }

   public void a(Class $$0) {
      fau $$1 = this.j();
      List<buk> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cow));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public clb a(cwk $$0, faz $$1) {
      ard $$2 = this.a();
      faz $$3 = this.a($$1);
      clb $$4 = new clb($$2, $$3.d, $$3.e, $$3.f, new cwo($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public clb a(cwk $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new faz((double)$$1, (double)$$2, (double)$$3));
   }

   public clb a(cwk $$0, ji $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends buk> E a(bur<E> $$0, ji $$1) {
      return this.a($$0, faz.c($$1));
   }

   public <E extends buk> E a(bur<E> $$0, faz $$1) {
      ard $$2 = this.a();
      E $$3 = $$0.a($$2, buq.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bvi $$4) {
            $$4.fY();
         }

         faz $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dL(), $$3.dN());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(buk $$0, bta $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(buk $$0) {
      $$0.c(this.a());
   }

   public <E extends buk> E a(bur<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends buk> E a(bur<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sd("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sd("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         faz $$6 = this.a(new faz((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dt().f($$6);
            double $$4x = $$2x.dt().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends buk> List<E> b(bur<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, faz.c(new ji($$1, $$2, $$3)), $$4);
   }

   public <E extends buk> List<E> a(bur<E> $$0, faz $$1, double $$2) {
      ard $$3 = this.a();
      faz $$4 = this.a($$1);
      fau $$5 = this.a.e();
      fau $$6 = new fau($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bL());
   }

   public <E extends buk> E a(bur<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ji($$1, $$2, $$3));
   }

   public <E extends buk> E a(bur<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new faz((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bvi> E b(bur<E> $$0, ji $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends bvi> E b(bur<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ji($$1, $$2, $$3));
   }

   public <E extends bvi> E b(bur<E> $$0, faz $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gl();
      return $$2;
   }

   public <E extends bvi> E b(bur<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new faz((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bvi $$0, float $$1, float $$2, float $$3) {
      faz $$4 = this.a(new faz((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dL(), $$0.dN());
   }

   public sp a(bvi $$0, ji $$1, float $$2) {
      return this.g().a(2, () -> {
         etm $$3 = $$0.P().a(this.j($$1), 0);
         $$0.P().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ji($$0, $$1, $$2));
   }

   public void c(ji $$0) {
      this.b($$0, $$0x -> $$0x.a(awp.f), () -> "Expected button");
      ji $$1 = this.j($$0);
      dww $$2 = this.a().a_($$1);
      djw $$3 = (djw)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(ji $$0) {
      this.a($$0, this.a(dge.b));
   }

   public void a(ji $$0, cow $$1) {
      ji $$2 = this.j($$0);
      this.a($$0, $$1, new fav(faz.b($$2), jn.c, $$2, true));
   }

   public void a(ji $$0, cow $$1, fav $$2) {
      ji $$3 = this.j($$0);
      dww $$4 = this.a().a_($$3);
      bsi $$5 = bsi.a;
      bsj $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bsj.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            dah $$7 = new dah($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bvg a(bvg $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public bvg b(bvg $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public cow a(final dge $$0) {
      return new cow(this.a(), ji.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean Z_() {
            return $$0 == dge.d;
         }

         @Override
         public boolean b() {
            return $$0.g();
         }

         @Override
         public boolean c() {
            return true;
         }
      };
   }

   @Deprecated(
      forRemoval = true
   )
   public are c() {
      art $$0 = art.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      are $$1 = new are(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean Z_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      vi $$2 = new vi(yx.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new ji($$0, $$1, $$2));
   }

   public void e(ji $$0) {
      this.a(djn.dI, $$0);
      ji $$1 = this.j($$0);
      dww $$2 = this.a().a_($$1);
      doa $$3 = (doa)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(ji $$0, long $$1) {
      this.a($$0, djn.hx);
      this.b($$1, () -> this.a($$0, djn.a));
   }

   public void f(ji $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, djl $$3) {
      this.a(new ji($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dww $$3) {
      this.a(new ji($$0, $$1, $$2), $$3);
   }

   public void a(ji $$0, djl $$1) {
      this.a($$0, $$1.m());
   }

   public void a(ji $$0, dww $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(djl $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ji($$1, $$2, $$3));
   }

   public void a(djl $$0, ji $$1) {
      dww $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(djl $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ji($$1, $$2, $$3));
   }

   public void b(djl $$0, ji $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(djl $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ji($$1, $$2, $$3));
   }

   public void c(djl $$0, ji $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ji $$0, Predicate<djl> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ji $$0, Predicate<djl> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ji $$0, dxy<T> $$1, T $$2) {
      dww $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new se($$6, this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(ji $$0, dxy<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ji $$0, Predicate<dww> $$1, Supplier<String> $$2) {
      dww $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new se($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends dty> void c(ji $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new se($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public void a(ji $$0, jn $$1, IntPredicate $$2, Supplier<String> $$3) {
      ji $$4 = this.j($$0);
      ard $$5 = this.a();
      dww $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new se($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void b(bur<?> $$0) {
      List<? extends buk> $$1 = this.a().a($$0, this.j(), buk::bL);
      if ($$1.isEmpty()) {
         throw new sd("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bur<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ji($$1, $$2, $$3));
   }

   public void c(bur<?> $$0, ji $$1) {
      ji $$2 = this.j($$1);
      List<? extends buk> $$3 = this.a().a($$0, new fau($$2), buk::bL);
      if ($$3.isEmpty()) {
         throw new se("Expected " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void a(bur<?> $$0, fau $$1) {
      fau $$2 = this.a($$1);
      List<? extends buk> $$3 = this.a().a($$0, $$2, buk::bL);
      if ($$3.isEmpty()) {
         throw new se("Expected " + $$0.j(), ji.a((kb)$$2.f()), ji.a((kb)$$1.f()), this.a.p());
      }
   }

   public void a(bur<?> $$0, int $$1) {
      List<? extends buk> $$2 = this.a().a($$0, this.j(), buk::bL);
      if ($$2.size() != $$1) {
         throw new sd("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bur<?> $$0, ji $$1, int $$2, double $$3) {
      ji $$4 = this.j($$1);
      List<? extends buk> $$5 = this.b((bur<? extends buk>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new se("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bur<?> $$0, ji $$1, double $$2) {
      List<? extends buk> $$3 = this.b((bur<? extends buk>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ji $$4 = this.j($$1);
         throw new se("Expected " + $$0.j(), $$4, $$1, this.a.p());
      }
   }

   public <T extends buk> List<T> b(bur<T> $$0, ji $$1, double $$2) {
      ji $$3 = this.j($$1);
      return this.a().a($$0, new fau($$3).g($$2), buk::bL);
   }

   public <T extends buk> List<T> c(bur<T> $$0) {
      return this.a().a($$0, this.j(), buk::bL);
   }

   public void a(buk $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ji($$1, $$2, $$3));
   }

   public void a(buk $$0, ji $$1) {
      ji $$2 = this.j($$1);
      List<? extends buk> $$3 = this.a().a($$0.aq(), new fau($$2), buk::bL);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new se("Expected " + $$0.aq().j(), $$2, $$1, this.a.p()));
   }

   public void a(cwk $$0, ji $$1, double $$2, int $$3) {
      ji $$4 = this.j($$1);
      List<clb> $$5 = this.a().a(bur.aq, new fau($$4).g($$2), buk::bL);
      int $$6 = 0;

      for (clb $$7 : $$5) {
         cwo $$8 = $$7.l();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw new se("Expected " + $$3 + " " + $$0.m().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cwk $$0, ji $$1, double $$2) {
      ji $$3 = this.j($$1);

      for (buk $$5 : this.a().a(bur.aq, new fau($$3).g($$2), buk::bL)) {
         clb $$6 = (clb)$$5;
         if ($$6.l().h().equals($$0)) {
            return;
         }
      }

      throw new se("Expected " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cwk $$0, ji $$1, double $$2) {
      ji $$3 = this.j($$1);

      for (buk $$5 : this.a().a(bur.aq, new fau($$3).g($$2), buk::bL)) {
         clb $$6 = (clb)$$5;
         if ($$6.l().h().equals($$0)) {
            throw new se("Did not expect " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(cwk $$0) {
      for (buk $$2 : this.a().a(bur.aq, this.j(), buk::bL)) {
         clb $$3 = (clb)$$2;
         if ($$3.l().h().equals($$0)) {
            return;
         }
      }

      throw new sd("Expected " + $$0.m().getString() + " item");
   }

   public void b(cwk $$0) {
      for (buk $$2 : this.a().a(bur.aq, this.j(), buk::bL)) {
         clb $$3 = (clb)$$2;
         if ($$3.l().h().equals($$0)) {
            throw new sd("Did not expect " + $$0.m().getString() + " item");
         }
      }
   }

   public void d(bur<?> $$0) {
      List<? extends buk> $$1 = this.a().a($$0, this.j(), buk::bL);
      if (!$$1.isEmpty()) {
         throw new sd("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bur<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ji($$1, $$2, $$3));
   }

   public void d(bur<?> $$0, ji $$1) {
      ji $$2 = this.j($$1);
      List<? extends buk> $$3 = this.a().a($$0, new fau($$2), buk::bL);
      if (!$$3.isEmpty()) {
         throw new se("Did not expect " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void b(bur<?> $$0, fau $$1) {
      fau $$2 = this.a($$1);
      List<? extends buk> $$3 = this.a().a($$0, $$2, buk::bL);
      if (!$$3.isEmpty()) {
         throw new se("Did not expect " + $$0.j(), ji.a((kb)$$2.f()), ji.a((kb)$$1.f()), this.a.p());
      }
   }

   public void a(bur<?> $$0, double $$1, double $$2, double $$3) {
      faz $$4 = new faz($$1, $$2, $$3);
      faz $$5 = this.a($$4);
      Predicate<? super buk> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends buk> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sd("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bur<?> $$0, double $$1, double $$2, double $$3) {
      faz $$4 = new faz($$1, $$2, $$3);
      faz $$5 = this.a($$4);
      Predicate<? super buk> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends buk> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sd("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends buk, T> void a(ji $$0, bur<E> $$1, Predicate<E> $$2) {
      ji $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fau($$3), buk::bL);
      if ($$4.isEmpty()) {
         throw new se("Expected " + $$1.j(), $$3, $$0, this.a.p());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw new sd("Test failed for entity " + $$5);
            }
         }
      }
   }

   public <E extends buk, T> void a(ji $$0, bur<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ji $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new fau($$4), buk::bL);
      if ($$5.isEmpty()) {
         throw new se("Expected " + $$1.j(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw new sd("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bvg> void a(ji $$0, bur<E> $$1, cwk $$2) {
      ji $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fau($$3), buk::bL);
      if ($$4.isEmpty()) {
         throw new se("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new se("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends buk & cof> void b(ji $$0, bur<E> $$1, cwk $$2) {
      ji $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fau($$3), $$0x -> ((buk)$$0x).bL());
      if ($$4.isEmpty()) {
         throw new se("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.t().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new se("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(ji $$0) {
      ji $$1 = this.j($$0);
      dty $$2 = this.a().c_($$1);
      if ($$2 instanceof dts && !((dts)$$2).c()) {
         throw new sd("Container should be empty");
      }
   }

   public void a(ji $$0, cwk $$1) {
      ji $$2 = this.j($$0);
      dty $$3 = this.a().c_($$2);
      if (!($$3 instanceof dts)) {
         akv $$4 = $$3 != null ? mb.j.b($$3.p()) : null;
         throw new sd("Expected a container at " + $$0 + ", found " + $$4);
      } else if (((dts)$$3).a_($$1) != 1) {
         throw new sd("Container should contain: " + $$1);
      }
   }

   public void a(end $$0, ji $$1) {
      ji.a($$0).forEach($$2 -> {
         ji $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(ji $$0, ji $$1) {
      dww $$2 = this.a($$0);
      dww $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ji $$1, cwk $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ji $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends buk, T> void b(ji $$0, bur<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(buk $$0, fau $$1, String $$2) {
      if (!$$1.d(this.b($$0.dt()))) {
         this.a($$2);
      }
   }

   public <E extends buk> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sd("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends buk, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sd("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bvg $$0, jr<btn> $$1, int $$2) {
      btp $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sd("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bur<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ji($$1, $$2, $$3));
   }

   public void e(bur<?> $$0, ji $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bur<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ji($$1, $$2, $$3));
   }

   public void f(bur<?> $$0, ji $$1) {
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
      this.a(this.a.p() + $$0, $$1);
   }

   public void h(ji $$0) {
      ji $$1 = this.j($$0);
      ard $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void i(ji $$0) {
      ji $$1 = this.j($$0);
      ard $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      fau $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new ji($$4, $$3, $$5));
         }
      }
   }

   public int a(ecr.a $$0, int $$1, int $$2) {
      ji $$3 = this.j(new ji($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ji $$1) {
      throw new se($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, buk $$1) {
      throw new se($$0, $$1.dv(), this.k($$1.dv()), this.i());
   }

   public void a(String $$0) {
      throw new sd($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new sd("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public sp g() {
      return this.a.q();
   }

   public ji j(ji $$0) {
      ji $$1 = this.a.d();
      ji $$2 = $$1.a((km)$$0);
      return ern.a($$2, dok.a, this.a.u(), $$1);
   }

   public ji k(ji $$0) {
      ji $$1 = this.a.d();
      dqd $$2 = this.a.u().a(dqd.c);
      ji $$3 = ern.a($$0, dok.a, $$2, $$1);
      return $$3.b($$1);
   }

   public fau a(fau $$0) {
      faz $$1 = this.a($$0.h());
      faz $$2 = this.a($$0.i());
      return new fau($$1, $$2);
   }

   public fau b(fau $$0) {
      faz $$1 = this.b($$0.h());
      faz $$2 = this.b($$0.i());
      return new fau($$1, $$2);
   }

   public faz a(faz $$0) {
      faz $$1 = faz.a(this.a.d());
      return ern.a($$1.e($$0), dok.a, this.a.u(), this.a.d());
   }

   public faz b(faz $$0) {
      faz $$1 = faz.a(this.a.d());
      return ern.a($$0.d($$1), dok.a, this.a.u(), this.a.d());
   }

   public dqd h() {
      return this.a.u();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sd($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sd("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sd($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   public fau j() {
      return this.a.e();
   }

   private fau l() {
      fau $$0 = this.a.e();
      dqd $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new fau(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new fau(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<ji> $$0) {
      fau $$1 = this.l().a(1.0, 1.0, 1.0);
      ji.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cow $$0, cwo $$1, ji $$2, jn $$3) {
      ji $$4 = this.j($$2.a($$3));
      fav $$5 = new fav(faz.b($$4), $$3, $$4, false);
      dah $$6 = new dah($$0, bsi.a, $$5);
      $$1.a($$6);
   }

   public void a(aku<dhj> $$0) {
      fau $$1 = this.j();
      ji $$2 = ji.a($$1.a, $$1.b, $$1.c);
      ji $$3 = ji.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ana.a(this.a(), $$2, $$3, this.a().K_().e(mc.aI).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
