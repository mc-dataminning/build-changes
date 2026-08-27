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

public class st {
   private final su a;
   private boolean b;

   public st(su $$0) {
      this.a = $$0;
   }

   public aqe a() {
      return this.a.f();
   }

   public dpy a(im $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public dnd b(im $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(bql.class);
   }

   public void a(Class $$0) {
      eta $$1 = this.i();
      List<bql> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof ckl));
      $$2.forEach(bql::al);
   }

   public cgv a(cry $$0, etf $$1) {
      aqe $$2 = this.a();
      etf $$3 = this.a($$1);
      cgv $$4 = new cgv($$2, $$3.c, $$3.d, $$3.e, new csd($$0, 1));
      $$4.o(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cgv a(cry $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new etf((double)$$1, (double)$$2, (double)$$3));
   }

   public cgv a(cry $$0, im $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bql> E a(bqr<E> $$0, im $$1) {
      return this.a($$0, etf.c($$1));
   }

   public <E extends bql> E a(bqr<E> $$0, etf $$1) {
      aqe $$2 = this.a();
      E $$3 = $$0.a((czu)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof brg $$4) {
            $$4.fT();
         }

         etf $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dD(), $$3.dF());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bql> E a(bqr<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bql> E a(bqr<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sm("Expected " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sm("Expected only one " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         etf $$6 = this.a(new etf((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dl().f($$6);
            double $$4x = $$2x.dl().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bql> List<E> b(bqr<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, etf.c(new im($$1, $$2, $$3)), $$4);
   }

   public <E extends bql> List<E> a(bqr<E> $$0, etf $$1, double $$2) {
      aqe $$3 = this.a();
      etf $$4 = this.a($$1);
      eta $$5 = this.a.d();
      eta $$6 = new eta($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cI().c($$6) && $$1x.bB());
   }

   public <E extends bql> E a(bqr<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new im($$1, $$2, $$3));
   }

   public <E extends bql> E a(bqr<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new etf((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends brg> E b(bqr<E> $$0, im $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gk();
      return $$2;
   }

   public <E extends brg> E b(bqr<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new im($$1, $$2, $$3));
   }

   public <E extends brg> E b(bqr<E> $$0, etf $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gk();
      return $$2;
   }

   public <E extends brg> E b(bqr<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new etf((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(brg $$0, float $$1, float $$2, float $$3) {
      etf $$4 = this.a(new etf((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.c, $$4.d, $$4.e, $$0.dD(), $$0.dF());
   }

   public sy a(brg $$0, im $$1, float $$2) {
      return this.g().a(2, () -> {
         emf $$3 = $$0.K().a(this.j($$1), 0);
         $$0.K().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new im($$0, $$1, $$2));
   }

   public void c(im $$0) {
      this.b($$0, $$0x -> $$0x.a(avo.f), () -> "Expected button");
      im $$1 = this.j($$0);
      dpy $$2 = this.a().a_($$1);
      ddf $$3 = (ddf)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(im $$0) {
      this.a($$0, this.a(czr.b));
   }

   public void a(im $$0, ckl $$1) {
      im $$2 = this.j($$0);
      this.a($$0, $$1, new etb(etf.b($$2), ir.c, $$2, true));
   }

   public void a(im $$0, ckl $$1, etb $$2) {
      im $$3 = this.j($$0);
      dpy $$4 = this.a().a_($$3);
      bop $$5 = bop.a;
      bos $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bos.d || !$$4.a(this.a(), $$1, $$2).a()) {
            cvn $$7 = new cvn($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bre a(bre $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public bre b(bre $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public ckl a(final czr $$0) {
      return new ckl(this.a(), im.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean N_() {
            return $$0 == czr.d;
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
   public aqf c() {
      aqt $$0 = aqt.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      aqf $$1 = new aqf(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean N_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      vq $$2 = new vq(za.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new im($$0, $$1, $$2));
   }

   public void e(im $$0) {
      this.a(dcx.dw, $$0);
      im $$1 = this.j($$0);
      dpy $$2 = this.a().a_($$1);
      dhi $$3 = (dhi)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(im $$0, long $$1) {
      this.a($$0, dcx.ha);
      this.b($$1, () -> this.a($$0, dcx.a));
   }

   public void f(im $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dcv $$3) {
      this.a(new im($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dpy $$3) {
      this.a(new im($$0, $$1, $$2), $$3);
   }

   public void a(im $$0, dcv $$1) {
      this.a($$0, $$1.n());
   }

   public void a(im $$0, dpy $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dcv $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new im($$1, $$2, $$3));
   }

   public void a(dcv $$0, im $$1) {
      dpy $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dcv $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new im($$1, $$2, $$3));
   }

   public void b(dcv $$0, im $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dcv $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new im($$1, $$2, $$3));
   }

   public void c(dcv $$0, im $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(im $$0, Predicate<dcv> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(im $$0, Predicate<dcv> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(im $$0, drb<T> $$1, T $$2) {
      dpy $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sn($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(im $$0, drb<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(im $$0, Predicate<dpy> $$1, Supplier<String> $$2) {
      dpy $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sn($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(im $$0, ir $$1, IntPredicate $$2, Supplier<String> $$3) {
      im $$4 = this.j($$0);
      aqe $$5 = this.a();
      dpy $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sn($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bqr<?> $$0) {
      List<? extends bql> $$1 = this.a().a($$0, this.i(), bql::bB);
      if ($$1.isEmpty()) {
         throw new sm("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bqr<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new im($$1, $$2, $$3));
   }

   public void c(bqr<?> $$0, im $$1) {
      im $$2 = this.j($$1);
      List<? extends bql> $$3 = this.a().a($$0, new eta($$2), bql::bB);
      if ($$3.isEmpty()) {
         throw new sn("Expected " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bqr<?> $$0, etf $$1, etf $$2) {
      List<? extends bql> $$3 = this.a().a($$0, new eta($$1, $$2), bql::bB);
      if ($$3.isEmpty()) {
         throw new sn("Expected " + $$0.i() + " between ", im.a($$1), im.a($$2), this.a.o());
      }
   }

   public void a(bqr<?> $$0, int $$1) {
      List<? extends bql> $$2 = this.a().a($$0, this.i(), bql::bB);
      if ($$2.size() != $$1) {
         throw new sm("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(bqr<?> $$0, im $$1, int $$2, double $$3) {
      im $$4 = this.j($$1);
      List<? extends bql> $$5 = this.b((bqr<? extends bql>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sn("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bqr<?> $$0, im $$1, double $$2) {
      List<? extends bql> $$3 = this.b((bqr<? extends bql>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         im $$4 = this.j($$1);
         throw new sn("Expected " + $$0.i(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bql> List<T> b(bqr<T> $$0, im $$1, double $$2) {
      im $$3 = this.j($$1);
      return this.a().a($$0, new eta($$3).g($$2), bql::bB);
   }

   public <T extends bql> List<T> c(bqr<T> $$0) {
      return this.a().a($$0, this.i(), bql::bB);
   }

   public void a(bql $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new im($$1, $$2, $$3));
   }

   public void a(bql $$0, im $$1) {
      im $$2 = this.j($$1);
      List<? extends bql> $$3 = this.a().a($$0.ai(), new eta($$2), bql::bB);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sn("Expected " + $$0.ai().i(), $$2, $$1, this.a.o()));
   }

   public void a(cry $$0, im $$1, double $$2, int $$3) {
      im $$4 = this.j($$1);
      List<cgv> $$5 = this.a().a(bqr.ag, new eta($$4).g($$2), bql::bB);
      int $$6 = 0;

      for (cgv $$7 : $$5) {
         csd $$8 = $$7.p();
         if ($$8.a($$0)) {
            $$6 += $$8.G();
         }
      }

      if ($$6 != $$3) {
         throw new sn("Expected " + $$3 + " " + $$0.t().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cry $$0, im $$1, double $$2) {
      im $$3 = this.j($$1);

      for (bql $$5 : this.a().a(bqr.ag, new eta($$3).g($$2), bql::bB)) {
         cgv $$6 = (cgv)$$5;
         if ($$6.p().f().equals($$0)) {
            return;
         }
      }

      throw new sn("Expected " + $$0.t().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cry $$0, im $$1, double $$2) {
      im $$3 = this.j($$1);

      for (bql $$5 : this.a().a(bqr.ag, new eta($$3).g($$2), bql::bB)) {
         cgv $$6 = (cgv)$$5;
         if ($$6.p().f().equals($$0)) {
            throw new sn("Did not expect " + $$0.t().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cry $$0) {
      for (bql $$2 : this.a().a(bqr.ag, this.i(), bql::bB)) {
         cgv $$3 = (cgv)$$2;
         if ($$3.p().f().equals($$0)) {
            return;
         }
      }

      throw new sm("Expected " + $$0.t().getString() + " item");
   }

   public void b(cry $$0) {
      for (bql $$2 : this.a().a(bqr.ag, this.i(), bql::bB)) {
         cgv $$3 = (cgv)$$2;
         if ($$3.p().f().equals($$0)) {
            throw new sm("Did not expect " + $$0.t().getString() + " item");
         }
      }
   }

   public void d(bqr<?> $$0) {
      List<? extends bql> $$1 = this.a().a($$0, this.i(), bql::bB);
      if (!$$1.isEmpty()) {
         throw new sm("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bqr<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new im($$1, $$2, $$3));
   }

   public void d(bqr<?> $$0, im $$1) {
      im $$2 = this.j($$1);
      List<? extends bql> $$3 = this.a().a($$0, new eta($$2), bql::bB);
      if (!$$3.isEmpty()) {
         throw new sn("Did not expect " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bqr<?> $$0, double $$1, double $$2, double $$3) {
      etf $$4 = new etf($$1, $$2, $$3);
      etf $$5 = this.a($$4);
      Predicate<? super bql> $$6 = $$1x -> $$1x.cI().a($$5, $$5);
      List<? extends bql> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sm("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bqr<?> $$0, double $$1, double $$2, double $$3) {
      etf $$4 = new etf($$1, $$2, $$3);
      etf $$5 = this.a($$4);
      Predicate<? super bql> $$6 = $$1x -> !$$1x.cI().a($$5, $$5);
      List<? extends bql> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new sm("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bql, T> void a(im $$0, bqr<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      im $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new eta($$4), bql::bB);
      if ($$5.isEmpty()) {
         throw new sn("Expected " + $$1.i(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new sm("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new sm("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bre> void a(im $$0, bqr<E> $$1, cry $$2) {
      im $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new eta($$3), bql::bB);
      if ($$4.isEmpty()) {
         throw new sn("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sn("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends bql & cjw> void b(im $$0, bqr<E> $$1, cry $$2) {
      im $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new eta($$3), $$0x -> ((bql)$$0x).bB());
      if ($$4.isEmpty()) {
         throw new sn("Expected " + $$1.i() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sn("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(im $$0) {
      im $$1 = this.j($$0);
      dnd $$2 = this.a().c_($$1);
      if ($$2 instanceof dmx && !((dmx)$$2).c()) {
         throw new sm("Container should be empty");
      }
   }

   public void a(im $$0, cry $$1) {
      im $$2 = this.j($$0);
      dnd $$3 = this.a().c_($$2);
      if (!($$3 instanceof dmx)) {
         throw new sm("Expected a container at " + $$0 + ", found " + lc.k.b($$3.r()));
      } else if (((dmx)$$3).a_($$1) != 1) {
         throw new sm("Container should contain: " + $$1);
      }
   }

   public void a(efy $$0, im $$1) {
      im.a($$0).forEach($$2 -> {
         im $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(im $$0, im $$1) {
      dpy $$2 = this.a($$0);
      dpy $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, im $$1, cry $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, im $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bql, T> void b(im $$0, bqr<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bql> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sm("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bql, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sm("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bre $$0, iv<bpv> $$1, int $$2) {
      bpx $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sm("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bqr<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new im($$1, $$2, $$3));
   }

   public void e(bqr<?> $$0, im $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bqr<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new im($$1, $$2, $$3));
   }

   public void f(bqr<?> $$0, im $$1) {
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

   public void h(im $$0) {
      im $$1 = this.j($$0);
      aqe $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(im $$0) {
      im $$1 = this.j($$0);
      aqe $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      eta $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new im($$4, $$3, $$5));
         }
      }
   }

   public int a(dvq.a $$0, int $$1, int $$2) {
      im $$3 = this.j(new im($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, im $$1) {
      throw new sn($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, bql $$1) {
      throw new sn($$0, $$1.dn(), this.k($$1.dn()), this.h());
   }

   public void a(String $$0) {
      throw new sm($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new sm("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public sy g() {
      return this.a.p();
   }

   public im j(im $$0) {
      im $$1 = this.a.c();
      im $$2 = $$1.a((jq)$$0);
      return ekg.a($$2, dhs.a, this.a.t(), $$1);
   }

   public im k(im $$0) {
      im $$1 = this.a.c();
      dji $$2 = this.a.t().a(dji.c);
      im $$3 = ekg.a($$0, dhs.a, $$2, $$1);
      return $$3.b($$1);
   }

   public etf a(etf $$0) {
      etf $$1 = etf.a(this.a.c());
      return ekg.a($$1.e($$0), dhs.a, this.a.t(), this.a.c());
   }

   public etf b(etf $$0) {
      etf $$1 = etf.a(this.a.c());
      return ekg.a($$0.d($$1), dhs.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sm($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sm("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sm($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public eta i() {
      return this.a.d();
   }

   private eta k() {
      eta $$0 = this.a.d();
      return $$0.a(im.c.b(this.j(im.c)));
   }

   public void a(Consumer<im> $$0) {
      eta $$1 = this.k().a(1.0, 1.0, 1.0);
      im.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(ckl $$0, csd $$1, im $$2, ir $$3) {
      im $$4 = this.j($$2.a($$3));
      etb $$5 = new etb(etf.b($$4), $$3, $$4, false);
      cvn $$6 = new cvn($$0, bop.a, $$5);
      $$1.a($$6);
   }

   public void a(ake<dat> $$0) {
      eta $$1 = this.i();
      im $$2 = im.a($$1.a, $$1.b, $$1.c);
      im $$3 = im.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = amh.a(this.a(), $$2, $$3, this.a().H_().d(ld.ay).g($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
