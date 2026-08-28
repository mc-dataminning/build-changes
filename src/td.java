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

public class td {
   private final te a;
   private boolean b;

   public td(te $$0) {
      this.a = $$0;
   }

   public arm a() {
      return this.a.f();
   }

   public dvd a(jg $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dsg> T b(jg $$0) {
      dsg $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new sx("Missing block entity", this.j($$0), $$0, this.a.o());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(btz.class);
   }

   public void a(Class $$0) {
      ezc $$1 = this.j();
      List<btz> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof coh));
      $$2.forEach(btz::at);
   }

   public ckq a(cvt $$0, ezh $$1) {
      arm $$2 = this.a();
      ezh $$3 = this.a($$1);
      ckq $$4 = new ckq($$2, $$3.d, $$3.e, $$3.f, new cvx($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public ckq a(cvt $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ezh((double)$$1, (double)$$2, (double)$$3));
   }

   public ckq a(cvt $$0, jg $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends btz> E a(bug<E> $$0, jg $$1) {
      return this.a($$0, ezh.c($$1));
   }

   public <E extends btz> E a(bug<E> $$0, ezh $$1) {
      arm $$2 = this.a();
      E $$3 = $$0.a($$2, buf.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bux $$4) {
            $$4.gb();
         }

         ezh $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dN(), $$3.dP());
         $$2.b($$3);
         return $$3;
      }
   }

   public <E extends btz> E a(bug<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends btz> E a(bug<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new sw("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new sw("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         ezh $$6 = this.a(new ezh((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dv().f($$6);
            double $$4x = $$2x.dv().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends btz> List<E> b(bug<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, ezh.c(new jg($$1, $$2, $$3)), $$4);
   }

   public <E extends btz> List<E> a(bug<E> $$0, ezh $$1, double $$2) {
      arm $$3 = this.a();
      ezh $$4 = this.a($$1);
      ezc $$5 = this.a.d();
      ezc $$6 = new ezc($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cS().c($$6) && $$1x.bM());
   }

   public <E extends btz> E a(bug<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jg($$1, $$2, $$3));
   }

   public <E extends btz> E a(bug<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new ezh((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bux> E b(bug<E> $$0, jg $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.go();
      return $$2;
   }

   public <E extends bux> E b(bug<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jg($$1, $$2, $$3));
   }

   public <E extends bux> E b(bug<E> $$0, ezh $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.go();
      return $$2;
   }

   public <E extends bux> E b(bug<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new ezh((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bux $$0, float $$1, float $$2, float $$3) {
      ezh $$4 = this.a(new ezh((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dN(), $$0.dP());
   }

   public ti a(bux $$0, jg $$1, float $$2) {
      return this.g().a(2, () -> {
         ers $$3 = $$0.P().a(this.j($$1), 0);
         $$0.P().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new jg($$0, $$1, $$2));
   }

   public void c(jg $$0) {
      this.b($$0, $$0x -> $$0x.a(awz.f), () -> "Expected button");
      jg $$1 = this.j($$0);
      dvd $$2 = this.a().a_($$1);
      dii $$3 = (dii)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(jg $$0) {
      this.a($$0, this.a(des.b));
   }

   public void a(jg $$0, coh $$1) {
      jg $$2 = this.j($$0);
      this.a($$0, $$1, new ezd(ezh.b($$2), jl.c, $$2, true));
   }

   public void a(jg $$0, coh $$1, ezd $$2) {
      jg $$3 = this.j($$0);
      dvd $$4 = this.a().a_($$3);
      brx $$5 = brx.a;
      bry $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bry.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            czo $$7 = new czo($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public buv a(buv $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public buv b(buv $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public coh a(final des $$0) {
      return new coh(this.a(), jg.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean R_() {
            return $$0 == des.d;
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
   public arn c() {
      asc $$0 = asc.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      arn $$1 = new arn(this.a().o(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean R_() {
            return false;
         }

         @Override
         public boolean f() {
            return true;
         }
      };
      wb $$2 = new wb(zp.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().o().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new jg($$0, $$1, $$2));
   }

   public void e(jg $$0) {
      this.a(dia.dw, $$0);
      jg $$1 = this.j($$0);
      dvd $$2 = this.a().a_($$1);
      dmk $$3 = (dmk)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jg $$0, long $$1) {
      this.a($$0, dia.ha);
      this.b($$1, () -> this.a($$0, dia.a));
   }

   public void f(jg $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dhy $$3) {
      this.a(new jg($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dvd $$3) {
      this.a(new jg($$0, $$1, $$2), $$3);
   }

   public void a(jg $$0, dhy $$1) {
      this.a($$0, $$1.m());
   }

   public void a(jg $$0, dvd $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dhy $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jg($$1, $$2, $$3));
   }

   public void a(dhy $$0, jg $$1) {
      dvd $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dhy $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jg($$1, $$2, $$3));
   }

   public void b(dhy $$0, jg $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dhy $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jg($$1, $$2, $$3));
   }

   public void c(dhy $$0, jg $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jg $$0, Predicate<dhy> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(jg $$0, Predicate<dhy> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(jg $$0, dwg<T> $$1, T $$2) {
      dvd $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new sx($$6, this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends Comparable<T>> void a(jg $$0, dwg<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(jg $$0, Predicate<dvd> $$1, Supplier<String> $$2) {
      dvd $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new sx($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public <T extends dsg> void c(jg $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new sx($$2.get(), this.j($$0), $$0, this.a.o());
      }
   }

   public void a(jg $$0, jl $$1, IntPredicate $$2, Supplier<String> $$3) {
      jg $$4 = this.j($$0);
      arm $$5 = this.a();
      dvd $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new sx($$3.get(), $$4, $$0, this.a.o());
      }
   }

   public void b(bug<?> $$0) {
      List<? extends btz> $$1 = this.a().a($$0, this.j(), btz::bM);
      if ($$1.isEmpty()) {
         throw new sw("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bug<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jg($$1, $$2, $$3));
   }

   public void c(bug<?> $$0, jg $$1) {
      jg $$2 = this.j($$1);
      List<? extends btz> $$3 = this.a().a($$0, new ezc($$2), btz::bM);
      if ($$3.isEmpty()) {
         throw new sx("Expected " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void a(bug<?> $$0, ezc $$1) {
      ezc $$2 = this.a($$1);
      List<? extends btz> $$3 = this.a().a($$0, $$2, btz::bM);
      if ($$3.isEmpty()) {
         throw new sx("Expected " + $$0.j(), jg.a((jz)$$2.f()), jg.a((jz)$$1.f()), this.a.o());
      }
   }

   public void a(bug<?> $$0, int $$1) {
      List<? extends btz> $$2 = this.a().a($$0, this.j(), btz::bM);
      if ($$2.size() != $$1) {
         throw new sw("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bug<?> $$0, jg $$1, int $$2, double $$3) {
      jg $$4 = this.j($$1);
      List<? extends btz> $$5 = this.b((bug<? extends btz>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new sx("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.o());
      }
   }

   public void a(bug<?> $$0, jg $$1, double $$2) {
      List<? extends btz> $$3 = this.b((bug<? extends btz>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jg $$4 = this.j($$1);
         throw new sx("Expected " + $$0.j(), $$4, $$1, this.a.o());
      }
   }

   public <T extends btz> List<T> b(bug<T> $$0, jg $$1, double $$2) {
      jg $$3 = this.j($$1);
      return this.a().a($$0, new ezc($$3).g($$2), btz::bM);
   }

   public <T extends btz> List<T> c(bug<T> $$0) {
      return this.a().a($$0, this.j(), btz::bM);
   }

   public void a(btz $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jg($$1, $$2, $$3));
   }

   public void a(btz $$0, jg $$1) {
      jg $$2 = this.j($$1);
      List<? extends btz> $$3 = this.a().a($$0.aq(), new ezc($$2), btz::bM);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new sx("Expected " + $$0.aq().j(), $$2, $$1, this.a.o()));
   }

   public void a(cvt $$0, jg $$1, double $$2, int $$3) {
      jg $$4 = this.j($$1);
      List<ckq> $$5 = this.a().a(bug.ag, new ezc($$4).g($$2), btz::bM);
      int $$6 = 0;

      for (ckq $$7 : $$5) {
         cvx $$8 = $$7.m();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new sx("Expected " + $$3 + " " + $$0.n().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.o());
      }
   }

   public void a(cvt $$0, jg $$1, double $$2) {
      jg $$3 = this.j($$1);

      for (btz $$5 : this.a().a(bug.ag, new ezc($$3).g($$2), btz::bM)) {
         ckq $$6 = (ckq)$$5;
         if ($$6.m().h().equals($$0)) {
            return;
         }
      }

      throw new sx("Expected " + $$0.n().getString() + " item", $$3, $$1, this.a.o());
   }

   public void b(cvt $$0, jg $$1, double $$2) {
      jg $$3 = this.j($$1);

      for (btz $$5 : this.a().a(bug.ag, new ezc($$3).g($$2), btz::bM)) {
         ckq $$6 = (ckq)$$5;
         if ($$6.m().h().equals($$0)) {
            throw new sx("Did not expect " + $$0.n().getString() + " item", $$3, $$1, this.a.o());
         }
      }
   }

   public void a(cvt $$0) {
      for (btz $$2 : this.a().a(bug.ag, this.j(), btz::bM)) {
         ckq $$3 = (ckq)$$2;
         if ($$3.m().h().equals($$0)) {
            return;
         }
      }

      throw new sw("Expected " + $$0.n().getString() + " item");
   }

   public void b(cvt $$0) {
      for (btz $$2 : this.a().a(bug.ag, this.j(), btz::bM)) {
         ckq $$3 = (ckq)$$2;
         if ($$3.m().h().equals($$0)) {
            throw new sw("Did not expect " + $$0.n().getString() + " item");
         }
      }
   }

   public void d(bug<?> $$0) {
      List<? extends btz> $$1 = this.a().a($$0, this.j(), btz::bM);
      if (!$$1.isEmpty()) {
         throw new sw("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bug<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jg($$1, $$2, $$3));
   }

   public void d(bug<?> $$0, jg $$1) {
      jg $$2 = this.j($$1);
      List<? extends btz> $$3 = this.a().a($$0, new ezc($$2), btz::bM);
      if (!$$3.isEmpty()) {
         throw new sx("Did not expect " + $$0.j(), $$2, $$1, this.a.o());
      }
   }

   public void b(bug<?> $$0, ezc $$1) {
      ezc $$2 = this.a($$1);
      List<? extends btz> $$3 = this.a().a($$0, $$2, btz::bM);
      if (!$$3.isEmpty()) {
         throw new sx("Did not expect " + $$0.j(), jg.a((jz)$$2.f()), jg.a((jz)$$1.f()), this.a.o());
      }
   }

   public void a(bug<?> $$0, double $$1, double $$2, double $$3) {
      ezh $$4 = new ezh($$1, $$2, $$3);
      ezh $$5 = this.a($$4);
      Predicate<? super btz> $$6 = $$1x -> $$1x.cS().a($$5, $$5);
      List<? extends btz> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sw("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bug<?> $$0, double $$1, double $$2, double $$3) {
      ezh $$4 = new ezh($$1, $$2, $$3);
      ezh $$5 = this.a($$4);
      Predicate<? super btz> $$6 = $$1x -> !$$1x.cS().a($$5, $$5);
      List<? extends btz> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new sw("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends btz, T> void a(jg $$0, bug<E> $$1, Predicate<E> $$2) {
      jg $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ezc($$3), btz::bM);
      if ($$4.isEmpty()) {
         throw new sx("Expected " + $$1.j(), $$3, $$0, this.a.o());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw new sw("Test failed for entity " + $$5);
            }
         }
      }
   }

   public <E extends btz, T> void a(jg $$0, bug<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jg $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new ezc($$4), btz::bM);
      if ($$5.isEmpty()) {
         throw new sx("Expected " + $$1.j(), $$4, $$0, this.a.o());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw new sw("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends buv> void a(jg $$0, bug<E> $$1, cvt $$2) {
      jg $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ezc($$3), btz::bM);
      if ($$4.isEmpty()) {
         throw new sx("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new sx("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends btz & cnr> void b(jg $$0, bug<E> $$1, cvt $$2) {
      jg $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new ezc($$3), $$0x -> ((btz)$$0x).bM());
      if ($$4.isEmpty()) {
         throw new sx("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.y().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new sx("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(jg $$0) {
      jg $$1 = this.j($$0);
      dsg $$2 = this.a().c_($$1);
      if ($$2 instanceof dsa && !((dsa)$$2).c()) {
         throw new sw("Container should be empty");
      }
   }

   public void a(jg $$0, cvt $$1) {
      jg $$2 = this.j($$0);
      dsg $$3 = this.a().c_($$2);
      if (!($$3 instanceof dsa)) {
         throw new sw("Expected a container at " + $$0 + ", found " + lx.j.b($$3.q()));
      } else if (((dsa)$$3).a_($$1) != 1) {
         throw new sw("Container should contain: " + $$1);
      }
   }

   public void a(elj $$0, jg $$1) {
      jg.a($$0).forEach($$2 -> {
         jg $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jg $$0, jg $$1) {
      dvd $$2 = this.a($$0);
      dvd $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, jg $$1, cvt $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jg $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends btz, T> void b(jg $$0, bug<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(btz $$0, ezc $$1, String $$2) {
      if (!$$1.d(this.b($$0.dv()))) {
         this.a($$2);
      }
   }

   public <E extends btz> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new sw("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends btz, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new sw("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(buv $$0, jp<btc> $$1, int $$2) {
      bte $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new sw("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bug<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jg($$1, $$2, $$3));
   }

   public void e(bug<?> $$0, jg $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bug<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jg($$1, $$2, $$3));
   }

   public void f(bug<?> $$0, jg $$1) {
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

   public void h(jg $$0) {
      jg $$1 = this.j($$0);
      arm $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void i(jg $$0) {
      jg $$1 = this.j($$0);
      arm $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      ezc $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jg($$4, $$3, $$5));
         }
      }
   }

   public int a(eaz.a $$0, int $$1, int $$2) {
      jg $$3 = this.j(new jg($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, jg $$1) {
      throw new sx($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, btz $$1) {
      throw new sx($$0, $$1.dx(), this.k($$1.dx()), this.i());
   }

   public void a(String $$0) {
      throw new sw($$0);
   }

   public void c(Runnable $$0) {
      this.a.p().a($$0).a(() -> new sw("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public ti g() {
      return this.a.p();
   }

   public jg j(jg $$0) {
      jg $$1 = this.a.c();
      jg $$2 = $$1.a((kk)$$0);
      return ept.a($$2, dmu.a, this.a.t(), $$1);
   }

   public jg k(jg $$0) {
      jg $$1 = this.a.c();
      dol $$2 = this.a.t().a(dol.c);
      jg $$3 = ept.a($$0, dmu.a, $$2, $$1);
      return $$3.b($$1);
   }

   public ezc a(ezc $$0) {
      ezh $$1 = this.a($$0.h());
      ezh $$2 = this.a($$0.i());
      return new ezc($$1, $$2);
   }

   public ezc b(ezc $$0) {
      ezh $$1 = this.b($$0.h());
      ezh $$2 = this.b($$0.i());
      return new ezc($$1, $$2);
   }

   public ezh a(ezh $$0) {
      ezh $$1 = ezh.a(this.a.c());
      return ept.a($$1.e($$0), dmu.a, this.a.t(), this.a.c());
   }

   public ezh b(ezh $$0) {
      ezh $$1 = ezh.a(this.a.c());
      return ept.a($$0.d($$1), dmu.a, this.a.t(), this.a.c());
   }

   public dol h() {
      return this.a.t();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new sw($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new sw("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new sw($$1);
      }
   }

   public long i() {
      return this.a.o();
   }

   public ezc j() {
      return this.a.d();
   }

   private ezc l() {
      ezc $$0 = this.a.d();
      dol $$1 = this.a.t();
      switch ($$1) {
         case d:
         case b:
            return new ezc(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new ezc(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<jg> $$0) {
      ezc $$1 = this.l().a(1.0, -1.0, 1.0);
      jg.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.o(), (long)this.a.v()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(coh $$0, cvx $$1, jg $$2, jl $$3) {
      jg $$4 = this.j($$2.a($$3));
      ezd $$5 = new ezd(ezh.b($$4), $$3, $$4, false);
      czo $$6 = new czo($$0, brx.a, $$5);
      $$1.a($$6);
   }

   public void a(alg<dfw> $$0) {
      ezc $$1 = this.j();
      jg $$2 = jg.a($$1.a, $$1.b, $$1.c);
      jg $$3 = jg.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = anm.a(this.a(), $$2, $$3, this.a().H_().e(ly.aG).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
