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

   public arh a() {
      return this.a.f();
   }

   public duo a(je $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends drs> T b(je $$0) {
      drs $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new st("Missing block entity", this.j($$0), $$0, this.a.o());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bto.class);
   }

   public void a(Class $$0) {
      eyn $$1 = this.j();
      List<bto> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cnu));
      $$2.forEach(bto::ar);
   }

   public cke a(cvk $$0, eys $$1) {
      arh $$2 = this.a();
      eys $$3 = this.a($$1);
      cke $$4 = new cke($$2, $$3.d, $$3.e, $$3.f, new cvp($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cke a(cvk $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eys((double)$$1, (double)$$2, (double)$$3));
   }

   public cke a(cvk $$0, je $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bto> E a(btv<E> $$0, je $$1) {
      return this.a($$0, eys.c($$1));
   }

   public <E extends bto> E a(btv<E> $$0, eys $$1) {
      arh $$2 = this.a();
      E $$3 = $$0.a($$2, btu.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bum $$4) {
            $$4.fW();
         }

         eys $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dI(), $$3.dK());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bto> E a(btv<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bto> E a(btv<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new ss("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new ss("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         eys $$6 = this.a(new eys((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dq().f($$6);
            double $$4x = $$2x.dq().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bto> List<E> b(btv<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, eys.c(new je($$1, $$2, $$3)), $$4);
   }

   public <E extends bto> List<E> a(btv<E> $$0, eys $$1, double $$2) {
      arh $$3 = this.a();
      eys $$4 = this.a($$1);
      eyn $$5 = this.a.d();
      eyn $$6 = new eyn($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cO().c($$6) && $$1x.bI());
   }

   public <E extends bto> E a(btv<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new je($$1, $$2, $$3));
   }

   public <E extends bto> E a(btv<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eys((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bum> E b(btv<E> $$0, je $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gk();
      return $$2;
   }

   public <E extends bum> E b(btv<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new je($$1, $$2, $$3));
   }

   public <E extends bum> E b(btv<E> $$0, eys $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gk();
      return $$2;
   }

   public <E extends bum> E b(btv<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new eys((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bum $$0, float $$1, float $$2, float $$3) {
      eys $$4 = this.a(new eys((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dI(), $$0.dK());
   }

   public te a(bum $$0, je $$1, float $$2) {
      return this.g().a(2, () -> {
         erd $$3 = $$0.P().a(this.j($$1), 0);
         $$0.P().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new je($$0, $$1, $$2));
   }

   public void c(je $$0) {
      this.b($$0, $$0x -> $$0x.a(awt.f), () -> "Expected button");
      je $$1 = this.j($$0);
      duo $$2 = this.a().a_($$1);
      dht $$3 = (dht)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(je $$0) {
      this.a($$0, this.a(ded.b));
   }

   public void a(je $$0, cnu $$1) {
      je $$2 = this.j($$0);
      this.a($$0, $$1, new eyo(eys.b($$2), jj.c, $$2, true));
   }

   public void a(je $$0, cnu $$1, eyo $$2) {
      je $$3 = this.j($$0);
      duo $$4 = this.a().a_($$3);
      bro $$5 = bro.a;
      brp $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof brp.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            czm $$7 = new czm($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public buk a(buk $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public buk b(buk $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public cnu a(final ded $$0) {
      return new cnu(this.a(), je.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean P_() {
            return $$0 == ded.d;
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
   public ari c() {
      arw $$0 = arw.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      ari $$1 = new ari(this.a().o(), this.a(), $$0.a(), $$0.c()) {
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
      this.a(dhl.dw, $$0);
      je $$1 = this.j($$0);
      duo $$2 = this.a().a_($$1);
      dlw $$3 = (dlw)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(je $$0, long $$1) {
      this.a($$0, dhl.ha);
      this.b($$1, () -> this.a($$0, dhl.a));
   }

   public void f(je $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dhj $$3) {
      this.a(new je($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, duo $$3) {
      this.a(new je($$0, $$1, $$2), $$3);
   }

   public void a(je $$0, dhj $$1) {
      this.a($$0, $$1.o());
   }

   public void a(je $$0, duo $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dhj $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new je($$1, $$2, $$3));
   }

   public void a(dhj $$0, je $$1) {
      duo $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dhj $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new je($$1, $$2, $$3));
   }

   public void b(dhj $$0, je $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dhj $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new je($$1, $$2, $$3));
   }

   public void c(dhj $$0, je $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(je $$0, Predicate<dhj> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(je $$0, Predicate<dhj> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(je $$0, dvr<T> $$1, T $$2) {
      duo $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new st($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(je $$0, dvr<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(je $$0, Predicate<duo> $$1, Supplier<String> $$2) {
      duo $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new st($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends drs> void c(je $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new st($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(je $$0, jj $$1, IntPredicate $$2, Supplier<String> $$3) {
      je $$4 = this.j($$0);
      arh $$5 = this.a();
      duo $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new st($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(btv<?> $$0) {
      List<? extends bto> $$1 = this.a().a($$0, this.j(), bto::bI);
      if ($$1.isEmpty()) {
         throw new ss("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(btv<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new je($$1, $$2, $$3));
   }

   public void c(btv<?> $$0, je $$1) {
      je $$2 = this.j($$1);
      List<? extends bto> $$3 = this.a().a($$0, new eyn($$2), bto::bI);
      if ($$3.isEmpty()) {
         throw new st("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(btv<?> $$0, eyn $$1) {
      eyn $$2 = this.a($$1);
      List<? extends bto> $$3 = this.a().a($$0, $$2, bto::bI);
      if ($$3.isEmpty()) {
         throw new st("Expected " + $$0.j(), je.a((jx)$$2.f()), je.a((jx)$$1.f()), this.a.o());
      }
   }

   public void a(btv<?> $$0, int $$1) {
      List<? extends bto> $$2 = this.a().a($$0, this.j(), bto::bI);
      if ($$2.size() != $$1) {
         throw new ss("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(btv<?> $$0, je $$1, int $$2, double $$3) {
      je $$4 = this.j($$1);
      List<? extends bto> $$5 = this.b((btv<? extends bto>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new st("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(btv<?> $$0, je $$1, double $$2) {
      List<? extends bto> $$3 = this.b((btv<? extends bto>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         je $$4 = this.j($$1);
         throw new st("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bto> List<T> b(btv<T> $$0, je $$1, double $$2) {
      je $$3 = this.j($$1);
      return this.a().a($$0, new eyn($$3).g($$2), bto::bI);
   }

   public <T extends bto> List<T> c(btv<T> $$0) {
      return this.a().a($$0, this.j(), bto::bI);
   }

   public void a(bto $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new je($$1, $$2, $$3));
   }

   public void a(bto $$0, je $$1) {
      je $$2 = this.j($$1);
      List<? extends bto> $$3 = this.a().a($$0.ao(), new eyn($$2), bto::bI);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new st("Expected " + $$0.ao().j(), $$2, $$1, this.a.o()));
   }

   public void a(cvk $$0, je $$1, double $$2, int $$3) {
      je $$4 = this.j($$1);
      List<cke> $$5 = this.a().a(btv.ag, new eyn($$4).g($$2), bto::bI);
      int $$6 = 0;

      for (cke $$7 : $$5) {
         cvp $$8 = $$7.m();
         if ($$8.a($$0)) {
            $$6 += $$8.J();
         }
      }

      if ($$6 != $$3) {
         throw new st("Expected " + $$3 + " " + $$0.r().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cvk $$0, je $$1, double $$2) {
      je $$3 = this.j($$1);

      for (bto $$5 : this.a().a(btv.ag, new eyn($$3).g($$2), bto::bI)) {
         cke $$6 = (cke)$$5;
         if ($$6.m().h().equals($$0)) {
            return;
         }
      }

      throw new st("Expected " + $$0.r().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cvk $$0, je $$1, double $$2) {
      je $$3 = this.j($$1);

      for (bto $$5 : this.a().a(btv.ag, new eyn($$3).g($$2), bto::bI)) {
         cke $$6 = (cke)$$5;
         if ($$6.m().h().equals($$0)) {
            throw new st("Did not expect " + $$0.r().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cvk $$0) {
      for (bto $$2 : this.a().a(btv.ag, this.j(), bto::bI)) {
         cke $$3 = (cke)$$2;
         if ($$3.m().h().equals($$0)) {
            return;
         }
      }

      throw new ss("Expected " + $$0.r().getString() + " item");
   }

   public void b(cvk $$0) {
      for (bto $$2 : this.a().a(btv.ag, this.j(), bto::bI)) {
         cke $$3 = (cke)$$2;
         if ($$3.m().h().equals($$0)) {
            throw new ss("Did not expect " + $$0.r().getString() + " item");
         }
      }
   }

   public void d(btv<?> $$0) {
      List<? extends bto> $$1 = this.a().a($$0, this.j(), bto::bI);
      if (!$$1.isEmpty()) {
         throw new ss("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(btv<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new je($$1, $$2, $$3));
   }

   public void d(btv<?> $$0, je $$1) {
      je $$2 = this.j($$1);
      List<? extends bto> $$3 = this.a().a($$0, new eyn($$2), bto::bI);
      if (!$$3.isEmpty()) {
         throw new st("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void b(btv<?> $$0, eyn $$1) {
      eyn $$2 = this.a($$1);
      List<? extends bto> $$3 = this.a().a($$0, $$2, bto::bI);
      if (!$$3.isEmpty()) {
         throw new st("Did not expect " + $$0.j(), je.a((jx)$$2.f()), je.a((jx)$$1.f()), this.a.o());
      }
   }

   public void a(btv<?> $$0, double $$1, double $$2, double $$3) {
      eys $$4 = new eys($$1, $$2, $$3);
      eys $$5 = this.a($$4);
      Predicate<? super bto> $$6 = $$1x -> $$1x.cO().a($$5, $$5);
      List<? extends bto> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new ss("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(btv<?> $$0, double $$1, double $$2, double $$3) {
      eys $$4 = new eys($$1, $$2, $$3);
      eys $$5 = this.a($$4);
      Predicate<? super bto> $$6 = $$1x -> !$$1x.cO().a($$5, $$5);
      List<? extends bto> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new ss("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bto, T> void a(je $$0, btv<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      je $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new eyn($$4), bto::bI);
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

   public <E extends buk> void a(je $$0, btv<E> $$1, cvk $$2) {
      je $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new eyn($$3), bto::bI);
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

   public <E extends bto & cnf> void b(je $$0, btv<E> $$1, cvk $$2) {
      je $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new eyn($$3), $$0x -> ((bto)$$0x).bI());
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
      drs $$2 = this.a().c_($$1);
      if ($$2 instanceof drm && !((drm)$$2).c()) {
         throw new ss("Container should be empty");
      }
   }

   public void a(je $$0, cvk $$1) {
      je $$2 = this.j($$0);
      drs $$3 = this.a().c_($$2);
      if (!($$3 instanceof drm)) {
         throw new ss("Expected a container at " + $$0 + ", found " + lu.j.b($$3.q()));
      } else if (((drm)$$3).a_($$1) != 1) {
         throw new ss("Container should contain: " + $$1);
      }
   }

   public void a(eku $$0, je $$1) {
      je.a($$0).forEach($$2 -> {
         je $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(je $$0, je $$1) {
      duo $$2 = this.a($$0);
      duo $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, je $$1, cvk $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, je $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bto, T> void b(je $$0, btv<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bto $$0, eyn $$1, String $$2) {
      if (!$$1.d(this.b($$0.dq()))) {
         this.a($$2);
      }
   }

   public <E extends bto> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new ss("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bto, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new ss("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(buk $$0, jn<bst> $$1, int $$2) {
      bsv $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new ss("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(btv<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new je($$1, $$2, $$3));
   }

   public void e(btv<?> $$0, je $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(btv<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new je($$1, $$2, $$3));
   }

   public void f(btv<?> $$0, je $$1) {
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
      arh $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(je $$0) {
      je $$1 = this.j($$0);
      arh $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      eyn $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new je($$4, $$3, $$5));
         }
      }
   }

   public int a(eak.a $$0, int $$1, int $$2) {
      je $$3 = this.j(new je($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, je $$1) {
      throw new st($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, bto $$1) {
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
      return epe.a($$2, dmg.a, this.a.t(), $$1);
   }

   public je k(je $$0) {
      je $$1 = this.a.c();
      dnx $$2 = this.a.t().a(dnx.c);
      je $$3 = epe.a($$0, dmg.a, $$2, $$1);
      return $$3.b($$1);
   }

   public eyn a(eyn $$0) {
      eys $$1 = this.a($$0.g());
      eys $$2 = this.a($$0.h());
      return new eyn($$1, $$2);
   }

   public eyn b(eyn $$0) {
      eys $$1 = this.b($$0.g());
      eys $$2 = this.b($$0.h());
      return new eyn($$1, $$2);
   }

   public eys a(eys $$0) {
      eys $$1 = eys.a(this.a.c());
      return epe.a($$1.e($$0), dmg.a, this.a.t(), this.a.c());
   }

   public eys b(eys $$0) {
      eys $$1 = eys.a(this.a.c());
      return epe.a($$0.d($$1), dmg.a, this.a.t(), this.a.c());
   }

   public dnx h() {
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

   public eyn j() {
      return this.a.d();
   }

   private eyn l() {
      eyn $$0 = this.a.d();
      dnx $$1 = this.a.t();
      switch ($$1) {
         case d:
         case b:
            return new eyn(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new eyn(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<je> $$0) {
      eyn $$1 = this.l().a(1.0, -1.0, 1.0);
      je.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cnu $$0, cvp $$1, je $$2, jj $$3) {
      je $$4 = this.j($$2.a($$3));
      eyo $$5 = new eyo(eys.b($$4), $$3, $$4, false);
      czm $$6 = new czm($$0, bro.a, $$5);
      $$1.a($$6);
   }

   public void a(alb<dfh> $$0) {
      eyn $$1 = this.j();
      je $$2 = je.a($$1.a, $$1.b, $$1.c);
      je $$3 = je.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = anh.a(this.a(), $$2, $$3, this.a().F_().d(lv.aG).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
