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

public class sv {
   private final sw a;
   private boolean b;

   public sv(sw $$0) {
      this.a = $$0;
   }

   public aqt a() {
      return this.a.f();
   }

   public dta a(jd $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dqf> T b(jd $$0) {
      dqf $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new sp("Missing block entity", this.j($$0), $$0, this.a.o());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bsq.class);
   }

   public void a(Class $$0) {
      ewr $$1 = this.i();
      List<bsq> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cmv));
      $$2.forEach(bsq::ap);
   }

   public cjf a(cuj $$0, eww $$1) {
      aqt $$2 = this.a();
      eww $$3 = this.a($$1);
      cjf $$4 = new cjf($$2, $$3.c, $$3.d, $$3.e, new cuo($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cjf a(cuj $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eww((double)$$1, (double)$$2, (double)$$3));
   }

   public cjf a(cuj $$0, jd $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bsq> E a(bsw<E> $$0, jd $$1) {
      return this.a($$0, eww.c($$1));
   }

   public <E extends bsq> E a(bsw<E> $$0, eww $$1) {
      aqt $$2 = this.a();
      E $$3 = $$0.a((dcu)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof btn $$4) {
            $$4.fP();
         }

         eww $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dG(), $$3.dI());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bsq> E a(bsw<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bsq> E a(bsw<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new so("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new so("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         eww $$6 = this.a(new eww((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.do().f($$6);
            double $$4x = $$2x.do().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bsq> List<E> b(bsw<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, eww.c(new jd($$1, $$2, $$3)), $$4);
   }

   public <E extends bsq> List<E> a(bsw<E> $$0, eww $$1, double $$2) {
      aqt $$3 = this.a();
      eww $$4 = this.a($$1);
      ewr $$5 = this.a.d();
      ewr $$6 = new ewr($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cL().c($$6) && $$1x.bE());
   }

   public <E extends bsq> E a(bsw<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jd($$1, $$2, $$3));
   }

   public <E extends bsq> E a(bsw<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eww((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends btn> E b(bsw<E> $$0, jd $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gh();
      return $$2;
   }

   public <E extends btn> E b(bsw<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jd($$1, $$2, $$3));
   }

   public <E extends btn> E b(bsw<E> $$0, eww $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gh();
      return $$2;
   }

   public <E extends btn> E b(bsw<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new eww((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(btn $$0, float $$1, float $$2, float $$3) {
      eww $$4 = this.a(new eww((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dG(), $$0.dI());
   }

   public ta a(btn $$0, jd $$1, float $$2) {
      return this.g().a(2, () -> {
         epm $$3 = $$0.J().a(this.j($$1), 0);
         $$0.J().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new jd($$0, $$1, $$2));
   }

   public void c(jd $$0) {
      this.b($$0, $$0x -> $$0x.a(awd.f), () -> "Expected button");
      jd $$1 = this.j($$0);
      dta $$2 = this.a().a_($$1);
      dgg $$3 = (dgg)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(jd $$0) {
      this.a($$0, this.a(dcr.b));
   }

   public void a(jd $$0, cmv $$1) {
      jd $$2 = this.j($$0);
      this.a($$0, $$1, new ews(eww.b($$2), ji.c, $$2, true));
   }

   public void a(jd $$0, cmv $$1, ews $$2) {
      jd $$3 = this.j($$0);
      dta $$4 = this.a().a_($$3);
      bqp $$5 = bqp.a;
      bqs $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bqs.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cyd $$7 = new cyd($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public btl a(btl $$0) {
      $$0.j(0);
      $$0.u(0.25F);
      return $$0;
   }

   public btl b(btl $$0) {
      $$0.u(0.25F);
      return $$0;
   }

   public cmv a(final dcr $$0) {
      return new cmv(this.a(), jd.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return $$0 == dcr.d;
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
   public aqu c() {
      ari $$0 = ari.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aqu $$1 = new aqu(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      vs $$2 = new vs(zg.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new jd($$0, $$1, $$2));
   }

   public void e(jd $$0) {
      this.a(dfy.dw, $$0);
      jd $$1 = this.j($$0);
      dta $$2 = this.a().a_($$1);
      dkj $$3 = (dkj)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jd $$0, long $$1) {
      this.a($$0, dfy.ha);
      this.b($$1, () -> this.a($$0, dfy.a));
   }

   public void f(jd $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dfw $$3) {
      this.a(new jd($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dta $$3) {
      this.a(new jd($$0, $$1, $$2), $$3);
   }

   public void a(jd $$0, dfw $$1) {
      this.a($$0, $$1.o());
   }

   public void a(jd $$0, dta $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dfw $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jd($$1, $$2, $$3));
   }

   public void a(dfw $$0, jd $$1) {
      dta $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dfw $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jd($$1, $$2, $$3));
   }

   public void b(dfw $$0, jd $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dfw $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jd($$1, $$2, $$3));
   }

   public void c(dfw $$0, jd $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jd $$0, Predicate<dfw> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(jd $$0, Predicate<dfw> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(jd $$0, dud<T> $$1, T $$2) {
      dta $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sp($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(jd $$0, dud<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(jd $$0, Predicate<dta> $$1, Supplier<String> $$2) {
      dta $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sp($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends dqf> void c(jd $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new sp($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(jd $$0, ji $$1, IntPredicate $$2, Supplier<String> $$3) {
      jd $$4 = this.j($$0);
      aqt $$5 = this.a();
      dta $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sp($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bsw<?> $$0) {
      List<? extends bsq> $$1 = this.a().a($$0, this.i(), bsq::bE);
      if ($$1.isEmpty()) {
         throw new so("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bsw<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jd($$1, $$2, $$3));
   }

   public void c(bsw<?> $$0, jd $$1) {
      jd $$2 = this.j($$1);
      List<? extends bsq> $$3 = this.a().a($$0, new ewr($$2), bsq::bE);
      if ($$3.isEmpty()) {
         throw new sp("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(bsw<?> $$0, eww $$1, eww $$2) {
      List<? extends bsq> $$3 = this.a().a($$0, new ewr($$1, $$2), bsq::bE);
      if ($$3.isEmpty()) {
         throw new sp("Expected " + $$0.j() + " between ", jd.a((jw)$$1), jd.a((jw)$$2), this.a.o());
      }
   }

   public void a(bsw<?> $$0, int $$1) {
      List<? extends bsq> $$2 = this.a().a($$0, this.i(), bsq::bE);
      if ($$2.size() != $$1) {
         throw new so("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bsw<?> $$0, jd $$1, int $$2, double $$3) {
      jd $$4 = this.j($$1);
      List<? extends bsq> $$5 = this.b((bsw<? extends bsq>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sp("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bsw<?> $$0, jd $$1, double $$2) {
      List<? extends bsq> $$3 = this.b((bsw<? extends bsq>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jd $$4 = this.j($$1);
         throw new sp("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bsq> List<T> b(bsw<T> $$0, jd $$1, double $$2) {
      jd $$3 = this.j($$1);
      return this.a().a($$0, new ewr($$3).g($$2), bsq::bE);
   }

   public <T extends bsq> List<T> c(bsw<T> $$0) {
      return this.a().a($$0, this.i(), bsq::bE);
   }

   public void a(bsq $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jd($$1, $$2, $$3));
   }

   public void a(bsq $$0, jd $$1) {
      jd $$2 = this.j($$1);
      List<? extends bsq> $$3 = this.a().a($$0.am(), new ewr($$2), bsq::bE);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sp("Expected " + $$0.am().j(), $$2, $$1, this.a.o()));
   }

   public void a(cuj $$0, jd $$1, double $$2, int $$3) {
      jd $$4 = this.j($$1);
      List<cjf> $$5 = this.a().a(bsw.ag, new ewr($$4).g($$2), bsq::bE);
      int $$6 = 0;

      for (cjf $$7 : $$5) {
         cuo $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.H();
         }
      }

      if ($$6 != $$3) {
         throw new sp("Expected " + $$3 + " " + $$0.s().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cuj $$0, jd $$1, double $$2) {
      jd $$3 = this.j($$1);

      for (bsq $$5 : this.a().a(bsw.ag, new ewr($$3).g($$2), bsq::bE)) {
         cjf $$6 = (cjf)$$5;
         if ($$6.p().g().equals($$0)) {
            return;
         }
      }

      throw new sp("Expected " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cuj $$0, jd $$1, double $$2) {
      jd $$3 = this.j($$1);

      for (bsq $$5 : this.a().a(bsw.ag, new ewr($$3).g($$2), bsq::bE)) {
         cjf $$6 = (cjf)$$5;
         if ($$6.p().g().equals($$0)) {
            throw new sp("Did not expect " + $$0.s().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cuj $$0) {
      for (bsq $$2 : this.a().a(bsw.ag, this.i(), bsq::bE)) {
         cjf $$3 = (cjf)$$2;
         if ($$3.p().g().equals($$0)) {
            return;
         }
      }

      throw new so("Expected " + $$0.s().getString() + " item");
   }

   public void b(cuj $$0) {
      for (bsq $$2 : this.a().a(bsw.ag, this.i(), bsq::bE)) {
         cjf $$3 = (cjf)$$2;
         if ($$3.p().g().equals($$0)) {
            throw new so("Did not expect " + $$0.s().getString() + " item");
         }
      }
   }

   public void d(bsw<?> $$0) {
      List<? extends bsq> $$1 = this.a().a($$0, this.i(), bsq::bE);
      if (!$$1.isEmpty()) {
         throw new so("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bsw<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jd($$1, $$2, $$3));
   }

   public void d(bsw<?> $$0, jd $$1) {
      jd $$2 = this.j($$1);
      List<? extends bsq> $$3 = this.a().a($$0, new ewr($$2), bsq::bE);
      if (!$$3.isEmpty()) {
         throw new sp("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void b(bsw<?> $$0, eww $$1, eww $$2) {
      List<? extends bsq> $$3 = this.a().a($$0, new ewr($$1, $$2), bsq::bE);
      if (!$$3.isEmpty()) {
         throw new sp("Did not expect " + $$0.j() + " between ", jd.a((jw)$$1), jd.a((jw)$$2), this.a.o());
      }
   }

   public void a(bsw<?> $$0, double $$1, double $$2, double $$3) {
      eww $$4 = new eww($$1, $$2, $$3);
      eww $$5 = this.a($$4);
      Predicate<? super bsq> $$6 = $$1x -> $$1x.cL().a($$5, $$5);
      List<? extends bsq> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new so("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bsw<?> $$0, double $$1, double $$2, double $$3) {
      eww $$4 = new eww($$1, $$2, $$3);
      eww $$5 = this.a($$4);
      Predicate<? super bsq> $$6 = $$1x -> !$$1x.cL().a($$5, $$5);
      List<? extends bsq> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new so("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bsq, T> void a(jd $$0, bsw<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jd $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ewr($$4), bsq::bE);
      if ($$5.isEmpty()) {
         throw new sp("Expected " + $$1.j(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new so("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new so("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends btl> void a(jd $$0, bsw<E> $$1, cuj $$2) {
      jd $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ewr($$3), bsq::bE);
      if ($$4.isEmpty()) {
         throw new sp("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sp("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends bsq & cmg> void b(jd $$0, bsw<E> $$1, cuj $$2) {
      jd $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ewr($$3), $$0x -> ((bsq)$$0x).bE());
      if ($$4.isEmpty()) {
         throw new sp("Expected " + $$1.j() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.x().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sp("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(jd $$0) {
      jd $$1 = this.j($$0);
      dqf $$2 = this.a().c_($$1);
      if ($$2 instanceof dpz && !((dpz)$$2).c()) {
         throw new so("Container should be empty");
      }
   }

   public void a(jd $$0, cuj $$1) {
      jd $$2 = this.j($$0);
      dqf $$3 = this.a().c_($$2);
      if (!($$3 instanceof dpz)) {
         throw new so("Expected a container at " + $$0 + ", found " + lt.j.b($$3.r()));
      } else if (((dpz)$$3).a_($$1) != 1) {
         throw new so("Container should contain: " + $$1);
      }
   }

   public void a(eje $$0, jd $$1) {
      jd.a($$0).forEach($$2 -> {
         jd $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jd $$0, jd $$1) {
      dta $$2 = this.a($$0);
      dta $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, jd $$1, cuj $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jd $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bsq, T> void b(jd $$0, bsw<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bsq> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new so("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bsq, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new so("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(btl $$0, jm<brw> $$1, int $$2) {
      bry $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new so("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bsw<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jd($$1, $$2, $$3));
   }

   public void e(bsw<?> $$0, jd $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bsw<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jd($$1, $$2, $$3));
   }

   public void f(bsw<?> $$0, jd $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void e() {
      this.a.l();
   }

   private void j() {
      if (this.b) {
         throw new IllegalStateException("This test already has final clause");
      } else {
         this.b = true;
      }
   }

   public void a(Runnable $$0) {
      this.j();
      this.a.p().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.j();
      this.a.p().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.j();
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
      aqt $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(jd $$0) {
      jd $$1 = this.j($$0);
      aqt $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ewr $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jd($$4, $$3, $$5));
         }
      }
   }

   public int a(dyv.a $$0, int $$1, int $$2) {
      jd $$3 = this.j(new jd($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, jd $$1) {
      throw new sp($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, bsq $$1) {
      throw new sp($$0, $$1.dq(), this.k($$1.dq()), this.h());
   }

   public void a(String $$0) {
      throw new so($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new so("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public ta g() {
      return this.a.p();
   }

   public jd j(jd $$0) {
      jd $$1 = this.a.c();
      jd $$2 = $$1.a((kh)$$0);
      return enn.a($$2, dkt.a, this.a.t(), $$1);
   }

   public jd k(jd $$0) {
      jd $$1 = this.a.c();
      dmk $$2 = this.a.t().a(dmk.c);
      jd $$3 = enn.a($$0, dkt.a, $$2, $$1);
      return $$3.b($$1);
   }

   public eww a(eww $$0) {
      eww $$1 = eww.a(this.a.c());
      return enn.a($$1.e($$0), dkt.a, this.a.t(), this.a.c());
   }

   public eww b(eww $$0) {
      eww $$1 = eww.a(this.a.c());
      return enn.a($$0.d($$1), dkt.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new so($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new so("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new so($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public ewr i() {
      return this.a.d();
   }

   private ewr k() {
      ewr $$0 = this.a.d();
      return $$0.a(jd.c.b(this.j(jd.c)));
   }

   public void a(Consumer<jd> $$0) {
      ewr $$1 = this.k().a(1.0, 1.0, 1.0);
      jd.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cmv $$0, cuo $$1, jd $$2, ji $$3) {
      jd $$4 = this.j($$2.a($$3));
      ews $$5 = new ews(eww.b($$4), $$3, $$4, false);
      cyd $$6 = new cyd($$0, bqp.a, $$5);
      $$1.a($$6);
   }

   public void a(akp<ddu> $$0) {
      ewr $$1 = this.i();
      jd $$2 = jd.a($$1.a, $$1.b, $$1.c);
      jd $$3 = jd.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = amu.a(this.a(), $$2, $$3, this.a().H_().d(lu.aF).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
