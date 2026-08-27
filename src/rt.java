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

public class rt {
   private final ru a;
   private boolean b;

   public rt(ru $$0) {
      this.a = $$0;
   }

   public apa a() {
      return this.a.f();
   }

   public dme a(ib $$0) {
      return this.a().a_(this.j($$0));
   }

   @Nullable
   public djl b(ib $$0) {
      return this.a().c_(this.j($$0));
   }

   public void b() {
      this.a(bof.class);
   }

   public void a(Class $$0) {
      eoq $$1 = this.i();
      List<bof> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cia));
      $$2.forEach(bof::al);
   }

   public cel a(cpl $$0, float $$1, float $$2, float $$3) {
      apa $$4 = this.a();
      eov $$5 = this.a(new eov((double)$$1, (double)$$2, (double)$$3));
      cel $$6 = new cel($$4, $$5.c, $$5.d, $$5.e, new cpq($$0, 1));
      $$6.o(0.0, 0.0, 0.0);
      $$4.b($$6);
      return $$6;
   }

   public cel a(cpl $$0, ib $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bof> E a(bol<E> $$0, ib $$1) {
      return this.a($$0, eov.c($$1));
   }

   public <E extends bof> E a(bol<E> $$0, eov $$1) {
      apa $$2 = this.a();
      E $$3 = $$0.a((cwe)$$2);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof boz $$4) {
            $$4.fQ();
         }

         eov $$5 = this.a($$1);
         $$3.b($$5.c, $$5.d, $$5.e, $$3.dz(), $$3.dB());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends bof> E a(bol<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bof> E a(bol<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new rm("Expected " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new rm("Expected only one " + $$0.i() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         eov $$6 = this.a(new eov((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dh().f($$6);
            double $$4x = $$2x.dh().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bof> List<E> b(bol<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, eov.c(new ib($$1, $$2, $$3)), $$4);
   }

   public <E extends bof> List<E> a(bol<E> $$0, eov $$1, double $$2) {
      apa $$3 = this.a();
      eov $$4 = this.a($$1);
      eoq $$5 = this.a.d();
      eoq $$6 = new eoq($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cE().c($$6) && $$1x.bx());
   }

   public <E extends bof> E a(bol<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new ib($$1, $$2, $$3));
   }

   public <E extends bof> E a(bol<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new eov((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends boz> E b(bol<E> $$0, ib $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gg();
      return $$2;
   }

   public <E extends boz> E b(bol<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new ib($$1, $$2, $$3));
   }

   public <E extends boz> E b(bol<E> $$0, eov $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gg();
      return $$2;
   }

   public <E extends boz> E b(bol<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new eov((double)$$1, (double)$$2, (double)$$3));
   }

   public ry a(boz $$0, ib $$1, float $$2) {
      return this.g().a(2, () -> {
         eig $$3 = $$0.N().a(this.j($$1), 0);
         $$0.N().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new ib($$0, $$1, $$2));
   }

   public void c(ib $$0) {
      this.b($$0, $$0x -> $$0x.a(aue.f), () -> "Expected button");
      ib $$1 = this.j($$0);
      dme $$2 = this.a().a_($$1);
      czp $$3 = (czp)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void d(ib $$0) {
      this.a($$0, this.a(cwb.b));
   }

   public void a(ib $$0, cia $$1) {
      ib $$2 = this.j($$0);
      this.a($$0, $$1, new eor(eov.b($$2), ih.c, $$2, true));
   }

   public void a(ib $$0, cia $$1, eor $$2) {
      ib $$3 = this.j($$0);
      dme $$4 = this.a().a_($$3);
      bmk $$5 = bmk.a;
      bmn $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if ($$6 != bmn.d || !$$4.a(this.a(), $$1, $$2).a()) {
            crz $$7 = new crz($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public box a(box $$0) {
      $$0.k(0);
      $$0.t(0.25F);
      return $$0;
   }

   public box b(box $$0) {
      $$0.t(0.25F);
      return $$0;
   }

   public cia a(final cwb $$0) {
      return new cia(this.a(), ib.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean P_() {
            return $$0 == cwb.d;
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
   public apb c() {
      app $$0 = app.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      apb $$1 = new apb(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean P_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      uq $$2 = new uq(ya.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ah().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new ib($$0, $$1, $$2));
   }

   public void e(ib $$0) {
      this.a(czh.dw, $$0);
      ib $$1 = this.j($$0);
      dme $$2 = this.a().a_($$1);
      ddr $$3 = (ddr)$$2.b();
      $$3.d($$2, this.a(), $$1);
   }

   public void a(ib $$0, long $$1) {
      this.a($$0, czh.ha);
      this.b($$1, () -> this.a($$0, czh.a));
   }

   public void f(ib $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, czf $$3) {
      this.a(new ib($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dme $$3) {
      this.a(new ib($$0, $$1, $$2), $$3);
   }

   public void a(ib $$0, czf $$1) {
      this.a($$0, $$1.o());
   }

   public void a(ib $$0, dme $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(czf $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ib($$1, $$2, $$3));
   }

   public void a(czf $$0, ib $$1) {
      dme $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(czf $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new ib($$1, $$2, $$3));
   }

   public void b(czf $$0, ib $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(czf $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ib($$1, $$2, $$3));
   }

   public void c(czf $$0, ib $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(ib $$0, Predicate<czf> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(ib $$0, Predicate<czf> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(ib $$0, dnh<T> $$1, T $$2) {
      dme $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new rn($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(ib $$0, dnh<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(ib $$0, Predicate<dme> $$1, Supplier<String> $$2) {
      dme $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new rn($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(ib $$0, ih $$1, IntPredicate $$2, Supplier<String> $$3) {
      ib $$4 = this.j($$0);
      apa $$5 = this.a();
      dme $$6 = $$5.a_($$4);
      int $$7 = $$6.b($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new rn($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bol<?> $$0) {
      List<? extends bof> $$1 = this.a().a($$0, this.i(), bof::bx);
      if ($$1.isEmpty()) {
         throw new rm("Expected " + $$0.i() + " to exist");
      }
   }

   public void c(bol<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new ib($$1, $$2, $$3));
   }

   public void c(bol<?> $$0, ib $$1) {
      ib $$2 = this.j($$1);
      List<? extends bof> $$3 = this.a().a($$0, new eoq($$2), bof::bx);
      if ($$3.isEmpty()) {
         throw new rn("Expected " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bol<?> $$0, eov $$1, eov $$2) {
      List<? extends bof> $$3 = this.a().a($$0, new eoq($$1, $$2), bof::bx);
      if ($$3.isEmpty()) {
         throw new rn("Expected " + $$0.i() + " between ", ib.a($$1), ib.a($$2), this.a.o());
      }
   }

   public void a(bol<?> $$0, int $$1) {
      List<? extends bof> $$2 = this.a().a($$0, this.i(), bof::bx);
      if ($$2.size() != $$1) {
         throw new rm("Expected " + $$1 + " of type " + $$0.i() + " to exist, found " + $$2.size());
      }
   }

   public void a(bol<?> $$0, ib $$1, int $$2, double $$3) {
      ib $$4 = this.j($$1);
      List<? extends bof> $$5 = this.b((bol<? extends bof>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new rn("Expected " + $$2 + " entities of type " + $$0.i() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bol<?> $$0, ib $$1, double $$2) {
      List<? extends bof> $$3 = this.b((bol<? extends bof>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         ib $$4 = this.j($$1);
         throw new rn("Expected " + $$0.i(), $$4, $$1, this.a.o());
      }
   }

   public <T extends bof> List<T> b(bol<T> $$0, ib $$1, double $$2) {
      ib $$3 = this.j($$1);
      return this.a().a($$0, new eoq($$3).g($$2), bof::bx);
   }

   public <T extends bof> List<T> c(bol<T> $$0) {
      return this.a().a($$0, this.i(), bof::bx);
   }

   public void a(bof $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new ib($$1, $$2, $$3));
   }

   public void a(bof $$0, ib $$1) {
      ib $$2 = this.j($$1);
      List<? extends bof> $$3 = this.a().a($$0.ai(), new eoq($$2), bof::bx);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new rn("Expected " + $$0.ai().i(), $$2, $$1, this.a.o()));
   }

   public void a(cpl $$0, ib $$1, double $$2, int $$3) {
      ib $$4 = this.j($$1);
      List<cel> $$5 = this.a().a(bol.af, new eoq($$4).g($$2), bof::bx);
      int $$6 = 0;

      for (cel $$7 : $$5) {
         cpq $$8 = $$7.q();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw new rn("Expected " + $$3 + " " + $$0.q().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cpl $$0, ib $$1, double $$2) {
      ib $$3 = this.j($$1);

      for (bof $$5 : this.a().a(bol.af, new eoq($$3).g($$2), bof::bx)) {
         cel $$6 = (cel)$$5;
         if ($$6.q().d().equals($$0)) {
            return;
         }
      }

      throw new rn("Expected " + $$0.q().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cpl $$0, ib $$1, double $$2) {
      ib $$3 = this.j($$1);

      for (bof $$5 : this.a().a(bol.af, new eoq($$3).g($$2), bof::bx)) {
         cel $$6 = (cel)$$5;
         if ($$6.q().d().equals($$0)) {
            throw new rn("Did not expect " + $$0.q().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cpl $$0) {
      for (bof $$2 : this.a().a(bol.af, this.i(), bof::bx)) {
         cel $$3 = (cel)$$2;
         if ($$3.q().d().equals($$0)) {
            return;
         }
      }

      throw new rm("Expected " + $$0.q().getString() + " item");
   }

   public void b(cpl $$0) {
      for (bof $$2 : this.a().a(bol.af, this.i(), bof::bx)) {
         cel $$3 = (cel)$$2;
         if ($$3.q().d().equals($$0)) {
            throw new rm("Did not expect " + $$0.q().getString() + " item");
         }
      }
   }

   public void d(bol<?> $$0) {
      List<? extends bof> $$1 = this.a().a($$0, this.i(), bof::bx);
      if (!$$1.isEmpty()) {
         throw new rm("Did not expect " + $$0.i() + " to exist");
      }
   }

   public void d(bol<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new ib($$1, $$2, $$3));
   }

   public void d(bol<?> $$0, ib $$1) {
      ib $$2 = this.j($$1);
      List<? extends bof> $$3 = this.a().a($$0, new eoq($$2), bof::bx);
      if (!$$3.isEmpty()) {
         throw new rn("Did not expect " + $$0.i(), $$2, $$1, this.a.o());
      }
   }

   public void a(bol<?> $$0, double $$1, double $$2, double $$3) {
      eov $$4 = new eov($$1, $$2, $$3);
      eov $$5 = this.a($$4);
      Predicate<? super bof> $$6 = $$1x -> $$1x.cE().a($$5, $$5);
      List<? extends bof> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new rm("Expected " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bol<?> $$0, double $$1, double $$2, double $$3) {
      eov $$4 = new eov($$1, $$2, $$3);
      eov $$5 = this.a($$4);
      Predicate<? super bof> $$6 = $$1x -> !$$1x.cE().a($$5, $$5);
      List<? extends bof> $$7 = this.a().a($$0, this.i(), $$6);
      if ($$7.isEmpty()) {
         throw new rm("Did not expect " + $$0.i() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bof, T> void a(ib $$0, bol<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      ib $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new eoq($$4), bof::bx);
      if ($$5.isEmpty()) {
         throw new rn("Expected " + $$1.i(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if ($$7 == null) {
               if ($$3 != null) {
                  throw new rm("Expected entity data to be: " + $$3 + ", but was: " + $$7);
               }
            } else if (!$$7.equals($$3)) {
               throw new rm("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends box> void a(ib $$0, bol<E> $$1, cpl $$2) {
      ib $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new eoq($$3), bof::bx);
      if ($$4.isEmpty()) {
         throw new rn("Expected entity of type: " + $$1, $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new rn("Entity should be holding: " + $$2, $$3, $$0, this.h());
      }
   }

   public <E extends bof & chl> void b(ib $$0, bol<E> $$1, cpl $$2) {
      ib $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new eoq($$3), $$0x -> ((bof)$$0x).bx());
      if ($$4.isEmpty()) {
         throw new rn("Expected " + $$1.i() + " to exist", $$3, $$0, this.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.A().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new rn("Entity inventory should contain: " + $$2, $$3, $$0, this.h());
      }
   }

   public void g(ib $$0) {
      ib $$1 = this.j($$0);
      djl $$2 = this.a().c_($$1);
      if ($$2 instanceof djf && !((djf)$$2).aj_()) {
         throw new rm("Container should be empty");
      }
   }

   public void a(ib $$0, cpl $$1) {
      ib $$2 = this.j($$0);
      djl $$3 = this.a().c_($$2);
      if (!($$3 instanceof djf)) {
         throw new rm("Expected a container at " + $$0 + ", found " + kh.k.b($$3.r()));
      } else if (((djf)$$3).a_($$1) != 1) {
         throw new rm("Container should contain: " + $$1);
      }
   }

   public void a(eby $$0, ib $$1) {
      ib.a($$0).forEach($$2 -> {
         ib $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(ib $$0, ib $$1) {
      dme $$2 = this.a($$0);
      dme $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, ib $$1, cpl $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, ib $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bof, T> void b(ib $$0, bol<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public <E extends bof> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new rm("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bof, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new rm("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(box $$0, il<bnq> $$1, int $$2) {
      bns $$3 = $$0.c($$1);
      if ($$3 == null || $$3.d() != $$2) {
         int $$4 = $$2 + 1;
         throw new rm("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bol<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new ib($$1, $$2, $$3));
   }

   public void e(bol<?> $$0, ib $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bol<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new ib($$1, $$2, $$3));
   }

   public void f(bol<?> $$0, ib $$1) {
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

   public void h(ib $$0) {
      ib $$1 = this.j($$0);
      apa $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.z);
   }

   public void i(ib $$0) {
      ib $$1 = this.j($$0);
      apa $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      eoq $$0 = this.k();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new ib($$4, $$3, $$5));
         }
      }
   }

   public int a(drq.a $$0, int $$1, int $$2) {
      ib $$3 = this.j(new ib($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, ib $$1) {
      throw new rn($$0, this.j($$1), $$1, this.h());
   }

   public void a(String $$0, bof $$1) {
      throw new rn($$0, $$1.dj(), this.k($$1.dj()), this.h());
   }

   public void a(String $$0) {
      throw new rm($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new rm("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public ry g() {
      return this.a.p();
   }

   public ib j(ib $$0) {
      ib $$1 = this.a.c();
      ib $$2 = $$1.a((jf)$$0);
      return egg.a($$2, deb.a, this.a.t(), $$1);
   }

   public ib k(ib $$0) {
      ib $$1 = this.a.c();
      dfr $$2 = this.a.t().a(dfr.c);
      ib $$3 = egg.a($$0, deb.a, $$2, $$1);
      return $$3.b($$1);
   }

   public eov a(eov $$0) {
      eov $$1 = eov.a(this.a.c());
      return egg.a($$1.e($$0), deb.a, this.a.t(), this.a.c());
   }

   public eov b(eov $$0) {
      eov $$1 = eov.a(this.a.c());
      return egg.a($$0.d($$1), deb.a, this.a.t(), this.a.c());
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new rm($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new rm("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new rm($$1);
      }
   }

   public long h() {
      return this.a.o();
   }

   public eoq i() {
      return this.a.d();
   }

   private eoq k() {
      eoq $$0 = this.a.d();
      return $$0.a(ib.c.b(this.j(ib.c)));
   }

   public void a(Consumer<ib> $$0) {
      eoq $$1 = this.k().a(1.0, 1.0, 1.0);
      ib.a.a($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cia $$0, cpq $$1, ib $$2, ih $$3) {
      ib $$4 = this.j($$2.a($$3));
      eor $$5 = new eor(eov.b($$4), $$3, $$4, false);
      crz $$6 = new crz($$0, bmk.a, $$5);
      $$1.a($$6);
   }

   public void a(ajb<cxd> $$0) {
      eoq $$1 = this.i();
      ib $$2 = ib.a($$1.a, $$1.b, $$1.c);
      ib $$3 = ib.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = ale.a(this.a(), $$2, $$3, this.a().I_().d(ki.au).f($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
