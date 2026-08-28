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

public class sw {
   private final sx a;
   private boolean b;

   public sw(sx $$0) {
      this.a = $$0;
   }

   public aqu a() {
      return this.a.f();
   }

   public dtc a(jd $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dqh> T b(jd $$0) {
      dqh $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new sq("Missing block entity", this.j($$0), $$0, this.a.o());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bsr.class);
   }

   public void a(Class $$0) {
      ewx $$1 = this.j();
      List<bsr> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cmx));
      $$2.forEach(bsr::ap);
   }

   public cjh a(cul $$0, exc $$1) {
      aqu $$2 = this.a();
      exc $$3 = this.a($$1);
      cjh $$4 = new cjh($$2, $$3.c, $$3.d, $$3.e, new cuq($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cjh a(cul $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new exc((double)$$1, (double)$$2, (double)$$3));
   }

   public cjh a(cul $$0, jd $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bsr> E a(bsx<E> $$0, jd $$1) {
      return this.a($$0, exc.c($$1));
   }

   public <E extends bsr> E a(bsx<E> $$0, exc $$1) {
      aqu $$2 = this.a();
      E $$3 = $$0.a((dcw)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof btp $$4) {
            $$4.fR();
         }

         exc $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dE(), $$3.dG());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bsr> E a(bsx<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bsr> E a(bsx<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sp("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sp("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         exc $$6 = this.a(new exc((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dm().f($$6);
            double $$4x = $$2x.dm().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bsr> List<E> b(bsx<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, exc.c(new jd($$1, $$2, $$3)), $$4);
   }

   public <E extends bsr> List<E> a(bsx<E> $$0, exc $$1, double $$2) {
      aqu $$3 = this.a();
      exc $$4 = this.a($$1);
      ewx $$5 = this.a.d();
      ewx $$6 = new ewx($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cK().c($$6) && $$1x.bE());
   }

   public <E extends bsr> E a(bsx<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jd($$1, $$2, $$3));
   }

   public <E extends bsr> E a(bsx<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new exc((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends btp> E b(bsx<E> $$0, jd $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gf();
      return $$2;
   }

   public <E extends btp> E b(bsx<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jd($$1, $$2, $$3));
   }

   public <E extends btp> E b(bsx<E> $$0, exc $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gf();
      return $$2;
   }

   public <E extends btp> E b(bsx<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new exc((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(btp $$0, float $$1, float $$2, float $$3) {
      exc $$4 = this.a(new exc((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dE(), $$0.dG());
   }

   public tb a(btp $$0, jd $$1, float $$2) {
      return this.g().a(2, () -> {
         eps $$3 = $$0.N().a(this.j($$1), 0);
         $$0.N().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new jd($$0, $$1, $$2));
   }

   public void c(jd $$0) {
      this.b($$0, $$0x -> $$0x.a(awe.f), () -> "Expected button");
      jd $$1 = this.j($$0);
      dtc $$2 = this.a().a_($$1);
      dgi $$3 = (dgi)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(jd $$0) {
      this.a($$0, this.a(dct.b));
   }

   public void a(jd $$0, cmx $$1) {
      jd $$2 = this.j($$0);
      this.a($$0, $$1, new ewy(exc.b($$2), ji.c, $$2, true));
   }

   public void a(jd $$0, cmx $$1, ewy $$2) {
      jd $$3 = this.j($$0);
      dtc $$4 = this.a().a_($$3);
      bqq $$5 = bqq.a;
      bqt $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bqt.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cyf $$7 = new cyf($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public btn a(btn $$0) {
      $$0.j(0);
      $$0.v(0.25F);
      return $$0;
   }

   public btn b(btn $$0) {
      $$0.v(0.25F);
      return $$0;
   }

   public cmx a(final dct $$0) {
      return new cmx(this.a(), jd.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean R_() {
            return $$0 == dct.d;
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
   public aqv c() {
      arj $$0 = arj.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aqv $$1 = new aqv(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean R_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      vt $$2 = new vt(zh.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new jd($$0, $$1, $$2));
   }

   public void e(jd $$0) {
      this.a(dga.dw, $$0);
      jd $$1 = this.j($$0);
      dtc $$2 = this.a().a_($$1);
      dkl $$3 = (dkl)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jd $$0, long $$1) {
      this.a($$0, dga.ha);
      this.b($$1, () -> this.a($$0, dga.a));
   }

   public void f(jd $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dfy $$3) {
      this.a(new jd($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dtc $$3) {
      this.a(new jd($$0, $$1, $$2), $$3);
   }

   public void a(jd $$0, dfy $$1) {
      this.a($$0, $$1.o());
   }

   public void a(jd $$0, dtc $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dfy $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jd($$1, $$2, $$3));
   }

   public void a(dfy $$0, jd $$1) {
      dtc $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dfy $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jd($$1, $$2, $$3));
   }

   public void b(dfy $$0, jd $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dfy $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jd($$1, $$2, $$3));
   }

   public void c(dfy $$0, jd $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jd $$0, Predicate<dfy> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(jd $$0, Predicate<dfy> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(jd $$0, duf<T> $$1, T $$2) {
      dtc $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sq($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(jd $$0, duf<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(jd $$0, Predicate<dtc> $$1, Supplier<String> $$2) {
      dtc $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sq($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends dqh> void c(jd $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new sq($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(jd $$0, ji $$1, IntPredicate $$2, Supplier<String> $$3) {
      jd $$4 = this.j($$0);
      aqu $$5 = this.a();
      dtc $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sq($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bsx<?> $$0) {
      List<? extends bsr> $$1 = this.a().a($$0, this.j(), bsr::bE);
      if ($$1.isEmpty()) {
         throw new sp("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bsx<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jd($$1, $$2, $$3));
   }

   public void c(bsx<?> $$0, jd $$1) {
      jd $$2 = this.j($$1);
      List<? extends bsr> $$3 = this.a().a($$0, new ewx($$2), bsr::bE);
      if ($$3.isEmpty()) {
         throw new sq("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(bsx<?> $$0, exc $$1, exc $$2) {
      List<? extends bsr> $$3 = this.a().a($$0, new ewx($$1, $$2), bsr::bE);
      if ($$3.isEmpty()) {
         throw new sq("Expected " + $$0.j() + " between ", jd.a((jw)$$1), jd.a((jw)$$2), this.a.o());
      }
   }

   public void a(bsx<?> $$0, int $$1) {
      List<? extends bsr> $$2 = this.a().a($$0, this.j(), bsr::bE);
      if ($$2.size() != $$1) {
         throw new sp("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bsx<?> $$0, jd $$1, int $$2, double $$3) {
      jd $$4 = this.j($$1);
      List<? extends bsr> $$5 = this.b((bsx<? extends bsr>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sq("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bsx<?> $$0, jd $$1, double $$2) {
      List<? extends bsr> $$3 = this.b((bsx<? extends bsr>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jd $$4 = this.j($$1);
         throw new sq("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bsr> List<T> b(bsx<T> $$0, jd $$1, double $$2) {
      jd $$3 = this.j($$1);
      return this.a().a($$0, new ewx($$3).g($$2), bsr::bE);
   }

   public <T extends bsr> List<T> c(bsx<T> $$0) {
      return this.a().a($$0, this.j(), bsr::bE);
   }

   public void a(bsr $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jd($$1, $$2, $$3));
   }

   public void a(bsr $$0, jd $$1) {
      jd $$2 = this.j($$1);
      List<? extends bsr> $$3 = this.a().a($$0.am(), new ewx($$2), bsr::bE);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sq("Expected " + $$0.am().j(), $$2, $$1, this.a.o()));
   }

   public void a(cul $$0, jd $$1, double $$2, int $$3) {
      jd $$4 = this.j($$1);
      List<cjh> $$5 = this.a().a(bsx.ag, new ewx($$4).g($$2), bsr::bE);
      int $$6 = 0;

      for (cjh $$7 : $$5) {
         cuq $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.H();
         }
      }

      if ($$6 != $$3) {
         throw new sq("Expected " + $$3 + " " + $$0.s().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cul $$0, jd $$1, double $$2) {
      jd $$3 = this.j($$1);

      for (bsr $$5 : this.a().a(bsx.ag, new ewx($$3).g($$2), bsr::bE)) {
         cjh $$6 = (cjh)$$5;
         if ($$6.p().g().equals($$0)) {
            return;
         }
      }

      throw new sq("Expected " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cul $$0, jd $$1, double $$2) {
      jd $$3 = this.j($$1);

      for (bsr $$5 : this.a().a(bsx.ag, new ewx($$3).g($$2), bsr::bE)) {
         cjh $$6 = (cjh)$$5;
         if ($$6.p().g().equals($$0)) {
            throw new sq("Did not expect " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cul $$0) {
      for (bsr $$2 : this.a().a(bsx.ag, this.j(), bsr::bE)) {
         cjh $$3 = (cjh)$$2;
         if ($$3.p().g().equals($$0)) {
            return;
         }
      }

      throw new sp("Expected " + $$0.s().getString() + " item");
   }

   public void b(cul $$0) {
      for (bsr $$2 : this.a().a(bsx.ag, this.j(), bsr::bE)) {
         cjh $$3 = (cjh)$$2;
         if ($$3.p().g().equals($$0)) {
            throw new sp("Did not expect " + $$0.s().getString() + " item");
         }
      }
   }

   public void d(bsx<?> $$0) {
      List<? extends bsr> $$1 = this.a().a($$0, this.j(), bsr::bE);
      if (!$$1.isEmpty()) {
         throw new sp("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bsx<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jd($$1, $$2, $$3));
   }

   public void d(bsx<?> $$0, jd $$1) {
      jd $$2 = this.j($$1);
      List<? extends bsr> $$3 = this.a().a($$0, new ewx($$2), bsr::bE);
      if (!$$3.isEmpty()) {
         throw new sq("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void b(bsx<?> $$0, exc $$1, exc $$2) {
      List<? extends bsr> $$3 = this.a().a($$0, new ewx($$1, $$2), bsr::bE);
      if (!$$3.isEmpty()) {
         throw new sq("Did not expect " + $$0.j() + " between ", jd.a((jw)$$1), jd.a((jw)$$2), this.a.o());
      }
   }

   public void a(bsx<?> $$0, double $$1, double $$2, double $$3) {
      exc $$4 = new exc($$1, $$2, $$3);
      exc $$5 = this.a($$4);
      Predicate<? super bsr> $$6 = $$1x -> $$1x.cK().a($$5, $$5);
      List<? extends bsr> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sp("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bsx<?> $$0, double $$1, double $$2, double $$3) {
      exc $$4 = new exc($$1, $$2, $$3);
      exc $$5 = this.a($$4);
      Predicate<? super bsr> $$6 = $$1x -> !$$1x.cK().a($$5, $$5);
      List<? extends bsr> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sp("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bsr, T> void a(jd $$0, bsx<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jd $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ewx($$4), bsr::bE);
      if ($$5.isEmpty()) {
         throw new sq("Expected " + $$1.j(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new sp("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new sp("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends btn> void a(jd $$0, bsx<E> $$1, cul $$2) {
      jd $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ewx($$3), bsr::bE);
      if ($$4.isEmpty()) {
         throw new sq("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sq("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bsr & cmi> void b(jd $$0, bsx<E> $$1, cul $$2) {
      jd $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ewx($$3), $$0x -> ((bsr)$$0x).bE());
      if ($$4.isEmpty()) {
         throw new sq("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.x().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sq("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(jd $$0) {
      jd $$1 = this.j($$0);
      dqh $$2 = this.a().c_($$1);
      if ($$2 instanceof dqb && !((dqb)$$2).c()) {
         throw new sp("Container should be empty");
      }
   }

   public void a(jd $$0, cul $$1) {
      jd $$2 = this.j($$0);
      dqh $$3 = this.a().c_($$2);
      if (!($$3 instanceof dqb)) {
         throw new sp("Expected a container at " + $$0 + ", found " + lt.j.b($$3.r()));
      } else if (((dqb)$$3).a_($$1) != 1) {
         throw new sp("Container should contain: " + $$1);
      }
   }

   public void a(ejj $$0, jd $$1) {
      jd.a($$0).forEach($$2 -> {
         jd $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jd $$0, jd $$1) {
      dtc $$2 = this.a($$0);
      dtc $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, jd $$1, cul $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jd $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bsr, T> void b(jd $$0, bsx<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bsr $$0, ewx $$1, String $$2) {
      if (!$$1.d(this.b($$0.dm()))) {
         this.a($$2);
      }
   }

   public <E extends bsr> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sp("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bsr, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sp("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(btn $$0, jm<brx> $$1, int $$2) {
      brz $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sp("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bsx<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jd($$1, $$2, $$3));
   }

   public void e(bsx<?> $$0, jd $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bsx<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jd($$1, $$2, $$3));
   }

   public void f(bsx<?> $$0, jd $$1) {
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

   public void h(jd $$0) {
      jd $$1 = this.j($$0);
      aqu $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(jd $$0) {
      jd $$1 = this.j($$0);
      aqu $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ewx $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jd($$4, $$3, $$5));
         }
      }
   }

   public int a(dyy.a $$0, int $$1, int $$2) {
      jd $$3 = this.j(new jd($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, jd $$1) {
      throw new sq($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, bsr $$1) {
      throw new sq($$0, $$1.do(), this.k($$1.do()), this.i());
   }

   public void a(String $$0) {
      throw new sp($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new sp("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public tb g() {
      return this.a.p();
   }

   public jd j(jd $$0) {
      jd $$1 = this.a.c();
      jd $$2 = $$1.a((kh)$$0);
      return ent.a($$2, dkv.a, this.a.t(), $$1);
   }

   public jd k(jd $$0) {
      jd $$1 = this.a.c();
      dmm $$2 = this.a.t().a(dmm.c);
      jd $$3 = ent.a($$0, dkv.a, $$2, $$1);
      return $$3.b($$1);
   }

   public exc a(exc $$0) {
      exc $$1 = exc.a(this.a.c());
      return ent.a($$1.e($$0), dkv.a, this.a.t(), this.a.c());
   }

   public exc b(exc $$0) {
      exc $$1 = exc.a(this.a.c());
      return ent.a($$0.d($$1), dkv.a, this.a.t(), this.a.c());
   }

   public dmm h() {
      return this.a.t();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sp($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sp("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sp($$1);
      }
   }

   public long i() {
      return this.a.o();
   }

   public ewx j() {
      return this.a.d();
   }

   private ewx l() {
      ewx $$0 = this.a.d();
      return $$0.a(jd.c.b(this.j(jd.c)));
   }

   public void a(Consumer<jd> $$0) {
      ewx $$1 = this.l().a(1.0, 1.0, 1.0);
      jd.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cmx $$0, cuq $$1, jd $$2, ji $$3) {
      jd $$4 = this.j($$2.a($$3));
      ewy $$5 = new ewy(exc.b($$4), $$3, $$4, false);
      cyf $$6 = new cyf($$0, bqq.a, $$5);
      $$1.a($$6);
   }

   public void a(akq<ddw> $$0) {
      ewx $$1 = this.j();
      jd $$2 = jd.a($$1.a, $$1.b, $$1.c);
      jd $$3 = jd.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = amv.a(this.a(), $$2, $$3, this.a().H_().d(lu.aF).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
