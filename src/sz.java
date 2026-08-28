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

public class sz {
   private final ta a;
   private boolean b;

   public sz(ta $$0) {
      this.a = $$0;
   }

   public arg a() {
      return this.a.f();
   }

   public dua a(je $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dre> T b(je $$0) {
      dre $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new st("Missing block entity", this.j($$0), $$0, this.a.o());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(btj.class);
   }

   public void a(Class $$0) {
      exz $$1 = this.j();
      List<btj> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cnp));
      $$2.forEach(btj::ar);
   }

   public cjz a(cvg $$0, eye $$1) {
      arg $$2 = this.a();
      eye $$3 = this.a($$1);
      cjz $$4 = new cjz($$2, $$3.d, $$3.e, $$3.f, new cvl($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cjz a(cvg $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eye((double)$$1, (double)$$2, (double)$$3));
   }

   public cjz a(cvg $$0, je $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends btj> E a(btq<E> $$0, je $$1) {
      return this.a($$0, eye.c($$1));
   }

   public <E extends btj> E a(btq<E> $$0, eye $$1) {
      arg $$2 = this.a();
      E $$3 = $$0.a($$2, btp.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof buh $$4) {
            $$4.fV();
         }

         eye $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dI(), $$3.dK());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends btj> E a(btq<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends btj> E a(btq<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new ss("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new ss("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         eye $$6 = this.a(new eye((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dq().f($$6);
            double $$4x = $$2x.dq().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends btj> List<E> b(btq<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, eye.c(new je($$1, $$2, $$3)), $$4);
   }

   public <E extends btj> List<E> a(btq<E> $$0, eye $$1, double $$2) {
      arg $$3 = this.a();
      eye $$4 = this.a($$1);
      exz $$5 = this.a.d();
      exz $$6 = new exz($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cO().c($$6) && $$1x.bI());
   }

   public <E extends btj> E a(btq<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new je($$1, $$2, $$3));
   }

   public <E extends btj> E a(btq<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eye((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends buh> E b(btq<E> $$0, je $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gj();
      return $$2;
   }

   public <E extends buh> E b(btq<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new je($$1, $$2, $$3));
   }

   public <E extends buh> E b(btq<E> $$0, eye $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gj();
      return $$2;
   }

   public <E extends buh> E b(btq<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new eye((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(buh $$0, float $$1, float $$2, float $$3) {
      eye $$4 = this.a(new eye((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dI(), $$0.dK());
   }

   public te a(buh $$0, je $$1, float $$2) {
      return this.g().a(2, () -> {
         eqp $$3 = $$0.P().a(this.j($$1), 0);
         $$0.P().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new je($$0, $$1, $$2));
   }

   public void c(je $$0) {
      this.b($$0, $$0x -> $$0x.a(aws.f), () -> "Expected button");
      je $$1 = this.j($$0);
      dua $$2 = this.a().a_($$1);
      dhf $$3 = (dhf)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(je $$0) {
      this.a($$0, this.a(ddp.b));
   }

   public void a(je $$0, cnp $$1) {
      je $$2 = this.j($$0);
      this.a($$0, $$1, new eya(eye.b($$2), jj.c, $$2, true));
   }

   public void a(je $$0, cnp $$1, eya $$2) {
      je $$3 = this.j($$0);
      dua $$4 = this.a().a_($$3);
      brj $$5 = brj.a;
      brk $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof brk.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            cyy $$7 = new cyy($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public buf a(buf $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public buf b(buf $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public cnp a(final ddp $$0) {
      return new cnp(this.a(), je.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean P_() {
            return $$0 == ddp.d;
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
   public arh c() {
      arv $$0 = arv.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      arh $$1 = new arh(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      vx $$2 = new vx(zl.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new je($$0, $$1, $$2));
   }

   public void e(je $$0) {
      this.a(dgx.dw, $$0);
      je $$1 = this.j($$0);
      dua $$2 = this.a().a_($$1);
      dli $$3 = (dli)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(je $$0, long $$1) {
      this.a($$0, dgx.ha);
      this.b($$1, () -> this.a($$0, dgx.a));
   }

   public void f(je $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dgv $$3) {
      this.a(new je($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dua $$3) {
      this.a(new je($$0, $$1, $$2), $$3);
   }

   public void a(je $$0, dgv $$1) {
      this.a($$0, $$1.o());
   }

   public void a(je $$0, dua $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dgv $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new je($$1, $$2, $$3));
   }

   public void a(dgv $$0, je $$1) {
      dua $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dgv $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new je($$1, $$2, $$3));
   }

   public void b(dgv $$0, je $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dgv $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new je($$1, $$2, $$3));
   }

   public void c(dgv $$0, je $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(je $$0, Predicate<dgv> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(je $$0, Predicate<dgv> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(je $$0, dvd<T> $$1, T $$2) {
      dua $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new st($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(je $$0, dvd<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(je $$0, Predicate<dua> $$1, Supplier<String> $$2) {
      dua $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new st($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends dre> void c(je $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new st($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(je $$0, jj $$1, IntPredicate $$2, Supplier<String> $$3) {
      je $$4 = this.j($$0);
      arg $$5 = this.a();
      dua $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new st($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(btq<?> $$0) {
      List<? extends btj> $$1 = this.a().a($$0, this.j(), btj::bI);
      if ($$1.isEmpty()) {
         throw new ss("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(btq<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new je($$1, $$2, $$3));
   }

   public void c(btq<?> $$0, je $$1) {
      je $$2 = this.j($$1);
      List<? extends btj> $$3 = this.a().a($$0, new exz($$2), btj::bI);
      if ($$3.isEmpty()) {
         throw new st("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(btq<?> $$0, exz $$1) {
      exz $$2 = this.a($$1);
      List<? extends btj> $$3 = this.a().a($$0, $$2, btj::bI);
      if ($$3.isEmpty()) {
         throw new st("Expected " + $$0.j(), je.a((jx)$$2.f()), je.a((jx)$$1.f()), this.a.o());
      }
   }

   public void a(btq<?> $$0, int $$1) {
      List<? extends btj> $$2 = this.a().a($$0, this.j(), btj::bI);
      if ($$2.size() != $$1) {
         throw new ss("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(btq<?> $$0, je $$1, int $$2, double $$3) {
      je $$4 = this.j($$1);
      List<? extends btj> $$5 = this.b((btq<? extends btj>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new st("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(btq<?> $$0, je $$1, double $$2) {
      List<? extends btj> $$3 = this.b((btq<? extends btj>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         je $$4 = this.j($$1);
         throw new st("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends btj> List<T> b(btq<T> $$0, je $$1, double $$2) {
      je $$3 = this.j($$1);
      return this.a().a($$0, new exz($$3).g($$2), btj::bI);
   }

   public <T extends btj> List<T> c(btq<T> $$0) {
      return this.a().a($$0, this.j(), btj::bI);
   }

   public void a(btj $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new je($$1, $$2, $$3));
   }

   public void a(btj $$0, je $$1) {
      je $$2 = this.j($$1);
      List<? extends btj> $$3 = this.a().a($$0.ao(), new exz($$2), btj::bI);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new st("Expected " + $$0.ao().j(), $$2, $$1, this.a.o()));
   }

   public void a(cvg $$0, je $$1, double $$2, int $$3) {
      je $$4 = this.j($$1);
      List<cjz> $$5 = this.a().a(btq.ag, new exz($$4).g($$2), btj::bI);
      int $$6 = 0;

      for (cjz $$7 : $$5) {
         cvl $$8 = $$7.m();
         if ($$8.a($$0)) {
            $$6 += $$8.J();
         }
      }

      if ($$6 != $$3) {
         throw new st("Expected " + $$3 + " " + $$0.s().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cvg $$0, je $$1, double $$2) {
      je $$3 = this.j($$1);

      for (btj $$5 : this.a().a(btq.ag, new exz($$3).g($$2), btj::bI)) {
         cjz $$6 = (cjz)$$5;
         if ($$6.m().h().equals($$0)) {
            return;
         }
      }

      throw new st("Expected " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cvg $$0, je $$1, double $$2) {
      je $$3 = this.j($$1);

      for (btj $$5 : this.a().a(btq.ag, new exz($$3).g($$2), btj::bI)) {
         cjz $$6 = (cjz)$$5;
         if ($$6.m().h().equals($$0)) {
            throw new st("Did not expect " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cvg $$0) {
      for (btj $$2 : this.a().a(btq.ag, this.j(), btj::bI)) {
         cjz $$3 = (cjz)$$2;
         if ($$3.m().h().equals($$0)) {
            return;
         }
      }

      throw new ss("Expected " + $$0.s().getString() + " item");
   }

   public void b(cvg $$0) {
      for (btj $$2 : this.a().a(btq.ag, this.j(), btj::bI)) {
         cjz $$3 = (cjz)$$2;
         if ($$3.m().h().equals($$0)) {
            throw new ss("Did not expect " + $$0.s().getString() + " item");
         }
      }
   }

   public void d(btq<?> $$0) {
      List<? extends btj> $$1 = this.a().a($$0, this.j(), btj::bI);
      if (!$$1.isEmpty()) {
         throw new ss("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(btq<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new je($$1, $$2, $$3));
   }

   public void d(btq<?> $$0, je $$1) {
      je $$2 = this.j($$1);
      List<? extends btj> $$3 = this.a().a($$0, new exz($$2), btj::bI);
      if (!$$3.isEmpty()) {
         throw new st("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void b(btq<?> $$0, exz $$1) {
      exz $$2 = this.a($$1);
      List<? extends btj> $$3 = this.a().a($$0, $$2, btj::bI);
      if (!$$3.isEmpty()) {
         throw new st("Did not expect " + $$0.j(), je.a((jx)$$2.f()), je.a((jx)$$1.f()), this.a.o());
      }
   }

   public void a(btq<?> $$0, double $$1, double $$2, double $$3) {
      eye $$4 = new eye($$1, $$2, $$3);
      eye $$5 = this.a($$4);
      Predicate<? super btj> $$6 = $$1x -> $$1x.cO().a($$5, $$5);
      List<? extends btj> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new ss("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(btq<?> $$0, double $$1, double $$2, double $$3) {
      eye $$4 = new eye($$1, $$2, $$3);
      eye $$5 = this.a($$4);
      Predicate<? super btj> $$6 = $$1x -> !$$1x.cO().a($$5, $$5);
      List<? extends btj> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new ss("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends btj, T> void a(je $$0, btq<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      je $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new exz($$4), btj::bI);
      if ($$5.isEmpty()) {
         throw new st("Expected " + $$1.j(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new ss("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new ss("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends buf> void a(je $$0, btq<E> $$1, cvg $$2) {
      je $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new exz($$3), btj::bI);
      if ($$4.isEmpty()) {
         throw new st("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new st("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends btj & cna> void b(je $$0, btq<E> $$1, cvg $$2) {
      je $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new exz($$3), $$0x -> ((btj)$$0x).bI());
      if ($$4.isEmpty()) {
         throw new st("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new st("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(je $$0) {
      je $$1 = this.j($$0);
      dre $$2 = this.a().c_($$1);
      if ($$2 instanceof dqy && !((dqy)$$2).c()) {
         throw new ss("Container should be empty");
      }
   }

   public void a(je $$0, cvg $$1) {
      je $$2 = this.j($$0);
      dre $$3 = this.a().c_($$2);
      if (!($$3 instanceof dqy)) {
         throw new ss("Expected a container at " + $$0 + ", found " + lu.j.b($$3.q()));
      } else if (((dqy)$$3).a_($$1) != 1) {
         throw new ss("Container should contain: " + $$1);
      }
   }

   public void a(ekg $$0, je $$1) {
      je.a($$0).forEach($$2 -> {
         je $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(je $$0, je $$1) {
      dua $$2 = this.a($$0);
      dua $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, je $$1, cvg $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, je $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends btj, T> void b(je $$0, btq<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(btj $$0, exz $$1, String $$2) {
      if (!$$1.d(this.b($$0.dq()))) {
         this.a($$2);
      }
   }

   public <E extends btj> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new ss("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends btj, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new ss("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(buf $$0, jn<bso> $$1, int $$2) {
      bsq $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new ss("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(btq<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new je($$1, $$2, $$3));
   }

   public void e(btq<?> $$0, je $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(btq<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new je($$1, $$2, $$3));
   }

   public void f(btq<?> $$0, je $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void e() {
      this.a.l();
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
      this.a.p().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.k();
      this.a.p().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.k();
      this.a.p().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.o() + $$0, $$1);
   }

   public void h(je $$0) {
      je $$1 = this.j($$0);
      arg $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(je $$0) {
      je $$1 = this.j($$0);
      arg $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      exz $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new je($$4, $$3, $$5));
         }
      }
   }

   public int a(dzw.a $$0, int $$1, int $$2) {
      je $$3 = this.j(new je($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, je $$1) {
      throw new st($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, btj $$1) {
      throw new st($$0, $$1.ds(), this.k($$1.ds()), this.i());
   }

   public void a(String $$0) {
      throw new ss($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new ss("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public te g() {
      return this.a.p();
   }

   public je j(je $$0) {
      je $$1 = this.a.c();
      je $$2 = $$1.a((ki)$$0);
      return eoq.a($$2, dls.a, this.a.t(), $$1);
   }

   public je k(je $$0) {
      je $$1 = this.a.c();
      dnj $$2 = this.a.t().a(dnj.c);
      je $$3 = eoq.a($$0, dls.a, $$2, $$1);
      return $$3.b($$1);
   }

   public exz a(exz $$0) {
      eye $$1 = this.a($$0.g());
      eye $$2 = this.a($$0.h());
      return new exz($$1, $$2);
   }

   public exz b(exz $$0) {
      eye $$1 = this.b($$0.g());
      eye $$2 = this.b($$0.h());
      return new exz($$1, $$2);
   }

   public eye a(eye $$0) {
      eye $$1 = eye.a(this.a.c());
      return eoq.a($$1.e($$0), dls.a, this.a.t(), this.a.c());
   }

   public eye b(eye $$0) {
      eye $$1 = eye.a(this.a.c());
      return eoq.a($$0.d($$1), dls.a, this.a.t(), this.a.c());
   }

   public dnj h() {
      return this.a.t();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new ss($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new ss("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new ss($$1);
      }
   }

   public long i() {
      return this.a.o();
   }

   public exz j() {
      return this.a.d();
   }

   private exz l() {
      exz $$0 = this.a.d();
      dnj $$1 = this.a.t();
      switch ($$1) {
         case d:
         case b:
            return new exz(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new exz(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<je> $$0) {
      exz $$1 = this.l().a(1.0, -1.0, 1.0);
      je.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cnp $$0, cvl $$1, je $$2, jj $$3) {
      je $$4 = this.j($$2.a($$3));
      eya $$5 = new eya(eye.b($$4), $$3, $$4, false);
      cyy $$6 = new cyy($$0, brj.a, $$5);
      $$1.a($$6);
   }

   public void a(ala<det> $$0) {
      exz $$1 = this.j();
      je $$2 = je.a($$1.a, $$1.b, $$1.c);
      je $$3 = je.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ang.a(this.a(), $$2, $$3, this.a().F_().d(lv.aF).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
