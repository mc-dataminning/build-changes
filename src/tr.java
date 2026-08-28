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

public class tr {
   private final ts a;
   private boolean b;

   public tr(ts $$0) {
      this.a = $$0;
   }

   public ash a() {
      return this.a.g();
   }

   public dxn a(jh $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends dup> T b(jh $$0) {
      dup $$1 = this.a().c_(this.j($$0));
      if ($$1 == null) {
         throw new tl("Missing block entity", this.j($$0), $$0, this.a.p());
      } else {
         return (T)$$1;
      }
   }

   public void b() {
      this.a(bvf.class);
   }

   public void a(Class $$0) {
      fbn $$1 = this.j();
      List<bvf> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cps));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public clw a(cxg $$0, fbs $$1) {
      ash $$2 = this.a();
      fbs $$3 = this.a($$1);
      clw $$4 = new clw($$2, $$3.d, $$3.e, $$3.f, new cxk($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public clw a(cxg $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fbs((double)$$1, (double)$$2, (double)$$3));
   }

   public clw a(cxg $$0, jh $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bvf> E a(bvm<E> $$0, jh $$1) {
      return this.a($$0, fbs.c($$1));
   }

   public <E extends bvf> E a(bvm<E> $$0, fbs $$1) {
      ash $$2 = this.a();
      E $$3 = $$0.a($$2, bvl.d);
      if ($$3 == null) {
         throw new NullPointerException("Failed to create entity " + $$0.r().h().a());
      } else {
         if ($$3 instanceof bwd $$4) {
            $$4.ai();
         }

         fbs $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dL(), $$3.dN());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bvf $$0, btv $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bvf $$0) {
      $$0.c(this.a());
   }

   public <E extends bvf> E a(bvm<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bvf> E a(bvm<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw new tk("Expected " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3);
      } else if ($$5.size() > 1) {
         throw new tk("Expected only one " + $$0.j() + " to exist around " + $$1 + "," + $$2 + "," + $$3 + ", but found " + $$5.size());
      } else {
         fbs $$6 = this.a(new fbs((double)$$1, (double)$$2, (double)$$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dt().f($$6);
            double $$4x = $$2x.dt().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bvf> List<E> b(bvm<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, fbs.c(new jh($$1, $$2, $$3)), $$4);
   }

   public <E extends bvf> List<E> a(bvm<E> $$0, fbs $$1, double $$2) {
      ash $$3 = this.a();
      fbs $$4 = this.a($$1);
      fbn $$5 = this.a.e();
      fbn $$6 = new fbn($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cR().c($$6) && $$1x.bL());
   }

   public <E extends bvf> E a(bvm<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bvf> E a(bvm<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fbs((double)$$1, (double)$$2, (double)$$3));
   }

   public <E extends bwd> E b(bvm<E> $$0, jh $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gf();
      return $$2;
   }

   public <E extends bwd> E b(bvm<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jh($$1, $$2, $$3));
   }

   public <E extends bwd> E b(bvm<E> $$0, fbs $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gf();
      return $$2;
   }

   public <E extends bwd> E b(bvm<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new fbs((double)$$1, (double)$$2, (double)$$3));
   }

   public void a(bwd $$0, float $$1, float $$2, float $$3) {
      fbs $$4 = this.a(new fbs((double)$$1, (double)$$2, (double)$$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dL(), $$0.dN());
   }

   public tw a(bwd $$0, jh $$1, float $$2) {
      return this.g().a(2, () -> {
         eud $$3 = $$0.L().a(this.j($$1), 0);
         $$0.L().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.c(new jh($$0, $$1, $$2));
   }

   public void c(jh $$0) {
      this.b($$0, $$0x -> $$0x.a(axu.f), () -> "Expected button");
      jh $$1 = this.j($$0);
      dxn $$2 = this.a().a_($$1);
      dkp $$3 = (dkp)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void d(jh $$0) {
      this.a($$0, this.a(dgx.b));
   }

   public void a(jh $$0, cps $$1) {
      jh $$2 = this.j($$0);
      this.a($$0, $$1, new fbo(fbs.b($$2), jm.c, $$2, true));
   }

   public void a(jh $$0, cps $$1, fbo $$2) {
      jh $$3 = this.j($$0);
      dxn $$4 = this.a().a_($$3);
      btd $$5 = btd.a;
      bte $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bte.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            dbd $$7 = new dbd($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public bwb a(bwb $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public bwb b(bwb $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public cps a(final dgx $$0) {
      return new cps(this.a(), jh.c, 0.0F, new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Override
         public boolean aa_() {
            return $$0 == dgx.d;
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
   public asi c() {
      asx $$0 = asx.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      asi $$1 = new asi(this.a().p(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public boolean aa_() {
            return false;
         }

         @Override
         public boolean b() {
            return true;
         }
      };
      wp $$2 = new wp(aad.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().p().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.e(new jh($$0, $$1, $$2));
   }

   public void e(jh $$0) {
      this.a(dkg.dI, $$0);
      jh $$1 = this.j($$0);
      dxn $$2 = this.a().a_($$1);
      dot $$3 = (dot)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jh $$0, long $$1) {
      this.a($$0, dkg.hq);
      this.b($$1, () -> this.a($$0, dkg.a));
   }

   public void f(jh $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dke $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, dxn $$3) {
      this.a(new jh($$0, $$1, $$2), $$3);
   }

   public void a(jh $$0, dke $$1) {
      this.a($$0, $$1.m());
   }

   public void a(jh $$0, dxn $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dke $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(dke $$0, jh $$1) {
      dxn $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), "Expected " + $$0.f().getString() + ", got " + $$2.b().f().getString());
   }

   public void b(dke $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jh($$1, $$2, $$3));
   }

   public void b(dke $$0, jh $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), "Did not expect " + $$0.f().getString());
   }

   public void c(dke $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(dke $$0, jh $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jh $$0, Predicate<dke> $$1, String $$2) {
      this.a($$0, $$1, () -> $$2);
   }

   public void a(jh $$0, Predicate<dke> $$1, Supplier<String> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$2);
   }

   public <T extends Comparable<T>> void a(jh $$0, dyp<T> $$1, T $$2) {
      dxn $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4 || !$$3.<T>c($$1).equals($$2)) {
         String $$5 = $$4 ? "was " + $$3.c($$1) : "property " + $$1.f() + " is missing";
         String $$6 = String.format(Locale.ROOT, "Expected property %s to be %s, %s", $$1.f(), $$2, $$5);
         throw new tl($$6, this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends Comparable<T>> void a(jh $$0, dyp<T> $$1, Predicate<T> $$2, String $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, () -> $$3);
   }

   public void b(jh $$0, Predicate<dxn> $$1, Supplier<String> $$2) {
      dxn $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw new tl($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public <T extends dup> void c(jh $$0, Predicate<T> $$1, Supplier<String> $$2) {
      T $$3 = this.b($$0);
      if (!$$1.test($$3)) {
         throw new tl($$2.get(), this.j($$0), $$0, this.a.p());
      }
   }

   public void a(jh $$0, jm $$1, IntPredicate $$2, Supplier<String> $$3) {
      jh $$4 = this.j($$0);
      ash $$5 = this.a();
      dxn $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw new tl($$3.get(), $$4, $$0, this.a.p());
      }
   }

   public void b(bvm<?> $$0) {
      List<? extends bvf> $$1 = this.a().a($$0, this.j(), bvf::bL);
      if ($$1.isEmpty()) {
         throw new tk("Expected " + $$0.j() + " to exist");
      }
   }

   public void c(bvm<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jh($$1, $$2, $$3));
   }

   public void c(bvm<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvf> $$3 = this.a().a($$0, new fbn($$2), bvf::bL);
      if ($$3.isEmpty()) {
         throw new tl("Expected " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void a(bvm<?> $$0, fbn $$1) {
      fbn $$2 = this.a($$1);
      List<? extends bvf> $$3 = this.a().a($$0, $$2, bvf::bL);
      if ($$3.isEmpty()) {
         throw new tl("Expected " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.p());
      }
   }

   public void a(bvm<?> $$0, int $$1) {
      List<? extends bvf> $$2 = this.a().a($$0, this.j(), bvf::bL);
      if ($$2.size() != $$1) {
         throw new tk("Expected " + $$1 + " of type " + $$0.j() + " to exist, found " + $$2.size());
      }
   }

   public void a(bvm<?> $$0, jh $$1, int $$2, double $$3) {
      jh $$4 = this.j($$1);
      List<? extends bvf> $$5 = this.b((bvm<? extends bvf>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw new tl("Expected " + $$2 + " entities of type " + $$0.j() + ", actual number of entities found=" + $$5.size(), $$4, $$1, this.a.p());
      }
   }

   public void a(bvm<?> $$0, jh $$1, double $$2) {
      List<? extends bvf> $$3 = this.b((bvm<? extends bvf>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jh $$4 = this.j($$1);
         throw new tl("Expected " + $$0.j(), $$4, $$1, this.a.p());
      }
   }

   public <T extends bvf> List<T> b(bvm<T> $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);
      return this.a().a($$0, new fbn($$3).g($$2), bvf::bL);
   }

   public <T extends bvf> List<T> c(bvm<T> $$0) {
      return this.a().a($$0, this.j(), bvf::bL);
   }

   public void a(bvf $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jh($$1, $$2, $$3));
   }

   public void a(bvf $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvf> $$3 = this.a().a($$0.aq(), new fbn($$2), bvf::bL);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> new tl("Expected " + $$0.aq().j(), $$2, $$1, this.a.p()));
   }

   public void a(cxg $$0, jh $$1, double $$2, int $$3) {
      jh $$4 = this.j($$1);
      List<clw> $$5 = this.a().a(bvm.ar, new fbn($$4).g($$2), bvf::bL);
      int $$6 = 0;

      for (clw $$7 : $$5) {
         cxk $$8 = $$7.l();
         if ($$8.a($$0)) {
            $$6 += $$8.L();
         }
      }

      if ($$6 != $$3) {
         throw new tl("Expected " + $$3 + " " + $$0.m().getString() + " items to exist (found " + $$6 + ")", $$4, $$1, this.a.p());
      }
   }

   public void a(cxg $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bvf $$5 : this.a().a(bvm.ar, new fbn($$3).g($$2), bvf::bL)) {
         clw $$6 = (clw)$$5;
         if ($$6.l().h().equals($$0)) {
            return;
         }
      }

      throw new tl("Expected " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
   }

   public void b(cxg $$0, jh $$1, double $$2) {
      jh $$3 = this.j($$1);

      for (bvf $$5 : this.a().a(bvm.ar, new fbn($$3).g($$2), bvf::bL)) {
         clw $$6 = (clw)$$5;
         if ($$6.l().h().equals($$0)) {
            throw new tl("Did not expect " + $$0.m().getString() + " item", $$3, $$1, this.a.p());
         }
      }
   }

   public void a(cxg $$0) {
      for (bvf $$2 : this.a().a(bvm.ar, this.j(), bvf::bL)) {
         clw $$3 = (clw)$$2;
         if ($$3.l().h().equals($$0)) {
            return;
         }
      }

      throw new tk("Expected " + $$0.m().getString() + " item");
   }

   public void b(cxg $$0) {
      for (bvf $$2 : this.a().a(bvm.ar, this.j(), bvf::bL)) {
         clw $$3 = (clw)$$2;
         if ($$3.l().h().equals($$0)) {
            throw new tk("Did not expect " + $$0.m().getString() + " item");
         }
      }
   }

   public void d(bvm<?> $$0) {
      List<? extends bvf> $$1 = this.a().a($$0, this.j(), bvf::bL);
      if (!$$1.isEmpty()) {
         throw new tk("Did not expect " + $$0.j() + " to exist");
      }
   }

   public void d(bvm<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jh($$1, $$2, $$3));
   }

   public void d(bvm<?> $$0, jh $$1) {
      jh $$2 = this.j($$1);
      List<? extends bvf> $$3 = this.a().a($$0, new fbn($$2), bvf::bL);
      if (!$$3.isEmpty()) {
         throw new tl("Did not expect " + $$0.j(), $$2, $$1, this.a.p());
      }
   }

   public void b(bvm<?> $$0, fbn $$1) {
      fbn $$2 = this.a($$1);
      List<? extends bvf> $$3 = this.a().a($$0, $$2, bvf::bL);
      if (!$$3.isEmpty()) {
         throw new tl("Did not expect " + $$0.j(), jh.a((ka)$$2.f()), jh.a((ka)$$1.f()), this.a.p());
      }
   }

   public void a(bvm<?> $$0, double $$1, double $$2, double $$3) {
      fbs $$4 = new fbs($$1, $$2, $$3);
      fbs $$5 = this.a($$4);
      Predicate<? super bvf> $$6 = $$1x -> $$1x.cR().a($$5, $$5);
      List<? extends bvf> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new tk("Expected " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public void b(bvm<?> $$0, double $$1, double $$2, double $$3) {
      fbs $$4 = new fbs($$1, $$2, $$3);
      fbs $$5 = this.a($$4);
      Predicate<? super bvf> $$6 = $$1x -> !$$1x.cR().a($$5, $$5);
      List<? extends bvf> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw new tk("Did not expect " + $$0.j() + " to touch " + $$5 + " (relative " + $$4 + ")");
      }
   }

   public <E extends bvf, T> void a(jh $$0, bvm<E> $$1, Predicate<E> $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbn($$3), bvf::bL);
      if ($$4.isEmpty()) {
         throw new tl("Expected " + $$1.j(), $$3, $$0, this.a.p());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw new tk("Test failed for entity " + $$5);
            }
         }
      }
   }

   public <E extends bvf, T> void a(jh $$0, bvm<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jh $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new fbn($$4), bvf::bL);
      if ($$5.isEmpty()) {
         throw new tl("Expected " + $$1.j(), $$4, $$0, this.a.p());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw new tk("Expected entity data to be: " + $$3 + ", but was: " + $$7);
            }
         }
      }
   }

   public <E extends bwb> void a(jh $$0, bvm<E> $$1, cxg $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbn($$3), bvf::bL);
      if ($$4.isEmpty()) {
         throw new tl("Expected entity of type: " + $$1, $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw new tl("Entity should be holding: " + $$2, $$3, $$0, this.i());
      }
   }

   public <E extends bvf & cpc> void b(jh $$0, bvm<E> $$1, cxg $$2) {
      jh $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fbn($$3), $$0x -> ((bvf)$$0x).bL());
      if ($$4.isEmpty()) {
         throw new tl("Expected " + $$1.j() + " to exist", $$3, $$0, this.i());
      } else {
         for (E $$5 : $$4) {
            if ($$5.t().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw new tl("Entity inventory should contain: " + $$2, $$3, $$0, this.i());
      }
   }

   public void g(jh $$0) {
      jh $$1 = this.j($$0);
      dup $$2 = this.a().c_($$1);
      if ($$2 instanceof duj && !((duj)$$2).c()) {
         throw new tk("Container should be empty");
      }
   }

   public void a(jh $$0, cxg $$1) {
      jh $$2 = this.j($$0);
      dup $$3 = this.a().c_($$2);
      if (!($$3 instanceof duj)) {
         throw new tk("Expected a container at " + $$0 + ", found " + ma.j.b($$3.q()));
      } else if (((duj)$$3).a_($$1) != 1) {
         throw new tk("Container should contain: " + $$1);
      }
   }

   public void a(enu $$0, jh $$1) {
      jh.a($$0).forEach($$2 -> {
         jh $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jh $$0, jh $$1) {
      dxn $$2 = this.a($$0);
      dxn $$3 = this.a($$1);
      if ($$2 != $$3) {
         this.a("Incorrect state. Expected " + $$3 + ", got " + $$2, $$0);
      }
   }

   public void a(long $$0, jh $$1, cxg $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jh $$1) {
      this.a($$0, () -> this.g($$1));
   }

   public <E extends bvf, T> void b(jh $$0, bvm<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bvf $$0, fbn $$1, String $$2) {
      if (!$$1.d(this.b($$0.dt()))) {
         this.a($$2);
      }
   }

   public <E extends bvf> void a(E $$0, Predicate<E> $$1, String $$2) {
      if (!$$1.test($$0)) {
         throw new tk("Entity " + $$0 + " failed " + $$2 + " test");
      }
   }

   public <E extends bvf, T> void a(E $$0, Function<E, T> $$1, String $$2, T $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$3)) {
         throw new tk("Entity " + $$0 + " value " + $$2 + "=" + $$4 + " is not equal to expected " + $$3);
      }
   }

   public void a(bwb $$0, jq<bui> $$1, int $$2) {
      buk $$3 = $$0.c($$1);
      if ($$3 == null || $$3.e() != $$2) {
         int $$4 = $$2 + 1;
         throw new tk("Entity " + $$0 + " failed has " + $$1.a().d() + " x " + $$4 + " test");
      }
   }

   public void e(bvm<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jh($$1, $$2, $$3));
   }

   public void e(bvm<?> $$0, jh $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bvm<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jh($$1, $$2, $$3));
   }

   public void f(bvm<?> $$0, jh $$1) {
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

   public void h(jh $$0) {
      jh $$1 = this.j($$0);
      ash $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void i(jh $$0) {
      jh $$1 = this.j($$0);
      ash $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      fbn $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jh($$4, $$3, $$5));
         }
      }
   }

   public int a(edi.a $$0, int $$1, int $$2) {
      jh $$3 = this.j(new jh($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(String $$0, jh $$1) {
      throw new tl($$0, this.j($$1), $$1, this.i());
   }

   public void a(String $$0, bvf $$1) {
      throw new tl($$0, $$1.dv(), this.k($$1.dv()), this.i());
   }

   public void a(String $$0) {
      throw new tk($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> new tk("Fail conditions met"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public tw g() {
      return this.a.q();
   }

   public jh j(jh $$0) {
      jh $$1 = this.a.d();
      jh $$2 = $$1.a((kl)$$0);
      return ese.a($$2, dpd.a, this.a.u(), $$1);
   }

   public jh k(jh $$0) {
      jh $$1 = this.a.d();
      dqu $$2 = this.a.u().a(dqu.c);
      jh $$3 = ese.a($$0, dpd.a, $$2, $$1);
      return $$3.b($$1);
   }

   public fbn a(fbn $$0) {
      fbs $$1 = this.a($$0.h());
      fbs $$2 = this.a($$0.i());
      return new fbn($$1, $$2);
   }

   public fbn b(fbn $$0) {
      fbs $$1 = this.b($$0.h());
      fbs $$2 = this.b($$0.i());
      return new fbn($$1, $$2);
   }

   public fbs a(fbs $$0) {
      fbs $$1 = fbs.a(this.a.d());
      return ese.a($$1.e($$0), dpd.a, this.a.u(), this.a.d());
   }

   public fbs b(fbs $$0) {
      fbs $$1 = fbs.a(this.a.d());
      return ese.a($$0.d($$1), dpd.a, this.a.u(), this.a.d());
   }

   public dqu h() {
      return this.a.u();
   }

   public void a(boolean $$0, String $$1) {
      if (!$$0) {
         throw new tk($$1);
      }
   }

   public <N> void a(N $$0, N $$1, String $$2) {
      if (!$$0.equals($$1)) {
         throw new tk("Expected " + $$2 + " to be " + $$1 + ", but was " + $$0);
      }
   }

   public void b(boolean $$0, String $$1) {
      if ($$0) {
         throw new tk($$1);
      }
   }

   public long i() {
      return this.a.p();
   }

   public fbn j() {
      return this.a.e();
   }

   private fbn l() {
      fbn $$0 = this.a.e();
      dqu $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new fbn(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new fbn(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<jh> $$0) {
      fbn $$1 = this.l().a(1.0, 1.0, 1.0);
      jh.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), (long)this.a.w()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cps $$0, cxk $$1, jh $$2, jm $$3) {
      jh $$4 = this.j($$2.a($$3));
      fbo $$5 = new fbo(fbs.b($$4), $$3, $$4, false);
      dbd $$6 = new dbd($$0, btd.a, $$5);
      $$1.a($$6);
   }

   public void a(aly<dic> $$0) {
      fbn $$1 = this.j();
      jh $$2 = jh.a($$1.a, $$1.b, $$1.c);
      jh $$3 = jh.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = aoe.a(this.a(), $$2, $$3, this.a().K_().e(mb.aH).b($$0));
      if ($$4.right().isPresent()) {
         this.a("Failed to set biome for test");
      }
   }
}
